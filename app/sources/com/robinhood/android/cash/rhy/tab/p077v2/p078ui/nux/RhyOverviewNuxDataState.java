package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment;
import com.robinhood.librobinhood.data.RhyOverviewAccountType;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RhyOverviewNuxDataState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u00106J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u00106Jì\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010%R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bP\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bS\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bT\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\b\u000e\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010/R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bW\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u00102R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u00104R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b]\u00106R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\b_\u00108R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010`\u001a\u0004\ba\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010b\u001a\u0004\bc\u0010<R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\bd\u00106R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\\\u001a\u0004\be\u00106¨\u0006f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;", "", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "paymentCard", "", "hasDirectDepositRelationships", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "googlePayTokenList", "hasSpentOnDebitCard", "", "nuxSeenTimestamp", "hasClickedDirectDepositNux", "hasTransferredIntoRhy", "isActiveAccount", "Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "spendingAccountType", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "overridesList", "Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "cmIncentiveGroup", "Lcom/robinhood/prefs/BooleanPreference;", "hasClickedDirectDepositNuxPref", "showDebugAddCardToGooglePayDialog", "j$/time/Instant", "rhyAccountCreatedAt", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "rhyReferralEligibility", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "rhyReferralAttribution", "hasViewedRefereeOffer", "rhyDebugHideNux", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;Ljava/util/List;Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;Lcom/robinhood/prefs/BooleanPreference;ZLj$/time/Instant;Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;ZZ)V", "component1", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "component9", "()Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "component10", "component11", "()Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "component12", "()Lcom/robinhood/prefs/BooleanPreference;", "component13", "()Z", "component14", "()Lj$/time/Instant;", "component15", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "component16", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "component17", "component18", "copy", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;Ljava/util/List;Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;Lcom/robinhood/prefs/BooleanPreference;ZLj$/time/Instant;Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;ZZ)Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "getPaymentCard", "Ljava/lang/Boolean;", "getHasDirectDepositRelationships", "Ljava/util/List;", "getGooglePayTokenList", "getHasSpentOnDebitCard", "Ljava/lang/Long;", "getNuxSeenTimestamp", "getHasClickedDirectDepositNux", "getHasTransferredIntoRhy", "Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "getSpendingAccountType", "getOverridesList", "Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "getCmIncentiveGroup", "Lcom/robinhood/prefs/BooleanPreference;", "getHasClickedDirectDepositNuxPref", "Z", "getShowDebugAddCardToGooglePayDialog", "Lj$/time/Instant;", "getRhyAccountCreatedAt", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "getRhyReferralEligibility", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "getRhyReferralAttribution", "getHasViewedRefereeOffer", "getRhyDebugHideNux", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RhyOverviewNuxDataState {
    public static final int $stable = 8;
    private final CmSunsetIncentiveExperiment.Variant cmIncentiveGroup;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final Boolean hasClickedDirectDepositNux;
    private final BooleanPreference hasClickedDirectDepositNuxPref;
    private final Boolean hasDirectDepositRelationships;
    private final Boolean hasSpentOnDebitCard;
    private final Boolean hasTransferredIntoRhy;
    private final boolean hasViewedRefereeOffer;
    private final Boolean isActiveAccount;
    private final Long nuxSeenTimestamp;
    private final List<ProductMarketing.Feature> overridesList;
    private final PaymentCard paymentCard;
    private final Instant rhyAccountCreatedAt;
    private final boolean rhyDebugHideNux;
    private final RhyReferralAttribution rhyReferralAttribution;
    private final RhyReferralEligibility rhyReferralEligibility;
    private final boolean showDebugAddCardToGooglePayDialog;
    private final RhyOverviewAccountType spendingAccountType;

    public static /* synthetic */ RhyOverviewNuxDataState copy$default(RhyOverviewNuxDataState rhyOverviewNuxDataState, PaymentCard paymentCard, Boolean bool, List list, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, RhyOverviewAccountType rhyOverviewAccountType, List list2, CmSunsetIncentiveExperiment.Variant variant, BooleanPreference booleanPreference, boolean z, Instant instant, RhyReferralEligibility rhyReferralEligibility, RhyReferralAttribution rhyReferralAttribution, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        PaymentCard paymentCard2 = (i & 1) != 0 ? rhyOverviewNuxDataState.paymentCard : paymentCard;
        Boolean bool6 = (i & 2) != 0 ? rhyOverviewNuxDataState.hasDirectDepositRelationships : bool;
        List list3 = (i & 4) != 0 ? rhyOverviewNuxDataState.googlePayTokenList : list;
        Boolean bool7 = (i & 8) != 0 ? rhyOverviewNuxDataState.hasSpentOnDebitCard : bool2;
        Long l2 = (i & 16) != 0 ? rhyOverviewNuxDataState.nuxSeenTimestamp : l;
        Boolean bool8 = (i & 32) != 0 ? rhyOverviewNuxDataState.hasClickedDirectDepositNux : bool3;
        Boolean bool9 = (i & 64) != 0 ? rhyOverviewNuxDataState.hasTransferredIntoRhy : bool4;
        Boolean bool10 = (i & 128) != 0 ? rhyOverviewNuxDataState.isActiveAccount : bool5;
        RhyOverviewAccountType rhyOverviewAccountType2 = (i & 256) != 0 ? rhyOverviewNuxDataState.spendingAccountType : rhyOverviewAccountType;
        List list4 = (i & 512) != 0 ? rhyOverviewNuxDataState.overridesList : list2;
        CmSunsetIncentiveExperiment.Variant variant2 = (i & 1024) != 0 ? rhyOverviewNuxDataState.cmIncentiveGroup : variant;
        BooleanPreference booleanPreference2 = (i & 2048) != 0 ? rhyOverviewNuxDataState.hasClickedDirectDepositNuxPref : booleanPreference;
        boolean z6 = (i & 4096) != 0 ? rhyOverviewNuxDataState.showDebugAddCardToGooglePayDialog : z;
        Instant instant2 = (i & 8192) != 0 ? rhyOverviewNuxDataState.rhyAccountCreatedAt : instant;
        PaymentCard paymentCard3 = paymentCard2;
        RhyReferralEligibility rhyReferralEligibility2 = (i & 16384) != 0 ? rhyOverviewNuxDataState.rhyReferralEligibility : rhyReferralEligibility;
        RhyReferralAttribution rhyReferralAttribution2 = (i & 32768) != 0 ? rhyOverviewNuxDataState.rhyReferralAttribution : rhyReferralAttribution;
        boolean z7 = (i & 65536) != 0 ? rhyOverviewNuxDataState.hasViewedRefereeOffer : z2;
        if ((i & 131072) != 0) {
            z5 = z7;
            z4 = rhyOverviewNuxDataState.rhyDebugHideNux;
        } else {
            z4 = z3;
            z5 = z7;
        }
        return rhyOverviewNuxDataState.copy(paymentCard3, bool6, list3, bool7, l2, bool8, bool9, bool10, rhyOverviewAccountType2, list4, variant2, booleanPreference2, z6, instant2, rhyReferralEligibility2, rhyReferralAttribution2, z5, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    public final List<ProductMarketing.Feature> component10() {
        return this.overridesList;
    }

    /* renamed from: component11, reason: from getter */
    public final CmSunsetIncentiveExperiment.Variant getCmIncentiveGroup() {
        return this.cmIncentiveGroup;
    }

    /* renamed from: component12, reason: from getter */
    public final BooleanPreference getHasClickedDirectDepositNuxPref() {
        return this.hasClickedDirectDepositNuxPref;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    /* renamed from: component14, reason: from getter */
    public final Instant getRhyAccountCreatedAt() {
        return this.rhyAccountCreatedAt;
    }

    /* renamed from: component15, reason: from getter */
    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    /* renamed from: component16, reason: from getter */
    public final RhyReferralAttribution getRhyReferralAttribution() {
        return this.rhyReferralAttribution;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasViewedRefereeOffer() {
        return this.hasViewedRefereeOffer;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getRhyDebugHideNux() {
        return this.rhyDebugHideNux;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public final List<GooglePayTokenInfoWrapper> component3() {
        return this.googlePayTokenList;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getHasSpentOnDebitCard() {
        return this.hasSpentOnDebitCard;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getNuxSeenTimestamp() {
        return this.nuxSeenTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHasClickedDirectDepositNux() {
        return this.hasClickedDirectDepositNux;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getHasTransferredIntoRhy() {
        return this.hasTransferredIntoRhy;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsActiveAccount() {
        return this.isActiveAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final RhyOverviewAccountType getSpendingAccountType() {
        return this.spendingAccountType;
    }

    public final RhyOverviewNuxDataState copy(PaymentCard paymentCard, Boolean hasDirectDepositRelationships, List<GooglePayTokenInfoWrapper> googlePayTokenList, Boolean hasSpentOnDebitCard, Long nuxSeenTimestamp, Boolean hasClickedDirectDepositNux, Boolean hasTransferredIntoRhy, Boolean isActiveAccount, RhyOverviewAccountType spendingAccountType, List<ProductMarketing.Feature> overridesList, CmSunsetIncentiveExperiment.Variant cmIncentiveGroup, BooleanPreference hasClickedDirectDepositNuxPref, boolean showDebugAddCardToGooglePayDialog, Instant rhyAccountCreatedAt, RhyReferralEligibility rhyReferralEligibility, RhyReferralAttribution rhyReferralAttribution, boolean hasViewedRefereeOffer, boolean rhyDebugHideNux) {
        Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
        return new RhyOverviewNuxDataState(paymentCard, hasDirectDepositRelationships, googlePayTokenList, hasSpentOnDebitCard, nuxSeenTimestamp, hasClickedDirectDepositNux, hasTransferredIntoRhy, isActiveAccount, spendingAccountType, overridesList, cmIncentiveGroup, hasClickedDirectDepositNuxPref, showDebugAddCardToGooglePayDialog, rhyAccountCreatedAt, rhyReferralEligibility, rhyReferralAttribution, hasViewedRefereeOffer, rhyDebugHideNux);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOverviewNuxDataState)) {
            return false;
        }
        RhyOverviewNuxDataState rhyOverviewNuxDataState = (RhyOverviewNuxDataState) other;
        return Intrinsics.areEqual(this.paymentCard, rhyOverviewNuxDataState.paymentCard) && Intrinsics.areEqual(this.hasDirectDepositRelationships, rhyOverviewNuxDataState.hasDirectDepositRelationships) && Intrinsics.areEqual(this.googlePayTokenList, rhyOverviewNuxDataState.googlePayTokenList) && Intrinsics.areEqual(this.hasSpentOnDebitCard, rhyOverviewNuxDataState.hasSpentOnDebitCard) && Intrinsics.areEqual(this.nuxSeenTimestamp, rhyOverviewNuxDataState.nuxSeenTimestamp) && Intrinsics.areEqual(this.hasClickedDirectDepositNux, rhyOverviewNuxDataState.hasClickedDirectDepositNux) && Intrinsics.areEqual(this.hasTransferredIntoRhy, rhyOverviewNuxDataState.hasTransferredIntoRhy) && Intrinsics.areEqual(this.isActiveAccount, rhyOverviewNuxDataState.isActiveAccount) && this.spendingAccountType == rhyOverviewNuxDataState.spendingAccountType && Intrinsics.areEqual(this.overridesList, rhyOverviewNuxDataState.overridesList) && this.cmIncentiveGroup == rhyOverviewNuxDataState.cmIncentiveGroup && Intrinsics.areEqual(this.hasClickedDirectDepositNuxPref, rhyOverviewNuxDataState.hasClickedDirectDepositNuxPref) && this.showDebugAddCardToGooglePayDialog == rhyOverviewNuxDataState.showDebugAddCardToGooglePayDialog && Intrinsics.areEqual(this.rhyAccountCreatedAt, rhyOverviewNuxDataState.rhyAccountCreatedAt) && Intrinsics.areEqual(this.rhyReferralEligibility, rhyOverviewNuxDataState.rhyReferralEligibility) && Intrinsics.areEqual(this.rhyReferralAttribution, rhyOverviewNuxDataState.rhyReferralAttribution) && this.hasViewedRefereeOffer == rhyOverviewNuxDataState.hasViewedRefereeOffer && this.rhyDebugHideNux == rhyOverviewNuxDataState.rhyDebugHideNux;
    }

    public int hashCode() {
        PaymentCard paymentCard = this.paymentCard;
        int iHashCode = (paymentCard == null ? 0 : paymentCard.hashCode()) * 31;
        Boolean bool = this.hasDirectDepositRelationships;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.hasSpentOnDebitCard;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.nuxSeenTimestamp;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.hasClickedDirectDepositNux;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasTransferredIntoRhy;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isActiveAccount;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        RhyOverviewAccountType rhyOverviewAccountType = this.spendingAccountType;
        int iHashCode9 = (iHashCode8 + (rhyOverviewAccountType == null ? 0 : rhyOverviewAccountType.hashCode())) * 31;
        List<ProductMarketing.Feature> list2 = this.overridesList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CmSunsetIncentiveExperiment.Variant variant = this.cmIncentiveGroup;
        int iHashCode11 = (((((iHashCode10 + (variant == null ? 0 : variant.hashCode())) * 31) + this.hasClickedDirectDepositNuxPref.hashCode()) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog)) * 31;
        Instant instant = this.rhyAccountCreatedAt;
        int iHashCode12 = (iHashCode11 + (instant == null ? 0 : instant.hashCode())) * 31;
        RhyReferralEligibility rhyReferralEligibility = this.rhyReferralEligibility;
        int iHashCode13 = (iHashCode12 + (rhyReferralEligibility == null ? 0 : rhyReferralEligibility.hashCode())) * 31;
        RhyReferralAttribution rhyReferralAttribution = this.rhyReferralAttribution;
        return ((((iHashCode13 + (rhyReferralAttribution != null ? rhyReferralAttribution.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasViewedRefereeOffer)) * 31) + Boolean.hashCode(this.rhyDebugHideNux);
    }

    public String toString() {
        return "RhyOverviewNuxDataState(paymentCard=" + this.paymentCard + ", hasDirectDepositRelationships=" + this.hasDirectDepositRelationships + ", googlePayTokenList=" + this.googlePayTokenList + ", hasSpentOnDebitCard=" + this.hasSpentOnDebitCard + ", nuxSeenTimestamp=" + this.nuxSeenTimestamp + ", hasClickedDirectDepositNux=" + this.hasClickedDirectDepositNux + ", hasTransferredIntoRhy=" + this.hasTransferredIntoRhy + ", isActiveAccount=" + this.isActiveAccount + ", spendingAccountType=" + this.spendingAccountType + ", overridesList=" + this.overridesList + ", cmIncentiveGroup=" + this.cmIncentiveGroup + ", hasClickedDirectDepositNuxPref=" + this.hasClickedDirectDepositNuxPref + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ", rhyAccountCreatedAt=" + this.rhyAccountCreatedAt + ", rhyReferralEligibility=" + this.rhyReferralEligibility + ", rhyReferralAttribution=" + this.rhyReferralAttribution + ", hasViewedRefereeOffer=" + this.hasViewedRefereeOffer + ", rhyDebugHideNux=" + this.rhyDebugHideNux + ")";
    }

    public RhyOverviewNuxDataState(PaymentCard paymentCard, Boolean bool, List<GooglePayTokenInfoWrapper> list, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, RhyOverviewAccountType rhyOverviewAccountType, List<ProductMarketing.Feature> list2, CmSunsetIncentiveExperiment.Variant variant, BooleanPreference hasClickedDirectDepositNuxPref, boolean z, Instant instant, RhyReferralEligibility rhyReferralEligibility, RhyReferralAttribution rhyReferralAttribution, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
        this.paymentCard = paymentCard;
        this.hasDirectDepositRelationships = bool;
        this.googlePayTokenList = list;
        this.hasSpentOnDebitCard = bool2;
        this.nuxSeenTimestamp = l;
        this.hasClickedDirectDepositNux = bool3;
        this.hasTransferredIntoRhy = bool4;
        this.isActiveAccount = bool5;
        this.spendingAccountType = rhyOverviewAccountType;
        this.overridesList = list2;
        this.cmIncentiveGroup = variant;
        this.hasClickedDirectDepositNuxPref = hasClickedDirectDepositNuxPref;
        this.showDebugAddCardToGooglePayDialog = z;
        this.rhyAccountCreatedAt = instant;
        this.rhyReferralEligibility = rhyReferralEligibility;
        this.rhyReferralAttribution = rhyReferralAttribution;
        this.hasViewedRefereeOffer = z2;
        this.rhyDebugHideNux = z3;
    }

    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    public final Boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public final List<GooglePayTokenInfoWrapper> getGooglePayTokenList() {
        return this.googlePayTokenList;
    }

    public final Boolean getHasSpentOnDebitCard() {
        return this.hasSpentOnDebitCard;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RhyOverviewNuxDataState(com.robinhood.models.p320db.mcduckling.PaymentCard r23, java.lang.Boolean r24, java.util.List r25, java.lang.Boolean r26, java.lang.Long r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Boolean r30, com.robinhood.librobinhood.data.RhyOverviewAccountType r31, java.util.List r32, com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment.Variant r33, com.robinhood.prefs.BooleanPreference r34, boolean r35, p479j$.time.Instant r36, com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility r37, com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution r38, boolean r39, boolean r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r23
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = r24
        L13:
            r1 = r0 & 4
            if (r1 == 0) goto L19
            r6 = r2
            goto L1b
        L19:
            r6 = r25
        L1b:
            r1 = r0 & 8
            if (r1 == 0) goto L21
            r7 = r2
            goto L23
        L21:
            r7 = r26
        L23:
            r1 = r0 & 16
            if (r1 == 0) goto L2f
            r8 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r8 = r1
            goto L31
        L2f:
            r8 = r27
        L31:
            r1 = r0 & 32
            if (r1 == 0) goto L37
            r9 = r2
            goto L39
        L37:
            r9 = r28
        L39:
            r1 = r0 & 64
            if (r1 == 0) goto L3f
            r10 = r2
            goto L41
        L3f:
            r10 = r29
        L41:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L47
            r11 = r2
            goto L49
        L47:
            r11 = r30
        L49:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4f
            r12 = r2
            goto L51
        L4f:
            r12 = r31
        L51:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L57
            r13 = r2
            goto L59
        L57:
            r13 = r32
        L59:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L5f
            r14 = r2
            goto L61
        L5f:
            r14 = r33
        L61:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r3 = 0
            if (r1 == 0) goto L69
            r16 = r3
            goto L6b
        L69:
            r16 = r35
        L6b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L72
            r17 = r2
            goto L74
        L72:
            r17 = r36
        L74:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            r18 = r2
            goto L7d
        L7b:
            r18 = r37
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L86
            r19 = r2
            goto L88
        L86:
            r19 = r38
        L88:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L90
            r20 = r3
            goto L92
        L90:
            r20 = r39
        L92:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9e
            r21 = r3
            r15 = r34
            r3 = r22
            goto La4
        L9e:
            r21 = r40
            r3 = r22
            r15 = r34
        La4:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxDataState.<init>(com.robinhood.models.db.mcduckling.PaymentCard, java.lang.Boolean, java.util.List, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.robinhood.librobinhood.data.RhyOverviewAccountType, java.util.List, com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment$Variant, com.robinhood.prefs.BooleanPreference, boolean, j$.time.Instant, com.robinhood.models.rhy.referral.db.RhyReferralEligibility, com.robinhood.models.rhy.referral.db.RhyReferralAttribution, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Long getNuxSeenTimestamp() {
        return this.nuxSeenTimestamp;
    }

    public final Boolean getHasClickedDirectDepositNux() {
        return this.hasClickedDirectDepositNux;
    }

    public final Boolean getHasTransferredIntoRhy() {
        return this.hasTransferredIntoRhy;
    }

    public final Boolean isActiveAccount() {
        return this.isActiveAccount;
    }

    public final RhyOverviewAccountType getSpendingAccountType() {
        return this.spendingAccountType;
    }

    public final List<ProductMarketing.Feature> getOverridesList() {
        return this.overridesList;
    }

    public final CmSunsetIncentiveExperiment.Variant getCmIncentiveGroup() {
        return this.cmIncentiveGroup;
    }

    public final BooleanPreference getHasClickedDirectDepositNuxPref() {
        return this.hasClickedDirectDepositNuxPref;
    }

    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    public final Instant getRhyAccountCreatedAt() {
        return this.rhyAccountCreatedAt;
    }

    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    public final RhyReferralAttribution getRhyReferralAttribution() {
        return this.rhyReferralAttribution;
    }

    public final boolean getHasViewedRefereeOffer() {
        return this.hasViewedRefereeOffer;
    }

    public final boolean getRhyDebugHideNux() {
        return this.rhyDebugHideNux;
    }
}
