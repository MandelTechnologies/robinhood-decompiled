package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import kotlin.Metadata;

/* compiled from: AdvisoryPostAgreementsScreen.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;", "", "onCloseClicked", "", "onRefreshClicked", "onSwipeToSubmit", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "config", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "onCelebrationCtaClicked", "destination", "Lcom/robinhood/android/navigation/keys/IntentKey;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenCallbacks, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryPostAgreementsScreen {
    void onCelebrationCtaClicked(IntentKey destination);

    void onCloseClicked();

    void onRefreshClicked();

    void onSwipeToSubmit(TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer config);
}
