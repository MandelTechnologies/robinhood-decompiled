package com.robinhood.android.account.store.onboarding;

import bonfire.proto.idl.accounts.p028v1.AccountOnboardingEligibilityRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountOnboardingEligibilityResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountsService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountOnboardingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$accountEligibilityEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountOnboardingStore4 extends FunctionReferenceImpl implements Function2<AccountOnboardingEligibilityRequestDto, Continuation<? super AccountOnboardingEligibilityResponseDto>, Object>, ContinuationImpl6 {
    AccountOnboardingStore4(Object obj) {
        super(2, obj, AccountsService.class, "AccountOnboardingEligibility", "AccountOnboardingEligibility(Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountOnboardingEligibilityRequestDto accountOnboardingEligibilityRequestDto, Continuation<? super AccountOnboardingEligibilityResponseDto> continuation) {
        return ((AccountsService) this.receiver).AccountOnboardingEligibility(accountOnboardingEligibilityRequestDto, continuation);
    }
}
