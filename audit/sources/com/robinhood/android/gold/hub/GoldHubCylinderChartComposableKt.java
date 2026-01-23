package com.robinhood.android.gold.hub;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsColorStop;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsCylinderChartSegment;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsLinearGradientColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldHubCylinderChartComposable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aU\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\nH\u0003¢\u0006\u0002\u0010$\u001a%\u0010%\u001a\u00020&*\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001b2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+\u001a9\u0010,\u001a\u00020-*\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u0010)\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u0015H\u0001¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u00105\u001a\r\u00106\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00107\u001a\r\u00109\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00107\u001a\r\u0010:\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00107¨\u0006;²\u0006\n\u0010<\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"GoldHubCylinderChartComposable", "", "chartData", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsCylinderChartSegment;", "height", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "animateEntry", "", "GoldHubCylinderChartComposable-DzVHIIc", "(Lkotlinx/collections/immutable/ImmutableList;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "getCylinderBodyPath", "Landroidx/compose/ui/graphics/Path;", "ovalRadius", "", "width", "sideType", "Lcom/robinhood/android/gold/hub/CylinderPathSideType;", "startOffset", "Landroidx/compose/ui/geometry/Offset;", "drawTopBottom", "getCylinderBodyPath-A5_d8yw", "(FFFLcom/robinhood/android/gold/hub/CylinderPathSideType;JZ)Landroidx/compose/ui/graphics/Path;", "CylinderChartSegment", "sideColor", "", "fillColorGradient", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;", "fill", "emptyColorGradient", "borderColor", "animationSpec", "Lcom/robinhood/android/gold/hub/SegmentAnimationSpec;", "isSingle", "(Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;FLcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/hub/SegmentAnimationSpec;ZLandroidx/compose/runtime/Composer;II)V", "fromHexDefaulted", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Color$Companion;", "colorHex", "defaultColor", "fromHexDefaulted-mxwnekA", "(Landroidx/compose/ui/graphics/Color$Companion;Ljava/lang/String;J)J", "linearGradientFromServer", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Brush$Companion;", "linearGradientColor", "start", "end", "linearGradientFromServer-blSgnlo", "(Landroidx/compose/ui/graphics/Brush$Companion;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Brush;", "GoldHubCylinderCharts", "(ZLandroidx/compose/runtime/Composer;II)V", "GoldHubCylinderChartsStaticDay", "(Landroidx/compose/runtime/Composer;I)V", "GoldHubCylinderChartsStaticNight", "GoldHubCylinderChartsAnimatedDay", "GoldHubCylinderChartsAnimatedNight", "feature-gold-hub_externalDebug", "prevWeight", "targetWidth"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldHubCylinderChartComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CylinderChartSegment$lambda$15(String str, ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor, float f, ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor2, String str2, Modifier modifier, SegmentAnimationSpec segmentAnimationSpec, boolean z, int i, int i2, Composer composer, int i3) {
        CylinderChartSegment(str, apiGoldEarningsLinearGradientColor, f, apiGoldEarningsLinearGradientColor2, str2, modifier, segmentAnimationSpec, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderChartComposable_DzVHIIc$lambda$6(ImmutableList immutableList, float f, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        m15035GoldHubCylinderChartComposableDzVHIIc(immutableList, f, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderCharts$lambda$19(boolean z, int i, int i2, Composer composer, int i3) {
        GoldHubCylinderCharts(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderChartsAnimatedDay$lambda$22(int i, Composer composer, int i2) {
        GoldHubCylinderChartsAnimatedDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderChartsAnimatedNight$lambda$23(int i, Composer composer, int i2) {
        GoldHubCylinderChartsAnimatedNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderChartsStaticDay$lambda$20(int i, Composer composer, int i2) {
        GoldHubCylinderChartsStaticDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubCylinderChartsStaticNight$lambda$21(int i, Composer composer, int i2) {
        GoldHubCylinderChartsStaticNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* renamed from: GoldHubCylinderChartComposable-DzVHIIc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15035GoldHubCylinderChartComposableDzVHIIc(final ImmutableList<ApiGoldEarningsCylinderChartSegment> chartData, final float f, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033294070);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    int i6 = 0;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2033294070, i3, -1, "com.robinhood.android.gold.hub.GoldHubCylinderChartComposable (GoldHubCylinderChartComposable.kt:54)");
                    }
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier4, f);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z5 = true;
                    boolean z6 = chartData.size() != 1;
                    composerStartRestartGroup.startMovableGroup(-65396438, chartData);
                    int i7 = 0;
                    for (ApiGoldEarningsCylinderChartSegment apiGoldEarningsCylinderChartSegment : chartData) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ApiGoldEarningsCylinderChartSegment apiGoldEarningsCylinderChartSegment2 = apiGoldEarningsCylinderChartSegment;
                        int iRoundToInt = z6 ? i6 : MathKt.roundToInt(snapshotFloatState2.getFloatValue() * CylinderBarConstants.TOTAL_ANIMATION_DURATION);
                        int iRoundToInt2 = z6 ? CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE : MathKt.roundToInt(apiGoldEarningsCylinderChartSegment2.getWeight() * CylinderBarConstants.TOTAL_ANIMATION_DURATION);
                        String sideColor = apiGoldEarningsCylinderChartSegment2.getSideColor();
                        boolean z7 = z5;
                        ApiGoldEarningsLinearGradientColor fillColorGradient = apiGoldEarningsCylinderChartSegment2.getFillColorGradient();
                        int i9 = i7;
                        float fill = apiGoldEarningsCylinderChartSegment2.getFill();
                        String borderColor = apiGoldEarningsCylinderChartSegment2.getBorderColor();
                        ApiGoldEarningsLinearGradientColor emptyColorGradient = apiGoldEarningsCylinderChartSegment2.getEmptyColorGradient();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        CylinderChartSegment(sideColor, fillColorGradient, fill, emptyColorGradient, borderColor, Row5.weight$default(row6, companion2, apiGoldEarningsCylinderChartSegment2.getWeight(), false, 2, null), z4 ? new SegmentAnimationSpec(iRoundToInt, iRoundToInt2) : null, z6, composerStartRestartGroup, 0, 0);
                        if (i9 < chartData.size() - 1) {
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                        }
                        snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + apiGoldEarningsCylinderChartSegment2.getWeight());
                        i6 = 0;
                        z5 = z7;
                        i7 = i8;
                    }
                    composerStartRestartGroup.endMovableGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldHubCylinderChartComposableKt.GoldHubCylinderChartComposable_DzVHIIc$lambda$6(chartData, f, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                int i62 = 0;
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier4, f);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z52 = true;
                    if (chartData.size() != 1) {
                    }
                    composerStartRestartGroup.startMovableGroup(-65396438, chartData);
                    int i72 = 0;
                    while (r3.hasNext()) {
                    }
                    composerStartRestartGroup.endMovableGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: getCylinderBodyPath-A5_d8yw$default, reason: not valid java name */
    public static /* synthetic */ Path m15038getCylinderBodyPathA5_d8yw$default(float f, float f2, float f3, CylinderPathSideType cylinderPathSideType, long j, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            cylinderPathSideType = CylinderPathSideType.FLAT;
        }
        CylinderPathSideType cylinderPathSideType2 = cylinderPathSideType;
        if ((i & 16) != 0) {
            j = Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        long j2 = j;
        if ((i & 32) != 0) {
            z = true;
        }
        return m15037getCylinderBodyPathA5_d8yw(f, f2, f3, cylinderPathSideType2, j2, z);
    }

    /* renamed from: getCylinderBodyPath-A5_d8yw, reason: not valid java name */
    public static final Path m15037getCylinderBodyPathA5_d8yw(float f, float f2, float f3, CylinderPathSideType sideType, long j, boolean z) {
        long j2;
        Intrinsics.checkNotNullParameter(sideType, "sideType");
        Path Path = AndroidPath_androidKt.Path();
        if (sideType == CylinderPathSideType.CONVEX) {
            j2 = 4294967295L;
            Path.arcTo(Rect2.m6565Recttz77jQw(j, Size.m6575constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(2 * f) << 32))), 90.0f, 180.0f, false);
            Path.arcTo(Rect2.m6565Recttz77jQw(j, Size.m6575constructorimpl((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L))), -90.0f, 180.0f, false);
        } else {
            j2 = 4294967295L;
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & j2);
        Path.moveTo(Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2));
        float fIntBitsToFloat = Float.intBitsToFloat(i) + f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        if (z) {
            Path.lineTo(fIntBitsToFloat, fIntBitsToFloat2);
        } else {
            Path.moveTo(fIntBitsToFloat, fIntBitsToFloat2);
        }
        Path.arcTo(Rect2.m6565Recttz77jQw(Offset.m6547plusMKHz9U(j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & j2) | (Float.floatToRawIntBits(f2) << 32))), Size.m6575constructorimpl((Float.floatToRawIntBits(f3) & j2) | (Float.floatToRawIntBits(2 * f) << 32))), -90.0f, 180.0f, false);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) + f3;
        if (z) {
            Path.lineTo(fIntBitsToFloat3, fIntBitsToFloat4);
        } else {
            Path.moveTo(fIntBitsToFloat3, fIntBitsToFloat4);
        }
        if (sideType == CylinderPathSideType.CONCAVE) {
            Path.arcTo(Rect2.m6565Recttz77jQw(Offset.m6547plusMKHz9U(j, Offset.m6535constructorimpl((Float.floatToRawIntBits(1.5f) << 32) | (Float.floatToRawIntBits(0.0f) & j2))), Size.m6575constructorimpl((Float.floatToRawIntBits(r7) << 32) | (Float.floatToRawIntBits(f3) & j2))), 90.0f, -180.0f, false);
        }
        return Path;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CylinderChartSegment(final String str, final ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor, final float f, final ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor2, final String str2, Modifier modifier, SegmentAnimationSpec segmentAnimationSpec, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor3;
        int i4;
        Modifier modifier2;
        int i5;
        SegmentAnimationSpec segmentAnimationSpec2;
        int i6;
        final long jM15036fromHexDefaultedmxwnekA;
        final long jM15036fromHexDefaultedmxwnekA2;
        SegmentAnimationSpec segmentAnimationSpec3;
        boolean z2;
        final Brush brushM15039linearGradientFromServerblSgnlo;
        final Brush brushM15039linearGradientFromServerblSgnlo2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue2;
        final Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Object obj;
        final SegmentAnimationSpec segmentAnimationSpec4;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        Composer composer2;
        final boolean z3;
        final Modifier modifier3;
        final boolean z4;
        final SegmentAnimationSpec segmentAnimationSpec5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-178848935);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(apiGoldEarningsLinearGradientColor) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                    apiGoldEarningsLinearGradientColor3 = apiGoldEarningsLinearGradientColor2;
                } else {
                    apiGoldEarningsLinearGradientColor3 = apiGoldEarningsLinearGradientColor2;
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(apiGoldEarningsLinearGradientColor3) ? 2048 : 1024;
                    }
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    i5 = i2 & 64;
                    if (i5 != 0) {
                        if ((1572864 & i) == 0) {
                            segmentAnimationSpec2 = segmentAnimationSpec;
                            i3 |= composerStartRestartGroup.changed(segmentAnimationSpec2) ? 1048576 : 524288;
                        }
                        i6 = i2 & 128;
                        if (i6 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            segmentAnimationSpec5 = segmentAnimationSpec2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            SegmentAnimationSpec segmentAnimationSpec6 = i5 == 0 ? null : segmentAnimationSpec2;
                            boolean z5 = i6 == 0 ? false : z;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178848935, i3, -1, "com.robinhood.android.gold.hub.CylinderChartSegment (GoldHubCylinderChartComposable.kt:195)");
                            }
                            Color.Companion companion2 = Color.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            jM15036fromHexDefaultedmxwnekA = m15036fromHexDefaultedmxwnekA(companion2, str, bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU());
                            jM15036fromHexDefaultedmxwnekA2 = m15036fromHexDefaultedmxwnekA(companion2, str2, bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU());
                            Brush.Companion companion3 = Brush.INSTANCE;
                            segmentAnimationSpec3 = segmentAnimationSpec6;
                            z2 = z5;
                            brushM15039linearGradientFromServerblSgnlo = m15039linearGradientFromServerblSgnlo(companion3, apiGoldEarningsLinearGradientColor3, bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU(), 0L, 0L, composerStartRestartGroup, ((i3 >> 6) & 112) | 6, 12);
                            brushM15039linearGradientFromServerblSgnlo2 = m15039linearGradientFromServerblSgnlo(companion3, apiGoldEarningsLinearGradientColor, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), 0L, 0L, composerStartRestartGroup, (i3 & 112) | 6, 12);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            animatable = (Animatable) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Float fValueOf = Float.valueOf(snapshotFloatState2.getFloatValue());
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i8 = 3670016 & i3;
                            zChangedInstance = (i8 != 1048576) | composerStartRestartGroup.changedInstance(animatable);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                obj = null;
                                objRememberedValue3 = new GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1(segmentAnimationSpec3, animatable, snapshotFloatState2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                obj = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            segmentAnimationSpec4 = segmentAnimationSpec3;
                            EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, obj);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance2 = (i8 != 1048576) | ((i3 & 896) != 256) | ((i3 & 29360128) == 8388608) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(brushM15039linearGradientFromServerblSgnlo) | composerStartRestartGroup.changed(brushM15039linearGradientFromServerblSgnlo2) | composerStartRestartGroup.changed(jM15036fromHexDefaultedmxwnekA2) | composerStartRestartGroup.changed(jM15036fromHexDefaultedmxwnekA);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                                composer2 = composerStartRestartGroup;
                                z3 = z2;
                                Function1 function1 = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return GoldHubCylinderChartComposableKt.CylinderChartSegment$lambda$14$lambda$13(f, segmentAnimationSpec4, z3, animatable, brushM15039linearGradientFromServerblSgnlo, brushM15039linearGradientFromServerblSgnlo2, jM15036fromHexDefaultedmxwnekA2, jM15036fromHexDefaultedmxwnekA, snapshotFloatState2, (DrawScope) obj2);
                                    }
                                };
                                segmentAnimationSpec4 = segmentAnimationSpec4;
                                composer2.updateRememberedValue(function1);
                                objRememberedValue4 = function1;
                            } else {
                                z3 = z2;
                                composer2 = composerStartRestartGroup;
                            }
                            composer2.endReplaceGroup();
                            Canvas2.Canvas(modifierFillMaxHeight$default, (Function1) objRememberedValue4, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z3;
                            segmentAnimationSpec5 = segmentAnimationSpec4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return GoldHubCylinderChartComposableKt.CylinderChartSegment$lambda$15(str, apiGoldEarningsLinearGradientColor, f, apiGoldEarningsLinearGradientColor2, str2, modifier3, segmentAnimationSpec5, z4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    segmentAnimationSpec2 = segmentAnimationSpec;
                    i6 = i2 & 128;
                    if (i6 != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Color.Companion companion22 = Color.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i72 = BentoTheme.$stable;
                        jM15036fromHexDefaultedmxwnekA = m15036fromHexDefaultedmxwnekA(companion22, str, bentoTheme2.getColors(composerStartRestartGroup, i72).m21427getFg30d7_KjU());
                        jM15036fromHexDefaultedmxwnekA2 = m15036fromHexDefaultedmxwnekA(companion22, str2, bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU());
                        Brush.Companion companion32 = Brush.INSTANCE;
                        segmentAnimationSpec3 = segmentAnimationSpec6;
                        z2 = z5;
                        brushM15039linearGradientFromServerblSgnlo = m15039linearGradientFromServerblSgnlo(companion32, apiGoldEarningsLinearGradientColor3, bentoTheme2.getColors(composerStartRestartGroup, i72).m21427getFg30d7_KjU(), 0L, 0L, composerStartRestartGroup, ((i3 >> 6) & 112) | 6, 12);
                        brushM15039linearGradientFromServerblSgnlo2 = m15039linearGradientFromServerblSgnlo(companion32, apiGoldEarningsLinearGradientColor, bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU(), 0L, 0L, composerStartRestartGroup, (i3 & 112) | 6, 12);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        animatable = (Animatable) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf2 = Float.valueOf(snapshotFloatState2.getFloatValue());
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        int i82 = 3670016 & i3;
                        zChangedInstance = (i82 != 1048576) | composerStartRestartGroup.changedInstance(animatable);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            obj = null;
                            objRememberedValue3 = new GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1(segmentAnimationSpec3, animatable, snapshotFloatState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            segmentAnimationSpec4 = segmentAnimationSpec3;
                            EffectsKt.LaunchedEffect(fValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, obj);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if ((i3 & 896) != 256) {
                            }
                            zChangedInstance2 = (i82 != 1048576) | ((i3 & 896) != 256) | ((i3 & 29360128) == 8388608) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(brushM15039linearGradientFromServerblSgnlo) | composerStartRestartGroup.changed(brushM15039linearGradientFromServerblSgnlo2) | composerStartRestartGroup.changed(jM15036fromHexDefaultedmxwnekA2) | composerStartRestartGroup.changed(jM15036fromHexDefaultedmxwnekA);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2) {
                                composer2 = composerStartRestartGroup;
                                z3 = z2;
                                Function1 function12 = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return GoldHubCylinderChartComposableKt.CylinderChartSegment$lambda$14$lambda$13(f, segmentAnimationSpec4, z3, animatable, brushM15039linearGradientFromServerblSgnlo, brushM15039linearGradientFromServerblSgnlo2, jM15036fromHexDefaultedmxwnekA2, jM15036fromHexDefaultedmxwnekA, snapshotFloatState2, (DrawScope) obj2);
                                    }
                                };
                                segmentAnimationSpec4 = segmentAnimationSpec4;
                                composer2.updateRememberedValue(function12);
                                objRememberedValue4 = function12;
                                composer2.endReplaceGroup();
                                Canvas2.Canvas(modifierFillMaxHeight$default2, (Function1) objRememberedValue4, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                z4 = z3;
                                segmentAnimationSpec5 = segmentAnimationSpec4;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 64;
                if (i5 != 0) {
                }
                segmentAnimationSpec2 = segmentAnimationSpec;
                i6 = i2 & 128;
                if (i6 != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            segmentAnimationSpec2 = segmentAnimationSpec;
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        segmentAnimationSpec2 = segmentAnimationSpec;
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CylinderChartSegment$lambda$14$lambda$13(float f, SegmentAnimationSpec segmentAnimationSpec, boolean z, Animatable animatable, Brush brush, Brush brush2, long j, long j2, SnapshotFloatState2 snapshotFloatState2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) * 0.25f * 0.5f;
        float f2 = fIntBitsToFloat * 2;
        snapshotFloatState2.setFloatValue((Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - f2) * f);
        boolean z2 = segmentAnimationSpec == null && snapshotFloatState2.getFloatValue() > 0.0f;
        Path pathM15038getCylinderBodyPathA5_d8yw$default = m15038getCylinderBodyPathA5_d8yw$default(fIntBitsToFloat, z ? Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - f2 : z2 ? snapshotFloatState2.getFloatValue() : ((Number) animatable.getValue()).floatValue(), Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)), CylinderPathSideType.CONVEX, 0L, false, 48, null);
        if (z || ((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, pathM15038getCylinderBodyPathA5_d8yw$default, brush, 0.0f, null, null, 0, 60, null);
        }
        if (((Number) animatable.getValue()).floatValue() > 0.0f || z2) {
            Path pathM15038getCylinderBodyPathA5_d8yw$default2 = m15038getCylinderBodyPathA5_d8yw$default(fIntBitsToFloat, Math.max(fIntBitsToFloat, Math.max(((Number) animatable.getValue()).floatValue(), z2 ? snapshotFloatState2.getFloatValue() : 0.0f)), Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)), null, 0L, false, 56, null);
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, pathM15038getCylinderBodyPathA5_d8yw$default2, brush2, 0.0f, null, null, 0, 60, null);
            DrawScope.m6955drawPathLG529CI$default(Canvas, pathM15038getCylinderBodyPathA5_d8yw$default2, j, 0.0f, new Stroke(1.5f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        if (((Number) animatable.getValue()).floatValue() > 0.0f || z2) {
            DrawScope.m6952drawOvalAsUm42w$default(Canvas, new SolidColor(j2, null), 0L, Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L))) & 4294967295L)), 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        }
        if (z || ((Number) animatable.getValue()).floatValue() > 0.0f || z2) {
            DrawScope.m6953drawOvalnJ9OG0$default(Canvas, j, 0L, Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L))) & 4294967295L)), 0.0f, new Stroke(1.5f, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: fromHexDefaulted-mxwnekA, reason: not valid java name */
    private static final long m15036fromHexDefaultedmxwnekA(Color.Companion companion, String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Color2.Color(android.graphics.Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return j;
        }
    }

    /* renamed from: linearGradientFromServer-blSgnlo, reason: not valid java name */
    public static final Brush m15039linearGradientFromServerblSgnlo(Brush.Companion linearGradientFromServer, ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor, long j, long j2, long j3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(linearGradientFromServer, "$this$linearGradientFromServer");
        composer.startReplaceGroup(-223057229);
        long jM6553getZeroF1C5BW0 = (i2 & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : j2;
        long jM6535constructorimpl = (i2 & 8) != 0 ? Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L)) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-223057229, i, -1, "com.robinhood.android.gold.hub.linearGradientFromServer (GoldHubCylinderChartComposable.kt:296)");
        }
        if (apiGoldEarningsLinearGradientColor == null) {
            SolidColor solidColor = new SolidColor(j, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return solidColor;
        }
        List<ApiGoldEarningsColorStop> colorStops = apiGoldEarningsLinearGradientColor.getColorStops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops, 10));
        for (ApiGoldEarningsColorStop apiGoldEarningsColorStop : colorStops) {
            arrayList.add(Tuples4.m3642to(Float.valueOf(apiGoldEarningsColorStop.getStop()), Color.m6701boximpl(m15036fromHexDefaultedmxwnekA(Color.INSTANCE, apiGoldEarningsColorStop.getColor(), j))));
        }
        Tuples2[] tuples2Arr = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
        Brush brushM6679linearGradientmHitzGk$default = Brush.Companion.m6679linearGradientmHitzGk$default(linearGradientFromServer, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), jM6553getZeroF1C5BW0, jM6535constructorimpl, 0, 8, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return brushM6679linearGradientmHitzGk$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldHubCylinderCharts(boolean z, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1266972475);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1266972475, i3, -1, "com.robinhood.android.gold.hub.GoldHubCylinderCharts (GoldHubCylinderChartComposable.kt:325)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_cylinder_chart_height, composerStartRestartGroup, 0);
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i6 = (i3 << 9) & 7168;
            boolean z3 = z2;
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#FFCC69", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops$default(null, null, 3, null)), 0.5f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000"), new ApiGoldEarningsCylinderChartSegment("#7A4EF1", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#B8A4ED", "#7A4EF1")), 0.3f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000"), new ApiGoldEarningsCylinderChartSegment("#87B900", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#DCFE80", "#87B900")), 0.1f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000"), new ApiGoldEarningsCylinderChartSegment("#000000", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#000000", "#000000")), 0.1f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#FFFFFF")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#7A4EF1", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#B8A4ED", "#7A4EF1")), 1.0f, 0.5f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#FFCC69", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops$default(null, null, 3, null)), 1.0f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#000000", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#000000", "#000000")), 1.0f, 0.5f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#FFFFFF")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#000000", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#000000", "#000000")), 1.0f, 1.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#FFFFFF")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.persistentListOf(new ApiGoldEarningsCylinderChartSegment("#21CE99", new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#21CE99", "#21CE99")), 1.0f, 0.0f, new ApiGoldEarningsLinearGradientColor(0.0f, GoldHubCylinderCharts$colorStops("#545D61", "#545D61")), "#000000")), fDimensionResource, null, z3, composerStartRestartGroup, i6, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubCylinderChartComposableKt.GoldHubCylinderCharts$lambda$19(z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static /* synthetic */ List GoldHubCylinderCharts$colorStops$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "#FDE5B6";
        }
        if ((i & 2) != 0) {
            str2 = "#FFCC69";
        }
        return GoldHubCylinderCharts$colorStops(str, str2);
    }

    private static final List<ApiGoldEarningsColorStop> GoldHubCylinderCharts$colorStops(String str, String str2) {
        return CollectionsKt.listOf((Object[]) new ApiGoldEarningsColorStop[]{new ApiGoldEarningsColorStop(str, 0.0f), new ApiGoldEarningsColorStop(str2, 1.0f)});
    }

    public static final void GoldHubCylinderChartsStaticDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-334373589);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334373589, i, -1, "com.robinhood.android.gold.hub.GoldHubCylinderChartsStaticDay (GoldHubCylinderChartComposable.kt:531)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableSingletons$GoldHubCylinderChartComposableKt.INSTANCE.m15020getLambda$1470803853$feature_gold_hub_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubCylinderChartComposableKt.GoldHubCylinderChartsStaticDay$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldHubCylinderChartsStaticNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-288055897);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288055897, i, -1, "com.robinhood.android.gold.hub.GoldHubCylinderChartsStaticNight (GoldHubCylinderChartComposable.kt:540)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$GoldHubCylinderChartComposableKt.INSTANCE.m15021getLambda$1475846417$feature_gold_hub_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubCylinderChartComposableKt.GoldHubCylinderChartsStaticNight$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldHubCylinderChartsAnimatedDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-951695274);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-951695274, i, -1, "com.robinhood.android.gold.hub.GoldHubCylinderChartsAnimatedDay (GoldHubCylinderChartComposable.kt:549)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableSingletons$GoldHubCylinderChartComposableKt.INSTANCE.m15022getLambda$2139485794$feature_gold_hub_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubCylinderChartComposableKt.GoldHubCylinderChartsAnimatedDay$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldHubCylinderChartsAnimatedNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-828708334);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-828708334, i, -1, "com.robinhood.android.gold.hub.GoldHubCylinderChartsAnimatedNight (GoldHubCylinderChartComposable.kt:558)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$GoldHubCylinderChartComposableKt.INSTANCE.getLambda$165902682$feature_gold_hub_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubCylinderChartComposableKt.GoldHubCylinderChartsAnimatedNight$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
