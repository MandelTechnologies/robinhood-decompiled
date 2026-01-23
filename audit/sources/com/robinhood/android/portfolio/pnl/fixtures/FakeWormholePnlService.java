package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsResponseDto;
import wormhole.service.p554v1.GetRealizedGainLossItemRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;
import wormhole.service.p554v1.GetRealizedPerformanceSummaryRequestDto;
import wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto;
import wormhole.service.p554v1.GetSupportedAssetClassesRequestDto;
import wormhole.service.p554v1.GetSupportedAssetClassesResponseDto;
import wormhole.service.p554v1.PNLService;
import wormhole.service.p554v1.RealizedGainLossGroupDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;
import wormhole.service.p554v1.SupportedAssetClassDto;

/* compiled from: FakeWormholePnlService.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/FakeWormholePnlService;", "Lwormhole/service/v1/PNLService;", "<init>", "()V", "GetSupportedAssetClasses", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "request", "Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;", "(Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItems", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItem", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossGroups", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPerformanceSummary", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class FakeWormholePnlService implements PNLService {
    public Object GetRealizedGainLossGroups(Request<GetRealizedGainLossGroupsRequestDto> request, Continuation<? super Response<GetRealizedGainLossGroupsResponseDto>> continuation) {
        return PNLService.DefaultImpls.GetRealizedGainLossGroups(this, request, continuation);
    }

    public Object GetRealizedGainLossItem(Request<GetRealizedGainLossItemRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemResponseDto>> continuation) {
        return PNLService.DefaultImpls.GetRealizedGainLossItem(this, request, continuation);
    }

    public Object GetRealizedGainLossItems(Request<GetRealizedGainLossItemsRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemsResponseDto>> continuation) {
        return PNLService.DefaultImpls.GetRealizedGainLossItems(this, request, continuation);
    }

    public Object GetRealizedPerformanceSummary(Request<GetRealizedPerformanceSummaryRequestDto> request, Continuation<? super Response<GetRealizedPerformanceSummaryResponseDto>> continuation) {
        return PNLService.DefaultImpls.GetRealizedPerformanceSummary(this, request, continuation);
    }

    public Object GetSupportedAssetClasses(Request<GetSupportedAssetClassesRequestDto> request, Continuation<? super Response<GetSupportedAssetClassesResponseDto>> continuation) {
        return PNLService.DefaultImpls.GetSupportedAssetClasses(this, request, continuation);
    }

    @Override // wormhole.service.p554v1.PNLService
    public Object GetSupportedAssetClasses(GetSupportedAssetClassesRequestDto getSupportedAssetClassesRequestDto, Continuation<? super GetSupportedAssetClassesResponseDto> continuation) {
        return new GetSupportedAssetClassesResponseDto(getSupportedAssetClassesRequestDto.getAccount_number(), (List<SupportedAssetClassDto>) CollectionsKt.listOf((Object[]) new SupportedAssetClassDto[]{new SupportedAssetClassDto(AssetClassDto.ASSET_CLASS_EQUITY, true), new SupportedAssetClassDto(AssetClassDto.ASSET_CLASS_OPTION, true)}));
    }

    @Override // wormhole.service.p554v1.PNLService
    public Object GetRealizedGainLossItems(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, Continuation<? super GetRealizedGainLossItemsResponseDto> continuation) {
        return new GetRealizedGainLossItemsResponseDto((List<RealizedGainLossItemDto>) CollectionsKt.emptyList(), (String) null);
    }

    @Override // wormhole.service.p554v1.PNLService
    public Object GetRealizedGainLossItem(GetRealizedGainLossItemRequestDto getRealizedGainLossItemRequestDto, Continuation<? super GetRealizedGainLossItemResponseDto> continuation) {
        return new GetRealizedGainLossItemResponseDto((RealizedGainLossItemDto) null);
    }

    @Override // wormhole.service.p554v1.PNLService
    public Object GetRealizedGainLossGroups(GetRealizedGainLossGroupsRequestDto getRealizedGainLossGroupsRequestDto, Continuation<? super GetRealizedGainLossGroupsResponseDto> continuation) {
        return new GetRealizedGainLossGroupsResponseDto((List<RealizedGainLossGroupDto>) CollectionsKt.emptyList());
    }

    @Override // wormhole.service.p554v1.PNLService
    public Object GetRealizedPerformanceSummary(GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto, Continuation<? super GetRealizedPerformanceSummaryResponseDto> continuation) {
        return new GetRealizedPerformanceSummaryResponseDto(false, null, null, null, null, 31, null);
    }
}
