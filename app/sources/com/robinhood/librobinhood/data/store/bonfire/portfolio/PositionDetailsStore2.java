package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.api.ApiPositionDetails;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/portfolio/api/ApiPositionDetails;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore$DetailsRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$batchedPositionDetailsEndpoint$1", m3645f = "PositionDetailsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$batchedPositionDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionDetailsStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends PositionDetailsStore.DetailsRequest>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiPositionDetails>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionDetailsStore2(PositionDetailsStore positionDetailsStore, Continuation<? super PositionDetailsStore2> continuation) {
        super(2, continuation);
        this.this$0 = positionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionDetailsStore2 positionDetailsStore2 = new PositionDetailsStore2(this.this$0, continuation);
        positionDetailsStore2.L$0 = obj;
        return positionDetailsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends PositionDetailsStore.DetailsRequest>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiPositionDetails>> continuation) {
        return invoke2((Tuples2<? extends Iterable<PositionDetailsStore.DetailsRequest>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiPositionDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<PositionDetailsStore.DetailsRequest>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiPositionDetails>> continuation) {
        return ((PositionDetailsStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Iterable iterable = (Iterable) ((Tuples2) this.L$0).component1();
        PositionDetailsStore.DetailsRequest detailsRequest = (PositionDetailsStore.DetailsRequest) CollectionsKt.first(iterable);
        PortfolioApi portfolioApi = this.this$0.portfolioApi;
        String accountNumber = detailsRequest.getAccountNumber();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionDetailsStore.DetailsRequest) it.next()).getInstrumentId());
        }
        CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(arrayList);
        String displayType = detailsRequest.getDisplayType();
        PositionInstrumentType instrumentType = detailsRequest.getInstrumentType();
        DisplayCurrency displayCurrency = detailsRequest.getDisplayCurrency();
        this.label = 1;
        Object batchedPositionDetails = portfolioApi.getBatchedPositionDetails(accountNumber, commaSeparatedList, displayType, instrumentType, displayCurrency, this);
        return batchedPositionDetails == coroutine_suspended ? coroutine_suspended : batchedPositionDetails;
    }
}
