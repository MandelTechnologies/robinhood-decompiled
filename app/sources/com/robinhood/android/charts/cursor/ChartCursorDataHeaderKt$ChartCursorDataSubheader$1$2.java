package com.robinhood.android.charts.cursor;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.bugsy.BugsyRedactCompose2;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<CursorData.SubDisplayText> $adjustedQuaternaryValue$delegate;
    final /* synthetic */ boolean $clearSemanticsOnChildren;
    final /* synthetic */ Modifier $quaternaryRowModifier;
    final /* synthetic */ SnapshotFloatState2 $quaternaryRowYPosition$delegate;
    final /* synthetic */ boolean $showPlaceholder;
    final /* synthetic */ Modifier $tertiaryRowModifier;
    final /* synthetic */ SnapshotFloatState2 $tertiaryRowYPosition$delegate;
    final /* synthetic */ CursorData.SubDisplayText $tertiaryValue;

    ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2(CursorData.SubDisplayText subDisplayText, Modifier modifier, boolean z, boolean z2, SnapshotFloatState2 snapshotFloatState2, SnapshotState4<CursorData.SubDisplayText> snapshotState4, Modifier modifier2, SnapshotFloatState2 snapshotFloatState22) {
        this.$tertiaryValue = subDisplayText;
        this.$tertiaryRowModifier = modifier;
        this.$clearSemanticsOnChildren = z;
        this.$showPlaceholder = z2;
        this.$tertiaryRowYPosition$delegate = snapshotFloatState2;
        this.$adjustedQuaternaryValue$delegate = snapshotState4;
        this.$quaternaryRowModifier = modifier2;
        this.$quaternaryRowYPosition$delegate = snapshotFloatState22;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInParent(coordinates) & 4294967295L)));
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2033550897, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataSubheader.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:221)");
        }
        composer.startReplaceGroup(32293496);
        if (this.$tertiaryValue != null) {
            Modifier modifierRedactable = BugsyRedactCompose2.redactable(ModifiersKt.bentoPillPlaceholder(com.robinhood.utils.compose.extensions.ModifiersKt.clearSemanticsIf(this.$tertiaryRowModifier, this.$clearSemanticsOnChildren), this.$showPlaceholder));
            composer.startReplaceGroup(5004770);
            final SnapshotFloatState2 snapshotFloatState2 = this.$tertiaryRowYPosition$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2.invoke$lambda$1$lambda$0(snapshotFloatState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SubDisplayText2.SubDisplayText(OnGloballyPositionedModifier3.onGloballyPositioned(modifierRedactable, (Function1) objRememberedValue), this.$tertiaryValue, composer, 0, 0);
        }
        composer.endReplaceGroup();
        CursorData.SubDisplayText subDisplayTextChartCursorDataSubheader$lambda$18$lambda$17 = ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$18$lambda$17(this.$adjustedQuaternaryValue$delegate);
        if (subDisplayTextChartCursorDataSubheader$lambda$18$lambda$17 != null) {
            Modifier modifier = this.$quaternaryRowModifier;
            boolean z = this.$clearSemanticsOnChildren;
            boolean z2 = this.$showPlaceholder;
            final SnapshotFloatState2 snapshotFloatState22 = this.$quaternaryRowYPosition$delegate;
            Modifier modifierRedactable2 = BugsyRedactCompose2.redactable(ModifiersKt.bentoPillPlaceholder(com.robinhood.utils.compose.extensions.ModifiersKt.clearSemanticsIf(modifier, z), z2));
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2.invoke$lambda$4$lambda$3$lambda$2(snapshotFloatState22, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SubDisplayText2.SubDisplayText(OnGloballyPositionedModifier3.onGloballyPositioned(modifierRedactable2, (Function1) objRememberedValue2), subDisplayTextChartCursorDataSubheader$lambda$18$lambda$17, composer, 0, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue(Math.max(snapshotFloatState2.getFloatValue(), Float.intBitsToFloat((int) (LayoutCoordinates2.positionInParent(coordinates) & 4294967295L))));
        return Unit.INSTANCE;
    }
}
