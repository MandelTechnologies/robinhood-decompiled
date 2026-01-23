package com.robinhood.android.options.comboorders.detail.components.topbar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: ComboOrderDetailTopbarDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailTopbarDuxo extends BaseDuxo<ComboOrderDetailTopbarDataState, ComboOrderDetailTopbarViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
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
    public ComboOrderDetailTopbarDuxo(AccountProvider accountProvider, ComboOrderStore comboOrderStore, ComboOrderDetailTopbarStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ComboOrderDetailTopbarDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.comboOrderStore = comboOrderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ComboOrderDetailTopbarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1 */
    static final class C230491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C230491(Continuation<? super C230491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C230491 c230491 = ComboOrderDetailTopbarDuxo.this.new C230491(continuation);
            c230491.L$0 = obj;
            return c230491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(ComboOrderDetailTopbarDuxo.this.comboOrderStore.streamComboOrder(((ComboOrderDetailFragmentKey) ComboOrderDetailTopbarDuxo.INSTANCE.getArgs((HasSavedState) ComboOrderDetailTopbarDuxo.this)).getComboOrderId())), ComboOrderDetailTopbarDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, ComboOrderDetailTopbarDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, ComboOrderDetailTopbarDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: ComboOrderDetailTopbarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailTopbarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailTopbarDuxo comboOrderDetailTopbarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailTopbarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$uiComboOrderFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiComboOrder> sharedFlow = this.$uiComboOrderFlow;
                    C503241 c503241 = new C503241(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c503241, this) == coroutine_suspended) {
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

            /* compiled from: ComboOrderDetailTopbarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1$1", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503241 extends ContinuationImpl7 implements Function2<UiComboOrder, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailTopbarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503241(ComboOrderDetailTopbarDuxo comboOrderDetailTopbarDuxo, Continuation<? super C503241> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailTopbarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503241 c503241 = new C503241(this.this$0, continuation);
                    c503241.L$0 = obj;
                    return c503241;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiComboOrder uiComboOrder, Continuation<? super Unit> continuation) {
                    return ((C503241) create(uiComboOrder, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailTopbarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1$1$1", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503251 extends ContinuationImpl7 implements Function2<ComboOrderDetailTopbarDataState, Continuation<? super ComboOrderDetailTopbarDataState>, Object> {
                    final /* synthetic */ UiComboOrder $uiComboOrder;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503251(UiComboOrder uiComboOrder, Continuation<? super C503251> continuation) {
                        super(2, continuation);
                        this.$uiComboOrder = uiComboOrder;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503251 c503251 = new C503251(this.$uiComboOrder, continuation);
                        c503251.L$0 = obj;
                        return c503251;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailTopbarDataState comboOrderDetailTopbarDataState, Continuation<? super ComboOrderDetailTopbarDataState> continuation) {
                        return ((C503251) create(comboOrderDetailTopbarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailTopbarDataState.copy$default((ComboOrderDetailTopbarDataState) this.L$0, null, this.$uiComboOrder.getInstrument().getSymbol(), this.$uiComboOrder.getComboOrder().getDerivedState(), 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503251((UiComboOrder) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ComboOrderDetailTopbarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailTopbarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailTopbarDuxo comboOrderDetailTopbarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailTopbarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$uiComboOrderFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<UiComboOrder> sharedFlow = this.$uiComboOrderFlow;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String accountNumber = ((UiComboOrder) obj).getComboOrder().getAccountNumber();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C23047x5ec2513b(null, this.this$0)));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: ComboOrderDetailTopbarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$3", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailTopbarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(ComboOrderDetailTopbarDuxo comboOrderDetailTopbarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailTopbarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailTopbarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$3$1", m3645f = "ComboOrderDetailTopbarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ComboOrderDetailTopbarDataState, Continuation<? super ComboOrderDetailTopbarDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailTopbarDataState comboOrderDetailTopbarDataState, Continuation<? super ComboOrderDetailTopbarDataState> continuation) {
                        return ((AnonymousClass1) create(comboOrderDetailTopbarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailTopbarDataState.copy$default((ComboOrderDetailTopbarDataState) this.L$0, AccountDisplayNames.getDisplayName(this.$account).getWithAccount().getTitle(), null, null, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C230491(null));
    }

    /* compiled from: ComboOrderDetailTopbarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDuxo;", "Lcom/robinhood/android/options/contracts/ComboOrderDetailFragmentKey;", "<init>", "()V", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ComboOrderDetailTopbarDuxo, ComboOrderDetailFragmentKey> {
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
        public ComboOrderDetailFragmentKey getArgs(ComboOrderDetailTopbarDuxo comboOrderDetailTopbarDuxo) {
            return (ComboOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, comboOrderDetailTopbarDuxo);
        }
    }
}
