package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.SegmentedControlStyle;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSegmentedControl.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0013\u0010\f\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoSegmentedControlDefaults;", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle;", "<init>", "()V", "Shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SegmentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContainerPadding", "SegmentMinHeight", "Landroidx/compose/ui/unit/Dp;", "F", "IconSpacing", "getIconSpacing-D9Ej5fM", "()F", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "colors", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Colors;", "sizing", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "getSizing", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Sizing;", "spacing", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Spacing;", "getSpacing", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SegmentedControlStyle$Typography;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoSegmentedControlDefaults, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoSegmentedControl implements SegmentedControlStyle {
    public static final int $stable = 0;
    public static final float OutlinedBorderOpacity = 0.5f;
    public static final BentoSegmentedControl INSTANCE = new BentoSegmentedControl();
    private static final RoundedCornerShape Shape = RoundedCornerShape2.RoundedCornerShape(50);
    private static final PaddingValues SegmentPadding = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(6));
    private static final PaddingValues ContainerPadding = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(2));
    private static final float SegmentMinHeight = C2002Dp.m7995constructorimpl(32);
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(4);
    private static final float OutlinedBorderSize = C2002Dp.m7995constructorimpl(1);

    private BentoSegmentedControl() {
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m20702getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m20703getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @Override // com.robinhood.compose.theme.style.SegmentedControlStyle
    @JvmName
    public SegmentedControlStyle.Colors getColors(Composer composer, int i) {
        long jM21373getBg30d7_KjU;
        long jM21372getBg20d7_KjU;
        composer.startReplaceGroup(2077399591);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2077399591, i, -1, "com.robinhood.compose.bento.component.BentoSegmentedControlDefaults.<get-colors> (BentoSegmentedControl.kt:249)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        if (bentoTheme.getColors(composer, 6).getIsDay()) {
            composer.startReplaceGroup(1627592871);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1627650438);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        }
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU();
        if (bentoTheme.getColors(composer, 6).getIsDay()) {
            composer.startReplaceGroup(1627905382);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1627963910);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, 6).m21372getBg20d7_KjU();
            composer.endReplaceGroup();
        }
        SegmentedControlStyle.Colors colors = new SegmentedControlStyle.Colors(jM21373getBg30d7_KjU, jM21425getFg0d7_KjU, jM21427getFg30d7_KjU, jM21372getBg20d7_KjU, null, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colors;
    }

    @Override // com.robinhood.compose.theme.style.SegmentedControlStyle
    @JvmName
    public SegmentedControlStyle.Sizing getSizing(Composer composer, int i) {
        composer.startReplaceGroup(-2013386635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013386635, i, -1, "com.robinhood.compose.bento.component.BentoSegmentedControlDefaults.<get-sizing> (BentoSegmentedControl.kt:267)");
        }
        SegmentedControlStyle.Sizing sizing = new SegmentedControlStyle.Sizing(SegmentMinHeight, Shape, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sizing;
    }

    @Override // com.robinhood.compose.theme.style.SegmentedControlStyle
    @JvmName
    public SegmentedControlStyle.Spacing getSpacing(Composer composer, int i) {
        composer.startReplaceGroup(-602944866);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602944866, i, -1, "com.robinhood.compose.bento.component.BentoSegmentedControlDefaults.<get-spacing> (BentoSegmentedControl.kt:274)");
        }
        SegmentedControlStyle.Spacing spacing = new SegmentedControlStyle.Spacing(SegmentPadding, ContainerPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spacing;
    }

    @Override // com.robinhood.compose.theme.style.SegmentedControlStyle
    @JvmName
    public SegmentedControlStyle.Typography getTypography(Composer composer, int i) {
        composer.startReplaceGroup(2061444230);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2061444230, i, -1, "com.robinhood.compose.bento.component.BentoSegmentedControlDefaults.<get-typography> (BentoSegmentedControl.kt:281)");
        }
        TextStyle textS = BentoTheme.INSTANCE.getTypography(composer, 6).getTextS();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        SegmentedControlStyle.Typography typography = new SegmentedControlStyle.Typography(textS, companion.getNormal().getWeight(), companion.getBold().getWeight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return typography;
    }
}
