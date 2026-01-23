package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GovernmentIdHintWorker.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 $2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003$%&B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006'"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/GovernmentIdFeed;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)V", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "it", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$HintEvent;", "getHintEventFor", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;)Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$HintEvent;", "otherWorker", "", "doesSameWorkAs", "(Lcom/squareup/workflow1/Worker;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "Companion", "HintEvent", "Factory", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class GovernmentIdHintWorker implements Worker<Hint> {
    private final Context context;
    private final GovernmentIdFeed governmentIdFeed;
    private final IdConfig.Side side;

    /* compiled from: GovernmentIdHintWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        GovernmentIdHintWorker create(IdConfig.Side side);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) other;
        return Intrinsics.areEqual(this.context, governmentIdHintWorker.context) && Intrinsics.areEqual(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }

    public GovernmentIdHintWorker(Context context, GovernmentIdFeed governmentIdFeed, IdConfig.Side side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Hint> run() {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new C435991(FlowKt.flow(new GovernmentIdHintWorker3(this, null)), null)));
    }

    /* compiled from: GovernmentIdHintWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", m3645f = "GovernmentIdHintWorker.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1 */
    static final class C435991 extends ContinuationImpl7 implements Function2<FlowCollector<? super Hint>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<HintEvent> $hintFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435991(Flow<HintEvent> flow, Continuation<? super C435991> continuation) {
            super(2, continuation);
            this.$hintFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435991 c435991 = new C435991(this.$hintFlow, continuation);
            c435991.L$0 = obj;
            return c435991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Hint> flowCollector, Continuation<? super Unit> continuation) {
            return ((C435991) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowConflate = FlowKt.conflate(this.$hintFlow);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
                this.label = 1;
                if (flowConflate.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GovernmentIdHintWorker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<Hint> $$this$flow;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(FlowCollector<? super Hint> flowCollector) {
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(r8, r0) == r1) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(HintEvent hintEvent, Continuation<? super Unit> continuation) {
                GovernmentIdHintWorker2 governmentIdHintWorker2;
                if (continuation instanceof GovernmentIdHintWorker2) {
                    governmentIdHintWorker2 = (GovernmentIdHintWorker2) continuation;
                    int i = governmentIdHintWorker2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        governmentIdHintWorker2.label = i - Integer.MIN_VALUE;
                    } else {
                        governmentIdHintWorker2 = new GovernmentIdHintWorker2(this, continuation);
                    }
                }
                Object obj = governmentIdHintWorker2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = governmentIdHintWorker2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector<Hint> flowCollector = this.$$this$flow;
                    Hint hint = hintEvent != null ? hintEvent.getHint() : null;
                    governmentIdHintWorker2.L$0 = hintEvent;
                    governmentIdHintWorker2.label = 1;
                    if (flowCollector.emit(hint, governmentIdHintWorker2) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                hintEvent = (HintEvent) governmentIdHintWorker2.L$0;
                ResultKt.throwOnFailure(obj);
                long jCoerceAtLeast = RangesKt.coerceAtLeast(hintEvent != null ? hintEvent.getMinDurationMs() : 0L, 33L);
                governmentIdHintWorker2.L$0 = null;
                governmentIdHintWorker2.label = 2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((HintEvent) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HintEvent getHintEventFor(GovernmentIdFeed5 it) {
        if (it instanceof GovernmentIdFeed5.ParsedIdSide) {
            return new HintEvent(Hint2.INSTANCE, 1000L);
        }
        ImageLightCondition imageLightCondition = it.getImageLightCondition();
        if (imageLightCondition == null) {
            return null;
        }
        boolean z = imageLightCondition.getRmsContrast() < 0.2d || imageLightCondition.getLowHighContrast() < 0.2d;
        boolean z2 = imageLightCondition.getRmsContrast() > 0.3d && imageLightCondition.getLowHighContrast() > 0.5d;
        if ((imageLightCondition.getLuminosity() >= 0.34d || z2) && (imageLightCondition.getLuminosity() >= 0.45d || !z)) {
            return null;
        }
        return new HintEvent(Hint3.INSTANCE, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GovernmentIdHintWorker.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$HintEvent;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "getHint", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "J", "getMinDurationMs", "()J", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final /* data */ class HintEvent {
        private final Hint hint;
        private final long minDurationMs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintEvent)) {
                return false;
            }
            HintEvent hintEvent = (HintEvent) other;
            return Intrinsics.areEqual(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
        }

        public int hashCode() {
            return (this.hint.hashCode() * 31) + Long.hashCode(this.minDurationMs);
        }

        public String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=" + this.minDurationMs + ")";
        }

        public HintEvent(Hint hint, long j) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j;
        }

        public final Hint getHint() {
            return this.hint;
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }
    }
}
