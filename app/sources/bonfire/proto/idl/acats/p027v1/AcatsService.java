package bonfire.proto.idl.acats.p027v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AcatsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsService;", "", "Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequestDto;", "request", "Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsResponseDto;", "GetAcatsClawbackDetails", "(Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetRequestDto;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "GetAcatsTransferHubBottomSheet", "(Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;", "ConfirmPendingJointAccountACATS", "(Lbonfire/proto/idl/acats/v1/ConfirmPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;", "CancelPendingJointAccountACATS", "(Lbonfire/proto/idl/acats/v1/CancelPendingJointAccountACATSRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface AcatsService {
    Object CancelPendingJointAccountACATS(CancelPendingJointAccountACATSRequestDto cancelPendingJointAccountACATSRequestDto, Continuation<Object> continuation);

    Object ConfirmPendingJointAccountACATS(ConfirmPendingJointAccountACATSRequestDto confirmPendingJointAccountACATSRequestDto, Continuation<Object> continuation);

    Object GetAcatsClawbackDetails(GetAcatsClawbackDetailsRequestDto getAcatsClawbackDetailsRequestDto, Continuation<? super GetAcatsClawbackDetailsResponseDto> continuation);

    Object GetAcatsTransferHubBottomSheet(GetAcatsTransferHubBottomSheetRequestDto getAcatsTransferHubBottomSheetRequestDto, Continuation<? super GetAcatsTransferHubBottomSheetResponseDto> continuation);
}
