package com.robinhood.android.idl.common.polling;

import com.robinhood.android.idl.common.pagination.IdlPaginatedResult;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import com.robinhood.utils.http.Headers;
import com.robinhood.utils.http.Polling3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: IdlBackendPolling.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a{\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062*\b\u0002\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001ai\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\r\"\u0018\b\u0000\u0010\u0003*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013¢\u0006\u0004\b\u0019\u0010\u0016\"\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00018F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"P", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "T", "Lcom/robinhood/android/moria/network/Endpoint;", "params", "j$/time/Duration", "duration", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "saveAction", "Lkotlinx/coroutines/flow/Flow;", "backendPoll", "(Lcom/robinhood/android/moria/network/Endpoint;Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "interval", "", "retryIfNetworkError", "Lkotlin/Function1;", "block", "networkPollResponseWithBackendInterval", "(Lj$/time/Duration;ZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "", "networkPollAllPagesWithBackendInterval", "getPollInterval", "(Lcom/robinhood/idl/Response;)Lj$/time/Duration;", "pollInterval", "lib-api_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.polling.IdlBackendPollingKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IdlBackendPolling {
    public static /* synthetic */ Flow backendPoll$default(Endpoint endpoint, Object obj, Duration duration, Function3 function3, int i, Object obj2) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        if ((i & 4) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return backendPoll(endpoint, obj, duration, function3);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IdlBackendPolling.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idl.common.polling.IdlBackendPollingKt$backendPoll$1", m3645f = "IdlBackendPolling.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.idl.common.polling.IdlBackendPollingKt$backendPoll$1 */
    static final class C185621<T> extends ContinuationImpl7 implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ P $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        final /* synthetic */ Endpoint<P, T> $this_backendPoll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C185621(Endpoint<P, T> endpoint, P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C185621> continuation) {
            super(1, continuation);
            this.$this_backendPoll = endpoint;
            this.$params = p;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C185621(this.$this_backendPoll, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C185621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint<P, T> endpoint = this.$this_backendPoll;
            P p = this.$params;
            Function function = this.$saveAction;
            this.label = 1;
            Object objForceFetch = endpoint.forceFetch(p, function, this);
            return objForceFetch == coroutine_suspended ? coroutine_suspended : objForceFetch;
        }
    }

    public static final <P, T extends Response<? extends Dto3<?>>> Flow<T> backendPoll(Endpoint<P, T> endpoint, P p, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(networkPollResponseWithBackendInterval$default(duration, false, new C185621(endpoint, p, saveAction, null), 2, null), duration));
    }

    public static /* synthetic */ Flow networkPollResponseWithBackendInterval$default(Duration duration, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return networkPollResponseWithBackendInterval(duration, z, function1);
    }

    public static final <T extends Response<? extends Dto3<?>>> Flow<T> networkPollResponseWithBackendInterval(Duration interval, boolean z, Function1<? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(block, "block");
        return Polling3.networkPollWithBackendInterval(new Function1() { // from class: com.robinhood.android.idl.common.polling.IdlBackendPollingKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdlBackendPolling.networkPollResponseWithBackendInterval$lambda$0((Response) obj);
            }
        }, interval, z, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration networkPollResponseWithBackendInterval$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return getPollInterval(response);
    }

    public static /* synthetic */ Flow networkPollAllPagesWithBackendInterval$default(Duration duration, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return networkPollAllPagesWithBackendInterval(duration, z, function1);
    }

    public static final <T extends IdlPaginatedResult<? extends Response<? extends Dto3<?>>>> Flow<List<T>> networkPollAllPagesWithBackendInterval(Duration interval, boolean z, Function1<? super Continuation<? super List<? extends T>>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(block, "block");
        return Polling3.networkPollWithBackendInterval(new Function1() { // from class: com.robinhood.android.idl.common.polling.IdlBackendPollingKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdlBackendPolling.networkPollAllPagesWithBackendInterval$lambda$1((List) obj);
            }
        }, interval, z, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration networkPollAllPagesWithBackendInterval$lambda$1(List response) {
        Response response2;
        Intrinsics.checkNotNullParameter(response, "response");
        IdlPaginatedResult idlPaginatedResult = (IdlPaginatedResult) CollectionsKt.lastOrNull(response);
        if (idlPaginatedResult == null || (response2 = (Response) idlPaginatedResult.getResult()) == null) {
            return null;
        }
        return getPollInterval(response2);
    }

    public static final Duration getPollInterval(Response<?> response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Map<String, String> metadata = response.getMetadata();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = Headers.POLL_INTERVAL.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = metadata.get(lowerCase);
        if (str == null) {
            return null;
        }
        try {
            BigDecimal bigDecimalMultiply = new BigDecimal(str).multiply(new BigDecimal(1000));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return Duration.ofMillis(BigDecimals7.toLongRounded(bigDecimalMultiply));
        } catch (NumberFormatException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("NumberFormatException when parsing X-Poll-Interval:" + str, e), false, new EventMetadata(SentryTeam.MOBILE_PLATFORM, null, MapsKt.mapOf(Tuples4.m3642to(Headers.POLL_INTERVAL, str)), 2, null), 2, null);
            return null;
        }
    }
}
