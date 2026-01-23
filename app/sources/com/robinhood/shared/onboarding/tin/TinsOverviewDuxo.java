package com.robinhood.shared.onboarding.tin;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.identi.TinStore;
import com.robinhood.models.api.Tin;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TinsOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/tin/TinsOverviewDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/onboarding/tin/TinsOverviewViewState;", "tinStore", "Lcom/robinhood/librobinhood/data/store/identi/TinStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/TinStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "refreshTins", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-tin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TinsOverviewDuxo extends BaseDuxo4<TinsOverviewViewState> {
    public static final int $stable = 8;
    private final TinStore tinStore;

    /* compiled from: TinsOverviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.tin.TinsOverviewDuxo", m3645f = "TinsOverviewDuxo.kt", m3646l = {29}, m3647m = "refreshTins")
    /* renamed from: com.robinhood.shared.onboarding.tin.TinsOverviewDuxo$refreshTins$1 */
    static final class C392561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C392561(Continuation<? super C392561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TinsOverviewDuxo.this.refreshTins(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TinsOverviewDuxo(TinStore tinStore, DuxoBundle duxoBundle) {
        super(new TinsOverviewViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(tinStore, "tinStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.tinStore = tinStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C392551(null));
    }

    /* compiled from: TinsOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.tin.TinsOverviewDuxo$onCreate$1", m3645f = "TinsOverviewDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.onboarding.tin.TinsOverviewDuxo$onCreate$1 */
    static final class C392551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C392551(Continuation<? super C392551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TinsOverviewDuxo.this.new C392551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C392551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TinsOverviewDuxo tinsOverviewDuxo = TinsOverviewDuxo.this;
                this.label = 1;
                if (tinsOverviewDuxo.refreshTins(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshTins(Continuation<? super Unit> continuation) {
        C392561 c392561;
        if (continuation instanceof C392561) {
            c392561 = (C392561) continuation;
            int i = c392561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c392561.label = i - Integer.MIN_VALUE;
            } else {
                c392561 = new C392561(continuation);
            }
        }
        Object tins = c392561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c392561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(tins);
            TinStore tinStore = this.tinStore;
            c392561.label = 1;
            tins = tinStore.getTins(c392561);
            if (tins == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(tins);
        }
        applyMutation(new C392572((ImmutableList3) tins, null));
        return Unit.INSTANCE;
    }

    /* compiled from: TinsOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/onboarding/tin/TinsOverviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.tin.TinsOverviewDuxo$refreshTins$2", m3645f = "TinsOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.onboarding.tin.TinsOverviewDuxo$refreshTins$2 */
    static final class C392572 extends ContinuationImpl7 implements Function2<TinsOverviewViewState, Continuation<? super TinsOverviewViewState>, Object> {
        final /* synthetic */ ImmutableList3<Tin> $tins;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C392572(ImmutableList3<Tin> immutableList3, Continuation<? super C392572> continuation) {
            super(2, continuation);
            this.$tins = immutableList3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C392572 c392572 = new C392572(this.$tins, continuation);
            c392572.L$0 = obj;
            return c392572;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TinsOverviewViewState tinsOverviewViewState, Continuation<? super TinsOverviewViewState> continuation) {
            return ((C392572) create(tinsOverviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((TinsOverviewViewState) this.L$0).copy(this.$tins);
        }
    }
}
