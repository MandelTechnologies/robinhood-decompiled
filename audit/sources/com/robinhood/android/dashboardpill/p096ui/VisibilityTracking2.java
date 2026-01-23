package com.robinhood.android.dashboardpill.p096ui;

import android.content.Context;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.dashboardpill.DashboardPillData2;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.dashboardpill.p096ui.VisibilityTracking2;
import com.robinhood.hammer.android.EntryPoints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VisibilityTracking.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u0007\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"trackDashboardPillVisibility", "Landroidx/compose/ui/Modifier;", "location", "Lcom/robinhood/android/dashboardpill/DashboardPillLocation;", "lib-dashboard-pill_externalDebug", "isComposed", "", "isLifecycleStarted"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class VisibilityTracking2 {

    /* compiled from: VisibilityTracking.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1 */
    static final class C138271 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ DashboardPillData2 $location;

        C138271(DashboardPillData2 dashboardPillData2) {
            this.$location = dashboardPillData2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-902701340);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-902701340, i, -1, "com.robinhood.android.dashboardpill.ui.trackDashboardPillVisibility.<anonymous> (VisibilityTracking.kt:38)");
            }
            if (((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
            final DashboardPillManager dashboardPillManager = ((VisibilityTracking) EntryPoints.applicationEntryPoint((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).dashboardPillManager();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | composer.changedInstance(dashboardPillManager);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VisibilityTracking2.C138271.invoke$lambda$8$lambda$7(lifecycleOwner, snapshotState2, dashboardPillManager, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(invoke$lambda$1(snapshotState));
            Boolean boolValueOf2 = Boolean.valueOf(invoke$lambda$4(snapshotState2));
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(dashboardPillManager) | composer.changed(this.$location.ordinal());
            DashboardPillData2 dashboardPillData2 = this.$location;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                Object visibilityTracking4 = new VisibilityTracking4(dashboardPillManager, dashboardPillData2, snapshotState, snapshotState2, null);
                composer.updateRememberedValue(visibilityTracking4);
                objRememberedValue4 = visibilityTracking4;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue4, composer, 0);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VisibilityTracking2.C138271.invoke$lambda$11$lambda$10(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnGloballyPositioned;
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$8$lambda$7(final LifecycleOwner lifecycleOwner, final SnapshotState snapshotState, final DashboardPillManager dashboardPillManager, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$1$1$observer$1

                /* compiled from: VisibilityTracking.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$1$1$observer$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    SnapshotState<Boolean> snapshotState2 = snapshotState;
                    int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    boolean zInvoke$lambda$4 = true;
                    if (i != 1 && i != 2) {
                        zInvoke$lambda$4 = (i == 3 || i == 4) ? false : VisibilityTracking2.C138271.invoke$lambda$4(snapshotState);
                    }
                    VisibilityTracking2.C138271.invoke$lambda$5(snapshotState2, zInvoke$lambda$4);
                }
            };
            lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            return new DisposableEffectResult() { // from class: com.robinhood.android.dashboardpill.ui.VisibilityTrackingKt$trackDashboardPillVisibility$1$invoke$lambda$8$lambda$7$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                    dashboardPillManager.setVisibleLocation(null);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(SnapshotState snapshotState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            invoke$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }
    }

    public static final Modifier trackDashboardPillVisibility(Modifier modifier, DashboardPillData2 location) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        return ComposedModifier2.composed$default(modifier, null, new C138271(location), 1, null);
    }
}
