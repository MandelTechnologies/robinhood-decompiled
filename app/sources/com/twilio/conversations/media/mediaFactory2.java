package com.twilio.conversations.media;

import com.twilio.twilsock.util.ProxyInfo;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: mediaFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/twilio/conversations/media/ProxyAuthenticator;", "Ljava/net/Authenticator;", "proxyInfo", "Lcom/twilio/twilsock/util/ProxyInfo;", "<init>", "(Lcom/twilio/twilsock/util/ProxyInfo;)V", "getProxyInfo", "()Lcom/twilio/twilsock/util/ProxyInfo;", "getPasswordAuthentication", "Ljava/net/PasswordAuthentication;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.twilio.conversations.media.ProxyAuthenticator, reason: use source file name */
/* loaded from: classes12.dex */
final class mediaFactory2 extends Authenticator {
    private final ProxyInfo proxyInfo;

    public mediaFactory2(ProxyInfo proxyInfo) {
        Intrinsics.checkNotNullParameter(proxyInfo, "proxyInfo");
        this.proxyInfo = proxyInfo;
    }

    public final ProxyInfo getProxyInfo() {
        return this.proxyInfo;
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        char[] charArray = null;
        if (Intrinsics.areEqual(getRequestingHost(), this.proxyInfo.getHost()) && getRequestingPort() == this.proxyInfo.getPort()) {
            TwilioLogger.i$default(TwilioLogger3.getLogger(this), "getPasswordAuthentication: return PasswordAuthentication", (Throwable) null, 2, (Object) null);
            String user = this.proxyInfo.getUser();
            String password = this.proxyInfo.getPassword();
            if (password != null) {
                charArray = password.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            }
            return new PasswordAuthentication(user, charArray);
        }
        TwilioLogger.i$default(TwilioLogger3.getLogger(this), "getPasswordAuthentication: return null", (Throwable) null, 2, (Object) null);
        return null;
    }
}
