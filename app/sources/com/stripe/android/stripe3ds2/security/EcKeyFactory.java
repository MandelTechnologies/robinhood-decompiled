package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "keyFactory", "Ljava/security/KeyFactory;", "createPrivate", "Ljava/security/interfaces/ECPrivateKey;", "privateKeyEncoded", "", "createPublic", "Ljava/security/interfaces/ECPublicKey;", "publicKeyEncoded", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EcKeyFactory {
    private final ErrorReporter errorReporter;
    private final KeyFactory keyFactory;

    public EcKeyFactory(ErrorReporter errorReporter) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(KeyFactory.getInstance("EC"));
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
        this.keyFactory = (KeyFactory) objM28550constructorimpl;
    }

    public final ECPublicKey createPublic(byte[] publicKeyEncoded) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(publicKeyEncoded, "publicKeyEncoded");
        try {
            Result.Companion companion = Result.INSTANCE;
            PublicKey publicKeyGeneratePublic = this.keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            Intrinsics.checkNotNull(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            objM28550constructorimpl = Result.m28550constructorimpl((ECPublicKey) publicKeyGeneratePublic);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.errorReporter.reportError(thM28553exceptionOrNullimpl);
        }
        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl2 == null) {
            return (ECPublicKey) objM28550constructorimpl;
        }
        throw new SDKRuntimeException(thM28553exceptionOrNullimpl2);
    }

    public final ECPrivateKey createPrivate(byte[] privateKeyEncoded) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(privateKeyEncoded, "privateKeyEncoded");
        try {
            Result.Companion companion = Result.INSTANCE;
            PrivateKey privateKeyGeneratePrivate = this.keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            Intrinsics.checkNotNull(privateKeyGeneratePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            objM28550constructorimpl = Result.m28550constructorimpl((ECPrivateKey) privateKeyGeneratePrivate);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            return (ECPrivateKey) objM28550constructorimpl;
        }
        throw new SDKRuntimeException(thM28553exceptionOrNullimpl);
    }
}
