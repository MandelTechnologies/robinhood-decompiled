package com.robinhood.android.search.highlights.p249ui.multicontractshero;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import search_coprocessor.p542v1.MultiContractsHeroDetailsDto;

/* compiled from: SearchHighlightMultiContractHeroCardDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardDataState;", "", "eventId", "Ljava/util/UUID;", "heroDetails", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "<init>", "(Ljava/util/UUID;Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;)V", "getEventId", "()Ljava/util/UUID;", "getHeroDetails", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightMultiContractHeroCardDataState {
    public static final int $stable = 8;
    private final UUID eventId;
    private final MultiContractsHeroDetailsDto heroDetails;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightMultiContractHeroCardDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchHighlightMultiContractHeroCardDataState copy$default(SearchHighlightMultiContractHeroCardDataState searchHighlightMultiContractHeroCardDataState, UUID uuid, MultiContractsHeroDetailsDto multiContractsHeroDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = searchHighlightMultiContractHeroCardDataState.eventId;
        }
        if ((i & 2) != 0) {
            multiContractsHeroDetailsDto = searchHighlightMultiContractHeroCardDataState.heroDetails;
        }
        return searchHighlightMultiContractHeroCardDataState.copy(uuid, multiContractsHeroDetailsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final MultiContractsHeroDetailsDto getHeroDetails() {
        return this.heroDetails;
    }

    public final SearchHighlightMultiContractHeroCardDataState copy(UUID eventId, MultiContractsHeroDetailsDto heroDetails) {
        return new SearchHighlightMultiContractHeroCardDataState(eventId, heroDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightMultiContractHeroCardDataState)) {
            return false;
        }
        SearchHighlightMultiContractHeroCardDataState searchHighlightMultiContractHeroCardDataState = (SearchHighlightMultiContractHeroCardDataState) other;
        return Intrinsics.areEqual(this.eventId, searchHighlightMultiContractHeroCardDataState.eventId) && Intrinsics.areEqual(this.heroDetails, searchHighlightMultiContractHeroCardDataState.heroDetails);
    }

    public int hashCode() {
        UUID uuid = this.eventId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        MultiContractsHeroDetailsDto multiContractsHeroDetailsDto = this.heroDetails;
        return iHashCode + (multiContractsHeroDetailsDto != null ? multiContractsHeroDetailsDto.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightMultiContractHeroCardDataState(eventId=" + this.eventId + ", heroDetails=" + this.heroDetails + ")";
    }

    public SearchHighlightMultiContractHeroCardDataState(UUID uuid, MultiContractsHeroDetailsDto multiContractsHeroDetailsDto) {
        this.eventId = uuid;
        this.heroDetails = multiContractsHeroDetailsDto;
    }

    public /* synthetic */ SearchHighlightMultiContractHeroCardDataState(UUID uuid, MultiContractsHeroDetailsDto multiContractsHeroDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : multiContractsHeroDetailsDto);
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final MultiContractsHeroDetailsDto getHeroDetails() {
        return this.heroDetails;
    }
}
