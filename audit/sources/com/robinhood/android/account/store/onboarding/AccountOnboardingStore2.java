package com.robinhood.android.account.store.onboarding;

import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountsService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountOnboardingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$accountDashboardFooterEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountOnboardingStore2 extends FunctionReferenceImpl implements Function2<AccountDashboardFooterRequestDto, Continuation<? super AccountDashboardFooterResponseDto>, Object>, ContinuationImpl6 {
    AccountOnboardingStore2(Object obj) {
        super(2, obj, AccountsService.class, "AccountDashboardFooter", "AccountDashboardFooter(Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountDashboardFooterRequestDto accountDashboardFooterRequestDto, Continuation<? super AccountDashboardFooterResponseDto> continuation) {
        return ((AccountsService) this.receiver).AccountDashboardFooter(accountDashboardFooterRequestDto, continuation);
    }
}
