package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.foundation.Background3;
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
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRow6;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTradingOptionsInstrumentRowState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoTradingOptionsInstrumentRowStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoTradingOptionsInstrumentRowState {
    public static final CryptoTradingOptionsInstrumentRowState INSTANCE = new CryptoTradingOptionsInstrumentRowState();
    private static Function2<Composer, Integer, Unit> lambda$1088246712 = ComposableLambda3.composableLambdaInstance(1088246712, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoTradingOptionsInstrumentRowStateKt$lambda$1088246712$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1088246712, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoTradingOptionsInstrumentRowStateKt.lambda$1088246712.<anonymous> (CryptoTradingOptionsInstrumentRowState.kt:73)");
            }
            CryptoTradingOptions.TradingOptionItem tradingOptionItem = new CryptoTradingOptions.TradingOptionItem("Bitcoin", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "", "$27,000.00", "3.5%", null, extensions2.persistentListOf(), null, "btc boy approves", new InstrumentDetails3.Chart(extensions2.persistentListOf(), extensions2.persistentListOf(), Direction.f5855UP));
            Direction direction = Direction.DOWN;
            List listListOf = CollectionsKt.listOf((Object[]) new CryptoTradingOptions.TradingOptionItem[]{tradingOptionItem, CryptoTradingOptions.TradingOptionItem.copy$default(tradingOptionItem, "Ethereum", "ETH", null, "$1,800.00", "1.2%", null, null, null, null, new InstrumentDetails3.Chart(extensions2.persistentListOf(), extensions2.persistentListOf(), direction), 484, null), CryptoTradingOptions.TradingOptionItem.copy$default(tradingOptionItem, null, null, null, null, "-0.4%", direction, null, null, null, null, 463, null)});
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-1929682491);
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                InstrumentRow5.InstrumentRow(null, CryptoTradingOptionsInstrumentRowState3.toInstrumentRowState((CryptoTradingOptions.TradingOptionItem) it.next(), true, !StringsKt.contains$default((CharSequence) r0.getPercentChange(), (CharSequence) "-", false, 2, (Object) null), composer2, 48, 0), null, null, composer, InstrumentRow6.$stable << 3, 13);
                composer2 = composer;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1088246712$feature_crypto_tab_externalDebug() {
        return lambda$1088246712;
    }
}
