package com.robinhood.android.internalassettransfer.history.provisions;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferHistoryFormattersModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfer/history/provisions/InternalAssetTransferHistoryFormattersModule;", "", "<init>", "()V", "provideInternalAssetTransferHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/android/internalassettransfer/history/provisions/InternalAssetTransferFormatter;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistoryFormattersModule {
    public static final InternalAssetTransferHistoryFormattersModule INSTANCE = new InternalAssetTransferHistoryFormattersModule();

    private InternalAssetTransferHistoryFormattersModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.INTERNAL_ASSET_TRANSFER)
    public final HistoryFormatter provideInternalAssetTransferHistoryFormatter(InternalAssetTransferFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
