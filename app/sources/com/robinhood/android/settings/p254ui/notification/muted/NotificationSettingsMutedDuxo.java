package com.robinhood.android.settings.p254ui.notification.muted;

import android.content.res.Resources;
import com.robinhood.android.settings.p254ui.notification.muted.NotificationSettingsMutedDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationSettingsMutedDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedViewState;", "threadNotificationSettingStore", "Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;Landroid/content/res/Resources;)V", "onCreate", "", "onResume", "updateFilter", "filter", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsMutedDuxo extends OldBaseDuxo<NotificationSettingsMutedViewState> {
    public static final int $stable = 8;
    private final ThreadNotificationSettingsStore threadNotificationSettingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettingsMutedDuxo(ThreadNotificationSettingsStore threadNotificationSettingStore, Resources resources) {
        super(new NotificationSettingsMutedViewState(resources, false, null, null, null, 30, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(threadNotificationSettingStore, "threadNotificationSettingStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.threadNotificationSettingStore = threadNotificationSettingStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C284181(null));
    }

    /* compiled from: NotificationSettingsMutedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$onCreate$1", m3645f = "NotificationSettingsMutedDuxo.kt", m3646l = {23}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$onCreate$1 */
    static final class C284181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C284181(Continuation<? super C284181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C284181 c284181 = NotificationSettingsMutedDuxo.this.new C284181(continuation);
            c284181.L$0 = obj;
            return c284181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C284181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationSettingsMutedDuxo notificationSettingsMutedDuxo = NotificationSettingsMutedDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    ThreadNotificationSettingsStore threadNotificationSettingsStore = notificationSettingsMutedDuxo.threadNotificationSettingStore;
                    this.label = 1;
                    if (threadNotificationSettingsStore.refreshMutedThreadSettingsItems(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            NotificationSettingsMutedDuxo notificationSettingsMutedDuxo2 = NotificationSettingsMutedDuxo.this;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                notificationSettingsMutedDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$onCreate$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return NotificationSettingsMutedDuxo.C284181.invokeSuspend$lambda$2$lambda$1(thM28553exceptionOrNullimpl, (NotificationSettingsMutedViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NotificationSettingsMutedViewState invokeSuspend$lambda$2$lambda$1(Throwable th, NotificationSettingsMutedViewState notificationSettingsMutedViewState) {
            return NotificationSettingsMutedViewState.copy$default(notificationSettingsMutedViewState, null, false, null, null, new UiEvent(th), 15, null);
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.threadNotificationSettingStore.streamMutedThreadSettings(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettingsMutedDuxo.onResume$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(NotificationSettingsMutedDuxo notificationSettingsMutedDuxo, final List threadSettingsItems) {
        Intrinsics.checkNotNullParameter(threadSettingsItems, "threadSettingsItems");
        notificationSettingsMutedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettingsMutedDuxo.onResume$lambda$1$lambda$0(threadSettingsItems, (NotificationSettingsMutedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettingsMutedViewState onResume$lambda$1$lambda$0(List list, NotificationSettingsMutedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NotificationSettingsMutedViewState.copy$default(applyMutation, null, true, list, null, null, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettingsMutedViewState updateFilter$lambda$3(String str, NotificationSettingsMutedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (str.length() == 0) {
            str = null;
        }
        return NotificationSettingsMutedViewState.copy$default(applyMutation, null, false, null, str, null, 23, null);
    }

    public final void updateFilter(final String filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettingsMutedDuxo.updateFilter$lambda$3(filter, (NotificationSettingsMutedViewState) obj);
            }
        });
    }
}
