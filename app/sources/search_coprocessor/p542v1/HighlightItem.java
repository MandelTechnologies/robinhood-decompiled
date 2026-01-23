package search_coprocessor.p542v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: HighlightItem.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001YBé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020(¢\u0006\u0004\b)\u0010*J\b\u0010O\u001a\u00020\u0002H\u0017J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0096\u0002J\b\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020WH\u0016Jè\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020(R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N¨\u0006Z"}, m3636d2 = {"Lsearch_coprocessor/v1/HighlightItem;", "Lcom/squareup/wire/Message;", "", "section_title", "Lsearch_coprocessor/v1/SectionTitle;", "asset_chip_grid", "Lsearch_coprocessor/v1/AssetChipGrid;", "earnings_list", "Lsearch_coprocessor/v1/EarningsList;", "sport_event_hero", "Lsearch_coprocessor/v1/SportEventHero;", "sport_carousel", "Lsearch_coprocessor/v1/SportCarousel;", "event_contract_hero", "Lsearch_coprocessor/v1/EventContractHero;", "compact_indicies", "Lsearch_coprocessor/v1/CompactIndicies;", "expanded_indicies", "Lsearch_coprocessor/v1/ExpandedIndicies;", "asset_hero", "Lsearch_coprocessor/v1/AssetHero;", "generic_hero", "Lsearch_coprocessor/v1/GenericHero;", "embedded_section", "Lsearch_coprocessor/v1/EmbeddedSection;", "sports_hero_carousel", "Lsearch_coprocessor/v1/SportsHeroCarousel;", "quick_links", "Lsearch_coprocessor/v1/QuickLinks;", "multi_contracts_hero_carousel", "Lsearch_coprocessor/v1/MultiContractsHeroCarousel;", "list_heatmap_carousel", "Lsearch_coprocessor/v1/ListHeatmapCarousel;", "prediction_events_list", "Lsearch_coprocessor/v1/PredictionEventsList;", "news_section", "Lsearch_coprocessor/v1/NewsSection;", "grouped_lists_section", "Lsearch_coprocessor/v1/GroupedListsSection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsearch_coprocessor/v1/SectionTitle;Lsearch_coprocessor/v1/AssetChipGrid;Lsearch_coprocessor/v1/EarningsList;Lsearch_coprocessor/v1/SportEventHero;Lsearch_coprocessor/v1/SportCarousel;Lsearch_coprocessor/v1/EventContractHero;Lsearch_coprocessor/v1/CompactIndicies;Lsearch_coprocessor/v1/ExpandedIndicies;Lsearch_coprocessor/v1/AssetHero;Lsearch_coprocessor/v1/GenericHero;Lsearch_coprocessor/v1/EmbeddedSection;Lsearch_coprocessor/v1/SportsHeroCarousel;Lsearch_coprocessor/v1/QuickLinks;Lsearch_coprocessor/v1/MultiContractsHeroCarousel;Lsearch_coprocessor/v1/ListHeatmapCarousel;Lsearch_coprocessor/v1/PredictionEventsList;Lsearch_coprocessor/v1/NewsSection;Lsearch_coprocessor/v1/GroupedListsSection;Lokio/ByteString;)V", "getSection_title", "()Lsearch_coprocessor/v1/SectionTitle;", "getAsset_chip_grid", "()Lsearch_coprocessor/v1/AssetChipGrid;", "getEarnings_list", "()Lsearch_coprocessor/v1/EarningsList;", "getSport_event_hero", "()Lsearch_coprocessor/v1/SportEventHero;", "getSport_carousel", "()Lsearch_coprocessor/v1/SportCarousel;", "getEvent_contract_hero", "()Lsearch_coprocessor/v1/EventContractHero;", "getCompact_indicies", "()Lsearch_coprocessor/v1/CompactIndicies;", "getExpanded_indicies", "()Lsearch_coprocessor/v1/ExpandedIndicies;", "getAsset_hero", "()Lsearch_coprocessor/v1/AssetHero;", "getGeneric_hero", "()Lsearch_coprocessor/v1/GenericHero;", "getEmbedded_section", "()Lsearch_coprocessor/v1/EmbeddedSection;", "getSports_hero_carousel", "()Lsearch_coprocessor/v1/SportsHeroCarousel;", "getQuick_links", "()Lsearch_coprocessor/v1/QuickLinks;", "getMulti_contracts_hero_carousel", "()Lsearch_coprocessor/v1/MultiContractsHeroCarousel;", "getList_heatmap_carousel", "()Lsearch_coprocessor/v1/ListHeatmapCarousel;", "getPrediction_events_list", "()Lsearch_coprocessor/v1/PredictionEventsList;", "getNews_section", "()Lsearch_coprocessor/v1/NewsSection;", "getGrouped_lists_section", "()Lsearch_coprocessor/v1/GroupedListsSection;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class HighlightItem extends Message {

    @JvmField
    public static final ProtoAdapter<HighlightItem> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.AssetChipGrid#ADAPTER", jsonName = "assetChipGrid", oneofName = "content", schemaIndex = 1, tag = 2)
    private final AssetChipGrid asset_chip_grid;

    @WireField(adapter = "search_coprocessor.v1.AssetHero#ADAPTER", jsonName = "assetHero", oneofName = "content", schemaIndex = 8, tag = 9)
    private final AssetHero asset_hero;

    @WireField(adapter = "search_coprocessor.v1.CompactIndicies#ADAPTER", jsonName = "compactIndicies", oneofName = "content", schemaIndex = 6, tag = 7)
    private final CompactIndicies compact_indicies;

    @WireField(adapter = "search_coprocessor.v1.EarningsList#ADAPTER", jsonName = "earningsList", oneofName = "content", schemaIndex = 2, tag = 3)
    private final EarningsList earnings_list;

    @WireField(adapter = "search_coprocessor.v1.EmbeddedSection#ADAPTER", jsonName = "embeddedSection", oneofName = "content", schemaIndex = 10, tag = 11)
    private final EmbeddedSection embedded_section;

    @WireField(adapter = "search_coprocessor.v1.EventContractHero#ADAPTER", jsonName = "eventContractHero", oneofName = "content", schemaIndex = 5, tag = 6)
    private final EventContractHero event_contract_hero;

    @WireField(adapter = "search_coprocessor.v1.ExpandedIndicies#ADAPTER", jsonName = "expandedIndicies", oneofName = "content", schemaIndex = 7, tag = 8)
    private final ExpandedIndicies expanded_indicies;

    @WireField(adapter = "search_coprocessor.v1.GenericHero#ADAPTER", jsonName = "genericHero", oneofName = "content", schemaIndex = 9, tag = 10)
    private final GenericHero generic_hero;

    @WireField(adapter = "search_coprocessor.v1.GroupedListsSection#ADAPTER", jsonName = "groupedListsSection", oneofName = "content", schemaIndex = 17, tag = 18)
    private final GroupedListsSection grouped_lists_section;

    @WireField(adapter = "search_coprocessor.v1.ListHeatmapCarousel#ADAPTER", jsonName = "listHeatmapCarousel", oneofName = "content", schemaIndex = 14, tag = 15)
    private final ListHeatmapCarousel list_heatmap_carousel;

    @WireField(adapter = "search_coprocessor.v1.MultiContractsHeroCarousel#ADAPTER", jsonName = "multiContractsHeroCarousel", oneofName = "content", schemaIndex = 13, tag = 14)
    private final MultiContractsHeroCarousel multi_contracts_hero_carousel;

    @WireField(adapter = "search_coprocessor.v1.NewsSection#ADAPTER", jsonName = "newsSection", oneofName = "content", schemaIndex = 16, tag = 17)
    private final NewsSection news_section;

    @WireField(adapter = "search_coprocessor.v1.PredictionEventsList#ADAPTER", jsonName = "predictionEventsList", oneofName = "content", schemaIndex = 15, tag = 16)
    private final PredictionEventsList prediction_events_list;

    @WireField(adapter = "search_coprocessor.v1.QuickLinks#ADAPTER", jsonName = "quickLinks", oneofName = "content", schemaIndex = 12, tag = 13)
    private final QuickLinks quick_links;

    @WireField(adapter = "search_coprocessor.v1.SectionTitle#ADAPTER", jsonName = "sectionTitle", oneofName = "content", schemaIndex = 0, tag = 1)
    private final SectionTitle section_title;

    @WireField(adapter = "search_coprocessor.v1.SportCarousel#ADAPTER", jsonName = "sportCarousel", oneofName = "content", schemaIndex = 4, tag = 5)
    private final SportCarousel sport_carousel;

    @WireField(adapter = "search_coprocessor.v1.SportEventHero#ADAPTER", jsonName = "sportEventHero", oneofName = "content", schemaIndex = 3, tag = 4)
    private final SportEventHero sport_event_hero;

    @WireField(adapter = "search_coprocessor.v1.SportsHeroCarousel#ADAPTER", jsonName = "sportsHeroCarousel", oneofName = "content", schemaIndex = 11, tag = 12)
    private final SportsHeroCarousel sports_hero_carousel;

    public HighlightItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29961newBuilder();
    }

    public final SectionTitle getSection_title() {
        return this.section_title;
    }

    public final AssetChipGrid getAsset_chip_grid() {
        return this.asset_chip_grid;
    }

    public final EarningsList getEarnings_list() {
        return this.earnings_list;
    }

    public final SportEventHero getSport_event_hero() {
        return this.sport_event_hero;
    }

    public final SportCarousel getSport_carousel() {
        return this.sport_carousel;
    }

    public final EventContractHero getEvent_contract_hero() {
        return this.event_contract_hero;
    }

    public final CompactIndicies getCompact_indicies() {
        return this.compact_indicies;
    }

    public final ExpandedIndicies getExpanded_indicies() {
        return this.expanded_indicies;
    }

    public final AssetHero getAsset_hero() {
        return this.asset_hero;
    }

    public final GenericHero getGeneric_hero() {
        return this.generic_hero;
    }

    public final EmbeddedSection getEmbedded_section() {
        return this.embedded_section;
    }

    public final SportsHeroCarousel getSports_hero_carousel() {
        return this.sports_hero_carousel;
    }

    public final QuickLinks getQuick_links() {
        return this.quick_links;
    }

    public final MultiContractsHeroCarousel getMulti_contracts_hero_carousel() {
        return this.multi_contracts_hero_carousel;
    }

    public final ListHeatmapCarousel getList_heatmap_carousel() {
        return this.list_heatmap_carousel;
    }

    public final PredictionEventsList getPrediction_events_list() {
        return this.prediction_events_list;
    }

    public final NewsSection getNews_section() {
        return this.news_section;
    }

    public final GroupedListsSection getGrouped_lists_section() {
        return this.grouped_lists_section;
    }

    public /* synthetic */ HighlightItem(SectionTitle sectionTitle, AssetChipGrid assetChipGrid, EarningsList earningsList, SportEventHero sportEventHero, SportCarousel sportCarousel, EventContractHero eventContractHero, CompactIndicies compactIndicies, ExpandedIndicies expandedIndicies, AssetHero assetHero, GenericHero genericHero, EmbeddedSection embeddedSection, SportsHeroCarousel sportsHeroCarousel, QuickLinks quickLinks, MultiContractsHeroCarousel multiContractsHeroCarousel, ListHeatmapCarousel listHeatmapCarousel, PredictionEventsList predictionEventsList, NewsSection newsSection, GroupedListsSection groupedListsSection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sectionTitle, (i & 2) != 0 ? null : assetChipGrid, (i & 4) != 0 ? null : earningsList, (i & 8) != 0 ? null : sportEventHero, (i & 16) != 0 ? null : sportCarousel, (i & 32) != 0 ? null : eventContractHero, (i & 64) != 0 ? null : compactIndicies, (i & 128) != 0 ? null : expandedIndicies, (i & 256) != 0 ? null : assetHero, (i & 512) != 0 ? null : genericHero, (i & 1024) != 0 ? null : embeddedSection, (i & 2048) != 0 ? null : sportsHeroCarousel, (i & 4096) != 0 ? null : quickLinks, (i & 8192) != 0 ? null : multiContractsHeroCarousel, (i & 16384) != 0 ? null : listHeatmapCarousel, (i & 32768) != 0 ? null : predictionEventsList, (i & 65536) != 0 ? null : newsSection, (i & 131072) != 0 ? null : groupedListsSection, (i & 262144) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightItem(SectionTitle sectionTitle, AssetChipGrid assetChipGrid, EarningsList earningsList, SportEventHero sportEventHero, SportCarousel sportCarousel, EventContractHero eventContractHero, CompactIndicies compactIndicies, ExpandedIndicies expandedIndicies, AssetHero assetHero, GenericHero genericHero, EmbeddedSection embeddedSection, SportsHeroCarousel sportsHeroCarousel, QuickLinks quickLinks, MultiContractsHeroCarousel multiContractsHeroCarousel, ListHeatmapCarousel listHeatmapCarousel, PredictionEventsList predictionEventsList, NewsSection newsSection, GroupedListsSection groupedListsSection, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.section_title = sectionTitle;
        this.asset_chip_grid = assetChipGrid;
        this.earnings_list = earningsList;
        this.sport_event_hero = sportEventHero;
        this.sport_carousel = sportCarousel;
        this.event_contract_hero = eventContractHero;
        this.compact_indicies = compactIndicies;
        this.expanded_indicies = expandedIndicies;
        this.asset_hero = assetHero;
        this.generic_hero = genericHero;
        this.embedded_section = embeddedSection;
        this.sports_hero_carousel = sportsHeroCarousel;
        this.quick_links = quickLinks;
        this.multi_contracts_hero_carousel = multiContractsHeroCarousel;
        this.list_heatmap_carousel = listHeatmapCarousel;
        this.prediction_events_list = predictionEventsList;
        this.news_section = newsSection;
        this.grouped_lists_section = groupedListsSection;
        if (Internal.countNonNull(sectionTitle, assetChipGrid, earningsList, sportEventHero, sportCarousel, eventContractHero, compactIndicies, expandedIndicies, assetHero, genericHero, embeddedSection, sportsHeroCarousel, quickLinks, multiContractsHeroCarousel, listHeatmapCarousel, predictionEventsList, newsSection, groupedListsSection) > 1) {
            throw new IllegalArgumentException("At most one of section_title, asset_chip_grid, earnings_list, sport_event_hero, sport_carousel, event_contract_hero, compact_indicies, expanded_indicies, asset_hero, generic_hero, embedded_section, sports_hero_carousel, quick_links, multi_contracts_hero_carousel, list_heatmap_carousel, prediction_events_list, news_section, grouped_lists_section may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29961newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HighlightItem)) {
            return false;
        }
        HighlightItem highlightItem = (HighlightItem) other;
        return Intrinsics.areEqual(unknownFields(), highlightItem.unknownFields()) && Intrinsics.areEqual(this.section_title, highlightItem.section_title) && Intrinsics.areEqual(this.asset_chip_grid, highlightItem.asset_chip_grid) && Intrinsics.areEqual(this.earnings_list, highlightItem.earnings_list) && Intrinsics.areEqual(this.sport_event_hero, highlightItem.sport_event_hero) && Intrinsics.areEqual(this.sport_carousel, highlightItem.sport_carousel) && Intrinsics.areEqual(this.event_contract_hero, highlightItem.event_contract_hero) && Intrinsics.areEqual(this.compact_indicies, highlightItem.compact_indicies) && Intrinsics.areEqual(this.expanded_indicies, highlightItem.expanded_indicies) && Intrinsics.areEqual(this.asset_hero, highlightItem.asset_hero) && Intrinsics.areEqual(this.generic_hero, highlightItem.generic_hero) && Intrinsics.areEqual(this.embedded_section, highlightItem.embedded_section) && Intrinsics.areEqual(this.sports_hero_carousel, highlightItem.sports_hero_carousel) && Intrinsics.areEqual(this.quick_links, highlightItem.quick_links) && Intrinsics.areEqual(this.multi_contracts_hero_carousel, highlightItem.multi_contracts_hero_carousel) && Intrinsics.areEqual(this.list_heatmap_carousel, highlightItem.list_heatmap_carousel) && Intrinsics.areEqual(this.prediction_events_list, highlightItem.prediction_events_list) && Intrinsics.areEqual(this.news_section, highlightItem.news_section) && Intrinsics.areEqual(this.grouped_lists_section, highlightItem.grouped_lists_section);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SectionTitle sectionTitle = this.section_title;
        int iHashCode2 = (iHashCode + (sectionTitle != null ? sectionTitle.hashCode() : 0)) * 37;
        AssetChipGrid assetChipGrid = this.asset_chip_grid;
        int iHashCode3 = (iHashCode2 + (assetChipGrid != null ? assetChipGrid.hashCode() : 0)) * 37;
        EarningsList earningsList = this.earnings_list;
        int iHashCode4 = (iHashCode3 + (earningsList != null ? earningsList.hashCode() : 0)) * 37;
        SportEventHero sportEventHero = this.sport_event_hero;
        int iHashCode5 = (iHashCode4 + (sportEventHero != null ? sportEventHero.hashCode() : 0)) * 37;
        SportCarousel sportCarousel = this.sport_carousel;
        int iHashCode6 = (iHashCode5 + (sportCarousel != null ? sportCarousel.hashCode() : 0)) * 37;
        EventContractHero eventContractHero = this.event_contract_hero;
        int iHashCode7 = (iHashCode6 + (eventContractHero != null ? eventContractHero.hashCode() : 0)) * 37;
        CompactIndicies compactIndicies = this.compact_indicies;
        int iHashCode8 = (iHashCode7 + (compactIndicies != null ? compactIndicies.hashCode() : 0)) * 37;
        ExpandedIndicies expandedIndicies = this.expanded_indicies;
        int iHashCode9 = (iHashCode8 + (expandedIndicies != null ? expandedIndicies.hashCode() : 0)) * 37;
        AssetHero assetHero = this.asset_hero;
        int iHashCode10 = (iHashCode9 + (assetHero != null ? assetHero.hashCode() : 0)) * 37;
        GenericHero genericHero = this.generic_hero;
        int iHashCode11 = (iHashCode10 + (genericHero != null ? genericHero.hashCode() : 0)) * 37;
        EmbeddedSection embeddedSection = this.embedded_section;
        int iHashCode12 = (iHashCode11 + (embeddedSection != null ? embeddedSection.hashCode() : 0)) * 37;
        SportsHeroCarousel sportsHeroCarousel = this.sports_hero_carousel;
        int iHashCode13 = (iHashCode12 + (sportsHeroCarousel != null ? sportsHeroCarousel.hashCode() : 0)) * 37;
        QuickLinks quickLinks = this.quick_links;
        int iHashCode14 = (iHashCode13 + (quickLinks != null ? quickLinks.hashCode() : 0)) * 37;
        MultiContractsHeroCarousel multiContractsHeroCarousel = this.multi_contracts_hero_carousel;
        int iHashCode15 = (iHashCode14 + (multiContractsHeroCarousel != null ? multiContractsHeroCarousel.hashCode() : 0)) * 37;
        ListHeatmapCarousel listHeatmapCarousel = this.list_heatmap_carousel;
        int iHashCode16 = (iHashCode15 + (listHeatmapCarousel != null ? listHeatmapCarousel.hashCode() : 0)) * 37;
        PredictionEventsList predictionEventsList = this.prediction_events_list;
        int iHashCode17 = (iHashCode16 + (predictionEventsList != null ? predictionEventsList.hashCode() : 0)) * 37;
        NewsSection newsSection = this.news_section;
        int iHashCode18 = (iHashCode17 + (newsSection != null ? newsSection.hashCode() : 0)) * 37;
        GroupedListsSection groupedListsSection = this.grouped_lists_section;
        int iHashCode19 = iHashCode18 + (groupedListsSection != null ? groupedListsSection.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SectionTitle sectionTitle = this.section_title;
        if (sectionTitle != null) {
            arrayList.add("section_title=" + sectionTitle);
        }
        AssetChipGrid assetChipGrid = this.asset_chip_grid;
        if (assetChipGrid != null) {
            arrayList.add("asset_chip_grid=" + assetChipGrid);
        }
        EarningsList earningsList = this.earnings_list;
        if (earningsList != null) {
            arrayList.add("earnings_list=" + earningsList);
        }
        SportEventHero sportEventHero = this.sport_event_hero;
        if (sportEventHero != null) {
            arrayList.add("sport_event_hero=" + sportEventHero);
        }
        SportCarousel sportCarousel = this.sport_carousel;
        if (sportCarousel != null) {
            arrayList.add("sport_carousel=" + sportCarousel);
        }
        EventContractHero eventContractHero = this.event_contract_hero;
        if (eventContractHero != null) {
            arrayList.add("event_contract_hero=" + eventContractHero);
        }
        CompactIndicies compactIndicies = this.compact_indicies;
        if (compactIndicies != null) {
            arrayList.add("compact_indicies=" + compactIndicies);
        }
        ExpandedIndicies expandedIndicies = this.expanded_indicies;
        if (expandedIndicies != null) {
            arrayList.add("expanded_indicies=" + expandedIndicies);
        }
        AssetHero assetHero = this.asset_hero;
        if (assetHero != null) {
            arrayList.add("asset_hero=" + assetHero);
        }
        GenericHero genericHero = this.generic_hero;
        if (genericHero != null) {
            arrayList.add("generic_hero=" + genericHero);
        }
        EmbeddedSection embeddedSection = this.embedded_section;
        if (embeddedSection != null) {
            arrayList.add("embedded_section=" + embeddedSection);
        }
        SportsHeroCarousel sportsHeroCarousel = this.sports_hero_carousel;
        if (sportsHeroCarousel != null) {
            arrayList.add("sports_hero_carousel=" + sportsHeroCarousel);
        }
        QuickLinks quickLinks = this.quick_links;
        if (quickLinks != null) {
            arrayList.add("quick_links=" + quickLinks);
        }
        MultiContractsHeroCarousel multiContractsHeroCarousel = this.multi_contracts_hero_carousel;
        if (multiContractsHeroCarousel != null) {
            arrayList.add("multi_contracts_hero_carousel=" + multiContractsHeroCarousel);
        }
        ListHeatmapCarousel listHeatmapCarousel = this.list_heatmap_carousel;
        if (listHeatmapCarousel != null) {
            arrayList.add("list_heatmap_carousel=" + listHeatmapCarousel);
        }
        PredictionEventsList predictionEventsList = this.prediction_events_list;
        if (predictionEventsList != null) {
            arrayList.add("prediction_events_list=" + predictionEventsList);
        }
        NewsSection newsSection = this.news_section;
        if (newsSection != null) {
            arrayList.add("news_section=" + newsSection);
        }
        GroupedListsSection groupedListsSection = this.grouped_lists_section;
        if (groupedListsSection != null) {
            arrayList.add("grouped_lists_section=" + groupedListsSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HighlightItem{", "}", 0, null, null, 56, null);
    }

    public final HighlightItem copy(SectionTitle section_title, AssetChipGrid asset_chip_grid, EarningsList earnings_list, SportEventHero sport_event_hero, SportCarousel sport_carousel, EventContractHero event_contract_hero, CompactIndicies compact_indicies, ExpandedIndicies expanded_indicies, AssetHero asset_hero, GenericHero generic_hero, EmbeddedSection embedded_section, SportsHeroCarousel sports_hero_carousel, QuickLinks quick_links, MultiContractsHeroCarousel multi_contracts_hero_carousel, ListHeatmapCarousel list_heatmap_carousel, PredictionEventsList prediction_events_list, NewsSection news_section, GroupedListsSection grouped_lists_section, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HighlightItem(section_title, asset_chip_grid, earnings_list, sport_event_hero, sport_carousel, event_contract_hero, compact_indicies, expanded_indicies, asset_hero, generic_hero, embedded_section, sports_hero_carousel, quick_links, multi_contracts_hero_carousel, list_heatmap_carousel, prediction_events_list, news_section, grouped_lists_section, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HighlightItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HighlightItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.HighlightItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HighlightItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SectionTitle.ADAPTER.encodedSizeWithTag(1, value.getSection_title()) + AssetChipGrid.ADAPTER.encodedSizeWithTag(2, value.getAsset_chip_grid()) + EarningsList.ADAPTER.encodedSizeWithTag(3, value.getEarnings_list()) + SportEventHero.ADAPTER.encodedSizeWithTag(4, value.getSport_event_hero()) + SportCarousel.ADAPTER.encodedSizeWithTag(5, value.getSport_carousel()) + EventContractHero.ADAPTER.encodedSizeWithTag(6, value.getEvent_contract_hero()) + CompactIndicies.ADAPTER.encodedSizeWithTag(7, value.getCompact_indicies()) + ExpandedIndicies.ADAPTER.encodedSizeWithTag(8, value.getExpanded_indicies()) + AssetHero.ADAPTER.encodedSizeWithTag(9, value.getAsset_hero()) + GenericHero.ADAPTER.encodedSizeWithTag(10, value.getGeneric_hero()) + EmbeddedSection.ADAPTER.encodedSizeWithTag(11, value.getEmbedded_section()) + SportsHeroCarousel.ADAPTER.encodedSizeWithTag(12, value.getSports_hero_carousel()) + QuickLinks.ADAPTER.encodedSizeWithTag(13, value.getQuick_links()) + MultiContractsHeroCarousel.ADAPTER.encodedSizeWithTag(14, value.getMulti_contracts_hero_carousel()) + ListHeatmapCarousel.ADAPTER.encodedSizeWithTag(15, value.getList_heatmap_carousel()) + PredictionEventsList.ADAPTER.encodedSizeWithTag(16, value.getPrediction_events_list()) + NewsSection.ADAPTER.encodedSizeWithTag(17, value.getNews_section()) + GroupedListsSection.ADAPTER.encodedSizeWithTag(18, value.getGrouped_lists_section());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HighlightItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SectionTitle.ADAPTER.encodeWithTag(writer, 1, (int) value.getSection_title());
                AssetChipGrid.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_chip_grid());
                EarningsList.ADAPTER.encodeWithTag(writer, 3, (int) value.getEarnings_list());
                SportEventHero.ADAPTER.encodeWithTag(writer, 4, (int) value.getSport_event_hero());
                SportCarousel.ADAPTER.encodeWithTag(writer, 5, (int) value.getSport_carousel());
                EventContractHero.ADAPTER.encodeWithTag(writer, 6, (int) value.getEvent_contract_hero());
                CompactIndicies.ADAPTER.encodeWithTag(writer, 7, (int) value.getCompact_indicies());
                ExpandedIndicies.ADAPTER.encodeWithTag(writer, 8, (int) value.getExpanded_indicies());
                AssetHero.ADAPTER.encodeWithTag(writer, 9, (int) value.getAsset_hero());
                GenericHero.ADAPTER.encodeWithTag(writer, 10, (int) value.getGeneric_hero());
                EmbeddedSection.ADAPTER.encodeWithTag(writer, 11, (int) value.getEmbedded_section());
                SportsHeroCarousel.ADAPTER.encodeWithTag(writer, 12, (int) value.getSports_hero_carousel());
                QuickLinks.ADAPTER.encodeWithTag(writer, 13, (int) value.getQuick_links());
                MultiContractsHeroCarousel.ADAPTER.encodeWithTag(writer, 14, (int) value.getMulti_contracts_hero_carousel());
                ListHeatmapCarousel.ADAPTER.encodeWithTag(writer, 15, (int) value.getList_heatmap_carousel());
                PredictionEventsList.ADAPTER.encodeWithTag(writer, 16, (int) value.getPrediction_events_list());
                NewsSection.ADAPTER.encodeWithTag(writer, 17, (int) value.getNews_section());
                GroupedListsSection.ADAPTER.encodeWithTag(writer, 18, (int) value.getGrouped_lists_section());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HighlightItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GroupedListsSection.ADAPTER.encodeWithTag(writer, 18, (int) value.getGrouped_lists_section());
                NewsSection.ADAPTER.encodeWithTag(writer, 17, (int) value.getNews_section());
                PredictionEventsList.ADAPTER.encodeWithTag(writer, 16, (int) value.getPrediction_events_list());
                ListHeatmapCarousel.ADAPTER.encodeWithTag(writer, 15, (int) value.getList_heatmap_carousel());
                MultiContractsHeroCarousel.ADAPTER.encodeWithTag(writer, 14, (int) value.getMulti_contracts_hero_carousel());
                QuickLinks.ADAPTER.encodeWithTag(writer, 13, (int) value.getQuick_links());
                SportsHeroCarousel.ADAPTER.encodeWithTag(writer, 12, (int) value.getSports_hero_carousel());
                EmbeddedSection.ADAPTER.encodeWithTag(writer, 11, (int) value.getEmbedded_section());
                GenericHero.ADAPTER.encodeWithTag(writer, 10, (int) value.getGeneric_hero());
                AssetHero.ADAPTER.encodeWithTag(writer, 9, (int) value.getAsset_hero());
                ExpandedIndicies.ADAPTER.encodeWithTag(writer, 8, (int) value.getExpanded_indicies());
                CompactIndicies.ADAPTER.encodeWithTag(writer, 7, (int) value.getCompact_indicies());
                EventContractHero.ADAPTER.encodeWithTag(writer, 6, (int) value.getEvent_contract_hero());
                SportCarousel.ADAPTER.encodeWithTag(writer, 5, (int) value.getSport_carousel());
                SportEventHero.ADAPTER.encodeWithTag(writer, 4, (int) value.getSport_event_hero());
                EarningsList.ADAPTER.encodeWithTag(writer, 3, (int) value.getEarnings_list());
                AssetChipGrid.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_chip_grid());
                SectionTitle.ADAPTER.encodeWithTag(writer, 1, (int) value.getSection_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AssetChipGrid assetChipGridDecode = null;
                EarningsList earningsListDecode = null;
                SportEventHero sportEventHeroDecode = null;
                SportCarousel sportCarouselDecode = null;
                EventContractHero eventContractHeroDecode = null;
                CompactIndicies compactIndiciesDecode = null;
                ExpandedIndicies expandedIndiciesDecode = null;
                AssetHero assetHeroDecode = null;
                GenericHero genericHeroDecode = null;
                EmbeddedSection embeddedSectionDecode = null;
                SportsHeroCarousel sportsHeroCarouselDecode = null;
                QuickLinks quickLinksDecode = null;
                MultiContractsHeroCarousel multiContractsHeroCarouselDecode = null;
                ListHeatmapCarousel listHeatmapCarouselDecode = null;
                PredictionEventsList predictionEventsListDecode = null;
                NewsSection newsSectionDecode = null;
                GroupedListsSection groupedListsSectionDecode = null;
                SectionTitle sectionTitleDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    AssetChipGrid assetChipGrid = assetChipGridDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                sectionTitleDecode = SectionTitle.ADAPTER.decode(reader);
                                break;
                            case 2:
                                assetChipGridDecode = AssetChipGrid.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                earningsListDecode = EarningsList.ADAPTER.decode(reader);
                                break;
                            case 4:
                                sportEventHeroDecode = SportEventHero.ADAPTER.decode(reader);
                                break;
                            case 5:
                                sportCarouselDecode = SportCarousel.ADAPTER.decode(reader);
                                break;
                            case 6:
                                eventContractHeroDecode = EventContractHero.ADAPTER.decode(reader);
                                break;
                            case 7:
                                compactIndiciesDecode = CompactIndicies.ADAPTER.decode(reader);
                                break;
                            case 8:
                                expandedIndiciesDecode = ExpandedIndicies.ADAPTER.decode(reader);
                                break;
                            case 9:
                                assetHeroDecode = AssetHero.ADAPTER.decode(reader);
                                break;
                            case 10:
                                genericHeroDecode = GenericHero.ADAPTER.decode(reader);
                                break;
                            case 11:
                                embeddedSectionDecode = EmbeddedSection.ADAPTER.decode(reader);
                                break;
                            case 12:
                                sportsHeroCarouselDecode = SportsHeroCarousel.ADAPTER.decode(reader);
                                break;
                            case 13:
                                quickLinksDecode = QuickLinks.ADAPTER.decode(reader);
                                break;
                            case 14:
                                multiContractsHeroCarouselDecode = MultiContractsHeroCarousel.ADAPTER.decode(reader);
                                break;
                            case 15:
                                listHeatmapCarouselDecode = ListHeatmapCarousel.ADAPTER.decode(reader);
                                break;
                            case 16:
                                predictionEventsListDecode = PredictionEventsList.ADAPTER.decode(reader);
                                break;
                            case 17:
                                newsSectionDecode = NewsSection.ADAPTER.decode(reader);
                                break;
                            case 18:
                                groupedListsSectionDecode = GroupedListsSection.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        assetChipGridDecode = assetChipGrid;
                    } else {
                        return new HighlightItem(sectionTitleDecode, assetChipGrid, earningsListDecode, sportEventHeroDecode, sportCarouselDecode, eventContractHeroDecode, compactIndiciesDecode, expandedIndiciesDecode, assetHeroDecode, genericHeroDecode, embeddedSectionDecode, sportsHeroCarouselDecode, quickLinksDecode, multiContractsHeroCarouselDecode, listHeatmapCarouselDecode, predictionEventsListDecode, newsSectionDecode, groupedListsSectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HighlightItem redact(HighlightItem value) {
                ListHeatmapCarousel listHeatmapCarousel;
                GroupedListsSection groupedListsSectionRedact;
                NewsSection newsSection;
                Intrinsics.checkNotNullParameter(value, "value");
                SectionTitle section_title = value.getSection_title();
                SectionTitle sectionTitleRedact = section_title != null ? SectionTitle.ADAPTER.redact(section_title) : null;
                AssetChipGrid asset_chip_grid = value.getAsset_chip_grid();
                AssetChipGrid assetChipGridRedact = asset_chip_grid != null ? AssetChipGrid.ADAPTER.redact(asset_chip_grid) : null;
                EarningsList earnings_list = value.getEarnings_list();
                EarningsList earningsListRedact = earnings_list != null ? EarningsList.ADAPTER.redact(earnings_list) : null;
                SportEventHero sport_event_hero = value.getSport_event_hero();
                SportEventHero sportEventHeroRedact = sport_event_hero != null ? SportEventHero.ADAPTER.redact(sport_event_hero) : null;
                SportCarousel sport_carousel = value.getSport_carousel();
                SportCarousel sportCarouselRedact = sport_carousel != null ? SportCarousel.ADAPTER.redact(sport_carousel) : null;
                EventContractHero event_contract_hero = value.getEvent_contract_hero();
                EventContractHero eventContractHeroRedact = event_contract_hero != null ? EventContractHero.ADAPTER.redact(event_contract_hero) : null;
                CompactIndicies compact_indicies = value.getCompact_indicies();
                CompactIndicies compactIndiciesRedact = compact_indicies != null ? CompactIndicies.ADAPTER.redact(compact_indicies) : null;
                ExpandedIndicies expanded_indicies = value.getExpanded_indicies();
                ExpandedIndicies expandedIndiciesRedact = expanded_indicies != null ? ExpandedIndicies.ADAPTER.redact(expanded_indicies) : null;
                AssetHero asset_hero = value.getAsset_hero();
                AssetHero assetHeroRedact = asset_hero != null ? AssetHero.ADAPTER.redact(asset_hero) : null;
                GenericHero generic_hero = value.getGeneric_hero();
                GenericHero genericHeroRedact = generic_hero != null ? GenericHero.ADAPTER.redact(generic_hero) : null;
                EmbeddedSection embedded_section = value.getEmbedded_section();
                EmbeddedSection embeddedSectionRedact = embedded_section != null ? EmbeddedSection.ADAPTER.redact(embedded_section) : null;
                SportsHeroCarousel sports_hero_carousel = value.getSports_hero_carousel();
                SportsHeroCarousel sportsHeroCarouselRedact = sports_hero_carousel != null ? SportsHeroCarousel.ADAPTER.redact(sports_hero_carousel) : null;
                QuickLinks quick_links = value.getQuick_links();
                QuickLinks quickLinksRedact = quick_links != null ? QuickLinks.ADAPTER.redact(quick_links) : null;
                MultiContractsHeroCarousel multi_contracts_hero_carousel = value.getMulti_contracts_hero_carousel();
                MultiContractsHeroCarousel multiContractsHeroCarouselRedact = multi_contracts_hero_carousel != null ? MultiContractsHeroCarousel.ADAPTER.redact(multi_contracts_hero_carousel) : null;
                ListHeatmapCarousel list_heatmap_carousel = value.getList_heatmap_carousel();
                SectionTitle sectionTitle = sectionTitleRedact;
                ListHeatmapCarousel listHeatmapCarouselRedact = list_heatmap_carousel != null ? ListHeatmapCarousel.ADAPTER.redact(list_heatmap_carousel) : null;
                PredictionEventsList prediction_events_list = value.getPrediction_events_list();
                ListHeatmapCarousel listHeatmapCarousel2 = listHeatmapCarouselRedact;
                PredictionEventsList predictionEventsListRedact = prediction_events_list != null ? PredictionEventsList.ADAPTER.redact(prediction_events_list) : null;
                NewsSection news_section = value.getNews_section();
                PredictionEventsList predictionEventsList = predictionEventsListRedact;
                NewsSection newsSectionRedact = news_section != null ? NewsSection.ADAPTER.redact(news_section) : null;
                GroupedListsSection grouped_lists_section = value.getGrouped_lists_section();
                if (grouped_lists_section != null) {
                    groupedListsSectionRedact = GroupedListsSection.ADAPTER.redact(grouped_lists_section);
                    listHeatmapCarousel = listHeatmapCarousel2;
                    newsSection = newsSectionRedact;
                } else {
                    listHeatmapCarousel = listHeatmapCarousel2;
                    groupedListsSectionRedact = null;
                    newsSection = newsSectionRedact;
                }
                return value.copy(sectionTitle, assetChipGridRedact, earningsListRedact, sportEventHeroRedact, sportCarouselRedact, eventContractHeroRedact, compactIndiciesRedact, expandedIndiciesRedact, assetHeroRedact, genericHeroRedact, embeddedSectionRedact, sportsHeroCarouselRedact, quickLinksRedact, multiContractsHeroCarouselRedact, listHeatmapCarousel, predictionEventsList, newsSection, groupedListsSectionRedact, ByteString.EMPTY);
            }
        };
    }
}
