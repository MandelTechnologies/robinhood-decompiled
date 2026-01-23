package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import android.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.SearchHighlightSportsHeroCardViewState;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.idl.IdlDecimal;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.CustomColorDto;
import search_coprocessor.p542v1.SportEventHeroDetailsDto;

/* compiled from: SearchHighlightSportsHeroCardProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDataState;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;", "<init>", "()V", "reduce", "dataState", "mapSideInfo", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;", "sideDto", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventSideDto;", "deltas", "", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "formatPrice", "", "idlDecimal", "Lcom/robinhood/idl/IdlDecimal;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHighlightSportsHeroCardProvider implements StateProvider<SearchHighlightSportsHeroCardDataState, SearchHighlightSportsHeroCardViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SearchHighlightSportsHeroCardViewState reduce(SearchHighlightSportsHeroCardDataState dataState) {
        CustomColorDto color;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SportEventHeroDetailsDto heroDetails = dataState.getHeroDetails();
        if (heroDetails == null) {
            return new SearchHighlightSportsHeroCardViewState(dataState.getEventId(), true, null, null, null, null, null, null, null, 508, null);
        }
        SportEventHeroDetailsDto.BadgeDto badge = heroDetails.getBadge();
        DayNightColor dayNightColor = (badge == null || (color = badge.getColor()) == null) ? null : new DayNightColor(Color2.Color(Color.parseColor(color.getLight())), Color2.Color(Color.parseColor(color.getDark())), null);
        SportEventHeroDetailsDto.BadgeDto badge2 = heroDetails.getBadge();
        String text = badge2 != null ? badge2.getText() : null;
        SportEventHeroDetailsDto.EventStatusDto status = heroDetails.getStatus();
        String primary_status_text = heroDetails.getPrimary_status_text();
        String secondary_status_text = heroDetails.getSecondary_status_text();
        SportEventHeroDetailsDto.EventSideDto left_side = heroDetails.getLeft_side();
        SearchHighlightSportsHeroCardViewState.EventSideInfo eventSideInfoMapSideInfo = left_side != null ? mapSideInfo(left_side, dataState.getLeftSideDeltas()) : null;
        SportEventHeroDetailsDto.EventSideDto right_side = heroDetails.getRight_side();
        return new SearchHighlightSportsHeroCardViewState(null, false, text, dayNightColor, status, primary_status_text, secondary_status_text, eventSideInfoMapSideInfo, right_side != null ? mapSideInfo(right_side, dataState.getRightSideDeltas()) : null, 1, null);
    }

    private final SearchHighlightSportsHeroCardViewState.EventSideInfo mapSideInfo(SportEventHeroDetailsDto.EventSideDto sideDto, List<FloatingOpenInterestDelta> deltas) {
        String id = sideDto.getId();
        String display_name = sideDto.getDisplay_name();
        String score = sideDto.getScore();
        boolean show_indicator = sideDto.getShow_indicator();
        String image_url = sideDto.getImage_url();
        BigDecimal bigDecimalOrNull = sideDto.getDisplay_price().toBigDecimalOrNull();
        String price = formatPrice(sideDto.getDisplay_price());
        BigDecimal bigDecimalOrNull2 = sideDto.getOpen_interest().toBigDecimalOrNull();
        if (bigDecimalOrNull2 == null) {
            bigDecimalOrNull2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalOrNull2;
        Intrinsics.checkNotNull(bigDecimal);
        CustomColorDto color = sideDto.getColor();
        return new SearchHighlightSportsHeroCardViewState.EventSideInfo(id, display_name, score, show_indicator, image_url, bigDecimalOrNull, price, bigDecimal, color != null ? new DayNightColor(Color2.Color(Color.parseColor(color.getLight())), Color2.Color(Color.parseColor(color.getDark())), null) : null, sideDto.getCta_text(), extensions2.toImmutableList(deltas));
    }

    private final String formatPrice(IdlDecimal idlDecimal) {
        BigDecimal bigDecimalOrNull = idlDecimal.toBigDecimalOrNull();
        if (bigDecimalOrNull != null) {
            return BigDecimals2.priceInCents(bigDecimalOrNull);
        }
        return null;
    }
}
