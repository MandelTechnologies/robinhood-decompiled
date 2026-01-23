package com.robinhood.android.portfolio.pnlhub.p216ui.crypto;

import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState2;
import com.robinhood.android.portfolio.pnlhub.p216ui.C25819R;
import com.robinhood.android.portfolio.pnlhub.p216ui.PnlHubListComposable;
import com.robinhood.android.portfolio.pnlhub.p216ui.crypto.PnlHubListTradeItemCryptoRow;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: PnlHubListTradeItemCryptoRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"PnlHubListTradeItemCryptoRow", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "isGroupedTradeItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "onBottomSheetStateChange", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PnlHubListTradeItemCryptoRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubListTradeItemCryptoRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeItemCryptoRow$lambda$2(ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        PnlHubListTradeItemCryptoRow(profitAndLossTradeItem, z, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeItemCryptoRowPreview$lambda$5(int i, Composer composer, int i2) {
        PnlHubListTradeItemCryptoRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubListTradeItemCryptoRow(final ProfitAndLossTradeItem item, final boolean z, Modifier modifier, final Function1<? super PnlHubDataState2, Unit> onBottomSheetStateChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onBottomSheetStateChange, "onBottomSheetStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-278226019);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBottomSheetStateChange) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-278226019, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow (PnlHubListTradeItemCryptoRow.kt:36)");
                }
                ProfitAndLossOrderDetails orderDetails = item.getOrderDetails();
                final ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails = !(orderDetails instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) ? (ProfitAndLossOrderDetails.CryptoOrderDetails) orderDetails : null;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(item);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow$lambda$1$lambda$0(onBottomSheetStateChange, item);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(944937242, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        String strCapitalizeFirstLetter;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(944937242, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:43)");
                        }
                        if (z) {
                            strCapitalizeFirstLetter = PnlHubListComposable.capitalizeFirstLetter(item.getDisplayName());
                        } else {
                            strCapitalizeFirstLetter = item.getSymbol() + PlaceholderUtils.XXShortPlaceholderText + item.getDisplayName();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strCapitalizeFirstLetter, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1840008229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1840008229, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:54)");
                        }
                        ProfitAndLossTradeItem profitAndLossTradeItem = item;
                        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails2 = cryptoOrderDetails;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String str = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) profitAndLossTradeItem.getCloseTimestamp());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                        composer3.startReplaceGroup(-266496536);
                        if ((cryptoOrderDetails2 != null ? cryptoOrderDetails2.getTransferred() : null) != null && cryptoOrderDetails2.getAcquired() != null) {
                            BentoText2.m20747BentoText38GnDrw(" • ", null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 6, 0, 8186);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_crypto_excludes_transfers_text, composer3, 0);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 24576, 0, 8170);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1180035421, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        ProfitAndLossTradeItem profitAndLossTradeItem;
                        String str;
                        long jM21452getNegative0d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1180035421, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:76)");
                        }
                        Money realizedReturn = item.getRealizedReturn();
                        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails2 = cryptoOrderDetails;
                        if (((cryptoOrderDetails2 != null ? cryptoOrderDetails2.getTransferred() : null) == null || cryptoOrderDetails.getAcquired() != null) && realizedReturn != null) {
                            composer3.startReplaceGroup(128385754);
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            ProfitAndLossTradeItem profitAndLossTradeItem2 = item;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (realizedReturn.isZero()) {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Money.format$default(realizedReturn, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
                            } else {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Formats.getCurrencyDeltaFormat().format(realizedReturn.getDecimalValue());
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                            String str2 = profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0 ? Formats.getLeadingZeroesHundredthPercentFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage()) : Formats.getPercentDeltaWithHundredthDecimalFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage());
                            TextStyle textS = bentoTheme.getTypography(composer3, i6).getTextS();
                            if (profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0) {
                                composer3.startReplaceGroup(1386213567);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            } else if (profitAndLossTradeItem.getRealizedReturnPercentage().compareTo(BigDecimal.ZERO) > 0) {
                                composer3.startReplaceGroup(1386347673);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1386434969);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(128082946);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_crypto_return_unavailable_text, composer3, 0);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8186);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1600512, 0, 1958);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow$lambda$2(item, z, modifier3, onBottomSheetStateChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProfitAndLossOrderDetails orderDetails2 = item.getOrderDetails();
            if (!(orderDetails2 instanceof ProfitAndLossOrderDetails.CryptoOrderDetails)) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(item);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow$lambda$1$lambda$0(onBottomSheetStateChange, item);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(944937242, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        String strCapitalizeFirstLetter;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(944937242, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:43)");
                        }
                        if (z) {
                            strCapitalizeFirstLetter = PnlHubListComposable.capitalizeFirstLetter(item.getDisplayName());
                        } else {
                            strCapitalizeFirstLetter = item.getSymbol() + PlaceholderUtils.XXShortPlaceholderText + item.getDisplayName();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strCapitalizeFirstLetter, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1840008229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1840008229, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:54)");
                        }
                        ProfitAndLossTradeItem profitAndLossTradeItem = item;
                        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails2 = cryptoOrderDetails;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String str = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) profitAndLossTradeItem.getCloseTimestamp());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                        composer3.startReplaceGroup(-266496536);
                        if ((cryptoOrderDetails2 != null ? cryptoOrderDetails2.getTransferred() : null) != null && cryptoOrderDetails2.getAcquired() != null) {
                            BentoText2.m20747BentoText38GnDrw(" • ", null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 6, 0, 8186);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_crypto_excludes_transfers_text, composer3, 0);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 24576, 0, 8170);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1180035421, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt.PnlHubListTradeItemCryptoRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        ProfitAndLossTradeItem profitAndLossTradeItem;
                        String str;
                        long jM21452getNegative0d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1180035421, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRow.<anonymous> (PnlHubListTradeItemCryptoRow.kt:76)");
                        }
                        Money realizedReturn = item.getRealizedReturn();
                        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails2 = cryptoOrderDetails;
                        if (((cryptoOrderDetails2 != null ? cryptoOrderDetails2.getTransferred() : null) == null || cryptoOrderDetails.getAcquired() != null) && realizedReturn != null) {
                            composer3.startReplaceGroup(128385754);
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            ProfitAndLossTradeItem profitAndLossTradeItem2 = item;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (realizedReturn.isZero()) {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Money.format$default(realizedReturn, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
                            } else {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Formats.getCurrencyDeltaFormat().format(realizedReturn.getDecimalValue());
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                            String str2 = profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0 ? Formats.getLeadingZeroesHundredthPercentFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage()) : Formats.getPercentDeltaWithHundredthDecimalFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage());
                            TextStyle textS = bentoTheme.getTypography(composer3, i6).getTextS();
                            if (profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0) {
                                composer3.startReplaceGroup(1386213567);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            } else if (profitAndLossTradeItem.getRealizedReturnPercentage().compareTo(BigDecimal.ZERO) > 0) {
                                composer3.startReplaceGroup(1386347673);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1386434969);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(128082946);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_crypto_return_unavailable_text, composer3, 0);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8186);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1600512, 0, 1958);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeItemCryptoRow$lambda$1$lambda$0(Function1 function1, ProfitAndLossTradeItem profitAndLossTradeItem) {
        function1.invoke(new PnlHubDataState2.TradeDetail(profitAndLossTradeItem));
        return Unit.INSTANCE;
    }

    /* compiled from: PnlHubListTradeItemCryptoRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$PnlHubListTradeItemCryptoRowPreview$2 */
    static final class C258242 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<ProfitAndLossTradeItem> $items;

        C258242(List<ProfitAndLossTradeItem> list) {
            this.$items = list;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-909149536, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowPreview.<anonymous> (PnlHubListTradeItemCryptoRow.kt:223)");
            }
            List<ProfitAndLossTradeItem> list = this.$items;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(247857775);
            for (ProfitAndLossTradeItem profitAndLossTradeItem : list) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$PnlHubListTradeItemCryptoRowPreview$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PnlHubListTradeItemCryptoRow.C258242.invoke$lambda$3$lambda$2$lambda$1$lambda$0((PnlHubDataState2) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow(profitAndLossTradeItem, false, null, (Function1) objRememberedValue, composer, 3120, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(PnlHubDataState2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void PnlHubListTradeItemCryptoRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1170247912);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170247912, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowPreview (PnlHubListTradeItemCryptoRow.kt:121)");
            }
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRowPreview$lambda$4$lambda$3(((Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TemporalFormatter.Companion.init$default(companion, null, (Function1) objRememberedValue, 1, null);
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            AssetClass assetClass = AssetClass.CRYPTO;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(1735718400000L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Money money$default = Money3.toMoney$default(new BigDecimal("-10"), null, 1, null);
            BigDecimal bigDecimal = new BigDecimal("-0.0123");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            BigDecimal bigDecimal2 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default2 = Money3.toMoney$default(new BigDecimal("-60"), null, 1, null);
            Money money$default3 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default4 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default5 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            ProfitAndLossTradeItem profitAndLossTradeItem = new ProfitAndLossTradeItem(uuidRandomUUID, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli, "market buy", money$default, bigDecimal, instantOfEpochMilli2, bigDecimal2, money$default2, money$default3, money$default4, money$default5, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID2, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, null, null), null, null);
            UUID uuidRandomUUID3 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(1735718400000L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli3, "ofEpochMilli(...)");
            Money money$default6 = Money3.toMoney$default(new BigDecimal("0"), null, 1, null);
            BigDecimal bigDecimal3 = new BigDecimal("0");
            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli4, "ofEpochMilli(...)");
            BigDecimal bigDecimal4 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default7 = Money3.toMoney$default(new BigDecimal("-60"), null, 1, null);
            Money money$default8 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default9 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default10 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID4 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
            ProfitAndLossTradeItem profitAndLossTradeItem2 = new ProfitAndLossTradeItem(uuidRandomUUID3, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli3, "market buy", money$default6, bigDecimal3, instantOfEpochMilli4, bigDecimal4, money$default7, money$default8, money$default9, money$default10, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID4, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, null, new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, Money3.toMoney$default(new BigDecimal("40"), null, 1, null), null, Money3.toMoney$default(new BigDecimal("200"), null, 1, null), null, null)), null, null);
            UUID uuidRandomUUID5 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID5, "randomUUID(...)");
            Instant instantOfEpochMilli5 = Instant.ofEpochMilli(1735718400000L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli5, "ofEpochMilli(...)");
            Money money$default11 = Money3.toMoney$default(new BigDecimal("-10"), null, 1, null);
            BigDecimal bigDecimal5 = new BigDecimal("-0.0123");
            Instant instantOfEpochMilli6 = Instant.ofEpochMilli(100L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli6, "ofEpochMilli(...)");
            BigDecimal bigDecimal6 = new BigDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            Money money$default12 = Money3.toMoney$default(new BigDecimal("-60"), null, 1, null);
            Money money$default13 = Money3.toMoney$default(new BigDecimal("90"), null, 1, null);
            Money money$default14 = Money3.toMoney$default(new BigDecimal("20"), null, 1, null);
            Money money$default15 = Money3.toMoney$default(new BigDecimal("30"), null, 1, null);
            UUID uuidRandomUUID6 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID6, "randomUUID(...)");
            composerStartRestartGroup = composerStartRestartGroup;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-909149536, true, new C258242(CollectionsKt.listOf((Object[]) new ProfitAndLossTradeItem[]{profitAndLossTradeItem, profitAndLossTradeItem2, new ProfitAndLossTradeItem(uuidRandomUUID5, assetClass, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, instantOfEpochMilli5, "market buy", money$default11, bigDecimal5, instantOfEpochMilli6, bigDecimal6, money$default12, money$default13, money$default14, money$default15, "limit buy", new ProfitAndLossOrderDetails.CryptoOrderDetails(uuidRandomUUID6, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), Money3.toMoney$default(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, 1, null), Money3.toMoney$default(new BigDecimal("40"), null, 1, null), Money3.toMoney$default(new BigDecimal("-5"), null, 1, null), Money3.toMoney$default(new BigDecimal("200"), null, 1, null), Money3.toMoney$default(new BigDecimal("180"), null, 1, null), new BigDecimal("3.123")), new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), null, Money3.toMoney$default(new BigDecimal("40"), null, 1, null), null, Money3.toMoney$default(new BigDecimal("200"), null, 1, null), null, null)), null, null)})), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.crypto.PnlHubListTradeItemCryptoRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRowPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PnlHubListTradeItemCryptoRowPreview$lambda$4$lambda$3(int i) {
        return "MMM dd[, yyyy] hh:mm";
    }
}
