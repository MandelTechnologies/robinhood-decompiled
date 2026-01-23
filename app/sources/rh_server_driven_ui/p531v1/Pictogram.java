package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Pictogram.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u008c\u0001\b\u0086\u0081\u0002\u0018\u0000 \u008f\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u008f\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001¨\u0006\u0090\u0001"}, m3636d2 = {"Lrh_server_driven_ui/v1/Pictogram;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PICTOGRAM_UNSPECIFIED", "PICTOGRAM_ACCESSIBILITY", "PICTOGRAM_AGENT", "PICTOGRAM_BANK", "PICTOGRAM_BAR_CHART", "PICTOGRAM_BASKETBALL", "PICTOGRAM_BELL", "PICTOGRAM_BILLS", "PICTOGRAM_BINOCULARS", "PICTOGRAM_BOOK", "PICTOGRAM_BULLET", "PICTOGRAM_CALENDAR", "PICTOGRAM_CANCEL_CARD", "PICTOGRAM_CASH", "PICTOGRAM_CASH_ATM", "PICTOGRAM_CASH_CALENDAR", "PICTOGRAM_CASH_CONTACTLESS_PAYMENT", "PICTOGRAM_CASH_DOCUMENTS", "PICTOGRAM_CASH_FLOWER", "PICTOGRAM_CASH_FREE", "PICTOGRAM_CASH_MONEY", "PICTOGRAM_CASH_PAYMENT_CARD", "PICTOGRAM_CASH_SECURITY", "PICTOGRAM_CASH_START", "PICTOGRAM_CASH_THUMBS_UP", "PICTOGRAM_CASH_UMBRELLA", "PICTOGRAM_CASH_WARNING", "PICTOGRAM_CHART", "PICTOGRAM_CHAT", "PICTOGRAM_CHATBOT", "PICTOGRAM_CHECK", "PICTOGRAM_CLIPBOARD", "PICTOGRAM_CORTEX", "PICTOGRAM_CRYPTO", "PICTOGRAM_CRYPTO_C", "PICTOGRAM_CRYPTO_GIFT", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", "PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", "PICTOGRAM_DEPOSIT", "PICTOGRAM_DESKTOP", "PICTOGRAM_DOCUMENTS", "PICTOGRAM_DOLLAR_SIGN", "PICTOGRAM_ENVELOPE", "PICTOGRAM_ETF", "PICTOGRAM_EYE_OPEN", "PICTOGRAM_FACE", "PICTOGRAM_FLAG", "PICTOGRAM_FLOWER", "PICTOGRAM_FOOTBALL", "PICTOGRAM_FREE", "PICTOGRAM_GIFT", "PICTOGRAM_GOLD_BAR_CHART", "PICTOGRAM_GOLD_CALENDAR", "PICTOGRAM_GOLD_DOCUMENTS", "PICTOGRAM_GOLD_GIFT", "PICTOGRAM_GOLD_MARGIN", "PICTOGRAM_GOLD_MONEY", "PICTOGRAM_GOLD_PIGGY_BANK", "PICTOGRAM_GOLD_STOPWATCH", "PICTOGRAM_HELP", "PICTOGRAM_HOCKEY", "PICTOGRAM_INVESTING", "PICTOGRAM_JOINT_ACCOUNTS", "PICTOGRAM_LIGHTBULB", "PICTOGRAM_LIGHTNING", "PICTOGRAM_LIST", "PICTOGRAM_LIVE_CHAT", "PICTOGRAM_LOCK", "PICTOGRAM_MANAGED_ACCOUNTS", "PICTOGRAM_MARGIN", "PICTOGRAM_MEGAPHONE", "PICTOGRAM_MONEY", "PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES", "PICTOGRAM_ORDER_TYPES_BUY_LIMIT", "PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP", "PICTOGRAM_ORDER_TYPES_BUY_MARKET", "PICTOGRAM_ORDER_TYPES_BUY_STOP", "PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP", "PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS", "PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS", "PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT", "PICTOGRAM_ORDER_TYPES_SELL_LIMIT", "PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP", "PICTOGRAM_ORDER_TYPES_SELL_MARKET", "PICTOGRAM_ORDER_TYPES_SELL_STOP", "PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP", "PICTOGRAM_PAYMENT_CARD", "PICTOGRAM_PAYROLL", "PICTOGRAM_PERCENT_SIGN", "PICTOGRAM_PERSON", "PICTOGRAM_PHONE", "PICTOGRAM_PIE_CHART", "PICTOGRAM_PIGGY_BANK", "PICTOGRAM_POUND_SIGN", "PICTOGRAM_PRIME_CHART", "PICTOGRAM_PRIME_DOLLAR_SIGN", "PICTOGRAM_PRIME_FLAG", "PICTOGRAM_PRIME_FLOWER", "PICTOGRAM_PRIME_FORWARD_SPLIT", "PICTOGRAM_PRIME_GIFT", "PICTOGRAM_PRIME_MONEY", "PICTOGRAM_PRIME_PIE_CHART", "PICTOGRAM_PRIME_POUND_SIGN", "PICTOGRAM_PRIME_RECURRING", "PICTOGRAM_PRIME_RETIREMENT", "PICTOGRAM_PRIME_REVERSE_SPLIT", "PICTOGRAM_PRIME_ROBOT", "PICTOGRAM_RECURRING", "PICTOGRAM_RETIREMENT", "PICTOGRAM_ROBINHOOD", "PICTOGRAM_SMILEY", "PICTOGRAM_SPARKLE", "PICTOGRAM_START", "PICTOGRAM_STOPWATCH", "PICTOGRAM_SUBMARINE", "PICTOGRAM_TAX_LOTS", "PICTOGRAM_TRANSFER", "PICTOGRAM_UMBRELLA", "PICTOGRAM_UNLOCK", "PICTOGRAM_WARNING", "PICTOGRAM_WITHDRAW", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Pictogram implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Pictogram[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Pictogram> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Pictogram PICTOGRAM_ACCESSIBILITY;
    public static final Pictogram PICTOGRAM_AGENT;
    public static final Pictogram PICTOGRAM_BANK;
    public static final Pictogram PICTOGRAM_BAR_CHART;
    public static final Pictogram PICTOGRAM_BASKETBALL;
    public static final Pictogram PICTOGRAM_BELL;
    public static final Pictogram PICTOGRAM_BILLS;
    public static final Pictogram PICTOGRAM_BINOCULARS;
    public static final Pictogram PICTOGRAM_BOOK;
    public static final Pictogram PICTOGRAM_BULLET;
    public static final Pictogram PICTOGRAM_CALENDAR;
    public static final Pictogram PICTOGRAM_CANCEL_CARD;
    public static final Pictogram PICTOGRAM_CASH;
    public static final Pictogram PICTOGRAM_CASH_ATM;
    public static final Pictogram PICTOGRAM_CASH_CALENDAR;
    public static final Pictogram PICTOGRAM_CASH_CONTACTLESS_PAYMENT;
    public static final Pictogram PICTOGRAM_CASH_DOCUMENTS;
    public static final Pictogram PICTOGRAM_CASH_FLOWER;
    public static final Pictogram PICTOGRAM_CASH_FREE;
    public static final Pictogram PICTOGRAM_CASH_MONEY;
    public static final Pictogram PICTOGRAM_CASH_PAYMENT_CARD;
    public static final Pictogram PICTOGRAM_CASH_SECURITY;
    public static final Pictogram PICTOGRAM_CASH_START;
    public static final Pictogram PICTOGRAM_CASH_THUMBS_UP;
    public static final Pictogram PICTOGRAM_CASH_UMBRELLA;
    public static final Pictogram PICTOGRAM_CASH_WARNING;
    public static final Pictogram PICTOGRAM_CHART;
    public static final Pictogram PICTOGRAM_CHAT;
    public static final Pictogram PICTOGRAM_CHATBOT;
    public static final Pictogram PICTOGRAM_CHECK;
    public static final Pictogram PICTOGRAM_CLIPBOARD;
    public static final Pictogram PICTOGRAM_CORTEX;
    public static final Pictogram PICTOGRAM_CRYPTO;
    public static final Pictogram PICTOGRAM_CRYPTO_C;
    public static final Pictogram PICTOGRAM_CRYPTO_GIFT;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP;
    public static final Pictogram PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP;
    public static final Pictogram PICTOGRAM_DEPOSIT;
    public static final Pictogram PICTOGRAM_DESKTOP;
    public static final Pictogram PICTOGRAM_DOCUMENTS;
    public static final Pictogram PICTOGRAM_DOLLAR_SIGN;
    public static final Pictogram PICTOGRAM_ENVELOPE;
    public static final Pictogram PICTOGRAM_ETF;
    public static final Pictogram PICTOGRAM_EYE_OPEN;
    public static final Pictogram PICTOGRAM_FACE;
    public static final Pictogram PICTOGRAM_FLAG;
    public static final Pictogram PICTOGRAM_FLOWER;
    public static final Pictogram PICTOGRAM_FOOTBALL;
    public static final Pictogram PICTOGRAM_FREE;
    public static final Pictogram PICTOGRAM_GIFT;
    public static final Pictogram PICTOGRAM_GOLD_BAR_CHART;
    public static final Pictogram PICTOGRAM_GOLD_CALENDAR;
    public static final Pictogram PICTOGRAM_GOLD_DOCUMENTS;
    public static final Pictogram PICTOGRAM_GOLD_GIFT;
    public static final Pictogram PICTOGRAM_GOLD_MARGIN;
    public static final Pictogram PICTOGRAM_GOLD_MONEY;
    public static final Pictogram PICTOGRAM_GOLD_PIGGY_BANK;
    public static final Pictogram PICTOGRAM_GOLD_STOPWATCH;
    public static final Pictogram PICTOGRAM_HELP;
    public static final Pictogram PICTOGRAM_HOCKEY;
    public static final Pictogram PICTOGRAM_INVESTING;
    public static final Pictogram PICTOGRAM_JOINT_ACCOUNTS;
    public static final Pictogram PICTOGRAM_LIGHTBULB;
    public static final Pictogram PICTOGRAM_LIGHTNING;
    public static final Pictogram PICTOGRAM_LIST;
    public static final Pictogram PICTOGRAM_LIVE_CHAT;
    public static final Pictogram PICTOGRAM_LOCK;
    public static final Pictogram PICTOGRAM_MANAGED_ACCOUNTS;
    public static final Pictogram PICTOGRAM_MARGIN;
    public static final Pictogram PICTOGRAM_MEGAPHONE;
    public static final Pictogram PICTOGRAM_MONEY;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_LIMIT;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_MARKET;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_STOP;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_SELL_LIMIT;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_SELL_MARKET;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_SELL_STOP;
    public static final Pictogram PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP;
    public static final Pictogram PICTOGRAM_PAYMENT_CARD;
    public static final Pictogram PICTOGRAM_PAYROLL;
    public static final Pictogram PICTOGRAM_PERCENT_SIGN;
    public static final Pictogram PICTOGRAM_PERSON;
    public static final Pictogram PICTOGRAM_PHONE;
    public static final Pictogram PICTOGRAM_PIE_CHART;
    public static final Pictogram PICTOGRAM_PIGGY_BANK;
    public static final Pictogram PICTOGRAM_POUND_SIGN;
    public static final Pictogram PICTOGRAM_PRIME_CHART;
    public static final Pictogram PICTOGRAM_PRIME_DOLLAR_SIGN;
    public static final Pictogram PICTOGRAM_PRIME_FLAG;
    public static final Pictogram PICTOGRAM_PRIME_FLOWER;
    public static final Pictogram PICTOGRAM_PRIME_FORWARD_SPLIT;
    public static final Pictogram PICTOGRAM_PRIME_GIFT;
    public static final Pictogram PICTOGRAM_PRIME_MONEY;
    public static final Pictogram PICTOGRAM_PRIME_PIE_CHART;
    public static final Pictogram PICTOGRAM_PRIME_POUND_SIGN;
    public static final Pictogram PICTOGRAM_PRIME_RECURRING;
    public static final Pictogram PICTOGRAM_PRIME_RETIREMENT;
    public static final Pictogram PICTOGRAM_PRIME_REVERSE_SPLIT;
    public static final Pictogram PICTOGRAM_PRIME_ROBOT;
    public static final Pictogram PICTOGRAM_RECURRING;
    public static final Pictogram PICTOGRAM_RETIREMENT;
    public static final Pictogram PICTOGRAM_ROBINHOOD;
    public static final Pictogram PICTOGRAM_SMILEY;
    public static final Pictogram PICTOGRAM_SPARKLE;
    public static final Pictogram PICTOGRAM_START;
    public static final Pictogram PICTOGRAM_STOPWATCH;
    public static final Pictogram PICTOGRAM_SUBMARINE;
    public static final Pictogram PICTOGRAM_TAX_LOTS;
    public static final Pictogram PICTOGRAM_TRANSFER;
    public static final Pictogram PICTOGRAM_UMBRELLA;
    public static final Pictogram PICTOGRAM_UNLOCK;
    public static final Pictogram PICTOGRAM_UNSPECIFIED;
    public static final Pictogram PICTOGRAM_WARNING;
    public static final Pictogram PICTOGRAM_WITHDRAW;
    private final int value;

    private static final /* synthetic */ Pictogram[] $values() {
        return new Pictogram[]{PICTOGRAM_UNSPECIFIED, PICTOGRAM_ACCESSIBILITY, PICTOGRAM_AGENT, PICTOGRAM_BANK, PICTOGRAM_BAR_CHART, PICTOGRAM_BASKETBALL, PICTOGRAM_BELL, PICTOGRAM_BILLS, PICTOGRAM_BINOCULARS, PICTOGRAM_BOOK, PICTOGRAM_BULLET, PICTOGRAM_CALENDAR, PICTOGRAM_CANCEL_CARD, PICTOGRAM_CASH, PICTOGRAM_CASH_ATM, PICTOGRAM_CASH_CALENDAR, PICTOGRAM_CASH_CONTACTLESS_PAYMENT, PICTOGRAM_CASH_DOCUMENTS, PICTOGRAM_CASH_FLOWER, PICTOGRAM_CASH_FREE, PICTOGRAM_CASH_MONEY, PICTOGRAM_CASH_PAYMENT_CARD, PICTOGRAM_CASH_SECURITY, PICTOGRAM_CASH_START, PICTOGRAM_CASH_THUMBS_UP, PICTOGRAM_CASH_UMBRELLA, PICTOGRAM_CASH_WARNING, PICTOGRAM_CHART, PICTOGRAM_CHAT, PICTOGRAM_CHATBOT, PICTOGRAM_CHECK, PICTOGRAM_CLIPBOARD, PICTOGRAM_CORTEX, PICTOGRAM_CRYPTO, PICTOGRAM_CRYPTO_C, PICTOGRAM_CRYPTO_GIFT, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS, PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP, PICTOGRAM_DEPOSIT, PICTOGRAM_DESKTOP, PICTOGRAM_DOCUMENTS, PICTOGRAM_DOLLAR_SIGN, PICTOGRAM_ENVELOPE, PICTOGRAM_ETF, PICTOGRAM_EYE_OPEN, PICTOGRAM_FACE, PICTOGRAM_FLAG, PICTOGRAM_FLOWER, PICTOGRAM_FOOTBALL, PICTOGRAM_FREE, PICTOGRAM_GIFT, PICTOGRAM_GOLD_BAR_CHART, PICTOGRAM_GOLD_CALENDAR, PICTOGRAM_GOLD_DOCUMENTS, PICTOGRAM_GOLD_GIFT, PICTOGRAM_GOLD_MARGIN, PICTOGRAM_GOLD_MONEY, PICTOGRAM_GOLD_PIGGY_BANK, PICTOGRAM_GOLD_STOPWATCH, PICTOGRAM_HELP, PICTOGRAM_HOCKEY, PICTOGRAM_INVESTING, PICTOGRAM_JOINT_ACCOUNTS, PICTOGRAM_LIGHTBULB, PICTOGRAM_LIGHTNING, PICTOGRAM_LIST, PICTOGRAM_LIVE_CHAT, PICTOGRAM_LOCK, PICTOGRAM_MANAGED_ACCOUNTS, PICTOGRAM_MARGIN, PICTOGRAM_MEGAPHONE, PICTOGRAM_MONEY, PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES, PICTOGRAM_ORDER_TYPES_BUY_LIMIT, PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP, PICTOGRAM_ORDER_TYPES_BUY_MARKET, PICTOGRAM_ORDER_TYPES_BUY_STOP, PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP, PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS, PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS, PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT, PICTOGRAM_ORDER_TYPES_SELL_LIMIT, PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP, PICTOGRAM_ORDER_TYPES_SELL_MARKET, PICTOGRAM_ORDER_TYPES_SELL_STOP, PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP, PICTOGRAM_PAYMENT_CARD, PICTOGRAM_PAYROLL, PICTOGRAM_PERCENT_SIGN, PICTOGRAM_PERSON, PICTOGRAM_PHONE, PICTOGRAM_PIE_CHART, PICTOGRAM_PIGGY_BANK, PICTOGRAM_POUND_SIGN, PICTOGRAM_PRIME_CHART, PICTOGRAM_PRIME_DOLLAR_SIGN, PICTOGRAM_PRIME_FLAG, PICTOGRAM_PRIME_FLOWER, PICTOGRAM_PRIME_FORWARD_SPLIT, PICTOGRAM_PRIME_GIFT, PICTOGRAM_PRIME_MONEY, PICTOGRAM_PRIME_PIE_CHART, PICTOGRAM_PRIME_POUND_SIGN, PICTOGRAM_PRIME_RECURRING, PICTOGRAM_PRIME_RETIREMENT, PICTOGRAM_PRIME_REVERSE_SPLIT, PICTOGRAM_PRIME_ROBOT, PICTOGRAM_RECURRING, PICTOGRAM_RETIREMENT, PICTOGRAM_ROBINHOOD, PICTOGRAM_SMILEY, PICTOGRAM_SPARKLE, PICTOGRAM_START, PICTOGRAM_STOPWATCH, PICTOGRAM_SUBMARINE, PICTOGRAM_TAX_LOTS, PICTOGRAM_TRANSFER, PICTOGRAM_UMBRELLA, PICTOGRAM_UNLOCK, PICTOGRAM_WARNING, PICTOGRAM_WITHDRAW};
    }

    @JvmStatic
    public static final Pictogram fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Pictogram> getEntries() {
        return $ENTRIES;
    }

    private Pictogram(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Pictogram pictogram = new Pictogram("PICTOGRAM_UNSPECIFIED", 0, 0);
        PICTOGRAM_UNSPECIFIED = pictogram;
        PICTOGRAM_ACCESSIBILITY = new Pictogram("PICTOGRAM_ACCESSIBILITY", 1, 1);
        PICTOGRAM_AGENT = new Pictogram("PICTOGRAM_AGENT", 2, 2);
        PICTOGRAM_BANK = new Pictogram("PICTOGRAM_BANK", 3, 3);
        PICTOGRAM_BAR_CHART = new Pictogram("PICTOGRAM_BAR_CHART", 4, 4);
        PICTOGRAM_BASKETBALL = new Pictogram("PICTOGRAM_BASKETBALL", 5, 131);
        PICTOGRAM_BELL = new Pictogram("PICTOGRAM_BELL", 6, 5);
        PICTOGRAM_BILLS = new Pictogram("PICTOGRAM_BILLS", 7, 6);
        PICTOGRAM_BINOCULARS = new Pictogram("PICTOGRAM_BINOCULARS", 8, 7);
        PICTOGRAM_BOOK = new Pictogram("PICTOGRAM_BOOK", 9, 8);
        PICTOGRAM_BULLET = new Pictogram("PICTOGRAM_BULLET", 10, 9);
        PICTOGRAM_CALENDAR = new Pictogram("PICTOGRAM_CALENDAR", 11, 10);
        PICTOGRAM_CANCEL_CARD = new Pictogram("PICTOGRAM_CANCEL_CARD", 12, 11);
        PICTOGRAM_CASH = new Pictogram("PICTOGRAM_CASH", 13, 12);
        PICTOGRAM_CASH_ATM = new Pictogram("PICTOGRAM_CASH_ATM", 14, 13);
        PICTOGRAM_CASH_CALENDAR = new Pictogram("PICTOGRAM_CASH_CALENDAR", 15, 14);
        PICTOGRAM_CASH_CONTACTLESS_PAYMENT = new Pictogram("PICTOGRAM_CASH_CONTACTLESS_PAYMENT", 16, 15);
        PICTOGRAM_CASH_DOCUMENTS = new Pictogram("PICTOGRAM_CASH_DOCUMENTS", 17, 16);
        PICTOGRAM_CASH_FLOWER = new Pictogram("PICTOGRAM_CASH_FLOWER", 18, 17);
        PICTOGRAM_CASH_FREE = new Pictogram("PICTOGRAM_CASH_FREE", 19, 18);
        PICTOGRAM_CASH_MONEY = new Pictogram("PICTOGRAM_CASH_MONEY", 20, 19);
        PICTOGRAM_CASH_PAYMENT_CARD = new Pictogram("PICTOGRAM_CASH_PAYMENT_CARD", 21, 20);
        PICTOGRAM_CASH_SECURITY = new Pictogram("PICTOGRAM_CASH_SECURITY", 22, 21);
        PICTOGRAM_CASH_START = new Pictogram("PICTOGRAM_CASH_START", 23, 22);
        PICTOGRAM_CASH_THUMBS_UP = new Pictogram("PICTOGRAM_CASH_THUMBS_UP", 24, 23);
        PICTOGRAM_CASH_UMBRELLA = new Pictogram("PICTOGRAM_CASH_UMBRELLA", 25, 24);
        PICTOGRAM_CASH_WARNING = new Pictogram("PICTOGRAM_CASH_WARNING", 26, 25);
        PICTOGRAM_CHART = new Pictogram("PICTOGRAM_CHART", 27, 26);
        PICTOGRAM_CHAT = new Pictogram("PICTOGRAM_CHAT", 28, 27);
        PICTOGRAM_CHATBOT = new Pictogram("PICTOGRAM_CHATBOT", 29, 28);
        PICTOGRAM_CHECK = new Pictogram("PICTOGRAM_CHECK", 30, 29);
        PICTOGRAM_CLIPBOARD = new Pictogram("PICTOGRAM_CLIPBOARD", 31, 30);
        PICTOGRAM_CORTEX = new Pictogram("PICTOGRAM_CORTEX", 32, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        PICTOGRAM_CRYPTO = new Pictogram("PICTOGRAM_CRYPTO", 33, 31);
        PICTOGRAM_CRYPTO_C = new Pictogram("PICTOGRAM_CRYPTO_C", 34, 32);
        PICTOGRAM_CRYPTO_GIFT = new Pictogram("PICTOGRAM_CRYPTO_GIFT", 35, 33);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES", 36, 34);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT", 37, 35);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", 38, 36);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET", 39, 37);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP", 40, 38);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", 41, 39);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", 42, 40);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", 43, 41);
        PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", 44, 42);
        PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", 45, 43);
        PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT", 46, 44);
        PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", 47, 45);
        PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET", 48, 46);
        PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP", 49, 47);
        PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP = new Pictogram("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", 50, 48);
        PICTOGRAM_DEPOSIT = new Pictogram("PICTOGRAM_DEPOSIT", 51, 49);
        PICTOGRAM_DESKTOP = new Pictogram("PICTOGRAM_DESKTOP", 52, 50);
        PICTOGRAM_DOCUMENTS = new Pictogram("PICTOGRAM_DOCUMENTS", 53, 51);
        PICTOGRAM_DOLLAR_SIGN = new Pictogram("PICTOGRAM_DOLLAR_SIGN", 54, 52);
        PICTOGRAM_ENVELOPE = new Pictogram("PICTOGRAM_ENVELOPE", 55, 53);
        PICTOGRAM_ETF = new Pictogram("PICTOGRAM_ETF", 56, 54);
        PICTOGRAM_EYE_OPEN = new Pictogram("PICTOGRAM_EYE_OPEN", 57, 55);
        PICTOGRAM_FACE = new Pictogram("PICTOGRAM_FACE", 58, 56);
        PICTOGRAM_FLAG = new Pictogram("PICTOGRAM_FLAG", 59, 57);
        PICTOGRAM_FLOWER = new Pictogram("PICTOGRAM_FLOWER", 60, 58);
        PICTOGRAM_FOOTBALL = new Pictogram("PICTOGRAM_FOOTBALL", 61, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        PICTOGRAM_FREE = new Pictogram("PICTOGRAM_FREE", 62, 59);
        PICTOGRAM_GIFT = new Pictogram("PICTOGRAM_GIFT", 63, 60);
        PICTOGRAM_GOLD_BAR_CHART = new Pictogram("PICTOGRAM_GOLD_BAR_CHART", 64, 61);
        PICTOGRAM_GOLD_CALENDAR = new Pictogram("PICTOGRAM_GOLD_CALENDAR", 65, 62);
        PICTOGRAM_GOLD_DOCUMENTS = new Pictogram("PICTOGRAM_GOLD_DOCUMENTS", 66, 63);
        PICTOGRAM_GOLD_GIFT = new Pictogram("PICTOGRAM_GOLD_GIFT", 67, 64);
        PICTOGRAM_GOLD_MARGIN = new Pictogram("PICTOGRAM_GOLD_MARGIN", 68, 65);
        PICTOGRAM_GOLD_MONEY = new Pictogram("PICTOGRAM_GOLD_MONEY", 69, 66);
        PICTOGRAM_GOLD_PIGGY_BANK = new Pictogram("PICTOGRAM_GOLD_PIGGY_BANK", 70, 67);
        PICTOGRAM_GOLD_STOPWATCH = new Pictogram("PICTOGRAM_GOLD_STOPWATCH", 71, 68);
        PICTOGRAM_HELP = new Pictogram("PICTOGRAM_HELP", 72, 69);
        PICTOGRAM_HOCKEY = new Pictogram("PICTOGRAM_HOCKEY", 73, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        PICTOGRAM_INVESTING = new Pictogram("PICTOGRAM_INVESTING", 74, 70);
        PICTOGRAM_JOINT_ACCOUNTS = new Pictogram("PICTOGRAM_JOINT_ACCOUNTS", 75, 71);
        PICTOGRAM_LIGHTBULB = new Pictogram("PICTOGRAM_LIGHTBULB", 76, 72);
        PICTOGRAM_LIGHTNING = new Pictogram("PICTOGRAM_LIGHTNING", 77, 73);
        PICTOGRAM_LIST = new Pictogram("PICTOGRAM_LIST", 78, 74);
        PICTOGRAM_LIVE_CHAT = new Pictogram("PICTOGRAM_LIVE_CHAT", 79, 75);
        PICTOGRAM_LOCK = new Pictogram("PICTOGRAM_LOCK", 80, 76);
        PICTOGRAM_MANAGED_ACCOUNTS = new Pictogram("PICTOGRAM_MANAGED_ACCOUNTS", 81, 128);
        PICTOGRAM_MARGIN = new Pictogram("PICTOGRAM_MARGIN", 82, 77);
        PICTOGRAM_MEGAPHONE = new Pictogram("PICTOGRAM_MEGAPHONE", 83, 78);
        PICTOGRAM_MONEY = new Pictogram("PICTOGRAM_MONEY", 84, 79);
        PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES", 85, 80);
        PICTOGRAM_ORDER_TYPES_BUY_LIMIT = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_LIMIT", 86, 81);
        PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP", 87, 82);
        PICTOGRAM_ORDER_TYPES_BUY_MARKET = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_MARKET", 88, 83);
        PICTOGRAM_ORDER_TYPES_BUY_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_STOP", 89, 84);
        PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP", 90, 85);
        PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS", 91, 86);
        PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS = new Pictogram("PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS", 92, 87);
        PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT = new Pictogram("PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT", 93, 88);
        PICTOGRAM_ORDER_TYPES_SELL_LIMIT = new Pictogram("PICTOGRAM_ORDER_TYPES_SELL_LIMIT", 94, 89);
        PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP", 95, 90);
        PICTOGRAM_ORDER_TYPES_SELL_MARKET = new Pictogram("PICTOGRAM_ORDER_TYPES_SELL_MARKET", 96, 91);
        PICTOGRAM_ORDER_TYPES_SELL_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_SELL_STOP", 97, 92);
        PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP = new Pictogram("PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP", 98, 93);
        PICTOGRAM_PAYMENT_CARD = new Pictogram("PICTOGRAM_PAYMENT_CARD", 99, 94);
        PICTOGRAM_PAYROLL = new Pictogram("PICTOGRAM_PAYROLL", 100, 95);
        PICTOGRAM_PERCENT_SIGN = new Pictogram("PICTOGRAM_PERCENT_SIGN", 101, 96);
        PICTOGRAM_PERSON = new Pictogram("PICTOGRAM_PERSON", 102, 97);
        PICTOGRAM_PHONE = new Pictogram("PICTOGRAM_PHONE", 103, 98);
        PICTOGRAM_PIE_CHART = new Pictogram("PICTOGRAM_PIE_CHART", 104, 99);
        PICTOGRAM_PIGGY_BANK = new Pictogram("PICTOGRAM_PIGGY_BANK", 105, 100);
        PICTOGRAM_POUND_SIGN = new Pictogram("PICTOGRAM_POUND_SIGN", 106, 101);
        PICTOGRAM_PRIME_CHART = new Pictogram("PICTOGRAM_PRIME_CHART", 107, 102);
        PICTOGRAM_PRIME_DOLLAR_SIGN = new Pictogram("PICTOGRAM_PRIME_DOLLAR_SIGN", 108, 103);
        PICTOGRAM_PRIME_FLAG = new Pictogram("PICTOGRAM_PRIME_FLAG", 109, 104);
        PICTOGRAM_PRIME_FLOWER = new Pictogram("PICTOGRAM_PRIME_FLOWER", 110, 105);
        PICTOGRAM_PRIME_FORWARD_SPLIT = new Pictogram("PICTOGRAM_PRIME_FORWARD_SPLIT", 111, 106);
        PICTOGRAM_PRIME_GIFT = new Pictogram("PICTOGRAM_PRIME_GIFT", 112, 107);
        PICTOGRAM_PRIME_MONEY = new Pictogram("PICTOGRAM_PRIME_MONEY", 113, 108);
        PICTOGRAM_PRIME_PIE_CHART = new Pictogram("PICTOGRAM_PRIME_PIE_CHART", 114, 109);
        PICTOGRAM_PRIME_POUND_SIGN = new Pictogram("PICTOGRAM_PRIME_POUND_SIGN", 115, 110);
        PICTOGRAM_PRIME_RECURRING = new Pictogram("PICTOGRAM_PRIME_RECURRING", 116, 111);
        PICTOGRAM_PRIME_RETIREMENT = new Pictogram("PICTOGRAM_PRIME_RETIREMENT", 117, 112);
        PICTOGRAM_PRIME_REVERSE_SPLIT = new Pictogram("PICTOGRAM_PRIME_REVERSE_SPLIT", 118, 113);
        PICTOGRAM_PRIME_ROBOT = new Pictogram("PICTOGRAM_PRIME_ROBOT", 119, 114);
        PICTOGRAM_RECURRING = new Pictogram("PICTOGRAM_RECURRING", 120, 115);
        PICTOGRAM_RETIREMENT = new Pictogram("PICTOGRAM_RETIREMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 116);
        PICTOGRAM_ROBINHOOD = new Pictogram("PICTOGRAM_ROBINHOOD", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 117);
        PICTOGRAM_SMILEY = new Pictogram("PICTOGRAM_SMILEY", 123, 118);
        PICTOGRAM_SPARKLE = new Pictogram("PICTOGRAM_SPARKLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 119);
        PICTOGRAM_START = new Pictogram("PICTOGRAM_START", 125, 120);
        PICTOGRAM_STOPWATCH = new Pictogram("PICTOGRAM_STOPWATCH", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        PICTOGRAM_SUBMARINE = new Pictogram("PICTOGRAM_SUBMARINE", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        PICTOGRAM_TAX_LOTS = new Pictogram("PICTOGRAM_TAX_LOTS", 128, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        PICTOGRAM_TRANSFER = new Pictogram("PICTOGRAM_TRANSFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 123);
        PICTOGRAM_UMBRELLA = new Pictogram("PICTOGRAM_UMBRELLA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        PICTOGRAM_UNLOCK = new Pictogram("PICTOGRAM_UNLOCK", 131, 125);
        PICTOGRAM_WARNING = new Pictogram("PICTOGRAM_WARNING", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        PICTOGRAM_WITHDRAW = new Pictogram("PICTOGRAM_WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        Pictogram[] pictogramArr$values = $values();
        $VALUES = pictogramArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pictogramArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Pictogram.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Pictogram>(orCreateKotlinClass, syntax, pictogram) { // from class: rh_server_driven_ui.v1.Pictogram$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Pictogram fromValue(int value) {
                return Pictogram.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Pictogram.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Pictogram$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Pictogram;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Pictogram fromValue(int value) {
            switch (value) {
                case 0:
                    return Pictogram.PICTOGRAM_UNSPECIFIED;
                case 1:
                    return Pictogram.PICTOGRAM_ACCESSIBILITY;
                case 2:
                    return Pictogram.PICTOGRAM_AGENT;
                case 3:
                    return Pictogram.PICTOGRAM_BANK;
                case 4:
                    return Pictogram.PICTOGRAM_BAR_CHART;
                case 5:
                    return Pictogram.PICTOGRAM_BELL;
                case 6:
                    return Pictogram.PICTOGRAM_BILLS;
                case 7:
                    return Pictogram.PICTOGRAM_BINOCULARS;
                case 8:
                    return Pictogram.PICTOGRAM_BOOK;
                case 9:
                    return Pictogram.PICTOGRAM_BULLET;
                case 10:
                    return Pictogram.PICTOGRAM_CALENDAR;
                case 11:
                    return Pictogram.PICTOGRAM_CANCEL_CARD;
                case 12:
                    return Pictogram.PICTOGRAM_CASH;
                case 13:
                    return Pictogram.PICTOGRAM_CASH_ATM;
                case 14:
                    return Pictogram.PICTOGRAM_CASH_CALENDAR;
                case 15:
                    return Pictogram.PICTOGRAM_CASH_CONTACTLESS_PAYMENT;
                case 16:
                    return Pictogram.PICTOGRAM_CASH_DOCUMENTS;
                case 17:
                    return Pictogram.PICTOGRAM_CASH_FLOWER;
                case 18:
                    return Pictogram.PICTOGRAM_CASH_FREE;
                case 19:
                    return Pictogram.PICTOGRAM_CASH_MONEY;
                case 20:
                    return Pictogram.PICTOGRAM_CASH_PAYMENT_CARD;
                case 21:
                    return Pictogram.PICTOGRAM_CASH_SECURITY;
                case 22:
                    return Pictogram.PICTOGRAM_CASH_START;
                case 23:
                    return Pictogram.PICTOGRAM_CASH_THUMBS_UP;
                case 24:
                    return Pictogram.PICTOGRAM_CASH_UMBRELLA;
                case 25:
                    return Pictogram.PICTOGRAM_CASH_WARNING;
                case 26:
                    return Pictogram.PICTOGRAM_CHART;
                case 27:
                    return Pictogram.PICTOGRAM_CHAT;
                case 28:
                    return Pictogram.PICTOGRAM_CHATBOT;
                case 29:
                    return Pictogram.PICTOGRAM_CHECK;
                case 30:
                    return Pictogram.PICTOGRAM_CLIPBOARD;
                case 31:
                    return Pictogram.PICTOGRAM_CRYPTO;
                case 32:
                    return Pictogram.PICTOGRAM_CRYPTO_C;
                case 33:
                    return Pictogram.PICTOGRAM_CRYPTO_GIFT;
                case 34:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES;
                case 35:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT;
                case 36:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP;
                case 37:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET;
                case 38:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP;
                case 39:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP;
                case 40:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO;
                case 41:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS;
                case 42:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS;
                case 43:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT;
                case 44:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT;
                case 45:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP;
                case 46:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET;
                case 47:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP;
                case 48:
                    return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP;
                case 49:
                    return Pictogram.PICTOGRAM_DEPOSIT;
                case 50:
                    return Pictogram.PICTOGRAM_DESKTOP;
                case 51:
                    return Pictogram.PICTOGRAM_DOCUMENTS;
                case 52:
                    return Pictogram.PICTOGRAM_DOLLAR_SIGN;
                case 53:
                    return Pictogram.PICTOGRAM_ENVELOPE;
                case 54:
                    return Pictogram.PICTOGRAM_ETF;
                case 55:
                    return Pictogram.PICTOGRAM_EYE_OPEN;
                case 56:
                    return Pictogram.PICTOGRAM_FACE;
                case 57:
                    return Pictogram.PICTOGRAM_FLAG;
                case 58:
                    return Pictogram.PICTOGRAM_FLOWER;
                case 59:
                    return Pictogram.PICTOGRAM_FREE;
                case 60:
                    return Pictogram.PICTOGRAM_GIFT;
                case 61:
                    return Pictogram.PICTOGRAM_GOLD_BAR_CHART;
                case 62:
                    return Pictogram.PICTOGRAM_GOLD_CALENDAR;
                case 63:
                    return Pictogram.PICTOGRAM_GOLD_DOCUMENTS;
                case 64:
                    return Pictogram.PICTOGRAM_GOLD_GIFT;
                case 65:
                    return Pictogram.PICTOGRAM_GOLD_MARGIN;
                case 66:
                    return Pictogram.PICTOGRAM_GOLD_MONEY;
                case 67:
                    return Pictogram.PICTOGRAM_GOLD_PIGGY_BANK;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Pictogram.PICTOGRAM_GOLD_STOPWATCH;
                case 69:
                    return Pictogram.PICTOGRAM_HELP;
                case 70:
                    return Pictogram.PICTOGRAM_INVESTING;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Pictogram.PICTOGRAM_JOINT_ACCOUNTS;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Pictogram.PICTOGRAM_LIGHTBULB;
                case 73:
                    return Pictogram.PICTOGRAM_LIGHTNING;
                case 74:
                    return Pictogram.PICTOGRAM_LIST;
                case 75:
                    return Pictogram.PICTOGRAM_LIVE_CHAT;
                case 76:
                    return Pictogram.PICTOGRAM_LOCK;
                case 77:
                    return Pictogram.PICTOGRAM_MARGIN;
                case 78:
                    return Pictogram.PICTOGRAM_MEGAPHONE;
                case 79:
                    return Pictogram.PICTOGRAM_MONEY;
                case 80:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES;
                case 81:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT;
                case 82:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP;
                case 83:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_MARKET;
                case 84:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_STOP;
                case 85:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP;
                case 86:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS;
                case 87:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS;
                case 88:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT;
                case 89:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT;
                case 90:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP;
                case 91:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_MARKET;
                case 92:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_STOP;
                case 93:
                    return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP;
                case 94:
                    return Pictogram.PICTOGRAM_PAYMENT_CARD;
                case 95:
                    return Pictogram.PICTOGRAM_PAYROLL;
                case 96:
                    return Pictogram.PICTOGRAM_PERCENT_SIGN;
                case 97:
                    return Pictogram.PICTOGRAM_PERSON;
                case 98:
                    return Pictogram.PICTOGRAM_PHONE;
                case 99:
                    return Pictogram.PICTOGRAM_PIE_CHART;
                case 100:
                    return Pictogram.PICTOGRAM_PIGGY_BANK;
                case 101:
                    return Pictogram.PICTOGRAM_POUND_SIGN;
                case 102:
                    return Pictogram.PICTOGRAM_PRIME_CHART;
                case 103:
                    return Pictogram.PICTOGRAM_PRIME_DOLLAR_SIGN;
                case 104:
                    return Pictogram.PICTOGRAM_PRIME_FLAG;
                case 105:
                    return Pictogram.PICTOGRAM_PRIME_FLOWER;
                case 106:
                    return Pictogram.PICTOGRAM_PRIME_FORWARD_SPLIT;
                case 107:
                    return Pictogram.PICTOGRAM_PRIME_GIFT;
                case 108:
                    return Pictogram.PICTOGRAM_PRIME_MONEY;
                case 109:
                    return Pictogram.PICTOGRAM_PRIME_PIE_CHART;
                case 110:
                    return Pictogram.PICTOGRAM_PRIME_POUND_SIGN;
                case 111:
                    return Pictogram.PICTOGRAM_PRIME_RECURRING;
                case 112:
                    return Pictogram.PICTOGRAM_PRIME_RETIREMENT;
                case 113:
                    return Pictogram.PICTOGRAM_PRIME_REVERSE_SPLIT;
                case 114:
                    return Pictogram.PICTOGRAM_PRIME_ROBOT;
                case 115:
                    return Pictogram.PICTOGRAM_RECURRING;
                case 116:
                    return Pictogram.PICTOGRAM_RETIREMENT;
                case 117:
                    return Pictogram.PICTOGRAM_ROBINHOOD;
                case 118:
                    return Pictogram.PICTOGRAM_SMILEY;
                case 119:
                    return Pictogram.PICTOGRAM_SPARKLE;
                case 120:
                    return Pictogram.PICTOGRAM_START;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return Pictogram.PICTOGRAM_STOPWATCH;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return Pictogram.PICTOGRAM_SUBMARINE;
                case 123:
                    return Pictogram.PICTOGRAM_TRANSFER;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Pictogram.PICTOGRAM_UMBRELLA;
                case 125:
                    return Pictogram.PICTOGRAM_UNLOCK;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return Pictogram.PICTOGRAM_WARNING;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return Pictogram.PICTOGRAM_WITHDRAW;
                case 128:
                    return Pictogram.PICTOGRAM_MANAGED_ACCOUNTS;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return Pictogram.PICTOGRAM_CORTEX;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return Pictogram.PICTOGRAM_TAX_LOTS;
                case 131:
                    return Pictogram.PICTOGRAM_BASKETBALL;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Pictogram.PICTOGRAM_FOOTBALL;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return Pictogram.PICTOGRAM_HOCKEY;
                default:
                    return null;
            }
        }
    }

    public static Pictogram valueOf(String str) {
        return (Pictogram) Enum.valueOf(Pictogram.class, str);
    }

    public static Pictogram[] values() {
        return (Pictogram[]) $VALUES.clone();
    }
}
