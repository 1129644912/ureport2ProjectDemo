package com.metlife.ureportproject;

import com.bstek.ureport.export.ExportConfigure;
import com.bstek.ureport.export.ExportConfigureImpl;
import com.bstek.ureport.export.ExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @version: 1.0
 * @author: kui.fang@hand-china.com
 * @date: 2020/1/14 12:02
 */
public class ExportManagerController {

    @Autowired
    private ExportManager exportManager;

    @GetMapping("/testAAA")
    public void testAAA(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse , @RequestParam String id) throws UnsupportedEncodingException {
        String fileName = "TEST"+System.currentTimeMillis()+".pdf";

        //导出到pdf中
        String ENC = "UTF-8";
        String userAgent = httpServletRequest.getHeader("User-Agent");
        if (userAgent.contains("Firefox")) {
            fileName = new String(URLEncoder.encode(fileName, ENC).getBytes(ENC), "ISO8859-1");
        } else {
            fileName = URLEncoder.encode(fileName, ENC);
        }
        httpServletResponse.setContentType(MediaType.APPLICATION_PDF_VALUE);
        httpServletResponse.addHeader("Content-Disposition","attachment; filename=" + fileName);
        httpServletResponse.setContentType("application/pdf" + ";charset=" + ENC+";filename=" + fileName);
        httpServletResponse.setHeader("Accept-Ranges", "bytes");
        try (OutputStream outputStream = httpServletResponse.getOutputStream()) {
            Map<String, Object> map = new HashMap<String, Object>();
            ExportConfigure exportConfigure = new ExportConfigureImpl("file:expenseAllCondition1.ureport.xml", map,outputStream);
            exportManager.exportPdf(exportConfigure);
            httpServletResponse.addHeader("Content-Disposition","attachment; filename=" + fileName);
            httpServletResponse.setContentType("application/pdf" + ";filename=" + fileName);
            httpServletResponse.setHeader("Accept-Ranges", "bytes");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
