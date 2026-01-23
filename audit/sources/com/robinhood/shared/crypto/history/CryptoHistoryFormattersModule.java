package com.robinhood.shared.crypto.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoryFormattersModule.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001bH\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/CryptoHistoryFormattersModule;", "", "<init>", "()V", "provideSepaCreditHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/shared/crypto/history/SepaCreditFormatter;", "provideCryptoTransferHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoTransferFormatter;", "provideCryptoClawbackHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoClawbackFormatter;", "provideCryptoDemeterHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoStakingFormatter;", "provideCryptoGiftItemHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoGiftFormatter;", "provideCryptoOrderHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoOrderFormatter;", "provideCryptoMarketOrderHistoryFormatter", "provideCryptoLimitOrderHistoryFormatter", "provideCryptoStopLossOrderHistoryFormatter", "provideCryptoStopLimitOrderHistoryFormatter", "provideTokenizedDividendHistoryFormatter", "Lcom/robinhood/shared/crypto/history/TokenizedDividendFormatter;", "provideTokenizedSplitPaymentHistoryFormatter", "Lcom/robinhood/shared/crypto/history/TokenizedSplitPaymentFormatter;", "provideCryptoAcatsHistoryFormatter", "Lcom/robinhood/shared/crypto/history/CryptoAcatsHistoryFormatter;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoHistoryFormattersModule {
    public static final CryptoHistoryFormattersModule INSTANCE = new CryptoHistoryFormattersModule();

    private CryptoHistoryFormattersModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.SEPA_CREDIT)
    public final HistoryFormatter provideSepaCreditHistoryFormatter(SepaCreditFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_TRANSFER)
    public final HistoryFormatter provideCryptoTransferHistoryFormatter(CryptoTransferFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_CLAWBACK)
    public final HistoryFormatter provideCryptoClawbackHistoryFormatter(CryptoClawbackFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_STAKING)
    public final HistoryFormatter provideCryptoDemeterHistoryFormatter(CryptoStakingFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_GIFT_ITEM)
    public final HistoryFormatter provideCryptoGiftItemHistoryFormatter(CryptoGiftFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_ORDER)
    public final HistoryFormatter provideCryptoOrderHistoryFormatter(CryptoOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_MARKET_ORDER)
    public final HistoryFormatter provideCryptoMarketOrderHistoryFormatter(CryptoOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_LIMIT_ORDER)
    public final HistoryFormatter provideCryptoLimitOrderHistoryFormatter(CryptoOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER)
    public final HistoryFormatter provideCryptoStopLossOrderHistoryFormatter(CryptoOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER)
    public final HistoryFormatter provideCryptoStopLimitOrderHistoryFormatter(CryptoOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS)
    public final HistoryFormatter provideTokenizedDividendHistoryFormatter(TokenizedDividendFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS)
    public final HistoryFormatter provideTokenizedSplitPaymentHistoryFormatter(TokenizedSplitPaymentFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_ACATS_TRANSFER)
    public final HistoryFormatter provideCryptoAcatsHistoryFormatter(CryptoAcatsHistoryFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
