package microgram.contracts.mcw_cash_balances.proto.p497v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: CashBalancesDetailsPageService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesDetailsPageService;", "", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequestDto;", "request", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "GetCashBalancesDetailsPageFooter", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.mcw_cash_balances.proto.v1.CashBalancesDetailsPageService")
/* loaded from: classes14.dex */
public interface CashBalancesDetailsPageService {
    Object GetCashBalancesDetailsPageFooter(GetCashBalancesDetailsPageFooterRequestDto getCashBalancesDetailsPageFooterRequestDto, Continuation<? super GetCashBalancesDetailsPageFooterResponseDto> continuation);
}
