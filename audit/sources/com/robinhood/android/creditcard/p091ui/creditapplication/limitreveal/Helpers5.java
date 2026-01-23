package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: Helpers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m3636d2 = {"pixelsToDp", "Landroidx/compose/ui/unit/Dp;", "pixels", "", "(ILandroidx/compose/runtime/Composer;I)F", "fadingEdge", "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.HelpersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Helpers5 {
    public static final float pixelsToDp(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-731976936);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-731976936, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.pixelsToDp (Helpers.kt:14)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    public static final Modifier fadingEdge(Modifier modifier, final Brush brush) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(brush, "brush");
        return DrawModifierKt.drawWithContent(GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI(), Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.HelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Helpers5.fadingEdge$lambda$1(brush, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fadingEdge$lambda$1(Brush brush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6651getDstIn0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }
}
