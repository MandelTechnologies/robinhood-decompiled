package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RhyProgressBar.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0016\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\f\u0010\u001a\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "totalSteps", "Landroidx/compose/ui/Modifier;", "modifier", "pendingSteps", "completedSteps", "Lcom/robinhood/android/rhyrewards/ui/ProgressBarColors;", "colors", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function0;", "", AnnotatedPrivateKey.LABEL, "RhyProgressBar", "(ILandroidx/compose/ui/Modifier;IILcom/robinhood/android/rhyrewards/ui/ProgressBarColors;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "steps", "drawProgressBarLine-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "drawProgressBarLine", "Landroidx/compose/ui/unit/Dp;", "progressBarHeight", "F", "pendingFloatAnimated", "completedFloatAnimated", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhyrewards.ui.RhyProgressBarKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyProgressBar3 {
    private static final float progressBarHeight = C2002Dp.m7995constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyProgressBar$lambda$7(int i, Modifier modifier, int i2, int i3, RhyProgressBar rhyProgressBar, AnimationSpec animationSpec, Function2 function2, int i4, int i5, Composer composer, int i6) {
        RhyProgressBar(i, modifier, i2, i3, rhyProgressBar, animationSpec, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyProgressBar(final int i, Modifier modifier, int i2, int i3, RhyProgressBar rhyProgressBar, AnimationSpec<Float> animationSpec, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        AnimationSpec<Float> tweenSpec;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function22;
        RhyProgressBar rhyProgressBar2;
        int i13;
        int i14;
        int i15;
        AnimationSpec<Float> animationSpec2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2;
        final long progressBarBackgroundColor;
        final long progressBarPendingColor;
        final long progressBarFillColor;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged;
        Object objRememberedValue;
        final AnimationSpec<Float> animationSpec3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final int i16;
        final int i17;
        final RhyProgressBar rhyProgressBar3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        RhyProgressBar rhyProgressBar4 = rhyProgressBar;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2077911627);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    i8 = i2;
                    i6 |= composerStartRestartGroup.changed(i8) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        i10 = i3;
                        i6 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
                    }
                    if ((i4 & 24576) == 0) {
                        if ((i5 & 16) != 0) {
                            i18 = 8192;
                            i6 |= i18;
                        } else {
                            if ((32768 & i4) == 0 ? composerStartRestartGroup.changed(rhyProgressBar4) : composerStartRestartGroup.changedInstance(rhyProgressBar4)) {
                                i18 = 16384;
                            }
                            i6 |= i18;
                        }
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        if ((196608 & i4) == 0) {
                            tweenSpec = animationSpec;
                            i6 |= composerStartRestartGroup.changedInstance(tweenSpec) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                            function22 = function2;
                        } else {
                            function22 = function2;
                            if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                            }
                        }
                        if ((i6 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            rhyProgressBar3 = rhyProgressBar4;
                            modifier3 = modifier2;
                            i16 = i8;
                            animationSpec3 = tweenSpec;
                            function24 = function22;
                            i17 = i10;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i19 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i9 != 0) {
                                    i10 = 0;
                                }
                                if ((i5 & 16) != 0) {
                                    rhyProgressBar4 = RhyProgressBar.INSTANCE.getDefault();
                                    i6 &= -57345;
                                }
                                if (i11 != 0) {
                                    tweenSpec = new TweenSpec(1000, 0, null, 6, null);
                                }
                                if (i12 == 0) {
                                    rhyProgressBar2 = rhyProgressBar4;
                                    i13 = i6;
                                    i14 = i8;
                                    i15 = i10;
                                    animationSpec2 = tweenSpec;
                                    function23 = null;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2077911627, i13, -1, "com.robinhood.android.rhyrewards.ui.RhyProgressBar (RhyProgressBar.kt:68)");
                                }
                                int i20 = i13 >> 12;
                                int i21 = i20 & 112;
                                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i14, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i21, 28);
                                snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(i15, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i21, 28);
                                int i22 = i20 & 14;
                                progressBarBackgroundColor = rhyProgressBar2.getProgressBarBackgroundColor(composerStartRestartGroup, i22);
                                int i23 = i14;
                                int i24 = i15;
                                progressBarPendingColor = rhyProgressBar2.getProgressBarPendingColor(composerStartRestartGroup, i22);
                                AnimationSpec<Float> animationSpec4 = animationSpec2;
                                progressBarFillColor = rhyProgressBar2.getProgressBarFillColor(composerStartRestartGroup, i22);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                RhyProgressBar rhyProgressBar5 = rhyProgressBar2;
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                int i25 = i13;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Modifier modifier4 = modifier2;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(1553025849);
                                if (function23 != null) {
                                    function23.invoke(composerStartRestartGroup, 0);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged = composerStartRestartGroup.changed(progressBarBackgroundColor) | ((i25 & 14) == 4) | composerStartRestartGroup.changed(progressBarPendingColor) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState2) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(progressBarFillColor);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Function1 function1 = new Function1() { // from class: com.robinhood.android.rhyrewards.ui.RhyProgressBarKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RhyProgressBar3.RhyProgressBar$lambda$6$lambda$5$lambda$4$lambda$3(progressBarBackgroundColor, i, progressBarPendingColor, progressBarFillColor, snapshotState4AnimateFloatAsState2, snapshotState4AnimateFloatAsState, (DrawScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function1);
                                    objRememberedValue = function1;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Canvas2.Canvas(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                animationSpec3 = animationSpec4;
                                modifier3 = modifier4;
                                function24 = function23;
                                i16 = i23;
                                i17 = i24;
                                rhyProgressBar3 = rhyProgressBar5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 16) != 0) {
                                    i6 &= -57345;
                                }
                            }
                            i13 = i6;
                            i15 = i10;
                            function23 = function22;
                            rhyProgressBar2 = rhyProgressBar4;
                            i14 = i8;
                            animationSpec2 = tweenSpec;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i202 = i13 >> 12;
                            int i212 = i202 & 112;
                            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i14, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i212, 28);
                            snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(i15, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i212, 28);
                            int i222 = i202 & 14;
                            progressBarBackgroundColor = rhyProgressBar2.getProgressBarBackgroundColor(composerStartRestartGroup, i222);
                            int i232 = i14;
                            int i242 = i15;
                            progressBarPendingColor = rhyProgressBar2.getProgressBarPendingColor(composerStartRestartGroup, i222);
                            AnimationSpec<Float> animationSpec42 = animationSpec2;
                            progressBarFillColor = rhyProgressBar2.getProgressBarFillColor(composerStartRestartGroup, i222);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            RhyProgressBar rhyProgressBar52 = rhyProgressBar2;
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            int i252 = i13;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier42 = modifier2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(1553025849);
                                    if (function23 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChanged = composerStartRestartGroup.changed(progressBarBackgroundColor) | ((i252 & 14) == 4) | composerStartRestartGroup.changed(progressBarPendingColor) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState2) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(progressBarFillColor);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        Function1 function12 = new Function1() { // from class: com.robinhood.android.rhyrewards.ui.RhyProgressBarKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return RhyProgressBar3.RhyProgressBar$lambda$6$lambda$5$lambda$4$lambda$3(progressBarBackgroundColor, i, progressBarPendingColor, progressBarFillColor, snapshotState4AnimateFloatAsState2, snapshotState4AnimateFloatAsState, (DrawScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(function12);
                                        objRememberedValue = function12;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Canvas2.Canvas(modifierM5144paddingVpY3zN4$default2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        animationSpec3 = animationSpec42;
                                        modifier3 = modifier42;
                                        function24 = function23;
                                        i16 = i232;
                                        i17 = i242;
                                        rhyProgressBar3 = rhyProgressBar52;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.RhyProgressBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return RhyProgressBar3.RhyProgressBar$lambda$7(i, modifier3, i16, i17, rhyProgressBar3, animationSpec3, function24, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= 196608;
                    tweenSpec = animationSpec;
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    if ((i6 & 599187) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                            if (i19 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if ((i5 & 16) != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 == 0) {
                                i13 = i6;
                                i15 = i10;
                                function23 = function22;
                                rhyProgressBar2 = rhyProgressBar4;
                                i14 = i8;
                                animationSpec2 = tweenSpec;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i2022 = i13 >> 12;
                            int i2122 = i2022 & 112;
                            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i14, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i2122, 28);
                            snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(i15, animationSpec2, 0.0f, null, null, composerStartRestartGroup, i2122, 28);
                            int i2222 = i2022 & 14;
                            progressBarBackgroundColor = rhyProgressBar2.getProgressBarBackgroundColor(composerStartRestartGroup, i2222);
                            int i2322 = i14;
                            int i2422 = i15;
                            progressBarPendingColor = rhyProgressBar2.getProgressBarPendingColor(composerStartRestartGroup, i2222);
                            AnimationSpec<Float> animationSpec422 = animationSpec2;
                            progressBarFillColor = rhyProgressBar2.getProgressBarFillColor(composerStartRestartGroup, i2222);
                            Alignment.Companion companion42 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getCenterStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            RhyProgressBar rhyProgressBar522 = rhyProgressBar2;
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                            int i2522 = i13;
                            Function0<ComposeUiNode> constructor32 = companion222.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier422 = modifier2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion222.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i3;
                if ((i4 & 24576) == 0) {
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                tweenSpec = animationSpec;
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                if ((i6 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i2;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            i10 = i3;
            if ((i4 & 24576) == 0) {
            }
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            tweenSpec = animationSpec;
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            if ((i6 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i2;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        i10 = i3;
        if ((i4 & 24576) == 0) {
        }
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        tweenSpec = animationSpec;
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        if ((i6 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final float RhyProgressBar$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float RhyProgressBar$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyProgressBar$lambda$6$lambda$5$lambda$4$lambda$3(long j, int i, long j2, long j3, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        m18418drawProgressBarLineRPmYEkk(Canvas, j, i, i);
        m18418drawProgressBarLineRPmYEkk(Canvas, j2, RhyProgressBar$lambda$1(snapshotState4) + RhyProgressBar$lambda$0(snapshotState42), i);
        m18418drawProgressBarLineRPmYEkk(Canvas, j3, RhyProgressBar$lambda$1(snapshotState4), i);
        return Unit.INSTANCE;
    }

    /* renamed from: drawProgressBarLine-RPmYEkk, reason: not valid java name */
    private static final void m18418drawProgressBarLineRPmYEkk(DrawScope drawScope, long j, float f, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() & 4294967295L)) / 2;
        float f2 = f / i;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f3 = (z ? 0.0f : 1.0f - f2) * fIntBitsToFloat;
        if (!z) {
            f2 = 1.0f;
        }
        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f2 * fIntBitsToFloat) << 32)), drawScope.mo5016toPx0680j_4(progressBarHeight), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }
}
