package com.robinhood.android.event.detail.duel;

import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: StreamContractListUseCase.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "quotes", "positions", "pendingOrders"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$quotesAndPositionsCombinedFlow$1", m3645f = "StreamContractListUseCase.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCase$invoke$quotesAndPositionsCombinedFlow$1, reason: use source file name */
/* loaded from: classes3.dex */
final class StreamContractListUseCase2 extends ContinuationImpl7 implements Function4<Map<UUID, ? extends EventQuote>, Map<UUID, ? extends UiEventContractPosition>, Map<UUID, ? extends List<? extends UiEventOrder>>, Continuation<? super Tuples3<? extends Map<UUID, ? extends EventQuote>, ? extends Map<UUID, ? extends UiEventContractPosition>, ? extends Map<UUID, ? extends List<? extends UiEventOrder>>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    StreamContractListUseCase2(Continuation<? super StreamContractListUseCase2> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Map<UUID, ? extends UiEventContractPosition> map2, Map<UUID, ? extends List<? extends UiEventOrder>> map3, Continuation<? super Tuples3<? extends Map<UUID, ? extends EventQuote>, ? extends Map<UUID, ? extends UiEventContractPosition>, ? extends Map<UUID, ? extends List<? extends UiEventOrder>>>> continuation) {
        return invoke2((Map<UUID, EventQuote>) map, (Map<UUID, UiEventContractPosition>) map2, (Map<UUID, ? extends List<UiEventOrder>>) map3, (Continuation<? super Tuples3<? extends Map<UUID, EventQuote>, ? extends Map<UUID, UiEventContractPosition>, ? extends Map<UUID, ? extends List<UiEventOrder>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, EventQuote> map, Map<UUID, UiEventContractPosition> map2, Map<UUID, ? extends List<UiEventOrder>> map3, Continuation<? super Tuples3<? extends Map<UUID, EventQuote>, ? extends Map<UUID, UiEventContractPosition>, ? extends Map<UUID, ? extends List<UiEventOrder>>>> continuation) {
        StreamContractListUseCase2 streamContractListUseCase2 = new StreamContractListUseCase2(continuation);
        streamContractListUseCase2.L$0 = map;
        streamContractListUseCase2.L$1 = map2;
        streamContractListUseCase2.L$2 = map3;
        return streamContractListUseCase2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Tuples3((Map) this.L$0, (Map) this.L$1, (Map) this.L$2);
    }
}
