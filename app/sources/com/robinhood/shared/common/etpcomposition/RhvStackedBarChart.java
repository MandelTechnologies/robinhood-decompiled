package com.robinhood.shared.common.etpcomposition;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhvStackedBarChart.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\r\u0010 \u001a\u00020\nH\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"BAR_HEIGHT", "", "BAR_WIDTH", "BAR_SPACING", "ANIMATION_DURATION", "ANIMATION_DELAY_BETWEEN_SECTIONS", "", "ANIMATION_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "RhvStackedBarChart", "", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "height", "Landroidx/compose/ui/unit/Dp;", "startAnimation", "", "RhvStackedBarChart-942rkJo", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;FZLandroidx/compose/runtime/Composer;II)V", "RhvStackedBarChartSection", ResourceTypes.COLOR, "visible", "highlightGradient", "Landroidx/compose/ui/graphics/Brush;", "shadowGradient", "RhvStackedBarChartSection-tBgoCNw", "(JZFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RhvStackedBarChartPreviewLight", "(Landroidx/compose/runtime/Composer;I)V", "lib-etp-composition_externalDebug", "sectionAnimationIndex", "barCount"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RhvStackedBarChart {
    private static final long ANIMATION_DELAY_BETWEEN_SECTIONS = 67;
    private static final int ANIMATION_DURATION = 500;
    private static final CubicBezierEasing ANIMATION_EASING = new CubicBezierEasing(0.02f, 0.0f, 0.1f, 1.0f);
    private static final int BAR_HEIGHT = 100;
    private static final int BAR_SPACING = 3;
    private static final int BAR_WIDTH = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvStackedBarChartPreviewLight$lambda$21(int i, Composer composer, int i2) {
        RhvStackedBarChartPreviewLight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhvStackedBarChartSection_tBgoCNw$lambda$18$lambda$17$lambda$16$lambda$15 */
    public static final int m2766x9356ac64(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvStackedBarChartSection_tBgoCNw$lambda$19(long j, boolean z, float f, Brush brush, Brush brush2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m24846RhvStackedBarChartSectiontBgoCNw(j, z, f, brush, brush2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvStackedBarChart_942rkJo$lambda$8(ImmutableList immutableList, Modifier modifier, float f, boolean z, int i, int i2, Composer composer, int i3) {
        m24845RhvStackedBarChart942rkJo(immutableList, modifier, f, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final int RhvStackedBarChart_942rkJo$lambda$3(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0272  */
    /* renamed from: RhvStackedBarChart-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24845RhvStackedBarChart942rkJo(final ImmutableList<Tuples2<Float, Color>> sections, Modifier modifier, float f, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        boolean z2;
        boolean zIsSystemInDarkTheme;
        boolean zChanged;
        Object objRememberedValue;
        Brush brushM6683verticalGradient8A3gB4$default;
        boolean zChanged2;
        Object objRememberedValue2;
        Brush brushM6683verticalGradient8A3gB4$default2;
        Object objRememberedValue3;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean z3;
        Object objRememberedValue4;
        Object obj;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z4;
        final Modifier modifier3;
        final float f3;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.4f);
        Float fValueOf3 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(sections, "sections");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1512100865);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sections) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(100) : f2;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1512100865, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChart (RhvStackedBarChart.kt:61)");
                        }
                        zIsSystemInDarkTheme = DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(zIsSystemInDarkTheme);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            if (zIsSystemInDarkTheme) {
                                Brush.Companion companion2 = Brush.INSTANCE;
                                Color.Companion companion3 = Color.INSTANCE;
                                brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6683verticalGradient8A3gB4$default(companion2, new Tuples2[]{Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion3.m6727getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.3f), Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                            } else {
                                Brush.Companion companion4 = Brush.INSTANCE;
                                Color.Companion companion5 = Color.INSTANCE;
                                brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6683verticalGradient8A3gB4$default(companion4, new Tuples2[]{Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion5.m6727getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(companion5.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                            }
                            objRememberedValue = brushM6683verticalGradient8A3gB4$default;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Brush brush = (Brush) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(zIsSystemInDarkTheme);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            if (zIsSystemInDarkTheme) {
                                Brush.Companion companion6 = Brush.INSTANCE;
                                Color.Companion companion7 = Color.INSTANCE;
                                brushM6683verticalGradient8A3gB4$default2 = Brush.Companion.m6683verticalGradient8A3gB4$default(companion6, new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(companion7.m6725getTransparent0d7_KjU())), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion7.m6716getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                            } else {
                                Brush.Companion companion8 = Brush.INSTANCE;
                                Float fValueOf4 = Float.valueOf(0.7f);
                                Color.Companion companion9 = Color.INSTANCE;
                                brushM6683verticalGradient8A3gB4$default2 = Brush.Companion.m6683verticalGradient8A3gB4$default(companion8, new Tuples2[]{Tuples4.m3642to(fValueOf4, Color.m6701boximpl(companion9.m6725getTransparent0d7_KjU())), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion9.m6716getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                            }
                            objRememberedValue2 = brushM6683verticalGradient8A3gB4$default2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Brush brush2 = (Brush) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(-1, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Integer numValueOf = Integer.valueOf(sections.size());
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        z3 = ((i3 & 14) != 4) | ((i3 & 7168) != 2048);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue4 == companion.getEmpty()) {
                            obj = null;
                            objRememberedValue4 = new RhvStackedBarChart2(z2, sections, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf, boolValueOf, (Function2) objRememberedValue4, composerStartRestartGroup, (i3 >> 6) & 112);
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, obj), C2002Dp.m7995constructorimpl(100));
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion10.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion10.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion10.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion10.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion10.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1823366397);
                        int i7 = 0;
                        for (Tuples2<Float, Color> tuples2 : sections) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Tuples2<Float, Color> tuples22 = tuples2;
                            float fFloatValue = tuples22.component1().floatValue();
                            long value = tuples22.component2().getValue();
                            composerStartRestartGroup.startReplaceGroup(1823367757);
                            if (i7 > 0) {
                                z5 = false;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            } else {
                                z5 = false;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Brush brush3 = brush;
                            m24846RhvStackedBarChartSectiontBgoCNw(value, i7 <= RhvStackedBarChart_942rkJo$lambda$3(snapshotState) ? true : z5, fM7995constructorimpl, brush3, brush2, Row5.weight$default(row6, Modifier.INSTANCE, fFloatValue, false, 2, null), composerStartRestartGroup, i3 & 896, 0);
                            z2 = z2;
                            brush = brush3;
                            i3 = i3;
                            i7 = i8;
                        }
                        boolean z6 = z2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z6;
                        modifier3 = modifier4;
                        f3 = fM7995constructorimpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        modifier3 = modifier2;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return RhvStackedBarChart.RhvStackedBarChart_942rkJo$lambda$8(sections, modifier3, f3, z4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z2 = z;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    zIsSystemInDarkTheme = DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(zIsSystemInDarkTheme);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        if (zIsSystemInDarkTheme) {
                        }
                        objRememberedValue = brushM6683verticalGradient8A3gB4$default;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Brush brush4 = (Brush) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(zIsSystemInDarkTheme);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            if (zIsSystemInDarkTheme) {
                            }
                            objRememberedValue2 = brushM6683verticalGradient8A3gB4$default2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Brush brush22 = (Brush) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Integer numValueOf2 = Integer.valueOf(sections.size());
                            Boolean boolValueOf2 = Boolean.valueOf(z2);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            if ((i3 & 7168) != 2048) {
                            }
                            z3 = ((i3 & 14) != 4) | ((i3 & 7168) != 2048);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z3) {
                                obj = null;
                                objRememberedValue4 = new RhvStackedBarChart2(z2, sections, snapshotState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf2, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, (i3 >> 6) & 112);
                                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, obj), C2002Dp.m7995constructorimpl(100));
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                                ComposeUiNode.Companion companion102 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion102.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion102.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion102.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion102.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion102.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(1823366397);
                                    int i72 = 0;
                                    while (r0.hasNext()) {
                                    }
                                    boolean z62 = z2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z4 = z62;
                                    modifier3 = modifier4;
                                    f3 = fM7995constructorimpl;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RhvStackedBarChart_942rkJo$lambda$4(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ba  */
    /* renamed from: RhvStackedBarChartSection-tBgoCNw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m24846RhvStackedBarChartSectiontBgoCNw(final long j, final boolean z, final float f, final Brush brush, final Brush brush2, Modifier modifier, Composer composer, final int i, final int i2) {
        final long j2;
        int i3;
        final float f2;
        final Brush brush3;
        Brush brush4;
        int i4;
        final Modifier modifier2;
        final Density density;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int intValue;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2081744963);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                brush3 = brush;
            } else {
                brush3 = brush;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(brush3) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                brush4 = brush2;
            } else {
                brush4 = brush2;
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(brush4) ? 16384 : 8192;
                }
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 196608) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081744963, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartSection (RhvStackedBarChart.kt:147)");
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier2, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhvStackedBarChart.RhvStackedBarChartSection_tBgoCNw$lambda$14$lambda$13(density, snapshotIntState2, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxHeight$default, (Function1) objRememberedValue2);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    int i6 = i3;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1304464184);
                    intValue = snapshotIntState2.getIntValue();
                    i5 = 0;
                    while (i5 < intValue) {
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, ANIMATION_EASING, 2, null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(RhvStackedBarChart.m2766x9356ac64(((Integer) obj).intValue()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue3);
                        final Brush brush5 = brush4;
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionSlideInVertically, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-238166271, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$RhvStackedBarChartSection$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-238166271, i7, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartSection.<anonymous>.<anonymous>.<anonymous> (RhvStackedBarChart.kt:174)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion3, f2);
                                long j3 = j2;
                                Brush brush6 = brush3;
                                Brush brush7 = brush5;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                float f3 = 2;
                                BoxKt.Box(Background3.background$default(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f3)), 0.0f, 1, null), j3, null, 2, null), brush6, null, 0.0f, 6, null), composer2, 0);
                                BoxKt.Box(Background3.background$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f3)), 0.0f, 1, null), brush7, null, 0.0f, 6, null), composer2, 0);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 14) | 196608, 26);
                        i5++;
                        j2 = j;
                        f2 = f;
                        brush3 = brush;
                        brush4 = brush2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhvStackedBarChart.RhvStackedBarChartSection_tBgoCNw$lambda$19(j, z, f, brush, brush2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifier2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvStackedBarChart.RhvStackedBarChartSection_tBgoCNw$lambda$14$lambda$13(density, snapshotIntState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxHeight$default2, (Function1) objRememberedValue2);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    int i62 = i3;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1304464184);
                        intValue = snapshotIntState2.getIntValue();
                        i5 = 0;
                        while (i5 < intValue) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvStackedBarChartSection_tBgoCNw$lambda$14$lambda$13(Density density, SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue(Math.max(0, (int) ((density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() >> 32)) + 3) / 5)));
        return Unit.INSTANCE;
    }

    private static final void RhvStackedBarChartPreviewLight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1248363310);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1248363310, i, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartPreviewLight (RhvStackedBarChart.kt:196)");
            }
            final ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(Tuples4.m3642to(Float.valueOf(10.3f), Color.m6701boximpl(Color2.Color(4284134909L))), Tuples4.m3642to(Float.valueOf(5.3f), Color.m6701boximpl(Color2.Color(4288248556L))), Tuples4.m3642to(Float.valueOf(5.5f), Color.m6701boximpl(Color2.Color(4294951175L))), Tuples4.m3642to(Float.valueOf(79.4f), Color.m6701boximpl(Color2.Color(4288585374L))));
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(650463680, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$RhvStackedBarChartPreviewLight$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650463680, i2, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartPreviewLight.<anonymous>.<anonymous> (RhvStackedBarChart.kt:205)");
                    }
                    ImmutableList3<Tuples2<Float, Color>> immutableList3 = immutableList3PersistentListOf;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    RhvStackedBarChart.m24845RhvStackedBarChart942rkJo(immutableList3, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), composer2, 0, 0), 0.0f, false, composer2, 6, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1747017833, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$RhvStackedBarChartPreviewLight$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1747017833, i2, -1, "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartPreviewLight.<anonymous>.<anonymous> (RhvStackedBarChart.kt:215)");
                    }
                    ImmutableList3<Tuples2<Float, Color>> immutableList3 = immutableList3PersistentListOf;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    RhvStackedBarChart.m24845RhvStackedBarChart942rkJo(immutableList3, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), composer2, 0, 0), 0.0f, false, composer2, 6, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvStackedBarChart.RhvStackedBarChartPreviewLight$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
