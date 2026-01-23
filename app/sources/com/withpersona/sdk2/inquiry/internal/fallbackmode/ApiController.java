package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.robinhood.android.car.result.CarResultComposable2;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;", "", "createSession", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "createSession-gIAlu-s", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionWithRequestBody", "Lretrofit2/Response;", "sessionToken", "", CarResultComposable2.BODY, "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface ApiController {
    /* renamed from: createSession-gIAlu-s, reason: not valid java name */
    Object mo27391createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation<? super Result<StaticTemplateSession>> continuation);

    Object transitionBack(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation);

    Object transitionWithRequestBody(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation);
}
