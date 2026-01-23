package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipEnabledRequest;
import com.robinhood.models.api.ApiSlipEnabledResponse;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipEnabledResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipStatusStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/SlipEnabledResponse;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiSlipEnabledRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore$putEndpoint$1", m3645f = "SlipStatusStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore$putEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipStatusStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends ApiSlipEnabledRequest>, Continuation<? super SlipEnabledResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipStatusStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipStatusStore4(SlipStatusStore slipStatusStore, Continuation<? super SlipStatusStore4> continuation) {
        super(2, continuation);
        this.this$0 = slipStatusStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipStatusStore4 slipStatusStore4 = new SlipStatusStore4(this.this$0, continuation);
        slipStatusStore4.L$0 = obj;
        return slipStatusStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends ApiSlipEnabledRequest> tuples2, Continuation<? super SlipEnabledResponse> continuation) {
        return invoke2((Tuples2<String, ApiSlipEnabledRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ApiSlipEnabledRequest> tuples2, Continuation<? super SlipEnabledResponse> continuation) {
        return ((SlipStatusStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str = (String) tuples2.component1();
            ApiSlipEnabledRequest apiSlipEnabledRequest = (ApiSlipEnabledRequest) tuples2.component2();
            SlipApi slipApi = this.this$0.slipApi;
            this.label = 1;
            obj = slipApi.updateSlipEnabledStatus(str, apiSlipEnabledRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return SlipEnabledResponse2.toDbModel((ApiSlipEnabledResponse) obj);
    }
}
