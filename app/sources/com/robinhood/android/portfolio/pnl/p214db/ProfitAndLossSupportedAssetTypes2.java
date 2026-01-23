package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.models.portfolio.api.AssetClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetSupportedAssetClassesResponseDto;
import wormhole.service.p554v1.SupportedAssetClassDto;

/* compiled from: ProfitAndLossSupportedAssetTypes.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "j$/time/Instant", "currentTime", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "toDbModel", "(Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "", "Lwormhole/service/v1/SupportedAssetClassDto;", "Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "toAssetClasses", "(Ljava/util/List;)Ljava/util/List;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossSupportedAssetTypesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfitAndLossSupportedAssetTypes2 {

    /* compiled from: ProfitAndLossSupportedAssetTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossSupportedAssetTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetClassDto.values().length];
            try {
                iArr[AssetClassDto.ASSET_CLASS_EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClassDto.ASSET_CLASS_OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetClassDto.ASSET_CLASS_CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ProfitAndLossSupportedAssetTypes toDbModel$default(GetSupportedAssetClassesResponseDto getSupportedAssetClassesResponseDto, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return toDbModel(getSupportedAssetClassesResponseDto, instant);
    }

    public static final ProfitAndLossSupportedAssetTypes toDbModel(GetSupportedAssetClassesResponseDto getSupportedAssetClassesResponseDto, Instant currentTime) {
        Intrinsics.checkNotNullParameter(getSupportedAssetClassesResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return new ProfitAndLossSupportedAssetTypes(getSupportedAssetClassesResponseDto.getAccount_number(), toAssetClasses(getSupportedAssetClassesResponseDto.getSupported_asset_classes()), currentTime);
    }

    public static final List<SupportedAssetClass> toAssetClasses(List<SupportedAssetClassDto> list) {
        SupportedAssetClass supportedAssetClass;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<SupportedAssetClassDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (SupportedAssetClassDto supportedAssetClassDto : list2) {
            int i = WhenMappings.$EnumSwitchMapping$0[supportedAssetClassDto.getAsset_class().ordinal()];
            if (i == 1) {
                supportedAssetClass = new SupportedAssetClass(AssetClass.EQUITY, supportedAssetClassDto.getHas_data());
            } else if (i == 2) {
                supportedAssetClass = new SupportedAssetClass(AssetClass.OPTION, supportedAssetClassDto.getHas_data());
            } else if (i == 3) {
                supportedAssetClass = new SupportedAssetClass(AssetClass.FOREX, supportedAssetClassDto.getHas_data());
            } else {
                supportedAssetClass = new SupportedAssetClass(AssetClass.UNKNOWN, supportedAssetClassDto.getHas_data());
            }
            arrayList.add(supportedAssetClass);
        }
        return arrayList;
    }
}
