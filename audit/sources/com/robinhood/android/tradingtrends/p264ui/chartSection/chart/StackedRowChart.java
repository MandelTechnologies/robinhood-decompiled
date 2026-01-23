package com.robinhood.android.tradingtrends.p264ui.chartSection.chart;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: StackedRowChart.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"StackedRowChart", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "spacing", "roundedCornerSize", "StackedRowChart-mkeQTyY", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;FFFLandroidx/compose/runtime/Composer;II)V", "StackedRowChartPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.chart.StackedRowChartKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class StackedRowChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StackedRowChartPreview$lambda$6(int i, Composer composer, int i2) {
        StackedRowChartPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StackedRowChart_mkeQTyY$lambda$5(ImmutableList immutableList, Modifier modifier, float f, float f2, float f3, int i, int i2, Composer composer, int i3) {
        m19511StackedRowChartmkeQTyY(immutableList, modifier, f, f2, f3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7 A[LOOP:1: B:108:0x01d1->B:110:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff A[LOOP:2: B:85:0x00f9->B:87:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* renamed from: StackedRowChart-mkeQTyY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19511StackedRowChartmkeQTyY(final ImmutableList<Tuples2<Integer, Color>> items, Modifier modifier, float f, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float fM7995constructorimpl;
        int i5;
        float fM7995constructorimpl2;
        int i6;
        float fM7995constructorimpl3;
        Modifier modifier3;
        boolean z;
        Object objRememberedValue;
        Iterator<Tuples2<Integer, Color>> it;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator it2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1686502457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
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
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        fM7995constructorimpl2 = f2;
                        i3 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            fM7995constructorimpl3 = f3;
                            i3 |= composerStartRestartGroup.changed(fM7995constructorimpl3) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(4);
                            }
                            if (i5 != 0) {
                                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(4);
                            }
                            if (i6 != 0) {
                                fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(100);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1686502457, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.StackedRowChart (StackedRowChart.kt:33)");
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z = (i3 & 14) != 4;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                it = items.iterator();
                                int iIntValue = 0;
                                while (it.hasNext()) {
                                    iIntValue += it.next().getFirst().intValue();
                                }
                                objRememberedValue = Integer.valueOf(iIntValue);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            int iIntValue2 = ((Number) objRememberedValue).intValue();
                            composerStartRestartGroup.endReplaceGroup();
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM7995constructorimpl2);
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, fM7995constructorimpl);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
                            composerStartRestartGroup.startReplaceGroup(-1807905519);
                            ArrayList arrayList = new ArrayList();
                            for (Tuples2<Integer, Color> tuples2 : items) {
                                if (tuples2.getFirst().intValue() > 0) {
                                    arrayList.add(tuples2);
                                }
                            }
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                BoxKt.Box(Background3.m4871backgroundbw27NRU(Row5.weight$default(row6, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), RangesKt.coerceAtLeast(((Number) r4.component1()).intValue(), 1) / iIntValue2, false, 2, null), ((Color) ((Tuples2) it2.next()).component2()).getValue(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl3)), composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        final float f4 = fM7995constructorimpl;
                        final float f5 = fM7995constructorimpl2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final float f6 = fM7995constructorimpl3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.StackedRowChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return StackedRowChart.StackedRowChart_mkeQTyY$lambda$5(items, modifier4, f4, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    fM7995constructorimpl3 = f3;
                    if ((i3 & 9363) != 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 14) != 4) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            it = items.iterator();
                            int iIntValue3 = 0;
                            while (it.hasNext()) {
                            }
                            objRememberedValue = Integer.valueOf(iIntValue3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            int iIntValue22 = ((Number) objRememberedValue).intValue();
                            composerStartRestartGroup.endReplaceGroup();
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM7995constructorimpl2);
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier3, fM7995constructorimpl);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1807905519);
                                ArrayList arrayList2 = new ArrayList();
                                while (r4.hasNext()) {
                                }
                                it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                    final float f42 = fM7995constructorimpl;
                    final float f52 = fM7995constructorimpl2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fM7995constructorimpl2 = f2;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                fM7995constructorimpl3 = f3;
                if ((i3 & 9363) != 9362) {
                }
                final float f422 = fM7995constructorimpl;
                final float f522 = fM7995constructorimpl2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM7995constructorimpl = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            fM7995constructorimpl2 = f2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            fM7995constructorimpl3 = f3;
            if ((i3 & 9363) != 9362) {
            }
            final float f4222 = fM7995constructorimpl;
            final float f5222 = fM7995constructorimpl2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        fM7995constructorimpl2 = f2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        fM7995constructorimpl3 = f3;
        if ((i3 & 9363) != 9362) {
        }
        final float f42222 = fM7995constructorimpl;
        final float f52222 = fM7995constructorimpl2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void StackedRowChartPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(240473204);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240473204, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.StackedRowChartPreview (StackedRowChart.kt:54)");
            }
            Color.Companion companion = Color.INSTANCE;
            m19511StackedRowChartmkeQTyY(extensions2.persistentListOf(Tuples4.m3642to(1, Color.m6701boximpl(companion.m6724getRed0d7_KjU())), Tuples4.m3642to(2, Color.m6701boximpl(companion.m6721getGreen0d7_KjU())), Tuples4.m3642to(3, Color.m6701boximpl(companion.m6717getBlue0d7_KjU()))), null, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 6, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.StackedRowChartKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StackedRowChart.StackedRowChartPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
