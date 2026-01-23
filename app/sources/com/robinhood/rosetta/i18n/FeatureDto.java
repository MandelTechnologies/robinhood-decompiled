package com.robinhood.rosetta.i18n;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bp\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 }2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002}~B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{H\u0016J\b\u0010|\u001a\u00020{H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\bu¨\u0006\u007f"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/FeatureDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/i18n/Feature;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "FEATURE_UNSPECIFIED", "ADT", "ACATS", "ACH", "BENEFICIARY", "CASH_SWEEP", "CASH_BROKERAGE", "CRYPTO", "DEBIT_CARD_FUNDING", "DRIP", "EDUCATION", "GOLD", "GPT_SUMMARIES", "INSTANT_DEPOSITS", "INVEST_FLOW", "IPO_ACCESS", "LEVERED_MARGIN", "LIMITED_MARGIN", "LISTS", "NEWS_FEED", "OPTIONS", "P2P", "POPULAR_STOCKS", "PORTFOLIO_SHARING", "PROFILES", "PARTNER_STOCK_PROGRAM", "RECOMMENDATIONS", "RECURRING", "REFERRALS", "RETIREMENT", "RHY", "SAY", "SCREENER", "SLIP", "STOCK_REFERRALS", "TAX_CENTER", "TOP_MOVERS", "TURBO_TAX", "WIRE_TRANSFER", "CORE_BROKERAGE", "INTRA_ACCOUNT_TRANSFER", "RECURRING_DEPOSIT", "FX", "SYP", "CRYPTO_GIFTS", "CRYPTO_TRANSFER", "PAY_BY_CHECK", "INSTANT_FIRM_SETTLEMENT", "INTERNAL", "INSTANT_BANK_TRANSFER", "CHECK", "INCOMING_WIRE", "SEPA_CREDIT", "UK_BANK_TRANSFER", "OUTGOING_WIRE", "OPTIONS_WATCHLIST", "CRYPTO_CATPAY", TransferContext3.QUEUED_DEPOSIT, "ETF_TRADING", "SIGNUP_REWARD", TransferContext3.GOLD_DEPOSIT, "GOLD_AUTO_BOOST", "CROISSANT", "REFERRALS_CONTACT_RECOMMENDATION", "LEGACY_TRANSFERS", "LEGACY_PAYMENT_HUB_TRANSFERS", "US_TRANSFER", "CRYPTO_YIELDS", "UK_ACCOUNT_CENTER", "CRYPTO_LEARN_AND_EARN", "RECURRING_TRANSFERS", "APPLE_PAY_DCF", "JOINT_ACCOUNTS", "MARGIN_WITHDRAWAL", "FUTURES_TRADING", "CREDIT_CARD", "FUTURES_TRADEDATA", "CRYPTO_TRADE_BONUS", "TAX_INFO", "CRYPTO_TOKENIZED_STOCKS", "CRYPTO_ADVANCED_MODE", "ASSET_HOMES", "BLACK_WIDOW", "RESURRECTION_CRYPTO_UPSELL", "PROJECT_EAGLE", "ROLLOVER_ACH", "ADVISORY", "FAST_TRANSFER", "PROJECT_GRIDIRON", "COPILOT", "PROJECT_THIRD_MONTH_CHAOS", "EVENT_CONTRACT", "SG_CAR_ELIGIBILITY", "MULTI_CURRENCY_WALLET", "REFERRALS_CONTACT_INVITE", "CRYPTO_PERPETUALS", "SG_BANK_TRANSFER", "I18N_WIRE_TRANSFER", "FIRST_TRADE_UPSELL", "WATCHLIST_REDESIGN", "I18N_TAX_CERTIFICATION", "UK_ISA", "ISA_STOCKS_AND_SHARES", "FX_AT_TRADE", "MCW_CURRENCY_SWITCHER", "CRYPTO_READ_ONLY", "SOCIAL_TRADING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public abstract class FeatureDto implements Dto2<Feature>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeatureDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FeatureDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeatureDto, Feature>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final FeatureDto FEATURE_UNSPECIFIED = new FeatureDto("FEATURE_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FEATURE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FEATURE_UNSPECIFIED;
        }
    };
    public static final FeatureDto ADT = new FeatureDto("ADT", 1) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ADT
        {
            String str = "ADT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ADT;
        }
    };
    public static final FeatureDto ACATS = new FeatureDto("ACATS", 2) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ACATS
        {
            String str = "ACATS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ACATS;
        }
    };
    public static final FeatureDto ACH = new FeatureDto("ACH", 3) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ACH
        {
            String str = "ACH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ACH;
        }
    };
    public static final FeatureDto BENEFICIARY = new FeatureDto("BENEFICIARY", 4) { // from class: com.robinhood.rosetta.i18n.FeatureDto.BENEFICIARY
        {
            String str = "BENEFICIARY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.BENEFICIARY;
        }
    };
    public static final FeatureDto CASH_SWEEP = new FeatureDto("CASH_SWEEP", 5) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CASH_SWEEP
        {
            String str = "CASH_SWEEP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CASH_SWEEP;
        }
    };
    public static final FeatureDto CASH_BROKERAGE = new FeatureDto("CASH_BROKERAGE", 6) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CASH_BROKERAGE
        {
            String str = "CASH_BROKERAGE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CASH_BROKERAGE;
        }
    };
    public static final FeatureDto CRYPTO = new FeatureDto("CRYPTO", 7) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO
        {
            String str = "CRYPTO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO;
        }
    };
    public static final FeatureDto DEBIT_CARD_FUNDING = new FeatureDto("DEBIT_CARD_FUNDING", 8) { // from class: com.robinhood.rosetta.i18n.FeatureDto.DEBIT_CARD_FUNDING
        {
            String str = "DEBIT_CARD_FUNDING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.DEBIT_CARD_FUNDING;
        }
    };
    public static final FeatureDto DRIP = new FeatureDto("DRIP", 9) { // from class: com.robinhood.rosetta.i18n.FeatureDto.DRIP
        {
            String str = "DRIP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.DRIP;
        }
    };
    public static final FeatureDto EDUCATION = new FeatureDto("EDUCATION", 10) { // from class: com.robinhood.rosetta.i18n.FeatureDto.EDUCATION
        {
            String str = "EDUCATION";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.EDUCATION;
        }
    };
    public static final FeatureDto GOLD = new FeatureDto("GOLD", 11) { // from class: com.robinhood.rosetta.i18n.FeatureDto.GOLD
        {
            String str = "GOLD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.GOLD;
        }
    };
    public static final FeatureDto GPT_SUMMARIES = new FeatureDto("GPT_SUMMARIES", 12) { // from class: com.robinhood.rosetta.i18n.FeatureDto.GPT_SUMMARIES
        {
            String str = "GPT_SUMMARIES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.GPT_SUMMARIES;
        }
    };
    public static final FeatureDto INSTANT_DEPOSITS = new FeatureDto("INSTANT_DEPOSITS", 13) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INSTANT_DEPOSITS
        {
            String str = "INSTANT_DEPOSITS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INSTANT_DEPOSITS;
        }
    };
    public static final FeatureDto INVEST_FLOW = new FeatureDto("INVEST_FLOW", 14) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INVEST_FLOW
        {
            String str = "INVEST_FLOW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INVEST_FLOW;
        }
    };
    public static final FeatureDto IPO_ACCESS = new FeatureDto("IPO_ACCESS", 15) { // from class: com.robinhood.rosetta.i18n.FeatureDto.IPO_ACCESS
        {
            String str = "IPO_ACCESS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.IPO_ACCESS;
        }
    };
    public static final FeatureDto LEVERED_MARGIN = new FeatureDto("LEVERED_MARGIN", 16) { // from class: com.robinhood.rosetta.i18n.FeatureDto.LEVERED_MARGIN
        {
            String str = "LEVERED_MARGIN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.LEVERED_MARGIN;
        }
    };
    public static final FeatureDto LIMITED_MARGIN = new FeatureDto("LIMITED_MARGIN", 17) { // from class: com.robinhood.rosetta.i18n.FeatureDto.LIMITED_MARGIN
        {
            String str = "LIMITED_MARGIN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.LIMITED_MARGIN;
        }
    };
    public static final FeatureDto LISTS = new FeatureDto("LISTS", 18) { // from class: com.robinhood.rosetta.i18n.FeatureDto.LISTS
        {
            String str = "LISTS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.LISTS;
        }
    };
    public static final FeatureDto NEWS_FEED = new FeatureDto("NEWS_FEED", 19) { // from class: com.robinhood.rosetta.i18n.FeatureDto.NEWS_FEED
        {
            String str = "NEWS_FEED";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.NEWS_FEED;
        }
    };
    public static final FeatureDto OPTIONS = new FeatureDto("OPTIONS", 20) { // from class: com.robinhood.rosetta.i18n.FeatureDto.OPTIONS
        {
            String str = "OPTIONS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.OPTIONS;
        }
    };
    public static final FeatureDto P2P = new FeatureDto("P2P", 21) { // from class: com.robinhood.rosetta.i18n.FeatureDto.P2P
        {
            String str = "P2P";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.P2P;
        }
    };
    public static final FeatureDto POPULAR_STOCKS = new FeatureDto("POPULAR_STOCKS", 22) { // from class: com.robinhood.rosetta.i18n.FeatureDto.POPULAR_STOCKS
        {
            String str = "POPULAR_STOCKS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.POPULAR_STOCKS;
        }
    };
    public static final FeatureDto PORTFOLIO_SHARING = new FeatureDto("PORTFOLIO_SHARING", 23) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PORTFOLIO_SHARING
        {
            String str = "PORTFOLIO_SHARING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PORTFOLIO_SHARING;
        }
    };
    public static final FeatureDto PROFILES = new FeatureDto("PROFILES", 24) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PROFILES
        {
            String str = "PROFILES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PROFILES;
        }
    };
    public static final FeatureDto PARTNER_STOCK_PROGRAM = new FeatureDto("PARTNER_STOCK_PROGRAM", 25) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PARTNER_STOCK_PROGRAM
        {
            String str = "PARTNER_STOCK_PROGRAM";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PARTNER_STOCK_PROGRAM;
        }
    };
    public static final FeatureDto RECOMMENDATIONS = new FeatureDto("RECOMMENDATIONS", 26) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RECOMMENDATIONS
        {
            String str = "RECOMMENDATIONS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RECOMMENDATIONS;
        }
    };
    public static final FeatureDto RECURRING = new FeatureDto("RECURRING", 27) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RECURRING
        {
            String str = "RECURRING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RECURRING;
        }
    };
    public static final FeatureDto REFERRALS = new FeatureDto("REFERRALS", 28) { // from class: com.robinhood.rosetta.i18n.FeatureDto.REFERRALS
        {
            String str = "REFERRALS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.REFERRALS;
        }
    };
    public static final FeatureDto RETIREMENT = new FeatureDto("RETIREMENT", 29) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RETIREMENT
        {
            String str = "RETIREMENT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RETIREMENT;
        }
    };
    public static final FeatureDto RHY = new FeatureDto("RHY", 30) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RHY
        {
            String str = "RHY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RHY;
        }
    };
    public static final FeatureDto SAY = new FeatureDto("SAY", 31) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SAY
        {
            String str = "SAY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SAY;
        }
    };
    public static final FeatureDto SCREENER = new FeatureDto("SCREENER", 32) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SCREENER
        {
            String str = "SCREENER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SCREENER;
        }
    };
    public static final FeatureDto SLIP = new FeatureDto("SLIP", 33) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SLIP
        {
            String str = "SLIP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SLIP;
        }
    };
    public static final FeatureDto STOCK_REFERRALS = new FeatureDto("STOCK_REFERRALS", 34) { // from class: com.robinhood.rosetta.i18n.FeatureDto.STOCK_REFERRALS
        {
            String str = "STOCK_REFERRALS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.STOCK_REFERRALS;
        }
    };
    public static final FeatureDto TAX_CENTER = new FeatureDto("TAX_CENTER", 35) { // from class: com.robinhood.rosetta.i18n.FeatureDto.TAX_CENTER
        {
            String str = "TAX_CENTER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.TAX_CENTER;
        }
    };
    public static final FeatureDto TOP_MOVERS = new FeatureDto("TOP_MOVERS", 36) { // from class: com.robinhood.rosetta.i18n.FeatureDto.TOP_MOVERS
        {
            String str = "TOP_MOVERS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.TOP_MOVERS;
        }
    };
    public static final FeatureDto TURBO_TAX = new FeatureDto("TURBO_TAX", 37) { // from class: com.robinhood.rosetta.i18n.FeatureDto.TURBO_TAX
        {
            String str = "TURBO_TAX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.TURBO_TAX;
        }
    };
    public static final FeatureDto WIRE_TRANSFER = new FeatureDto("WIRE_TRANSFER", 38) { // from class: com.robinhood.rosetta.i18n.FeatureDto.WIRE_TRANSFER
        {
            String str = "WIRE_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.WIRE_TRANSFER;
        }
    };
    public static final FeatureDto CORE_BROKERAGE = new FeatureDto("CORE_BROKERAGE", 39) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CORE_BROKERAGE
        {
            String str = "CORE_BROKERAGE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CORE_BROKERAGE;
        }
    };
    public static final FeatureDto INTRA_ACCOUNT_TRANSFER = new FeatureDto("INTRA_ACCOUNT_TRANSFER", 40) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INTRA_ACCOUNT_TRANSFER
        {
            String str = "INTRA_ACCOUNT_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INTRA_ACCOUNT_TRANSFER;
        }
    };
    public static final FeatureDto RECURRING_DEPOSIT = new FeatureDto("RECURRING_DEPOSIT", 41) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RECURRING_DEPOSIT
        {
            String str = "RECURRING_DEPOSIT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RECURRING_DEPOSIT;
        }
    };

    /* renamed from: FX */
    public static final FeatureDto f6069FX = new FeatureDto("FX", 42) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FX
        {
            String str = "FX";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.f6068FX;
        }
    };
    public static final FeatureDto SYP = new FeatureDto("SYP", 43) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SYP
        {
            String str = "SYP";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SYP;
        }
    };
    public static final FeatureDto CRYPTO_GIFTS = new FeatureDto("CRYPTO_GIFTS", 44) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_GIFTS
        {
            String str = "CRYPTO_GIFTS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_GIFTS;
        }
    };
    public static final FeatureDto CRYPTO_TRANSFER = new FeatureDto("CRYPTO_TRANSFER", 45) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_TRANSFER
        {
            String str = "CRYPTO_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_TRANSFER;
        }
    };
    public static final FeatureDto PAY_BY_CHECK = new FeatureDto("PAY_BY_CHECK", 46) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PAY_BY_CHECK
        {
            String str = "PAY_BY_CHECK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PAY_BY_CHECK;
        }
    };
    public static final FeatureDto INSTANT_FIRM_SETTLEMENT = new FeatureDto("INSTANT_FIRM_SETTLEMENT", 47) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INSTANT_FIRM_SETTLEMENT
        {
            String str = "INSTANT_FIRM_SETTLEMENT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INSTANT_FIRM_SETTLEMENT;
        }
    };
    public static final FeatureDto INTERNAL = new FeatureDto("INTERNAL", 48) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INTERNAL
        {
            String str = "INTERNAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INTERNAL;
        }
    };
    public static final FeatureDto INSTANT_BANK_TRANSFER = new FeatureDto("INSTANT_BANK_TRANSFER", 49) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INSTANT_BANK_TRANSFER
        {
            String str = "INSTANT_BANK_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INSTANT_BANK_TRANSFER;
        }
    };
    public static final FeatureDto CHECK = new FeatureDto("CHECK", 50) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CHECK
        {
            String str = "CHECK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CHECK;
        }
    };
    public static final FeatureDto INCOMING_WIRE = new FeatureDto("INCOMING_WIRE", 51) { // from class: com.robinhood.rosetta.i18n.FeatureDto.INCOMING_WIRE
        {
            String str = "INCOMING_WIRE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.INCOMING_WIRE;
        }
    };
    public static final FeatureDto SEPA_CREDIT = new FeatureDto("SEPA_CREDIT", 52) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SEPA_CREDIT
        {
            String str = "SEPA_CREDIT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SEPA_CREDIT;
        }
    };
    public static final FeatureDto UK_BANK_TRANSFER = new FeatureDto("UK_BANK_TRANSFER", 53) { // from class: com.robinhood.rosetta.i18n.FeatureDto.UK_BANK_TRANSFER
        {
            String str = "UK_BANK_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.UK_BANK_TRANSFER;
        }
    };
    public static final FeatureDto OUTGOING_WIRE = new FeatureDto("OUTGOING_WIRE", 54) { // from class: com.robinhood.rosetta.i18n.FeatureDto.OUTGOING_WIRE
        {
            String str = "OUTGOING_WIRE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.OUTGOING_WIRE;
        }
    };
    public static final FeatureDto OPTIONS_WATCHLIST = new FeatureDto("OPTIONS_WATCHLIST", 55) { // from class: com.robinhood.rosetta.i18n.FeatureDto.OPTIONS_WATCHLIST
        {
            String str = "OPTIONS_WATCHLIST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.OPTIONS_WATCHLIST;
        }
    };
    public static final FeatureDto CRYPTO_CATPAY = new FeatureDto("CRYPTO_CATPAY", 56) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_CATPAY
        {
            String str = "CRYPTO_CATPAY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_CATPAY;
        }
    };
    public static final FeatureDto QUEUED_DEPOSIT = new FeatureDto(TransferContext3.QUEUED_DEPOSIT, 57) { // from class: com.robinhood.rosetta.i18n.FeatureDto.QUEUED_DEPOSIT
        {
            String str = TransferContext3.QUEUED_DEPOSIT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.QUEUED_DEPOSIT;
        }
    };
    public static final FeatureDto ETF_TRADING = new FeatureDto("ETF_TRADING", 58) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ETF_TRADING
        {
            String str = "ETF_TRADING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ETF_TRADING;
        }
    };
    public static final FeatureDto SIGNUP_REWARD = new FeatureDto("SIGNUP_REWARD", 59) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SIGNUP_REWARD
        {
            String str = "SIGNUP_REWARD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SIGNUP_REWARD;
        }
    };
    public static final FeatureDto GOLD_DEPOSIT = new FeatureDto(TransferContext3.GOLD_DEPOSIT, 60) { // from class: com.robinhood.rosetta.i18n.FeatureDto.GOLD_DEPOSIT
        {
            String str = TransferContext3.GOLD_DEPOSIT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.GOLD_DEPOSIT;
        }
    };
    public static final FeatureDto GOLD_AUTO_BOOST = new FeatureDto("GOLD_AUTO_BOOST", 61) { // from class: com.robinhood.rosetta.i18n.FeatureDto.GOLD_AUTO_BOOST
        {
            String str = "GOLD_AUTO_BOOST";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.GOLD_AUTO_BOOST;
        }
    };
    public static final FeatureDto CROISSANT = new FeatureDto("CROISSANT", 62) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CROISSANT
        {
            String str = "CROISSANT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CROISSANT;
        }
    };
    public static final FeatureDto REFERRALS_CONTACT_RECOMMENDATION = new FeatureDto("REFERRALS_CONTACT_RECOMMENDATION", 63) { // from class: com.robinhood.rosetta.i18n.FeatureDto.REFERRALS_CONTACT_RECOMMENDATION
        {
            String str = "REFERRALS_CONTACT_RECOMMENDATION";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.REFERRALS_CONTACT_RECOMMENDATION;
        }
    };
    public static final FeatureDto LEGACY_TRANSFERS = new FeatureDto("LEGACY_TRANSFERS", 64) { // from class: com.robinhood.rosetta.i18n.FeatureDto.LEGACY_TRANSFERS
        {
            String str = "LEGACY_TRANSFERS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.LEGACY_TRANSFERS;
        }
    };
    public static final FeatureDto LEGACY_PAYMENT_HUB_TRANSFERS = new FeatureDto("LEGACY_PAYMENT_HUB_TRANSFERS", 65) { // from class: com.robinhood.rosetta.i18n.FeatureDto.LEGACY_PAYMENT_HUB_TRANSFERS
        {
            String str = "LEGACY_PAYMENT_HUB_TRANSFERS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.LEGACY_PAYMENT_HUB_TRANSFERS;
        }
    };
    public static final FeatureDto US_TRANSFER = new FeatureDto("US_TRANSFER", 66) { // from class: com.robinhood.rosetta.i18n.FeatureDto.US_TRANSFER
        {
            String str = "US_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.US_TRANSFER;
        }
    };
    public static final FeatureDto CRYPTO_YIELDS = new FeatureDto("CRYPTO_YIELDS", 67) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_YIELDS
        {
            String str = "CRYPTO_YIELDS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_YIELDS;
        }
    };
    public static final FeatureDto UK_ACCOUNT_CENTER = new FeatureDto("UK_ACCOUNT_CENTER", 68) { // from class: com.robinhood.rosetta.i18n.FeatureDto.UK_ACCOUNT_CENTER
        {
            String str = "UK_ACCOUNT_CENTER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.UK_ACCOUNT_CENTER;
        }
    };
    public static final FeatureDto CRYPTO_LEARN_AND_EARN = new FeatureDto("CRYPTO_LEARN_AND_EARN", 69) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_LEARN_AND_EARN
        {
            String str = "CRYPTO_LEARN_AND_EARN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_LEARN_AND_EARN;
        }
    };
    public static final FeatureDto RECURRING_TRANSFERS = new FeatureDto("RECURRING_TRANSFERS", 70) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RECURRING_TRANSFERS
        {
            String str = "RECURRING_TRANSFERS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RECURRING_TRANSFERS;
        }
    };
    public static final FeatureDto APPLE_PAY_DCF = new FeatureDto("APPLE_PAY_DCF", 71) { // from class: com.robinhood.rosetta.i18n.FeatureDto.APPLE_PAY_DCF
        {
            String str = "APPLE_PAY_DCF";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.APPLE_PAY_DCF;
        }
    };
    public static final FeatureDto JOINT_ACCOUNTS = new FeatureDto("JOINT_ACCOUNTS", 72) { // from class: com.robinhood.rosetta.i18n.FeatureDto.JOINT_ACCOUNTS
        {
            String str = "JOINT_ACCOUNTS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.JOINT_ACCOUNTS;
        }
    };
    public static final FeatureDto MARGIN_WITHDRAWAL = new FeatureDto("MARGIN_WITHDRAWAL", 73) { // from class: com.robinhood.rosetta.i18n.FeatureDto.MARGIN_WITHDRAWAL
        {
            String str = "MARGIN_WITHDRAWAL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.MARGIN_WITHDRAWAL;
        }
    };
    public static final FeatureDto FUTURES_TRADING = new FeatureDto("FUTURES_TRADING", 74) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FUTURES_TRADING
        {
            String str = "FUTURES_TRADING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FUTURES_TRADING;
        }
    };
    public static final FeatureDto CREDIT_CARD = new FeatureDto("CREDIT_CARD", 75) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CREDIT_CARD
        {
            String str = "CREDIT_CARD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CREDIT_CARD;
        }
    };
    public static final FeatureDto FUTURES_TRADEDATA = new FeatureDto("FUTURES_TRADEDATA", 76) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FUTURES_TRADEDATA
        {
            String str = "FUTURES_TRADEDATA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FUTURES_TRADEDATA;
        }
    };
    public static final FeatureDto CRYPTO_TRADE_BONUS = new FeatureDto("CRYPTO_TRADE_BONUS", 77) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_TRADE_BONUS
        {
            String str = "CRYPTO_TRADE_BONUS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_TRADE_BONUS;
        }
    };
    public static final FeatureDto TAX_INFO = new FeatureDto("TAX_INFO", 78) { // from class: com.robinhood.rosetta.i18n.FeatureDto.TAX_INFO
        {
            String str = "TAX_INFO";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.TAX_INFO;
        }
    };
    public static final FeatureDto CRYPTO_TOKENIZED_STOCKS = new FeatureDto("CRYPTO_TOKENIZED_STOCKS", 79) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_TOKENIZED_STOCKS
        {
            String str = "CRYPTO_TOKENIZED_STOCKS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_TOKENIZED_STOCKS;
        }
    };
    public static final FeatureDto CRYPTO_ADVANCED_MODE = new FeatureDto("CRYPTO_ADVANCED_MODE", 80) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_ADVANCED_MODE
        {
            String str = "CRYPTO_ADVANCED_MODE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_ADVANCED_MODE;
        }
    };
    public static final FeatureDto ASSET_HOMES = new FeatureDto("ASSET_HOMES", 81) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ASSET_HOMES
        {
            String str = "ASSET_HOMES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ASSET_HOMES;
        }
    };
    public static final FeatureDto BLACK_WIDOW = new FeatureDto("BLACK_WIDOW", 82) { // from class: com.robinhood.rosetta.i18n.FeatureDto.BLACK_WIDOW
        {
            String str = "BLACK_WIDOW";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.BLACK_WIDOW;
        }
    };
    public static final FeatureDto RESURRECTION_CRYPTO_UPSELL = new FeatureDto("RESURRECTION_CRYPTO_UPSELL", 83) { // from class: com.robinhood.rosetta.i18n.FeatureDto.RESURRECTION_CRYPTO_UPSELL
        {
            String str = "RESURRECTION_CRYPTO_UPSELL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.RESURRECTION_CRYPTO_UPSELL;
        }
    };
    public static final FeatureDto PROJECT_EAGLE = new FeatureDto("PROJECT_EAGLE", 84) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PROJECT_EAGLE
        {
            String str = "PROJECT_EAGLE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PROJECT_EAGLE;
        }
    };
    public static final FeatureDto ROLLOVER_ACH = new FeatureDto("ROLLOVER_ACH", 85) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ROLLOVER_ACH
        {
            String str = "ROLLOVER_ACH";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ROLLOVER_ACH;
        }
    };
    public static final FeatureDto ADVISORY = new FeatureDto("ADVISORY", 86) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ADVISORY
        {
            String str = "ADVISORY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ADVISORY;
        }
    };
    public static final FeatureDto FAST_TRANSFER = new FeatureDto("FAST_TRANSFER", 87) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FAST_TRANSFER
        {
            String str = "FAST_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FAST_TRANSFER;
        }
    };
    public static final FeatureDto PROJECT_GRIDIRON = new FeatureDto("PROJECT_GRIDIRON", 88) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PROJECT_GRIDIRON
        {
            String str = "PROJECT_GRIDIRON";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PROJECT_GRIDIRON;
        }
    };
    public static final FeatureDto COPILOT = new FeatureDto("COPILOT", 89) { // from class: com.robinhood.rosetta.i18n.FeatureDto.COPILOT
        {
            String str = "COPILOT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.COPILOT;
        }
    };
    public static final FeatureDto PROJECT_THIRD_MONTH_CHAOS = new FeatureDto("PROJECT_THIRD_MONTH_CHAOS", 90) { // from class: com.robinhood.rosetta.i18n.FeatureDto.PROJECT_THIRD_MONTH_CHAOS
        {
            String str = "PROJECT_THIRD_MONTH_CHAOS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.PROJECT_THIRD_MONTH_CHAOS;
        }
    };
    public static final FeatureDto EVENT_CONTRACT = new FeatureDto("EVENT_CONTRACT", 91) { // from class: com.robinhood.rosetta.i18n.FeatureDto.EVENT_CONTRACT
        {
            String str = "EVENT_CONTRACT";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.EVENT_CONTRACT;
        }
    };
    public static final FeatureDto SG_CAR_ELIGIBILITY = new FeatureDto("SG_CAR_ELIGIBILITY", 92) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SG_CAR_ELIGIBILITY
        {
            String str = "SG_CAR_ELIGIBILITY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SG_CAR_ELIGIBILITY;
        }
    };
    public static final FeatureDto MULTI_CURRENCY_WALLET = new FeatureDto("MULTI_CURRENCY_WALLET", 93) { // from class: com.robinhood.rosetta.i18n.FeatureDto.MULTI_CURRENCY_WALLET
        {
            String str = "MULTI_CURRENCY_WALLET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.MULTI_CURRENCY_WALLET;
        }
    };
    public static final FeatureDto REFERRALS_CONTACT_INVITE = new FeatureDto("REFERRALS_CONTACT_INVITE", 94) { // from class: com.robinhood.rosetta.i18n.FeatureDto.REFERRALS_CONTACT_INVITE
        {
            String str = "REFERRALS_CONTACT_INVITE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.REFERRALS_CONTACT_INVITE;
        }
    };
    public static final FeatureDto CRYPTO_PERPETUALS = new FeatureDto("CRYPTO_PERPETUALS", 95) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_PERPETUALS
        {
            String str = "CRYPTO_PERPETUALS";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_PERPETUALS;
        }
    };
    public static final FeatureDto SG_BANK_TRANSFER = new FeatureDto("SG_BANK_TRANSFER", 96) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SG_BANK_TRANSFER
        {
            String str = "SG_BANK_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SG_BANK_TRANSFER;
        }
    };
    public static final FeatureDto I18N_WIRE_TRANSFER = new FeatureDto("I18N_WIRE_TRANSFER", 97) { // from class: com.robinhood.rosetta.i18n.FeatureDto.I18N_WIRE_TRANSFER
        {
            String str = "I18N_WIRE_TRANSFER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.I18N_WIRE_TRANSFER;
        }
    };
    public static final FeatureDto FIRST_TRADE_UPSELL = new FeatureDto("FIRST_TRADE_UPSELL", 98) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FIRST_TRADE_UPSELL
        {
            String str = "FIRST_TRADE_UPSELL";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FIRST_TRADE_UPSELL;
        }
    };
    public static final FeatureDto WATCHLIST_REDESIGN = new FeatureDto("WATCHLIST_REDESIGN", 99) { // from class: com.robinhood.rosetta.i18n.FeatureDto.WATCHLIST_REDESIGN
        {
            String str = "WATCHLIST_REDESIGN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.WATCHLIST_REDESIGN;
        }
    };
    public static final FeatureDto I18N_TAX_CERTIFICATION = new FeatureDto("I18N_TAX_CERTIFICATION", 100) { // from class: com.robinhood.rosetta.i18n.FeatureDto.I18N_TAX_CERTIFICATION
        {
            String str = "I18N_TAX_CERTIFICATION";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.I18N_TAX_CERTIFICATION;
        }
    };
    public static final FeatureDto UK_ISA = new FeatureDto("UK_ISA", 101) { // from class: com.robinhood.rosetta.i18n.FeatureDto.UK_ISA
        {
            String str = "UK_ISA";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.UK_ISA;
        }
    };
    public static final FeatureDto ISA_STOCKS_AND_SHARES = new FeatureDto("ISA_STOCKS_AND_SHARES", 102) { // from class: com.robinhood.rosetta.i18n.FeatureDto.ISA_STOCKS_AND_SHARES
        {
            String str = "ISA_STOCKS_AND_SHARES";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.ISA_STOCKS_AND_SHARES;
        }
    };
    public static final FeatureDto FX_AT_TRADE = new FeatureDto("FX_AT_TRADE", 103) { // from class: com.robinhood.rosetta.i18n.FeatureDto.FX_AT_TRADE
        {
            String str = "FX_AT_TRADE";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.FX_AT_TRADE;
        }
    };
    public static final FeatureDto MCW_CURRENCY_SWITCHER = new FeatureDto("MCW_CURRENCY_SWITCHER", 104) { // from class: com.robinhood.rosetta.i18n.FeatureDto.MCW_CURRENCY_SWITCHER
        {
            String str = "MCW_CURRENCY_SWITCHER";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.MCW_CURRENCY_SWITCHER;
        }
    };
    public static final FeatureDto CRYPTO_READ_ONLY = new FeatureDto("CRYPTO_READ_ONLY", 105) { // from class: com.robinhood.rosetta.i18n.FeatureDto.CRYPTO_READ_ONLY
        {
            String str = "CRYPTO_READ_ONLY";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.CRYPTO_READ_ONLY;
        }
    };
    public static final FeatureDto SOCIAL_TRADING = new FeatureDto("SOCIAL_TRADING", 106) { // from class: com.robinhood.rosetta.i18n.FeatureDto.SOCIAL_TRADING
        {
            String str = "SOCIAL_TRADING";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Feature toProto() {
            return Feature.SOCIAL_TRADING;
        }
    };

    private static final /* synthetic */ FeatureDto[] $values() {
        return new FeatureDto[]{FEATURE_UNSPECIFIED, ADT, ACATS, ACH, BENEFICIARY, CASH_SWEEP, CASH_BROKERAGE, CRYPTO, DEBIT_CARD_FUNDING, DRIP, EDUCATION, GOLD, GPT_SUMMARIES, INSTANT_DEPOSITS, INVEST_FLOW, IPO_ACCESS, LEVERED_MARGIN, LIMITED_MARGIN, LISTS, NEWS_FEED, OPTIONS, P2P, POPULAR_STOCKS, PORTFOLIO_SHARING, PROFILES, PARTNER_STOCK_PROGRAM, RECOMMENDATIONS, RECURRING, REFERRALS, RETIREMENT, RHY, SAY, SCREENER, SLIP, STOCK_REFERRALS, TAX_CENTER, TOP_MOVERS, TURBO_TAX, WIRE_TRANSFER, CORE_BROKERAGE, INTRA_ACCOUNT_TRANSFER, RECURRING_DEPOSIT, f6069FX, SYP, CRYPTO_GIFTS, CRYPTO_TRANSFER, PAY_BY_CHECK, INSTANT_FIRM_SETTLEMENT, INTERNAL, INSTANT_BANK_TRANSFER, CHECK, INCOMING_WIRE, SEPA_CREDIT, UK_BANK_TRANSFER, OUTGOING_WIRE, OPTIONS_WATCHLIST, CRYPTO_CATPAY, QUEUED_DEPOSIT, ETF_TRADING, SIGNUP_REWARD, GOLD_DEPOSIT, GOLD_AUTO_BOOST, CROISSANT, REFERRALS_CONTACT_RECOMMENDATION, LEGACY_TRANSFERS, LEGACY_PAYMENT_HUB_TRANSFERS, US_TRANSFER, CRYPTO_YIELDS, UK_ACCOUNT_CENTER, CRYPTO_LEARN_AND_EARN, RECURRING_TRANSFERS, APPLE_PAY_DCF, JOINT_ACCOUNTS, MARGIN_WITHDRAWAL, FUTURES_TRADING, CREDIT_CARD, FUTURES_TRADEDATA, CRYPTO_TRADE_BONUS, TAX_INFO, CRYPTO_TOKENIZED_STOCKS, CRYPTO_ADVANCED_MODE, ASSET_HOMES, BLACK_WIDOW, RESURRECTION_CRYPTO_UPSELL, PROJECT_EAGLE, ROLLOVER_ACH, ADVISORY, FAST_TRANSFER, PROJECT_GRIDIRON, COPILOT, PROJECT_THIRD_MONTH_CHAOS, EVENT_CONTRACT, SG_CAR_ELIGIBILITY, MULTI_CURRENCY_WALLET, REFERRALS_CONTACT_INVITE, CRYPTO_PERPETUALS, SG_BANK_TRANSFER, I18N_WIRE_TRANSFER, FIRST_TRADE_UPSELL, WATCHLIST_REDESIGN, I18N_TAX_CERTIFICATION, UK_ISA, ISA_STOCKS_AND_SHARES, FX_AT_TRADE, MCW_CURRENCY_SWITCHER, CRYPTO_READ_ONLY, SOCIAL_TRADING};
    }

    public /* synthetic */ FeatureDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<FeatureDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeatureDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        FeatureDto[] featureDtoArr$values = $values();
        $VALUES = featureDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(featureDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.i18n.FeatureDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeatureDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/FeatureDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/i18n/FeatureDto;", "Lcom/robinhood/rosetta/i18n/Feature;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/i18n/FeatureDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FeatureDto, Feature> {

        /* compiled from: FeatureDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Feature.values().length];
                try {
                    iArr[Feature.FEATURE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Feature.ADT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Feature.ACATS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Feature.ACH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Feature.BENEFICIARY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Feature.CASH_SWEEP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Feature.CASH_BROKERAGE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Feature.CRYPTO.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Feature.DEBIT_CARD_FUNDING.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Feature.DRIP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Feature.EDUCATION.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Feature.GOLD.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Feature.GPT_SUMMARIES.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Feature.INSTANT_DEPOSITS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Feature.INVEST_FLOW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Feature.IPO_ACCESS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Feature.LEVERED_MARGIN.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Feature.LIMITED_MARGIN.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Feature.LISTS.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Feature.NEWS_FEED.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Feature.OPTIONS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Feature.P2P.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Feature.POPULAR_STOCKS.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Feature.PORTFOLIO_SHARING.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Feature.PROFILES.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Feature.PARTNER_STOCK_PROGRAM.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Feature.RECOMMENDATIONS.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Feature.RECURRING.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Feature.REFERRALS.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Feature.RETIREMENT.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Feature.RHY.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Feature.SAY.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Feature.SCREENER.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Feature.SLIP.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Feature.STOCK_REFERRALS.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Feature.TAX_CENTER.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Feature.TOP_MOVERS.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Feature.TURBO_TAX.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Feature.WIRE_TRANSFER.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Feature.CORE_BROKERAGE.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Feature.INTRA_ACCOUNT_TRANSFER.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Feature.RECURRING_DEPOSIT.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Feature.f6068FX.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Feature.SYP.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Feature.CRYPTO_GIFTS.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Feature.CRYPTO_TRANSFER.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Feature.PAY_BY_CHECK.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Feature.INSTANT_FIRM_SETTLEMENT.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Feature.INTERNAL.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Feature.INSTANT_BANK_TRANSFER.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Feature.CHECK.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Feature.INCOMING_WIRE.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Feature.SEPA_CREDIT.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Feature.UK_BANK_TRANSFER.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Feature.OUTGOING_WIRE.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Feature.OPTIONS_WATCHLIST.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Feature.CRYPTO_CATPAY.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Feature.QUEUED_DEPOSIT.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Feature.ETF_TRADING.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Feature.SIGNUP_REWARD.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Feature.GOLD_DEPOSIT.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Feature.GOLD_AUTO_BOOST.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Feature.CROISSANT.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Feature.REFERRALS_CONTACT_RECOMMENDATION.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Feature.LEGACY_TRANSFERS.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Feature.LEGACY_PAYMENT_HUB_TRANSFERS.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Feature.US_TRANSFER.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Feature.CRYPTO_YIELDS.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Feature.UK_ACCOUNT_CENTER.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Feature.CRYPTO_LEARN_AND_EARN.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Feature.RECURRING_TRANSFERS.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Feature.APPLE_PAY_DCF.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Feature.JOINT_ACCOUNTS.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Feature.MARGIN_WITHDRAWAL.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Feature.FUTURES_TRADING.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Feature.CREDIT_CARD.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Feature.FUTURES_TRADEDATA.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Feature.CRYPTO_TRADE_BONUS.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Feature.TAX_INFO.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Feature.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Feature.CRYPTO_ADVANCED_MODE.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Feature.ASSET_HOMES.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Feature.BLACK_WIDOW.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Feature.RESURRECTION_CRYPTO_UPSELL.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Feature.PROJECT_EAGLE.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Feature.ROLLOVER_ACH.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Feature.ADVISORY.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Feature.FAST_TRANSFER.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Feature.PROJECT_GRIDIRON.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Feature.COPILOT.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Feature.PROJECT_THIRD_MONTH_CHAOS.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Feature.EVENT_CONTRACT.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Feature.SG_CAR_ELIGIBILITY.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Feature.MULTI_CURRENCY_WALLET.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Feature.REFERRALS_CONTACT_INVITE.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Feature.CRYPTO_PERPETUALS.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Feature.SG_BANK_TRANSFER.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Feature.I18N_WIRE_TRANSFER.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Feature.FIRST_TRADE_UPSELL.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Feature.WATCHLIST_REDESIGN.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Feature.I18N_TAX_CERTIFICATION.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Feature.UK_ISA.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Feature.ISA_STOCKS_AND_SHARES.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Feature.FX_AT_TRADE.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Feature.MCW_CURRENCY_SWITCHER.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Feature.CRYPTO_READ_ONLY.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Feature.SOCIAL_TRADING.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeatureDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeatureDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeatureDto> getBinaryBase64Serializer() {
            return (KSerializer) FeatureDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Feature> getProtoAdapter() {
            return Feature.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeatureDto getZeroValue() {
            return FeatureDto.FEATURE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeatureDto fromProto(Feature proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FeatureDto.FEATURE_UNSPECIFIED;
                case 2:
                    return FeatureDto.ADT;
                case 3:
                    return FeatureDto.ACATS;
                case 4:
                    return FeatureDto.ACH;
                case 5:
                    return FeatureDto.BENEFICIARY;
                case 6:
                    return FeatureDto.CASH_SWEEP;
                case 7:
                    return FeatureDto.CASH_BROKERAGE;
                case 8:
                    return FeatureDto.CRYPTO;
                case 9:
                    return FeatureDto.DEBIT_CARD_FUNDING;
                case 10:
                    return FeatureDto.DRIP;
                case 11:
                    return FeatureDto.EDUCATION;
                case 12:
                    return FeatureDto.GOLD;
                case 13:
                    return FeatureDto.GPT_SUMMARIES;
                case 14:
                    return FeatureDto.INSTANT_DEPOSITS;
                case 15:
                    return FeatureDto.INVEST_FLOW;
                case 16:
                    return FeatureDto.IPO_ACCESS;
                case 17:
                    return FeatureDto.LEVERED_MARGIN;
                case 18:
                    return FeatureDto.LIMITED_MARGIN;
                case 19:
                    return FeatureDto.LISTS;
                case 20:
                    return FeatureDto.NEWS_FEED;
                case 21:
                    return FeatureDto.OPTIONS;
                case 22:
                    return FeatureDto.P2P;
                case 23:
                    return FeatureDto.POPULAR_STOCKS;
                case 24:
                    return FeatureDto.PORTFOLIO_SHARING;
                case 25:
                    return FeatureDto.PROFILES;
                case 26:
                    return FeatureDto.PARTNER_STOCK_PROGRAM;
                case 27:
                    return FeatureDto.RECOMMENDATIONS;
                case 28:
                    return FeatureDto.RECURRING;
                case 29:
                    return FeatureDto.REFERRALS;
                case 30:
                    return FeatureDto.RETIREMENT;
                case 31:
                    return FeatureDto.RHY;
                case 32:
                    return FeatureDto.SAY;
                case 33:
                    return FeatureDto.SCREENER;
                case 34:
                    return FeatureDto.SLIP;
                case 35:
                    return FeatureDto.STOCK_REFERRALS;
                case 36:
                    return FeatureDto.TAX_CENTER;
                case 37:
                    return FeatureDto.TOP_MOVERS;
                case 38:
                    return FeatureDto.TURBO_TAX;
                case 39:
                    return FeatureDto.WIRE_TRANSFER;
                case 40:
                    return FeatureDto.CORE_BROKERAGE;
                case 41:
                    return FeatureDto.INTRA_ACCOUNT_TRANSFER;
                case 42:
                    return FeatureDto.RECURRING_DEPOSIT;
                case 43:
                    return FeatureDto.f6069FX;
                case 44:
                    return FeatureDto.SYP;
                case 45:
                    return FeatureDto.CRYPTO_GIFTS;
                case 46:
                    return FeatureDto.CRYPTO_TRANSFER;
                case 47:
                    return FeatureDto.PAY_BY_CHECK;
                case 48:
                    return FeatureDto.INSTANT_FIRM_SETTLEMENT;
                case 49:
                    return FeatureDto.INTERNAL;
                case 50:
                    return FeatureDto.INSTANT_BANK_TRANSFER;
                case 51:
                    return FeatureDto.CHECK;
                case 52:
                    return FeatureDto.INCOMING_WIRE;
                case 53:
                    return FeatureDto.SEPA_CREDIT;
                case 54:
                    return FeatureDto.UK_BANK_TRANSFER;
                case 55:
                    return FeatureDto.OUTGOING_WIRE;
                case 56:
                    return FeatureDto.OPTIONS_WATCHLIST;
                case 57:
                    return FeatureDto.CRYPTO_CATPAY;
                case 58:
                    return FeatureDto.QUEUED_DEPOSIT;
                case 59:
                    return FeatureDto.ETF_TRADING;
                case 60:
                    return FeatureDto.SIGNUP_REWARD;
                case 61:
                    return FeatureDto.GOLD_DEPOSIT;
                case 62:
                    return FeatureDto.GOLD_AUTO_BOOST;
                case 63:
                    return FeatureDto.CROISSANT;
                case 64:
                    return FeatureDto.REFERRALS_CONTACT_RECOMMENDATION;
                case 65:
                    return FeatureDto.LEGACY_TRANSFERS;
                case 66:
                    return FeatureDto.LEGACY_PAYMENT_HUB_TRANSFERS;
                case 67:
                    return FeatureDto.US_TRANSFER;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return FeatureDto.CRYPTO_YIELDS;
                case 69:
                    return FeatureDto.UK_ACCOUNT_CENTER;
                case 70:
                    return FeatureDto.CRYPTO_LEARN_AND_EARN;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return FeatureDto.RECURRING_TRANSFERS;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return FeatureDto.APPLE_PAY_DCF;
                case 73:
                    return FeatureDto.JOINT_ACCOUNTS;
                case 74:
                    return FeatureDto.MARGIN_WITHDRAWAL;
                case 75:
                    return FeatureDto.FUTURES_TRADING;
                case 76:
                    return FeatureDto.CREDIT_CARD;
                case 77:
                    return FeatureDto.FUTURES_TRADEDATA;
                case 78:
                    return FeatureDto.CRYPTO_TRADE_BONUS;
                case 79:
                    return FeatureDto.TAX_INFO;
                case 80:
                    return FeatureDto.CRYPTO_TOKENIZED_STOCKS;
                case 81:
                    return FeatureDto.CRYPTO_ADVANCED_MODE;
                case 82:
                    return FeatureDto.ASSET_HOMES;
                case 83:
                    return FeatureDto.BLACK_WIDOW;
                case 84:
                    return FeatureDto.RESURRECTION_CRYPTO_UPSELL;
                case 85:
                    return FeatureDto.PROJECT_EAGLE;
                case 86:
                    return FeatureDto.ROLLOVER_ACH;
                case 87:
                    return FeatureDto.ADVISORY;
                case 88:
                    return FeatureDto.FAST_TRANSFER;
                case 89:
                    return FeatureDto.PROJECT_GRIDIRON;
                case 90:
                    return FeatureDto.COPILOT;
                case 91:
                    return FeatureDto.PROJECT_THIRD_MONTH_CHAOS;
                case 92:
                    return FeatureDto.EVENT_CONTRACT;
                case 93:
                    return FeatureDto.SG_CAR_ELIGIBILITY;
                case 94:
                    return FeatureDto.MULTI_CURRENCY_WALLET;
                case 95:
                    return FeatureDto.REFERRALS_CONTACT_INVITE;
                case 96:
                    return FeatureDto.CRYPTO_PERPETUALS;
                case 97:
                    return FeatureDto.SG_BANK_TRANSFER;
                case 98:
                    return FeatureDto.I18N_WIRE_TRANSFER;
                case 99:
                    return FeatureDto.FIRST_TRADE_UPSELL;
                case 100:
                    return FeatureDto.WATCHLIST_REDESIGN;
                case 101:
                    return FeatureDto.I18N_TAX_CERTIFICATION;
                case 102:
                    return FeatureDto.UK_ISA;
                case 103:
                    return FeatureDto.ISA_STOCKS_AND_SHARES;
                case 104:
                    return FeatureDto.FX_AT_TRADE;
                case 105:
                    return FeatureDto.MCW_CURRENCY_SWITCHER;
                case 106:
                    return FeatureDto.CRYPTO_READ_ONLY;
                case 107:
                    return FeatureDto.SOCIAL_TRADING;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/FeatureDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/i18n/FeatureDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeatureDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FeatureDto, Feature> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.i18n.Feature", FeatureDto.getEntries(), FeatureDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FeatureDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FeatureDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeatureDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FeatureDto valueOf(String str) {
        return (FeatureDto) Enum.valueOf(FeatureDto.class, str);
    }

    public static FeatureDto[] values() {
        return (FeatureDto[]) $VALUES.clone();
    }
}
