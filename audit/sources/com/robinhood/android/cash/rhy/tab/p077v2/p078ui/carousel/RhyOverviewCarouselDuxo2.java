package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyOverviewCarouselDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$onStart$1$1", m3645f = "RhyOverviewCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyOverviewCarouselDuxo2 extends ContinuationImpl7 implements Function2<RhyOverviewCarouselDataState, Continuation<? super RhyOverviewCarouselDataState>, Object> {
    final /* synthetic */ Optional<MinervaAccount> $minervaAccount;
    final /* synthetic */ Optional<RhyAccount> $rhyAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOverviewCarouselDuxo2(Optional<RhyAccount> optional, Optional<MinervaAccount> optional2, Continuation<? super RhyOverviewCarouselDuxo2> continuation) {
        super(2, continuation);
        this.$rhyAccount = optional;
        this.$minervaAccount = optional2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyOverviewCarouselDuxo2 rhyOverviewCarouselDuxo2 = new RhyOverviewCarouselDuxo2(this.$rhyAccount, this.$minervaAccount, continuation);
        rhyOverviewCarouselDuxo2.L$0 = obj;
        return rhyOverviewCarouselDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyOverviewCarouselDataState rhyOverviewCarouselDataState, Continuation<? super RhyOverviewCarouselDataState> continuation) {
        return ((RhyOverviewCarouselDuxo2) create(rhyOverviewCarouselDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyOverviewCarouselDataState.copy$default((RhyOverviewCarouselDataState) this.L$0, null, this.$rhyAccount, this.$minervaAccount, false, 9, null);
    }
}
