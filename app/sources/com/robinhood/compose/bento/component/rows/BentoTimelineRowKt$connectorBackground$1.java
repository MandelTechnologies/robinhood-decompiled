package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class BentoTimelineRowKt$connectorBackground$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ long $connectorColor;
    final /* synthetic */ Timeline.ColorType $connectorColorType;
    final /* synthetic */ Shape $shape;

    BentoTimelineRowKt$connectorBackground$1(Timeline.ColorType colorType, long j, Shape shape) {
        this.$connectorColorType = colorType;
        this.$connectorColor = j;
        this.$shape = shape;
    }

    private static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    private static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        invoke$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(coordinates));
        return Unit.INSTANCE;
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Timeline.ColorType colorType;
        long jM21000resolveColorbMFp3s;
        Modifier modifierM4871backgroundbw27NRU;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1305945812);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305945812, i, -1, "com.robinhood.compose.bento.component.rows.connectorBackground.<anonymous> (BentoTimelineRow.kt:349)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(883480178);
        composer.startReplaceGroup(883480072);
        boolean z = this.$connectorColorType != Timeline.ColorType.TRANSPARENT && ((Boolean) composer.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue();
        composer.endReplaceGroup();
        if (z) {
            colorType = Timeline.ColorType.DISABLED;
            jM21000resolveColorbMFp3s = BentoTimelineRowKt.m21000resolveColorbMFp3s(colorType, null, composer, 48);
        } else {
            colorType = this.$connectorColorType;
            jM21000resolveColorbMFp3s = this.$connectorColor;
        }
        composer.endReplaceGroup();
        if (colorType == Timeline.ColorType.SPARKLE) {
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$connectorBackground$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoTimelineRowKt$connectorBackground$1.invoke$lambda$4$lambda$3(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            modifierM4871backgroundbw27NRU = Background3.background$default(OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue2), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, invoke$lambda$1(snapshotState), null, composer, 6, 2), this.$shape, 0.0f, 4, null);
        } else {
            modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(composed, jM21000resolveColorbMFp3s, this.$shape);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM4871backgroundbw27NRU;
    }
}
