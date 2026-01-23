package com.robinhood.android.options.comboorders.detail.components.infogrid;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import java.util.UUID;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: ComboOrderDetailInfoGridDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailInfoGridDuxo extends BaseDuxo<ComboOrderDetailInfoGridDataState, ComboOrderDetailInfoGridViewState> implements HasSavedState {
    private final BackupWithholdingStore backupWithholdingStore;
    private final ComboOrderStore comboOrderStore;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboOrderDetailInfoGridDuxo(BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, ComboOrderStore comboOrderStore, UserStore userStore, ComboOrderDetailInfoGridStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ComboOrderDetailInfoGridDataState(null, null, false, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.backupWithholdingStore = backupWithholdingStore;
        this.experimentsStore = experimentsStore;
        this.comboOrderStore = comboOrderStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        UUID comboOrderId = ((ComboOrderDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getComboOrderId();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C230381(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C230392(comboOrderId, null));
    }

    /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1 */
    static final class C230381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C230381(Continuation<? super C230381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComboOrderDetailInfoGridDuxo.this.new C230381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ComboOrderDetailInfoGridDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ComboOrderDetailInfoGridDuxo.this, null);
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

        /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = comboOrderDetailInfoGridDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(User user, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1$1$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503181 extends ContinuationImpl7 implements Function2<ComboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState>, Object> {
                final /* synthetic */ User $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503181(User user, Continuation<? super C503181> continuation) {
                    super(2, continuation);
                    this.$it = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503181 c503181 = new C503181(this.$it, continuation);
                    c503181.L$0 = obj;
                    return c503181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState> continuation) {
                    return ((C503181) create(comboOrderDetailInfoGridDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ComboOrderDetailInfoGridDataState.copy$default((ComboOrderDetailInfoGridDataState) this.L$0, null, null, false, this.$it.getOrigin().getLocality(), 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503181((User) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2 */
    static final class C230392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $comboOrderId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C230392(UUID uuid, Continuation<? super C230392> continuation) {
            super(2, continuation);
            this.$comboOrderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C230392 c230392 = ComboOrderDetailInfoGridDuxo.this.new C230392(this.$comboOrderId, continuation);
            c230392.L$0 = obj;
            return c230392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(ComboOrderDetailInfoGridDuxo.this.comboOrderStore.streamComboOrder(this.$comboOrderId)), ComboOrderDetailInfoGridDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, ComboOrderDetailInfoGridDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, ComboOrderDetailInfoGridDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ComboOrderDetailInfoGridDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailInfoGridDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$uiComboOrderFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503191 extends ContinuationImpl7 implements Function2<UiComboOrder, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503191(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super C503191> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailInfoGridDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503191 c503191 = new C503191(this.this$0, continuation);
                    c503191.L$0 = obj;
                    return c503191;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiComboOrder uiComboOrder, Continuation<? super Unit> continuation) {
                    return ((C503191) create(uiComboOrder, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1$1$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503201 extends ContinuationImpl7 implements Function2<ComboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState>, Object> {
                    final /* synthetic */ UiComboOrder $uiComboOrder;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503201(UiComboOrder uiComboOrder, Continuation<? super C503201> continuation) {
                        super(2, continuation);
                        this.$uiComboOrder = uiComboOrder;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503201 c503201 = new C503201(this.$uiComboOrder, continuation);
                        c503201.L$0 = obj;
                        return c503201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState> continuation) {
                        return ((C503201) create(comboOrderDetailInfoGridDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailInfoGridDataState.copy$default((ComboOrderDetailInfoGridDataState) this.L$0, this.$uiComboOrder, null, false, null, 14, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503201((UiComboOrder) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiComboOrder> sharedFlow = this.$uiComboOrderFlow;
                    C503191 c503191 = new C503191(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c503191, this) == coroutine_suspended) {
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

        /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailInfoGridDuxo;
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiComboOrderFlow, new C23037xd3a2ba90(null, this.this$0)));
                    C503212 c503212 = new C503212(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c503212, this) == coroutine_suspended) {
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

            /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2$2", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C503212 extends ContinuationImpl7 implements Function2<Optional<? extends WithholdingAmount>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503212(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super C503212> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailInfoGridDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503212 c503212 = new C503212(this.this$0, continuation);
                    c503212.L$0 = obj;
                    return c503212;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<WithholdingAmount> optional, Continuation<? super Unit> continuation) {
                    return ((C503212) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends WithholdingAmount> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<WithholdingAmount>) optional, continuation);
                }

                /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2$2$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ComboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState>, Object> {
                    final /* synthetic */ WithholdingAmount $withholdingAmountResponse;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(WithholdingAmount withholdingAmount, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$withholdingAmountResponse = withholdingAmount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$withholdingAmountResponse, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState> continuation) {
                        return ((AnonymousClass1) create(comboOrderDetailInfoGridDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailInfoGridDataState.copy$default((ComboOrderDetailInfoGridDataState) this.L$0, null, this.$withholdingAmountResponse, false, null, 13, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((WithholdingAmount) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {89}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = comboOrderDetailInfoGridDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesCopyKillSwitch.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "killswitchEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ ComboOrderDetailInfoGridDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailInfoGridDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3$1$1", m3645f = "ComboOrderDetailInfoGridDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo$onCreate$2$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503221 extends ContinuationImpl7 implements Function2<ComboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState>, Object> {
                    final /* synthetic */ boolean $killswitchEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503221(boolean z, Continuation<? super C503221> continuation) {
                        super(2, continuation);
                        this.$killswitchEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503221 c503221 = new C503221(this.$killswitchEnabled, continuation);
                        c503221.L$0 = obj;
                        return c503221;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState, Continuation<? super ComboOrderDetailInfoGridDataState> continuation) {
                        return ((C503221) create(comboOrderDetailInfoGridDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailInfoGridDataState.copy$default((ComboOrderDetailInfoGridDataState) this.L$0, null, null, !this.$killswitchEnabled, null, 11, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503221(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: ComboOrderDetailInfoGridDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo;", "Lcom/robinhood/android/options/contracts/ComboOrderDetailFragmentKey;", "<init>", "()V", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ComboOrderDetailInfoGridDuxo, ComboOrderDetailFragmentKey> {
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
        public ComboOrderDetailFragmentKey getArgs(ComboOrderDetailInfoGridDuxo comboOrderDetailInfoGridDuxo) {
            return (ComboOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, comboOrderDetailInfoGridDuxo);
        }
    }
}
