package com.robinhood.librobinhood.data.store.bonfire.daytrades.store;

import com.robinhood.librobinhood.data.store.bonfire.daytrades.api.DayTradeApi;
import com.robinhood.models.api.ApiSessionAlert;
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

/* compiled from: DayTradeWarningsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiSessionAlert;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore$optionsWarningEndpoint$1", m3645f = "DayTradeWarningsStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore$optionsWarningEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DayTradeWarningsStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends String>, Continuation<? super ApiSessionAlert>, Object> {
    final /* synthetic */ DayTradeApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DayTradeWarningsStore4(DayTradeApi dayTradeApi, Continuation<? super DayTradeWarningsStore4> continuation) {
        super(2, continuation);
        this.$bonfireApi = dayTradeApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DayTradeWarningsStore4 dayTradeWarningsStore4 = new DayTradeWarningsStore4(this.$bonfireApi, continuation);
        dayTradeWarningsStore4.L$0 = obj;
        return dayTradeWarningsStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, Continuation<? super ApiSessionAlert> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, Continuation<? super ApiSessionAlert> continuation) {
        return ((DayTradeWarningsStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) tuples2.component1();
        String str = (String) tuples2.component2();
        DayTradeApi dayTradeApi = this.$bonfireApi;
        this.label = 1;
        Object postTradeOptionsWarning = dayTradeApi.getPostTradeOptionsWarning(str, uuid, this);
        return postTradeOptionsWarning == coroutine_suspended ? coroutine_suspended : postTradeOptionsWarning;
    }
}
