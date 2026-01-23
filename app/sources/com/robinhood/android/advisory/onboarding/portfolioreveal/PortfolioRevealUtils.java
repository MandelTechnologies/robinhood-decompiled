package com.robinhood.android.advisory.onboarding.portfolioreveal;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassOverviewDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassRowDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealInfoPageDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: PortfolioRevealUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"getImageUrls", "", "", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "lightMode", "", "progressBarSegments", "", "getProgressBarSegments", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;)I", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.PortfolioRevealUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioRevealUtils {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<String> getImageUrls(GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, boolean z) {
        String image_dark_url;
        Collection collectionEmptyList;
        List<PortfolioRevealAssetClassRowDto> asset_class_rows;
        String image_dark_url2;
        Intrinsics.checkNotNullParameter(getPortfolioRevealResponseDto, "<this>");
        List<PortfolioRevealInfoPageDto> info_pages = getPortfolioRevealResponseDto.getInfo_pages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(info_pages, 10));
        for (PortfolioRevealInfoPageDto portfolioRevealInfoPageDto : info_pages) {
            arrayList.add(z ? portfolioRevealInfoPageDto.getImage_light_url() : portfolioRevealInfoPageDto.getImage_dark_url());
        }
        PortfolioRevealAssetClassOverviewDto asset_class_overview = getPortfolioRevealResponseDto.getAsset_class_overview();
        if (z) {
            image_dark_url = asset_class_overview != null ? asset_class_overview.getImage_light_url() : null;
        } else if (asset_class_overview != null) {
            image_dark_url = asset_class_overview.getImage_dark_url();
        }
        PortfolioRevealAssetClassOverviewDto asset_class_overview2 = getPortfolioRevealResponseDto.getAsset_class_overview();
        if (asset_class_overview2 == null || (asset_class_rows = asset_class_overview2.getAsset_class_rows()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            List<PortfolioRevealAssetClassRowDto> list = asset_class_rows;
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PortfolioRevealAssetClassBreakdownDto breakdown = ((PortfolioRevealAssetClassRowDto) it.next()).getBreakdown();
                if (z) {
                    image_dark_url2 = breakdown != null ? breakdown.getImage_light_url() : null;
                } else if (breakdown != null) {
                    image_dark_url2 = breakdown.getImage_dark_url();
                }
                collectionEmptyList.add(image_dark_url2);
            }
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.addSpread(arrayList.toArray(new String[0]));
        spreadBuilder.add(image_dark_url);
        spreadBuilder.addSpread(collectionEmptyList.toArray(new String[0]));
        return CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
    }

    public static final int getProgressBarSegments(GetPortfolioRevealResponseDto getPortfolioRevealResponseDto) {
        Intrinsics.checkNotNullParameter(getPortfolioRevealResponseDto, "<this>");
        return getPortfolioRevealResponseDto.getInfo_pages().size() + 1;
    }
}
