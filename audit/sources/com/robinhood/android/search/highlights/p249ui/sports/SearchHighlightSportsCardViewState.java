package com.robinhood.android.search.highlights.p249ui.sports;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.model.ProbabilitySegments2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchHighlightSportsCardViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÂ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "", "isLive", "", "eventId", "Ljava/util/UUID;", "timeIndicatorLabel", "Lcom/robinhood/utils/resource/StringResource;", "contractRowItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState$ContractRowItem;", "loading", "rawProbabilitySegments", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "<init>", "(ZLjava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getEventId", "()Ljava/util/UUID;", "getTimeIndicatorLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getContractRowItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getLoading", "probabilitySegments", "getProbabilitySegments", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "ContractRowItem", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightSportsCardViewState {
    public static final int $stable = 0;
    private final ImmutableList<ContractRowItem> contractRowItems;
    private final UUID eventId;
    private final boolean isLive;
    private final boolean loading;
    private final ImmutableList<ProbabilitySegment> probabilitySegments;
    private final ImmutableList<ProbabilitySegment> rawProbabilitySegments;
    private final StringResource timeIndicatorLabel;

    private final ImmutableList<ProbabilitySegment> component6() {
        return this.rawProbabilitySegments;
    }

    public static /* synthetic */ SearchHighlightSportsCardViewState copy$default(SearchHighlightSportsCardViewState searchHighlightSportsCardViewState, boolean z, UUID uuid, StringResource stringResource, ImmutableList immutableList, boolean z2, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchHighlightSportsCardViewState.isLive;
        }
        if ((i & 2) != 0) {
            uuid = searchHighlightSportsCardViewState.eventId;
        }
        if ((i & 4) != 0) {
            stringResource = searchHighlightSportsCardViewState.timeIndicatorLabel;
        }
        if ((i & 8) != 0) {
            immutableList = searchHighlightSportsCardViewState.contractRowItems;
        }
        if ((i & 16) != 0) {
            z2 = searchHighlightSportsCardViewState.loading;
        }
        if ((i & 32) != 0) {
            immutableList2 = searchHighlightSportsCardViewState.rawProbabilitySegments;
        }
        boolean z3 = z2;
        ImmutableList immutableList3 = immutableList2;
        return searchHighlightSportsCardViewState.copy(z, uuid, stringResource, immutableList, z3, immutableList3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTimeIndicatorLabel() {
        return this.timeIndicatorLabel;
    }

    public final ImmutableList<ContractRowItem> component4() {
        return this.contractRowItems;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final SearchHighlightSportsCardViewState copy(boolean isLive, UUID eventId, StringResource timeIndicatorLabel, ImmutableList<ContractRowItem> contractRowItems, boolean loading, ImmutableList<ProbabilitySegment> rawProbabilitySegments) {
        return new SearchHighlightSportsCardViewState(isLive, eventId, timeIndicatorLabel, contractRowItems, loading, rawProbabilitySegments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightSportsCardViewState)) {
            return false;
        }
        SearchHighlightSportsCardViewState searchHighlightSportsCardViewState = (SearchHighlightSportsCardViewState) other;
        return this.isLive == searchHighlightSportsCardViewState.isLive && Intrinsics.areEqual(this.eventId, searchHighlightSportsCardViewState.eventId) && Intrinsics.areEqual(this.timeIndicatorLabel, searchHighlightSportsCardViewState.timeIndicatorLabel) && Intrinsics.areEqual(this.contractRowItems, searchHighlightSportsCardViewState.contractRowItems) && this.loading == searchHighlightSportsCardViewState.loading && Intrinsics.areEqual(this.rawProbabilitySegments, searchHighlightSportsCardViewState.rawProbabilitySegments);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLive) * 31;
        UUID uuid = this.eventId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        StringResource stringResource = this.timeIndicatorLabel;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        ImmutableList<ContractRowItem> immutableList = this.contractRowItems;
        int iHashCode4 = (((iHashCode3 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31;
        ImmutableList<ProbabilitySegment> immutableList2 = this.rawProbabilitySegments;
        return iHashCode4 + (immutableList2 != null ? immutableList2.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightSportsCardViewState(isLive=" + this.isLive + ", eventId=" + this.eventId + ", timeIndicatorLabel=" + this.timeIndicatorLabel + ", contractRowItems=" + this.contractRowItems + ", loading=" + this.loading + ", rawProbabilitySegments=" + this.rawProbabilitySegments + ")";
    }

    public SearchHighlightSportsCardViewState(boolean z, UUID uuid, StringResource stringResource, ImmutableList<ContractRowItem> immutableList, boolean z2, ImmutableList<ProbabilitySegment> immutableList2) {
        ImmutableList<ProbabilitySegment> immutableListApplyMinFractionRule$default;
        this.isLive = z;
        this.eventId = uuid;
        this.timeIndicatorLabel = stringResource;
        this.contractRowItems = immutableList;
        this.loading = z2;
        this.rawProbabilitySegments = immutableList2;
        this.probabilitySegments = (immutableList2 == null || (immutableListApplyMinFractionRule$default = ProbabilitySegments2.applyMinFractionRule$default(immutableList2, 0.0f, 2, null)) == null) ? extensions2.persistentListOf() : immutableListApplyMinFractionRule$default;
    }

    public /* synthetic */ SearchHighlightSportsCardViewState(boolean z, UUID uuid, StringResource stringResource, ImmutableList immutableList, boolean z2, ImmutableList immutableList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, uuid, stringResource, immutableList, z2, (i & 32) != 0 ? null : immutableList2);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final StringResource getTimeIndicatorLabel() {
        return this.timeIndicatorLabel;
    }

    public final ImmutableList<ContractRowItem> getContractRowItems() {
        return this.contractRowItems;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final ImmutableList<ProbabilitySegment> getProbabilitySegments() {
        return this.probabilitySegments;
    }

    /* compiled from: SearchHighlightSportsCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState$ContractRowItem;", "", MarkdownText4.TagImageUrl, "", "teamName", "metadata", "indicatorActive", "", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getImageUrl", "()Ljava/lang/String;", "getTeamName", "getMetadata", "getIndicatorActive", "()Z", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractRowItem {
        public static final int $stable = 0;
        private final DayNightColor contractColor;
        private final String imageUrl;
        private final boolean indicatorActive;
        private final String metadata;
        private final String teamName;

        public static /* synthetic */ ContractRowItem copy$default(ContractRowItem contractRowItem, String str, String str2, String str3, boolean z, DayNightColor dayNightColor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contractRowItem.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = contractRowItem.teamName;
            }
            if ((i & 4) != 0) {
                str3 = contractRowItem.metadata;
            }
            if ((i & 8) != 0) {
                z = contractRowItem.indicatorActive;
            }
            if ((i & 16) != 0) {
                dayNightColor = contractRowItem.contractColor;
            }
            DayNightColor dayNightColor2 = dayNightColor;
            String str4 = str3;
            return contractRowItem.copy(str, str2, str4, z, dayNightColor2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTeamName() {
            return this.teamName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMetadata() {
            return this.metadata;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIndicatorActive() {
            return this.indicatorActive;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        public final ContractRowItem copy(String imageUrl, String teamName, String metadata, boolean indicatorActive, DayNightColor contractColor) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(teamName, "teamName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(contractColor, "contractColor");
            return new ContractRowItem(imageUrl, teamName, metadata, indicatorActive, contractColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractRowItem)) {
                return false;
            }
            ContractRowItem contractRowItem = (ContractRowItem) other;
            return Intrinsics.areEqual(this.imageUrl, contractRowItem.imageUrl) && Intrinsics.areEqual(this.teamName, contractRowItem.teamName) && Intrinsics.areEqual(this.metadata, contractRowItem.metadata) && this.indicatorActive == contractRowItem.indicatorActive && Intrinsics.areEqual(this.contractColor, contractRowItem.contractColor);
        }

        public int hashCode() {
            return (((((((this.imageUrl.hashCode() * 31) + this.teamName.hashCode()) * 31) + this.metadata.hashCode()) * 31) + Boolean.hashCode(this.indicatorActive)) * 31) + this.contractColor.hashCode();
        }

        public String toString() {
            return "ContractRowItem(imageUrl=" + this.imageUrl + ", teamName=" + this.teamName + ", metadata=" + this.metadata + ", indicatorActive=" + this.indicatorActive + ", contractColor=" + this.contractColor + ")";
        }

        public ContractRowItem(String imageUrl, String teamName, String metadata, boolean z, DayNightColor contractColor) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(teamName, "teamName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(contractColor, "contractColor");
            this.imageUrl = imageUrl;
            this.teamName = teamName;
            this.metadata = metadata;
            this.indicatorActive = z;
            this.contractColor = contractColor;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final String getMetadata() {
            return this.metadata;
        }

        public final boolean getIndicatorActive() {
            return this.indicatorActive;
        }

        public final DayNightColor getContractColor() {
            return this.contractColor;
        }
    }
}
