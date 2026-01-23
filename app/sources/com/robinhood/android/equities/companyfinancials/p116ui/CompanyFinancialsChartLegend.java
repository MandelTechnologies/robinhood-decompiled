package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ChartLegendItemDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: CompanyFinancialsChartLegend.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"CompanyFinancialsChartLegend", "", "legendData", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompanyFinancialsChartLegendItem", "chartLegendItem", "Lrh_server_driven_ui/v1/ChartLegendItemDto;", "(Lrh_server_driven_ui/v1/ChartLegendItemDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-company-financials_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegendKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsChartLegend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsChartLegend$lambda$2(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsChartLegend(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsChartLegendItem$lambda$5(ChartLegendItemDto chartLegendItemDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsChartLegendItem(chartLegendItemDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CompanyFinancialsChartLegend(final ImmutableList<ChartLegendItemListDto> legendData, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(legendData, "legendData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1572150907);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(legendData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1572150907, i3, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegend (CompanyFinancialsChartLegend.kt:25)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
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
            composerStartRestartGroup.startReplaceGroup(-218250150);
            for (final ChartLegendItemListDto chartLegendItemListDto : legendData) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                FlowLayoutKt.FlowRow(modifierFillMaxWidth$default, arrangement.m5090spacedByD5KLDUw(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getStart()), arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), null, 0, 0, ComposableLambda3.rememberComposableLambda(419546606, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegendKt$CompanyFinancialsChartLegend$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                        invoke(flowRowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FlowRowScope FlowRow, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(419546606, i6, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegend.<anonymous>.<anonymous>.<anonymous> (CompanyFinancialsChartLegend.kt:36)");
                        }
                        Iterator<T> it = chartLegendItemListDto.getItems().iterator();
                        while (it.hasNext()) {
                            CompanyFinancialsChartLegend.CompanyFinancialsChartLegendItem((ChartLegendItemDto) it.next(), null, composer2, 0, 2);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegendKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyFinancialsChartLegend.CompanyFinancialsChartLegend$lambda$2(legendData, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompanyFinancialsChartLegendItem(final ChartLegendItemDto chartLegendItemDto, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Color composeColor;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(966140321);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartLegendItemDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(966140321, i3, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegendItem (CompanyFinancialsChartLegend.kt:46)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                ThemedColorDto color = chartLegendItemDto.getColor();
                composerStartRestartGroup.startReplaceGroup(-881659219);
                composeColor = color != null ? SduiColors2.toComposeColor(color, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-881658477);
                if (composeColor != null) {
                    CompanyFinancialsUtils.m13534LegendColorIndicatorKTwxG1Y(composeColor.getValue(), Intrinsics.areEqual(chartLegendItemDto.getId(), "net_margin"), null, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                String title = chartLegendItemDto.getTitle();
                long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composerStartRestartGroup, 0, 1);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8184);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartLegendKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CompanyFinancialsChartLegend.CompanyFinancialsChartLegendItem$lambda$5(chartLegendItemDto, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
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
                ThemedColorDto color2 = chartLegendItemDto.getColor();
                composerStartRestartGroup.startReplaceGroup(-881659219);
                if (color2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-881658477);
                if (composeColor != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                String title2 = chartLegendItemDto.getTitle();
                long jM18897toComposeColorDefaultediJQMabo2 = SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composerStartRestartGroup, 0, 1);
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title2, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer2, 0, 0, 8184);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
