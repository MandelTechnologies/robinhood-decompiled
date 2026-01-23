package com.robinhood.android.account.store.onboarding;

import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountDashboardFooterResponseDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AccountOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;", "response", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.store.onboarding.AccountOnboardingStore$accountDashboardFooterEndpoint$2", m3645f = "AccountOnboardingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.store.onboarding.AccountOnboardingStore$accountDashboardFooterEndpoint$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountOnboardingStore3 extends ContinuationImpl7 implements Function3<AccountDashboardFooterRequestDto, AccountDashboardFooterResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AccountOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountOnboardingStore3(AccountOnboardingStore accountOnboardingStore, Continuation<? super AccountOnboardingStore3> continuation) {
        super(3, continuation);
        this.this$0 = accountOnboardingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AccountDashboardFooterRequestDto accountDashboardFooterRequestDto, AccountDashboardFooterResponseDto accountDashboardFooterResponseDto, Continuation<? super Unit> continuation) {
        AccountOnboardingStore3 accountOnboardingStore3 = new AccountOnboardingStore3(this.this$0, continuation);
        accountOnboardingStore3.L$0 = accountDashboardFooterRequestDto;
        accountOnboardingStore3.L$1 = accountDashboardFooterResponseDto;
        return accountOnboardingStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AccountDashboardFooterRequestDto accountDashboardFooterRequestDto = (AccountDashboardFooterRequestDto) this.L$0;
            AccountDashboardFooterResponseDto accountDashboardFooterResponseDto = (AccountDashboardFooterResponseDto) this.L$1;
            Map map = this.this$0.accountDashboardFooterCache;
            String account_number = accountDashboardFooterRequestDto.getAccount_number();
            Object objMutableStateFlow = map.get(account_number);
            if (objMutableStateFlow == null) {
                objMutableStateFlow = StateFlow4.MutableStateFlow(null);
                map.put(account_number, objMutableStateFlow);
            }
            ((StateFlow2) objMutableStateFlow).setValue(accountDashboardFooterResponseDto);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
