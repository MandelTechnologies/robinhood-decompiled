package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionListItemV2Dao;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequestMultipleAccounts;", "results", "", "Lcom/robinhood/android/models/portfolio/PositionsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpointMultipleAccounts$2", m3645f = "PositionsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PositionsV2Store$positionsEndpointMultipleAccounts$2 extends ContinuationImpl7 implements Function3<PositionsV2Store.PositionsRequestMultipleAccounts, List<? extends PositionsV2>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$positionsEndpointMultipleAccounts$2(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$positionsEndpointMultipleAccounts$2> continuation) {
        super(3, continuation);
        this.this$0 = positionsV2Store;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, List<PositionsV2> list, Continuation<? super Unit> continuation) {
        PositionsV2Store$positionsEndpointMultipleAccounts$2 positionsV2Store$positionsEndpointMultipleAccounts$2 = new PositionsV2Store$positionsEndpointMultipleAccounts$2(this.this$0, continuation);
        positionsV2Store$positionsEndpointMultipleAccounts$2.L$0 = positionsRequestMultipleAccounts;
        positionsV2Store$positionsEndpointMultipleAccounts$2.L$1 = list;
        return positionsV2Store$positionsEndpointMultipleAccounts$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, List<? extends PositionsV2> list, Continuation<? super Unit> continuation) {
        return invoke2(positionsRequestMultipleAccounts, (List<PositionsV2>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts = (PositionsV2Store.PositionsRequestMultipleAccounts) this.L$0;
            List list = (List) this.L$1;
            PositionListItemV2Dao positionListItemV2Dao = this.this$0.positionListItemV2Dao;
            List<String> accountNumbers = positionsRequestMultipleAccounts.getAccountNumbers();
            List<PositionInstrumentType> instrumentTypes = positionsRequestMultipleAccounts.getInstrumentTypes();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PositionsV2) it.next()).getResults());
            }
            positionListItemV2Dao.deleteAndInsert(accountNumbers, instrumentTypes, CollectionsKt.flatten(arrayList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
