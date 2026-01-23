package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaLaunchPromo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: MatchaPromotionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMatchaLaunchPromo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPromotionStore$getMatchaPromoEndpoint$2", m3645f = "MatchaPromotionStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaPromotionStore$getMatchaPromoEndpoint$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaPromotionStore3 extends ContinuationImpl7 implements Function2<ApiMatchaLaunchPromo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaPromotionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaPromotionStore3(MatchaPromotionStore matchaPromotionStore, Continuation<? super MatchaPromotionStore3> continuation) {
        super(2, continuation);
        this.this$0 = matchaPromotionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaPromotionStore3 matchaPromotionStore3 = new MatchaPromotionStore3(this.this$0, continuation);
        matchaPromotionStore3.L$0 = obj;
        return matchaPromotionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchaLaunchPromo apiMatchaLaunchPromo, Continuation<? super Unit> continuation) {
        return ((MatchaPromotionStore3) create(apiMatchaLaunchPromo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiMatchaLaunchPromo apiMatchaLaunchPromo = (ApiMatchaLaunchPromo) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.matchaPromoState;
            this.label = 1;
            if (stateFlow2.emit(apiMatchaLaunchPromo, this) == coroutine_suspended) {
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
