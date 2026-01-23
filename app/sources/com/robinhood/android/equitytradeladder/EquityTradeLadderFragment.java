package com.robinhood.android.equitytradeladder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderFragmentKey;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxManager;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderFragment;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.android.linking.MobileLinkingData2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxManager;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EquityTradeLadderFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\r\u0010.\u001a\u00020&H\u0017¢\u0006\u0002\u0010/R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "mobileLinkingCallbacks", "Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "getMobileLinkingCallbacks", "()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "mobileLinkingCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "getDuxo", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ladderFtuxManager", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "getLadderFtuxManager", "()Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "setLadderFtuxManager", "(Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;)V", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "setPerformanceLogger", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-equity-trade-ladder_externalDebug", "viewState", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradeLadderFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EquityTradeLadderFtuxManager ladderFtuxManager;
    public PerformanceLogger performanceLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityTradeLadderFragment.class, "mobileLinkingCallbacks", "getMobileLinkingCallbacks()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: mobileLinkingCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 mobileLinkingCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MobileLinkingData2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MobileLinkingData2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityTradeLadderDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(EquityTradeLadderFragment equityTradeLadderFragment, int i, Composer composer, int i2) {
        equityTradeLadderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.EQUITIES_TRADING_LADDER;
        Companion companion = INSTANCE;
        String source = ((EquityTradeLadderFragmentKey) companion.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        return new Screen(name, source, ((EquityTradeLadderFragmentKey) companion.getArgs((Fragment) this)).getInstrumentId(), null, 8, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MobileLinkingData2 getMobileLinkingCallbacks() {
        return (MobileLinkingData2) this.mobileLinkingCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityTradeLadderDuxo getDuxo() {
        return (EquityTradeLadderDuxo) this.duxo.getValue();
    }

    public final EquityTradeLadderFtuxManager getLadderFtuxManager() {
        EquityTradeLadderFtuxManager equityTradeLadderFtuxManager = this.ladderFtuxManager;
        if (equityTradeLadderFtuxManager != null) {
            return equityTradeLadderFtuxManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ladderFtuxManager");
        return null;
    }

    public final void setLadderFtuxManager(EquityTradeLadderFtuxManager equityTradeLadderFtuxManager) {
        Intrinsics.checkNotNullParameter(equityTradeLadderFtuxManager, "<set-?>");
        this.ladderFtuxManager = equityTradeLadderFtuxManager;
    }

    public final PerformanceLogger getPerformanceLogger() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        if (performanceLogger != null) {
            return performanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceLogger");
        return null;
    }

    public final void setPerformanceLogger(PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "<set-?>");
        this.performanceLogger = performanceLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        GenericLadderFtuxManager.prefetchLotties$default(getLadderFtuxManager(), getContext(), DayNightChanges.isDay(getScarletManager()), false, 4, null);
        BaseFragment.collectDuxoState$default(this, null, new C158841(null), 1, null);
    }

    /* compiled from: EquityTradeLadderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$onViewCreated$1", m3645f = "EquityTradeLadderFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$onViewCreated$1 */
    static final class C158841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C158841(Continuation<? super C158841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderFragment.this.new C158841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(EquityTradeLadderFragment.this.getDuxo().getEventFlow());
                final EquityTradeLadderFragment equityTradeLadderFragment = EquityTradeLadderFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EquityTradeLadderEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EquityTradeLadderEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke;
                        final EquityTradeLadderFragment equityTradeLadderFragment2 = equityTradeLadderFragment;
                        if ((event.getData() instanceof EquityTradeLadderEvent.Exit) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m14043invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14043invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    equityTradeLadderFragment2.requireBaseActivity().finish();
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(824384652);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(824384652, i2, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderFragment.ComposeContent (EquityTradeLadderFragment.kt:74)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            LoggableViewState2 loggableViewState2LoadedState = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).loadedState();
            UUID screenLoadContextualId = getDuxo().getScreenLoadContextualId();
            UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, getEventScreen(), null, null, null, null, 61, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderFragment.ComposeContent$lambda$8$lambda$7(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptorCopy$default, false, screenLoadContextualId, function0, function02, function03, (Function0) objRememberedValue4, ComposableLambda3.rememberComposableLambda(-1459527122, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment.ComposeContent.5

                /* compiled from: EquityTradeLadderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$ComposeContent$5$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EquityTradeLadderFragment this$0;

                    AnonymousClass1(EquityTradeLadderFragment equityTradeLadderFragment) {
                        this.this$0 = equityTradeLadderFragment;
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
                            ComposerKt.traceEventStart(179362883, i, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderFragment.ComposeContent.<anonymous>.<anonymous> (EquityTradeLadderFragment.kt:115)");
                        }
                        EquityTradeLadderDuxo duxo = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final EquityTradeLadderFragment equityTradeLadderFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$ComposeContent$5$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EquityTradeLadderFragment.C158835.AnonymousClass1.invoke$lambda$1$lambda$0(equityTradeLadderFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final EquityTradeLadderFragment equityTradeLadderFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$ComposeContent$5$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EquityTradeLadderFragment.C158835.AnonymousClass1.invoke$lambda$3$lambda$2(equityTradeLadderFragment2, (Throwable) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                        LinkingGroup mobileLinkingGroup = ((EquityTradeLadderFragmentKey) EquityTradeLadderFragment.INSTANCE.getArgs((Fragment) this.this$0)).getMobileLinkingGroup();
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable(duxo, function0, function1, modifierNavigationBarsPadding, mobileLinkingGroup != null ? new MobileLinkingData(mobileLinkingGroup, this.this$0.getMobileLinkingCallbacks()) : null, composer, MobileLinkingData.$stable << 12, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderFragment equityTradeLadderFragment) {
                        if (((EquityTradeLadderFragmentKey) EquityTradeLadderFragment.INSTANCE.getArgs((Fragment) equityTradeLadderFragment)).getMobileLinkingGroup() != null) {
                            equityTradeLadderFragment.getMobileLinkingCallbacks().onFinish();
                        } else {
                            equityTradeLadderFragment.requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EquityTradeLadderFragment equityTradeLadderFragment, Throwable it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, equityTradeLadderFragment.requireBaseActivity(), it, true, false, 0, null, 56, null);
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
                        ComposerKt.traceEventStart(-1459527122, i3, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderFragment.ComposeContent.<anonymous> (EquityTradeLadderFragment.kt:114)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(179362883, true, new AnonymousClass1(EquityTradeLadderFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final EquityTradeLadderViewState ComposeContent$lambda$0(SnapshotState4<EquityTradeLadderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(EquityTradeLadderFragment equityTradeLadderFragment) {
        PerformanceLogger performanceLogger = equityTradeLadderFragment.getPerformanceLogger();
        PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.SCREEN_LOAD;
        PerformanceLogger.DefaultImpls.beginSpan$default(performanceLogger, name, equityTradeLadderFragment.getDuxo().getScreenLoadContextualId(), EquityTradeLadderDuxoKt.LADDER_L2_DATA_LOADED_METRIC, null, 8, null);
        PerformanceLogger.DefaultImpls.beginSpan$default(equityTradeLadderFragment.getPerformanceLogger(), name, equityTradeLadderFragment.getDuxo().getScreenLoadContextualId(), EquityTradeLadderDuxoKt.LADDER_MARKET_BUTTONS_LOADED_METRIC, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(EquityTradeLadderFragment equityTradeLadderFragment) {
        equityTradeLadderFragment.getPerformanceLogger().completeMetric(new ContextActionEvent.Action(UserInteractionEventData.Action.VIEW_EQUITY_TRADING_LADDER));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(EquityTradeLadderFragment equityTradeLadderFragment) {
        equityTradeLadderFragment.getPerformanceLogger().failMetric(new ContextActionEvent.Action(UserInteractionEventData.Action.VIEW_EQUITY_TRADING_LADDER));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(EquityTradeLadderFragment equityTradeLadderFragment) {
        equityTradeLadderFragment.getPerformanceLogger().abortMetric(new ContextActionEvent.Action(UserInteractionEventData.Action.VIEW_EQUITY_TRADING_LADDER));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment;", "Lcom/robinhood/android/equities/contracts/tradeladder/EquityTradeLadderFragmentKey;", "<init>", "()V", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EquityTradeLadderFragment, EquityTradeLadderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EquityTradeLadderFragmentKey equityTradeLadderFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, equityTradeLadderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EquityTradeLadderFragmentKey getArgs(EquityTradeLadderFragment equityTradeLadderFragment) {
            return (EquityTradeLadderFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, equityTradeLadderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityTradeLadderFragment newInstance(EquityTradeLadderFragmentKey equityTradeLadderFragmentKey) {
            return (EquityTradeLadderFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, equityTradeLadderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityTradeLadderFragment equityTradeLadderFragment, EquityTradeLadderFragmentKey equityTradeLadderFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, equityTradeLadderFragment, equityTradeLadderFragmentKey);
        }
    }
}
