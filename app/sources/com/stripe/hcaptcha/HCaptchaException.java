package com.stripe.hcaptcha;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaException.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/stripe/hcaptcha/HCaptchaError;", "hCaptchaError", "", "hCaptchaMessage", "<init>", "(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/hcaptcha/HCaptchaError;", "getHCaptchaError", "()Lcom/stripe/hcaptcha/HCaptchaError;", "Ljava/lang/String;", "getHCaptchaMessage", "getMessage", "message", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class HCaptchaException extends Exception {
    private final HCaptchaError hCaptchaError;
    private final String hCaptchaMessage;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) other;
        return this.hCaptchaError == hCaptchaException.hCaptchaError && Intrinsics.areEqual(this.hCaptchaMessage, hCaptchaException.hCaptchaMessage);
    }

    public int hashCode() {
        int iHashCode = this.hCaptchaError.hashCode() * 31;
        String str = this.hCaptchaMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HCaptchaException(hCaptchaError=" + this.hCaptchaError + ", hCaptchaMessage=" + this.hCaptchaMessage + ")";
    }

    public /* synthetic */ HCaptchaException(HCaptchaError hCaptchaError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hCaptchaError, (i & 2) != 0 ? null : str);
    }

    public final HCaptchaError getHCaptchaError() {
        return this.hCaptchaError;
    }

    @JvmOverloads
    public HCaptchaException(HCaptchaError hCaptchaError, String str) {
        Intrinsics.checkNotNullParameter(hCaptchaError, "hCaptchaError");
        this.hCaptchaError = hCaptchaError;
        this.hCaptchaMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.hCaptchaMessage;
        return str == null ? this.hCaptchaError.getMessage() : str;
    }
}
