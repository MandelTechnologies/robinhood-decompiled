package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: CostBasisLotsSummaryDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CostBasisLotsSummary;", "Landroid/os/Parcelable;", "Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;)V", "", "total_lots", "Lcom/robinhood/idl/IdlDecimal;", "total_quantity", "available_quantity", "cost_basis_input_quantity", "closed_quantity", "", "completed", "attested", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZ)V", "toProto", "()Lnummus/v1/CostBasisLotsSummary;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;", "getTotal_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAvailable_quantity", "getClosed_quantity", "getCompleted", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CostBasisLotsSummaryDto implements Dto3<CostBasisLotsSummary>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CostBasisLotsSummaryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CostBasisLotsSummaryDto, CostBasisLotsSummary>> binaryBase64Serializer$delegate;
    private static final CostBasisLotsSummaryDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CostBasisLotsSummaryDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CostBasisLotsSummaryDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getTotal_quantity() {
        return this.surrogate.getTotal_quantity();
    }

    public final IdlDecimal getAvailable_quantity() {
        return this.surrogate.getAvailable_quantity();
    }

    public final IdlDecimal getClosed_quantity() {
        return this.surrogate.getClosed_quantity();
    }

    public final boolean getCompleted() {
        return this.surrogate.getCompleted();
    }

    public /* synthetic */ CostBasisLotsSummaryDto(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 8) != 0 ? new IdlDecimal("") : idlDecimal3, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CostBasisLotsSummaryDto(int i, IdlDecimal total_quantity, IdlDecimal available_quantity, IdlDecimal cost_basis_input_quantity, IdlDecimal closed_quantity, boolean z, boolean z2) {
        this(new Surrogate(i, total_quantity, available_quantity, cost_basis_input_quantity, closed_quantity, z, z2));
        Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
        Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
        Intrinsics.checkNotNullParameter(cost_basis_input_quantity, "cost_basis_input_quantity");
        Intrinsics.checkNotNullParameter(closed_quantity, "closed_quantity");
    }

    @Override // com.robinhood.idl.Dto
    public CostBasisLotsSummary toProto() {
        return new CostBasisLotsSummary(this.surrogate.getTotal_lots(), this.surrogate.getTotal_quantity().getStringValue(), this.surrogate.getAvailable_quantity().getStringValue(), this.surrogate.getCost_basis_input_quantity().getStringValue(), this.surrogate.getClosed_quantity().getStringValue(), this.surrogate.getCompleted(), this.surrogate.getAttested(), null, 128, null);
    }

    public String toString() {
        return "[CostBasisLotsSummaryDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CostBasisLotsSummaryDto) && Intrinsics.areEqual(((CostBasisLotsSummaryDto) other).surrogate, this.surrogate);
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
    /* compiled from: CostBasisLotsSummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B\u0098\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B[\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010#R/\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R/\u0010\n\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010-R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010+\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010-R/\u0010\f\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010+\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010-R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b8\u0010*\u001a\u0004\b6\u00107R \u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\b:\u0010*\u001a\u0004\b9\u00107¨\u0006="}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "total_lots", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_quantity", "available_quantity", "cost_basis_input_quantity", "closed_quantity", "", "completed", "attested", "<init>", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTotal_lots", "getTotal_lots$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getTotal_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_quantity$annotations", "getAvailable_quantity", "getAvailable_quantity$annotations", "getCost_basis_input_quantity", "getCost_basis_input_quantity$annotations", "getClosed_quantity", "getClosed_quantity$annotations", "Z", "getCompleted", "()Z", "getCompleted$annotations", "getAttested", "getAttested$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean attested;
        private final IdlDecimal available_quantity;
        private final IdlDecimal closed_quantity;
        private final boolean completed;
        private final IdlDecimal cost_basis_input_quantity;
        private final int total_lots;
        private final IdlDecimal total_quantity;

        public Surrogate() {
            this(0, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.total_lots == surrogate.total_lots && Intrinsics.areEqual(this.total_quantity, surrogate.total_quantity) && Intrinsics.areEqual(this.available_quantity, surrogate.available_quantity) && Intrinsics.areEqual(this.cost_basis_input_quantity, surrogate.cost_basis_input_quantity) && Intrinsics.areEqual(this.closed_quantity, surrogate.closed_quantity) && this.completed == surrogate.completed && this.attested == surrogate.attested;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.total_lots) * 31) + this.total_quantity.hashCode()) * 31) + this.available_quantity.hashCode()) * 31) + this.cost_basis_input_quantity.hashCode()) * 31) + this.closed_quantity.hashCode()) * 31) + Boolean.hashCode(this.completed)) * 31) + Boolean.hashCode(this.attested);
        }

        public String toString() {
            return "Surrogate(total_lots=" + this.total_lots + ", total_quantity=" + this.total_quantity + ", available_quantity=" + this.available_quantity + ", cost_basis_input_quantity=" + this.cost_basis_input_quantity + ", closed_quantity=" + this.closed_quantity + ", completed=" + this.completed + ", attested=" + this.attested + ")";
        }

        /* compiled from: CostBasisLotsSummaryDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CostBasisLotsSummaryDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.total_lots = 0;
            } else {
                this.total_lots = i2;
            }
            if ((i & 2) == 0) {
                this.total_quantity = new IdlDecimal("");
            } else {
                this.total_quantity = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.available_quantity = new IdlDecimal("");
            } else {
                this.available_quantity = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.cost_basis_input_quantity = new IdlDecimal("");
            } else {
                this.cost_basis_input_quantity = idlDecimal3;
            }
            if ((i & 16) == 0) {
                this.closed_quantity = new IdlDecimal("");
            } else {
                this.closed_quantity = idlDecimal4;
            }
            if ((i & 32) == 0) {
                this.completed = false;
            } else {
                this.completed = z;
            }
            if ((i & 64) == 0) {
                this.attested = false;
            } else {
                this.attested = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.total_lots;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.total_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.total_quantity);
            }
            if (!Intrinsics.areEqual(self.available_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.available_quantity);
            }
            if (!Intrinsics.areEqual(self.cost_basis_input_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.cost_basis_input_quantity);
            }
            if (!Intrinsics.areEqual(self.closed_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.closed_quantity);
            }
            boolean z = self.completed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            boolean z2 = self.attested;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 6, z2);
            }
        }

        public Surrogate(int i, IdlDecimal total_quantity, IdlDecimal available_quantity, IdlDecimal cost_basis_input_quantity, IdlDecimal closed_quantity, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
            Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
            Intrinsics.checkNotNullParameter(cost_basis_input_quantity, "cost_basis_input_quantity");
            Intrinsics.checkNotNullParameter(closed_quantity, "closed_quantity");
            this.total_lots = i;
            this.total_quantity = total_quantity;
            this.available_quantity = available_quantity;
            this.cost_basis_input_quantity = cost_basis_input_quantity;
            this.closed_quantity = closed_quantity;
            this.completed = z;
            this.attested = z2;
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 8) != 0 ? new IdlDecimal("") : idlDecimal3, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
        }

        public final int getTotal_lots() {
            return this.total_lots;
        }

        public final IdlDecimal getTotal_quantity() {
            return this.total_quantity;
        }

        public final IdlDecimal getAvailable_quantity() {
            return this.available_quantity;
        }

        public final IdlDecimal getCost_basis_input_quantity() {
            return this.cost_basis_input_quantity;
        }

        public final IdlDecimal getClosed_quantity() {
            return this.closed_quantity;
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        public final boolean getAttested() {
            return this.attested;
        }
    }

    /* compiled from: CostBasisLotsSummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CostBasisLotsSummaryDto;", "Lnummus/v1/CostBasisLotsSummary;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CostBasisLotsSummaryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CostBasisLotsSummaryDto, CostBasisLotsSummary> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CostBasisLotsSummaryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CostBasisLotsSummaryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CostBasisLotsSummaryDto> getBinaryBase64Serializer() {
            return (KSerializer) CostBasisLotsSummaryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CostBasisLotsSummary> getProtoAdapter() {
            return CostBasisLotsSummary.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CostBasisLotsSummaryDto getZeroValue() {
            return CostBasisLotsSummaryDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CostBasisLotsSummaryDto fromProto(CostBasisLotsSummary proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CostBasisLotsSummaryDto(new Surrogate(proto.getTotal_lots(), new IdlDecimal(proto.getTotal_quantity()), new IdlDecimal(proto.getAvailable_quantity()), new IdlDecimal(proto.getCost_basis_input_quantity()), new IdlDecimal(proto.getClosed_quantity()), proto.getCompleted(), proto.getAttested()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CostBasisLotsSummaryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CostBasisLotsSummaryDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CostBasisLotsSummaryDto(0, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CostBasisLotsSummaryDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CostBasisLotsSummaryDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CostBasisLotsSummaryDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CostBasisLotsSummaryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CostBasisLotsSummary", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CostBasisLotsSummaryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CostBasisLotsSummaryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CostBasisLotsSummaryDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CostBasisLotsSummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummaryDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "nummus.v1.CostBasisLotsSummaryDto";
        }
    }
}
