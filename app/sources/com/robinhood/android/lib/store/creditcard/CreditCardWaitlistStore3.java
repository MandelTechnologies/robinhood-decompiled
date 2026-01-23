package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.waitlist.CreditCardWaitlistApi;
import com.robinhood.android.api.creditcard.waitlist.JoinWaitlistBody;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
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

/* compiled from: CreditCardWaitlistStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore$joinWaitlist$$inlined$withScopeContext$1", m3645f = "CreditCardWaitlistStore.kt", m3646l = {38}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore$joinWaitlist$$inlined$withScopeContext$1, reason: use source file name */
/* loaded from: classes8.dex */
public final class CreditCardWaitlistStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiEmailWaitlistSpot>, Object> {
    final /* synthetic */ String $email$inlined;
    final /* synthetic */ String $source$inlined;
    int label;
    final /* synthetic */ CreditCardWaitlistStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardWaitlistStore3(Continuation continuation, CreditCardWaitlistStore creditCardWaitlistStore, String str, String str2) {
        super(2, continuation);
        this.this$0 = creditCardWaitlistStore;
        this.$email$inlined = str;
        this.$source$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardWaitlistStore3(continuation, this.this$0, this.$email$inlined, this.$source$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiEmailWaitlistSpot> continuation) {
        return ((CreditCardWaitlistStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CreditCardWaitlistApi creditCardWaitlistApi = this.this$0.waitlistApi;
        JoinWaitlistBody joinWaitlistBody = new JoinWaitlistBody(this.$email$inlined, this.this$0.creditCardWaitlistReferralCode.get(), this.$source$inlined);
        this.label = 1;
        Object objJoinWaitlist = creditCardWaitlistApi.joinWaitlist(joinWaitlistBody, this);
        return objJoinWaitlist == coroutine_suspended ? coroutine_suspended : objJoinWaitlist;
    }
}
