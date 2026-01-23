package contracts.crypto.trade.proto.p431v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: CryptoTradingBottomSheetService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CryptoTradingBottomSheetService;", "", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;", "request", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetResponseDto;", "LaunchBottomSheet", "(Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "contracts.crypto.trade.proto.v1.CryptoTradingBottomSheetService")
/* loaded from: classes18.dex */
public interface CryptoTradingBottomSheetService {
    Object LaunchBottomSheet(LaunchBottomSheetRequestDto launchBottomSheetRequestDto, Continuation<? super LaunchBottomSheetResponseDto> continuation);
}
