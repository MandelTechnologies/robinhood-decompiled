package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstantWithdrawalIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1$2$1", m3645f = "InstantWithdrawalIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class InstantWithdrawalIntroDuxo2 extends ContinuationImpl7 implements Function2<InstantWithdrawalIntroDataState, Continuation<? super InstantWithdrawalIntroDataState>, Object> {
    final /* synthetic */ ProductMarketingContent $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantWithdrawalIntroDuxo2(ProductMarketingContent productMarketingContent, Continuation<? super InstantWithdrawalIntroDuxo2> continuation) {
        super(2, continuation);
        this.$it = productMarketingContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstantWithdrawalIntroDuxo2 instantWithdrawalIntroDuxo2 = new InstantWithdrawalIntroDuxo2(this.$it, continuation);
        instantWithdrawalIntroDuxo2.L$0 = obj;
        return instantWithdrawalIntroDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstantWithdrawalIntroDataState instantWithdrawalIntroDataState, Continuation<? super InstantWithdrawalIntroDataState> continuation) {
        return ((InstantWithdrawalIntroDuxo2) create(instantWithdrawalIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InstantWithdrawalIntroDataState.copy$default((InstantWithdrawalIntroDataState) this.L$0, null, this.$it, null, 5, null);
    }
}
