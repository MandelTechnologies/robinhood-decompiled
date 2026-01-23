package com.robinhood.transfers.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/history/TransferHistoryModule;", "", "<init>", "()V", "provideI18nWireHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/transfers/history/I18nWireTransactionFormatter;", "provideSgBankTransferHistoryFormatter", "Lcom/robinhood/transfers/history/SgBankTransferFormatter;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TransferHistoryModule {
    public static final TransferHistoryModule INSTANCE = new TransferHistoryModule();

    private TransferHistoryModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.I18N_WIRE)
    public final HistoryFormatter provideI18nWireHistoryFormatter(I18nWireTransactionFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.SG_BANK_TRANSFER)
    public final HistoryFormatter provideSgBankTransferHistoryFormatter(SgBankTransferFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
