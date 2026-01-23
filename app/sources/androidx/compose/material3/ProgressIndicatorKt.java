package androidx.compose.material3;

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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAnimationConstants;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;

/* compiled from: ProgressIndicator.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u001am\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a>\u0010\u001b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aD\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a6\u0010%\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a&\u0010(\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a>\u0010+\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u001a\u00100\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u00102\"\u001a\u00103\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u00102\"\u001a\u00105\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u00102\"\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109\"\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109\"\u0014\u0010=\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m3636d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "Landroidx/compose/ui/unit/Dp;", "gapSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "LinearProgressIndicator-GJbTh5U", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-rIrjwxo", "(Landroidx/compose/ui/Modifier;JJIFLandroidx/compose/runtime/Composer;II)V", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "SemanticsBoundsPadding", "F", "IncreaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "LinearIndicatorWidth", "getLinearIndicatorWidth", "()F", "LinearIndicatorHeight", "getLinearIndicatorHeight", "CircularIndicatorDiameter", "getCircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "CircularEasing", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt {
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final Modifier IncreaseSemanticsBounds;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5923LinearProgressIndicatorGJbTh5U(final Function0<Float> function0, Modifier modifier, long j, long j2, int i, float f, Function1<? super DrawScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final long linearColor;
        long linearTrackColor;
        int i5;
        int i6;
        int i7;
        float fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
        Function1<? super DrawScope, Unit> function12;
        boolean z;
        Modifier modifier3;
        final float f2;
        final int i8;
        boolean z2;
        Object objRememberedValue;
        final Function0 function02;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        final Function1<? super DrawScope, Unit> function13;
        final long j3;
        final long j4;
        final int i9;
        final float f3;
        final long j5;
        final Function1<? super DrawScope, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-339970038);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                linearColor = j;
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128;
            } else {
                linearColor = j;
            }
            if ((i2 & 3072) != 0) {
                linearTrackColor = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024;
            } else {
                linearTrackColor = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = f;
                } else {
                    fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = f;
                    if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(fM5919getLinearIndicatorTrackGapSizeD9Ej5fM) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    function12 = function1;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changedInstance(function12)) ? 1048576 : 524288;
                } else {
                    function12 = function1;
                }
                if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                    modifier3 = modifier2;
                    i9 = i6;
                    j5 = linearColor;
                    function14 = function12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        }
                        final int iM5920getLinearStrokeCapKaPHkGw = i5 == 0 ? ProgressIndicatorDefaults.INSTANCE.m5920getLinearStrokeCapKaPHkGw() : i6;
                        if (i7 != 0) {
                            fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m5919getLinearIndicatorTrackGapSizeD9Ej5fM();
                        }
                        if ((i3 & 64) != 0) {
                            boolean z4 = ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearColor)) || (i4 & 384) == 256) | ((57344 & i4) == 16384);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
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
                                        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                                        progressIndicatorDefaults.m5916drawStopIndicatorEgI2THU(drawScope, progressIndicatorDefaults.m5921getLinearTrackStopIndicatorSizeD9Ej5fM(), linearColor, iM5920getLinearStrokeCapKaPHkGw);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function12 = (Function1) objRememberedValue4;
                            i4 &= -3670017;
                        }
                        f2 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                        i8 = iM5920getLinearStrokeCapKaPHkGw;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        f2 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                        modifier3 = modifier2;
                        i8 = i6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)");
                    }
                    z2 = (i4 & 14) != 4;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function02 = (Function0) objRememberedValue;
                    Modifier modifierThen = modifier3.then(IncreaseSemanticsBounds);
                    zChanged = composerStartRestartGroup.changed(function02);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(SemanticsModifier6.semantics(modifierThen, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                    boolean zChanged2 = ((57344 & i4) != 16384) | ((458752 & i4) != 131072) | composerStartRestartGroup.changed(function02) | ((((i4 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearColor)) || (i4 & 384) == 256);
                    if ((((3670016 & i4) ^ 1572864) <= 1048576 || !composerStartRestartGroup.changed(function12)) && (i4 & 1572864) != 1048576) {
                        z = false;
                    }
                    z3 = zChanged2 | z;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        function13 = function12;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
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
                            public final void invoke2(DrawScope drawScope) {
                                float fM7995constructorimpl;
                                DrawScope drawScope2;
                                float fM6580getHeightimpl = Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc());
                                if (StrokeCap.m6845equalsimpl0(i8, StrokeCap.INSTANCE.m6848getButtKaPHkGw()) || Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) > Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc())) {
                                    fM7995constructorimpl = f2;
                                } else {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(f2 + drawScope.mo5012toDpu2uoSUM(fM6580getHeightimpl));
                                }
                                float fMo5012toDpu2uoSUM = fM7995constructorimpl / drawScope.mo5012toDpu2uoSUM(Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()));
                                float fFloatValue = function02.invoke().floatValue();
                                float fMin = fFloatValue + Math.min(fFloatValue, fMo5012toDpu2uoSUM);
                                if (fMin <= 1.0f) {
                                    drawScope2 = drawScope;
                                    ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, fMin, 1.0f, j4, fM6580getHeightimpl, i8);
                                } else {
                                    drawScope2 = drawScope;
                                }
                                ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, 0.0f, fFloatValue, j3, fM6580getHeightimpl, i8);
                                function13.invoke(drawScope2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        function13 = function12;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    }
                    Canvas2.Canvas(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i9 = i8;
                    f3 = f2;
                    linearTrackColor = j4;
                    j5 = j3;
                    function14 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final long j6 = linearTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
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

                        public final void invoke(Composer composer2, int i11) {
                            ProgressIndicatorKt.m5923LinearProgressIndicatorGJbTh5U(function0, modifier4, j5, j6, i9, f3, function14, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i4 & 599187) == 599186) {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i2 & 1) != 0) {
                    if (i10 == 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    f2 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                    i8 = iM5920getLinearStrokeCapKaPHkGw;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) != 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        function02 = (Function0) objRememberedValue;
                        Modifier modifierThen2 = modifier3.then(IncreaseSemanticsBounds);
                        zChanged = composerStartRestartGroup.changed(function02);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(SemanticsModifier6.semantics(modifierThen2, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                            if (((i4 & 7168) ^ 3072) <= 2048) {
                                if (((i4 & 896) ^ 384) > 256) {
                                    boolean zChanged22 = ((57344 & i4) != 16384) | ((458752 & i4) != 131072) | composerStartRestartGroup.changed(function02) | ((((i4 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearColor)) || (i4 & 384) == 256);
                                    if (((3670016 & i4) ^ 1572864) <= 1048576) {
                                        z = false;
                                        z3 = zChanged22 | z;
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                            function13 = function12;
                                            j3 = linearColor;
                                            j4 = linearTrackColor;
                                            objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
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
                                                public final void invoke2(DrawScope drawScope) {
                                                    float fM7995constructorimpl;
                                                    DrawScope drawScope2;
                                                    float fM6580getHeightimpl = Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc());
                                                    if (StrokeCap.m6845equalsimpl0(i8, StrokeCap.INSTANCE.m6848getButtKaPHkGw()) || Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) > Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc())) {
                                                        fM7995constructorimpl = f2;
                                                    } else {
                                                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(f2 + drawScope.mo5012toDpu2uoSUM(fM6580getHeightimpl));
                                                    }
                                                    float fMo5012toDpu2uoSUM = fM7995constructorimpl / drawScope.mo5012toDpu2uoSUM(Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()));
                                                    float fFloatValue = function02.invoke().floatValue();
                                                    float fMin = fFloatValue + Math.min(fFloatValue, fMo5012toDpu2uoSUM);
                                                    if (fMin <= 1.0f) {
                                                        drawScope2 = drawScope;
                                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, fMin, 1.0f, j4, fM6580getHeightimpl, i8);
                                                    } else {
                                                        drawScope2 = drawScope;
                                                    }
                                                    ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, 0.0f, fFloatValue, j3, fM6580getHeightimpl, i8);
                                                    function13.invoke(drawScope2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            Canvas2.Canvas(modifierM5171sizeVpY3zN42, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            i9 = i8;
                                            f3 = f2;
                                            linearTrackColor = j4;
                                            j5 = j3;
                                            function14 = function13;
                                        }
                                    } else {
                                        z = false;
                                        z3 = zChanged22 | z;
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                        }
                                    }
                                } else {
                                    boolean zChanged222 = ((57344 & i4) != 16384) | ((458752 & i4) != 131072) | composerStartRestartGroup.changed(function02) | ((((i4 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearColor)) || (i4 & 384) == 256);
                                    if (((3670016 & i4) ^ 1572864) <= 1048576) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5924LinearProgressIndicatorrIrjwxo(Modifier modifier, long j, long j2, int i, float f, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long linearColor;
        long linearTrackColor;
        int iM5920getLinearStrokeCapKaPHkGw;
        int i5;
        final float f2;
        Modifier modifier3;
        final float fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
        final int i6;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        final SnapshotState4<Float> snapshotState4AnimateFloat2;
        final SnapshotState4<Float> snapshotState4AnimateFloat3;
        final SnapshotState4<Float> snapshotState4AnimateFloat4;
        boolean zChanged;
        Object objRememberedValue;
        final long j3;
        final long j4;
        final Modifier modifier4;
        Composer composer2;
        final int i7;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(567589233);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
            linearColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i2 & 384) == 0) {
            linearTrackColor = j2;
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j2;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                iM5920getLinearStrokeCapKaPHkGw = i;
                i4 |= composerStartRestartGroup.changed(iM5920getLinearStrokeCapKaPHkGw) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i9 != 0) {
                            iM5920getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m5920getLinearStrokeCapKaPHkGw();
                        }
                        if (i5 == 0) {
                            fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m5919getLinearIndicatorTrackGapSizeD9Ej5fM();
                        }
                        i6 = iM5920getLinearStrokeCapKaPHkGw;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(567589233, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)");
                        }
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1800);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                                keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION);
                            }
                        }), null, 0L, 6, null);
                        int i10 = InfiniteTransition.$stable;
                        int i11 = InfiniteRepeatableSpec.$stable;
                        snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i10 | 432 | (i11 << 9), 8);
                        snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1800);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                                keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i10 | 432 | (i11 << 9), 8);
                        snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1800);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                                keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i10 | 432 | (i11 << 9), 8);
                        snapshotState4AnimateFloat4 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1800);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                                keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1800);
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i10 | 432 | (i11 << 9), 8);
                        Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(ProgressSemantics.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                        zChanged = ((57344 & i4) == 16384) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 384) == 256) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | ((((i4 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(linearColor)) || (i4 & 48) == 32) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            j3 = linearColor;
                            j4 = linearTrackColor;
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
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
                                    float fM7995constructorimpl;
                                    DrawScope drawScope2;
                                    float fM6580getHeightimpl = Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc());
                                    if (StrokeCap.m6845equalsimpl0(i6, StrokeCap.INSTANCE.m6848getButtKaPHkGw()) || Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) > Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc())) {
                                        fM7995constructorimpl = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                                    } else {
                                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(fM5919getLinearIndicatorTrackGapSizeD9Ej5fM + drawScope.mo5012toDpu2uoSUM(fM6580getHeightimpl));
                                    }
                                    float fMo5012toDpu2uoSUM = fM7995constructorimpl / drawScope.mo5012toDpu2uoSUM(Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()));
                                    if (snapshotState4AnimateFloat.getValue().floatValue() < 1.0f - fMo5012toDpu2uoSUM) {
                                        drawScope2 = drawScope;
                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat.getValue().floatValue() > 0.0f ? snapshotState4AnimateFloat.getValue().floatValue() + fMo5012toDpu2uoSUM : 0.0f, 1.0f, j4, fM6580getHeightimpl, i6);
                                    } else {
                                        drawScope2 = drawScope;
                                    }
                                    if (snapshotState4AnimateFloat.getValue().floatValue() - snapshotState4AnimateFloat2.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat.getValue().floatValue(), snapshotState4AnimateFloat2.getValue().floatValue(), j3, fM6580getHeightimpl, i6);
                                    }
                                    if (snapshotState4AnimateFloat2.getValue().floatValue() > fMo5012toDpu2uoSUM) {
                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat3.getValue().floatValue() > 0.0f ? snapshotState4AnimateFloat3.getValue().floatValue() + fMo5012toDpu2uoSUM : 0.0f, snapshotState4AnimateFloat2.getValue().floatValue() < 1.0f ? snapshotState4AnimateFloat2.getValue().floatValue() - fMo5012toDpu2uoSUM : 1.0f, j4, fM6580getHeightimpl, i6);
                                    }
                                    if (snapshotState4AnimateFloat3.getValue().floatValue() - snapshotState4AnimateFloat4.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat3.getValue().floatValue(), snapshotState4AnimateFloat4.getValue().floatValue(), j3, fM6580getHeightimpl, i6);
                                    }
                                    if (snapshotState4AnimateFloat4.getValue().floatValue() > fMo5012toDpu2uoSUM) {
                                        ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, 0.0f, snapshotState4AnimateFloat4.getValue().floatValue() < 1.0f ? snapshotState4AnimateFloat4.getValue().floatValue() - fMo5012toDpu2uoSUM : 1.0f, j4, fM6580getHeightimpl, i6);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            j3 = linearColor;
                            j4 = linearTrackColor;
                        }
                        Canvas2.Canvas(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        i7 = i6;
                        f2 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                        j5 = j4;
                        j6 = j3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
                    i6 = iM5920getLinearStrokeCapKaPHkGw;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION);
                        }
                    }), null, 0L, 6, null);
                    int i102 = InfiniteTransition.$stable;
                    int i112 = InfiniteRepeatableSpec.$stable;
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i102 | 432 | (i112 << 9), 8);
                    snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i102 | 432 | (i112 << 9), 8);
                    snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i102 | 432 | (i112 << 9), 8);
                    snapshotState4AnimateFloat4 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i102 | 432 | (i112 << 9), 8);
                    Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(ProgressSemantics.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                    if ((i4 & 7168) == 2048) {
                    }
                    if (((i4 & 896) ^ 384) > 256) {
                        if (((i4 & 112) ^ 48) > 32) {
                            zChanged = ((57344 & i4) == 16384) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 384) == 256) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | ((((i4 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(linearColor)) || (i4 & 48) == 32) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                j3 = linearColor;
                                j4 = linearTrackColor;
                                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
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
                                        float fM7995constructorimpl;
                                        DrawScope drawScope2;
                                        float fM6580getHeightimpl = Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc());
                                        if (StrokeCap.m6845equalsimpl0(i6, StrokeCap.INSTANCE.m6848getButtKaPHkGw()) || Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) > Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc())) {
                                            fM7995constructorimpl = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                                        } else {
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(fM5919getLinearIndicatorTrackGapSizeD9Ej5fM + drawScope.mo5012toDpu2uoSUM(fM6580getHeightimpl));
                                        }
                                        float fMo5012toDpu2uoSUM = fM7995constructorimpl / drawScope.mo5012toDpu2uoSUM(Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()));
                                        if (snapshotState4AnimateFloat.getValue().floatValue() < 1.0f - fMo5012toDpu2uoSUM) {
                                            drawScope2 = drawScope;
                                            ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat.getValue().floatValue() > 0.0f ? snapshotState4AnimateFloat.getValue().floatValue() + fMo5012toDpu2uoSUM : 0.0f, 1.0f, j4, fM6580getHeightimpl, i6);
                                        } else {
                                            drawScope2 = drawScope;
                                        }
                                        if (snapshotState4AnimateFloat.getValue().floatValue() - snapshotState4AnimateFloat2.getValue().floatValue() > 0.0f) {
                                            ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat.getValue().floatValue(), snapshotState4AnimateFloat2.getValue().floatValue(), j3, fM6580getHeightimpl, i6);
                                        }
                                        if (snapshotState4AnimateFloat2.getValue().floatValue() > fMo5012toDpu2uoSUM) {
                                            ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat3.getValue().floatValue() > 0.0f ? snapshotState4AnimateFloat3.getValue().floatValue() + fMo5012toDpu2uoSUM : 0.0f, snapshotState4AnimateFloat2.getValue().floatValue() < 1.0f ? snapshotState4AnimateFloat2.getValue().floatValue() - fMo5012toDpu2uoSUM : 1.0f, j4, fM6580getHeightimpl, i6);
                                        }
                                        if (snapshotState4AnimateFloat3.getValue().floatValue() - snapshotState4AnimateFloat4.getValue().floatValue() > 0.0f) {
                                            ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, snapshotState4AnimateFloat3.getValue().floatValue(), snapshotState4AnimateFloat4.getValue().floatValue(), j3, fM6580getHeightimpl, i6);
                                        }
                                        if (snapshotState4AnimateFloat4.getValue().floatValue() > fMo5012toDpu2uoSUM) {
                                            ProgressIndicatorKt.m5931drawLinearIndicatorqYKTg0g(drawScope2, 0.0f, snapshotState4AnimateFloat4.getValue().floatValue() < 1.0f ? snapshotState4AnimateFloat4.getValue().floatValue() - fMo5012toDpu2uoSUM : 1.0f, j4, fM6580getHeightimpl, i6);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                Canvas2.Canvas(modifierM5171sizeVpY3zN42, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                composer2 = composerStartRestartGroup;
                                i7 = i6;
                                f2 = fM5919getLinearIndicatorTrackGapSizeD9Ej5fM;
                                j5 = j4;
                                j6 = j3;
                            }
                        } else {
                            zChanged = ((57344 & i4) == 16384) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(snapshotState4AnimateFloat) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 384) == 256) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | ((((i4 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(linearColor)) || (i4 & 48) == 32) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    j6 = linearColor;
                    j5 = linearTrackColor;
                    i7 = iM5920getLinearStrokeCapKaPHkGw;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i12) {
                            ProgressIndicatorKt.m5924LinearProgressIndicatorrIrjwxo(modifier4, j6, j5, i7, f2, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            f2 = f;
            if ((i4 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i5 == 0) {
                        fM5919getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
                    }
                    i6 = iM5920getLinearStrokeCapKaPHkGw;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition22 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default22 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION);
                        }
                    }), null, 0L, 6, null);
                    int i1022 = InfiniteTransition.$stable;
                    int i1122 = InfiniteRepeatableSpec.$stable;
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default22, null, composerStartRestartGroup, i1022 | 432 | (i1122 << 9), 8);
                    snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1022 | 432 | (i1122 << 9), 8);
                    snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1022 | 432 | (i1122 << 9), 8);
                    snapshotState4AnimateFloat4 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                            keyframesSpecConfig.mo91at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1022 | 432 | (i1122 << 9), 8);
                    Modifier modifierM5171sizeVpY3zN422 = SizeKt.m5171sizeVpY3zN4(ProgressSemantics.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                    if ((i4 & 7168) == 2048) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        iM5920getLinearStrokeCapKaPHkGw = i;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m5931drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fM6583getWidthimpl = Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc());
        float fM6580getHeightimpl = Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc());
        float f4 = 2;
        float f5 = fM6580getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * fM6583getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * fM6583getWidthimpl;
        if (StrokeCap.m6845equalsimpl0(i, StrokeCap.INSTANCE.m6848getButtKaPHkGw()) || fM6580getHeightimpl > fM6583getWidthimpl) {
            DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(f8, fM6583getWidthimpl - f8);
        float fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f6), ranges3RangeTo)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f7), ranges3RangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fFloatValue, f5), OffsetKt.Offset(fFloatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5922CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long circularColor;
        float fM5918getCircularStrokeWidthD9Ej5fM;
        long circularIndeterminateTrackColor;
        int i5;
        int i6;
        Modifier modifier3;
        int iM5917getCircularIndeterminateStrokeCapKaPHkGw;
        int i7;
        long j3;
        final float f2;
        long j4;
        final Stroke stroke;
        boolean z;
        final SnapshotState4 snapshotState4AnimateValue;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        final SnapshotState4<Float> snapshotState4AnimateFloat2;
        final SnapshotState4<Float> snapshotState4AnimateFloat3;
        boolean z2;
        Object objRememberedValue;
        final long j5;
        final long j6;
        final long j7;
        final float f3;
        final long j8;
        final int i8;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-115871647);
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
            circularColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(circularColor)) ? 32 : 16;
        } else {
            circularColor = j;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                fM5918getCircularStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM5918getCircularStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                circularIndeterminateTrackColor = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(circularIndeterminateTrackColor)) ? 2048 : 1024;
            } else {
                circularIndeterminateTrackColor = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i10 != 0) {
                            fM5918getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m5918getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                            circularIndeterminateTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i5 == 0) {
                            iM5917getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m5917getCircularIndeterminateStrokeCapKaPHkGw();
                            i7 = i4;
                        }
                        j3 = circularColor;
                        f2 = fM5918getCircularStrokeWidthD9Ej5fM;
                        j4 = circularIndeterminateTrackColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-115871647, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                        }
                        stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f2), 0.0f, iM5917getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                        int i11 = iM5917getCircularIndeterminateStrokeCapKaPHkGw;
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        TwoWayConverter<Integer, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        Modifier modifier5 = modifier3;
                        InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i12 = InfiniteTransition.$stable;
                        int i13 = InfiniteRepeatableSpec.$stable;
                        z = true;
                        snapshotState4AnimateValue = InfiniteTransition4.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i12 | 432 | (i13 << 12), 16);
                        snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 286.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i12 | 432 | (i13 << 9), 8);
                        snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
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
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i12 | 432 | (i13 << 9), 8);
                        snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
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
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i12 | 432 | (i13 << 9), 8);
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(ProgressSemantics.progressSemantics(modifier5), CircularIndicatorDiameter);
                        boolean zChangedInstance = ((i7 & 896) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(j4)) || (i7 & 3072) == 2048) | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                        if ((((i7 & 112) ^ 48) <= 32 || !composerStartRestartGroup.changed(j3)) && (i7 & 48) != 32) {
                            z = false;
                        }
                        z2 = zChangedInstance | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            j5 = j3;
                            j6 = j4;
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
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
                                    ProgressIndicatorKt.m5929drawCircularIndicatorTrackbw27NRU(drawScope, j6, stroke);
                                    ProgressIndicatorKt.m5930drawIndeterminateCircularIndicatorhrjfTZI(drawScope, snapshotState4AnimateFloat3.getValue().floatValue() + (((snapshotState4AnimateValue.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + snapshotState4AnimateFloat.getValue().floatValue(), f2, Math.abs(snapshotState4AnimateFloat2.getValue().floatValue() - snapshotState4AnimateFloat3.getValue().floatValue()), j5, stroke);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            j5 = j3;
                            j6 = j4;
                        }
                        Canvas2.Canvas(modifierM5169size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j7 = j6;
                        f3 = f2;
                        j8 = j5;
                        i8 = i11;
                        modifier4 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    i7 = i4;
                    iM5917getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j3 = circularColor;
                    f2 = fM5918getCircularStrokeWidthD9Ej5fM;
                    j4 = circularIndeterminateTrackColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f2), 0.0f, iM5917getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    int i112 = iM5917getCircularIndeterminateStrokeCapKaPHkGw;
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    Modifier modifier52 = modifier3;
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i122 = InfiniteTransition.$stable;
                    int i132 = InfiniteRepeatableSpec.$stable;
                    z = true;
                    snapshotState4AnimateValue = InfiniteTransition4.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i122 | 432 | (i132 << 12), 16);
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 286.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i122 | 432 | (i132 << 9), 8);
                    snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
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
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i122 | 432 | (i132 << 9), 8);
                    snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
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
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i122 | 432 | (i132 << 9), 8);
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(ProgressSemantics.progressSemantics(modifier52), CircularIndicatorDiameter);
                    if (((i7 & 7168) ^ 3072) > 2048) {
                        boolean zChangedInstance2 = ((i7 & 896) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(j4)) || (i7 & 3072) == 2048) | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                        if (((i7 & 112) ^ 48) <= 32) {
                            z = false;
                            z2 = zChangedInstance2 | z;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                                j5 = j3;
                                j6 = j4;
                                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
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
                                        ProgressIndicatorKt.m5929drawCircularIndicatorTrackbw27NRU(drawScope, j6, stroke);
                                        ProgressIndicatorKt.m5930drawIndeterminateCircularIndicatorhrjfTZI(drawScope, snapshotState4AnimateFloat3.getValue().floatValue() + (((snapshotState4AnimateValue.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + snapshotState4AnimateFloat.getValue().floatValue(), f2, Math.abs(snapshotState4AnimateFloat2.getValue().floatValue() - snapshotState4AnimateFloat3.getValue().floatValue()), j5, stroke);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                Canvas2.Canvas(modifierM5169size3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                j7 = j6;
                                f3 = f2;
                                j8 = j5;
                                i8 = i112;
                                modifier4 = modifier52;
                            }
                        } else {
                            z = false;
                            z2 = zChangedInstance2 | z;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                            }
                        }
                    } else {
                        boolean zChangedInstance22 = ((i7 & 896) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(j4)) || (i7 & 3072) == 2048) | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(snapshotState4AnimateValue) | composerStartRestartGroup.changed(snapshotState4AnimateFloat2) | composerStartRestartGroup.changed(snapshotState4AnimateFloat3) | composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                        if (((i7 & 112) ^ 48) <= 32) {
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    i8 = i6;
                    j8 = circularColor;
                    f3 = fM5918getCircularStrokeWidthD9Ej5fM;
                    j7 = circularIndeterminateTrackColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            ProgressIndicatorKt.m5922CircularProgressIndicatorLxG7B9w(modifier4, j8, f3, j7, i8, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 == 0) {
                        i7 = i4;
                        iM5917getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    }
                    j3 = circularColor;
                    f2 = fM5918getCircularStrokeWidthD9Ej5fM;
                    j4 = circularIndeterminateTrackColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f2), 0.0f, iM5917getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    int i1122 = iM5917getCircularIndeterminateStrokeCapKaPHkGw;
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition22 = InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    Modifier modifier522 = modifier3;
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default22 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i1222 = InfiniteTransition.$stable;
                    int i1322 = InfiniteRepeatableSpec.$stable;
                    z = true;
                    snapshotState4AnimateValue = InfiniteTransition4.animateValue(infiniteTransitionRememberInfiniteTransition22, 0, 5, vectorConverter22, infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default22, null, composerStartRestartGroup, i1222 | 432 | (i1322 << 12), 16);
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 286.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, Easing3.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i1222 | 432 | (i1322 << 9), 8);
                    snapshotState4AnimateFloat2 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
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
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1222 | 432 | (i1322 << 9), 8);
                    snapshotState4AnimateFloat3 = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 290.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
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
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1222 | 432 | (i1322 << 9), 8);
                    Modifier modifierM5169size3ABfNKs22 = SizeKt.m5169size3ABfNKs(ProgressSemantics.progressSemantics(modifier522), CircularIndicatorDiameter);
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM5918getCircularStrokeWidthD9Ej5fM = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m5928drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM6583getWidthimpl = Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()) - (f3 * width);
        DrawScope.m6945drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.p011ui.geometry.SizeKt.Size(fM6583getWidthimpl, fM6583getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    public static final void m5929drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m5928drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m5930drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m5928drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m6845equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m6848getButtKaPHkGw()) ? 0.0f : ((f2 / C2002Dp.m7995constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(10);
        SemanticsBoundsPadding = fM7995constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m5144paddingVpY3zN4$default(SemanticsModifier6.semantics(LayoutModifier4.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m5932invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m5932invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                final int iMo5010roundToPx0680j_4 = measureScope.mo5010roundToPx0680j_4(ProgressIndicatorKt.SemanticsBoundsPadding);
                int i = iMo5010roundToPx0680j_4 * 2;
                final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(j, 0, i));
                return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight() - i, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.place$default(placementScope, placeableMo7239measureBRTryo0, 0, -iMo5010roundToPx0680j_4, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fM7995constructorimpl, 1, null);
        LinearIndicatorWidth = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.INSTANCE;
        LinearIndicatorHeight = progressIndicatorTokens.m6281getTrackThicknessD9Ej5fM();
        CircularIndicatorDiameter = C2002Dp.m7995constructorimpl(progressIndicatorTokens.m6279getSizeD9Ej5fM() - C2002Dp.m7995constructorimpl(progressIndicatorTokens.m6281getTrackThicknessD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
