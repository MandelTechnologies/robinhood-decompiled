package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionInstrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Ljava/util/UUID;", "apiOptionInstrument", "Lcom/robinhood/models/api/ApiOptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstrument$2", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionInstrumentStore$getOptionInstrument$2 extends ContinuationImpl7 implements Function3<UUID, ApiOptionInstrument, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionInstrumentStore$getOptionInstrument$2(OptionInstrumentStore optionInstrumentStore, Continuation<? super OptionInstrumentStore$getOptionInstrument$2> continuation) {
        super(3, continuation);
        this.this$0 = optionInstrumentStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, ApiOptionInstrument apiOptionInstrument, Continuation<? super Unit> continuation) {
        OptionInstrumentStore$getOptionInstrument$2 optionInstrumentStore$getOptionInstrument$2 = new OptionInstrumentStore$getOptionInstrument$2(this.this$0, continuation);
        optionInstrumentStore$getOptionInstrument$2.L$0 = apiOptionInstrument;
        return optionInstrumentStore$getOptionInstrument$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getStaleDecider().update(this.this$0.dao.insert((ApiOptionInstrument) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
