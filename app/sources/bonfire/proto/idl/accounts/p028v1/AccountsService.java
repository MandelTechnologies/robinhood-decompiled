package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AccountsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/AccountsService;", "", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;", "request", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "ValidateNickname", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationResponseDto;", "CreateApplication", "(Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsResponseDto;", "FundingOptions", "(Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityResponseDto;", "AccountOnboardingEligibility", "(Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "AccountNumbers", "(Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;", "AccountDashboardFooter", "(Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface AccountsService {
    Object AccountDashboardFooter(AccountDashboardFooterRequestDto accountDashboardFooterRequestDto, Continuation<? super AccountDashboardFooterResponseDto> continuation);

    Object AccountNumbers(AccountNumbersRequestDto accountNumbersRequestDto, Continuation<? super AccountNumbersResponseDto> continuation);

    Object AccountOnboardingEligibility(AccountOnboardingEligibilityRequestDto accountOnboardingEligibilityRequestDto, Continuation<? super AccountOnboardingEligibilityResponseDto> continuation);

    Object CreateApplication(CreateApplicationRequestDto createApplicationRequestDto, Continuation<? super CreateApplicationResponseDto> continuation);

    Object FundingOptions(FundingOptionsRequestDto fundingOptionsRequestDto, Continuation<? super FundingOptionsResponseDto> continuation);

    Object ValidateNickname(ValidateNicknameRequestDto validateNicknameRequestDto, Continuation<? super ValidateNicknameResponseDto> continuation);
}
