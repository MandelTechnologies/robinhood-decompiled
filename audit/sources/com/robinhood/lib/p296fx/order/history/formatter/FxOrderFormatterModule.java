package com.robinhood.lib.p296fx.order.history.formatter;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxOrderFormatterModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatterModule;", "", "<init>", "()V", "provideFxOrderFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatter;", "lib-fx-order-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class FxOrderFormatterModule {
    @HistoryFormatterKey(HistoryTransactionType.FX_ORDER)
    public final HistoryFormatter provideFxOrderFormatter(FxOrderFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
