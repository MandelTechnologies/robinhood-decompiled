package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.collection.LongList2;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$1$1", m3645f = "ExploreLegendUpsellComposable.kt", m3646l = {755}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExploreLegendUpsellComposableKt$Carousel$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CarouselContent> $contentList;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ ImmutableList<ExoPlayer> $exoPlayerPool;
    final /* synthetic */ SnapshotState<LongList2> $lastPosMap$delegate;
    final /* synthetic */ SnapshotIntState2 $lastSeenIndex$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotIntState2 $selectedPageIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExploreLegendUpsellComposableKt$Carousel$1$1(PagerState pagerState, EventLogger eventLogger, List<CarouselContent> list, UserInteractionEventDescriptor userInteractionEventDescriptor, ImmutableList<? extends ExoPlayer> immutableList, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SnapshotState<LongList2> snapshotState, Continuation<? super ExploreLegendUpsellComposableKt$Carousel$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$eventLogger = eventLogger;
        this.$contentList = list;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$exoPlayerPool = immutableList;
        this.$lastSeenIndex$delegate = snapshotIntState2;
        this.$selectedPageIndex$delegate = snapshotIntState22;
        this.$lastPosMap$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExploreLegendUpsellComposableKt$Carousel$1$1(this.$pagerState, this.$eventLogger, this.$contentList, this.$eventDescriptor, this.$exoPlayerPool, this.$lastSeenIndex$delegate, this.$selectedPageIndex$delegate, this.$lastPosMap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExploreLegendUpsellComposableKt$Carousel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PagerState pagerState = this.$pagerState;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(pagerState.getCurrentPage());
                }
            }));
            C99002 c99002 = new C99002(this.$eventLogger, this.$contentList, this.$eventDescriptor, this.$exoPlayerPool, this.$lastSeenIndex$delegate, this.$selectedPageIndex$delegate, this.$lastPosMap$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, c99002, this) == coroutine_suspended) {
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

    /* compiled from: ExploreLegendUpsellComposable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$1$1$2", m3645f = "ExploreLegendUpsellComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$1$1$2 */
    static final class C99002 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<CarouselContent> $contentList;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ ImmutableList<ExoPlayer> $exoPlayerPool;
        final /* synthetic */ SnapshotState<LongList2> $lastPosMap$delegate;
        final /* synthetic */ SnapshotIntState2 $lastSeenIndex$delegate;
        final /* synthetic */ SnapshotIntState2 $selectedPageIndex$delegate;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C99002(EventLogger eventLogger, List<CarouselContent> list, UserInteractionEventDescriptor userInteractionEventDescriptor, ImmutableList<? extends ExoPlayer> immutableList, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SnapshotState<LongList2> snapshotState, Continuation<? super C99002> continuation) {
            super(2, continuation);
            this.$eventLogger = eventLogger;
            this.$contentList = list;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$exoPlayerPool = immutableList;
            this.$lastSeenIndex$delegate = snapshotIntState2;
            this.$selectedPageIndex$delegate = snapshotIntState22;
            this.$lastPosMap$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99002 c99002 = new C99002(this.$eventLogger, this.$contentList, this.$eventDescriptor, this.$exoPlayerPool, this.$lastSeenIndex$delegate, this.$selectedPageIndex$delegate, this.$lastPosMap$delegate, continuation);
            c99002.I$0 = ((Number) obj).intValue();
            return c99002;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C99002) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.I$0;
            Timber.INSTANCE.mo3350d("[trigger] Event: helper: " + i + ", lastSeenIndex: " + this.$lastSeenIndex$delegate.getIntValue(), new Object[0]);
            int intValue = this.$selectedPageIndex$delegate.getIntValue();
            if (i != this.$lastSeenIndex$delegate.getIntValue()) {
                EventLogger eventLogger = this.$eventLogger;
                UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.APPEAR;
                Component component = new Component(Component.ComponentType.CAROUSEL, this.$contentList.get(i).getLabel(), null, 4, null);
                Screen screen = this.$eventDescriptor.getScreen();
                Context context = this.$eventDescriptor.getContext();
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen, component, null, context != null ? Context.copy$default(context, i + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 104, null), false, false, 6, null);
                this.$lastSeenIndex$delegate.setIntValue(i);
            }
            ExploreLegendUpsellComposableKt.Carousel$lambda$29(this.$lastPosMap$delegate).set(intValue, this.$exoPlayerPool.get(intValue).getCurrentPosition());
            int i2 = 0;
            for (ExoPlayer exoPlayer : this.$exoPlayerPool) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ExoPlayer exoPlayer2 = exoPlayer;
                if (i2 == i) {
                    Timber.INSTANCE.mo3350d("Playing exoPlayer at index: " + i, new Object[0]);
                    exoPlayer2.seekTo(0L);
                    exoPlayer2.setPlayWhenReady(true);
                } else if (exoPlayer2.isPlaying()) {
                    Timber.INSTANCE.mo3350d("Pausing exoPlayer at index: " + i, new Object[0]);
                    exoPlayer2.pause();
                }
                i2 = i3;
            }
            Timber.INSTANCE.mo3350d("Snapshot flow updated index to: " + i, new Object[0]);
            this.$selectedPageIndex$delegate.setIntValue(i);
            return Unit.INSTANCE;
        }
    }
}
