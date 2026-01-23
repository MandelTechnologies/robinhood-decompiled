package com.robinhood.iac.alertsheet;

import com.robinhood.models.api.ApiIacAlertSheetRequest;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import retrofit2.Response;

/* compiled from: IacAlertSheetStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/models/api/ApiIacAlertSheetRequest;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.IacAlertSheetStore$endpoint$2", m3645f = "IacAlertSheetStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.iac.alertsheet.IacAlertSheetStore$endpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class IacAlertSheetStore3 extends ContinuationImpl7 implements Function3<ApiIacAlertSheetRequest, Response<ApiIacAlertSheetResponse>, Continuation<? super Unit>, Object> {
    int label;

    IacAlertSheetStore3(Continuation<? super IacAlertSheetStore3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ApiIacAlertSheetRequest apiIacAlertSheetRequest, Response<ApiIacAlertSheetResponse> response, Continuation<? super Unit> continuation) {
        return new IacAlertSheetStore3(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
