package cn.AssassinG.ScsyERP.OnWayWatch.facade.service;

import cn.AssassinG.ScsyERP.common.core.service.BaseService;
import cn.AssassinG.ScsyERP.OnWayWatch.facade.entity.Warn;

public interface WarnServiceFacade extends BaseService<Warn> {
    void addPicture(Long entityId, Long pictureId);
    void removePicture(Long entityId, Long pictureId);
}
