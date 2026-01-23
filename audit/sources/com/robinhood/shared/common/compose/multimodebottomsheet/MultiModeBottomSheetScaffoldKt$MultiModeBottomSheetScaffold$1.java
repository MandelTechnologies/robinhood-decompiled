package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiModeBottomSheetScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
final class MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1 implements Function3<Integer, Composer, Integer, Unit> {
    final /* synthetic */ MultiModeBottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ Function3<Column5, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ Function1<DrawScope, Unit> $sheetCustomShadow;
    final /* synthetic */ Function2<Composer, Integer, Unit> $sheetDragHandle;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;

    /* JADX WARN: Multi-variable type inference failed */
    MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1(MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, float f, boolean z, Shape shape, long j, long j2, float f2, float f3, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super DrawScope, Unit> function1, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3) {
        this.$scaffoldState = multiModeBottomSheetScaffoldState;
        this.$sheetMaxWidth = f;
        this.$sheetSwipeEnabled = z;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f2;
        this.$sheetShadowElevation = f3;
        this.$sheetDragHandle = function2;
        this.$sheetCustomShadow = function1;
        this.$sheetContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
        invoke(num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final int i, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1869063050, i3, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffold.<anonymous> (MultiModeBottomSheetScaffold.kt:112)");
        }
        MultiModeSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = ((i3 & 14) == 4) | composer.changed(this.$scaffoldState);
        final MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState = this.$scaffoldState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1.invoke$lambda$3$lambda$2(multiModeBottomSheetScaffoldState, i, (IntSize) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MultiModeBottomSheetScaffoldKt.m24811MultiModeStandardBottomSheetBErStDs(bottomSheetState, (Function1) objRememberedValue, this.$sheetMaxWidth, this.$sheetSwipeEnabled, this.$sheetShape, this.$sheetContainerColor, this.$sheetContentColor, this.$sheetTonalElevation, this.$sheetShadowElevation, this.$sheetDragHandle, this.$sheetCustomShadow, this.$sheetContent, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiModeDraggableAnchors invoke$lambda$3$lambda$2(final MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, final int i, IntSize intSize) {
        final int packedValue = (int) (intSize.getPackedValue() & 4294967295L);
        return MultiModeAnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiModeBottomSheetScaffoldKt$MultiModeBottomSheetScaffold$1.invoke$lambda$3$lambda$2$lambda$1(multiModeBottomSheetScaffoldState, i, packedValue, (DraggableAnchorsConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, int i, int i2, DraggableAnchorsConfig DraggableAnchors) {
        Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
        for (MultiModeSheetState2 multiModeSheetState2 : multiModeBottomSheetScaffoldState.getBottomSheetState().m2764xea28fa74()) {
            MultiModeSheetState2.Expanded expanded = MultiModeSheetState2.Expanded.INSTANCE;
            if (Intrinsics.areEqual(multiModeSheetState2, expanded)) {
                DraggableAnchors.m2752at(expanded, Math.max(i - i2, 0));
            } else {
                MultiModeSheetState2.Hidden hidden = MultiModeSheetState2.Hidden.INSTANCE;
                if (Intrinsics.areEqual(multiModeSheetState2, hidden)) {
                    DraggableAnchors.m2752at(hidden, i);
                } else {
                    if (!(multiModeSheetState2 instanceof MultiModeSheetState2.FixedHeight)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DraggableAnchors.m2752at(multiModeSheetState2, i - ((MultiModeSheetState2.FixedHeight) multiModeSheetState2).getHeight());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
