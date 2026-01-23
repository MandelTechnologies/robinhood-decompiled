package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* loaded from: classes27.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, ApiTaskResult<T>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    public ApiTaskResult<T> outputFromTask(Task<T> task) {
        if (task.isSuccessful()) {
            return new ApiTaskResult<>(task.getResult(), Status.RESULT_SUCCESS);
        }
        if (task.isCanceled()) {
            return new ApiTaskResult<>(new Status(16, "The task has been canceled."));
        }
        Status status = this.zza;
        return status != null ? new ApiTaskResult<>(status) : new ApiTaskResult<>(Status.RESULT_INTERNAL_ERROR);
    }

    protected abstract T taskResultFromIntent(Intent intent);

    @Override // androidx.view.result.contract.ActivityResultContract
    public ApiTaskResult<T> parseResult(int i, Intent intent) {
        if (i != -1) {
            return i != 0 ? new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR) : new ApiTaskResult<>(null, Status.RESULT_CANCELED);
        }
        T tTaskResultFromIntent = intent != null ? taskResultFromIntent(intent) : null;
        return tTaskResultFromIntent != null ? new ApiTaskResult<>(tTaskResultFromIntent, Status.RESULT_SUCCESS) : new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR);
    }
}
