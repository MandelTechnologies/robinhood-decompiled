package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.crypto.p055bc.BouncyCastleProviderSingleton;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JwsValidator.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "isLiveMode", "", "rootCerts", "", "Ljava/security/cert/X509Certificate;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "getPayload", "Lorg/json/JSONObject;", "jws", "", "getPublicKeyFromHeader", "Ljava/security/PublicKey;", "jwsHeader", "Lcom/nimbusds/jose/JWSHeader;", "getVerifier", "Lcom/nimbusds/jose/JWSVerifier;", "isCertificateChainValid", "encodedChainCerts", "Lcom/nimbusds/jose/util/Base64;", "isValid", "jwsObject", "Lcom/nimbusds/jose/JWSObject;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator, reason: use source file name */
/* loaded from: classes26.dex */
public final class JwsValidator2 implements JwsValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ErrorReporter errorReporter;
    private final boolean isLiveMode;
    private final List<X509Certificate> rootCerts;

    /* JADX WARN: Multi-variable type inference failed */
    public JwsValidator2(boolean z, List<? extends X509Certificate> rootCerts, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.isLiveMode = z;
        this.rootCerts = rootCerts;
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.JwsValidator
    public JSONObject getPayload(String jws) throws JSONException, JOSEException, CertificateException, ParseException {
        Intrinsics.checkNotNullParameter(jws, "jws");
        JWSObject jWSObject = JWSObject.parse(jws);
        if (this.isLiveMode) {
            Intrinsics.checkNotNull(jWSObject);
            if (!isValid(jWSObject, this.rootCerts)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(jWSObject.getPayload().toString());
    }

    private final boolean isValid(JWSObject jwsObject, List<? extends X509Certificate> rootCerts) throws JOSEException, CertificateException {
        if (jwsObject.getHeader().getJWK() != null) {
            this.errorReporter.reportError(new IllegalArgumentException("Encountered a JWK in " + jwsObject.getHeader()));
        }
        Companion companion = INSTANCE;
        JWSHeader header = jwsObject.getHeader();
        Intrinsics.checkNotNullExpressionValue(header, "getHeader(...)");
        JWSHeader jWSHeaderSanitizedJwsHeader$3ds2sdk_release = companion.sanitizedJwsHeader$3ds2sdk_release(header);
        if (isCertificateChainValid(jWSHeaderSanitizedJwsHeader$3ds2sdk_release.getX509CertChain(), rootCerts)) {
            return jwsObject.verify(getVerifier(jWSHeaderSanitizedJwsHeader$3ds2sdk_release));
        }
        return false;
    }

    private final JWSVerifier getVerifier(JWSHeader jwsHeader) throws JOSEException, CertificateException {
        DefaultJWSVerifierFactory defaultJWSVerifierFactory = new DefaultJWSVerifierFactory();
        defaultJWSVerifierFactory.getJCAContext().setProvider(BouncyCastleProviderSingleton.getInstance());
        JWSVerifier jWSVerifierCreateJWSVerifier = defaultJWSVerifierFactory.createJWSVerifier(jwsHeader, getPublicKeyFromHeader(jwsHeader));
        Intrinsics.checkNotNullExpressionValue(jWSVerifierCreateJWSVerifier, "createJWSVerifier(...)");
        return jWSVerifierCreateJWSVerifier;
    }

    private final PublicKey getPublicKeyFromHeader(JWSHeader jwsHeader) throws CertificateException {
        List x509CertChain = jwsHeader.getX509CertChain();
        Intrinsics.checkNotNullExpressionValue(x509CertChain, "getX509CertChain(...)");
        PublicKey publicKey = X509CertUtils.parseWithException(((Base64) CollectionsKt.first(x509CertChain)).decode()).getPublicKey();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    public final boolean isCertificateChainValid(List<? extends Base64> encodedChainCerts, List<? extends X509Certificate> rootCerts) {
        Object objM28550constructorimpl;
        List<? extends Base64> list;
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        try {
            Result.Companion companion = Result.INSTANCE;
            list = encodedChainCerts;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty");
        }
        if (rootCerts.isEmpty()) {
            throw new IllegalArgumentException("Root certificates are empty");
        }
        INSTANCE.validateChain(encodedChainCerts, rootCerts);
        objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.errorReporter.reportError(thM28553exceptionOrNullimpl);
        }
        return Result.m28556isSuccessimpl(objM28550constructorimpl);
    }

    /* compiled from: JwsValidator.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ$\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;", "", "()V", "createKeyStore", "Ljava/security/KeyStore;", "rootCerts", "", "Ljava/security/cert/X509Certificate;", "sanitizedJwsHeader", "Lcom/nimbusds/jose/JWSHeader;", "jwsHeader", "sanitizedJwsHeader$3ds2sdk_release", "validateChain", "", "encodedChainCerts", "Lcom/nimbusds/jose/util/Base64;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateChain(List<? extends Base64> encodedChainCerts, List<? extends X509Certificate> rootCerts) throws GeneralSecurityException, IOException, ParseException {
            List<X509Certificate> list = X509CertChainUtils.parse(encodedChainCerts);
            KeyStore keyStoreCreateKeyStore = createKeyStore(rootCerts);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(list.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStoreCreateKeyStore, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(list)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore createKeyStore(List<? extends X509Certificate> rootCerts) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i = 0;
            for (Object obj : rootCerts) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                keyStore.setCertificateEntry(str, rootCerts.get(i));
                i = i2;
            }
            Intrinsics.checkNotNull(keyStore);
            return keyStore;
        }

        public final JWSHeader sanitizedJwsHeader$3ds2sdk_release(JWSHeader jwsHeader) {
            Intrinsics.checkNotNullParameter(jwsHeader, "jwsHeader");
            JWSHeader jWSHeaderBuild = new JWSHeader.Builder(jwsHeader).jwk(null).build();
            Intrinsics.checkNotNullExpressionValue(jWSHeaderBuild, "build(...)");
            return jWSHeaderBuild;
        }
    }
}
