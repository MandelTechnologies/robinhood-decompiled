package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiInstrumentBuyingPower;
import com.robinhood.models.dao.InstrumentBuyingPowerDao;
import com.robinhood.models.p320db.InstrumentBuyingPower3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "apiInstrumentBuyingPower", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpoint$2", m3645f = "InstrumentBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$selectedAccountInstrumentEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentBuyingPowerStore5 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends String>, ApiInstrumentBuyingPower, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentBuyingPowerStore5(InstrumentBuyingPowerStore instrumentBuyingPowerStore, Continuation<? super InstrumentBuyingPowerStore5> continuation) {
        super(3, continuation);
        this.this$0 = instrumentBuyingPowerStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, ApiInstrumentBuyingPower apiInstrumentBuyingPower, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, apiInstrumentBuyingPower, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, ApiInstrumentBuyingPower apiInstrumentBuyingPower, Continuation<? super Unit> continuation) {
        InstrumentBuyingPowerStore5 instrumentBuyingPowerStore5 = new InstrumentBuyingPowerStore5(this.this$0, continuation);
        instrumentBuyingPowerStore5.L$0 = apiInstrumentBuyingPower;
        return instrumentBuyingPowerStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((InstrumentBuyingPowerDao) InstrumentBuyingPower3.toDbModel((ApiInstrumentBuyingPower) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
