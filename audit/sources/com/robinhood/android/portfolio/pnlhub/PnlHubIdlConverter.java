package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GroupTypeDto;
import wormhole.service.p554v1.SortDirectionDto;
import wormhole.service.p554v1.SortTypeDto;
import wormhole.service.p554v1.SpanDto;

/* compiled from: PnlHubIdlConverter.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\t*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0000¨\u0006\u001b"}, m3636d2 = {"toTradeItemsRequestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "isCryptoPnlHubEnabled", "", "toTradeItemsRequestDtoForGroupBySymbol", MobileLinkingDeeplinkConstants.group_id_param, "", "assetClasses", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "toTradeGroupsRequestDto", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "toDto", "Lwormhole/service/v1/AssetClassDto;", "toSpanDto", "Lwormhole/service/v1/SpanDto;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "toAssetClassDtoList", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "optionsSupported", "toSortTypeDto", "Lwormhole/service/v1/SortTypeDto;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;", "toSortDirectionDto", "Lwormhole/service/v1/SortDirectionDto;", "Lcom/robinhood/rosetta/eventlogging/PositionsSortOptionsContext$SortDirection;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubIdlConverterKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubIdlConverter {

    /* compiled from: PnlHubIdlConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubIdlConverterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[AssetClass.values().length];
            try {
                iArr[AssetClass.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClass.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetClass.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetClass.FOREX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetClass.CRYPTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplaySpan.values().length];
            try {
                iArr2[DisplaySpan.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DisplaySpan.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DisplaySpan.f93673MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DisplaySpan.YTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DisplaySpan.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PnlHubAssetClass.values().length];
            try {
                iArr3[PnlHubAssetClass.EQUITY_ETF.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PnlHubAssetClass.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PnlHubAssetClass.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PnlHubAssetClass.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PnlHubAssetClass.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PnlHubDataState4.values().length];
            try {
                iArr4[PnlHubDataState4.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[PnlHubDataState4.SYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[PnlHubDataState4.PNL.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PositionsSortOptionsContext.SortDirection.values().length];
            try {
                iArr5[PositionsSortOptionsContext.SortDirection.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[PositionsSortOptionsContext.SortDirection.ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[PositionsSortOptionsContext.SortDirection.DSC.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final GetRealizedGainLossItemsRequestDto toTradeItemsRequestDto(PnlHubViewState.Ready ready, boolean z) {
        Intrinsics.checkNotNullParameter(ready, "<this>");
        return new GetRealizedGainLossItemsRequestDto(ready.getAccountNumber(), toSpanDto(ready.getChartSpan()), toAssetClassDtoList(ready.getSelectedAssetClass(), z, ready.getOptionsSupported()), toSortTypeDto(ready.getTradeDetailSettings().getCurrentSortKey()), toSortDirectionDto(ready.getTradeDetailSettings().getDirection()), null, null, 64, null);
    }

    public static final GetRealizedGainLossItemsRequestDto toTradeItemsRequestDtoForGroupBySymbol(PnlHubViewState.Ready ready, String str, boolean z, List<? extends AssetClass> assetClasses) {
        List assetClassDtoList;
        Intrinsics.checkNotNullParameter(ready, "<this>");
        Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
        String accountNumber = ready.getAccountNumber();
        SpanDto spanDto = toSpanDto(ready.getChartSpan());
        if (z) {
            List<? extends AssetClass> list = assetClasses;
            assetClassDtoList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                assetClassDtoList.add(toDto((AssetClass) it.next()));
            }
        } else {
            assetClassDtoList = toAssetClassDtoList(ready.getSelectedAssetClass(), true, ready.getOptionsSupported());
        }
        return new GetRealizedGainLossItemsRequestDto(accountNumber, spanDto, assetClassDtoList, SortTypeDto.SORT_TYPE_DATE, SortDirectionDto.SORT_DIRECTION_DESC, str, null, 64, null);
    }

    public static final GetRealizedGainLossGroupsRequestDto toTradeGroupsRequestDto(PnlHubViewState.Ready ready, boolean z) {
        Intrinsics.checkNotNullParameter(ready, "<this>");
        return new GetRealizedGainLossGroupsRequestDto(GroupTypeDto.GROUP_TYPE_SYMBOL, ready.getAccountNumber(), toSpanDto(ready.getChartSpan()), toAssetClassDtoList(ready.getSelectedAssetClass(), z, ready.getOptionsSupported()), toSortTypeDto(ready.getTradeDetailSettings().getCurrentSortKey()), toSortDirectionDto(ready.getTradeDetailSettings().getDirection()));
    }

    public static final AssetClassDto toDto(AssetClass assetClass) {
        Intrinsics.checkNotNullParameter(assetClass, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[assetClass.ordinal()];
        if (i == 1) {
            return AssetClassDto.ASSET_CLASS_UNSPECIFIED;
        }
        if (i == 2) {
            return AssetClassDto.ASSET_CLASS_EQUITY;
        }
        if (i == 3) {
            return AssetClassDto.ASSET_CLASS_OPTION;
        }
        if (i == 4 || i == 5) {
            return AssetClassDto.ASSET_CLASS_CRYPTO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SpanDto toSpanDto(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[displaySpan.ordinal()];
        if (i == 1) {
            return SpanDto.SPAN_1W;
        }
        if (i == 2) {
            return SpanDto.SPAN_1M;
        }
        if (i == 3) {
            return SpanDto.SPAN_3M;
        }
        if (i == 4) {
            return SpanDto.SPAN_YTD;
        }
        if (i == 5) {
            return SpanDto.SPAN_MAX;
        }
        return SpanDto.SPAN_UNSPECIFIED;
    }

    public static final List<AssetClassDto> toAssetClassDtoList(PnlHubAssetClass pnlHubAssetClass, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pnlHubAssetClass, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[pnlHubAssetClass.ordinal()];
        if (i == 1 || i == 2) {
            return CollectionsKt.listOf(AssetClassDto.ASSET_CLASS_EQUITY);
        }
        if (i == 3) {
            return CollectionsKt.listOf(AssetClassDto.ASSET_CLASS_OPTION);
        }
        if (i == 4) {
            return CollectionsKt.listOf(AssetClassDto.ASSET_CLASS_CRYPTO);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.listOfNotNull((Object[]) new AssetClassDto[]{AssetClassDto.ASSET_CLASS_EQUITY, z2 ? AssetClassDto.ASSET_CLASS_OPTION : null, z ? AssetClassDto.ASSET_CLASS_CRYPTO : null});
    }

    public static final SortTypeDto toSortTypeDto(PnlHubDataState4 pnlHubDataState4) {
        Intrinsics.checkNotNullParameter(pnlHubDataState4, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[pnlHubDataState4.ordinal()];
        if (i == 1) {
            return SortTypeDto.SORT_TYPE_DATE;
        }
        if (i == 2) {
            return SortTypeDto.SORT_TYPE_SYMBOL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortTypeDto.SORT_TYPE_REALIZED_RETURN;
    }

    public static final SortDirectionDto toSortDirectionDto(PositionsSortOptionsContext.SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(sortDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[sortDirection.ordinal()];
        if (i == 1) {
            return SortDirectionDto.SORT_DIRECTION_UNSPECIFIED;
        }
        if (i == 2) {
            return SortDirectionDto.SORT_DIRECTION_ASC;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortDirectionDto.SORT_DIRECTION_DESC;
    }
}
