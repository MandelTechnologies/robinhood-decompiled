package com.robinhood.android.rhy.referral.contact;

import com.robinhood.models.contacts.ReferralContact;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$loadContacts$1$1", m3645f = "RhyReferralContactListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$loadContacts$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralContactListDuxo2 extends ContinuationImpl7 implements Function2<RhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState>, Object> {
    final /* synthetic */ List<ReferralContact> $sortedContacts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralContactListDuxo2(List<ReferralContact> list, Continuation<? super RhyReferralContactListDuxo2> continuation) {
        super(2, continuation);
        this.$sortedContacts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralContactListDuxo2 rhyReferralContactListDuxo2 = new RhyReferralContactListDuxo2(this.$sortedContacts, continuation);
        rhyReferralContactListDuxo2.L$0 = obj;
        return rhyReferralContactListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralContactListDataState rhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState> continuation) {
        return ((RhyReferralContactListDuxo2) create(rhyReferralContactListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralContactListDataState.copy$default((RhyReferralContactListDataState) this.L$0, false, this.$sortedContacts, null, null, 13, null);
    }
}
