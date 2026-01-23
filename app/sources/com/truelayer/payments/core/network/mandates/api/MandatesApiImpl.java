package com.truelayer.payments.core.network.mandates.api;

import android.util.Log;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.Factory2;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.NetworkError;
import com.truelayer.payments.core.network.common.Request2;
import com.truelayer.payments.core.network.mandates.MandateApiError;
import com.truelayer.payments.core.network.mandates.entity.request.StartAuthorizationFlowRequest;
import com.truelayer.payments.core.network.mandates.entity.request.SubmitConsentRequest;
import com.truelayer.payments.core.network.mandates.entity.request.SubmitProviderSelectionRequest;
import com.truelayer.payments.core.network.mandates.entity.response.MandateAuthorizationFlowResponse;
import com.truelayer.payments.core.network.mandates.entity.response.MandateResponse;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.core.utils.ExtensionsKt;
import com.truelayer.payments.core.utils.JsonConverter2;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.UUID;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: MandatesApiImpl.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0015J<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012J<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/api/MandatesApiImpl;", "Lcom/truelayer/payments/core/network/mandates/api/MandatesApi;", "uri", "Lokhttp3/HttpUrl;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)V", "apiService", "Lcom/truelayer/payments/core/network/mandates/api/MandatesApiService;", "cancelMandate", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "idempotencyKey", "Ljava/util/UUID;", "id", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandate", "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "payload", "Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "submitProviderSelection", "providerId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MandatesApiImpl implements MandatesApi {
    private final MandatesApiService apiService;

    /* compiled from: MandatesApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.mandates.api.MandatesApiImpl", m3645f = "MandatesApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 70}, m3647m = "cancelMandate")
    /* renamed from: com.truelayer.payments.core.network.mandates.api.MandatesApiImpl$cancelMandate$1 */
    static final class C427591 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427591(Continuation<? super C427591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MandatesApiImpl.this.cancelMandate(null, null, null, this);
        }
    }

    /* compiled from: MandatesApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.mandates.api.MandatesApiImpl", m3645f = "MandatesApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 51}, m3647m = "getMandate")
    /* renamed from: com.truelayer.payments.core.network.mandates.api.MandatesApiImpl$getMandate$1 */
    static final class C427601 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427601(Continuation<? super C427601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MandatesApiImpl.this.getMandate(null, null, this);
        }
    }

    /* compiled from: MandatesApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.mandates.api.MandatesApiImpl", m3645f = "MandatesApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 89}, m3647m = "startAuthorizationFlow")
    /* renamed from: com.truelayer.payments.core.network.mandates.api.MandatesApiImpl$startAuthorizationFlow$1 */
    static final class C427611 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427611(Continuation<? super C427611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MandatesApiImpl.this.startAuthorizationFlow(null, null, null, null, this);
        }
    }

    /* compiled from: MandatesApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.mandates.api.MandatesApiImpl", m3645f = "MandatesApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "submitConsent")
    /* renamed from: com.truelayer.payments.core.network.mandates.api.MandatesApiImpl$submitConsent$1 */
    static final class C427621 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427621(Continuation<? super C427621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MandatesApiImpl.this.submitConsent(null, null, null, this);
        }
    }

    /* compiled from: MandatesApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.mandates.api.MandatesApiImpl", m3645f = "MandatesApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 111}, m3647m = "submitProviderSelection")
    /* renamed from: com.truelayer.payments.core.network.mandates.api.MandatesApiImpl$submitProviderSelection$1 */
    static final class C427631 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427631(Continuation<? super C427631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MandatesApiImpl.this.submitProviderSelection(null, null, null, null, this);
        }
    }

    public MandatesApiImpl(HttpUrl uri, OkHttpClient client) throws SecurityException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(client, "client");
        Object objCreate = new Retrofit.Builder().client(client).addConverterFactory(Factory2.create(JsonConverter2.getJsonDefault(), MediaType.INSTANCE.get("application/json"))).baseUrl(uri).build().create(MandatesApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.apiService = (MandatesApiService) objCreate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:123)|48|49|129|50|51|125|52|53|121|54|55|131|56) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:123|48|49|129|50|51|125|52|53|121|54|55|131|56) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b2, code lost:
    
        r12 = r16;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        r14 = r18;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bc, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bf, code lost:
    
        r13 = r12;
        r8 = r12;
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d3, code lost:
    
        if (r12.code() < 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d5, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r13, r14, r15));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a4 -> B:14:0x0043). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.mandates.api.MandatesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMandate(String str, String str2, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        C427601 c427601;
        MandatesApiImpl mandatesApiImpl;
        String str3;
        Object validationError;
        Object fail;
        int i;
        C427601 c4276012;
        MandatesApiImpl mandatesApiImpl2;
        String str4;
        String str5;
        MandatesApiImpl mandatesApiImpl3;
        String str6;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        int i5;
        NetworkError.HttpError httpError;
        String str8;
        String str9;
        String str10;
        if (continuation instanceof C427601) {
            c427601 = (C427601) continuation;
            int i6 = c427601.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427601.label = i6 - Integer.MIN_VALUE;
                mandatesApiImpl = this;
            } else {
                mandatesApiImpl = this;
                c427601 = mandatesApiImpl.new C427601(continuation);
            }
        }
        Object mandate = c427601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427601.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(mandate);
            i = 0;
            c4276012 = c427601;
            mandatesApiImpl2 = mandatesApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4276012.L$0 = mandatesApiImpl2;
            c4276012.L$1 = str4;
            c4276012.L$2 = str5;
            c4276012.I$0 = i;
            c4276012.label = i9;
            if (DelayKt.delay(jDelayTime, c4276012) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427601.I$0;
                str7 = (String) c427601.L$2;
                str6 = (String) c427601.L$1;
                mandatesApiImpl3 = (MandatesApiImpl) c427601.L$0;
                ResultKt.throwOnFailure(mandate);
                String str11 = str7;
                C427601 c4276013 = c427601;
                str5 = str11;
                MandatesApiImpl mandatesApiImpl4 = mandatesApiImpl3;
                Response response = (Response) mandate;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str12 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str12, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str12, url, 6, null);
                    String str13 = strString;
                    if (str13 == null || str13.length() == 0) {
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpError = httpError2;
                            str8 = str12;
                            str9 = url;
                            str10 = str13;
                            i5 = i10;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(MandateApiError.INSTANCE.serializer(), str13), i10, str13, str12, url, 2, null);
                        i5 = i10;
                        str10 = str13;
                        str8 = str12;
                        str9 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    c4276012 = c4276013;
                    str4 = str6;
                    i = i5;
                    mandatesApiImpl2 = mandatesApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4276012.L$0 = mandatesApiImpl2;
                    c4276012.L$1 = str4;
                    c4276012.L$2 = str5;
                    c4276012.I$0 = i;
                    c4276012.label = i9;
                    if (DelayKt.delay(jDelayTime, c4276012) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427601 = c4276012;
                    i2 = i11;
                    mandatesApiImpl3 = mandatesApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    MandatesApiService mandatesApiService = mandatesApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    c427601.L$0 = mandatesApiImpl3;
                    c427601.L$1 = str6;
                    c427601.L$2 = str7;
                    c427601.I$0 = i3;
                    c427601.label = i8;
                    mandate = mandatesApiService.getMandate(bearerToken, str7, c427601);
                }
                if (fail instanceof Ok) {
                    fail = new Ok(((MandateResponse) ((Ok) fail).getValue()).intoDomain2());
                } else if (!(fail instanceof Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (fail instanceof Ok) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = c427601.I$0;
            str7 = (String) c427601.L$2;
            str6 = (String) c427601.L$1;
            mandatesApiImpl3 = (MandatesApiImpl) c427601.L$0;
            ResultKt.throwOnFailure(mandate);
            i3 = i2 + i9;
            MandatesApiService mandatesApiService2 = mandatesApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            c427601.L$0 = mandatesApiImpl3;
            c427601.L$1 = str6;
            c427601.L$2 = str7;
            c427601.I$0 = i3;
            c427601.label = i8;
            mandate = mandatesApiService2.getMandate(bearerToken2, str7, c427601);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:123)|52|53|117|54|55|121|56|57|119|58) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ea, code lost:
    
        if (r13.code() >= 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f2, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.mandates.api.MandatesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cancelMandate(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation) {
        C427591 c427591;
        MandatesApiImpl mandatesApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427591 c4275912;
        MandatesApiImpl mandatesApiImpl2;
        String str5;
        UUID uuid2;
        MandatesApiImpl mandatesApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427591) {
            c427591 = (C427591) continuation;
            int i6 = c427591.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427591.label = i6 - Integer.MIN_VALUE;
                mandatesApiImpl = this;
            } else {
                mandatesApiImpl = this;
                c427591 = mandatesApiImpl.new C427591(continuation);
            }
        }
        Object objCancelMandate = c427591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427591.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(objCancelMandate);
            str4 = str2;
            i = 0;
            c4275912 = c427591;
            mandatesApiImpl2 = mandatesApiImpl;
            str5 = str;
            uuid2 = uuid;
            jDelayTime = Request2.delayTime(i);
            c4275912.L$0 = mandatesApiImpl2;
            c4275912.L$1 = str5;
            c4275912.L$2 = uuid2;
            c4275912.L$3 = str4;
            c4275912.I$0 = i;
            c4275912.label = i9;
            if (DelayKt.delay(jDelayTime, c4275912) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427591.I$0;
                str7 = (String) c427591.L$3;
                uuid3 = (UUID) c427591.L$2;
                str6 = (String) c427591.L$1;
                mandatesApiImpl3 = (MandatesApiImpl) c427591.L$0;
                ResultKt.throwOnFailure(objCancelMandate);
                UUID uuid5 = uuid3;
                C427591 c4275913 = c427591;
                MandatesApiImpl mandatesApiImpl4 = mandatesApiImpl3;
                Response response = (Response) objCancelMandate;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    uuid4 = uuid5;
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str9 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str9, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str9, url, 6, null);
                    String str10 = strString;
                    if (str10 == null || str10.length() == 0) {
                        uuid4 = uuid5;
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            uuid4 = uuid5;
                            str8 = str10;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(MandateApiError.INSTANCE.serializer(), str10);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str10, str9, url, 2, null);
                        uuid4 = uuid5;
                        i5 = i10;
                        str8 = str10;
                        String str11 = str9;
                        String str12 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    uuid2 = uuid4;
                    str4 = str7;
                    c4275912 = c4275913;
                    str5 = str6;
                    i = i5;
                    mandatesApiImpl2 = mandatesApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4275912.L$0 = mandatesApiImpl2;
                    c4275912.L$1 = str5;
                    c4275912.L$2 = uuid2;
                    c4275912.L$3 = str4;
                    c4275912.I$0 = i;
                    c4275912.label = i9;
                    if (DelayKt.delay(jDelayTime, c4275912) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    uuid3 = uuid2;
                    c427591 = c4275912;
                    str7 = str4;
                    i2 = i11;
                    mandatesApiImpl3 = mandatesApiImpl2;
                    str6 = str5;
                    i3 = i2 + i9;
                    MandatesApiService mandatesApiService = mandatesApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    String string2 = uuid3 == null ? uuid3.toString() : null;
                    c427591.L$0 = mandatesApiImpl3;
                    c427591.L$1 = str6;
                    c427591.L$2 = uuid3;
                    c427591.L$3 = str7;
                    c427591.I$0 = i3;
                    c427591.label = i8;
                    objCancelMandate = mandatesApiService.cancelMandate(bearerToken, string2, str7, c427591);
                }
                if (!(fail instanceof Ok)) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = c427591.I$0;
            str7 = (String) c427591.L$3;
            uuid3 = (UUID) c427591.L$2;
            str6 = (String) c427591.L$1;
            mandatesApiImpl3 = (MandatesApiImpl) c427591.L$0;
            ResultKt.throwOnFailure(objCancelMandate);
            i3 = i2 + i9;
            MandatesApiService mandatesApiService2 = mandatesApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            if (uuid3 == null) {
            }
            c427591.L$0 = mandatesApiImpl3;
            c427591.L$1 = str6;
            c427591.L$2 = uuid3;
            c427591.L$3 = str7;
            c427591.I$0 = i3;
            c427591.label = i8;
            objCancelMandate = mandatesApiService2.cancelMandate(bearerToken2, string2, str7, c427591);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|123|56|57|121|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e5, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01eb, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fd, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ff, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0205, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.mandates.api.MandatesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuthorizationFlow(String str, UUID uuid, String str2, StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427611 c427611;
        MandatesApiImpl mandatesApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        StartAuthorizationFlowRequest startAuthorizationFlowRequest2;
        int i;
        C427611 c4276112;
        MandatesApiImpl mandatesApiImpl2;
        String str5;
        UUID uuid2;
        MandatesApiImpl mandatesApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str8;
        if (continuation instanceof C427611) {
            c427611 = (C427611) continuation;
            int i5 = c427611.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427611.label = i5 - Integer.MIN_VALUE;
                mandatesApiImpl = this;
            } else {
                mandatesApiImpl = this;
                c427611 = mandatesApiImpl.new C427611(continuation);
            }
        }
        Object objStartAuthorizationFlow = c427611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427611.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427611.I$0;
                startAuthorizationFlowRequest2 = (StartAuthorizationFlowRequest) c427611.L$4;
                str7 = (String) c427611.L$3;
                uuid3 = (UUID) c427611.L$2;
                str6 = (String) c427611.L$1;
                mandatesApiImpl3 = (MandatesApiImpl) c427611.L$0;
                ResultKt.throwOnFailure(objStartAuthorizationFlow);
                i3 = i2 + i8;
                MandatesApiService mandatesApiService = mandatesApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                c427611.L$0 = mandatesApiImpl3;
                c427611.L$1 = str6;
                c427611.L$2 = uuid3;
                c427611.L$3 = str7;
                c427611.L$4 = startAuthorizationFlowRequest2;
                c427611.I$0 = i3;
                c427611.label = i7;
                C427611 c4276113 = c427611;
                StartAuthorizationFlowRequest startAuthorizationFlowRequest3 = startAuthorizationFlowRequest2;
                String str9 = str7;
                objStartAuthorizationFlow = mandatesApiService.startAuthorizationFlow(bearerToken, string, str9, startAuthorizationFlowRequest3, c4276113);
                if (objStartAuthorizationFlow != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427611.I$0;
            startAuthorizationFlowRequest2 = (StartAuthorizationFlowRequest) c427611.L$4;
            String str10 = (String) c427611.L$3;
            UUID uuid5 = (UUID) c427611.L$2;
            str6 = (String) c427611.L$1;
            mandatesApiImpl3 = (MandatesApiImpl) c427611.L$0;
            ResultKt.throwOnFailure(objStartAuthorizationFlow);
            C427611 c4276114 = c427611;
            UUID uuid6 = uuid5;
            MandatesApiImpl mandatesApiImpl4 = mandatesApiImpl3;
            Response response = (Response) objStartAuthorizationFlow;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(MandateApiError.INSTANCE.serializer(), str12), i9, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427611 c4276115 = c4276114;
                i = i3;
                str4 = str10;
                c4276112 = c4276115;
                uuid2 = uuid4;
                str5 = str6;
                mandatesApiImpl2 = mandatesApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4276112.L$0 = mandatesApiImpl2;
                c4276112.L$1 = str5;
                c4276112.L$2 = uuid2;
                c4276112.L$3 = str4;
                c4276112.L$4 = startAuthorizationFlowRequest2;
                c4276112.I$0 = i;
                c4276112.label = i8;
                if (DelayKt.delay(jDelayTime, c4276112) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427611 = c4276112;
                str7 = str4;
                i2 = i10;
                mandatesApiImpl3 = mandatesApiImpl2;
                str6 = str5;
                i3 = i2 + i8;
                MandatesApiService mandatesApiService2 = mandatesApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                c427611.L$0 = mandatesApiImpl3;
                c427611.L$1 = str6;
                c427611.L$2 = uuid3;
                c427611.L$3 = str7;
                c427611.L$4 = startAuthorizationFlowRequest2;
                c427611.I$0 = i3;
                c427611.label = i7;
                C427611 c42761132 = c427611;
                StartAuthorizationFlowRequest startAuthorizationFlowRequest32 = startAuthorizationFlowRequest2;
                String str92 = str7;
                objStartAuthorizationFlow = mandatesApiService2.startAuthorizationFlow(bearerToken2, string2, str92, startAuthorizationFlowRequest32, c42761132);
                if (objStartAuthorizationFlow != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    startAuthorizationFlowRequest2 = startAuthorizationFlowRequest32;
                    c4276114 = c42761132;
                    MandatesApiImpl mandatesApiImpl42 = mandatesApiImpl3;
                    Response response2 = (Response) objStartAuthorizationFlow;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((MandateAuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objStartAuthorizationFlow);
        str4 = str2;
        startAuthorizationFlowRequest2 = startAuthorizationFlowRequest;
        i = 0;
        c4276112 = c427611;
        mandatesApiImpl2 = mandatesApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4276112.L$0 = mandatesApiImpl2;
        c4276112.L$1 = str5;
        c4276112.L$2 = uuid2;
        c4276112.L$3 = str4;
        c4276112.L$4 = startAuthorizationFlowRequest2;
        c4276112.I$0 = i;
        c4276112.label = i8;
        if (DelayKt.delay(jDelayTime, c4276112) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.mandates.api.MandatesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitProviderSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427631 c427631;
        MandatesApiImpl mandatesApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        String str6;
        int i;
        C427631 c4276312;
        MandatesApiImpl mandatesApiImpl2;
        String str7;
        UUID uuid2;
        MandatesApiImpl mandatesApiImpl3;
        String str8;
        UUID uuid3;
        String str9;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str10;
        if (continuation instanceof C427631) {
            c427631 = (C427631) continuation;
            int i5 = c427631.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427631.label = i5 - Integer.MIN_VALUE;
                mandatesApiImpl = this;
            } else {
                mandatesApiImpl = this;
                c427631 = mandatesApiImpl.new C427631(continuation);
            }
        }
        Object objSubmitProviderSelection = c427631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427631.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str4 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str4, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str4, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str4, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427631.I$0;
                str6 = (String) c427631.L$4;
                str9 = (String) c427631.L$3;
                uuid3 = (UUID) c427631.L$2;
                str8 = (String) c427631.L$1;
                mandatesApiImpl3 = (MandatesApiImpl) c427631.L$0;
                ResultKt.throwOnFailure(objSubmitProviderSelection);
                i3 = i2 + i8;
                MandatesApiService mandatesApiService = mandatesApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str8);
                if (uuid3 == null) {
                }
                SubmitProviderSelectionRequest submitProviderSelectionRequest = new SubmitProviderSelectionRequest(str6);
                c427631.L$0 = mandatesApiImpl3;
                c427631.L$1 = str8;
                c427631.L$2 = uuid3;
                c427631.L$3 = str9;
                c427631.L$4 = str6;
                c427631.I$0 = i3;
                c427631.label = i7;
                C427631 c4276313 = c427631;
                String str11 = str9;
                objSubmitProviderSelection = mandatesApiService.submitProviderSelection(bearerToken, string, str11, submitProviderSelectionRequest, c4276313);
                if (objSubmitProviderSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427631.I$0;
            str6 = (String) c427631.L$4;
            String str12 = (String) c427631.L$3;
            UUID uuid5 = (UUID) c427631.L$2;
            str8 = (String) c427631.L$1;
            mandatesApiImpl3 = (MandatesApiImpl) c427631.L$0;
            ResultKt.throwOnFailure(objSubmitProviderSelection);
            C427631 c4276314 = c427631;
            UUID uuid6 = uuid5;
            MandatesApiImpl mandatesApiImpl4 = mandatesApiImpl3;
            Response response = (Response) objSubmitProviderSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str13 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str13, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str13, url, 6, null);
                String str14 = strString;
                if (str14 == null || str14.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str10 = str14;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(MandateApiError.INSTANCE.serializer(), str14), i9, str14, str13, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str10 = str14;
                    String str15 = str13;
                    String str16 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427631 c4276315 = c4276314;
                i = i3;
                str5 = str12;
                c4276312 = c4276315;
                uuid2 = uuid4;
                str7 = str8;
                mandatesApiImpl2 = mandatesApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4276312.L$0 = mandatesApiImpl2;
                c4276312.L$1 = str7;
                c4276312.L$2 = uuid2;
                c4276312.L$3 = str5;
                c4276312.L$4 = str6;
                c4276312.I$0 = i;
                c4276312.label = i8;
                if (DelayKt.delay(jDelayTime, c4276312) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427631 = c4276312;
                str9 = str5;
                i2 = i10;
                mandatesApiImpl3 = mandatesApiImpl2;
                str8 = str7;
                i3 = i2 + i8;
                MandatesApiService mandatesApiService2 = mandatesApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str8);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitProviderSelectionRequest submitProviderSelectionRequest2 = new SubmitProviderSelectionRequest(str6);
                c427631.L$0 = mandatesApiImpl3;
                c427631.L$1 = str8;
                c427631.L$2 = uuid3;
                c427631.L$3 = str9;
                c427631.L$4 = str6;
                c427631.I$0 = i3;
                c427631.label = i7;
                C427631 c42763132 = c427631;
                String str112 = str9;
                objSubmitProviderSelection = mandatesApiService2.submitProviderSelection(bearerToken2, string2, str112, submitProviderSelectionRequest2, c42763132);
                if (objSubmitProviderSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str12 = str112;
                    c4276314 = c42763132;
                    MandatesApiImpl mandatesApiImpl42 = mandatesApiImpl3;
                    Response response2 = (Response) objSubmitProviderSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((MandateAuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitProviderSelection);
        str5 = str2;
        str6 = str3;
        i = 0;
        c4276312 = c427631;
        mandatesApiImpl2 = mandatesApiImpl;
        str7 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4276312.L$0 = mandatesApiImpl2;
        c4276312.L$1 = str7;
        c4276312.L$2 = uuid2;
        c4276312.L$3 = str5;
        c4276312.L$4 = str6;
        c4276312.I$0 = i;
        c4276312.label = i8;
        if (DelayKt.delay(jDelayTime, c4276312) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:132)|54|55|126|56|57|130|58|59|128|60) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01db, code lost:
    
        r37 = r1;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e7, code lost:
    
        r37 = r1;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        if (r13.code() >= 500) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c8 -> B:15:0x004c). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.mandates.api.MandatesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitConsent(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427621 c427621;
        MandatesApiImpl mandatesApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427621 c4276212;
        MandatesApiImpl mandatesApiImpl2;
        String str5;
        UUID uuid2;
        MandatesApiImpl mandatesApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427621) {
            c427621 = (C427621) continuation;
            int i6 = c427621.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427621.label = i6 - Integer.MIN_VALUE;
                mandatesApiImpl = this;
            } else {
                mandatesApiImpl = this;
                c427621 = mandatesApiImpl.new C427621(continuation);
            }
        }
        Object objSubmitConsent = c427621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427621.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 != 0) {
            if (i7 == 1) {
                i2 = c427621.I$0;
                str7 = (String) c427621.L$3;
                uuid3 = (UUID) c427621.L$2;
                str6 = (String) c427621.L$1;
                mandatesApiImpl3 = (MandatesApiImpl) c427621.L$0;
                ResultKt.throwOnFailure(objSubmitConsent);
                i3 = i2 + i9;
                MandatesApiService mandatesApiService = mandatesApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                SubmitConsentRequest submitConsentRequest = SubmitConsentRequest.INSTANCE;
                c427621.L$0 = mandatesApiImpl3;
                c427621.L$1 = str6;
                c427621.L$2 = uuid3;
                c427621.L$3 = str7;
                c427621.I$0 = i3;
                c427621.label = i8;
                C427621 c4276213 = c427621;
                String str9 = str7;
                objSubmitConsent = mandatesApiService.submitConsent(bearerToken, string, str9, submitConsentRequest, c4276213);
                if (objSubmitConsent != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427621.I$0;
            String str10 = (String) c427621.L$3;
            UUID uuid5 = (UUID) c427621.L$2;
            str6 = (String) c427621.L$1;
            mandatesApiImpl3 = (MandatesApiImpl) c427621.L$0;
            ResultKt.throwOnFailure(objSubmitConsent);
            C427621 c4276214 = c427621;
            UUID uuid6 = uuid5;
            MandatesApiImpl mandatesApiImpl4 = mandatesApiImpl3;
            Response response = (Response) objSubmitConsent;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i5 = i3;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i10 = i3;
                NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i5 = i10;
                    fail = new Fail(httpError2);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        httpError = httpError2;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    Object objDecodeFromString = jsonDefault.decodeFromString(MandateApiError.INSTANCE.serializer(), str12);
                    httpError = httpError2;
                    NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i5 = i10;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError3);
                }
            }
            if (Request2.shouldRetry(i5, i4)) {
                uuid2 = uuid4;
                str4 = str10;
                c4276212 = c4276214;
                str5 = str6;
                i = i5;
                mandatesApiImpl2 = mandatesApiImpl4;
                i8 = 2;
                i9 = 1;
                jDelayTime = Request2.delayTime(i);
                c4276212.L$0 = mandatesApiImpl2;
                c4276212.L$1 = str5;
                c4276212.L$2 = uuid2;
                c4276212.L$3 = str4;
                c4276212.I$0 = i;
                c4276212.label = i9;
                if (DelayKt.delay(jDelayTime, c4276212) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i11 = i;
                uuid3 = uuid2;
                c427621 = c4276212;
                str7 = str4;
                i2 = i11;
                mandatesApiImpl3 = mandatesApiImpl2;
                str6 = str5;
                i3 = i2 + i9;
                MandatesApiService mandatesApiService2 = mandatesApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitConsentRequest submitConsentRequest2 = SubmitConsentRequest.INSTANCE;
                c427621.L$0 = mandatesApiImpl3;
                c427621.L$1 = str6;
                c427621.L$2 = uuid3;
                c427621.L$3 = str7;
                c427621.I$0 = i3;
                c427621.label = i8;
                C427621 c42762132 = c427621;
                String str92 = str7;
                objSubmitConsent = mandatesApiService2.submitConsent(bearerToken2, string2, str92, submitConsentRequest2, c42762132);
                if (objSubmitConsent != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    c4276214 = c42762132;
                    MandatesApiImpl mandatesApiImpl42 = mandatesApiImpl3;
                    Response response2 = (Response) objSubmitConsent;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i5, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (!(fail instanceof Ok)) {
                fail = new Ok(((MandateAuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(fail instanceof Ok)) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitConsent);
        str4 = str2;
        i = 0;
        c4276212 = c427621;
        mandatesApiImpl2 = mandatesApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4276212.L$0 = mandatesApiImpl2;
        c4276212.L$1 = str5;
        c4276212.L$2 = uuid2;
        c4276212.L$3 = str4;
        c4276212.I$0 = i;
        c4276212.label = i9;
        if (DelayKt.delay(jDelayTime, c4276212) != coroutine_suspended) {
        }
    }
}
