package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionsSortOptions2;
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
import kotlin.jvm.functions.Function3;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "inputPair", "Lkotlin/Pair;", "", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "apiSortOptions", "Lcom/robinhood/android/models/portfolio/api/ApiPositionSortOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$sortOptionsEndpoint$2", m3645f = "PositionsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$sortOptionsEndpoint$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends AssetType>, ApiPositionSortOptions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$sortOptionsEndpoint$2(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$sortOptionsEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends AssetType> tuples2, ApiPositionSortOptions apiPositionSortOptions, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, ? extends AssetType>) tuples2, apiPositionSortOptions, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ? extends AssetType> tuples2, ApiPositionSortOptions apiPositionSortOptions, Continuation<? super Unit> continuation) {
        PositionsV2Store$sortOptionsEndpoint$2 positionsV2Store$sortOptionsEndpoint$2 = new PositionsV2Store$sortOptionsEndpoint$2(this.this$0, continuation);
        positionsV2Store$sortOptionsEndpoint$2.L$0 = tuples2;
        positionsV2Store$sortOptionsEndpoint$2.L$1 = apiPositionSortOptions;
        return positionsV2Store$sortOptionsEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        this.this$0.sortOptionsDao.insert(PositionsSortOptions2.toDbModel((ApiPositionSortOptions) this.L$1, (String) tuples2.component1(), (AssetType) tuples2.component2()));
        return Unit.INSTANCE;
    }
}
