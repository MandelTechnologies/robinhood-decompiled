package com.robinhood.android.cortex.digest.common.sources;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CortexArticleSources.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$CortexArticleSourceItem$1$1", m3645f = "CortexArticleSources.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$CortexArticleSourceItem$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CortexArticleSources4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock;
    final /* synthetic */ SnapshotState<Instant> $now$delegate;
    final /* synthetic */ Instant $publishedAt;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CortexArticleSources4(Clock clock, Instant instant, SnapshotState<Instant> snapshotState, Continuation<? super CortexArticleSources4> continuation) {
        super(2, continuation);
        this.$clock = clock;
        this.$publishedAt = instant;
        this.$now$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CortexArticleSources4(this.$clock, this.$publishedAt, this.$now$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CortexArticleSources4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Duration durationOfSeconds;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (JobKt.isActive(getContext())) {
            this.$now$delegate.setValue(Instant.now(this.$clock));
            Duration durationBetween = Duration.between(this.$publishedAt, CortexArticleSources3.CortexArticleSourceItem$lambda$3(this.$now$delegate));
            if (durationBetween.toHours() > 0) {
                durationOfSeconds = Duration.ofHours(1L);
            } else if (durationBetween.toMinutes() > 0) {
                durationOfSeconds = Duration.ofMinutes(1L);
            } else {
                durationOfSeconds = Duration.ofSeconds(10L);
            }
            long millis = durationOfSeconds.toMillis();
            this.label = 1;
            if (DelayKt.delay(millis, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
