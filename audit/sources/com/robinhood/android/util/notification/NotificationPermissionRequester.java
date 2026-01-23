package com.robinhood.android.util.notification;

import android.annotation.SuppressLint;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Yield;

/* compiled from: NotificationPermissionRequester.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/util/notification/NotificationPermissionRequester;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Ldagger/Lazy;)V", "onMainTabActivityCreated", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "checkPermission", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class NotificationPermissionRequester implements MainTabActivityListener {
    private final Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityResumed(BaseActivity baseActivity) {
        MainTabActivityListener.DefaultImpls.onMainTabActivityResumed(this, baseActivity);
    }

    public NotificationPermissionRequester(Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    /* compiled from: NotificationPermissionRequester.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.NotificationPermissionRequester$onMainTabActivityCreated$1", m3645f = "NotificationPermissionRequester.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.NotificationPermissionRequester$onMainTabActivityCreated$1 */
    static final class C313591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $activity;
        final /* synthetic */ ActivityResultLauncher<String> $launcher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313591(BaseActivity baseActivity, ActivityResultLauncher<String> activityResultLauncher, Continuation<? super C313591> continuation) {
            super(2, continuation);
            this.$activity = baseActivity;
            this.$launcher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationPermissionRequester.this.new C313591(this.$activity, this.$launcher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Yield.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            NotificationPermissionRequester.this.checkPermission(this.$activity, this.$launcher);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityCreated(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C313591(activity, activity.registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: com.robinhood.android.util.notification.NotificationPermissionRequester$onMainTabActivityCreated$launcher$1
            public final void onActivityResult(boolean z) {
            }

            @Override // androidx.view.result.ActivityResultCallback
            public /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
                onActivityResult(((Boolean) obj).booleanValue());
            }
        }), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public final void checkPermission(BaseActivity activity, ActivityResultLauncher<String> launcher) {
        if (ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0 || ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.POST_NOTIFICATIONS")) {
            return;
        }
        this.rhProcessLifecycleOwner.get().useExtendedTimeout();
        launcher.launch("android.permission.POST_NOTIFICATIONS");
    }
}
