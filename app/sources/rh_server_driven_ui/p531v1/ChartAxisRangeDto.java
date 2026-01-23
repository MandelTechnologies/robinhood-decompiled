package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.MoneyAxisRangeDto;
import rh_server_driven_ui.p531v1.UnitlessAxisRangeDto;

/* compiled from: ChartAxisRangeDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxisRange;", "Landroid/os/Parcelable;", "surrogate", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;)V", "range_details", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "(Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;)V", "getRange_details", "()Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "money", "Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "getMoney", "()Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "unitless", "Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "getUnitless", "()Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "RangeDetailsDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class ChartAxisRangeDto implements Dto3<ChartAxisRange>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartAxisRangeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartAxisRangeDto, ChartAxisRange>> binaryBase64Serializer$delegate;
    private static final ChartAxisRangeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartAxisRangeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartAxisRangeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final RangeDetailsDto getRange_details() {
        if (this.surrogate.getMoney() != null) {
            return new RangeDetailsDto.Money(this.surrogate.getMoney());
        }
        if (this.surrogate.getUnitless() != null) {
            return new RangeDetailsDto.Unitless(this.surrogate.getUnitless());
        }
        return null;
    }

    public final MoneyAxisRangeDto getMoney() {
        return this.surrogate.getMoney();
    }

    public final UnitlessAxisRangeDto getUnitless() {
        return this.surrogate.getUnitless();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChartAxisRangeDto(RangeDetailsDto rangeDetailsDto) {
        RangeDetailsDto.Money money = rangeDetailsDto instanceof RangeDetailsDto.Money ? (RangeDetailsDto.Money) rangeDetailsDto : null;
        MoneyAxisRangeDto value = money != null ? money.getValue() : null;
        RangeDetailsDto.Unitless unitless = rangeDetailsDto instanceof RangeDetailsDto.Unitless ? (RangeDetailsDto.Unitless) rangeDetailsDto : null;
        this(new Surrogate(value, unitless != null ? unitless.getValue() : null));
    }

    public /* synthetic */ ChartAxisRangeDto(RangeDetailsDto rangeDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rangeDetailsDto);
    }

    public final ChartAxisRangeDto copy(RangeDetailsDto range_details) {
        RangeDetailsDto.Money money = range_details instanceof RangeDetailsDto.Money ? (RangeDetailsDto.Money) range_details : null;
        MoneyAxisRangeDto value = money != null ? money.getValue() : null;
        RangeDetailsDto.Unitless unitless = range_details instanceof RangeDetailsDto.Unitless ? (RangeDetailsDto.Unitless) range_details : null;
        return new ChartAxisRangeDto(new Surrogate(value, unitless != null ? unitless.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public ChartAxisRange toProto() {
        MoneyAxisRangeDto money = this.surrogate.getMoney();
        MoneyAxisRange proto = money != null ? money.toProto() : null;
        UnitlessAxisRangeDto unitless = this.surrogate.getUnitless();
        return new ChartAxisRange(proto, unitless != null ? unitless.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[ChartAxisRangeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartAxisRangeDto) && Intrinsics.areEqual(((ChartAxisRangeDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartAxisRangeDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;", "", "Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "money", "Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "unitless", "<init>", "(Lrh_server_driven_ui/v1/MoneyAxisRangeDto;Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/MoneyAxisRangeDto;Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "getMoney", "()Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "getMoney$annotations", "()V", "Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "getUnitless", "()Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "getUnitless$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyAxisRangeDto money;
        private final UnitlessAxisRangeDto unitless;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MoneyAxisRangeDto) null, (UnitlessAxisRangeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.money, surrogate.money) && Intrinsics.areEqual(this.unitless, surrogate.unitless);
        }

        public int hashCode() {
            MoneyAxisRangeDto moneyAxisRangeDto = this.money;
            int iHashCode = (moneyAxisRangeDto == null ? 0 : moneyAxisRangeDto.hashCode()) * 31;
            UnitlessAxisRangeDto unitlessAxisRangeDto = this.unitless;
            return iHashCode + (unitlessAxisRangeDto != null ? unitlessAxisRangeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(money=" + this.money + ", unitless=" + this.unitless + ")";
        }

        /* compiled from: ChartAxisRangeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartAxisRangeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyAxisRangeDto moneyAxisRangeDto, UnitlessAxisRangeDto unitlessAxisRangeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.money = null;
            } else {
                this.money = moneyAxisRangeDto;
            }
            if ((i & 2) == 0) {
                this.unitless = null;
            } else {
                this.unitless = unitlessAxisRangeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyAxisRangeDto moneyAxisRangeDto = self.money;
            if (moneyAxisRangeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyAxisRangeDto.Serializer.INSTANCE, moneyAxisRangeDto);
            }
            UnitlessAxisRangeDto unitlessAxisRangeDto = self.unitless;
            if (unitlessAxisRangeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UnitlessAxisRangeDto.Serializer.INSTANCE, unitlessAxisRangeDto);
            }
        }

        public Surrogate(MoneyAxisRangeDto moneyAxisRangeDto, UnitlessAxisRangeDto unitlessAxisRangeDto) {
            this.money = moneyAxisRangeDto;
            this.unitless = unitlessAxisRangeDto;
        }

        public /* synthetic */ Surrogate(MoneyAxisRangeDto moneyAxisRangeDto, UnitlessAxisRangeDto unitlessAxisRangeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyAxisRangeDto, (i & 2) != 0 ? null : unitlessAxisRangeDto);
        }

        public final MoneyAxisRangeDto getMoney() {
            return this.money;
        }

        public final UnitlessAxisRangeDto getUnitless() {
            return this.unitless;
        }
    }

    /* compiled from: ChartAxisRangeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "Lrh_server_driven_ui/v1/ChartAxisRange;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartAxisRangeDto, ChartAxisRange> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartAxisRangeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisRangeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisRangeDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartAxisRangeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartAxisRange> getProtoAdapter() {
            return ChartAxisRange.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisRangeDto getZeroValue() {
            return ChartAxisRangeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisRangeDto fromProto(ChartAxisRange proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MoneyAxisRange money = proto.getMoney();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyAxisRangeDto moneyAxisRangeDtoFromProto = money != null ? MoneyAxisRangeDto.INSTANCE.fromProto(money) : null;
            UnitlessAxisRange unitless = proto.getUnitless();
            return new ChartAxisRangeDto(new Surrogate(moneyAxisRangeDtoFromProto, unitless != null ? UnitlessAxisRangeDto.INSTANCE.fromProto(unitless) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisRangeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartAxisRangeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChartAxisRangeDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartAxisRangeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Money", "Unitless", "Companion", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Money;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Unitless;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class RangeDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ RangeDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RangeDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ChartAxisRangeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Money;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/MoneyAxisRangeDto;)V", "copy", "(Lrh_server_driven_ui/v1/MoneyAxisRangeDto;)Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Money;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "getValue", "()Lrh_server_driven_ui/v1/MoneyAxisRangeDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Money extends RangeDetailsDto {
            private final MoneyAxisRangeDto value;

            public final Money copy(MoneyAxisRangeDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Money(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Money) && Intrinsics.areEqual(this.value, ((Money) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Money(value=" + this.value + ")";
            }

            public final MoneyAxisRangeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Money(MoneyAxisRangeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartAxisRangeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Unitless;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;)V", "copy", "(Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;)Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Unitless;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "getValue", "()Lrh_server_driven_ui/v1/UnitlessAxisRangeDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Unitless extends RangeDetailsDto {
            private final UnitlessAxisRangeDto value;

            public final Unitless copy(UnitlessAxisRangeDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Unitless(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unitless) && Intrinsics.areEqual(this.value, ((Unitless) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Unitless(value=" + this.value + ")";
            }

            public final UnitlessAxisRangeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unitless(UnitlessAxisRangeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartAxisRangeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$RangeDetailsDto;", "Lrh_server_driven_ui/v1/ChartAxisRange;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<RangeDetailsDto, ChartAxisRange> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartAxisRange> getProtoAdapter() {
                return ChartAxisRange.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RangeDetailsDto fromProto(ChartAxisRange proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getMoney() != null) {
                    return new Money(MoneyAxisRangeDto.INSTANCE.fromProto(proto.getMoney()));
                }
                if (proto.getUnitless() != null) {
                    return new Unitless(UnitlessAxisRangeDto.INSTANCE.fromProto(proto.getUnitless()));
                }
                return null;
            }
        }
    }

    /* compiled from: ChartAxisRangeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisRangeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartAxisRangeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxisRange", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartAxisRangeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartAxisRangeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartAxisRangeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartAxisRangeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRangeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartAxisRangeDto";
        }
    }
}
