package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.EquityQuantityTypeDto;
import hippo.model.p469v1.EquityTradingSessionDto;
import hippo.model.p469v1.EquityTrailTypeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: EquityOrderFormSettingsDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/EquityOrderFormSettings;", "Landroid/os/Parcelable;", "Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;)V", "Lhippo/model/v1/EquityTradingSessionDto;", "equity_last_selected_session", "Lhippo/model/v1/EquityQuantityTypeDto;", "equity_quantity_type", "Lhippo/model/v1/EquityTrailTypeDto;", "equity_trail_type_unit", "(Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityQuantityTypeDto;Lhippo/model/v1/EquityTrailTypeDto;)V", "toProto", "()Lhippo/model/v1/EquityOrderFormSettings;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class EquityOrderFormSettingsDto implements Dto3<EquityOrderFormSettings>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityOrderFormSettingsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOrderFormSettingsDto, EquityOrderFormSettings>> binaryBase64Serializer$delegate;
    private static final EquityOrderFormSettingsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityOrderFormSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOrderFormSettingsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ EquityOrderFormSettingsDto(EquityTradingSessionDto equityTradingSessionDto, EquityQuantityTypeDto equityQuantityTypeDto, EquityTrailTypeDto equityTrailTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto, (i & 2) != 0 ? EquityQuantityTypeDto.INSTANCE.getZeroValue() : equityQuantityTypeDto, (i & 4) != 0 ? EquityTrailTypeDto.INSTANCE.getZeroValue() : equityTrailTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityOrderFormSettingsDto(EquityTradingSessionDto equity_last_selected_session, EquityQuantityTypeDto equity_quantity_type, EquityTrailTypeDto equity_trail_type_unit) {
        this(new Surrogate(equity_last_selected_session, equity_quantity_type, equity_trail_type_unit));
        Intrinsics.checkNotNullParameter(equity_last_selected_session, "equity_last_selected_session");
        Intrinsics.checkNotNullParameter(equity_quantity_type, "equity_quantity_type");
        Intrinsics.checkNotNullParameter(equity_trail_type_unit, "equity_trail_type_unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityOrderFormSettings toProto() {
        return new EquityOrderFormSettings((EquityTradingSession) this.surrogate.getEquity_last_selected_session().toProto(), (EquityQuantityType) this.surrogate.getEquity_quantity_type().toProto(), (EquityTrailType) this.surrogate.getEquity_trail_type_unit().toProto(), null, 8, null);
    }

    public String toString() {
        return "[EquityOrderFormSettingsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityOrderFormSettingsDto) && Intrinsics.areEqual(((EquityOrderFormSettingsDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;", "", "Lhippo/model/v1/EquityTradingSessionDto;", "equity_last_selected_session", "Lhippo/model/v1/EquityQuantityTypeDto;", "equity_quantity_type", "Lhippo/model/v1/EquityTrailTypeDto;", "equity_trail_type_unit", "<init>", "(Lhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityQuantityTypeDto;Lhippo/model/v1/EquityTrailTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhippo/model/v1/EquityTradingSessionDto;Lhippo/model/v1/EquityQuantityTypeDto;Lhippo/model/v1/EquityTrailTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhippo/model/v1/EquityTradingSessionDto;", "getEquity_last_selected_session", "()Lhippo/model/v1/EquityTradingSessionDto;", "getEquity_last_selected_session$annotations", "()V", "Lhippo/model/v1/EquityQuantityTypeDto;", "getEquity_quantity_type", "()Lhippo/model/v1/EquityQuantityTypeDto;", "getEquity_quantity_type$annotations", "Lhippo/model/v1/EquityTrailTypeDto;", "getEquity_trail_type_unit", "()Lhippo/model/v1/EquityTrailTypeDto;", "getEquity_trail_type_unit$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EquityTradingSessionDto equity_last_selected_session;
        private final EquityQuantityTypeDto equity_quantity_type;
        private final EquityTrailTypeDto equity_trail_type_unit;

        public Surrogate() {
            this((EquityTradingSessionDto) null, (EquityQuantityTypeDto) null, (EquityTrailTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.equity_last_selected_session == surrogate.equity_last_selected_session && this.equity_quantity_type == surrogate.equity_quantity_type && this.equity_trail_type_unit == surrogate.equity_trail_type_unit;
        }

        public int hashCode() {
            return (((this.equity_last_selected_session.hashCode() * 31) + this.equity_quantity_type.hashCode()) * 31) + this.equity_trail_type_unit.hashCode();
        }

        public String toString() {
            return "Surrogate(equity_last_selected_session=" + this.equity_last_selected_session + ", equity_quantity_type=" + this.equity_quantity_type + ", equity_trail_type_unit=" + this.equity_trail_type_unit + ")";
        }

        /* compiled from: EquityOrderFormSettingsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityOrderFormSettingsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquityTradingSessionDto equityTradingSessionDto, EquityQuantityTypeDto equityQuantityTypeDto, EquityTrailTypeDto equityTrailTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.equity_last_selected_session = (i & 1) == 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto;
            if ((i & 2) == 0) {
                this.equity_quantity_type = EquityQuantityTypeDto.INSTANCE.getZeroValue();
            } else {
                this.equity_quantity_type = equityQuantityTypeDto;
            }
            if ((i & 4) == 0) {
                this.equity_trail_type_unit = EquityTrailTypeDto.INSTANCE.getZeroValue();
            } else {
                this.equity_trail_type_unit = equityTrailTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.equity_last_selected_session != EquityTradingSessionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EquityTradingSessionDto.Serializer.INSTANCE, self.equity_last_selected_session);
            }
            if (self.equity_quantity_type != EquityQuantityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EquityQuantityTypeDto.Serializer.INSTANCE, self.equity_quantity_type);
            }
            if (self.equity_trail_type_unit != EquityTrailTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EquityTrailTypeDto.Serializer.INSTANCE, self.equity_trail_type_unit);
            }
        }

        public Surrogate(EquityTradingSessionDto equity_last_selected_session, EquityQuantityTypeDto equity_quantity_type, EquityTrailTypeDto equity_trail_type_unit) {
            Intrinsics.checkNotNullParameter(equity_last_selected_session, "equity_last_selected_session");
            Intrinsics.checkNotNullParameter(equity_quantity_type, "equity_quantity_type");
            Intrinsics.checkNotNullParameter(equity_trail_type_unit, "equity_trail_type_unit");
            this.equity_last_selected_session = equity_last_selected_session;
            this.equity_quantity_type = equity_quantity_type;
            this.equity_trail_type_unit = equity_trail_type_unit;
        }

        public final EquityTradingSessionDto getEquity_last_selected_session() {
            return this.equity_last_selected_session;
        }

        public /* synthetic */ Surrogate(EquityTradingSessionDto equityTradingSessionDto, EquityQuantityTypeDto equityQuantityTypeDto, EquityTrailTypeDto equityTrailTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EquityTradingSessionDto.INSTANCE.getZeroValue() : equityTradingSessionDto, (i & 2) != 0 ? EquityQuantityTypeDto.INSTANCE.getZeroValue() : equityQuantityTypeDto, (i & 4) != 0 ? EquityTrailTypeDto.INSTANCE.getZeroValue() : equityTrailTypeDto);
        }

        public final EquityQuantityTypeDto getEquity_quantity_type() {
            return this.equity_quantity_type;
        }

        public final EquityTrailTypeDto getEquity_trail_type_unit() {
            return this.equity_trail_type_unit;
        }
    }

    /* compiled from: EquityOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/EquityOrderFormSettingsDto;", "Lhippo/model/v1/EquityOrderFormSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/EquityOrderFormSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EquityOrderFormSettingsDto, EquityOrderFormSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOrderFormSettingsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderFormSettingsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderFormSettingsDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOrderFormSettingsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOrderFormSettings> getProtoAdapter() {
            return EquityOrderFormSettings.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderFormSettingsDto getZeroValue() {
            return EquityOrderFormSettingsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderFormSettingsDto fromProto(EquityOrderFormSettings proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EquityOrderFormSettingsDto(new Surrogate(EquityTradingSessionDto.INSTANCE.fromProto(proto.getEquity_last_selected_session()), EquityQuantityTypeDto.INSTANCE.fromProto(proto.getEquity_quantity_type()), EquityTrailTypeDto.INSTANCE.fromProto(proto.getEquity_trail_type_unit())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.EquityOrderFormSettingsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderFormSettingsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EquityOrderFormSettingsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/EquityOrderFormSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/EquityOrderFormSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EquityOrderFormSettingsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.EquityOrderFormSettings", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOrderFormSettingsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityOrderFormSettingsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityOrderFormSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityOrderFormSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/EquityOrderFormSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "hippo.model.v1.EquityOrderFormSettingsDto";
        }
    }
}
