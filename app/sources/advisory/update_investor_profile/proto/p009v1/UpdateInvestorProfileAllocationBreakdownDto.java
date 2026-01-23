package advisory.update_investor_profile.proto.p009v1;

import advisory.update_investor_profile.proto.p009v1.DirectionDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdown;", "Landroid/os/Parcelable;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;)V", "", "title", "description", "allocation_percentage", "Ladvisory/update_investor_profile/proto/v1/DirectionDto;", "direction", "asset_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/update_investor_profile/proto/v1/DirectionDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdown;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes4.dex */
public final class UpdateInvestorProfileAllocationBreakdownDto implements Dto3<UpdateInvestorProfileAllocationBreakdown>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UpdateInvestorProfileAllocationBreakdownDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UpdateInvestorProfileAllocationBreakdownDto, UpdateInvestorProfileAllocationBreakdown>> binaryBase64Serializer$delegate;
    private static final UpdateInvestorProfileAllocationBreakdownDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UpdateInvestorProfileAllocationBreakdownDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UpdateInvestorProfileAllocationBreakdownDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ UpdateInvestorProfileAllocationBreakdownDto(String str, String str2, String str3, DirectionDto directionDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdateInvestorProfileAllocationBreakdownDto(String title, String description, String allocation_percentage, DirectionDto direction, String asset_id) {
        this(new Surrogate(title, description, allocation_percentage, direction, asset_id));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UpdateInvestorProfileAllocationBreakdown toProto() {
        return new UpdateInvestorProfileAllocationBreakdown(this.surrogate.getTitle(), this.surrogate.getDescription(), this.surrogate.getAllocation_percentage(), (Direction) this.surrogate.getDirection().toProto(), this.surrogate.getAsset_id(), null, 32, null);
    }

    public String toString() {
        return "[UpdateInvestorProfileAllocationBreakdownDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UpdateInvestorProfileAllocationBreakdownDto) && Intrinsics.areEqual(((UpdateInvestorProfileAllocationBreakdownDto) other).surrogate, this.surrogate);
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
    /* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;", "", "", "title", "description", "allocation_percentage", "Ladvisory/update_investor_profile/proto/v1/DirectionDto;", "direction", "asset_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/update_investor_profile/proto/v1/DirectionDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/update_investor_profile/proto/v1/DirectionDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_update_investor_profile_proto_v1_externalRelease", "(Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getAllocation_percentage", "getAllocation_percentage$annotations", "Ladvisory/update_investor_profile/proto/v1/DirectionDto;", "getDirection", "()Ladvisory/update_investor_profile/proto/v1/DirectionDto;", "getDirection$annotations", "getAsset_id", "getAsset_id$annotations", "Companion", "$serializer", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String allocation_percentage;
        private final String asset_id;
        private final String description;
        private final DirectionDto direction;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (DirectionDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.allocation_percentage, surrogate.allocation_percentage) && this.direction == surrogate.direction && Intrinsics.areEqual(this.asset_id, surrogate.asset_id);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.allocation_percentage.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.asset_id.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", allocation_percentage=" + this.allocation_percentage + ", direction=" + this.direction + ", asset_id=" + this.asset_id + ")";
        }

        /* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UpdateInvestorProfileAllocationBreakdownDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, DirectionDto directionDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.allocation_percentage = "";
            } else {
                this.allocation_percentage = str3;
            }
            if ((i & 8) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 16) == 0) {
                this.asset_id = "";
            } else {
                this.asset_id = str4;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$advisory_update_investor_profile_proto_v1_externalRelease */
        public static final /* synthetic */ void m5x24e7e549(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            if (!Intrinsics.areEqual(self.allocation_percentage, "")) {
                output.encodeStringElement(serialDesc, 2, self.allocation_percentage);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (Intrinsics.areEqual(self.asset_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.asset_id);
        }

        public Surrogate(String title, String description, String allocation_percentage, DirectionDto direction, String asset_id) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(asset_id, "asset_id");
            this.title = title;
            this.description = description;
            this.allocation_percentage = allocation_percentage;
            this.direction = direction;
            this.asset_id = asset_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, DirectionDto directionDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? "" : str4);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getAllocation_percentage() {
            return this.allocation_percentage;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final String getAsset_id() {
            return this.asset_id;
        }
    }

    /* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdown;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<UpdateInvestorProfileAllocationBreakdownDto, UpdateInvestorProfileAllocationBreakdown> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UpdateInvestorProfileAllocationBreakdownDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpdateInvestorProfileAllocationBreakdownDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpdateInvestorProfileAllocationBreakdownDto> getBinaryBase64Serializer() {
            return (KSerializer) UpdateInvestorProfileAllocationBreakdownDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UpdateInvestorProfileAllocationBreakdown> getProtoAdapter() {
            return UpdateInvestorProfileAllocationBreakdown.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpdateInvestorProfileAllocationBreakdownDto getZeroValue() {
            return UpdateInvestorProfileAllocationBreakdownDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpdateInvestorProfileAllocationBreakdownDto fromProto(UpdateInvestorProfileAllocationBreakdown proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new UpdateInvestorProfileAllocationBreakdownDto(new Surrogate(proto.getTitle(), proto.getDescription(), proto.getAllocation_percentage(), DirectionDto.INSTANCE.fromProto(proto.getDirection()), proto.getAsset_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.update_investor_profile.proto.v1.UpdateInvestorProfileAllocationBreakdownDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateInvestorProfileAllocationBreakdownDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UpdateInvestorProfileAllocationBreakdownDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UpdateInvestorProfileAllocationBreakdownDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.update_investor_profile.proto.v1.UpdateInvestorProfileAllocationBreakdown", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UpdateInvestorProfileAllocationBreakdownDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UpdateInvestorProfileAllocationBreakdownDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UpdateInvestorProfileAllocationBreakdownDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UpdateInvestorProfileAllocationBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdownDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "advisory.update_investor_profile.proto.v1.UpdateInvestorProfileAllocationBreakdownDto";
        }
    }
}
