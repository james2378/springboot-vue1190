package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.ChongwurenlingshenheDao;
import com.entity.ChongwurenlingshenheEntity;
import com.service.ChongwurenlingshenheService;
import com.entity.view.ChongwurenlingshenheView;

/**
 * 寻宠启事审核 服务实现类
 */
@Service("chongwurenlingshenheService")
@Transactional
public class ChongwurenlingshenheServiceImpl extends ServiceImpl<ChongwurenlingshenheDao, ChongwurenlingshenheEntity> implements ChongwurenlingshenheService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ChongwurenlingshenheView> page =new Query<ChongwurenlingshenheView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
