package com.twilio.twilsock.client;

import com.plaid.internal.EnumC7081g;
import com.twilio.util.ErrorInfo;
import com.twilio.util.Timer;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TwilsockRequest.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0005JB\u0010\"\u001a\u00020\r2\u000e\b\u0006\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0$2\u000e\b\u0006\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$2\u0014\b\u0006\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0\tH\u0086\bø\u0001\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006("}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockRequest;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "message", "Lcom/twilio/twilsock/client/TwilsockMessage;", "timeout", "Lkotlin/time/Duration;", "onFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "request", "", "(Lkotlinx/coroutines/CoroutineScope;Lcom/twilio/twilsock/client/TwilsockMessage;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deferredResponse", "Lkotlinx/coroutines/CompletableDeferred;", "getMessage", "()Lcom/twilio/twilsock/client/TwilsockMessage;", "getOnFinished", "()Lkotlin/jvm/functions/Function1;", "getTimeout-UwyO8pc", "()J", "J", "timer", "Lcom/twilio/util/Timer;", "awaitResponse", "T", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "complete", "response", "onReply", "onSuccess", "Lkotlin/Function0;", "onTimeout", "onFailure", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TwilsockRequest {
    private final CompletableDeferred<TwilsockMessage> deferredResponse;
    private final TwilsockMessage message;
    private final Function1<TwilsockRequest, Unit> onFinished;
    private final long timeout;
    private final Timer timer;

    /* compiled from: TwilsockRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockRequest", m3645f = "TwilsockRequest.kt", m3646l = {58}, m3647m = "awaitResponse")
    /* renamed from: com.twilio.twilsock.client.TwilsockRequest$awaitResponse$1 */
    static final class C435091<T extends TwilsockMessage> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C435091(Continuation<? super C435091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TwilsockRequest.this.awaitResponse(this);
        }
    }

    public /* synthetic */ TwilsockRequest(CoroutineScope coroutineScope, TwilsockMessage twilsockMessage, long j, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, twilsockMessage, j, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TwilsockRequest(CoroutineScope coroutineScope, TwilsockMessage message, long j, Function1<? super TwilsockRequest, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.message = message;
        this.timeout = j;
        this.onFinished = onFinished;
        this.deferredResponse = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        Timer timer = new Timer(coroutineScope);
        this.timer = timer;
        timer.cancel();
        timer.setJob(BuildersKt__Builders_commonKt.launch$default(timer.getScope(), null, null, new TwilsockRequest$special$$inlined$scheduleVtjQ1oo$1(j, timer, null, this), 3, null));
    }

    public final TwilsockMessage getMessage() {
        return this.message;
    }

    /* renamed from: getTimeout-UwyO8pc, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    public /* synthetic */ TwilsockRequest(CoroutineScope coroutineScope, TwilsockMessage twilsockMessage, long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, twilsockMessage, j, (i & 8) != 0 ? new Function1<TwilsockRequest, Unit>() { // from class: com.twilio.twilsock.client.TwilsockRequest.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TwilsockRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TwilsockRequest twilsockRequest) {
                invoke2(twilsockRequest);
                return Unit.INSTANCE;
            }
        } : function1, null);
    }

    public final Function1<TwilsockRequest, Unit> getOnFinished() {
        return this.onFinished;
    }

    public final void complete(TwilsockMessage response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.deferredResponse.isActive()) {
            this.timer.cancel();
            this.deferredResponse.complete(response);
            this.onFinished.invoke(this);
        }
    }

    public static /* synthetic */ void cancel$default(TwilsockRequest twilsockRequest, ErrorInfo errorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            errorInfo = new ErrorInfo(TwilioException2.Cancelled, 0, 0, "TwilsockRequest has been cancelled", (String) null, 22, (DefaultConstructorMarker) null);
        }
        twilsockRequest.cancel(errorInfo);
    }

    public final void cancel(ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        if (this.deferredResponse.isActive()) {
            TwilioLogger logger = TwilioLogger3.getLogger(this);
            if (logger.isDebugEnabled()) {
                logger.m3189d("cancel[" + this.message.getRequestId() + "] " + errorInfo, (Throwable) null);
            }
            this.timer.cancel();
            this.deferredResponse.completeExceptionally(new TwilioException(errorInfo, null, 2, null));
            this.onFinished.invoke(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends TwilsockMessage> Object awaitResponse(Continuation<? super T> continuation) {
        C435091 c435091;
        if (continuation instanceof C435091) {
            c435091 = (C435091) continuation;
            int i = c435091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435091.label = i - Integer.MIN_VALUE;
            } else {
                c435091 = new C435091(continuation);
            }
        }
        Object objAwait = c435091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            CompletableDeferred<TwilsockMessage> completableDeferred = this.deferredResponse;
            c435091.label = 1;
            objAwait = completableDeferred.await(c435091);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNull(objAwait, "null cannot be cast to non-null type T of com.twilio.twilsock.client.TwilsockRequest.awaitResponse");
        return (TwilsockMessage) objAwait;
    }

    public static /* synthetic */ void onReply$default(TwilsockRequest twilsockRequest, Function0 onSuccess, Function0 onTimeout, Function1 onFailure, int i, Object obj) {
        if ((i & 1) != 0) {
            onSuccess = new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockRequest.onReply.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onTimeout = new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockRequest.onReply.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            onFailure = new Function1<Throwable, Unit>() { // from class: com.twilio.twilsock.client.TwilsockRequest.onReply.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        twilsockRequest.deferredResponse.invokeOnCompletion(new C435134(onSuccess, onTimeout, onFailure));
    }

    /* compiled from: TwilsockRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m3636d2 = {"<anonymous>", "", "cause", "", "invoke"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.client.TwilsockRequest$onReply$4 */
    public static final class C435134 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ Function0<Unit> $onTimeout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C435134(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1) {
            super(1);
            this.$onSuccess = function0;
            this.$onTimeout = function02;
            this.$onFailure = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                this.$onSuccess.invoke();
            } else if ((th instanceof TwilioException) && ((TwilioException) th).getErrorInfo().getReason() == TwilioException2.Timeout) {
                this.$onTimeout.invoke();
            } else {
                this.$onFailure.invoke(th);
            }
        }
    }

    public final void onReply(Function0<Unit> onSuccess, Function0<Unit> onTimeout, Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.deferredResponse.invokeOnCompletion(new C435134(onSuccess, onTimeout, onFailure));
    }
}
