package com.robinhood.android.common.investflow.allocationprovider;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InvestFlowAllocationProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProvider;", "", "getSplit", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/util/Money;", "totalAmount", "instruments", "", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface InvestFlowAllocationProvider {
    Single<Map<Instrument, Money>> getSplit(Money totalAmount, List<Instrument> instruments);
}
