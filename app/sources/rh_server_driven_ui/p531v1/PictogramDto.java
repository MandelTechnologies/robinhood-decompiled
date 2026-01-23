package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
/* compiled from: PictogramDto.kt */
@Metadata(m3635d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\b\u0089\u0001\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u0094\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u0094\u0001\u0095\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u008d\u0001\u001a\u00030\u008e\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\n\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001¨\u0006\u0096\u0001"}, m3636d2 = {"Lrh_server_driven_ui/v1/PictogramDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Pictogram;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PICTOGRAM_UNSPECIFIED", "PICTOGRAM_ACCESSIBILITY", "PICTOGRAM_AGENT", "PICTOGRAM_BANK", "PICTOGRAM_BAR_CHART", "PICTOGRAM_BASKETBALL", "PICTOGRAM_BELL", "PICTOGRAM_BILLS", "PICTOGRAM_BINOCULARS", "PICTOGRAM_BOOK", "PICTOGRAM_BULLET", "PICTOGRAM_CALENDAR", "PICTOGRAM_CANCEL_CARD", "PICTOGRAM_CASH", "PICTOGRAM_CASH_ATM", "PICTOGRAM_CASH_CALENDAR", "PICTOGRAM_CASH_CONTACTLESS_PAYMENT", "PICTOGRAM_CASH_DOCUMENTS", "PICTOGRAM_CASH_FLOWER", "PICTOGRAM_CASH_FREE", "PICTOGRAM_CASH_MONEY", "PICTOGRAM_CASH_PAYMENT_CARD", "PICTOGRAM_CASH_SECURITY", "PICTOGRAM_CASH_START", "PICTOGRAM_CASH_THUMBS_UP", "PICTOGRAM_CASH_UMBRELLA", "PICTOGRAM_CASH_WARNING", "PICTOGRAM_CHART", "PICTOGRAM_CHAT", "PICTOGRAM_CHATBOT", "PICTOGRAM_CHECK", "PICTOGRAM_CLIPBOARD", "PICTOGRAM_CORTEX", "PICTOGRAM_CRYPTO", "PICTOGRAM_CRYPTO_C", "PICTOGRAM_CRYPTO_GIFT", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", "PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", "PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP", "PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", "PICTOGRAM_DEPOSIT", "PICTOGRAM_DESKTOP", "PICTOGRAM_DOCUMENTS", "PICTOGRAM_DOLLAR_SIGN", "PICTOGRAM_ENVELOPE", "PICTOGRAM_ETF", "PICTOGRAM_EYE_OPEN", "PICTOGRAM_FACE", "PICTOGRAM_FLAG", "PICTOGRAM_FLOWER", "PICTOGRAM_FOOTBALL", "PICTOGRAM_FREE", "PICTOGRAM_GIFT", "PICTOGRAM_GOLD_BAR_CHART", "PICTOGRAM_GOLD_CALENDAR", "PICTOGRAM_GOLD_DOCUMENTS", "PICTOGRAM_GOLD_GIFT", "PICTOGRAM_GOLD_MARGIN", "PICTOGRAM_GOLD_MONEY", "PICTOGRAM_GOLD_PIGGY_BANK", "PICTOGRAM_GOLD_STOPWATCH", "PICTOGRAM_HELP", "PICTOGRAM_HOCKEY", "PICTOGRAM_INVESTING", "PICTOGRAM_JOINT_ACCOUNTS", "PICTOGRAM_LIGHTBULB", "PICTOGRAM_LIGHTNING", "PICTOGRAM_LIST", "PICTOGRAM_LIVE_CHAT", "PICTOGRAM_LOCK", "PICTOGRAM_MANAGED_ACCOUNTS", "PICTOGRAM_MARGIN", "PICTOGRAM_MEGAPHONE", "PICTOGRAM_MONEY", "PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES", "PICTOGRAM_ORDER_TYPES_BUY_LIMIT", "PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP", "PICTOGRAM_ORDER_TYPES_BUY_MARKET", "PICTOGRAM_ORDER_TYPES_BUY_STOP", "PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP", "PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS", "PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS", "PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT", "PICTOGRAM_ORDER_TYPES_SELL_LIMIT", "PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP", "PICTOGRAM_ORDER_TYPES_SELL_MARKET", "PICTOGRAM_ORDER_TYPES_SELL_STOP", "PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP", "PICTOGRAM_PAYMENT_CARD", "PICTOGRAM_PAYROLL", "PICTOGRAM_PERCENT_SIGN", "PICTOGRAM_PERSON", "PICTOGRAM_PHONE", "PICTOGRAM_PIE_CHART", "PICTOGRAM_PIGGY_BANK", "PICTOGRAM_POUND_SIGN", "PICTOGRAM_PRIME_CHART", "PICTOGRAM_PRIME_DOLLAR_SIGN", "PICTOGRAM_PRIME_FLAG", "PICTOGRAM_PRIME_FLOWER", "PICTOGRAM_PRIME_FORWARD_SPLIT", "PICTOGRAM_PRIME_GIFT", "PICTOGRAM_PRIME_MONEY", "PICTOGRAM_PRIME_PIE_CHART", "PICTOGRAM_PRIME_POUND_SIGN", "PICTOGRAM_PRIME_RECURRING", "PICTOGRAM_PRIME_RETIREMENT", "PICTOGRAM_PRIME_REVERSE_SPLIT", "PICTOGRAM_PRIME_ROBOT", "PICTOGRAM_RECURRING", "PICTOGRAM_RETIREMENT", "PICTOGRAM_ROBINHOOD", "PICTOGRAM_SMILEY", "PICTOGRAM_SPARKLE", "PICTOGRAM_START", "PICTOGRAM_STOPWATCH", "PICTOGRAM_SUBMARINE", "PICTOGRAM_TAX_LOTS", "PICTOGRAM_TRANSFER", "PICTOGRAM_UMBRELLA", "PICTOGRAM_UNLOCK", "PICTOGRAM_WARNING", "PICTOGRAM_WITHDRAW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class PictogramDto implements Dto2<Pictogram>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PictogramDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<PictogramDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PictogramDto, Pictogram>> binaryBase64Serializer$delegate;
    public static final PictogramDto PICTOGRAM_UNSPECIFIED = new PictogramDto("PICTOGRAM_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_UNSPECIFIED;
        }
    };
    public static final PictogramDto PICTOGRAM_ACCESSIBILITY = new PictogramDto("PICTOGRAM_ACCESSIBILITY", 1) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ACCESSIBILITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ACCESSIBILITY;
        }
    };
    public static final PictogramDto PICTOGRAM_AGENT = new PictogramDto("PICTOGRAM_AGENT", 2) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_AGENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_AGENT;
        }
    };
    public static final PictogramDto PICTOGRAM_BANK = new PictogramDto("PICTOGRAM_BANK", 3) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BANK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BANK;
        }
    };
    public static final PictogramDto PICTOGRAM_BAR_CHART = new PictogramDto("PICTOGRAM_BAR_CHART", 4) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BAR_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BAR_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_BASKETBALL = new PictogramDto("PICTOGRAM_BASKETBALL", 5) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BASKETBALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BASKETBALL;
        }
    };
    public static final PictogramDto PICTOGRAM_BELL = new PictogramDto("PICTOGRAM_BELL", 6) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BELL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BELL;
        }
    };
    public static final PictogramDto PICTOGRAM_BILLS = new PictogramDto("PICTOGRAM_BILLS", 7) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BILLS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BILLS;
        }
    };
    public static final PictogramDto PICTOGRAM_BINOCULARS = new PictogramDto("PICTOGRAM_BINOCULARS", 8) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BINOCULARS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BINOCULARS;
        }
    };
    public static final PictogramDto PICTOGRAM_BOOK = new PictogramDto("PICTOGRAM_BOOK", 9) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BOOK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BOOK;
        }
    };
    public static final PictogramDto PICTOGRAM_BULLET = new PictogramDto("PICTOGRAM_BULLET", 10) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_BULLET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_BULLET;
        }
    };
    public static final PictogramDto PICTOGRAM_CALENDAR = new PictogramDto("PICTOGRAM_CALENDAR", 11) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CALENDAR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CALENDAR;
        }
    };
    public static final PictogramDto PICTOGRAM_CANCEL_CARD = new PictogramDto("PICTOGRAM_CANCEL_CARD", 12) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CANCEL_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CANCEL_CARD;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH = new PictogramDto("PICTOGRAM_CASH", 13) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_ATM = new PictogramDto("PICTOGRAM_CASH_ATM", 14) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_ATM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_ATM;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_CALENDAR = new PictogramDto("PICTOGRAM_CASH_CALENDAR", 15) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_CALENDAR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_CALENDAR;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_CONTACTLESS_PAYMENT = new PictogramDto("PICTOGRAM_CASH_CONTACTLESS_PAYMENT", 16) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_CONTACTLESS_PAYMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_CONTACTLESS_PAYMENT;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_DOCUMENTS = new PictogramDto("PICTOGRAM_CASH_DOCUMENTS", 17) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_DOCUMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_DOCUMENTS;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_FLOWER = new PictogramDto("PICTOGRAM_CASH_FLOWER", 18) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_FLOWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_FLOWER;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_FREE = new PictogramDto("PICTOGRAM_CASH_FREE", 19) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_FREE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_FREE;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_MONEY = new PictogramDto("PICTOGRAM_CASH_MONEY", 20) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_MONEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_MONEY;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_PAYMENT_CARD = new PictogramDto("PICTOGRAM_CASH_PAYMENT_CARD", 21) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_PAYMENT_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_PAYMENT_CARD;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_SECURITY = new PictogramDto("PICTOGRAM_CASH_SECURITY", 22) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_SECURITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_SECURITY;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_START = new PictogramDto("PICTOGRAM_CASH_START", 23) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_START;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_THUMBS_UP = new PictogramDto("PICTOGRAM_CASH_THUMBS_UP", 24) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_THUMBS_UP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_THUMBS_UP;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_UMBRELLA = new PictogramDto("PICTOGRAM_CASH_UMBRELLA", 25) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_UMBRELLA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_UMBRELLA;
        }
    };
    public static final PictogramDto PICTOGRAM_CASH_WARNING = new PictogramDto("PICTOGRAM_CASH_WARNING", 26) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CASH_WARNING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CASH_WARNING;
        }
    };
    public static final PictogramDto PICTOGRAM_CHART = new PictogramDto("PICTOGRAM_CHART", 27) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_CHAT = new PictogramDto("PICTOGRAM_CHAT", 28) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CHAT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CHAT;
        }
    };
    public static final PictogramDto PICTOGRAM_CHATBOT = new PictogramDto("PICTOGRAM_CHATBOT", 29) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CHATBOT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CHATBOT;
        }
    };
    public static final PictogramDto PICTOGRAM_CHECK = new PictogramDto("PICTOGRAM_CHECK", 30) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CHECK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CHECK;
        }
    };
    public static final PictogramDto PICTOGRAM_CLIPBOARD = new PictogramDto("PICTOGRAM_CLIPBOARD", 31) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CLIPBOARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CLIPBOARD;
        }
    };
    public static final PictogramDto PICTOGRAM_CORTEX = new PictogramDto("PICTOGRAM_CORTEX", 32) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CORTEX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CORTEX;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO = new PictogramDto("PICTOGRAM_CRYPTO", 33) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_C = new PictogramDto("PICTOGRAM_CRYPTO_C", 34) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_C
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_C;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_GIFT = new PictogramDto("PICTOGRAM_CRYPTO_GIFT", 35) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_GIFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_GIFT;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES", 36) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT", 37) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP", 38) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET", 39) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP", 40) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP", 41) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO", 42) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS", 43) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS", 44) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT", 45) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT", 46) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP", 47) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET", 48) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP", 49) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP = new PictogramDto("PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP", 50) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_DEPOSIT = new PictogramDto("PICTOGRAM_DEPOSIT", 51) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_DEPOSIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_DEPOSIT;
        }
    };
    public static final PictogramDto PICTOGRAM_DESKTOP = new PictogramDto("PICTOGRAM_DESKTOP", 52) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_DESKTOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_DESKTOP;
        }
    };
    public static final PictogramDto PICTOGRAM_DOCUMENTS = new PictogramDto("PICTOGRAM_DOCUMENTS", 53) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_DOCUMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_DOCUMENTS;
        }
    };
    public static final PictogramDto PICTOGRAM_DOLLAR_SIGN = new PictogramDto("PICTOGRAM_DOLLAR_SIGN", 54) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_DOLLAR_SIGN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_DOLLAR_SIGN;
        }
    };
    public static final PictogramDto PICTOGRAM_ENVELOPE = new PictogramDto("PICTOGRAM_ENVELOPE", 55) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ENVELOPE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ENVELOPE;
        }
    };
    public static final PictogramDto PICTOGRAM_ETF = new PictogramDto("PICTOGRAM_ETF", 56) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ETF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ETF;
        }
    };
    public static final PictogramDto PICTOGRAM_EYE_OPEN = new PictogramDto("PICTOGRAM_EYE_OPEN", 57) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_EYE_OPEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_EYE_OPEN;
        }
    };
    public static final PictogramDto PICTOGRAM_FACE = new PictogramDto("PICTOGRAM_FACE", 58) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_FACE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_FACE;
        }
    };
    public static final PictogramDto PICTOGRAM_FLAG = new PictogramDto("PICTOGRAM_FLAG", 59) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_FLAG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_FLAG;
        }
    };
    public static final PictogramDto PICTOGRAM_FLOWER = new PictogramDto("PICTOGRAM_FLOWER", 60) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_FLOWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_FLOWER;
        }
    };
    public static final PictogramDto PICTOGRAM_FOOTBALL = new PictogramDto("PICTOGRAM_FOOTBALL", 61) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_FOOTBALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_FOOTBALL;
        }
    };
    public static final PictogramDto PICTOGRAM_FREE = new PictogramDto("PICTOGRAM_FREE", 62) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_FREE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_FREE;
        }
    };
    public static final PictogramDto PICTOGRAM_GIFT = new PictogramDto("PICTOGRAM_GIFT", 63) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GIFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GIFT;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_BAR_CHART = new PictogramDto("PICTOGRAM_GOLD_BAR_CHART", 64) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_BAR_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_BAR_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_CALENDAR = new PictogramDto("PICTOGRAM_GOLD_CALENDAR", 65) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_CALENDAR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_CALENDAR;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_DOCUMENTS = new PictogramDto("PICTOGRAM_GOLD_DOCUMENTS", 66) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_DOCUMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_DOCUMENTS;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_GIFT = new PictogramDto("PICTOGRAM_GOLD_GIFT", 67) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_GIFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_GIFT;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_MARGIN = new PictogramDto("PICTOGRAM_GOLD_MARGIN", 68) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_MARGIN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_MARGIN;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_MONEY = new PictogramDto("PICTOGRAM_GOLD_MONEY", 69) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_MONEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_MONEY;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_PIGGY_BANK = new PictogramDto("PICTOGRAM_GOLD_PIGGY_BANK", 70) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_PIGGY_BANK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_PIGGY_BANK;
        }
    };
    public static final PictogramDto PICTOGRAM_GOLD_STOPWATCH = new PictogramDto("PICTOGRAM_GOLD_STOPWATCH", 71) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_GOLD_STOPWATCH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_GOLD_STOPWATCH;
        }
    };
    public static final PictogramDto PICTOGRAM_HELP = new PictogramDto("PICTOGRAM_HELP", 72) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_HELP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_HELP;
        }
    };
    public static final PictogramDto PICTOGRAM_HOCKEY = new PictogramDto("PICTOGRAM_HOCKEY", 73) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_HOCKEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_HOCKEY;
        }
    };
    public static final PictogramDto PICTOGRAM_INVESTING = new PictogramDto("PICTOGRAM_INVESTING", 74) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_INVESTING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_INVESTING;
        }
    };
    public static final PictogramDto PICTOGRAM_JOINT_ACCOUNTS = new PictogramDto("PICTOGRAM_JOINT_ACCOUNTS", 75) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_JOINT_ACCOUNTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_JOINT_ACCOUNTS;
        }
    };
    public static final PictogramDto PICTOGRAM_LIGHTBULB = new PictogramDto("PICTOGRAM_LIGHTBULB", 76) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_LIGHTBULB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_LIGHTBULB;
        }
    };
    public static final PictogramDto PICTOGRAM_LIGHTNING = new PictogramDto("PICTOGRAM_LIGHTNING", 77) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_LIGHTNING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_LIGHTNING;
        }
    };
    public static final PictogramDto PICTOGRAM_LIST = new PictogramDto("PICTOGRAM_LIST", 78) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_LIST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_LIST;
        }
    };
    public static final PictogramDto PICTOGRAM_LIVE_CHAT = new PictogramDto("PICTOGRAM_LIVE_CHAT", 79) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_LIVE_CHAT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_LIVE_CHAT;
        }
    };
    public static final PictogramDto PICTOGRAM_LOCK = new PictogramDto("PICTOGRAM_LOCK", 80) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_LOCK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_LOCK;
        }
    };
    public static final PictogramDto PICTOGRAM_MANAGED_ACCOUNTS = new PictogramDto("PICTOGRAM_MANAGED_ACCOUNTS", 81) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_MANAGED_ACCOUNTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_MANAGED_ACCOUNTS;
        }
    };
    public static final PictogramDto PICTOGRAM_MARGIN = new PictogramDto("PICTOGRAM_MARGIN", 82) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_MARGIN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_MARGIN;
        }
    };
    public static final PictogramDto PICTOGRAM_MEGAPHONE = new PictogramDto("PICTOGRAM_MEGAPHONE", 83) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_MEGAPHONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_MEGAPHONE;
        }
    };
    public static final PictogramDto PICTOGRAM_MONEY = new PictogramDto("PICTOGRAM_MONEY", 84) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_MONEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_MONEY;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES", 85) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_LIMIT = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_LIMIT", 86) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_LIMIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP", 87) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_MARKET = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_MARKET", 88) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_MARKET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_MARKET;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_STOP", 89) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP", 90) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS", 91) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS = new PictogramDto("PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS", 92) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT = new PictogramDto("PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT", 93) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_SELL_LIMIT = new PictogramDto("PICTOGRAM_ORDER_TYPES_SELL_LIMIT", 94) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_LIMIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP", 95) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_SELL_MARKET = new PictogramDto("PICTOGRAM_ORDER_TYPES_SELL_MARKET", 96) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_MARKET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_MARKET;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_SELL_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_SELL_STOP", 97) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP = new PictogramDto("PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP", 98) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP;
        }
    };
    public static final PictogramDto PICTOGRAM_PAYMENT_CARD = new PictogramDto("PICTOGRAM_PAYMENT_CARD", 99) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PAYMENT_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PAYMENT_CARD;
        }
    };
    public static final PictogramDto PICTOGRAM_PAYROLL = new PictogramDto("PICTOGRAM_PAYROLL", 100) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PAYROLL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PAYROLL;
        }
    };
    public static final PictogramDto PICTOGRAM_PERCENT_SIGN = new PictogramDto("PICTOGRAM_PERCENT_SIGN", 101) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PERCENT_SIGN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PERCENT_SIGN;
        }
    };
    public static final PictogramDto PICTOGRAM_PERSON = new PictogramDto("PICTOGRAM_PERSON", 102) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PERSON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PERSON;
        }
    };
    public static final PictogramDto PICTOGRAM_PHONE = new PictogramDto("PICTOGRAM_PHONE", 103) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PHONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PHONE;
        }
    };
    public static final PictogramDto PICTOGRAM_PIE_CHART = new PictogramDto("PICTOGRAM_PIE_CHART", 104) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PIE_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PIE_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_PIGGY_BANK = new PictogramDto("PICTOGRAM_PIGGY_BANK", 105) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PIGGY_BANK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PIGGY_BANK;
        }
    };
    public static final PictogramDto PICTOGRAM_POUND_SIGN = new PictogramDto("PICTOGRAM_POUND_SIGN", 106) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_POUND_SIGN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_POUND_SIGN;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_CHART = new PictogramDto("PICTOGRAM_PRIME_CHART", 107) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_DOLLAR_SIGN = new PictogramDto("PICTOGRAM_PRIME_DOLLAR_SIGN", 108) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_DOLLAR_SIGN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_DOLLAR_SIGN;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_FLAG = new PictogramDto("PICTOGRAM_PRIME_FLAG", 109) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_FLAG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_FLAG;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_FLOWER = new PictogramDto("PICTOGRAM_PRIME_FLOWER", 110) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_FLOWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_FLOWER;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_FORWARD_SPLIT = new PictogramDto("PICTOGRAM_PRIME_FORWARD_SPLIT", 111) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_FORWARD_SPLIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_FORWARD_SPLIT;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_GIFT = new PictogramDto("PICTOGRAM_PRIME_GIFT", 112) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_GIFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_GIFT;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_MONEY = new PictogramDto("PICTOGRAM_PRIME_MONEY", 113) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_MONEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_MONEY;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_PIE_CHART = new PictogramDto("PICTOGRAM_PRIME_PIE_CHART", 114) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_PIE_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_PIE_CHART;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_POUND_SIGN = new PictogramDto("PICTOGRAM_PRIME_POUND_SIGN", 115) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_POUND_SIGN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_POUND_SIGN;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_RECURRING = new PictogramDto("PICTOGRAM_PRIME_RECURRING", 116) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_RECURRING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_RECURRING;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_RETIREMENT = new PictogramDto("PICTOGRAM_PRIME_RETIREMENT", 117) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_RETIREMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_RETIREMENT;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_REVERSE_SPLIT = new PictogramDto("PICTOGRAM_PRIME_REVERSE_SPLIT", 118) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_REVERSE_SPLIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_REVERSE_SPLIT;
        }
    };
    public static final PictogramDto PICTOGRAM_PRIME_ROBOT = new PictogramDto("PICTOGRAM_PRIME_ROBOT", 119) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_PRIME_ROBOT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_PRIME_ROBOT;
        }
    };
    public static final PictogramDto PICTOGRAM_RECURRING = new PictogramDto("PICTOGRAM_RECURRING", 120) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_RECURRING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_RECURRING;
        }
    };
    public static final PictogramDto PICTOGRAM_RETIREMENT = new PictogramDto("PICTOGRAM_RETIREMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_RETIREMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_RETIREMENT;
        }
    };
    public static final PictogramDto PICTOGRAM_ROBINHOOD = new PictogramDto("PICTOGRAM_ROBINHOOD", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_ROBINHOOD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_ROBINHOOD;
        }
    };
    public static final PictogramDto PICTOGRAM_SMILEY = new PictogramDto("PICTOGRAM_SMILEY", 123) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_SMILEY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_SMILEY;
        }
    };
    public static final PictogramDto PICTOGRAM_SPARKLE = new PictogramDto("PICTOGRAM_SPARKLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_SPARKLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_SPARKLE;
        }
    };
    public static final PictogramDto PICTOGRAM_START = new PictogramDto("PICTOGRAM_START", 125) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_START;
        }
    };
    public static final PictogramDto PICTOGRAM_STOPWATCH = new PictogramDto("PICTOGRAM_STOPWATCH", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_STOPWATCH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_STOPWATCH;
        }
    };
    public static final PictogramDto PICTOGRAM_SUBMARINE = new PictogramDto("PICTOGRAM_SUBMARINE", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_SUBMARINE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_SUBMARINE;
        }
    };
    public static final PictogramDto PICTOGRAM_TAX_LOTS = new PictogramDto("PICTOGRAM_TAX_LOTS", 128) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_TAX_LOTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_TAX_LOTS;
        }
    };
    public static final PictogramDto PICTOGRAM_TRANSFER = new PictogramDto("PICTOGRAM_TRANSFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_TRANSFER;
        }
    };
    public static final PictogramDto PICTOGRAM_UMBRELLA = new PictogramDto("PICTOGRAM_UMBRELLA", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_UMBRELLA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_UMBRELLA;
        }
    };
    public static final PictogramDto PICTOGRAM_UNLOCK = new PictogramDto("PICTOGRAM_UNLOCK", 131) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_UNLOCK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_UNLOCK;
        }
    };
    public static final PictogramDto PICTOGRAM_WARNING = new PictogramDto("PICTOGRAM_WARNING", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_WARNING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_WARNING;
        }
    };
    public static final PictogramDto PICTOGRAM_WITHDRAW = new PictogramDto("PICTOGRAM_WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE) { // from class: rh_server_driven_ui.v1.PictogramDto.PICTOGRAM_WITHDRAW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Pictogram toProto() {
            return Pictogram.PICTOGRAM_WITHDRAW;
        }
    };

    private static final /* synthetic */ PictogramDto[] $values() {
        return new PictogramDto[]{PICTOGRAM_UNSPECIFIED, PICTOGRAM_ACCESSIBILITY, PICTOGRAM_AGENT, PICTOGRAM_BANK, PICTOGRAM_BAR_CHART, PICTOGRAM_BASKETBALL, PICTOGRAM_BELL, PICTOGRAM_BILLS, PICTOGRAM_BINOCULARS, PICTOGRAM_BOOK, PICTOGRAM_BULLET, PICTOGRAM_CALENDAR, PICTOGRAM_CANCEL_CARD, PICTOGRAM_CASH, PICTOGRAM_CASH_ATM, PICTOGRAM_CASH_CALENDAR, PICTOGRAM_CASH_CONTACTLESS_PAYMENT, PICTOGRAM_CASH_DOCUMENTS, PICTOGRAM_CASH_FLOWER, PICTOGRAM_CASH_FREE, PICTOGRAM_CASH_MONEY, PICTOGRAM_CASH_PAYMENT_CARD, PICTOGRAM_CASH_SECURITY, PICTOGRAM_CASH_START, PICTOGRAM_CASH_THUMBS_UP, PICTOGRAM_CASH_UMBRELLA, PICTOGRAM_CASH_WARNING, PICTOGRAM_CHART, PICTOGRAM_CHAT, PICTOGRAM_CHATBOT, PICTOGRAM_CHECK, PICTOGRAM_CLIPBOARD, PICTOGRAM_CORTEX, PICTOGRAM_CRYPTO, PICTOGRAM_CRYPTO_C, PICTOGRAM_CRYPTO_GIFT, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS, PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS, PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP, PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP, PICTOGRAM_DEPOSIT, PICTOGRAM_DESKTOP, PICTOGRAM_DOCUMENTS, PICTOGRAM_DOLLAR_SIGN, PICTOGRAM_ENVELOPE, PICTOGRAM_ETF, PICTOGRAM_EYE_OPEN, PICTOGRAM_FACE, PICTOGRAM_FLAG, PICTOGRAM_FLOWER, PICTOGRAM_FOOTBALL, PICTOGRAM_FREE, PICTOGRAM_GIFT, PICTOGRAM_GOLD_BAR_CHART, PICTOGRAM_GOLD_CALENDAR, PICTOGRAM_GOLD_DOCUMENTS, PICTOGRAM_GOLD_GIFT, PICTOGRAM_GOLD_MARGIN, PICTOGRAM_GOLD_MONEY, PICTOGRAM_GOLD_PIGGY_BANK, PICTOGRAM_GOLD_STOPWATCH, PICTOGRAM_HELP, PICTOGRAM_HOCKEY, PICTOGRAM_INVESTING, PICTOGRAM_JOINT_ACCOUNTS, PICTOGRAM_LIGHTBULB, PICTOGRAM_LIGHTNING, PICTOGRAM_LIST, PICTOGRAM_LIVE_CHAT, PICTOGRAM_LOCK, PICTOGRAM_MANAGED_ACCOUNTS, PICTOGRAM_MARGIN, PICTOGRAM_MEGAPHONE, PICTOGRAM_MONEY, PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES, PICTOGRAM_ORDER_TYPES_BUY_LIMIT, PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP, PICTOGRAM_ORDER_TYPES_BUY_MARKET, PICTOGRAM_ORDER_TYPES_BUY_STOP, PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP, PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS, PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS, PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT, PICTOGRAM_ORDER_TYPES_SELL_LIMIT, PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP, PICTOGRAM_ORDER_TYPES_SELL_MARKET, PICTOGRAM_ORDER_TYPES_SELL_STOP, PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP, PICTOGRAM_PAYMENT_CARD, PICTOGRAM_PAYROLL, PICTOGRAM_PERCENT_SIGN, PICTOGRAM_PERSON, PICTOGRAM_PHONE, PICTOGRAM_PIE_CHART, PICTOGRAM_PIGGY_BANK, PICTOGRAM_POUND_SIGN, PICTOGRAM_PRIME_CHART, PICTOGRAM_PRIME_DOLLAR_SIGN, PICTOGRAM_PRIME_FLAG, PICTOGRAM_PRIME_FLOWER, PICTOGRAM_PRIME_FORWARD_SPLIT, PICTOGRAM_PRIME_GIFT, PICTOGRAM_PRIME_MONEY, PICTOGRAM_PRIME_PIE_CHART, PICTOGRAM_PRIME_POUND_SIGN, PICTOGRAM_PRIME_RECURRING, PICTOGRAM_PRIME_RETIREMENT, PICTOGRAM_PRIME_REVERSE_SPLIT, PICTOGRAM_PRIME_ROBOT, PICTOGRAM_RECURRING, PICTOGRAM_RETIREMENT, PICTOGRAM_ROBINHOOD, PICTOGRAM_SMILEY, PICTOGRAM_SPARKLE, PICTOGRAM_START, PICTOGRAM_STOPWATCH, PICTOGRAM_SUBMARINE, PICTOGRAM_TAX_LOTS, PICTOGRAM_TRANSFER, PICTOGRAM_UMBRELLA, PICTOGRAM_UNLOCK, PICTOGRAM_WARNING, PICTOGRAM_WITHDRAW};
    }

    public /* synthetic */ PictogramDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PictogramDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PictogramDto(String str, int i) {
    }

    static {
        PictogramDto[] pictogramDtoArr$values = $values();
        $VALUES = pictogramDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pictogramDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.PictogramDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PictogramDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: PictogramDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/PictogramDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/PictogramDto;", "Lrh_server_driven_ui/v1/Pictogram;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/PictogramDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<PictogramDto, Pictogram> {

        /* compiled from: PictogramDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Pictogram.values().length];
                try {
                    iArr[Pictogram.PICTOGRAM_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ACCESSIBILITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_AGENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BANK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BAR_CHART.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BASKETBALL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BELL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BILLS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BINOCULARS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BOOK.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_BULLET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CALENDAR.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CANCEL_CARD.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_ATM.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_CALENDAR.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_CONTACTLESS_PAYMENT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_DOCUMENTS.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_FLOWER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_FREE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_MONEY.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_PAYMENT_CARD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_SECURITY.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_THUMBS_UP.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_UMBRELLA.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CASH_WARNING.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CHART.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CHAT.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CHATBOT.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CHECK.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CLIPBOARD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CORTEX.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_C.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_GIFT.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_DEPOSIT.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_DESKTOP.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_DOCUMENTS.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_DOLLAR_SIGN.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ENVELOPE.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ETF.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_EYE_OPEN.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_FACE.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_FLAG.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_FLOWER.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_FOOTBALL.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_FREE.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GIFT.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_BAR_CHART.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_CALENDAR.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_DOCUMENTS.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_GIFT.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_MARGIN.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_MONEY.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_PIGGY_BANK.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_GOLD_STOPWATCH.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_HELP.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_HOCKEY.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_INVESTING.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_JOINT_ACCOUNTS.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_LIGHTBULB.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_LIGHTNING.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_LIST.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_LIVE_CHAT.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_LOCK.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_MANAGED_ACCOUNTS.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_MARGIN.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_MEGAPHONE.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_MONEY.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_MARKET.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_STOP.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_SELL_MARKET.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_SELL_STOP.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PAYMENT_CARD.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PAYROLL.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PERCENT_SIGN.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PERSON.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PHONE.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PIE_CHART.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PIGGY_BANK.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_POUND_SIGN.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_CHART.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_DOLLAR_SIGN.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_FLAG.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_FLOWER.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_FORWARD_SPLIT.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_GIFT.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_MONEY.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_PIE_CHART.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_POUND_SIGN.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_RECURRING.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_RETIREMENT.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_REVERSE_SPLIT.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_PRIME_ROBOT.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_RECURRING.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_RETIREMENT.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_ROBINHOOD.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_SMILEY.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_SPARKLE.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_START.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_STOPWATCH.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_SUBMARINE.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_TAX_LOTS.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_TRANSFER.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_UMBRELLA.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_UNLOCK.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_WARNING.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[Pictogram.PICTOGRAM_WITHDRAW.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PictogramDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PictogramDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PictogramDto> getBinaryBase64Serializer() {
            return (KSerializer) PictogramDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Pictogram> getProtoAdapter() {
            return Pictogram.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PictogramDto getZeroValue() {
            return PictogramDto.PICTOGRAM_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PictogramDto fromProto(Pictogram proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return PictogramDto.PICTOGRAM_UNSPECIFIED;
                case 2:
                    return PictogramDto.PICTOGRAM_ACCESSIBILITY;
                case 3:
                    return PictogramDto.PICTOGRAM_AGENT;
                case 4:
                    return PictogramDto.PICTOGRAM_BANK;
                case 5:
                    return PictogramDto.PICTOGRAM_BAR_CHART;
                case 6:
                    return PictogramDto.PICTOGRAM_BASKETBALL;
                case 7:
                    return PictogramDto.PICTOGRAM_BELL;
                case 8:
                    return PictogramDto.PICTOGRAM_BILLS;
                case 9:
                    return PictogramDto.PICTOGRAM_BINOCULARS;
                case 10:
                    return PictogramDto.PICTOGRAM_BOOK;
                case 11:
                    return PictogramDto.PICTOGRAM_BULLET;
                case 12:
                    return PictogramDto.PICTOGRAM_CALENDAR;
                case 13:
                    return PictogramDto.PICTOGRAM_CANCEL_CARD;
                case 14:
                    return PictogramDto.PICTOGRAM_CASH;
                case 15:
                    return PictogramDto.PICTOGRAM_CASH_ATM;
                case 16:
                    return PictogramDto.PICTOGRAM_CASH_CALENDAR;
                case 17:
                    return PictogramDto.PICTOGRAM_CASH_CONTACTLESS_PAYMENT;
                case 18:
                    return PictogramDto.PICTOGRAM_CASH_DOCUMENTS;
                case 19:
                    return PictogramDto.PICTOGRAM_CASH_FLOWER;
                case 20:
                    return PictogramDto.PICTOGRAM_CASH_FREE;
                case 21:
                    return PictogramDto.PICTOGRAM_CASH_MONEY;
                case 22:
                    return PictogramDto.PICTOGRAM_CASH_PAYMENT_CARD;
                case 23:
                    return PictogramDto.PICTOGRAM_CASH_SECURITY;
                case 24:
                    return PictogramDto.PICTOGRAM_CASH_START;
                case 25:
                    return PictogramDto.PICTOGRAM_CASH_THUMBS_UP;
                case 26:
                    return PictogramDto.PICTOGRAM_CASH_UMBRELLA;
                case 27:
                    return PictogramDto.PICTOGRAM_CASH_WARNING;
                case 28:
                    return PictogramDto.PICTOGRAM_CHART;
                case 29:
                    return PictogramDto.PICTOGRAM_CHAT;
                case 30:
                    return PictogramDto.PICTOGRAM_CHATBOT;
                case 31:
                    return PictogramDto.PICTOGRAM_CHECK;
                case 32:
                    return PictogramDto.PICTOGRAM_CLIPBOARD;
                case 33:
                    return PictogramDto.PICTOGRAM_CORTEX;
                case 34:
                    return PictogramDto.PICTOGRAM_CRYPTO;
                case 35:
                    return PictogramDto.PICTOGRAM_CRYPTO_C;
                case 36:
                    return PictogramDto.PICTOGRAM_CRYPTO_GIFT;
                case 37:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_IN_SHARES;
                case 38:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT;
                case 39:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_LIMIT_STOP;
                case 40:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_MARKET;
                case 41:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_STOP;
                case 42:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_TRAILING_STOP;
                case 43:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_CRYPTO;
                case 44:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_DOLLARS;
                case 45:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_BUY_WITH_EUROS;
                case 46:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_RECURRING_INVESTMENT;
                case 47:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT;
                case 48:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_LIMIT_STOP;
                case 49:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_MARKET;
                case 50:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_STOP;
                case 51:
                    return PictogramDto.PICTOGRAM_CRYPTO_ORDER_TYPES_SELL_TRAILING_STOP;
                case 52:
                    return PictogramDto.PICTOGRAM_DEPOSIT;
                case 53:
                    return PictogramDto.PICTOGRAM_DESKTOP;
                case 54:
                    return PictogramDto.PICTOGRAM_DOCUMENTS;
                case 55:
                    return PictogramDto.PICTOGRAM_DOLLAR_SIGN;
                case 56:
                    return PictogramDto.PICTOGRAM_ENVELOPE;
                case 57:
                    return PictogramDto.PICTOGRAM_ETF;
                case 58:
                    return PictogramDto.PICTOGRAM_EYE_OPEN;
                case 59:
                    return PictogramDto.PICTOGRAM_FACE;
                case 60:
                    return PictogramDto.PICTOGRAM_FLAG;
                case 61:
                    return PictogramDto.PICTOGRAM_FLOWER;
                case 62:
                    return PictogramDto.PICTOGRAM_FOOTBALL;
                case 63:
                    return PictogramDto.PICTOGRAM_FREE;
                case 64:
                    return PictogramDto.PICTOGRAM_GIFT;
                case 65:
                    return PictogramDto.PICTOGRAM_GOLD_BAR_CHART;
                case 66:
                    return PictogramDto.PICTOGRAM_GOLD_CALENDAR;
                case 67:
                    return PictogramDto.PICTOGRAM_GOLD_DOCUMENTS;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return PictogramDto.PICTOGRAM_GOLD_GIFT;
                case 69:
                    return PictogramDto.PICTOGRAM_GOLD_MARGIN;
                case 70:
                    return PictogramDto.PICTOGRAM_GOLD_MONEY;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return PictogramDto.PICTOGRAM_GOLD_PIGGY_BANK;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return PictogramDto.PICTOGRAM_GOLD_STOPWATCH;
                case 73:
                    return PictogramDto.PICTOGRAM_HELP;
                case 74:
                    return PictogramDto.PICTOGRAM_HOCKEY;
                case 75:
                    return PictogramDto.PICTOGRAM_INVESTING;
                case 76:
                    return PictogramDto.PICTOGRAM_JOINT_ACCOUNTS;
                case 77:
                    return PictogramDto.PICTOGRAM_LIGHTBULB;
                case 78:
                    return PictogramDto.PICTOGRAM_LIGHTNING;
                case 79:
                    return PictogramDto.PICTOGRAM_LIST;
                case 80:
                    return PictogramDto.PICTOGRAM_LIVE_CHAT;
                case 81:
                    return PictogramDto.PICTOGRAM_LOCK;
                case 82:
                    return PictogramDto.PICTOGRAM_MANAGED_ACCOUNTS;
                case 83:
                    return PictogramDto.PICTOGRAM_MARGIN;
                case 84:
                    return PictogramDto.PICTOGRAM_MEGAPHONE;
                case 85:
                    return PictogramDto.PICTOGRAM_MONEY;
                case 86:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_IN_SHARES;
                case 87:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_LIMIT;
                case 88:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_LIMIT_STOP;
                case 89:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_MARKET;
                case 90:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_STOP;
                case 91:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_TRAILING_STOP;
                case 92:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_WITH_DOLLARS;
                case 93:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_BUY_WITH_EUROS;
                case 94:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_RECURRING_INVESTMENT;
                case 95:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_LIMIT;
                case 96:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_LIMIT_STOP;
                case 97:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_MARKET;
                case 98:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_STOP;
                case 99:
                    return PictogramDto.PICTOGRAM_ORDER_TYPES_SELL_TRAILING_STOP;
                case 100:
                    return PictogramDto.PICTOGRAM_PAYMENT_CARD;
                case 101:
                    return PictogramDto.PICTOGRAM_PAYROLL;
                case 102:
                    return PictogramDto.PICTOGRAM_PERCENT_SIGN;
                case 103:
                    return PictogramDto.PICTOGRAM_PERSON;
                case 104:
                    return PictogramDto.PICTOGRAM_PHONE;
                case 105:
                    return PictogramDto.PICTOGRAM_PIE_CHART;
                case 106:
                    return PictogramDto.PICTOGRAM_PIGGY_BANK;
                case 107:
                    return PictogramDto.PICTOGRAM_POUND_SIGN;
                case 108:
                    return PictogramDto.PICTOGRAM_PRIME_CHART;
                case 109:
                    return PictogramDto.PICTOGRAM_PRIME_DOLLAR_SIGN;
                case 110:
                    return PictogramDto.PICTOGRAM_PRIME_FLAG;
                case 111:
                    return PictogramDto.PICTOGRAM_PRIME_FLOWER;
                case 112:
                    return PictogramDto.PICTOGRAM_PRIME_FORWARD_SPLIT;
                case 113:
                    return PictogramDto.PICTOGRAM_PRIME_GIFT;
                case 114:
                    return PictogramDto.PICTOGRAM_PRIME_MONEY;
                case 115:
                    return PictogramDto.PICTOGRAM_PRIME_PIE_CHART;
                case 116:
                    return PictogramDto.PICTOGRAM_PRIME_POUND_SIGN;
                case 117:
                    return PictogramDto.PICTOGRAM_PRIME_RECURRING;
                case 118:
                    return PictogramDto.PICTOGRAM_PRIME_RETIREMENT;
                case 119:
                    return PictogramDto.PICTOGRAM_PRIME_REVERSE_SPLIT;
                case 120:
                    return PictogramDto.PICTOGRAM_PRIME_ROBOT;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return PictogramDto.PICTOGRAM_RECURRING;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return PictogramDto.PICTOGRAM_RETIREMENT;
                case 123:
                    return PictogramDto.PICTOGRAM_ROBINHOOD;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return PictogramDto.PICTOGRAM_SMILEY;
                case 125:
                    return PictogramDto.PICTOGRAM_SPARKLE;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return PictogramDto.PICTOGRAM_START;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return PictogramDto.PICTOGRAM_STOPWATCH;
                case 128:
                    return PictogramDto.PICTOGRAM_SUBMARINE;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return PictogramDto.PICTOGRAM_TAX_LOTS;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return PictogramDto.PICTOGRAM_TRANSFER;
                case 131:
                    return PictogramDto.PICTOGRAM_UMBRELLA;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return PictogramDto.PICTOGRAM_UNLOCK;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return PictogramDto.PICTOGRAM_WARNING;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return PictogramDto.PICTOGRAM_WITHDRAW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PictogramDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/PictogramDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/PictogramDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<PictogramDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<PictogramDto, Pictogram> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Pictogram", PictogramDto.getEntries(), PictogramDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public PictogramDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (PictogramDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PictogramDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static PictogramDto valueOf(String str) {
        return (PictogramDto) Enum.valueOf(PictogramDto.class, str);
    }

    public static PictogramDto[] values() {
        return (PictogramDto[]) $VALUES.clone();
    }
}
