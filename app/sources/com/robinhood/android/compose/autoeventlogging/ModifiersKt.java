package com.robinhood.android.compose.autoeventlogging;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.platform.ValueElementSequence;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.plt.contract.PltManager2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.LayoutCoordinates3;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001aY\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"performanceIndicator", "Landroidx/compose/ui/Modifier;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "autoLogEvents", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "logAppear", "", "logTimeSpent", "useTransitionEventTypes", "logTap", "logPerformance", "appearEventDebounceTimeOverrideForTesting", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;ZZZZZLjava/lang/Long;)Landroidx/compose/ui/Modifier;", "logScreenTransitions", "lib-compose-auto-event-logging_externalDebug", "isVisible", "lastVisibilityCheckTimestamp", "earliestVisibilityTimestamp", "hasLoggedAppearButNotDisappear"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ModifiersKt {

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2 */
    static final class C119232 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Long $appearEventDebounceTimeOverrideForTesting;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ boolean $logAppear;
        final /* synthetic */ boolean $logPerformance;
        final /* synthetic */ boolean $logTap;
        final /* synthetic */ boolean $logTimeSpent;
        final /* synthetic */ boolean $useTransitionEventTypes;

        C119232(UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, Long l, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$logAppear = z;
            this.$appearEventDebounceTimeOverrideForTesting = l;
            this.$useTransitionEventTypes = z2;
            this.$logTimeSpent = z3;
            this.$logTap = z4;
            this.$logPerformance = z5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$16$lambda$15(final boolean z, final boolean z2, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final SnapshotState snapshotState, final SnapshotState snapshotState2, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$invoke$lambda$16$lambda$15$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    UserInteractionEventData.EventType eventType;
                    Long lInvoke$lambda$7;
                    if (ModifiersKt.C119232.invoke$lambda$10(snapshotState)) {
                        if (z) {
                            eventType = UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR;
                        } else {
                            eventType = UserInteractionEventData.EventType.DISAPPEAR;
                        }
                        Long lValueOf = (!z2 || (lInvoke$lambda$7 = ModifiersKt.C119232.invoke$lambda$7(snapshotState2)) == null) ? null : Long.valueOf(System.currentTimeMillis() - lInvoke$lambda$7.longValue());
                        snapshotState2.setValue(null);
                        EventLogger eventLogger2 = eventLogger;
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger2, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor2.getContext()), 0, 0, 0, null, null, null, null, null, lValueOf != null ? (int) lValueOf.longValue() : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null), eventType), false, false, 6, null);
                        ModifiersKt.C119232.invoke$lambda$11(snapshotState, false);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$10(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long invoke$lambda$7(SnapshotState<Long> snapshotState) {
            return snapshotState.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
            EventLogger eventLogger;
            final SnapshotState snapshotState;
            Modifier composed = modifier;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-2078723344);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2078723344, i, -1, "com.robinhood.android.compose.autoeventlogging.autoLogEvents.<anonymous> (Modifiers.kt:97)");
            }
            if (((Boolean) composer.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotLongState3.mutableLongStateOf(0L);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composer.endReplaceGroup();
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, 6);
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            composer.startReplaceGroup(-493324338);
            if (userInteractionEventDescriptor == null) {
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$logAppear) | composer.changed(this.$appearEventDebounceTimeOverrideForTesting) | composer.changed(this.$useTransitionEventTypes) | composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor2);
            Long l = this.$appearEventDebounceTimeOverrideForTesting;
            boolean z = this.$logAppear;
            boolean z2 = this.$useTransitionEventTypes;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ModifiersKt$autoLogEvents$2$1$1(l, z, snapshotState2, z2, current, userInteractionEventDescriptor2, snapshotState4, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer, 6);
            composer.startReplaceGroup(-493298303);
            if (this.$logAppear) {
                composer.startReplaceGroup(-1224400529);
                boolean zChanged2 = composer.changed(this.$useTransitionEventTypes) | composer.changed(this.$logTimeSpent) | composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor2);
                final boolean z3 = this.$useTransitionEventTypes;
                final boolean z4 = this.$logTimeSpent;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    Object obj = new Function1() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ModifiersKt.C119232.invoke$lambda$16$lambda$15(z3, z4, current, userInteractionEventDescriptor2, snapshotState4, snapshotState3, (DisposableEffectScope) obj2);
                        }
                    };
                    eventLogger = current;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor2;
                    snapshotState = snapshotState3;
                    composer.updateRememberedValue(obj);
                    objRememberedValue6 = obj;
                } else {
                    eventLogger = current;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor2;
                    snapshotState = snapshotState3;
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer, 6);
            } else {
                eventLogger = current;
                snapshotState = snapshotState3;
            }
            composer.endReplaceGroup();
            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Rect rect = new Rect();
            composer.startReplaceGroup(-493263345);
            if (this.$logAppear) {
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(view) | composer.changedInstance(rect);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ModifiersKt.C119232.invoke$lambda$19$lambda$18(view, rect, snapshotLongState2, snapshotState2, snapshotState, (LayoutCoordinates) obj3);
                        }
                    };
                    composer.updateRememberedValue(obj2);
                    objRememberedValue7 = obj2;
                }
                composer.endReplaceGroup();
                composed = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue7);
            }
            composer.endReplaceGroup();
            if (this.$logTap) {
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor2) | composer.changed(this.$logPerformance);
                boolean z5 = this.$logPerformance;
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new ModifiersKt$autoLogEvents$2$3$1(eventLogger, userInteractionEventDescriptor2, z5);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                composed = SuspendingPointerInputFilterKt.pointerInput(composed, userInteractionEventDescriptor2, (PointerInputEventHandler) objRememberedValue8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18(View view, Rect rect, SnapshotLongState2 snapshotLongState2, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - snapshotLongState2.getLongValue() > 250) {
                boolean zIsVisible = LayoutCoordinates3.isVisible(coordinates, view, rect);
                invoke$lambda$2(snapshotState, zIsVisible);
                snapshotLongState2.setLongValue(jCurrentTimeMillis);
                if (zIsVisible && invoke$lambda$7(snapshotState2) == null) {
                    snapshotState2.setValue(Long.valueOf(jCurrentTimeMillis));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Modifier autoLogEvents$default(Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        return autoLogEvents(modifier, userInteractionEventDescriptor, z, z2, z3, z4, z5, l);
    }

    public static final Modifier autoLogEvents(Modifier modifier, final UserInteractionEventDescriptor userInteractionEventDescriptor, final boolean z, boolean z2, final boolean z3, final boolean z4, final boolean z5, Long l) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                String string2;
                inspectorInfo.setName("autoLoggingEventDescriptor");
                inspectorInfo.getProperties().set("logAppear", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("logTap", Boolean.valueOf(z4));
                inspectorInfo.getProperties().set("useTransitionEventTypes", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("logPerformance", Boolean.valueOf(z5));
                ValueElementSequence properties = inspectorInfo.getProperties();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                if (userInteractionEventDescriptor2 == null || (string2 = userInteractionEventDescriptor2.toString()) == null) {
                    string2 = "Using eventDescriptor from LocalUserInteractionEventDescriptor";
                }
                properties.set("eventDescriptor", string2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new C119232(userInteractionEventDescriptor, z, l, z3, z2, z4, z5));
    }

    public static final Modifier performanceIndicator(Modifier modifier, final LoggableViewState2 loadedState) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(loadedState, "loadedState");
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$performanceIndicator$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("performanceIndicator");
                inspectorInfo.getProperties().set("loadedState", loadedState);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt.performanceIndicator.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-1649200395);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1649200395, i, -1, "com.robinhood.android.compose.autoeventlogging.performanceIndicator.<anonymous> (Modifiers.kt:42)");
                }
                if (((Boolean) composer.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return composed;
                }
                PerformanceIndicatorDispatcher performanceIndicatorDispatcher = (PerformanceIndicatorDispatcher) composer.consume(AutoLoggingCompositionLocals.getLocalPerformanceIndicatorDispatcher());
                String identifier = loadedState.getIdentifier();
                LoggableViewState2 loggableViewState2 = loadedState;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(performanceIndicatorDispatcher) | composer.changed(identifier) | composer.changedInstance(loadedState);
                LoggableViewState2 loggableViewState22 = loadedState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ModifiersKt$performanceIndicator$2$1$1(performanceIndicatorDispatcher, identifier, loggableViewState22, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(loggableViewState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
        });
    }

    public static /* synthetic */ Modifier logScreenTransitions$default(Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = null;
        }
        return logScreenTransitions(modifier, userInteractionEventDescriptor);
    }

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.compose.autoeventlogging.ModifiersKt$logScreenTransitions$1 */
    /* loaded from: classes2.dex */
    static final class C119251 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;

        C119251(UserInteractionEventDescriptor userInteractionEventDescriptor) {
            this.$eventDescriptor = userInteractionEventDescriptor;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1941363628);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1941363628, i, -1, "com.robinhood.android.compose.autoeventlogging.logScreenTransitions.<anonymous> (Modifiers.kt:196)");
            }
            if (((Boolean) composer.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            composer.startReplaceGroup(1634644714);
            if (userInteractionEventDescriptor == null) {
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            }
            composer.endReplaceGroup();
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, 6);
            final PltManager pltManager = (PltManager) composer.consume(PltManager2.getLocalPltManager());
            final Screen screen = userInteractionEventDescriptor.getScreen();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(pltManager) | composer.changedInstance(screen);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$logScreenTransitions$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C119251.invoke$lambda$2$lambda$1(current, userInteractionEventDescriptor, pltManager, screen, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(screen, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$2$lambda$1(final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final PltManager pltManager, final Screen screen, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR), false, false, 6, null);
            if (pltManager != null && screen != null) {
                pltManager.onScreenAppear(screen, false);
            }
            return new DisposableEffectResult() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$logScreenTransitions$1$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Screen screen2;
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR), false, false, 6, null);
                    PltManager pltManager2 = pltManager;
                    if (pltManager2 == null || (screen2 = screen) == null) {
                        return;
                    }
                    pltManager2.onScreenDisappear(screen2);
                }
            };
        }
    }

    public static final Modifier logScreenTransitions(Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new C119251(userInteractionEventDescriptor), 1, null);
    }
}
