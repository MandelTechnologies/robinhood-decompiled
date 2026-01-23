package com.robinhood.android.charts;

import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.responsive.WindowSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"fullWidthChartSize", "Landroidx/compose/ui/Modifier;", "drawMask", "brush", "Landroidx/compose/ui/graphics/Brush;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ModifiersKt {
    public static final Modifier fullWidthChartSize(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.charts.ModifiersKt.fullWidthChartSize.1

            /* compiled from: Modifiers.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.charts.ModifiersKt$fullWidthChartSize$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WindowSize.values().length];
                    try {
                        iArr[WindowSize.Compact.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WindowSize.Medium.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WindowSize.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                float f;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1061157045);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1061157045, i, -1, "com.robinhood.android.charts.fullWidthChartSize.<anonymous> (Modifiers.kt:21)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null);
                int i2 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer, 6).ordinal()];
                if (i2 == 1) {
                    f = 1.7777778f;
                } else if (i2 == 2) {
                    f = 2.76f;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 4.0f;
                }
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(modifierFillMaxWidth$default, f, false, 2, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAspectRatio$default;
            }
        }, 1, null);
    }

    public static final Modifier drawMask(Modifier modifier, final Brush brush) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return brush == null ? modifier : DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: com.robinhood.android.charts.ModifiersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt.drawMask$lambda$1(brush, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawMask$lambda$1(Brush brush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
        canvas.saveLayer(Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), drawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
        drawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6668getSrcIn0nO6VwU(), 62, null);
        canvas.restore();
        return Unit.INSTANCE;
    }
}
