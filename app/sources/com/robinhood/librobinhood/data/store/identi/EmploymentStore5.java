package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EmploymentStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.EmploymentStore$employmentUpdateEndpoint$1", m3645f = "EmploymentStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.EmploymentStore$employmentUpdateEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EmploymentStore5 extends ContinuationImpl7 implements Function2<ApiEmploymentInfo, Continuation<? super ApiEmploymentInfo>, Object> {
    final /* synthetic */ Identi $identi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmploymentStore5(Identi identi2, Continuation<? super EmploymentStore5> continuation) {
        super(2, continuation);
        this.$identi = identi2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EmploymentStore5 employmentStore5 = new EmploymentStore5(this.$identi, continuation);
        employmentStore5.L$0 = obj;
        return employmentStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEmploymentInfo apiEmploymentInfo, Continuation<? super ApiEmploymentInfo> continuation) {
        return ((EmploymentStore5) create(apiEmploymentInfo, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiEmploymentInfo apiEmploymentInfo = (ApiEmploymentInfo) this.L$0;
        Identi identi2 = this.$identi;
        this.label = 1;
        Object objUpdateEmploymentInfo = identi2.updateEmploymentInfo(apiEmploymentInfo, this);
        return objUpdateEmploymentInfo == coroutine_suspended ? coroutine_suspended : objUpdateEmploymentInfo;
    }
}
