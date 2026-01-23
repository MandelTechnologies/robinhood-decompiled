package com.robinhood.android.educationtour.compose;

import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"educationTourId", "Landroidx/compose/ui/Modifier;", "elementId", "", "onClick", "Lkotlin/Function0;", "", "onFocus", "isScrolling", "", "tooltipNibDown", "lib-education-tour_externalDebug", "offsetInRoot", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/unit/IntSize;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ModifiersKt {
    public static /* synthetic */ Modifier educationTourId$default(Modifier modifier, String str, Function0 function0, Function0 function02, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.educationtour.compose.ModifiersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.robinhood.android.educationtour.compose.ModifiersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return educationTourId(modifier, str, function03, function02, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.educationtour.compose.ModifiersKt$educationTourId$3 */
    static final class C144723 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ String $elementId;
        final /* synthetic */ boolean $isScrolling;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Function0<Unit> $onFocus;
        final /* synthetic */ boolean $tooltipNibDown;

        C144723(boolean z, Function0<Unit> function0, Function0<Unit> function02, String str, boolean z2) {
            this.$isScrolling = z;
            this.$onClick = function0;
            this.$onFocus = function02;
            this.$elementId = str;
            this.$tooltipNibDown = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            long j;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(268113134);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(268113134, i, -1, "com.robinhood.android.educationtour.compose.educationTourId.<anonymous> (Modifiers.kt:35)");
            }
            final List list = (List) composer.consume(LocalEducationTourScreen.getLocalEducationTourScreen());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                j = 4294967295L;
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                j = 4294967295L;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                long j2 = 0;
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.m8056constructorimpl((j2 & j) | (j2 << 32))), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            Object[] objArr = {Offset.m6534boximpl(invoke$lambda$1(snapshotState)), IntSize.m8055boximpl(invoke$lambda$4(snapshotState2)), Boolean.valueOf(this.$isScrolling), this.$onClick, this.$onFocus};
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(list) | composer.changed(this.$elementId) | composer.changed(this.$onClick) | composer.changed(this.$onFocus);
            String str = this.$elementId;
            Function0<Unit> function0 = this.$onClick;
            Function0<Unit> function02 = this.$onFocus;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                Object modifiersKt$educationTourId$3$1$1 = new ModifiersKt$educationTourId$3$1$1(list, str, function0, function02, snapshotState, snapshotState2, null);
                composer.updateRememberedValue(modifiersKt$educationTourId$3$1$1);
                objRememberedValue3 = modifiersKt$educationTourId$3$1$1;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
            Object objConsume = composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(list) | composer.changed(this.$elementId);
            final String str2 = this.$elementId;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.educationtour.compose.ModifiersKt$educationTourId$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C144723.invoke$lambda$10$lambda$9(list, str2, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(objConsume, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composer.changedInstance(list);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.educationtour.compose.ModifiersKt$educationTourId$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C144723.invoke$lambda$13$lambda$12(list, snapshotState, snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue5);
            TooltipData.Behavior behavior = new TooltipData.Behavior(Boolean.FALSE, null, null, null, 14, null);
            RdsTooltipView.NibDirection nibDirection = this.$tooltipNibDown ? null : RdsTooltipView.NibDirection.f4107UP;
            if (nibDirection == null) {
                nibDirection = RdsTooltipView.NibDirection.DOWN;
            }
            Modifier modifier = com.robinhood.tooltips.ModifiersKt.tooltip$default(modifierOnGloballyPositioned, "", new TooltipData.Layout(nibDirection, 0.0f, null, null, 14, null), behavior, this.$elementId, false, 16, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier;
        }

        private static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
            snapshotState.setValue(Offset.m6534boximpl(j));
        }

        private static final void invoke$lambda$5(SnapshotState<IntSize> snapshotState, long j) {
            snapshotState.setValue(IntSize.m8055boximpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$10$lambda$9(final List list, final String str, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.educationtour.compose.ModifiersKt$educationTourId$3$invoke$lambda$10$lambda$9$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ComposeEducationTourManager.INSTANCE.removeElementData$lib_education_tour_externalDebug(((ComposeEducationTourScreen) it.next()).getScreenName(), str);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(List list, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (ComposeEducationTourManager.INSTANCE.shouldTrackElements$lib_education_tour_externalDebug(((ComposeEducationTourScreen) it.next()).getScreenName())) {
                    invoke$lambda$2(snapshotState, LayoutCoordinates2.positionInRoot(coordinates));
                    invoke$lambda$5(snapshotState2, coordinates.mo7241getSizeYbymL2g());
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$4(SnapshotState<IntSize> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }
    }

    public static final Modifier educationTourId(Modifier modifier, String elementId, Function0<Unit> onClick, Function0<Unit> onFocus, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        return ComposedModifier2.composed$default(modifier, null, new C144723(z, onClick, onFocus, elementId, z2), 1, null);
    }
}
