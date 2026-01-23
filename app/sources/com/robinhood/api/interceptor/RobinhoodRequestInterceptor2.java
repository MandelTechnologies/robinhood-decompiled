package com.robinhood.api.interceptor;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RobinhoodRequestInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/interceptor/CertificatePinningFailure;", "Ljavax/net/ssl/SSLException;", "host", "", "cause", "Ljavax/net/ssl/SSLPeerUnverifiedException;", "<init>", "(Ljava/lang/String;Ljavax/net/ssl/SSLPeerUnverifiedException;)V", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.interceptor.CertificatePinningFailure, reason: use source file name */
/* loaded from: classes16.dex */
final class RobinhoodRequestInterceptor2 extends SSLException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobinhoodRequestInterceptor2(String host, SSLPeerUnverifiedException cause) {
        super(host, cause);
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
