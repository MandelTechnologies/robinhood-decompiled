package com.withpersona.sdk2.inquiry.launchers;

import androidx.core.app.ActivityOptionsCompat;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReusableActivityResultLauncher.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "<init>", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)V", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "currentLauncher", "launch", "", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "register", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ReusableActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    private final ActivityResultCallback<O> callback;
    private final ActivityResultContract<I, O> contract;
    private ActivityResultLauncher<I> currentLauncher;

    @Override // androidx.view.result.ActivityResultLauncher
    public ActivityResultContract<I, O> getContract() {
        return this.contract;
    }

    public ReusableActivityResultLauncher(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.contract = contract;
        this.callback = callback;
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public void launch(I input, ActivityOptionsCompat options) {
        ActivityResultLauncher<I> activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(input, options);
        }
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public void unregister() {
        ActivityResultLauncher<I> activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
    }

    public final void register(ActivityResultCaller activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.currentLauncher = activityResultCaller.registerForActivityResult(getContract(), this.callback);
    }
}
