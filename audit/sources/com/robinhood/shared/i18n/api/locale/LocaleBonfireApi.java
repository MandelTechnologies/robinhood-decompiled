package com.robinhood.shared.i18n.api.locale;

import com.robinhood.shared.i18n.models.locale.api.ApiRemoteSupportedLocale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: LocaleBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/i18n/api/locale/LocaleBonfireApi;", "", "getSupportedLocale", "Lcom/robinhood/shared/i18n/models/locale/api/ApiRemoteSupportedLocale;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface LocaleBonfireApi {
    @GET("supported_locale/")
    Object getSupportedLocale(Continuation<? super ApiRemoteSupportedLocale> continuation);
}
