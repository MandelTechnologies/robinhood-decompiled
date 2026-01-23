package crypto_portkey.service.p443v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.ProtoAdapter;
import crypto_portkey.service.p443v1.MigrationAuthedErrorCodeDto;
import crypto_portkey.service.p443v1.PartnerBalanceDataDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProcessMigrationAuthedResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00065"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponse;", "Landroid/os/Parcelable;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;)V", "Lcrypto_portkey/service/v1/PartnerBalanceDataDto;", "balance_data", "", "success", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", ErrorResponse.ERROR_CODE, "", "error_message", "error_details", "error_deeplink", "migration_status", "migration_id", "(Lcrypto_portkey/service/v1/PartnerBalanceDataDto;Ljava/lang/Boolean;Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;", "getBalance_data", "()Lcrypto_portkey/service/v1/PartnerBalanceDataDto;", "getSuccess", "()Ljava/lang/Boolean;", "getError_code", "()Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "getError_message", "getError_deeplink", "getMigration_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class ProcessMigrationAuthedResponseDto implements Dto3<ProcessMigrationAuthedResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ProcessMigrationAuthedResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ProcessMigrationAuthedResponseDto, ProcessMigrationAuthedResponse>> binaryBase64Serializer$delegate;
    private static final ProcessMigrationAuthedResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ProcessMigrationAuthedResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ProcessMigrationAuthedResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PartnerBalanceDataDto getBalance_data() {
        return this.surrogate.getBalance_data();
    }

    public final Boolean getSuccess() {
        return this.surrogate.getSuccess();
    }

    public final MigrationAuthedErrorCodeDto getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final String getError_deeplink() {
        return this.surrogate.getError_deeplink();
    }

    public final String getMigration_id() {
        return this.surrogate.getMigration_id();
    }

    public /* synthetic */ ProcessMigrationAuthedResponseDto(PartnerBalanceDataDto partnerBalanceDataDto, Boolean bool, MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : partnerBalanceDataDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : migrationAuthedErrorCodeDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }

    public ProcessMigrationAuthedResponseDto(PartnerBalanceDataDto partnerBalanceDataDto, Boolean bool, MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto, String str, String str2, String str3, String str4, String str5) {
        this(new Surrogate(partnerBalanceDataDto, bool, migrationAuthedErrorCodeDto, str, str2, str3, str4, str5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ProcessMigrationAuthedResponse toProto() {
        PartnerBalanceDataDto balance_data = this.surrogate.getBalance_data();
        PartnerBalanceData proto = balance_data != null ? balance_data.toProto() : null;
        Boolean success = this.surrogate.getSuccess();
        MigrationAuthedErrorCodeDto error_code = this.surrogate.getError_code();
        return new ProcessMigrationAuthedResponse(proto, success, error_code != null ? (MigrationAuthedErrorCode) error_code.toProto() : null, this.surrogate.getError_message(), this.surrogate.getError_details(), this.surrogate.getError_deeplink(), this.surrogate.getMigration_status(), this.surrogate.getMigration_id(), null, 256, null);
    }

    public String toString() {
        return "[ProcessMigrationAuthedResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ProcessMigrationAuthedResponseDto) && Intrinsics.areEqual(((ProcessMigrationAuthedResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: ProcessMigrationAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b6\u0010)\u001a\u0004\b5\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b8\u0010)\u001a\u0004\b7\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b:\u0010)\u001a\u0004\b9\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b<\u0010)\u001a\u0004\b;\u0010\u001f¨\u0006?"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;", "", "Lcrypto_portkey/service/v1/PartnerBalanceDataDto;", "balance_data", "", "success", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", ErrorResponse.ERROR_CODE, "", "error_message", "error_details", "error_deeplink", "migration_status", "migration_id", "<init>", "(Lcrypto_portkey/service/v1/PartnerBalanceDataDto;Ljava/lang/Boolean;Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_portkey/service/v1/PartnerBalanceDataDto;Ljava/lang/Boolean;Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_portkey_service_v1_externalRelease", "(Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_portkey/service/v1/PartnerBalanceDataDto;", "getBalance_data", "()Lcrypto_portkey/service/v1/PartnerBalanceDataDto;", "getBalance_data$annotations", "()V", "Ljava/lang/Boolean;", "getSuccess", "()Ljava/lang/Boolean;", "getSuccess$annotations", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "getError_code", "()Lcrypto_portkey/service/v1/MigrationAuthedErrorCodeDto;", "getError_code$annotations", "Ljava/lang/String;", "getError_message", "getError_message$annotations", "getError_details", "getError_details$annotations", "getError_deeplink", "getError_deeplink$annotations", "getMigration_status", "getMigration_status$annotations", "getMigration_id", "getMigration_id$annotations", "Companion", "$serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PartnerBalanceDataDto balance_data;
        private final MigrationAuthedErrorCodeDto error_code;
        private final String error_deeplink;
        private final String error_details;
        private final String error_message;
        private final String migration_id;
        private final String migration_status;
        private final Boolean success;

        public Surrogate() {
            this((PartnerBalanceDataDto) null, (Boolean) null, (MigrationAuthedErrorCodeDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.balance_data, surrogate.balance_data) && Intrinsics.areEqual(this.success, surrogate.success) && this.error_code == surrogate.error_code && Intrinsics.areEqual(this.error_message, surrogate.error_message) && Intrinsics.areEqual(this.error_details, surrogate.error_details) && Intrinsics.areEqual(this.error_deeplink, surrogate.error_deeplink) && Intrinsics.areEqual(this.migration_status, surrogate.migration_status) && Intrinsics.areEqual(this.migration_id, surrogate.migration_id);
        }

        public int hashCode() {
            PartnerBalanceDataDto partnerBalanceDataDto = this.balance_data;
            int iHashCode = (partnerBalanceDataDto == null ? 0 : partnerBalanceDataDto.hashCode()) * 31;
            Boolean bool = this.success;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto = this.error_code;
            int iHashCode3 = (iHashCode2 + (migrationAuthedErrorCodeDto == null ? 0 : migrationAuthedErrorCodeDto.hashCode())) * 31;
            String str = this.error_message;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error_details;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.error_deeplink;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.migration_status;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.migration_id;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(balance_data=" + this.balance_data + ", success=" + this.success + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ", error_details=" + this.error_details + ", error_deeplink=" + this.error_deeplink + ", migration_status=" + this.migration_status + ", migration_id=" + this.migration_id + ")";
        }

        /* compiled from: ProcessMigrationAuthedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ProcessMigrationAuthedResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PartnerBalanceDataDto partnerBalanceDataDto, Boolean bool, MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.balance_data = null;
            } else {
                this.balance_data = partnerBalanceDataDto;
            }
            if ((i & 2) == 0) {
                this.success = null;
            } else {
                this.success = bool;
            }
            if ((i & 4) == 0) {
                this.error_code = null;
            } else {
                this.error_code = migrationAuthedErrorCodeDto;
            }
            if ((i & 8) == 0) {
                this.error_message = null;
            } else {
                this.error_message = str;
            }
            if ((i & 16) == 0) {
                this.error_details = null;
            } else {
                this.error_details = str2;
            }
            if ((i & 32) == 0) {
                this.error_deeplink = null;
            } else {
                this.error_deeplink = str3;
            }
            if ((i & 64) == 0) {
                this.migration_status = null;
            } else {
                this.migration_status = str4;
            }
            if ((i & 128) == 0) {
                this.migration_id = null;
            } else {
                this.migration_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_portkey_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PartnerBalanceDataDto partnerBalanceDataDto = self.balance_data;
            if (partnerBalanceDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PartnerBalanceDataDto.Serializer.INSTANCE, partnerBalanceDataDto);
            }
            Boolean bool = self.success;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, bool);
            }
            MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto = self.error_code;
            if (migrationAuthedErrorCodeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MigrationAuthedErrorCodeDto.Serializer.INSTANCE, migrationAuthedErrorCodeDto);
            }
            String str = self.error_message;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            String str2 = self.error_details;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.error_deeplink;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.migration_status;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.migration_id;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str5);
            }
        }

        public Surrogate(PartnerBalanceDataDto partnerBalanceDataDto, Boolean bool, MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto, String str, String str2, String str3, String str4, String str5) {
            this.balance_data = partnerBalanceDataDto;
            this.success = bool;
            this.error_code = migrationAuthedErrorCodeDto;
            this.error_message = str;
            this.error_details = str2;
            this.error_deeplink = str3;
            this.migration_status = str4;
            this.migration_id = str5;
        }

        public /* synthetic */ Surrogate(PartnerBalanceDataDto partnerBalanceDataDto, Boolean bool, MigrationAuthedErrorCodeDto migrationAuthedErrorCodeDto, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : partnerBalanceDataDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : migrationAuthedErrorCodeDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
        }

        public final PartnerBalanceDataDto getBalance_data() {
            return this.balance_data;
        }

        public final Boolean getSuccess() {
            return this.success;
        }

        public final MigrationAuthedErrorCodeDto getError_code() {
            return this.error_code;
        }

        public final String getError_message() {
            return this.error_message;
        }

        public final String getError_details() {
            return this.error_details;
        }

        public final String getError_deeplink() {
            return this.error_deeplink;
        }

        public final String getMigration_status() {
            return this.migration_status;
        }

        public final String getMigration_id() {
            return this.migration_id;
        }
    }

    /* compiled from: ProcessMigrationAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ProcessMigrationAuthedResponseDto, ProcessMigrationAuthedResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProcessMigrationAuthedResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProcessMigrationAuthedResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProcessMigrationAuthedResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) ProcessMigrationAuthedResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ProcessMigrationAuthedResponse> getProtoAdapter() {
            return ProcessMigrationAuthedResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProcessMigrationAuthedResponseDto getZeroValue() {
            return ProcessMigrationAuthedResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProcessMigrationAuthedResponseDto fromProto(ProcessMigrationAuthedResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PartnerBalanceData balance_data = proto.getBalance_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PartnerBalanceDataDto partnerBalanceDataDtoFromProto = balance_data != null ? PartnerBalanceDataDto.INSTANCE.fromProto(balance_data) : null;
            Boolean success = proto.getSuccess();
            MigrationAuthedErrorCode error_code = proto.getError_code();
            return new ProcessMigrationAuthedResponseDto(new Surrogate(partnerBalanceDataDtoFromProto, success, error_code != null ? MigrationAuthedErrorCodeDto.INSTANCE.fromProto(error_code) : null, proto.getError_message(), proto.getError_details(), proto.getError_deeplink(), proto.getMigration_status(), proto.getMigration_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.ProcessMigrationAuthedResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessMigrationAuthedResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ProcessMigrationAuthedResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ProcessMigrationAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ProcessMigrationAuthedResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_portkey.service.v1.ProcessMigrationAuthedResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ProcessMigrationAuthedResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ProcessMigrationAuthedResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ProcessMigrationAuthedResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ProcessMigrationAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "crypto_portkey.service.v1.ProcessMigrationAuthedResponseDto";
        }
    }
}
