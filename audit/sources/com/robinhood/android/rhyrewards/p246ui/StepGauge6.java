package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Canvas3;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: StepGauge.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ag\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u001b\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010 \u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010!\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$¨\u0006.²\u0006\f\u0010,\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "totalSteps", "pendingSteps", "completedSteps", "", "showDashes", "Lcom/robinhood/android/rhyrewards/ui/StepGaugeColors;", "colors", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function0;", "", "innerContent", "StepGauge", "(Landroidx/compose/ui/Modifier;IIIZLcom/robinhood/android/rhyrewards/ui/StepGaugeColors;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "", "steps", "drawDashes-XO-JAsU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Canvas;JLjava/util/List;I)V", "drawDashes", "Lcom/robinhood/android/rhyrewards/ui/GaugeArcType;", "type", "drawGaugeArc-iJQMabo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFILcom/robinhood/android/rhyrewards/ui/GaugeArcType;)V", "drawGaugeArc", "StepGaugeInnerContent", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "arcDegrees", "F", "startArcAngle", "startStepAngle", "I", "Landroidx/compose/ui/unit/Dp;", "arcStrokeWidth", "stepDashLength", "stepDashWidth", "pendingFloatAnimated", "completedFloatAnimated", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhyrewards.ui.StepGaugeKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class StepGauge6 {
    private static final float arcDegrees = 260.0f;
    private static final float startArcAngle = 140.0f;
    private static final int startStepAngle = -40;
    private static final float arcStrokeWidth = C2002Dp.m7995constructorimpl(12);
    private static final float stepDashLength = C2002Dp.m7995constructorimpl(6);
    private static final float stepDashWidth = C2002Dp.m7995constructorimpl((float) 0.55d);

    /* compiled from: StepGauge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.StepGaugeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StepGauge3.values().length];
            try {
                iArr[StepGauge3.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StepGauge3.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StepGauge$lambda$11(Modifier modifier, int i, int i2, int i3, boolean z, StepGauge4 stepGauge4, AnimationSpec animationSpec, Function2 function2, int i4, int i5, Composer composer, int i6) {
        StepGauge(modifier, i, i2, i3, z, stepGauge4, animationSpec, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StepGaugeInnerContent$lambda$13(Function2 function2, int i, int i2, Composer composer, int i3) {
        StepGaugeInnerContent(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StepGaugeInnerContent$squareLengthInsideCircle(float f) {
        return C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f / 2.0f) * ((float) Math.sqrt(2.0f)));
    }

    private static final float StepGauge$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float StepGauge$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StepGauge(Modifier modifier, final int i, final int i2, final int i3, boolean z, StepGauge4 stepGauge4, AnimationSpec<Float> animationSpec, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i4, final int i5) {
        Modifier modifier2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        AnimationSpec<Float> animationSpec2;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function22;
        StepGauge4 stepGauge42;
        StepGauge4 stepGauge43;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        boolean z3;
        AnimationSpec<Float> animationSpec3;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2;
        Composer composer2;
        final long gaugeBackgroundColor;
        final long gaugeBorderColor;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        final long gaugePendingColor;
        final long gaugeFillColor;
        final long gaugeUncoveredDashColor;
        final long gaugeCoveredDashColor;
        StepGauge4 stepGauge44;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifierM5142padding3ABfNKs;
        boolean zChanged;
        Object objRememberedValue;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier4;
        StepGauge4 stepGauge45;
        final boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z6;
        final StepGauge4 stepGauge46;
        final Modifier modifier5;
        final AnimationSpec<Float> animationSpec4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1438276718);
        int i11 = i5 & 1;
        if (i11 != 0) {
            i6 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 6) == 0) {
            modifier2 = modifier;
            i6 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                i6 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i6 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    z2 = z;
                    i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 196608) == 0) {
                    if ((i5 & 32) != 0) {
                        i10 = 65536;
                        i6 |= i10;
                    } else {
                        if ((i4 & 262144) == 0 ? composerStartRestartGroup.changed(stepGauge4) : composerStartRestartGroup.changedInstance(stepGauge4)) {
                            i10 = 131072;
                        }
                        i6 |= i10;
                    }
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                    animationSpec2 = animationSpec;
                } else {
                    animationSpec2 = animationSpec;
                    if ((i4 & 1572864) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(animationSpec2) ? 1048576 : 524288;
                    }
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i4 & 12582912) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                }
                if ((i6 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function27 = function22;
                    modifier5 = modifier2;
                    z6 = z2;
                    animationSpec4 = animationSpec2;
                    stepGauge46 = stepGauge4;
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i5 & 32) == 0) {
                            stepGauge42 = StepGauge4.INSTANCE.getDefault();
                            i6 &= -458753;
                        } else {
                            stepGauge42 = stepGauge4;
                        }
                        AnimationSpec<Float> tweenSpec = i8 == 0 ? new TweenSpec<>(1000, 0, null, 6, null) : animationSpec2;
                        stepGauge43 = stepGauge42;
                        modifier3 = modifier2;
                        if (i9 == 0) {
                            z3 = z2;
                            animationSpec3 = tweenSpec;
                            function23 = null;
                        } else {
                            function23 = function22;
                            z3 = z2;
                            animationSpec3 = tweenSpec;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i5 & 32) != 0) {
                            i6 &= -458753;
                        }
                        stepGauge43 = stepGauge4;
                        modifier3 = modifier2;
                        function23 = function22;
                        z3 = z2;
                        animationSpec3 = animationSpec2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1438276718, i6, -1, "com.robinhood.android.rhyrewards.ui.StepGauge (StepGauge.kt:115)");
                    }
                    int i12 = i6 >> 15;
                    int i13 = i12 & 112;
                    snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i2, animationSpec3, 0.0f, null, null, composerStartRestartGroup, i13, 28);
                    snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(i3, animationSpec3, 0.0f, null, null, composerStartRestartGroup, i13, 28);
                    AnimationSpec<Float> animationSpec5 = animationSpec3;
                    composer2 = composerStartRestartGroup;
                    int i14 = i12 & 14;
                    gaugeBackgroundColor = stepGauge43.getGaugeBackgroundColor(composer2, i14);
                    gaugeBorderColor = stepGauge43.getGaugeBorderColor(composer2, i14);
                    z4 = z3;
                    function24 = function23;
                    gaugePendingColor = stepGauge43.getGaugePendingColor(composer2, i14);
                    gaugeFillColor = stepGauge43.getGaugeFillColor(composer2, i14);
                    gaugeUncoveredDashColor = stepGauge43.getGaugeUncoveredDashColor(composer2, i14);
                    gaugeCoveredDashColor = stepGauge43.getGaugeCoveredDashColor(composer2, i14);
                    stepGauge44 = stepGauge43;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Modifier modifier6 = modifier3;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(arcStrokeWidth / 2));
                    composer2.startReplaceGroup(-1224400529);
                    zChanged = composer2.changed(gaugeBorderColor) | ((i6 & 112) != 32) | composer2.changed(gaugeBackgroundColor) | ((57344 & i6) != 16384) | composer2.changed(gaugeUncoveredDashColor) | composer2.changed(snapshotState4AnimateFloatAsState) | composer2.changed(snapshotState4AnimateFloatAsState2) | composer2.changed(gaugePendingColor) | ((i6 & 7168) != 2048) | ((i6 & 896) != 256) | composer2.changed(gaugeFillColor) | composer2.changed(gaugeCoveredDashColor);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function25 = function24;
                        modifier4 = modifierM5142padding3ABfNKs;
                        stepGauge45 = stepGauge44;
                        z5 = z4;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return StepGauge6.StepGauge$lambda$10$lambda$8$lambda$7(gaugeBorderColor, i, gaugeBackgroundColor, z5, gaugeUncoveredDashColor, gaugePendingColor, i3, i2, gaugeFillColor, gaugeCoveredDashColor, snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2, (DrawScope) obj);
                            }
                        };
                        composer2 = composer2;
                        composer2.updateRememberedValue(function1);
                        objRememberedValue = function1;
                    } else {
                        z5 = z4;
                        function25 = function24;
                        modifier4 = modifierM5142padding3ABfNKs;
                        stepGauge45 = stepGauge44;
                    }
                    composer2.endReplaceGroup();
                    Canvas2.Canvas(modifier4, (Function1) objRememberedValue, composer2, 6);
                    composer2.startReplaceGroup(-823125832);
                    function26 = function25;
                    if (function26 != null) {
                        StepGaugeInnerContent(function26, composer2, 0, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function27 = function26;
                    z6 = z5;
                    stepGauge46 = stepGauge45;
                    modifier5 = modifier6;
                    animationSpec4 = animationSpec5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return StepGauge6.StepGauge$lambda$11(modifier5, i, i2, i3, z6, stepGauge46, animationSpec4, function27, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 |= 24576;
            z2 = z;
            if ((i4 & 196608) == 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            if ((i6 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                    if (i11 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i5 & 32) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    stepGauge43 = stepGauge42;
                    modifier3 = modifier2;
                    if (i9 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i6 >> 15;
                    int i132 = i122 & 112;
                    snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i2, animationSpec3, 0.0f, null, null, composerStartRestartGroup, i132, 28);
                    snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(i3, animationSpec3, 0.0f, null, null, composerStartRestartGroup, i132, 28);
                    AnimationSpec<Float> animationSpec52 = animationSpec3;
                    composer2 = composerStartRestartGroup;
                    int i142 = i122 & 14;
                    gaugeBackgroundColor = stepGauge43.getGaugeBackgroundColor(composer2, i142);
                    gaugeBorderColor = stepGauge43.getGaugeBorderColor(composer2, i142);
                    z4 = z3;
                    function24 = function23;
                    gaugePendingColor = stepGauge43.getGaugePendingColor(composer2, i142);
                    gaugeFillColor = stepGauge43.getGaugeFillColor(composer2, i142);
                    gaugeUncoveredDashColor = stepGauge43.getGaugeUncoveredDashColor(composer2, i142);
                    gaugeCoveredDashColor = stepGauge43.getGaugeCoveredDashColor(composer2, i142);
                    stepGauge44 = stepGauge43;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier62 = modifier3;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(arcStrokeWidth / 2));
                        composer2.startReplaceGroup(-1224400529);
                        zChanged = composer2.changed(gaugeBorderColor) | ((i6 & 112) != 32) | composer2.changed(gaugeBackgroundColor) | ((57344 & i6) != 16384) | composer2.changed(gaugeUncoveredDashColor) | composer2.changed(snapshotState4AnimateFloatAsState) | composer2.changed(snapshotState4AnimateFloatAsState2) | composer2.changed(gaugePendingColor) | ((i6 & 7168) != 2048) | ((i6 & 896) != 256) | composer2.changed(gaugeFillColor) | composer2.changed(gaugeCoveredDashColor);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged) {
                            function25 = function24;
                            modifier4 = modifierM5142padding3ABfNKs;
                            stepGauge45 = stepGauge44;
                            z5 = z4;
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return StepGauge6.StepGauge$lambda$10$lambda$8$lambda$7(gaugeBorderColor, i, gaugeBackgroundColor, z5, gaugeUncoveredDashColor, gaugePendingColor, i3, i2, gaugeFillColor, gaugeCoveredDashColor, snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2, (DrawScope) obj);
                                }
                            };
                            composer2 = composer2;
                            composer2.updateRememberedValue(function12);
                            objRememberedValue = function12;
                            composer2.endReplaceGroup();
                            Canvas2.Canvas(modifier4, (Function1) objRememberedValue, composer2, 6);
                            composer2.startReplaceGroup(-823125832);
                            function26 = function25;
                            if (function26 != null) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function27 = function26;
                            z6 = z5;
                            stepGauge46 = stepGauge45;
                            modifier5 = modifier62;
                            animationSpec4 = animationSpec52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
        i7 = i5 & 16;
        if (i7 != 0) {
        }
        z2 = z;
        if ((i4 & 196608) == 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        if ((i6 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StepGauge$lambda$10$lambda$8$lambda$7(long j, int i, long j2, boolean z, long j3, long j4, int i2, int i3, long j5, long j6, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        float f = i;
        StepGauge3 stepGauge3 = StepGauge3.STROKE;
        m18421drawGaugeArciJQMabo(Canvas, j, f, i, stepGauge3);
        StepGauge3 stepGauge32 = StepGauge3.FILL;
        m18421drawGaugeArciJQMabo(Canvas, j2, f, i, stepGauge32);
        if (z) {
            m18420drawDashesXOJAsU(Canvas, canvas, j3, CollectionsKt.toList(RangesKt.until(1, i)), i);
        }
        if (StepGauge$lambda$4(snapshotState4) > 0.0f) {
            m18421drawGaugeArciJQMabo(Canvas, j, StepGauge$lambda$5(snapshotState42) + StepGauge$lambda$4(snapshotState4), i, stepGauge3);
            m18421drawGaugeArciJQMabo(Canvas, j4, StepGauge$lambda$5(snapshotState42) + StepGauge$lambda$4(snapshotState4), i, stepGauge32);
        }
        if (z) {
            m18420drawDashesXOJAsU(Canvas, canvas, j3, CollectionsKt.toList(RangesKt.until(i2, i2 + i3)), i);
        }
        m18421drawGaugeArciJQMabo(Canvas, j, StepGauge$lambda$5(snapshotState42), i, stepGauge3);
        m18421drawGaugeArciJQMabo(Canvas, j5, StepGauge$lambda$5(snapshotState42), i, stepGauge32);
        if (z) {
            m18420drawDashesXOJAsU(Canvas, canvas, j6, CollectionsKt.toList(RangesKt.until(1, i2)), i);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: drawDashes-XO-JAsU, reason: not valid java name */
    private static final void m18420drawDashesXOJAsU(DrawScope drawScope, Canvas canvas, long j, List<Integer> list, int i) {
        float f;
        char c;
        long j2;
        DrawScope drawScope2 = drawScope;
        if (list.isEmpty()) {
            return;
        }
        char c2 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.getDrawContext().mo6936getSizeNHjbRc() >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.getDrawContext().mo6936getSizeNHjbRc() & 4294967295L));
        Paint Paint = AndroidPaint_androidKt.Paint();
        int iIntValue = ((Number) CollectionsKt.last((List) list)).intValue();
        if (iIntValue < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float f2 = (i2 * (arcDegrees / i)) + startStepAngle;
            if (list.contains(Integer.valueOf(i2))) {
                float fMo5016toPx0680j_4 = drawScope2.mo5016toPx0680j_4(stepDashLength) / 2.0f;
                j2 = j3;
                Paint.mo6617setColor8_81llA(j);
                Paint.setStrokeWidth(drawScope2.mo5016toPx0680j_4(stepDashWidth));
                canvas.save();
                c = c2;
                Canvas3.rotate(canvas, f2, fIntBitsToFloat / 2.0f, fIntBitsToFloat2 / 2.0f);
                f = fIntBitsToFloat;
                canvas.mo6601drawLineWko1d7g(Offset.m6535constructorimpl((Float.floatToRawIntBits(r12) & j2) | (Float.floatToRawIntBits(-fMo5016toPx0680j_4) << c)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << c) | (Float.floatToRawIntBits(r12) & j2)), Paint);
                canvas.restore();
            } else {
                f = fIntBitsToFloat;
                c = c2;
                j2 = j3;
            }
            if (i2 == iIntValue) {
                return;
            }
            i2++;
            drawScope2 = drawScope;
            j3 = j2;
            c2 = c;
            fIntBitsToFloat = f;
        }
    }

    /* renamed from: drawGaugeArc-iJQMabo, reason: not valid java name */
    private static final void m18421drawGaugeArciJQMabo(DrawScope drawScope, long j, float f, int i, StepGauge3 stepGauge3) {
        float f2 = i;
        float fMo5016toPx0680j_4 = arcDegrees;
        float f3 = arcDegrees / f2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.getDrawContext().mo6936getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.getDrawContext().mo6936getSizeNHjbRc() & 4294967295L));
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float f4 = arcStrokeWidth;
        float fMo5016toPx0680j_42 = drawScope.mo5016toPx0680j_4(f4) - drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        Stroke stroke = new Stroke(fMo5016toPx0680j_42, 0.0f, companion.m6849getRoundKaPHkGw(), 0, null, 24, null);
        Stroke stroke2 = new Stroke(drawScope.mo5016toPx0680j_4(f4), 0.0f, companion.m6849getRoundKaPHkGw(), 0, null, 24, null);
        if (f == 0.0f) {
            fMo5016toPx0680j_4 = drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) 0.1d));
        } else if (f != f2) {
            fMo5016toPx0680j_4 = f3 * f;
        }
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)));
        int i2 = WhenMappings.$EnumSwitchMapping$0[stepGauge3.ordinal()];
        if (i2 == 1) {
            stroke = stroke2;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        DrawScope.m6945drawArcyD3GUKo$default(drawScope, j, startArcAngle, fMo5016toPx0680j_4, false, jM6535constructorimpl, jM6575constructorimpl, 0.0f, stroke, null, 0, 832, null);
    }

    private static final void StepGaugeInnerContent(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(892972945);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function2 = StepGauge.INSTANCE.m18408getLambda$962295008$feature_lib_rhy_rewards_externalRelease();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892972945, i3, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeInnerContent (StepGauge.kt:338)");
            }
            BoxWithConstraints.BoxWithConstraints(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, arcStrokeWidth), null, false, ComposableLambda3.rememberComposableLambda(-953875333, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeKt.StepGaugeInnerContent.1
                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-953875333, i5, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeInnerContent.<anonymous> (StepGauge.kt:349)");
                    }
                    float fMo5103getMaxWidthD9Ej5fM = BoxWithConstraints.mo5103getMaxWidthD9Ej5fM();
                    float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
                    float fStepGaugeInnerContent$squareLengthInsideCircle = StepGauge6.StepGaugeInnerContent$squareLengthInsideCircle(fMo5103getMaxWidthD9Ej5fM);
                    float fStepGaugeInnerContent$squareLengthInsideCircle2 = StepGauge6.StepGaugeInnerContent$squareLengthInsideCircle(fMo5102getMaxHeightD9Ej5fM);
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fMo5103getMaxWidthD9Ej5fM - fStepGaugeInnerContent$squareLengthInsideCircle) / 2.0f), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fMo5102getMaxHeightD9Ej5fM - fStepGaugeInnerContent$squareLengthInsideCircle2) / 2.0f), 0.0f, C2002Dp.m7995constructorimpl(StepGauge6.arcStrokeWidth / 2), 4, null), fStepGaugeInnerContent$squareLengthInsideCircle, C2002Dp.m7995constructorimpl(fStepGaugeInnerContent$squareLengthInsideCircle2 * 1.25f));
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5171sizeVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function22.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StepGauge6.StepGaugeInnerContent$lambda$13(function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
