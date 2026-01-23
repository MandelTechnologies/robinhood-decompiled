package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRoleDto;
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

/* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;)V", "", "title", "description", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "role", "logging_identifier", "", "is_enabled", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;Ljava/lang/String;Z)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class BeneficiaryFlowBeneficiaryRoleCardDto implements Dto3<BeneficiaryFlowBeneficiaryRoleCard>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BeneficiaryFlowBeneficiaryRoleCardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BeneficiaryFlowBeneficiaryRoleCardDto, BeneficiaryFlowBeneficiaryRoleCard>> binaryBase64Serializer$delegate;
    private static final BeneficiaryFlowBeneficiaryRoleCardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BeneficiaryFlowBeneficiaryRoleCardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BeneficiaryFlowBeneficiaryRoleCardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ BeneficiaryFlowBeneficiaryRoleCardDto(String str, String str2, BeneficiaryRoleDto beneficiaryRoleDto, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BeneficiaryRoleDto.INSTANCE.getZeroValue() : beneficiaryRoleDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowBeneficiaryRoleCardDto(String title, String description, BeneficiaryRoleDto role, String logging_identifier, boolean z) {
        this(new Surrogate(title, description, role, logging_identifier, z));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BeneficiaryFlowBeneficiaryRoleCard toProto() {
        return new BeneficiaryFlowBeneficiaryRoleCard(this.surrogate.getTitle(), this.surrogate.getDescription(), (BeneficiaryRole) this.surrogate.getRole().toProto(), this.surrogate.getLogging_identifier(), this.surrogate.getIs_enabled(), null, 32, null);
    }

    public String toString() {
        return "[BeneficiaryFlowBeneficiaryRoleCardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BeneficiaryFlowBeneficiaryRoleCardDto) && Intrinsics.areEqual(((BeneficiaryFlowBeneficiaryRoleCardDto) other).surrogate, this.surrogate);
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
    /* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010$\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b/\u0010$\u001a\u0004\b\t\u0010.¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;", "", "", "title", "description", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "role", "logging_identifier", "", "is_enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "getRole", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "getRole$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Z", "()Z", "is_enabled$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final boolean is_enabled;
        private final String logging_identifier;
        private final BeneficiaryRoleDto role;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (BeneficiaryRoleDto) null, (String) null, false, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && this.role == surrogate.role && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && this.is_enabled == surrogate.is_enabled;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.role.hashCode()) * 31) + this.logging_identifier.hashCode()) * 31) + Boolean.hashCode(this.is_enabled);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", role=" + this.role + ", logging_identifier=" + this.logging_identifier + ", is_enabled=" + this.is_enabled + ")";
        }

        /* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BeneficiaryFlowBeneficiaryRoleCardDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, BeneficiaryRoleDto beneficiaryRoleDto, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.role = BeneficiaryRoleDto.INSTANCE.getZeroValue();
            } else {
                this.role = beneficiaryRoleDto;
            }
            if ((i & 8) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str3;
            }
            if ((i & 16) == 0) {
                this.is_enabled = false;
            } else {
                this.is_enabled = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            if (self.role != BeneficiaryRoleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BeneficiaryRoleDto.Serializer.INSTANCE, self.role);
            }
            if (!Intrinsics.areEqual(self.logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 3, self.logging_identifier);
            }
            boolean z = self.is_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(String title, String description, BeneficiaryRoleDto role, String logging_identifier, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.title = title;
            this.description = description;
            this.role = role;
            this.logging_identifier = logging_identifier;
            this.is_enabled = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, BeneficiaryRoleDto beneficiaryRoleDto, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BeneficiaryRoleDto.INSTANCE.getZeroValue() : beneficiaryRoleDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final BeneficiaryRoleDto getRole() {
            return this.role;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        /* renamed from: is_enabled, reason: from getter */
        public final boolean getIs_enabled() {
            return this.is_enabled;
        }
    }

    /* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BeneficiaryFlowBeneficiaryRoleCardDto, BeneficiaryFlowBeneficiaryRoleCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BeneficiaryFlowBeneficiaryRoleCardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowBeneficiaryRoleCardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowBeneficiaryRoleCardDto> getBinaryBase64Serializer() {
            return (KSerializer) BeneficiaryFlowBeneficiaryRoleCardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BeneficiaryFlowBeneficiaryRoleCard> getProtoAdapter() {
            return BeneficiaryFlowBeneficiaryRoleCard.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowBeneficiaryRoleCardDto getZeroValue() {
            return BeneficiaryFlowBeneficiaryRoleCardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowBeneficiaryRoleCardDto fromProto(BeneficiaryFlowBeneficiaryRoleCard proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BeneficiaryFlowBeneficiaryRoleCardDto(new Surrogate(proto.getTitle(), proto.getDescription(), BeneficiaryRoleDto.INSTANCE.fromProto(proto.getRole()), proto.getLogging_identifier(), proto.getIs_enabled()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleCardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryFlowBeneficiaryRoleCardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BeneficiaryFlowBeneficiaryRoleCardDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BeneficiaryFlowBeneficiaryRoleCardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleCard", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BeneficiaryFlowBeneficiaryRoleCardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BeneficiaryFlowBeneficiaryRoleCardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BeneficiaryFlowBeneficiaryRoleCardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BeneficiaryFlowBeneficiaryRoleCardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleCardDto";
        }
    }
}
