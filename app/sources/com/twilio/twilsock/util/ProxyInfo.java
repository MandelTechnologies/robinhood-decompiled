package com.twilio.twilsock.util;

import android.content.Context;
import android.net.ConnectivityManager;
import com.twilio.util.ApplicationContextHolder;
import com.twilio.util.TwilioLogger3;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;

/* compiled from: ProxyInfo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/twilio/twilsock/util/ProxyInfo;", "", "()V", "applicationContext", "Landroid/content/Context;", "<set-?>", "", "host", "getHost", "()Ljava/lang/String;", "password", "getPassword", "", "port", "getPort", "()I", "user", "getUser", "parseHostParts", "", "proxy", "readProxyConfigFromFile", "readProxyConfigFromSystem", "update", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ProxyInfo {
    private String host;
    private String password;
    private String user;
    private final Context applicationContext = ApplicationContextHolder.getApplicationContext();
    private int port = -1;

    public ProxyInfo() {
        update();
    }

    public final String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }

    public final String getUser() {
        return this.user;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void update() {
        try {
            readProxyConfigFromFile();
        } catch (Exception e) {
            TwilioLogger3.getLogger(this).m3196i("Cannot read proxy config from file: ", e);
            try {
                readProxyConfigFromSystem();
            } catch (Exception e2) {
                TwilioLogger3.getLogger(this).m3196i("Cannot read proxy config from system: ", e2);
            }
        }
    }

    private final void readProxyConfigFromSystem() throws Exception {
        Method method = ConnectivityManager.class.getMethod("getDefaultProxy", null);
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        Object objInvoke = method.invoke((ConnectivityManager) systemService, null);
        android.net.ProxyInfo proxyInfo = objInvoke instanceof android.net.ProxyInfo ? (android.net.ProxyInfo) objInvoke : null;
        if (proxyInfo == null) {
            return;
        }
        parseHostParts(proxyInfo.getHost());
        this.port = proxyInfo.getPort();
    }

    private final void readProxyConfigFromFile() throws Exception {
        InputStream inputStreamOpen = this.applicationContext.getAssets().open("proxysettings.properties");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, "UTF-8");
            Properties properties = new Properties();
            properties.load(inputStreamReader);
            parseHostParts(properties.getProperty("host", null));
            String property = properties.getProperty("port", String.valueOf(this.port));
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            this.port = Integer.parseInt(property);
            this.user = properties.getProperty("user", this.user);
            this.password = properties.getProperty("password", this.password);
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(inputStreamOpen, null);
        } finally {
        }
    }

    private final void parseHostParts(String proxy) {
        List listSplit$default;
        List listSplit$default2;
        this.host = proxy;
        if (proxy != null && (listSplit$default2 = StringsKt.split$default((CharSequence) proxy, new char[]{'@'}, false, 0, 6, (Object) null)) != null) {
            if (listSplit$default2.size() < 2) {
                listSplit$default2 = null;
            }
            if (listSplit$default2 != null) {
                this.user = (String) listSplit$default2.get(0);
                this.host = (String) listSplit$default2.get(1);
            }
        }
        String str = this.user;
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{':'}, false, 0, 6, (Object) null)) == null) {
            return;
        }
        List list = listSplit$default.size() >= 2 ? listSplit$default : null;
        if (list != null) {
            this.user = (String) list.get(0);
            this.password = (String) list.get(1);
        }
    }
}
