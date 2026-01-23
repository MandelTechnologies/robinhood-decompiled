package com.stripe.android.payments.core.authentication;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebIntentNextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/WebAuthParams;", "", "", "authUrl", "returnUrl", "", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", Constants.REFERRER, "forceInAppWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthUrl", "getReturnUrl", "Z", "getShouldCancelSource", "()Z", "getShouldCancelIntentOnUserNavigation", "getReferrer", "getForceInAppWebView", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
final /* data */ class WebAuthParams {
    private final String authUrl;
    private final boolean forceInAppWebView;
    private final String referrer;
    private final String returnUrl;
    private final boolean shouldCancelIntentOnUserNavigation;
    private final boolean shouldCancelSource;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebAuthParams)) {
            return false;
        }
        WebAuthParams webAuthParams = (WebAuthParams) other;
        return Intrinsics.areEqual(this.authUrl, webAuthParams.authUrl) && Intrinsics.areEqual(this.returnUrl, webAuthParams.returnUrl) && this.shouldCancelSource == webAuthParams.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == webAuthParams.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.referrer, webAuthParams.referrer) && this.forceInAppWebView == webAuthParams.forceInAppWebView;
    }

    public int hashCode() {
        int iHashCode = this.authUrl.hashCode() * 31;
        String str = this.returnUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldCancelSource)) * 31) + Boolean.hashCode(this.shouldCancelIntentOnUserNavigation)) * 31;
        String str2 = this.referrer;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceInAppWebView);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.authUrl + ", returnUrl=" + this.returnUrl + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", referrer=" + this.referrer + ", forceInAppWebView=" + this.forceInAppWebView + ")";
    }

    public WebAuthParams(String authUrl, String str, boolean z, boolean z2, String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.authUrl = authUrl;
        this.returnUrl = str;
        this.shouldCancelSource = z;
        this.shouldCancelIntentOnUserNavigation = z2;
        this.referrer = str2;
        this.forceInAppWebView = z3;
    }

    public /* synthetic */ WebAuthParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3);
    }

    public final String getAuthUrl() {
        return this.authUrl;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final boolean getShouldCancelSource() {
        return this.shouldCancelSource;
    }

    public final boolean getShouldCancelIntentOnUserNavigation() {
        return this.shouldCancelIntentOnUserNavigation;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final boolean getForceInAppWebView() {
        return this.forceInAppWebView;
    }
}
