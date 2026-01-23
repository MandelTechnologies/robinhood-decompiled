package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.RhyOverviewNuxViewState;
import com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.RhyOverviewAccountType;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.api.RhyReferralVariant;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: RhyOverviewNuxStateProvider.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJG\u0010\u0015\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\tH\u0007¢\u0006\u0004\b#\u0010$Jk\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000b\u0010-J)\u00103\u001a\u0002022\b\u0010/\u001a\u0004\u0018\u00010.2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\tH\u0007¢\u0006\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "<init>", "()V", "dataState", "reduce", "(Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;)Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "nuxItems", "", "isActiveAccount", "Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "spendingAccountType", "", "nuxSeenTimestamp", "j$/time/Instant", "rhyAccountCreatedAt", "rhyDebugHideNux", "isVisible", "(Ljava/util/List;ZLcom/robinhood/librobinhood/data/RhyOverviewAccountType;Ljava/lang/Long;Lj$/time/Instant;Z)Z", "hasPassedDateForOptionalActions", "(Ljava/lang/Long;Lj$/time/Instant;)Z", "daysSinceDisplayedOnboarding", "(Ljava/lang/Long;)J", "daysSinceRhyAccountCreated", "(Lj$/time/Instant;)J", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "paymentCard", "isCardActivated", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)Z", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "googlePayTokenList", "isGooglePayActionVisible", "(ZLcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/util/List;)Z", "hasTransferredIntoRhy", "hasSpentOnDebitCard", "hasClickedDirectDepositNux", "hasDirectDepositRelationships", "eligibleForRhyReferral", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "refereeAttribution", "hasViewedRefereeOffer", "(Ljava/lang/Long;Lcom/robinhood/models/db/mcduckling/PaymentCard;ZZZZZZLcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;Z)Ljava/util/List;", "Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "cmIncentiveGroup", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "overridesList", "Lcom/robinhood/utils/resource/StringResource;", "nuxTitle", "(Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;Ljava/util/List;)Lcom/robinhood/utils/resource/StringResource;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyOverviewNuxStateProvider implements StateProvider<RhyOverviewNuxDataState, RhyOverviewNuxViewState> {
    public static final int $stable = 0;

    /* compiled from: RhyOverviewNuxStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CmSunsetIncentiveExperiment.Variant.values().length];
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.HIGH_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.DIRECT_DEPOSITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CmSunsetIncentiveExperiment.Variant.RECENT_TRANSACTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RhyOverviewNuxViewState reduce(RhyOverviewNuxDataState dataState) {
        PaymentCard paymentCard;
        Instant rhyAccountCreatedAt;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Boolean hasTransferredIntoRhy = dataState.getHasTransferredIntoRhy();
        if (hasTransferredIntoRhy == null) {
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        boolean zBooleanValue = hasTransferredIntoRhy.booleanValue();
        Boolean hasSpentOnDebitCard = dataState.getHasSpentOnDebitCard();
        if (hasSpentOnDebitCard == null) {
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        boolean zBooleanValue2 = hasSpentOnDebitCard.booleanValue();
        Boolean hasClickedDirectDepositNux = dataState.getHasClickedDirectDepositNux();
        if (hasClickedDirectDepositNux == null) {
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        boolean zBooleanValue3 = hasClickedDirectDepositNux.booleanValue();
        Boolean hasDirectDepositRelationships = dataState.getHasDirectDepositRelationships();
        if (hasDirectDepositRelationships == null) {
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        boolean zBooleanValue4 = hasDirectDepositRelationships.booleanValue();
        Boolean boolIsActiveAccount = dataState.isActiveAccount();
        if (boolIsActiveAccount == null) {
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        boolean zBooleanValue5 = boolIsActiveAccount.booleanValue();
        RhyOverviewAccountType spendingAccountType = dataState.getSpendingAccountType();
        if (spendingAccountType != null && (paymentCard = dataState.getPaymentCard()) != null && (rhyAccountCreatedAt = dataState.getRhyAccountCreatedAt()) != null) {
            RhyReferralEligibility rhyReferralEligibility = dataState.getRhyReferralEligibility();
            List<NuxItem> listNuxItems = nuxItems(dataState.getNuxSeenTimestamp(), paymentCard, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, isGooglePayActionVisible(zBooleanValue5, paymentCard, dataState.getGooglePayTokenList()), (rhyReferralEligibility == null || rhyReferralEligibility.getRhyReferralVariant() == RhyReferralVariant.UNKNOWN) ? false : true, dataState.getRhyReferralAttribution(), dataState.getHasViewedRefereeOffer());
            boolean zIsVisible = isVisible(listNuxItems, zBooleanValue5, spendingAccountType, dataState.getNuxSeenTimestamp(), rhyAccountCreatedAt, dataState.getRhyDebugHideNux());
            StringResource stringResourceNuxTitle = nuxTitle(dataState.getCmIncentiveGroup(), dataState.getOverridesList());
            if (zIsVisible) {
                return new RhyOverviewNuxViewState.Loaded(stringResourceNuxTitle, extensions2.toImmutableList(listNuxItems), paymentCard.getId(), zBooleanValue4, dataState.getHasClickedDirectDepositNuxPref(), dataState.getShowDebugAddCardToGooglePayDialog());
            }
            return RhyOverviewNuxViewState.Hidden.INSTANCE;
        }
        return RhyOverviewNuxViewState.Hidden.INSTANCE;
    }

    public final boolean isVisible(List<? extends NuxItem> nuxItems, boolean isActiveAccount, RhyOverviewAccountType spendingAccountType, Long nuxSeenTimestamp, Instant rhyAccountCreatedAt, boolean rhyDebugHideNux) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(nuxItems, "nuxItems");
        Intrinsics.checkNotNullParameter(spendingAccountType, "spendingAccountType");
        Intrinsics.checkNotNullParameter(rhyAccountCreatedAt, "rhyAccountCreatedAt");
        if (rhyDebugHideNux) {
            return false;
        }
        List<? extends NuxItem> list = nuxItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((NuxItem) obj).getIsRequired()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            z = true;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((NuxItem) it.next()).getIsComplete()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            z2 = true;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((NuxItem) it2.next()).getIsComplete()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (isActiveAccount && spendingAccountType == RhyOverviewAccountType.RHY && !z2) {
            return (z && hasPassedDateForOptionalActions(nuxSeenTimestamp, rhyAccountCreatedAt)) ? false : true;
        }
        return false;
    }

    public final boolean hasPassedDateForOptionalActions(Long nuxSeenTimestamp, Instant rhyAccountCreatedAt) {
        Intrinsics.checkNotNullParameter(rhyAccountCreatedAt, "rhyAccountCreatedAt");
        return daysSinceDisplayedOnboarding(nuxSeenTimestamp) > 2 || daysSinceRhyAccountCreated(rhyAccountCreatedAt) >= 90;
    }

    public final long daysSinceDisplayedOnboarding(Long nuxSeenTimestamp) {
        Duration durationOfSeconds;
        if (nuxSeenTimestamp == null) {
            durationOfSeconds = Duration.ZERO;
        } else {
            durationOfSeconds = Duration.ofSeconds(Instant.now().getEpochSecond() - nuxSeenTimestamp.longValue());
        }
        return durationOfSeconds.toDays();
    }

    public final long daysSinceRhyAccountCreated(Instant rhyAccountCreatedAt) {
        Intrinsics.checkNotNullParameter(rhyAccountCreatedAt, "rhyAccountCreatedAt");
        return Duration.ofSeconds(Instant.now().getEpochSecond() - rhyAccountCreatedAt.getEpochSecond()).toDays();
    }

    public final boolean isCardActivated(PaymentCard paymentCard) {
        return (paymentCard == null || paymentCard.getCanActivate()) ? false : true;
    }

    public final boolean isGooglePayActionVisible(boolean isActiveAccount, PaymentCard paymentCard, List<GooglePayTokenInfoWrapper> googlePayTokenList) {
        if (!isActiveAccount) {
            return false;
        }
        if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE || googlePayTokenList == null) {
            return false;
        }
        List<GooglePayTokenInfoWrapper> list = googlePayTokenList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : list) {
            if (googlePayTokenInfoWrapper.getTokenState() == 5 || googlePayTokenInfoWrapper.getTokenState() == 2) {
                return false;
            }
        }
        return true;
    }

    public final List<NuxItem> nuxItems(Long nuxSeenTimestamp, PaymentCard paymentCard, boolean hasTransferredIntoRhy, boolean hasSpentOnDebitCard, boolean hasClickedDirectDepositNux, boolean hasDirectDepositRelationships, boolean isGooglePayActionVisible, boolean eligibleForRhyReferral, RhyReferralAttribution refereeAttribution, boolean hasViewedRefereeOffer) {
        long jDaysSinceDisplayedOnboarding = daysSinceDisplayedOnboarding(nuxSeenTimestamp);
        NuxItem.FundAccount fundAccount = new NuxItem.FundAccount(hasTransferredIntoRhy);
        NuxItem.ActivateCard activateCard = null;
        NuxItem.ViewReferralOffer viewReferralOffer = (!eligibleForRhyReferral || refereeAttribution == null) ? null : new NuxItem.ViewReferralOffer(refereeAttribution, hasViewedRefereeOffer);
        NuxItem.AddToWallet addToWallet = (paymentCard == null || !paymentCard.isVirtual()) ? null : new NuxItem.AddToWallet(!isGooglePayActionVisible);
        NuxItem.SpendWithCard spendWithCard = new NuxItem.SpendWithCard(hasSpentOnDebitCard);
        NuxItem.ReviewAccount reviewAccount = new NuxItem.ReviewAccount(hasClickedDirectDepositNux || hasDirectDepositRelationships, Boolean.valueOf(hasDirectDepositRelationships));
        if (paymentCard != null && !paymentCard.isVirtual() && jDaysSinceDisplayedOnboarding < 60) {
            activateCard = new NuxItem.ActivateCard(isCardActivated(paymentCard));
        }
        return CollectionsKt.listOfNotNull((Object[]) new NuxItem[]{fundAccount, viewReferralOffer, addToWallet, spendWithCard, reviewAccount, activateCard});
    }

    public final StringResource nuxTitle(CmSunsetIncentiveExperiment.Variant cmIncentiveGroup, List<ProductMarketing.Feature> overridesList) {
        String str;
        Object next;
        int i = cmIncentiveGroup == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cmIncentiveGroup.ordinal()];
        if (i == -1) {
            return StringResource.INSTANCE.invoke("");
        }
        String title = null;
        if (i == 1) {
            str = "hvc-nux-header";
        } else if (i == 2) {
            str = "dd-nux-header";
        } else {
            str = i != 3 ? null : "rt-nux-header";
        }
        if (str == null) {
            return StringResource.INSTANCE.invoke(C10285R.string.rhy_onboarding_title, new Object[0]);
        }
        if (overridesList != null) {
            Iterator<T> it = overridesList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ProductMarketing.Feature) next).getIdentifier(), str)) {
                    break;
                }
            }
            ProductMarketing.Feature feature = (ProductMarketing.Feature) next;
            if (feature != null) {
                title = feature.getTitle();
            }
        }
        if (title == null) {
            return StringResource.INSTANCE.invoke(C10285R.string.rhy_onboarding_title, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(title);
    }
}
