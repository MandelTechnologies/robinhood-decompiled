package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import cbc.service.p048v1.TermType;
import cbc.service.p048v1.TermTypeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: OrderTaxLotDetailDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0015¨\u00062"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/OrderTaxLotDetail;", "Landroid/os/Parcelable;", "Lnummus/v1/OrderTaxLotDetailDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/OrderTaxLotDetailDto$Surrogate;)V", "", InquiryField.DateField.TYPE, "Lcbc/service/v1/TermTypeDto;", "term_type", "Lcom/robinhood/idl/IdlDecimal;", "cost_per_unit", "gain_loss", "quantity", "id", "(Ljava/lang/String;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/OrderTaxLotDetail;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/OrderTaxLotDetailDto$Surrogate;", "getDate", "getTerm_type", "()Lcbc/service/v1/TermTypeDto;", "getCost_per_unit", "()Lcom/robinhood/idl/IdlDecimal;", "getGain_loss", "getQuantity", "getId", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class OrderTaxLotDetailDto implements Dto3<OrderTaxLotDetail>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderTaxLotDetailDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderTaxLotDetailDto, OrderTaxLotDetail>> binaryBase64Serializer$delegate;
    private static final OrderTaxLotDetailDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderTaxLotDetailDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderTaxLotDetailDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDate() {
        return this.surrogate.getDate();
    }

    public final TermTypeDto getTerm_type() {
        return this.surrogate.getTerm_type();
    }

    public final IdlDecimal getCost_per_unit() {
        return this.surrogate.getCost_per_unit();
    }

    public final IdlDecimal getGain_loss() {
        return this.surrogate.getGain_loss();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public /* synthetic */ OrderTaxLotDetailDto(String str, TermTypeDto termTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto, (i & 4) != 0 ? null : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderTaxLotDetailDto(String date, TermTypeDto term_type, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal quantity, String id) {
        this(new Surrogate(date, term_type, idlDecimal, idlDecimal2, quantity, id));
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(term_type, "term_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(id, "id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderTaxLotDetail toProto() {
        String date = this.surrogate.getDate();
        TermType termType = (TermType) this.surrogate.getTerm_type().toProto();
        IdlDecimal cost_per_unit = this.surrogate.getCost_per_unit();
        String stringValue = cost_per_unit != null ? cost_per_unit.getStringValue() : null;
        IdlDecimal gain_loss = this.surrogate.getGain_loss();
        return new OrderTaxLotDetail(date, termType, stringValue, gain_loss != null ? gain_loss.getStringValue() : null, this.surrogate.getQuantity().getStringValue(), this.surrogate.getId(), null, 64, null);
    }

    public String toString() {
        return "[OrderTaxLotDetailDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderTaxLotDetailDto) && Intrinsics.areEqual(((OrderTaxLotDetailDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderTaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298Bt\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R1\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R1\u0010\u000b\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b3\u0010)\u001a\u0004\b2\u00100R/\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\b5\u0010)\u001a\u0004\b4\u00100R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010&\u0012\u0004\b7\u0010)\u001a\u0004\b6\u0010\u001f¨\u0006:"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto$Surrogate;", "", "", InquiryField.DateField.TYPE, "Lcbc/service/v1/TermTypeDto;", "term_type", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "cost_per_unit", "gain_loss", "quantity", "id", "<init>", "(Ljava/lang/String;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/OrderTaxLotDetailDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Lcbc/service/v1/TermTypeDto;", "getTerm_type", "()Lcbc/service/v1/TermTypeDto;", "getTerm_type$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getCost_per_unit", "()Lcom/robinhood/idl/IdlDecimal;", "getCost_per_unit$annotations", "getGain_loss", "getGain_loss$annotations", "getQuantity", "getQuantity$annotations", "getId", "getId$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal cost_per_unit;
        private final String date;
        private final IdlDecimal gain_loss;
        private final String id;
        private final IdlDecimal quantity;
        private final TermTypeDto term_type;

        public Surrogate() {
            this((String) null, (TermTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.date, surrogate.date) && this.term_type == surrogate.term_type && Intrinsics.areEqual(this.cost_per_unit, surrogate.cost_per_unit) && Intrinsics.areEqual(this.gain_loss, surrogate.gain_loss) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.id, surrogate.id);
        }

        public int hashCode() {
            int iHashCode = ((this.date.hashCode() * 31) + this.term_type.hashCode()) * 31;
            IdlDecimal idlDecimal = this.cost_per_unit;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.gain_loss;
            return ((((iHashCode2 + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0)) * 31) + this.quantity.hashCode()) * 31) + this.id.hashCode();
        }

        public String toString() {
            return "Surrogate(date=" + this.date + ", term_type=" + this.term_type + ", cost_per_unit=" + this.cost_per_unit + ", gain_loss=" + this.gain_loss + ", quantity=" + this.quantity + ", id=" + this.id + ")";
        }

        /* compiled from: OrderTaxLotDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/OrderTaxLotDetailDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderTaxLotDetailDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TermTypeDto termTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.date = "";
            } else {
                this.date = str;
            }
            if ((i & 2) == 0) {
                this.term_type = TermTypeDto.INSTANCE.getZeroValue();
            } else {
                this.term_type = termTypeDto;
            }
            if ((i & 4) == 0) {
                this.cost_per_unit = null;
            } else {
                this.cost_per_unit = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.gain_loss = null;
            } else {
                this.gain_loss = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.id = "";
            } else {
                this.id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.date, "")) {
                output.encodeStringElement(serialDesc, 0, self.date);
            }
            if (self.term_type != TermTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TermTypeDto.Serializer.INSTANCE, self.term_type);
            }
            IdlDecimal idlDecimal = self.cost_per_unit;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.gain_loss;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (Intrinsics.areEqual(self.id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.id);
        }

        public Surrogate(String date, TermTypeDto term_type, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal quantity, String id) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(term_type, "term_type");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(id, "id");
            this.date = date;
            this.term_type = term_type;
            this.cost_per_unit = idlDecimal;
            this.gain_loss = idlDecimal2;
            this.quantity = quantity;
            this.id = id;
        }

        public /* synthetic */ Surrogate(String str, TermTypeDto termTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto, (i & 4) != 0 ? null : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? "" : str2);
        }

        public final String getDate() {
            return this.date;
        }

        public final TermTypeDto getTerm_type() {
            return this.term_type;
        }

        public final IdlDecimal getCost_per_unit() {
            return this.cost_per_unit;
        }

        public final IdlDecimal getGain_loss() {
            return this.gain_loss;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: OrderTaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/OrderTaxLotDetailDto;", "Lnummus/v1/OrderTaxLotDetail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/OrderTaxLotDetailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderTaxLotDetailDto, OrderTaxLotDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderTaxLotDetailDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderTaxLotDetailDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderTaxLotDetailDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderTaxLotDetailDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderTaxLotDetail> getProtoAdapter() {
            return OrderTaxLotDetail.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderTaxLotDetailDto getZeroValue() {
            return OrderTaxLotDetailDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderTaxLotDetailDto fromProto(OrderTaxLotDetail proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String date = proto.getDate();
            TermTypeDto termTypeDtoFromProto = TermTypeDto.INSTANCE.fromProto(proto.getTerm_type());
            String cost_per_unit = proto.getCost_per_unit();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = cost_per_unit != null ? new IdlDecimal(cost_per_unit) : null;
            String gain_loss = proto.getGain_loss();
            return new OrderTaxLotDetailDto(new Surrogate(date, termTypeDtoFromProto, idlDecimal, gain_loss != null ? new IdlDecimal(gain_loss) : null, new IdlDecimal(proto.getQuantity()), proto.getId()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.OrderTaxLotDetailDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTaxLotDetailDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderTaxLotDetailDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderTaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/OrderTaxLotDetailDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/OrderTaxLotDetailDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderTaxLotDetailDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.OrderTaxLotDetail", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderTaxLotDetailDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderTaxLotDetailDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderTaxLotDetailDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderTaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetailDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "nummus.v1.OrderTaxLotDetailDto";
        }
    }
}
