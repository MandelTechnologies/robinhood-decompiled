package internal_asset_transfers.proto.p475v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: InternalAssetTransfersService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequestDto;", "request", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponseDto;", "GetEligibleAccounts", "(Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequestDto;", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationResponseDto;", "GetInvestorProfileConfirmation", "(Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelResponseDto;", "GetTaxImplicationsViewModel", "(Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "internal_asset_transfers.proto.v1.InternalAssetTransfersService")
/* loaded from: classes14.dex */
public interface InternalAssetTransfersService {
    Object GetEligibleAccounts(GetEligibleAccountsRequestDto getEligibleAccountsRequestDto, Continuation<? super GetEligibleAccountsResponseDto> continuation);

    Object GetInvestorProfileConfirmation(GetInvestorProfileConfirmationRequestDto getInvestorProfileConfirmationRequestDto, Continuation<? super GetInvestorProfileConfirmationResponseDto> continuation);

    Object GetTaxImplicationsViewModel(GetTaxImplicationsViewModelRequestDto getTaxImplicationsViewModelRequestDto, Continuation<? super GetTaxImplicationsViewModelResponseDto> continuation);
}
