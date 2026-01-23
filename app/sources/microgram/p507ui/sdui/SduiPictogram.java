package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import com.robinhood.models.card.p311db.Card;
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
@Metadata(m3635d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0085\u0001\b\u0087\u0081\u0002\u0018\u0000 \u0087\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0087\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001¨\u0006\u0088\u0001"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPictogram;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCESSIBILITY", "AGENT", "BANK", "BAR_CHART", "BELL", "BILLS", "BINOCULARS", "BOOK", "BULLET", "CALENDAR", "CANCEL_CARD", "CASH", "CASH_ATM", "CASH_CALENDAR", "CASH_CONTACTLESS_PAYMENT", "CASH_DOCUMENTS", "CASH_FLOWER", "CASH_FREE", "CASH_MONEY", "CASH_PAYMENT_CARD", "CASH_SECURITY", "CASH_START", "CASH_THUMBS_UP", "CASH_UMBRELLA", "CASH_WARNING", "CHART", "CHAT", "CHATBOT", "CHECK", "CLIPBOARD", "CRYPTO", "CRYPTO_C", "CRYPTO_GIFT", "CRYPTO_ORDER_TYPES_BUY_IN_SHARES", "CRYPTO_ORDER_TYPES_BUY_LIMIT", "CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", "CRYPTO_ORDER_TYPES_BUY_MARKET", "CRYPTO_ORDER_TYPES_BUY_STOP", "CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", "CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", "CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", "CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", "CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", "CRYPTO_ORDER_TYPES_SELL_LIMIT", "CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", "CRYPTO_ORDER_TYPES_SELL_MARKET", "CRYPTO_ORDER_TYPES_SELL_STOP", "CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", "DEPOSIT", "DESKTOP", "DOCUMENTS", "DOLLAR_SIGN", "ENVELOPE", "ETF", "EYE_OPEN", "FACE", "FLAG", "FLOWER", "FREE", "GIFT", "GOLD_BAR_CHART", "GOLD_CALENDAR", "GOLD_DOCUMENTS", "GOLD_GIFT", "GOLD_MARGIN", "GOLD_MONEY", "GOLD_PIGGY_BANK", "GOLD_STOPWATCH", "HELP", "INVESTING", "JOINT_ACCOUNTS", "LIGHTBULB", "LIGHTNING", "LIST", "LIVE_CHAT", "LOCK", "MARGIN", "MEGAPHONE", "MONEY", "ORDER_TYPES_BUY_IN_SHARES", "ORDER_TYPES_BUY_LIMIT", "ORDER_TYPES_BUY_LIMIT_STOP", "ORDER_TYPES_BUY_MARKET", "ORDER_TYPES_BUY_STOP", "ORDER_TYPES_BUY_TRAILING_STOP", "ORDER_TYPES_BUY_WITH_DOLLARS", "ORDER_TYPES_BUY_WITH_EUROS", "ORDER_TYPES_RECURRING_INVESTMENT", "ORDER_TYPES_SELL_LIMIT", "ORDER_TYPES_SELL_LIMIT_STOP", "ORDER_TYPES_SELL_MARKET", "ORDER_TYPES_SELL_STOP", "ORDER_TYPES_SELL_TRAILING_STOP", "PAYMENT_CARD", "PAYROLL", "PERCENT_SIGN", "PERSON", "PHONE", "PIE_CHART", "PIGGY_BANK", "POUND_SIGN", "PRIME_CHART", "PRIME_DOLLAR_SIGN", "PRIME_FLAG", "PRIME_FLOWER", "PRIME_FORWARD_SPLIT", "PRIME_GIFT", "PRIME_MONEY", "PRIME_PIE_CHART", "PRIME_POUND_SIGN", "PRIME_RECURRING", "PRIME_RETIREMENT", "PRIME_REVERSE_SPLIT", "PRIME_ROBOT", "RECURRING", "RETIREMENT", TradingTrendsType.ROBINHOOD, "SMILEY", "SPARKLE", "START", "STOPWATCH", "SUBMARINE", "TRANSFER", "UMBRELLA", "UNKNOWN", "UNLOCK", "WARNING", "WITHDRAW", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiPictogram {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiPictogram[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("accessibility")
    public static final SduiPictogram ACCESSIBILITY = new SduiPictogram("ACCESSIBILITY", 0, "accessibility");

    @SerialName("agent")
    public static final SduiPictogram AGENT = new SduiPictogram("AGENT", 1, "agent");

    @SerialName("bank")
    public static final SduiPictogram BANK = new SduiPictogram("BANK", 2, "bank");

    @SerialName("bar_chart")
    public static final SduiPictogram BAR_CHART = new SduiPictogram("BAR_CHART", 3, "bar_chart");

    @SerialName(Card.Icon.BELL)
    public static final SduiPictogram BELL = new SduiPictogram("BELL", 4, Card.Icon.BELL);

    @SerialName("bills")
    public static final SduiPictogram BILLS = new SduiPictogram("BILLS", 5, "bills");

    @SerialName("binoculars")
    public static final SduiPictogram BINOCULARS = new SduiPictogram("BINOCULARS", 6, "binoculars");

    @SerialName("book")
    public static final SduiPictogram BOOK = new SduiPictogram("BOOK", 7, "book");

    @SerialName("bullet")
    public static final SduiPictogram BULLET = new SduiPictogram("BULLET", 8, "bullet");

    @SerialName("calendar")
    public static final SduiPictogram CALENDAR = new SduiPictogram("CALENDAR", 9, "calendar");

    @SerialName("cancel_card")
    public static final SduiPictogram CANCEL_CARD = new SduiPictogram("CANCEL_CARD", 10, "cancel_card");

    @SerialName(AnalyticsStrings.BUTTON_GROUP_TITLE_CASH)
    public static final SduiPictogram CASH = new SduiPictogram("CASH", 11, AnalyticsStrings.BUTTON_GROUP_TITLE_CASH);

    @SerialName("cash_atm")
    public static final SduiPictogram CASH_ATM = new SduiPictogram("CASH_ATM", 12, "cash_atm");

    @SerialName("cash_calendar")
    public static final SduiPictogram CASH_CALENDAR = new SduiPictogram("CASH_CALENDAR", 13, "cash_calendar");

    @SerialName("cash_contactless_payment")
    public static final SduiPictogram CASH_CONTACTLESS_PAYMENT = new SduiPictogram("CASH_CONTACTLESS_PAYMENT", 14, "cash_contactless_payment");

    @SerialName("cash_documents")
    public static final SduiPictogram CASH_DOCUMENTS = new SduiPictogram("CASH_DOCUMENTS", 15, "cash_documents");

    @SerialName("cash_flower")
    public static final SduiPictogram CASH_FLOWER = new SduiPictogram("CASH_FLOWER", 16, "cash_flower");

    @SerialName("cash_free")
    public static final SduiPictogram CASH_FREE = new SduiPictogram("CASH_FREE", 17, "cash_free");

    @SerialName("cash_money")
    public static final SduiPictogram CASH_MONEY = new SduiPictogram("CASH_MONEY", 18, "cash_money");

    @SerialName("cash_payment_card")
    public static final SduiPictogram CASH_PAYMENT_CARD = new SduiPictogram("CASH_PAYMENT_CARD", 19, "cash_payment_card");

    @SerialName("cash_security")
    public static final SduiPictogram CASH_SECURITY = new SduiPictogram("CASH_SECURITY", 20, "cash_security");

    @SerialName("cash_start")
    public static final SduiPictogram CASH_START = new SduiPictogram("CASH_START", 21, "cash_start");

    @SerialName("cash_thumbs_up")
    public static final SduiPictogram CASH_THUMBS_UP = new SduiPictogram("CASH_THUMBS_UP", 22, "cash_thumbs_up");

    @SerialName("cash_umbrella")
    public static final SduiPictogram CASH_UMBRELLA = new SduiPictogram("CASH_UMBRELLA", 23, "cash_umbrella");

    @SerialName("cash_warning")
    public static final SduiPictogram CASH_WARNING = new SduiPictogram("CASH_WARNING", 24, "cash_warning");

    @SerialName("chart")
    public static final SduiPictogram CHART = new SduiPictogram("CHART", 25, "chart");

    @SerialName("chat")
    public static final SduiPictogram CHAT = new SduiPictogram("CHAT", 26, "chat");

    @SerialName("chatbot")
    public static final SduiPictogram CHATBOT = new SduiPictogram("CHATBOT", 27, "chatbot");

    @SerialName("check")
    public static final SduiPictogram CHECK = new SduiPictogram("CHECK", 28, "check");

    @SerialName("clipboard")
    public static final SduiPictogram CLIPBOARD = new SduiPictogram("CLIPBOARD", 29, "clipboard");

    @SerialName(AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO)
    public static final SduiPictogram CRYPTO = new SduiPictogram("CRYPTO", 30, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO);

    @SerialName("crypto_c")
    public static final SduiPictogram CRYPTO_C = new SduiPictogram("CRYPTO_C", 31, "crypto_c");

    @SerialName("crypto_gift")
    public static final SduiPictogram CRYPTO_GIFT = new SduiPictogram("CRYPTO_GIFT", 32, "crypto_gift");

    @SerialName("crypto_order_types_buy_in_shares")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_IN_SHARES = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_IN_SHARES", 33, "crypto_order_types_buy_in_shares");

    @SerialName("crypto_order_types_buy_limit")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_LIMIT = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_LIMIT", 34, "crypto_order_types_buy_limit");

    @SerialName("crypto_order_types_buy_limit_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", 35, "crypto_order_types_buy_limit_stop");

    @SerialName("crypto_order_types_buy_market")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_MARKET = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_MARKET", 36, "crypto_order_types_buy_market");

    @SerialName("crypto_order_types_buy_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_STOP", 37, "crypto_order_types_buy_stop");

    @SerialName("crypto_order_types_buy_trailing_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", 38, "crypto_order_types_buy_trailing_stop");

    @SerialName("crypto_order_types_buy_with_crypto")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", 39, "crypto_order_types_buy_with_crypto");

    @SerialName("crypto_order_types_buy_with_dollars")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", 40, "crypto_order_types_buy_with_dollars");

    @SerialName("crypto_order_types_buy_with_euros")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_BUY_WITH_EUROS = new SduiPictogram("CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", 41, "crypto_order_types_buy_with_euros");

    @SerialName("crypto_order_types_recurring_investment")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT = new SduiPictogram("CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", 42, "crypto_order_types_recurring_investment");

    @SerialName("crypto_order_types_sell_limit")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_SELL_LIMIT = new SduiPictogram("CRYPTO_ORDER_TYPES_SELL_LIMIT", 43, "crypto_order_types_sell_limit");

    @SerialName("crypto_order_types_sell_limit_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", 44, "crypto_order_types_sell_limit_stop");

    @SerialName("crypto_order_types_sell_market")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_SELL_MARKET = new SduiPictogram("CRYPTO_ORDER_TYPES_SELL_MARKET", 45, "crypto_order_types_sell_market");

    @SerialName("crypto_order_types_sell_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_SELL_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_SELL_STOP", 46, "crypto_order_types_sell_stop");

    @SerialName("crypto_order_types_sell_trailing_stop")
    public static final SduiPictogram CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP = new SduiPictogram("CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", 47, "crypto_order_types_sell_trailing_stop");

    @SerialName(CryptoCostBasisDetailsListDuxo.SOURCE_TYPE)
    public static final SduiPictogram DEPOSIT = new SduiPictogram("DEPOSIT", 48, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE);

    @SerialName("desktop")
    public static final SduiPictogram DESKTOP = new SduiPictogram("DESKTOP", 49, "desktop");

    @SerialName("documents")
    public static final SduiPictogram DOCUMENTS = new SduiPictogram("DOCUMENTS", 50, "documents");

    @SerialName("dollar_sign")
    public static final SduiPictogram DOLLAR_SIGN = new SduiPictogram("DOLLAR_SIGN", 51, "dollar_sign");

    @SerialName("envelope")
    public static final SduiPictogram ENVELOPE = new SduiPictogram("ENVELOPE", 52, "envelope");

    @SerialName("etf")
    public static final SduiPictogram ETF = new SduiPictogram("ETF", 53, "etf");

    @SerialName("eye_open")
    public static final SduiPictogram EYE_OPEN = new SduiPictogram("EYE_OPEN", 54, "eye_open");

    @SerialName("face")
    public static final SduiPictogram FACE = new SduiPictogram("FACE", 55, "face");

    @SerialName("flag")
    public static final SduiPictogram FLAG = new SduiPictogram("FLAG", 56, "flag");

    @SerialName("flower")
    public static final SduiPictogram FLOWER = new SduiPictogram("FLOWER", 57, "flower");

    @SerialName("free")
    public static final SduiPictogram FREE = new SduiPictogram("FREE", 58, "free");

    @SerialName("gift")
    public static final SduiPictogram GIFT = new SduiPictogram("GIFT", 59, "gift");

    @SerialName("gold_bar_chart")
    public static final SduiPictogram GOLD_BAR_CHART = new SduiPictogram("GOLD_BAR_CHART", 60, "gold_bar_chart");

    @SerialName("gold_calendar")
    public static final SduiPictogram GOLD_CALENDAR = new SduiPictogram("GOLD_CALENDAR", 61, "gold_calendar");

    @SerialName("gold_documents")
    public static final SduiPictogram GOLD_DOCUMENTS = new SduiPictogram("GOLD_DOCUMENTS", 62, "gold_documents");

    @SerialName("gold_gift")
    public static final SduiPictogram GOLD_GIFT = new SduiPictogram("GOLD_GIFT", 63, "gold_gift");

    @SerialName("gold_margin")
    public static final SduiPictogram GOLD_MARGIN = new SduiPictogram("GOLD_MARGIN", 64, "gold_margin");

    @SerialName("gold_money")
    public static final SduiPictogram GOLD_MONEY = new SduiPictogram("GOLD_MONEY", 65, "gold_money");

    @SerialName("gold_piggy_bank")
    public static final SduiPictogram GOLD_PIGGY_BANK = new SduiPictogram("GOLD_PIGGY_BANK", 66, "gold_piggy_bank");

    @SerialName("gold_stopwatch")
    public static final SduiPictogram GOLD_STOPWATCH = new SduiPictogram("GOLD_STOPWATCH", 67, "gold_stopwatch");

    @SerialName("help")
    public static final SduiPictogram HELP = new SduiPictogram("HELP", 68, "help");

    @SerialName("investing")
    public static final SduiPictogram INVESTING = new SduiPictogram("INVESTING", 69, "investing");

    @SerialName("joint_accounts")
    public static final SduiPictogram JOINT_ACCOUNTS = new SduiPictogram("JOINT_ACCOUNTS", 70, "joint_accounts");

    @SerialName(Card.Icon.LIGHTBULB)
    public static final SduiPictogram LIGHTBULB = new SduiPictogram("LIGHTBULB", 71, Card.Icon.LIGHTBULB);

    @SerialName("lightning")
    public static final SduiPictogram LIGHTNING = new SduiPictogram("LIGHTNING", 72, "lightning");

    @SerialName("list")
    public static final SduiPictogram LIST = new SduiPictogram("LIST", 73, "list");

    @SerialName("live_chat")
    public static final SduiPictogram LIVE_CHAT = new SduiPictogram("LIVE_CHAT", 74, "live_chat");

    @SerialName("lock")
    public static final SduiPictogram LOCK = new SduiPictogram("LOCK", 75, "lock");

    @SerialName(GoldFeature.MARGIN)
    public static final SduiPictogram MARGIN = new SduiPictogram("MARGIN", 76, GoldFeature.MARGIN);

    @SerialName("megaphone")
    public static final SduiPictogram MEGAPHONE = new SduiPictogram("MEGAPHONE", 77, "megaphone");

    @SerialName("money")
    public static final SduiPictogram MONEY = new SduiPictogram("MONEY", 78, "money");

    @SerialName("order_types_buy_in_shares")
    public static final SduiPictogram ORDER_TYPES_BUY_IN_SHARES = new SduiPictogram("ORDER_TYPES_BUY_IN_SHARES", 79, "order_types_buy_in_shares");

    @SerialName("order_types_buy_limit")
    public static final SduiPictogram ORDER_TYPES_BUY_LIMIT = new SduiPictogram("ORDER_TYPES_BUY_LIMIT", 80, "order_types_buy_limit");

    @SerialName("order_types_buy_limit_stop")
    public static final SduiPictogram ORDER_TYPES_BUY_LIMIT_STOP = new SduiPictogram("ORDER_TYPES_BUY_LIMIT_STOP", 81, "order_types_buy_limit_stop");

    @SerialName("order_types_buy_market")
    public static final SduiPictogram ORDER_TYPES_BUY_MARKET = new SduiPictogram("ORDER_TYPES_BUY_MARKET", 82, "order_types_buy_market");

    @SerialName("order_types_buy_stop")
    public static final SduiPictogram ORDER_TYPES_BUY_STOP = new SduiPictogram("ORDER_TYPES_BUY_STOP", 83, "order_types_buy_stop");

    @SerialName("order_types_buy_trailing_stop")
    public static final SduiPictogram ORDER_TYPES_BUY_TRAILING_STOP = new SduiPictogram("ORDER_TYPES_BUY_TRAILING_STOP", 84, "order_types_buy_trailing_stop");

    @SerialName("order_types_buy_with_dollars")
    public static final SduiPictogram ORDER_TYPES_BUY_WITH_DOLLARS = new SduiPictogram("ORDER_TYPES_BUY_WITH_DOLLARS", 85, "order_types_buy_with_dollars");

    @SerialName("order_types_buy_with_euros")
    public static final SduiPictogram ORDER_TYPES_BUY_WITH_EUROS = new SduiPictogram("ORDER_TYPES_BUY_WITH_EUROS", 86, "order_types_buy_with_euros");

    @SerialName("order_types_recurring_investment")
    public static final SduiPictogram ORDER_TYPES_RECURRING_INVESTMENT = new SduiPictogram("ORDER_TYPES_RECURRING_INVESTMENT", 87, "order_types_recurring_investment");

    @SerialName("order_types_sell_limit")
    public static final SduiPictogram ORDER_TYPES_SELL_LIMIT = new SduiPictogram("ORDER_TYPES_SELL_LIMIT", 88, "order_types_sell_limit");

    @SerialName("order_types_sell_limit_stop")
    public static final SduiPictogram ORDER_TYPES_SELL_LIMIT_STOP = new SduiPictogram("ORDER_TYPES_SELL_LIMIT_STOP", 89, "order_types_sell_limit_stop");

    @SerialName("order_types_sell_market")
    public static final SduiPictogram ORDER_TYPES_SELL_MARKET = new SduiPictogram("ORDER_TYPES_SELL_MARKET", 90, "order_types_sell_market");

    @SerialName("order_types_sell_stop")
    public static final SduiPictogram ORDER_TYPES_SELL_STOP = new SduiPictogram("ORDER_TYPES_SELL_STOP", 91, "order_types_sell_stop");

    @SerialName("order_types_sell_trailing_stop")
    public static final SduiPictogram ORDER_TYPES_SELL_TRAILING_STOP = new SduiPictogram("ORDER_TYPES_SELL_TRAILING_STOP", 92, "order_types_sell_trailing_stop");

    @SerialName("payment_card")
    public static final SduiPictogram PAYMENT_CARD = new SduiPictogram("PAYMENT_CARD", 93, "payment_card");

    @SerialName("payroll")
    public static final SduiPictogram PAYROLL = new SduiPictogram("PAYROLL", 94, "payroll");

    @SerialName("percent_sign")
    public static final SduiPictogram PERCENT_SIGN = new SduiPictogram("PERCENT_SIGN", 95, "percent_sign");

    @SerialName("person")
    public static final SduiPictogram PERSON = new SduiPictogram("PERSON", 96, "person");

    @SerialName("phone")
    public static final SduiPictogram PHONE = new SduiPictogram("PHONE", 97, "phone");

    @SerialName("pie_chart")
    public static final SduiPictogram PIE_CHART = new SduiPictogram("PIE_CHART", 98, "pie_chart");

    @SerialName("piggy_bank")
    public static final SduiPictogram PIGGY_BANK = new SduiPictogram("PIGGY_BANK", 99, "piggy_bank");

    @SerialName("pound_sign")
    public static final SduiPictogram POUND_SIGN = new SduiPictogram("POUND_SIGN", 100, "pound_sign");

    @SerialName("prime_chart")
    public static final SduiPictogram PRIME_CHART = new SduiPictogram("PRIME_CHART", 101, "prime_chart");

    @SerialName("prime_dollar_sign")
    public static final SduiPictogram PRIME_DOLLAR_SIGN = new SduiPictogram("PRIME_DOLLAR_SIGN", 102, "prime_dollar_sign");

    @SerialName("prime_flag")
    public static final SduiPictogram PRIME_FLAG = new SduiPictogram("PRIME_FLAG", 103, "prime_flag");

    @SerialName("prime_flower")
    public static final SduiPictogram PRIME_FLOWER = new SduiPictogram("PRIME_FLOWER", 104, "prime_flower");

    @SerialName("prime_forward_split")
    public static final SduiPictogram PRIME_FORWARD_SPLIT = new SduiPictogram("PRIME_FORWARD_SPLIT", 105, "prime_forward_split");

    @SerialName("prime_gift")
    public static final SduiPictogram PRIME_GIFT = new SduiPictogram("PRIME_GIFT", 106, "prime_gift");

    @SerialName("prime_money")
    public static final SduiPictogram PRIME_MONEY = new SduiPictogram("PRIME_MONEY", 107, "prime_money");

    @SerialName("prime_pie_chart")
    public static final SduiPictogram PRIME_PIE_CHART = new SduiPictogram("PRIME_PIE_CHART", 108, "prime_pie_chart");

    @SerialName("prime_pound_sign")
    public static final SduiPictogram PRIME_POUND_SIGN = new SduiPictogram("PRIME_POUND_SIGN", 109, "prime_pound_sign");

    @SerialName("prime_recurring")
    public static final SduiPictogram PRIME_RECURRING = new SduiPictogram("PRIME_RECURRING", 110, "prime_recurring");

    @SerialName("prime_retirement")
    public static final SduiPictogram PRIME_RETIREMENT = new SduiPictogram("PRIME_RETIREMENT", 111, "prime_retirement");

    @SerialName("prime_reverse_split")
    public static final SduiPictogram PRIME_REVERSE_SPLIT = new SduiPictogram("PRIME_REVERSE_SPLIT", 112, "prime_reverse_split");

    @SerialName("prime_robot")
    public static final SduiPictogram PRIME_ROBOT = new SduiPictogram("PRIME_ROBOT", 113, "prime_robot");

    @SerialName("recurring")
    public static final SduiPictogram RECURRING = new SduiPictogram("RECURRING", 114, "recurring");

    @SerialName("retirement")
    public static final SduiPictogram RETIREMENT = new SduiPictogram("RETIREMENT", 115, "retirement");

    @SerialName("robinhood")
    public static final SduiPictogram ROBINHOOD = new SduiPictogram(TradingTrendsType.ROBINHOOD, 116, "robinhood");

    @SerialName("smiley")
    public static final SduiPictogram SMILEY = new SduiPictogram("SMILEY", 117, "smiley");

    @SerialName("sparkle")
    public static final SduiPictogram SPARKLE = new SduiPictogram("SPARKLE", 118, "sparkle");

    @SerialName("start")
    public static final SduiPictogram START = new SduiPictogram("START", 119, "start");

    @SerialName("stopwatch")
    public static final SduiPictogram STOPWATCH = new SduiPictogram("STOPWATCH", 120, "stopwatch");

    @SerialName("submarine")
    public static final SduiPictogram SUBMARINE = new SduiPictogram("SUBMARINE", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, "submarine");

    @SerialName("transfer")
    public static final SduiPictogram TRANSFER = new SduiPictogram("TRANSFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "transfer");

    @SerialName("umbrella")
    public static final SduiPictogram UMBRELLA = new SduiPictogram("UMBRELLA", 123, "umbrella");

    @SerialName("unknown")
    public static final SduiPictogram UNKNOWN = new SduiPictogram("UNKNOWN", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, "unknown");

    @SerialName("unlock")
    public static final SduiPictogram UNLOCK = new SduiPictogram("UNLOCK", 125, "unlock");

    @SerialName("warning")
    public static final SduiPictogram WARNING = new SduiPictogram("WARNING", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "warning");

    @SerialName("withdraw")
    public static final SduiPictogram WITHDRAW = new SduiPictogram("WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, "withdraw");

    private static final /* synthetic */ SduiPictogram[] $values() {
        return new SduiPictogram[]{ACCESSIBILITY, AGENT, BANK, BAR_CHART, BELL, BILLS, BINOCULARS, BOOK, BULLET, CALENDAR, CANCEL_CARD, CASH, CASH_ATM, CASH_CALENDAR, CASH_CONTACTLESS_PAYMENT, CASH_DOCUMENTS, CASH_FLOWER, CASH_FREE, CASH_MONEY, CASH_PAYMENT_CARD, CASH_SECURITY, CASH_START, CASH_THUMBS_UP, CASH_UMBRELLA, CASH_WARNING, CHART, CHAT, CHATBOT, CHECK, CLIPBOARD, CRYPTO, CRYPTO_C, CRYPTO_GIFT, CRYPTO_ORDER_TYPES_BUY_IN_SHARES, CRYPTO_ORDER_TYPES_BUY_LIMIT, CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP, CRYPTO_ORDER_TYPES_BUY_MARKET, CRYPTO_ORDER_TYPES_BUY_STOP, CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP, CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO, CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS, CRYPTO_ORDER_TYPES_BUY_WITH_EUROS, CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT, CRYPTO_ORDER_TYPES_SELL_LIMIT, CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP, CRYPTO_ORDER_TYPES_SELL_MARKET, CRYPTO_ORDER_TYPES_SELL_STOP, CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP, DEPOSIT, DESKTOP, DOCUMENTS, DOLLAR_SIGN, ENVELOPE, ETF, EYE_OPEN, FACE, FLAG, FLOWER, FREE, GIFT, GOLD_BAR_CHART, GOLD_CALENDAR, GOLD_DOCUMENTS, GOLD_GIFT, GOLD_MARGIN, GOLD_MONEY, GOLD_PIGGY_BANK, GOLD_STOPWATCH, HELP, INVESTING, JOINT_ACCOUNTS, LIGHTBULB, LIGHTNING, LIST, LIVE_CHAT, LOCK, MARGIN, MEGAPHONE, MONEY, ORDER_TYPES_BUY_IN_SHARES, ORDER_TYPES_BUY_LIMIT, ORDER_TYPES_BUY_LIMIT_STOP, ORDER_TYPES_BUY_MARKET, ORDER_TYPES_BUY_STOP, ORDER_TYPES_BUY_TRAILING_STOP, ORDER_TYPES_BUY_WITH_DOLLARS, ORDER_TYPES_BUY_WITH_EUROS, ORDER_TYPES_RECURRING_INVESTMENT, ORDER_TYPES_SELL_LIMIT, ORDER_TYPES_SELL_LIMIT_STOP, ORDER_TYPES_SELL_MARKET, ORDER_TYPES_SELL_STOP, ORDER_TYPES_SELL_TRAILING_STOP, PAYMENT_CARD, PAYROLL, PERCENT_SIGN, PERSON, PHONE, PIE_CHART, PIGGY_BANK, POUND_SIGN, PRIME_CHART, PRIME_DOLLAR_SIGN, PRIME_FLAG, PRIME_FLOWER, PRIME_FORWARD_SPLIT, PRIME_GIFT, PRIME_MONEY, PRIME_PIE_CHART, PRIME_POUND_SIGN, PRIME_RECURRING, PRIME_RETIREMENT, PRIME_REVERSE_SPLIT, PRIME_ROBOT, RECURRING, RETIREMENT, ROBINHOOD, SMILEY, SPARKLE, START, STOPWATCH, SUBMARINE, TRANSFER, UMBRELLA, UNKNOWN, UNLOCK, WARNING, WITHDRAW};
    }

    public static EnumEntries<SduiPictogram> getEntries() {
        return $ENTRIES;
    }

    public static SduiPictogram valueOf(String str) {
        return (SduiPictogram) Enum.valueOf(SduiPictogram.class, str);
    }

    public static SduiPictogram[] values() {
        return (SduiPictogram[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPictogram$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiPictogram;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiPictogram.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiPictogram> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiPictogram(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiPictogram[] sduiPictogramArr$values = $values();
        $VALUES = sduiPictogramArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiPictogramArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiPictogram.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiPictogram", SduiPictogram.values(), new String[]{"accessibility", "agent", "bank", "bar_chart", Card.Icon.BELL, "bills", "binoculars", "book", "bullet", "calendar", "cancel_card", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "cash_atm", "cash_calendar", "cash_contactless_payment", "cash_documents", "cash_flower", "cash_free", "cash_money", "cash_payment_card", "cash_security", "cash_start", "cash_thumbs_up", "cash_umbrella", "cash_warning", "chart", "chat", "chatbot", "check", "clipboard", AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO, "crypto_c", "crypto_gift", "crypto_order_types_buy_in_shares", "crypto_order_types_buy_limit", "crypto_order_types_buy_limit_stop", "crypto_order_types_buy_market", "crypto_order_types_buy_stop", "crypto_order_types_buy_trailing_stop", "crypto_order_types_buy_with_crypto", "crypto_order_types_buy_with_dollars", "crypto_order_types_buy_with_euros", "crypto_order_types_recurring_investment", "crypto_order_types_sell_limit", "crypto_order_types_sell_limit_stop", "crypto_order_types_sell_market", "crypto_order_types_sell_stop", "crypto_order_types_sell_trailing_stop", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "desktop", "documents", "dollar_sign", "envelope", "etf", "eye_open", "face", "flag", "flower", "free", "gift", "gold_bar_chart", "gold_calendar", "gold_documents", "gold_gift", "gold_margin", "gold_money", "gold_piggy_bank", "gold_stopwatch", "help", "investing", "joint_accounts", Card.Icon.LIGHTBULB, "lightning", "list", "live_chat", "lock", GoldFeature.MARGIN, "megaphone", "money", "order_types_buy_in_shares", "order_types_buy_limit", "order_types_buy_limit_stop", "order_types_buy_market", "order_types_buy_stop", "order_types_buy_trailing_stop", "order_types_buy_with_dollars", "order_types_buy_with_euros", "order_types_recurring_investment", "order_types_sell_limit", "order_types_sell_limit_stop", "order_types_sell_market", "order_types_sell_stop", "order_types_sell_trailing_stop", "payment_card", "payroll", "percent_sign", "person", "phone", "pie_chart", "piggy_bank", "pound_sign", "prime_chart", "prime_dollar_sign", "prime_flag", "prime_flower", "prime_forward_split", "prime_gift", "prime_money", "prime_pie_chart", "prime_pound_sign", "prime_recurring", "prime_retirement", "prime_reverse_split", "prime_robot", "recurring", "retirement", "robinhood", "smiley", "sparkle", "start", "stopwatch", "submarine", "transfer", "umbrella", "unknown", "unlock", "warning", "withdraw"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
