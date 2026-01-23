package bonfire.proto.idl.windsor.p041v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WindsorService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/WindsorService;", "", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "request", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2ResponseDto;", "GetContributionAllowanceV2", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/GetTransfersRequestDto;", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;", "GetTransfers", "(Lbonfire/proto/idl/windsor/v1/GetTransfersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailRequestDto;", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;", "GetTransferDetail", "(Lbonfire/proto/idl/windsor/v1/GetTransferDetailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;", "CancelTransfer", "(Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface WindsorService {
    Object CancelTransfer(CancelTransferRequestDto cancelTransferRequestDto, Continuation<Object> continuation);

    Object GetContributionAllowanceV2(GetContributionAllowanceV2RequestDto getContributionAllowanceV2RequestDto, Continuation<? super GetContributionAllowanceV2ResponseDto> continuation);

    Object GetTransferDetail(GetTransferDetailRequestDto getTransferDetailRequestDto, Continuation<? super GetTransferDetailResponseDto> continuation);

    Object GetTransfers(GetTransfersRequestDto getTransfersRequestDto, Continuation<? super GetTransfersResponseDto> continuation);
}
