package com.robinhood.android.futures.sharedfuturesui.animations;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0007\u001a'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\"\u0010#\u001a\r\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\"\u0016\u0010\u0016\u001a\u00020\rX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u001a\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006'²\u0006\n\u0010(\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"pillLoadingPlaceholder", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderBrush", "Landroidx/compose/ui/graphics/Brush;", "isLoading", "", "alpha", "", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "animationDurationMills", "", "drawPill", "Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;", "pillLoadingPlaceholder-IdJWcmQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/graphics/Brush;ZFFILcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;)Landroidx/compose/ui/Modifier;", "pillLoadingPlaceholder-0cUbh54", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/graphics/Brush;FFILcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;)Landroidx/compose/ui/Modifier;", "DefaultPillBorderWidth", "getDefaultPillBorderWidth", "()F", "F", "DefaultAnimationDurationMills", "defaultPillOutlineLinearGradiant", "bentoColors", "Lcom/robinhood/compose/bento/theme/BentoColors;", "dotRadialGradient", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "dotRadialGradient-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Brush;", "PreviewLoadingShape", "", "(Landroidx/compose/runtime/Composer;I)V", "lib-shared-futures-ui_externalDebug", "progress"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PillLoadingPlaceholderModifierKt {
    public static final int DefaultAnimationDurationMills = 500;
    private static final float DefaultPillBorderWidth = C2002Dp.m7995constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingShape$lambda$1(int i, Composer composer, int i2) {
        PreviewLoadingShape(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: pillLoadingPlaceholder-IdJWcmQ, reason: not valid java name */
    public static final Modifier m14745pillLoadingPlaceholderIdJWcmQ(Modifier pillLoadingPlaceholder, Shape shape, long j, Brush borderBrush, boolean z, float f, float f2, int i, PillLoadingPlaceholderDrawPill drawPill) {
        Intrinsics.checkNotNullParameter(pillLoadingPlaceholder, "$this$pillLoadingPlaceholder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        Intrinsics.checkNotNullParameter(drawPill, "drawPill");
        return !z ? pillLoadingPlaceholder : m14743pillLoadingPlaceholder0cUbh54(pillLoadingPlaceholder, shape, j, borderBrush, f, f2, i, drawPill);
    }

    /* renamed from: pillLoadingPlaceholder-0cUbh54$default, reason: not valid java name */
    public static /* synthetic */ Modifier m14744pillLoadingPlaceholder0cUbh54$default(Modifier modifier, Shape shape, long j, Brush brush, float f, float f2, int i, PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        return m14743pillLoadingPlaceholder0cUbh54(modifier, shape, j, brush, f, (i2 & 16) != 0 ? DefaultPillBorderWidth : f2, (i2 & 32) != 0 ? 500 : i, (i2 & 64) != 0 ? PillLoadingPlaceholderDrawPill.INSTANCE.getDefault() : pillLoadingPlaceholderDrawPill);
    }

    /* renamed from: pillLoadingPlaceholder-0cUbh54, reason: not valid java name */
    public static final Modifier m14743pillLoadingPlaceholder0cUbh54(Modifier pillLoadingPlaceholder, final Shape shape, long j, Brush borderBrush, float f, float f2, int i, PillLoadingPlaceholderDrawPill drawPill) {
        Intrinsics.checkNotNullParameter(pillLoadingPlaceholder, "$this$pillLoadingPlaceholder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        Intrinsics.checkNotNullParameter(drawPill, "drawPill");
        return ComposedModifier2.composed$default(Background3.m4871backgroundbw27NRU(GraphicsLayerModifier6.graphicsLayer(pillLoadingPlaceholder, new Function1() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderModifierKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PillLoadingPlaceholderModifierKt.pillLoadingPlaceholder_0cUbh54$lambda$0(shape, (GraphicsLayerScope) obj);
            }
        }), j, shape), null, new PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2(i, f2, shape, f, borderBrush, drawPill, j), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pillLoadingPlaceholder_0cUbh54$lambda$0(Shape shape, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(true);
        graphicsLayer.setShape(shape);
        graphicsLayer.mo6762setCompositingStrategyaDBOjCE(GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    public static final float getDefaultPillBorderWidth() {
        return DefaultPillBorderWidth;
    }

    public static final Brush defaultPillOutlineLinearGradiant(BentoColors bentoColors) {
        Intrinsics.checkNotNullParameter(bentoColors, "bentoColors");
        return Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(bentoColors.getPrimeLight())), Tuples4.m3642to(Float.valueOf(0.4f), Color.m6701boximpl(bentoColors.getPrimeLight())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoColors.m21452getNegative0d7_KjU()))}, 0L, 0L, 0, 14, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dotRadialGradient-qcb84PM, reason: not valid java name */
    public static final Brush m14742dotRadialGradientqcb84PM(long j, long j2, float f) {
        return Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(0.3f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))}, j2, f, 0, 8, (Object) null);
    }

    private static final void PreviewLoadingShape(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(326976658);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(326976658, i, -1, "com.robinhood.android.futures.sharedfuturesui.animations.PreviewLoadingShape (PillLoadingPlaceholderModifier.kt:186)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableSingletons$PillLoadingPlaceholderModifierKt.INSTANCE.m14737getLambda$527706038$lib_shared_futures_ui_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderModifierKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PillLoadingPlaceholderModifierKt.PreviewLoadingShape$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
