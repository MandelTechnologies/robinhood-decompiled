package com.robinhood.android.settings.p254ui.notification.thread;

import com.robinhood.android.settings.p254ui.notification.thread.ThreadNotificationSettings4Duxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore;
import com.robinhood.udf.UiEvent;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ThreadNotificationSettings4Duxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4Duxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4ViewState;", "threadNotificationSettingStore", "Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;)V", "threadSettingId", "", "getThreadSettingId", "()Ljava/lang/String;", "setThreadSettingId", "(Ljava/lang/String;)V", "updateNotificationSetting", "", "isMuted", "", "requireThreadSettingId", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ThreadNotificationSettings4Duxo extends OldBaseDuxo<ThreadNotificationSettings4ViewState> {
    public static final int $stable = 8;
    private final ThreadNotificationSettingsStore threadNotificationSettingStore;
    private String threadSettingId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThreadNotificationSettings4Duxo(ThreadNotificationSettingsStore threadNotificationSettingStore) {
        super(new ThreadNotificationSettings4ViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(threadNotificationSettingStore, "threadNotificationSettingStore");
        this.threadNotificationSettingStore = threadNotificationSettingStore;
    }

    public final String getThreadSettingId() {
        return this.threadSettingId;
    }

    public final void setThreadSettingId(String str) {
        this.threadSettingId = str;
    }

    /* compiled from: ThreadNotificationSettings4Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.thread.ThreadNotificationSettings4Duxo$updateNotificationSetting$1", m3645f = "ThreadNotificationSettings4Duxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.thread.ThreadNotificationSettings4Duxo$updateNotificationSetting$1 */
    static final class C284251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isMuted;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C284251(boolean z, Continuation<? super C284251> continuation) {
            super(2, continuation);
            this.$isMuted = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C284251 c284251 = ThreadNotificationSettings4Duxo.this.new C284251(this.$isMuted, continuation);
            c284251.L$0 = obj;
            return c284251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C284251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThreadNotificationSettings4Duxo threadNotificationSettings4Duxo = ThreadNotificationSettings4Duxo.this;
                    boolean z = this.$isMuted;
                    Result.Companion companion = Result.INSTANCE;
                    ThreadNotificationSettingsStore threadNotificationSettingsStore = threadNotificationSettings4Duxo.threadNotificationSettingStore;
                    String strRequireThreadSettingId = threadNotificationSettings4Duxo.requireThreadSettingId();
                    this.label = 1;
                    if (threadNotificationSettingsStore.updateThreadNotificationStatus(strRequireThreadSettingId, z, this) == coroutine_suspended) {
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
            ThreadNotificationSettings4Duxo threadNotificationSettings4Duxo2 = ThreadNotificationSettings4Duxo.this;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                threadNotificationSettings4Duxo2.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.thread.ThreadNotificationSettings4Duxo$updateNotificationSetting$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ThreadNotificationSettings4Duxo.C284251.invokeSuspend$lambda$2$lambda$1(thM28553exceptionOrNullimpl, (ThreadNotificationSettings4ViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThreadNotificationSettings4ViewState invokeSuspend$lambda$2$lambda$1(Throwable th, ThreadNotificationSettings4ViewState threadNotificationSettings4ViewState) {
            return threadNotificationSettings4ViewState.copy(new UiEvent<>(th));
        }
    }

    public final void updateNotificationSetting(boolean isMuted) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C284251(isMuted, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String requireThreadSettingId() {
        String str = this.threadSettingId;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
