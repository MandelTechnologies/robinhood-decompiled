package contracts.crypto.trade.proto.p431v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: CryptoDisclosuresService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CryptoDisclosuresService;", "", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresResponseDto;", "StreamCryptoDisclosures", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;)Lkotlinx/coroutines/flow/Flow;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "contracts.crypto.trade.proto.v1.CryptoDisclosuresService")
/* loaded from: classes18.dex */
public interface CryptoDisclosuresService {
    Flow<StreamCryptoDisclosuresResponseDto> StreamCryptoDisclosures(StreamCryptoDisclosuresRequestDto request);
}
