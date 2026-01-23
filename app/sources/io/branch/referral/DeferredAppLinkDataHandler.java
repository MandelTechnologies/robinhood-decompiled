package io.branch.referral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes14.dex */
class DeferredAppLinkDataHandler {

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFinished(String str);
    }

    public static Boolean fetchDeferredAppLinkData(Context context, final AppLinkFetchEvents appLinkFetchEvents) {
        boolean z = false;
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: io.branch.referral.DeferredAppLinkDataHandler.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    Object obj2;
                    if (method2.getName().equals("onDeferredAppLinkDataFetched") && (obj2 = objArr[0]) != null) {
                        Bundle bundle = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                        String string2 = bundle != null ? bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL") : null;
                        AppLinkFetchEvents appLinkFetchEvents2 = appLinkFetchEvents;
                        if (appLinkFetchEvents2 != null) {
                            appLinkFetchEvents2.onAppLinkFetchFinished(string2);
                        }
                    } else {
                        AppLinkFetchEvents appLinkFetchEvents3 = appLinkFetchEvents;
                        if (appLinkFetchEvents3 != null) {
                            appLinkFetchEvents3.onAppLinkFetchFinished(null);
                        }
                    }
                    return null;
                }
            });
            String string2 = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string2)) {
                method.invoke(null, context, string2, objNewProxyInstance);
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
