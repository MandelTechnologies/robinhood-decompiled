package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModel;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModelDto;
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

/* compiled from: AccountCreationErrorViewModelDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;)V", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "default_error_message", "timeout_error_message", "multi_timeout_error_message", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "refresh_cta", "contact_support_cta", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;", "getDefault_error_message", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "getTimeout_error_message", "getMulti_timeout_error_message", "getRefresh_cta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getContact_support_cta", "Companion", "Surrogate", "AccountCreationErrorMessageDto", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AccountCreationErrorViewModelDto implements Dto3<AccountCreationErrorViewModel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountCreationErrorViewModelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountCreationErrorViewModelDto, AccountCreationErrorViewModel>> binaryBase64Serializer$delegate;
    private static final AccountCreationErrorViewModelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountCreationErrorViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountCreationErrorViewModelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AccountCreationErrorMessageDto getDefault_error_message() {
        return this.surrogate.getDefault_error_message();
    }

    public final AccountCreationErrorMessageDto getTimeout_error_message() {
        return this.surrogate.getTimeout_error_message();
    }

    public final AccountCreationErrorMessageDto getMulti_timeout_error_message() {
        return this.surrogate.getMulti_timeout_error_message();
    }

    public final AccountCreationCtaDto getRefresh_cta() {
        return this.surrogate.getRefresh_cta();
    }

    public final AccountCreationCtaDto getContact_support_cta() {
        return this.surrogate.getContact_support_cta();
    }

    public /* synthetic */ AccountCreationErrorViewModelDto(AccountCreationErrorMessageDto accountCreationErrorMessageDto, AccountCreationErrorMessageDto accountCreationErrorMessageDto2, AccountCreationErrorMessageDto accountCreationErrorMessageDto3, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaDto accountCreationCtaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountCreationErrorMessageDto, (i & 2) != 0 ? null : accountCreationErrorMessageDto2, (i & 4) != 0 ? null : accountCreationErrorMessageDto3, (i & 8) != 0 ? null : accountCreationCtaDto, (i & 16) != 0 ? null : accountCreationCtaDto2);
    }

    public AccountCreationErrorViewModelDto(AccountCreationErrorMessageDto accountCreationErrorMessageDto, AccountCreationErrorMessageDto accountCreationErrorMessageDto2, AccountCreationErrorMessageDto accountCreationErrorMessageDto3, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaDto accountCreationCtaDto2) {
        this(new Surrogate(accountCreationErrorMessageDto, accountCreationErrorMessageDto2, accountCreationErrorMessageDto3, accountCreationCtaDto, accountCreationCtaDto2));
    }

    @Override // com.robinhood.idl.Dto
    public AccountCreationErrorViewModel toProto() {
        AccountCreationErrorMessageDto default_error_message = this.surrogate.getDefault_error_message();
        AccountCreationErrorViewModel.AccountCreationErrorMessage proto = default_error_message != null ? default_error_message.toProto() : null;
        AccountCreationErrorMessageDto timeout_error_message = this.surrogate.getTimeout_error_message();
        AccountCreationErrorViewModel.AccountCreationErrorMessage proto2 = timeout_error_message != null ? timeout_error_message.toProto() : null;
        AccountCreationErrorMessageDto multi_timeout_error_message = this.surrogate.getMulti_timeout_error_message();
        AccountCreationErrorViewModel.AccountCreationErrorMessage proto3 = multi_timeout_error_message != null ? multi_timeout_error_message.toProto() : null;
        AccountCreationCtaDto refresh_cta = this.surrogate.getRefresh_cta();
        AccountCreationCta proto4 = refresh_cta != null ? refresh_cta.toProto() : null;
        AccountCreationCtaDto contact_support_cta = this.surrogate.getContact_support_cta();
        return new AccountCreationErrorViewModel(proto, proto2, proto3, proto4, contact_support_cta != null ? contact_support_cta.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[AccountCreationErrorViewModelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountCreationErrorViewModelDto) && Intrinsics.areEqual(((AccountCreationErrorViewModelDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountCreationErrorViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010-¨\u00063"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;", "", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "default_error_message", "timeout_error_message", "multi_timeout_error_message", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "refresh_cta", "contact_support_cta", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "getDefault_error_message", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "getDefault_error_message$annotations", "()V", "getTimeout_error_message", "getTimeout_error_message$annotations", "getMulti_timeout_error_message", "getMulti_timeout_error_message$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getRefresh_cta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getRefresh_cta$annotations", "getContact_support_cta", "getContact_support_cta$annotations", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountCreationCtaDto contact_support_cta;
        private final AccountCreationErrorMessageDto default_error_message;
        private final AccountCreationErrorMessageDto multi_timeout_error_message;
        private final AccountCreationCtaDto refresh_cta;
        private final AccountCreationErrorMessageDto timeout_error_message;

        public Surrogate() {
            this((AccountCreationErrorMessageDto) null, (AccountCreationErrorMessageDto) null, (AccountCreationErrorMessageDto) null, (AccountCreationCtaDto) null, (AccountCreationCtaDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.default_error_message, surrogate.default_error_message) && Intrinsics.areEqual(this.timeout_error_message, surrogate.timeout_error_message) && Intrinsics.areEqual(this.multi_timeout_error_message, surrogate.multi_timeout_error_message) && Intrinsics.areEqual(this.refresh_cta, surrogate.refresh_cta) && Intrinsics.areEqual(this.contact_support_cta, surrogate.contact_support_cta);
        }

        public int hashCode() {
            AccountCreationErrorMessageDto accountCreationErrorMessageDto = this.default_error_message;
            int iHashCode = (accountCreationErrorMessageDto == null ? 0 : accountCreationErrorMessageDto.hashCode()) * 31;
            AccountCreationErrorMessageDto accountCreationErrorMessageDto2 = this.timeout_error_message;
            int iHashCode2 = (iHashCode + (accountCreationErrorMessageDto2 == null ? 0 : accountCreationErrorMessageDto2.hashCode())) * 31;
            AccountCreationErrorMessageDto accountCreationErrorMessageDto3 = this.multi_timeout_error_message;
            int iHashCode3 = (iHashCode2 + (accountCreationErrorMessageDto3 == null ? 0 : accountCreationErrorMessageDto3.hashCode())) * 31;
            AccountCreationCtaDto accountCreationCtaDto = this.refresh_cta;
            int iHashCode4 = (iHashCode3 + (accountCreationCtaDto == null ? 0 : accountCreationCtaDto.hashCode())) * 31;
            AccountCreationCtaDto accountCreationCtaDto2 = this.contact_support_cta;
            return iHashCode4 + (accountCreationCtaDto2 != null ? accountCreationCtaDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(default_error_message=" + this.default_error_message + ", timeout_error_message=" + this.timeout_error_message + ", multi_timeout_error_message=" + this.multi_timeout_error_message + ", refresh_cta=" + this.refresh_cta + ", contact_support_cta=" + this.contact_support_cta + ")";
        }

        /* compiled from: AccountCreationErrorViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountCreationErrorViewModelDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AccountCreationErrorMessageDto accountCreationErrorMessageDto, AccountCreationErrorMessageDto accountCreationErrorMessageDto2, AccountCreationErrorMessageDto accountCreationErrorMessageDto3, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaDto accountCreationCtaDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.default_error_message = null;
            } else {
                this.default_error_message = accountCreationErrorMessageDto;
            }
            if ((i & 2) == 0) {
                this.timeout_error_message = null;
            } else {
                this.timeout_error_message = accountCreationErrorMessageDto2;
            }
            if ((i & 4) == 0) {
                this.multi_timeout_error_message = null;
            } else {
                this.multi_timeout_error_message = accountCreationErrorMessageDto3;
            }
            if ((i & 8) == 0) {
                this.refresh_cta = null;
            } else {
                this.refresh_cta = accountCreationCtaDto;
            }
            if ((i & 16) == 0) {
                this.contact_support_cta = null;
            } else {
                this.contact_support_cta = accountCreationCtaDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AccountCreationErrorMessageDto accountCreationErrorMessageDto = self.default_error_message;
            if (accountCreationErrorMessageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AccountCreationErrorMessageDto.Serializer.INSTANCE, accountCreationErrorMessageDto);
            }
            AccountCreationErrorMessageDto accountCreationErrorMessageDto2 = self.timeout_error_message;
            if (accountCreationErrorMessageDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AccountCreationErrorMessageDto.Serializer.INSTANCE, accountCreationErrorMessageDto2);
            }
            AccountCreationErrorMessageDto accountCreationErrorMessageDto3 = self.multi_timeout_error_message;
            if (accountCreationErrorMessageDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AccountCreationErrorMessageDto.Serializer.INSTANCE, accountCreationErrorMessageDto3);
            }
            AccountCreationCtaDto accountCreationCtaDto = self.refresh_cta;
            if (accountCreationCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AccountCreationCtaDto.Serializer.INSTANCE, accountCreationCtaDto);
            }
            AccountCreationCtaDto accountCreationCtaDto2 = self.contact_support_cta;
            if (accountCreationCtaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AccountCreationCtaDto.Serializer.INSTANCE, accountCreationCtaDto2);
            }
        }

        public Surrogate(AccountCreationErrorMessageDto accountCreationErrorMessageDto, AccountCreationErrorMessageDto accountCreationErrorMessageDto2, AccountCreationErrorMessageDto accountCreationErrorMessageDto3, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaDto accountCreationCtaDto2) {
            this.default_error_message = accountCreationErrorMessageDto;
            this.timeout_error_message = accountCreationErrorMessageDto2;
            this.multi_timeout_error_message = accountCreationErrorMessageDto3;
            this.refresh_cta = accountCreationCtaDto;
            this.contact_support_cta = accountCreationCtaDto2;
        }

        public /* synthetic */ Surrogate(AccountCreationErrorMessageDto accountCreationErrorMessageDto, AccountCreationErrorMessageDto accountCreationErrorMessageDto2, AccountCreationErrorMessageDto accountCreationErrorMessageDto3, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaDto accountCreationCtaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountCreationErrorMessageDto, (i & 2) != 0 ? null : accountCreationErrorMessageDto2, (i & 4) != 0 ? null : accountCreationErrorMessageDto3, (i & 8) != 0 ? null : accountCreationCtaDto, (i & 16) != 0 ? null : accountCreationCtaDto2);
        }

        public final AccountCreationErrorMessageDto getDefault_error_message() {
            return this.default_error_message;
        }

        public final AccountCreationErrorMessageDto getTimeout_error_message() {
            return this.timeout_error_message;
        }

        public final AccountCreationErrorMessageDto getMulti_timeout_error_message() {
            return this.multi_timeout_error_message;
        }

        public final AccountCreationCtaDto getRefresh_cta() {
            return this.refresh_cta;
        }

        public final AccountCreationCtaDto getContact_support_cta() {
            return this.contact_support_cta;
        }
    }

    /* compiled from: AccountCreationErrorViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AccountCreationErrorViewModelDto, AccountCreationErrorViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountCreationErrorViewModelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountCreationErrorViewModelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountCreationErrorViewModelDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountCreationErrorViewModelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountCreationErrorViewModel> getProtoAdapter() {
            return AccountCreationErrorViewModel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountCreationErrorViewModelDto getZeroValue() {
            return AccountCreationErrorViewModelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountCreationErrorViewModelDto fromProto(AccountCreationErrorViewModel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AccountCreationErrorViewModel.AccountCreationErrorMessage default_error_message = proto.getDefault_error_message();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AccountCreationErrorMessageDto accountCreationErrorMessageDtoFromProto = default_error_message != null ? AccountCreationErrorMessageDto.INSTANCE.fromProto(default_error_message) : null;
            AccountCreationErrorViewModel.AccountCreationErrorMessage timeout_error_message = proto.getTimeout_error_message();
            AccountCreationErrorMessageDto accountCreationErrorMessageDtoFromProto2 = timeout_error_message != null ? AccountCreationErrorMessageDto.INSTANCE.fromProto(timeout_error_message) : null;
            AccountCreationErrorViewModel.AccountCreationErrorMessage multi_timeout_error_message = proto.getMulti_timeout_error_message();
            AccountCreationErrorMessageDto accountCreationErrorMessageDtoFromProto3 = multi_timeout_error_message != null ? AccountCreationErrorMessageDto.INSTANCE.fromProto(multi_timeout_error_message) : null;
            AccountCreationCta refresh_cta = proto.getRefresh_cta();
            AccountCreationCtaDto accountCreationCtaDtoFromProto = refresh_cta != null ? AccountCreationCtaDto.INSTANCE.fromProto(refresh_cta) : null;
            AccountCreationCta contact_support_cta = proto.getContact_support_cta();
            return new AccountCreationErrorViewModelDto(new Surrogate(accountCreationErrorMessageDtoFromProto, accountCreationErrorMessageDtoFromProto2, accountCreationErrorMessageDtoFromProto3, accountCreationCtaDtoFromProto, contact_support_cta != null ? AccountCreationCtaDto.INSTANCE.fromProto(contact_support_cta) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCreationErrorViewModelDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountCreationErrorViewModelDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountCreationErrorViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u000f¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;)V", "", "title", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;", "getTitle", "getSubtitle", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountCreationErrorMessageDto implements Dto3<AccountCreationErrorViewModel.AccountCreationErrorMessage>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AccountCreationErrorMessageDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountCreationErrorMessageDto, AccountCreationErrorViewModel.AccountCreationErrorMessage>> binaryBase64Serializer$delegate;
        private static final AccountCreationErrorMessageDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AccountCreationErrorMessageDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AccountCreationErrorMessageDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final String getSubtitle() {
            return this.surrogate.getSubtitle();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AccountCreationErrorMessageDto(String title, String subtitle) {
            this(new Surrogate(title, subtitle));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        }

        public /* synthetic */ AccountCreationErrorMessageDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @Override // com.robinhood.idl.Dto
        public AccountCreationErrorViewModel.AccountCreationErrorMessage toProto() {
            return new AccountCreationErrorViewModel.AccountCreationErrorMessage(this.surrogate.getTitle(), this.surrogate.getSubtitle(), null, 4, null);
        }

        public String toString() {
            return "[AccountCreationErrorMessageDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AccountCreationErrorMessageDto) && Intrinsics.areEqual(((AccountCreationErrorMessageDto) other).surrogate, this.surrogate);
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
        /* compiled from: AccountCreationErrorViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;", "", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String subtitle;
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.subtitle.hashCode();
            }

            public String toString() {
                return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ")";
            }

            /* compiled from: AccountCreationErrorViewModelDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return AccountCreationErrorViewModelDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 2) == 0) {
                    this.subtitle = "";
                } else {
                    this.subtitle = str2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 0, self.title);
                }
                if (Intrinsics.areEqual(self.subtitle, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }

            public Surrogate(String title, String subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
            }

            public /* synthetic */ Surrogate(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }
        }

        /* compiled from: AccountCreationErrorViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel$AccountCreationErrorMessage;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<AccountCreationErrorMessageDto, AccountCreationErrorViewModel.AccountCreationErrorMessage> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AccountCreationErrorMessageDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountCreationErrorMessageDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountCreationErrorMessageDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountCreationErrorMessageDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AccountCreationErrorViewModel.AccountCreationErrorMessage> getProtoAdapter() {
                return AccountCreationErrorViewModel.AccountCreationErrorMessage.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountCreationErrorMessageDto getZeroValue() {
                return AccountCreationErrorMessageDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountCreationErrorMessageDto fromProto(AccountCreationErrorViewModel.AccountCreationErrorMessage proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new AccountCreationErrorMessageDto(new Surrogate(proto.getTitle(), proto.getSubtitle()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCreationErrorViewModelDto.AccountCreationErrorMessageDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AccountCreationErrorMessageDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AccountCreationErrorViewModelDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<AccountCreationErrorMessageDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel.AccountCreationErrorMessage", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountCreationErrorMessageDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AccountCreationErrorMessageDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AccountCreationErrorMessageDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AccountCreationErrorViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto$AccountCreationErrorMessageDto";
            }
        }
    }

    /* compiled from: AccountCreationErrorViewModelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<AccountCreationErrorViewModelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountCreationErrorViewModelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountCreationErrorViewModelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountCreationErrorViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountCreationErrorViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto";
        }
    }
}
