package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionStrategyCodeRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity$1 */
/* loaded from: classes13.dex */
/* synthetic */ class C33562xdd942c3d extends AdaptedFunctionReference implements Function1<ApiAggregateOptionPositionStrategyCodeRequest, Flow<? extends PaginatedResult<? extends ApiAggregateOptionPosition>>> {
    C33562xdd942c3d(Object obj) {
        super(1, obj, PaginatedEndpoint.class, "pollAllPages", "pollAllPages(Ljava/lang/Object;Ljava/time/Duration;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<PaginatedResult<ApiAggregateOptionPosition>> invoke(ApiAggregateOptionPositionStrategyCodeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default((PaginatedEndpoint) this.receiver, p0, null, 2, null);
    }
}
