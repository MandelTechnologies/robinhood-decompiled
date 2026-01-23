package com.robinhood.android.api.accountactivityexporter;

import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: AccountActivityExporterApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/api/accountactivityexporter/AccountActivityExporterApi;", "", "getAccountActivityExporter", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporter;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitAccountActivityReportRequest", "Lretrofit2/Response;", "request", "Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;", "(Lcom/robinhood/models/accountactivityexporter/api/ApiAccountActivityExporterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AccountActivityExporterApi {
    @GET("edocs_orchestrator/custom_account_activity_reports/")
    Object getAccountActivityExporter(Continuation<? super ApiAccountActivityExporter> continuation);

    @POST("edocs_orchestrator/custom_account_activity_reports/")
    Object submitAccountActivityReportRequest(@Body ApiAccountActivityExporterRequest apiAccountActivityExporterRequest, Continuation<? super Response<ApiAccountActivityExporter>> continuation);
}
