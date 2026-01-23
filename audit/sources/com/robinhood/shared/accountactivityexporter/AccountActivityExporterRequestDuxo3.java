package com.robinhood.shared.accountactivityexporter;

import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: AccountActivityExporterRequestDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$submitRequest$2$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$submitRequest$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AccountActivityExporterRequestDuxo3 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
    final /* synthetic */ Response<ApiAccountActivityExporter> $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountActivityExporterRequestDuxo3(Response<ApiAccountActivityExporter> response, Continuation<? super AccountActivityExporterRequestDuxo3> continuation) {
        super(2, continuation);
        this.$response = response;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountActivityExporterRequestDuxo3 accountActivityExporterRequestDuxo3 = new AccountActivityExporterRequestDuxo3(this.$response, continuation);
        accountActivityExporterRequestDuxo3.L$0 = obj;
        return accountActivityExporterRequestDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
        return ((AccountActivityExporterRequestDuxo3) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AccountActivityExporterRequestDataState.copy$default((AccountActivityExporterRequestDataState) this.L$0, null, null, null, null, false, this.$response, 31, null);
    }
}
