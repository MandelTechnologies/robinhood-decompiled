package com.robinhood.android.lib.futures.trade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: GetMarketSessionChangeState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001ab\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u000023\u0010\n\u001a/\b\u0001\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lkotlin/Function0;", "j$/time/Instant", "getNow", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "now", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/android/lib/futures/trade/Session;", "", "getNextOpenSession", "Lcom/robinhood/utils/resource/StringResource;", "prefixString", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "getMarketSessionChangeState", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/resource/StringResource;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "nextOpenSession", "", "countDownWithinOneDay", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/lib/futures/trade/Session;Lcom/robinhood/utils/resource/StringResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class GetMarketSessionChangeState2 {

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt", m3645f = "GetMarketSessionChangeState.kt", m3646l = {97, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "countDownWithinOneDay")
    /* renamed from: com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt$countDownWithinOneDay$1 */
    static final class C202851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C202851(Continuation<? super C202851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetMarketSessionChangeState2.countDownWithinOneDay(null, null, null, null, this);
        }
    }

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt$getMarketSessionChangeState$1 */
    /* synthetic */ class C202861 extends FunctionReferenceImpl implements Function0<Instant> {
        public static final C202861 INSTANCE = new C202861();

        C202861() {
            super(0, Instant.class, "now", "now()Ljava/time/Instant;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Instant invoke() {
            return Instant.now();
        }
    }

    public static /* synthetic */ Flow getMarketSessionChangeState$default(Function0 function0, Function2 function2, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C202861.INSTANCE;
        }
        return getMarketSessionChangeState(function0, function2, stringResource);
    }

    /* compiled from: GetMarketSessionChangeState.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt$getMarketSessionChangeState$2", m3645f = "GetMarketSessionChangeState.kt", m3646l = {28, 31, 43, 57, 63, 67, 78, 82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.futures.trade.GetMarketSessionChangeStateKt$getMarketSessionChangeState$2 */
    static final class C202872 extends ContinuationImpl7 implements Function2<FlowCollector<? super MarketSessionChangeDataState>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Instant, Continuation<? super Session>, Object> $getNextOpenSession;
        final /* synthetic */ Function0<Instant> $getNow;
        final /* synthetic */ StringResource $prefixString;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C202872(Function0<Instant> function0, Function2<? super Instant, ? super Continuation<? super Session>, ? extends Object> function2, StringResource stringResource, Continuation<? super C202872> continuation) {
            super(2, continuation);
            this.$getNow = function0;
            this.$getNextOpenSession = function2;
            this.$prefixString = stringResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C202872 c202872 = new C202872(this.$getNow, this.$getNextOpenSession, this.$prefixString, continuation);
            c202872.L$0 = obj;
            return c202872;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MarketSessionChangeDataState> flowCollector, Continuation<? super Unit> continuation) {
            return ((C202872) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        
            if (r4.emit(r2, r17) == r1) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        
            if (r4.emit(r2, r17) == r1) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[PHI: r2
          0x0052: PHI (r2v28 kotlinx.coroutines.flow.FlowCollector) = 
          (r2v2 kotlinx.coroutines.flow.FlowCollector)
          (r2v8 kotlinx.coroutines.flow.FlowCollector)
          (r2v9 kotlinx.coroutines.flow.FlowCollector)
          (r2v17 kotlinx.coroutines.flow.FlowCollector)
          (r2v30 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:12:0x004b, B:7:0x0021, B:38:0x00f7, B:52:0x0155, B:47:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:13:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0132 -> B:46:0x0135). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0155 -> B:13:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Instant instant;
            FlowCollector flowCollector2;
            Object objInvoke;
            long j;
            Session session;
            long j2;
            long j3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    Instant instantInvoke = this.$getNow.invoke();
                    Function2<Instant, Continuation<? super Session>, Object> function2 = this.$getNextOpenSession;
                    this.L$0 = flowCollector;
                    this.L$1 = instantInvoke;
                    this.label = 1;
                    objInvoke = function2.invoke(instantInvoke, this);
                    if (objInvoke != coroutine_suspended) {
                        flowCollector2 = flowCollector;
                        instant = instantInvoke;
                        session = (Session) objInvoke;
                        if (session != null) {
                            MarketSessionChangeDataState marketSessionChangeDataState = new MarketSessionChangeDataState(null, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                            break;
                        } else {
                            long epochMilli = session.getEndTime().toEpochMilli() - instant.toEpochMilli();
                            if (epochMilli <= 0) {
                                MarketSessionChangeDataState marketSessionChangeDataState2 = new MarketSessionChangeDataState(null, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 3;
                                break;
                            } else {
                                long epochMilli2 = session.getStartTime().toEpochMilli() - instant.toEpochMilli();
                                Duration.Companion companion = Duration.INSTANCE;
                                long jM28738getInWholeMillisecondsimpl = Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(1, DurationUnitJvm.DAYS));
                                if (epochMilli2 <= 0) {
                                    MarketSessionChangeDataState marketSessionChangeDataState3 = new MarketSessionChangeDataState(boxing.boxBoolean(true), null);
                                    this.L$0 = flowCollector2;
                                    this.L$1 = null;
                                    this.J$0 = epochMilli;
                                    this.label = 4;
                                    if (flowCollector2.emit(marketSessionChangeDataState3, this) != coroutine_suspended) {
                                        flowCollector = flowCollector2;
                                        j = epochMilli;
                                        this.L$0 = flowCollector;
                                        this.label = 5;
                                        if (DelayKt.delay(j, this) != coroutine_suspended) {
                                        }
                                    }
                                } else if (epochMilli2 > jM28738getInWholeMillisecondsimpl) {
                                    MarketSessionChangeDataState marketSessionChangeDataState4 = new MarketSessionChangeDataState(boxing.boxBoolean(false), StringResource.INSTANCE.invoke(C20288R.string.futures_ladder_market_closed_header_long, this.$prefixString, InstantFormatter.LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE.format(session.getStartTime())));
                                    this.L$0 = flowCollector2;
                                    this.L$1 = null;
                                    this.J$0 = epochMilli2;
                                    this.J$1 = jM28738getInWholeMillisecondsimpl;
                                    this.label = 6;
                                    if (flowCollector2.emit(marketSessionChangeDataState4, this) != coroutine_suspended) {
                                        flowCollector = flowCollector2;
                                        j2 = epochMilli2;
                                        j3 = jM28738getInWholeMillisecondsimpl;
                                        this.L$0 = flowCollector;
                                        this.label = 7;
                                        if (DelayKt.delay(j2 - j3, this) != coroutine_suspended) {
                                            Instant instantInvoke2 = this.$getNow.invoke();
                                            Function2<Instant, Continuation<? super Session>, Object> function22 = this.$getNextOpenSession;
                                            this.L$0 = flowCollector;
                                            this.L$1 = instantInvoke2;
                                            this.label = 1;
                                            objInvoke = function22.invoke(instantInvoke2, this);
                                            if (objInvoke != coroutine_suspended) {
                                            }
                                        }
                                    }
                                } else {
                                    Function0<Instant> function0 = this.$getNow;
                                    StringResource stringResource = this.$prefixString;
                                    this.L$0 = flowCollector2;
                                    this.L$1 = null;
                                    this.label = 8;
                                    if (GetMarketSessionChangeState2.countDownWithinOneDay(flowCollector2, function0, session, stringResource, this) != coroutine_suspended) {
                                        flowCollector = flowCollector2;
                                        Instant instantInvoke22 = this.$getNow.invoke();
                                        Function2<Instant, Continuation<? super Session>, Object> function222 = this.$getNextOpenSession;
                                        this.L$0 = flowCollector;
                                        this.L$1 = instantInvoke22;
                                        this.label = 1;
                                        objInvoke = function222.invoke(instantInvoke22, this);
                                        if (objInvoke != coroutine_suspended) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    instant = (Instant) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objInvoke = obj;
                    session = (Session) objInvoke;
                    if (session != null) {
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 4:
                    j = this.J$0;
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = flowCollector;
                    this.label = 5;
                    if (DelayKt.delay(j, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                case 7:
                case 8:
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Instant instantInvoke222 = this.$getNow.invoke();
                    Function2<Instant, Continuation<? super Session>, Object> function2222 = this.$getNextOpenSession;
                    this.L$0 = flowCollector;
                    this.L$1 = instantInvoke222;
                    this.label = 1;
                    objInvoke = function2222.invoke(instantInvoke222, this);
                    if (objInvoke != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    j3 = this.J$1;
                    j2 = this.J$0;
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = flowCollector;
                    this.label = 7;
                    if (DelayKt.delay(j2 - j3, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Flow<MarketSessionChangeDataState> getMarketSessionChangeState(Function0<Instant> getNow, Function2<? super Instant, ? super Continuation<? super Session>, ? extends Object> getNextOpenSession, StringResource prefixString) {
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        Intrinsics.checkNotNullParameter(getNextOpenSession, "getNextOpenSession");
        Intrinsics.checkNotNullParameter(prefixString, "prefixString");
        return FlowKt.flow(new C202872(getNow, getNextOpenSession, prefixString, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r0, r8) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0145 -> B:41:0x014f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object countDownWithinOneDay(FlowCollector<? super MarketSessionChangeDataState> flowCollector, Function0<Instant> function0, Session session, StringResource stringResource, Continuation<? super Unit> continuation) {
        C202851 c202851;
        FlowCollector flowCollector2;
        Session session2;
        StringResource stringResource2;
        C202851 c2028512;
        Function0<Instant> function02;
        FlowCollector flowCollector3;
        Function0<Instant> function03;
        Session session3;
        StringResource stringResource3;
        long duration;
        char c;
        p479j$.time.Duration durationBetween;
        StringResource stringResourceInvoke;
        if (continuation instanceof C202851) {
            c202851 = (C202851) continuation;
            int i = c202851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c202851.label = i - Integer.MIN_VALUE;
            } else {
                c202851 = new C202851(continuation);
            }
        }
        Object obj = c202851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c202851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector;
            session2 = session;
            stringResource2 = stringResource;
            c2028512 = c202851;
            function02 = function0;
            durationBetween = p479j$.time.Duration.between(function02.invoke(), session2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            if (durationBetween.toMillis() < 1000) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            stringResource3 = (StringResource) c202851.L$3;
            session3 = (Session) c202851.L$2;
            function03 = (Function0) c202851.L$1;
            flowCollector3 = (FlowCollector) c202851.L$0;
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
            c202851.L$0 = flowCollector3;
            c202851.L$1 = function03;
            c202851.L$2 = session3;
            c202851.L$3 = stringResource3;
            c = 3;
            c202851.label = 3;
            if (DelayKt.m28786delayVtjQ1oo(duration, c202851) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        StringResource stringResource4 = (StringResource) c202851.L$3;
        Session session4 = (Session) c202851.L$2;
        Function0<Instant> function04 = (Function0) c202851.L$1;
        flowCollector3 = (FlowCollector) c202851.L$0;
        ResultKt.throwOnFailure(obj);
        c2028512 = c202851;
        function02 = function04;
        stringResource2 = stringResource4;
        session2 = session4;
        c = 3;
        flowCollector2 = flowCollector3;
        durationBetween = p479j$.time.Duration.between(function02.invoke(), session2.getStartTime());
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        if (durationBetween.toMillis() < 1000) {
            long millis = durationBetween.toMillis();
            c2028512.L$0 = null;
            c2028512.L$1 = null;
            c2028512.L$2 = null;
            c2028512.L$3 = null;
            c2028512.label = 1;
        } else {
            long hours = durationBetween.toHours();
            p479j$.time.Duration durationMinusHours = durationBetween.minusHours(hours);
            long minutes = durationMinusHours.toMinutes();
            long seconds = durationMinusHours.minusMinutes(minutes).getSeconds();
            if (hours > 0) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C20288R.string.futures_ladder_market_closed_header_hhmmss, stringResource2, boxing.boxLong(hours), boxing.boxLong(minutes), boxing.boxLong(seconds));
            } else if (minutes > 0) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C20288R.string.futures_ladder_market_closed_header_mmss, stringResource2, boxing.boxLong(minutes), boxing.boxLong(seconds));
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C20288R.string.futures_ladder_market_closed_header_ss, stringResource2, boxing.boxLong(seconds));
            }
            MarketSessionChangeDataState marketSessionChangeDataState = new MarketSessionChangeDataState(boxing.boxBoolean(false), stringResourceInvoke);
            c2028512.L$0 = flowCollector2;
            c2028512.L$1 = function02;
            c2028512.L$2 = session2;
            c2028512.L$3 = stringResource2;
            c2028512.label = 2;
            if (flowCollector2.emit(marketSessionChangeDataState, c2028512) != coroutine_suspended) {
                C202851 c2028513 = c2028512;
                function03 = function02;
                c202851 = c2028513;
                StringResource stringResource5 = stringResource2;
                session3 = session2;
                stringResource3 = stringResource5;
                flowCollector3 = flowCollector2;
                Duration.Companion companion2 = Duration.INSTANCE;
                duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                c202851.L$0 = flowCollector3;
                c202851.L$1 = function03;
                c202851.L$2 = session3;
                c202851.L$3 = stringResource3;
                c = 3;
                c202851.label = 3;
                if (DelayKt.m28786delayVtjQ1oo(duration, c202851) != coroutine_suspended) {
                    Function0<Instant> function05 = function03;
                    c2028512 = c202851;
                    function02 = function05;
                    Session session5 = session3;
                    stringResource2 = stringResource3;
                    session2 = session5;
                    flowCollector2 = flowCollector3;
                    durationBetween = p479j$.time.Duration.between(function02.invoke(), session2.getStartTime());
                    Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                    if (durationBetween.toMillis() < 1000) {
                    }
                }
            }
        }
        return coroutine_suspended;
    }
}
