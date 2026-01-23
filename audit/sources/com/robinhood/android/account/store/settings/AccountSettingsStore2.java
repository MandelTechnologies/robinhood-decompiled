package com.robinhood.android.account.store.settings;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountsService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.store.settings.AccountSettingsStore$accountNumbersEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountSettingsStore2 extends FunctionReferenceImpl implements Function2<AccountNumbersRequestDto, Continuation<? super AccountNumbersResponseDto>, Object>, ContinuationImpl6 {
    AccountSettingsStore2(Object obj) {
        super(2, obj, AccountsService.class, "AccountNumbers", "AccountNumbers(Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountNumbersRequestDto accountNumbersRequestDto, Continuation<? super AccountNumbersResponseDto> continuation) {
        return ((AccountsService) this.receiver).AccountNumbers(accountNumbersRequestDto, continuation);
    }
}
