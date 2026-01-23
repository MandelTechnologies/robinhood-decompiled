package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetSupportedAssetClassesResponseDto;
import wormhole.service.p554v1.SupportedAssetClassDto;

/* compiled from: ProfitAndLossSupportedAssetTypesFixtures.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/ProfitAndLossSupportedAssetTypesFixtures;", "", "<init>", "()V", "supportedAssetTypesDto", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "getSupportedAssetTypesDto", "()Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "supportedAssetTypes", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "getSupportedAssetTypes", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossSupportedAssetTypesFixtures {
    private static final ProfitAndLossSupportedAssetTypes supportedAssetTypes;
    public static final ProfitAndLossSupportedAssetTypesFixtures INSTANCE = new ProfitAndLossSupportedAssetTypesFixtures();
    private static final GetSupportedAssetClassesResponseDto supportedAssetTypesDto = new GetSupportedAssetClassesResponseDto("123456", (List<SupportedAssetClassDto>) CollectionsKt.listOf((Object[]) new SupportedAssetClassDto[]{new SupportedAssetClassDto(AssetClassDto.ASSET_CLASS_EQUITY, true), new SupportedAssetClassDto(AssetClassDto.ASSET_CLASS_OPTION, true)}));

    private ProfitAndLossSupportedAssetTypesFixtures() {
    }

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new SupportedAssetClass[]{new SupportedAssetClass(AssetClass.EQUITY, true), new SupportedAssetClass(AssetClass.OPTION, true)});
        Instant instantOfEpochSecond = Instant.ofEpochSecond(1650484943L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        supportedAssetTypes = new ProfitAndLossSupportedAssetTypes("123456", listListOf, instantOfEpochSecond);
    }

    public final GetSupportedAssetClassesResponseDto getSupportedAssetTypesDto() {
        return supportedAssetTypesDto;
    }

    public final ProfitAndLossSupportedAssetTypes getSupportedAssetTypes() {
        return supportedAssetTypes;
    }
}
