package com.robinhood.android.data.store.logging.utils;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: EventLoggers.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\\\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00012\u001a\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001aL\u0010\u0000\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"logResponseMetadataAndUnwrap", "Lio/reactivex/Single;", "T", "Lcom/robinhood/analytics/EventLogger;", "responseSingle", "Lretrofit2/Response;", "successEventSupplier", "Lkotlin/Function1;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "errorEventSupplier", "", "baseEventData", "request", "Lkotlin/coroutines/Continuation;", "", "tag", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-logging-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.data.store.logging.utils.EventLoggersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class EventLoggers {

    /* compiled from: EventLoggers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.logging.utils.EventLoggersKt", m3645f = "EventLoggers.kt", m3646l = {60}, m3647m = "logResponseMetadataAndUnwrap")
    /* renamed from: com.robinhood.android.data.store.logging.utils.EventLoggersKt$logResponseMetadataAndUnwrap$3 */
    static final class C138523<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C138523(Continuation<? super C138523> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventLoggers.logResponseMetadataAndUnwrap(null, null, null, null, this);
        }
    }

    public static final <T> Single<T> logResponseMetadataAndUnwrap(final EventLogger eventLogger, Single<Response<T>> responseSingle, final Function1<? super Response<T>, UserInteractionEventData> function1, final Function1<? super Throwable, UserInteractionEventData> function12) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(responseSingle, "responseSingle");
        Single<T> singleDoOnError = responseSingle.flatMap(new Function() { // from class: com.robinhood.android.data.store.logging.utils.EventLoggersKt.logResponseMetadataAndUnwrap.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends T> apply(final Response<T> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    T tBody = response.body();
                    Intrinsics.checkNotNull(tBody);
                    Single singleJust = Single.just(tBody);
                    final Function1<Response<T>, UserInteractionEventData> function13 = function1;
                    final EventLogger eventLogger2 = eventLogger;
                    return singleJust.doOnSuccess(new Consumer() { // from class: com.robinhood.android.data.store.logging.utils.EventLoggersKt.logResponseMetadataAndUnwrap.1.1
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(T t) {
                            Function1<Response<T>, UserInteractionEventData> function14 = function13;
                            if (function14 != null) {
                                Response<T> response2 = response;
                                Intrinsics.checkNotNull(response2);
                                UserInteractionEventData userInteractionEventDataInvoke = function14.invoke(response2);
                                if (userInteractionEventDataInvoke != null) {
                                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger2, userInteractionEventDataInvoke, false, false, 6, null);
                                }
                            }
                        }
                    });
                }
                return Single.error(new HttpException(response));
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.android.data.store.logging.utils.EventLoggersKt.logResponseMetadataAndUnwrap.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                Function1<Throwable, UserInteractionEventData> function13 = function12;
                if (function13 != null) {
                    Intrinsics.checkNotNull(th);
                    UserInteractionEventData userInteractionEventDataInvoke = function13.invoke(th);
                    if (userInteractionEventDataInvoke != null) {
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, userInteractionEventDataInvoke, false, false, 6, null);
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
        return singleDoOnError;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x03eb, TRY_LEAVE, TryCatch #5 {all -> 0x03eb, blocks: (B:27:0x0062, B:29:0x006a, B:36:0x021f), top: B:67:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ee A[Catch: all -> 0x03e6, TryCatch #1 {all -> 0x03e6, blocks: (B:38:0x03db, B:44:0x03ee, B:45:0x0403), top: B:60:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object logResponseMetadataAndUnwrap(EventLogger eventLogger, UserInteractionEventData userInteractionEventData, Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, NetworkContext.Tag tag, Continuation<? super T> continuation) {
        C138523 c138523;
        EventLogger eventLogger2;
        UserInteractionEventData userInteractionEventData2;
        NetworkContext.Tag tag2;
        EventLogger eventLogger3;
        UserInteractionEventData userInteractionEventData3;
        UserInteractionEventData userInteractionEventData4;
        NetworkContext.Tag tag3;
        Context context;
        Context context2;
        UserInteractionEventData userInteractionEventData5;
        Response response;
        Context context3;
        if (continuation instanceof C138523) {
            c138523 = (C138523) continuation;
            int i = c138523.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c138523.label = i - Integer.MIN_VALUE;
            } else {
                c138523 = new C138523(continuation);
            }
        }
        Object objInvoke = c138523.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c138523.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            eventLogger2 = eventLogger;
            try {
                c138523.L$0 = eventLogger2;
                userInteractionEventData2 = userInteractionEventData;
                try {
                    c138523.L$1 = userInteractionEventData2;
                    tag2 = tag;
                    try {
                        c138523.L$2 = tag2;
                        c138523.label = 1;
                        objInvoke = function1.invoke(c138523);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        userInteractionEventData4 = userInteractionEventData2;
                        tag3 = tag2;
                        response = (Response) objInvoke;
                        if (!response.isSuccessful()) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        eventLogger3 = eventLogger2;
                        userInteractionEventData3 = userInteractionEventData2;
                        context = userInteractionEventData3.getContext();
                        if (context != null) {
                        }
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, UserInteractionEventData.copy$default(userInteractionEventData3, UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(th, tag2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    tag2 = tag;
                    eventLogger3 = eventLogger2;
                    userInteractionEventData3 = userInteractionEventData2;
                    context = userInteractionEventData3.getContext();
                    if (context != null) {
                    }
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, UserInteractionEventData.copy$default(userInteractionEventData3, UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(th, tag2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                userInteractionEventData2 = userInteractionEventData;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tag3 = (NetworkContext.Tag) c138523.L$2;
            UserInteractionEventData userInteractionEventData6 = (UserInteractionEventData) c138523.L$1;
            eventLogger3 = (EventLogger) c138523.L$0;
            try {
                ResultKt.throwOnFailure(objInvoke);
                userInteractionEventData4 = userInteractionEventData6;
                eventLogger2 = eventLogger3;
                try {
                    response = (Response) objInvoke;
                    try {
                        if (!response.isSuccessful()) {
                            Context context4 = userInteractionEventData4.getContext();
                            if (context4 == null) {
                                try {
                                    context3 = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
                                } catch (Throwable th4) {
                                    th = th4;
                                    tag2 = tag3;
                                    eventLogger3 = eventLogger2;
                                    userInteractionEventData3 = userInteractionEventData4;
                                }
                            } else {
                                context3 = context4;
                            }
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger2, UserInteractionEventData.copy$default(userInteractionEventData4, UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(context3, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext((Response<?>) response, tag3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                            Object objBody = response.body();
                            Intrinsics.checkNotNull(objBody);
                            return objBody;
                        }
                        ResponseBody responseBodyErrorBody = response.errorBody();
                        Intrinsics.checkNotNull(responseBodyErrorBody);
                        throw new HttpException(Response.error(responseBodyErrorBody, response.raw()));
                    } catch (Throwable th5) {
                        th = th5;
                        tag2 = tag3;
                        eventLogger3 = eventLogger2;
                        userInteractionEventData3 = userInteractionEventData5;
                        context = userInteractionEventData3.getContext();
                        if (context != null) {
                        }
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, UserInteractionEventData.copy$default(userInteractionEventData3, UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(th, tag2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    userInteractionEventData5 = userInteractionEventData4;
                }
            } catch (Throwable th7) {
                th = th7;
                tag2 = tag3;
                userInteractionEventData3 = userInteractionEventData6;
            }
        }
        context = userInteractionEventData3.getContext();
        if (context != null) {
            context2 = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
        } else {
            context2 = context;
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, UserInteractionEventData.copy$default(userInteractionEventData3, UserInteractionEventData.EventType.NETWORK, null, null, null, Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(th, tag2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
        throw th;
    }
}
