package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import moneytree.p510v1.GetMonthlyInterestHistoryRequestDto;
import moneytree.p510v1.GetMonthlyInterestHistoryResponseDto;
import moneytree.p510v1.InterestService;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCashInterestStore$historyDetailEndpoint$1 extends FunctionReferenceImpl implements Function2<GetMonthlyInterestHistoryRequestDto, Continuation<? super GetMonthlyInterestHistoryResponseDto>, Object>, ContinuationImpl6 {
    CryptoCashInterestStore$historyDetailEndpoint$1(Object obj) {
        super(2, obj, InterestService.class, "GetMonthlyInterestHistory", "GetMonthlyInterestHistory(Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMonthlyInterestHistoryRequestDto getMonthlyInterestHistoryRequestDto, Continuation<? super GetMonthlyInterestHistoryResponseDto> continuation) {
        return ((InterestService) this.receiver).GetMonthlyInterestHistory(getMonthlyInterestHistoryRequestDto, continuation);
    }
}
