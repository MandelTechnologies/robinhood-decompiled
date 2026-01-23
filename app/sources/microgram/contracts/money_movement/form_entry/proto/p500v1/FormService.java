package microgram.contracts.money_movement.form_entry.proto.p500v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: FormService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeRequestDto;", "request", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeResponseDto;", "GetFormForType", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberResponseDto;", "GetWireAccountAndRoutingNumber", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsResponseDto;", "GetFormErrors", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsResponseDto;", "GetWireReviewScreenDisplayFields", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerResponseDto;", "GetWireInformationForServer", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.money_movement.form_entry.proto.v1.FormService")
/* loaded from: classes14.dex */
public interface FormService {
    Object GetFormErrors(GetFormErrorsRequestDto getFormErrorsRequestDto, Continuation<? super GetFormErrorsResponseDto> continuation);

    Object GetFormForType(GetFormForTypeRequestDto getFormForTypeRequestDto, Continuation<? super GetFormForTypeResponseDto> continuation);

    Object GetWireAccountAndRoutingNumber(GetWireAccountAndRoutingNumberRequestDto getWireAccountAndRoutingNumberRequestDto, Continuation<? super GetWireAccountAndRoutingNumberResponseDto> continuation);

    Object GetWireInformationForServer(GetWireInformationForServerRequestDto getWireInformationForServerRequestDto, Continuation<? super GetWireInformationForServerResponseDto> continuation);

    Object GetWireReviewScreenDisplayFields(GetWireReviewScreenDisplayFieldsRequestDto getWireReviewScreenDisplayFieldsRequestDto, Continuation<? super GetWireReviewScreenDisplayFieldsResponseDto> continuation);
}
