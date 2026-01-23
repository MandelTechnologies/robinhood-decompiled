package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.models.history.IncomingWireTransaction;
import com.robinhood.transfers.api.TransferState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IncomingWireTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/shared/models/history/IncomingWireTransaction;", "getLabelResId", "(Lcom/robinhood/shared/models/history/IncomingWireTransaction;)I", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.IncomingWireTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IncomingWireTransferFormatter2 {
    public static final int getLabelResId(IncomingWireTransaction incomingWireTransaction) {
        Intrinsics.checkNotNullParameter(incomingWireTransaction, "<this>");
        TransferState state = incomingWireTransaction.getEvent().getState();
        if (state == TransferState.PENDING) {
            return C39006R.string.minerva_ach_transfer_state_in_review;
        }
        return UtilsKt.getLabelResId(state);
    }
}
