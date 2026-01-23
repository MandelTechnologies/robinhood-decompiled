package com.robinhood.android.transfers.lib.limits;

import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiCountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GetLimitTriggered.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007*\"\u0010\b\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\t"}, m3636d2 = {"getLimitTriggered", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiCountLimit;", "Lcom/robinhood/android/transfers/lib/limits/ApiLimit;", "Ljava/math/BigDecimal;", "limitsHubResponse", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "ApiLimit", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.lib.limits.GetLimitTriggeredKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class GetLimitTriggered {
    public static final Either<ApiAmountLimit, ApiCountLimit> getLimitTriggered(BigDecimal bigDecimal, ApiLimitsHubResponse limitsHubResponse) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(limitsHubResponse, "limitsHubResponse");
        List<ApiAmountLimit> amount_limits = limitsHubResponse.getAmount_limits();
        if (amount_limits != null) {
            ArrayList<ApiAmountLimit> arrayList = new ArrayList();
            for (Object obj : amount_limits) {
                if (((ApiAmountLimit) obj).getLimits_interval() == LimitsInterval.DAILY) {
                    arrayList.add(obj);
                }
            }
            for (ApiAmountLimit apiAmountLimit : arrayList) {
                if (bigDecimal.compareTo(apiAmountLimit.getRemaining_amount()) > 0) {
                    return Either2.asLeft(apiAmountLimit);
                }
            }
        }
        List<ApiCountLimit> count_limits = limitsHubResponse.getCount_limits();
        if (count_limits == null) {
            return null;
        }
        ArrayList<ApiCountLimit> arrayList2 = new ArrayList();
        for (Object obj2 : count_limits) {
            if (((ApiCountLimit) obj2).getLimits_interval() == LimitsInterval.DAILY) {
                arrayList2.add(obj2);
            }
        }
        for (ApiCountLimit apiCountLimit : arrayList2) {
            if (apiCountLimit.getRemaining_count() == 0) {
                return Either2.asRight(apiCountLimit);
            }
        }
        return null;
    }
}
