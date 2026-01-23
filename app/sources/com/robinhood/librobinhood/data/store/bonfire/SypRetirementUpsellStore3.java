package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.rhy.ApiSypRetirementUpsellDetails;
import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SypRetirementUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/bonfire/rhy/ApiSypRetirementUpsellDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore$endpoint$2", m3645f = "SypRetirementUpsellStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SypRetirementUpsellStore3 extends ContinuationImpl7 implements Function2<ApiSypRetirementUpsellDetails, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SypRetirementUpsellStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SypRetirementUpsellStore3(SypRetirementUpsellStore sypRetirementUpsellStore, Continuation<? super SypRetirementUpsellStore3> continuation) {
        super(2, continuation);
        this.this$0 = sypRetirementUpsellStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SypRetirementUpsellStore3 sypRetirementUpsellStore3 = new SypRetirementUpsellStore3(this.this$0, continuation);
        sypRetirementUpsellStore3.L$0 = obj;
        return sypRetirementUpsellStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSypRetirementUpsellDetails apiSypRetirementUpsellDetails, Continuation<? super Unit> continuation) {
        return ((SypRetirementUpsellStore3) create(apiSypRetirementUpsellDetails, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(SypRetirementUpsellDetails2.toDbModel((ApiSypRetirementUpsellDetails) this.L$0));
        return Unit.INSTANCE;
    }
}
