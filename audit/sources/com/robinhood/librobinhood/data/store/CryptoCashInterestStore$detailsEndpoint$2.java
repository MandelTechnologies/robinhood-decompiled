package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.interest.CryptoCashInterestMembershipDetails2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import moneytree.p510v1.GetMembershipDetailsRequestDto;
import moneytree.p510v1.GetMembershipDetailsResponseDto;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lmoneytree/v1/GetMembershipDetailsRequestDto;", "response", "Lmoneytree/v1/GetMembershipDetailsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCashInterestStore$detailsEndpoint$2", m3645f = "CryptoCashInterestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoCashInterestStore$detailsEndpoint$2 extends ContinuationImpl7 implements Function3<GetMembershipDetailsRequestDto, GetMembershipDetailsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoCashInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCashInterestStore$detailsEndpoint$2(CryptoCashInterestStore cryptoCashInterestStore, Continuation<? super CryptoCashInterestStore$detailsEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = cryptoCashInterestStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GetMembershipDetailsRequestDto getMembershipDetailsRequestDto, GetMembershipDetailsResponseDto getMembershipDetailsResponseDto, Continuation<? super Unit> continuation) {
        CryptoCashInterestStore$detailsEndpoint$2 cryptoCashInterestStore$detailsEndpoint$2 = new CryptoCashInterestStore$detailsEndpoint$2(this.this$0, continuation);
        cryptoCashInterestStore$detailsEndpoint$2.L$0 = getMembershipDetailsRequestDto;
        cryptoCashInterestStore$detailsEndpoint$2.L$1 = getMembershipDetailsResponseDto;
        return cryptoCashInterestStore$detailsEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetMembershipDetailsRequestDto getMembershipDetailsRequestDto = (GetMembershipDetailsRequestDto) this.L$0;
            this.this$0.dao.insert(CryptoCashInterestMembershipDetails2.toDbModel((GetMembershipDetailsResponseDto) this.L$1, getMembershipDetailsRequestDto));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
