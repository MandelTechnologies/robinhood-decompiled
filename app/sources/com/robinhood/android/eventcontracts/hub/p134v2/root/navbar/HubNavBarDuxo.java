package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.eventcontracts.experiments.EventContractsPredictionMarketsTestingExperiment;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations2;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarEvent;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode4;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.ProcessInvariantExperiment;
import com.robinhood.store.event.EcHubNavTreeStore;
import com.robinhood.store.event.HubPartialNavTree;
import com.robinhood.store.futures.FuturesAccountStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HubNavBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "ecHubNavTreeStore", "Lcom/robinhood/store/event/EcHubNavTreeStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EcHubNavTreeStore;Lcom/robinhood/experiments/ExperimentsProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onChildNodeSelected", "childNode", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "entryPointIdentifier", "", "Companion", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class HubNavBarDuxo extends BaseDuxo3<HubNavBarDataState, HubNavBarViewState, HubNavBarEvent> implements HasSavedState {
    private static final String ARG_SELECTED_NODE_ID = "selectedNodeId";
    private final EcHubNavTreeStore ecHubNavTreeStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HubNavBarDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcHubNavNode4.values().length];
            try {
                iArr[EcHubNavNode4.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcHubNavNode4.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HubNavBarDuxo(FuturesAccountStore futuresAccountStore, EcHubNavTreeStore ecHubNavTreeStore, ExperimentsProvider experimentsProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(ecHubNavTreeStore, "ecHubNavTreeStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        UUID uuid = (UUID) savedStateHandle.get(ARG_SELECTED_NODE_ID);
        super(new HubNavBarDataState(null, null, uuid == null ? ((HubRootNavGraphDestinations2.Args) INSTANCE.getArgs(savedStateHandle)).getDefaultSelectedNodeId() : uuid, false, 11, null), HubNavBarStateProvider.INSTANCE, duxoBundle);
        this.futuresAccountStore = futuresAccountStore;
        this.ecHubNavTreeStore = ecHubNavTreeStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C165821(null));
    }

    /* compiled from: HubNavBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1 */
    static final class C165821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C165821(Continuation<? super C165821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C165821 c165821 = HubNavBarDuxo.this.new C165821(continuation);
            c165821.L$0 = obj;
            return c165821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C165821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HubNavBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1", m3645f = "HubNavBarDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubNavBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HubNavBarDuxo hubNavBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = hubNavBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow<HubPartialNavTree> flowQueryPartialTreeByParentId = this.this$0.ecHubNavTreeStore.queryPartialTreeByParentId(((HubRootNavGraphDestinations2.Args) HubNavBarDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEntryNavNodeId());
                    C500741 c500741 = new C500741(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowQueryPartialTreeByParentId, c500741, this) == coroutine_suspended) {
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

            /* compiled from: HubNavBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/event/HubPartialNavTree;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500741 extends ContinuationImpl7 implements Function2<HubPartialNavTree, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubNavBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500741(HubNavBarDuxo hubNavBarDuxo, Continuation<? super C500741> continuation) {
                    super(2, continuation);
                    this.this$0 = hubNavBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500741 c500741 = new C500741(this.this$0, continuation);
                    c500741.L$0 = obj;
                    return c500741;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HubPartialNavTree hubPartialNavTree, Continuation<? super Unit> continuation) {
                    return ((C500741) create(hubPartialNavTree, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HubNavBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1$1$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500751 extends ContinuationImpl7 implements Function2<HubNavBarDataState, Continuation<? super HubNavBarDataState>, Object> {
                    final /* synthetic */ HubPartialNavTree $result;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500751(HubPartialNavTree hubPartialNavTree, Continuation<? super C500751> continuation) {
                        super(2, continuation);
                        this.$result = hubPartialNavTree;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500751 c500751 = new C500751(this.$result, continuation);
                        c500751.L$0 = obj;
                        return c500751;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubNavBarDataState hubNavBarDataState, Continuation<? super HubNavBarDataState> continuation) {
                        return ((C500751) create(hubNavBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubNavBarDataState.copy$default((HubNavBarDataState) this.L$0, null, this.$result, null, false, 13, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500751((HubPartialNavTree) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(HubNavBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HubNavBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(HubNavBarDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: HubNavBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2", m3645f = "HubNavBarDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubNavBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HubNavBarDuxo hubNavBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = hubNavBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    Flow<String> flowStreamRhsAccountNumberWithFuturesAccountAllowed = this.this$0.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRhsAccountNumberWithFuturesAccountAllowed, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: HubNavBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubNavBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HubNavBarDuxo hubNavBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = hubNavBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HubNavBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2$1$1", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500761 extends ContinuationImpl7 implements Function2<HubNavBarDataState, Continuation<? super HubNavBarDataState>, Object> {
                    final /* synthetic */ String $accountNumber;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500761(String str, Continuation<? super C500761> continuation) {
                        super(2, continuation);
                        this.$accountNumber = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500761 c500761 = new C500761(this.$accountNumber, continuation);
                        c500761.L$0 = obj;
                        return c500761;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubNavBarDataState hubNavBarDataState, Continuation<? super HubNavBarDataState> continuation) {
                        return ((C500761) create(hubNavBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubNavBarDataState.copy$default((HubNavBarDataState) this.L$0, this.$accountNumber, null, null, false, 14, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500761((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HubNavBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$3", m3645f = "HubNavBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubNavBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HubNavBarDuxo hubNavBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = hubNavBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HubNavBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$3$1", m3645f = "HubNavBarDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HubNavBarDataState, Continuation<? super HubNavBarDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubNavBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HubNavBarDuxo hubNavBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = hubNavBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HubNavBarDataState hubNavBarDataState, Continuation<? super HubNavBarDataState> continuation) {
                    return ((AnonymousClass1) create(hubNavBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    HubNavBarDataState hubNavBarDataState;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        HubNavBarDataState hubNavBarDataState2 = (HubNavBarDataState) this.L$0;
                        ExperimentsProvider experimentsProvider = this.this$0.experimentsProvider;
                        ProcessInvariantExperiment[] processInvariantExperimentArr = {EventContractsPredictionMarketsTestingExperiment.INSTANCE};
                        this.L$0 = hubNavBarDataState2;
                        this.label = 1;
                        Object state$default = ExperimentsProvider.DefaultImpls.getState$default(experimentsProvider, processInvariantExperimentArr, false, null, this, 6, null);
                        if (state$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hubNavBarDataState = hubNavBarDataState2;
                        obj = state$default;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hubNavBarDataState = (HubNavBarDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return HubNavBarDataState.copy$default(hubNavBarDataState, null, null, null, ((Boolean) obj).booleanValue(), 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HubNavBarDuxo hubNavBarDuxo = this.this$0;
                hubNavBarDuxo.applyMutation(new AnonymousClass1(hubNavBarDuxo, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void onChildNodeSelected(final EcHubNavNode childNode, final String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(childNode, "childNode");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        withDataState(new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HubNavBarDuxo.onChildNodeSelected$lambda$0(childNode, this, entryPointIdentifier, (HubNavBarDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChildNodeSelected$lambda$0(EcHubNavNode ecHubNavNode, HubNavBarDuxo hubNavBarDuxo, String str, HubNavBarDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EcHubNavNode entryNode = it.getEntryNode();
        if (entryNode != null && !Intrinsics.areEqual(it.getPresentLayoutNodeId(), ecHubNavNode.getId())) {
            int i = WhenMappings.$EnumSwitchMapping$0[entryNode.getSubCategorySelectionMode().ordinal()];
            if (i == 1) {
                hubNavBarDuxo.submit(new HubNavBarEvent.PushNewScreen(ecHubNavNode.getId(), str));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hubNavBarDuxo.getSavedStateHandle().set(ARG_SELECTED_NODE_ID, ecHubNavNode.getId());
                hubNavBarDuxo.applyMutation(new HubNavBarDuxo2(ecHubNavNode, null));
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HubNavBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDuxo;", "Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", "<init>", "()V", "ARG_SELECTED_NODE_ID", "", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<HubNavBarDuxo, HubRootNavGraphDestinations2.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public HubRootNavGraphDestinations2.Args getArgs(SavedStateHandle savedStateHandle) {
            return (HubRootNavGraphDestinations2.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public HubRootNavGraphDestinations2.Args getArgs(HubNavBarDuxo hubNavBarDuxo) {
            return (HubRootNavGraphDestinations2.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, hubNavBarDuxo);
        }
    }
}
