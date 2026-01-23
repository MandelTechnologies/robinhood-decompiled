package com.robinhood.shared.security.recaptcha;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecaptchaResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/security/recaptcha/RecaptchaResult;", "", "token", "", "siteKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getSiteKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-recaptcha_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecaptchaResult {
    private final String siteKey;
    private final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public RecaptchaResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecaptchaResult copy$default(RecaptchaResult recaptchaResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaResult.token;
        }
        if ((i & 2) != 0) {
            str2 = recaptchaResult.siteKey;
        }
        return recaptchaResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSiteKey() {
        return this.siteKey;
    }

    public final RecaptchaResult copy(String token, String siteKey) {
        return new RecaptchaResult(token, siteKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecaptchaResult)) {
            return false;
        }
        RecaptchaResult recaptchaResult = (RecaptchaResult) other;
        return Intrinsics.areEqual(this.token, recaptchaResult.token) && Intrinsics.areEqual(this.siteKey, recaptchaResult.siteKey);
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.siteKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RecaptchaResult(token=" + this.token + ", siteKey=" + this.siteKey + ")";
    }

    public RecaptchaResult(String str, String str2) {
        this.token = str;
        this.siteKey = str2;
    }

    public /* synthetic */ RecaptchaResult(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getSiteKey() {
        return this.siteKey;
    }
}
