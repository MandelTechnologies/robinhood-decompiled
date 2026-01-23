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

/* compiled from: AccountActivityExporterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterDuxo$onResume$1$1", m3645f = "AccountActivityExporterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AccountActivityExporterDuxo2 extends ContinuationImpl7 implements Function2<AccountActivityExporterDataState, Continuation<? super AccountActivityExporterDataState>, Object> {
    final /* synthetic */ ApiAccountActivityExporter $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountActivityExporterDuxo2(ApiAccountActivityExporter apiAccountActivityExporter, Continuation<? super AccountActivityExporterDuxo2> continuation) {
        super(2, continuation);
        this.$response = apiAccountActivityExporter;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountActivityExporterDuxo2 accountActivityExporterDuxo2 = new AccountActivityExporterDuxo2(this.$response, continuation);
        accountActivityExporterDuxo2.L$0 = obj;
        return accountActivityExporterDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountActivityExporterDataState accountActivityExporterDataState, Continuation<? super AccountActivityExporterDataState> continuation) {
        return ((AccountActivityExporterDuxo2) create(accountActivityExporterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((AccountActivityExporterDataState) this.L$0).copy(this.$response);
    }
}
