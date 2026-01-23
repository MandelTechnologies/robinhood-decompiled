package com.robinhood.android.futures.history.p142ui.correction;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.contracts.FuturesCashCorrectionDetailFragmentKey;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.futures.FuturesCashCorrectionStore;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RhdCashCorrectionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDataState;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cashCorrectionStore", "Lcom/robinhood/store/futures/FuturesCashCorrectionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/FuturesCashCorrectionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class RhdCashCorrectionDetailDuxo extends BaseDuxo<RhdCashCorrectionDataState, RhdCashCorrectionDetailDuxo4> implements HasSavedState {
    private final FuturesCashCorrectionStore cashCorrectionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhdCashCorrectionDetailDuxo(FuturesCashCorrectionStore cashCorrectionStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new RhdCashCorrectionDataState(((FuturesCashCorrectionDetailFragmentKey) INSTANCE.getArgs(savedStateHandle)).getId(), null, 2, null), RhdCashCorrectionDetailDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(cashCorrectionStore, "cashCorrectionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cashCorrectionStore = cashCorrectionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C172501(null));
    }

    /* compiled from: RhdCashCorrectionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1", m3645f = "RhdCashCorrectionDetailDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1 */
    static final class C172501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C172501(Continuation<? super C172501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhdCashCorrectionDetailDuxo.this.new C172501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<FuturesCashCorrection> flowStreamCashCorrection = RhdCashCorrectionDetailDuxo.this.cashCorrectionStore.streamCashCorrection(((FuturesCashCorrectionDetailFragmentKey) RhdCashCorrectionDetailDuxo.INSTANCE.getArgs(RhdCashCorrectionDetailDuxo.this.getSavedStateHandle())).getId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhdCashCorrectionDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCashCorrection, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RhdCashCorrectionDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cashCorrection", "Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1$1", m3645f = "RhdCashCorrectionDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesCashCorrection, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RhdCashCorrectionDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhdCashCorrectionDetailDuxo rhdCashCorrectionDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rhdCashCorrectionDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesCashCorrection futuresCashCorrection, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(futuresCashCorrection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: RhdCashCorrectionDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1$1$1", m3645f = "RhdCashCorrectionDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501191 extends ContinuationImpl7 implements Function2<RhdCashCorrectionDataState, Continuation<? super RhdCashCorrectionDataState>, Object> {
                final /* synthetic */ FuturesCashCorrection $cashCorrection;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501191(FuturesCashCorrection futuresCashCorrection, Continuation<? super C501191> continuation) {
                    super(2, continuation);
                    this.$cashCorrection = futuresCashCorrection;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501191 c501191 = new C501191(this.$cashCorrection, continuation);
                    c501191.L$0 = obj;
                    return c501191;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RhdCashCorrectionDataState rhdCashCorrectionDataState, Continuation<? super RhdCashCorrectionDataState> continuation) {
                    return ((C501191) create(rhdCashCorrectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RhdCashCorrectionDataState.copy$default((RhdCashCorrectionDataState) this.L$0, null, this.$cashCorrection, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501191((FuturesCashCorrection) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RhdCashCorrectionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDetailDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesCashCorrectionDetailFragmentKey;", "<init>", "()V", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhdCashCorrectionDetailDuxo, FuturesCashCorrectionDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesCashCorrectionDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesCashCorrectionDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesCashCorrectionDetailFragmentKey getArgs(RhdCashCorrectionDetailDuxo rhdCashCorrectionDetailDuxo) {
            return (FuturesCashCorrectionDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, rhdCashCorrectionDetailDuxo);
        }
    }
}
