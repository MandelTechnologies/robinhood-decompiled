package com.robinhood.android.options.comboorders.detail.components.actionrows;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.models.p320db.Document;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: ComboOrderDetailActionRowsDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onClickActionRow", "actionRow", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailActionRowsDuxo extends BaseDuxo<ComboOrderDetailActionRowsDataState, ComboOrderDetailActionRowsViewState> implements HasSavedState {
    private final ComboOrderStore comboOrderStore;
    private final DocumentStore documentStore;
    private final TraderEventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboOrderDetailActionRowsDuxo(ComboOrderStore comboOrderStore, TraderEventLogger eventLogger, DocumentStore documentStore, ComboOrderDetailActionRowsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ComboOrderDetailActionRowsDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.comboOrderStore = comboOrderStore;
        this.eventLogger = eventLogger;
        this.documentStore = documentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C230351(null));
    }

    /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1 */
    static final class C230351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C230351(Continuation<? super C230351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C230351 c230351 = ComboOrderDetailActionRowsDuxo.this.new C230351(continuation);
            c230351.L$0 = obj;
            return c230351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C230351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(ComboOrderDetailActionRowsDuxo.this.comboOrderStore.streamComboOrder(((ComboOrderDetailFragmentKey) ComboOrderDetailActionRowsDuxo.INSTANCE.getArgs((HasSavedState) ComboOrderDetailActionRowsDuxo.this)).getComboOrderId())), ComboOrderDetailActionRowsDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, ComboOrderDetailActionRowsDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, ComboOrderDetailActionRowsDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailActionRowsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailActionRowsDuxo comboOrderDetailActionRowsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailActionRowsDuxo;
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
                    C503161 c503161 = new C503161(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c503161, this) == coroutine_suspended) {
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

            /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1$1", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503161 extends ContinuationImpl7 implements Function2<UiComboOrder, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailActionRowsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503161(ComboOrderDetailActionRowsDuxo comboOrderDetailActionRowsDuxo, Continuation<? super C503161> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailActionRowsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503161 c503161 = new C503161(this.this$0, continuation);
                    c503161.L$0 = obj;
                    return c503161;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiComboOrder uiComboOrder, Continuation<? super Unit> continuation) {
                    return ((C503161) create(uiComboOrder, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1$1$1", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503171 extends ContinuationImpl7 implements Function2<ComboOrderDetailActionRowsDataState, Continuation<? super ComboOrderDetailActionRowsDataState>, Object> {
                    final /* synthetic */ UiComboOrder $uiComboOrder;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503171(UiComboOrder uiComboOrder, Continuation<? super C503171> continuation) {
                        super(2, continuation);
                        this.$uiComboOrder = uiComboOrder;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503171 c503171 = new C503171(this.$uiComboOrder, continuation);
                        c503171.L$0 = obj;
                        return c503171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailActionRowsDataState comboOrderDetailActionRowsDataState, Continuation<? super ComboOrderDetailActionRowsDataState> continuation) {
                        return ((C503171) create(comboOrderDetailActionRowsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailActionRowsDataState.copy$default((ComboOrderDetailActionRowsDataState) this.L$0, this.$uiComboOrder, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503171((UiComboOrder) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiComboOrder> $uiComboOrderFlow;
            int label;
            final /* synthetic */ ComboOrderDetailActionRowsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiComboOrder> sharedFlow, ComboOrderDetailActionRowsDuxo comboOrderDetailActionRowsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$uiComboOrderFlow = sharedFlow;
                this.this$0 = comboOrderDetailActionRowsDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChangedBy(this.$uiComboOrderFlow, new Function1() { // from class: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComboOrderDetailActionRowsDuxo.C230351.AnonymousClass2.invokeSuspend$lambda$0((UiComboOrder) obj2);
                        }
                    }), new C23034xf993044c(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0(UiComboOrder uiComboOrder) {
                return uiComboOrder.getComboOrder().getAccountNumber();
            }

            /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "documents", "", "Lcom/robinhood/models/db/Document;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2$3", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends Document>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ComboOrderDetailActionRowsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(ComboOrderDetailActionRowsDuxo comboOrderDetailActionRowsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = comboOrderDetailActionRowsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends Document> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<Document>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<Document> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2$3$1", m3645f = "ComboOrderDetailActionRowsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ComboOrderDetailActionRowsDataState, Continuation<? super ComboOrderDetailActionRowsDataState>, Object> {
                    final /* synthetic */ List<Document> $documents;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<Document> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$documents = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$documents, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ComboOrderDetailActionRowsDataState comboOrderDetailActionRowsDataState, Continuation<? super ComboOrderDetailActionRowsDataState> continuation) {
                        return ((AnonymousClass1) create(comboOrderDetailActionRowsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ComboOrderDetailActionRowsDataState.copy$default((ComboOrderDetailActionRowsDataState) this.L$0, null, this.$documents, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onClickActionRow(ActionRow actionRow, Context context, Navigator navigator, com.robinhood.rosetta.eventlogging.Context eventContext) {
        Intrinsics.checkNotNullParameter(actionRow, "actionRow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, actionRow.getType().getAction(), new Screen(Screen.Name.COMBO_ORDER_DETAIL, null, null, null, 14, null), new Component(actionRow.getType().getComponentType(), null, null, 6, null), null, eventContext, false, 40, null);
        NavigationKey navigationKey = actionRow.getNavigationKey();
        if (navigationKey instanceof DialogFragmentKey) {
            if (navigationKey instanceof Parcelable) {
                context.startActivity(Navigator.DefaultImpls.createIntentForDialogFragment$default(navigator, context, (DialogFragmentKey) navigationKey, null, 4, null));
            }
        } else if (navigationKey instanceof FragmentKey) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, (FragmentKey) navigationKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else {
            if (!(navigationKey instanceof IntentKey)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, (IntentKey) navigationKey, null, false, null, null, 60, null);
        }
    }

    /* compiled from: ComboOrderDetailActionRowsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ComboOrderDetailActionRowsDuxo;", "Lcom/robinhood/android/options/contracts/ComboOrderDetailFragmentKey;", "<init>", "()V", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ComboOrderDetailActionRowsDuxo, ComboOrderDetailFragmentKey> {
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
        public ComboOrderDetailFragmentKey getArgs(ComboOrderDetailActionRowsDuxo comboOrderDetailActionRowsDuxo) {
            return (ComboOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, comboOrderDetailActionRowsDuxo);
        }
    }
}
