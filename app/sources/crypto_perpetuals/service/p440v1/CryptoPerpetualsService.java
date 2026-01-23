package crypto_perpetuals.service.p440v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CryptoPerpetualsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!H¦@¢\u0006\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "", "Lcrypto_perpetuals/service/v1/GetAccountRequestDto;", "request", "Lcrypto_perpetuals/service/v1/GetAccountResponseDto;", "GetAccount", "(Lcrypto_perpetuals/service/v1/GetAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/GetContractRequestDto;", "Lcrypto_perpetuals/service/v1/GetContractResponseDto;", "GetContract", "(Lcrypto_perpetuals/service/v1/GetContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ListContractRequestDto;", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;", "ListContract", "(Lcrypto_perpetuals/service/v1/ListContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;", "Lcrypto_perpetuals/service/v1/GetMarginEditResponseDto;", "GetMarginEdit", "(Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;", "Lcrypto_perpetuals/service/v1/ListMarginEditsResponseDto;", "ListMarginEdits", "(Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcrypto_perpetuals/service/v1/GetOrderRequestDto;", "Lcom/robinhood/idl/Response;", "Lcrypto_perpetuals/service/v1/GetOrderResponseDto;", "GetOrder", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "Lcrypto_perpetuals/service/v1/ListOrderResponseDto;", "ListOrder", "(Lcrypto_perpetuals/service/v1/ListOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceResponseDto;", "ValidateOrderPrice", "(Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface CryptoPerpetualsService {
    Object GetAccount(GetAccountRequestDto getAccountRequestDto, Continuation<? super GetAccountResponseDto> continuation);

    Object GetContract(GetContractRequestDto getContractRequestDto, Continuation<? super GetContractResponseDto> continuation);

    Object GetMarginEdit(GetMarginEditRequestDto getMarginEditRequestDto, Continuation<? super GetMarginEditResponseDto> continuation);

    Object GetOrder(Request<GetOrderRequestDto> request, Continuation<? super Response<GetOrderResponseDto>> continuation);

    Object ListContract(ListContractRequestDto listContractRequestDto, Continuation<? super ListContractResponseDto> continuation);

    Object ListMarginEdits(ListMarginEditsRequestDto listMarginEditsRequestDto, Continuation<? super ListMarginEditsResponseDto> continuation);

    Object ListOrder(ListOrderRequestDto listOrderRequestDto, Continuation<? super ListOrderResponseDto> continuation);

    Object ValidateOrderPrice(ValidateOrderPriceRequestDto validateOrderPriceRequestDto, Continuation<? super ValidateOrderPriceResponseDto> continuation);
}
