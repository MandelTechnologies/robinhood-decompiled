package com.robinhood.shared.crypto.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.TokenizedCorpActionDividendTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: TokenizedDividendFormatter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/TokenizedDividendFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/TokenizedCorpActionDividendTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getAmountText", "getLineItems", "", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TokenizedDividendFormatter extends AbstractMinervaTransactionFormatter<TokenizedCorpActionDividendTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((TokenizedCorpActionDividendTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizedDividendFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(TokenizedCorpActionDividendTransaction transaction) throws Resources.NotFoundException {
        StringResource symbolWithTypeSingular;
        CharSequence text;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Resources resources = getResources();
        int i = C37690R.string.tokenization_dividend_history_item_primary_text;
        UiCurrencyPair currencyPair = transaction.getEvent().getCurrencyPair();
        String string2 = (currencyPair == null || (symbolWithTypeSingular = UiCurrencyPairs.getSymbolWithTypeSingular(currencyPair)) == null || (text = symbolWithTypeSingular.getText(getResources())) == null) ? null : text.toString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = resources.getString(i, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Instant initiatedAt = historyEvent.getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) Instants.toLocalDate(initiatedAt, zoneIdSystemDefault));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(TokenizedCorpActionDividendTransaction transaction) {
        Money money;
        Money.Adjustment creditAdjustment;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        MoneyDto net_amount = transaction.getEvent().getTokenizedDividend().getData().getNet_amount();
        String str = null;
        if (net_amount != null && (money = Money3.toMoney(net_amount)) != null && (creditAdjustment = money.toCreditAdjustment()) != null) {
            str = Money.Adjustment.format$default(creditAdjustment, false, CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale(), 1, null);
        }
        return str == null ? "" : str;
    }

    public Void getLineItems(TokenizedCorpActionDividendTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Tokenized dividends currently have their own history");
    }
}
