package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipHub;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.p320db.SlipHub3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/SlipHub;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore$endpoint$1", m3645f = "SlipHubStore.kt", m3646l = {22}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipHubStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super SlipHub>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipHubStore2(SlipApi slipApi, Continuation<? super SlipHubStore2> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipHubStore2(this.$slipApi, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super SlipHub> continuation) {
        return ((SlipHubStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipApi slipApi = this.$slipApi;
            this.label = 1;
            obj = slipApi.getSlipHub(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return SlipHub3.toDbModel((ApiSlipHub) obj);
    }
}
