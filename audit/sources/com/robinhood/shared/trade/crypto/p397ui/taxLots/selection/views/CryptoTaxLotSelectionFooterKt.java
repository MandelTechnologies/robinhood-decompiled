package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionFooter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a9\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\"\u0016\u0010\u0013\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0015¨\u0006!"}, m3636d2 = {"CryptoTaxLotSelectionFooter", "", "state", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "onContinueClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Cell", "labelText", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textContent", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "valueTestTag", "Cell-eVdfmfU", "(Ljava/lang/String;ILcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_TAX_LOT_FOOTER_TOTAL_CREDIT_VALUE_TEST_TAG", "getCRYPTO_TAX_LOT_FOOTER_TOTAL_CREDIT_VALUE_TEST_TAG$annotations", "()V", "CRYPTO_TAX_LOT_FOOTER_EST_GAIN_LOSS_VALUE_TEST_TAG", "getCRYPTO_TAX_LOT_FOOTER_EST_GAIN_LOSS_VALUE_TEST_TAG$annotations", "CRYPTO_TAX_LOT_FOOTER_QUANTITY_VALUE_TEST_TAG", "getCRYPTO_TAX_LOT_FOOTER_QUANTITY_VALUE_TEST_TAG$annotations", "CryptoTaxLotSelectionFooterPreviewWithNoneTextContent", "(Landroidx/compose/runtime/Composer;I)V", "CryptoTaxLotSelectionFooterPreviewWithLoadingTextContent", "CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndPositiveGainLoss", "CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndNegativeGainLoss", "CryptoTaxLotSelectionFooterPreviewWithLoadingCta", "CryptoTaxLotSelectionFooterPreviewWithError", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionFooterKt {
    public static final String CRYPTO_TAX_LOT_FOOTER_EST_GAIN_LOSS_VALUE_TEST_TAG = "crypto_tax_lot_footer_est_gain_loss_value_test_tag";
    public static final String CRYPTO_TAX_LOT_FOOTER_QUANTITY_VALUE_TEST_TAG = "crypto_tax_lot_footer_quantity_value_test_tag";
    public static final String CRYPTO_TAX_LOT_FOOTER_TOTAL_CREDIT_VALUE_TEST_TAG = "crypto_tax_lot_footer_total_credit_value_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Cell_eVdfmfU$lambda$6(String str, int i, CryptoTaxLotSelectionFooterState.TextContent textContent, String str2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m26044CelleVdfmfU(str, i, textContent, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionFooter$lambda$4(CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotSelectionFooter(cryptoTaxLotSelectionFooterState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionFooterPreviewWithError$lambda$12(int i, Composer composer, int i2) {
        CryptoTaxLotSelectionFooterPreviewWithError(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndNegativeGainLoss$lambda$10 */
    public static final Unit m2927x75f8ce4d(int i, Composer composer, int i2) {
        m2926x9b586c15(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndPositiveGainLoss$lambda$9 */
    public static final Unit m2929xb3c7ad07(int i, Composer composer, int i2) {
        m2928xeb8bf5d9(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionFooterPreviewWithLoadingCta$lambda$11(int i, Composer composer, int i2) {
        CryptoTaxLotSelectionFooterPreviewWithLoadingCta(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionFooterPreviewWithLoadingTextContent$lambda$8 */
    public static final Unit m2930xc29d9f01(int i, Composer composer, int i2) {
        CryptoTaxLotSelectionFooterPreviewWithLoadingTextContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionFooterPreviewWithNoneTextContent$lambda$7(int i, Composer composer, int i2) {
        CryptoTaxLotSelectionFooterPreviewWithNoneTextContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: getCRYPTO_TAX_LOT_FOOTER_EST_GAIN_LOSS_VALUE_TEST_TAG$annotations */
    public static /* synthetic */ void m2931x21fe244a() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_FOOTER_QUANTITY_VALUE_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_FOOTER_TOTAL_CREDIT_VALUE_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotSelectionFooter(final CryptoTaxLotSelectionFooterState state, final Function0<Unit> onContinueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier3;
        int i5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1945402060);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1945402060, i4, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooter (CryptoTaxLotSelectionFooter.kt:40)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier.Companion companion4 = companion3;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierFillMaxWidth$default2, bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(2), composerStartRestartGroup, 390, 0);
                composer2 = composerStartRestartGroup;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), companion.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                if (state.getErrorMessage() != null) {
                    composer2.startReplaceGroup(1683691999);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_footer_total_credit_label, composer2, 0);
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    m26044CelleVdfmfU(strStringResource, companion5.m7924getStarte0LSkKk(), state.getTotalCreditTextContent(), CRYPTO_TAX_LOT_FOOTER_TOTAL_CREDIT_VALUE_TEST_TAG, Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer2, 3072, 0);
                    m26044CelleVdfmfU(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_footer_est_gain_loss_label, composer2, 0), companion5.m7919getCentere0LSkKk(), state.getEstimatedGainLossTextContent(), CRYPTO_TAX_LOT_FOOTER_EST_GAIN_LOSS_VALUE_TEST_TAG, Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer2, 3072, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_footer_quantity_label, composer2, 0);
                    int iM7920getEnde0LSkKk = companion5.m7920getEnde0LSkKk();
                    CryptoTaxLotSelectionFooterState.TextContent quantityTextContent = state.getQuantityTextContent();
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                    companion4 = companion4;
                    m26044CelleVdfmfU(strStringResource2, iM7920getEnde0LSkKk, quantityTextContent, CRYPTO_TAX_LOT_FOOTER_QUANTITY_VALUE_TEST_TAG, modifierWeight$default, composer2, 3072, 0);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    i5 = 0;
                    modifier3 = modifier5;
                } else {
                    composer2.startReplaceGroup(1685213913);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), companion.getCenterHorizontally()), companion.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default4);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16), null, bentoTheme.getColors(composer2, i7).m21452getNegative0d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                    modifier3 = modifier5;
                    i5 = 0;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(state.getErrorMessage(), composer2, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21452getNegative0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8170);
                    composer2 = composer2;
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                Composer composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_footer_cta, composer2, i5), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, null, state.isCtaEnabled(), state.isCtaLoading(), null, null, null, null, false, null, composer3, (i4 >> 3) & 14, 0, 8088);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooter$lambda$4(state, onContinueClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Modifier.Companion companion42 = companion32;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierFillMaxWidth$default22, bentoTheme2.getColors(composerStartRestartGroup, i72).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(2), composerStartRestartGroup, 390, 0);
                composer2 = composerStartRestartGroup;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, bentoTheme2.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM()), companion6.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    if (state.getErrorMessage() != null) {
                    }
                    Composer composer32 = composer2;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_footer_cta, composer2, i5), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, null, state.isCtaEnabled(), state.isCtaLoading(), null, null, null, null, false, null, composer32, (i4 >> 3) & 14, 0, 8088);
                    composerStartRestartGroup = composer32;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: Cell-eVdfmfU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m26044CelleVdfmfU(final String str, final int i, final CryptoTaxLotSelectionFooterState.TextContent textContent, final String str2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        TextAlign.Companion companion;
        Alignment.Horizontal end;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(944452727);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(textContent) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(944452727, i4, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.Cell (CryptoTaxLotSelectionFooter.kt:132)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM());
                companion = TextAlign.INSTANCE;
                if (TextAlign.m7915equalsimpl0(i, companion.m7924getStarte0LSkKk())) {
                    end = TextAlign.m7915equalsimpl0(i, companion.m7920getEnde0LSkKk()) ? Alignment.INSTANCE.getEnd() : Alignment.INSTANCE.getCenterHorizontally();
                } else {
                    end = Alignment.INSTANCE.getStart();
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, end, composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(i), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, (i4 & 14) | ((i4 << 15) & 3670016), 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
                LocalShowPlaceholder.Loadable(textContent instanceof CryptoTaxLotSelectionFooterState.TextContent.Loading, null, null, ComposableLambda3.rememberComposableLambda(-1552914691, true, new CryptoTaxLotSelectionFooterKt$Cell$1$1(str2, textContent, i), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotSelectionFooterKt.Cell_eVdfmfU$lambda$6(str, i, textContent, str2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        modifier2 = modifier;
        if ((i4 & 9363) != 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM());
            companion = TextAlign.INSTANCE;
            if (TextAlign.m7915equalsimpl0(i, companion.m7924getStarte0LSkKk())) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, end, composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(i), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, (i4 & 14) | ((i4 << 15) & 3670016), 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
                LocalShowPlaceholder.Loadable(textContent instanceof CryptoTaxLotSelectionFooterState.TextContent.Loading, null, null, ComposableLambda3.rememberComposableLambda(-1552914691, true, new CryptoTaxLotSelectionFooterKt$Cell$1$1(str2, textContent, i), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CryptoTaxLotSelectionFooterPreviewWithNoneTextContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-650809012);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650809012, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithNoneTextContent (CryptoTaxLotSelectionFooter.kt:209)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.m26038getLambda$600407404$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooterPreviewWithNoneTextContent$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoTaxLotSelectionFooterPreviewWithLoadingTextContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-595341800);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595341800, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithLoadingTextContent (CryptoTaxLotSelectionFooter.kt:225)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.getLambda$1975375824$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.m2930xc29d9f01(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndPositiveGainLoss */
    private static final void m2928xeb8bf5d9(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1516825181);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1516825181, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndPositiveGainLoss (CryptoTaxLotSelectionFooter.kt:241)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.m26036getLambda$1459030507$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.m2929xb3c7ad07(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndNegativeGainLoss */
    private static final void m2926x9b586c15(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-535607647);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535607647, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithLoadedTextContentAndNegativeGainLoss (CryptoTaxLotSelectionFooter.kt:264)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.getLambda$783503961$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.m2927x75f8ce4d(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoTaxLotSelectionFooterPreviewWithLoadingCta(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1911139348);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1911139348, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithLoadingCta (CryptoTaxLotSelectionFooter.kt:287)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.getLambda$616885708$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooterPreviewWithLoadingCta$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoTaxLotSelectionFooterPreviewWithError(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1778152952);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1778152952, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterPreviewWithError (CryptoTaxLotSelectionFooter.kt:311)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoTaxLotSelectionFooterKt.INSTANCE.m26037getLambda$409140928$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooterPreviewWithError$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
