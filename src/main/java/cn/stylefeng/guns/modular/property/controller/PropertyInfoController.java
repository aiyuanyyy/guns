package cn.stylefeng.guns.modular.property.controller;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import cn.stylefeng.roses.kernel.auth.api.SessionManagerApi;
import cn.stylefeng.roses.kernel.rule.pojo.response.ResponseData;
import cn.stylefeng.roses.kernel.rule.pojo.response.SuccessResponseData;
import cn.stylefeng.roses.kernel.scanner.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.scanner.api.annotation.GetResource;
import cn.stylefeng.roses.kernel.system.api.pojo.user.OnlineUserDTO;
import cn.stylefeng.roses.kernel.system.api.pojo.user.request.OnlineUserRequest;
import cn.stylefeng.roses.kernel.system.modular.user.service.SysUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ApiResource(
        name = "在线用户查看界面"
)
public class PropertyInfoController {
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SessionManagerApi sessionManagerApi;
    public PropertyInfoController() {
    }

    @GetResource(
            name = "在线用户查看界面",
            path = {"/view/propertyInfo"}
    )
    public String onlineUser() {
        return "/modular/system/propertyInfo/property_info.html";
    }

    @GetResource(
            name = "当前在线用户列表",
            path = {"/property/propertyInfoList"}
    )
    public ResponseData<List<OnlineUserDTO>> onlineUserList(OnlineUserRequest onlineUserRequest) {
        return new SuccessResponseData(this.sysUserService.onlineUserList(onlineUserRequest));
    }
}
