package com.metlife.ureportproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:预付款单-报表pdf导出模拟数据
 * @version: 1.0
 * @author: kui.fang@hand-china.com
 * @date: 2020/1/14 11:40
 */
@Service("prepaymentData")
public class CashPaymentRequisitionFileService {

    /**
     * 用于加载预付款单头信息（将该方法返回的数据渲染到预付款单模板的头信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> loadReportHeaderData(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();
        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("lastApprovalMan","张学友");
        maps.put("amount","总金额：88.98");
        maps.put("approveState","复核通过");
        maps.put("documentNumberShow","单据编号：PRE908765489854977");
        maps.put("documentNumber","PRE908765489854977");
        maps.put("applicant","申请人：赵天王");
        maps.put("applicantDate","申请日期：2020-08-07");
        maps.put("company","公司：招银科技");
        maps.put("department","部门：研发部");
        maps.put("remark","备注：没钱花了");
        maps.put("makePerson","制单人：王财务");
        list.add(maps);

        Map<String, Object> maps2 = new HashMap<String, Object>();
        maps.put("lastApprovalMan","张学友B");
        maps2.put("documentNumberShow","单据编号：PRE908765489854977BBB");
        maps2.put("documentNumber","PRE908765489854966");
        maps2.put("applicant","申请人：赵天王BBB");
        maps2.put("applicantDate","申请日期：2020-08-07BBB");
        maps2.put("approveState","审批状态：复核通过BBB");
        maps2.put("company","公司：招银科技BBB");
        maps2.put("department","部门：研发部BBB");
        maps2.put("amount","总金额：88.98BBB");
        maps2.put("remark","备注：没钱花了BBB");
        maps2.put("makePerson","制单人：王财务BBB");
        list.add(maps2);

        Map<String, Object> maps3 = new HashMap<String, Object>();
        maps.put("lastApprovalMan","张学友C");
        maps3.put("documentNumberShow","单据编号：PRE908765489888866");
        maps3.put("documentNumber","PRE908765489888866");
        maps3.put("applicant","申请人：赵天王CCC");
        maps3.put("applicantDate","申请日期：2020-08-07CCC");
        maps3.put("approveState","审批状态：复核通过CCC");
        maps3.put("company","公司：招银科技CCC");
        maps3.put("department","部门：研发部CCC");
        maps3.put("amount","金额：88.98CCC");
        maps3.put("remark","备注：没钱花了CCC");
        maps3.put("makePerson","制单人：王财务CCC");
        list.add(maps3);

        return list;
    }

    /**
     * 用于加载预付款单的付款信息（将该方法返回的数据渲染到预付款单模板的付款信息中）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> loadReportPayData(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();
        //构造传递给报表框架的数据
        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("documentNumber","PRE908765489854977");
        //序号
        maps.put("index","1");
        //收款方
        maps.put("partnerName","王大毛");
        //开户行
        maps.put("accountName","金山银行");
        //银行账号
        maps.put("accountNumber","888888888888");
        //支付金额
        maps.put("amount","33.90");
        //付款方式
        maps.put("paymentTypeName","支付宝支付");
        //计划还款日期
        maps.put("requisitionPaymentDate","2020-08-07");
        list.add(maps);

        Map<String, Object> maps0 = new HashMap<String, Object>();
        maps0.put("documentNumber","PRE908765489854977");
        //序号
        maps0.put("index","1");
        //收款方
        maps0.put("partnerName","王大毛");
        //开户行
        maps0.put("accountName","金山银行");
        //银行账号
        maps0.put("accountNumber","888888888888");
        //支付金额
        maps0.put("amount","33.10");
        //付款方式
        maps0.put("paymentTypeName","支付宝支付");
        //计划还款日期
        maps0.put("requisitionPaymentDate","2020-08-07");
        list.add(maps0);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("documentNumber","PRE908765489854966");
        //序号
        map2.put("index","2");
        //收款方
        map2.put("partnerName","王二毛");
        //开户行
        map2.put("accountName","中华人民银行");
        //银行账号
        map2.put("accountNumber","99909790");
        //支付金额
        map2.put("amount","67.94");
        //付款方式
        map2.put("paymentTypeName","现金支付");
        //计划还款日期
        map2.put("requisitionPaymentDate","2020-06-05");
        list.add(map2);

        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("documentNumber","PRE908765489888866");
        //序号
        map3.put("index","3");
        //收款方
        map3.put("partnerName","孙震");
        //开户行
        map3.put("accountName","纽约银行");
        //银行账号
        map3.put("accountNumber","555555");
        //支付金额
        map3.put("amount","78.56");
        //付款方式
        map3.put("paymentTypeName","网银支付");
        //计划还款日期
        map3.put("requisitionPaymentDate","2020-05-03");
        list.add(map3);

        return list;
    }

}

