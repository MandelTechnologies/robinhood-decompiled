package internal_asset_transfers.proto.p475v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReasonDto;
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

/* compiled from: IATAccountDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010-R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010-R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Linternal_asset_transfers/proto/v1/IATAccount;", "Landroid/os/Parcelable;", "Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;", "surrogate", "<init>", "(Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;)V", "", "rhs_account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "", "is_eligible_sink_account", "is_eligible_source_account", "rhf_account_number", "Lrosetta/account/ManagementTypeDto;", "management_type", "nickname", "created_at", "Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "source_ineligibility_reason", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;ZZLjava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;)V", "toProto", "()Linternal_asset_transfers/proto/v1/IATAccount;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;", "getRhs_account_number", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "()Z", "getRhf_account_number", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getNickname", "getCreated_at", "getSource_ineligibility_reason", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class IATAccountDto implements Dto3<IATAccount>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IATAccountDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IATAccountDto, IATAccount>> binaryBase64Serializer$delegate;
    private static final IATAccountDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IATAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IATAccountDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final BrokerageAccountTypeDto getBrokerage_account_type() {
        return this.surrogate.getBrokerage_account_type();
    }

    public final boolean is_eligible_sink_account() {
        return this.surrogate.getIs_eligible_sink_account();
    }

    public final boolean is_eligible_source_account() {
        return this.surrogate.getIs_eligible_source_account();
    }

    public final String getRhf_account_number() {
        return this.surrogate.getRhf_account_number();
    }

    public final ManagementTypeDto getManagement_type() {
        return this.surrogate.getManagement_type();
    }

    public final String getNickname() {
        return this.surrogate.getNickname();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final IATIneligibilityReasonDto getSource_ineligibility_reason() {
        return this.surrogate.getSource_ineligibility_reason();
    }

    public /* synthetic */ IATAccountDto(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, boolean z2, String str2, ManagementTypeDto managementTypeDto, String str3, String str4, IATIneligibilityReasonDto iATIneligibilityReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : iATIneligibilityReasonDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IATAccountDto(String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, boolean z, boolean z2, String rhf_account_number, ManagementTypeDto management_type, String nickname, String created_at, IATIneligibilityReasonDto iATIneligibilityReasonDto) {
        this(new Surrogate(rhs_account_number, brokerage_account_type, z, z2, rhf_account_number, management_type, nickname, created_at, iATIneligibilityReasonDto));
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IATAccount toProto() {
        String rhs_account_number = this.surrogate.getRhs_account_number();
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto();
        boolean is_eligible_sink_account = this.surrogate.getIs_eligible_sink_account();
        boolean is_eligible_source_account = this.surrogate.getIs_eligible_source_account();
        String rhf_account_number = this.surrogate.getRhf_account_number();
        ManagementType managementType = (ManagementType) this.surrogate.getManagement_type().toProto();
        String nickname = this.surrogate.getNickname();
        String created_at = this.surrogate.getCreated_at();
        IATIneligibilityReasonDto source_ineligibility_reason = this.surrogate.getSource_ineligibility_reason();
        return new IATAccount(rhs_account_number, brokerageAccountType, is_eligible_sink_account, is_eligible_source_account, rhf_account_number, managementType, nickname, created_at, source_ineligibility_reason != null ? (IATIneligibilityReason) source_ineligibility_reason.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[IATAccountDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IATAccountDto) && Intrinsics.areEqual(((IATAccountDto) other).surrogate, this.surrogate);
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
    /* compiled from: IATAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BABc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b\u0007\u00100R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b\b\u00100R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010!R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010*\u001a\u0004\b6\u00107R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010'\u0012\u0004\b:\u0010*\u001a\u0004\b9\u0010!R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b<\u0010*\u001a\u0004\b;\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u0010*\u001a\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;", "", "", "rhs_account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "", "is_eligible_sink_account", "is_eligible_source_account", "rhf_account_number", "Lrosetta/account/ManagementTypeDto;", "management_type", "nickname", "created_at", "Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "source_ineligibility_reason", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;ZZLjava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;ZZLjava/lang/String;Lrosetta/account/ManagementTypeDto;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_asset_transfers_v1_externalRelease", "(Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhs_account_number", "getRhs_account_number$annotations", "()V", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Z", "()Z", "is_eligible_sink_account$annotations", "is_eligible_source_account$annotations", "getRhf_account_number", "getRhf_account_number$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "getNickname", "getNickname$annotations", "getCreated_at", "getCreated_at$annotations", "Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "getSource_ineligibility_reason", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "getSource_ineligibility_reason$annotations", "Companion", "$serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final String created_at;
        private final boolean is_eligible_sink_account;
        private final boolean is_eligible_source_account;
        private final ManagementTypeDto management_type;
        private final String nickname;
        private final String rhf_account_number;
        private final String rhs_account_number;
        private final IATIneligibilityReasonDto source_ineligibility_reason;

        public Surrogate() {
            this((String) null, (BrokerageAccountTypeDto) null, false, false, (String) null, (ManagementTypeDto) null, (String) null, (String) null, (IATIneligibilityReasonDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.brokerage_account_type == surrogate.brokerage_account_type && this.is_eligible_sink_account == surrogate.is_eligible_sink_account && this.is_eligible_source_account == surrogate.is_eligible_source_account && Intrinsics.areEqual(this.rhf_account_number, surrogate.rhf_account_number) && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.nickname, surrogate.nickname) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && this.source_ineligibility_reason == surrogate.source_ineligibility_reason;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.rhs_account_number.hashCode() * 31) + this.brokerage_account_type.hashCode()) * 31) + Boolean.hashCode(this.is_eligible_sink_account)) * 31) + Boolean.hashCode(this.is_eligible_source_account)) * 31) + this.rhf_account_number.hashCode()) * 31) + this.management_type.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.created_at.hashCode()) * 31;
            IATIneligibilityReasonDto iATIneligibilityReasonDto = this.source_ineligibility_reason;
            return iHashCode + (iATIneligibilityReasonDto == null ? 0 : iATIneligibilityReasonDto.hashCode());
        }

        public String toString() {
            return "Surrogate(rhs_account_number=" + this.rhs_account_number + ", brokerage_account_type=" + this.brokerage_account_type + ", is_eligible_sink_account=" + this.is_eligible_sink_account + ", is_eligible_source_account=" + this.is_eligible_source_account + ", rhf_account_number=" + this.rhf_account_number + ", management_type=" + this.management_type + ", nickname=" + this.nickname + ", created_at=" + this.created_at + ", source_ineligibility_reason=" + this.source_ineligibility_reason + ")";
        }

        /* compiled from: IATAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IATAccountDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, boolean z2, String str2, ManagementTypeDto managementTypeDto, String str3, String str4, IATIneligibilityReasonDto iATIneligibilityReasonDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str;
            }
            if ((i & 2) == 0) {
                this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.brokerage_account_type = brokerageAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.is_eligible_sink_account = false;
            } else {
                this.is_eligible_sink_account = z;
            }
            if ((i & 8) == 0) {
                this.is_eligible_source_account = false;
            } else {
                this.is_eligible_source_account = z2;
            }
            if ((i & 16) == 0) {
                this.rhf_account_number = "";
            } else {
                this.rhf_account_number = str2;
            }
            if ((i & 32) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 64) == 0) {
                this.nickname = "";
            } else {
                this.nickname = str3;
            }
            if ((i & 128) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str4;
            }
            if ((i & 256) == 0) {
                this.source_ineligibility_reason = null;
            } else {
                this.source_ineligibility_reason = iATIneligibilityReasonDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_asset_transfers_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.rhs_account_number);
            }
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            boolean z = self.is_eligible_sink_account;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.is_eligible_source_account;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            if (!Intrinsics.areEqual(self.rhf_account_number, "")) {
                output.encodeStringElement(serialDesc, 4, self.rhf_account_number);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            if (!Intrinsics.areEqual(self.nickname, "")) {
                output.encodeStringElement(serialDesc, 6, self.nickname);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 7, self.created_at);
            }
            IATIneligibilityReasonDto iATIneligibilityReasonDto = self.source_ineligibility_reason;
            if (iATIneligibilityReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IATIneligibilityReasonDto.Serializer.INSTANCE, iATIneligibilityReasonDto);
            }
        }

        public Surrogate(String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, boolean z, boolean z2, String rhf_account_number, ManagementTypeDto management_type, String nickname, String created_at, IATIneligibilityReasonDto iATIneligibilityReasonDto) {
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            this.rhs_account_number = rhs_account_number;
            this.brokerage_account_type = brokerage_account_type;
            this.is_eligible_sink_account = z;
            this.is_eligible_source_account = z2;
            this.rhf_account_number = rhf_account_number;
            this.management_type = management_type;
            this.nickname = nickname;
            this.created_at = created_at;
            this.source_ineligibility_reason = iATIneligibilityReasonDto;
        }

        public /* synthetic */ Surrogate(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, boolean z2, String str2, ManagementTypeDto managementTypeDto, String str3, String str4, IATIneligibilityReasonDto iATIneligibilityReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : iATIneligibilityReasonDto);
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        /* renamed from: is_eligible_sink_account, reason: from getter */
        public final boolean getIs_eligible_sink_account() {
            return this.is_eligible_sink_account;
        }

        /* renamed from: is_eligible_source_account, reason: from getter */
        public final boolean getIs_eligible_source_account() {
            return this.is_eligible_source_account;
        }

        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final IATIneligibilityReasonDto getSource_ineligibility_reason() {
            return this.source_ineligibility_reason;
        }
    }

    /* compiled from: IATAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Linternal_asset_transfers/proto/v1/IATAccountDto;", "Linternal_asset_transfers/proto/v1/IATAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Linternal_asset_transfers/proto/v1/IATAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IATAccountDto, IATAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IATAccountDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IATAccountDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IATAccountDto> getBinaryBase64Serializer() {
            return (KSerializer) IATAccountDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IATAccount> getProtoAdapter() {
            return IATAccount.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IATAccountDto getZeroValue() {
            return IATAccountDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IATAccountDto fromProto(IATAccount proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String rhs_account_number = proto.getRhs_account_number();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type());
            boolean is_eligible_sink_account = proto.getIs_eligible_sink_account();
            boolean is_eligible_source_account = proto.getIs_eligible_source_account();
            String rhf_account_number = proto.getRhf_account_number();
            ManagementTypeDto managementTypeDtoFromProto = ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type());
            String nickname = proto.getNickname();
            String created_at = proto.getCreated_at();
            IATIneligibilityReason source_ineligibility_reason = proto.getSource_ineligibility_reason();
            return new IATAccountDto(new Surrogate(rhs_account_number, brokerageAccountTypeDtoFromProto, is_eligible_sink_account, is_eligible_source_account, rhf_account_number, managementTypeDtoFromProto, nickname, created_at, source_ineligibility_reason != null ? IATIneligibilityReasonDto.INSTANCE.fromProto(source_ineligibility_reason) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: internal_asset_transfers.proto.v1.IATAccountDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IATAccountDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IATAccountDto(null, null, false, false, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IATAccountDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Linternal_asset_transfers/proto/v1/IATAccountDto;", "<init>", "()V", "surrogateSerializer", "Linternal_asset_transfers/proto/v1/IATAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IATAccountDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/internal_asset_transfers.proto.v1.IATAccount", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IATAccountDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IATAccountDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IATAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IATAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "internal_asset_transfers.proto.v1.IATAccountDto";
        }
    }
}
