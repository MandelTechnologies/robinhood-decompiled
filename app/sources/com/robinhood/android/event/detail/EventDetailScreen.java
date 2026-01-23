package com.robinhood.android.event.detail;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.detail.EventDetailScreen;
import com.robinhood.android.event.detail.EventDetailViewState;
import com.robinhood.android.event.detail.multi.EventDetailMultiTradeBar;
import com.robinhood.android.event.detail.multi.MultiTradeBarUiState;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import rosetta.mainst.SideDto;

/* compiled from: EventDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a2\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002"}, m3636d2 = {"EventDetailScreen", "", "callbacks", "Lcom/robinhood/android/event/detail/EventDetailCallbacks;", "duxo", "Lcom/robinhood/android/event/detail/EventDetailDuxo;", "(Lcom/robinhood/android/event/detail/EventDetailCallbacks;Lcom/robinhood/android/event/detail/EventDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "logControlTradeButtonTap", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "buttonState", "Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;", "buttonText", "", "feature-event-detail_externalDebug", "state", "Lcom/robinhood/android/event/detail/EventDetailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailScreen {

    /* compiled from: EventDetailScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SideDto.values().length];
            try {
                iArr[SideDto.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventViewMode.values().length];
            try {
                iArr2[EventViewMode.PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EventViewMode.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailScreen$lambda$2(EventDetailFragment2 eventDetailFragment2, EventDetailDuxo eventDetailDuxo, int i, int i2, Composer composer, int i3) {
        EventDetailScreen(eventDetailFragment2, eventDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventDetailScreen(final EventDetailFragment2 callbacks, EventDetailDuxo eventDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        EventDetailDuxo eventDetailDuxo2;
        final EventDetailDuxo eventDetailDuxo3;
        UiEcEvent uiEvent;
        Event event;
        UUID eventId;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-162550553);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                eventDetailDuxo2 = eventDetailDuxo;
                int i4 = composerStartRestartGroup.changedInstance(eventDetailDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                eventDetailDuxo2 = eventDetailDuxo;
            }
            i3 |= i4;
        } else {
            eventDetailDuxo2 = eventDetailDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            eventDetailDuxo3 = eventDetailDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EventDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 &= -113;
                    eventDetailDuxo3 = (EventDetailDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-162550553, i5, -1, "com.robinhood.android.event.detail.EventDetailScreen (EventDetailScreen.kt:36)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(eventDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                uiEvent = EventDetailScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUiEvent();
                if (uiEvent != null || (event = uiEvent.getEvent()) == null || (eventId = event.getEventId()) == null || (string = eventId.toString()) == null) {
                    String string2 = "";
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EVENT_CONTRACT_DETAIL_PAGE, null, string2, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(719209436, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt.EventDetailScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(719209436, i6, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous> (EventDetailScreen.kt:46)");
                        }
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(916119968, true, new AnonymousClass1(callbacks, snapshotState4CollectAsStateWithLifecycle), composer2, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2124065311, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle, current2, userInteractionEventDescriptor, eventDetailDuxo3), composer2, 54);
                        final EventDetailDuxo eventDetailDuxo4 = eventDetailDuxo3;
                        final SnapshotState4<EventDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-290613973, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt.EventDetailScreen.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-290613973, i8, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:92)");
                                }
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(((Styles) composer3.consume(Styles2.getLocalStyles())).getButton(composer3, 0).getPrimary().m21717getMinHeightD9Ej5fM() + BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21591getLargeD9Ej5fM());
                                EventDetailViewState eventDetailViewStateEventDetailScreen$lambda$0 = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4);
                                EventDetailDuxo eventDetailDuxo5 = eventDetailDuxo4;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(eventDetailDuxo5);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new EventDetailScreen3(eventDetailDuxo5);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                EventDetailContentKt.EventDetailContent(eventDetailViewStateEventDetailScreen$lambda$0, eventDetailDuxo4, SizeKt.fillMaxSize$default(PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.getTop(), PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection())), C2002Dp.m7995constructorimpl(RangesKt.coerceAtMost(paddingValues.getBottom(), fM7995constructorimpl))), 0.0f, 1, null), (Function3) objRememberedValue2, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: EventDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventDetailFragment2 $callbacks;
                        final /* synthetic */ SnapshotState4<EventDetailViewState> $state$delegate;

                        AnonymousClass1(EventDetailFragment2 eventDetailFragment2, SnapshotState4<EventDetailViewState> snapshotState4) {
                            this.$callbacks = eventDetailFragment2;
                            this.$state$delegate = snapshotState4;
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
                                ComposerKt.traceEventStart(916119968, i, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:55)");
                            }
                            boolean z = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData() != null;
                            EventDetailViewState.TopBarData topBarData = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData();
                            StringResource primaryText = topBarData != null ? topBarData.getPrimaryText() : null;
                            composer.startReplaceGroup(-77001143);
                            String text = primaryText == null ? null : StringUtil2.getText(primaryText, composer, StringResource.$stable);
                            composer.endReplaceGroup();
                            EventDetailViewState.TopBarData topBarData2 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData();
                            String secondaryText = topBarData2 != null ? topBarData2.getSecondaryText() : null;
                            EventDetailFragment2 eventDetailFragment2 = this.$callbacks;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(eventDetailFragment2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new EventDetailScreen2(eventDetailFragment2);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$state$delegate) | composer.changedInstance(this.$callbacks);
                            final EventDetailFragment2 eventDetailFragment22 = this.$callbacks;
                            final SnapshotState4<EventDetailViewState> snapshotState4 = this.$state$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventDetailScreen.C160901.AnonymousClass1.invoke$lambda$2$lambda$1(eventDetailFragment22, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            EventDetailTopBar.EventDetailTopBar(z, text, secondaryText, function0, (Function0) objRememberedValue2, null, composer, 0, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(EventDetailFragment2 eventDetailFragment2, SnapshotState4 snapshotState4) {
                            ImmutableList<UUID> contractIdsForChart;
                            DisplaySpan activeSpan;
                            UUID eventId = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getEventId();
                            if (eventId != null && (contractIdsForChart = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getContractIdsForChart()) != null && (activeSpan = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getChartState().getActiveSpan()) != null) {
                                eventDetailFragment2.onStartPipMode(eventId, contractIdsForChart, activeSpan);
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: EventDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventDetailDuxo $duxo;
                        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState4<EventDetailViewState> $state$delegate;

                        AnonymousClass2(SnapshotState4<EventDetailViewState> snapshotState4, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EventDetailDuxo eventDetailDuxo) {
                            this.$state$delegate = snapshotState4;
                            this.$eventLogger = eventLogger;
                            this.$eventDescriptor = userInteractionEventDescriptor;
                            this.$duxo = eventDetailDuxo;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            MultiTradeBarUiState.ButtonState rightButtonState;
                            MultiTradeBarUiState.ButtonState leftButtonState;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2124065311, i, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:69)");
                            }
                            MultiTradeBarUiState tradeBar = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            StringResource displayText = (tradeBar == null || (leftButtonState = tradeBar.getLeftButtonState()) == null) ? null : leftButtonState.getDisplayText();
                            composer.startReplaceGroup(-1117295542);
                            final String text = displayText == null ? null : StringUtil2.getText(displayText, composer, StringResource.$stable);
                            composer.endReplaceGroup();
                            MultiTradeBarUiState tradeBar2 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            StringResource displayText2 = (tradeBar2 == null || (rightButtonState = tradeBar2.getRightButtonState()) == null) ? null : rightButtonState.getDisplayText();
                            composer.startReplaceGroup(-1117292502);
                            final String text2 = displayText2 != null ? StringUtil2.getText(displayText2, composer, StringResource.$stable) : null;
                            composer.endReplaceGroup();
                            MultiTradeBarUiState tradeBar3 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$state$delegate) | composer.changed(text) | composer.changed(text2) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                            final EventDetailDuxo eventDetailDuxo = this.$duxo;
                            final SnapshotState4<EventDetailViewState> snapshotState4 = this.$state$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventDetailScreen.C160901.AnonymousClass2.invoke$lambda$1$lambda$0(text, text2, eventLogger, userInteractionEventDescriptor, eventDetailDuxo, snapshotState4, (MultiTradeBarUiState.ButtonState) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            EventDetailMultiTradeBar.AnimatedEventDetailMultiTradeBar(tradeBar3, (Function1) objRememberedValue, null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(String str, String str2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EventDetailDuxo eventDetailDuxo, SnapshotState4 snapshotState4, MultiTradeBarUiState.ButtonState buttonState) {
                            MultiTradeBarUiState.ButtonState rightButtonState;
                            MultiTradeBarUiState.ButtonState leftButtonState;
                            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                            UUID contractId = buttonState.getContractId();
                            MultiTradeBarUiState tradeBar = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getTradeBar();
                            if (!Intrinsics.areEqual(contractId, (tradeBar == null || (leftButtonState = tradeBar.getLeftButtonState()) == null) ? null : leftButtonState.getContractId())) {
                                MultiTradeBarUiState tradeBar2 = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getTradeBar();
                                str = Intrinsics.areEqual(contractId, (tradeBar2 == null || (rightButtonState = tradeBar2.getRightButtonState()) == null) ? null : rightButtonState.getContractId()) ? str2 : null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            EventDetailScreen.logControlTradeButtonTap(eventLogger, userInteractionEventDescriptor, EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getViewMode(), buttonState, str);
                            EventDetailDuxo.onTrade$default(eventDetailDuxo, buttonState.getContractId(), buttonState.getSide(), buttonState.getPositionEffect(), false, 8, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                callbacks.handleEvent(EventDetailScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(eventDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            }
            eventDetailDuxo3 = eventDetailDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<EventDetailViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(eventDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            uiEvent = EventDetailScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getUiEvent();
            if (uiEvent != null) {
                String string22 = "";
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EVENT_CONTRACT_DETAIL_PAGE, null, string22, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(719209436, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt.EventDetailScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(719209436, i6, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous> (EventDetailScreen.kt:46)");
                        }
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(916119968, true, new AnonymousClass1(callbacks, snapshotState4CollectAsStateWithLifecycle2), composer2, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2124065311, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle2, current2, userInteractionEventDescriptor, eventDetailDuxo3), composer2, 54);
                        final EventDetailDuxo eventDetailDuxo4 = eventDetailDuxo3;
                        final SnapshotState4<EventDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-290613973, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt.EventDetailScreen.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-290613973, i8, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:92)");
                                }
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(((Styles) composer3.consume(Styles2.getLocalStyles())).getButton(composer3, 0).getPrimary().m21717getMinHeightD9Ej5fM() + BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21591getLargeD9Ej5fM());
                                EventDetailViewState eventDetailViewStateEventDetailScreen$lambda$0 = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4);
                                EventDetailDuxo eventDetailDuxo5 = eventDetailDuxo4;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(eventDetailDuxo5);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new EventDetailScreen3(eventDetailDuxo5);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                EventDetailContentKt.EventDetailContent(eventDetailViewStateEventDetailScreen$lambda$0, eventDetailDuxo4, SizeKt.fillMaxSize$default(PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.getTop(), PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection())), C2002Dp.m7995constructorimpl(RangesKt.coerceAtMost(paddingValues.getBottom(), fM7995constructorimpl))), 0.0f, 1, null), (Function3) objRememberedValue2, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: EventDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventDetailFragment2 $callbacks;
                        final /* synthetic */ SnapshotState4<EventDetailViewState> $state$delegate;

                        AnonymousClass1(EventDetailFragment2 eventDetailFragment2, SnapshotState4<EventDetailViewState> snapshotState4) {
                            this.$callbacks = eventDetailFragment2;
                            this.$state$delegate = snapshotState4;
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
                                ComposerKt.traceEventStart(916119968, i, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:55)");
                            }
                            boolean z = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData() != null;
                            EventDetailViewState.TopBarData topBarData = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData();
                            StringResource primaryText = topBarData != null ? topBarData.getPrimaryText() : null;
                            composer.startReplaceGroup(-77001143);
                            String text = primaryText == null ? null : StringUtil2.getText(primaryText, composer, StringResource.$stable);
                            composer.endReplaceGroup();
                            EventDetailViewState.TopBarData topBarData2 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTopBarData();
                            String secondaryText = topBarData2 != null ? topBarData2.getSecondaryText() : null;
                            EventDetailFragment2 eventDetailFragment2 = this.$callbacks;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(eventDetailFragment2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new EventDetailScreen2(eventDetailFragment2);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$state$delegate) | composer.changedInstance(this.$callbacks);
                            final EventDetailFragment2 eventDetailFragment22 = this.$callbacks;
                            final SnapshotState4 snapshotState4 = this.$state$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventDetailScreen.C160901.AnonymousClass1.invoke$lambda$2$lambda$1(eventDetailFragment22, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            EventDetailTopBar.EventDetailTopBar(z, text, secondaryText, function0, (Function0) objRememberedValue2, null, composer, 0, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(EventDetailFragment2 eventDetailFragment2, SnapshotState4 snapshotState4) {
                            ImmutableList<UUID> contractIdsForChart;
                            DisplaySpan activeSpan;
                            UUID eventId = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getEventId();
                            if (eventId != null && (contractIdsForChart = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getContractIdsForChart()) != null && (activeSpan = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getChartState().getActiveSpan()) != null) {
                                eventDetailFragment2.onStartPipMode(eventId, contractIdsForChart, activeSpan);
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: EventDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventDetailDuxo $duxo;
                        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState4<EventDetailViewState> $state$delegate;

                        AnonymousClass2(SnapshotState4<EventDetailViewState> snapshotState4, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EventDetailDuxo eventDetailDuxo) {
                            this.$state$delegate = snapshotState4;
                            this.$eventLogger = eventLogger;
                            this.$eventDescriptor = userInteractionEventDescriptor;
                            this.$duxo = eventDetailDuxo;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            MultiTradeBarUiState.ButtonState rightButtonState;
                            MultiTradeBarUiState.ButtonState leftButtonState;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2124065311, i, -1, "com.robinhood.android.event.detail.EventDetailScreen.<anonymous>.<anonymous> (EventDetailScreen.kt:69)");
                            }
                            MultiTradeBarUiState tradeBar = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            StringResource displayText = (tradeBar == null || (leftButtonState = tradeBar.getLeftButtonState()) == null) ? null : leftButtonState.getDisplayText();
                            composer.startReplaceGroup(-1117295542);
                            final String text = displayText == null ? null : StringUtil2.getText(displayText, composer, StringResource.$stable);
                            composer.endReplaceGroup();
                            MultiTradeBarUiState tradeBar2 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            StringResource displayText2 = (tradeBar2 == null || (rightButtonState = tradeBar2.getRightButtonState()) == null) ? null : rightButtonState.getDisplayText();
                            composer.startReplaceGroup(-1117292502);
                            final String text2 = displayText2 != null ? StringUtil2.getText(displayText2, composer, StringResource.$stable) : null;
                            composer.endReplaceGroup();
                            MultiTradeBarUiState tradeBar3 = EventDetailScreen.EventDetailScreen$lambda$0(this.$state$delegate).getTradeBar();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$state$delegate) | composer.changed(text) | composer.changed(text2) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                            final EventDetailDuxo eventDetailDuxo = this.$duxo;
                            final SnapshotState4 snapshotState4 = this.$state$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventDetailScreen.C160901.AnonymousClass2.invoke$lambda$1$lambda$0(text, text2, eventLogger, userInteractionEventDescriptor, eventDetailDuxo, snapshotState4, (MultiTradeBarUiState.ButtonState) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            EventDetailMultiTradeBar.AnimatedEventDetailMultiTradeBar(tradeBar3, (Function1) objRememberedValue, null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(String str, String str2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EventDetailDuxo eventDetailDuxo, SnapshotState4 snapshotState4, MultiTradeBarUiState.ButtonState buttonState) {
                            MultiTradeBarUiState.ButtonState rightButtonState;
                            MultiTradeBarUiState.ButtonState leftButtonState;
                            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                            UUID contractId = buttonState.getContractId();
                            MultiTradeBarUiState tradeBar = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getTradeBar();
                            if (!Intrinsics.areEqual(contractId, (tradeBar == null || (leftButtonState = tradeBar.getLeftButtonState()) == null) ? null : leftButtonState.getContractId())) {
                                MultiTradeBarUiState tradeBar2 = EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getTradeBar();
                                str = Intrinsics.areEqual(contractId, (tradeBar2 == null || (rightButtonState = tradeBar2.getRightButtonState()) == null) ? null : rightButtonState.getContractId()) ? str2 : null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            EventDetailScreen.logControlTradeButtonTap(eventLogger, userInteractionEventDescriptor, EventDetailScreen.EventDetailScreen$lambda$0(snapshotState4).getViewMode(), buttonState, str);
                            EventDetailDuxo.onTrade$default(eventDetailDuxo, buttonState.getContractId(), buttonState.getSide(), buttonState.getPositionEffect(), false, 8, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                callbacks.handleEvent(EventDetailScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(eventDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailScreen.EventDetailScreen$lambda$2(callbacks, eventDetailDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventDetailViewState EventDetailScreen$lambda$0(SnapshotState4<EventDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final com.robinhood.android.udf.event.Event<EventDetailScreenEvent> EventDetailScreen$lambda$1(SnapshotState4<com.robinhood.android.udf.event.Event<EventDetailScreenEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logControlTradeButtonTap(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EventViewMode eventViewMode, MultiTradeBarUiState.ButtonState buttonState, String str) {
        String str2;
        String str3;
        String str4;
        if (WhenMappings.$EnumSwitchMapping$0[buttonState.getSide().ordinal()] == 1) {
            str2 = "control-contract-selector-yes-" + buttonState.getContractId();
        } else {
            str2 = "control-contract-selector-no-" + buttonState.getContractId();
        }
        int i = eventViewMode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[eventViewMode.ordinal()];
        if (i == 1) {
            str3 = EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE;
        } else {
            str3 = i != 2 ? null : EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_MULTI_MODE;
        }
        if (str3 != null) {
            str4 = str3 + "-" + str2;
        } else {
            str4 = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, str4, null, 4, null), null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext()), 0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
    }
}
