package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.ScaleFactor;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: LottieAnimation.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÃ\u0001\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aó\u0001\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010(\u001a\u001f\u0010/\u001a\u00020,*\u00020)2\u0006\u0010+\u001a\u00020*H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\u0010\u00100\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "safeMode", "", "LottieAnimation", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "speed", "", "iterations", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/layout/ScaleFactor;", "scale", "Landroidx/compose/ui/unit/IntSize;", "times-UQTWf7w", "(JJ)J", "times", "setDynamicProperties", "lottie-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.airbnb.lottie.compose.LottieAnimationKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class LottieAnimation2 {
    @JvmOverloads
    public static final void LottieAnimation(final LottieComposition lottieComposition, final Function0<Float> progress, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, boolean z6, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        AsyncUpdates asyncUpdates2;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-674272918);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z8 = (i3 & 8) != 0 ? false : z;
        final boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        final boolean z11 = (i3 & 128) != 0 ? false : z4;
        final LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        final Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final boolean z12 = (i3 & 2048) != 0 ? true : z5;
        final boolean z13 = (i3 & 4096) != 0 ? false : z6;
        final Map<String, ? extends Typeface> map2 = (i3 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates3 = (i3 & 16384) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z14 = (i3 & 32768) != 0 ? false : z7;
        if (ComposerKt.isTraceInProgress()) {
            asyncUpdates2 = asyncUpdates3;
            ComposerKt.traceEventStart(-674272918, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:95)");
        } else {
            asyncUpdates2 = asyncUpdates3;
        }
        composerStartRestartGroup.startReplaceableGroup(185152095);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new LottieDrawable();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152142);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Matrix();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final Matrix matrix = (Matrix) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152222);
        boolean zChanged = composerStartRestartGroup.changed(lottieComposition);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152274);
        if (lottieComposition == null || lottieComposition.getDuration() == 0.0f) {
            final Modifier modifier3 = modifier2;
            final boolean z15 = z10;
            final RenderMode renderMode3 = renderMode2;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final boolean z16 = z8;
            final boolean z17 = z9;
            final boolean z18 = z12;
            final boolean z19 = z13;
            final boolean z20 = z14;
            final Map<String, ? extends Typeface> map3 = map2;
            final ContentScale contentScale2 = fit;
            final boolean z21 = z11;
            final AsyncUpdates asyncUpdates4 = asyncUpdates2;
            BoxKt.Box(modifier3, composerStartRestartGroup, (i >> 6) & 14);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        LottieAnimation2.LottieAnimation(lottieComposition, progress, modifier3, z16, z17, z15, renderMode3, z21, lottieDynamicProperties3, center, contentScale2, z18, z19, map3, asyncUpdates4, z20, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Rect bounds = lottieComposition.getBounds();
        Modifier modifierLottieSize = LottieAnimationSizeNode4.lottieSize(modifier2, bounds.width(), bounds.height());
        final Modifier modifier4 = modifier2;
        final boolean z22 = z10;
        final boolean z23 = z14;
        final ContentScale contentScale3 = fit;
        final RenderMode renderMode4 = renderMode2;
        final Alignment alignment2 = center;
        final AsyncUpdates asyncUpdates5 = asyncUpdates2;
        Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                Rect rect = bounds;
                ContentScale contentScale4 = contentScale3;
                Alignment alignment3 = alignment2;
                Matrix matrix2 = matrix;
                LottieDrawable lottieDrawable2 = lottieDrawable;
                boolean z24 = z22;
                boolean z25 = z23;
                RenderMode renderMode5 = renderMode4;
                AsyncUpdates asyncUpdates6 = asyncUpdates5;
                LottieComposition lottieComposition2 = lottieComposition;
                Map<String, Typeface> map4 = map2;
                LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
                boolean z26 = z8;
                boolean z27 = z9;
                boolean z28 = z11;
                boolean z29 = z12;
                boolean z30 = z13;
                Function0<Float> function0 = progress;
                SnapshotState<LottieDynamicProperties> snapshotState2 = snapshotState;
                Canvas canvas = Canvas.getDrawContext().getCanvas();
                long jSize = SizeKt.Size(rect.width(), rect.height());
                long jIntSize = IntSize2.IntSize(MathKt.roundToInt(Size.m6583getWidthimpl(Canvas.mo6963getSizeNHjbRc())), MathKt.roundToInt(Size.m6580getHeightimpl(Canvas.mo6963getSizeNHjbRc())));
                long jMo7234computeScaleFactorH7hwNQA = contentScale4.mo7234computeScaleFactorH7hwNQA(jSize, Canvas.mo6963getSizeNHjbRc());
                long jMo6433alignKFBX0sM = alignment3.mo6433alignKFBX0sM(LottieAnimation2.m9149timesUQTWf7w(jSize, jMo7234computeScaleFactorH7hwNQA), jIntSize, Canvas.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate(IntOffset.m8038getXimpl(jMo6433alignKFBX0sM), IntOffset.m8039getYimpl(jMo6433alignKFBX0sM));
                matrix2.preScale(ScaleFactor.m7277getScaleXimpl(jMo7234computeScaleFactorH7hwNQA), ScaleFactor.m7278getScaleYimpl(jMo7234computeScaleFactorH7hwNQA));
                lottieDrawable2.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z24);
                lottieDrawable2.setSafeMode(z25);
                lottieDrawable2.setRenderMode(renderMode5);
                lottieDrawable2.setAsyncUpdates(asyncUpdates6);
                lottieDrawable2.setComposition(lottieComposition2);
                lottieDrawable2.setFontMap(map4);
                if (lottieDynamicProperties4 != LottieAnimation2.LottieAnimation$lambda$3(snapshotState2)) {
                    LottieDynamicProperties lottieDynamicPropertiesLottieAnimation$lambda$3 = LottieAnimation2.LottieAnimation$lambda$3(snapshotState2);
                    if (lottieDynamicPropertiesLottieAnimation$lambda$3 != null) {
                        lottieDynamicPropertiesLottieAnimation$lambda$3.removeFrom$lottie_compose_release(lottieDrawable2);
                    }
                    if (lottieDynamicProperties4 != null) {
                        lottieDynamicProperties4.addTo$lottie_compose_release(lottieDrawable2);
                    }
                    LottieAnimation2.LottieAnimation$lambda$4(snapshotState2, lottieDynamicProperties4);
                }
                lottieDrawable2.setOutlineMasksAndMattes(z26);
                lottieDrawable2.setApplyingOpacityToLayersEnabled(z27);
                lottieDrawable2.setMaintainOriginalImageBounds(z28);
                lottieDrawable2.setClipToCompositionBounds(z29);
                lottieDrawable2.setClipTextToBoundingBox(z30);
                lottieDrawable2.setProgress(function0.invoke().floatValue());
                lottieDrawable2.setBounds(0, 0, rect.width(), rect.height());
                lottieDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix2);
            }
        };
        final boolean z24 = z12;
        final boolean z25 = z11;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final boolean z26 = z8;
        final boolean z27 = z9;
        final boolean z28 = z13;
        final Map<String, ? extends Typeface> map4 = map2;
        Canvas2.Canvas(modifierLottieSize, function1, composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    LottieAnimation2.LottieAnimation(lottieComposition, progress, modifier4, z26, z27, z22, renderMode4, z25, lottieDynamicProperties4, alignment2, contentScale3, z24, z28, map4, asyncUpdates5, z23, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    @JvmOverloads
    public static final void LottieAnimation(final LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, RenderMode renderMode, boolean z6, boolean z7, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z8, boolean z9, Map<String, ? extends Typeface> map, boolean z10, AsyncUpdates asyncUpdates, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        Alignment alignment2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1151869807);
        Modifier modifier2 = (i5 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i5 & 4) != 0 ? true : z;
        boolean z12 = (i5 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i5 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z13 = (i5 & 128) != 0 ? false : z3;
        boolean z14 = (i5 & 256) != 0 ? false : z4;
        boolean z15 = (i5 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i5 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z16 = (i5 & 2048) != 0 ? false : z6;
        final boolean z17 = (i5 & 4096) != 0 ? false : z7;
        final LottieDynamicProperties lottieDynamicProperties2 = (i5 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i5 & 16384) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i5 & 32768) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z18 = (i5 & 65536) != 0 ? true : z8;
        boolean z19 = (i5 & 131072) != 0 ? false : z9;
        Map<String, ? extends Typeface> map2 = (i5 & 262144) != 0 ? null : map;
        boolean z20 = (i5 & 524288) != 0 ? false : z10;
        AsyncUpdates asyncUpdates2 = (i5 & 1048576) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            alignment2 = center;
            ComposerKt.traceEventStart(-1151869807, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:212)");
        } else {
            alignment2 = center;
        }
        int i7 = i2 >> 3;
        final boolean z21 = z11;
        final boolean z22 = z12;
        final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
        final int i8 = i6;
        final boolean z23 = z16;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, z21, z22, z23, lottieClipSpec3, f2, i8, null, false, false, composerStartRestartGroup, (i7 & 896) | (i7 & 112) | 8 | ((i3 << 6) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        final Modifier modifier3 = modifier2;
        final boolean z24 = z15;
        composerStartRestartGroup.startReplaceableGroup(185157140);
        boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    return Float.valueOf(LottieAnimation2.LottieAnimation$lambda$6(lottieAnimationStateAnimateLottieCompositionAsState));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        int i9 = i2 >> 12;
        int i10 = i3 << 15;
        int i11 = (i9 & 7168) | ((i2 << 3) & 896) | 134217736 | (i9 & 57344) | (i9 & 458752) | ((i3 << 18) & 3670016) | (29360128 & i10) | (i10 & 1879048192);
        int i12 = i3 >> 15;
        final Alignment alignment3 = alignment2;
        final RenderMode renderMode3 = renderMode2;
        final boolean z25 = z13;
        final boolean z26 = z14;
        final ContentScale contentScale2 = fit;
        final boolean z27 = z18;
        final boolean z28 = z19;
        final Map<String, ? extends Typeface> map3 = map2;
        final boolean z29 = z20;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        LottieAnimation(lottieComposition, function0, modifier3, z25, z26, z24, renderMode3, z17, lottieDynamicProperties2, alignment3, contentScale2, z27, z28, map3, asyncUpdates3, z29, composerStartRestartGroup, i11, (i12 & 896) | (i12 & 14) | 4096 | (i12 & 112) | ((i4 << 12) & 57344) | ((i3 >> 12) & 458752), 0);
        final float f3 = f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    LottieAnimation2.LottieAnimation(lottieComposition, modifier3, z21, z22, lottieClipSpec3, f3, i8, z25, z26, z24, renderMode3, z23, z17, lottieDynamicProperties2, alignment3, contentScale2, z27, z28, map3, z29, asyncUpdates3, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m9149timesUQTWf7w(long j, long j2) {
        return IntSize2.IntSize((int) (Size.m6583getWidthimpl(j) * ScaleFactor.m7277getScaleXimpl(j2)), (int) (Size.m6580getHeightimpl(j) * ScaleFactor.m7278getScaleYimpl(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(SnapshotState<LottieDynamicProperties> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LottieAnimation$lambda$4(SnapshotState<LottieDynamicProperties> snapshotState, LottieDynamicProperties lottieDynamicProperties) {
        snapshotState.setValue(lottieDynamicProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
