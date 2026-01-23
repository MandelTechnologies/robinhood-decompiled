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
/* compiled from: Route.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b+\b\u0086\u0081\u0002\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006/"}, m3636d2 = {"Lrosetta/mainst/Route;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ROUTE_UNSPECIFIED", "ROUTE_EMPTY", "MNGD", "MNGD_ALIAS", "INSTINET", "CITADEL", "TWO_SIGMA", "KCG", "WOLVERINE", "GEMINI", "JUMP", "VIRTU", "JANE_STREET", "SIG", "RHS", "MORGAN_STANLEY", "NASDAQ", "JUMP_CH1", "B2C2", "CUMBERLAND", "SIMPLEX", "DASH", "CIRCLE", "QUIK", "CRYPTO_OTC", "WINTERMUTE", "CME_GROUP", "CQG", "TALOS", "BITSTAMP", "KALSHI", "FORECAST_EX", "ALPACA", "INTERNAL_FX", "THREE_SIXTY_T", "HRT", "TALOS_REBATE", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Route implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Route[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Route> ADAPTER;
    public static final Route ALPACA;
    public static final Route B2C2;
    public static final Route BITSTAMP;
    public static final Route CIRCLE;
    public static final Route CITADEL;
    public static final Route CME_GROUP;
    public static final Route CQG;
    public static final Route CRYPTO_OTC;
    public static final Route CUMBERLAND;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Route DASH;
    public static final Route FORECAST_EX;
    public static final Route GEMINI;
    public static final Route HRT;
    public static final Route INSTINET;
    public static final Route INTERNAL_FX;
    public static final Route JANE_STREET;
    public static final Route JUMP;
    public static final Route JUMP_CH1;
    public static final Route KALSHI;
    public static final Route KCG;
    public static final Route MNGD;
    public static final Route MNGD_ALIAS;
    public static final Route MORGAN_STANLEY;
    public static final Route NASDAQ;
    public static final Route QUIK;
    public static final Route RHS;
    public static final Route ROUTE_EMPTY;
    public static final Route ROUTE_UNSPECIFIED;
    public static final Route SIG;
    public static final Route SIMPLEX;
    public static final Route TALOS;
    public static final Route TALOS_REBATE;
    public static final Route THREE_SIXTY_T;
    public static final Route TWO_SIGMA;
    public static final Route VIRTU;
    public static final Route WINTERMUTE;
    public static final Route WOLVERINE;
    private final int value;

    private static final /* synthetic */ Route[] $values() {
        return new Route[]{ROUTE_UNSPECIFIED, ROUTE_EMPTY, MNGD, MNGD_ALIAS, INSTINET, CITADEL, TWO_SIGMA, KCG, WOLVERINE, GEMINI, JUMP, VIRTU, JANE_STREET, SIG, RHS, MORGAN_STANLEY, NASDAQ, JUMP_CH1, B2C2, CUMBERLAND, SIMPLEX, DASH, CIRCLE, QUIK, CRYPTO_OTC, WINTERMUTE, CME_GROUP, CQG, TALOS, BITSTAMP, KALSHI, FORECAST_EX, ALPACA, INTERNAL_FX, THREE_SIXTY_T, HRT, TALOS_REBATE};
    }

    @JvmStatic
    public static final Route fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Route> getEntries() {
        return $ENTRIES;
    }

    private Route(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Route route = new Route("ROUTE_UNSPECIFIED", 0, 0);
        ROUTE_UNSPECIFIED = route;
        ROUTE_EMPTY = new Route("ROUTE_EMPTY", 1, 0);
        MNGD = new Route("MNGD", 2, 1);
        MNGD_ALIAS = new Route("MNGD_ALIAS", 3, 1);
        INSTINET = new Route("INSTINET", 4, 2);
        CITADEL = new Route("CITADEL", 5, 3);
        TWO_SIGMA = new Route("TWO_SIGMA", 6, 4);
        KCG = new Route("KCG", 7, 5);
        WOLVERINE = new Route("WOLVERINE", 8, 6);
        GEMINI = new Route("GEMINI", 9, 7);
        JUMP = new Route("JUMP", 10, 8);
        VIRTU = new Route("VIRTU", 11, 9);
        JANE_STREET = new Route("JANE_STREET", 12, 10);
        SIG = new Route("SIG", 13, 11);
        RHS = new Route("RHS", 14, 12);
        MORGAN_STANLEY = new Route("MORGAN_STANLEY", 15, 13);
        NASDAQ = new Route("NASDAQ", 16, 14);
        JUMP_CH1 = new Route("JUMP_CH1", 17, 15);
        B2C2 = new Route("B2C2", 18, 16);
        CUMBERLAND = new Route("CUMBERLAND", 19, 17);
        SIMPLEX = new Route("SIMPLEX", 20, 18);
        DASH = new Route("DASH", 21, 19);
        CIRCLE = new Route("CIRCLE", 22, 20);
        QUIK = new Route("QUIK", 23, 21);
        CRYPTO_OTC = new Route("CRYPTO_OTC", 24, 22);
        WINTERMUTE = new Route("WINTERMUTE", 25, 23);
        CME_GROUP = new Route("CME_GROUP", 26, 24);
        CQG = new Route("CQG", 27, 25);
        TALOS = new Route("TALOS", 28, 26);
        BITSTAMP = new Route("BITSTAMP", 29, 27);
        KALSHI = new Route("KALSHI", 30, 28);
        FORECAST_EX = new Route("FORECAST_EX", 31, 29);
        ALPACA = new Route("ALPACA", 32, 30);
        INTERNAL_FX = new Route("INTERNAL_FX", 33, 31);
        THREE_SIXTY_T = new Route("THREE_SIXTY_T", 34, 32);
        HRT = new Route("HRT", 35, 33);
        TALOS_REBATE = new Route("TALOS_REBATE", 36, 34);
        Route[] routeArr$values = $values();
        $VALUES = routeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(routeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Route.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Route>(orCreateKotlinClass, syntax, route) { // from class: rosetta.mainst.Route$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Route fromValue(int value) {
                return Route.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Route.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/Route$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/Route;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Route fromValue(int value) {
            switch (value) {
                case 0:
                    return Route.ROUTE_UNSPECIFIED;
                case 1:
                    return Route.MNGD;
                case 2:
                    return Route.INSTINET;
                case 3:
                    return Route.CITADEL;
                case 4:
                    return Route.TWO_SIGMA;
                case 5:
                    return Route.KCG;
                case 6:
                    return Route.WOLVERINE;
                case 7:
                    return Route.GEMINI;
                case 8:
                    return Route.JUMP;
                case 9:
                    return Route.VIRTU;
                case 10:
                    return Route.JANE_STREET;
                case 11:
                    return Route.SIG;
                case 12:
                    return Route.RHS;
                case 13:
                    return Route.MORGAN_STANLEY;
                case 14:
                    return Route.NASDAQ;
                case 15:
                    return Route.JUMP_CH1;
                case 16:
                    return Route.B2C2;
                case 17:
                    return Route.CUMBERLAND;
                case 18:
                    return Route.SIMPLEX;
                case 19:
                    return Route.DASH;
                case 20:
                    return Route.CIRCLE;
                case 21:
                    return Route.QUIK;
                case 22:
                    return Route.CRYPTO_OTC;
                case 23:
                    return Route.WINTERMUTE;
                case 24:
                    return Route.CME_GROUP;
                case 25:
                    return Route.CQG;
                case 26:
                    return Route.TALOS;
                case 27:
                    return Route.BITSTAMP;
                case 28:
                    return Route.KALSHI;
                case 29:
                    return Route.FORECAST_EX;
                case 30:
                    return Route.ALPACA;
                case 31:
                    return Route.INTERNAL_FX;
                case 32:
                    return Route.THREE_SIXTY_T;
                case 33:
                    return Route.HRT;
                case 34:
                    return Route.TALOS_REBATE;
                default:
                    return null;
            }
        }
    }

    public static Route valueOf(String str) {
        return (Route) Enum.valueOf(Route.class, str);
    }

    public static Route[] values() {
        return (Route[]) $VALUES.clone();
    }
}
