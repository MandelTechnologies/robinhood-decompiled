package com.robinhood.android.acatsin;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.p300ui.CapabilityStatus;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/AcatsInDataState;", "Lcom/robinhood/android/acatsin/AcatsInViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInStateProvider implements StateProvider<AcatsInDataState, AcatsInViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInViewState reduce(AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String source = dataState.getSource();
        boolean skipIntro = dataState.getSkipIntro();
        boolean introShown = dataState.getIntroShown();
        Either<ApiBrokerage, String> brokerageOrDtcNumber = dataState.getBrokerageOrDtcNumber();
        AvailableAccount selectedRhsAccount = dataState.getSelectedRhsAccount();
        if (selectedRhsAccount == null) {
            selectedRhsAccount = dataState.getDefaultRhsAccount();
        }
        return new AcatsInViewState(source, skipIntro, introShown, brokerageOrDtcNumber, selectedRhsAccount, dataState.getContraAccountNumber(), dataState.getAccountNames(), dataState.getAccountContents(), dataState.getSupportedContentTypes(), dataState.getUnsupportedContentTypes(), dataState.getBuildPartialBannerContentfulId(), dataState.getAssets(), dataState.getSubmittedAcatsTransferId(), dataState.getMarginCapabilityStatus() == CapabilityStatus.ENABLED, dataState.getAcatsBonusPromoInfo(), dataState.getSelectedAccountType(), dataState.getSelectedAccountType().isRetirement());
    }
}
