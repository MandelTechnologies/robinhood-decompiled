package com.robinhood.shared.documents.prism.animations;

import androidx.compose.animation.ColorVectorConverter;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.documents.prism.animations.FaceIconComposable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FaceIconComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"FaceIconComposable", "", "state", "Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/documents/prism/animations/FaceIconAnimationState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getCornerPath", "Landroidx/compose/ui/graphics/Path;", "center", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "cornerScale", "", "cornerProgress", "getCornerPath-fk0IrS8", "(JJFF)Landroidx/compose/ui/graphics/Path;", "FaceStrokeRatio", "EyeWidthRatio", "EyeHeightRatio", "MouthOffsetRatio", "MouthRadiusRatio", "CornerRadiusRatio", "feature-prism_externalDebug", "idlingCornerScale", "strokeColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FaceIconComposable2 {
    private static final float CornerRadiusRatio = 0.22f;
    private static final float EyeHeightRatio = 0.15f;
    private static final float EyeWidthRatio = 0.1f;
    private static final float FaceStrokeRatio = 0.04f;
    private static final float MouthOffsetRatio = 0.05f;
    private static final float MouthRadiusRatio = 0.15f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceIconComposable$lambda$10(FaceIconComposable faceIconComposable, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FaceIconComposable(faceIconComposable, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final float FaceIconComposable$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final long FaceIconComposable$lambda$2(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float FaceIconComposable$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float FaceIconComposable$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceIconComposable$lambda$9$lambda$8(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, SnapshotState4 snapshotState43, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * FaceStrokeRatio;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * 0.15f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * 0.1f;
        float f = 2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * 0.1f) + (fIntBitsToFloat2 / f);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * 0.05f;
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * 0.15f;
        Path pathM25320getCornerPathfk0IrS8 = m25320getCornerPathfk0IrS8(Canvas.mo6962getCenterF1C5BW0(), Canvas.mo6963getSizeNHjbRc(), FaceIconComposable$lambda$4(snapshotState4), FaceIconComposable$lambda$6(snapshotState42));
        long jFaceIconComposable$lambda$2 = FaceIconComposable$lambda$2(snapshotState43);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        int iM6849getRoundKaPHkGw = companion.m6849getRoundKaPHkGw();
        StrokeJoin.Companion companion2 = StrokeJoin.INSTANCE;
        DrawScope.m6955drawPathLG529CI$default(Canvas, pathM25320getCornerPathfk0IrS8, jFaceIconComposable$lambda$2, 0.0f, new Stroke(fIntBitsToFloat, 0.0f, iM6849getRoundKaPHkGw, companion2.m6857getRoundLxFBmk8(), null, 18, null), null, 0, 52, null);
        if (FaceIconComposable$lambda$6(snapshotState42) == 1.0f) {
            long jFaceIconComposable$lambda$22 = FaceIconComposable$lambda$2(snapshotState43);
            float f2 = fIntBitsToFloat / f;
            float fIntBitsToFloat7 = (Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() >> 32)) - fIntBitsToFloat3) - f2;
            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L)) - fIntBitsToFloat4;
            DrawScope.m6958drawRectnJ9OG0$default(Canvas, jFaceIconComposable$lambda$22, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat7) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            long jFaceIconComposable$lambda$23 = FaceIconComposable$lambda$2(snapshotState43);
            float fIntBitsToFloat9 = (Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() >> 32)) + fIntBitsToFloat3) - f2;
            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L)) - fIntBitsToFloat4;
            DrawScope.m6958drawRectnJ9OG0$default(Canvas, jFaceIconComposable$lambda$23, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat9) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat10) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            Path Path = AndroidPath_androidKt.Path();
            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() >> 32));
            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L)) + fIntBitsToFloat5;
            Path.arcTo(Rect2.m6564Rect3MmeM6k(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat11) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat12) & 4294967295L)), fIntBitsToFloat6), 40.0f, 100.0f, true);
            DrawScope.m6955drawPathLG529CI$default(Canvas, Path, FaceIconComposable$lambda$2(snapshotState43), 0.0f, new Stroke(fIntBitsToFloat, 0.0f, companion.m6849getRoundKaPHkGw(), companion2.m6857getRoundLxFBmk8(), null, 18, null), null, 0, 52, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getCornerPath-fk0IrS8, reason: not valid java name */
    private static final Path m25320getCornerPathfk0IrS8(long j, long j2, float f, float f2) {
        Path Path = AndroidPath_androidKt.Path();
        int i = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.22f * f * f2;
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i) * 0.45f * f * (1 - f2)) + fIntBitsToFloat;
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2) + fIntBitsToFloat;
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i3) + fIntBitsToFloat;
        Offset offsetM6534boximpl = Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L)));
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(90.0f);
        Tuples3 tuples3 = new Tuples3(offsetM6534boximpl, fValueOf, fValueOf2);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i2) - fIntBitsToFloat;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i3) + fIntBitsToFloat;
        Tuples3 tuples32 = new Tuples3(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32))), fValueOf2, fValueOf2);
        float fIntBitsToFloat7 = Float.intBitsToFloat(i2) - fIntBitsToFloat;
        float fIntBitsToFloat8 = Float.intBitsToFloat(i3) - fIntBitsToFloat;
        Tuples3 tuples33 = new Tuples3(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat7) << 32))), Float.valueOf(180.0f), fValueOf2);
        float fIntBitsToFloat9 = Float.intBitsToFloat(i2) + fIntBitsToFloat;
        float fIntBitsToFloat10 = Float.intBitsToFloat(i3) - fIntBitsToFloat;
        for (Tuples3 tuples34 : CollectionsKt.listOf((Object[]) new Tuples3[]{tuples3, tuples32, tuples33, new Tuples3(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat9) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat10) & 4294967295L))), Float.valueOf(270.0f), fValueOf2)})) {
            Path.arcTo(Rect2.m6564Rect3MmeM6k(((Offset) tuples34.component1()).getPackedValue(), fIntBitsToFloat2), ((Number) tuples34.component2()).floatValue(), ((Number) tuples34.component3()).floatValue(), true);
        }
        return Path;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FaceIconComposable(final FaceIconComposable state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        FaceIconComposable.Idling idling;
        FaceIconComposable faceIconComposable;
        long joule;
        ColorSpace colorSpaceM6710getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        FaceIconComposable faceIconComposable2;
        long joule2;
        FaceIconComposable faceIconComposable3;
        long joule3;
        FaceIconComposable faceIconComposable4;
        float fFaceIconComposable$lambda$0;
        FaceIconComposable faceIconComposable5;
        Float f;
        float fFaceIconComposable$lambda$02;
        FaceIconComposable faceIconComposable6;
        Transition transition;
        float f2;
        FaceIconComposable faceIconComposable7;
        Float f3;
        final SnapshotState4 snapshotState4CreateTransitionAnimation;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-167944584);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-167944584, i4, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable (FaceIconComposable.kt:35)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                idling = FaceIconComposable.Idling.INSTANCE;
                float f4 = 0.0f;
                SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, !Intrinsics.areEqual(state, idling) ? 0.2f : 0.0f, 0.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, EasingFunctions.getEaseInOut(), 2, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup = composerStartRestartGroup;
                Transition transitionUpdateTransition = TransitionKt.updateTransition(state, "faceState", composerStartRestartGroup, (i4 & 14) | 48, 0);
                FaceIconComposable5 faceIconComposable52 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$strokeColor$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<FaceIconComposable> animateColor, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                        composer2.startReplaceGroup(-831347721);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-831347721, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:53)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                faceIconComposable = (FaceIconComposable) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-999305836);
                if (!ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-999305836, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:56)");
                }
                if (!Intrinsics.areEqual(faceIconComposable, idling)) {
                    composerStartRestartGroup.startReplaceGroup(1739769271);
                    joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable, FaceIconComposable.Processing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739771542);
                    joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable, FaceIconComposable.Capturing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739773750);
                    joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable, FaceIconComposable.Success.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739775897);
                    joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable, FaceIconComposable.Failure.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(1739767018);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1739778137);
                    joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJoule();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(joule);
                zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                faceIconComposable2 = (FaceIconComposable) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-999305836);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-999305836, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:56)");
                }
                if (!Intrinsics.areEqual(faceIconComposable2, idling)) {
                    composerStartRestartGroup.startReplaceGroup(1739769271);
                    joule2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable2, FaceIconComposable.Processing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739771542);
                    joule2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable2, FaceIconComposable.Capturing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739773750);
                    joule2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable2, FaceIconComposable.Success.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739775897);
                    joule2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable2, FaceIconComposable.Failure.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(1739767018);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1739778137);
                    joule2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJoule();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Color colorM6701boximpl = Color.m6701boximpl(joule2);
                faceIconComposable3 = (FaceIconComposable) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-999305836);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-999305836, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:56)");
                }
                if (!Intrinsics.areEqual(faceIconComposable3, idling)) {
                    composerStartRestartGroup.startReplaceGroup(1739769271);
                    joule3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable3, FaceIconComposable.Processing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739771542);
                    joule3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable3, FaceIconComposable.Capturing.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739773750);
                    joule3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(faceIconComposable3, FaceIconComposable.Success.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1739775897);
                    joule3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable3, FaceIconComposable.Failure.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(1739767018);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1739778137);
                    joule3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJoule();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM6701boximpl, Color.m6701boximpl(joule3), faceIconComposable52.invoke((FaceIconComposable5) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "faceIconColor", composerStartRestartGroup, 196608);
                FaceIconComposable4 faceIconComposable42 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$cornerScale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> animateFloat, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceGroup(703524186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(703524186, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:65)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                faceIconComposable4 = (FaceIconComposable) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-410610064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-410610064, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:68)");
                }
                if (!Intrinsics.areEqual(faceIconComposable4, idling)) {
                    fFaceIconComposable$lambda$0 = FaceIconComposable$lambda$0(snapshotState4AnimateFloat) + 0.8f;
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable4, FaceIconComposable.Capturing.INSTANCE) && !Intrinsics.areEqual(faceIconComposable4, FaceIconComposable.Processing.INSTANCE) && !Intrinsics.areEqual(faceIconComposable4, FaceIconComposable.Success.INSTANCE) && !Intrinsics.areEqual(faceIconComposable4, FaceIconComposable.Failure.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fFaceIconComposable$lambda$0 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(fFaceIconComposable$lambda$0);
                faceIconComposable5 = (FaceIconComposable) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-410610064);
                if (ComposerKt.isTraceInProgress()) {
                    f = fValueOf;
                } else {
                    f = fValueOf;
                    ComposerKt.traceEventStart(-410610064, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:68)");
                }
                if (!Intrinsics.areEqual(faceIconComposable5, idling)) {
                    fFaceIconComposable$lambda$02 = FaceIconComposable$lambda$0(snapshotState4AnimateFloat) + 0.8f;
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable5, FaceIconComposable.Capturing.INSTANCE) && !Intrinsics.areEqual(faceIconComposable5, FaceIconComposable.Processing.INSTANCE) && !Intrinsics.areEqual(faceIconComposable5, FaceIconComposable.Success.INSTANCE) && !Intrinsics.areEqual(faceIconComposable5, FaceIconComposable.Failure.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fFaceIconComposable$lambda$02 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f, Float.valueOf(fFaceIconComposable$lambda$02), faceIconComposable42.invoke((FaceIconComposable4) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "faceProgress", composerStartRestartGroup, 196608);
                FaceIconComposable3 faceIconComposable32 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$cornerProgress$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> animateFloat, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceGroup(1910400153);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1910400153, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:79)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                faceIconComposable6 = (FaceIconComposable) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-2050745405);
                if (ComposerKt.isTraceInProgress()) {
                    transition = transitionUpdateTransition;
                } else {
                    transition = transitionUpdateTransition;
                    ComposerKt.traceEventStart(-2050745405, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:82)");
                }
                if (Intrinsics.areEqual(faceIconComposable6, idling)) {
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf2 = Float.valueOf(f2);
                    faceIconComposable7 = (FaceIconComposable) transition.getTargetState();
                    composerStartRestartGroup.startReplaceGroup(-2050745405);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (Intrinsics.areEqual(faceIconComposable7, idling)) {
                    }
                } else if (Intrinsics.areEqual(faceIconComposable6, FaceIconComposable.Processing.INSTANCE) || Intrinsics.areEqual(faceIconComposable6, FaceIconComposable.Success.INSTANCE) || Intrinsics.areEqual(faceIconComposable6, FaceIconComposable.Failure.INSTANCE)) {
                    f2 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf22 = Float.valueOf(f2);
                    faceIconComposable7 = (FaceIconComposable) transition.getTargetState();
                    composerStartRestartGroup.startReplaceGroup(-2050745405);
                    if (ComposerKt.isTraceInProgress()) {
                        f3 = fValueOf22;
                        ComposerKt.traceEventStart(-2050745405, 0, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:82)");
                    } else {
                        f3 = fValueOf22;
                    }
                    if (Intrinsics.areEqual(faceIconComposable7, idling)) {
                        f4 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, f3, Float.valueOf(f4), faceIconComposable32.invoke((FaceIconComposable3) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "cornerProgress", composerStartRestartGroup, 196608);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged2 = composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation3) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FaceIconComposable2.FaceIconComposable$lambda$9$lambda$8(snapshotState4CreateTransitionAnimation3, snapshotState4CreateTransitionAnimation, snapshotState4CreateTransitionAnimation2, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Canvas2.Canvas(modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i4 >> 3) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        if (!Intrinsics.areEqual(faceIconComposable7, FaceIconComposable.Processing.INSTANCE) && !Intrinsics.areEqual(faceIconComposable7, FaceIconComposable.Success.INSTANCE) && !Intrinsics.areEqual(faceIconComposable7, FaceIconComposable.Failure.INSTANCE)) {
                            if (!Intrinsics.areEqual(faceIconComposable7, FaceIconComposable.Capturing.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f4 = 1.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, f3, Float.valueOf(f4), faceIconComposable32.invoke((FaceIconComposable3) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "cornerProgress", composerStartRestartGroup, 196608);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged2 = composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation3) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FaceIconComposable2.FaceIconComposable$lambda$9$lambda$8(snapshotState4CreateTransitionAnimation3, snapshotState4CreateTransitionAnimation, snapshotState4CreateTransitionAnimation2, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i4 >> 3) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                } else {
                    if (!Intrinsics.areEqual(faceIconComposable6, FaceIconComposable.Capturing.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf222 = Float.valueOf(f2);
                    faceIconComposable7 = (FaceIconComposable) transition.getTargetState();
                    composerStartRestartGroup.startReplaceGroup(-2050745405);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (Intrinsics.areEqual(faceIconComposable7, idling)) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FaceIconComposable2.FaceIconComposable$lambda$10(state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            idling = FaceIconComposable.Idling.INSTANCE;
            float f42 = 0.0f;
            if (!Intrinsics.areEqual(state, idling)) {
            }
            SnapshotState4<Float> snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, !Intrinsics.areEqual(state, idling) ? 0.2f : 0.0f, 0.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, EasingFunctions.getEaseInOut(), 2, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
            composerStartRestartGroup = composerStartRestartGroup;
            Transition transitionUpdateTransition2 = TransitionKt.updateTransition(state, "faceState", composerStartRestartGroup, (i4 & 14) | 48, 0);
            FaceIconComposable5 faceIconComposable522 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$strokeColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<FaceIconComposable> animateColor, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceGroup(-831347721);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-831347721, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:53)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            faceIconComposable = (FaceIconComposable) transitionUpdateTransition2.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-999305836);
            if (!ComposerKt.isTraceInProgress()) {
            }
            if (!Intrinsics.areEqual(faceIconComposable, idling)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(joule);
            zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                faceIconComposable2 = (FaceIconComposable) transitionUpdateTransition2.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-999305836);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Intrinsics.areEqual(faceIconComposable2, idling)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Color colorM6701boximpl2 = Color.m6701boximpl(joule2);
                faceIconComposable3 = (FaceIconComposable) transitionUpdateTransition2.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-999305836);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Intrinsics.areEqual(faceIconComposable3, idling)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM6701boximpl2, Color.m6701boximpl(joule3), faceIconComposable522.invoke((FaceIconComposable5) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "faceIconColor", composerStartRestartGroup, 196608);
                FaceIconComposable4 faceIconComposable422 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$cornerScale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> animateFloat, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceGroup(703524186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(703524186, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:65)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVectors2> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
                faceIconComposable4 = (FaceIconComposable) transitionUpdateTransition2.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-410610064);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Intrinsics.areEqual(faceIconComposable4, idling)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf3 = Float.valueOf(fFaceIconComposable$lambda$0);
                faceIconComposable5 = (FaceIconComposable) transitionUpdateTransition2.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-410610064);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Intrinsics.areEqual(faceIconComposable5, idling)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4 snapshotState4CreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, f, Float.valueOf(fFaceIconComposable$lambda$02), faceIconComposable422.invoke((FaceIconComposable4) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "faceProgress", composerStartRestartGroup, 196608);
                FaceIconComposable3 faceIconComposable322 = new Function3<Transition.Segment<FaceIconComposable>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.shared.documents.prism.animations.FaceIconComposableKt$FaceIconComposable$cornerProgress$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<FaceIconComposable> animateFloat, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceGroup(1910400153);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1910400153, i6, -1, "com.robinhood.shared.documents.prism.animations.FaceIconComposable.<anonymous> (FaceIconComposable.kt:79)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                TwoWayConverter<Float, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
                faceIconComposable6 = (FaceIconComposable) transitionUpdateTransition2.getCurrentState();
                composerStartRestartGroup.startReplaceGroup(-2050745405);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (Intrinsics.areEqual(faceIconComposable6, idling)) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
