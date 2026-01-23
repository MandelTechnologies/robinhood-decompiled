package com.twilio.conversations.twilsock;

import com.robinhood.utils.http.Headers;
import com.twilio.conversations.twilsock.JniFuture;
import com.twilio.twilsock.util.HandledInCppException;
import com.twilio.twilsock.util.HttpResponse;
import com.twilio.util.ErrorInfo;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: JniFuture.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J%\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0082 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/twilio/conversations/twilsock/JniFuture;", "T", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "nativeId", "", "deferred", "Lkotlinx/coroutines/Deferred;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;ILkotlinx/coroutines/Deferred;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getNativeId", "()I", "getDeferred", "()Lkotlinx/coroutines/Deferred;", "cancel", "", "onHandledInCpp", "nativeNotifyCompleted", "isSuccess", "", "result", "", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class JniFuture<T> {
    private final CoroutineScope coroutineScope;
    private final Deferred<T> deferred;
    private final int nativeId;

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeNotifyCompleted(int nativeId, boolean isSuccess, String result);

    /* JADX WARN: Multi-variable type inference failed */
    public JniFuture(CoroutineScope coroutineScope, int i, Deferred<? extends T> deferred) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        this.coroutineScope = coroutineScope;
        this.nativeId = i;
        this.deferred = deferred;
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("init: " + i, (Throwable) null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C434542(this, null), 3, null);
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final int getNativeId() {
        return this.nativeId;
    }

    public final Deferred<T> getDeferred() {
        return this.deferred;
    }

    /* compiled from: JniFuture.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.JniFuture$2", m3645f = "JniFuture.kt", m3646l = {26, 57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.conversations.twilsock.JniFuture$2 */
    static final class C434542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ JniFuture<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C434542(JniFuture<T> jniFuture, Continuation<? super C434542> continuation) {
            super(2, continuation);
            this.this$0 = jniFuture;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C434542 c434542 = new C434542(this.this$0, continuation);
            c434542.L$0 = obj;
            return c434542;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final Object objM28550constructorimpl;
            JniFuture<T> jniFuture;
            CoroutineScope coroutineScope;
            TwilioLogger logger;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = (CoroutineScope) this.L$0;
                JniFuture<T> jniFuture2 = this.this$0;
                Result.Companion companion2 = Result.INSTANCE;
                Deferred<T> deferred = jniFuture2.getDeferred();
                this.L$0 = coroutineScope2;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jniFuture = (JniFuture) this.L$2;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ErrorInfo errorInfo = ((TwilioException) obj).getErrorInfo();
                    logger = TwilioLogger3.getLogger(coroutineScope);
                    if (logger.isDebugEnabled()) {
                        logger.m3189d("JniFuture onFailure: " + errorInfo, (Throwable) null);
                    }
                    int nativeId = jniFuture.getNativeId();
                    Json.Companion companion3 = Json.INSTANCE;
                    companion3.getSerializersModule();
                    jniFuture.nativeNotifyCompleted(nativeId, false, companion3.encodeToString(ErrorInfo.INSTANCE.serializer(), errorInfo));
                    return Unit.INSTANCE;
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(obj);
            JniFuture<T> jniFuture3 = this.this$0;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                TwilioLogger logger2 = TwilioLogger3.getLogger(coroutineScope2);
                if (logger2.isDebugEnabled()) {
                    logger2.m3189d("JniFuture onSuccess: " + objM28550constructorimpl, (Throwable) null);
                }
                if (objM28550constructorimpl instanceof HttpResponse) {
                    JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
                    HttpResponse httpResponse = (HttpResponse) objM28550constructorimpl;
                    JsonElementBuilders.put(jsonElementBuilders2, "statusCode", boxing.boxInt(httpResponse.getStatusCode()));
                    JsonElementBuilders.put(jsonElementBuilders2, "status", httpResponse.getStatus());
                    JsonElementBuilders.put(jsonElementBuilders2, "payload", httpResponse.getPayload());
                    JsonElementBuilders.putJsonObject(jsonElementBuilders2, "headers", new Function1() { // from class: com.twilio.conversations.twilsock.JniFuture$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return JniFuture.C434542.invokeSuspend$lambda$6$lambda$5$lambda$4(objM28550constructorimpl, (JsonElementBuilders2) obj2);
                        }
                    });
                    jniFuture3.nativeNotifyCompleted(jniFuture3.getNativeId(), true, jsonElementBuilders2.build().toString());
                } else {
                    JniFuture.nativeNotifyCompleted$default(jniFuture3, jniFuture3.getNativeId(), true, null, 4, null);
                }
            }
            jniFuture = this.this$0;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                if (thM28553exceptionOrNullimpl instanceof HandledInCppException) {
                    TwilioLogger logger3 = TwilioLogger3.getLogger(coroutineScope2);
                    if (logger3.isDebugEnabled()) {
                        logger3.m3189d("Request handled successfully on CPP level", (Throwable) null);
                    }
                } else {
                    TwilioException2 twilioException2 = TwilioException2.Unknown;
                    this.L$0 = coroutineScope2;
                    this.L$1 = objM28550constructorimpl;
                    this.L$2 = jniFuture;
                    this.label = 2;
                    obj = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, this);
                    if (obj != coroutine_suspended) {
                        coroutineScope = coroutineScope2;
                        ErrorInfo errorInfo2 = ((TwilioException) obj).getErrorInfo();
                        logger = TwilioLogger3.getLogger(coroutineScope);
                        if (logger.isDebugEnabled()) {
                        }
                        int nativeId2 = jniFuture.getNativeId();
                        Json.Companion companion32 = Json.INSTANCE;
                        companion32.getSerializersModule();
                        jniFuture.nativeNotifyCompleted(nativeId2, false, companion32.encodeToString(ErrorInfo.INSTANCE.serializer(), errorInfo2));
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$6$lambda$5$lambda$4(Object obj, JsonElementBuilders2 jsonElementBuilders2) {
            HttpResponse httpResponse = (HttpResponse) obj;
            Set<String> set = httpResponse.getHeaders().get(Headers.RETRY_AFTER);
            if (set == null) {
                set = httpResponse.getHeaders().get("retry-after");
            }
            if (set != null) {
                JsonElementBuilders.put(jsonElementBuilders2, Headers.RETRY_AFTER, (String) CollectionsKt.first(set));
            }
            Set<String> set2 = httpResponse.getHeaders().get(Headers.LOCATION);
            if (set2 == null) {
                set2 = httpResponse.getHeaders().get("location");
            }
            if (set2 != null) {
                JsonElementBuilders.put(jsonElementBuilders2, Headers.LOCATION, (String) CollectionsKt.first(set2));
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancel() {
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("cancel: " + this.nativeId, (Throwable) null);
        }
        Job.DefaultImpls.cancel$default(this.deferred, null, 1, null);
    }

    public final void onHandledInCpp() {
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("onHandledInCpp: " + this.nativeId, (Throwable) null);
        }
        this.deferred.cancel((CancellationException) new HandledInCppException());
    }

    static /* synthetic */ void nativeNotifyCompleted$default(JniFuture jniFuture, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        jniFuture.nativeNotifyCompleted(i, z, str);
    }
}
