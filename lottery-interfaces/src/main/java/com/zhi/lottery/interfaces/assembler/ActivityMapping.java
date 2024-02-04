package com.zhi.lottery.interfaces.assembler;

import com.zhi.lottery.domain.activity.model.vo.ActivityVO;
import com.zhi.lottery.rpc.deploy.dto.ActivityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @description: 活动对象转换配置
 * @author：zhijianhao
 * @date: 2024/2/4
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ActivityMapping extends IMapping<ActivityVO, ActivityDTO> {

    @Override
    List<ActivityDTO> sourceToTarget(List<ActivityVO> var1);
}
