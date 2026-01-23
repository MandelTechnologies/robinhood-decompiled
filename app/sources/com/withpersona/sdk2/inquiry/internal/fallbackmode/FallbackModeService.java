package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.robinhood.android.car.result.CarResultComposable2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* compiled from: FallbackModeService.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "request", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "checkStatus", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "createSession", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authHeader", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;", "productionEndpoint", "", "requestCount", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "acquireUploadUrl", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Lokhttp3/RequestBody;", CarResultComposable2.BODY, "upload", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UploadUrlResponse", "UploadUrlRequest", "StatusRequest", "StatusResponse", "StaticTemplate", "SessionIdRequest", "SessionIdResponse", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface FallbackModeService {
    @Headers({"Content-Type: application/json"})
    @POST("/part")
    Object acquireUploadUrl(@Header("Authorization") String str, @Header("Persona-Fallback-Production-Endpoint") FallbackModeService2 fallbackModeService2, @Header("Persona-Fallback-Request-Count") int i, @Body UploadUrlRequest uploadUrlRequest, Continuation<? super Response<UploadUrlResponse>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/template")
    Object checkStatus(@Header("Authorization") String str, @Body StatusRequest statusRequest, Continuation<? super Response<StatusResponse>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/session")
    Object createSession(@Body SessionIdRequest sessionIdRequest, Continuation<? super Response<SessionIdResponse>> continuation);

    @POST
    Object upload(@Url String str, @Body RequestBody requestBody, Continuation<? super Response<Object>> continuation);

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "", "", "location", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocation", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class UploadUrlResponse {
        private final String location;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadUrlResponse) && Intrinsics.areEqual(this.location, ((UploadUrlResponse) other).location);
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        public String toString() {
            return "UploadUrlResponse(location=" + this.location + ")";
        }

        public UploadUrlResponse(String location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
        }

        public final String getLocation() {
            return this.location;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "", "", "expectedContentLength", "", "expectedContentType", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getExpectedContentLength", "()J", "Ljava/lang/String;", "getExpectedContentType", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class UploadUrlRequest {
        private final long expectedContentLength;
        private final String expectedContentType;

        public final UploadUrlRequest copy(@Json(name = "expected-content-length") long expectedContentLength, @Json(name = "expected-content-type") String expectedContentType) {
            Intrinsics.checkNotNullParameter(expectedContentType, "expectedContentType");
            return new UploadUrlRequest(expectedContentLength, expectedContentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadUrlRequest)) {
                return false;
            }
            UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) other;
            return this.expectedContentLength == uploadUrlRequest.expectedContentLength && Intrinsics.areEqual(this.expectedContentType, uploadUrlRequest.expectedContentType);
        }

        public int hashCode() {
            return (Long.hashCode(this.expectedContentLength) * 31) + this.expectedContentType.hashCode();
        }

        public String toString() {
            return "UploadUrlRequest(expectedContentLength=" + this.expectedContentLength + ", expectedContentType=" + this.expectedContentType + ")";
        }

        public UploadUrlRequest(@Json(name = "expected-content-length") long j, @Json(name = "expected-content-type") String expectedContentType) {
            Intrinsics.checkNotNullParameter(expectedContentType, "expectedContentType");
            this.expectedContentLength = j;
            this.expectedContentType = expectedContentType;
        }

        public final long getExpectedContentLength() {
            return this.expectedContentLength;
        }

        public final String getExpectedContentType() {
            return this.expectedContentType;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "", "", "inquiryTemplateId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryTemplateId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StatusRequest {
        private final String inquiryTemplateId;

        public final StatusRequest copy(@Json(name = "inquiry-template-id") String inquiryTemplateId) {
            return new StatusRequest(inquiryTemplateId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusRequest) && Intrinsics.areEqual(this.inquiryTemplateId, ((StatusRequest) other).inquiryTemplateId);
        }

        public int hashCode() {
            String str = this.inquiryTemplateId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "StatusRequest(inquiryTemplateId=" + this.inquiryTemplateId + ")";
        }

        public StatusRequest(@Json(name = "inquiry-template-id") String str) {
            this.inquiryTemplateId = str;
        }

        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "staticInquiryTemplate", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "copy", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StatusResponse {
        private final StaticTemplate staticInquiryTemplate;

        public final StatusResponse copy(@Json(name = "static-inquiry-template") StaticTemplate staticInquiryTemplate) {
            return new StatusResponse(staticInquiryTemplate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusResponse) && Intrinsics.areEqual(this.staticInquiryTemplate, ((StatusResponse) other).staticInquiryTemplate);
        }

        public int hashCode() {
            StaticTemplate staticTemplate = this.staticInquiryTemplate;
            if (staticTemplate == null) {
                return 0;
            }
            return staticTemplate.hashCode();
        }

        public String toString() {
            return "StatusResponse(staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }

        public StatusResponse(@Json(name = "static-inquiry-template") StaticTemplate staticTemplate) {
            this.staticInquiryTemplate = staticTemplate;
        }

        public final StaticTemplate getStaticInquiryTemplate() {
            return this.staticInquiryTemplate;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StaticTemplate {
        private final List<NextStep> steps;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StaticTemplate) && Intrinsics.areEqual(this.steps, ((StaticTemplate) other).steps);
        }

        public int hashCode() {
            return this.steps.hashCode();
        }

        public String toString() {
            return "StaticTemplate(steps=" + this.steps + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StaticTemplate(List<? extends NextStep> steps) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.steps = steps;
        }

        public final List<NextStep> getSteps() {
            return this.steps;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJz\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "", "", "inquiryTemplateId", "inquiryTemplateVersion", "inquiryId", "referenceId", "accountId", "environment", "environmentId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryTemplateId", "getInquiryTemplateVersion", "getInquiryId", "getReferenceId", "getAccountId", "getEnvironment", "getEnvironmentId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "getFields", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "getThemeSetId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class SessionIdRequest {
        private final String accountId;
        private final String environment;
        private final String environmentId;
        private final InquiryFieldMap fields;
        private final String inquiryId;
        private final String inquiryTemplateId;
        private final String inquiryTemplateVersion;
        private final String referenceId;
        private final String themeSetId;

        public final SessionIdRequest copy(@Json(name = "inquiry-template-id") String inquiryTemplateId, @Json(name = "inquiry-template-version-id") String inquiryTemplateVersion, @Json(name = "inquiry-id") String inquiryId, @Json(name = "reference-id") String referenceId, @Json(name = "account-id") String accountId, String environment, @Json(name = "environment-id") String environmentId, InquiryFieldMap fields, @Json(name = "theme-set-id") String themeSetId) {
            Intrinsics.checkNotNullParameter(inquiryTemplateId, "inquiryTemplateId");
            return new SessionIdRequest(inquiryTemplateId, inquiryTemplateVersion, inquiryId, referenceId, accountId, environment, environmentId, fields, themeSetId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionIdRequest)) {
                return false;
            }
            SessionIdRequest sessionIdRequest = (SessionIdRequest) other;
            return Intrinsics.areEqual(this.inquiryTemplateId, sessionIdRequest.inquiryTemplateId) && Intrinsics.areEqual(this.inquiryTemplateVersion, sessionIdRequest.inquiryTemplateVersion) && Intrinsics.areEqual(this.inquiryId, sessionIdRequest.inquiryId) && Intrinsics.areEqual(this.referenceId, sessionIdRequest.referenceId) && Intrinsics.areEqual(this.accountId, sessionIdRequest.accountId) && Intrinsics.areEqual(this.environment, sessionIdRequest.environment) && Intrinsics.areEqual(this.environmentId, sessionIdRequest.environmentId) && Intrinsics.areEqual(this.fields, sessionIdRequest.fields) && Intrinsics.areEqual(this.themeSetId, sessionIdRequest.themeSetId);
        }

        public int hashCode() {
            int iHashCode = this.inquiryTemplateId.hashCode() * 31;
            String str = this.inquiryTemplateVersion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inquiryId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.referenceId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environment;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.environmentId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            InquiryFieldMap inquiryFieldMap = this.fields;
            int iHashCode8 = (iHashCode7 + (inquiryFieldMap == null ? 0 : inquiryFieldMap.hashCode())) * 31;
            String str7 = this.themeSetId;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SessionIdRequest(inquiryTemplateId=" + this.inquiryTemplateId + ", inquiryTemplateVersion=" + this.inquiryTemplateVersion + ", inquiryId=" + this.inquiryId + ", referenceId=" + this.referenceId + ", accountId=" + this.accountId + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ")";
        }

        public SessionIdRequest(@Json(name = "inquiry-template-id") String inquiryTemplateId, @Json(name = "inquiry-template-version-id") String str, @Json(name = "inquiry-id") String str2, @Json(name = "reference-id") String str3, @Json(name = "account-id") String str4, String str5, @Json(name = "environment-id") String str6, InquiryFieldMap inquiryFieldMap, @Json(name = "theme-set-id") String str7) {
            Intrinsics.checkNotNullParameter(inquiryTemplateId, "inquiryTemplateId");
            this.inquiryTemplateId = inquiryTemplateId;
            this.inquiryTemplateVersion = str;
            this.inquiryId = str2;
            this.referenceId = str3;
            this.accountId = str4;
            this.environment = str5;
            this.environmentId = str6;
            this.fields = inquiryFieldMap;
            this.themeSetId = str7;
        }

        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }

        public final String getInquiryTemplateVersion() {
            return this.inquiryTemplateVersion;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public final InquiryFieldMap getFields() {
            return this.fields;
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }
    }

    /* compiled from: FallbackModeService.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class SessionIdResponse {
        private final String token;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionIdResponse) && Intrinsics.areEqual(this.token, ((SessionIdResponse) other).token);
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return "SessionIdResponse(token=" + this.token + ")";
        }

        public SessionIdResponse(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
        }

        public final String getToken() {
            return this.token;
        }
    }
}
