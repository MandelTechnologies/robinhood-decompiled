package com.robinhood.android.creditcard.p091ui.waitlist;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableMap;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextResponse;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J%\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003JÃ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001J\u0013\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR-\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001fR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;", "", "screen", "Lcom/robinhood/android/creditcard/ui/waitlist/Screen;", "joiningWaitlist", "", "goldSubscriptionState", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "inBlockGoldFlowExperiment", "videos", "Lcom/google/common/collect/ImmutableMap;", "", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "referralCode", "referralsBlocked", "referralContext", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse$RhReferralContext;", "canApply", "hasInvite", "hasValidCreditCard", "referrerFirstName", "waitlistFlowSimplified", "entryPointSource", "isLoadingWaitlistState", "<init>", "(Lcom/robinhood/android/creditcard/ui/waitlist/Screen;ZLcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;ZLcom/google/common/collect/ImmutableMap;Ljava/lang/String;ZLcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse$RhReferralContext;ZZZLjava/lang/String;ZLjava/lang/String;Z)V", "getScreen", "()Lcom/robinhood/android/creditcard/ui/waitlist/Screen;", "getJoiningWaitlist", "()Z", "getGoldSubscriptionState", "()Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "getInBlockGoldFlowExperiment", "getVideos", "()Lcom/google/common/collect/ImmutableMap;", "getReferralCode", "()Ljava/lang/String;", "getReferralsBlocked", "getReferralContext", "()Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse$RhReferralContext;", "getCanApply", "getHasInvite", "getHasValidCreditCard", "getReferrerFirstName", "getWaitlistFlowSimplified", "getEntryPointSource", "upgradeEligibility", "Lcom/robinhood/android/creditcard/ui/waitlist/UpgradeEligibility;", "getUpgradeEligibility", "()Lcom/robinhood/android/creditcard/ui/waitlist/UpgradeEligibility;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditCardWaitlistViewState {
    public static final int $stable = 8;
    private final boolean canApply;
    private final String entryPointSource;
    private final GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState;
    private final boolean hasInvite;
    private final boolean hasValidCreditCard;
    private final boolean inBlockGoldFlowExperiment;
    private final boolean isLoadingWaitlistState;
    private final boolean joiningWaitlist;
    private final String referralCode;
    private final ReferralContextResponse.RhReferralContext referralContext;
    private final boolean referralsBlocked;
    private final String referrerFirstName;
    private final Screen screen;
    private final UpgradeEligibility upgradeEligibility;
    private final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> videos;
    private final boolean waitlistFlowSimplified;

    public CreditCardWaitlistViewState() {
        this(null, false, null, false, null, null, false, null, false, false, false, null, false, null, false, 32767, null);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasInvite() {
        return this.hasInvite;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasValidCreditCard() {
        return this.hasValidCreditCard;
    }

    /* renamed from: component12, reason: from getter */
    public final String getReferrerFirstName() {
        return this.referrerFirstName;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getWaitlistFlowSimplified() {
        return this.waitlistFlowSimplified;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEntryPointSource() {
        return this.entryPointSource;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsLoadingWaitlistState() {
        return this.isLoadingWaitlistState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getJoiningWaitlist() {
        return this.joiningWaitlist;
    }

    /* renamed from: component3, reason: from getter */
    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInBlockGoldFlowExperiment() {
        return this.inBlockGoldFlowExperiment;
    }

    public final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> component5() {
        return this.videos;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getReferralsBlocked() {
        return this.referralsBlocked;
    }

    /* renamed from: component8, reason: from getter */
    public final ReferralContextResponse.RhReferralContext getReferralContext() {
        return this.referralContext;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanApply() {
        return this.canApply;
    }

    public final CreditCardWaitlistViewState copy(Screen screen, boolean joiningWaitlist, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, boolean inBlockGoldFlowExperiment, ImmutableMap<String, Tuples2<MediaSource, MediaItem>> videos, String referralCode, boolean referralsBlocked, ReferralContextResponse.RhReferralContext referralContext, boolean canApply, boolean hasInvite, boolean hasValidCreditCard, String referrerFirstName, boolean waitlistFlowSimplified, String entryPointSource, boolean isLoadingWaitlistState) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(goldSubscriptionState, "goldSubscriptionState");
        return new CreditCardWaitlistViewState(screen, joiningWaitlist, goldSubscriptionState, inBlockGoldFlowExperiment, videos, referralCode, referralsBlocked, referralContext, canApply, hasInvite, hasValidCreditCard, referrerFirstName, waitlistFlowSimplified, entryPointSource, isLoadingWaitlistState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardWaitlistViewState)) {
            return false;
        }
        CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) other;
        return this.screen == creditCardWaitlistViewState.screen && this.joiningWaitlist == creditCardWaitlistViewState.joiningWaitlist && this.goldSubscriptionState == creditCardWaitlistViewState.goldSubscriptionState && this.inBlockGoldFlowExperiment == creditCardWaitlistViewState.inBlockGoldFlowExperiment && Intrinsics.areEqual(this.videos, creditCardWaitlistViewState.videos) && Intrinsics.areEqual(this.referralCode, creditCardWaitlistViewState.referralCode) && this.referralsBlocked == creditCardWaitlistViewState.referralsBlocked && Intrinsics.areEqual(this.referralContext, creditCardWaitlistViewState.referralContext) && this.canApply == creditCardWaitlistViewState.canApply && this.hasInvite == creditCardWaitlistViewState.hasInvite && this.hasValidCreditCard == creditCardWaitlistViewState.hasValidCreditCard && Intrinsics.areEqual(this.referrerFirstName, creditCardWaitlistViewState.referrerFirstName) && this.waitlistFlowSimplified == creditCardWaitlistViewState.waitlistFlowSimplified && Intrinsics.areEqual(this.entryPointSource, creditCardWaitlistViewState.entryPointSource) && this.isLoadingWaitlistState == creditCardWaitlistViewState.isLoadingWaitlistState;
    }

    public int hashCode() {
        int iHashCode = ((((((this.screen.hashCode() * 31) + Boolean.hashCode(this.joiningWaitlist)) * 31) + this.goldSubscriptionState.hashCode()) * 31) + Boolean.hashCode(this.inBlockGoldFlowExperiment)) * 31;
        ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap = this.videos;
        int iHashCode2 = (iHashCode + (immutableMap == null ? 0 : immutableMap.hashCode())) * 31;
        String str = this.referralCode;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.referralsBlocked)) * 31;
        ReferralContextResponse.RhReferralContext rhReferralContext = this.referralContext;
        int iHashCode4 = (((((((iHashCode3 + (rhReferralContext == null ? 0 : rhReferralContext.hashCode())) * 31) + Boolean.hashCode(this.canApply)) * 31) + Boolean.hashCode(this.hasInvite)) * 31) + Boolean.hashCode(this.hasValidCreditCard)) * 31;
        String str2 = this.referrerFirstName;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.waitlistFlowSimplified)) * 31;
        String str3 = this.entryPointSource;
        return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoadingWaitlistState);
    }

    public String toString() {
        return "CreditCardWaitlistViewState(screen=" + this.screen + ", joiningWaitlist=" + this.joiningWaitlist + ", goldSubscriptionState=" + this.goldSubscriptionState + ", inBlockGoldFlowExperiment=" + this.inBlockGoldFlowExperiment + ", videos=" + this.videos + ", referralCode=" + this.referralCode + ", referralsBlocked=" + this.referralsBlocked + ", referralContext=" + this.referralContext + ", canApply=" + this.canApply + ", hasInvite=" + this.hasInvite + ", hasValidCreditCard=" + this.hasValidCreditCard + ", referrerFirstName=" + this.referrerFirstName + ", waitlistFlowSimplified=" + this.waitlistFlowSimplified + ", entryPointSource=" + this.entryPointSource + ", isLoadingWaitlistState=" + this.isLoadingWaitlistState + ")";
    }

    public CreditCardWaitlistViewState(Screen screen, boolean z, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, boolean z2, ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap, String str, boolean z3, ReferralContextResponse.RhReferralContext rhReferralContext, boolean z4, boolean z5, boolean z6, String str2, boolean z7, String str3, boolean z8) {
        UpgradeEligibility upgradeEligibility;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(goldSubscriptionState, "goldSubscriptionState");
        this.screen = screen;
        this.joiningWaitlist = z;
        this.goldSubscriptionState = goldSubscriptionState;
        this.inBlockGoldFlowExperiment = z2;
        this.videos = immutableMap;
        this.referralCode = str;
        this.referralsBlocked = z3;
        this.referralContext = rhReferralContext;
        this.canApply = z4;
        this.hasInvite = z5;
        this.hasValidCreditCard = z6;
        this.referrerFirstName = str2;
        this.waitlistFlowSimplified = z7;
        this.entryPointSource = str3;
        this.isLoadingWaitlistState = z8;
        if (goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD) {
            upgradeEligibility = UpgradeEligibility.HAS_GOLD;
        } else if (z2) {
            upgradeEligibility = UpgradeEligibility.INELIGIBLE;
        } else {
            upgradeEligibility = (goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.ELIGIBLE_FOR_GOLD || goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.NO_BROKERAGE_ACCOUNT) ? UpgradeEligibility.ELIGIBLE : UpgradeEligibility.INELIGIBLE;
        }
        this.upgradeEligibility = upgradeEligibility;
    }

    public /* synthetic */ CreditCardWaitlistViewState(Screen screen, boolean z, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, boolean z2, ImmutableMap immutableMap, String str, boolean z3, ReferralContextResponse.RhReferralContext rhReferralContext, boolean z4, boolean z5, boolean z6, String str2, boolean z7, String str3, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Screen.LOADING : screen, (i & 2) != 0 ? false : z, (i & 4) != 0 ? GoldSubscriptionStore.GoldSubscriptionState.INELIGIBLE_FOR_GOLD : goldSubscriptionState, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : immutableMap, (i & 32) != 0 ? null : str, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : rhReferralContext, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? false : z7, (i & 8192) == 0 ? str3 : null, (i & 16384) != 0 ? false : z8);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final boolean getJoiningWaitlist() {
        return this.joiningWaitlist;
    }

    public final GoldSubscriptionStore.GoldSubscriptionState getGoldSubscriptionState() {
        return this.goldSubscriptionState;
    }

    public final boolean getInBlockGoldFlowExperiment() {
        return this.inBlockGoldFlowExperiment;
    }

    public final ImmutableMap<String, Tuples2<MediaSource, MediaItem>> getVideos() {
        return this.videos;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final boolean getReferralsBlocked() {
        return this.referralsBlocked;
    }

    public final ReferralContextResponse.RhReferralContext getReferralContext() {
        return this.referralContext;
    }

    public final boolean getCanApply() {
        return this.canApply;
    }

    public final boolean getHasInvite() {
        return this.hasInvite;
    }

    public final boolean getHasValidCreditCard() {
        return this.hasValidCreditCard;
    }

    public final String getReferrerFirstName() {
        return this.referrerFirstName;
    }

    public final boolean getWaitlistFlowSimplified() {
        return this.waitlistFlowSimplified;
    }

    public final String getEntryPointSource() {
        return this.entryPointSource;
    }

    public final boolean isLoadingWaitlistState() {
        return this.isLoadingWaitlistState;
    }

    public final UpgradeEligibility getUpgradeEligibility() {
        return this.upgradeEligibility;
    }
}
