package com.withpersona.sdk2.inquiry.internal.network;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: InquiryApiHelper.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", m3645f = "InquiryApiHelper.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1, reason: use source file name */
/* loaded from: classes18.dex */
final class InquiryApiHelper6 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ResponseBody>>, Object> {
    final /* synthetic */ String $sessionToken;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ InquiryApiHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InquiryApiHelper6(InquiryApiHelper inquiryApiHelper, String str, String str2, Continuation<? super InquiryApiHelper6> continuation) {
        super(1, continuation);
        this.this$0 = inquiryApiHelper;
        this.$sessionToken = str;
        this.$token = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InquiryApiHelper6(this.this$0, this.$sessionToken, this.$token, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ResponseBody>> continuation) {
        return ((InquiryApiHelper6) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        InquiryService inquiryService = this.this$0.service;
        String str = this.$sessionToken;
        VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(this.this$0.applicationContext.getPackageName(), this.$token));
        this.label = 1;
        Object objVerifyDeviceIntegrity = inquiryService.verifyDeviceIntegrity(str, verifyDeviceIntegrityRequest, this);
        return objVerifyDeviceIntegrity == coroutine_suspended ? coroutine_suspended : objVerifyDeviceIntegrity;
    }
}
