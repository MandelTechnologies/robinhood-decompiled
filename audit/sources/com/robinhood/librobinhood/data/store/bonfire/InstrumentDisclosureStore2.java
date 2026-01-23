package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiInstrumentDisclosure;
import com.robinhood.models.p320db.bonfire.InstrumentDisclosure;
import com.robinhood.models.p320db.bonfire.InstrumentDisclosure2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentDisclosureStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/InstrumentDisclosure;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.InstrumentDisclosureStore$endpoint$1", m3645f = "InstrumentDisclosureStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.InstrumentDisclosureStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentDisclosureStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends String>, Continuation<? super InstrumentDisclosure>, Object> {
    final /* synthetic */ BonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentDisclosureStore2(BonfireApi bonfireApi, Continuation<? super InstrumentDisclosureStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = bonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentDisclosureStore2 instrumentDisclosureStore2 = new InstrumentDisclosureStore2(this.$bonfireApi, continuation);
        instrumentDisclosureStore2.L$0 = obj;
        return instrumentDisclosureStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, Continuation<? super InstrumentDisclosure> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, Continuation<? super InstrumentDisclosure> continuation) {
        return ((InstrumentDisclosureStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            String str2 = (String) tuples2.component2();
            BonfireApi bonfireApi = this.$bonfireApi;
            this.L$0 = str2;
            this.label = 1;
            Object instrumentDisclosure = bonfireApi.getInstrumentDisclosure(uuid, str2, this);
            if (instrumentDisclosure == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = instrumentDisclosure;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str3;
        }
        return InstrumentDisclosure.copy$default(InstrumentDisclosure2.toDbModel((ApiInstrumentDisclosure) obj), null, str, null, null, 13, null);
    }
}
