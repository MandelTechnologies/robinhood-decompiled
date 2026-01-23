package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* loaded from: classes27.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<PaymentData> {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    public PaymentData taskResultFromIntent(Intent intent) {
        return PaymentData.getFromIntent(intent);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.view.result.contract.ActivityResultContract
    public ApiTaskResult<PaymentData> parseResult(int i, Intent intent) {
        if (i != 1) {
            return super.parseResult(i, intent);
        }
        Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
        if (statusFromIntent == null) {
            statusFromIntent = Status.RESULT_INTERNAL_ERROR;
        }
        return new ApiTaskResult<>(statusFromIntent);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.view.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i, Intent intent) {
        return parseResult(i, intent);
    }
}
