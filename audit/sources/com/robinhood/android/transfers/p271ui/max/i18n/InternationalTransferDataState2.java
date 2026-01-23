package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"isValidUkExternalAccount", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Z", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferDataState2 {
    public static final boolean isValidUkExternalAccount(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        return transferAccount.isExternal() && transferAccount.getAccountName().length() > 0;
    }
}
