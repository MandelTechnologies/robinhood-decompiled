package com.robinhood.android.cortex.store.asset;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: AssetDigestTimestamps.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "j$/time/Instant", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$2$1", m3645f = "AssetDigestTimestamps.kt", m3646l = {40, 52}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestTimestamps3 extends ContinuationImpl7 implements Function2<FlowCollector<? super Instant>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock;
    final /* synthetic */ Instant $latestTimestamp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestTimestamps3(Clock clock, Instant instant, Continuation<? super AssetDigestTimestamps3> continuation) {
        super(2, continuation);
        this.$clock = clock;
        this.$latestTimestamp = instant;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestTimestamps3 assetDigestTimestamps3 = new AssetDigestTimestamps3(this.$clock, this.$latestTimestamp, continuation);
        assetDigestTimestamps3.L$0 = obj;
        return assetDigestTimestamps3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Instant> flowCollector, Continuation<? super Unit> continuation) {
        return ((AssetDigestTimestamps3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008c -> B:11:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Instant instantNow;
        Duration durationBetween;
        Duration durationOfSeconds;
        long millis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
        } else {
            if (i == 1) {
                instantNow = (Instant) this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                durationBetween = Duration.between(this.$latestTimestamp, instantNow);
                if (durationBetween.toHours() > 0) {
                    durationOfSeconds = Duration.ofHours(1L);
                } else if (durationBetween.toMinutes() > 0) {
                    durationOfSeconds = Duration.ofMinutes(1L);
                } else {
                    durationOfSeconds = Duration.ofSeconds(10L);
                }
                millis = durationOfSeconds.toMillis();
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 2;
                if (DelayKt.delay(millis, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        if (!JobKt.isActive(getContext())) {
            instantNow = Instant.now(this.$clock);
            Intrinsics.checkNotNull(instantNow);
            this.L$0 = flowCollector;
            this.L$1 = instantNow;
            this.label = 1;
            if (flowCollector.emit(instantNow, this) != coroutine_suspended) {
                durationBetween = Duration.between(this.$latestTimestamp, instantNow);
                if (durationBetween.toHours() > 0) {
                }
                millis = durationOfSeconds.toMillis();
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 2;
                if (DelayKt.delay(millis, this) != coroutine_suspended) {
                    if (!JobKt.isActive(getContext())) {
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        }
    }
}
