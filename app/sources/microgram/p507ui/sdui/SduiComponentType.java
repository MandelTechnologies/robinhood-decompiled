package microgram.p507ui.sdui;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bw\b\u0087\u0081\u0002\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001yB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bx¨\u0006z"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiComponentType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCORDION_ROW", "BOOK_COVER_TEXT", "BUTTON", "CHART_GROUP", "CHART_LAYERED_STACK", "CHART_OVERLAY_ICON", "CHART_PULSING_DOT", "CHECKBOX", "CHIP", "CHIPGRID", "CONTAINER", "CRYPTO_DEMETER_DATA_ROW_CONDENSED", "DATA_ROW_CONDENSED", "DATA_ROW_GRID", "DATA_ROW_STACKED", "DAY_TRADE_BUBBLES_VIEW", "DAY_TRADE_COUNTER", "DECORATOR", "DIVIDER_LINE", "ELEVATED_CARD", "EXPANDABLE_MARKDOWN_TEXT", "FEATURE_CARD", "FEATURE_DISCOVERY", "FLOATING_VALUE_PROP", "FOREIGN_CURRENCY_CONVERSION_INFO", "FUNDAMENTALS_DATA_ROW_GRID", "GOLD_BUTTON", "GRADIENT_TEXT", "GRID", "HISTORY_DETAIL_HEADER", "HISTORY_DETAIL_ROWS_SECTION", "HORIZONTAL_SCROLL_CONTAINER", "ICON_BUTTON", "ICON_IMAGE", "INFO_BANNER", "INFO_TAG", "INLINE_EXPANDABLE_LABEL", "INSTRUMENT_LIST_ITEM", "INVEST_FLOW_CAPSULE", "INVEST_FLOW_CARD", "INVEST_FLOW_CHIP", "INVEST_FLOW_CHIPGRID", "INVEST_FLOW_HEADER", "INVEST_FLOW_LAYOUT_CONTAINER", "INVEST_FLOW_SINGLE_INSTRUMENT", "LOADING_SPINNER", "MARGIN_HUB_BUFFER_VIEW", "MARGIN_ICON", "MARGIN_REQUIREMENT_POLLABLE_CELL", "MARGIN_REQUIREMENT_POLLABLE_HEADER", "MARGIN_STATUS_CARD_CONTENT", "MARGIN_TIERED_INTEREST_RATES", "MARKDOWN_TEXT", "MARKDOWN_WITH_TRAILING_ACTION", "NAVIGATION_ROW", "NAVIGATION_ROW_WITH_END_BUTTON", "NAVIGATION_ROW_WITH_END_ICON", "NAVIGATION_ROW_WITH_END_TEXT", "NAVIGATION_ROW_WITH_ICON", "NAVIGATION_ROW_WITH_ICON_AND_END_TEXT", "NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT", "NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT", "NUMBER_POG", "ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT", "PAGINATED_LIST", "PATHFINDER_RECENT_ORDERS", "POG_GROUP", "POG_WITH_PICTOGRAM", "POSITION_LIST_ITEM", "PROTO", "REACTIVE_BUTTON", "REACTIVE_COMPONENT", "RECOMMENDATIONS_ALLOCATION_ROW", "RECURRING_INSIGHTS_HEADER", "RECURRING_INSIGHTS_LAYOUT_CONTAINER", "RECURRING_INSIGHTS_VISUALIZATION", "RELATIVE_HEIGHT_CONTAINER", "REMOTE_IMAGE_ASPECT_FILL", "REMOTE_IMAGE_ASPECT_FIT", "REMOTE_IMAGE_ASPECT_RATIO", "REMOTE_LOTTIE", "RETIREMENT_CONTRIBUTION_ROW", "SCATTER_CHART", "SCATTER_CHART_LEGEND", "SELECT_ROW", "SETTINGS_ROW_CONDENSED", "SETTINGS_ROW_STACKED", "SHAREHOLDER_EVENT_NAVIGATION_ROW", "SPACER", "STOCK_LIST_ITEM", "TABLE_1_D_CHANGE_ITEM", "TABLE_1_M_CHANGE_ITEM", "TABLE_1_W_CHANGE_ITEM", "TABLE_1_Y_CHANGE_ITEM", "TABLE_3_M_CHANGE_ITEM", "TABLE_COLUMN_HEADER", "TABLE_INSTRUMENT_NAME", "TABLE_SHARE_PRICE_ITEM", "TABLE_SPARKLINE_ITEM", "TEXT", "TEXT_AREA", "TEXT_BUTTON", "TEXT_INPUT", "TEXT_POG", "THEMED_COMPONENT", "TIMELINE", "TRADE_SHARING_TIMELINE", "UPSELL_NAVIGATION_ROW_WITH_INFO_TAG", "VALUE_PROP_WITH_ICON", "VALUE_PROP_WITH_NUMBER", "VALUE_PROP_WITH_PICTOGRAM", "VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT", "WEIGHTED_CONTAINER", "Z_STACK", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiComponentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiComponentType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("ACCORDION_ROW")
    public static final SduiComponentType ACCORDION_ROW = new SduiComponentType("ACCORDION_ROW", 0, "ACCORDION_ROW");

    @SerialName("BOOK_COVER_TEXT")
    public static final SduiComponentType BOOK_COVER_TEXT = new SduiComponentType("BOOK_COVER_TEXT", 1, "BOOK_COVER_TEXT");

    @SerialName("BUTTON")
    public static final SduiComponentType BUTTON = new SduiComponentType("BUTTON", 2, "BUTTON");

    @SerialName("CHART_GROUP")
    public static final SduiComponentType CHART_GROUP = new SduiComponentType("CHART_GROUP", 3, "CHART_GROUP");

    @SerialName("CHART_LAYERED_STACK")
    public static final SduiComponentType CHART_LAYERED_STACK = new SduiComponentType("CHART_LAYERED_STACK", 4, "CHART_LAYERED_STACK");

    @SerialName("CHART_OVERLAY_ICON")
    public static final SduiComponentType CHART_OVERLAY_ICON = new SduiComponentType("CHART_OVERLAY_ICON", 5, "CHART_OVERLAY_ICON");

    @SerialName("CHART_PULSING_DOT")
    public static final SduiComponentType CHART_PULSING_DOT = new SduiComponentType("CHART_PULSING_DOT", 6, "CHART_PULSING_DOT");

    @SerialName("CHECKBOX")
    public static final SduiComponentType CHECKBOX = new SduiComponentType("CHECKBOX", 7, "CHECKBOX");

    @SerialName("CHIP")
    public static final SduiComponentType CHIP = new SduiComponentType("CHIP", 8, "CHIP");

    @SerialName("CHIPGRID")
    public static final SduiComponentType CHIPGRID = new SduiComponentType("CHIPGRID", 9, "CHIPGRID");

    @SerialName("CONTAINER")
    public static final SduiComponentType CONTAINER = new SduiComponentType("CONTAINER", 10, "CONTAINER");

    @SerialName("CRYPTO_DEMETER_DATA_ROW_CONDENSED")
    public static final SduiComponentType CRYPTO_DEMETER_DATA_ROW_CONDENSED = new SduiComponentType("CRYPTO_DEMETER_DATA_ROW_CONDENSED", 11, "CRYPTO_DEMETER_DATA_ROW_CONDENSED");

    @SerialName("DATA_ROW_CONDENSED")
    public static final SduiComponentType DATA_ROW_CONDENSED = new SduiComponentType("DATA_ROW_CONDENSED", 12, "DATA_ROW_CONDENSED");

    @SerialName("DATA_ROW_GRID")
    public static final SduiComponentType DATA_ROW_GRID = new SduiComponentType("DATA_ROW_GRID", 13, "DATA_ROW_GRID");

    @SerialName("DATA_ROW_STACKED")
    public static final SduiComponentType DATA_ROW_STACKED = new SduiComponentType("DATA_ROW_STACKED", 14, "DATA_ROW_STACKED");

    @SerialName("DAY_TRADE_BUBBLES_VIEW")
    public static final SduiComponentType DAY_TRADE_BUBBLES_VIEW = new SduiComponentType("DAY_TRADE_BUBBLES_VIEW", 15, "DAY_TRADE_BUBBLES_VIEW");

    @SerialName("DAY_TRADE_COUNTER")
    public static final SduiComponentType DAY_TRADE_COUNTER = new SduiComponentType("DAY_TRADE_COUNTER", 16, "DAY_TRADE_COUNTER");

    @SerialName("DECORATOR")
    public static final SduiComponentType DECORATOR = new SduiComponentType("DECORATOR", 17, "DECORATOR");

    @SerialName("DIVIDER_LINE")
    public static final SduiComponentType DIVIDER_LINE = new SduiComponentType("DIVIDER_LINE", 18, "DIVIDER_LINE");

    @SerialName("ELEVATED_CARD")
    public static final SduiComponentType ELEVATED_CARD = new SduiComponentType("ELEVATED_CARD", 19, "ELEVATED_CARD");

    @SerialName("EXPANDABLE_MARKDOWN_TEXT")
    public static final SduiComponentType EXPANDABLE_MARKDOWN_TEXT = new SduiComponentType("EXPANDABLE_MARKDOWN_TEXT", 20, "EXPANDABLE_MARKDOWN_TEXT");

    @SerialName("FEATURE_CARD")
    public static final SduiComponentType FEATURE_CARD = new SduiComponentType("FEATURE_CARD", 21, "FEATURE_CARD");

    @SerialName("FEATURE_DISCOVERY")
    public static final SduiComponentType FEATURE_DISCOVERY = new SduiComponentType("FEATURE_DISCOVERY", 22, "FEATURE_DISCOVERY");

    @SerialName("FLOATING_VALUE_PROP")
    public static final SduiComponentType FLOATING_VALUE_PROP = new SduiComponentType("FLOATING_VALUE_PROP", 23, "FLOATING_VALUE_PROP");

    @SerialName("FOREIGN_CURRENCY_CONVERSION_INFO")
    public static final SduiComponentType FOREIGN_CURRENCY_CONVERSION_INFO = new SduiComponentType("FOREIGN_CURRENCY_CONVERSION_INFO", 24, "FOREIGN_CURRENCY_CONVERSION_INFO");

    @SerialName("FUNDAMENTALS_DATA_ROW_GRID")
    public static final SduiComponentType FUNDAMENTALS_DATA_ROW_GRID = new SduiComponentType("FUNDAMENTALS_DATA_ROW_GRID", 25, "FUNDAMENTALS_DATA_ROW_GRID");

    @SerialName("GOLD_BUTTON")
    public static final SduiComponentType GOLD_BUTTON = new SduiComponentType("GOLD_BUTTON", 26, "GOLD_BUTTON");

    @SerialName("GRADIENT_TEXT")
    public static final SduiComponentType GRADIENT_TEXT = new SduiComponentType("GRADIENT_TEXT", 27, "GRADIENT_TEXT");

    @SerialName("GRID")
    public static final SduiComponentType GRID = new SduiComponentType("GRID", 28, "GRID");

    @SerialName("HISTORY_DETAIL_HEADER")
    public static final SduiComponentType HISTORY_DETAIL_HEADER = new SduiComponentType("HISTORY_DETAIL_HEADER", 29, "HISTORY_DETAIL_HEADER");

    @SerialName("HISTORY_DETAIL_ROWS_SECTION")
    public static final SduiComponentType HISTORY_DETAIL_ROWS_SECTION = new SduiComponentType("HISTORY_DETAIL_ROWS_SECTION", 30, "HISTORY_DETAIL_ROWS_SECTION");

    @SerialName("HORIZONTAL_SCROLL_CONTAINER")
    public static final SduiComponentType HORIZONTAL_SCROLL_CONTAINER = new SduiComponentType("HORIZONTAL_SCROLL_CONTAINER", 31, "HORIZONTAL_SCROLL_CONTAINER");

    @SerialName("ICON_BUTTON")
    public static final SduiComponentType ICON_BUTTON = new SduiComponentType("ICON_BUTTON", 32, "ICON_BUTTON");

    @SerialName("ICON_IMAGE")
    public static final SduiComponentType ICON_IMAGE = new SduiComponentType("ICON_IMAGE", 33, "ICON_IMAGE");

    @SerialName("INFO_BANNER")
    public static final SduiComponentType INFO_BANNER = new SduiComponentType("INFO_BANNER", 34, "INFO_BANNER");

    @SerialName("INFO_TAG")
    public static final SduiComponentType INFO_TAG = new SduiComponentType("INFO_TAG", 35, "INFO_TAG");

    @SerialName("INLINE_EXPANDABLE_LABEL")
    public static final SduiComponentType INLINE_EXPANDABLE_LABEL = new SduiComponentType("INLINE_EXPANDABLE_LABEL", 36, "INLINE_EXPANDABLE_LABEL");

    @SerialName("INSTRUMENT_LIST_ITEM")
    public static final SduiComponentType INSTRUMENT_LIST_ITEM = new SduiComponentType("INSTRUMENT_LIST_ITEM", 37, "INSTRUMENT_LIST_ITEM");

    @SerialName("INVEST_FLOW_CAPSULE")
    public static final SduiComponentType INVEST_FLOW_CAPSULE = new SduiComponentType("INVEST_FLOW_CAPSULE", 38, "INVEST_FLOW_CAPSULE");

    @SerialName("INVEST_FLOW_CARD")
    public static final SduiComponentType INVEST_FLOW_CARD = new SduiComponentType("INVEST_FLOW_CARD", 39, "INVEST_FLOW_CARD");

    @SerialName("INVEST_FLOW_CHIP")
    public static final SduiComponentType INVEST_FLOW_CHIP = new SduiComponentType("INVEST_FLOW_CHIP", 40, "INVEST_FLOW_CHIP");

    @SerialName("INVEST_FLOW_CHIPGRID")
    public static final SduiComponentType INVEST_FLOW_CHIPGRID = new SduiComponentType("INVEST_FLOW_CHIPGRID", 41, "INVEST_FLOW_CHIPGRID");

    @SerialName("INVEST_FLOW_HEADER")
    public static final SduiComponentType INVEST_FLOW_HEADER = new SduiComponentType("INVEST_FLOW_HEADER", 42, "INVEST_FLOW_HEADER");

    @SerialName("INVEST_FLOW_LAYOUT_CONTAINER")
    public static final SduiComponentType INVEST_FLOW_LAYOUT_CONTAINER = new SduiComponentType("INVEST_FLOW_LAYOUT_CONTAINER", 43, "INVEST_FLOW_LAYOUT_CONTAINER");

    @SerialName("INVEST_FLOW_SINGLE_INSTRUMENT")
    public static final SduiComponentType INVEST_FLOW_SINGLE_INSTRUMENT = new SduiComponentType("INVEST_FLOW_SINGLE_INSTRUMENT", 44, "INVEST_FLOW_SINGLE_INSTRUMENT");

    @SerialName("LOADING_SPINNER")
    public static final SduiComponentType LOADING_SPINNER = new SduiComponentType("LOADING_SPINNER", 45, "LOADING_SPINNER");

    @SerialName("MARGIN_HUB_BUFFER_VIEW")
    public static final SduiComponentType MARGIN_HUB_BUFFER_VIEW = new SduiComponentType("MARGIN_HUB_BUFFER_VIEW", 46, "MARGIN_HUB_BUFFER_VIEW");

    @SerialName("MARGIN_ICON")
    public static final SduiComponentType MARGIN_ICON = new SduiComponentType("MARGIN_ICON", 47, "MARGIN_ICON");

    @SerialName("MARGIN_REQUIREMENT_POLLABLE_CELL")
    public static final SduiComponentType MARGIN_REQUIREMENT_POLLABLE_CELL = new SduiComponentType("MARGIN_REQUIREMENT_POLLABLE_CELL", 48, "MARGIN_REQUIREMENT_POLLABLE_CELL");

    @SerialName("MARGIN_REQUIREMENT_POLLABLE_HEADER")
    public static final SduiComponentType MARGIN_REQUIREMENT_POLLABLE_HEADER = new SduiComponentType("MARGIN_REQUIREMENT_POLLABLE_HEADER", 49, "MARGIN_REQUIREMENT_POLLABLE_HEADER");

    @SerialName("MARGIN_STATUS_CARD_CONTENT")
    public static final SduiComponentType MARGIN_STATUS_CARD_CONTENT = new SduiComponentType("MARGIN_STATUS_CARD_CONTENT", 50, "MARGIN_STATUS_CARD_CONTENT");

    @SerialName("MARGIN_TIERED_INTEREST_RATES")
    public static final SduiComponentType MARGIN_TIERED_INTEREST_RATES = new SduiComponentType("MARGIN_TIERED_INTEREST_RATES", 51, "MARGIN_TIERED_INTEREST_RATES");

    @SerialName("MARKDOWN_TEXT")
    public static final SduiComponentType MARKDOWN_TEXT = new SduiComponentType("MARKDOWN_TEXT", 52, "MARKDOWN_TEXT");

    @SerialName("MARKDOWN_WITH_TRAILING_ACTION")
    public static final SduiComponentType MARKDOWN_WITH_TRAILING_ACTION = new SduiComponentType("MARKDOWN_WITH_TRAILING_ACTION", 53, "MARKDOWN_WITH_TRAILING_ACTION");

    @SerialName("NAVIGATION_ROW")
    public static final SduiComponentType NAVIGATION_ROW = new SduiComponentType("NAVIGATION_ROW", 54, "NAVIGATION_ROW");

    @SerialName("NAVIGATION_ROW_WITH_END_BUTTON")
    public static final SduiComponentType NAVIGATION_ROW_WITH_END_BUTTON = new SduiComponentType("NAVIGATION_ROW_WITH_END_BUTTON", 55, "NAVIGATION_ROW_WITH_END_BUTTON");

    @SerialName("NAVIGATION_ROW_WITH_END_ICON")
    public static final SduiComponentType NAVIGATION_ROW_WITH_END_ICON = new SduiComponentType("NAVIGATION_ROW_WITH_END_ICON", 56, "NAVIGATION_ROW_WITH_END_ICON");

    @SerialName("NAVIGATION_ROW_WITH_END_TEXT")
    public static final SduiComponentType NAVIGATION_ROW_WITH_END_TEXT = new SduiComponentType("NAVIGATION_ROW_WITH_END_TEXT", 57, "NAVIGATION_ROW_WITH_END_TEXT");

    @SerialName("NAVIGATION_ROW_WITH_ICON")
    public static final SduiComponentType NAVIGATION_ROW_WITH_ICON = new SduiComponentType("NAVIGATION_ROW_WITH_ICON", 58, "NAVIGATION_ROW_WITH_ICON");

    @SerialName("NAVIGATION_ROW_WITH_ICON_AND_END_TEXT")
    public static final SduiComponentType NAVIGATION_ROW_WITH_ICON_AND_END_TEXT = new SduiComponentType("NAVIGATION_ROW_WITH_ICON_AND_END_TEXT", 59, "NAVIGATION_ROW_WITH_ICON_AND_END_TEXT");

    @SerialName("NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT")
    public static final SduiComponentType NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT = new SduiComponentType("NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT", 60, "NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT");

    @SerialName("NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT")
    public static final SduiComponentType NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT = new SduiComponentType("NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT", 61, "NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT");

    @SerialName("NUMBER_POG")
    public static final SduiComponentType NUMBER_POG = new SduiComponentType("NUMBER_POG", 62, "NUMBER_POG");

    @SerialName("ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT")
    public static final SduiComponentType ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT = new SduiComponentType("ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT", 63, "ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT");

    @SerialName("PAGINATED_LIST")
    public static final SduiComponentType PAGINATED_LIST = new SduiComponentType("PAGINATED_LIST", 64, "PAGINATED_LIST");

    @SerialName("PATHFINDER_RECENT_ORDERS")
    public static final SduiComponentType PATHFINDER_RECENT_ORDERS = new SduiComponentType("PATHFINDER_RECENT_ORDERS", 65, "PATHFINDER_RECENT_ORDERS");

    @SerialName("POG_GROUP")
    public static final SduiComponentType POG_GROUP = new SduiComponentType("POG_GROUP", 66, "POG_GROUP");

    @SerialName("POG_WITH_PICTOGRAM")
    public static final SduiComponentType POG_WITH_PICTOGRAM = new SduiComponentType("POG_WITH_PICTOGRAM", 67, "POG_WITH_PICTOGRAM");

    @SerialName("POSITION_LIST_ITEM")
    public static final SduiComponentType POSITION_LIST_ITEM = new SduiComponentType("POSITION_LIST_ITEM", 68, "POSITION_LIST_ITEM");

    @SerialName("PROTO")
    public static final SduiComponentType PROTO = new SduiComponentType("PROTO", 69, "PROTO");

    @SerialName("REACTIVE_BUTTON")
    public static final SduiComponentType REACTIVE_BUTTON = new SduiComponentType("REACTIVE_BUTTON", 70, "REACTIVE_BUTTON");

    @SerialName("REACTIVE_COMPONENT")
    public static final SduiComponentType REACTIVE_COMPONENT = new SduiComponentType("REACTIVE_COMPONENT", 71, "REACTIVE_COMPONENT");

    @SerialName("RECOMMENDATIONS_ALLOCATION_ROW")
    public static final SduiComponentType RECOMMENDATIONS_ALLOCATION_ROW = new SduiComponentType("RECOMMENDATIONS_ALLOCATION_ROW", 72, "RECOMMENDATIONS_ALLOCATION_ROW");

    @SerialName("RECURRING_INSIGHTS_HEADER")
    public static final SduiComponentType RECURRING_INSIGHTS_HEADER = new SduiComponentType("RECURRING_INSIGHTS_HEADER", 73, "RECURRING_INSIGHTS_HEADER");

    @SerialName("RECURRING_INSIGHTS_LAYOUT_CONTAINER")
    public static final SduiComponentType RECURRING_INSIGHTS_LAYOUT_CONTAINER = new SduiComponentType("RECURRING_INSIGHTS_LAYOUT_CONTAINER", 74, "RECURRING_INSIGHTS_LAYOUT_CONTAINER");

    @SerialName("RECURRING_INSIGHTS_VISUALIZATION")
    public static final SduiComponentType RECURRING_INSIGHTS_VISUALIZATION = new SduiComponentType("RECURRING_INSIGHTS_VISUALIZATION", 75, "RECURRING_INSIGHTS_VISUALIZATION");

    @SerialName("RELATIVE_HEIGHT_CONTAINER")
    public static final SduiComponentType RELATIVE_HEIGHT_CONTAINER = new SduiComponentType("RELATIVE_HEIGHT_CONTAINER", 76, "RELATIVE_HEIGHT_CONTAINER");

    @SerialName("REMOTE_IMAGE_ASPECT_FILL")
    public static final SduiComponentType REMOTE_IMAGE_ASPECT_FILL = new SduiComponentType("REMOTE_IMAGE_ASPECT_FILL", 77, "REMOTE_IMAGE_ASPECT_FILL");

    @SerialName("REMOTE_IMAGE_ASPECT_FIT")
    public static final SduiComponentType REMOTE_IMAGE_ASPECT_FIT = new SduiComponentType("REMOTE_IMAGE_ASPECT_FIT", 78, "REMOTE_IMAGE_ASPECT_FIT");

    @SerialName("REMOTE_IMAGE_ASPECT_RATIO")
    public static final SduiComponentType REMOTE_IMAGE_ASPECT_RATIO = new SduiComponentType("REMOTE_IMAGE_ASPECT_RATIO", 79, "REMOTE_IMAGE_ASPECT_RATIO");

    @SerialName("REMOTE_LOTTIE")
    public static final SduiComponentType REMOTE_LOTTIE = new SduiComponentType("REMOTE_LOTTIE", 80, "REMOTE_LOTTIE");

    @SerialName("RETIREMENT_CONTRIBUTION_ROW")
    public static final SduiComponentType RETIREMENT_CONTRIBUTION_ROW = new SduiComponentType("RETIREMENT_CONTRIBUTION_ROW", 81, "RETIREMENT_CONTRIBUTION_ROW");

    @SerialName("SCATTER_CHART")
    public static final SduiComponentType SCATTER_CHART = new SduiComponentType("SCATTER_CHART", 82, "SCATTER_CHART");

    @SerialName("SCATTER_CHART_LEGEND")
    public static final SduiComponentType SCATTER_CHART_LEGEND = new SduiComponentType("SCATTER_CHART_LEGEND", 83, "SCATTER_CHART_LEGEND");

    @SerialName("SELECT_ROW")
    public static final SduiComponentType SELECT_ROW = new SduiComponentType("SELECT_ROW", 84, "SELECT_ROW");

    @SerialName("SETTINGS_ROW_CONDENSED")
    public static final SduiComponentType SETTINGS_ROW_CONDENSED = new SduiComponentType("SETTINGS_ROW_CONDENSED", 85, "SETTINGS_ROW_CONDENSED");

    @SerialName("SETTINGS_ROW_STACKED")
    public static final SduiComponentType SETTINGS_ROW_STACKED = new SduiComponentType("SETTINGS_ROW_STACKED", 86, "SETTINGS_ROW_STACKED");

    @SerialName("SHAREHOLDER_EVENT_NAVIGATION_ROW")
    public static final SduiComponentType SHAREHOLDER_EVENT_NAVIGATION_ROW = new SduiComponentType("SHAREHOLDER_EVENT_NAVIGATION_ROW", 87, "SHAREHOLDER_EVENT_NAVIGATION_ROW");

    @SerialName("SPACER")
    public static final SduiComponentType SPACER = new SduiComponentType("SPACER", 88, "SPACER");

    @SerialName("STOCK_LIST_ITEM")
    public static final SduiComponentType STOCK_LIST_ITEM = new SduiComponentType("STOCK_LIST_ITEM", 89, "STOCK_LIST_ITEM");

    @SerialName("TABLE_1D_CHANGE_ITEM")
    public static final SduiComponentType TABLE_1_D_CHANGE_ITEM = new SduiComponentType("TABLE_1_D_CHANGE_ITEM", 90, "TABLE_1D_CHANGE_ITEM");

    @SerialName("TABLE_1M_CHANGE_ITEM")
    public static final SduiComponentType TABLE_1_M_CHANGE_ITEM = new SduiComponentType("TABLE_1_M_CHANGE_ITEM", 91, "TABLE_1M_CHANGE_ITEM");

    @SerialName("TABLE_1W_CHANGE_ITEM")
    public static final SduiComponentType TABLE_1_W_CHANGE_ITEM = new SduiComponentType("TABLE_1_W_CHANGE_ITEM", 92, "TABLE_1W_CHANGE_ITEM");

    @SerialName("TABLE_1Y_CHANGE_ITEM")
    public static final SduiComponentType TABLE_1_Y_CHANGE_ITEM = new SduiComponentType("TABLE_1_Y_CHANGE_ITEM", 93, "TABLE_1Y_CHANGE_ITEM");

    @SerialName("TABLE_3M_CHANGE_ITEM")
    public static final SduiComponentType TABLE_3_M_CHANGE_ITEM = new SduiComponentType("TABLE_3_M_CHANGE_ITEM", 94, "TABLE_3M_CHANGE_ITEM");

    @SerialName("TABLE_COLUMN_HEADER")
    public static final SduiComponentType TABLE_COLUMN_HEADER = new SduiComponentType("TABLE_COLUMN_HEADER", 95, "TABLE_COLUMN_HEADER");

    @SerialName("TABLE_INSTRUMENT_NAME")
    public static final SduiComponentType TABLE_INSTRUMENT_NAME = new SduiComponentType("TABLE_INSTRUMENT_NAME", 96, "TABLE_INSTRUMENT_NAME");

    @SerialName("TABLE_SHARE_PRICE_ITEM")
    public static final SduiComponentType TABLE_SHARE_PRICE_ITEM = new SduiComponentType("TABLE_SHARE_PRICE_ITEM", 97, "TABLE_SHARE_PRICE_ITEM");

    @SerialName("TABLE_SPARKLINE_ITEM")
    public static final SduiComponentType TABLE_SPARKLINE_ITEM = new SduiComponentType("TABLE_SPARKLINE_ITEM", 98, "TABLE_SPARKLINE_ITEM");

    @SerialName("TEXT")
    public static final SduiComponentType TEXT = new SduiComponentType("TEXT", 99, "TEXT");

    @SerialName("TEXT_AREA")
    public static final SduiComponentType TEXT_AREA = new SduiComponentType("TEXT_AREA", 100, "TEXT_AREA");

    @SerialName("TEXT_BUTTON")
    public static final SduiComponentType TEXT_BUTTON = new SduiComponentType("TEXT_BUTTON", 101, "TEXT_BUTTON");

    @SerialName("TEXT_INPUT")
    public static final SduiComponentType TEXT_INPUT = new SduiComponentType("TEXT_INPUT", 102, "TEXT_INPUT");

    @SerialName("TEXT_POG")
    public static final SduiComponentType TEXT_POG = new SduiComponentType("TEXT_POG", 103, "TEXT_POG");

    @SerialName("THEMED_COMPONENT")
    public static final SduiComponentType THEMED_COMPONENT = new SduiComponentType("THEMED_COMPONENT", 104, "THEMED_COMPONENT");

    @SerialName("TIMELINE")
    public static final SduiComponentType TIMELINE = new SduiComponentType("TIMELINE", 105, "TIMELINE");

    @SerialName("TRADE_SHARING_TIMELINE")
    public static final SduiComponentType TRADE_SHARING_TIMELINE = new SduiComponentType("TRADE_SHARING_TIMELINE", 106, "TRADE_SHARING_TIMELINE");

    @SerialName("UPSELL_NAVIGATION_ROW_WITH_INFO_TAG")
    public static final SduiComponentType UPSELL_NAVIGATION_ROW_WITH_INFO_TAG = new SduiComponentType("UPSELL_NAVIGATION_ROW_WITH_INFO_TAG", 107, "UPSELL_NAVIGATION_ROW_WITH_INFO_TAG");

    @SerialName("VALUE_PROP_WITH_ICON")
    public static final SduiComponentType VALUE_PROP_WITH_ICON = new SduiComponentType("VALUE_PROP_WITH_ICON", 108, "VALUE_PROP_WITH_ICON");

    @SerialName("VALUE_PROP_WITH_NUMBER")
    public static final SduiComponentType VALUE_PROP_WITH_NUMBER = new SduiComponentType("VALUE_PROP_WITH_NUMBER", 109, "VALUE_PROP_WITH_NUMBER");

    @SerialName("VALUE_PROP_WITH_PICTOGRAM")
    public static final SduiComponentType VALUE_PROP_WITH_PICTOGRAM = new SduiComponentType("VALUE_PROP_WITH_PICTOGRAM", 110, "VALUE_PROP_WITH_PICTOGRAM");

    @SerialName("VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT")
    public static final SduiComponentType VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT = new SduiComponentType("VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT", 111, "VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT");

    @SerialName("WEIGHTED_CONTAINER")
    public static final SduiComponentType WEIGHTED_CONTAINER = new SduiComponentType("WEIGHTED_CONTAINER", 112, "WEIGHTED_CONTAINER");

    @SerialName("Z_STACK")
    public static final SduiComponentType Z_STACK = new SduiComponentType("Z_STACK", 113, "Z_STACK");

    private static final /* synthetic */ SduiComponentType[] $values() {
        return new SduiComponentType[]{ACCORDION_ROW, BOOK_COVER_TEXT, BUTTON, CHART_GROUP, CHART_LAYERED_STACK, CHART_OVERLAY_ICON, CHART_PULSING_DOT, CHECKBOX, CHIP, CHIPGRID, CONTAINER, CRYPTO_DEMETER_DATA_ROW_CONDENSED, DATA_ROW_CONDENSED, DATA_ROW_GRID, DATA_ROW_STACKED, DAY_TRADE_BUBBLES_VIEW, DAY_TRADE_COUNTER, DECORATOR, DIVIDER_LINE, ELEVATED_CARD, EXPANDABLE_MARKDOWN_TEXT, FEATURE_CARD, FEATURE_DISCOVERY, FLOATING_VALUE_PROP, FOREIGN_CURRENCY_CONVERSION_INFO, FUNDAMENTALS_DATA_ROW_GRID, GOLD_BUTTON, GRADIENT_TEXT, GRID, HISTORY_DETAIL_HEADER, HISTORY_DETAIL_ROWS_SECTION, HORIZONTAL_SCROLL_CONTAINER, ICON_BUTTON, ICON_IMAGE, INFO_BANNER, INFO_TAG, INLINE_EXPANDABLE_LABEL, INSTRUMENT_LIST_ITEM, INVEST_FLOW_CAPSULE, INVEST_FLOW_CARD, INVEST_FLOW_CHIP, INVEST_FLOW_CHIPGRID, INVEST_FLOW_HEADER, INVEST_FLOW_LAYOUT_CONTAINER, INVEST_FLOW_SINGLE_INSTRUMENT, LOADING_SPINNER, MARGIN_HUB_BUFFER_VIEW, MARGIN_ICON, MARGIN_REQUIREMENT_POLLABLE_CELL, MARGIN_REQUIREMENT_POLLABLE_HEADER, MARGIN_STATUS_CARD_CONTENT, MARGIN_TIERED_INTEREST_RATES, MARKDOWN_TEXT, MARKDOWN_WITH_TRAILING_ACTION, NAVIGATION_ROW, NAVIGATION_ROW_WITH_END_BUTTON, NAVIGATION_ROW_WITH_END_ICON, NAVIGATION_ROW_WITH_END_TEXT, NAVIGATION_ROW_WITH_ICON, NAVIGATION_ROW_WITH_ICON_AND_END_TEXT, NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT, NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT, NUMBER_POG, ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT, PAGINATED_LIST, PATHFINDER_RECENT_ORDERS, POG_GROUP, POG_WITH_PICTOGRAM, POSITION_LIST_ITEM, PROTO, REACTIVE_BUTTON, REACTIVE_COMPONENT, RECOMMENDATIONS_ALLOCATION_ROW, RECURRING_INSIGHTS_HEADER, RECURRING_INSIGHTS_LAYOUT_CONTAINER, RECURRING_INSIGHTS_VISUALIZATION, RELATIVE_HEIGHT_CONTAINER, REMOTE_IMAGE_ASPECT_FILL, REMOTE_IMAGE_ASPECT_FIT, REMOTE_IMAGE_ASPECT_RATIO, REMOTE_LOTTIE, RETIREMENT_CONTRIBUTION_ROW, SCATTER_CHART, SCATTER_CHART_LEGEND, SELECT_ROW, SETTINGS_ROW_CONDENSED, SETTINGS_ROW_STACKED, SHAREHOLDER_EVENT_NAVIGATION_ROW, SPACER, STOCK_LIST_ITEM, TABLE_1_D_CHANGE_ITEM, TABLE_1_M_CHANGE_ITEM, TABLE_1_W_CHANGE_ITEM, TABLE_1_Y_CHANGE_ITEM, TABLE_3_M_CHANGE_ITEM, TABLE_COLUMN_HEADER, TABLE_INSTRUMENT_NAME, TABLE_SHARE_PRICE_ITEM, TABLE_SPARKLINE_ITEM, TEXT, TEXT_AREA, TEXT_BUTTON, TEXT_INPUT, TEXT_POG, THEMED_COMPONENT, TIMELINE, TRADE_SHARING_TIMELINE, UPSELL_NAVIGATION_ROW_WITH_INFO_TAG, VALUE_PROP_WITH_ICON, VALUE_PROP_WITH_NUMBER, VALUE_PROP_WITH_PICTOGRAM, VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT, WEIGHTED_CONTAINER, Z_STACK};
    }

    public static EnumEntries<SduiComponentType> getEntries() {
        return $ENTRIES;
    }

    public static SduiComponentType valueOf(String str) {
        return (SduiComponentType) Enum.valueOf(SduiComponentType.class, str);
    }

    public static SduiComponentType[] values() {
        return (SduiComponentType[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiComponentType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiComponentType;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiComponentType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiComponentType> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiComponentType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiComponentType[] sduiComponentTypeArr$values = $values();
        $VALUES = sduiComponentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiComponentTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiComponentType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiComponentType", SduiComponentType.values(), new String[]{"ACCORDION_ROW", "BOOK_COVER_TEXT", "BUTTON", "CHART_GROUP", "CHART_LAYERED_STACK", "CHART_OVERLAY_ICON", "CHART_PULSING_DOT", "CHECKBOX", "CHIP", "CHIPGRID", "CONTAINER", "CRYPTO_DEMETER_DATA_ROW_CONDENSED", "DATA_ROW_CONDENSED", "DATA_ROW_GRID", "DATA_ROW_STACKED", "DAY_TRADE_BUBBLES_VIEW", "DAY_TRADE_COUNTER", "DECORATOR", "DIVIDER_LINE", "ELEVATED_CARD", "EXPANDABLE_MARKDOWN_TEXT", "FEATURE_CARD", "FEATURE_DISCOVERY", "FLOATING_VALUE_PROP", "FOREIGN_CURRENCY_CONVERSION_INFO", "FUNDAMENTALS_DATA_ROW_GRID", "GOLD_BUTTON", "GRADIENT_TEXT", "GRID", "HISTORY_DETAIL_HEADER", "HISTORY_DETAIL_ROWS_SECTION", "HORIZONTAL_SCROLL_CONTAINER", "ICON_BUTTON", "ICON_IMAGE", "INFO_BANNER", "INFO_TAG", "INLINE_EXPANDABLE_LABEL", "INSTRUMENT_LIST_ITEM", "INVEST_FLOW_CAPSULE", "INVEST_FLOW_CARD", "INVEST_FLOW_CHIP", "INVEST_FLOW_CHIPGRID", "INVEST_FLOW_HEADER", "INVEST_FLOW_LAYOUT_CONTAINER", "INVEST_FLOW_SINGLE_INSTRUMENT", "LOADING_SPINNER", "MARGIN_HUB_BUFFER_VIEW", "MARGIN_ICON", "MARGIN_REQUIREMENT_POLLABLE_CELL", "MARGIN_REQUIREMENT_POLLABLE_HEADER", "MARGIN_STATUS_CARD_CONTENT", "MARGIN_TIERED_INTEREST_RATES", "MARKDOWN_TEXT", "MARKDOWN_WITH_TRAILING_ACTION", "NAVIGATION_ROW", "NAVIGATION_ROW_WITH_END_BUTTON", "NAVIGATION_ROW_WITH_END_ICON", "NAVIGATION_ROW_WITH_END_TEXT", "NAVIGATION_ROW_WITH_ICON", "NAVIGATION_ROW_WITH_ICON_AND_END_TEXT", "NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT", "NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT", "NUMBER_POG", "ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT", "PAGINATED_LIST", "PATHFINDER_RECENT_ORDERS", "POG_GROUP", "POG_WITH_PICTOGRAM", "POSITION_LIST_ITEM", "PROTO", "REACTIVE_BUTTON", "REACTIVE_COMPONENT", "RECOMMENDATIONS_ALLOCATION_ROW", "RECURRING_INSIGHTS_HEADER", "RECURRING_INSIGHTS_LAYOUT_CONTAINER", "RECURRING_INSIGHTS_VISUALIZATION", "RELATIVE_HEIGHT_CONTAINER", "REMOTE_IMAGE_ASPECT_FILL", "REMOTE_IMAGE_ASPECT_FIT", "REMOTE_IMAGE_ASPECT_RATIO", "REMOTE_LOTTIE", "RETIREMENT_CONTRIBUTION_ROW", "SCATTER_CHART", "SCATTER_CHART_LEGEND", "SELECT_ROW", "SETTINGS_ROW_CONDENSED", "SETTINGS_ROW_STACKED", "SHAREHOLDER_EVENT_NAVIGATION_ROW", "SPACER", "STOCK_LIST_ITEM", "TABLE_1D_CHANGE_ITEM", "TABLE_1M_CHANGE_ITEM", "TABLE_1W_CHANGE_ITEM", "TABLE_1Y_CHANGE_ITEM", "TABLE_3M_CHANGE_ITEM", "TABLE_COLUMN_HEADER", "TABLE_INSTRUMENT_NAME", "TABLE_SHARE_PRICE_ITEM", "TABLE_SPARKLINE_ITEM", "TEXT", "TEXT_AREA", "TEXT_BUTTON", "TEXT_INPUT", "TEXT_POG", "THEMED_COMPONENT", "TIMELINE", "TRADE_SHARING_TIMELINE", "UPSELL_NAVIGATION_ROW_WITH_INFO_TAG", "VALUE_PROP_WITH_ICON", "VALUE_PROP_WITH_NUMBER", "VALUE_PROP_WITH_PICTOGRAM", "VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT", "WEIGHTED_CONTAINER", "Z_STACK"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
