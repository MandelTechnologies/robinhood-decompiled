package com.stripe.hcaptcha;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaTokenResponse.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaTokenResponse;", "", "", "tokenResult", "Landroid/os/Handler;", "handler", "<init>", "(Ljava/lang/String;Landroid/os/Handler;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTokenResult", "Landroid/os/Handler;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class HCaptchaTokenResponse {
    private final Handler handler;
    private final String tokenResult;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaTokenResponse)) {
            return false;
        }
        HCaptchaTokenResponse hCaptchaTokenResponse = (HCaptchaTokenResponse) other;
        return Intrinsics.areEqual(this.tokenResult, hCaptchaTokenResponse.tokenResult) && Intrinsics.areEqual(this.handler, hCaptchaTokenResponse.handler);
    }

    public int hashCode() {
        return (this.tokenResult.hashCode() * 31) + this.handler.hashCode();
    }

    public String toString() {
        return "HCaptchaTokenResponse(tokenResult=" + this.tokenResult + ", handler=" + this.handler + ")";
    }

    public HCaptchaTokenResponse(String tokenResult, Handler handler) {
        Intrinsics.checkNotNullParameter(tokenResult, "tokenResult");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.tokenResult = tokenResult;
        this.handler = handler;
    }

    public final String getTokenResult() {
        return this.tokenResult;
    }
}
