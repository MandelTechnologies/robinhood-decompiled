package com.robinhood.android.tradingtrends.p264ui.chartSection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradingTrendsChartSectionPlaceholder.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"TradingTrendsChartSectionPlaceholder", "", "isDetailPage", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "placeholderSegmentedControlOptions", "Lkotlinx/collections/immutable/ImmutableList;", "", "extraChartPlaceholderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionPlaceholderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartSectionPlaceholder {
    private static final ImmutableList<String> placeholderSegmentedControlOptions = extensions2.persistentListOf("Robinhood", "Hedge Funds", "Insiders");
    private static final float extraChartPlaceholderHeight = C2002Dp.m7995constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartSectionPlaceholder$lambda$5(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartSectionPlaceholder(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9 A[LOOP:0: B:61:0x01c3->B:63:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsChartSectionPlaceholder(final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Iterator<String> it;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(945382221);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
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
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(945382221, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionPlaceholder (TradingTrendsChartSectionPlaceholder.kt:23)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw("Trading Trends", ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 6, 0, 8188);
                ImmutableList<String> immutableList = placeholderSegmentedControlOptions;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                it = immutableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Segment(null, it.next(), null, 5, null));
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionPlaceholderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TradingTrendsChartSectionPlaceholder.m2512xa77a2733(((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoSegmentedControl2.BentoSegmentedControl(arrayList, 0, function1, ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), false, composerStartRestartGroup, 432, 16);
                composerStartRestartGroup.endNode();
                BentoText2.m20747BentoText38GnDrw("Legend row placeholder", ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 1, null), true, null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16376);
                composerStartRestartGroup = composerStartRestartGroup;
                Placeholders2.ChartPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(!z ? EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE : EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + extraChartPlaceholderHeight)), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null), false, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionPlaceholderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsChartSectionPlaceholder.TradingTrendsChartSectionPlaceholder$lambda$5(z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw("Trading Trends", ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 6, 0, 8188);
                    ImmutableList<String> immutableList2 = placeholderSegmentedControlOptions;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
                    it = immutableList2.iterator();
                    while (it.hasNext()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    Function1 function12 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    BentoSegmentedControl2.BentoSegmentedControl(arrayList2, 0, function12, ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), false, composerStartRestartGroup, 432, 16);
                    composerStartRestartGroup.endNode();
                    BentoText2.m20747BentoText38GnDrw("Legend row placeholder", ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM(), 1, null), true, null, 2, null), Color.m6701boximpl(bentoTheme22.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16376);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Placeholders2.ChartPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(!z ? EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE : EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + extraChartPlaceholderHeight)), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 5, null), false, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TradingTrendsChartSectionPlaceholder$lambda$4$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2512xa77a2733(int i) {
        return Unit.INSTANCE;
    }
}
