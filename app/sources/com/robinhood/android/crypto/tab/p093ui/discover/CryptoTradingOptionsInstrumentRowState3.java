package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTradingOptionsInstrumentRowState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"toInstrumentRowState", "Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "showDivider", "", "showIconDirection", "(Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;ZZLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "InstrumentTradingOptionsRowComposablePreview", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoTradingOptionsInstrumentRowStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoTradingOptionsInstrumentRowState3 {

    /* compiled from: CryptoTradingOptionsInstrumentRowState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoTradingOptionsInstrumentRowStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentTradingOptionsRowComposablePreview$lambda$1(int i, Composer composer, int i2) {
        InstrumentTradingOptionsRowComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final InstrumentRowState toInstrumentRowState(CryptoTradingOptions.TradingOptionItem tradingOptionItem, boolean z, boolean z2, Composer composer, int i, int i2) {
        ImmutableList3 immutableList3PersistentListOf;
        Direction direction;
        Composer composer2;
        long jM21456getPositive0d7_KjU;
        List<ChartLine> chartLines;
        Intrinsics.checkNotNullParameter(tradingOptionItem, "<this>");
        composer.startReplaceGroup(-690943081);
        boolean z3 = (i2 & 1) != 0 ? true : z;
        boolean z4 = (i2 & 2) != 0 ? true : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-690943081, i, -1, "com.robinhood.android.crypto.tab.ui.discover.toInstrumentRowState (CryptoTradingOptionsInstrumentRowState.kt:30)");
        }
        InstrumentDetails3.Chart chart = tradingOptionItem.getChart();
        if (chart == null || (chartLines = chart.getChartLines()) == null || (immutableList3PersistentListOf = extensions2.toPersistentList(chartLines)) == null) {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        Direction percentChangeDirection = tradingOptionItem.getPercentChangeDirection();
        if (percentChangeDirection != null) {
            direction = percentChangeDirection;
        } else {
            InstrumentDetails3.Chart chart2 = tradingOptionItem.getChart();
            if (chart2 != null) {
                percentChangeDirection = chart2.getPageDirection();
                direction = percentChangeDirection;
            } else {
                direction = null;
            }
        }
        String title = tradingOptionItem.getTitle();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Text text = new Text(title, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null);
        Direction direction2 = direction;
        Text text2 = new Text(tradingOptionItem.getSubtitle(), bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), null);
        Text text3 = new Text(tradingOptionItem.getLastPrice(), bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null);
        String percentChange = tradingOptionItem.getPercentChange();
        int i4 = direction2 != null ? WhenMappings.$EnumSwitchMapping$0[direction2.ordinal()] : -1;
        if (i4 == 1) {
            composer2 = composer;
            composer2.startReplaceGroup(1723658879);
            jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i3).m21456getPositive0d7_KjU();
            composer2.endReplaceGroup();
        } else if (i4 == 2) {
            composer2 = composer;
            composer2.startReplaceGroup(1723660831);
            jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i3).m21452getNegative0d7_KjU();
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(1723662458);
            jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU();
            composer2.endReplaceGroup();
        }
        Text text4 = new Text(percentChange, jM21456getPositive0d7_KjU, null);
        ImmutableList3 persistentList = extensions2.toPersistentList(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(immutableList3PersistentListOf, 0.0f, null, composer2, 0, 6));
        Color.Companion companion = Color.INSTANCE;
        InstrumentRowState instrumentRowState = new InstrumentRowState(null, null, null, text, text2, text3, text4, new BackgroundColor(companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), null), persistentList, false, false, 1, z3, false, false, z4 ? direction2 : null, 24583, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return instrumentRowState;
    }

    private static final void InstrumentTradingOptionsRowComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1055122544);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055122544, i, -1, "com.robinhood.android.crypto.tab.ui.discover.InstrumentTradingOptionsRowComposablePreview (CryptoTradingOptionsInstrumentRowState.kt:72)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, CryptoTradingOptionsInstrumentRowState.INSTANCE.getLambda$1088246712$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoTradingOptionsInstrumentRowStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTradingOptionsInstrumentRowState3.InstrumentTradingOptionsRowComposablePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
