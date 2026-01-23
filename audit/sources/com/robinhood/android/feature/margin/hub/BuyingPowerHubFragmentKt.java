package com.robinhood.android.feature.margin.hub;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubState3;
import com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BuyingPowerHubFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\u0012\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u008a\u0084\u0002"}, m3636d2 = {"BuyingPowerHubScreen", "", "state", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "events", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent;", "entryPoint", "", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "presentAlert", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BuyingPowerHubScreenPreview", "(Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;Landroidx/compose/runtime/Composer;I)V", "feature-margin-hub_externalDebug", "event"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuyingPowerHubFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BuyingPowerHubScreen$lambda$2(BuyingPowerHubState3 buyingPowerHubState3, StateFlow stateFlow, String str, SduiActionHandler sduiActionHandler, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BuyingPowerHubScreen(buyingPowerHubState3, stateFlow, str, sduiActionHandler, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BuyingPowerHubScreenPreview$lambda$3(BuyingPowerHubState3 buyingPowerHubState3, int i, Composer composer, int i2) {
        BuyingPowerHubScreenPreview(buyingPowerHubState3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<BuyingPowerHubEvent> BuyingPowerHubScreen$lambda$0(SnapshotState4<Event<BuyingPowerHubEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BuyingPowerHubScreen(final BuyingPowerHubState3 state, final StateFlow<Event<BuyingPowerHubEvent>> events, final String str, final SduiActionHandler<? super BuyingPowerHubAction> actionHandler, final Function1<? super GenericAlertContent<? extends GenericAction>, Unit> presentAlert, final Function1<? super Throwable, Unit> onError, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Event<BuyingPowerHubEvent> event;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(presentAlert, "presentAlert");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1600430464);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(events) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(presentAlert) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onError) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1600430464, i3, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubScreen (BuyingPowerHubFragment.kt:129)");
                    }
                    int i5 = i3 >> 3;
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = events.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "BuyingPowerHubFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
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
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof BuyingPowerHubEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                    };
                    Event<BuyingPowerHubEvent> value = events.getValue();
                    event = value;
                    if (!((event == null ? event.getData() : null) instanceof BuyingPowerHubEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state2, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (!(state instanceof BuyingPowerHubState3.Failure)) {
                        composerStartRestartGroup.startReplaceGroup(-415367688);
                        composerStartRestartGroup.endReplaceGroup();
                        onError.invoke(((BuyingPowerHubState3.Failure) state).getThrowable());
                    } else if (state instanceof BuyingPowerHubState3.Loading) {
                        composerStartRestartGroup.startReplaceGroup(-415365360);
                        BuyingPowerHubComposable.BuyingPowerHubLoadingScreen(modifier4, composerStartRestartGroup, (i3 >> 18) & 14, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(state instanceof BuyingPowerHubState3.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(-415368941);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(8683641);
                        modifier3 = modifier4;
                        BuyingPowerHubComposable.BuyingPowerHubComposable(((BuyingPowerHubState3.Loaded) state).getBuyingPowerHubResponse(), str, actionHandler, modifier3, composerStartRestartGroup, (i5 & 1008) | ((i3 >> 9) & 7168), 0);
                        Event<BuyingPowerHubEvent> eventBuyingPowerHubScreen$lambda$0 = BuyingPowerHubScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((57344 & i3) == 16384);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1(snapshotState4CollectAsStateWithLifecycle, presentAlert, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(eventBuyingPowerHubScreen$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    modifier3 = modifier4;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BuyingPowerHubFragmentKt.BuyingPowerHubScreen$lambda$2(state, events, str, actionHandler, presentAlert, onError, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i52 = i3 >> 3;
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = events.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "BuyingPowerHubFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof BuyingPowerHubEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                };
                Event<BuyingPowerHubEvent> value2 = events.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof BuyingPowerHubEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state22, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (!(state instanceof BuyingPowerHubState3.Failure)) {
                }
                modifier3 = modifier4;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BuyingPowerHubScreenPreview(final BuyingPowerHubState3 state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1587592699);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1587592699, i2, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubScreenPreview (BuyingPowerHubFragment.kt:158)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(1884270907, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt.BuyingPowerHubScreenPreview.1

                /* compiled from: BuyingPowerHubFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreenPreview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ BuyingPowerHubState3 $state;

                    AnonymousClass1(BuyingPowerHubState3 buyingPowerHubState3) {
                        this.$state = buyingPowerHubState3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1381323907, i, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubScreenPreview.<anonymous>.<anonymous> (BuyingPowerHubFragment.kt:163)");
                        }
                        BuyingPowerHubState3 buyingPowerHubState3 = this.$state;
                        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreenPreview$1$1$1$1
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(BuyingPowerHubAction it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return true;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreenPreview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BuyingPowerHubFragmentKt.C168221.AnonymousClass1.invoke$lambda$2$lambda$1((GenericAlertContent) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreenPreview$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BuyingPowerHubFragmentKt.C168221.AnonymousClass1.invoke$lambda$4$lambda$3((Throwable) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        BuyingPowerHubFragmentKt.BuyingPowerHubScreen(buyingPowerHubState3, stateFlow2MutableStateFlow, null, sduiActionHandler, function1, (Function1) objRememberedValue3, null, composer, 221568, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(GenericAlertContent it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1884270907, i3, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubScreenPreview.<anonymous> (BuyingPowerHubFragment.kt:162)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1381323907, true, new AnonymousClass1(state), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyingPowerHubFragmentKt.BuyingPowerHubScreenPreview$lambda$3(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
