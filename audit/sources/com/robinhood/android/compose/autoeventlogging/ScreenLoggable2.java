package com.robinhood.android.compose.autoeventlogging;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.PerformanceIndicator;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenLoggable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0018²\u0006\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/LoadedState;", "loadedState", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "", "logOnce", "Ljava/util/UUID;", "contextualId", "Lkotlin/Function0;", "", "onMetricStarted", "onLoadCompleted", "onLoadFailed", "onLoadAborted", "content", "ScreenLoggable", "(Lcom/robinhood/android/autoeventlogging/LoadedState;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;ZLjava/util/UUID;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "", "Lcom/robinhood/android/autoeventlogging/PerformanceIndicator;", "performanceIndicators", "Lcom/robinhood/android/compose/autoeventlogging/MetricState;", "loggedState", "hasLoggedOnce", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ScreenLoggable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenLoggable$lambda$34(LoggableViewState2 loggableViewState2, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, UUID uuid, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, int i, int i2, Composer composer, int i3) {
        ScreenLoggable(loggableViewState2, userInteractionEventDescriptor, z, uuid, function0, function02, function03, function04, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ScreenLoggable$lambda$23$lambda$22(final SnapshotState snapshotState, final PerformanceLogger performanceLogger, final UUID uuid, final Function0 function0, final boolean z, final SnapshotState snapshotState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$ScreenLoggable$lambda$23$lambda$22$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ScreenLoggable screenLoggableScreenLoggable$lambda$13 = ScreenLoggable2.ScreenLoggable$lambda$13(snapshotState);
                boolean z2 = z;
                SnapshotState snapshotState3 = snapshotState2;
                SnapshotState snapshotState4 = snapshotState;
                ScreenLoggable screenLoggable = ScreenLoggable.STARTED;
                ScreenLoggable screenLoggable2 = ScreenLoggable.COMPLETED;
                final PerformanceLogger performanceLogger2 = performanceLogger;
                final UUID uuid2 = uuid;
                final Function0 function02 = function0;
                ScreenLoggable2.ScreenLoggable$compareAndSet(screenLoggableScreenLoggable$lambda$13, z2, snapshotState3, snapshotState4, screenLoggable, screenLoggable2, new Function0<Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$ScreenLoggable$7$1$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        performanceLogger2.abortMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, uuid2);
                        function02.invoke();
                    }
                });
            }
        };
    }

    private static final Map<String, PerformanceIndicator> ScreenLoggable$lambda$11(SnapshotState4<? extends Map<String, PerformanceIndicator>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenLoggable ScreenLoggable$lambda$13(SnapshotState<ScreenLoggable> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean ScreenLoggable$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenLoggable(final LoggableViewState2 loadedState, final UserInteractionEventDescriptor eventDescriptor, boolean z, UUID uuid, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final UUID uuid2;
        int i4;
        Function0<Unit> function05;
        int i5;
        Function0<Unit> function06;
        int i6;
        final Function0<Unit> function07;
        int i7;
        boolean z3;
        Function0<Unit> function08;
        Function0<Unit> function09;
        final UUID uuid3;
        Screen screen;
        Composer composer2;
        SnapshotState snapshotState;
        final Function0<Unit> function010;
        final Function0<Unit> function011;
        final boolean z4;
        final Function0<Unit> function012;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(loadedState, "loadedState");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-996242530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loadedState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventDescriptor) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    uuid2 = uuid;
                    int i10 = composerStartRestartGroup.changedInstance(uuid2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    uuid2 = uuid;
                }
                i3 |= i10;
            } else {
                uuid2 = uuid;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function05 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function05) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function06 = function02;
                } else {
                    function06 = function02;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function06) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function07 = function03;
                } else {
                    function07 = function03;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function07) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    i8 = (100663296 & i) == 0 ? composerStartRestartGroup.changedInstance(content) ? 67108864 : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 8) != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = UUID.randomUUID();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i3 &= -7169;
                                uuid2 = (UUID) objRememberedValue;
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function05 = (Function0) objRememberedValue2;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function06 = (Function0) objRememberedValue3;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function07 = (Function0) objRememberedValue4;
                            }
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                z3 = z2;
                                function08 = function06;
                                function09 = (Function0) objRememberedValue5;
                                uuid3 = uuid2;
                            }
                            int i11 = i3;
                            final Function0<Unit> function013 = function05;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-996242530, i11, -1, "com.robinhood.android.compose.autoeventlogging.ScreenLoggable (ScreenLoggable.kt:95)");
                            }
                            screen = eventDescriptor.getScreen();
                            if (screen == null) {
                                throw new IllegalStateException("ScreenLoggable requires a UserInteractionEventDescriptor with a Screen to log performance");
                            }
                            PerformanceIndicatorDispatcher.Factory current = AutoLoggingCompositionLocals.getLocalPerformanceIndicatorDispatcherFactory().getCurrent(composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = current.create(uuid3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            PerformanceIndicatorDispatcher performanceIndicatorDispatcher = (PerformanceIndicatorDispatcher) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                            Function0<Unit> function014 = function08;
                            SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(performanceIndicatorDispatcher.getPerformanceIndicators(), null, composerStartRestartGroup, 0, 1);
                            final PerformanceLogger current2 = AutoLoggingCompositionLocals.getLocalPerformanceLogger().getCurrent(composerStartRestartGroup, 6);
                            final PerformanceMetricEventData.Context context = new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, new PerformanceMetricEventData.Context.ScreenLoad(screen, eventDescriptor.getContext(), null, 4, null), null, null, null, null, 3967, null);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = SnapshotState3.mutableStateOf$default(ScreenLoggable.NOT_STARTED, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            Object[] objArr = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ScreenLoggable2.ScreenLoggable$lambda$16$lambda$15();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final Function0<Unit> function015 = function09;
                            composer2 = composerStartRestartGroup;
                            final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue8, composerStartRestartGroup, 3072, 6);
                            ScreenLoggable screenLoggableScreenLoggable$lambda$13 = ScreenLoggable$lambda$13(snapshotState2);
                            ScreenLoggable screenLoggable = ScreenLoggable.NOT_STARTED;
                            ScreenLoggable screenLoggable2 = ScreenLoggable.STARTED;
                            composer2.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = ((i11 & 57344) == 16384) | composer2.changedInstance(current2) | composer2.changedInstance(uuid3) | composer2.changedInstance(context);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue9 == companion.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ScreenLoggable2.ScreenLoggable$lambda$20$lambda$19(current2, uuid3, context, function013);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceGroup();
                            ScreenLoggable$compareAndSet(screenLoggableScreenLoggable$lambda$13, z3, snapshotState3, snapshotState2, screenLoggable, screenLoggable2, (Function0) objRememberedValue9);
                            Unit unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(-1224400529);
                            int i12 = i11 & 896;
                            final UUID uuid4 = uuid3;
                            boolean zChanged = (i12 == 256) | composer2.changed(snapshotState3) | composer2.changedInstance(current2) | composer2.changedInstance(uuid3) | ((i11 & 29360128) == 8388608);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue10 == companion.getEmpty()) {
                                final boolean z6 = z3;
                                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ScreenLoggable2.ScreenLoggable$lambda$23$lambda$22(snapshotState2, current2, uuid4, function015, z6, snapshotState3, (DisposableEffectScope) obj);
                                    }
                                };
                                uuid2 = uuid4;
                                snapshotState = snapshotState3;
                                snapshotState2 = snapshotState2;
                                z3 = z6;
                                composer2.updateRememberedValue(objRememberedValue10);
                            } else {
                                snapshotState = snapshotState3;
                                uuid2 = uuid4;
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer2, 6);
                            if (loadedState instanceof LoggableViewState2.Completed) {
                                composer2.startReplaceGroup(-834152443);
                                Collection<PerformanceIndicator> collectionValues = ScreenLoggable$lambda$11(snapshotState4CollectAsState).values();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    Iterator it2 = it;
                                    if (((PerformanceIndicator) next).getState() == PerformanceIndicator.State.COMPLETED) {
                                        arrayList.add(next);
                                    }
                                    it = it2;
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((PerformanceIndicator) it3.next()).getIdentifier());
                                }
                                LoggableViewState2.Completed completed = (LoggableViewState2.Completed) loadedState;
                                boolean zContainsAll = arrayList2.containsAll(completed.getDependentIdentifiers());
                                Collection<PerformanceIndicator> collectionValues2 = ScreenLoggable$lambda$11(snapshotState4CollectAsState).values();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = collectionValues2.iterator();
                                while (it4.hasNext()) {
                                    boolean z7 = zContainsAll;
                                    Object next2 = it4.next();
                                    LoggableViewState2.Completed completed2 = completed;
                                    Iterator it5 = it4;
                                    if (((PerformanceIndicator) next2).getState() == PerformanceIndicator.State.FAILED) {
                                        arrayList3.add(next2);
                                    }
                                    zContainsAll = z7;
                                    completed = completed2;
                                    it4 = it5;
                                }
                                boolean z8 = zContainsAll;
                                LoggableViewState2.Completed completed3 = completed;
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it6 = arrayList3.iterator();
                                while (it6.hasNext()) {
                                    arrayList4.add(((PerformanceIndicator) it6.next()).getIdentifier());
                                }
                                if (arrayList4.isEmpty()) {
                                    z5 = false;
                                    if (z8) {
                                        SnapshotState snapshotState4 = snapshotState;
                                        if (z5) {
                                            composer2.startReplaceGroup(-832352800);
                                            ScreenLoggable screenLoggableScreenLoggable$lambda$132 = ScreenLoggable$lambda$13(snapshotState2);
                                            ScreenLoggable screenLoggable3 = ScreenLoggable.STARTED;
                                            ScreenLoggable screenLoggable4 = ScreenLoggable.COMPLETED;
                                            composer2.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance2 = composer2.changedInstance(current2) | composer2.changedInstance(uuid2) | ((i11 & 3670016) == 1048576);
                                            Object objRememberedValue11 = composer2.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue11 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ScreenLoggable2.ScreenLoggable$lambda$31$lambda$30(current2, uuid2, function07);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue11);
                                            }
                                            composer2.endReplaceGroup();
                                            ScreenLoggable$compareAndSet(screenLoggableScreenLoggable$lambda$132, z3, snapshotState4, snapshotState2, screenLoggable3, screenLoggable4, (Function0) objRememberedValue11);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-831979932);
                                            composer2.endReplaceGroup();
                                        }
                                    } else {
                                        composer2.startReplaceGroup(-832969297);
                                        Unit unit2 = Unit.INSTANCE;
                                        composer2.startReplaceGroup(-1224400529);
                                        boolean zChanged2 = (i12 == 256) | composer2.changed(snapshotState) | composer2.changedInstance(current2) | composer2.changedInstance(uuid2) | ((i11 & 458752) == 131072);
                                        Object objRememberedValue12 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            boolean z9 = z3;
                                            objRememberedValue12 = new ScreenLoggable4(snapshotState2, current2, uuid2, function014, snapshotState, z9, null);
                                            function014 = function014;
                                            z3 = z9;
                                            composer2.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer2, 6);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endReplaceGroup();
                                } else {
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        if (completed3.getDependentIdentifiers().contains((String) it7.next())) {
                                            z5 = true;
                                            break;
                                        }
                                    }
                                    z5 = false;
                                    if (z8) {
                                    }
                                    composer2.endReplaceGroup();
                                }
                            } else {
                                SnapshotState snapshotState5 = snapshotState;
                                if (loadedState instanceof LoggableViewState2.Failed) {
                                    composer2.startReplaceGroup(-831924256);
                                    ScreenLoggable screenLoggableScreenLoggable$lambda$133 = ScreenLoggable$lambda$13(snapshotState2);
                                    ScreenLoggable screenLoggable5 = ScreenLoggable.COMPLETED;
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance3 = composer2.changedInstance(current2) | composer2.changedInstance(uuid2) | ((i11 & 3670016) == 1048576);
                                    Object objRememberedValue13 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue13 == companion.getEmpty()) {
                                        objRememberedValue13 = new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ScreenLoggable2.ScreenLoggable$lambda$33$lambda$32(current2, uuid2, function07);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer2.endReplaceGroup();
                                    ScreenLoggable$compareAndSet(screenLoggableScreenLoggable$lambda$133, z3, snapshotState5, snapshotState2, screenLoggable2, screenLoggable5, (Function0) objRememberedValue13);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(loadedState instanceof LoggableViewState2.Loading)) {
                                        composer2.startReplaceGroup(388732521);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(-831546366);
                                    composer2.endReplaceGroup();
                                }
                            }
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalPerformanceIndicatorDispatcher().provides(performanceIndicatorDispatcher), AutoLoggingCompositionLocals.getLocalPerformanceLoggerContextualId().provides(uuid2)}, ComposableLambda3.rememberComposableLambda(1316937822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt.ScreenLoggable.11
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i13) {
                                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1316937822, i13, -1, "com.robinhood.android.compose.autoeventlogging.ScreenLoggable.<anonymous> (ScreenLoggable.kt:222)");
                                    }
                                    UserInteractionEventDescriptor userInteractionEventDescriptor = eventDescriptor;
                                    final Function2<Composer, Integer, Unit> function2 = content;
                                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1972973769, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt.ScreenLoggable.11.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i14) {
                                            if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1972973769, i14, -1, "com.robinhood.android.compose.autoeventlogging.ScreenLoggable.<anonymous>.<anonymous> (ScreenLoggable.kt:223)");
                                            }
                                            function2.invoke(composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function010 = function015;
                            function011 = function013;
                            z4 = z3;
                            function012 = function014;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        z3 = z2;
                        uuid3 = uuid2;
                        function08 = function06;
                        function09 = function04;
                        int i112 = i3;
                        final Function0 function0132 = function05;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        screen = eventDescriptor.getScreen();
                        if (screen == null) {
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        z4 = z2;
                        function012 = function06;
                        function011 = function05;
                        function010 = function04;
                    }
                    final UUID uuid5 = uuid2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ScreenLoggable2.ScreenLoggable$lambda$34(loadedState, eventDescriptor, z4, uuid5, function011, function012, function07, function010, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i8;
                if ((38347923 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                            z3 = z2;
                            uuid3 = uuid2;
                            function08 = function06;
                            function09 = function04;
                        }
                        int i1122 = i3;
                        final Function0 function01322 = function05;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        screen = eventDescriptor.getScreen();
                        if (screen == null) {
                        }
                    }
                }
                final UUID uuid52 = uuid2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function05 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((38347923 & i3) == 38347922) {
            }
            final UUID uuid522 = uuid2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function05 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((38347923 & i3) == 38347922) {
        }
        final UUID uuid5222 = uuid2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ScreenLoggable$lambda$16$lambda$15() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScreenLoggable$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScreenLoggable$compareAndSet(ScreenLoggable screenLoggable, boolean z, SnapshotState<Boolean> snapshotState, SnapshotState<ScreenLoggable> snapshotState2, ScreenLoggable screenLoggable2, ScreenLoggable screenLoggable3, Function0<Unit> function0) {
        if (screenLoggable == screenLoggable2) {
            if (z && ScreenLoggable$lambda$17(snapshotState)) {
                return;
            }
            snapshotState2.setValue(screenLoggable3);
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenLoggable$lambda$20$lambda$19(PerformanceLogger performanceLogger, UUID uuid, PerformanceMetricEventData.Context context, Function0 function0) {
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, PerformanceMetricEventData.Name.SCREEN_LOAD, null, uuid, context, 2, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenLoggable$lambda$31$lambda$30(PerformanceLogger performanceLogger, UUID uuid, Function0 function0) {
        performanceLogger.failMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, uuid);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenLoggable$lambda$33$lambda$32(PerformanceLogger performanceLogger, UUID uuid, Function0 function0) {
        performanceLogger.failMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, uuid);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
