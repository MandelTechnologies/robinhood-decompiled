package com.twilio.conversations.media;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException2;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.request.HttpRequest5;
import io.ktor.client.request.forms.FormBuilder;
import io.ktor.client.request.forms.FormDataContent2;
import io.ktor.client.request.forms.FormDslKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponse2;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentTypes2;
import io.ktor.http.HeaderValueWithParameters2;
import io.ktor.http.Headers;
import io.ktor.http.Headers3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageProperties;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder2;
import io.ktor.http.URLUtils2;
import io.ktor.http.Url;
import io.ktor.http.content.Multipart2;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvm;
import io.ktor.utils.p478io.core.Input;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.TypesJVM5;

/* compiled from: MediaTransport.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u001dJ(\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0096@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0012H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaTransportImpl;", "Lcom/twilio/conversations/media/MediaTransport;", "token", "", "serviceUrl", "mediaSetUrl", "productId", "httpClient", "Lio/ktor/client/HttpClient;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/HttpClient;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "buildHeaders", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "uploadFile", "filename", "contentType", RhGcmListenerService.EXTRA_CATEGORY, "fileInput", "Lio/ktor/utils/io/core/Input;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/ktor/utils/io/core/Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFileAsText", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrl", "mediaSid", "getTemporaryContentUrlList", "", "mediaSids", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MediaTransportImpl implements MediaTransport {
    private final Function1<HttpRequest2, Unit> buildHeaders;
    private final HttpClient httpClient;
    private final String mediaSetUrl;
    private final String productId;
    private final String serviceUrl;
    private String token;

    /* compiled from: MediaTransport.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaTransportImpl", m3645f = "MediaTransport.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 115}, m3647m = "downloadFileAsText")
    /* renamed from: com.twilio.conversations.media.MediaTransportImpl$downloadFileAsText$1 */
    static final class C434501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C434501(Continuation<? super C434501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaTransportImpl.this.downloadFileAsText(null, this);
        }
    }

    /* compiled from: MediaTransport.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaTransportImpl", m3645f = "MediaTransport.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "getTemporaryContentUrl")
    /* renamed from: com.twilio.conversations.media.MediaTransportImpl$getTemporaryContentUrl$1 */
    static final class C434511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C434511(Continuation<? super C434511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaTransportImpl.this.getTemporaryContentUrl(null, this);
        }
    }

    /* compiled from: MediaTransport.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaTransportImpl", m3645f = "MediaTransport.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "getTemporaryContentUrlList")
    /* renamed from: com.twilio.conversations.media.MediaTransportImpl$getTemporaryContentUrlList$1 */
    static final class C434521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C434521(Continuation<? super C434521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaTransportImpl.this.getTemporaryContentUrlList(null, this);
        }
    }

    /* compiled from: MediaTransport.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.media.MediaTransportImpl", m3645f = "MediaTransport.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "uploadFile")
    /* renamed from: com.twilio.conversations.media.MediaTransportImpl$uploadFile$1 */
    static final class C434531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C434531(Continuation<? super C434531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaTransportImpl.this.uploadFile(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Input uploadFile$lambda$5$lambda$4(Input fileInput) {
        Intrinsics.checkNotNullParameter(fileInput, "$fileInput");
        return fileInput;
    }

    public MediaTransportImpl(String token, String serviceUrl, String mediaSetUrl, String productId, HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(serviceUrl, "serviceUrl");
        Intrinsics.checkNotNullParameter(mediaSetUrl, "mediaSetUrl");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.token = token;
        this.serviceUrl = serviceUrl;
        this.mediaSetUrl = mediaSetUrl;
        this.productId = productId;
        this.httpClient = httpClient;
        this.buildHeaders = new Function1() { // from class: com.twilio.conversations.media.MediaTransportImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaTransportImpl.buildHeaders$lambda$1(this.f$0, (HttpRequest2) obj);
            }
        };
    }

    @Override // com.twilio.conversations.media.MediaTransport
    public String getToken() {
        return this.token;
    }

    @Override // com.twilio.conversations.media.MediaTransport
    public void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHeaders$lambda$1(final MediaTransportImpl this$0, HttpRequest2 httpRequest2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(httpRequest2, "<this>");
        HttpRequest5.headers(httpRequest2, new Function1() { // from class: com.twilio.conversations.media.MediaTransportImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaTransportImpl.buildHeaders$lambda$1$lambda$0(this.f$0, (Headers3) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHeaders$lambda$1$lambda$0(MediaTransportImpl this$0, Headers3 headers) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        headers.append("X-Twilio-Token", this$0.getToken());
        headers.append("X-Twilio-Product-Id", this$0.productId);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if (r0 == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003e, B:32:0x010d, B:33:0x0114, B:34:0x011b, B:19:0x0046, B:28:0x00eb, B:25:0x0091), top: B:45:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003e, B:32:0x010d, B:33:0x0114, B:34:0x011b, B:19:0x0046, B:28:0x00eb, B:25:0x0091), top: B:45:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.twilio.conversations.media.MediaTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object uploadFile(String str, String str2, String str3, final Input input, Continuation<? super String> continuation) throws Throwable {
        C434531 c434531;
        Object objM28550constructorimpl;
        if (continuation instanceof C434531) {
            c434531 = (C434531) continuation;
            int i = c434531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434531.label = i - Integer.MIN_VALUE;
            } else {
                c434531 = new C434531(continuation);
            }
        }
        Object twilioException = c434531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434531.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Headers.Companion companion2 = Headers.INSTANCE;
            Headers3 headers3 = new Headers3(0, 1, null);
            if (str != null) {
                headers3.append(HttpHeaders.INSTANCE.getContentDisposition(), "filename=" + HeaderValueWithParameters2.escapeIfNeeded(str));
            }
            headers3.append(HttpHeaders.INSTANCE.getContentType(), str2);
            final Headers headersBuild = headers3.build();
            List<Multipart2> listFormData = FormDslKt.formData((Function1<? super FormBuilder, Unit>) new Function1() { // from class: com.twilio.conversations.media.MediaTransportImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MediaTransportImpl.uploadFile$lambda$5(headersBuild, input, (FormBuilder) obj);
                }
            });
            Result.Companion companion3 = Result.INSTANCE;
            String str4 = this.serviceUrl + "?Category=" + HeaderValueWithParameters2.escapeIfNeeded(str3);
            HttpClient httpClient = this.httpClient;
            Function1<HttpRequest2, Unit> function1 = this.buildHeaders;
            HttpRequest2 httpRequest2 = new HttpRequest2();
            httpRequest2.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequest2.setBody(new FormDataContent2(listFormData, null, null, 6, null));
            httpRequest2.setBodyType(null);
            HttpRequest5.url(httpRequest2, str4);
            function1.invoke(httpRequest2);
            HttpStatement httpStatement = new HttpStatement(httpRequest2, httpClient);
            c434531.label = 1;
            twilioException = httpStatement.execute(c434531);
            if (twilioException == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(twilioException);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(twilioException);
                throw ((Throwable) twilioException);
            }
            ResultKt.throwOnFailure(twilioException);
            if (twilioException == null) {
                objM28550constructorimpl = Result.m28550constructorimpl((MediaResponse) twilioException);
                TwilioException2 twilioException2 = TwilioException2.MediaUploadError;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    c434531.label = 3;
                    twilioException = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c434531);
                } else {
                    return ((MediaResponse) objM28550constructorimpl).getSid();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.twilio.conversations.media.MediaResponse");
            }
        }
        HttpClientCall call = ((HttpResponse) twilioException).getCall();
        KType kTypeTypeOf = Reflection.typeOf(MediaResponse.class);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(MediaResponse.class), kTypeTypeOf);
        c434531.label = 2;
        twilioException = call.bodyNullable(typeInfoTypeInfoImpl, c434531);
        if (twilioException == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (twilioException == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFile$lambda$5(Headers fileHeaders, final Input fileInput, FormBuilder formData) {
        Intrinsics.checkNotNullParameter(fileHeaders, "$fileHeaders");
        Intrinsics.checkNotNullParameter(fileInput, "$fileInput");
        Intrinsics.checkNotNullParameter(formData, "$this$formData");
        FormBuilder.appendInput$default(formData, "file", fileHeaders, null, new Function0() { // from class: com.twilio.conversations.media.MediaTransportImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaTransportImpl.uploadFile$lambda$5$lambda$4(fileInput);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.twilio.conversations.media.MediaTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadFileAsText(String str, Continuation<? super String> continuation) {
        C434501 c434501;
        if (continuation instanceof C434501) {
            c434501 = (C434501) continuation;
            int i = c434501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434501.label = i - Integer.MIN_VALUE;
            } else {
                c434501 = new C434501(continuation);
            }
        }
        Object objExecute = c434501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objExecute);
            HttpClient httpClient = this.httpClient;
            HttpRequest2 httpRequest2 = new HttpRequest2();
            HttpRequest5.url(httpRequest2, str);
            httpRequest2.setMethod(HttpMethod.INSTANCE.getGet());
            HttpStatement httpStatement = new HttpStatement(httpRequest2, httpClient);
            c434501.label = 1;
            objExecute = httpStatement.execute(c434501);
            if (objExecute != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objExecute);
            return objExecute;
        }
        ResultKt.throwOnFailure(objExecute);
        c434501.label = 2;
        Object objBodyAsText$default = HttpResponse2.bodyAsText$default((HttpResponse) objExecute, null, c434501, 1, null);
        return objBodyAsText$default == coroutine_suspended ? coroutine_suspended : objBodyAsText$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r11 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:16:0x003a, B:29:0x00a9, B:30:0x00b0, B:31:0x00b7, B:19:0x0041, B:25:0x0088, B:22:0x005c), top: B:42:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:16:0x003a, B:29:0x00a9, B:30:0x00b0, B:31:0x00b7, B:19:0x0041, B:25:0x0088, B:22:0x005c), top: B:42:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.twilio.conversations.media.MediaTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTemporaryContentUrl(String str, Continuation<? super String> continuation) throws Throwable {
        C434511 c434511;
        Object objM28550constructorimpl;
        if (continuation instanceof C434511) {
            c434511 = (C434511) continuation;
            int i = c434511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434511.label = i - Integer.MIN_VALUE;
            } else {
                c434511 = new C434511(continuation);
            }
        }
        Object twilioException = c434511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434511.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Url urlBuild = URLBuilder2.appendPathSegments$default(URLUtils2.URLBuilder(this.serviceUrl), new String[]{str}, false, 2, null).build();
            Result.Companion companion2 = Result.INSTANCE;
            HttpClient httpClient = this.httpClient;
            Function1<HttpRequest2, Unit> function1 = this.buildHeaders;
            HttpRequest2 httpRequest2 = new HttpRequest2();
            URLUtils2.takeFrom(httpRequest2.getUrl(), urlBuild);
            function1.invoke(httpRequest2);
            httpRequest2.setMethod(HttpMethod.INSTANCE.getGet());
            HttpStatement httpStatement = new HttpStatement(httpRequest2, httpClient);
            c434511.label = 1;
            twilioException = httpStatement.execute(c434511);
            if (twilioException == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(twilioException);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(twilioException);
                throw ((Throwable) twilioException);
            }
            ResultKt.throwOnFailure(twilioException);
            if (twilioException == null) {
                objM28550constructorimpl = Result.m28550constructorimpl((MediaResponse) twilioException);
                TwilioException2 twilioException2 = TwilioException2.MediaFetchError;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    c434511.label = 3;
                    twilioException = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c434511);
                } else {
                    return ((MediaResponse) objM28550constructorimpl).getLinks().getTemporaryContentUrl();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.twilio.conversations.media.MediaResponse");
            }
        }
        HttpClientCall call = ((HttpResponse) twilioException).getCall();
        KType kTypeTypeOf = Reflection.typeOf(MediaResponse.class);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(MediaResponse.class), kTypeTypeOf);
        c434511.label = 2;
        twilioException = call.bodyNullable(typeInfoTypeInfoImpl, c434511);
        if (twilioException == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (twilioException == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x017b, code lost:
    
        if (r14 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003e, B:33:0x00ef, B:34:0x00f6, B:35:0x00fd, B:19:0x0046, B:29:0x00c1, B:22:0x004d, B:23:0x0078, B:25:0x007e, B:26:0x008d), top: B:53:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003e, B:33:0x00ef, B:34:0x00f6, B:35:0x00fd, B:19:0x0046, B:29:0x00c1, B:22:0x004d, B:23:0x0078, B:25:0x007e, B:26:0x008d), top: B:53:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.twilio.conversations.media.MediaTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTemporaryContentUrlList(List<String> list, Continuation<? super Map<String, String>> continuation) throws Throwable {
        C434521 c434521;
        Object objM28550constructorimpl;
        if (continuation instanceof C434521) {
            c434521 = (C434521) continuation;
            int i = c434521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434521.label = i - Integer.MIN_VALUE;
            } else {
                c434521 = new C434521(continuation);
            }
        }
        Object twilioException = c434521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434521.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Result.Companion companion2 = Result.INSTANCE;
            HttpClient httpClient = this.httpClient;
            String str = this.mediaSetUrl;
            HttpRequest2 httpRequest2 = new HttpRequest2();
            HttpRequest5.url(httpRequest2, str);
            this.buildHeaders.invoke(httpRequest2);
            HttpMessageProperties.contentType(httpRequest2, ContentTypes2.Application.INSTANCE.getJson());
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new MediaSid((String) it.next()));
            }
            httpRequest2.setBody(new MediaSetCommand((String) null, arrayList, 1, (DefaultConstructorMarker) null));
            KType kTypeTypeOf = Reflection.typeOf(MediaSetCommand.class);
            httpRequest2.setBodyType(TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(MediaSetCommand.class), kTypeTypeOf));
            httpRequest2.setMethod(HttpMethod.INSTANCE.getPost());
            HttpStatement httpStatement = new HttpStatement(httpRequest2, httpClient);
            c434521.label = 1;
            twilioException = httpStatement.execute(c434521);
            if (twilioException == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(twilioException);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(twilioException);
                throw ((Throwable) twilioException);
            }
            ResultKt.throwOnFailure(twilioException);
            if (twilioException == null) {
                objM28550constructorimpl = Result.m28550constructorimpl((List) twilioException);
                TwilioException2 twilioException2 = TwilioException2.MediaFetchError;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    c434521.label = 3;
                    twilioException = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c434521);
                } else {
                    List list3 = (List) objM28550constructorimpl;
                    ArrayList<MediaResponse> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((MediaSetItem) it2.next()).getMediaResponse());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                    for (MediaResponse mediaResponse : arrayList2) {
                        Tuples2 tuples2M3642to = Tuples4.m3642to(mediaResponse.getSid(), mediaResponse.getLinks().getTemporaryContentUrl());
                        linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                    }
                    return linkedHashMap;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.twilio.conversations.media.MediaSetItem>");
            }
        }
        HttpClientCall call = ((HttpResponse) twilioException).getCall();
        KType kTypeTypeOf2 = Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(MediaSetItem.class)));
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(List.class), kTypeTypeOf2);
        c434521.label = 2;
        twilioException = call.bodyNullable(typeInfoTypeInfoImpl, c434521);
        if (twilioException == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (twilioException == null) {
        }
    }

    @Override // com.twilio.conversations.media.MediaTransport
    public void shutdown() throws IOException {
        this.httpClient.close();
    }
}
