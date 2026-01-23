package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionHeader.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\"\u001c\u0010\t\u001a\u00020\n8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"CryptoTaxLotSelectionHeader", "", "state", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "onPriceInfoClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG", "", "getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG$annotations", "()V", "getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG", "()Ljava/lang/String;", "CryptoTaxLotSelectionHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionHeader3 {
    private static final String CRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG = "crypto_tax_lot_selection_header_price_info_icon_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionHeader$lambda$1(CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotSelectionHeader(cryptoTaxLotSelectionHeaderState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionHeaderPreview$lambda$2(int i, Composer composer, int i2) {
        CryptoTaxLotSelectionHeaderPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG$annotations */
    public static /* synthetic */ void m2932xb7c3440d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotSelectionHeader(final CryptoTaxLotSelectionHeaderState state, final Function0<Unit> onPriceInfoClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPriceInfoClicked, "onPriceInfoClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1956102782);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPriceInfoClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1956102782, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeader (CryptoTaxLotSelectionHeader.kt:26)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_header_title, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8186);
                LocalShowPlaceholder.Loadable(state.getPriceInfo() != null || state.getAssetCurrencyCode() == null, null, null, ComposableLambda3.rememberComposableLambda(-101562748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderKt$CryptoTaxLotSelectionHeader$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                        String strStringResource;
                        int i7;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-101562748, i6, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeader.<anonymous>.<anonymous> (CryptoTaxLotSelectionHeader.kt:37)");
                        }
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState = state;
                        Function0<Unit> function0 = onPriceInfoClicked;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer3, i8).m21426getFg20d7_KjU();
                        TextStyle textM = bentoTheme2.getTypography(composer3, i8).getTextM();
                        composer3.startReplaceGroup(-933059620);
                        if (cryptoTaxLotSelectionHeaderState.getPriceInfo() == null || cryptoTaxLotSelectionHeaderState.getAssetCurrencyCode() == null) {
                            strStringResource = "--------------------";
                        } else {
                            CryptoTaxLotSelectionHeaderState.PriceInfo priceInfo = cryptoTaxLotSelectionHeaderState.getPriceInfo();
                            if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.Limit) {
                                i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_limit;
                            } else if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.Market) {
                                i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_market;
                            } else if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.StopLimit) {
                                i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_stop_limit;
                            } else {
                                if (!(priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.StopLoss)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_stop_loss;
                            }
                            strStringResource = StringResources_androidKt.stringResource(i7, new Object[]{cryptoTaxLotSelectionHeaderState.getAssetCurrencyCode(), cryptoTaxLotSelectionHeaderState.getPriceInfo().getFormattedPrice()}, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme2.getColors(composer3, i8).m21426getFg20d7_KjU(), TestTag3.testTag(companion2, CryptoTaxLotSelectionHeader3.getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG()), function0, false, composer3, BentoIcon4.Size16.$stable | 3120, 32);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotSelectionHeader3.CryptoTaxLotSelectionHeader$lambda$1(state, onPriceInfoClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_header_title, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8186);
                if (state.getPriceInfo() != null) {
                    LocalShowPlaceholder.Loadable(state.getPriceInfo() != null || state.getAssetCurrencyCode() == null, null, null, ComposableLambda3.rememberComposableLambda(-101562748, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderKt$CryptoTaxLotSelectionHeader$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                            String strStringResource;
                            int i7;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-101562748, i6, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeader.<anonymous>.<anonymous> (CryptoTaxLotSelectionHeader.kt:37)");
                            }
                            Arrangement arrangement22 = Arrangement.INSTANCE;
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement22.m5089spacedBy0680j_4(bentoTheme22.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM());
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState = state;
                            Function0<Unit> function0 = onPriceInfoClicked;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, companion22);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor22);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            long jM21426getFg20d7_KjU = bentoTheme22.getColors(composer3, i8).m21426getFg20d7_KjU();
                            TextStyle textM = bentoTheme22.getTypography(composer3, i8).getTextM();
                            composer3.startReplaceGroup(-933059620);
                            if (cryptoTaxLotSelectionHeaderState.getPriceInfo() == null || cryptoTaxLotSelectionHeaderState.getAssetCurrencyCode() == null) {
                                strStringResource = "--------------------";
                            } else {
                                CryptoTaxLotSelectionHeaderState.PriceInfo priceInfo = cryptoTaxLotSelectionHeaderState.getPriceInfo();
                                if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.Limit) {
                                    i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_limit;
                                } else if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.Market) {
                                    i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_market;
                                } else if (priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.StopLimit) {
                                    i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_stop_limit;
                                } else {
                                    if (!(priceInfo instanceof CryptoTaxLotSelectionHeaderState.PriceInfo.StopLoss)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i7 = C40095R.string.crypto_tax_lot_selection_header_subtitle_stop_loss;
                                }
                                strStringResource = StringResources_androidKt.stringResource(i7, new Object[]{cryptoTaxLotSelectionHeaderState.getAssetCurrencyCode(), cryptoTaxLotSelectionHeaderState.getPriceInfo().getFormattedPrice()}, composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme22.getColors(composer3, i8).m21426getFg20d7_KjU(), TestTag3.testTag(companion22, CryptoTaxLotSelectionHeader3.getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG()), function0, false, composer3, BentoIcon4.Size16.$stable | 3120, 32);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_HEADER_PRICE_INFO_ICON_TEST_TAG;
    }

    public static final void CryptoTaxLotSelectionHeaderPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(482289870);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(482289870, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderPreview (CryptoTaxLotSelectionHeader.kt:89)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoTaxLotSelectionHeader.INSTANCE.m26040getLambda$1839248250$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionHeader3.CryptoTaxLotSelectionHeaderPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
