package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsWelcomeFragmentViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentViewState;", "", "shouldShowRhyUpsell", "", "isLoadingVisible", "isTimedOut", "welcomeTitle", "", "welcomeBody", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "(Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getShouldShowRhyUpsell", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getWelcomeTitle", "()Ljava/lang/String;", "getWelcomeBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;)Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentViewState;", "equals", "other", "hashCode", "", "toString", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardsWelcomeFragmentViewState {
    public static final int $stable = 8;
    private final boolean isLoadingVisible;
    private final Boolean isTimedOut;
    private final Boolean shouldShowRhyUpsell;
    private final MarkdownContent welcomeBody;
    private final String welcomeTitle;

    public MerchantRewardsWelcomeFragmentViewState() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ MerchantRewardsWelcomeFragmentViewState copy$default(MerchantRewardsWelcomeFragmentViewState merchantRewardsWelcomeFragmentViewState, Boolean bool, boolean z, Boolean bool2, String str, MarkdownContent markdownContent, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = merchantRewardsWelcomeFragmentViewState.shouldShowRhyUpsell;
        }
        if ((i & 2) != 0) {
            z = merchantRewardsWelcomeFragmentViewState.isLoadingVisible;
        }
        if ((i & 4) != 0) {
            bool2 = merchantRewardsWelcomeFragmentViewState.isTimedOut;
        }
        if ((i & 8) != 0) {
            str = merchantRewardsWelcomeFragmentViewState.welcomeTitle;
        }
        if ((i & 16) != 0) {
            markdownContent = merchantRewardsWelcomeFragmentViewState.welcomeBody;
        }
        MarkdownContent markdownContent2 = markdownContent;
        Boolean bool3 = bool2;
        return merchantRewardsWelcomeFragmentViewState.copy(bool, z, bool3, str, markdownContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShouldShowRhyUpsell() {
        return this.shouldShowRhyUpsell;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingVisible() {
        return this.isLoadingVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsTimedOut() {
        return this.isTimedOut;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWelcomeTitle() {
        return this.welcomeTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final MarkdownContent getWelcomeBody() {
        return this.welcomeBody;
    }

    public final MerchantRewardsWelcomeFragmentViewState copy(Boolean shouldShowRhyUpsell, boolean isLoadingVisible, Boolean isTimedOut, String welcomeTitle, MarkdownContent welcomeBody) {
        return new MerchantRewardsWelcomeFragmentViewState(shouldShowRhyUpsell, isLoadingVisible, isTimedOut, welcomeTitle, welcomeBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantRewardsWelcomeFragmentViewState)) {
            return false;
        }
        MerchantRewardsWelcomeFragmentViewState merchantRewardsWelcomeFragmentViewState = (MerchantRewardsWelcomeFragmentViewState) other;
        return Intrinsics.areEqual(this.shouldShowRhyUpsell, merchantRewardsWelcomeFragmentViewState.shouldShowRhyUpsell) && this.isLoadingVisible == merchantRewardsWelcomeFragmentViewState.isLoadingVisible && Intrinsics.areEqual(this.isTimedOut, merchantRewardsWelcomeFragmentViewState.isTimedOut) && Intrinsics.areEqual(this.welcomeTitle, merchantRewardsWelcomeFragmentViewState.welcomeTitle) && Intrinsics.areEqual(this.welcomeBody, merchantRewardsWelcomeFragmentViewState.welcomeBody);
    }

    public int hashCode() {
        Boolean bool = this.shouldShowRhyUpsell;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.isLoadingVisible)) * 31;
        Boolean bool2 = this.isTimedOut;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.welcomeTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MarkdownContent markdownContent = this.welcomeBody;
        return iHashCode3 + (markdownContent != null ? markdownContent.hashCode() : 0);
    }

    public String toString() {
        return "MerchantRewardsWelcomeFragmentViewState(shouldShowRhyUpsell=" + this.shouldShowRhyUpsell + ", isLoadingVisible=" + this.isLoadingVisible + ", isTimedOut=" + this.isTimedOut + ", welcomeTitle=" + this.welcomeTitle + ", welcomeBody=" + this.welcomeBody + ")";
    }

    public MerchantRewardsWelcomeFragmentViewState(Boolean bool, boolean z, Boolean bool2, String str, MarkdownContent markdownContent) {
        this.shouldShowRhyUpsell = bool;
        this.isLoadingVisible = z;
        this.isTimedOut = bool2;
        this.welcomeTitle = str;
        this.welcomeBody = markdownContent;
    }

    public /* synthetic */ MerchantRewardsWelcomeFragmentViewState(Boolean bool, boolean z, Boolean bool2, String str, MarkdownContent markdownContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : markdownContent);
    }

    public final Boolean getShouldShowRhyUpsell() {
        return this.shouldShowRhyUpsell;
    }

    public final boolean isLoadingVisible() {
        return this.isLoadingVisible;
    }

    public final Boolean isTimedOut() {
        return this.isTimedOut;
    }

    public final String getWelcomeTitle() {
        return this.welcomeTitle;
    }

    public final MarkdownContent getWelcomeBody() {
        return this.welcomeBody;
    }
}
