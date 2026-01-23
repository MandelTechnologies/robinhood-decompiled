package com.withpersona.sdk2.inquiry.network.core;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import retrofit2.Response;

/* loaded from: classes18.dex */
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt", m3645f = "NetworkUtils.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "enqueueWithRetryWhen")
    /* renamed from: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 */
    public static final class C436801<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C436801(Continuation<? super C436801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
        }
    }

    public static final <T> Object enqueueRetriableRequestWithRetry(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((InternalErrorInfo.NetworkErrorInfo) obj).isRecoverable());
            }
        }, continuation);
    }

    public static final <T> Object enqueueVerificationRequestWithRetry(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NetworkUtilsKt.enqueueVerificationRequestWithRetry$lambda$3((InternalErrorInfo.NetworkErrorInfo) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueueVerificationRequestWithRetry$lambda$3(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        int code = networkErrorInfo.getCode();
        return (code == 0 || code == 409 || code == 413 || code == 422) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object enqueueWithRetryWhen(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function12, Continuation<? super NetworkCallResult<T>> continuation) {
        C436801 c436801;
        InternalErrorInfo.NetworkErrorInfo errorInfo;
        Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function13;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function14;
        int i;
        C436801 c4368012;
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
        if (continuation instanceof C436801) {
            c436801 = (C436801) continuation;
            int i2 = c436801.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c436801.label = i2 - Integer.MIN_VALUE;
            } else {
                c436801 = new C436801(continuation);
            }
        }
        Object obj = c436801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c436801.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            errorInfo = null;
            function13 = function12;
            function14 = function1;
            i = 0;
            c4368012 = c436801;
            networkErrorInfo = errorInfo;
            Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function15 = function13;
            if (i < 3) {
            }
            if (networkErrorInfo != null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c436801.I$0;
            Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function16 = (Function1) c436801.L$1;
            Function1<? super Continuation<? super Response<T>>, ? extends Object> function17 = (Function1) c436801.L$0;
            ResultKt.throwOnFailure(obj);
            C436801 c4368013 = c436801;
            Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function18 = function16;
            function14 = function17;
            c4368012 = c4368013;
            Response response = (Response) obj;
            if (!response.isSuccessful()) {
                return new NetworkCallResult.Success(response.body());
            }
            errorInfo = toErrorInfo(response);
            if (!function18.invoke(errorInfo).booleanValue()) {
                networkErrorInfo = errorInfo;
                if (networkErrorInfo != null) {
                    return new NetworkCallResult.Failure(networkErrorInfo);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            i++;
            function13 = function18;
            networkErrorInfo = errorInfo;
            Function1<? super InternalErrorInfo.NetworkErrorInfo, Boolean> function152 = function13;
            if (i < 3) {
                c4368012.L$0 = function14;
                c4368012.L$1 = function152;
                c4368012.I$0 = i;
                c4368012.label = 1;
                Object objInvoke = function14.invoke(c4368012);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function18 = function152;
                obj = objInvoke;
                Response response2 = (Response) obj;
                if (!response2.isSuccessful()) {
                }
            }
            if (networkErrorInfo != null) {
            }
        }
    }

    public static final <T> NetworkCallResult<T> onFailure(NetworkCallResult<T> networkCallResult, Function1<? super InternalErrorInfo.NetworkErrorInfo, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            function1.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    public static final <T> NetworkCallResult<T> onSuccess(NetworkCallResult<T> networkCallResult, Function1<? super T, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            function1.invoke((Object) ((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InternalErrorInfo.NetworkErrorInfo toErrorInfo(Response<?> response) {
        List<ErrorResponse.Error> errors;
        List<ErrorResponse.Error> errors2;
        List<ErrorResponse.Error> errors3;
        List<ErrorResponse.Error> errors4;
        List<ErrorResponse.Error> errors5;
        List<ErrorResponse.Error> errors6;
        List<ErrorResponse.Error> errors7;
        List<ErrorResponse.Error> errors8;
        ErrorResponse.Error error;
        ResponseBody responseBodyErrorBody;
        BufferedSource bufferedSource;
        String strMessage = response.message();
        ErrorResponse.Error rateLimitExceededError = null;
        String strMessage2 = (strMessage == null || StringsKt.isBlank(strMessage)) ? null : response.message();
        int iCode = response.code();
        boolean z = false;
        if (iCode != 401 && iCode != 404) {
            if (iCode == 429) {
                rateLimitExceededError = new ErrorResponse.Error.RateLimitExceededError("Quota exceeded", "");
            } else {
                HttpStatusCode httpStatusCode = HttpStatusCode.INSTANCE;
                PrimitiveRanges2 client_errors = httpStatusCode.getCLIENT_ERRORS();
                int first = client_errors.getFirst();
                if (iCode > client_errors.getLast() || first > iCode) {
                    PrimitiveRanges2 server_errors = httpStatusCode.getSERVER_ERRORS();
                    int first2 = server_errors.getFirst();
                    if (iCode > server_errors.getLast() || first2 > iCode) {
                        z = true;
                    }
                } else {
                    try {
                        responseBodyErrorBody = response.errorBody();
                    } catch (Exception e) {
                        if (!(e instanceof JsonDataException) && !(e instanceof IOException)) {
                            throw e;
                        }
                    }
                    ErrorResponse errorResponse = (responseBodyErrorBody == null || (bufferedSource = responseBodyErrorBody.getSource()) == null) ? null : (ErrorResponse) new Moshi.Builder().add(ErrorResponse.Companion.getAdapter()).add(UiComponentError.Companion).build().adapter(ErrorResponse.class).fromJson(bufferedSource.getBufferField().clone());
                    if (errorResponse != null && (errors8 = errorResponse.getErrors()) != null && (error = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors8)) != null) {
                        String description = error.getDescription();
                        if (description == null) {
                            description = error.getTitle();
                        }
                        if (description != null) {
                            strMessage2 = description;
                        }
                    }
                    if (errorResponse != null && (errors7 = errorResponse.getErrors()) != null && !errors7.isEmpty()) {
                        Iterator<T> it = errors7.iterator();
                        while (it.hasNext()) {
                            if (((ErrorResponse.Error) it.next()) instanceof ErrorResponse.Error.InactiveTemplateError) {
                                break;
                            }
                        }
                        if (errorResponse == null) {
                            if (errorResponse != null) {
                            }
                        }
                    } else if (errorResponse == null && (errors5 = errorResponse.getErrors()) != null && !errors5.isEmpty()) {
                        Iterator<T> it2 = errors5.iterator();
                        while (it2.hasNext()) {
                            if (((ErrorResponse.Error) it2.next()) instanceof ErrorResponse.Error.InvalidConfigError) {
                                break;
                            }
                        }
                        if (errorResponse != null) {
                            if (errorResponse != null) {
                            }
                        }
                    } else if (errorResponse != null && (errors4 = errorResponse.getErrors()) != null && !errors4.isEmpty()) {
                        Iterator<T> it3 = errors4.iterator();
                        while (it3.hasNext()) {
                            if (((ErrorResponse.Error) it3.next()) instanceof ErrorResponse.Error.UnauthenticatedError) {
                                break;
                            }
                        }
                        if (errorResponse != null) {
                            if (errorResponse != null) {
                            }
                        }
                    } else if (errorResponse != null && (errors3 = errorResponse.getErrors()) != null && !errors3.isEmpty()) {
                        Iterator<T> it4 = errors3.iterator();
                        while (it4.hasNext()) {
                            if (((ErrorResponse.Error) it4.next()) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                                break;
                            }
                        }
                        if (errorResponse != null) {
                            if (errorResponse == null) {
                            }
                        }
                    } else if (errorResponse != null && (errors2 = errorResponse.getErrors()) != null && !errors2.isEmpty()) {
                        Iterator<T> it5 = errors2.iterator();
                        while (it5.hasNext()) {
                            if (((ErrorResponse.Error) it5.next()) instanceof ErrorResponse.Error.TransitionFromTerminalStateError) {
                                break;
                            }
                        }
                        if (errorResponse == null) {
                            z = true;
                            if (errorResponse != null) {
                            }
                            if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                            }
                        }
                    } else if (errorResponse == null || (errors = errorResponse.getErrors()) == null || errors.isEmpty()) {
                        z = true;
                        if (errorResponse != null && (errors6 = errorResponse.getErrors()) != null) {
                            rateLimitExceededError = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors6);
                        }
                        if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                            ((ErrorResponse.Error.UnknownError) rateLimitExceededError).setErrorBody(response.errorBody());
                        }
                    } else {
                        Iterator<T> it6 = errors.iterator();
                        while (it6.hasNext()) {
                            if (((ErrorResponse.Error) it6.next()) instanceof ErrorResponse.Error.FieldNotFoundError) {
                                break;
                            }
                        }
                        z = true;
                        if (errorResponse != null) {
                            rateLimitExceededError = (ErrorResponse.Error) CollectionsKt.firstOrNull((List) errors6);
                        }
                        if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                        }
                    }
                }
            }
        }
        return new InternalErrorInfo.NetworkErrorInfo(response.code(), strMessage2, z, rateLimitExceededError);
    }

    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
