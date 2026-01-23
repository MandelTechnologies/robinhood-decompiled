package rosetta.option;

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
/* compiled from: StrategyNameDto.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002?@B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020=H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u0006A"}, m3636d2 = {"Lrosetta/option/StrategyNameDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/option/StrategyName;", "Landroid/os/Parcelable;", "", "auto_values", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;)V", "getAuto_values", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDb_enum", "()Ljava/lang/String;", "STRATEGY_NAME_UNSPECIFIED", "LONG_CALL_SPREAD", "SHORT_CALL_SPREAD", "LONG_PUT_SPREAD", "SHORT_PUT_SPREAD", "LONG_CALL_CALENDAR_SPREAD", "LONG_PUT_CALENDAR_SPREAD", "LONG_STRADDLE", "LONG_STRANGLE", "SHORT_IRON_CONDOR", "LONG_CALL", "SHORT_CALL", "LONG_PUT", "SHORT_PUT", "CUSTOM", "SHORT_STRADDLE", "SHORT_STRANGLE", "LONG_IRON_CONDOR", "LONG_IRON_BUTTERFLY", "SHORT_IRON_BUTTERFLY", "LONG_BUTTERFLY_CALL", "SHORT_BUTTERFLY_CALL", "LONG_BUTTERFLY_PUT", "SHORT_BUTTERFLY_PUT", "LONG_CONDOR_CALL", "SHORT_CONDOR_CALL", "LONG_CONDOR_PUT", "SHORT_CONDOR_PUT", "BACK_SPREAD_PUT", "BACK_SPREAD_CALL", "FRONT_SPREAD_CALL", "FRONT_SPREAD_PUT", "SHORT_CALL_CALENDAR_SPREAD", "SHORT_PUT_CALENDAR_SPREAD", "CALL_CALENDAR_SPREAD", "PUT_CALENDAR_SPREAD", "STRADDLE", "STRANGLE", "IRON_CONDOR", "IRON_BUTTERFLY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class StrategyNameDto implements Dto2<StrategyName>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrategyNameDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<StrategyNameDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StrategyNameDto, StrategyName>> binaryBase64Serializer$delegate;
    private final Boolean auto_values;
    private final String db_enum;
    public static final StrategyNameDto STRATEGY_NAME_UNSPECIFIED = new StrategyNameDto("STRATEGY_NAME_UNSPECIFIED", 0) { // from class: rosetta.option.StrategyNameDto.STRATEGY_NAME_UNSPECIFIED
        {
            Boolean bool = Boolean.FALSE;
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.STRATEGY_NAME_UNSPECIFIED;
        }
    };
    public static final StrategyNameDto LONG_CALL_SPREAD = new StrategyNameDto("LONG_CALL_SPREAD", 1) { // from class: rosetta.option.StrategyNameDto.LONG_CALL_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_call_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_CALL_SPREAD;
        }
    };
    public static final StrategyNameDto SHORT_CALL_SPREAD = new StrategyNameDto("SHORT_CALL_SPREAD", 2) { // from class: rosetta.option.StrategyNameDto.SHORT_CALL_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_call_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_CALL_SPREAD;
        }
    };
    public static final StrategyNameDto LONG_PUT_SPREAD = new StrategyNameDto("LONG_PUT_SPREAD", 3) { // from class: rosetta.option.StrategyNameDto.LONG_PUT_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_put_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_PUT_SPREAD;
        }
    };
    public static final StrategyNameDto SHORT_PUT_SPREAD = new StrategyNameDto("SHORT_PUT_SPREAD", 4) { // from class: rosetta.option.StrategyNameDto.SHORT_PUT_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_put_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_PUT_SPREAD;
        }
    };
    public static final StrategyNameDto LONG_CALL_CALENDAR_SPREAD = new StrategyNameDto("LONG_CALL_CALENDAR_SPREAD", 5) { // from class: rosetta.option.StrategyNameDto.LONG_CALL_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_call_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_CALL_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto LONG_PUT_CALENDAR_SPREAD = new StrategyNameDto("LONG_PUT_CALENDAR_SPREAD", 6) { // from class: rosetta.option.StrategyNameDto.LONG_PUT_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_put_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_PUT_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto LONG_STRADDLE = new StrategyNameDto("LONG_STRADDLE", 7) { // from class: rosetta.option.StrategyNameDto.LONG_STRADDLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_straddle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_STRADDLE;
        }
    };
    public static final StrategyNameDto LONG_STRANGLE = new StrategyNameDto("LONG_STRANGLE", 8) { // from class: rosetta.option.StrategyNameDto.LONG_STRANGLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_strangle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_STRANGLE;
        }
    };
    public static final StrategyNameDto SHORT_IRON_CONDOR = new StrategyNameDto("SHORT_IRON_CONDOR", 9) { // from class: rosetta.option.StrategyNameDto.SHORT_IRON_CONDOR
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_iron_condor";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_IRON_CONDOR;
        }
    };
    public static final StrategyNameDto LONG_CALL = new StrategyNameDto("LONG_CALL", 10) { // from class: rosetta.option.StrategyNameDto.LONG_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_CALL;
        }
    };
    public static final StrategyNameDto SHORT_CALL = new StrategyNameDto("SHORT_CALL", 11) { // from class: rosetta.option.StrategyNameDto.SHORT_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_CALL;
        }
    };
    public static final StrategyNameDto LONG_PUT = new StrategyNameDto("LONG_PUT", 12) { // from class: rosetta.option.StrategyNameDto.LONG_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_PUT;
        }
    };
    public static final StrategyNameDto SHORT_PUT = new StrategyNameDto("SHORT_PUT", 13) { // from class: rosetta.option.StrategyNameDto.SHORT_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_PUT;
        }
    };
    public static final StrategyNameDto CUSTOM = new StrategyNameDto("CUSTOM", 14) { // from class: rosetta.option.StrategyNameDto.CUSTOM
        {
            Boolean bool = Boolean.TRUE;
            String str = "custom";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.CUSTOM;
        }
    };
    public static final StrategyNameDto SHORT_STRADDLE = new StrategyNameDto("SHORT_STRADDLE", 15) { // from class: rosetta.option.StrategyNameDto.SHORT_STRADDLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_straddle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_STRADDLE;
        }
    };
    public static final StrategyNameDto SHORT_STRANGLE = new StrategyNameDto("SHORT_STRANGLE", 16) { // from class: rosetta.option.StrategyNameDto.SHORT_STRANGLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_strangle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_STRANGLE;
        }
    };
    public static final StrategyNameDto LONG_IRON_CONDOR = new StrategyNameDto("LONG_IRON_CONDOR", 17) { // from class: rosetta.option.StrategyNameDto.LONG_IRON_CONDOR
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_iron_condor";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_IRON_CONDOR;
        }
    };
    public static final StrategyNameDto LONG_IRON_BUTTERFLY = new StrategyNameDto("LONG_IRON_BUTTERFLY", 18) { // from class: rosetta.option.StrategyNameDto.LONG_IRON_BUTTERFLY
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_iron_butterfly";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_IRON_BUTTERFLY;
        }
    };
    public static final StrategyNameDto SHORT_IRON_BUTTERFLY = new StrategyNameDto("SHORT_IRON_BUTTERFLY", 19) { // from class: rosetta.option.StrategyNameDto.SHORT_IRON_BUTTERFLY
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_iron_butterfly";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_IRON_BUTTERFLY;
        }
    };
    public static final StrategyNameDto LONG_BUTTERFLY_CALL = new StrategyNameDto("LONG_BUTTERFLY_CALL", 20) { // from class: rosetta.option.StrategyNameDto.LONG_BUTTERFLY_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_butterfly_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_BUTTERFLY_CALL;
        }
    };
    public static final StrategyNameDto SHORT_BUTTERFLY_CALL = new StrategyNameDto("SHORT_BUTTERFLY_CALL", 21) { // from class: rosetta.option.StrategyNameDto.SHORT_BUTTERFLY_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_butterfly_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_BUTTERFLY_CALL;
        }
    };
    public static final StrategyNameDto LONG_BUTTERFLY_PUT = new StrategyNameDto("LONG_BUTTERFLY_PUT", 22) { // from class: rosetta.option.StrategyNameDto.LONG_BUTTERFLY_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_butterfly_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_BUTTERFLY_PUT;
        }
    };
    public static final StrategyNameDto SHORT_BUTTERFLY_PUT = new StrategyNameDto("SHORT_BUTTERFLY_PUT", 23) { // from class: rosetta.option.StrategyNameDto.SHORT_BUTTERFLY_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_butterfly_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_BUTTERFLY_PUT;
        }
    };
    public static final StrategyNameDto LONG_CONDOR_CALL = new StrategyNameDto("LONG_CONDOR_CALL", 24) { // from class: rosetta.option.StrategyNameDto.LONG_CONDOR_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_condor_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_CONDOR_CALL;
        }
    };
    public static final StrategyNameDto SHORT_CONDOR_CALL = new StrategyNameDto("SHORT_CONDOR_CALL", 25) { // from class: rosetta.option.StrategyNameDto.SHORT_CONDOR_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_condor_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_CONDOR_CALL;
        }
    };
    public static final StrategyNameDto LONG_CONDOR_PUT = new StrategyNameDto("LONG_CONDOR_PUT", 26) { // from class: rosetta.option.StrategyNameDto.LONG_CONDOR_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "long_condor_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.LONG_CONDOR_PUT;
        }
    };
    public static final StrategyNameDto SHORT_CONDOR_PUT = new StrategyNameDto("SHORT_CONDOR_PUT", 27) { // from class: rosetta.option.StrategyNameDto.SHORT_CONDOR_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_condor_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_CONDOR_PUT;
        }
    };
    public static final StrategyNameDto BACK_SPREAD_PUT = new StrategyNameDto("BACK_SPREAD_PUT", 28) { // from class: rosetta.option.StrategyNameDto.BACK_SPREAD_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "back_spread_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.BACK_SPREAD_PUT;
        }
    };
    public static final StrategyNameDto BACK_SPREAD_CALL = new StrategyNameDto("BACK_SPREAD_CALL", 29) { // from class: rosetta.option.StrategyNameDto.BACK_SPREAD_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "back_spread_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.BACK_SPREAD_CALL;
        }
    };
    public static final StrategyNameDto FRONT_SPREAD_CALL = new StrategyNameDto("FRONT_SPREAD_CALL", 30) { // from class: rosetta.option.StrategyNameDto.FRONT_SPREAD_CALL
        {
            Boolean bool = Boolean.TRUE;
            String str = "front_spread_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.FRONT_SPREAD_CALL;
        }
    };
    public static final StrategyNameDto FRONT_SPREAD_PUT = new StrategyNameDto("FRONT_SPREAD_PUT", 31) { // from class: rosetta.option.StrategyNameDto.FRONT_SPREAD_PUT
        {
            Boolean bool = Boolean.TRUE;
            String str = "front_spread_put";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.FRONT_SPREAD_PUT;
        }
    };
    public static final StrategyNameDto SHORT_CALL_CALENDAR_SPREAD = new StrategyNameDto("SHORT_CALL_CALENDAR_SPREAD", 32) { // from class: rosetta.option.StrategyNameDto.SHORT_CALL_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_call_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_CALL_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto SHORT_PUT_CALENDAR_SPREAD = new StrategyNameDto("SHORT_PUT_CALENDAR_SPREAD", 33) { // from class: rosetta.option.StrategyNameDto.SHORT_PUT_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "short_put_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.SHORT_PUT_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto CALL_CALENDAR_SPREAD = new StrategyNameDto("CALL_CALENDAR_SPREAD", 34) { // from class: rosetta.option.StrategyNameDto.CALL_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "call_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.CALL_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto PUT_CALENDAR_SPREAD = new StrategyNameDto("PUT_CALENDAR_SPREAD", 35) { // from class: rosetta.option.StrategyNameDto.PUT_CALENDAR_SPREAD
        {
            Boolean bool = Boolean.TRUE;
            String str = "put_calendar_spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.PUT_CALENDAR_SPREAD;
        }
    };
    public static final StrategyNameDto STRADDLE = new StrategyNameDto("STRADDLE", 36) { // from class: rosetta.option.StrategyNameDto.STRADDLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "straddle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.STRADDLE;
        }
    };
    public static final StrategyNameDto STRANGLE = new StrategyNameDto("STRANGLE", 37) { // from class: rosetta.option.StrategyNameDto.STRANGLE
        {
            Boolean bool = Boolean.TRUE;
            String str = "strangle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.STRANGLE;
        }
    };
    public static final StrategyNameDto IRON_CONDOR = new StrategyNameDto("IRON_CONDOR", 38) { // from class: rosetta.option.StrategyNameDto.IRON_CONDOR
        {
            Boolean bool = Boolean.TRUE;
            String str = "iron_condor";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.IRON_CONDOR;
        }
    };
    public static final StrategyNameDto IRON_BUTTERFLY = new StrategyNameDto("IRON_BUTTERFLY", 39) { // from class: rosetta.option.StrategyNameDto.IRON_BUTTERFLY
        {
            Boolean bool = Boolean.TRUE;
            String str = "iron_butterfly";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public StrategyName toProto() {
            return StrategyName.IRON_BUTTERFLY;
        }
    };

    private static final /* synthetic */ StrategyNameDto[] $values() {
        return new StrategyNameDto[]{STRATEGY_NAME_UNSPECIFIED, LONG_CALL_SPREAD, SHORT_CALL_SPREAD, LONG_PUT_SPREAD, SHORT_PUT_SPREAD, LONG_CALL_CALENDAR_SPREAD, LONG_PUT_CALENDAR_SPREAD, LONG_STRADDLE, LONG_STRANGLE, SHORT_IRON_CONDOR, LONG_CALL, SHORT_CALL, LONG_PUT, SHORT_PUT, CUSTOM, SHORT_STRADDLE, SHORT_STRANGLE, LONG_IRON_CONDOR, LONG_IRON_BUTTERFLY, SHORT_IRON_BUTTERFLY, LONG_BUTTERFLY_CALL, SHORT_BUTTERFLY_CALL, LONG_BUTTERFLY_PUT, SHORT_BUTTERFLY_PUT, LONG_CONDOR_CALL, SHORT_CONDOR_CALL, LONG_CONDOR_PUT, SHORT_CONDOR_PUT, BACK_SPREAD_PUT, BACK_SPREAD_CALL, FRONT_SPREAD_CALL, FRONT_SPREAD_PUT, SHORT_CALL_CALENDAR_SPREAD, SHORT_PUT_CALENDAR_SPREAD, CALL_CALENDAR_SPREAD, PUT_CALENDAR_SPREAD, STRADDLE, STRANGLE, IRON_CONDOR, IRON_BUTTERFLY};
    }

    public /* synthetic */ StrategyNameDto(String str, int i, Boolean bool, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, bool, str2);
    }

    public static EnumEntries<StrategyNameDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StrategyNameDto(String str, int i, Boolean bool, String str2) {
        this.auto_values = bool;
        this.db_enum = str2;
    }

    public final Boolean getAuto_values() {
        return this.auto_values;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        StrategyNameDto[] strategyNameDtoArr$values = $values();
        $VALUES = strategyNameDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(strategyNameDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.option.StrategyNameDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyNameDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: StrategyNameDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/option/StrategyNameDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/option/StrategyNameDto;", "Lrosetta/option/StrategyName;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/option/StrategyNameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<StrategyNameDto, StrategyName> {

        /* compiled from: StrategyNameDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StrategyName.values().length];
                try {
                    iArr[StrategyName.STRATEGY_NAME_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StrategyName.LONG_CALL_SPREAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StrategyName.SHORT_CALL_SPREAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StrategyName.LONG_PUT_SPREAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StrategyName.SHORT_PUT_SPREAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StrategyName.LONG_CALL_CALENDAR_SPREAD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StrategyName.LONG_PUT_CALENDAR_SPREAD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[StrategyName.LONG_STRADDLE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[StrategyName.LONG_STRANGLE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[StrategyName.SHORT_IRON_CONDOR.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[StrategyName.LONG_CALL.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[StrategyName.SHORT_CALL.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[StrategyName.LONG_PUT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[StrategyName.SHORT_PUT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[StrategyName.CUSTOM.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[StrategyName.SHORT_STRADDLE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[StrategyName.SHORT_STRANGLE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[StrategyName.LONG_IRON_CONDOR.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[StrategyName.LONG_IRON_BUTTERFLY.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[StrategyName.SHORT_IRON_BUTTERFLY.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[StrategyName.LONG_BUTTERFLY_CALL.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[StrategyName.SHORT_BUTTERFLY_CALL.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[StrategyName.LONG_BUTTERFLY_PUT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[StrategyName.SHORT_BUTTERFLY_PUT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[StrategyName.LONG_CONDOR_CALL.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[StrategyName.SHORT_CONDOR_CALL.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[StrategyName.LONG_CONDOR_PUT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[StrategyName.SHORT_CONDOR_PUT.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[StrategyName.BACK_SPREAD_PUT.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[StrategyName.BACK_SPREAD_CALL.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[StrategyName.FRONT_SPREAD_CALL.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[StrategyName.FRONT_SPREAD_PUT.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[StrategyName.SHORT_CALL_CALENDAR_SPREAD.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[StrategyName.SHORT_PUT_CALENDAR_SPREAD.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[StrategyName.CALL_CALENDAR_SPREAD.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[StrategyName.PUT_CALENDAR_SPREAD.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[StrategyName.STRADDLE.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[StrategyName.STRANGLE.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[StrategyName.IRON_CONDOR.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[StrategyName.IRON_BUTTERFLY.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StrategyNameDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategyNameDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategyNameDto> getBinaryBase64Serializer() {
            return (KSerializer) StrategyNameDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StrategyName> getProtoAdapter() {
            return StrategyName.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategyNameDto getZeroValue() {
            return StrategyNameDto.STRATEGY_NAME_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategyNameDto fromProto(StrategyName proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return StrategyNameDto.STRATEGY_NAME_UNSPECIFIED;
                case 2:
                    return StrategyNameDto.LONG_CALL_SPREAD;
                case 3:
                    return StrategyNameDto.SHORT_CALL_SPREAD;
                case 4:
                    return StrategyNameDto.LONG_PUT_SPREAD;
                case 5:
                    return StrategyNameDto.SHORT_PUT_SPREAD;
                case 6:
                    return StrategyNameDto.LONG_CALL_CALENDAR_SPREAD;
                case 7:
                    return StrategyNameDto.LONG_PUT_CALENDAR_SPREAD;
                case 8:
                    return StrategyNameDto.LONG_STRADDLE;
                case 9:
                    return StrategyNameDto.LONG_STRANGLE;
                case 10:
                    return StrategyNameDto.SHORT_IRON_CONDOR;
                case 11:
                    return StrategyNameDto.LONG_CALL;
                case 12:
                    return StrategyNameDto.SHORT_CALL;
                case 13:
                    return StrategyNameDto.LONG_PUT;
                case 14:
                    return StrategyNameDto.SHORT_PUT;
                case 15:
                    return StrategyNameDto.CUSTOM;
                case 16:
                    return StrategyNameDto.SHORT_STRADDLE;
                case 17:
                    return StrategyNameDto.SHORT_STRANGLE;
                case 18:
                    return StrategyNameDto.LONG_IRON_CONDOR;
                case 19:
                    return StrategyNameDto.LONG_IRON_BUTTERFLY;
                case 20:
                    return StrategyNameDto.SHORT_IRON_BUTTERFLY;
                case 21:
                    return StrategyNameDto.LONG_BUTTERFLY_CALL;
                case 22:
                    return StrategyNameDto.SHORT_BUTTERFLY_CALL;
                case 23:
                    return StrategyNameDto.LONG_BUTTERFLY_PUT;
                case 24:
                    return StrategyNameDto.SHORT_BUTTERFLY_PUT;
                case 25:
                    return StrategyNameDto.LONG_CONDOR_CALL;
                case 26:
                    return StrategyNameDto.SHORT_CONDOR_CALL;
                case 27:
                    return StrategyNameDto.LONG_CONDOR_PUT;
                case 28:
                    return StrategyNameDto.SHORT_CONDOR_PUT;
                case 29:
                    return StrategyNameDto.BACK_SPREAD_PUT;
                case 30:
                    return StrategyNameDto.BACK_SPREAD_CALL;
                case 31:
                    return StrategyNameDto.FRONT_SPREAD_CALL;
                case 32:
                    return StrategyNameDto.FRONT_SPREAD_PUT;
                case 33:
                    return StrategyNameDto.SHORT_CALL_CALENDAR_SPREAD;
                case 34:
                    return StrategyNameDto.SHORT_PUT_CALENDAR_SPREAD;
                case 35:
                    return StrategyNameDto.CALL_CALENDAR_SPREAD;
                case 36:
                    return StrategyNameDto.PUT_CALENDAR_SPREAD;
                case 37:
                    return StrategyNameDto.STRADDLE;
                case 38:
                    return StrategyNameDto.STRANGLE;
                case 39:
                    return StrategyNameDto.IRON_CONDOR;
                case 40:
                    return StrategyNameDto.IRON_BUTTERFLY;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StrategyNameDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/option/StrategyNameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/option/StrategyNameDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<StrategyNameDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<StrategyNameDto, StrategyName> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.option.StrategyName", StrategyNameDto.getEntries(), StrategyNameDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public StrategyNameDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (StrategyNameDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StrategyNameDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static StrategyNameDto valueOf(String str) {
        return (StrategyNameDto) Enum.valueOf(StrategyNameDto.class, str);
    }

    public static StrategyNameDto[] values() {
        return (StrategyNameDto[]) $VALUES.clone();
    }
}
