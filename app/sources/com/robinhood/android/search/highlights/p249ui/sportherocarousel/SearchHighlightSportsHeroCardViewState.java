package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.model.ProbabilitySegments2;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import com.robinhood.utils.extensions.ResourceTypes;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.SportEventHeroDetailsDto;

/* compiled from: SearchHighlightSportsHeroCardViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000289Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jq\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;", "", "eventId", "Ljava/util/UUID;", "loading", "", "badgeText", "", "badgeColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "eventStatus", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "primaryStatusText", "secondaryStatusText", "leftSide", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;", "rightSide", "<init>", "(Ljava/util/UUID;ZLjava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;)V", "getEventId", "()Ljava/util/UUID;", "getLoading", "()Z", "getBadgeText", "()Ljava/lang/String;", "getBadgeColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getEventStatus", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto$EventStatusDto;", "getPrimaryStatusText", "getSecondaryStatusText", "getLeftSide", "()Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;", "getRightSide", "probabilitySegments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "getProbabilitySegments", "()Lkotlinx/collections/immutable/ImmutableList;", "includeOpenInterestDeltas", "getIncludeOpenInterestDeltas", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "EventSideInfo", "SideColor", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightSportsHeroCardViewState {
    public static final int $stable = 0;
    private final DayNightColor badgeColor;
    private final String badgeText;
    private final UUID eventId;
    private final SportEventHeroDetailsDto.EventStatusDto eventStatus;
    private final boolean includeOpenInterestDeltas;
    private final EventSideInfo leftSide;
    private final boolean loading;
    private final String primaryStatusText;
    private final ImmutableList<ProbabilitySegment> probabilitySegments;
    private final EventSideInfo rightSide;
    private final String secondaryStatusText;

    public SearchHighlightSportsHeroCardViewState() {
        this(null, false, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ SearchHighlightSportsHeroCardViewState copy$default(SearchHighlightSportsHeroCardViewState searchHighlightSportsHeroCardViewState, UUID uuid, boolean z, String str, DayNightColor dayNightColor, SportEventHeroDetailsDto.EventStatusDto eventStatusDto, String str2, String str3, EventSideInfo eventSideInfo, EventSideInfo eventSideInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = searchHighlightSportsHeroCardViewState.eventId;
        }
        if ((i & 2) != 0) {
            z = searchHighlightSportsHeroCardViewState.loading;
        }
        if ((i & 4) != 0) {
            str = searchHighlightSportsHeroCardViewState.badgeText;
        }
        if ((i & 8) != 0) {
            dayNightColor = searchHighlightSportsHeroCardViewState.badgeColor;
        }
        if ((i & 16) != 0) {
            eventStatusDto = searchHighlightSportsHeroCardViewState.eventStatus;
        }
        if ((i & 32) != 0) {
            str2 = searchHighlightSportsHeroCardViewState.primaryStatusText;
        }
        if ((i & 64) != 0) {
            str3 = searchHighlightSportsHeroCardViewState.secondaryStatusText;
        }
        if ((i & 128) != 0) {
            eventSideInfo = searchHighlightSportsHeroCardViewState.leftSide;
        }
        if ((i & 256) != 0) {
            eventSideInfo2 = searchHighlightSportsHeroCardViewState.rightSide;
        }
        EventSideInfo eventSideInfo3 = eventSideInfo;
        EventSideInfo eventSideInfo4 = eventSideInfo2;
        String str4 = str2;
        String str5 = str3;
        SportEventHeroDetailsDto.EventStatusDto eventStatusDto2 = eventStatusDto;
        String str6 = str;
        return searchHighlightSportsHeroCardViewState.copy(uuid, z, str6, dayNightColor, eventStatusDto2, str4, str5, eventSideInfo3, eventSideInfo4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component4, reason: from getter */
    public final DayNightColor getBadgeColor() {
        return this.badgeColor;
    }

    /* renamed from: component5, reason: from getter */
    public final SportEventHeroDetailsDto.EventStatusDto getEventStatus() {
        return this.eventStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPrimaryStatusText() {
        return this.primaryStatusText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryStatusText() {
        return this.secondaryStatusText;
    }

    /* renamed from: component8, reason: from getter */
    public final EventSideInfo getLeftSide() {
        return this.leftSide;
    }

    /* renamed from: component9, reason: from getter */
    public final EventSideInfo getRightSide() {
        return this.rightSide;
    }

    public final SearchHighlightSportsHeroCardViewState copy(UUID eventId, boolean loading, String badgeText, DayNightColor badgeColor, SportEventHeroDetailsDto.EventStatusDto eventStatus, String primaryStatusText, String secondaryStatusText, EventSideInfo leftSide, EventSideInfo rightSide) {
        Intrinsics.checkNotNullParameter(eventStatus, "eventStatus");
        return new SearchHighlightSportsHeroCardViewState(eventId, loading, badgeText, badgeColor, eventStatus, primaryStatusText, secondaryStatusText, leftSide, rightSide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightSportsHeroCardViewState)) {
            return false;
        }
        SearchHighlightSportsHeroCardViewState searchHighlightSportsHeroCardViewState = (SearchHighlightSportsHeroCardViewState) other;
        return Intrinsics.areEqual(this.eventId, searchHighlightSportsHeroCardViewState.eventId) && this.loading == searchHighlightSportsHeroCardViewState.loading && Intrinsics.areEqual(this.badgeText, searchHighlightSportsHeroCardViewState.badgeText) && Intrinsics.areEqual(this.badgeColor, searchHighlightSportsHeroCardViewState.badgeColor) && this.eventStatus == searchHighlightSportsHeroCardViewState.eventStatus && Intrinsics.areEqual(this.primaryStatusText, searchHighlightSportsHeroCardViewState.primaryStatusText) && Intrinsics.areEqual(this.secondaryStatusText, searchHighlightSportsHeroCardViewState.secondaryStatusText) && Intrinsics.areEqual(this.leftSide, searchHighlightSportsHeroCardViewState.leftSide) && Intrinsics.areEqual(this.rightSide, searchHighlightSportsHeroCardViewState.rightSide);
    }

    public int hashCode() {
        UUID uuid = this.eventId;
        int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31;
        String str = this.badgeText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DayNightColor dayNightColor = this.badgeColor;
        int iHashCode3 = (((iHashCode2 + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31) + this.eventStatus.hashCode()) * 31;
        String str2 = this.primaryStatusText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryStatusText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventSideInfo eventSideInfo = this.leftSide;
        int iHashCode6 = (iHashCode5 + (eventSideInfo == null ? 0 : eventSideInfo.hashCode())) * 31;
        EventSideInfo eventSideInfo2 = this.rightSide;
        return iHashCode6 + (eventSideInfo2 != null ? eventSideInfo2.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightSportsHeroCardViewState(eventId=" + this.eventId + ", loading=" + this.loading + ", badgeText=" + this.badgeText + ", badgeColor=" + this.badgeColor + ", eventStatus=" + this.eventStatus + ", primaryStatusText=" + this.primaryStatusText + ", secondaryStatusText=" + this.secondaryStatusText + ", leftSide=" + this.leftSide + ", rightSide=" + this.rightSide + ")";
    }

    public SearchHighlightSportsHeroCardViewState(UUID uuid, boolean z, String str, DayNightColor dayNightColor, SportEventHeroDetailsDto.EventStatusDto eventStatus, String str2, String str3, EventSideInfo eventSideInfo, EventSideInfo eventSideInfo2) {
        BigDecimal rawPrice;
        BigDecimal rawPrice2;
        Intrinsics.checkNotNullParameter(eventStatus, "eventStatus");
        this.eventId = uuid;
        this.loading = z;
        this.badgeText = str;
        this.badgeColor = dayNightColor;
        this.eventStatus = eventStatus;
        this.primaryStatusText = str2;
        this.secondaryStatusText = str3;
        this.leftSide = eventSideInfo;
        this.rightSide = eventSideInfo2;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Float fValueOf = (eventSideInfo == null || (rawPrice2 = eventSideInfo.getRawPrice()) == null) ? null : Float.valueOf(rawPrice2.floatValue());
        DayNightColor color = eventSideInfo != null ? eventSideInfo.getColor() : null;
        Float fValueOf2 = (eventSideInfo2 == null || (rawPrice = eventSideInfo2.getRawPrice()) == null) ? null : Float.valueOf(rawPrice.floatValue());
        DayNightColor color2 = eventSideInfo2 != null ? eventSideInfo2.getColor() : null;
        if (fValueOf != null && color != null) {
            listCreateListBuilder.add(new ProbabilitySegment(fValueOf.floatValue(), color));
        }
        if (fValueOf2 != null && color2 != null) {
            listCreateListBuilder.add(new ProbabilitySegment(fValueOf2.floatValue(), color2));
        }
        this.probabilitySegments = ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.build(listCreateListBuilder), 0.0f, 2, null);
        this.includeOpenInterestDeltas = SetsKt.setOf((Object[]) new SportEventHeroDetailsDto.EventStatusDto[]{SportEventHeroDetailsDto.EventStatusDto.LIVE, SportEventHeroDetailsDto.EventStatusDto.UPCOMING}).contains(eventStatus);
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final DayNightColor getBadgeColor() {
        return this.badgeColor;
    }

    public /* synthetic */ SearchHighlightSportsHeroCardViewState(UUID uuid, boolean z, String str, DayNightColor dayNightColor, SportEventHeroDetailsDto.EventStatusDto eventStatusDto, String str2, String str3, EventSideInfo eventSideInfo, EventSideInfo eventSideInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : dayNightColor, (i & 16) != 0 ? SportEventHeroDetailsDto.EventStatusDto.UPCOMING : eventStatusDto, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : eventSideInfo, (i & 256) != 0 ? null : eventSideInfo2);
    }

    public final SportEventHeroDetailsDto.EventStatusDto getEventStatus() {
        return this.eventStatus;
    }

    public final String getPrimaryStatusText() {
        return this.primaryStatusText;
    }

    public final String getSecondaryStatusText() {
        return this.secondaryStatusText;
    }

    public final EventSideInfo getLeftSide() {
        return this.leftSide;
    }

    public final EventSideInfo getRightSide() {
        return this.rightSide;
    }

    public final ImmutableList<ProbabilitySegment> getProbabilitySegments() {
        return this.probabilitySegments;
    }

    public final boolean getIncludeOpenInterestDeltas() {
        return this.includeOpenInterestDeltas;
    }

    /* compiled from: SearchHighlightSportsHeroCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001J\u0013\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;", "", "id", "", "displayName", "score", "showIndicator", "", MarkdownText4.TagImageUrl, "rawPrice", "Ljava/math/BigDecimal;", "displayPrice", "openInterest", ResourceTypes.COLOR, "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "ctaText", "deltas", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getScore", "getShowIndicator", "()Z", "getImageUrl", "getRawPrice", "()Ljava/math/BigDecimal;", "getDisplayPrice", "getOpenInterest", "getColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getCtaText", "getDeltas", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EventSideInfo {
        public static final int $stable = 0;
        private final DayNightColor color;
        private final String ctaText;
        private final ImmutableList<FloatingOpenInterestDelta> deltas;
        private final String displayName;
        private final String displayPrice;
        private final String id;
        private final String imageUrl;
        private final BigDecimal openInterest;
        private final BigDecimal rawPrice;
        private final String score;
        private final boolean showIndicator;

        public static /* synthetic */ EventSideInfo copy$default(EventSideInfo eventSideInfo, String str, String str2, String str3, boolean z, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, DayNightColor dayNightColor, String str6, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventSideInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = eventSideInfo.displayName;
            }
            if ((i & 4) != 0) {
                str3 = eventSideInfo.score;
            }
            if ((i & 8) != 0) {
                z = eventSideInfo.showIndicator;
            }
            if ((i & 16) != 0) {
                str4 = eventSideInfo.imageUrl;
            }
            if ((i & 32) != 0) {
                bigDecimal = eventSideInfo.rawPrice;
            }
            if ((i & 64) != 0) {
                str5 = eventSideInfo.displayPrice;
            }
            if ((i & 128) != 0) {
                bigDecimal2 = eventSideInfo.openInterest;
            }
            if ((i & 256) != 0) {
                dayNightColor = eventSideInfo.color;
            }
            if ((i & 512) != 0) {
                str6 = eventSideInfo.ctaText;
            }
            if ((i & 1024) != 0) {
                immutableList = eventSideInfo.deltas;
            }
            String str7 = str6;
            ImmutableList immutableList2 = immutableList;
            BigDecimal bigDecimal3 = bigDecimal2;
            DayNightColor dayNightColor2 = dayNightColor;
            BigDecimal bigDecimal4 = bigDecimal;
            String str8 = str5;
            String str9 = str4;
            String str10 = str3;
            return eventSideInfo.copy(str, str2, str10, z, str9, bigDecimal4, str8, bigDecimal3, dayNightColor2, str7, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final ImmutableList<FloatingOpenInterestDelta> component11() {
            return this.deltas;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScore() {
            return this.score;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowIndicator() {
            return this.showIndicator;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getRawPrice() {
            return this.rawPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final String getDisplayPrice() {
            return this.displayPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final BigDecimal getOpenInterest() {
            return this.openInterest;
        }

        /* renamed from: component9, reason: from getter */
        public final DayNightColor getColor() {
            return this.color;
        }

        public final EventSideInfo copy(String id, String displayName, String score, boolean showIndicator, String imageUrl, BigDecimal rawPrice, String displayPrice, BigDecimal openInterest, DayNightColor color, String ctaText, ImmutableList<FloatingOpenInterestDelta> deltas) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(openInterest, "openInterest");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(deltas, "deltas");
            return new EventSideInfo(id, displayName, score, showIndicator, imageUrl, rawPrice, displayPrice, openInterest, color, ctaText, deltas);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventSideInfo)) {
                return false;
            }
            EventSideInfo eventSideInfo = (EventSideInfo) other;
            return Intrinsics.areEqual(this.id, eventSideInfo.id) && Intrinsics.areEqual(this.displayName, eventSideInfo.displayName) && Intrinsics.areEqual(this.score, eventSideInfo.score) && this.showIndicator == eventSideInfo.showIndicator && Intrinsics.areEqual(this.imageUrl, eventSideInfo.imageUrl) && Intrinsics.areEqual(this.rawPrice, eventSideInfo.rawPrice) && Intrinsics.areEqual(this.displayPrice, eventSideInfo.displayPrice) && Intrinsics.areEqual(this.openInterest, eventSideInfo.openInterest) && Intrinsics.areEqual(this.color, eventSideInfo.color) && Intrinsics.areEqual(this.ctaText, eventSideInfo.ctaText) && Intrinsics.areEqual(this.deltas, eventSideInfo.deltas);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31;
            String str = this.score;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showIndicator)) * 31;
            String str2 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal = this.rawPrice;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str3 = this.displayPrice;
            int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.openInterest.hashCode()) * 31;
            DayNightColor dayNightColor = this.color;
            return ((((iHashCode5 + (dayNightColor != null ? dayNightColor.hashCode() : 0)) * 31) + this.ctaText.hashCode()) * 31) + this.deltas.hashCode();
        }

        public String toString() {
            return "EventSideInfo(id=" + this.id + ", displayName=" + this.displayName + ", score=" + this.score + ", showIndicator=" + this.showIndicator + ", imageUrl=" + this.imageUrl + ", rawPrice=" + this.rawPrice + ", displayPrice=" + this.displayPrice + ", openInterest=" + this.openInterest + ", color=" + this.color + ", ctaText=" + this.ctaText + ", deltas=" + this.deltas + ")";
        }

        public EventSideInfo(String id, String displayName, String str, boolean z, String str2, BigDecimal bigDecimal, String str3, BigDecimal openInterest, DayNightColor dayNightColor, String ctaText, ImmutableList<FloatingOpenInterestDelta> deltas) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(openInterest, "openInterest");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(deltas, "deltas");
            this.id = id;
            this.displayName = displayName;
            this.score = str;
            this.showIndicator = z;
            this.imageUrl = str2;
            this.rawPrice = bigDecimal;
            this.displayPrice = str3;
            this.openInterest = openInterest;
            this.color = dayNightColor;
            this.ctaText = ctaText;
            this.deltas = deltas;
        }

        public final String getId() {
            return this.id;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getScore() {
            return this.score;
        }

        public final boolean getShowIndicator() {
            return this.showIndicator;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final BigDecimal getRawPrice() {
            return this.rawPrice;
        }

        public final String getDisplayPrice() {
            return this.displayPrice;
        }

        public final BigDecimal getOpenInterest() {
            return this.openInterest;
        }

        public final DayNightColor getColor() {
            return this.color;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public /* synthetic */ EventSideInfo(String str, String str2, String str3, boolean z, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, DayNightColor dayNightColor, String str6, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, str4, bigDecimal, str5, bigDecimal2, dayNightColor, str6, (i & 1024) != 0 ? extensions2.persistentListOf() : immutableList);
        }

        public final ImmutableList<FloatingOpenInterestDelta> getDeltas() {
            return this.deltas;
        }
    }

    /* compiled from: SearchHighlightSportsHeroCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$SideColor;", "", "light", "Landroidx/compose/ui/graphics/Color;", "dark", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLight-0d7_KjU", "()J", "J", "getDark-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$SideColor;", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SideColor {
        public static final int $stable = 0;
        private final long dark;
        private final long light;

        public /* synthetic */ SideColor(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ SideColor m18646copyOWjLjI$default(SideColor sideColor, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sideColor.light;
            }
            if ((i & 2) != 0) {
                j2 = sideColor.dark;
            }
            return sideColor.m18649copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getLight() {
            return this.light;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDark() {
            return this.dark;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final SideColor m18649copyOWjLjI(long light, long dark) {
            return new SideColor(light, dark, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SideColor)) {
                return false;
            }
            SideColor sideColor = (SideColor) other;
            return Color.m6707equalsimpl0(this.light, sideColor.light) && Color.m6707equalsimpl0(this.dark, sideColor.dark);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.light) * 31) + Color.m6713hashCodeimpl(this.dark);
        }

        public String toString() {
            return "SideColor(light=" + Color.m6714toStringimpl(this.light) + ", dark=" + Color.m6714toStringimpl(this.dark) + ")";
        }

        private SideColor(long j, long j2) {
            this.light = j;
            this.dark = j2;
        }

        /* renamed from: getLight-0d7_KjU, reason: not valid java name */
        public final long m18651getLight0d7_KjU() {
            return this.light;
        }

        /* renamed from: getDark-0d7_KjU, reason: not valid java name */
        public final long m18650getDark0d7_KjU() {
            return this.dark;
        }
    }
}
