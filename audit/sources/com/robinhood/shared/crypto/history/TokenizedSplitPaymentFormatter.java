package com.robinhood.shared.crypto.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.models.history.TokenizedCorpActionSplitPaymentTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nummus.p512v1.CorpActionSplitDto;
import nummus.p512v1.SplitDirectionDto;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: TokenizedSplitPaymentFormatter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/TokenizedSplitPaymentFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/TokenizedCorpActionSplitPaymentTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getAmountText", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TokenizedSplitPaymentFormatter extends AbstractMinervaTransactionFormatter<TokenizedCorpActionSplitPaymentTransaction> {

    /* compiled from: TokenizedSplitPaymentFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SplitDirectionDto.values().length];
            try {
                iArr[SplitDirectionDto.SPLIT_DIRECTION_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SplitDirectionDto.SPLIT_DIRECTION_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizedSplitPaymentFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(TokenizedCorpActionSplitPaymentTransaction transaction) throws Resources.NotFoundException {
        int i;
        StringResource symbolWithTypeSingular;
        CharSequence text;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Resources resources = getResources();
        CorpActionSplitDto split = transaction.getEvent().getTokenizedSplitPayment().getData().getSplit();
        String string2 = null;
        SplitDirectionDto split_direction = split != null ? split.getSplit_direction() : null;
        int i2 = split_direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[split_direction.ordinal()];
        if (i2 == 1) {
            i = C37690R.string.tokenization_split_forward_split_primary_text;
        } else if (i2 == 2) {
            i = C37690R.string.tokenization_split_reverse_split_primary_text;
        } else {
            i = C37690R.string.history_tokenization_split_generic;
        }
        UiCurrencyPair currencyPair = transaction.getEvent().getCurrencyPair();
        if (currencyPair != null && (symbolWithTypeSingular = UiCurrencyPairs.getSymbolWithTypeSingular(currencyPair)) != null && (text = symbolWithTypeSingular.getText(getResources())) != null) {
            string2 = text.toString();
        }
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
    public CharSequence getAmountText(TokenizedCorpActionSplitPaymentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CorpActionSplitDto split = transaction.getEvent().getTokenizedSplitPayment().getData().getSplit();
        String string2 = split != null ? getResources().getString(C37690R.string.tokenization_split_payment_ratio_display, FormatsLocalized.getShareQuantityFormat().format(split.getMultiplier().toBigDecimalOrThrow()), FormatsLocalized.getShareQuantityFormat().format(split.getDivisor().toBigDecimalOrThrow())) : null;
        return string2 == null ? "" : string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(TokenizedCorpActionSplitPaymentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Tokenized split payments currently have their own history detail");
    }
}
