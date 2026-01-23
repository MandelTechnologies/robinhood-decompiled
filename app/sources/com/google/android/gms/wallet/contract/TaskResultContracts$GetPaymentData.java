package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.wallet.PaymentData;

/* compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* loaded from: classes27.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<PaymentData> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public PaymentData parseResult(int i, Intent intent) {
        if (intent != null) {
            return PaymentData.getFromIntent(intent);
        }
        return null;
    }
}
