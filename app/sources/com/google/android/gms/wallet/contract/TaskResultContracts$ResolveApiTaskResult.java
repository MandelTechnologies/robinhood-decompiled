package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContract;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* loaded from: classes27.dex */
public abstract class TaskResultContracts$ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {
    Status zza;
    private PendingIntent zzb;

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Task<I> task) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest.Builder(this.zzb).build());
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public ActivityResultContract.SynchronousResult<O> getSynchronousResult(Context context, Task<I> task) {
        if (!task.isComplete()) {
            throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            this.zza = ((ApiException) exception).getStatus();
            if (exception instanceof ResolvableApiException) {
                this.zzb = ((ResolvableApiException) exception).getResolution();
            }
        }
        if (this.zzb == null) {
            return new ActivityResultContract.SynchronousResult<>(outputFromTask(task));
        }
        return null;
    }

    protected abstract O outputFromTask(Task<I> task);
}
