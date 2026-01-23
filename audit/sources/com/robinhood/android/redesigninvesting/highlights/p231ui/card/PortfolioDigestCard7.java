package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: PortfolioDigestCard.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.card.PortfolioDigestCardKt$PortfolioDigestCard$1$2$1", m3645f = "PortfolioDigestCard.kt", m3646l = {77, 80}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.PortfolioDigestCardKt$PortfolioDigestCard$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class PortfolioDigestCard7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Integer> $currentIndex$delegate;
    final /* synthetic */ ImmutableList<UIComponentDto> $subtitles;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioDigestCard7(ImmutableList<UIComponentDto> immutableList, SnapshotState<Integer> snapshotState, Continuation<? super PortfolioDigestCard7> continuation) {
        super(2, continuation);
        this.$subtitles = immutableList;
        this.$currentIndex$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PortfolioDigestCard7 portfolioDigestCard7 = new PortfolioDigestCard7(this.$subtitles, this.$currentIndex$delegate, continuation);
        portfolioDigestCard7.L$0 = obj;
        return portfolioDigestCard7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioDigestCard7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        while (CoroutineScope2.isActive(coroutineScope)) {
            SnapshotState<Integer> snapshotState = this.$currentIndex$delegate;
            PortfolioDigestCard6.PortfolioDigestCard$lambda$12$lambda$3(snapshotState, (PortfolioDigestCard6.PortfolioDigestCard$lambda$12$lambda$2(snapshotState) + 1) % this.$subtitles.size());
            Duration.Companion companion2 = Duration.INSTANCE;
            long duration2 = Duration3.toDuration(6, DurationUnitJvm.SECONDS);
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.m28786delayVtjQ1oo(duration2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
