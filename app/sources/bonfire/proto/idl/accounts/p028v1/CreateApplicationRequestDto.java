package bonfire.proto.idl.accounts.p028v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: CreateApplicationRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequest;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;)V", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "", "attempt_auto_approval", "is_margin_allowed", "is_slip_allowed", "is_sweep_allowed", "", "nickname", "(Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZZZZLjava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/accounts/v1/CreateApplicationRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class CreateApplicationRequestDto implements Dto3<CreateApplicationRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateApplicationRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateApplicationRequestDto, CreateApplicationRequest>> binaryBase64Serializer$delegate;
    private static final CreateApplicationRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateApplicationRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateApplicationRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CreateApplicationRequestDto(BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 2) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateApplicationRequestDto(BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this(new Surrogate(brokerage_account_type, management_type, z, z2, z3, z4, str));
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateApplicationRequest toProto() {
        return new CreateApplicationRequest((BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getAttempt_auto_approval(), this.surrogate.getIs_margin_allowed(), this.surrogate.getIs_slip_allowed(), this.surrogate.getIs_sweep_allowed(), this.surrogate.getNickname(), null, 128, null);
    }

    public String toString() {
        return "[CreateApplicationRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateApplicationRequestDto) && Intrinsics.areEqual(((CreateApplicationRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateApplicationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b1\u0010(\u001a\u0004\b\b\u0010/R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b2\u0010(\u001a\u0004\b\t\u0010/R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b3\u0010(\u001a\u0004\b\n\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u001e¨\u00069"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;", "", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "", "attempt_auto_approval", "is_margin_allowed", "is_slip_allowed", "is_sweep_allowed", "", "nickname", "<init>", "(Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZZZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZZZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_accounts_v1_externalRelease", "(Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "()V", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "Z", "getAttempt_auto_approval", "()Z", "getAttempt_auto_approval$annotations", "is_margin_allowed$annotations", "is_slip_allowed$annotations", "is_sweep_allowed$annotations", "Ljava/lang/String;", "getNickname", "getNickname$annotations", "Companion", "$serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean attempt_auto_approval;
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final boolean is_margin_allowed;
        private final boolean is_slip_allowed;
        private final boolean is_sweep_allowed;
        private final ManagementTypeDto management_type;
        private final String nickname;

        public Surrogate() {
            this((BrokerageAccountTypeDto) null, (ManagementTypeDto) null, false, false, false, false, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && this.attempt_auto_approval == surrogate.attempt_auto_approval && this.is_margin_allowed == surrogate.is_margin_allowed && this.is_slip_allowed == surrogate.is_slip_allowed && this.is_sweep_allowed == surrogate.is_sweep_allowed && Intrinsics.areEqual(this.nickname, surrogate.nickname);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.brokerage_account_type.hashCode() * 31) + this.management_type.hashCode()) * 31) + Boolean.hashCode(this.attempt_auto_approval)) * 31) + Boolean.hashCode(this.is_margin_allowed)) * 31) + Boolean.hashCode(this.is_slip_allowed)) * 31) + Boolean.hashCode(this.is_sweep_allowed)) * 31;
            String str = this.nickname;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Surrogate(brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", attempt_auto_approval=" + this.attempt_auto_approval + ", is_margin_allowed=" + this.is_margin_allowed + ", is_slip_allowed=" + this.is_slip_allowed + ", is_sweep_allowed=" + this.is_sweep_allowed + ", nickname=" + this.nickname + ")";
        }

        /* compiled from: CreateApplicationRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateApplicationRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, boolean z, boolean z2, boolean z3, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.brokerage_account_type = (i & 1) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto;
            if ((i & 2) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 4) == 0) {
                this.attempt_auto_approval = false;
            } else {
                this.attempt_auto_approval = z;
            }
            if ((i & 8) == 0) {
                this.is_margin_allowed = false;
            } else {
                this.is_margin_allowed = z2;
            }
            if ((i & 16) == 0) {
                this.is_slip_allowed = false;
            } else {
                this.is_slip_allowed = z3;
            }
            if ((i & 32) == 0) {
                this.is_sweep_allowed = false;
            } else {
                this.is_sweep_allowed = z4;
            }
            if ((i & 64) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_accounts_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            boolean z = self.attempt_auto_approval;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.is_margin_allowed;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            boolean z3 = self.is_slip_allowed;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 4, z3);
            }
            boolean z4 = self.is_sweep_allowed;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 5, z4);
            }
            String str = self.nickname;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, boolean z, boolean z2, boolean z3, boolean z4, String str) {
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.attempt_auto_approval = z;
            this.is_margin_allowed = z2;
            this.is_slip_allowed = z3;
            this.is_sweep_allowed = z4;
            this.nickname = str;
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public /* synthetic */ Surrogate(BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 2) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str);
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final boolean getAttempt_auto_approval() {
            return this.attempt_auto_approval;
        }

        /* renamed from: is_margin_allowed, reason: from getter */
        public final boolean getIs_margin_allowed() {
            return this.is_margin_allowed;
        }

        /* renamed from: is_slip_allowed, reason: from getter */
        public final boolean getIs_slip_allowed() {
            return this.is_slip_allowed;
        }

        /* renamed from: is_sweep_allowed, reason: from getter */
        public final boolean getIs_sweep_allowed() {
            return this.is_sweep_allowed;
        }

        public final String getNickname() {
            return this.nickname;
        }
    }

    /* compiled from: CreateApplicationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CreateApplicationRequestDto, CreateApplicationRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateApplicationRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateApplicationRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateApplicationRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateApplicationRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateApplicationRequest> getProtoAdapter() {
            return CreateApplicationRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateApplicationRequestDto getZeroValue() {
            return CreateApplicationRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateApplicationRequestDto fromProto(CreateApplicationRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CreateApplicationRequestDto(new Surrogate(BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type()), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getAttempt_auto_approval(), proto.getIs_margin_allowed(), proto.getIs_slip_allowed(), proto.getIs_sweep_allowed(), proto.getNickname()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.CreateApplicationRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateApplicationRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateApplicationRequestDto(null, null, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateApplicationRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateApplicationRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.accounts.v1.CreateApplicationRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateApplicationRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateApplicationRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateApplicationRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateApplicationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.accounts.v1.CreateApplicationRequestDto";
        }
    }
}
