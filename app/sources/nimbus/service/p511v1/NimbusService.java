package nimbus.service.p511v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NimbusService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lnimbus/service/v1/NimbusService;", "", "Lnimbus/service/v1/GetAssetTransferDetailsRequestDto;", "request", "Lnimbus/service/v1/GetAssetTransferDetailsResponseDto;", "GetAssetTransferDetails", "(Lnimbus/service/v1/GetAssetTransferDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnimbus/service/v1/GetAssetTransferListRequestDto;", "Lnimbus/service/v1/GetAssetTransferListResponseDto;", "GetAssetTransferList", "(Lnimbus/service/v1/GetAssetTransferListRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnimbus/service/v1/CreateAssetTransferRequestDto;", "Lnimbus/service/v1/CreateAssetTransferResponseDto;", "CreateAssetTransfer", "(Lnimbus/service/v1/CreateAssetTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "PreSubmissionChecks", "(Lnimbus/service/v1/PreSubmissionChecksRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnimbus/service/v1/CancelAssetTransferRequestDto;", "Lnimbus/service/v1/CancelAssetTransferResponseDto;", "CancelAssetTransfer", "(Lnimbus/service/v1/CancelAssetTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface NimbusService {
    Object CancelAssetTransfer(CancelAssetTransferRequestDto cancelAssetTransferRequestDto, Continuation<? super CancelAssetTransferResponseDto> continuation);

    Object CreateAssetTransfer(CreateAssetTransferRequestDto createAssetTransferRequestDto, Continuation<? super CreateAssetTransferResponseDto> continuation);

    Object GetAssetTransferDetails(GetAssetTransferDetailsRequestDto getAssetTransferDetailsRequestDto, Continuation<? super GetAssetTransferDetailsResponseDto> continuation);

    Object GetAssetTransferList(GetAssetTransferListRequestDto getAssetTransferListRequestDto, Continuation<? super GetAssetTransferListResponseDto> continuation);

    Object PreSubmissionChecks(PreSubmissionChecksRequestDto preSubmissionChecksRequestDto, Continuation<? super PreSubmissionChecksResponseDto> continuation);
}
