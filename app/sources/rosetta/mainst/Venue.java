package rosetta.mainst;

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
/* compiled from: Venue.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 22\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00063"}, m3636d2 = {"Lrosetta/mainst/Venue;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VENUE_UNSPECIFIED", "VENUE_CITADEL", "VENUE_JUMP", "VENUE_JANESTREET", "VENUE_NASDAQ", "EDGA", "EDGX", "CBOE_BYX", "CBOE_BZX", "NASDAQ_BX", "NYSE_AMERICAN", "CHICAGO", "NYSE_REGIONAL", "NYSE_ARCA", "PHILADELPHIA", "ADF", "NYSE_NATIONAL", "IEX", "CRYPTO_COMPARE", "OTCM", "VENUE_JUMP_CH1", "VENUE_B2C2", "VENUE_CUMBERLAND", "VENUE_BOATS", "VENUE_CIRCLE", "VENUE_TALOS", "VENUE_CRYPTO_OTC", "VENUE_WINTERMUTE", "VENUE_CITI", "VENUE_CME", "VENUE_DXFEED", "VENUE_BITSTAMP", "VENUE_KALSHI", "VENUE_FORECAST_EX", "VENUE_B2C2_FX", "VENUE_TALOS_EDXF", "VENUE_TALOS_BITSTAMP", "VENUE_WINTERMUTE_FX", "VENUE_360T", "VENUE_TALOS_REBATE", "VENUE_BRUCE", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Venue implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Venue[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Venue> ADAPTER;
    public static final Venue ADF;
    public static final Venue CBOE_BYX;
    public static final Venue CBOE_BZX;
    public static final Venue CHICAGO;
    public static final Venue CRYPTO_COMPARE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Venue EDGA;
    public static final Venue EDGX;
    public static final Venue IEX;
    public static final Venue NASDAQ_BX;
    public static final Venue NYSE_AMERICAN;
    public static final Venue NYSE_ARCA;
    public static final Venue NYSE_NATIONAL;
    public static final Venue NYSE_REGIONAL;
    public static final Venue OTCM;
    public static final Venue PHILADELPHIA;
    public static final Venue VENUE_360T;
    public static final Venue VENUE_B2C2;
    public static final Venue VENUE_B2C2_FX;
    public static final Venue VENUE_BITSTAMP;
    public static final Venue VENUE_BOATS;
    public static final Venue VENUE_BRUCE;
    public static final Venue VENUE_CIRCLE;
    public static final Venue VENUE_CITADEL;
    public static final Venue VENUE_CITI;
    public static final Venue VENUE_CME;
    public static final Venue VENUE_CRYPTO_OTC;
    public static final Venue VENUE_CUMBERLAND;
    public static final Venue VENUE_DXFEED;
    public static final Venue VENUE_FORECAST_EX;
    public static final Venue VENUE_JANESTREET;
    public static final Venue VENUE_JUMP;
    public static final Venue VENUE_JUMP_CH1;
    public static final Venue VENUE_KALSHI;
    public static final Venue VENUE_NASDAQ;
    public static final Venue VENUE_TALOS;
    public static final Venue VENUE_TALOS_BITSTAMP;
    public static final Venue VENUE_TALOS_EDXF;
    public static final Venue VENUE_TALOS_REBATE;
    public static final Venue VENUE_UNSPECIFIED;
    public static final Venue VENUE_WINTERMUTE;
    public static final Venue VENUE_WINTERMUTE_FX;
    private final int value;

    private static final /* synthetic */ Venue[] $values() {
        return new Venue[]{VENUE_UNSPECIFIED, VENUE_CITADEL, VENUE_JUMP, VENUE_JANESTREET, VENUE_NASDAQ, EDGA, EDGX, CBOE_BYX, CBOE_BZX, NASDAQ_BX, NYSE_AMERICAN, CHICAGO, NYSE_REGIONAL, NYSE_ARCA, PHILADELPHIA, ADF, NYSE_NATIONAL, IEX, CRYPTO_COMPARE, OTCM, VENUE_JUMP_CH1, VENUE_B2C2, VENUE_CUMBERLAND, VENUE_BOATS, VENUE_CIRCLE, VENUE_TALOS, VENUE_CRYPTO_OTC, VENUE_WINTERMUTE, VENUE_CITI, VENUE_CME, VENUE_DXFEED, VENUE_BITSTAMP, VENUE_KALSHI, VENUE_FORECAST_EX, VENUE_B2C2_FX, VENUE_TALOS_EDXF, VENUE_TALOS_BITSTAMP, VENUE_WINTERMUTE_FX, VENUE_360T, VENUE_TALOS_REBATE, VENUE_BRUCE};
    }

    @JvmStatic
    public static final Venue fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Venue> getEntries() {
        return $ENTRIES;
    }

    private Venue(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Venue venue = new Venue("VENUE_UNSPECIFIED", 0, 0);
        VENUE_UNSPECIFIED = venue;
        VENUE_CITADEL = new Venue("VENUE_CITADEL", 1, 1);
        VENUE_JUMP = new Venue("VENUE_JUMP", 2, 2);
        VENUE_JANESTREET = new Venue("VENUE_JANESTREET", 3, 3);
        VENUE_NASDAQ = new Venue("VENUE_NASDAQ", 4, 4);
        EDGA = new Venue("EDGA", 5, 5);
        EDGX = new Venue("EDGX", 6, 6);
        CBOE_BYX = new Venue("CBOE_BYX", 7, 7);
        CBOE_BZX = new Venue("CBOE_BZX", 8, 8);
        NASDAQ_BX = new Venue("NASDAQ_BX", 9, 9);
        NYSE_AMERICAN = new Venue("NYSE_AMERICAN", 10, 10);
        CHICAGO = new Venue("CHICAGO", 11, 11);
        NYSE_REGIONAL = new Venue("NYSE_REGIONAL", 12, 12);
        NYSE_ARCA = new Venue("NYSE_ARCA", 13, 13);
        PHILADELPHIA = new Venue("PHILADELPHIA", 14, 14);
        ADF = new Venue("ADF", 15, 15);
        NYSE_NATIONAL = new Venue("NYSE_NATIONAL", 16, 16);
        IEX = new Venue("IEX", 17, 17);
        CRYPTO_COMPARE = new Venue("CRYPTO_COMPARE", 18, 18);
        OTCM = new Venue("OTCM", 19, 19);
        VENUE_JUMP_CH1 = new Venue("VENUE_JUMP_CH1", 20, 20);
        VENUE_B2C2 = new Venue("VENUE_B2C2", 21, 21);
        VENUE_CUMBERLAND = new Venue("VENUE_CUMBERLAND", 22, 22);
        VENUE_BOATS = new Venue("VENUE_BOATS", 23, 23);
        VENUE_CIRCLE = new Venue("VENUE_CIRCLE", 24, 24);
        VENUE_TALOS = new Venue("VENUE_TALOS", 25, 25);
        VENUE_CRYPTO_OTC = new Venue("VENUE_CRYPTO_OTC", 26, 26);
        VENUE_WINTERMUTE = new Venue("VENUE_WINTERMUTE", 27, 27);
        VENUE_CITI = new Venue("VENUE_CITI", 28, 28);
        VENUE_CME = new Venue("VENUE_CME", 29, 29);
        VENUE_DXFEED = new Venue("VENUE_DXFEED", 30, 30);
        VENUE_BITSTAMP = new Venue("VENUE_BITSTAMP", 31, 31);
        VENUE_KALSHI = new Venue("VENUE_KALSHI", 32, 32);
        VENUE_FORECAST_EX = new Venue("VENUE_FORECAST_EX", 33, 33);
        VENUE_B2C2_FX = new Venue("VENUE_B2C2_FX", 34, 34);
        VENUE_TALOS_EDXF = new Venue("VENUE_TALOS_EDXF", 35, 35);
        VENUE_TALOS_BITSTAMP = new Venue("VENUE_TALOS_BITSTAMP", 36, 36);
        VENUE_WINTERMUTE_FX = new Venue("VENUE_WINTERMUTE_FX", 37, 37);
        VENUE_360T = new Venue("VENUE_360T", 38, 38);
        VENUE_TALOS_REBATE = new Venue("VENUE_TALOS_REBATE", 39, 39);
        VENUE_BRUCE = new Venue("VENUE_BRUCE", 40, 40);
        Venue[] venueArr$values = $values();
        $VALUES = venueArr$values;
        $ENTRIES = EnumEntries2.enumEntries(venueArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Venue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Venue>(orCreateKotlinClass, syntax, venue) { // from class: rosetta.mainst.Venue$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Venue fromValue(int value) {
                return Venue.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Venue.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/Venue$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/Venue;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Venue fromValue(int value) {
            switch (value) {
                case 0:
                    return Venue.VENUE_UNSPECIFIED;
                case 1:
                    return Venue.VENUE_CITADEL;
                case 2:
                    return Venue.VENUE_JUMP;
                case 3:
                    return Venue.VENUE_JANESTREET;
                case 4:
                    return Venue.VENUE_NASDAQ;
                case 5:
                    return Venue.EDGA;
                case 6:
                    return Venue.EDGX;
                case 7:
                    return Venue.CBOE_BYX;
                case 8:
                    return Venue.CBOE_BZX;
                case 9:
                    return Venue.NASDAQ_BX;
                case 10:
                    return Venue.NYSE_AMERICAN;
                case 11:
                    return Venue.CHICAGO;
                case 12:
                    return Venue.NYSE_REGIONAL;
                case 13:
                    return Venue.NYSE_ARCA;
                case 14:
                    return Venue.PHILADELPHIA;
                case 15:
                    return Venue.ADF;
                case 16:
                    return Venue.NYSE_NATIONAL;
                case 17:
                    return Venue.IEX;
                case 18:
                    return Venue.CRYPTO_COMPARE;
                case 19:
                    return Venue.OTCM;
                case 20:
                    return Venue.VENUE_JUMP_CH1;
                case 21:
                    return Venue.VENUE_B2C2;
                case 22:
                    return Venue.VENUE_CUMBERLAND;
                case 23:
                    return Venue.VENUE_BOATS;
                case 24:
                    return Venue.VENUE_CIRCLE;
                case 25:
                    return Venue.VENUE_TALOS;
                case 26:
                    return Venue.VENUE_CRYPTO_OTC;
                case 27:
                    return Venue.VENUE_WINTERMUTE;
                case 28:
                    return Venue.VENUE_CITI;
                case 29:
                    return Venue.VENUE_CME;
                case 30:
                    return Venue.VENUE_DXFEED;
                case 31:
                    return Venue.VENUE_BITSTAMP;
                case 32:
                    return Venue.VENUE_KALSHI;
                case 33:
                    return Venue.VENUE_FORECAST_EX;
                case 34:
                    return Venue.VENUE_B2C2_FX;
                case 35:
                    return Venue.VENUE_TALOS_EDXF;
                case 36:
                    return Venue.VENUE_TALOS_BITSTAMP;
                case 37:
                    return Venue.VENUE_WINTERMUTE_FX;
                case 38:
                    return Venue.VENUE_360T;
                case 39:
                    return Venue.VENUE_TALOS_REBATE;
                case 40:
                    return Venue.VENUE_BRUCE;
                default:
                    return null;
            }
        }
    }

    public static Venue valueOf(String str) {
        return (Venue) Enum.valueOf(Venue.class, str);
    }

    public static Venue[] values() {
        return (Venue[]) $VALUES.clone();
    }
}
