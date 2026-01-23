package bonfire.proto.idl.advisory.p030v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisory.p030v1.CreateAdvisoryApplicationErrorDto;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: CreateAdvisoryApplicationResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;)V", "", "application_id", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;", "error", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;)V", "toProto", "()Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;", "getApplication_id", "getError", "()Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class CreateAdvisoryApplicationResponseDto implements Dto3<CreateAdvisoryApplicationResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateAdvisoryApplicationResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateAdvisoryApplicationResponseDto, CreateAdvisoryApplicationResponse>> binaryBase64Serializer$delegate;
    private static final CreateAdvisoryApplicationResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateAdvisoryApplicationResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateAdvisoryApplicationResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getApplication_id() {
        return this.surrogate.getApplication_id();
    }

    public final CreateAdvisoryApplicationErrorDto getError() {
        return this.surrogate.getError();
    }

    public /* synthetic */ CreateAdvisoryApplicationResponseDto(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8) != 0 ? null : createAdvisoryApplicationErrorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateAdvisoryApplicationResponseDto(String application_id, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto) {
        this(new Surrogate(application_id, brokerage_account_type, management_type, createAdvisoryApplicationErrorDto));
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateAdvisoryApplicationResponse toProto() {
        String application_id = this.surrogate.getApplication_id();
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto();
        ManagementType managementType = (ManagementType) this.surrogate.getManagement_type().toProto();
        CreateAdvisoryApplicationErrorDto error = this.surrogate.getError();
        return new CreateAdvisoryApplicationResponse(application_id, brokerageAccountType, managementType, error != null ? error.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CreateAdvisoryApplicationResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateAdvisoryApplicationResponseDto) && Intrinsics.areEqual(((CreateAdvisoryApplicationResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateAdvisoryApplicationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;", "", "", "application_id", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;", "error", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_advisory_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplication_id", "getApplication_id$annotations", "()V", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;", "getError", "()Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationErrorDto;", "getError$annotations", "Companion", "$serializer", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String application_id;
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final CreateAdvisoryApplicationErrorDto error;
        private final ManagementTypeDto management_type;

        public Surrogate() {
            this((String) null, (BrokerageAccountTypeDto) null, (ManagementTypeDto) null, (CreateAdvisoryApplicationErrorDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.application_id, surrogate.application_id) && this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.error, surrogate.error);
        }

        public int hashCode() {
            int iHashCode = ((((this.application_id.hashCode() * 31) + this.brokerage_account_type.hashCode()) * 31) + this.management_type.hashCode()) * 31;
            CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto = this.error;
            return iHashCode + (createAdvisoryApplicationErrorDto == null ? 0 : createAdvisoryApplicationErrorDto.hashCode());
        }

        public String toString() {
            return "Surrogate(application_id=" + this.application_id + ", brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", error=" + this.error + ")";
        }

        /* compiled from: CreateAdvisoryApplicationResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateAdvisoryApplicationResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.application_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.brokerage_account_type = brokerageAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 8) == 0) {
                this.error = null;
            } else {
                this.error = createAdvisoryApplicationErrorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_advisory_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.application_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.application_id);
            }
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto = self.error;
            if (createAdvisoryApplicationErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CreateAdvisoryApplicationErrorDto.Serializer.INSTANCE, createAdvisoryApplicationErrorDto);
            }
        }

        public Surrogate(String application_id, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto) {
            Intrinsics.checkNotNullParameter(application_id, "application_id");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            this.application_id = application_id;
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.error = createAdvisoryApplicationErrorDto;
        }

        public final String getApplication_id() {
            return this.application_id;
        }

        public /* synthetic */ Surrogate(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, CreateAdvisoryApplicationErrorDto createAdvisoryApplicationErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8) != 0 ? null : createAdvisoryApplicationErrorDto);
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final CreateAdvisoryApplicationErrorDto getError() {
            return this.error;
        }
    }

    /* compiled from: CreateAdvisoryApplicationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateAdvisoryApplicationResponseDto, CreateAdvisoryApplicationResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateAdvisoryApplicationResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateAdvisoryApplicationResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateAdvisoryApplicationResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateAdvisoryApplicationResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateAdvisoryApplicationResponse> getProtoAdapter() {
            return CreateAdvisoryApplicationResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateAdvisoryApplicationResponseDto getZeroValue() {
            return CreateAdvisoryApplicationResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateAdvisoryApplicationResponseDto fromProto(CreateAdvisoryApplicationResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String application_id = proto.getApplication_id();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type());
            ManagementTypeDto managementTypeDtoFromProto = ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type());
            CreateAdvisoryApplicationError error = proto.getError();
            return new CreateAdvisoryApplicationResponseDto(new Surrogate(application_id, brokerageAccountTypeDtoFromProto, managementTypeDtoFromProto, error != null ? CreateAdvisoryApplicationErrorDto.INSTANCE.fromProto(error) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisory.v1.CreateAdvisoryApplicationResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateAdvisoryApplicationResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateAdvisoryApplicationResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateAdvisoryApplicationResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<CreateAdvisoryApplicationResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisory.v1.CreateAdvisoryApplicationResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateAdvisoryApplicationResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateAdvisoryApplicationResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateAdvisoryApplicationResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateAdvisoryApplicationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisory.v1.CreateAdvisoryApplicationResponseDto";
        }
    }
}
