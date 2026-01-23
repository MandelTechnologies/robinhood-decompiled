package com.twilio.twilsock.util;

import com.twilio.util.TwilioLogger;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SslContext.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m3636d2 = {"SslContext", "Ljavax/net/ssl/SSLContext;", "certificates", "", "", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.util.SslContextKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SslContext {
    public static final SSLContext SslContext(List<String> certificates) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        int i = 0;
        for (Object obj : certificates) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            try {
                keyStore.setCertificateEntry("entry" + i, certificateFactory.generateCertificate(new ByteArrayInputStream(StringsKt.encodeToByteArray(StringsKt.trim(str).toString()))));
            } catch (Exception e) {
                TwilioLogger.INSTANCE.getLogger("SslContextHelper").m3192e("Error parsing: \n" + str, e);
            }
            i = i2;
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
        Intrinsics.checkNotNullExpressionValue(sSLContext, "apply(...)");
        return sSLContext;
    }
}
