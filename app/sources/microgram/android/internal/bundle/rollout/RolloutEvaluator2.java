package microgram.android.internal.bundle.rollout;

import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.datetime.Converters4;
import kotlinx.datetime.Instant;
import kotlinx.datetime.Instant6;
import kotlinx.datetime.TimeZoneJvm2;
import microgram.manifest.DefaultRollout;
import microgram.manifest.ExperimentRollout;
import microgram.manifest.PercentageRollout;
import microgram.manifest.Release;
import microgram.manifest.Rollout;
import microgram.manifest.TimePhasedRollout;
import p479j$.time.Clock;

/* compiled from: RolloutEvaluator.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0014J\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0015H\u0003¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/android/internal/bundle/rollout/RealRolloutEvaluator;", "Lmicrogram/android/internal/bundle/rollout/RolloutEvaluator;", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/internal/bundle/rollout/AudienceIdProvider;", "audienceIdProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "<init>", "(Lj$/time/Clock;Lmicrogram/android/internal/bundle/rollout/AudienceIdProvider;Lcom/robinhood/experiments/ExperimentsProvider;)V", "Lmicrogram/manifest/Release;", "", "audienceId", "(Lmicrogram/manifest/Release;)J", "Lmicrogram/manifest/TimePhasedRollout$Configuration;", "release", "", "evaluate", "(Lmicrogram/manifest/TimePhasedRollout$Configuration;Lmicrogram/manifest/Release;)Z", "Lmicrogram/manifest/PercentageRollout$Configuration;", "(Lmicrogram/manifest/PercentageRollout$Configuration;Lmicrogram/manifest/Release;)Z", "Lmicrogram/manifest/ExperimentRollout$Configuration;", "(Lmicrogram/manifest/ExperimentRollout$Configuration;)Z", "isAvailable", "(Lmicrogram/manifest/Release;)Z", "Lj$/time/Clock;", "Lmicrogram/android/internal/bundle/rollout/AudienceIdProvider;", "Lcom/robinhood/experiments/ExperimentsProvider;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.rollout.RealRolloutEvaluator, reason: use source file name */
/* loaded from: classes14.dex */
public final class RolloutEvaluator2 implements RolloutEvaluator {
    private final AudienceIdProvider audienceIdProvider;
    private final Clock clock;
    private final ExperimentsProvider experimentsProvider;

    public RolloutEvaluator2(Clock clock, AudienceIdProvider audienceIdProvider, ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(audienceIdProvider, "audienceIdProvider");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.clock = clock;
        this.audienceIdProvider = audienceIdProvider;
        this.experimentsProvider = experimentsProvider;
    }

    @Override // microgram.android.internal.bundle.rollout.RolloutEvaluator
    public boolean isAvailable(Release release) {
        Intrinsics.checkNotNullParameter(release, "release");
        Rollout<?> rollout = release.getRollout();
        if (rollout instanceof DefaultRollout) {
            return true;
        }
        if (rollout instanceof ExperimentRollout) {
            return evaluate(((ExperimentRollout) rollout).getConfiguration());
        }
        if (rollout instanceof PercentageRollout) {
            return evaluate(((PercentageRollout) rollout).getConfiguration(), release);
        }
        if (rollout instanceof TimePhasedRollout) {
            return evaluate(((TimePhasedRollout) rollout).getConfiguration(), release);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final long audienceId(Release release) {
        return this.audienceIdProvider.getOrAssignAudienceId(release.getAppIdentifier(), release.getVersion());
    }

    private final boolean evaluate(TimePhasedRollout.Configuration configuration, Release release) {
        Instant startAt = configuration.getStartAt();
        p479j$.time.Instant instant = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        int iDaysUntil = Instant6.daysUntil(startAt, Converters4.toKotlinInstant(instant), TimeZoneJvm2.INSTANCE.getUTC());
        if (iDaysUntil < 0) {
            return false;
        }
        if (iDaysUntil >= configuration.getPhases().size()) {
            return true;
        }
        return audienceId(release) % ((long) 100) <= ((long) configuration.getPhases().get(iDaysUntil).intValue());
    }

    private final boolean evaluate(PercentageRollout.Configuration configuration, Release release) {
        return audienceId(release) % ((long) 100) <= ((long) configuration.getPercentage());
    }

    /* compiled from: RolloutEvaluator.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.bundle.rollout.RealRolloutEvaluator$evaluate$1", m3645f = "RolloutEvaluator.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: microgram.android.internal.bundle.rollout.RealRolloutEvaluator$evaluate$1 */
    static final class C462681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ExperimentRollout.Configuration $this_evaluate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462681(ExperimentRollout.Configuration configuration, Continuation<? super C462681> continuation) {
            super(2, continuation);
            this.$this_evaluate = configuration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RolloutEvaluator2.this.new C462681(this.$this_evaluate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C462681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Flow flowCoStreamStateForNames$default = ExperimentsProvider.DefaultImpls.coStreamStateForNames$default(RolloutEvaluator2.this.experimentsProvider, new String[]{this.$this_evaluate.getName()}, false, null, 4, null);
            Duration.Companion companion = Duration.INSTANCE;
            Flow flowM28818catch = FlowKt.m28818catch(FlowKt.m28821timeoutHG0u8IE(flowCoStreamStateForNames$default, Duration3.toDuration(1, DurationUnitJvm.SECONDS)), new AnonymousClass1(null));
            this.label = 1;
            Object objFirst = FlowKt.first(flowM28818catch, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }

        /* compiled from: RolloutEvaluator.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "microgram.android.internal.bundle.rollout.RealRolloutEvaluator$evaluate$1$1", m3645f = "RolloutEvaluator.kt", m3646l = {92}, m3647m = "invokeSuspend")
        /* renamed from: microgram.android.internal.bundle.rollout.RealRolloutEvaluator$evaluate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = flowCollector;
                anonymousClass1.L$1 = th;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    if (!(th instanceof Timeout4)) {
                        throw th;
                    }
                    Boolean boolBoxBoolean = boxing.boxBoolean(false);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
        }
    }

    private final boolean evaluate(ExperimentRollout.Configuration configuration) throws IOException {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C462681(configuration, null), 1, null)).booleanValue();
    }
}
