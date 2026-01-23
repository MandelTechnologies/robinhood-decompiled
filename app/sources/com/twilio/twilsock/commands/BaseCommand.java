package com.twilio.twilsock.commands;

import com.twilio.twilsock.client.Twilsock;
import com.twilio.twilsock.util.HttpResponse;
import com.twilio.twilsock.util.MultiMap;
import com.twilio.util.ErrorInfo;
import com.twilio.util.InternalUtils3;
import com.twilio.util.Retrier2;
import com.twilio.util.RetrierConfig;
import com.twilio.util.Timer;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import io.ktor.http.HttpStatusCode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: BaseCommand.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001bH¤@¢\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001dJ\u0006\u0010!\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m3636d2 = {"Lcom/twilio/twilsock/commands/BaseCommand;", "T", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Lcom/twilio/twilsock/commands/CommandsConfig;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/twilio/twilsock/commands/CommandsConfig;)V", "deferredResult", "Lkotlinx/coroutines/CompletableDeferred;", "<set-?>", "", "isCancelled", "()Z", "isExecuted", "job", "Lkotlinx/coroutines/Job;", "timer", "Lcom/twilio/util/Timer;", "awaitResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "execute", "twilsock", "Lcom/twilio/twilsock/client/Twilsock;", "makeRequest", "(Lcom/twilio/twilsock/client/Twilsock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRetrierAttempt", "Lkotlin/Result;", "onRetrierAttempt-gIAlu-s", "startTimer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class BaseCommand<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CommandsConfig config;
    private final CoroutineScope coroutineScope;
    private final CompletableDeferred<T> deferredResult;
    private boolean isCancelled;
    private boolean isExecuted;
    private Job job;
    private final Timer timer;

    /* compiled from: BaseCommand.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TwilioException2.values().length];
            try {
                iArr[TwilioException2.CannotParse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TwilioException2.CommandPermanentError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    protected static final MultiMap<String, String> generateHeaders() {
        return INSTANCE.generateHeaders();
    }

    @JvmStatic
    protected static final MultiMap<String, String> putRevision(MultiMap<String, String> multiMap, String str) {
        return INSTANCE.putRevision(multiMap, str);
    }

    @JvmStatic
    /* renamed from: putTtl-HG0u8IE, reason: not valid java name */
    protected static final void m27224putTtlHG0u8IE(JsonElementBuilders2 jsonElementBuilders2, long j) {
        INSTANCE.m27225putTtlHG0u8IE(jsonElementBuilders2, j);
    }

    protected abstract Object makeRequest(Twilsock twilsock, Continuation<? super T> continuation);

    public BaseCommand(CoroutineScope coroutineScope, CommandsConfig config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        this.coroutineScope = coroutineScope;
        this.config = config;
        this.timer = new Timer(coroutineScope);
        this.deferredResult = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
    }

    /* renamed from: isCancelled, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    public final void startTimer() {
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("startTimer commandTimeout: " + ((Object) Duration.m28761toStringimpl(this.config.m27231getCommandTimeoutUwyO8pc())), (Throwable) null);
        }
        Timer timer = this.timer;
        long jM27231getCommandTimeoutUwyO8pc = this.config.m27231getCommandTimeoutUwyO8pc();
        timer.cancel();
        timer.setJob(BuildersKt__Builders_commonKt.launch$default(timer.getScope(), null, null, new BaseCommand$startTimer$$inlined$scheduleVtjQ1oo$1(jM27231getCommandTimeoutUwyO8pc, timer, null, this), 3, null));
    }

    public final void execute(Twilsock twilsock) {
        Intrinsics.checkNotNullParameter(twilsock, "twilsock");
        if (this.isExecuted) {
            throw new IllegalStateException("Check failed.");
        }
        this.isExecuted = true;
        if (this.isCancelled) {
            return;
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435171(this, twilsock, null), 3, null);
    }

    /* compiled from: BaseCommand.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.commands.BaseCommand$execute$1", m3645f = "BaseCommand.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.commands.BaseCommand$execute$1 */
    static final class C435171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Twilsock $twilsock;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseCommand<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435171(BaseCommand<T> baseCommand, Twilsock twilsock, Continuation<? super C435171> continuation) {
            super(2, continuation);
            this.this$0 = baseCommand;
            this.$twilsock = twilsock;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435171 c435171 = new C435171(this.this$0, this.$twilsock, continuation);
            c435171.L$0 = obj;
            return c435171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BaseCommand<T> baseCommand = this.this$0;
                    Twilsock twilsock = this.$twilsock;
                    Result.Companion companion = Result.INSTANCE;
                    RetrierConfig retrierConfig = ((BaseCommand) baseCommand).config.getRetrierConfig();
                    BaseCommand2 baseCommand2 = new BaseCommand2(baseCommand, twilsock);
                    this.label = 1;
                    if (Retrier2.retry(retrierConfig, baseCommand2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            BaseCommand<T> baseCommand3 = this.this$0;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                ((BaseCommand) baseCommand3).deferredResult.completeExceptionally(thM28553exceptionOrNullimpl);
            }
            ((BaseCommand) this.this$0).timer.cancel();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final <T> Object invokeSuspend$retrierAttempt(BaseCommand<T> baseCommand, Twilsock twilsock, Continuation<? super Result<Unit>> continuation) throws Throwable {
            BaseCommand3 baseCommand3;
            if (continuation instanceof BaseCommand3) {
                baseCommand3 = (BaseCommand3) continuation;
                int i = baseCommand3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    baseCommand3.label = i - Integer.MIN_VALUE;
                } else {
                    baseCommand3 = new BaseCommand3(continuation);
                }
            }
            Object obj = baseCommand3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = baseCommand3.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(obj);
            baseCommand3.label = 1;
            Object objM27223onRetrierAttemptgIAlus = baseCommand.m27223onRetrierAttemptgIAlus(twilsock, baseCommand3);
            return objM27223onRetrierAttemptgIAlus == coroutine_suspended ? coroutine_suspended : objM27223onRetrierAttemptgIAlus;
        }
    }

    public final Object awaitResult(Continuation<? super T> continuation) {
        return this.deferredResult.await(continuation);
    }

    public static /* synthetic */ void cancel$default(BaseCommand baseCommand, ErrorInfo errorInfo, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i & 1) != 0) {
            errorInfo = new ErrorInfo(TwilioException2.Cancelled, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
        }
        baseCommand.cancel(errorInfo);
    }

    public final void cancel(ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        this.isCancelled = true;
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.timer.cancel();
        this.deferredResult.completeExceptionally(new TwilioException(errorInfo, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: onRetrierAttempt-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27223onRetrierAttemptgIAlus(Twilsock twilsock, Continuation<? super Result<Unit>> continuation) throws Throwable {
        BaseCommand4 baseCommand4;
        BaseCommand<T> baseCommand;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Throwable th;
        int i;
        if (continuation instanceof BaseCommand4) {
            baseCommand4 = (BaseCommand4) continuation;
            int i2 = baseCommand4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseCommand4.label = i2 - Integer.MIN_VALUE;
            } else {
                baseCommand4 = new BaseCommand4(this, continuation);
            }
        }
        Object objMakeRequest = baseCommand4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = baseCommand4.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objMakeRequest);
            try {
                Result.Companion companion = Result.INSTANCE;
                baseCommand4.L$0 = this;
                baseCommand4.label = 1;
                objMakeRequest = makeRequest(twilsock, baseCommand4);
                if (objMakeRequest != coroutine_suspended) {
                    baseCommand = this;
                }
            } catch (Throwable th2) {
                th = th2;
                baseCommand = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) baseCommand4.L$0;
            ResultKt.throwOnFailure(objMakeRequest);
            i = WhenMappings.$EnumSwitchMapping$0[((TwilioException) objMakeRequest).getErrorInfo().getReason().ordinal()];
            if (i != 1 || i == 2) {
                throw th;
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        baseCommand = (BaseCommand) baseCommand4.L$0;
        try {
            ResultKt.throwOnFailure(objMakeRequest);
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion22 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl(objMakeRequest);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioException2 twilioException2 = TwilioException2.Unknown;
            baseCommand4.L$0 = thM28553exceptionOrNullimpl;
            baseCommand4.label = 2;
            objMakeRequest = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, baseCommand4);
            if (objMakeRequest != coroutine_suspended) {
                th = thM28553exceptionOrNullimpl;
                i = WhenMappings.$EnumSwitchMapping$0[((TwilioException) objMakeRequest).getErrorInfo().getReason().ordinal()];
                if (i != 1) {
                    throw th;
                }
                throw th;
            }
            return coroutine_suspended;
        }
        baseCommand.deferredResult.complete(objM28550constructorimpl);
        return Result.m28550constructorimpl(Unit.INSTANCE);
    }

    /* compiled from: BaseCommand.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0005J\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004J\u001a\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0001\u0010\f\u0018\u0001*\u00020\bH\u0085H¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0005H\u0005J\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/twilio/twilsock/commands/BaseCommand$Companion;", "", "()V", "generateHeaders", "Lcom/twilio/twilsock/util/MultiMap;", "", "parseError", "Lcom/twilio/util/ErrorInfo;", "Lcom/twilio/twilsock/util/HttpResponse;", "reason", "Lcom/twilio/util/ErrorReason;", "parseResponse", "T", "(Lcom/twilio/twilsock/util/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putRevision", "revision", "putTtl", "", "Lkotlinx/serialization/json/JsonObjectBuilder;", "ttl", "Lkotlin/time/Duration;", "putTtl-HG0u8IE", "(Lkotlinx/serialization/json/JsonObjectBuilder;J)V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        protected final MultiMap<String, String> generateHeaders() {
            MultiMap<String, String> multiMap = new MultiMap<>();
            multiMap.set("Twilio-Request-Id", InternalUtils3.generateSID("RQ"));
            multiMap.set("Content-Type", "application/json; charset=utf-8");
            return multiMap;
        }

        @JvmStatic
        /* renamed from: putTtl-HG0u8IE, reason: not valid java name */
        protected final void m27225putTtlHG0u8IE(JsonElementBuilders2 putTtl, long j) {
            Intrinsics.checkNotNullParameter(putTtl, "$this$putTtl");
            JsonElementBuilders.put(putTtl, "ttl", Long.valueOf(!Duration.m28733equalsimpl0(j, Duration.INSTANCE.m28765getINFINITEUwyO8pc()) ? Duration.m28741getInWholeSecondsimpl(j) : 0L));
        }

        @JvmStatic
        protected final MultiMap<String, String> putRevision(MultiMap<String, String> multiMap, String revision) {
            Intrinsics.checkNotNullParameter(multiMap, "<this>");
            Intrinsics.checkNotNullParameter(revision, "revision");
            multiMap.set("If-Match", revision);
            return multiMap;
        }

        @JvmStatic
        protected final /* synthetic */ <T> Object parseResponse(HttpResponse httpResponse, Continuation<? super T> continuation) throws Throwable {
            Object objM28550constructorimpl;
            HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
            HttpStatusCode httpStatusCodeFromValue = companion.fromValue(httpResponse.getStatusCode());
            if (Intrinsics.areEqual(httpStatusCodeFromValue, companion.getOK()) ? true : Intrinsics.areEqual(httpStatusCodeFromValue, companion.getCreated()) ? true : Intrinsics.areEqual(httpStatusCodeFromValue, companion.getNoContent())) {
                Intrinsics.reifiedOperationMarker(4, "T");
                if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Object.class), Reflection.getOrCreateKotlinClass(Unit.class))) {
                    Unit unit = Unit.INSTANCE;
                    Intrinsics.reifiedOperationMarker(1, "T");
                    return unit;
                }
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    Json json = InternalUtils3.getJson();
                    String payload = httpResponse.getPayload();
                    SerializersModule serializersModule = json.getSerializersModule();
                    Intrinsics.reifiedOperationMarker(6, "T");
                    MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                    objM28550constructorimpl = Result.m28550constructorimpl(json.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), payload));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                TwilioException2 twilioException2 = TwilioException2.CannotParse;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl == null) {
                    return objM28550constructorimpl;
                }
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object twilioException = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, null);
                InlineMarker.mark(1);
                Unit unit2 = Unit.INSTANCE;
                throw ((Throwable) twilioException);
            }
            if (Intrinsics.areEqual(httpStatusCodeFromValue, companion.getServiceUnavailable()) ? true : Intrinsics.areEqual(httpStatusCodeFromValue, companion.getGatewayTimeout()) ? true : Intrinsics.areEqual(httpStatusCodeFromValue, companion.getBadGateway()) ? true : Intrinsics.areEqual(httpStatusCodeFromValue, companion.getTooManyRequests())) {
                throw new TwilioException(parseError(httpResponse, TwilioException2.CommandRecoverableError), null, 2, null);
            }
            throw new TwilioException(parseError(httpResponse, TwilioException2.CommandPermanentError), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final ErrorInfo parseError(HttpResponse httpResponse, TwilioException2 reason) {
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(httpResponse, "<this>");
            Intrinsics.checkNotNullParameter(reason, "reason");
            try {
                Result.Companion companion = Result.INSTANCE;
                Json json = InternalUtils3.getJson();
                String payload = httpResponse.getPayload();
                json.getSerializersModule();
                objM28550constructorimpl = Result.m28550constructorimpl((ErrorInfo) json.decodeFromString(ErrorInfo.INSTANCE.serializer(), payload));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                objM28550constructorimpl = new ErrorInfo((TwilioException2) null, httpResponse.getStatusCode(), 0, httpResponse.getStatus(), (String) null, 21, (DefaultConstructorMarker) null);
            }
            return ErrorInfo.copy$default((ErrorInfo) objM28550constructorimpl, reason, 0, 0, null, null, 30, null);
        }
    }
}
