package com.robinhood.trader.singpass;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.SingpassResultStore;
import com.robinhood.models.api.identi.ApiSingpassResult;
import com.robinhood.trader.singpass.SingpassWebviewDuxo2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SingpassWebviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/trader/singpass/SingpassWebviewDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/trader/singpass/SingpassWebviewViewState;", "Lcom/robinhood/trader/singpass/SingpassWebviewEvent;", "singpassResultStore", "Lcom/robinhood/librobinhood/data/store/identi/SingpassResultStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/SingpassResultStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "checkInitialSingpassResult", "", "pollSingpassResult", "feature-singpass_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SingpassWebviewDuxo extends BaseDuxo5<SingpassWebviewDuxo3, SingpassWebviewDuxo2> {
    public static final int $stable = 8;
    private final SingpassResultStore singpassResultStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingpassWebviewDuxo(SingpassResultStore singpassResultStore, DuxoBundle duxoBundle) {
        super(SingpassWebviewDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(singpassResultStore, "singpassResultStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.singpassResultStore = singpassResultStore;
    }

    /* compiled from: SingpassWebviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.singpass.SingpassWebviewDuxo$checkInitialSingpassResult$1", m3645f = "SingpassWebviewDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.singpass.SingpassWebviewDuxo$checkInitialSingpassResult$1 */
    static final class C417581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C417581(Continuation<? super C417581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingpassWebviewDuxo.this.new C417581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C417581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SingpassResultStore singpassResultStore = SingpassWebviewDuxo.this.singpassResultStore;
                this.label = 1;
                obj = singpassResultStore.postSingpassResult(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((ApiSingpassResult) obj).getExists()) {
                SingpassWebviewDuxo.this.submit(SingpassWebviewDuxo2.ResumeOdyssey.INSTANCE);
            } else {
                SingpassWebviewDuxo.this.submit(SingpassWebviewDuxo2.LaunchSingpass.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void checkInitialSingpassResult() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C417581(null), 3, null);
    }

    /* compiled from: SingpassWebviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.singpass.SingpassWebviewDuxo$pollSingpassResult$1", m3645f = "SingpassWebviewDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.trader.singpass.SingpassWebviewDuxo$pollSingpassResult$1 */
    static final class C417591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C417591(Continuation<? super C417591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingpassWebviewDuxo.this.new C417591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C417591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ApiSingpassResult> flowPollSingpassResult = SingpassWebviewDuxo.this.singpassResultStore.pollSingpassResult();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SingpassWebviewDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollSingpassResult, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SingpassWebviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/api/identi/ApiSingpassResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.trader.singpass.SingpassWebviewDuxo$pollSingpassResult$1$1", m3645f = "SingpassWebviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.trader.singpass.SingpassWebviewDuxo$pollSingpassResult$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiSingpassResult, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SingpassWebviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SingpassWebviewDuxo singpassWebviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = singpassWebviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiSingpassResult apiSingpassResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(apiSingpassResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiSingpassResult apiSingpassResult = (ApiSingpassResult) this.L$0;
                if (Intrinsics.areEqual(apiSingpassResult.getError(), "No Singpass user info available yet due to upstream error")) {
                    this.this$0.submit(SingpassWebviewDuxo2.Error.INSTANCE);
                } else if (apiSingpassResult.getExists()) {
                    this.this$0.submit(SingpassWebviewDuxo2.ResumeOdyssey.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void pollSingpassResult() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C417591(null), 3, null);
    }
}
