package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: CostBasisLotDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CostBasisLot;", "Landroid/os/Parcelable;", "Lnummus/v1/CostBasisLotDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CostBasisLotDto$Surrogate;)V", "", "lot_id", "display_title", "display_subtitle", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "acquisition_date", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "total_cost_basis_fiat", "status", "", "lot_closed", "additional_info_markdown", "customer_attested", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/lang/String;ZLj$/time/Instant;)V", "toProto", "()Lnummus/v1/CostBasisLot;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CostBasisLotDto$Surrogate;", "getLot_id", "getDisplay_title", "getDisplay_subtitle", "getAcquisition_date", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CostBasisLotDto implements Dto3<CostBasisLot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CostBasisLotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CostBasisLotDto, CostBasisLot>> binaryBase64Serializer$delegate;
    private static final CostBasisLotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CostBasisLotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CostBasisLotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLot_id() {
        return this.surrogate.getLot_id();
    }

    public final String getDisplay_title() {
        return this.surrogate.getDisplay_title();
    }

    public final String getDisplay_subtitle() {
        return this.surrogate.getDisplay_subtitle();
    }

    public final Instant getAcquisition_date() {
        return this.surrogate.getAcquisition_date();
    }

    public /* synthetic */ CostBasisLotDto(String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, boolean z, String str5, boolean z2, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str5 : "", (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CostBasisLotDto(String lot_id, String display_title, String display_subtitle, Instant instant, IdlDecimal quantity, IdlDecimal total_cost_basis_fiat, String status, boolean z, String additional_info_markdown, boolean z2, Instant instant2) {
        this(new Surrogate(lot_id, display_title, display_subtitle, instant, quantity, total_cost_basis_fiat, status, z, additional_info_markdown, z2, instant2));
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(display_title, "display_title");
        Intrinsics.checkNotNullParameter(display_subtitle, "display_subtitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(additional_info_markdown, "additional_info_markdown");
    }

    @Override // com.robinhood.idl.Dto
    public CostBasisLot toProto() {
        return new CostBasisLot(this.surrogate.getLot_id(), this.surrogate.getDisplay_title(), this.surrogate.getDisplay_subtitle(), this.surrogate.getAcquisition_date(), this.surrogate.getQuantity().getStringValue(), this.surrogate.getTotal_cost_basis_fiat().getStringValue(), this.surrogate.getStatus(), this.surrogate.getLot_closed(), this.surrogate.getAdditional_info_markdown(), this.surrogate.getCustomer_attested(), this.surrogate.getCreated_at(), null, 2048, null);
    }

    public String toString() {
        return "[CostBasisLotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CostBasisLotDto) && Intrinsics.areEqual(((CostBasisLotDto) other).surrogate, this.surrogate);
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
    /* compiled from: CostBasisLotDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBß\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\u0016\u0010\u0017B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010'R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010'R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010'RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R/\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b>\u00100\u001a\u0004\b=\u0010;R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010-\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010'R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010-\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010'R \u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010A\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010CRF\u0010\u0015\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00105\u0012\u0004\bJ\u00100\u001a\u0004\bI\u00107¨\u0006M"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto$Surrogate;", "", "", "lot_id", "display_title", "display_subtitle", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "acquisition_date", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "total_cost_basis_fiat", "status", "", "lot_closed", "additional_info_markdown", "customer_attested", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/lang/String;ZLj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/lang/String;ZLj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CostBasisLotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLot_id", "getLot_id$annotations", "()V", "getDisplay_title", "getDisplay_title$annotations", "getDisplay_subtitle", "getDisplay_subtitle$annotations", "Lj$/time/Instant;", "getAcquisition_date", "()Lj$/time/Instant;", "getAcquisition_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "getTotal_cost_basis_fiat", "getTotal_cost_basis_fiat$annotations", "getStatus", "getStatus$annotations", "Z", "getLot_closed", "()Z", "getLot_closed$annotations", "getAdditional_info_markdown", "getAdditional_info_markdown$annotations", "getCustomer_attested", "getCustomer_attested$annotations", "getCreated_at", "getCreated_at$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant acquisition_date;
        private final String additional_info_markdown;
        private final Instant created_at;
        private final boolean customer_attested;
        private final String display_subtitle;
        private final String display_title;
        private final boolean lot_closed;
        private final String lot_id;
        private final IdlDecimal quantity;
        private final String status;
        private final IdlDecimal total_cost_basis_fiat;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Instant) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, false, (String) null, false, (Instant) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.lot_id, surrogate.lot_id) && Intrinsics.areEqual(this.display_title, surrogate.display_title) && Intrinsics.areEqual(this.display_subtitle, surrogate.display_subtitle) && Intrinsics.areEqual(this.acquisition_date, surrogate.acquisition_date) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.total_cost_basis_fiat, surrogate.total_cost_basis_fiat) && Intrinsics.areEqual(this.status, surrogate.status) && this.lot_closed == surrogate.lot_closed && Intrinsics.areEqual(this.additional_info_markdown, surrogate.additional_info_markdown) && this.customer_attested == surrogate.customer_attested && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            int iHashCode = ((((this.lot_id.hashCode() * 31) + this.display_title.hashCode()) * 31) + this.display_subtitle.hashCode()) * 31;
            Instant instant = this.acquisition_date;
            int iHashCode2 = (((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.quantity.hashCode()) * 31) + this.total_cost_basis_fiat.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.lot_closed)) * 31) + this.additional_info_markdown.hashCode()) * 31) + Boolean.hashCode(this.customer_attested)) * 31;
            Instant instant2 = this.created_at;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(lot_id=" + this.lot_id + ", display_title=" + this.display_title + ", display_subtitle=" + this.display_subtitle + ", acquisition_date=" + this.acquisition_date + ", quantity=" + this.quantity + ", total_cost_basis_fiat=" + this.total_cost_basis_fiat + ", status=" + this.status + ", lot_closed=" + this.lot_closed + ", additional_info_markdown=" + this.additional_info_markdown + ", customer_attested=" + this.customer_attested + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: CostBasisLotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CostBasisLotDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CostBasisLotDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, boolean z, String str5, boolean z2, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.lot_id = "";
            } else {
                this.lot_id = str;
            }
            if ((i & 2) == 0) {
                this.display_title = "";
            } else {
                this.display_title = str2;
            }
            if ((i & 4) == 0) {
                this.display_subtitle = "";
            } else {
                this.display_subtitle = str3;
            }
            if ((i & 8) == 0) {
                this.acquisition_date = null;
            } else {
                this.acquisition_date = instant;
            }
            if ((i & 16) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.total_cost_basis_fiat = new IdlDecimal("");
            } else {
                this.total_cost_basis_fiat = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.status = "";
            } else {
                this.status = str4;
            }
            if ((i & 128) == 0) {
                this.lot_closed = false;
            } else {
                this.lot_closed = z;
            }
            if ((i & 256) == 0) {
                this.additional_info_markdown = "";
            } else {
                this.additional_info_markdown = str5;
            }
            if ((i & 512) == 0) {
                this.customer_attested = false;
            } else {
                this.customer_attested = z2;
            }
            if ((i & 1024) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.lot_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.lot_id);
            }
            if (!Intrinsics.areEqual(self.display_title, "")) {
                output.encodeStringElement(serialDesc, 1, self.display_title);
            }
            if (!Intrinsics.areEqual(self.display_subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.display_subtitle);
            }
            Instant instant = self.acquisition_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.total_cost_basis_fiat, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.total_cost_basis_fiat);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 6, self.status);
            }
            boolean z = self.lot_closed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            if (!Intrinsics.areEqual(self.additional_info_markdown, "")) {
                output.encodeStringElement(serialDesc, 8, self.additional_info_markdown);
            }
            boolean z2 = self.customer_attested;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 9, z2);
            }
            Instant instant2 = self.created_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String lot_id, String display_title, String display_subtitle, Instant instant, IdlDecimal quantity, IdlDecimal total_cost_basis_fiat, String status, boolean z, String additional_info_markdown, boolean z2, Instant instant2) {
            Intrinsics.checkNotNullParameter(lot_id, "lot_id");
            Intrinsics.checkNotNullParameter(display_title, "display_title");
            Intrinsics.checkNotNullParameter(display_subtitle, "display_subtitle");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(additional_info_markdown, "additional_info_markdown");
            this.lot_id = lot_id;
            this.display_title = display_title;
            this.display_subtitle = display_subtitle;
            this.acquisition_date = instant;
            this.quantity = quantity;
            this.total_cost_basis_fiat = total_cost_basis_fiat;
            this.status = status;
            this.lot_closed = z;
            this.additional_info_markdown = additional_info_markdown;
            this.customer_attested = z2;
            this.created_at = instant2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, boolean z, String str5, boolean z2, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str5 : "", (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? null : instant2);
        }

        public final String getLot_id() {
            return this.lot_id;
        }

        public final String getDisplay_title() {
            return this.display_title;
        }

        public final String getDisplay_subtitle() {
            return this.display_subtitle;
        }

        public final Instant getAcquisition_date() {
            return this.acquisition_date;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getTotal_cost_basis_fiat() {
            return this.total_cost_basis_fiat;
        }

        public final String getStatus() {
            return this.status;
        }

        public final boolean getLot_closed() {
            return this.lot_closed;
        }

        public final String getAdditional_info_markdown() {
            return this.additional_info_markdown;
        }

        public final boolean getCustomer_attested() {
            return this.customer_attested;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }
    }

    /* compiled from: CostBasisLotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CostBasisLotDto;", "Lnummus/v1/CostBasisLot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CostBasisLotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CostBasisLotDto, CostBasisLot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CostBasisLotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CostBasisLotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CostBasisLotDto> getBinaryBase64Serializer() {
            return (KSerializer) CostBasisLotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CostBasisLot> getProtoAdapter() {
            return CostBasisLot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CostBasisLotDto getZeroValue() {
            return CostBasisLotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CostBasisLotDto fromProto(CostBasisLot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CostBasisLotDto(new Surrogate(proto.getLot_id(), proto.getDisplay_title(), proto.getDisplay_subtitle(), proto.getAcquisition_date(), new IdlDecimal(proto.getQuantity()), new IdlDecimal(proto.getTotal_cost_basis_fiat()), proto.getStatus(), proto.getLot_closed(), proto.getAdditional_info_markdown(), proto.getCustomer_attested(), proto.getCreated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CostBasisLotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CostBasisLotDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CostBasisLotDto(null, null, null, null, null, null, null, false, null, false, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CostBasisLotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CostBasisLotDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CostBasisLotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CostBasisLotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CostBasisLot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CostBasisLotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CostBasisLotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CostBasisLotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CostBasisLotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CostBasisLotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "nummus.v1.CostBasisLotDto";
        }
    }
}
