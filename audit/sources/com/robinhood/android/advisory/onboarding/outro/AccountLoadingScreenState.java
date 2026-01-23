package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryAccountLoadingScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "headerIcon", "Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;", "showCloseIcon", "", "showRefreshButton", "loggingIdentifier", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;ZZLjava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getHeaderIcon", "()Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;", "getShowCloseIcon", "()Z", "getShowRefreshButton", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountLoadingScreenState {
    public static final int $stable = StringResource.$stable;
    private final HeaderIcon headerIcon;
    private final String loggingIdentifier;
    private final boolean showCloseIcon;
    private final boolean showRefreshButton;
    private final StringResource subtitle;
    private final StringResource title;

    public static /* synthetic */ AccountLoadingScreenState copy$default(AccountLoadingScreenState accountLoadingScreenState, StringResource stringResource, StringResource stringResource2, HeaderIcon headerIcon, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = accountLoadingScreenState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = accountLoadingScreenState.subtitle;
        }
        if ((i & 4) != 0) {
            headerIcon = accountLoadingScreenState.headerIcon;
        }
        if ((i & 8) != 0) {
            z = accountLoadingScreenState.showCloseIcon;
        }
        if ((i & 16) != 0) {
            z2 = accountLoadingScreenState.showRefreshButton;
        }
        if ((i & 32) != 0) {
            str = accountLoadingScreenState.loggingIdentifier;
        }
        boolean z3 = z2;
        String str2 = str;
        return accountLoadingScreenState.copy(stringResource, stringResource2, headerIcon, z, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final HeaderIcon getHeaderIcon() {
        return this.headerIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowRefreshButton() {
        return this.showRefreshButton;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final AccountLoadingScreenState copy(StringResource title, StringResource subtitle, HeaderIcon headerIcon, boolean showCloseIcon, boolean showRefreshButton, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new AccountLoadingScreenState(title, subtitle, headerIcon, showCloseIcon, showRefreshButton, loggingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountLoadingScreenState)) {
            return false;
        }
        AccountLoadingScreenState accountLoadingScreenState = (AccountLoadingScreenState) other;
        return Intrinsics.areEqual(this.title, accountLoadingScreenState.title) && Intrinsics.areEqual(this.subtitle, accountLoadingScreenState.subtitle) && Intrinsics.areEqual(this.headerIcon, accountLoadingScreenState.headerIcon) && this.showCloseIcon == accountLoadingScreenState.showCloseIcon && this.showRefreshButton == accountLoadingScreenState.showRefreshButton && Intrinsics.areEqual(this.loggingIdentifier, accountLoadingScreenState.loggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        StringResource stringResource = this.subtitle;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        HeaderIcon headerIcon = this.headerIcon;
        return ((((((iHashCode2 + (headerIcon != null ? headerIcon.hashCode() : 0)) * 31) + Boolean.hashCode(this.showCloseIcon)) * 31) + Boolean.hashCode(this.showRefreshButton)) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "AccountLoadingScreenState(title=" + this.title + ", subtitle=" + this.subtitle + ", headerIcon=" + this.headerIcon + ", showCloseIcon=" + this.showCloseIcon + ", showRefreshButton=" + this.showRefreshButton + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    public AccountLoadingScreenState(StringResource title, StringResource stringResource, HeaderIcon headerIcon, boolean z, boolean z2, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.title = title;
        this.subtitle = stringResource;
        this.headerIcon = headerIcon;
        this.showCloseIcon = z;
        this.showRefreshButton = z2;
        this.loggingIdentifier = loggingIdentifier;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final HeaderIcon getHeaderIcon() {
        return this.headerIcon;
    }

    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    public final boolean getShowRefreshButton() {
        return this.showRefreshButton;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
