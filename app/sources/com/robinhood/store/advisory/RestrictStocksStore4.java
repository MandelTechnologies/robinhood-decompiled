package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.RestrictedAssetDto;
import advisory.proto.p008v1.SearchRestrictableStocksRequestDto;
import advisory.proto.p008v1.SearchRestrictableStocksResponseDto;
import com.robinhood.models.advisory.p304db.portfolio.RestrictStocks;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RestrictStocksStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedAsset;", "request", "Ladvisory/proto/v1/SearchRestrictableStocksRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.RestrictStocksStore$searchRestrictableStocksEndpoint$1", m3645f = "RestrictStocksStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.advisory.RestrictStocksStore$searchRestrictableStocksEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RestrictStocksStore4 extends ContinuationImpl7 implements Function2<SearchRestrictableStocksRequestDto, Continuation<? super List<? extends RestrictedAsset>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestrictStocksStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestrictStocksStore4(RestrictStocksStore restrictStocksStore, Continuation<? super RestrictStocksStore4> continuation) {
        super(2, continuation);
        this.this$0 = restrictStocksStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestrictStocksStore4 restrictStocksStore4 = new RestrictStocksStore4(this.this$0, continuation);
        restrictStocksStore4.L$0 = obj;
        return restrictStocksStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SearchRestrictableStocksRequestDto searchRestrictableStocksRequestDto, Continuation<? super List<RestrictedAsset>> continuation) {
        return ((RestrictStocksStore4) create(searchRestrictableStocksRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SearchRestrictableStocksRequestDto searchRestrictableStocksRequestDto, Continuation<? super List<? extends RestrictedAsset>> continuation) {
        return invoke2(searchRestrictableStocksRequestDto, (Continuation<? super List<RestrictedAsset>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SearchRestrictableStocksRequestDto searchRestrictableStocksRequestDto = (SearchRestrictableStocksRequestDto) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            this.label = 1;
            obj = advisoryService.SearchRestrictableStocks(searchRestrictableStocksRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<RestrictedAssetDto> search_results = ((SearchRestrictableStocksResponseDto) obj).getSearch_results();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(search_results, 10));
        Iterator<T> it = search_results.iterator();
        while (it.hasNext()) {
            arrayList.add(RestrictStocks.toDbModel((RestrictedAssetDto) it.next()));
        }
        return arrayList;
    }
}
