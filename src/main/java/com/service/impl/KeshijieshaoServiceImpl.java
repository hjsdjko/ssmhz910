package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KeshijieshaoDao;
import com.entity.KeshijieshaoEntity;
import com.service.KeshijieshaoService;
import com.entity.vo.KeshijieshaoVO;
import com.entity.view.KeshijieshaoView;

@Service("keshijieshaoService")
public class KeshijieshaoServiceImpl extends ServiceImpl<KeshijieshaoDao, KeshijieshaoEntity> implements KeshijieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshijieshaoEntity> page = this.selectPage(
                new Query<KeshijieshaoEntity>(params).getPage(),
                new EntityWrapper<KeshijieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshijieshaoEntity> wrapper) {
		  Page<KeshijieshaoView> page =new Query<KeshijieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshijieshaoVO> selectListVO(Wrapper<KeshijieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshijieshaoVO selectVO(Wrapper<KeshijieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshijieshaoView> selectListView(Wrapper<KeshijieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshijieshaoView selectView(Wrapper<KeshijieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
