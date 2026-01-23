package com.robinhood.android.redesigninvesting.badges.p230ui;

import com.robinhood.android.redesigninvesting.badges.p230ui.InvestingBadgeViewState;
import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestingBadgeComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$InvestingBadgeComposable$4$1", m3645f = "InvestingBadgeComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeComposableKt$InvestingBadgeComposable$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingBadgeComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestingBadgeViewState.Badge $badge;
    final /* synthetic */ InvestingBadgeDuxo $duxo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingBadgeComposable2(InvestingBadgeViewState.Badge badge, InvestingBadgeDuxo investingBadgeDuxo, Continuation<? super InvestingBadgeComposable2> continuation) {
        super(2, continuation);
        this.$badge = badge;
        this.$duxo = investingBadgeDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingBadgeComposable2(this.$badge, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingBadgeComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$badge.getDetails() instanceof InvestingBadge.PriceAlertBadge) {
            this.$duxo.markPriceAlertSeen(((InvestingBadge.PriceAlertBadge) this.$badge.getDetails()).getPriceAlertId());
        }
        return Unit.INSTANCE;
    }
}
