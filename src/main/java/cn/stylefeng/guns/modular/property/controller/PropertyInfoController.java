package cn.stylefeng.guns.modular.property.controller;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import cn.stylefeng.roses.kernel.scanner.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.scanner.api.annotation.GetResource;
import org.springframework.stereotype.Controller;

@Controller
@ApiResource(
        name = "在线用户查看界面"
)
public class PropertyInfoController {
    public PropertyInfoController() {
    }

    @GetResource(
            name = "在线用户查看界面",
            path = {"/view/propertyInfo"}
    )
    public String onlineUser() {
        return "/modular/system/propertyInfo/property_info.html";
    }
}
