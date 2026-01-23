package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: PaymentPreferenceStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceViewState;", "<init>", "()V", "reduce", "dataState", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PaymentPreferenceStateProvider implements StateProvider<PaymentPreferenceDataState, PaymentPreferenceViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PaymentPreferenceViewState reduce(PaymentPreferenceDataState dataState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean loading = dataState.getLoading();
        RemoteMicrogramApplication accountSelectorMicrogramSource = dataState.getAccountSelectorMicrogramSource();
        boolean pageLoading = dataState.getPageLoading();
        if (dataState.isBackupYGExperiment()) {
            int priority = dataState.getPriority();
            if (priority == 1) {
                i = C22205R.string.payment_preference_header_primary;
            } else if (priority == 2) {
                i = C22205R.string.payment_preference_header_backup;
            } else {
                i = C22205R.string.payment_preference_header;
            }
        } else {
            i = C22205R.string.payment_preference_header;
        }
        if (dataState.isBackupYGExperiment() && dataState.getPriority() == 1) {
            i2 = C11048R.string.general_label_continue;
        } else {
            i2 = C11048R.string.general_label_done;
        }
        return new PaymentPreferenceViewState(loading, accountSelectorMicrogramSource, pageLoading, i, i2);
    }
}
