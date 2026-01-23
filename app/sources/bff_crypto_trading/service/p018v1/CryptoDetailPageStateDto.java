package bff_crypto_trading.service.p018v1;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: CryptoDetailPageStateDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002!\"B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED", "CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER", "CRYPTO_DETAIL_PAGE_STATE_CHART", "CRYPTO_DETAIL_PAGE_STATE_POSITION", "CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD", "CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION", "CRYPTO_DETAIL_PAGE_STATE_HISTORY", "CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES", "CRYPTO_DETAIL_PAGE_STATE_STAKING", "CRYPTO_DETAIL_PAGE_STATE_PERPETUALS", "CRYPTO_DETAIL_PAGE_STATE_STATS", "CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS", "CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS", "CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER", "CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS", "CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART", "CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS", "CRYPTO_DETAIL_PAGE_STATE_NEWSFEED", "CRYPTO_DETAIL_PAGE_STATE_RECURRING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class CryptoDetailPageStateDto implements Dto2<CryptoDetailPageState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoDetailPageStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CryptoDetailPageStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoDetailPageStateDto, CryptoDetailPageState>> binaryBase64Serializer$delegate;
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED", 0) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER", 1) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_CHART = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_CHART", 2) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CHART;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_POSITION = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_POSITION", 3) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_POSITION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_POSITION;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD", 4) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION", 5) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_HISTORY = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_HISTORY", 6) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_HISTORY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_HISTORY;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES", 7) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_STAKING = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_STAKING", 8) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_STAKING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STAKING;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_PERPETUALS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_PERPETUALS", 9) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_STATS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_STATS", 10) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_STATS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STATS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS", 11) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS", 12) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER", 13) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS", 14) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART", 15) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS", 16) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_NEWSFEED = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_NEWSFEED", 17) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED;
        }
    };
    public static final CryptoDetailPageStateDto CRYPTO_DETAIL_PAGE_STATE_RECURRING = new CryptoDetailPageStateDto("CRYPTO_DETAIL_PAGE_STATE_RECURRING", 18) { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_RECURRING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoDetailPageState toProto() {
            return CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_RECURRING;
        }
    };

    private static final /* synthetic */ CryptoDetailPageStateDto[] $values() {
        return new CryptoDetailPageStateDto[]{CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED, CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER, CRYPTO_DETAIL_PAGE_STATE_CHART, CRYPTO_DETAIL_PAGE_STATE_POSITION, CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD, CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION, CRYPTO_DETAIL_PAGE_STATE_HISTORY, CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES, CRYPTO_DETAIL_PAGE_STATE_STAKING, CRYPTO_DETAIL_PAGE_STATE_PERPETUALS, CRYPTO_DETAIL_PAGE_STATE_STATS, CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS, CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS, CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER, CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS, CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART, CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS, CRYPTO_DETAIL_PAGE_STATE_NEWSFEED, CRYPTO_DETAIL_PAGE_STATE_RECURRING};
    }

    public /* synthetic */ CryptoDetailPageStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<CryptoDetailPageStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoDetailPageStateDto(String str, int i) {
    }

    static {
        CryptoDetailPageStateDto[] cryptoDetailPageStateDtoArr$values = $values();
        $VALUES = cryptoDetailPageStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoDetailPageStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_crypto_trading.service.v1.CryptoDetailPageStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoDetailPageStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CryptoDetailPageStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CryptoDetailPageStateDto, CryptoDetailPageState> {

        /* compiled from: CryptoDetailPageStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoDetailPageState.values().length];
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CHART.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_POSITION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_HISTORY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STAKING.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STATS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_RECURRING.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoDetailPageStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoDetailPageStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoDetailPageStateDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoDetailPageStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoDetailPageState> getProtoAdapter() {
            return CryptoDetailPageState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoDetailPageStateDto getZeroValue() {
            return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoDetailPageStateDto fromProto(CryptoDetailPageState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED;
                case 2:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER;
                case 3:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_CHART;
                case 4:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_POSITION;
                case 5:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD;
                case 6:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION;
                case 7:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_HISTORY;
                case 8:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES;
                case 9:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_STAKING;
                case 10:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS;
                case 11:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_STATS;
                case 12:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS;
                case 13:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS;
                case 14:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER;
                case 15:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS;
                case 16:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART;
                case 17:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS;
                case 18:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED;
                case 19:
                    return CryptoDetailPageStateDto.CRYPTO_DETAIL_PAGE_STATE_RECURRING;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoDetailPageStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoDetailPageStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CryptoDetailPageStateDto, CryptoDetailPageState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_crypto_trading.service.v1.CryptoDetailPageState", CryptoDetailPageStateDto.getEntries(), CryptoDetailPageStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CryptoDetailPageStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CryptoDetailPageStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoDetailPageStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CryptoDetailPageStateDto valueOf(String str) {
        return (CryptoDetailPageStateDto) Enum.valueOf(CryptoDetailPageStateDto.class, str);
    }

    public static CryptoDetailPageStateDto[] values() {
        return (CryptoDetailPageStateDto[]) $VALUES.clone();
    }
}
