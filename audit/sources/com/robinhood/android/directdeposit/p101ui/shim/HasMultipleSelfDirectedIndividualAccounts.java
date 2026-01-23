package com.robinhood.android.directdeposit.p101ui.shim;

import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HasMultipleSelfDirectedIndividualAccounts.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m3636d2 = {"hasMultipleSelfDirectedIndividualAccounts", "", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.shim.HasMultipleSelfDirectedIndividualAccountsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class HasMultipleSelfDirectedIndividualAccounts {
    public static final boolean hasMultipleSelfDirectedIndividualAccounts(List<TransferAccount> list) {
        int i;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TransferAccount> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (TransferAccount transferAccount : list2) {
                if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS) {
                    ManagementInfo managementInfo = transferAccount.getManagementInfo();
                    if ((managementInfo != null ? managementInfo.getManagement_type() : null) != ManagementType.MANAGED && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return i >= 2;
    }
}
