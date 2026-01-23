package com.robinhood.android.util.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationCancelBroadcastReceiver.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver;", "Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiver;", "<init>", "()V", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "getNotificationManager", "()Lcom/robinhood/android/common/notification/NotificationManager;", "setNotificationManager", "(Lcom/robinhood/android/common/notification/NotificationManager;)V", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Lcom/robinhood/utils/RhProcessLifecycleOwner;", "setRhProcessLifecycleOwner", "(Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class NotificationCancelBroadcastReceiver extends HammerBroadcastReceiver {
    private static final String ACTION_DISMISS = "com.robinhood.android.action.ACTION_DISMISS";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @RootCoroutineScope
    public CoroutineScope coroutineScope;
    public NotificationManager notificationManager;
    public RhProcessLifecycleOwner rhProcessLifecycleOwner;

    public final NotificationManager getNotificationManager() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            return notificationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    public final void setNotificationManager(NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "<set-?>");
        this.notificationManager = notificationManager;
    }

    public final RhProcessLifecycleOwner getRhProcessLifecycleOwner() {
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner;
        if (rhProcessLifecycleOwner != null) {
            return rhProcessLifecycleOwner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
        return null;
    }

    public final void setRhProcessLifecycleOwner(RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "<set-?>");
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    @Override // com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        boolean zAreEqual = Intrinsics.areEqual(intent.getAction(), ACTION_DISMISS);
        if (!zAreEqual) {
            getRhProcessLifecycleOwner().onStart();
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C313581(context, intent, null), 3, null);
        if (zAreEqual || Build.VERSION.SDK_INT >= 31) {
            return;
        }
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* compiled from: NotificationCancelBroadcastReceiver.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.notification.NotificationCancelBroadcastReceiver$onReceive$1", m3645f = "NotificationCancelBroadcastReceiver.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.notification.NotificationCancelBroadcastReceiver$onReceive$1 */
    static final class C313581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313581(Context context, Intent intent, Continuation<? super C313581> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCancelBroadcastReceiver.this.new C313581(this.$context, this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NotificationManager notificationManager = NotificationCancelBroadcastReceiver.this.getNotificationManager();
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (notificationManager.onNotificationDismissed(context, intent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NotificationCancelBroadcastReceiver.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/util/notification/NotificationCancelBroadcastReceiver$Companion;", "", "<init>", "()V", "ACTION_DISMISS", "", "getDismissIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getDismissIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) NotificationCancelBroadcastReceiver.class);
            intent.setAction(NotificationCancelBroadcastReceiver.ACTION_DISMISS);
            return intent;
        }
    }
}
