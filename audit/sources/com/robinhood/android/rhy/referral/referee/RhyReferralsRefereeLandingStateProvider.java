package com.robinhood.android.rhy.referral.referee;

import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralsRefereeLandingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J2\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "<init>", "()V", "reduce", "dataState", "canShowGooglePayAction", "", "isActiveAccount", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "alwaysShowAddToGPay", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralsRefereeLandingStateProvider implements StateProvider<RhyReferralsRefereeLandingDataState, RhyReferralsRefereeLandingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyReferralsRefereeLandingViewState reduce(RhyReferralsRefereeLandingDataState dataState) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null) {
            return new RhyReferralsRefereeLandingViewState.Error(dataState.getError());
        }
        RefereeLanding refereeLanding = dataState.getRefereeLanding();
        if (refereeLanding == null) {
            return RhyReferralsRefereeLandingViewState.Loading.INSTANCE;
        }
        Boolean boolIsActiveAccount = dataState.isActiveAccount();
        if (boolIsActiveAccount == null) {
            return RhyReferralsRefereeLandingViewState.Loading.INSTANCE;
        }
        boolean zBooleanValue = boolIsActiveAccount.booleanValue();
        if (refereeLanding.getRewardConditionFulfilled()) {
            if (canShowGooglePayAction(zBooleanValue, dataState.getPaymentCard(), dataState.getGooglePayTokenList(), dataState.getAlwaysShowAddToGPay())) {
                tuples2M3642to = Tuples4.m3642to(RhyReferralsRefereeLandingViewState.Loaded.CtaType.ADD_TO_GOOGLE_PAY, RhyReferralsRefereeLandingViewState.Loaded.CtaType.VIEW_CARD_NUMBER);
            } else {
                tuples2M3642to = Tuples4.m3642to(RhyReferralsRefereeLandingViewState.Loaded.CtaType.VIEW_CARD_NUMBER, null);
            }
        } else {
            tuples2M3642to = Tuples4.m3642to(RhyReferralsRefereeLandingViewState.Loaded.CtaType.FUND_MY_ACCOUNT, null);
        }
        return new RhyReferralsRefereeLandingViewState.Loaded(refereeLanding, (RhyReferralsRefereeLandingViewState.Loaded.CtaType) tuples2M3642to.component1(), (RhyReferralsRefereeLandingViewState.Loaded.CtaType) tuples2M3642to.component2(), dataState.getShowDebugAddCardToGooglePayDialog());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canShowGooglePayAction(boolean isActiveAccount, PaymentCard paymentCard, List<GooglePayTokenInfoWrapper> googlePayTokenList, boolean alwaysShowAddToGPay) {
        if (isActiveAccount) {
            if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE) {
            }
        } else if (!alwaysShowAddToGPay) {
            return false;
        }
        if (googlePayTokenList == null) {
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
}
