package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeAmountInputRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeAmountInputRow {
    public static final CryptoQuickTradeAmountInputRow INSTANCE = new CryptoQuickTradeAmountInputRow();
    private static Function2<Composer, Integer, Unit> lambda$1397694828 = ComposableLambda3.composableLambdaInstance(1397694828, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt$lambda$1397694828$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397694828, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt.lambda$1397694828.<anonymous> (CryptoQuickTradeAmountInputRow.kt:262)");
            }
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
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(new CryptoQuickTradeAmountInputRowState("", "Buy up to 0.0586", new CryptoInputRowCurrencyToggle4.Asset(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO)), null, null, null, composer, 48, 12);
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(new CryptoQuickTradeAmountInputRowState("", "$4239.39 available", new CryptoInputRowCurrencyToggle4.Quote("USD")), null, null, null, composer, 48, 12);
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(new CryptoQuickTradeAmountInputRowState("1,234.567890", "0.0586 BTC available", new CryptoInputRowCurrencyToggle4.Asset(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO)), null, null, null, composer, 48, 12);
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(new CryptoQuickTradeAmountInputRowState("999,999,999,999,999,999", "Buy up to 0.0586", new CryptoInputRowCurrencyToggle4.Asset(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO)), null, null, null, composer, 48, 12);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$1513065964 = ComposableLambda3.composableLambdaInstance(1513065964, false, CryptoQuickTradeAmountInputRow3.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1397694828$feature_trade_crypto_externalDebug() {
        return lambda$1397694828;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1513065964$feature_trade_crypto_externalDebug() {
        return lambda$1513065964;
    }
}
