package com.robinhood.android.futures.assethome;

import futures_asset_home.proto.p462v1.SectionTypeDto;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesAssetHomeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, m3636d2 = {"assetHomeLoadingDefaultOrder", "Lkotlinx/collections/immutable/PersistentList;", "Lfutures_asset_home/proto/v1/SectionTypeDto;", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeStateProviderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeStateProvider2 {
    private static final ImmutableList3<SectionTypeDto> assetHomeLoadingDefaultOrder = extensions2.persistentListOf(SectionTypeDto.SECTION_PERFORMANCE_CHART, SectionTypeDto.SECTION_BUYING_POWER, SectionTypeDto.SECTION_PENDING_ORDERS, SectionTypeDto.SECTION_POSITIONS, SectionTypeDto.SECTION_HISTORY, SectionTypeDto.SECTION_DISCLOSURES);
}
