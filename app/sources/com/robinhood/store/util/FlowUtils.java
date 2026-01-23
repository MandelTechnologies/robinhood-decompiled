package com.robinhood.store.util;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: FlowUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeout", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function1;", "", "filter", "filterUntilTimeout", "(Lkotlinx/coroutines/flow/Flow;JLj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "lib-store-event_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.util.FlowUtilsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FlowUtils {
    public static final <T> Flow<T> filterUntilTimeout(Flow<? extends T> flow, long j, Clock clock, Function1<? super T, Boolean> filter) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Long.MAX_VALUE;
        return FlowKt.transformLatest(FlowKt.onStart(flow, new C416351(longRef, clock, null)), new C416362(clock, longRef, j, filter, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowUtils.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.util.FlowUtilsKt$filterUntilTimeout$1", m3645f = "FlowUtils.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.util.FlowUtilsKt$filterUntilTimeout$1 */
    static final class C416351<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ Ref.LongRef $startTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416351(Ref.LongRef longRef, Clock clock, Continuation<? super C416351> continuation) {
            super(2, continuation);
            this.$startTime = longRef;
            this.$clock = clock;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C416351(this.$startTime, this.$clock, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C416351) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$startTime.element = this.$clock.millis();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.util.FlowUtilsKt$filterUntilTimeout$2", m3645f = "FlowUtils.kt", m3646l = {25, 28, 29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.util.FlowUtilsKt$filterUntilTimeout$2 */
    static final class C416362<T> extends ContinuationImpl7 implements Function3<FlowCollector<? super T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ Function1<T, Boolean> $filter;
        final /* synthetic */ Ref.LongRef $startTime;
        final /* synthetic */ long $timeout;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C416362(Clock clock, Ref.LongRef longRef, long j, Function1<? super T, Boolean> function1, Continuation<? super C416362> continuation) {
            super(3, continuation);
            this.$clock = clock;
            this.$startTime = longRef;
            this.$timeout = j;
            this.$filter = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector<? super FlowCollector<? super T>>) obj, (FlowCollector<? super T>) obj2, continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, T t, Continuation<? super Unit> continuation) {
            C416362 c416362 = new C416362(this.$clock, this.$startTime, this.$timeout, this.$filter, continuation);
            c416362.L$0 = flowCollector;
            c416362.L$1 = t;
            return c416362.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            if (r3.emit(r1, r12) != r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r13.emit(r1, r12) == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                obj2 = this.L$1;
                long jMillis = this.$clock.millis() - this.$startTime.element;
                if (jMillis >= this.$timeout || ((Boolean) this.$filter.invoke(obj2)).booleanValue()) {
                    this.L$0 = null;
                    this.label = 1;
                } else {
                    long jMax = this.$timeout - Math.max(jMillis, 0L);
                    this.L$0 = flowCollector2;
                    this.L$1 = obj2;
                    this.label = 2;
                    if (DelayKt.delay(jMax, this) != coroutine_suspended) {
                        flowCollector = flowCollector2;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }
}
