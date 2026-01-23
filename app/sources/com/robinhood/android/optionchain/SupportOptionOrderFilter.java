package com.robinhood.android.optionchain;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.Tuples2;

/* compiled from: SupportOptionOrderFilter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionchain/SupportOptionOrderFilter;", "", "optionOrderFilterRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/models/db/OptionContractType;", "getOptionOrderFilterRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface SupportOptionOrderFilter {
    BehaviorRelay<Tuples2<OrderSide, OptionContractType>> getOptionOrderFilterRelay();
}
