package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentAccountSwitcherV2;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher2;
import com.squareup.moshi.JsonAdapter;
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

/* compiled from: InstrumentAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$accountSwitcherEndpoint$1", m3645f = "InstrumentAccountSwitcherStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$accountSwitcherEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentAccountSwitcherStore3 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends List<? extends BrokerageAccountType>>, Continuation<? super InstrumentAccountSwitcher>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentAccountSwitcherStore3(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, Continuation<? super InstrumentAccountSwitcherStore3> continuation) {
        super(2, continuation);
        this.this$0 = instrumentAccountSwitcherStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentAccountSwitcherStore3 instrumentAccountSwitcherStore3 = new InstrumentAccountSwitcherStore3(this.this$0, continuation);
        instrumentAccountSwitcherStore3.L$0 = obj;
        return instrumentAccountSwitcherStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends List<? extends BrokerageAccountType>> tuples2, Continuation<? super InstrumentAccountSwitcher> continuation) {
        return invoke2((Tuples2<UUID, ? extends List<? extends BrokerageAccountType>>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ? extends List<? extends BrokerageAccountType>> tuples2, Continuation<? super InstrumentAccountSwitcher> continuation) {
        return ((InstrumentAccountSwitcherStore3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            List list = (List) tuples2.component2();
            TradeEquityBonfireApi tradeEquityBonfireApi = this.this$0.tradeEquityApi;
            JsonAdapter jsonAdapter = this.this$0.setStringAdapter;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BrokerageAccountType) it.next()).getServerValue());
            }
            String json = jsonAdapter.toJson(CollectionsKt.toSet(arrayList));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            this.label = 1;
            obj = tradeEquityBonfireApi.getAccountSwitcherV2(uuid, json, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstrumentAccountSwitcher2.toDbModel((ApiInstrumentAccountSwitcherV2) obj);
    }
}
