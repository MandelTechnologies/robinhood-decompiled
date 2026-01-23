package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.MarketIdentificationCode;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.QuoteSource;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: InvestingMonitorAssetRowExample.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"InvestingMonitorAssetRowExample", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowExampleKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorAssetRowExample {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorAssetRowExample$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestingMonitorAssetRowExample(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void InvestingMonitorAssetRowExample(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1438543169);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1438543169, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowExample (InvestingMonitorAssetRowExample.kt:22)");
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            Intrinsics.checkNotNull(instantOfEpochMilli);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            InvestingMonitorAsset investingMonitorAsset = new InvestingMonitorAsset(uuidRandomUUID, new InstrumentCuratedListEligible(new CuratedListItem(instantOfEpochMilli, uuidRandomUUID2, CuratedListObjectType.INSTRUMENT, "ROAR", "Lion Rock Inc", null, null, null, null, null, null), null, null), InstrumentType.EQUITY);
            Currency currency = Currencies.USD;
            Money money = new Money(currency, new BigDecimal("150.00"));
            Money money2 = new Money(currency, new BigDecimal("151.50"));
            BigDecimal bigDecimal = new BigDecimal("100");
            Money money3 = new Money(currency, new BigDecimal("151.25"));
            BigDecimal bigDecimal2 = new BigDecimal("100");
            UUID uuidRandomUUID3 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
            Money money4 = new Money(currency, new BigDecimal("257.96"));
            Money money5 = new Money(currency, new BigDecimal("150.00"));
            QuoteSource quoteSource = QuoteSource.NLS;
            MarketIdentificationCode marketIdentificationCode = MarketIdentificationCode.NASDAQ;
            InvestingMonitorAssetRow.InvestingMonitorAssetRowInternal(investingMonitorAsset, false, 0, 1, new AssetQuote.Equity(new Quote(money, money2, bigDecimal, money3, bigDecimal2, true, uuidRandomUUID3, null, money4, "NLS", null, instantOfEpochMilli, instantOfEpochMilli, "AAPL", false, money5, quoteSource, quoteSource, marketIdentificationCode, marketIdentificationCode), null, 2, null), null, "3.27%", modifier3, composerStartRestartGroup, ((i3 << 21) & 29360128) | 1772976, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowExampleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorAssetRowExample.InvestingMonitorAssetRowExample$lambda$0(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
