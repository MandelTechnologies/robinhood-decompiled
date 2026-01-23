package com.robinhood.android.sdui.chartgroup;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.android.charts.model.AxisType;
import com.robinhood.android.charts.model.ProtoAxis;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartAxis.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ProtoAxis $axis;
    final /* synthetic */ Color $color;
    final /* synthetic */ SnapshotIntState2 $labelWidth$delegate;
    final /* synthetic */ SnapshotIntState2 $parentWidth$delegate;
    final /* synthetic */ boolean $shouldUseTransparentBackground;
    final /* synthetic */ String $text;

    ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1(boolean z, Color color, String str, ProtoAxis protoAxis, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22) {
        this.$shouldUseTransparentBackground = z;
        this.$color = color;
        this.$text = str;
        this.$axis = protoAxis;
        this.$labelWidth$delegate = snapshotIntState2;
        this.$parentWidth$delegate = snapshotIntState22;
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
            ComposerKt.traceEventStart(1127059424, i, -1, "com.robinhood.android.sdui.chartgroup.ChartAxisScrubLabel.<anonymous>.<anonymous> (ChartAxis.kt:294)");
        }
        composer.startReplaceGroup(772351469);
        Modifier modifierAbsoluteOffset = Modifier.INSTANCE;
        ProtoAxis protoAxis = this.$axis;
        final SnapshotIntState2 snapshotIntState2 = this.$labelWidth$delegate;
        final SnapshotIntState2 snapshotIntState22 = this.$parentWidth$delegate;
        composer.startReplaceGroup(772352377);
        if (protoAxis.getType() == AxisType.f3954Y) {
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifierAbsoluteOffset, null, true, 1, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1.invoke$lambda$4$lambda$1$lambda$0(snapshotIntState2, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierWrapContentSize$default, (Function1) objRememberedValue);
            composer.startReplaceGroup(-1633490746);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1.invoke$lambda$4$lambda$3$lambda$2(snapshotIntState2, snapshotIntState22, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            modifierAbsoluteOffset = OffsetKt.absoluteOffset(modifierOnSizeChanged, (Function1) objRememberedValue2);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.background(modifierAbsoluteOffset, new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6)), this.$shouldUseTransparentBackground ? 0.6f : 1.0f), C2002Dp.m7995constructorimpl(10), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
        Color color = this.$color;
        composer.startReplaceGroup(772398877);
        long jM21371getBg0d7_KjU = color == null ? bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU() : color.getValue();
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(this.$text, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM21371getBg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 905994240, 0, 7400);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$4$lambda$3$lambda$2(SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, Density absoluteOffset) {
        Intrinsics.checkNotNullParameter(absoluteOffset, "$this$absoluteOffset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((snapshotIntState2.getIntValue() > snapshotIntState22.getIntValue() ? (-(snapshotIntState2.getIntValue() - snapshotIntState22.getIntValue())) / 2 : 0) << 32) | (0 & 4294967295L)));
    }
}
