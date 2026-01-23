package com.robinhood.android.taxcenter.api;

import com.robinhood.android.models.taxcenter.api.ApiPreviousTaxForms;
import com.robinhood.android.models.taxcenter.api.ApiTaxCenterResponse;
import com.robinhood.android.models.taxcenter.api.ApiTaxDocument;
import com.robinhood.android.models.taxcenter.api.ApiTaxTimelineInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: TaxCenterApi.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/api/TaxCenterApi;", "", "getTaxCenterResponse", "Lcom/robinhood/android/models/taxcenter/api/ApiTaxCenterResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxTimelineInfo", "Lcom/robinhood/android/models/taxcenter/api/ApiTaxTimelineInfo;", "getPreviousTaxForms", "Lcom/robinhood/android/models/taxcenter/api/ApiPreviousTaxForms;", "getTaxDocument", "Lcom/robinhood/android/models/taxcenter/api/ApiTaxDocument;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TaxCenterApi {
    @GET("tax_center/previous_forms")
    Object getPreviousTaxForms(Continuation<? super ApiPreviousTaxForms> continuation);

    @GET("tax_center/")
    Object getTaxCenterResponse(Continuation<? super ApiTaxCenterResponse> continuation);

    @GET("tax_center/tax_document/{id}")
    Object getTaxDocument(@Path("id") String str, Continuation<? super ApiTaxDocument> continuation);

    @GET("tax_center/timeline_info")
    Object getTaxTimelineInfo(Continuation<? super ApiTaxTimelineInfo> continuation);
}
