package com.metlife.ureportproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:预提单-报表pdf导出模拟数据
 * @version: 1.0
 * @author: kui.fang@hand-china.com
 * @date: 2020/1/14 11:43
 */
@Service("expenseReportAccuralData")
public class ExpenseReportAccuralService {

    /**
     * 用于加载预提单-头信息（将该方法返回的数据渲染到预提单模板的头信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> loadReportAccuralData(String dsName, String datasetName, Map<String,Object> parameters){

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
     * 用于加载预提单-付款信息（将该方法返回的数据渲染到预提单模板的付款信息）
     *
     * @param dsName
     * @param datasetName
     * @param parameters
     * @return
     */
    public List<Map<String,Object>> loadReportAccuralMidddle(String dsName, String datasetName, Map<String,Object> parameters){
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();

        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("documentNumber","EXP908765489854977");
        maps.put("index","1");
        maps.put("company","夜神科技");
        maps.put("department","研发部");
        maps.put("expenseType","加班猝死赔偿");
        maps.put("happenDate","2019-12-20");
        maps.put("amount","3.90");
        maps.put("functionAmount","13.90");
        maps.put("description","死的不夸张");
        list.add(maps);

        Map<String, Object> maps2 = new HashMap<String, Object>();
        maps2.put("documentNumber","EXP908765489854977");
        maps2.put("index","2");
        maps2.put("company","夜神保洁");
        maps2.put("department","保洁部");
        maps2.put("expenseType","下楼摔死");
        maps2.put("happenDate","2019-12-24");
        maps2.put("amount","9.90");
        maps2.put("functionAmount","23.90");
        maps2.put("description","关爱保洁人员");
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

}

