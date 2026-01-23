package microgram.android.http;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import microgram.networking.BodyData;
import microgram.networking.CommonTypes3;
import microgram.networking.HttpRequest;
import microgram.networking.HttpResult;
import microgram.networking.HttpResult2;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;

/* compiled from: RealHttpService.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0002\u001a\f\u0010\n\u001a\u00020\u0004*\u00020\u000bH\u0002\u001a'\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\f\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u000b*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0012\u0010\u0019\u001a\u00020\u000f*\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001b\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, m3636d2 = {"toHttpRequest", "Lokhttp3/Request;", "Lmicrogram/networking/HttpRequest;", "createRequestBody", "Lokhttp3/RequestBody;", "requiresBody", "", "Lmicrogram/networking/HttpRequest$Method;", "getRequiresBody", "(Lmicrogram/networking/HttpRequest$Method;)Z", "toRequestBody", "Lmicrogram/networking/BodyData;", "toResultModel", "Lmicrogram/networking/HttpResult;", "Lkotlin/Result;", "Lokhttp3/Response;", "id", "", "encodingType", "Lmicrogram/networking/DataEncodingType;", "(Ljava/lang/Object;Ljava/lang/String;Lmicrogram/networking/DataEncodingType;)Lmicrogram/networking/HttpResult;", "Lmicrogram/networking/HttpResult$Error;", "", "toBodyData", "Lokhttp3/ResponseBody;", "await", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.http.RealHttpServiceKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RealHttpService4 {

    /* compiled from: RealHttpService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.http.RealHttpServiceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HttpRequest.Method.values().length];
            try {
                iArr[HttpRequest.Method.PATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpRequest.Method.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpRequest.Method.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonTypes3.values().length];
            try {
                iArr2[CommonTypes3.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CommonTypes3.BASE64_BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request toHttpRequest(HttpRequest httpRequest) {
        Request.Builder builderHeaders = new Request.Builder().url(httpRequest.getUrl()).method(httpRequest.getMethod().name(), createRequestBody(httpRequest)).headers(Headers.INSTANCE.m3819of(httpRequest.getHeaders()));
        if (httpRequest.getTimeoutMs() != null) {
            String strValueOf = String.valueOf(TimeUnit.SECONDS.convert(r4.intValue(), TimeUnit.MILLISECONDS));
            builderHeaders.header("X-Read-Timeout-Seconds-Override", strValueOf);
            builderHeaders.header("X-Write-Timeout-Seconds-Override", strValueOf);
        }
        return builderHeaders.build();
    }

    private static final RequestBody createRequestBody(HttpRequest httpRequest) {
        RequestBody requestBody;
        BodyData body = httpRequest.getBody();
        if (body != null && (requestBody = toRequestBody(body)) != null) {
            return requestBody;
        }
        if (getRequiresBody(httpRequest.getMethod())) {
            return RequestBody.Companion.create$default(RequestBody.INSTANCE, ByteString.EMPTY, (MediaType) null, 1, (Object) null);
        }
        return null;
    }

    private static final boolean getRequiresBody(HttpRequest.Method method) {
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    private static final RequestBody toRequestBody(BodyData bodyData) {
        int i = WhenMappings.$EnumSwitchMapping$1[bodyData.getType().ordinal()];
        if (i == 1) {
            return RequestBody.Companion.create$default(RequestBody.INSTANCE, bodyData.getContent(), (MediaType) null, 1, (Object) null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        RequestBody.Companion companion = RequestBody.INSTANCE;
        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(bodyData.getContent());
        Intrinsics.checkNotNull(byteStringDecodeBase64);
        return RequestBody.Companion.create$default(companion, byteStringDecodeBase64, (MediaType) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpResult toResultModel(Object obj, String str, CommonTypes3 commonTypes3) throws Throwable {
        if (Result.m28556isSuccessimpl(obj)) {
            obj = toResultModel((Response) obj, str, commonTypes3);
        }
        Object objM28550constructorimpl = Result.m28550constructorimpl(obj);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            objM28550constructorimpl = toResultModel(thM28553exceptionOrNullimpl, str);
        }
        return (HttpResult) objM28550constructorimpl;
    }

    private static final HttpResult.Error toResultModel(Throwable th, String str) throws Throwable {
        if (th instanceof IOException) {
            return new HttpResult.Error(str, HttpResult2.INTERNAL_ERROR.getValue(), th.getMessage());
        }
        throw th;
    }

    private static final HttpResult toResultModel(Response response, String str, CommonTypes3 commonTypes3) {
        int code = response.getCode();
        Map map = MapsKt.toMap(response.getHeaders());
        ResponseBody body = response.getBody();
        return new HttpResult.Response(str, code, map, body != null ? toBodyData(body, commonTypes3) : null);
    }

    private static final BodyData toBodyData(ResponseBody responseBody, CommonTypes3 commonTypes3) {
        int i = WhenMappings.$EnumSwitchMapping$1[commonTypes3.ordinal()];
        if (i == 1) {
            return new BodyData(CommonTypes3.STRING, responseBody.string());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new BodyData(CommonTypes3.BASE64_BYTES, responseBody.byteString().base64());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object await(final Call call, Continuation<? super Response> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: microgram.android.http.RealHttpServiceKt$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback() { // from class: microgram.android.http.RealHttpServiceKt$await$2$2
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException e) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                CancellableContinuation<Response> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) {
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
