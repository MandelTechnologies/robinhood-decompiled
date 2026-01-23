package com.robinhood.rosetta.i18n;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
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
/* compiled from: Feature.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bq\b\u0086\u0081\u0002\u0018\u0000 t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bs¨\u0006u"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Feature;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEATURE_UNSPECIFIED", "ADT", "ACATS", "ACH", "BENEFICIARY", "CASH_SWEEP", "CASH_BROKERAGE", "CRYPTO", "DEBIT_CARD_FUNDING", "DRIP", "EDUCATION", "GOLD", "GPT_SUMMARIES", "INSTANT_DEPOSITS", "INVEST_FLOW", "IPO_ACCESS", "LEVERED_MARGIN", "LIMITED_MARGIN", "LISTS", "NEWS_FEED", "OPTIONS", "P2P", "POPULAR_STOCKS", "PORTFOLIO_SHARING", "PROFILES", "PARTNER_STOCK_PROGRAM", "RECOMMENDATIONS", "RECURRING", "REFERRALS", "RETIREMENT", "RHY", "SAY", "SCREENER", "SLIP", "STOCK_REFERRALS", "TAX_CENTER", "TOP_MOVERS", "TURBO_TAX", "WIRE_TRANSFER", "CORE_BROKERAGE", "INTRA_ACCOUNT_TRANSFER", "RECURRING_DEPOSIT", "FX", "SYP", "CRYPTO_GIFTS", "CRYPTO_TRANSFER", "PAY_BY_CHECK", "INSTANT_FIRM_SETTLEMENT", "INTERNAL", "INSTANT_BANK_TRANSFER", "CHECK", "INCOMING_WIRE", "SEPA_CREDIT", "UK_BANK_TRANSFER", "OUTGOING_WIRE", "OPTIONS_WATCHLIST", "CRYPTO_CATPAY", TransferContext3.QUEUED_DEPOSIT, "ETF_TRADING", "SIGNUP_REWARD", TransferContext3.GOLD_DEPOSIT, "GOLD_AUTO_BOOST", "CROISSANT", "REFERRALS_CONTACT_RECOMMENDATION", "LEGACY_TRANSFERS", "LEGACY_PAYMENT_HUB_TRANSFERS", "US_TRANSFER", "CRYPTO_YIELDS", "UK_ACCOUNT_CENTER", "CRYPTO_LEARN_AND_EARN", "RECURRING_TRANSFERS", "APPLE_PAY_DCF", "JOINT_ACCOUNTS", "MARGIN_WITHDRAWAL", "FUTURES_TRADING", "CREDIT_CARD", "FUTURES_TRADEDATA", "CRYPTO_TRADE_BONUS", "TAX_INFO", "CRYPTO_TOKENIZED_STOCKS", "CRYPTO_ADVANCED_MODE", "ASSET_HOMES", "BLACK_WIDOW", "RESURRECTION_CRYPTO_UPSELL", "PROJECT_EAGLE", "ROLLOVER_ACH", "ADVISORY", "FAST_TRANSFER", "PROJECT_GRIDIRON", "COPILOT", "PROJECT_THIRD_MONTH_CHAOS", "EVENT_CONTRACT", "SG_CAR_ELIGIBILITY", "MULTI_CURRENCY_WALLET", "REFERRALS_CONTACT_INVITE", "CRYPTO_PERPETUALS", "SG_BANK_TRANSFER", "I18N_WIRE_TRANSFER", "FIRST_TRADE_UPSELL", "WATCHLIST_REDESIGN", "I18N_TAX_CERTIFICATION", "UK_ISA", "ISA_STOCKS_AND_SHARES", "FX_AT_TRADE", "MCW_CURRENCY_SWITCHER", "CRYPTO_READ_ONLY", "SOCIAL_TRADING", "Companion", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Feature implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Feature[] $VALUES;
    public static final Feature ACATS;
    public static final Feature ACH;

    @JvmField
    public static final ProtoAdapter<Feature> ADAPTER;
    public static final Feature ADT;
    public static final Feature ADVISORY;
    public static final Feature APPLE_PAY_DCF;
    public static final Feature ASSET_HOMES;
    public static final Feature BENEFICIARY;
    public static final Feature BLACK_WIDOW;
    public static final Feature CASH_BROKERAGE;
    public static final Feature CASH_SWEEP;
    public static final Feature CHECK;
    public static final Feature COPILOT;
    public static final Feature CORE_BROKERAGE;
    public static final Feature CREDIT_CARD;
    public static final Feature CROISSANT;
    public static final Feature CRYPTO;
    public static final Feature CRYPTO_ADVANCED_MODE;
    public static final Feature CRYPTO_CATPAY;
    public static final Feature CRYPTO_GIFTS;
    public static final Feature CRYPTO_LEARN_AND_EARN;
    public static final Feature CRYPTO_PERPETUALS;
    public static final Feature CRYPTO_READ_ONLY;
    public static final Feature CRYPTO_TOKENIZED_STOCKS;
    public static final Feature CRYPTO_TRADE_BONUS;
    public static final Feature CRYPTO_TRANSFER;
    public static final Feature CRYPTO_YIELDS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Feature DEBIT_CARD_FUNDING;
    public static final Feature DRIP;
    public static final Feature EDUCATION;
    public static final Feature ETF_TRADING;
    public static final Feature EVENT_CONTRACT;
    public static final Feature FAST_TRANSFER;
    public static final Feature FEATURE_UNSPECIFIED;
    public static final Feature FIRST_TRADE_UPSELL;
    public static final Feature FUTURES_TRADEDATA;
    public static final Feature FUTURES_TRADING;

    /* renamed from: FX */
    public static final Feature f6068FX;
    public static final Feature FX_AT_TRADE;
    public static final Feature GOLD;
    public static final Feature GOLD_AUTO_BOOST;
    public static final Feature GOLD_DEPOSIT;
    public static final Feature GPT_SUMMARIES;
    public static final Feature I18N_TAX_CERTIFICATION;
    public static final Feature I18N_WIRE_TRANSFER;
    public static final Feature INCOMING_WIRE;
    public static final Feature INSTANT_BANK_TRANSFER;
    public static final Feature INSTANT_DEPOSITS;
    public static final Feature INSTANT_FIRM_SETTLEMENT;
    public static final Feature INTERNAL;
    public static final Feature INTRA_ACCOUNT_TRANSFER;
    public static final Feature INVEST_FLOW;
    public static final Feature IPO_ACCESS;
    public static final Feature ISA_STOCKS_AND_SHARES;
    public static final Feature JOINT_ACCOUNTS;
    public static final Feature LEGACY_PAYMENT_HUB_TRANSFERS;
    public static final Feature LEGACY_TRANSFERS;
    public static final Feature LEVERED_MARGIN;
    public static final Feature LIMITED_MARGIN;
    public static final Feature LISTS;
    public static final Feature MARGIN_WITHDRAWAL;
    public static final Feature MCW_CURRENCY_SWITCHER;
    public static final Feature MULTI_CURRENCY_WALLET;
    public static final Feature NEWS_FEED;
    public static final Feature OPTIONS;
    public static final Feature OPTIONS_WATCHLIST;
    public static final Feature OUTGOING_WIRE;
    public static final Feature P2P;
    public static final Feature PARTNER_STOCK_PROGRAM;
    public static final Feature PAY_BY_CHECK;
    public static final Feature POPULAR_STOCKS;
    public static final Feature PORTFOLIO_SHARING;
    public static final Feature PROFILES;
    public static final Feature PROJECT_EAGLE;
    public static final Feature PROJECT_GRIDIRON;
    public static final Feature PROJECT_THIRD_MONTH_CHAOS;
    public static final Feature QUEUED_DEPOSIT;
    public static final Feature RECOMMENDATIONS;
    public static final Feature RECURRING;
    public static final Feature RECURRING_DEPOSIT;
    public static final Feature RECURRING_TRANSFERS;
    public static final Feature REFERRALS;
    public static final Feature REFERRALS_CONTACT_INVITE;
    public static final Feature REFERRALS_CONTACT_RECOMMENDATION;
    public static final Feature RESURRECTION_CRYPTO_UPSELL;
    public static final Feature RETIREMENT;
    public static final Feature RHY;
    public static final Feature ROLLOVER_ACH;
    public static final Feature SAY;
    public static final Feature SCREENER;
    public static final Feature SEPA_CREDIT;
    public static final Feature SG_BANK_TRANSFER;
    public static final Feature SG_CAR_ELIGIBILITY;
    public static final Feature SIGNUP_REWARD;
    public static final Feature SLIP;
    public static final Feature SOCIAL_TRADING;
    public static final Feature STOCK_REFERRALS;
    public static final Feature SYP;
    public static final Feature TAX_CENTER;
    public static final Feature TAX_INFO;
    public static final Feature TOP_MOVERS;
    public static final Feature TURBO_TAX;
    public static final Feature UK_ACCOUNT_CENTER;
    public static final Feature UK_BANK_TRANSFER;
    public static final Feature UK_ISA;
    public static final Feature US_TRANSFER;
    public static final Feature WATCHLIST_REDESIGN;
    public static final Feature WIRE_TRANSFER;
    private final int value;

    private static final /* synthetic */ Feature[] $values() {
        return new Feature[]{FEATURE_UNSPECIFIED, ADT, ACATS, ACH, BENEFICIARY, CASH_SWEEP, CASH_BROKERAGE, CRYPTO, DEBIT_CARD_FUNDING, DRIP, EDUCATION, GOLD, GPT_SUMMARIES, INSTANT_DEPOSITS, INVEST_FLOW, IPO_ACCESS, LEVERED_MARGIN, LIMITED_MARGIN, LISTS, NEWS_FEED, OPTIONS, P2P, POPULAR_STOCKS, PORTFOLIO_SHARING, PROFILES, PARTNER_STOCK_PROGRAM, RECOMMENDATIONS, RECURRING, REFERRALS, RETIREMENT, RHY, SAY, SCREENER, SLIP, STOCK_REFERRALS, TAX_CENTER, TOP_MOVERS, TURBO_TAX, WIRE_TRANSFER, CORE_BROKERAGE, INTRA_ACCOUNT_TRANSFER, RECURRING_DEPOSIT, f6068FX, SYP, CRYPTO_GIFTS, CRYPTO_TRANSFER, PAY_BY_CHECK, INSTANT_FIRM_SETTLEMENT, INTERNAL, INSTANT_BANK_TRANSFER, CHECK, INCOMING_WIRE, SEPA_CREDIT, UK_BANK_TRANSFER, OUTGOING_WIRE, OPTIONS_WATCHLIST, CRYPTO_CATPAY, QUEUED_DEPOSIT, ETF_TRADING, SIGNUP_REWARD, GOLD_DEPOSIT, GOLD_AUTO_BOOST, CROISSANT, REFERRALS_CONTACT_RECOMMENDATION, LEGACY_TRANSFERS, LEGACY_PAYMENT_HUB_TRANSFERS, US_TRANSFER, CRYPTO_YIELDS, UK_ACCOUNT_CENTER, CRYPTO_LEARN_AND_EARN, RECURRING_TRANSFERS, APPLE_PAY_DCF, JOINT_ACCOUNTS, MARGIN_WITHDRAWAL, FUTURES_TRADING, CREDIT_CARD, FUTURES_TRADEDATA, CRYPTO_TRADE_BONUS, TAX_INFO, CRYPTO_TOKENIZED_STOCKS, CRYPTO_ADVANCED_MODE, ASSET_HOMES, BLACK_WIDOW, RESURRECTION_CRYPTO_UPSELL, PROJECT_EAGLE, ROLLOVER_ACH, ADVISORY, FAST_TRANSFER, PROJECT_GRIDIRON, COPILOT, PROJECT_THIRD_MONTH_CHAOS, EVENT_CONTRACT, SG_CAR_ELIGIBILITY, MULTI_CURRENCY_WALLET, REFERRALS_CONTACT_INVITE, CRYPTO_PERPETUALS, SG_BANK_TRANSFER, I18N_WIRE_TRANSFER, FIRST_TRADE_UPSELL, WATCHLIST_REDESIGN, I18N_TAX_CERTIFICATION, UK_ISA, ISA_STOCKS_AND_SHARES, FX_AT_TRADE, MCW_CURRENCY_SWITCHER, CRYPTO_READ_ONLY, SOCIAL_TRADING};
    }

    @JvmStatic
    public static final Feature fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Feature> getEntries() {
        return $ENTRIES;
    }

    private Feature(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Feature feature = new Feature("FEATURE_UNSPECIFIED", 0, 0);
        FEATURE_UNSPECIFIED = feature;
        ADT = new Feature("ADT", 1, 1);
        ACATS = new Feature("ACATS", 2, 2);
        ACH = new Feature("ACH", 3, 3);
        BENEFICIARY = new Feature("BENEFICIARY", 4, 4);
        CASH_SWEEP = new Feature("CASH_SWEEP", 5, 5);
        CASH_BROKERAGE = new Feature("CASH_BROKERAGE", 6, 6);
        CRYPTO = new Feature("CRYPTO", 7, 7);
        DEBIT_CARD_FUNDING = new Feature("DEBIT_CARD_FUNDING", 8, 8);
        DRIP = new Feature("DRIP", 9, 9);
        EDUCATION = new Feature("EDUCATION", 10, 10);
        GOLD = new Feature("GOLD", 11, 11);
        GPT_SUMMARIES = new Feature("GPT_SUMMARIES", 12, 12);
        INSTANT_DEPOSITS = new Feature("INSTANT_DEPOSITS", 13, 13);
        INVEST_FLOW = new Feature("INVEST_FLOW", 14, 14);
        IPO_ACCESS = new Feature("IPO_ACCESS", 15, 15);
        LEVERED_MARGIN = new Feature("LEVERED_MARGIN", 16, 16);
        LIMITED_MARGIN = new Feature("LIMITED_MARGIN", 17, 17);
        LISTS = new Feature("LISTS", 18, 18);
        NEWS_FEED = new Feature("NEWS_FEED", 19, 19);
        OPTIONS = new Feature("OPTIONS", 20, 20);
        P2P = new Feature("P2P", 21, 21);
        POPULAR_STOCKS = new Feature("POPULAR_STOCKS", 22, 22);
        PORTFOLIO_SHARING = new Feature("PORTFOLIO_SHARING", 23, 23);
        PROFILES = new Feature("PROFILES", 24, 24);
        PARTNER_STOCK_PROGRAM = new Feature("PARTNER_STOCK_PROGRAM", 25, 25);
        RECOMMENDATIONS = new Feature("RECOMMENDATIONS", 26, 26);
        RECURRING = new Feature("RECURRING", 27, 27);
        REFERRALS = new Feature("REFERRALS", 28, 28);
        RETIREMENT = new Feature("RETIREMENT", 29, 29);
        RHY = new Feature("RHY", 30, 30);
        SAY = new Feature("SAY", 31, 31);
        SCREENER = new Feature("SCREENER", 32, 32);
        SLIP = new Feature("SLIP", 33, 33);
        STOCK_REFERRALS = new Feature("STOCK_REFERRALS", 34, 34);
        TAX_CENTER = new Feature("TAX_CENTER", 35, 35);
        TOP_MOVERS = new Feature("TOP_MOVERS", 36, 36);
        TURBO_TAX = new Feature("TURBO_TAX", 37, 37);
        WIRE_TRANSFER = new Feature("WIRE_TRANSFER", 38, 38);
        CORE_BROKERAGE = new Feature("CORE_BROKERAGE", 39, 39);
        INTRA_ACCOUNT_TRANSFER = new Feature("INTRA_ACCOUNT_TRANSFER", 40, 40);
        RECURRING_DEPOSIT = new Feature("RECURRING_DEPOSIT", 41, 41);
        f6068FX = new Feature("FX", 42, 42);
        SYP = new Feature("SYP", 43, 43);
        CRYPTO_GIFTS = new Feature("CRYPTO_GIFTS", 44, 44);
        CRYPTO_TRANSFER = new Feature("CRYPTO_TRANSFER", 45, 45);
        PAY_BY_CHECK = new Feature("PAY_BY_CHECK", 46, 46);
        INSTANT_FIRM_SETTLEMENT = new Feature("INSTANT_FIRM_SETTLEMENT", 47, 47);
        INTERNAL = new Feature("INTERNAL", 48, 48);
        INSTANT_BANK_TRANSFER = new Feature("INSTANT_BANK_TRANSFER", 49, 49);
        CHECK = new Feature("CHECK", 50, 50);
        INCOMING_WIRE = new Feature("INCOMING_WIRE", 51, 51);
        SEPA_CREDIT = new Feature("SEPA_CREDIT", 52, 52);
        UK_BANK_TRANSFER = new Feature("UK_BANK_TRANSFER", 53, 53);
        OUTGOING_WIRE = new Feature("OUTGOING_WIRE", 54, 54);
        OPTIONS_WATCHLIST = new Feature("OPTIONS_WATCHLIST", 55, 55);
        CRYPTO_CATPAY = new Feature("CRYPTO_CATPAY", 56, 56);
        QUEUED_DEPOSIT = new Feature(TransferContext3.QUEUED_DEPOSIT, 57, 57);
        ETF_TRADING = new Feature("ETF_TRADING", 58, 58);
        SIGNUP_REWARD = new Feature("SIGNUP_REWARD", 59, 59);
        GOLD_DEPOSIT = new Feature(TransferContext3.GOLD_DEPOSIT, 60, 60);
        GOLD_AUTO_BOOST = new Feature("GOLD_AUTO_BOOST", 61, 61);
        CROISSANT = new Feature("CROISSANT", 62, 62);
        REFERRALS_CONTACT_RECOMMENDATION = new Feature("REFERRALS_CONTACT_RECOMMENDATION", 63, 63);
        LEGACY_TRANSFERS = new Feature("LEGACY_TRANSFERS", 64, 64);
        LEGACY_PAYMENT_HUB_TRANSFERS = new Feature("LEGACY_PAYMENT_HUB_TRANSFERS", 65, 65);
        US_TRANSFER = new Feature("US_TRANSFER", 66, 66);
        CRYPTO_YIELDS = new Feature("CRYPTO_YIELDS", 67, 67);
        UK_ACCOUNT_CENTER = new Feature("UK_ACCOUNT_CENTER", 68, 68);
        CRYPTO_LEARN_AND_EARN = new Feature("CRYPTO_LEARN_AND_EARN", 69, 69);
        RECURRING_TRANSFERS = new Feature("RECURRING_TRANSFERS", 70, 70);
        APPLE_PAY_DCF = new Feature("APPLE_PAY_DCF", 71, 71);
        JOINT_ACCOUNTS = new Feature("JOINT_ACCOUNTS", 72, 72);
        MARGIN_WITHDRAWAL = new Feature("MARGIN_WITHDRAWAL", 73, 73);
        FUTURES_TRADING = new Feature("FUTURES_TRADING", 74, 74);
        CREDIT_CARD = new Feature("CREDIT_CARD", 75, 75);
        FUTURES_TRADEDATA = new Feature("FUTURES_TRADEDATA", 76, 76);
        CRYPTO_TRADE_BONUS = new Feature("CRYPTO_TRADE_BONUS", 77, 77);
        TAX_INFO = new Feature("TAX_INFO", 78, 78);
        CRYPTO_TOKENIZED_STOCKS = new Feature("CRYPTO_TOKENIZED_STOCKS", 79, 79);
        CRYPTO_ADVANCED_MODE = new Feature("CRYPTO_ADVANCED_MODE", 80, 80);
        ASSET_HOMES = new Feature("ASSET_HOMES", 81, 81);
        BLACK_WIDOW = new Feature("BLACK_WIDOW", 82, 82);
        RESURRECTION_CRYPTO_UPSELL = new Feature("RESURRECTION_CRYPTO_UPSELL", 83, 83);
        PROJECT_EAGLE = new Feature("PROJECT_EAGLE", 84, 84);
        ROLLOVER_ACH = new Feature("ROLLOVER_ACH", 85, 85);
        ADVISORY = new Feature("ADVISORY", 86, 86);
        FAST_TRANSFER = new Feature("FAST_TRANSFER", 87, 87);
        PROJECT_GRIDIRON = new Feature("PROJECT_GRIDIRON", 88, 88);
        COPILOT = new Feature("COPILOT", 89, 89);
        PROJECT_THIRD_MONTH_CHAOS = new Feature("PROJECT_THIRD_MONTH_CHAOS", 90, 90);
        EVENT_CONTRACT = new Feature("EVENT_CONTRACT", 91, 91);
        SG_CAR_ELIGIBILITY = new Feature("SG_CAR_ELIGIBILITY", 92, 92);
        MULTI_CURRENCY_WALLET = new Feature("MULTI_CURRENCY_WALLET", 93, 93);
        REFERRALS_CONTACT_INVITE = new Feature("REFERRALS_CONTACT_INVITE", 94, 94);
        CRYPTO_PERPETUALS = new Feature("CRYPTO_PERPETUALS", 95, 95);
        SG_BANK_TRANSFER = new Feature("SG_BANK_TRANSFER", 96, 96);
        I18N_WIRE_TRANSFER = new Feature("I18N_WIRE_TRANSFER", 97, 97);
        FIRST_TRADE_UPSELL = new Feature("FIRST_TRADE_UPSELL", 98, 98);
        WATCHLIST_REDESIGN = new Feature("WATCHLIST_REDESIGN", 99, 99);
        I18N_TAX_CERTIFICATION = new Feature("I18N_TAX_CERTIFICATION", 100, 100);
        UK_ISA = new Feature("UK_ISA", 101, 101);
        ISA_STOCKS_AND_SHARES = new Feature("ISA_STOCKS_AND_SHARES", 102, 102);
        FX_AT_TRADE = new Feature("FX_AT_TRADE", 103, 103);
        MCW_CURRENCY_SWITCHER = new Feature("MCW_CURRENCY_SWITCHER", 104, 104);
        CRYPTO_READ_ONLY = new Feature("CRYPTO_READ_ONLY", 105, 105);
        SOCIAL_TRADING = new Feature("SOCIAL_TRADING", 106, 106);
        Feature[] featureArr$values = $values();
        $VALUES = featureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(featureArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Feature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Feature>(orCreateKotlinClass, syntax, feature) { // from class: com.robinhood.rosetta.i18n.Feature$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Feature fromValue(int value) {
                return Feature.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Feature.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Feature$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/i18n/Feature;", "fromValue", "value", "", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Feature fromValue(int value) {
            switch (value) {
                case 0:
                    return Feature.FEATURE_UNSPECIFIED;
                case 1:
                    return Feature.ADT;
                case 2:
                    return Feature.ACATS;
                case 3:
                    return Feature.ACH;
                case 4:
                    return Feature.BENEFICIARY;
                case 5:
                    return Feature.CASH_SWEEP;
                case 6:
                    return Feature.CASH_BROKERAGE;
                case 7:
                    return Feature.CRYPTO;
                case 8:
                    return Feature.DEBIT_CARD_FUNDING;
                case 9:
                    return Feature.DRIP;
                case 10:
                    return Feature.EDUCATION;
                case 11:
                    return Feature.GOLD;
                case 12:
                    return Feature.GPT_SUMMARIES;
                case 13:
                    return Feature.INSTANT_DEPOSITS;
                case 14:
                    return Feature.INVEST_FLOW;
                case 15:
                    return Feature.IPO_ACCESS;
                case 16:
                    return Feature.LEVERED_MARGIN;
                case 17:
                    return Feature.LIMITED_MARGIN;
                case 18:
                    return Feature.LISTS;
                case 19:
                    return Feature.NEWS_FEED;
                case 20:
                    return Feature.OPTIONS;
                case 21:
                    return Feature.P2P;
                case 22:
                    return Feature.POPULAR_STOCKS;
                case 23:
                    return Feature.PORTFOLIO_SHARING;
                case 24:
                    return Feature.PROFILES;
                case 25:
                    return Feature.PARTNER_STOCK_PROGRAM;
                case 26:
                    return Feature.RECOMMENDATIONS;
                case 27:
                    return Feature.RECURRING;
                case 28:
                    return Feature.REFERRALS;
                case 29:
                    return Feature.RETIREMENT;
                case 30:
                    return Feature.RHY;
                case 31:
                    return Feature.SAY;
                case 32:
                    return Feature.SCREENER;
                case 33:
                    return Feature.SLIP;
                case 34:
                    return Feature.STOCK_REFERRALS;
                case 35:
                    return Feature.TAX_CENTER;
                case 36:
                    return Feature.TOP_MOVERS;
                case 37:
                    return Feature.TURBO_TAX;
                case 38:
                    return Feature.WIRE_TRANSFER;
                case 39:
                    return Feature.CORE_BROKERAGE;
                case 40:
                    return Feature.INTRA_ACCOUNT_TRANSFER;
                case 41:
                    return Feature.RECURRING_DEPOSIT;
                case 42:
                    return Feature.f6068FX;
                case 43:
                    return Feature.SYP;
                case 44:
                    return Feature.CRYPTO_GIFTS;
                case 45:
                    return Feature.CRYPTO_TRANSFER;
                case 46:
                    return Feature.PAY_BY_CHECK;
                case 47:
                    return Feature.INSTANT_FIRM_SETTLEMENT;
                case 48:
                    return Feature.INTERNAL;
                case 49:
                    return Feature.INSTANT_BANK_TRANSFER;
                case 50:
                    return Feature.CHECK;
                case 51:
                    return Feature.INCOMING_WIRE;
                case 52:
                    return Feature.SEPA_CREDIT;
                case 53:
                    return Feature.UK_BANK_TRANSFER;
                case 54:
                    return Feature.OUTGOING_WIRE;
                case 55:
                    return Feature.OPTIONS_WATCHLIST;
                case 56:
                    return Feature.CRYPTO_CATPAY;
                case 57:
                    return Feature.QUEUED_DEPOSIT;
                case 58:
                    return Feature.ETF_TRADING;
                case 59:
                    return Feature.SIGNUP_REWARD;
                case 60:
                    return Feature.GOLD_DEPOSIT;
                case 61:
                    return Feature.GOLD_AUTO_BOOST;
                case 62:
                    return Feature.CROISSANT;
                case 63:
                    return Feature.REFERRALS_CONTACT_RECOMMENDATION;
                case 64:
                    return Feature.LEGACY_TRANSFERS;
                case 65:
                    return Feature.LEGACY_PAYMENT_HUB_TRANSFERS;
                case 66:
                    return Feature.US_TRANSFER;
                case 67:
                    return Feature.CRYPTO_YIELDS;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Feature.UK_ACCOUNT_CENTER;
                case 69:
                    return Feature.CRYPTO_LEARN_AND_EARN;
                case 70:
                    return Feature.RECURRING_TRANSFERS;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Feature.APPLE_PAY_DCF;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Feature.JOINT_ACCOUNTS;
                case 73:
                    return Feature.MARGIN_WITHDRAWAL;
                case 74:
                    return Feature.FUTURES_TRADING;
                case 75:
                    return Feature.CREDIT_CARD;
                case 76:
                    return Feature.FUTURES_TRADEDATA;
                case 77:
                    return Feature.CRYPTO_TRADE_BONUS;
                case 78:
                    return Feature.TAX_INFO;
                case 79:
                    return Feature.CRYPTO_TOKENIZED_STOCKS;
                case 80:
                    return Feature.CRYPTO_ADVANCED_MODE;
                case 81:
                    return Feature.ASSET_HOMES;
                case 82:
                    return Feature.BLACK_WIDOW;
                case 83:
                    return Feature.RESURRECTION_CRYPTO_UPSELL;
                case 84:
                    return Feature.PROJECT_EAGLE;
                case 85:
                    return Feature.ROLLOVER_ACH;
                case 86:
                    return Feature.ADVISORY;
                case 87:
                    return Feature.FAST_TRANSFER;
                case 88:
                    return Feature.PROJECT_GRIDIRON;
                case 89:
                    return Feature.COPILOT;
                case 90:
                    return Feature.PROJECT_THIRD_MONTH_CHAOS;
                case 91:
                    return Feature.EVENT_CONTRACT;
                case 92:
                    return Feature.SG_CAR_ELIGIBILITY;
                case 93:
                    return Feature.MULTI_CURRENCY_WALLET;
                case 94:
                    return Feature.REFERRALS_CONTACT_INVITE;
                case 95:
                    return Feature.CRYPTO_PERPETUALS;
                case 96:
                    return Feature.SG_BANK_TRANSFER;
                case 97:
                    return Feature.I18N_WIRE_TRANSFER;
                case 98:
                    return Feature.FIRST_TRADE_UPSELL;
                case 99:
                    return Feature.WATCHLIST_REDESIGN;
                case 100:
                    return Feature.I18N_TAX_CERTIFICATION;
                case 101:
                    return Feature.UK_ISA;
                case 102:
                    return Feature.ISA_STOCKS_AND_SHARES;
                case 103:
                    return Feature.FX_AT_TRADE;
                case 104:
                    return Feature.MCW_CURRENCY_SWITCHER;
                case 105:
                    return Feature.CRYPTO_READ_ONLY;
                case 106:
                    return Feature.SOCIAL_TRADING;
                default:
                    return null;
            }
        }
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }
}
