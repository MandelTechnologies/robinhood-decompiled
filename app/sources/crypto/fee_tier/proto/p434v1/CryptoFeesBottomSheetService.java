package crypto.fee_tier.proto.p434v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: CryptoFeesBottomSheetService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequestDto;", "request", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetResponseDto;", "LaunchFeeTierUpsellBottomSheet", "(Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventResponseDto;", "StreamFeeTierUpsellBottomSheetEvent", "(Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventRequestDto;)Lkotlinx/coroutines/flow/Flow;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "crypto.fee_tier.proto.v1.CryptoFeesBottomSheetService")
/* loaded from: classes18.dex */
public interface CryptoFeesBottomSheetService {
    Object LaunchFeeTierUpsellBottomSheet(LaunchFeeTierUpsellBottomSheetRequestDto launchFeeTierUpsellBottomSheetRequestDto, Continuation<? super LaunchFeeTierUpsellBottomSheetResponseDto> continuation);

    Flow<StreamFeeTierUpsellBottomSheetEventResponseDto> StreamFeeTierUpsellBottomSheetEvent(StreamFeeTierUpsellBottomSheetEventRequestDto request);
}
