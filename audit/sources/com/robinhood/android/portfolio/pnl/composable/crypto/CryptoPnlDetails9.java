package com.robinhood.android.portfolio.pnl.composable.crypto;

import android.content.res.Resources;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPnlDetails.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"CryptoPnlDetails", "", ErrorResponse.DETAIL, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoPnlDetailRows", "state", "Lcom/robinhood/android/portfolio/pnl/composable/crypto/CryptoPnlDetailRowsState;", "assetSymbol", "", "(Lcom/robinhood/android/portfolio/pnl/composable/crypto/CryptoPnlDetailRowsState;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CryptoPnlDetailsAcquiredProfitPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoPnlDetailsAcquiredLossPreview", "CryptoPnlDetailsTransferredPreview", "CryptoPnlDetailsTransferredAndAcquiredPreview", "lib-profit-and-loss_externalDebug", "selectedSegmentIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CryptoPnlDetails9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetailRows$lambda$7(CryptoPnlDetailRowsState cryptoPnlDetailRowsState, String str, int i, Composer composer, int i2) {
        CryptoPnlDetailRows(cryptoPnlDetailRowsState, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetails$lambda$6(ProfitAndLossTradeItem profitAndLossTradeItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoPnlDetails(profitAndLossTradeItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetailsAcquiredLossPreview$lambda$9(int i, Composer composer, int i2) {
        CryptoPnlDetailsAcquiredLossPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetailsAcquiredProfitPreview$lambda$8(int i, Composer composer, int i2) {
        CryptoPnlDetailsAcquiredProfitPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetailsTransferredAndAcquiredPreview$lambda$11(int i, Composer composer, int i2) {
        CryptoPnlDetailsTransferredAndAcquiredPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetailsTransferredPreview$lambda$10(int i, Composer composer, int i2) {
        CryptoPnlDetailsTransferredPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPnlDetails(final ProfitAndLossTradeItem detail, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails;
        boolean z;
        CryptoPnlDetailRowsState cryptoPnlDetailRowsState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(detail, "detail");
        Composer composerStartRestartGroup = composer.startRestartGroup(672163448);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(detail) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(672163448, i3, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetails (CryptoPnlDetails.kt:41)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ProfitAndLossOrderDetails orderDetails = detail.getOrderDetails();
                cryptoOrderDetails = !(orderDetails instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) ? (ProfitAndLossOrderDetails.CryptoOrderDetails) orderDetails : null;
                z = (cryptoOrderDetails == null ? cryptoOrderDetails.getTransferred() : null) == null && cryptoOrderDetails.getAcquired() != null;
                if (cryptoOrderDetails != null) {
                    cryptoPnlDetailRowsState = new CryptoPnlDetailRowsState(detail.getQuantity(), detail.getOpeningAmount(), detail.getOpenAveragePrice(), detail.getClosingAmount(), detail.getCloseAveragePrice(), detail.getRealizedReturn(), detail.getRealizedReturnPercentage(), false, 128, null);
                } else if (z && snapshotIntState2.getIntValue() == 0) {
                    ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent acquired = cryptoOrderDetails.getAcquired();
                    if (acquired == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cryptoPnlDetailRowsState = new CryptoPnlDetailRowsState(acquired, true);
                } else if (z && snapshotIntState2.getIntValue() == 1) {
                    ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent transferred = cryptoOrderDetails.getTransferred();
                    if (transferred == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cryptoPnlDetailRowsState = new CryptoPnlDetailRowsState(ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent.copy$default(transferred, null, null, null, null, null, null, null, 63, null), false, 2, null);
                } else if (cryptoOrderDetails.getTransferred() != null) {
                    ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent transferred2 = cryptoOrderDetails.getTransferred();
                    if (transferred2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cryptoPnlDetailRowsState = new CryptoPnlDetailRowsState(ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent.copy$default(transferred2, null, null, null, null, null, null, null, 63, null), false, 2, null);
                } else {
                    cryptoPnlDetailRowsState = new CryptoPnlDetailRowsState(detail.getQuantity(), detail.getOpeningAmount(), detail.getOpenAveragePrice(), detail.getClosingAmount(), detail.getCloseAveragePrice(), detail.getRealizedReturn(), detail.getRealizedReturnPercentage(), false, 128, null);
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                composerStartRestartGroup.startReplaceGroup(-667737992);
                if (z) {
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null);
                    List listListOf = CollectionsKt.listOf((Object[]) new Segment[]{new Segment(null, StringResources_androidKt.stringResource(C25673R.string.gated_crypto_pnl_hub_acquired, composerStartRestartGroup, 0), null, 5, null), new Segment(null, StringResources_androidKt.stringResource(C25673R.string.gated_crypto_pnl_hub_transferred, composerStartRestartGroup, 0), null, 5, null)});
                    int intValue = snapshotIntState2.getIntValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoPnlDetails9.CryptoPnlDetails$lambda$5$lambda$4$lambda$3(snapshotIntState2, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSegmentedControl2.BentoSegmentedControl(listListOf, intValue, (Function1) objRememberedValue2, modifierM5144paddingVpY3zN4$default, false, composerStartRestartGroup, Segment.$stable | 384, 16);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoPnlDetailRows(cryptoPnlDetailRowsState, detail.getSymbol(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPnlDetails9.CryptoPnlDetails$lambda$6(detail, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ProfitAndLossOrderDetails orderDetails2 = detail.getOrderDetails();
            if (!(orderDetails2 instanceof ProfitAndLossOrderDetails.CryptoOrderDetails)) {
            }
            if ((cryptoOrderDetails == null ? cryptoOrderDetails.getTransferred() : null) == null) {
                if (cryptoOrderDetails != null) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
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
                    composerStartRestartGroup.startReplaceGroup(-667737992);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoPnlDetailRows(cryptoPnlDetailRowsState, detail.getSymbol(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPnlDetails$lambda$5$lambda$4$lambda$3(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }

    private static final void CryptoPnlDetailRows(final CryptoPnlDetailRowsState cryptoPnlDetailRowsState, final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1951492031);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(cryptoPnlDetailRowsState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951492031, i2, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailRows (CryptoPnlDetails.kt:120)");
            }
            CryptoPnlDetails cryptoPnlDetails = CryptoPnlDetails.INSTANCE;
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, cryptoPnlDetails.m17670getLambda$309406596$lib_profit_and_loss_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(1973167487, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt.CryptoPnlDetailRows.1
                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    String strStringResource;
                    Money.Adjustment normalizedAdjustment;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1973167487, i3, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailRows.<anonymous> (CryptoPnlDetails.kt:129)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    CryptoPnlDetailRowsState cryptoPnlDetailRowsState2 = cryptoPnlDetailRowsState;
                    String str2 = str;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Money openAmount = cryptoPnlDetailRowsState2.getOpenAmount();
                    String strStringResource2 = null;
                    if (openAmount != null && (normalizedAdjustment = openAmount.toNormalizedAdjustment()) != null) {
                        strStringResource2 = Money.Adjustment.format$default(normalizedAdjustment, false, null, 3, null);
                    }
                    composer2.startReplaceGroup(898091469);
                    if (strStringResource2 == null) {
                        strStringResource2 = StringResources_androidKt.stringResource(C25673R.string.gated_crypto_pnl_hub_cost_at_open_not_available, composer2, 0);
                    }
                    String str3 = strStringResource2;
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8190);
                    if (cryptoPnlDetailRowsState2.getOpenAveragePrice() == null) {
                        composer2.startReplaceGroup(898103612);
                        int i5 = C25673R.string.gated_crypto_pnl_hub_cost_at_open_without_average_cost;
                        NumberFormatter lowPrecisionUnitFormat = Formats.getLowPrecisionUnitFormat();
                        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(cryptoPnlDetailRowsState2.getQuantity());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
                        strStringResource = StringResources_androidKt.stringResource(i5, new Object[]{lowPrecisionUnitFormat.format(bigDecimalM822m), str2}, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(898115247);
                        int i6 = C25673R.string.gated_crypto_pnl_hub_cost_at_open_with_average_cost;
                        Money moneyAbs = cryptoPnlDetailRowsState2.getOpenAveragePrice().abs();
                        String str4 = Money.format$default(moneyAbs, null, false, null, false, 0, Integer.valueOf(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(moneyAbs.getDecimalValue()).scale()), false, null, false, false, 991, null);
                        NumberFormatter lowPrecisionUnitFormat2 = Formats.getLowPrecisionUnitFormat();
                        BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(cryptoPnlDetailRowsState2.getQuantity());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m2, "stripTrailingZeros(...)");
                        strStringResource = StringResources_androidKt.stringResource(i6, new Object[]{str4, lowPrecisionUnitFormat2.format(bigDecimalM822m2), str2}, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1975);
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, cryptoPnlDetails.m17668getLambda$1909974349$lib_profit_and_loss_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(1210398454, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt.CryptoPnlDetailRows.2
                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1210398454, i3, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailRows.<anonymous> (CryptoPnlDetails.kt:168)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    CryptoPnlDetailRowsState cryptoPnlDetailRowsState2 = cryptoPnlDetailRowsState;
                    String str2 = str;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    String str3 = Money.Adjustment.format$default(cryptoPnlDetailRowsState2.getCloseAmount().toNormalizedAdjustment(), false, null, 3, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8190);
                    int i5 = C25673R.string.gated_crypto_pnl_hub_cost_at_open_with_average_cost;
                    Money closeAveragePrice = cryptoPnlDetailRowsState2.getCloseAveragePrice();
                    String str4 = Money.format$default(closeAveragePrice, null, false, null, false, 0, Integer.valueOf(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(closeAveragePrice.getDecimalValue()).scale()), false, null, false, false, 991, null);
                    NumberFormatter lowPrecisionUnitFormat = Formats.getLowPrecisionUnitFormat();
                    BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(cryptoPnlDetailRowsState2.getQuantity());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i5, new Object[]{str4, lowPrecisionUnitFormat.format(bigDecimalM822m), str2}, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1975);
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-961484620, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt.CryptoPnlDetailRows.3
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-961484620, i3, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailRows.<anonymous> (CryptoPnlDetails.kt:190)");
                    }
                    Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                    CryptoPnlDetailRowsState cryptoPnlDetailRowsState2 = cryptoPnlDetailRowsState;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    String strStringResource = StringResources_androidKt.stringResource(cryptoPnlDetailRowsState2.getRealizedProfitAndLoss() == null ? C25673R.string.gated_crypto_pnl_hub_realized_profit_loss : cryptoPnlDetailRowsState2.getRealizedProfitAndLoss().isNegative() ? C25673R.string.pnl_hub_trade_realized_loss : C25673R.string.pnl_hub_trade_realized_profit, composer2, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 24576, 0, 8174);
                    composer2.startReplaceGroup(2025493102);
                    if (cryptoPnlDetailRowsState2.getRealizedProfitAndLossExcludesTransfers()) {
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25673R.string.gated_crypto_pnl_hub_realized_profit_loss_excludes_transfers, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8186);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-2136079113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt.CryptoPnlDetailRows.4
                public final void invoke(Composer composer2, int i3) {
                    long jM21452getNegative0d7_KjU;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2136079113, i3, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailRows.<anonymous> (CryptoPnlDetails.kt:212)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    CryptoPnlDetailRowsState cryptoPnlDetailRowsState2 = cryptoPnlDetailRowsState;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Money realizedProfitAndLoss = cryptoPnlDetailRowsState2.getRealizedProfitAndLoss();
                    String realizedReturn = realizedProfitAndLoss != null ? PnlTradeDetailComposable2.formatRealizedReturn(realizedProfitAndLoss) : null;
                    composer2.startReplaceGroup(-1478400566);
                    if (realizedReturn == null) {
                        realizedReturn = StringResources_androidKt.stringResource(C25673R.string.gated_crypto_pnl_hub_realized_profit_loss_unavailable, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(realizedReturn, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 24576, 0, 8174);
                    BigDecimal realizedProfitAndLossPercentage = cryptoPnlDetailRowsState2.getRealizedProfitAndLossPercentage();
                    composer2.startReplaceGroup(-1478389301);
                    if (realizedProfitAndLossPercentage != null) {
                        String str2 = Formats.m2149x4a8e6258(null, 1, null).format(realizedProfitAndLossPercentage);
                        TextStyle textS = bentoTheme.getTypography(composer2, i4).getTextS();
                        if (BigDecimals7.isZero(realizedProfitAndLossPercentage)) {
                            composer2.startReplaceGroup(1675410129);
                            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        } else if (BigDecimals7.isPositive(realizedProfitAndLossPercentage)) {
                            composer2.startReplaceGroup(1675412311);
                            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21456getPositive0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1675414327);
                            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21452getNegative0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1975);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPnlDetails9.CryptoPnlDetailRows$lambda$7(cryptoPnlDetailRowsState, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoPnlDetailsAcquiredProfitPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-112733808);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112733808, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsAcquiredProfitPreview (CryptoPnlDetails.kt:275)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoPnlDetails.INSTANCE.m17671getLambda$838093608$lib_profit_and_loss_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPnlDetails9.CryptoPnlDetailsAcquiredProfitPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoPnlDetailsAcquiredLossPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1666107055);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666107055, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsAcquiredLossPreview (CryptoPnlDetails.kt:308)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoPnlDetails.INSTANCE.m17673getLambda$993862665$lib_profit_and_loss_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPnlDetails9.CryptoPnlDetailsAcquiredLossPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoPnlDetailsTransferredPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(438567998);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(438567998, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsTransferredPreview (CryptoPnlDetails.kt:341)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoPnlDetails.INSTANCE.m17672getLambda$894163466$lib_profit_and_loss_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPnlDetails9.CryptoPnlDetailsTransferredPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoPnlDetailsTransferredAndAcquiredPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(780459261);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780459261, i, -1, "com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsTransferredAndAcquiredPreview (CryptoPnlDetails.kt:382)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoPnlDetails.INSTANCE.m17669getLambda$235603899$lib_profit_and_loss_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetailsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPnlDetails9.CryptoPnlDetailsTransferredAndAcquiredPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
