package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import search_coprocessor.p542v1.SportEventHeroDetailsDto;

/* compiled from: SearchHighlightSportsHeroCardDataState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJl\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001c¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDataState;", "", "Ljava/util/UUID;", "eventId", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "heroDetails", "Ljava/math/BigDecimal;", "previousLeftOpenInterest", "previousRightOpenInterest", "", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "leftSideDeltas", "rightSideDeltas", "j$/time/Instant", "currentTimestamp", "<init>", "(Ljava/util/UUID;Lsearch_coprocessor/v1/SportEventHeroDetailsDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lj$/time/Instant;", "copy", "(Ljava/util/UUID;Lsearch_coprocessor/v1/SportEventHeroDetailsDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;)Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getEventId", "Lsearch_coprocessor/v1/SportEventHeroDetailsDto;", "getHeroDetails", "Ljava/math/BigDecimal;", "getPreviousLeftOpenInterest", "getPreviousRightOpenInterest", "Ljava/util/List;", "getLeftSideDeltas", "getRightSideDeltas", "Lj$/time/Instant;", "getCurrentTimestamp", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightSportsHeroCardDataState {
    public static final int $stable = 8;
    private final Instant currentTimestamp;
    private final UUID eventId;
    private final SportEventHeroDetailsDto heroDetails;
    private final List<FloatingOpenInterestDelta> leftSideDeltas;
    private final BigDecimal previousLeftOpenInterest;
    private final BigDecimal previousRightOpenInterest;
    private final List<FloatingOpenInterestDelta> rightSideDeltas;

    public SearchHighlightSportsHeroCardDataState() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ SearchHighlightSportsHeroCardDataState copy$default(SearchHighlightSportsHeroCardDataState searchHighlightSportsHeroCardDataState, UUID uuid, SportEventHeroDetailsDto sportEventHeroDetailsDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, List list2, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = searchHighlightSportsHeroCardDataState.eventId;
        }
        if ((i & 2) != 0) {
            sportEventHeroDetailsDto = searchHighlightSportsHeroCardDataState.heroDetails;
        }
        if ((i & 4) != 0) {
            bigDecimal = searchHighlightSportsHeroCardDataState.previousLeftOpenInterest;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = searchHighlightSportsHeroCardDataState.previousRightOpenInterest;
        }
        if ((i & 16) != 0) {
            list = searchHighlightSportsHeroCardDataState.leftSideDeltas;
        }
        if ((i & 32) != 0) {
            list2 = searchHighlightSportsHeroCardDataState.rightSideDeltas;
        }
        if ((i & 64) != 0) {
            instant = searchHighlightSportsHeroCardDataState.currentTimestamp;
        }
        List list3 = list2;
        Instant instant2 = instant;
        List list4 = list;
        BigDecimal bigDecimal3 = bigDecimal;
        return searchHighlightSportsHeroCardDataState.copy(uuid, sportEventHeroDetailsDto, bigDecimal3, bigDecimal2, list4, list3, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final SportEventHeroDetailsDto getHeroDetails() {
        return this.heroDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getPreviousLeftOpenInterest() {
        return this.previousLeftOpenInterest;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getPreviousRightOpenInterest() {
        return this.previousRightOpenInterest;
    }

    public final List<FloatingOpenInterestDelta> component5() {
        return this.leftSideDeltas;
    }

    public final List<FloatingOpenInterestDelta> component6() {
        return this.rightSideDeltas;
    }

    /* renamed from: component7, reason: from getter */
    public final Instant getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public final SearchHighlightSportsHeroCardDataState copy(UUID eventId, SportEventHeroDetailsDto heroDetails, BigDecimal previousLeftOpenInterest, BigDecimal previousRightOpenInterest, List<FloatingOpenInterestDelta> leftSideDeltas, List<FloatingOpenInterestDelta> rightSideDeltas, Instant currentTimestamp) {
        Intrinsics.checkNotNullParameter(leftSideDeltas, "leftSideDeltas");
        Intrinsics.checkNotNullParameter(rightSideDeltas, "rightSideDeltas");
        return new SearchHighlightSportsHeroCardDataState(eventId, heroDetails, previousLeftOpenInterest, previousRightOpenInterest, leftSideDeltas, rightSideDeltas, currentTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightSportsHeroCardDataState)) {
            return false;
        }
        SearchHighlightSportsHeroCardDataState searchHighlightSportsHeroCardDataState = (SearchHighlightSportsHeroCardDataState) other;
        return Intrinsics.areEqual(this.eventId, searchHighlightSportsHeroCardDataState.eventId) && Intrinsics.areEqual(this.heroDetails, searchHighlightSportsHeroCardDataState.heroDetails) && Intrinsics.areEqual(this.previousLeftOpenInterest, searchHighlightSportsHeroCardDataState.previousLeftOpenInterest) && Intrinsics.areEqual(this.previousRightOpenInterest, searchHighlightSportsHeroCardDataState.previousRightOpenInterest) && Intrinsics.areEqual(this.leftSideDeltas, searchHighlightSportsHeroCardDataState.leftSideDeltas) && Intrinsics.areEqual(this.rightSideDeltas, searchHighlightSportsHeroCardDataState.rightSideDeltas) && Intrinsics.areEqual(this.currentTimestamp, searchHighlightSportsHeroCardDataState.currentTimestamp);
    }

    public int hashCode() {
        UUID uuid = this.eventId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        SportEventHeroDetailsDto sportEventHeroDetailsDto = this.heroDetails;
        int iHashCode2 = (iHashCode + (sportEventHeroDetailsDto == null ? 0 : sportEventHeroDetailsDto.hashCode())) * 31;
        BigDecimal bigDecimal = this.previousLeftOpenInterest;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.previousRightOpenInterest;
        int iHashCode4 = (((((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.leftSideDeltas.hashCode()) * 31) + this.rightSideDeltas.hashCode()) * 31;
        Instant instant = this.currentTimestamp;
        return iHashCode4 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightSportsHeroCardDataState(eventId=" + this.eventId + ", heroDetails=" + this.heroDetails + ", previousLeftOpenInterest=" + this.previousLeftOpenInterest + ", previousRightOpenInterest=" + this.previousRightOpenInterest + ", leftSideDeltas=" + this.leftSideDeltas + ", rightSideDeltas=" + this.rightSideDeltas + ", currentTimestamp=" + this.currentTimestamp + ")";
    }

    public SearchHighlightSportsHeroCardDataState(UUID uuid, SportEventHeroDetailsDto sportEventHeroDetailsDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, List<FloatingOpenInterestDelta> leftSideDeltas, List<FloatingOpenInterestDelta> rightSideDeltas, Instant instant) {
        Intrinsics.checkNotNullParameter(leftSideDeltas, "leftSideDeltas");
        Intrinsics.checkNotNullParameter(rightSideDeltas, "rightSideDeltas");
        this.eventId = uuid;
        this.heroDetails = sportEventHeroDetailsDto;
        this.previousLeftOpenInterest = bigDecimal;
        this.previousRightOpenInterest = bigDecimal2;
        this.leftSideDeltas = leftSideDeltas;
        this.rightSideDeltas = rightSideDeltas;
        this.currentTimestamp = instant;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final SportEventHeroDetailsDto getHeroDetails() {
        return this.heroDetails;
    }

    public final BigDecimal getPreviousLeftOpenInterest() {
        return this.previousLeftOpenInterest;
    }

    public final BigDecimal getPreviousRightOpenInterest() {
        return this.previousRightOpenInterest;
    }

    public /* synthetic */ SearchHighlightSportsHeroCardDataState(UUID uuid, SportEventHeroDetailsDto sportEventHeroDetailsDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, List list2, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : sportEventHeroDetailsDto, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : bigDecimal2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : instant);
    }

    public final List<FloatingOpenInterestDelta> getLeftSideDeltas() {
        return this.leftSideDeltas;
    }

    public final List<FloatingOpenInterestDelta> getRightSideDeltas() {
        return this.rightSideDeltas;
    }

    public final Instant getCurrentTimestamp() {
        return this.currentTimestamp;
    }
}
