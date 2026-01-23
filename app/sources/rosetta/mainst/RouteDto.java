package rosetta.mainst;

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
/* compiled from: RouteDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000278B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00069"}, m3636d2 = {"Lrosetta/mainst/RouteDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/Route;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ROUTE_UNSPECIFIED", "ROUTE_EMPTY", "MNGD", "MNGD_ALIAS", "INSTINET", "CITADEL", "TWO_SIGMA", "KCG", "WOLVERINE", "GEMINI", "JUMP", "VIRTU", "JANE_STREET", "SIG", "RHS", "MORGAN_STANLEY", "NASDAQ", "JUMP_CH1", "B2C2", "CUMBERLAND", "SIMPLEX", "DASH", "CIRCLE", "QUIK", "CRYPTO_OTC", "WINTERMUTE", "CME_GROUP", "CQG", "TALOS", "BITSTAMP", "KALSHI", "FORECAST_EX", "ALPACA", "INTERNAL_FX", "THREE_SIXTY_T", "HRT", "TALOS_REBATE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class RouteDto implements Dto2<Route>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RouteDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<RouteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RouteDto, Route>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final RouteDto ROUTE_UNSPECIFIED = new RouteDto("ROUTE_UNSPECIFIED", 0) { // from class: rosetta.mainst.RouteDto.ROUTE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.ROUTE_UNSPECIFIED;
        }
    };
    public static final RouteDto ROUTE_EMPTY = new RouteDto("ROUTE_EMPTY", 1) { // from class: rosetta.mainst.RouteDto.ROUTE_EMPTY
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.ROUTE_EMPTY;
        }
    };
    public static final RouteDto MNGD = new RouteDto("MNGD", 2) { // from class: rosetta.mainst.RouteDto.MNGD
        {
            String str = "mngd";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.MNGD;
        }
    };
    public static final RouteDto MNGD_ALIAS = new RouteDto("MNGD_ALIAS", 3) { // from class: rosetta.mainst.RouteDto.MNGD_ALIAS
        {
            String str = "MNGD";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.MNGD_ALIAS;
        }
    };
    public static final RouteDto INSTINET = new RouteDto("INSTINET", 4) { // from class: rosetta.mainst.RouteDto.INSTINET
        {
            String str = "instinet";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.INSTINET;
        }
    };
    public static final RouteDto CITADEL = new RouteDto("CITADEL", 5) { // from class: rosetta.mainst.RouteDto.CITADEL
        {
            String str = "citadel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CITADEL;
        }
    };
    public static final RouteDto TWO_SIGMA = new RouteDto("TWO_SIGMA", 6) { // from class: rosetta.mainst.RouteDto.TWO_SIGMA
        {
            String str = "two_sigma";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.TWO_SIGMA;
        }
    };
    public static final RouteDto KCG = new RouteDto("KCG", 7) { // from class: rosetta.mainst.RouteDto.KCG
        {
            String str = "kcg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.KCG;
        }
    };
    public static final RouteDto WOLVERINE = new RouteDto("WOLVERINE", 8) { // from class: rosetta.mainst.RouteDto.WOLVERINE
        {
            String str = "wolverine";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.WOLVERINE;
        }
    };
    public static final RouteDto GEMINI = new RouteDto("GEMINI", 9) { // from class: rosetta.mainst.RouteDto.GEMINI
        {
            String str = "gemini";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.GEMINI;
        }
    };
    public static final RouteDto JUMP = new RouteDto("JUMP", 10) { // from class: rosetta.mainst.RouteDto.JUMP
        {
            String str = "jump";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.JUMP;
        }
    };
    public static final RouteDto VIRTU = new RouteDto("VIRTU", 11) { // from class: rosetta.mainst.RouteDto.VIRTU
        {
            String str = "virtu";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.VIRTU;
        }
    };
    public static final RouteDto JANE_STREET = new RouteDto("JANE_STREET", 12) { // from class: rosetta.mainst.RouteDto.JANE_STREET
        {
            String str = "jane_street";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.JANE_STREET;
        }
    };
    public static final RouteDto SIG = new RouteDto("SIG", 13) { // from class: rosetta.mainst.RouteDto.SIG
        {
            String str = "sig";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.SIG;
        }
    };
    public static final RouteDto RHS = new RouteDto("RHS", 14) { // from class: rosetta.mainst.RouteDto.RHS
        {
            String str = "rhs";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.RHS;
        }
    };
    public static final RouteDto MORGAN_STANLEY = new RouteDto("MORGAN_STANLEY", 15) { // from class: rosetta.mainst.RouteDto.MORGAN_STANLEY
        {
            String str = "morgan_stanley";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.MORGAN_STANLEY;
        }
    };
    public static final RouteDto NASDAQ = new RouteDto("NASDAQ", 16) { // from class: rosetta.mainst.RouteDto.NASDAQ
        {
            String str = "nasdaq";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.NASDAQ;
        }
    };
    public static final RouteDto JUMP_CH1 = new RouteDto("JUMP_CH1", 17) { // from class: rosetta.mainst.RouteDto.JUMP_CH1
        {
            String str = "jump_ch1";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.JUMP_CH1;
        }
    };
    public static final RouteDto B2C2 = new RouteDto("B2C2", 18) { // from class: rosetta.mainst.RouteDto.B2C2
        {
            String str = "b2c2";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.B2C2;
        }
    };
    public static final RouteDto CUMBERLAND = new RouteDto("CUMBERLAND", 19) { // from class: rosetta.mainst.RouteDto.CUMBERLAND
        {
            String str = "cumberland";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CUMBERLAND;
        }
    };
    public static final RouteDto SIMPLEX = new RouteDto("SIMPLEX", 20) { // from class: rosetta.mainst.RouteDto.SIMPLEX
        {
            String str = "simplex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.SIMPLEX;
        }
    };
    public static final RouteDto DASH = new RouteDto("DASH", 21) { // from class: rosetta.mainst.RouteDto.DASH
        {
            String str = "dash";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.DASH;
        }
    };
    public static final RouteDto CIRCLE = new RouteDto("CIRCLE", 22) { // from class: rosetta.mainst.RouteDto.CIRCLE
        {
            String str = "circle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CIRCLE;
        }
    };
    public static final RouteDto QUIK = new RouteDto("QUIK", 23) { // from class: rosetta.mainst.RouteDto.QUIK
        {
            String str = "QUIK";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.QUIK;
        }
    };
    public static final RouteDto CRYPTO_OTC = new RouteDto("CRYPTO_OTC", 24) { // from class: rosetta.mainst.RouteDto.CRYPTO_OTC
        {
            String str = "crypto_otc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CRYPTO_OTC;
        }
    };
    public static final RouteDto WINTERMUTE = new RouteDto("WINTERMUTE", 25) { // from class: rosetta.mainst.RouteDto.WINTERMUTE
        {
            String str = "wintermute";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.WINTERMUTE;
        }
    };
    public static final RouteDto CME_GROUP = new RouteDto("CME_GROUP", 26) { // from class: rosetta.mainst.RouteDto.CME_GROUP
        {
            String str = "cme_group";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CME_GROUP;
        }
    };
    public static final RouteDto CQG = new RouteDto("CQG", 27) { // from class: rosetta.mainst.RouteDto.CQG
        {
            String str = "cqg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.CQG;
        }
    };
    public static final RouteDto TALOS = new RouteDto("TALOS", 28) { // from class: rosetta.mainst.RouteDto.TALOS
        {
            String str = "talos";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.TALOS;
        }
    };
    public static final RouteDto BITSTAMP = new RouteDto("BITSTAMP", 29) { // from class: rosetta.mainst.RouteDto.BITSTAMP
        {
            String str = "bitstamp";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.BITSTAMP;
        }
    };
    public static final RouteDto KALSHI = new RouteDto("KALSHI", 30) { // from class: rosetta.mainst.RouteDto.KALSHI
        {
            String str = "kalshi";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.KALSHI;
        }
    };
    public static final RouteDto FORECAST_EX = new RouteDto("FORECAST_EX", 31) { // from class: rosetta.mainst.RouteDto.FORECAST_EX
        {
            String str = "forecast_ex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.FORECAST_EX;
        }
    };
    public static final RouteDto ALPACA = new RouteDto("ALPACA", 32) { // from class: rosetta.mainst.RouteDto.ALPACA
        {
            String str = "alpaca";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.ALPACA;
        }
    };
    public static final RouteDto INTERNAL_FX = new RouteDto("INTERNAL_FX", 33) { // from class: rosetta.mainst.RouteDto.INTERNAL_FX
        {
            String str = "internal_fx";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.INTERNAL_FX;
        }
    };
    public static final RouteDto THREE_SIXTY_T = new RouteDto("THREE_SIXTY_T", 34) { // from class: rosetta.mainst.RouteDto.THREE_SIXTY_T
        {
            String str = "three_sixty_t";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.THREE_SIXTY_T;
        }
    };
    public static final RouteDto HRT = new RouteDto("HRT", 35) { // from class: rosetta.mainst.RouteDto.HRT
        {
            String str = "hrt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.HRT;
        }
    };
    public static final RouteDto TALOS_REBATE = new RouteDto("TALOS_REBATE", 36) { // from class: rosetta.mainst.RouteDto.TALOS_REBATE
        {
            String str = "talos_rebate";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Route toProto() {
            return Route.TALOS_REBATE;
        }
    };

    private static final /* synthetic */ RouteDto[] $values() {
        return new RouteDto[]{ROUTE_UNSPECIFIED, ROUTE_EMPTY, MNGD, MNGD_ALIAS, INSTINET, CITADEL, TWO_SIGMA, KCG, WOLVERINE, GEMINI, JUMP, VIRTU, JANE_STREET, SIG, RHS, MORGAN_STANLEY, NASDAQ, JUMP_CH1, B2C2, CUMBERLAND, SIMPLEX, DASH, CIRCLE, QUIK, CRYPTO_OTC, WINTERMUTE, CME_GROUP, CQG, TALOS, BITSTAMP, KALSHI, FORECAST_EX, ALPACA, INTERNAL_FX, THREE_SIXTY_T, HRT, TALOS_REBATE};
    }

    public /* synthetic */ RouteDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<RouteDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RouteDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        RouteDto[] routeDtoArr$values = $values();
        $VALUES = routeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(routeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.RouteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: RouteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/RouteDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/RouteDto;", "Lrosetta/mainst/Route;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/RouteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<RouteDto, Route> {

        /* compiled from: RouteDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Route.values().length];
                try {
                    iArr[Route.ROUTE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Route.ROUTE_EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Route.MNGD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Route.MNGD_ALIAS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Route.INSTINET.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Route.CITADEL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Route.TWO_SIGMA.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Route.KCG.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Route.WOLVERINE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Route.GEMINI.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Route.JUMP.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Route.VIRTU.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Route.JANE_STREET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Route.SIG.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Route.RHS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Route.MORGAN_STANLEY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Route.NASDAQ.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Route.JUMP_CH1.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Route.B2C2.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Route.CUMBERLAND.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Route.SIMPLEX.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Route.DASH.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Route.CIRCLE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Route.QUIK.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Route.CRYPTO_OTC.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Route.WINTERMUTE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Route.CME_GROUP.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Route.CQG.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Route.TALOS.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Route.BITSTAMP.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Route.KALSHI.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Route.FORECAST_EX.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Route.ALPACA.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Route.INTERNAL_FX.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Route.THREE_SIXTY_T.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Route.HRT.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Route.TALOS_REBATE.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RouteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RouteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RouteDto> getBinaryBase64Serializer() {
            return (KSerializer) RouteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Route> getProtoAdapter() {
            return Route.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RouteDto getZeroValue() {
            return RouteDto.ROUTE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RouteDto fromProto(Route proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return RouteDto.ROUTE_UNSPECIFIED;
                case 2:
                    return RouteDto.ROUTE_EMPTY;
                case 3:
                    return RouteDto.MNGD;
                case 4:
                    return RouteDto.MNGD_ALIAS;
                case 5:
                    return RouteDto.INSTINET;
                case 6:
                    return RouteDto.CITADEL;
                case 7:
                    return RouteDto.TWO_SIGMA;
                case 8:
                    return RouteDto.KCG;
                case 9:
                    return RouteDto.WOLVERINE;
                case 10:
                    return RouteDto.GEMINI;
                case 11:
                    return RouteDto.JUMP;
                case 12:
                    return RouteDto.VIRTU;
                case 13:
                    return RouteDto.JANE_STREET;
                case 14:
                    return RouteDto.SIG;
                case 15:
                    return RouteDto.RHS;
                case 16:
                    return RouteDto.MORGAN_STANLEY;
                case 17:
                    return RouteDto.NASDAQ;
                case 18:
                    return RouteDto.JUMP_CH1;
                case 19:
                    return RouteDto.B2C2;
                case 20:
                    return RouteDto.CUMBERLAND;
                case 21:
                    return RouteDto.SIMPLEX;
                case 22:
                    return RouteDto.DASH;
                case 23:
                    return RouteDto.CIRCLE;
                case 24:
                    return RouteDto.QUIK;
                case 25:
                    return RouteDto.CRYPTO_OTC;
                case 26:
                    return RouteDto.WINTERMUTE;
                case 27:
                    return RouteDto.CME_GROUP;
                case 28:
                    return RouteDto.CQG;
                case 29:
                    return RouteDto.TALOS;
                case 30:
                    return RouteDto.BITSTAMP;
                case 31:
                    return RouteDto.KALSHI;
                case 32:
                    return RouteDto.FORECAST_EX;
                case 33:
                    return RouteDto.ALPACA;
                case 34:
                    return RouteDto.INTERNAL_FX;
                case 35:
                    return RouteDto.THREE_SIXTY_T;
                case 36:
                    return RouteDto.HRT;
                case 37:
                    return RouteDto.TALOS_REBATE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RouteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/RouteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/RouteDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RouteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<RouteDto, Route> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.Route", RouteDto.getEntries(), RouteDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public RouteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (RouteDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RouteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static RouteDto valueOf(String str) {
        return (RouteDto) Enum.valueOf(RouteDto.class, str);
    }

    public static RouteDto[] values() {
        return (RouteDto[]) $VALUES.clone();
    }
}
