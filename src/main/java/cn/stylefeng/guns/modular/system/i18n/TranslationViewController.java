package cn.stylefeng.guns.modular.system.i18n;

import cn.stylefeng.roses.kernel.resource.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.resource.api.annotation.GetResource;
import org.springframework.stereotype.Controller;

/**
 * 多语言界面
 *
 * @author fengshuonan
 * @date 2021/1/24 19:15
 */
@Controller
@ApiResource(name = "多语言界面")
public class TranslationViewController {

    /**
     * 多语言主界面
     *
     * @author fengshuonan
     * @date 2021/1/24 19:15
     */
    @GetResource(name = "文件管理首页", path = "/view/i18n")
    public String index() {
        return "/modular/system/i18n/translation.html";
    }

    /**
     * 多语言新增界面
     *
     * @author fengshuonan
     * @date 2021/1/24 19:16
     */
    @GetResource(name = "多语言新增界面", path = "/view/i18n/add")
    public String add() {
        return "/modular/system/i18n/translation_add.html";
    }

    /**
     * 多语言编辑界面
     *
     * @author fengshuonan
     * @date 2021/1/24 19:16
     */
    @GetResource(name = "文件管理首页", path = "/view/i18n/edit")
    public String edit() {
        return "/modular/system/i18n/translation_edit.html";
    }

}