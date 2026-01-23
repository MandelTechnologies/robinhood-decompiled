package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"assetName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxoKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferDuxo4 {
    public static final StringResource assetName(AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3) {
        Intrinsics.checkNotNullParameter(acatsPlaidPartialTransferDuxo3, "<this>");
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            return StringResource.INSTANCE.invoke(((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) acatsPlaidPartialTransferDuxo3).getEquityAsset().getName());
        }
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) {
            return StringResource.INSTANCE.invoke(((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) acatsPlaidPartialTransferDuxo3).getOptionsAsset().getName());
        }
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            return StringResource.INSTANCE.invoke(C7376R.string.acats_plaid_partial_transfer_removal_title_cash, new Object[0]);
        }
        if (!(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment)) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C7376R.string.acats_plaid_partial_transfer_removal_title_margin, new Object[0]);
    }
}
