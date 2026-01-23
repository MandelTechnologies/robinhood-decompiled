package com.robinhood.android.isa.isatransferhistoryformatter;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaCashTransferFormatterModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferhistoryformatter/IsaCashTransferFormatterModule;", "", "<init>", "()V", "provideFxOrderFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/android/isa/isatransferhistoryformatter/IsaCashTransferFormatter;", "lib-isa-transfer-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaCashTransferFormatterModule {
    public static final IsaCashTransferFormatterModule INSTANCE = new IsaCashTransferFormatterModule();

    private IsaCashTransferFormatterModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.ISA_CASH_TRANSFER)
    public final HistoryFormatter provideFxOrderFormatter(IsaCashTransferFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
