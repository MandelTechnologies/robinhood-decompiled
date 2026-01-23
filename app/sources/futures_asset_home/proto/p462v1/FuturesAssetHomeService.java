package futures_asset_home.proto.p462v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesAssetHomeService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesAssetHomeService;", "", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeSectionOrderRequestDto;", "request", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeSectionOrderResponseDto;", "GetFuturesAssetHomeSectionOrder", "(Lfutures_asset_home/proto/v1/GetFuturesAssetHomeSectionOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeNuxInfoRequestDto;", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeNuxInfoResponseDto;", "GetFuturesAssetHomeNuxInfo", "(Lfutures_asset_home/proto/v1/GetFuturesAssetHomeNuxInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeDisclosuresRequestDto;", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeDisclosuresResponseDto;", "GetFuturesAssetHomeDisclosures", "(Lfutures_asset_home/proto/v1/GetFuturesAssetHomeDisclosuresRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "futures_asset_home.proto.v1.FuturesAssetHomeService")
/* loaded from: classes18.dex */
public interface FuturesAssetHomeService {
    Object GetFuturesAssetHomeDisclosures(GetFuturesAssetHomeDisclosuresRequestDto getFuturesAssetHomeDisclosuresRequestDto, Continuation<? super GetFuturesAssetHomeDisclosuresResponseDto> continuation);

    Object GetFuturesAssetHomeNuxInfo(GetFuturesAssetHomeNuxInfoRequestDto getFuturesAssetHomeNuxInfoRequestDto, Continuation<? super GetFuturesAssetHomeNuxInfoResponseDto> continuation);

    Object GetFuturesAssetHomeSectionOrder(GetFuturesAssetHomeSectionOrderRequestDto getFuturesAssetHomeSectionOrderRequestDto, Continuation<? super GetFuturesAssetHomeSectionOrderResponseDto> continuation);
}
