package com.robinhood.android.doc.p109ui.persona.splash;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PersonaSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;", "", "isLoading", "", "showSkipAlert", "showErrorAlert", "showThanksScreen", "<init>", "(ZZZZ)V", "()Z", "getShowSkipAlert", "getShowErrorAlert", "getShowThanksScreen", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VerifyIdentitySplashViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final boolean showErrorAlert;
    private final boolean showSkipAlert;
    private final boolean showThanksScreen;

    public VerifyIdentitySplashViewState() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ VerifyIdentitySplashViewState copy$default(VerifyIdentitySplashViewState verifyIdentitySplashViewState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyIdentitySplashViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = verifyIdentitySplashViewState.showSkipAlert;
        }
        if ((i & 4) != 0) {
            z3 = verifyIdentitySplashViewState.showErrorAlert;
        }
        if ((i & 8) != 0) {
            z4 = verifyIdentitySplashViewState.showThanksScreen;
        }
        return verifyIdentitySplashViewState.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowSkipAlert() {
        return this.showSkipAlert;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowErrorAlert() {
        return this.showErrorAlert;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowThanksScreen() {
        return this.showThanksScreen;
    }

    public final VerifyIdentitySplashViewState copy(boolean isLoading, boolean showSkipAlert, boolean showErrorAlert, boolean showThanksScreen) {
        return new VerifyIdentitySplashViewState(isLoading, showSkipAlert, showErrorAlert, showThanksScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyIdentitySplashViewState)) {
            return false;
        }
        VerifyIdentitySplashViewState verifyIdentitySplashViewState = (VerifyIdentitySplashViewState) other;
        return this.isLoading == verifyIdentitySplashViewState.isLoading && this.showSkipAlert == verifyIdentitySplashViewState.showSkipAlert && this.showErrorAlert == verifyIdentitySplashViewState.showErrorAlert && this.showThanksScreen == verifyIdentitySplashViewState.showThanksScreen;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showSkipAlert)) * 31) + Boolean.hashCode(this.showErrorAlert)) * 31) + Boolean.hashCode(this.showThanksScreen);
    }

    public String toString() {
        return "VerifyIdentitySplashViewState(isLoading=" + this.isLoading + ", showSkipAlert=" + this.showSkipAlert + ", showErrorAlert=" + this.showErrorAlert + ", showThanksScreen=" + this.showThanksScreen + ")";
    }

    public VerifyIdentitySplashViewState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isLoading = z;
        this.showSkipAlert = z2;
        this.showErrorAlert = z3;
        this.showThanksScreen = z4;
    }

    public /* synthetic */ VerifyIdentitySplashViewState(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowSkipAlert() {
        return this.showSkipAlert;
    }

    public final boolean getShowErrorAlert() {
        return this.showErrorAlert;
    }

    public final boolean getShowThanksScreen() {
        return this.showThanksScreen;
    }
}
