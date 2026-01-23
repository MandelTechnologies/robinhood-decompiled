package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbz {
    public static final Deferred zza(Task task) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        task.addOnCompleteListener(zzbx.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                CompletableDeferred completableDeferred = completableDeferredCompletableDeferred$default;
                Exception exception = task2.getException();
                if (exception != null) {
                    completableDeferred.completeExceptionally(exception);
                } else if (task2.isCanceled()) {
                    Job.DefaultImpls.cancel$default(completableDeferred, null, 1, null);
                } else {
                    completableDeferred.complete(task2.getResult());
                }
            }
        });
        return new zzby(completableDeferredCompletableDeferred$default);
    }
}
