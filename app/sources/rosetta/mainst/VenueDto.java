package rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.p320db.Quote;
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
/* compiled from: VenueDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002;<B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u0006="}, m3636d2 = {"Lrosetta/mainst/VenueDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/Venue;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "VENUE_UNSPECIFIED", "VENUE_CITADEL", "VENUE_JUMP", "VENUE_JANESTREET", "VENUE_NASDAQ", "EDGA", "EDGX", "CBOE_BYX", "CBOE_BZX", "NASDAQ_BX", "NYSE_AMERICAN", "CHICAGO", "NYSE_REGIONAL", "NYSE_ARCA", "PHILADELPHIA", "ADF", "NYSE_NATIONAL", "IEX", "CRYPTO_COMPARE", "OTCM", "VENUE_JUMP_CH1", "VENUE_B2C2", "VENUE_CUMBERLAND", "VENUE_BOATS", "VENUE_CIRCLE", "VENUE_TALOS", "VENUE_CRYPTO_OTC", "VENUE_WINTERMUTE", "VENUE_CITI", "VENUE_CME", "VENUE_DXFEED", "VENUE_BITSTAMP", "VENUE_KALSHI", "VENUE_FORECAST_EX", "VENUE_B2C2_FX", "VENUE_TALOS_EDXF", "VENUE_TALOS_BITSTAMP", "VENUE_WINTERMUTE_FX", "VENUE_360T", "VENUE_TALOS_REBATE", "VENUE_BRUCE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class VenueDto implements Dto2<Venue>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VenueDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<VenueDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<VenueDto, Venue>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final VenueDto VENUE_UNSPECIFIED = new VenueDto("VENUE_UNSPECIFIED", 0) { // from class: rosetta.mainst.VenueDto.VENUE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_UNSPECIFIED;
        }
    };
    public static final VenueDto VENUE_CITADEL = new VenueDto("VENUE_CITADEL", 1) { // from class: rosetta.mainst.VenueDto.VENUE_CITADEL
        {
            String str = "citadel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CITADEL;
        }
    };
    public static final VenueDto VENUE_JUMP = new VenueDto("VENUE_JUMP", 2) { // from class: rosetta.mainst.VenueDto.VENUE_JUMP
        {
            String str = "jump";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_JUMP;
        }
    };
    public static final VenueDto VENUE_JANESTREET = new VenueDto("VENUE_JANESTREET", 3) { // from class: rosetta.mainst.VenueDto.VENUE_JANESTREET
        {
            String str = "janestreet";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_JANESTREET;
        }
    };
    public static final VenueDto VENUE_NASDAQ = new VenueDto("VENUE_NASDAQ", 4) { // from class: rosetta.mainst.VenueDto.VENUE_NASDAQ
        {
            String str = "nasdaq";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_NASDAQ;
        }
    };
    public static final VenueDto EDGA = new VenueDto("EDGA", 5) { // from class: rosetta.mainst.VenueDto.EDGA
        {
            String str = "edga";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.EDGA;
        }
    };
    public static final VenueDto EDGX = new VenueDto("EDGX", 6) { // from class: rosetta.mainst.VenueDto.EDGX
        {
            String str = "edgx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.EDGX;
        }
    };
    public static final VenueDto CBOE_BYX = new VenueDto("CBOE_BYX", 7) { // from class: rosetta.mainst.VenueDto.CBOE_BYX
        {
            String str = "cboe_byx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.CBOE_BYX;
        }
    };
    public static final VenueDto CBOE_BZX = new VenueDto("CBOE_BZX", 8) { // from class: rosetta.mainst.VenueDto.CBOE_BZX
        {
            String str = "cboe_bzx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.CBOE_BZX;
        }
    };
    public static final VenueDto NASDAQ_BX = new VenueDto("NASDAQ_BX", 9) { // from class: rosetta.mainst.VenueDto.NASDAQ_BX
        {
            String str = "nasdaq_bx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.NASDAQ_BX;
        }
    };
    public static final VenueDto NYSE_AMERICAN = new VenueDto("NYSE_AMERICAN", 10) { // from class: rosetta.mainst.VenueDto.NYSE_AMERICAN
        {
            String str = "nyse_american";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.NYSE_AMERICAN;
        }
    };
    public static final VenueDto CHICAGO = new VenueDto("CHICAGO", 11) { // from class: rosetta.mainst.VenueDto.CHICAGO
        {
            String str = "chicago";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.CHICAGO;
        }
    };
    public static final VenueDto NYSE_REGIONAL = new VenueDto("NYSE_REGIONAL", 12) { // from class: rosetta.mainst.VenueDto.NYSE_REGIONAL
        {
            String str = "nyse_regional";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.NYSE_REGIONAL;
        }
    };
    public static final VenueDto NYSE_ARCA = new VenueDto("NYSE_ARCA", 13) { // from class: rosetta.mainst.VenueDto.NYSE_ARCA
        {
            String str = "nyse_arca";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.NYSE_ARCA;
        }
    };
    public static final VenueDto PHILADELPHIA = new VenueDto("PHILADELPHIA", 14) { // from class: rosetta.mainst.VenueDto.PHILADELPHIA
        {
            String str = "philadelphia";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.PHILADELPHIA;
        }
    };
    public static final VenueDto ADF = new VenueDto("ADF", 15) { // from class: rosetta.mainst.VenueDto.ADF
        {
            String str = "adf";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.ADF;
        }
    };
    public static final VenueDto NYSE_NATIONAL = new VenueDto("NYSE_NATIONAL", 16) { // from class: rosetta.mainst.VenueDto.NYSE_NATIONAL
        {
            String str = "nyse_national";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.NYSE_NATIONAL;
        }
    };
    public static final VenueDto IEX = new VenueDto("IEX", 17) { // from class: rosetta.mainst.VenueDto.IEX
        {
            String str = "iex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.IEX;
        }
    };
    public static final VenueDto CRYPTO_COMPARE = new VenueDto("CRYPTO_COMPARE", 18) { // from class: rosetta.mainst.VenueDto.CRYPTO_COMPARE
        {
            String str = "crypto_compare";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.CRYPTO_COMPARE;
        }
    };
    public static final VenueDto OTCM = new VenueDto("OTCM", 19) { // from class: rosetta.mainst.VenueDto.OTCM
        {
            String str = "otcm";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.OTCM;
        }
    };
    public static final VenueDto VENUE_JUMP_CH1 = new VenueDto("VENUE_JUMP_CH1", 20) { // from class: rosetta.mainst.VenueDto.VENUE_JUMP_CH1
        {
            String str = "jump_ch1";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_JUMP_CH1;
        }
    };
    public static final VenueDto VENUE_B2C2 = new VenueDto("VENUE_B2C2", 21) { // from class: rosetta.mainst.VenueDto.VENUE_B2C2
        {
            String str = "b2c2";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_B2C2;
        }
    };
    public static final VenueDto VENUE_CUMBERLAND = new VenueDto("VENUE_CUMBERLAND", 22) { // from class: rosetta.mainst.VenueDto.VENUE_CUMBERLAND
        {
            String str = "cumberland";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CUMBERLAND;
        }
    };
    public static final VenueDto VENUE_BOATS = new VenueDto("VENUE_BOATS", 23) { // from class: rosetta.mainst.VenueDto.VENUE_BOATS
        {
            String str = Quote.DATA_SOURCE_BOATS;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_BOATS;
        }
    };
    public static final VenueDto VENUE_CIRCLE = new VenueDto("VENUE_CIRCLE", 24) { // from class: rosetta.mainst.VenueDto.VENUE_CIRCLE
        {
            String str = "circle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CIRCLE;
        }
    };
    public static final VenueDto VENUE_TALOS = new VenueDto("VENUE_TALOS", 25) { // from class: rosetta.mainst.VenueDto.VENUE_TALOS
        {
            String str = "talos";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_TALOS;
        }
    };
    public static final VenueDto VENUE_CRYPTO_OTC = new VenueDto("VENUE_CRYPTO_OTC", 26) { // from class: rosetta.mainst.VenueDto.VENUE_CRYPTO_OTC
        {
            String str = "crypto_otc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CRYPTO_OTC;
        }
    };
    public static final VenueDto VENUE_WINTERMUTE = new VenueDto("VENUE_WINTERMUTE", 27) { // from class: rosetta.mainst.VenueDto.VENUE_WINTERMUTE
        {
            String str = "wintermute";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_WINTERMUTE;
        }
    };
    public static final VenueDto VENUE_CITI = new VenueDto("VENUE_CITI", 28) { // from class: rosetta.mainst.VenueDto.VENUE_CITI
        {
            String str = "citi";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CITI;
        }
    };
    public static final VenueDto VENUE_CME = new VenueDto("VENUE_CME", 29) { // from class: rosetta.mainst.VenueDto.VENUE_CME
        {
            String str = "cme";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_CME;
        }
    };
    public static final VenueDto VENUE_DXFEED = new VenueDto("VENUE_DXFEED", 30) { // from class: rosetta.mainst.VenueDto.VENUE_DXFEED
        {
            String str = "dxfeed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_DXFEED;
        }
    };
    public static final VenueDto VENUE_BITSTAMP = new VenueDto("VENUE_BITSTAMP", 31) { // from class: rosetta.mainst.VenueDto.VENUE_BITSTAMP
        {
            String str = "bitstamp";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_BITSTAMP;
        }
    };
    public static final VenueDto VENUE_KALSHI = new VenueDto("VENUE_KALSHI", 32) { // from class: rosetta.mainst.VenueDto.VENUE_KALSHI
        {
            String str = "kalshi";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_KALSHI;
        }
    };
    public static final VenueDto VENUE_FORECAST_EX = new VenueDto("VENUE_FORECAST_EX", 33) { // from class: rosetta.mainst.VenueDto.VENUE_FORECAST_EX
        {
            String str = "forecast_ex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_FORECAST_EX;
        }
    };
    public static final VenueDto VENUE_B2C2_FX = new VenueDto("VENUE_B2C2_FX", 34) { // from class: rosetta.mainst.VenueDto.VENUE_B2C2_FX
        {
            String str = "b2c2_fx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_B2C2_FX;
        }
    };
    public static final VenueDto VENUE_TALOS_EDXF = new VenueDto("VENUE_TALOS_EDXF", 35) { // from class: rosetta.mainst.VenueDto.VENUE_TALOS_EDXF
        {
            String str = "talos_edxf";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_TALOS_EDXF;
        }
    };
    public static final VenueDto VENUE_TALOS_BITSTAMP = new VenueDto("VENUE_TALOS_BITSTAMP", 36) { // from class: rosetta.mainst.VenueDto.VENUE_TALOS_BITSTAMP
        {
            String str = "talos_bitstamp";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_TALOS_BITSTAMP;
        }
    };
    public static final VenueDto VENUE_WINTERMUTE_FX = new VenueDto("VENUE_WINTERMUTE_FX", 37) { // from class: rosetta.mainst.VenueDto.VENUE_WINTERMUTE_FX
        {
            String str = "wintermute_fx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_WINTERMUTE_FX;
        }
    };
    public static final VenueDto VENUE_360T = new VenueDto("VENUE_360T", 38) { // from class: rosetta.mainst.VenueDto.VENUE_360T
        {
            String str = "360t";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_360T;
        }
    };
    public static final VenueDto VENUE_TALOS_REBATE = new VenueDto("VENUE_TALOS_REBATE", 39) { // from class: rosetta.mainst.VenueDto.VENUE_TALOS_REBATE
        {
            String str = "talos_rebate";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_TALOS_REBATE;
        }
    };
    public static final VenueDto VENUE_BRUCE = new VenueDto("VENUE_BRUCE", 40) { // from class: rosetta.mainst.VenueDto.VENUE_BRUCE
        {
            String str = Quote.DATA_SOURCE_BRUCE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Venue toProto() {
            return Venue.VENUE_BRUCE;
        }
    };

    private static final /* synthetic */ VenueDto[] $values() {
        return new VenueDto[]{VENUE_UNSPECIFIED, VENUE_CITADEL, VENUE_JUMP, VENUE_JANESTREET, VENUE_NASDAQ, EDGA, EDGX, CBOE_BYX, CBOE_BZX, NASDAQ_BX, NYSE_AMERICAN, CHICAGO, NYSE_REGIONAL, NYSE_ARCA, PHILADELPHIA, ADF, NYSE_NATIONAL, IEX, CRYPTO_COMPARE, OTCM, VENUE_JUMP_CH1, VENUE_B2C2, VENUE_CUMBERLAND, VENUE_BOATS, VENUE_CIRCLE, VENUE_TALOS, VENUE_CRYPTO_OTC, VENUE_WINTERMUTE, VENUE_CITI, VENUE_CME, VENUE_DXFEED, VENUE_BITSTAMP, VENUE_KALSHI, VENUE_FORECAST_EX, VENUE_B2C2_FX, VENUE_TALOS_EDXF, VENUE_TALOS_BITSTAMP, VENUE_WINTERMUTE_FX, VENUE_360T, VENUE_TALOS_REBATE, VENUE_BRUCE};
    }

    public /* synthetic */ VenueDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<VenueDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private VenueDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        VenueDto[] venueDtoArr$values = $values();
        $VALUES = venueDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(venueDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.VenueDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VenueDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: VenueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/VenueDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/VenueDto;", "Lrosetta/mainst/Venue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/VenueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<VenueDto, Venue> {

        /* compiled from: VenueDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Venue.values().length];
                try {
                    iArr[Venue.VENUE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Venue.VENUE_CITADEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Venue.VENUE_JUMP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Venue.VENUE_JANESTREET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Venue.VENUE_NASDAQ.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Venue.EDGA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Venue.EDGX.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Venue.CBOE_BYX.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Venue.CBOE_BZX.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Venue.NASDAQ_BX.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Venue.NYSE_AMERICAN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Venue.CHICAGO.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Venue.NYSE_REGIONAL.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Venue.NYSE_ARCA.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Venue.PHILADELPHIA.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Venue.ADF.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Venue.NYSE_NATIONAL.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Venue.IEX.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Venue.CRYPTO_COMPARE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Venue.OTCM.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Venue.VENUE_JUMP_CH1.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Venue.VENUE_B2C2.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Venue.VENUE_CUMBERLAND.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Venue.VENUE_BOATS.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Venue.VENUE_CIRCLE.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Venue.VENUE_TALOS.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Venue.VENUE_CRYPTO_OTC.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Venue.VENUE_WINTERMUTE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Venue.VENUE_CITI.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Venue.VENUE_CME.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Venue.VENUE_DXFEED.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Venue.VENUE_BITSTAMP.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Venue.VENUE_KALSHI.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Venue.VENUE_FORECAST_EX.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Venue.VENUE_B2C2_FX.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Venue.VENUE_TALOS_EDXF.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Venue.VENUE_TALOS_BITSTAMP.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Venue.VENUE_WINTERMUTE_FX.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Venue.VENUE_360T.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Venue.VENUE_TALOS_REBATE.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Venue.VENUE_BRUCE.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VenueDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VenueDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VenueDto> getBinaryBase64Serializer() {
            return (KSerializer) VenueDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Venue> getProtoAdapter() {
            return Venue.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VenueDto getZeroValue() {
            return VenueDto.VENUE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VenueDto fromProto(Venue proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return VenueDto.VENUE_UNSPECIFIED;
                case 2:
                    return VenueDto.VENUE_CITADEL;
                case 3:
                    return VenueDto.VENUE_JUMP;
                case 4:
                    return VenueDto.VENUE_JANESTREET;
                case 5:
                    return VenueDto.VENUE_NASDAQ;
                case 6:
                    return VenueDto.EDGA;
                case 7:
                    return VenueDto.EDGX;
                case 8:
                    return VenueDto.CBOE_BYX;
                case 9:
                    return VenueDto.CBOE_BZX;
                case 10:
                    return VenueDto.NASDAQ_BX;
                case 11:
                    return VenueDto.NYSE_AMERICAN;
                case 12:
                    return VenueDto.CHICAGO;
                case 13:
                    return VenueDto.NYSE_REGIONAL;
                case 14:
                    return VenueDto.NYSE_ARCA;
                case 15:
                    return VenueDto.PHILADELPHIA;
                case 16:
                    return VenueDto.ADF;
                case 17:
                    return VenueDto.NYSE_NATIONAL;
                case 18:
                    return VenueDto.IEX;
                case 19:
                    return VenueDto.CRYPTO_COMPARE;
                case 20:
                    return VenueDto.OTCM;
                case 21:
                    return VenueDto.VENUE_JUMP_CH1;
                case 22:
                    return VenueDto.VENUE_B2C2;
                case 23:
                    return VenueDto.VENUE_CUMBERLAND;
                case 24:
                    return VenueDto.VENUE_BOATS;
                case 25:
                    return VenueDto.VENUE_CIRCLE;
                case 26:
                    return VenueDto.VENUE_TALOS;
                case 27:
                    return VenueDto.VENUE_CRYPTO_OTC;
                case 28:
                    return VenueDto.VENUE_WINTERMUTE;
                case 29:
                    return VenueDto.VENUE_CITI;
                case 30:
                    return VenueDto.VENUE_CME;
                case 31:
                    return VenueDto.VENUE_DXFEED;
                case 32:
                    return VenueDto.VENUE_BITSTAMP;
                case 33:
                    return VenueDto.VENUE_KALSHI;
                case 34:
                    return VenueDto.VENUE_FORECAST_EX;
                case 35:
                    return VenueDto.VENUE_B2C2_FX;
                case 36:
                    return VenueDto.VENUE_TALOS_EDXF;
                case 37:
                    return VenueDto.VENUE_TALOS_BITSTAMP;
                case 38:
                    return VenueDto.VENUE_WINTERMUTE_FX;
                case 39:
                    return VenueDto.VENUE_360T;
                case 40:
                    return VenueDto.VENUE_TALOS_REBATE;
                case 41:
                    return VenueDto.VENUE_BRUCE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: VenueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/VenueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/VenueDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<VenueDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<VenueDto, Venue> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.Venue", VenueDto.getEntries(), VenueDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public VenueDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (VenueDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, VenueDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static VenueDto valueOf(String str) {
        return (VenueDto) Enum.valueOf(VenueDto.class, str);
    }

    public static VenueDto[] values() {
        return (VenueDto[]) $VALUES.clone();
    }
}
