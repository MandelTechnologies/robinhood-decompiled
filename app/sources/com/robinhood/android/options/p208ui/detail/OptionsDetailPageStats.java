package com.robinhood.android.options.p208ui.detail;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.compose.bidask.BidAskDetails2;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageStats.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"OptionsDetailPageStats", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;Landroidx/compose/runtime/Composer;I)V", "COLUMN_SPACING", "Landroidx/compose/ui/unit/Dp;", "F", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageStatsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageStats {
    private static final float COLUMN_SPACING = C2002Dp.m7995constructorimpl(22);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageStats$lambda$1(OptionsDetailPageBodyState2.Stats stats, int i, Composer composer, int i2) {
        OptionsDetailPageStats(stats, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsDetailPageStats(final OptionsDetailPageBodyState2.Stats state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1398939638);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398939638, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageStats (OptionsDetailPageStats.kt:19)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            OptionsDetailPageSectionTitle.OptionsDetailPageSectionTitle(null, StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_section_title, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 0, 13);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            String bidPrice = state.getBidPrice();
            String askPrice = state.getAskPrice();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(state.getBidSize());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(state.getAskSize());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BidAskDetails2.m12533BidAskDetailsIColEu4(new BidAsk(bidPrice, askPrice, bigDecimalValueOf, bigDecimalValueOf2), null, state.getInBidAskSdpStatsExperiment(), state.getInBidAskSdpStatsExperiment() ? C2002Dp.m7993boximpl(COLUMN_SPACING) : null, composerStartRestartGroup, BidAsk.$stable, 2);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl((float) 0.5d), composerStartRestartGroup, 384, 1);
            composerStartRestartGroup.startReplaceGroup(-1732949188);
            if (state.getInBidAskSdpStatsExperiment()) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionsDetailPageDataGrid.m17035OptionsDetailPageDataGridrg9RtIk(null, 3, CollectionsKt.listOf((Object[]) new CellState[]{new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_mark, composerStartRestartGroup, 0), state.getMark(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_last_trade, composerStartRestartGroup, 0), state.getLastTrade(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_iv, composerStartRestartGroup, 0), state.getImpliedVolatility(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_previous_close, composerStartRestartGroup, 0), state.getPreviousClose(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_high, composerStartRestartGroup, 0), state.getHigh(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_low, composerStartRestartGroup, 0), state.getLow(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_volume, composerStartRestartGroup, 0), state.getVolume(), null, 4, null), new CellState(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_stats_open_interest, composerStartRestartGroup, 0), state.getOpenInterest(), null, 4, null)}), false, null, state.getInBidAskSdpStatsExperiment() ? C2002Dp.m7993boximpl(COLUMN_SPACING) : null, composerStartRestartGroup, 48, 25);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageStatsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageStats.OptionsDetailPageStats$lambda$1(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
