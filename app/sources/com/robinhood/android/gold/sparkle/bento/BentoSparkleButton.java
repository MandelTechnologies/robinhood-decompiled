package com.robinhood.android.gold.sparkle.bento;

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
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSparkleButton.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0011\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/bento/BentoSparkleButtonDefaults;", "", "<init>", "()V", "Shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "IconSpacing", "getIconSpacing-D9Ej5fM", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "lib-gold-sparkle-bento_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonDefaults, reason: use source file name */
/* loaded from: classes10.dex */
final class BentoSparkleButton {
    public static final BentoSparkleButton INSTANCE = new BentoSparkleButton();
    private static final RoundedCornerShape Shape = RoundedCornerShape2.RoundedCornerShape(50);
    private static final PaddingValues ContentPadding = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(20), C2002Dp.m7995constructorimpl(10));
    private static final float MinHeight = C2002Dp.m7995constructorimpl(44);
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(8);

    private BentoSparkleButton() {
    }

    public final RoundedCornerShape getShape() {
        return Shape;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m15085getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m15084getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    @JvmName
    public final TextStyle getTextStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-346025951, i, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonDefaults.<get-textStyle> (BentoSparkleButton.kt:203)");
        }
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyleM7655copyp1EtxEg$default;
    }
}
