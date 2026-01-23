package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/plaid/internal/F6;", "", "", "apiKey", "xSentryToken", "Lcom/plaid/internal/core/crashreporting/internal/models/Crash;", "crash", "Lcom/plaid/internal/b4;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/Crash;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crash-reporting_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.plaid.internal.F6 */
/* loaded from: classes16.dex */
public interface InterfaceC5844F6 {
    @POST("store/")
    /* renamed from: a */
    Object m1194a(@Header("X-Sentry-Auth") String str, @Header("X-Sentry-Token") String str2, @Body Crash crash, Continuation<? super AbstractC6043b4<? extends Object, ? extends Object>> continuation);
}
