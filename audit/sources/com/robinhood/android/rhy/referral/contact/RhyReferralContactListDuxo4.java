package com.robinhood.android.rhy.referral.contact;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralContactListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$onStart$4$1", m3645f = "RhyReferralContactListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralContactListDuxo4 extends ContinuationImpl7 implements Function2<RhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState>, Object> {
    final /* synthetic */ String $normalizedQuery;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralContactListDuxo4(String str, Continuation<? super RhyReferralContactListDuxo4> continuation) {
        super(2, continuation);
        this.$normalizedQuery = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralContactListDuxo4 rhyReferralContactListDuxo4 = new RhyReferralContactListDuxo4(this.$normalizedQuery, continuation);
        rhyReferralContactListDuxo4.L$0 = obj;
        return rhyReferralContactListDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralContactListDataState rhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState> continuation) {
        return ((RhyReferralContactListDuxo4) create(rhyReferralContactListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralContactListDataState.copy$default((RhyReferralContactListDataState) this.L$0, false, null, this.$normalizedQuery, null, 11, null);
    }
}
