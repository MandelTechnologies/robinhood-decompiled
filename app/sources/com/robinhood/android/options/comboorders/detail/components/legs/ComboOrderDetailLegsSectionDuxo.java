package com.robinhood.android.options.comboorders.detail.components.legs;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
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

/* compiled from: ComboOrderDetailLegsSectionDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailLegsSectionDuxo extends BaseDuxo<ComboOrderDetailLegsSectionDataState, ComboOrderDetailLegsSectionViewState> implements HasSavedState {
    private final ComboOrderStore comboOrderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComboOrderDetailLegsSectionDuxo(ComboOrderStore comboOrderStore, ComboOrderDetailLegsSectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ComboOrderDetailLegsSectionDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.comboOrderStore = comboOrderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ComboOrderDetailLegsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1", m3645f = "ComboOrderDetailLegsSectionDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1 */
    static final class C230421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C230421(Continuation<? super C230421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComboOrderDetailLegsSectionDuxo.this.new C230421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ComboOrderDetailLegsSectionDuxo.this.comboOrderStore.streamComboOrder(((ComboOrderDetailFragmentKey) ComboOrderDetailLegsSectionDuxo.INSTANCE.getArgs((HasSavedState) ComboOrderDetailLegsSectionDuxo.this)).getComboOrderId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ComboOrderDetailLegsSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ComboOrderDetailLegsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1$1", m3645f = "ComboOrderDetailLegsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiComboOrder, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ComboOrderDetailLegsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ComboOrderDetailLegsSectionDuxo comboOrderDetailLegsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = comboOrderDetailLegsSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiComboOrder uiComboOrder, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiComboOrder, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ComboOrderDetailLegsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1$1$1", m3645f = "ComboOrderDetailLegsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503231 extends ContinuationImpl7 implements Function2<ComboOrderDetailLegsSectionDataState, Continuation<? super ComboOrderDetailLegsSectionDataState>, Object> {
                final /* synthetic */ UiComboOrder $uiComboOrder;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503231(UiComboOrder uiComboOrder, Continuation<? super C503231> continuation) {
                    super(2, continuation);
                    this.$uiComboOrder = uiComboOrder;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503231 c503231 = new C503231(this.$uiComboOrder, continuation);
                    c503231.L$0 = obj;
                    return c503231;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ComboOrderDetailLegsSectionDataState comboOrderDetailLegsSectionDataState, Continuation<? super ComboOrderDetailLegsSectionDataState> continuation) {
                    return ((C503231) create(comboOrderDetailLegsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((ComboOrderDetailLegsSectionDataState) this.L$0).copy(this.$uiComboOrder);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503231((UiComboOrder) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C230421(null));
    }

    /* compiled from: ComboOrderDetailLegsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionDuxo;", "Lcom/robinhood/android/options/contracts/ComboOrderDetailFragmentKey;", "<init>", "()V", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ComboOrderDetailLegsSectionDuxo, ComboOrderDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ComboOrderDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ComboOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ComboOrderDetailFragmentKey getArgs(ComboOrderDetailLegsSectionDuxo comboOrderDetailLegsSectionDuxo) {
            return (ComboOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, comboOrderDetailLegsSectionDuxo);
        }
    }
}
