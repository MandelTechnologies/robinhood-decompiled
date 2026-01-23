package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.api.ApiPositionSortOptions;
import com.robinhood.android.models.portfolio.api.AssetType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/api/ApiPositionSortOptions;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/models/portfolio/api/AssetType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortOptionsEndpoint$1", m3645f = "PositionsV2Store.kt", m3646l = {333}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$sortOptionsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends AssetType>, Continuation<? super ApiPositionSortOptions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$sortOptionsEndpoint$1(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$sortOptionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsV2Store$sortOptionsEndpoint$1 positionsV2Store$sortOptionsEndpoint$1 = new PositionsV2Store$sortOptionsEndpoint$1(this.this$0, continuation);
        positionsV2Store$sortOptionsEndpoint$1.L$0 = obj;
        return positionsV2Store$sortOptionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends AssetType> tuples2, Continuation<? super ApiPositionSortOptions> continuation) {
        return invoke2((Tuples2<String, ? extends AssetType>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ? extends AssetType> tuples2, Continuation<? super ApiPositionSortOptions> continuation) {
        return ((PositionsV2Store$sortOptionsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        AssetType assetType = (AssetType) tuples2.component2();
        PortfolioApi portfolioApi = this.this$0.portfolioApi;
        this.label = 1;
        Object positionSortOptions = portfolioApi.getPositionSortOptions(str, assetType, this);
        return positionSortOptions == coroutine_suspended ? coroutine_suspended : positionSortOptions;
    }
}
