package com.robinhood.android.search.highlights.p249ui.multicontractshero;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.model.ProbabilitySegments2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.MultiContractsHeroDetailsDto;

/* compiled from: SearchHighlightMultiContractHeroCardViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState;", "", "loading", "", "eventId", "Ljava/util/UUID;", "title", "", "headline", "contracts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState$ContractDisplayInfo;", ResourceTypes.STYLE, "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "<init>", "(ZLjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;)V", "getLoading", "()Z", "getEventId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getHeadline", "getContracts", "()Lkotlinx/collections/immutable/ImmutableList;", "getStyle", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "probabilitySegments", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "getProbabilitySegments", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ContractDisplayInfo", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightMultiContractHeroCardViewState {
    public static final int $stable = 0;
    private final ImmutableList<ContractDisplayInfo> contracts;
    private final UUID eventId;
    private final String headline;
    private final boolean loading;
    private final ImmutableList<ProbabilitySegment> probabilitySegments;
    private final MultiContractsHeroDetailsDto.DisplayStyleDto style;
    private final String title;

    public SearchHighlightMultiContractHeroCardViewState() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SearchHighlightMultiContractHeroCardViewState copy$default(SearchHighlightMultiContractHeroCardViewState searchHighlightMultiContractHeroCardViewState, boolean z, UUID uuid, String str, String str2, ImmutableList immutableList, MultiContractsHeroDetailsDto.DisplayStyleDto displayStyleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchHighlightMultiContractHeroCardViewState.loading;
        }
        if ((i & 2) != 0) {
            uuid = searchHighlightMultiContractHeroCardViewState.eventId;
        }
        if ((i & 4) != 0) {
            str = searchHighlightMultiContractHeroCardViewState.title;
        }
        if ((i & 8) != 0) {
            str2 = searchHighlightMultiContractHeroCardViewState.headline;
        }
        if ((i & 16) != 0) {
            immutableList = searchHighlightMultiContractHeroCardViewState.contracts;
        }
        if ((i & 32) != 0) {
            displayStyleDto = searchHighlightMultiContractHeroCardViewState.style;
        }
        ImmutableList immutableList2 = immutableList;
        MultiContractsHeroDetailsDto.DisplayStyleDto displayStyleDto2 = displayStyleDto;
        return searchHighlightMultiContractHeroCardViewState.copy(z, uuid, str, str2, immutableList2, displayStyleDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    public final ImmutableList<ContractDisplayInfo> component5() {
        return this.contracts;
    }

    /* renamed from: component6, reason: from getter */
    public final MultiContractsHeroDetailsDto.DisplayStyleDto getStyle() {
        return this.style;
    }

    public final SearchHighlightMultiContractHeroCardViewState copy(boolean loading, UUID eventId, String title, String headline, ImmutableList<ContractDisplayInfo> contracts2, MultiContractsHeroDetailsDto.DisplayStyleDto style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(style, "style");
        return new SearchHighlightMultiContractHeroCardViewState(loading, eventId, title, headline, contracts2, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightMultiContractHeroCardViewState)) {
            return false;
        }
        SearchHighlightMultiContractHeroCardViewState searchHighlightMultiContractHeroCardViewState = (SearchHighlightMultiContractHeroCardViewState) other;
        return this.loading == searchHighlightMultiContractHeroCardViewState.loading && Intrinsics.areEqual(this.eventId, searchHighlightMultiContractHeroCardViewState.eventId) && Intrinsics.areEqual(this.title, searchHighlightMultiContractHeroCardViewState.title) && Intrinsics.areEqual(this.headline, searchHighlightMultiContractHeroCardViewState.headline) && Intrinsics.areEqual(this.contracts, searchHighlightMultiContractHeroCardViewState.contracts) && this.style == searchHighlightMultiContractHeroCardViewState.style;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        UUID uuid = this.eventId;
        return ((((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.title.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.contracts.hashCode()) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "SearchHighlightMultiContractHeroCardViewState(loading=" + this.loading + ", eventId=" + this.eventId + ", title=" + this.title + ", headline=" + this.headline + ", contracts=" + this.contracts + ", style=" + this.style + ")";
    }

    public SearchHighlightMultiContractHeroCardViewState(boolean z, UUID uuid, String title, String headline, ImmutableList<ContractDisplayInfo> contracts2, MultiContractsHeroDetailsDto.DisplayStyleDto style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(style, "style");
        this.loading = z;
        this.eventId = uuid;
        this.title = title;
        this.headline = headline;
        this.contracts = contracts2;
        this.style = style;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
        for (ContractDisplayInfo contractDisplayInfo : contracts2) {
            arrayList.add(new ProbabilitySegment(contractDisplayInfo.getProbabilityValue(), contractDisplayInfo.getColor()));
        }
        this.probabilitySegments = ProbabilitySegments2.applyMinFractionRule$default(arrayList, 0.0f, 2, null);
    }

    public /* synthetic */ SearchHighlightMultiContractHeroCardViewState(boolean z, UUID uuid, String str, String str2, ImmutableList immutableList, MultiContractsHeroDetailsDto.DisplayStyleDto displayStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? extensions2.persistentListOf() : immutableList, (i & 32) != 0 ? MultiContractsHeroDetailsDto.DisplayStyleDto.DISPLAY_STYLE_UNSPECIFIED : displayStyleDto);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final ImmutableList<ContractDisplayInfo> getContracts() {
        return this.contracts;
    }

    public final MultiContractsHeroDetailsDto.DisplayStyleDto getStyle() {
        return this.style;
    }

    public final ImmutableList<ProbabilitySegment> getProbabilitySegments() {
        return this.probabilitySegments;
    }

    /* compiled from: SearchHighlightMultiContractHeroCardViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState$ContractDisplayInfo;", "", "id", "", "title", "displayValue", "probabilityValue", "", ResourceTypes.COLOR, "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "isHighlighted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getDisplayValue", "getProbabilityValue", "()F", "getColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractDisplayInfo {
        public static final int $stable = 0;
        private final DayNightColor color;
        private final String displayValue;
        private final String id;
        private final boolean isHighlighted;
        private final float probabilityValue;
        private final String title;

        public static /* synthetic */ ContractDisplayInfo copy$default(ContractDisplayInfo contractDisplayInfo, String str, String str2, String str3, float f, DayNightColor dayNightColor, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contractDisplayInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = contractDisplayInfo.title;
            }
            if ((i & 4) != 0) {
                str3 = contractDisplayInfo.displayValue;
            }
            if ((i & 8) != 0) {
                f = contractDisplayInfo.probabilityValue;
            }
            if ((i & 16) != 0) {
                dayNightColor = contractDisplayInfo.color;
            }
            if ((i & 32) != 0) {
                z = contractDisplayInfo.isHighlighted;
            }
            DayNightColor dayNightColor2 = dayNightColor;
            boolean z2 = z;
            return contractDisplayInfo.copy(str, str2, str3, f, dayNightColor2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayValue() {
            return this.displayValue;
        }

        /* renamed from: component4, reason: from getter */
        public final float getProbabilityValue() {
            return this.probabilityValue;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightColor getColor() {
            return this.color;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsHighlighted() {
            return this.isHighlighted;
        }

        public final ContractDisplayInfo copy(String id, String title, String displayValue, float probabilityValue, DayNightColor color, boolean isHighlighted) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(displayValue, "displayValue");
            Intrinsics.checkNotNullParameter(color, "color");
            return new ContractDisplayInfo(id, title, displayValue, probabilityValue, color, isHighlighted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractDisplayInfo)) {
                return false;
            }
            ContractDisplayInfo contractDisplayInfo = (ContractDisplayInfo) other;
            return Intrinsics.areEqual(this.id, contractDisplayInfo.id) && Intrinsics.areEqual(this.title, contractDisplayInfo.title) && Intrinsics.areEqual(this.displayValue, contractDisplayInfo.displayValue) && Float.compare(this.probabilityValue, contractDisplayInfo.probabilityValue) == 0 && Intrinsics.areEqual(this.color, contractDisplayInfo.color) && this.isHighlighted == contractDisplayInfo.isHighlighted;
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.displayValue.hashCode()) * 31) + Float.hashCode(this.probabilityValue)) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.isHighlighted);
        }

        public String toString() {
            return "ContractDisplayInfo(id=" + this.id + ", title=" + this.title + ", displayValue=" + this.displayValue + ", probabilityValue=" + this.probabilityValue + ", color=" + this.color + ", isHighlighted=" + this.isHighlighted + ")";
        }

        public ContractDisplayInfo(String id, String title, String displayValue, float f, DayNightColor color, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(displayValue, "displayValue");
            Intrinsics.checkNotNullParameter(color, "color");
            this.id = id;
            this.title = title;
            this.displayValue = displayValue;
            this.probabilityValue = f;
            this.color = color;
            this.isHighlighted = z;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDisplayValue() {
            return this.displayValue;
        }

        public final float getProbabilityValue() {
            return this.probabilityValue;
        }

        public final DayNightColor getColor() {
            return this.color;
        }

        public final boolean isHighlighted() {
            return this.isHighlighted;
        }
    }
}
