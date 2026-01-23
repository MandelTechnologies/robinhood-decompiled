package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.crypto.impl.ConcatKDF;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeDiffieHellmanKeyGenerator.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "generate", "Ljavax/crypto/SecretKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "sdkPrivateKey", "Ljava/security/interfaces/ECPrivateKey;", "agreementInfo", "", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StripeDiffieHellmanKeyGenerator implements DiffieHellmanKeyGenerator {
    private static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;

    public StripeDiffieHellmanKeyGenerator(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator
    public SecretKey generate(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(sdkPrivateKey, "sdkPrivateKey");
        Intrinsics.checkNotNullParameter(agreementInfo, "agreementInfo");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new ConcatKDF("SHA-256").deriveKey(ECDH.deriveSharedSecret(acsPublicKey, sdkPrivateKey, null), 256, ConcatKDF.encodeStringData(null), ConcatKDF.encodeDataWithLength((Base64URL) null), ConcatKDF.encodeDataWithLength(Base64URL.encode(agreementInfo)), ConcatKDF.encodeIntData(256), ConcatKDF.encodeNoData()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.errorReporter.reportError(thM28553exceptionOrNullimpl);
        }
        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl2 != null) {
            throw new SDKRuntimeException(thM28553exceptionOrNullimpl2);
        }
        Intrinsics.checkNotNullExpressionValue(objM28550constructorimpl, "getOrElse(...)");
        return (SecretKey) objM28550constructorimpl;
    }

    /* compiled from: StripeDiffieHellmanKeyGenerator.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator$Companion;", "", "()V", "HASH_ALGO", "", "KEY_LENGTH", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
