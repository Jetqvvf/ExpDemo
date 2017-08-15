package users;

import com.jfinal.config.*;
import com.jfinal.i18n.I18n;
import com.jfinal.template.Engine;

public class demoConfig extends JFinalConfig {
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/login", loginController.class);
        me.add("/loadTreeJson", loadTreeController.class);
        me.add("/openFile", openFileController.class);
    }

    public void configPlugin(Plugins me) {}
    public void configEngine(Engine me) {}
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
}
