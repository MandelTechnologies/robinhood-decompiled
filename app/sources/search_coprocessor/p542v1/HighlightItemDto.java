package search_coprocessor.p542v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import search_coprocessor.p542v1.AssetChipGridDto;
import search_coprocessor.p542v1.AssetHeroDto;
import search_coprocessor.p542v1.CompactIndiciesDto;
import search_coprocessor.p542v1.EarningsListDto;
import search_coprocessor.p542v1.EmbeddedSectionDto;
import search_coprocessor.p542v1.EventContractHeroDto;
import search_coprocessor.p542v1.ExpandedIndiciesDto;
import search_coprocessor.p542v1.GenericHeroDto;
import search_coprocessor.p542v1.GroupedListsSectionDto;
import search_coprocessor.p542v1.ListHeatmapCarouselDto;
import search_coprocessor.p542v1.MultiContractsHeroCarouselDto;
import search_coprocessor.p542v1.NewsSectionDto;
import search_coprocessor.p542v1.PredictionEventsListDto;
import search_coprocessor.p542v1.QuickLinksDto;
import search_coprocessor.p542v1.SectionTitleDto;
import search_coprocessor.p542v1.SportCarouselDto;
import search_coprocessor.p542v1.SportEventHeroDto;
import search_coprocessor.p542v1.SportsHeroCarouselDto;

/* compiled from: HighlightItemDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/HighlightItem;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;)V", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "content", "(Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;)V", "toProto", "()Lsearch_coprocessor/v1/HighlightItem;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;", "getContent", "()Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Companion", "Surrogate", "ContentDto", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class HighlightItemDto implements Dto3<HighlightItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HighlightItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HighlightItemDto, HighlightItem>> binaryBase64Serializer$delegate;
    private static final HighlightItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HighlightItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HighlightItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ContentDto getContent() {
        if (this.surrogate.getSection_title() != null) {
            return new ContentDto.SectionTitle(this.surrogate.getSection_title());
        }
        if (this.surrogate.getAsset_chip_grid() != null) {
            return new ContentDto.AssetChipGrid(this.surrogate.getAsset_chip_grid());
        }
        if (this.surrogate.getEarnings_list() != null) {
            return new ContentDto.EarningsList(this.surrogate.getEarnings_list());
        }
        if (this.surrogate.getSport_event_hero() != null) {
            return new ContentDto.SportEventHero(this.surrogate.getSport_event_hero());
        }
        if (this.surrogate.getSport_carousel() != null) {
            return new ContentDto.SportCarousel(this.surrogate.getSport_carousel());
        }
        if (this.surrogate.getEvent_contract_hero() != null) {
            return new ContentDto.EventContractHero(this.surrogate.getEvent_contract_hero());
        }
        if (this.surrogate.getCompact_indicies() != null) {
            return new ContentDto.CompactIndicies(this.surrogate.getCompact_indicies());
        }
        if (this.surrogate.getExpanded_indicies() != null) {
            return new ContentDto.ExpandedIndicies(this.surrogate.getExpanded_indicies());
        }
        if (this.surrogate.getAsset_hero() != null) {
            return new ContentDto.AssetHero(this.surrogate.getAsset_hero());
        }
        if (this.surrogate.getGeneric_hero() != null) {
            return new ContentDto.GenericHero(this.surrogate.getGeneric_hero());
        }
        if (this.surrogate.getEmbedded_section() != null) {
            return new ContentDto.EmbeddedSection(this.surrogate.getEmbedded_section());
        }
        if (this.surrogate.getSports_hero_carousel() != null) {
            return new ContentDto.SportsHeroCarousel(this.surrogate.getSports_hero_carousel());
        }
        if (this.surrogate.getQuick_links() != null) {
            return new ContentDto.QuickLinks(this.surrogate.getQuick_links());
        }
        if (this.surrogate.getMulti_contracts_hero_carousel() != null) {
            return new ContentDto.MultiContractsHeroCarousel(this.surrogate.getMulti_contracts_hero_carousel());
        }
        if (this.surrogate.getList_heatmap_carousel() != null) {
            return new ContentDto.ListHeatmapCarousel(this.surrogate.getList_heatmap_carousel());
        }
        if (this.surrogate.getPrediction_events_list() != null) {
            return new ContentDto.PredictionEventsList(this.surrogate.getPrediction_events_list());
        }
        if (this.surrogate.getNews_section() != null) {
            return new ContentDto.NewsSection(this.surrogate.getNews_section());
        }
        if (this.surrogate.getGrouped_lists_section() != null) {
            return new ContentDto.GroupedListsSection(this.surrogate.getGrouped_lists_section());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public HighlightItemDto(search_coprocessor.v1.HighlightItemDto.ContentDto r22) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: search_coprocessor.p542v1.HighlightItemDto.<init>(search_coprocessor.v1.HighlightItemDto$ContentDto):void");
    }

    public /* synthetic */ HighlightItemDto(ContentDto contentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contentDto);
    }

    @Override // com.robinhood.idl.Dto
    public HighlightItem toProto() {
        SectionTitleDto section_title = this.surrogate.getSection_title();
        SectionTitle proto = section_title != null ? section_title.toProto() : null;
        AssetChipGridDto asset_chip_grid = this.surrogate.getAsset_chip_grid();
        AssetChipGrid proto2 = asset_chip_grid != null ? asset_chip_grid.toProto() : null;
        EarningsListDto earnings_list = this.surrogate.getEarnings_list();
        EarningsList proto3 = earnings_list != null ? earnings_list.toProto() : null;
        SportEventHeroDto sport_event_hero = this.surrogate.getSport_event_hero();
        SportEventHero proto4 = sport_event_hero != null ? sport_event_hero.toProto() : null;
        SportCarouselDto sport_carousel = this.surrogate.getSport_carousel();
        SportCarousel proto5 = sport_carousel != null ? sport_carousel.toProto() : null;
        EventContractHeroDto event_contract_hero = this.surrogate.getEvent_contract_hero();
        EventContractHero proto6 = event_contract_hero != null ? event_contract_hero.toProto() : null;
        CompactIndiciesDto compact_indicies = this.surrogate.getCompact_indicies();
        CompactIndicies proto7 = compact_indicies != null ? compact_indicies.toProto() : null;
        ExpandedIndiciesDto expanded_indicies = this.surrogate.getExpanded_indicies();
        ExpandedIndicies proto8 = expanded_indicies != null ? expanded_indicies.toProto() : null;
        AssetHeroDto asset_hero = this.surrogate.getAsset_hero();
        AssetHero proto9 = asset_hero != null ? asset_hero.toProto() : null;
        GenericHeroDto generic_hero = this.surrogate.getGeneric_hero();
        GenericHero proto10 = generic_hero != null ? generic_hero.toProto() : null;
        EmbeddedSectionDto embedded_section = this.surrogate.getEmbedded_section();
        EmbeddedSection proto11 = embedded_section != null ? embedded_section.toProto() : null;
        SportsHeroCarouselDto sports_hero_carousel = this.surrogate.getSports_hero_carousel();
        SportsHeroCarousel proto12 = sports_hero_carousel != null ? sports_hero_carousel.toProto() : null;
        QuickLinksDto quick_links = this.surrogate.getQuick_links();
        QuickLinks proto13 = quick_links != null ? quick_links.toProto() : null;
        MultiContractsHeroCarouselDto multi_contracts_hero_carousel = this.surrogate.getMulti_contracts_hero_carousel();
        MultiContractsHeroCarousel proto14 = multi_contracts_hero_carousel != null ? multi_contracts_hero_carousel.toProto() : null;
        ListHeatmapCarouselDto list_heatmap_carousel = this.surrogate.getList_heatmap_carousel();
        ListHeatmapCarousel proto15 = list_heatmap_carousel != null ? list_heatmap_carousel.toProto() : null;
        PredictionEventsListDto prediction_events_list = this.surrogate.getPrediction_events_list();
        PredictionEventsList proto16 = prediction_events_list != null ? prediction_events_list.toProto() : null;
        NewsSectionDto news_section = this.surrogate.getNews_section();
        NewsSection proto17 = news_section != null ? news_section.toProto() : null;
        GroupedListsSectionDto grouped_lists_section = this.surrogate.getGrouped_lists_section();
        return new HighlightItem(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, grouped_lists_section != null ? grouped_lists_section.toProto() : null, null, 262144, null);
    }

    public String toString() {
        return "[HighlightItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HighlightItemDto) && Intrinsics.areEqual(((HighlightItemDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HighlightItemDto.kt */
    @Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bN\b\u0083\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0089\u0001\u0088\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'BÏ\u0001\b\u0010\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b&\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020(HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bG\u0010C\u001a\u0004\bE\u0010FR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010H\u0012\u0004\bK\u0010C\u001a\u0004\bI\u0010JR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010L\u0012\u0004\bO\u0010C\u001a\u0004\bM\u0010NR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010P\u0012\u0004\bS\u0010C\u001a\u0004\bQ\u0010RR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010T\u0012\u0004\bW\u0010C\u001a\u0004\bU\u0010VR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010X\u0012\u0004\b[\u0010C\u001a\u0004\bY\u0010ZR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\\\u0012\u0004\b_\u0010C\u001a\u0004\b]\u0010^R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010`\u0012\u0004\bc\u0010C\u001a\u0004\ba\u0010bR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010d\u0012\u0004\bg\u0010C\u001a\u0004\be\u0010fR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010h\u0012\u0004\bk\u0010C\u001a\u0004\bi\u0010jR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010l\u0012\u0004\bo\u0010C\u001a\u0004\bm\u0010nR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010p\u0012\u0004\bs\u0010C\u001a\u0004\bq\u0010rR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010t\u0012\u0004\bw\u0010C\u001a\u0004\bu\u0010vR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010x\u0012\u0004\b{\u0010C\u001a\u0004\by\u0010zR\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010|\u0012\u0004\b\u007f\u0010C\u001a\u0004\b}\u0010~R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010C\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010\u0084\u0001\u0012\u0005\b\u0087\u0001\u0010C\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;", "", "Lsearch_coprocessor/v1/SectionTitleDto;", "section_title", "Lsearch_coprocessor/v1/AssetChipGridDto;", "asset_chip_grid", "Lsearch_coprocessor/v1/EarningsListDto;", "earnings_list", "Lsearch_coprocessor/v1/SportEventHeroDto;", "sport_event_hero", "Lsearch_coprocessor/v1/SportCarouselDto;", "sport_carousel", "Lsearch_coprocessor/v1/EventContractHeroDto;", "event_contract_hero", "Lsearch_coprocessor/v1/CompactIndiciesDto;", "compact_indicies", "Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "expanded_indicies", "Lsearch_coprocessor/v1/AssetHeroDto;", "asset_hero", "Lsearch_coprocessor/v1/GenericHeroDto;", "generic_hero", "Lsearch_coprocessor/v1/EmbeddedSectionDto;", "embedded_section", "Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "sports_hero_carousel", "Lsearch_coprocessor/v1/QuickLinksDto;", "quick_links", "Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "multi_contracts_hero_carousel", "Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "list_heatmap_carousel", "Lsearch_coprocessor/v1/PredictionEventsListDto;", "prediction_events_list", "Lsearch_coprocessor/v1/NewsSectionDto;", "news_section", "Lsearch_coprocessor/v1/GroupedListsSectionDto;", "grouped_lists_section", "<init>", "(Lsearch_coprocessor/v1/SectionTitleDto;Lsearch_coprocessor/v1/AssetChipGridDto;Lsearch_coprocessor/v1/EarningsListDto;Lsearch_coprocessor/v1/SportEventHeroDto;Lsearch_coprocessor/v1/SportCarouselDto;Lsearch_coprocessor/v1/EventContractHeroDto;Lsearch_coprocessor/v1/CompactIndiciesDto;Lsearch_coprocessor/v1/ExpandedIndiciesDto;Lsearch_coprocessor/v1/AssetHeroDto;Lsearch_coprocessor/v1/GenericHeroDto;Lsearch_coprocessor/v1/EmbeddedSectionDto;Lsearch_coprocessor/v1/SportsHeroCarouselDto;Lsearch_coprocessor/v1/QuickLinksDto;Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;Lsearch_coprocessor/v1/ListHeatmapCarouselDto;Lsearch_coprocessor/v1/PredictionEventsListDto;Lsearch_coprocessor/v1/NewsSectionDto;Lsearch_coprocessor/v1/GroupedListsSectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILsearch_coprocessor/v1/SectionTitleDto;Lsearch_coprocessor/v1/AssetChipGridDto;Lsearch_coprocessor/v1/EarningsListDto;Lsearch_coprocessor/v1/SportEventHeroDto;Lsearch_coprocessor/v1/SportCarouselDto;Lsearch_coprocessor/v1/EventContractHeroDto;Lsearch_coprocessor/v1/CompactIndiciesDto;Lsearch_coprocessor/v1/ExpandedIndiciesDto;Lsearch_coprocessor/v1/AssetHeroDto;Lsearch_coprocessor/v1/GenericHeroDto;Lsearch_coprocessor/v1/EmbeddedSectionDto;Lsearch_coprocessor/v1/SportsHeroCarouselDto;Lsearch_coprocessor/v1/QuickLinksDto;Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;Lsearch_coprocessor/v1/ListHeatmapCarouselDto;Lsearch_coprocessor/v1/PredictionEventsListDto;Lsearch_coprocessor/v1/NewsSectionDto;Lsearch_coprocessor/v1/GroupedListsSectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SectionTitleDto;", "getSection_title", "()Lsearch_coprocessor/v1/SectionTitleDto;", "getSection_title$annotations", "()V", "Lsearch_coprocessor/v1/AssetChipGridDto;", "getAsset_chip_grid", "()Lsearch_coprocessor/v1/AssetChipGridDto;", "getAsset_chip_grid$annotations", "Lsearch_coprocessor/v1/EarningsListDto;", "getEarnings_list", "()Lsearch_coprocessor/v1/EarningsListDto;", "getEarnings_list$annotations", "Lsearch_coprocessor/v1/SportEventHeroDto;", "getSport_event_hero", "()Lsearch_coprocessor/v1/SportEventHeroDto;", "getSport_event_hero$annotations", "Lsearch_coprocessor/v1/SportCarouselDto;", "getSport_carousel", "()Lsearch_coprocessor/v1/SportCarouselDto;", "getSport_carousel$annotations", "Lsearch_coprocessor/v1/EventContractHeroDto;", "getEvent_contract_hero", "()Lsearch_coprocessor/v1/EventContractHeroDto;", "getEvent_contract_hero$annotations", "Lsearch_coprocessor/v1/CompactIndiciesDto;", "getCompact_indicies", "()Lsearch_coprocessor/v1/CompactIndiciesDto;", "getCompact_indicies$annotations", "Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "getExpanded_indicies", "()Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "getExpanded_indicies$annotations", "Lsearch_coprocessor/v1/AssetHeroDto;", "getAsset_hero", "()Lsearch_coprocessor/v1/AssetHeroDto;", "getAsset_hero$annotations", "Lsearch_coprocessor/v1/GenericHeroDto;", "getGeneric_hero", "()Lsearch_coprocessor/v1/GenericHeroDto;", "getGeneric_hero$annotations", "Lsearch_coprocessor/v1/EmbeddedSectionDto;", "getEmbedded_section", "()Lsearch_coprocessor/v1/EmbeddedSectionDto;", "getEmbedded_section$annotations", "Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "getSports_hero_carousel", "()Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "getSports_hero_carousel$annotations", "Lsearch_coprocessor/v1/QuickLinksDto;", "getQuick_links", "()Lsearch_coprocessor/v1/QuickLinksDto;", "getQuick_links$annotations", "Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "getMulti_contracts_hero_carousel", "()Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "getMulti_contracts_hero_carousel$annotations", "Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "getList_heatmap_carousel", "()Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "getList_heatmap_carousel$annotations", "Lsearch_coprocessor/v1/PredictionEventsListDto;", "getPrediction_events_list", "()Lsearch_coprocessor/v1/PredictionEventsListDto;", "getPrediction_events_list$annotations", "Lsearch_coprocessor/v1/NewsSectionDto;", "getNews_section", "()Lsearch_coprocessor/v1/NewsSectionDto;", "getNews_section$annotations", "Lsearch_coprocessor/v1/GroupedListsSectionDto;", "getGrouped_lists_section", "()Lsearch_coprocessor/v1/GroupedListsSectionDto;", "getGrouped_lists_section$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetChipGridDto asset_chip_grid;
        private final AssetHeroDto asset_hero;
        private final CompactIndiciesDto compact_indicies;
        private final EarningsListDto earnings_list;
        private final EmbeddedSectionDto embedded_section;
        private final EventContractHeroDto event_contract_hero;
        private final ExpandedIndiciesDto expanded_indicies;
        private final GenericHeroDto generic_hero;
        private final GroupedListsSectionDto grouped_lists_section;
        private final ListHeatmapCarouselDto list_heatmap_carousel;
        private final MultiContractsHeroCarouselDto multi_contracts_hero_carousel;
        private final NewsSectionDto news_section;
        private final PredictionEventsListDto prediction_events_list;
        private final QuickLinksDto quick_links;
        private final SectionTitleDto section_title;
        private final SportCarouselDto sport_carousel;
        private final SportEventHeroDto sport_event_hero;
        private final SportsHeroCarouselDto sports_hero_carousel;

        public Surrogate() {
            this((SectionTitleDto) null, (AssetChipGridDto) null, (EarningsListDto) null, (SportEventHeroDto) null, (SportCarouselDto) null, (EventContractHeroDto) null, (CompactIndiciesDto) null, (ExpandedIndiciesDto) null, (AssetHeroDto) null, (GenericHeroDto) null, (EmbeddedSectionDto) null, (SportsHeroCarouselDto) null, (QuickLinksDto) null, (MultiContractsHeroCarouselDto) null, (ListHeatmapCarouselDto) null, (PredictionEventsListDto) null, (NewsSectionDto) null, (GroupedListsSectionDto) null, 262143, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.section_title, surrogate.section_title) && Intrinsics.areEqual(this.asset_chip_grid, surrogate.asset_chip_grid) && Intrinsics.areEqual(this.earnings_list, surrogate.earnings_list) && Intrinsics.areEqual(this.sport_event_hero, surrogate.sport_event_hero) && Intrinsics.areEqual(this.sport_carousel, surrogate.sport_carousel) && Intrinsics.areEqual(this.event_contract_hero, surrogate.event_contract_hero) && Intrinsics.areEqual(this.compact_indicies, surrogate.compact_indicies) && Intrinsics.areEqual(this.expanded_indicies, surrogate.expanded_indicies) && Intrinsics.areEqual(this.asset_hero, surrogate.asset_hero) && Intrinsics.areEqual(this.generic_hero, surrogate.generic_hero) && Intrinsics.areEqual(this.embedded_section, surrogate.embedded_section) && Intrinsics.areEqual(this.sports_hero_carousel, surrogate.sports_hero_carousel) && Intrinsics.areEqual(this.quick_links, surrogate.quick_links) && Intrinsics.areEqual(this.multi_contracts_hero_carousel, surrogate.multi_contracts_hero_carousel) && Intrinsics.areEqual(this.list_heatmap_carousel, surrogate.list_heatmap_carousel) && Intrinsics.areEqual(this.prediction_events_list, surrogate.prediction_events_list) && Intrinsics.areEqual(this.news_section, surrogate.news_section) && Intrinsics.areEqual(this.grouped_lists_section, surrogate.grouped_lists_section);
        }

        public int hashCode() {
            SectionTitleDto sectionTitleDto = this.section_title;
            int iHashCode = (sectionTitleDto == null ? 0 : sectionTitleDto.hashCode()) * 31;
            AssetChipGridDto assetChipGridDto = this.asset_chip_grid;
            int iHashCode2 = (iHashCode + (assetChipGridDto == null ? 0 : assetChipGridDto.hashCode())) * 31;
            EarningsListDto earningsListDto = this.earnings_list;
            int iHashCode3 = (iHashCode2 + (earningsListDto == null ? 0 : earningsListDto.hashCode())) * 31;
            SportEventHeroDto sportEventHeroDto = this.sport_event_hero;
            int iHashCode4 = (iHashCode3 + (sportEventHeroDto == null ? 0 : sportEventHeroDto.hashCode())) * 31;
            SportCarouselDto sportCarouselDto = this.sport_carousel;
            int iHashCode5 = (iHashCode4 + (sportCarouselDto == null ? 0 : sportCarouselDto.hashCode())) * 31;
            EventContractHeroDto eventContractHeroDto = this.event_contract_hero;
            int iHashCode6 = (iHashCode5 + (eventContractHeroDto == null ? 0 : eventContractHeroDto.hashCode())) * 31;
            CompactIndiciesDto compactIndiciesDto = this.compact_indicies;
            int iHashCode7 = (iHashCode6 + (compactIndiciesDto == null ? 0 : compactIndiciesDto.hashCode())) * 31;
            ExpandedIndiciesDto expandedIndiciesDto = this.expanded_indicies;
            int iHashCode8 = (iHashCode7 + (expandedIndiciesDto == null ? 0 : expandedIndiciesDto.hashCode())) * 31;
            AssetHeroDto assetHeroDto = this.asset_hero;
            int iHashCode9 = (iHashCode8 + (assetHeroDto == null ? 0 : assetHeroDto.hashCode())) * 31;
            GenericHeroDto genericHeroDto = this.generic_hero;
            int iHashCode10 = (iHashCode9 + (genericHeroDto == null ? 0 : genericHeroDto.hashCode())) * 31;
            EmbeddedSectionDto embeddedSectionDto = this.embedded_section;
            int iHashCode11 = (iHashCode10 + (embeddedSectionDto == null ? 0 : embeddedSectionDto.hashCode())) * 31;
            SportsHeroCarouselDto sportsHeroCarouselDto = this.sports_hero_carousel;
            int iHashCode12 = (iHashCode11 + (sportsHeroCarouselDto == null ? 0 : sportsHeroCarouselDto.hashCode())) * 31;
            QuickLinksDto quickLinksDto = this.quick_links;
            int iHashCode13 = (iHashCode12 + (quickLinksDto == null ? 0 : quickLinksDto.hashCode())) * 31;
            MultiContractsHeroCarouselDto multiContractsHeroCarouselDto = this.multi_contracts_hero_carousel;
            int iHashCode14 = (iHashCode13 + (multiContractsHeroCarouselDto == null ? 0 : multiContractsHeroCarouselDto.hashCode())) * 31;
            ListHeatmapCarouselDto listHeatmapCarouselDto = this.list_heatmap_carousel;
            int iHashCode15 = (iHashCode14 + (listHeatmapCarouselDto == null ? 0 : listHeatmapCarouselDto.hashCode())) * 31;
            PredictionEventsListDto predictionEventsListDto = this.prediction_events_list;
            int iHashCode16 = (iHashCode15 + (predictionEventsListDto == null ? 0 : predictionEventsListDto.hashCode())) * 31;
            NewsSectionDto newsSectionDto = this.news_section;
            int iHashCode17 = (iHashCode16 + (newsSectionDto == null ? 0 : newsSectionDto.hashCode())) * 31;
            GroupedListsSectionDto groupedListsSectionDto = this.grouped_lists_section;
            return iHashCode17 + (groupedListsSectionDto != null ? groupedListsSectionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(section_title=" + this.section_title + ", asset_chip_grid=" + this.asset_chip_grid + ", earnings_list=" + this.earnings_list + ", sport_event_hero=" + this.sport_event_hero + ", sport_carousel=" + this.sport_carousel + ", event_contract_hero=" + this.event_contract_hero + ", compact_indicies=" + this.compact_indicies + ", expanded_indicies=" + this.expanded_indicies + ", asset_hero=" + this.asset_hero + ", generic_hero=" + this.generic_hero + ", embedded_section=" + this.embedded_section + ", sports_hero_carousel=" + this.sports_hero_carousel + ", quick_links=" + this.quick_links + ", multi_contracts_hero_carousel=" + this.multi_contracts_hero_carousel + ", list_heatmap_carousel=" + this.list_heatmap_carousel + ", prediction_events_list=" + this.prediction_events_list + ", news_section=" + this.news_section + ", grouped_lists_section=" + this.grouped_lists_section + ")";
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HighlightItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SectionTitleDto sectionTitleDto, AssetChipGridDto assetChipGridDto, EarningsListDto earningsListDto, SportEventHeroDto sportEventHeroDto, SportCarouselDto sportCarouselDto, EventContractHeroDto eventContractHeroDto, CompactIndiciesDto compactIndiciesDto, ExpandedIndiciesDto expandedIndiciesDto, AssetHeroDto assetHeroDto, GenericHeroDto genericHeroDto, EmbeddedSectionDto embeddedSectionDto, SportsHeroCarouselDto sportsHeroCarouselDto, QuickLinksDto quickLinksDto, MultiContractsHeroCarouselDto multiContractsHeroCarouselDto, ListHeatmapCarouselDto listHeatmapCarouselDto, PredictionEventsListDto predictionEventsListDto, NewsSectionDto newsSectionDto, GroupedListsSectionDto groupedListsSectionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.section_title = null;
            } else {
                this.section_title = sectionTitleDto;
            }
            if ((i & 2) == 0) {
                this.asset_chip_grid = null;
            } else {
                this.asset_chip_grid = assetChipGridDto;
            }
            if ((i & 4) == 0) {
                this.earnings_list = null;
            } else {
                this.earnings_list = earningsListDto;
            }
            if ((i & 8) == 0) {
                this.sport_event_hero = null;
            } else {
                this.sport_event_hero = sportEventHeroDto;
            }
            if ((i & 16) == 0) {
                this.sport_carousel = null;
            } else {
                this.sport_carousel = sportCarouselDto;
            }
            if ((i & 32) == 0) {
                this.event_contract_hero = null;
            } else {
                this.event_contract_hero = eventContractHeroDto;
            }
            if ((i & 64) == 0) {
                this.compact_indicies = null;
            } else {
                this.compact_indicies = compactIndiciesDto;
            }
            if ((i & 128) == 0) {
                this.expanded_indicies = null;
            } else {
                this.expanded_indicies = expandedIndiciesDto;
            }
            if ((i & 256) == 0) {
                this.asset_hero = null;
            } else {
                this.asset_hero = assetHeroDto;
            }
            if ((i & 512) == 0) {
                this.generic_hero = null;
            } else {
                this.generic_hero = genericHeroDto;
            }
            if ((i & 1024) == 0) {
                this.embedded_section = null;
            } else {
                this.embedded_section = embeddedSectionDto;
            }
            if ((i & 2048) == 0) {
                this.sports_hero_carousel = null;
            } else {
                this.sports_hero_carousel = sportsHeroCarouselDto;
            }
            if ((i & 4096) == 0) {
                this.quick_links = null;
            } else {
                this.quick_links = quickLinksDto;
            }
            if ((i & 8192) == 0) {
                this.multi_contracts_hero_carousel = null;
            } else {
                this.multi_contracts_hero_carousel = multiContractsHeroCarouselDto;
            }
            if ((i & 16384) == 0) {
                this.list_heatmap_carousel = null;
            } else {
                this.list_heatmap_carousel = listHeatmapCarouselDto;
            }
            if ((32768 & i) == 0) {
                this.prediction_events_list = null;
            } else {
                this.prediction_events_list = predictionEventsListDto;
            }
            if ((65536 & i) == 0) {
                this.news_section = null;
            } else {
                this.news_section = newsSectionDto;
            }
            if ((i & 131072) == 0) {
                this.grouped_lists_section = null;
            } else {
                this.grouped_lists_section = groupedListsSectionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SectionTitleDto sectionTitleDto = self.section_title;
            if (sectionTitleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SectionTitleDto.Serializer.INSTANCE, sectionTitleDto);
            }
            AssetChipGridDto assetChipGridDto = self.asset_chip_grid;
            if (assetChipGridDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AssetChipGridDto.Serializer.INSTANCE, assetChipGridDto);
            }
            EarningsListDto earningsListDto = self.earnings_list;
            if (earningsListDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EarningsListDto.Serializer.INSTANCE, earningsListDto);
            }
            SportEventHeroDto sportEventHeroDto = self.sport_event_hero;
            if (sportEventHeroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SportEventHeroDto.Serializer.INSTANCE, sportEventHeroDto);
            }
            SportCarouselDto sportCarouselDto = self.sport_carousel;
            if (sportCarouselDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SportCarouselDto.Serializer.INSTANCE, sportCarouselDto);
            }
            EventContractHeroDto eventContractHeroDto = self.event_contract_hero;
            if (eventContractHeroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, EventContractHeroDto.Serializer.INSTANCE, eventContractHeroDto);
            }
            CompactIndiciesDto compactIndiciesDto = self.compact_indicies;
            if (compactIndiciesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CompactIndiciesDto.Serializer.INSTANCE, compactIndiciesDto);
            }
            ExpandedIndiciesDto expandedIndiciesDto = self.expanded_indicies;
            if (expandedIndiciesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ExpandedIndiciesDto.Serializer.INSTANCE, expandedIndiciesDto);
            }
            AssetHeroDto assetHeroDto = self.asset_hero;
            if (assetHeroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, AssetHeroDto.Serializer.INSTANCE, assetHeroDto);
            }
            GenericHeroDto genericHeroDto = self.generic_hero;
            if (genericHeroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, GenericHeroDto.Serializer.INSTANCE, genericHeroDto);
            }
            EmbeddedSectionDto embeddedSectionDto = self.embedded_section;
            if (embeddedSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, EmbeddedSectionDto.Serializer.INSTANCE, embeddedSectionDto);
            }
            SportsHeroCarouselDto sportsHeroCarouselDto = self.sports_hero_carousel;
            if (sportsHeroCarouselDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, SportsHeroCarouselDto.Serializer.INSTANCE, sportsHeroCarouselDto);
            }
            QuickLinksDto quickLinksDto = self.quick_links;
            if (quickLinksDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, QuickLinksDto.Serializer.INSTANCE, quickLinksDto);
            }
            MultiContractsHeroCarouselDto multiContractsHeroCarouselDto = self.multi_contracts_hero_carousel;
            if (multiContractsHeroCarouselDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, MultiContractsHeroCarouselDto.Serializer.INSTANCE, multiContractsHeroCarouselDto);
            }
            ListHeatmapCarouselDto listHeatmapCarouselDto = self.list_heatmap_carousel;
            if (listHeatmapCarouselDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, ListHeatmapCarouselDto.Serializer.INSTANCE, listHeatmapCarouselDto);
            }
            PredictionEventsListDto predictionEventsListDto = self.prediction_events_list;
            if (predictionEventsListDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, PredictionEventsListDto.Serializer.INSTANCE, predictionEventsListDto);
            }
            NewsSectionDto newsSectionDto = self.news_section;
            if (newsSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, NewsSectionDto.Serializer.INSTANCE, newsSectionDto);
            }
            GroupedListsSectionDto groupedListsSectionDto = self.grouped_lists_section;
            if (groupedListsSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, GroupedListsSectionDto.Serializer.INSTANCE, groupedListsSectionDto);
            }
        }

        public Surrogate(SectionTitleDto sectionTitleDto, AssetChipGridDto assetChipGridDto, EarningsListDto earningsListDto, SportEventHeroDto sportEventHeroDto, SportCarouselDto sportCarouselDto, EventContractHeroDto eventContractHeroDto, CompactIndiciesDto compactIndiciesDto, ExpandedIndiciesDto expandedIndiciesDto, AssetHeroDto assetHeroDto, GenericHeroDto genericHeroDto, EmbeddedSectionDto embeddedSectionDto, SportsHeroCarouselDto sportsHeroCarouselDto, QuickLinksDto quickLinksDto, MultiContractsHeroCarouselDto multiContractsHeroCarouselDto, ListHeatmapCarouselDto listHeatmapCarouselDto, PredictionEventsListDto predictionEventsListDto, NewsSectionDto newsSectionDto, GroupedListsSectionDto groupedListsSectionDto) {
            this.section_title = sectionTitleDto;
            this.asset_chip_grid = assetChipGridDto;
            this.earnings_list = earningsListDto;
            this.sport_event_hero = sportEventHeroDto;
            this.sport_carousel = sportCarouselDto;
            this.event_contract_hero = eventContractHeroDto;
            this.compact_indicies = compactIndiciesDto;
            this.expanded_indicies = expandedIndiciesDto;
            this.asset_hero = assetHeroDto;
            this.generic_hero = genericHeroDto;
            this.embedded_section = embeddedSectionDto;
            this.sports_hero_carousel = sportsHeroCarouselDto;
            this.quick_links = quickLinksDto;
            this.multi_contracts_hero_carousel = multiContractsHeroCarouselDto;
            this.list_heatmap_carousel = listHeatmapCarouselDto;
            this.prediction_events_list = predictionEventsListDto;
            this.news_section = newsSectionDto;
            this.grouped_lists_section = groupedListsSectionDto;
        }

        public /* synthetic */ Surrogate(SectionTitleDto sectionTitleDto, AssetChipGridDto assetChipGridDto, EarningsListDto earningsListDto, SportEventHeroDto sportEventHeroDto, SportCarouselDto sportCarouselDto, EventContractHeroDto eventContractHeroDto, CompactIndiciesDto compactIndiciesDto, ExpandedIndiciesDto expandedIndiciesDto, AssetHeroDto assetHeroDto, GenericHeroDto genericHeroDto, EmbeddedSectionDto embeddedSectionDto, SportsHeroCarouselDto sportsHeroCarouselDto, QuickLinksDto quickLinksDto, MultiContractsHeroCarouselDto multiContractsHeroCarouselDto, ListHeatmapCarouselDto listHeatmapCarouselDto, PredictionEventsListDto predictionEventsListDto, NewsSectionDto newsSectionDto, GroupedListsSectionDto groupedListsSectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sectionTitleDto, (i & 2) != 0 ? null : assetChipGridDto, (i & 4) != 0 ? null : earningsListDto, (i & 8) != 0 ? null : sportEventHeroDto, (i & 16) != 0 ? null : sportCarouselDto, (i & 32) != 0 ? null : eventContractHeroDto, (i & 64) != 0 ? null : compactIndiciesDto, (i & 128) != 0 ? null : expandedIndiciesDto, (i & 256) != 0 ? null : assetHeroDto, (i & 512) != 0 ? null : genericHeroDto, (i & 1024) != 0 ? null : embeddedSectionDto, (i & 2048) != 0 ? null : sportsHeroCarouselDto, (i & 4096) != 0 ? null : quickLinksDto, (i & 8192) != 0 ? null : multiContractsHeroCarouselDto, (i & 16384) != 0 ? null : listHeatmapCarouselDto, (i & 32768) != 0 ? null : predictionEventsListDto, (i & 65536) != 0 ? null : newsSectionDto, (i & 131072) != 0 ? null : groupedListsSectionDto);
        }

        public final SectionTitleDto getSection_title() {
            return this.section_title;
        }

        public final AssetChipGridDto getAsset_chip_grid() {
            return this.asset_chip_grid;
        }

        public final EarningsListDto getEarnings_list() {
            return this.earnings_list;
        }

        public final SportEventHeroDto getSport_event_hero() {
            return this.sport_event_hero;
        }

        public final SportCarouselDto getSport_carousel() {
            return this.sport_carousel;
        }

        public final EventContractHeroDto getEvent_contract_hero() {
            return this.event_contract_hero;
        }

        public final CompactIndiciesDto getCompact_indicies() {
            return this.compact_indicies;
        }

        public final ExpandedIndiciesDto getExpanded_indicies() {
            return this.expanded_indicies;
        }

        public final AssetHeroDto getAsset_hero() {
            return this.asset_hero;
        }

        public final GenericHeroDto getGeneric_hero() {
            return this.generic_hero;
        }

        public final EmbeddedSectionDto getEmbedded_section() {
            return this.embedded_section;
        }

        public final SportsHeroCarouselDto getSports_hero_carousel() {
            return this.sports_hero_carousel;
        }

        public final QuickLinksDto getQuick_links() {
            return this.quick_links;
        }

        public final MultiContractsHeroCarouselDto getMulti_contracts_hero_carousel() {
            return this.multi_contracts_hero_carousel;
        }

        public final ListHeatmapCarouselDto getList_heatmap_carousel() {
            return this.list_heatmap_carousel;
        }

        public final PredictionEventsListDto getPrediction_events_list() {
            return this.prediction_events_list;
        }

        public final NewsSectionDto getNews_section() {
            return this.news_section;
        }

        public final GroupedListsSectionDto getGrouped_lists_section() {
            return this.grouped_lists_section;
        }
    }

    /* compiled from: HighlightItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/HighlightItemDto;", "Lsearch_coprocessor/v1/HighlightItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/HighlightItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HighlightItemDto, HighlightItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HighlightItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightItemDto> getBinaryBase64Serializer() {
            return (KSerializer) HighlightItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HighlightItem> getProtoAdapter() {
            return HighlightItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightItemDto getZeroValue() {
            return HighlightItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightItemDto fromProto(HighlightItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SectionTitle section_title = proto.getSection_title();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SectionTitleDto sectionTitleDtoFromProto = section_title != null ? SectionTitleDto.INSTANCE.fromProto(section_title) : null;
            AssetChipGrid asset_chip_grid = proto.getAsset_chip_grid();
            AssetChipGridDto assetChipGridDtoFromProto = asset_chip_grid != null ? AssetChipGridDto.INSTANCE.fromProto(asset_chip_grid) : null;
            EarningsList earnings_list = proto.getEarnings_list();
            EarningsListDto earningsListDtoFromProto = earnings_list != null ? EarningsListDto.INSTANCE.fromProto(earnings_list) : null;
            SportEventHero sport_event_hero = proto.getSport_event_hero();
            SportEventHeroDto sportEventHeroDtoFromProto = sport_event_hero != null ? SportEventHeroDto.INSTANCE.fromProto(sport_event_hero) : null;
            SportCarousel sport_carousel = proto.getSport_carousel();
            SportCarouselDto sportCarouselDtoFromProto = sport_carousel != null ? SportCarouselDto.INSTANCE.fromProto(sport_carousel) : null;
            EventContractHero event_contract_hero = proto.getEvent_contract_hero();
            EventContractHeroDto eventContractHeroDtoFromProto = event_contract_hero != null ? EventContractHeroDto.INSTANCE.fromProto(event_contract_hero) : null;
            CompactIndicies compact_indicies = proto.getCompact_indicies();
            CompactIndiciesDto compactIndiciesDtoFromProto = compact_indicies != null ? CompactIndiciesDto.INSTANCE.fromProto(compact_indicies) : null;
            ExpandedIndicies expanded_indicies = proto.getExpanded_indicies();
            ExpandedIndiciesDto expandedIndiciesDtoFromProto = expanded_indicies != null ? ExpandedIndiciesDto.INSTANCE.fromProto(expanded_indicies) : null;
            AssetHero asset_hero = proto.getAsset_hero();
            AssetHeroDto assetHeroDtoFromProto = asset_hero != null ? AssetHeroDto.INSTANCE.fromProto(asset_hero) : null;
            GenericHero generic_hero = proto.getGeneric_hero();
            GenericHeroDto genericHeroDtoFromProto = generic_hero != null ? GenericHeroDto.INSTANCE.fromProto(generic_hero) : null;
            EmbeddedSection embedded_section = proto.getEmbedded_section();
            EmbeddedSectionDto embeddedSectionDtoFromProto = embedded_section != null ? EmbeddedSectionDto.INSTANCE.fromProto(embedded_section) : null;
            SportsHeroCarousel sports_hero_carousel = proto.getSports_hero_carousel();
            SportsHeroCarouselDto sportsHeroCarouselDtoFromProto = sports_hero_carousel != null ? SportsHeroCarouselDto.INSTANCE.fromProto(sports_hero_carousel) : null;
            QuickLinks quick_links = proto.getQuick_links();
            QuickLinksDto quickLinksDtoFromProto = quick_links != null ? QuickLinksDto.INSTANCE.fromProto(quick_links) : null;
            MultiContractsHeroCarousel multi_contracts_hero_carousel = proto.getMulti_contracts_hero_carousel();
            MultiContractsHeroCarouselDto multiContractsHeroCarouselDtoFromProto = multi_contracts_hero_carousel != null ? MultiContractsHeroCarouselDto.INSTANCE.fromProto(multi_contracts_hero_carousel) : null;
            ListHeatmapCarousel list_heatmap_carousel = proto.getList_heatmap_carousel();
            ListHeatmapCarouselDto listHeatmapCarouselDtoFromProto = list_heatmap_carousel != null ? ListHeatmapCarouselDto.INSTANCE.fromProto(list_heatmap_carousel) : null;
            PredictionEventsList prediction_events_list = proto.getPrediction_events_list();
            PredictionEventsListDto predictionEventsListDtoFromProto = prediction_events_list != null ? PredictionEventsListDto.INSTANCE.fromProto(prediction_events_list) : null;
            NewsSection news_section = proto.getNews_section();
            NewsSectionDto newsSectionDtoFromProto = news_section != null ? NewsSectionDto.INSTANCE.fromProto(news_section) : null;
            GroupedListsSection grouped_lists_section = proto.getGrouped_lists_section();
            return new HighlightItemDto(new Surrogate(sectionTitleDtoFromProto, assetChipGridDtoFromProto, earningsListDtoFromProto, sportEventHeroDtoFromProto, sportCarouselDtoFromProto, eventContractHeroDtoFromProto, compactIndiciesDtoFromProto, expandedIndiciesDtoFromProto, assetHeroDtoFromProto, genericHeroDtoFromProto, embeddedSectionDtoFromProto, sportsHeroCarouselDtoFromProto, quickLinksDtoFromProto, multiContractsHeroCarouselDtoFromProto, listHeatmapCarouselDtoFromProto, predictionEventsListDtoFromProto, newsSectionDtoFromProto, grouped_lists_section != null ? GroupedListsSectionDto.INSTANCE.fromProto(grouped_lists_section) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.HighlightItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighlightItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HighlightItemDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HighlightItemDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SectionTitle", "AssetChipGrid", "EarningsList", "SportEventHero", "SportCarousel", "EventContractHero", "CompactIndicies", "ExpandedIndicies", "AssetHero", "GenericHero", "EmbeddedSection", "SportsHeroCarousel", "QuickLinks", "MultiContractsHeroCarousel", "ListHeatmapCarousel", "PredictionEventsList", "NewsSection", "GroupedListsSection", "Companion", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$AssetChipGrid;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$AssetHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$CompactIndicies;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EarningsList;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EmbeddedSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EventContractHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$ExpandedIndicies;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$GenericHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$GroupedListsSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$ListHeatmapCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$MultiContractsHeroCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$NewsSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$PredictionEventsList;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$QuickLinks;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SectionTitle;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportEventHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportsHeroCarousel;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SectionTitle;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/SectionTitleDto;", "value", "<init>", "(Lsearch_coprocessor/v1/SectionTitleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SectionTitleDto;", "getValue", "()Lsearch_coprocessor/v1/SectionTitleDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SectionTitle extends ContentDto {
            private final SectionTitleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SectionTitle) && Intrinsics.areEqual(this.value, ((SectionTitle) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SectionTitle(value=" + this.value + ")";
            }

            public final SectionTitleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionTitle(SectionTitleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$AssetChipGrid;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/AssetChipGridDto;", "value", "<init>", "(Lsearch_coprocessor/v1/AssetChipGridDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/AssetChipGridDto;", "getValue", "()Lsearch_coprocessor/v1/AssetChipGridDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AssetChipGrid extends ContentDto {
            private final AssetChipGridDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AssetChipGrid) && Intrinsics.areEqual(this.value, ((AssetChipGrid) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AssetChipGrid(value=" + this.value + ")";
            }

            public final AssetChipGridDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssetChipGrid(AssetChipGridDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EarningsList;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/EarningsListDto;", "value", "<init>", "(Lsearch_coprocessor/v1/EarningsListDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/EarningsListDto;", "getValue", "()Lsearch_coprocessor/v1/EarningsListDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EarningsList extends ContentDto {
            private final EarningsListDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EarningsList) && Intrinsics.areEqual(this.value, ((EarningsList) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EarningsList(value=" + this.value + ")";
            }

            public final EarningsListDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EarningsList(EarningsListDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportEventHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/SportEventHeroDto;", "value", "<init>", "(Lsearch_coprocessor/v1/SportEventHeroDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SportEventHeroDto;", "getValue", "()Lsearch_coprocessor/v1/SportEventHeroDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SportEventHero extends ContentDto {
            private final SportEventHeroDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SportEventHero) && Intrinsics.areEqual(this.value, ((SportEventHero) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SportEventHero(value=" + this.value + ")";
            }

            public final SportEventHeroDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportEventHero(SportEventHeroDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/SportCarouselDto;", "value", "<init>", "(Lsearch_coprocessor/v1/SportCarouselDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SportCarouselDto;", "getValue", "()Lsearch_coprocessor/v1/SportCarouselDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SportCarousel extends ContentDto {
            private final SportCarouselDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SportCarousel) && Intrinsics.areEqual(this.value, ((SportCarousel) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SportCarousel(value=" + this.value + ")";
            }

            public final SportCarouselDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportCarousel(SportCarouselDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EventContractHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/EventContractHeroDto;", "value", "<init>", "(Lsearch_coprocessor/v1/EventContractHeroDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/EventContractHeroDto;", "getValue", "()Lsearch_coprocessor/v1/EventContractHeroDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EventContractHero extends ContentDto {
            private final EventContractHeroDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EventContractHero) && Intrinsics.areEqual(this.value, ((EventContractHero) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EventContractHero(value=" + this.value + ")";
            }

            public final EventContractHeroDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventContractHero(EventContractHeroDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$CompactIndicies;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/CompactIndiciesDto;", "value", "<init>", "(Lsearch_coprocessor/v1/CompactIndiciesDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/CompactIndiciesDto;", "getValue", "()Lsearch_coprocessor/v1/CompactIndiciesDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CompactIndicies extends ContentDto {
            private final CompactIndiciesDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompactIndicies) && Intrinsics.areEqual(this.value, ((CompactIndicies) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CompactIndicies(value=" + this.value + ")";
            }

            public final CompactIndiciesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompactIndicies(CompactIndiciesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$ExpandedIndicies;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "value", "<init>", "(Lsearch_coprocessor/v1/ExpandedIndiciesDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "getValue", "()Lsearch_coprocessor/v1/ExpandedIndiciesDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExpandedIndicies extends ContentDto {
            private final ExpandedIndiciesDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExpandedIndicies) && Intrinsics.areEqual(this.value, ((ExpandedIndicies) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExpandedIndicies(value=" + this.value + ")";
            }

            public final ExpandedIndiciesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpandedIndicies(ExpandedIndiciesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$AssetHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/AssetHeroDto;", "value", "<init>", "(Lsearch_coprocessor/v1/AssetHeroDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/AssetHeroDto;", "getValue", "()Lsearch_coprocessor/v1/AssetHeroDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AssetHero extends ContentDto {
            private final AssetHeroDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AssetHero) && Intrinsics.areEqual(this.value, ((AssetHero) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AssetHero(value=" + this.value + ")";
            }

            public final AssetHeroDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssetHero(AssetHeroDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$GenericHero;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/GenericHeroDto;", "value", "<init>", "(Lsearch_coprocessor/v1/GenericHeroDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/GenericHeroDto;", "getValue", "()Lsearch_coprocessor/v1/GenericHeroDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GenericHero extends ContentDto {
            private final GenericHeroDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GenericHero) && Intrinsics.areEqual(this.value, ((GenericHero) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GenericHero(value=" + this.value + ")";
            }

            public final GenericHeroDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericHero(GenericHeroDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$EmbeddedSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/EmbeddedSectionDto;", "value", "<init>", "(Lsearch_coprocessor/v1/EmbeddedSectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/EmbeddedSectionDto;", "getValue", "()Lsearch_coprocessor/v1/EmbeddedSectionDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EmbeddedSection extends ContentDto {
            private final EmbeddedSectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmbeddedSection) && Intrinsics.areEqual(this.value, ((EmbeddedSection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EmbeddedSection(value=" + this.value + ")";
            }

            public final EmbeddedSectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmbeddedSection(EmbeddedSectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$SportsHeroCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "value", "<init>", "(Lsearch_coprocessor/v1/SportsHeroCarouselDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "getValue", "()Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SportsHeroCarousel extends ContentDto {
            private final SportsHeroCarouselDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SportsHeroCarousel) && Intrinsics.areEqual(this.value, ((SportsHeroCarousel) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SportsHeroCarousel(value=" + this.value + ")";
            }

            public final SportsHeroCarouselDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsHeroCarousel(SportsHeroCarouselDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$QuickLinks;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/QuickLinksDto;", "value", "<init>", "(Lsearch_coprocessor/v1/QuickLinksDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/QuickLinksDto;", "getValue", "()Lsearch_coprocessor/v1/QuickLinksDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuickLinks extends ContentDto {
            private final QuickLinksDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuickLinks) && Intrinsics.areEqual(this.value, ((QuickLinks) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "QuickLinks(value=" + this.value + ")";
            }

            public final QuickLinksDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuickLinks(QuickLinksDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$MultiContractsHeroCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "value", "<init>", "(Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "getValue", "()Lsearch_coprocessor/v1/MultiContractsHeroCarouselDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MultiContractsHeroCarousel extends ContentDto {
            private final MultiContractsHeroCarouselDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MultiContractsHeroCarousel) && Intrinsics.areEqual(this.value, ((MultiContractsHeroCarousel) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MultiContractsHeroCarousel(value=" + this.value + ")";
            }

            public final MultiContractsHeroCarouselDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiContractsHeroCarousel(MultiContractsHeroCarouselDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$ListHeatmapCarousel;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "value", "<init>", "(Lsearch_coprocessor/v1/ListHeatmapCarouselDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "getValue", "()Lsearch_coprocessor/v1/ListHeatmapCarouselDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ListHeatmapCarousel extends ContentDto {
            private final ListHeatmapCarouselDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ListHeatmapCarousel) && Intrinsics.areEqual(this.value, ((ListHeatmapCarousel) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ListHeatmapCarousel(value=" + this.value + ")";
            }

            public final ListHeatmapCarouselDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListHeatmapCarousel(ListHeatmapCarouselDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$PredictionEventsList;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/PredictionEventsListDto;", "value", "<init>", "(Lsearch_coprocessor/v1/PredictionEventsListDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/PredictionEventsListDto;", "getValue", "()Lsearch_coprocessor/v1/PredictionEventsListDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PredictionEventsList extends ContentDto {
            private final PredictionEventsListDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PredictionEventsList) && Intrinsics.areEqual(this.value, ((PredictionEventsList) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PredictionEventsList(value=" + this.value + ")";
            }

            public final PredictionEventsListDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PredictionEventsList(PredictionEventsListDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$NewsSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/NewsSectionDto;", "value", "<init>", "(Lsearch_coprocessor/v1/NewsSectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/NewsSectionDto;", "getValue", "()Lsearch_coprocessor/v1/NewsSectionDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NewsSection extends ContentDto {
            private final NewsSectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NewsSection) && Intrinsics.areEqual(this.value, ((NewsSection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NewsSection(value=" + this.value + ")";
            }

            public final NewsSectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewsSection(NewsSectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$GroupedListsSection;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/GroupedListsSectionDto;", "value", "<init>", "(Lsearch_coprocessor/v1/GroupedListsSectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/GroupedListsSectionDto;", "getValue", "()Lsearch_coprocessor/v1/GroupedListsSectionDto;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GroupedListsSection extends ContentDto {
            private final GroupedListsSectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GroupedListsSection) && Intrinsics.areEqual(this.value, ((GroupedListsSection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GroupedListsSection(value=" + this.value + ")";
            }

            public final GroupedListsSectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GroupedListsSection(GroupedListsSectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$ContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lsearch_coprocessor/v1/HighlightItemDto$ContentDto;", "Lsearch_coprocessor/v1/HighlightItem;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ContentDto, HighlightItem> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HighlightItem> getProtoAdapter() {
                return HighlightItem.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentDto fromProto(HighlightItem proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSection_title() != null) {
                    return new SectionTitle(SectionTitleDto.INSTANCE.fromProto(proto.getSection_title()));
                }
                if (proto.getAsset_chip_grid() != null) {
                    return new AssetChipGrid(AssetChipGridDto.INSTANCE.fromProto(proto.getAsset_chip_grid()));
                }
                if (proto.getEarnings_list() != null) {
                    return new EarningsList(EarningsListDto.INSTANCE.fromProto(proto.getEarnings_list()));
                }
                if (proto.getSport_event_hero() != null) {
                    return new SportEventHero(SportEventHeroDto.INSTANCE.fromProto(proto.getSport_event_hero()));
                }
                if (proto.getSport_carousel() != null) {
                    return new SportCarousel(SportCarouselDto.INSTANCE.fromProto(proto.getSport_carousel()));
                }
                if (proto.getEvent_contract_hero() != null) {
                    return new EventContractHero(EventContractHeroDto.INSTANCE.fromProto(proto.getEvent_contract_hero()));
                }
                if (proto.getCompact_indicies() != null) {
                    return new CompactIndicies(CompactIndiciesDto.INSTANCE.fromProto(proto.getCompact_indicies()));
                }
                if (proto.getExpanded_indicies() != null) {
                    return new ExpandedIndicies(ExpandedIndiciesDto.INSTANCE.fromProto(proto.getExpanded_indicies()));
                }
                if (proto.getAsset_hero() != null) {
                    return new AssetHero(AssetHeroDto.INSTANCE.fromProto(proto.getAsset_hero()));
                }
                if (proto.getGeneric_hero() != null) {
                    return new GenericHero(GenericHeroDto.INSTANCE.fromProto(proto.getGeneric_hero()));
                }
                if (proto.getEmbedded_section() != null) {
                    return new EmbeddedSection(EmbeddedSectionDto.INSTANCE.fromProto(proto.getEmbedded_section()));
                }
                if (proto.getSports_hero_carousel() != null) {
                    return new SportsHeroCarousel(SportsHeroCarouselDto.INSTANCE.fromProto(proto.getSports_hero_carousel()));
                }
                if (proto.getQuick_links() != null) {
                    return new QuickLinks(QuickLinksDto.INSTANCE.fromProto(proto.getQuick_links()));
                }
                if (proto.getMulti_contracts_hero_carousel() != null) {
                    return new MultiContractsHeroCarousel(MultiContractsHeroCarouselDto.INSTANCE.fromProto(proto.getMulti_contracts_hero_carousel()));
                }
                if (proto.getList_heatmap_carousel() != null) {
                    return new ListHeatmapCarousel(ListHeatmapCarouselDto.INSTANCE.fromProto(proto.getList_heatmap_carousel()));
                }
                if (proto.getPrediction_events_list() != null) {
                    return new PredictionEventsList(PredictionEventsListDto.INSTANCE.fromProto(proto.getPrediction_events_list()));
                }
                if (proto.getNews_section() != null) {
                    return new NewsSection(NewsSectionDto.INSTANCE.fromProto(proto.getNews_section()));
                }
                if (proto.getGrouped_lists_section() != null) {
                    return new GroupedListsSection(GroupedListsSectionDto.INSTANCE.fromProto(proto.getGrouped_lists_section()));
                }
                return null;
            }
        }
    }

    /* compiled from: HighlightItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/HighlightItemDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/HighlightItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HighlightItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.HighlightItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HighlightItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HighlightItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HighlightItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: HighlightItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "search_coprocessor.v1.HighlightItemDto";
        }
    }
}
