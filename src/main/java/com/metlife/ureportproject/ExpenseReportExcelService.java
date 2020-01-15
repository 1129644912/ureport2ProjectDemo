package com.metlife.ureportproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:报账单-报表pdf导出模拟数据
 * @version: 1.0
 * @author: kui.fang@hand-china.com
 * @date: 2020/1/14 11:41
 */
@Service("DataFrom")
public class ExpenseReportExcelService {


    //头信息

    //费用信息

    //付款信息


    /**
     * 用于加载报账单头信息（将该方法返回的数据渲染到报账单模板的头信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> loadReportData(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();

        Map<String, Object> maps = new HashMap<String, Object>();
        //单据类型
        maps.put("documentType","单据类型：交通费用报销单");
        //最终审批人
        maps.put("lastApproval","张学良");
        //审批状态
        maps.put("approveState","审批通过");
        maps.put("makePerson","创建人：赵天宇");
        maps.put("documentNumber","EXP908765489854977");
        maps.put("documentNumberShow","单据编号：EXP908765489854977");
        maps.put("applicant","申请人：大猫");
        maps.put("applicantDate","申请日期：2020-12-12");
        maps.put("company","公司：中国人民银行");
        maps.put("department","部门：财务部");
        maps.put("amount","总金额：187.95");
        maps.put("remark","备注：备注");
        list.add(maps);

        Map<String, Object> maps2 = new HashMap<String, Object>();
        //单据类型
        maps2.put("documentType","单据类型：餐补费用报销单");
        //最终审批人
        maps2.put("lastApproval","张学良A");
        //审批状态
        maps2.put("approveState","审批通过A");
        maps2.put("documentNumber","EXP908765489854988");
        maps2.put("documentNumberShow","单据编号：PRE90876548977777AAAA");
        maps2.put("applicant","申请人：大猫AAAA");
        maps2.put("applicantDate","申请日期：2020-12-12AAAA");
        maps2.put("company","公司：中国人民银行AAAA");
        maps2.put("department","部门：财务部AAAA");
        maps2.put("amount","8888AAAA");
        maps2.put("remark","备注：备注AAAA");
        maps2.put("makePerson","制单人：赵天宇AAAA");
        list.add(maps2);

        return list;
    }

    /**
     * 用于加载报账单-费用信息（将该方法返回的数据渲染到报账单模板的费用信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> buildReportMidddle(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();

        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("documentNumber","EXP908765489854977");
        maps.put("index","1");
        maps.put("company","夜神科技");
        maps.put("department","研发部");
        maps.put("expenseType","加班补贴");
        maps.put("happenDate","2019-12-20");
        maps.put("amount","3.90");
        maps.put("functionAmount","13.90");
        maps.put("description","备注描述");
        list.add(maps);

        Map<String, Object> maps2 = new HashMap<String, Object>();
        maps2.put("documentNumber","EXP908765489854977");
        maps2.put("index","2");
        maps2.put("company","夜神保洁");
        maps2.put("department","保洁部");
        maps2.put("expenseType","劳务费");
        maps2.put("happenDate","2019-12-24");
        maps2.put("amount","9.90");
        maps2.put("functionAmount","23.90");
        maps2.put("description","保洁备注");
        list.add(maps2);

        //第二波的数据
        Map<String, Object> maps3 = new HashMap<String, Object>();
        maps3.put("index","2");
        maps3.put("documentNumber","EXP908765489854988");
        maps3.put("company","夜神保洁AAAA");
        maps3.put("department","保洁部AAAA");
        maps3.put("expenseType","下楼摔死AAAA");
        maps3.put("happenDate","2019-12-24AAAA");
        maps3.put("amount","9.90A");
        maps3.put("functionAmount","23.90A");
        maps3.put("description","关爱保洁人员AAAA");
        list.add(maps3);

        Map<String, Object> maps4 = new HashMap<String, Object>();
        maps4.put("documentNumber","EXP908765489854988");
        maps4.put("index","2");
        maps4.put("company","夜神保洁AAAA");
        maps4.put("department","保洁部AAAA");
        maps4.put("expenseType","下楼摔死AAAA");
        maps4.put("happenDate","2019-12-24AAAA");
        maps4.put("amount","9.90A");
        maps4.put("functionAmount","23.90A");
        maps4.put("description","关爱保洁人员AAAA");
        list.add(maps4);

        return list;
    }

    /**
     * 用于加载报账单-付款信息（将该方法返回的数据渲染到报账单模板的付款信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> buildReportLast(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();

        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("documentNumber","EXP908765489854977");
        maps.put("index","1");
        maps.put("drawee","三毛");
        maps.put("openBank","中国人民银行");
        maps.put("openBankAccount","98987654789");
        maps.put("writeAmount","88.00");
        maps.put("payAmount","0.98");
        maps.put("payType","现金支付");
        list.add(maps);

        Map<String, Object> maps2 = new HashMap<String, Object>();
        maps2.put("documentNumber","EXP908765489854977");
        maps2.put("index","2");
        maps2.put("drawee","小红");
        maps2.put("openBank","中国工商银行");
        maps2.put("openBankAccount","5555554789");
        maps2.put("writeAmount","188.00");
        maps2.put("payAmount","10.98");
        maps2.put("payType","网银支付");
        list.add(maps2);

        //第二波数据
        Map<String, Object> maps3 = new HashMap<String, Object>();
        maps3.put("documentNumber","EXP908765489854988");
        maps3.put("index","3");
        maps3.put("drawee","三毛AAAA");
        maps3.put("openBank","中国人民银行AAAA");
        maps3.put("openBankAccount","98987654789AAAA");
        maps3.put("writeAmount","88.00A");
        maps3.put("payAmount","0.98A");
        maps3.put("payType","现金支付A");
        list.add(maps3);

        Map<String, Object> maps4 = new HashMap<String, Object>();
        maps4.put("documentNumber","EXP908765489854988");
        maps4.put("index","4");
        maps4.put("drawee","小红AAAA");
        maps4.put("openBank","中国工商银行AAAA");
        maps4.put("openBankAccount","5555554789A");
        maps4.put("writeAmount","188.00A");
        maps4.put("payAmount","10.98A");
        maps4.put("payType","网银支付A");
        list.add(maps4);

        return list;
    }


}

