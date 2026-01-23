package com.robinhood.android.account.store.onboarding;

import bonfire.proto.idl.accounts.p028v1.AccountsService;
import bonfire.proto.idl.accounts.p028v1.CreateApplicationRequestDto;
import bonfire.proto.idl.accounts.p028v1.CreateApplicationResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountOnboardingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$createApplicationEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountOnboardingStore6 extends FunctionReferenceImpl implements Function2<CreateApplicationRequestDto, Continuation<? super CreateApplicationResponseDto>, Object>, ContinuationImpl6 {
    AccountOnboardingStore6(Object obj) {
        super(2, obj, AccountsService.class, "CreateApplication", "CreateApplication(Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateApplicationRequestDto createApplicationRequestDto, Continuation<? super CreateApplicationResponseDto> continuation) {
        return ((AccountsService) this.receiver).CreateApplication(createApplicationRequestDto, continuation);
    }
}
