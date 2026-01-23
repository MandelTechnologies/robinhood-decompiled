package com.robinhood.android.transfers.p271ui.p272v2.accounts;

import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.lib.transfers.contracts.models.AmountLimit;
import com.robinhood.lib.transfers.contracts.models.CountLimit;
import com.robinhood.lib.transfers.contracts.models.TransferLimits;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiCountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponseDetails;
import com.robinhood.models.p320db.TransferDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferLimits.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"toMicrogramTransferLimits", "Lcom/robinhood/lib/transfers/contracts/models/TransferLimits;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "toMicrogramAmountLimit", "Lcom/robinhood/lib/transfers/contracts/models/AmountLimit;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "toMicrogramCountLimit", "Lcom/robinhood/lib/transfers/contracts/models/CountLimit;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiCountLimit;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.accounts.TransferLimitsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferLimits2 {
    public static final TransferLimits toMicrogramTransferLimits(ApiLimitsHubResponse apiLimitsHubResponse) {
        ArrayList arrayList;
        TransferDirection direction;
        Intrinsics.checkNotNullParameter(apiLimitsHubResponse, "<this>");
        String serverValue = apiLimitsHubResponse.getProduct_type().getServerValue();
        ApiLimitsHubResponseDetails details = apiLimitsHubResponse.getDetails();
        ArrayList arrayList2 = null;
        com.robinhood.lib.transfers.contracts.models.TransferDirection microgramTransferDirection = (details == null || (direction = details.getDirection()) == null) ? null : MicrogramConverters2.toMicrogramTransferDirection(direction);
        List<ApiAmountLimit> amount_limits = apiLimitsHubResponse.getAmount_limits();
        if (amount_limits != null) {
            List<ApiAmountLimit> list = amount_limits;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toMicrogramAmountLimit((ApiAmountLimit) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<ApiCountLimit> count_limits = apiLimitsHubResponse.getCount_limits();
        if (count_limits != null) {
            List<ApiCountLimit> list2 = count_limits;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(toMicrogramCountLimit((ApiCountLimit) it2.next()));
            }
        }
        return new TransferLimits(serverValue, microgramTransferDirection, arrayList, arrayList2);
    }

    private static final AmountLimit toMicrogramAmountLimit(ApiAmountLimit apiAmountLimit) {
        return new AmountLimit(apiAmountLimit.getCurrency().getServerValue(), apiAmountLimit.getLimits_interval().getServerValue(), BigDecimals6.toBignumBigDecimal(apiAmountLimit.getRemaining_amount()), BigDecimals6.toBignumBigDecimal(apiAmountLimit.getTotal_amount()));
    }

    private static final CountLimit toMicrogramCountLimit(ApiCountLimit apiCountLimit) {
        return new CountLimit(apiCountLimit.getLimits_interval().getServerValue(), apiCountLimit.getRemaining_count(), apiCountLimit.getTotal_count());
    }
}
