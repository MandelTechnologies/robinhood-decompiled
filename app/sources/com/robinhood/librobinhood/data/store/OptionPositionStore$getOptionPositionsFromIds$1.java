package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionPosition;
import com.robinhood.models.api.ApiOptionPositionsFromIdsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionPosition;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiOptionPositionsFromIdsRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionsFromIds$1", m3645f = "OptionPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class OptionPositionStore$getOptionPositionsFromIds$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOptionPositionsFromIdsRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionPosition>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionPositionStore$getOptionPositionsFromIds$1(OptionPositionStore optionPositionStore, Continuation<? super OptionPositionStore$getOptionPositionsFromIds$1> continuation) {
        super(2, continuation);
        this.this$0 = optionPositionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionPositionStore$getOptionPositionsFromIds$1 optionPositionStore$getOptionPositionsFromIds$1 = new OptionPositionStore$getOptionPositionsFromIds$1(this.this$0, continuation);
        optionPositionStore$getOptionPositionsFromIds$1.L$0 = obj;
        return optionPositionStore$getOptionPositionsFromIds$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionPositionsFromIdsRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionPosition>> continuation) {
        return invoke2((Tuples2<ApiOptionPositionsFromIdsRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionPosition>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiOptionPositionsFromIdsRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionPosition>> continuation) {
        return ((OptionPositionStore$getOptionPositionsFromIds$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionPositionsFromIdsRequest apiOptionPositionsFromIdsRequest = (ApiOptionPositionsFromIdsRequest) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        OptionsApi optionsApi = this.this$0.optionsApi;
        List<UUID> optionPositionIds = apiOptionPositionsFromIdsRequest.getOptionPositionIds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionPositionIds, 10));
        Iterator<T> it = optionPositionIds.iterator();
        while (it.hasNext()) {
            String string2 = ((UUID) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(string2);
        }
        CommaSeparatedList<String> commaSeparatedList = new CommaSeparatedList<>(arrayList);
        boolean nonzero = apiOptionPositionsFromIdsRequest.getNonzero();
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object optionPositions = optionsApi.getOptionPositions(commaSeparatedList, nonzero, value, this);
        return optionPositions == coroutine_suspended ? coroutine_suspended : optionPositions;
    }
}
