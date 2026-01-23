package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import moneytree.p510v1.MembershipService;
import moneytree.p510v1.UpdateMembershipRequestDto;
import moneytree.p510v1.UpdateMembershipResponseDto;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCashInterestStore$enrollmentEndpoint$1 extends FunctionReferenceImpl implements Function2<UpdateMembershipRequestDto, Continuation<? super UpdateMembershipResponseDto>, Object>, ContinuationImpl6 {
    CryptoCashInterestStore$enrollmentEndpoint$1(Object obj) {
        super(2, obj, MembershipService.class, "UpdateMembership", "UpdateMembership(Lmoneytree/v1/UpdateMembershipRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateMembershipRequestDto updateMembershipRequestDto, Continuation<? super UpdateMembershipResponseDto> continuation) {
        return ((MembershipService) this.receiver).UpdateMembership(updateMembershipRequestDto, continuation);
    }
}
