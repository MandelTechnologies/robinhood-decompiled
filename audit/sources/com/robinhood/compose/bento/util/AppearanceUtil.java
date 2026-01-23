package com.robinhood.compose.bento.util;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.compose.bento.util.AppearanceUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppearanceUtil.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u0007\u001a\u00020\bX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, m3636d2 = {"onAppear", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "lib-compose-bento_externalRelease", "isVisible", "", "lastVisibilityCheckTimestamp", "", "lastCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lifecycleEvent", "Landroidx/lifecycle/Lifecycle$Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.util.AppearanceUtilKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AppearanceUtil {

    /* compiled from: AppearanceUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1 */
    static final class C326571 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function0<Unit> $onAppear;

        C326571(Function0<Unit> function0) {
            this.$onAppear = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$14$lambda$13(final LifecycleOwner lifecycleOwner, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$1$1$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    snapshotState.setValue(event);
                }
            };
            lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            return new DisposableEffectResult() { // from class: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$invoke$lambda$14$lambda$13$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Lifecycle.Event invoke$lambda$10(SnapshotState<Lifecycle.Event> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LayoutCoordinates invoke$lambda$7(SnapshotState<LayoutCoordinates> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$17(SnapshotState snapshotState, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            snapshotState.setValue(coordinates);
            return Unit.INSTANCE;
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-463713217);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463713217, i, -1, "com.robinhood.compose.bento.util.onAppear.<anonymous> (AppearanceUtil.kt:25)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotLongState3.mutableLongStateOf(0L);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
            composer.endReplaceGroup();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Rect rect = new Rect();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(lifecycleOwner);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppearanceUtil.C326571.invoke$lambda$14$lambda$13(lifecycleOwner, snapshotState3, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, 0);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAppear);
            Function0<Unit> function0 = this.$onAppear;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new AppearanceUtil3(snapshotState, function0, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 6);
            LayoutCoordinates layoutCoordinatesInvoke$lambda$7 = invoke$lambda$7(snapshotState2);
            Lifecycle.Event eventInvoke$lambda$10 = invoke$lambda$10(snapshotState3);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(view) | composer.changedInstance(rect);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                Object appearanceUtil4 = new AppearanceUtil4(view, rect, snapshotState2, snapshotState3, snapshotLongState2, snapshotState, null);
                composer.updateRememberedValue(appearanceUtil4);
                objRememberedValue7 = appearanceUtil4;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(layoutCoordinatesInvoke$lambda$7, eventInvoke$lambda$10, (Function2) objRememberedValue7, composer, 0);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppearanceUtil.C326571.invoke$lambda$18$lambda$17(snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnGloballyPositioned;
        }
    }

    public static final Modifier onAppear(Modifier modifier, Function0<Unit> onAppear) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        return ComposedModifier2.composed$default(modifier, null, new C326571(onAppear), 1, null);
    }
}
