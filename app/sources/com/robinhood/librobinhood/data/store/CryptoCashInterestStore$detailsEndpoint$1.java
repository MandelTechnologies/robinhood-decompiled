package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import moneytree.p510v1.GetMembershipDetailsRequestDto;
import moneytree.p510v1.GetMembershipDetailsResponseDto;
import moneytree.p510v1.MembershipService;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCashInterestStore$detailsEndpoint$1 extends FunctionReferenceImpl implements Function2<GetMembershipDetailsRequestDto, Continuation<? super GetMembershipDetailsResponseDto>, Object>, ContinuationImpl6 {
    CryptoCashInterestStore$detailsEndpoint$1(Object obj) {
        super(2, obj, MembershipService.class, "GetMembershipDetails", "GetMembershipDetails(Lmoneytree/v1/GetMembershipDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMembershipDetailsRequestDto getMembershipDetailsRequestDto, Continuation<? super GetMembershipDetailsResponseDto> continuation) {
        return ((MembershipService) this.receiver).GetMembershipDetails(getMembershipDetailsRequestDto, continuation);
    }
}
