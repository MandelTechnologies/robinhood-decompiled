package com.robinhood.tooltips;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipManagerViewState;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TooltipManagerDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00110\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ1\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010$\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fJ\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J!\u0010(\u001a\u00020\u00112\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\"H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerDuxo;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/tooltips/TooltipManagerViewState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "activeAnimations", "", "animationsIdle", "Lkotlinx/coroutines/flow/Flow;", "", "dismissActiveTooltip", "", "onRemoved", "Lkotlin/Function1;", "Lcom/robinhood/tooltips/TooltipData;", "addTooltip", "forceDisplay", WebsocketGatewayConstants.DATA_KEY, "performClick", "animationStarted", "animationStopped", "updateTooltipStatus", "id", "", "newStatus", "Lcom/robinhood/tooltips/TooltipManagerViewState$Status;", "updateTooltipData", "mutator", "Lkotlin/ExtensionFunctionType;", "hasTooltip", "removeTooltip", "setActive", "isActive", "registerListeners", "applyMutation", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TooltipManagerDuxo extends ViewModel {
    public static final int $stable = 8;
    private final StateFlow2<TooltipManagerViewState> _state;
    private final StateFlow2<Integer> activeAnimations;
    private final Flow<Boolean> animationsIdle;
    private final StateFlow<TooltipManagerViewState> state;

    public TooltipManagerDuxo() {
        StateFlow2<TooltipManagerViewState> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(new TooltipManagerViewState(null, null, false, 7, null));
        this._state = stateFlow2MutableStateFlow;
        this.state = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
        final StateFlow2<Integer> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(0);
        this.activeAnimations = stateFlow2MutableStateFlow2;
        this.animationsIdle = new Flow<Boolean>() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.tooltips.TooltipManagerDuxo$special$$inlined$map$1$2 */
            public static final class C416652<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.tooltips.TooltipManagerDuxo$special$$inlined$map$1$2", m3645f = "TooltipManagerDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.tooltips.TooltipManagerDuxo$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C416652.this.emit(null, this);
                    }
                }

                public C416652(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Number) obj).intValue() < 0);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow2.collect(new C416652(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final StateFlow<TooltipManagerViewState> getState() {
        return this.state;
    }

    public final void dismissActiveTooltip(Function1<? super TooltipData, Unit> onRemoved) {
        Intrinsics.checkNotNullParameter(onRemoved, "onRemoved");
        final TooltipManagerViewState.Tooltip activeTooltip = this.state.getValue().getActiveTooltip();
        if (activeTooltip != null) {
            applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipManagerDuxo.dismissActiveTooltip$lambda$2(activeTooltip, (TooltipManagerViewState) obj);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C416662(activeTooltip, this, onRemoved, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState dismissActiveTooltip$lambda$2(TooltipManagerViewState.Tooltip tooltip, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TooltipManagerViewState.copy$default(applyMutation, TooltipManagerDuxo3.update(applyMutation.getTooltips(), tooltip.getData().getId(), new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.dismissActiveTooltip$lambda$2$lambda$1((TooltipManagerViewState.Tooltip) obj);
            }
        }), null, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState.Tooltip dismissActiveTooltip$lambda$2$lambda$1(TooltipManagerViewState.Tooltip update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return update.copy(TooltipManagerViewState.Status.READY, TooltipData.copy$default(update.getData(), null, null, null, null, new TooltipData.Behavior(Boolean.FALSE, null, null, null, 14, null), 15, null));
    }

    /* compiled from: TooltipManagerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2", m3645f = "TooltipManagerDuxo.kt", m3646l = {45, 48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2 */
    static final class C416662 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TooltipManagerViewState.Tooltip $activeTooltip;
        final /* synthetic */ Function1<TooltipData, Unit> $onRemoved;
        int label;
        final /* synthetic */ TooltipManagerDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C416662(TooltipManagerViewState.Tooltip tooltip, TooltipManagerDuxo tooltipManagerDuxo, Function1<? super TooltipData, Unit> function1, Continuation<? super C416662> continuation) {
            super(2, continuation);
            this.$activeTooltip = tooltip;
            this.this$0 = tooltipManagerDuxo;
            this.$onRemoved = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C416662(this.$activeTooltip, this.this$0, this.$onRemoved, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r6, r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$activeTooltip != null) {
                    Flow flow = this.this$0.animationsIdle;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.label = 1;
                    if (FlowKt.first(flow, anonymousClass1, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function1<TooltipData, Unit> function1 = this.$onRemoved;
                    TooltipManagerViewState.Tooltip tooltip = this.$activeTooltip;
                    function1.invoke(tooltip != null ? tooltip.getData() : null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Flow flow2 = this.this$0.animationsIdle;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 2;
        }

        /* compiled from: TooltipManagerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2$1", m3645f = "TooltipManagerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(!this.Z$0);
            }
        }

        /* compiled from: TooltipManagerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2$2", m3645f = "TooltipManagerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.tooltips.TooltipManagerDuxo$dismissActiveTooltip$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0);
            }
        }
    }

    public static /* synthetic */ void addTooltip$default(TooltipManagerDuxo tooltipManagerDuxo, boolean z, TooltipData tooltipData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        tooltipManagerDuxo.addTooltip(z, tooltipData);
    }

    public final void addTooltip(final boolean forceDisplay, final TooltipData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final String id = data.getId();
        BooleanPreference shownPref = data.getBehavior().getShownPref();
        if (shownPref != null && shownPref.get()) {
            removeTooltip(data.getId());
        } else {
            registerListeners(data);
            applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TooltipManagerDuxo.addTooltip$lambda$3(forceDisplay, data, id, (TooltipManagerViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState addTooltip$lambda$3(boolean z, TooltipData tooltipData, String str, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TooltipManagerViewState.copy$default(applyMutation, MapsKt.plus(applyMutation.getTooltips(), MapsKt.mapOf(Tuples4.m3642to(str, new TooltipManagerViewState.Tooltip(TooltipManagerViewState.Status.READY, tooltipData)))), z ? tooltipData.getId() : applyMutation.getForceTooltipId(), false, 4, null);
    }

    public final void performClick(TooltipData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Function0<Unit> onClick = data.getBehavior().getOnClick();
        if (onClick != null) {
            onClick.invoke();
        }
        removeTooltip(data.getId());
    }

    public final void animationStarted() {
        Integer value;
        StateFlow2<Integer> stateFlow2 = this.activeAnimations;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, Integer.valueOf(value.intValue() + 1)));
    }

    public final void animationStopped() {
        StateFlow2<Integer> stateFlow2 = this.activeAnimations;
        do {
        } while (!stateFlow2.compareAndSet(stateFlow2.getValue(), Integer.valueOf(r1.intValue() - 1)));
    }

    public final void updateTooltipStatus(final String id, final TooltipManagerViewState.Status newStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.updateTooltipStatus$lambda$8(id, newStatus, (TooltipManagerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState updateTooltipStatus$lambda$8(String str, final TooltipManagerViewState.Status status, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TooltipManagerViewState.copy$default(applyMutation, TooltipManagerDuxo3.update(applyMutation.getTooltips(), str, new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.updateTooltipStatus$lambda$8$lambda$7(status, (TooltipManagerViewState.Tooltip) obj);
            }
        }), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState.Tooltip updateTooltipStatus$lambda$8$lambda$7(TooltipManagerViewState.Status status, TooltipManagerViewState.Tooltip update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return TooltipManagerViewState.Tooltip.copy$default(update, status, null, 2, null);
    }

    public static /* synthetic */ void updateTooltipData$default(TooltipManagerDuxo tooltipManagerDuxo, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        tooltipManagerDuxo.updateTooltipData(str, z, function1);
    }

    public final void updateTooltipData(final String id, final boolean forceDisplay, final Function1<? super TooltipData, TooltipData> mutator) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.updateTooltipData$lambda$9(forceDisplay, id, mutator, (TooltipManagerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState updateTooltipData$lambda$9(boolean z, String str, Function1 function1, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TooltipManagerViewState.copy$default(applyMutation, TooltipManagerDuxo3.updateData(applyMutation.getTooltips(), str, function1), z ? str : applyMutation.getForceTooltipId(), false, 4, null);
    }

    public final boolean hasTooltip(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.state.getValue().getTooltips().containsKey(id);
    }

    public final void removeTooltip(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.removeTooltip$lambda$12(id, (TooltipManagerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState removeTooltip$lambda$12(String str, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String forceTooltipId = applyMutation.getForceTooltipId();
        if (Intrinsics.areEqual(forceTooltipId, str)) {
            forceTooltipId = null;
        }
        return TooltipManagerViewState.copy$default(applyMutation, TooltipManagerDuxo3.update(applyMutation.getTooltips(), str, new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.removeTooltip$lambda$12$lambda$11((TooltipManagerViewState.Tooltip) obj);
            }
        }), forceTooltipId, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState.Tooltip removeTooltip$lambda$12$lambda$11(TooltipManagerViewState.Tooltip update) {
        BooleanPreference shownPref;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        if (update.getStatus() != TooltipManagerViewState.Status.DISPLAYED || (shownPref = update.getData().getBehavior().getShownPref()) == null) {
            return null;
        }
        shownPref.set(true);
        return null;
    }

    public final void setActive(final boolean isActive) {
        applyMutation(new Function1() { // from class: com.robinhood.tooltips.TooltipManagerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TooltipManagerDuxo.setActive$lambda$13(isActive, (TooltipManagerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManagerViewState setActive$lambda$13(boolean z, TooltipManagerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TooltipManagerViewState.copy$default(applyMutation, null, null, z, 3, null);
    }

    private final void registerListeners(TooltipData data) {
        String id = data.getId();
        TooltipData.Behavior behavior = data.getBehavior();
        BooleanPreference shownPref = behavior.getShownPref();
        if (shownPref == null || shownPref.get()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new TooltipManagerDuxo2(behavior, this, id, null), 3, null);
    }

    private final void applyMutation(Function1<? super TooltipManagerViewState, TooltipManagerViewState> mutator) {
        TooltipManagerViewState value;
        StateFlow2<TooltipManagerViewState> stateFlow2 = this._state;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, mutator.invoke(value)));
    }
}
