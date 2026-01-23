package com.robinhood.android.rhy.referral.fund.confirmation;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralFundConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationViewState;", "<init>", "()V", "reduce", "dataState", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralFundConfirmationStateProvider implements StateProvider<RhyReferralFundConfirmationDataState, RhyReferralFundConfirmationViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyReferralFundConfirmationViewState reduce(RhyReferralFundConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<GooglePayTokenInfoWrapper> googlePayTokenList = dataState.getGooglePayTokenList();
        boolean z = false;
        if (googlePayTokenList != null) {
            List<GooglePayTokenInfoWrapper> list = googlePayTokenList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : list) {
                    if (googlePayTokenInfoWrapper.getTokenState() == 5 || googlePayTokenInfoWrapper.getTokenState() == 2) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return new RhyReferralFundConfirmationViewState(z, dataState.getShowDebugAddCardToGooglePayDialog());
    }
}
