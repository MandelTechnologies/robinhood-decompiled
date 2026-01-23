package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerOptionPositionRow3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> $innerViewState$delegate;
    final /* synthetic */ boolean $isAggregate;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function3<UUID, List<UUID>, Boolean, Unit> $onAggregateOptionRowCheckedChanged;
    final /* synthetic */ Function2<String, Boolean, Unit> $onExpandOrCollapse;
    final /* synthetic */ Function4<UUID, UUID, List<UUID>, Boolean, Unit> $onLegOptionRowCheckedChanged;
    final /* synthetic */ Function1<UUID, Unit> $onOpenAggregateOptionsDetailPage;
    final /* synthetic */ Function2<String, Boolean, Unit> $onPlusOrMinusClicked;
    final /* synthetic */ OptionsPortfolioRiskAnalyzerOptionPositionRowViewState $state;
    final /* synthetic */ SnapshotState4<TradeActionUiState> $tradeActionViewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    OptionsPortfolioRiskAnalyzerOptionPositionRow3(boolean z, OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState, Function1<? super UUID, Unit> function1, SnapshotState4<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> snapshotState4, Function2<? super String, ? super Boolean, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22, Function3<? super UUID, ? super List<UUID>, ? super Boolean, Unit> function3, Function4<? super UUID, ? super UUID, ? super List<UUID>, ? super Boolean, Unit> function4, SnapshotState4<TradeActionUiState> snapshotState42, Navigator navigator, Context context) {
        this.$isAggregate = z;
        this.$state = optionsPortfolioRiskAnalyzerOptionPositionRowViewState;
        this.$onOpenAggregateOptionsDetailPage = function1;
        this.$innerViewState$delegate = snapshotState4;
        this.$onExpandOrCollapse = function2;
        this.$onPlusOrMinusClicked = function22;
        this.$onAggregateOptionRowCheckedChanged = function3;
        this.$onLegOptionRowCheckedChanged = function4;
        this.$tradeActionViewState$delegate = snapshotState42;
        this.$navigator = navigator;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState emptyOptionPositionDataGridViewState;
        float fM21590getDefaultD9Ej5fM;
        Function2<String, Boolean, Unit> function2;
        SnapshotState4<TradeActionUiState> snapshotState4;
        final Function1<UUID, Unit> function1;
        OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState;
        Navigator navigator;
        Context context;
        int i2;
        float f;
        Object obj;
        long jM21425getFg0d7_KjU;
        TradeButtonUiState closeActionButtonUiState;
        TradeButtonUiState openActionButtonUiState;
        TradeButtonUiState rollActionButtonUiState;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(549186570, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:277)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        boolean z = this.$isAggregate;
        OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState2 = this.$state;
        Function1<UUID, Unit> function12 = this.$onOpenAggregateOptionsDetailPage;
        SnapshotState4<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> snapshotState42 = this.$innerViewState$delegate;
        Function2<String, Boolean, Unit> function22 = this.$onExpandOrCollapse;
        Function2<String, Boolean, Unit> function23 = this.$onPlusOrMinusClicked;
        Function3<UUID, List<UUID>, Boolean, Unit> function3 = this.$onAggregateOptionRowCheckedChanged;
        Function4<UUID, UUID, List<UUID>, Boolean, Unit> function4 = this.$onLegOptionRowCheckedChanged;
        SnapshotState4<TradeActionUiState> snapshotState43 = this.$tradeActionViewState$delegate;
        Navigator navigator2 = this.$navigator;
        Context context2 = this.$context;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState42);
        if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 == null || (emptyOptionPositionDataGridViewState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7.getDataGridState()) == null) {
            emptyOptionPositionDataGridViewState = OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState2.getEmptyOptionPositionDataGridViewState();
        }
        if (z) {
            composer2.startReplaceGroup(1067567846);
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM();
        } else {
            composer2.startReplaceGroup(1067568839);
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
        }
        composer2.endReplaceGroup();
        OptionsPortfolioRiskAnalyzerOptionPositionDataGrid.OptionsPortfolioRiskAnalyzerOptionPositionDataGrid(emptyOptionPositionDataGridViewState, PaddingKt.m5144paddingVpY3zN4$default(companion, fM21590getDefaultD9Ej5fM, 0.0f, 2, null), composer2, 0, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), composer2, 0);
        composer2.startReplaceGroup(1067581777);
        if (z) {
            composer2.startReplaceGroup(1067576496);
            OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate = (OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) optionsPortfolioRiskAnalyzerOptionPositionRowViewState2;
            if (aggregate.getShowLegs()) {
                function2 = function23;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(21), 0.0f, 0.0f, 0.0f, 14, null);
                String strStringResource = StringResources_androidKt.stringResource(C23462R.string.options_pra_aggregate_position_leg_section_title, composer2, 0);
                TextStyle textM = bentoTheme.getTypography(composer2, i3).getTextM();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                snapshotState4 = snapshotState43;
                navigator = navigator2;
                context = context2;
                optionsPortfolioRiskAnalyzerOptionPositionRowViewState = optionsPortfolioRiskAnalyzerOptionPositionRowViewState2;
                i2 = 1;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textM, composer, 24624, 0, 8104);
                composer2 = composer;
                Iterator<T> it = aggregate.getLegs().iterator();
                while (it.hasNext()) {
                    Composer composer3 = composer2;
                    OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) it.next(), function22, function2, function3, function4, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, function12, composer3, 0, 64);
                    composer2 = composer3;
                }
                function1 = function12;
            } else {
                function2 = function23;
                snapshotState4 = snapshotState43;
                function1 = function12;
                optionsPortfolioRiskAnalyzerOptionPositionRowViewState = optionsPortfolioRiskAnalyzerOptionPositionRowViewState2;
                navigator = navigator2;
                context = context2;
                i2 = 1;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1067631598);
            if (aggregate.getShowLegs()) {
                f = 0.0f;
                obj = null;
            } else {
                f = 0.0f;
                obj = null;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i2, null), 0.0f, composer2, 6, i2), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, f, i2, obj);
            composer2.startReplaceGroup(-1633490746);
            final OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState3 = optionsPortfolioRiskAnalyzerOptionPositionRowViewState;
            boolean zChanged = composer2.changed(function1) | composer2.changedInstance(optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$2$lambda$1(function1, optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (Function0) objRememberedValue, 7, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), composer2, 0, 0);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            final Function2<String, Boolean, Unit> function24 = function2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_cta_view_details, composer2, 0), Row5.weight$default(row6, companion3, 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer, 0, 0, 8184);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme2.getColors(composer, i4).m21427getFg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            composer.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), composer, 6, 1), bentoTheme2.getColors(composer, i4).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion4.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_simulated_quantity_label, composer, 0), null, null, null, null, null, null, 0, false, 1, 0, null, 0, null, composer, 805306368, 0, 15870);
            boolean z2 = aggregate.getSimulatedQuantityDelta().compareTo(BigDecimal.ZERO) != 0;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), bentoTheme2.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), aggregate.getSimulatedQuantityDelta(), null, 2, null);
            if (z2) {
                composer.startReplaceGroup(-1186435138);
                jM21425getFg0d7_KjU = bentoTheme2.getColors(composer, i4).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1186433000);
                jM21425getFg0d7_KjU = bentoTheme2.getColors(composer, i4).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            BentoText2.m20747BentoText38GnDrw(nullable$default, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, z2 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 1, 0, null, 0, null, composer, 805306368, 0, 15848);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(function24) | composer.changedInstance(optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$8$lambda$5$lambda$4(function24, optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer.changed(function24) | composer.changedInstance(optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$8$lambda$7$lambda$6(function24, optionsPortfolioRiskAnalyzerOptionPositionRowViewState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerOptionPositionRow.PlusMinusPill(function0, (Function0) objRememberedValue3, null, composer, 0, 4);
            composer.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), composer, 0);
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), composer, 6, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), companion4.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
            Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C23386R.string.option_trade_action_generic_roll_position, composer, 0);
            TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState4);
            BentoButtonState bentoButtonState = new BentoButtonState(strStringResource2, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 == null || (rollActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6.getRollActionButtonUiState()) == null) ? false : rollActionButtonUiState.getEnabled(), false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2038, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(-1746271574);
            final SnapshotState4<TradeActionUiState> snapshotState44 = snapshotState4;
            final Navigator navigator3 = navigator;
            final Context context3 = context;
            boolean zChanged4 = composer.changed(snapshotState44) | composer.changedInstance(navigator3) | composer.changedInstance(context3);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$18$lambda$11$lambda$10(snapshotState44, navigator3, context3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            int i5 = BentoButtonState.$stable;
            BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue4, modifierWeight$default, (String) null, composer, i5, 8);
            Modifier modifierWeight$default2 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
            String strStringResource3 = StringResources_androidKt.stringResource(C23386R.string.option_trade_action_generic_open_position, composer, 0);
            TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$62 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState44);
            BentoButtonState bentoButtonState2 = new BentoButtonState(strStringResource3, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$62 == null || (openActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$62.getOpenActionButtonUiState()) == null) ? false : openActionButtonUiState.getEnabled(), false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2038, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged5 = composer.changed(snapshotState44) | composer.changedInstance(navigator3) | composer.changedInstance(context3);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$18$lambda$14$lambda$13(snapshotState44, navigator3, context3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState2, (Function0<Unit>) objRememberedValue5, modifierWeight$default2, (String) null, composer, i5, 8);
            Modifier modifierWeight$default3 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
            String strStringResource4 = StringResources_androidKt.stringResource(C23386R.string.option_trade_action_generic_close_position, composer, 0);
            TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$63 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState44);
            BentoButtonState bentoButtonState3 = new BentoButtonState(strStringResource4, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$63 == null || (closeActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$63.getCloseActionButtonUiState()) == null) ? false : closeActionButtonUiState.getEnabled(), false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2038, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged6 = composer.changed(snapshotState44) | composer.changedInstance(navigator3) | composer.changedInstance(context3);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$2$4$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow3.invoke$lambda$19$lambda$18$lambda$17$lambda$16(snapshotState44, navigator3, context3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState3, (Function0<Unit>) objRememberedValue6, modifierWeight$default3, (String) null, composer, i5, 8);
            composer.endNode();
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$2$lambda$1(Function1 function1, OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState) {
        function1.invoke(((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) optionsPortfolioRiskAnalyzerOptionPositionRowViewState).getAggregatePositionId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$8$lambda$5$lambda$4(Function2 function2, OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState) {
        function2.invoke(optionsPortfolioRiskAnalyzerOptionPositionRowViewState.getRowId(), Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$8$lambda$7$lambda$6(Function2 function2, OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState) {
        function2.invoke(optionsPortfolioRiskAnalyzerOptionPositionRowViewState.getRowId(), Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$11$lambda$10(SnapshotState4 snapshotState4, Navigator navigator, Context context) {
        TradeButtonUiState rollActionButtonUiState;
        IntentKey optionOrderIntentKey;
        TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState4);
        if (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 != null && (rollActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6.getRollActionButtonUiState()) != null && (optionOrderIntentKey = rollActionButtonUiState.getOptionOrderIntentKey()) != null) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, optionOrderIntentKey, null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$14$lambda$13(SnapshotState4 snapshotState4, Navigator navigator, Context context) {
        TradeButtonUiState openActionButtonUiState;
        IntentKey optionOrderIntentKey;
        TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState4);
        if (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 != null && (openActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6.getOpenActionButtonUiState()) != null && (optionOrderIntentKey = openActionButtonUiState.getOptionOrderIntentKey()) != null) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, optionOrderIntentKey, null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16(SnapshotState4 snapshotState4, Navigator navigator, Context context) {
        TradeButtonUiState closeActionButtonUiState;
        IntentKey optionOrderIntentKey;
        TradeActionUiState tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 = OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(snapshotState4);
        if (tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6 != null && (closeActionButtonUiState = tradeActionUiStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6.getCloseActionButtonUiState()) != null && (optionOrderIntentKey = closeActionButtonUiState.getOptionOrderIntentKey()) != null) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, optionOrderIntentKey, null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }
}
