package com.robinhood.android.libdesignsystem.serverui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.enums.RhEnum;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerToBentoAssetMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0088\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u0090\u00012\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0090\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u008c\u0001\u001a\u00030\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001¨\u0006\u0091\u0001"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "Lcom/robinhood/enums/RhEnum;", "", "resourceId", "", "<init>", "(Ljava/lang/String;II)V", "getResourceId", "()I", "UNKNOWN", "CASH_ATM", "CASH_CALENDAR", "CASH_CONTACTLESS_PAYMENT", "CASH_DOCUMENTS", "CASH_FLOWER", "CASH_FREE", "CASH_MONEY", "CASH_PAYMENT_CARD", "CASH_SECURITY", "CASH_START", "CASH_THUMBS_UP", "CASH_UMBRELLA", "CASH_WARNING", "CRYPTO_GIFT", "CRYPTO_ORDER_TYPES_BUY_IN_SHARES", "CRYPTO_ORDER_TYPES_BUY_LIMIT", "CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", "CRYPTO_ORDER_TYPES_BUY_MARKET", "CRYPTO_ORDER_TYPES_BUY_STOP", "CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", "CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", "CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", "CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", "CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", "CRYPTO_ORDER_TYPES_SELL_LIMIT", "CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", "CRYPTO_ORDER_TYPES_SELL_MARKET", "CRYPTO_ORDER_TYPES_SELL_STOP", "CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", "GOLD_BAR_CHART", "GOLD_CALENDAR", "GOLD_DOCUMENTS", "GOLD_GIFT", "GOLD_MARGIN", "GOLD_MONEY", "GOLD_PIGGY_BANK", "GOLD_STOPWATCH", "ORDER_TYPES_BUY_IN_SHARES", "ORDER_TYPES_BUY_LIMIT", "ORDER_TYPES_BUY_LIMIT_STOP", "ORDER_TYPES_BUY_MARKET", "ORDER_TYPES_BUY_STOP", "ORDER_TYPES_BUY_TRAILING_STOP", "ORDER_TYPES_BUY_WITH_DOLLARS", "ORDER_TYPES_BUY_WITH_EUROS", "ORDER_TYPES_RECURRING_INVESTMENT", "ORDER_TYPES_SELL_LIMIT", "ORDER_TYPES_SELL_LIMIT_STOP", "ORDER_TYPES_SELL_MARKET", "ORDER_TYPES_SELL_STOP", "ORDER_TYPES_SELL_TRAILING_STOP", "PRIME_CHART", "PRIME_DOLLAR_SIGN", "PRIME_FLAG", "PRIME_FLOWER", "PRIME_FORWARD_SPLIT", "PRIME_GIFT", "PRIME_MONEY", "PRIME_PIE_CHART", "PRIME_POUND_SIGN", "PRIME_RECURRING", "PRIME_RETIREMENT", "PRIME_REVERSE_SPLIT", "PRIME_ROBOT", "ACCESSIBILITY", "AGENT", "BANK", "BAR_CHART", "BELL", "BILLS", "BINOCULARS", "BOOK", "BULLET", "CALENDAR", "CANCEL_CARD", "CASH", "CHART", "CHAT", "CHATBOT", "CHECK", "CLIPBOARD", "CORTEX", "CRYPTO", "CRYPTO_C", "DEPOSIT", "DESKTOP", "DOCUMENTS", "DOLLAR_SIGN", "ENVELOPE", "ETF", "EYE_OPEN", "FACE", "FLAG", "FLOWER", "FREE", "GIFT", "HELP", "INVESTING", "JOINT_ACCOUNTS", "LIGHTBULB", "LIGHTNING", "LIST", "LIVE_CHAT", "LOCK", "MANAGED_ACCOUNTS", "MARGIN", "MEGAPHONE", "MONEY", "PAYMENT_CARD", "PAYROLL", "PERCENT_SIGN", "PERSON", "PHONE", "PIE_CHART", "PIGGY_BANK", "POUND_SIGN", "RECURRING", "RETIREMENT", TradingTrendsType.ROBINHOOD, "SMILEY", "SPARKLE", "START", "STOPWATCH", "SUBMARINE", "TAX_LOTS", "TRANSFER", "UMBRELLA", "UNLOCK", "WARNING", "WITHDRAW", "serverValue", "", "getServerValue", "()Ljava/lang/String;", "Companion", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.PictogramAsset, reason: use source file name */
/* loaded from: classes8.dex */
public final class ServerToBentoAssetMapper3 implements RhEnum<ServerToBentoAssetMapper3> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ServerToBentoAssetMapper3[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int resourceId;
    public static final ServerToBentoAssetMapper3 UNKNOWN = new ServerToBentoAssetMapper3("UNKNOWN", 0, C20690R.drawable.empty);
    public static final ServerToBentoAssetMapper3 CASH_ATM = new ServerToBentoAssetMapper3("CASH_ATM", 1, C20690R.drawable.pict_clr_rds_cash_atm);
    public static final ServerToBentoAssetMapper3 CASH_CALENDAR = new ServerToBentoAssetMapper3("CASH_CALENDAR", 2, C20690R.drawable.pict_clr_rds_cash_calendar);
    public static final ServerToBentoAssetMapper3 CASH_CONTACTLESS_PAYMENT = new ServerToBentoAssetMapper3("CASH_CONTACTLESS_PAYMENT", 3, C20690R.drawable.pict_clr_rds_cash_contactless_payment);
    public static final ServerToBentoAssetMapper3 CASH_DOCUMENTS = new ServerToBentoAssetMapper3("CASH_DOCUMENTS", 4, C20690R.drawable.pict_clr_rds_cash_documents);
    public static final ServerToBentoAssetMapper3 CASH_FLOWER = new ServerToBentoAssetMapper3("CASH_FLOWER", 5, C20690R.drawable.pict_clr_rds_cash_flower);
    public static final ServerToBentoAssetMapper3 CASH_FREE = new ServerToBentoAssetMapper3("CASH_FREE", 6, C20690R.drawable.pict_clr_rds_cash_free);
    public static final ServerToBentoAssetMapper3 CASH_MONEY = new ServerToBentoAssetMapper3("CASH_MONEY", 7, C20690R.drawable.pict_clr_rds_cash_money);
    public static final ServerToBentoAssetMapper3 CASH_PAYMENT_CARD = new ServerToBentoAssetMapper3("CASH_PAYMENT_CARD", 8, C20690R.drawable.pict_clr_rds_cash_payment_card);
    public static final ServerToBentoAssetMapper3 CASH_SECURITY = new ServerToBentoAssetMapper3("CASH_SECURITY", 9, C20690R.drawable.pict_clr_rds_cash_security);
    public static final ServerToBentoAssetMapper3 CASH_START = new ServerToBentoAssetMapper3("CASH_START", 10, C20690R.drawable.pict_clr_rds_cash_start);
    public static final ServerToBentoAssetMapper3 CASH_THUMBS_UP = new ServerToBentoAssetMapper3("CASH_THUMBS_UP", 11, C20690R.drawable.pict_clr_rds_cash_thumbs_up);
    public static final ServerToBentoAssetMapper3 CASH_UMBRELLA = new ServerToBentoAssetMapper3("CASH_UMBRELLA", 12, C20690R.drawable.pict_clr_rds_cash_umbrella);
    public static final ServerToBentoAssetMapper3 CASH_WARNING = new ServerToBentoAssetMapper3("CASH_WARNING", 13, C20690R.drawable.pict_clr_rds_cash_warning);
    public static final ServerToBentoAssetMapper3 CRYPTO_GIFT = new ServerToBentoAssetMapper3("CRYPTO_GIFT", 14, C20690R.drawable.pict_clr_rds_crypto_gift);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_IN_SHARES = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_IN_SHARES", 15, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_in_shares);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_LIMIT = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_LIMIT", 16, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_limit);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", 17, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_limit_stop);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_MARKET = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_MARKET", 18, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_market);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_STOP", 19, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_stop);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", 20, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_trailing_stop);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", 21, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_with_crypto);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", 22, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_with_dollars);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_BUY_WITH_EUROS = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", 23, C20690R.drawable.pict_clr_rds_crypto_order_types_buy_with_euros);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", 24, C20690R.drawable.pict_clr_rds_crypto_order_types_recurring_investment);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_SELL_LIMIT = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_SELL_LIMIT", 25, C20690R.drawable.pict_clr_rds_crypto_order_types_sell_limit);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", 26, C20690R.drawable.pict_clr_rds_crypto_order_types_sell_limit_stop);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_SELL_MARKET = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_SELL_MARKET", 27, C20690R.drawable.pict_clr_rds_crypto_order_types_sell_market);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_SELL_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_SELL_STOP", 28, C20690R.drawable.pict_clr_rds_crypto_order_types_sell_stop);
    public static final ServerToBentoAssetMapper3 CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP = new ServerToBentoAssetMapper3("CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", 29, C20690R.drawable.pict_clr_rds_crypto_order_types_sell_trailing_stop);
    public static final ServerToBentoAssetMapper3 GOLD_BAR_CHART = new ServerToBentoAssetMapper3("GOLD_BAR_CHART", 30, C20690R.drawable.pict_clr_rds_gold_bar_chart);
    public static final ServerToBentoAssetMapper3 GOLD_CALENDAR = new ServerToBentoAssetMapper3("GOLD_CALENDAR", 31, C20690R.drawable.pict_clr_rds_gold_calendar);
    public static final ServerToBentoAssetMapper3 GOLD_DOCUMENTS = new ServerToBentoAssetMapper3("GOLD_DOCUMENTS", 32, C20690R.drawable.pict_clr_rds_gold_documents);
    public static final ServerToBentoAssetMapper3 GOLD_GIFT = new ServerToBentoAssetMapper3("GOLD_GIFT", 33, C20690R.drawable.pict_clr_rds_gold_gift);
    public static final ServerToBentoAssetMapper3 GOLD_MARGIN = new ServerToBentoAssetMapper3("GOLD_MARGIN", 34, C20690R.drawable.pict_clr_rds_gold_margin);
    public static final ServerToBentoAssetMapper3 GOLD_MONEY = new ServerToBentoAssetMapper3("GOLD_MONEY", 35, C20690R.drawable.pict_clr_rds_gold_money);
    public static final ServerToBentoAssetMapper3 GOLD_PIGGY_BANK = new ServerToBentoAssetMapper3("GOLD_PIGGY_BANK", 36, C20690R.drawable.pict_clr_rds_gold_piggy_bank);
    public static final ServerToBentoAssetMapper3 GOLD_STOPWATCH = new ServerToBentoAssetMapper3("GOLD_STOPWATCH", 37, C20690R.drawable.pict_clr_rds_gold_stopwatch);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_IN_SHARES = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_IN_SHARES", 38, C20690R.drawable.pict_clr_rds_order_types_buy_in_shares);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_LIMIT = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_LIMIT", 39, C20690R.drawable.pict_clr_rds_order_types_buy_limit);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_LIMIT_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_LIMIT_STOP", 40, C20690R.drawable.pict_clr_rds_order_types_buy_limit_stop);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_MARKET = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_MARKET", 41, C20690R.drawable.pict_clr_rds_order_types_buy_market);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_STOP", 42, C20690R.drawable.pict_clr_rds_order_types_buy_stop);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_TRAILING_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_TRAILING_STOP", 43, C20690R.drawable.pict_clr_rds_order_types_buy_trailing_stop);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_WITH_DOLLARS = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_WITH_DOLLARS", 44, C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_BUY_WITH_EUROS = new ServerToBentoAssetMapper3("ORDER_TYPES_BUY_WITH_EUROS", 45, C20690R.drawable.pict_clr_rds_order_types_buy_with_euros);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_RECURRING_INVESTMENT = new ServerToBentoAssetMapper3("ORDER_TYPES_RECURRING_INVESTMENT", 46, C20690R.drawable.pict_clr_rds_order_types_recurring_investment);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_SELL_LIMIT = new ServerToBentoAssetMapper3("ORDER_TYPES_SELL_LIMIT", 47, C20690R.drawable.pict_clr_rds_order_types_sell_limit);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_SELL_LIMIT_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_SELL_LIMIT_STOP", 48, C20690R.drawable.pict_clr_rds_order_types_sell_limit_stop);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_SELL_MARKET = new ServerToBentoAssetMapper3("ORDER_TYPES_SELL_MARKET", 49, C20690R.drawable.pict_clr_rds_order_types_sell_market);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_SELL_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_SELL_STOP", 50, C20690R.drawable.pict_clr_rds_order_types_sell_stop);
    public static final ServerToBentoAssetMapper3 ORDER_TYPES_SELL_TRAILING_STOP = new ServerToBentoAssetMapper3("ORDER_TYPES_SELL_TRAILING_STOP", 51, C20690R.drawable.pict_clr_rds_order_types_sell_trailing_stop);
    public static final ServerToBentoAssetMapper3 PRIME_CHART = new ServerToBentoAssetMapper3("PRIME_CHART", 52, C20690R.drawable.pict_clr_rds_prime_chart);
    public static final ServerToBentoAssetMapper3 PRIME_DOLLAR_SIGN = new ServerToBentoAssetMapper3("PRIME_DOLLAR_SIGN", 53, C20690R.drawable.pict_clr_rds_prime_dollar_sign);
    public static final ServerToBentoAssetMapper3 PRIME_FLAG = new ServerToBentoAssetMapper3("PRIME_FLAG", 54, C20690R.drawable.pict_clr_rds_prime_flag);
    public static final ServerToBentoAssetMapper3 PRIME_FLOWER = new ServerToBentoAssetMapper3("PRIME_FLOWER", 55, C20690R.drawable.pict_clr_rds_prime_flower);
    public static final ServerToBentoAssetMapper3 PRIME_FORWARD_SPLIT = new ServerToBentoAssetMapper3("PRIME_FORWARD_SPLIT", 56, C20690R.drawable.pict_clr_rds_prime_forward_split);
    public static final ServerToBentoAssetMapper3 PRIME_GIFT = new ServerToBentoAssetMapper3("PRIME_GIFT", 57, C20690R.drawable.pict_clr_rds_prime_gift);
    public static final ServerToBentoAssetMapper3 PRIME_MONEY = new ServerToBentoAssetMapper3("PRIME_MONEY", 58, C20690R.drawable.pict_clr_rds_prime_money);
    public static final ServerToBentoAssetMapper3 PRIME_PIE_CHART = new ServerToBentoAssetMapper3("PRIME_PIE_CHART", 59, C20690R.drawable.pict_clr_rds_prime_pie_chart);
    public static final ServerToBentoAssetMapper3 PRIME_POUND_SIGN = new ServerToBentoAssetMapper3("PRIME_POUND_SIGN", 60, C20690R.drawable.pict_clr_rds_prime_pound_sign);
    public static final ServerToBentoAssetMapper3 PRIME_RECURRING = new ServerToBentoAssetMapper3("PRIME_RECURRING", 61, C20690R.drawable.pict_clr_rds_prime_recurring);
    public static final ServerToBentoAssetMapper3 PRIME_RETIREMENT = new ServerToBentoAssetMapper3("PRIME_RETIREMENT", 62, C20690R.drawable.pict_clr_rds_prime_retirement);
    public static final ServerToBentoAssetMapper3 PRIME_REVERSE_SPLIT = new ServerToBentoAssetMapper3("PRIME_REVERSE_SPLIT", 63, C20690R.drawable.pict_clr_rds_prime_reverse_split);
    public static final ServerToBentoAssetMapper3 PRIME_ROBOT = new ServerToBentoAssetMapper3("PRIME_ROBOT", 64, C20690R.drawable.pict_clr_rds_prime_robot);
    public static final ServerToBentoAssetMapper3 ACCESSIBILITY = new ServerToBentoAssetMapper3("ACCESSIBILITY", 65, C20690R.drawable.pict_mono_rds_accessibility);
    public static final ServerToBentoAssetMapper3 AGENT = new ServerToBentoAssetMapper3("AGENT", 66, C20690R.drawable.pict_mono_rds_agent);
    public static final ServerToBentoAssetMapper3 BANK = new ServerToBentoAssetMapper3("BANK", 67, C20690R.drawable.pict_mono_rds_bank);
    public static final ServerToBentoAssetMapper3 BAR_CHART = new ServerToBentoAssetMapper3("BAR_CHART", 68, C20690R.drawable.pict_mono_rds_bar_chart);
    public static final ServerToBentoAssetMapper3 BELL = new ServerToBentoAssetMapper3("BELL", 69, C20690R.drawable.pict_mono_rds_bell);
    public static final ServerToBentoAssetMapper3 BILLS = new ServerToBentoAssetMapper3("BILLS", 70, C20690R.drawable.pict_mono_rds_bills);
    public static final ServerToBentoAssetMapper3 BINOCULARS = new ServerToBentoAssetMapper3("BINOCULARS", 71, C20690R.drawable.pict_mono_rds_binoculars);
    public static final ServerToBentoAssetMapper3 BOOK = new ServerToBentoAssetMapper3("BOOK", 72, C20690R.drawable.pict_mono_rds_book);
    public static final ServerToBentoAssetMapper3 BULLET = new ServerToBentoAssetMapper3("BULLET", 73, C20690R.drawable.pict_mono_rds_bullet);
    public static final ServerToBentoAssetMapper3 CALENDAR = new ServerToBentoAssetMapper3("CALENDAR", 74, C20690R.drawable.pict_mono_rds_calendar);
    public static final ServerToBentoAssetMapper3 CANCEL_CARD = new ServerToBentoAssetMapper3("CANCEL_CARD", 75, C20690R.drawable.pict_mono_rds_cancel_card);
    public static final ServerToBentoAssetMapper3 CASH = new ServerToBentoAssetMapper3("CASH", 76, C20690R.drawable.pict_mono_rds_cash);
    public static final ServerToBentoAssetMapper3 CHART = new ServerToBentoAssetMapper3("CHART", 77, C20690R.drawable.pict_mono_rds_chart);
    public static final ServerToBentoAssetMapper3 CHAT = new ServerToBentoAssetMapper3("CHAT", 78, C20690R.drawable.pict_mono_rds_chat);
    public static final ServerToBentoAssetMapper3 CHATBOT = new ServerToBentoAssetMapper3("CHATBOT", 79, C20690R.drawable.pict_mono_rds_chatbot);
    public static final ServerToBentoAssetMapper3 CHECK = new ServerToBentoAssetMapper3("CHECK", 80, C20690R.drawable.pict_mono_rds_check);
    public static final ServerToBentoAssetMapper3 CLIPBOARD = new ServerToBentoAssetMapper3("CLIPBOARD", 81, C20690R.drawable.pict_mono_rds_clipboard);
    public static final ServerToBentoAssetMapper3 CORTEX = new ServerToBentoAssetMapper3("CORTEX", 82, C20690R.drawable.pict_mono_rds_cortex);
    public static final ServerToBentoAssetMapper3 CRYPTO = new ServerToBentoAssetMapper3("CRYPTO", 83, C20690R.drawable.pict_mono_rds_crypto);
    public static final ServerToBentoAssetMapper3 CRYPTO_C = new ServerToBentoAssetMapper3("CRYPTO_C", 84, C20690R.drawable.pict_mono_rds_crypto_c);
    public static final ServerToBentoAssetMapper3 DEPOSIT = new ServerToBentoAssetMapper3("DEPOSIT", 85, C20690R.drawable.pict_mono_rds_deposit);
    public static final ServerToBentoAssetMapper3 DESKTOP = new ServerToBentoAssetMapper3("DESKTOP", 86, C20690R.drawable.pict_mono_rds_desktop);
    public static final ServerToBentoAssetMapper3 DOCUMENTS = new ServerToBentoAssetMapper3("DOCUMENTS", 87, C20690R.drawable.pict_mono_rds_documents);
    public static final ServerToBentoAssetMapper3 DOLLAR_SIGN = new ServerToBentoAssetMapper3("DOLLAR_SIGN", 88, C20690R.drawable.pict_mono_rds_dollar_sign);
    public static final ServerToBentoAssetMapper3 ENVELOPE = new ServerToBentoAssetMapper3("ENVELOPE", 89, C20690R.drawable.pict_mono_rds_envelope);
    public static final ServerToBentoAssetMapper3 ETF = new ServerToBentoAssetMapper3("ETF", 90, C20690R.drawable.pict_mono_rds_etf);
    public static final ServerToBentoAssetMapper3 EYE_OPEN = new ServerToBentoAssetMapper3("EYE_OPEN", 91, C20690R.drawable.pict_mono_rds_eye_open);
    public static final ServerToBentoAssetMapper3 FACE = new ServerToBentoAssetMapper3("FACE", 92, C20690R.drawable.pict_mono_rds_face);
    public static final ServerToBentoAssetMapper3 FLAG = new ServerToBentoAssetMapper3("FLAG", 93, C20690R.drawable.pict_mono_rds_flag);
    public static final ServerToBentoAssetMapper3 FLOWER = new ServerToBentoAssetMapper3("FLOWER", 94, C20690R.drawable.pict_mono_rds_flower);
    public static final ServerToBentoAssetMapper3 FREE = new ServerToBentoAssetMapper3("FREE", 95, C20690R.drawable.pict_mono_rds_free);
    public static final ServerToBentoAssetMapper3 GIFT = new ServerToBentoAssetMapper3("GIFT", 96, C20690R.drawable.pict_mono_rds_gift);
    public static final ServerToBentoAssetMapper3 HELP = new ServerToBentoAssetMapper3("HELP", 97, C20690R.drawable.pict_mono_rds_help);
    public static final ServerToBentoAssetMapper3 INVESTING = new ServerToBentoAssetMapper3("INVESTING", 98, C20690R.drawable.pict_mono_rds_investing);
    public static final ServerToBentoAssetMapper3 JOINT_ACCOUNTS = new ServerToBentoAssetMapper3("JOINT_ACCOUNTS", 99, C20690R.drawable.pict_mono_rds_joint_accounts);
    public static final ServerToBentoAssetMapper3 LIGHTBULB = new ServerToBentoAssetMapper3("LIGHTBULB", 100, C20690R.drawable.pict_mono_rds_lightbulb);
    public static final ServerToBentoAssetMapper3 LIGHTNING = new ServerToBentoAssetMapper3("LIGHTNING", 101, C20690R.drawable.pict_mono_rds_lightning);
    public static final ServerToBentoAssetMapper3 LIST = new ServerToBentoAssetMapper3("LIST", 102, C20690R.drawable.pict_mono_rds_list);
    public static final ServerToBentoAssetMapper3 LIVE_CHAT = new ServerToBentoAssetMapper3("LIVE_CHAT", 103, C20690R.drawable.pict_mono_rds_live_chat);
    public static final ServerToBentoAssetMapper3 LOCK = new ServerToBentoAssetMapper3("LOCK", 104, C20690R.drawable.pict_mono_rds_lock);
    public static final ServerToBentoAssetMapper3 MANAGED_ACCOUNTS = new ServerToBentoAssetMapper3("MANAGED_ACCOUNTS", 105, C20690R.drawable.pict_mono_rds_managed_accounts);
    public static final ServerToBentoAssetMapper3 MARGIN = new ServerToBentoAssetMapper3("MARGIN", 106, C20690R.drawable.pict_mono_rds_margin);
    public static final ServerToBentoAssetMapper3 MEGAPHONE = new ServerToBentoAssetMapper3("MEGAPHONE", 107, C20690R.drawable.pict_mono_rds_megaphone);
    public static final ServerToBentoAssetMapper3 MONEY = new ServerToBentoAssetMapper3("MONEY", 108, C20690R.drawable.pict_mono_rds_money);
    public static final ServerToBentoAssetMapper3 PAYMENT_CARD = new ServerToBentoAssetMapper3("PAYMENT_CARD", 109, C20690R.drawable.pict_mono_rds_payment_card);
    public static final ServerToBentoAssetMapper3 PAYROLL = new ServerToBentoAssetMapper3("PAYROLL", 110, C20690R.drawable.pict_mono_rds_payroll);
    public static final ServerToBentoAssetMapper3 PERCENT_SIGN = new ServerToBentoAssetMapper3("PERCENT_SIGN", 111, C20690R.drawable.pict_mono_rds_percent_sign);
    public static final ServerToBentoAssetMapper3 PERSON = new ServerToBentoAssetMapper3("PERSON", 112, C20690R.drawable.pict_mono_rds_person);
    public static final ServerToBentoAssetMapper3 PHONE = new ServerToBentoAssetMapper3("PHONE", 113, C20690R.drawable.pict_mono_rds_phone);
    public static final ServerToBentoAssetMapper3 PIE_CHART = new ServerToBentoAssetMapper3("PIE_CHART", 114, C20690R.drawable.pict_mono_rds_pie_chart);
    public static final ServerToBentoAssetMapper3 PIGGY_BANK = new ServerToBentoAssetMapper3("PIGGY_BANK", 115, C20690R.drawable.pict_mono_rds_piggy_bank);
    public static final ServerToBentoAssetMapper3 POUND_SIGN = new ServerToBentoAssetMapper3("POUND_SIGN", 116, C20690R.drawable.pict_mono_rds_pound_sign);
    public static final ServerToBentoAssetMapper3 RECURRING = new ServerToBentoAssetMapper3("RECURRING", 117, C20690R.drawable.pict_mono_rds_recurring);
    public static final ServerToBentoAssetMapper3 RETIREMENT = new ServerToBentoAssetMapper3("RETIREMENT", 118, C20690R.drawable.pict_mono_rds_retirement);
    public static final ServerToBentoAssetMapper3 ROBINHOOD = new ServerToBentoAssetMapper3(TradingTrendsType.ROBINHOOD, 119, C20690R.drawable.pict_mono_rds_robinhood);
    public static final ServerToBentoAssetMapper3 SMILEY = new ServerToBentoAssetMapper3("SMILEY", 120, C20690R.drawable.pict_mono_rds_smiley);
    public static final ServerToBentoAssetMapper3 SPARKLE = new ServerToBentoAssetMapper3("SPARKLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, C20690R.drawable.pict_mono_rds_sparkle);
    public static final ServerToBentoAssetMapper3 START = new ServerToBentoAssetMapper3("START", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, C20690R.drawable.pict_mono_rds_start);
    public static final ServerToBentoAssetMapper3 STOPWATCH = new ServerToBentoAssetMapper3("STOPWATCH", 123, C20690R.drawable.pict_mono_rds_stopwatch);
    public static final ServerToBentoAssetMapper3 SUBMARINE = new ServerToBentoAssetMapper3("SUBMARINE", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, C20690R.drawable.pict_mono_rds_submarine);
    public static final ServerToBentoAssetMapper3 TAX_LOTS = new ServerToBentoAssetMapper3("TAX_LOTS", 125, C20690R.drawable.pict_mono_rds_tax_lots);
    public static final ServerToBentoAssetMapper3 TRANSFER = new ServerToBentoAssetMapper3("TRANSFER", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, C20690R.drawable.pict_mono_rds_transfer);
    public static final ServerToBentoAssetMapper3 UMBRELLA = new ServerToBentoAssetMapper3("UMBRELLA", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, C20690R.drawable.pict_mono_rds_umbrella);
    public static final ServerToBentoAssetMapper3 UNLOCK = new ServerToBentoAssetMapper3("UNLOCK", 128, C20690R.drawable.pict_mono_rds_unlock);
    public static final ServerToBentoAssetMapper3 WARNING = new ServerToBentoAssetMapper3("WARNING", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, C20690R.drawable.pict_mono_rds_warning);
    public static final ServerToBentoAssetMapper3 WITHDRAW = new ServerToBentoAssetMapper3("WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, C20690R.drawable.pict_mono_rds_withdraw);

    private static final /* synthetic */ ServerToBentoAssetMapper3[] $values() {
        return new ServerToBentoAssetMapper3[]{UNKNOWN, CASH_ATM, CASH_CALENDAR, CASH_CONTACTLESS_PAYMENT, CASH_DOCUMENTS, CASH_FLOWER, CASH_FREE, CASH_MONEY, CASH_PAYMENT_CARD, CASH_SECURITY, CASH_START, CASH_THUMBS_UP, CASH_UMBRELLA, CASH_WARNING, CRYPTO_GIFT, CRYPTO_ORDER_TYPES_BUY_IN_SHARES, CRYPTO_ORDER_TYPES_BUY_LIMIT, CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP, CRYPTO_ORDER_TYPES_BUY_MARKET, CRYPTO_ORDER_TYPES_BUY_STOP, CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP, CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO, CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS, CRYPTO_ORDER_TYPES_BUY_WITH_EUROS, CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT, CRYPTO_ORDER_TYPES_SELL_LIMIT, CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP, CRYPTO_ORDER_TYPES_SELL_MARKET, CRYPTO_ORDER_TYPES_SELL_STOP, CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP, GOLD_BAR_CHART, GOLD_CALENDAR, GOLD_DOCUMENTS, GOLD_GIFT, GOLD_MARGIN, GOLD_MONEY, GOLD_PIGGY_BANK, GOLD_STOPWATCH, ORDER_TYPES_BUY_IN_SHARES, ORDER_TYPES_BUY_LIMIT, ORDER_TYPES_BUY_LIMIT_STOP, ORDER_TYPES_BUY_MARKET, ORDER_TYPES_BUY_STOP, ORDER_TYPES_BUY_TRAILING_STOP, ORDER_TYPES_BUY_WITH_DOLLARS, ORDER_TYPES_BUY_WITH_EUROS, ORDER_TYPES_RECURRING_INVESTMENT, ORDER_TYPES_SELL_LIMIT, ORDER_TYPES_SELL_LIMIT_STOP, ORDER_TYPES_SELL_MARKET, ORDER_TYPES_SELL_STOP, ORDER_TYPES_SELL_TRAILING_STOP, PRIME_CHART, PRIME_DOLLAR_SIGN, PRIME_FLAG, PRIME_FLOWER, PRIME_FORWARD_SPLIT, PRIME_GIFT, PRIME_MONEY, PRIME_PIE_CHART, PRIME_POUND_SIGN, PRIME_RECURRING, PRIME_RETIREMENT, PRIME_REVERSE_SPLIT, PRIME_ROBOT, ACCESSIBILITY, AGENT, BANK, BAR_CHART, BELL, BILLS, BINOCULARS, BOOK, BULLET, CALENDAR, CANCEL_CARD, CASH, CHART, CHAT, CHATBOT, CHECK, CLIPBOARD, CORTEX, CRYPTO, CRYPTO_C, DEPOSIT, DESKTOP, DOCUMENTS, DOLLAR_SIGN, ENVELOPE, ETF, EYE_OPEN, FACE, FLAG, FLOWER, FREE, GIFT, HELP, INVESTING, JOINT_ACCOUNTS, LIGHTBULB, LIGHTNING, LIST, LIVE_CHAT, LOCK, MANAGED_ACCOUNTS, MARGIN, MEGAPHONE, MONEY, PAYMENT_CARD, PAYROLL, PERCENT_SIGN, PERSON, PHONE, PIE_CHART, PIGGY_BANK, POUND_SIGN, RECURRING, RETIREMENT, ROBINHOOD, SMILEY, SPARKLE, START, STOPWATCH, SUBMARINE, TAX_LOTS, TRANSFER, UMBRELLA, UNLOCK, WARNING, WITHDRAW};
    }

    @JvmStatic
    public static ServerToBentoAssetMapper3 fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ServerToBentoAssetMapper3> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ServerToBentoAssetMapper3 serverToBentoAssetMapper3) {
        return INSTANCE.toServerValue(serverToBentoAssetMapper3);
    }

    private ServerToBentoAssetMapper3(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    static {
        ServerToBentoAssetMapper3[] serverToBentoAssetMapper3Arr$values = $values();
        $VALUES = serverToBentoAssetMapper3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(serverToBentoAssetMapper3Arr$values);
        INSTANCE = new Companion(null);
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* compiled from: ServerToBentoAssetMapper.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.PictogramAsset$Companion, reason: from kotlin metadata */
    public static final class Companion extends RhEnum.Converter.Defaulted<ServerToBentoAssetMapper3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) ServerToBentoAssetMapper3.getEntries().toArray(new ServerToBentoAssetMapper3[0]), ServerToBentoAssetMapper3.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ServerToBentoAssetMapper3 enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ServerToBentoAssetMapper3 fromServerValue(String serverValue) {
            return (ServerToBentoAssetMapper3) super.fromServerValue(serverValue);
        }
    }

    public static ServerToBentoAssetMapper3 valueOf(String str) {
        return (ServerToBentoAssetMapper3) Enum.valueOf(ServerToBentoAssetMapper3.class, str);
    }

    public static ServerToBentoAssetMapper3[] values() {
        return (ServerToBentoAssetMapper3[]) $VALUES.clone();
    }
}
