package com.robinhood.android.gold.downgrade;

import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
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
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: GoldDowngradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1$subscriptionAsync$1", m3645f = "GoldDowngradeLoadingDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1$subscriptionAsync$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDowngradeLoadingDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MarginSubscription>, Object> {
    int label;
    final /* synthetic */ GoldDowngradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDowngradeLoadingDuxo3(GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxo, Continuation<? super GoldDowngradeLoadingDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = goldDowngradeLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldDowngradeLoadingDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarginSubscription> continuation) {
        return ((GoldDowngradeLoadingDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Single singleCheckCurrentMarginSubscription$default = MarginSubscriptionStore.checkCurrentMarginSubscription$default(this.this$0.marginSubscriptionStore, false, 1, null);
            this.label = 1;
            obj = RxAwait3.await(singleCheckCurrentMarginSubscription$default, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((Optional) obj).getOrNull();
    }
}
