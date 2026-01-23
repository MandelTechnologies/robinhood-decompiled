package com.robinhood.librobinhood.data.store;

import com.robinhood.api.utils.DefaultStaleDecider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "lastUpdatedAt", "", "optionInstrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstrument$3", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class OptionInstrumentStore$getOptionInstrument$3 extends ContinuationImpl7 implements Function3<Long, UUID, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionInstrumentStore$getOptionInstrument$3(OptionInstrumentStore optionInstrumentStore, Continuation<? super OptionInstrumentStore$getOptionInstrument$3> continuation) {
        super(3, continuation);
        this.this$0 = optionInstrumentStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Long l, UUID uuid, Continuation<? super Boolean> continuation) {
        OptionInstrumentStore$getOptionInstrument$3 optionInstrumentStore$getOptionInstrument$3 = new OptionInstrumentStore$getOptionInstrument$3(this.this$0, continuation);
        optionInstrumentStore$getOptionInstrument$3.L$0 = l;
        optionInstrumentStore$getOptionInstrument$3.L$1 = uuid;
        return optionInstrumentStore$getOptionInstrument$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Long l = (Long) this.L$0;
        UUID uuid = (UUID) this.L$1;
        DefaultStaleDecider staleDecider = this.this$0.getStaleDecider();
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return staleDecider.invoke(string2, l != null ? Instant.ofEpochMilli(l.longValue()) : null);
    }
}
