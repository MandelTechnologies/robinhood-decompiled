package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;

/* compiled from: ErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/util/ErrorDialogs;", "", "<init>", "()V", "GenericTransferError", "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "getGenericTransferError", "()Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.ErrorDialogs, reason: use source file name */
/* loaded from: classes9.dex */
public final class ErrorDialog5 {
    public static final int $stable;
    private static final ErrorDialog GenericTransferError;
    public static final ErrorDialog5 INSTANCE = new ErrorDialog5();

    private ErrorDialog5() {
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        GenericTransferError = new ErrorDialog(companion.invoke(C30310R.string.generic_transfer_error_title, new Object[0]), companion.invoke(C30310R.string.generic_transfer_error_message, new Object[0]), ErrorDialog.DismissAction.FINISH);
        $stable = StringResource.$stable;
    }

    public final ErrorDialog getGenericTransferError() {
        return GenericTransferError;
    }
}
