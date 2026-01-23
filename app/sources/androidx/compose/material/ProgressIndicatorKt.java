package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ProgressSemantics;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgressIndicator.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\u001aD\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\u0015\u001a\u00020\t*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0018\u001a\u00020\t*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a>\u0010\u001b\u001a\u00020\t*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\f\u0010'\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "backgroundColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt {
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m5612getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    private static final float CircularIndicatorDiameter = C2002Dp.m7995constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$12(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$9(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0253  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5613CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM5559getPrimary0d7_KjU;
        float fM5612getStrokeWidthD9Ej5fM;
        int i5;
        int i6;
        final Modifier modifier3;
        final int i7;
        final long j3;
        final float f2;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        final long j5;
        int iM6850getSquareKaPHkGw;
        long j6;
        int i8;
        final float f3;
        final Stroke stroke;
        final SnapshotState4 snapshotState4AnimateValue;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        final SnapshotState4<Float> snapshotState4AnimateFloat2;
        final SnapshotState4<Float> snapshotState4AnimateFloat3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final long j7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119119072);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jM5559getPrimary0d7_KjU = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(jM5559getPrimary0d7_KjU)) ? 32 : 16;
        } else {
            jM5559getPrimary0d7_KjU = j;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                fM5612getStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM5612getStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        int i11 = composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                        i4 |= i11;
                    } else {
                        i6 = i;
                    }
                    i4 |= i11;
                } else {
                    i6 = i;
                }
                if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            jM5559getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m5559getPrimary0d7_KjU();
                        }
                        if (i10 != 0) {
                            fM5612getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m5612getStrokeWidthD9Ej5fM();
                        }
                        long jM6725getTransparent0d7_KjU = i5 != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j2;
                        if ((i3 & 16) != 0) {
                            j5 = jM6725getTransparent0d7_KjU;
                            iM6850getSquareKaPHkGw = StrokeCap.INSTANCE.m6850getSquareKaPHkGw();
                            j6 = jM5559getPrimary0d7_KjU;
                            i8 = i4 & (-57345);
                            f3 = fM5612getStrokeWidthD9Ej5fM;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1119119072, i8, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:374)");
                            }
                            stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f3), 0.0f, iM6850getSquareKaPHkGw, 0, null, 26, null);
                            int i12 = iM6850getSquareKaPHkGw;
                            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                            TwoWayConverter<Integer, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                            Modifier modifier5 = modifier4;
                            InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null);
                            int i13 = InfiniteTransition.$stable;
                            int i14 = InfiniteRepeatableSpec.$stable;
                            snapshotState4AnimateValue = InfiniteTransition4.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i13 | 432 | (i14 << 12), 16);
                            snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 286.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                            snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    invoke2(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    keyframesSpecConfig.setDurationMillis(1332);
                                    keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                                    keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                                }
                            }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                            snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    invoke2(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    keyframesSpecConfig.setDurationMillis(1332);
                                    keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                                    keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                                }
                            }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(ProgressSemantics.progressSemantics(modifier5), CircularIndicatorDiameter);
                            zChangedInstance = composerStartRestartGroup.changedInstance(stroke) | ((i8 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((i8 & 896) != 256) | ((((i8 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(j6)) || (i8 & 48) == 32);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                j7 = j6;
                                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        ProgressIndicatorKt.m5617drawCircularIndicatorBackgroundbw27NRU(drawScope, j5, stroke);
                                        ProgressIndicatorKt.m5618drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$12(snapshotState4AnimateFloat3) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(snapshotState4AnimateValue) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(snapshotState4AnimateFloat), f3, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(snapshotState4AnimateFloat2) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$12(snapshotState4AnimateFloat3)), j7, stroke);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                j7 = j6;
                            }
                            Canvas2.Canvas(modifierM5169size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i7 = i12;
                            j4 = j5;
                            f2 = f3;
                            j3 = j7;
                            modifier3 = modifier5;
                        } else {
                            j5 = jM6725getTransparent0d7_KjU;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        j5 = j2;
                        modifier4 = modifier2;
                    }
                    i8 = i4;
                    iM6850getSquareKaPHkGw = i6;
                    j6 = jM5559getPrimary0d7_KjU;
                    f3 = fM5612getStrokeWidthD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f3), 0.0f, iM6850getSquareKaPHkGw, 0, null, 26, null);
                    int i122 = iM6850getSquareKaPHkGw;
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    Modifier modifier52 = modifier4;
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i132 = InfiniteTransition.$stable;
                    int i142 = InfiniteRepeatableSpec.$stable;
                    snapshotState4AnimateValue = InfiniteTransition4.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i132 | 432 | (i142 << 12), 16);
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 286.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1332);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1332);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(ProgressSemantics.progressSemantics(modifier52), CircularIndicatorDiameter);
                    if (((i8 & 112) ^ 48) <= 32) {
                        zChangedInstance = composerStartRestartGroup.changedInstance(stroke) | ((i8 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((i8 & 896) != 256) | ((((i8 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(j6)) || (i8 & 48) == 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            j7 = j6;
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    ProgressIndicatorKt.m5617drawCircularIndicatorBackgroundbw27NRU(drawScope, j5, stroke);
                                    ProgressIndicatorKt.m5618drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$12(snapshotState4AnimateFloat3) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(snapshotState4AnimateValue) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(snapshotState4AnimateFloat), f3, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(snapshotState4AnimateFloat2) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$12(snapshotState4AnimateFloat3)), j7, stroke);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Canvas2.Canvas(modifierM5169size3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i7 = i122;
                            j4 = j5;
                            f2 = f3;
                            j3 = j7;
                            modifier3 = modifier52;
                        }
                    } else {
                        zChangedInstance = composerStartRestartGroup.changedInstance(stroke) | ((i8 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((i8 & 896) != 256) | ((((i8 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(j6)) || (i8 & 48) == 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i7 = i6;
                    j3 = jM5559getPrimary0d7_KjU;
                    f2 = fM5612getStrokeWidthD9Ej5fM;
                    j4 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            ProgressIndicatorKt.m5613CircularProgressIndicatorLxG7B9w(modifier3, j3, f2, j4, i7, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            if ((i2 & 24576) == 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM5612getStrokeWidthD9Ej5fM = f;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m5616drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM6583getWidthimpl = Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()) - (f3 * width);
        DrawScope.m6945drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.p011ui.geometry.SizeKt.Size(fM6583getWidthimpl, fM6583getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m5617drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m5616drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m5618drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m5616drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m6845equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m6848getButtKaPHkGw()) ? 0.0f : ((f2 / C2002Dp.m7995constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }
}
