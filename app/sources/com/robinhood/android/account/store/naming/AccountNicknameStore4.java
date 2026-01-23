package com.robinhood.android.account.store.naming;

import bonfire.proto.idl.accounts.p028v1.AccountsService;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameRequestDto;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountNicknameStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.store.naming.AccountNicknameStore$validateNicknameEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountNicknameStore4 extends FunctionReferenceImpl implements Function2<ValidateNicknameRequestDto, Continuation<? super ValidateNicknameResponseDto>, Object>, ContinuationImpl6 {
    AccountNicknameStore4(Object obj) {
        super(2, obj, AccountsService.class, "ValidateNickname", "ValidateNickname(Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ValidateNicknameRequestDto validateNicknameRequestDto, Continuation<? super ValidateNicknameResponseDto> continuation) {
        return ((AccountsService) this.receiver).ValidateNickname(validateNicknameRequestDto, continuation);
    }
}
