package com.robinhood.android.redesigninvesting.store.badges;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.android.redesign.model.HighlightImpression2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestingBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$markPriceAlertGenerated$2", m3645f = "InvestingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$markPriceAlertGenerated$2, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingBadgeStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $priceAlertId;
    int label;
    final /* synthetic */ InvestingBadgeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingBadgeStore2(InvestingBadgeStore investingBadgeStore, String str, Continuation<? super InvestingBadgeStore2> continuation) {
        super(2, continuation);
        this.this$0 = investingBadgeStore;
        this.$priceAlertId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingBadgeStore2(this.this$0, this.$priceAlertId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingBadgeStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HighlightImpressionDao highlightImpressionDao = this.this$0.highlightImpressionDao;
            HighlightImpression highlightImpression = new HighlightImpression(0L, this.$priceAlertId, null, this.this$0.clock.instant().toEpochMilli(), HighlightImpression2.BADGE, 5, null);
            this.label = 1;
            if (highlightImpressionDao.createImpression(highlightImpression, this) == coroutine_suspended) {
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
