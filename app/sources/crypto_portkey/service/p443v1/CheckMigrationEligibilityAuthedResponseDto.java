package crypto_portkey.service.p443v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_portkey.service.p443v1.MigrationEligibilityStatusDto;
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

/* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponse;", "Landroid/os/Parcelable;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;)V", "Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "eligibility_status", "", "failure_reason", "partner_migration_code", "migration_id", "current_state", "(Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;", "getEligibility_status", "()Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "getFailure_reason", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class CheckMigrationEligibilityAuthedResponseDto implements Dto3<CheckMigrationEligibilityAuthedResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckMigrationEligibilityAuthedResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckMigrationEligibilityAuthedResponseDto, CheckMigrationEligibilityAuthedResponse>> binaryBase64Serializer$delegate;
    private static final CheckMigrationEligibilityAuthedResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckMigrationEligibilityAuthedResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckMigrationEligibilityAuthedResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MigrationEligibilityStatusDto getEligibility_status() {
        return this.surrogate.getEligibility_status();
    }

    public final String getFailure_reason() {
        return this.surrogate.getFailure_reason();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CheckMigrationEligibilityAuthedResponseDto(crypto_portkey.service.p443v1.MigrationEligibilityStatusDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            crypto_portkey.service.v1.MigrationEligibilityStatusDto$Companion r2 = crypto_portkey.service.p443v1.MigrationEligibilityStatusDto.INSTANCE
            crypto_portkey.service.v1.MigrationEligibilityStatusDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto L10
            r3 = r0
        L10:
            r8 = r7 & 4
            if (r8 == 0) goto L15
            r4 = r0
        L15:
            r8 = r7 & 8
            if (r8 == 0) goto L1a
            r5 = r0
        L1a:
            r7 = r7 & 16
            if (r7 == 0) goto L25
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2b
        L25:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2b:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_portkey.service.p443v1.CheckMigrationEligibilityAuthedResponseDto.<init>(crypto_portkey.service.v1.MigrationEligibilityStatusDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckMigrationEligibilityAuthedResponseDto(MigrationEligibilityStatusDto eligibility_status, String str, String str2, String str3, String str4) {
        this(new Surrogate(eligibility_status, str, str2, str3, str4));
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckMigrationEligibilityAuthedResponse toProto() {
        return new CheckMigrationEligibilityAuthedResponse((MigrationEligibilityStatus) this.surrogate.getEligibility_status().toProto(), this.surrogate.getFailure_reason(), this.surrogate.getPartner_migration_code(), this.surrogate.getMigration_id(), this.surrogate.getCurrent_state(), null, 32, null);
    }

    public String toString() {
        return "[CheckMigrationEligibilityAuthedResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckMigrationEligibilityAuthedResponseDto) && Intrinsics.areEqual(((CheckMigrationEligibilityAuthedResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;", "", "Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "eligibility_status", "", "failure_reason", "partner_migration_code", "migration_id", "current_state", "<init>", "(Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_portkey/service/v1/MigrationEligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_portkey_service_v1_externalRelease", "(Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "getEligibility_status", "()Lcrypto_portkey/service/v1/MigrationEligibilityStatusDto;", "getEligibility_status$annotations", "()V", "Ljava/lang/String;", "getFailure_reason", "getFailure_reason$annotations", "getPartner_migration_code", "getPartner_migration_code$annotations", "getMigration_id", "getMigration_id$annotations", "getCurrent_state", "getCurrent_state$annotations", "Companion", "$serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String current_state;
        private final MigrationEligibilityStatusDto eligibility_status;
        private final String failure_reason;
        private final String migration_id;
        private final String partner_migration_code;

        public Surrogate() {
            this((MigrationEligibilityStatusDto) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.eligibility_status == surrogate.eligibility_status && Intrinsics.areEqual(this.failure_reason, surrogate.failure_reason) && Intrinsics.areEqual(this.partner_migration_code, surrogate.partner_migration_code) && Intrinsics.areEqual(this.migration_id, surrogate.migration_id) && Intrinsics.areEqual(this.current_state, surrogate.current_state);
        }

        public int hashCode() {
            int iHashCode = this.eligibility_status.hashCode() * 31;
            String str = this.failure_reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.partner_migration_code;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.migration_id;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.current_state;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(eligibility_status=" + this.eligibility_status + ", failure_reason=" + this.failure_reason + ", partner_migration_code=" + this.partner_migration_code + ", migration_id=" + this.migration_id + ", current_state=" + this.current_state + ")";
        }

        /* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckMigrationEligibilityAuthedResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MigrationEligibilityStatusDto migrationEligibilityStatusDto, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.eligibility_status = (i & 1) == 0 ? MigrationEligibilityStatusDto.INSTANCE.getZeroValue() : migrationEligibilityStatusDto;
            if ((i & 2) == 0) {
                this.failure_reason = null;
            } else {
                this.failure_reason = str;
            }
            if ((i & 4) == 0) {
                this.partner_migration_code = null;
            } else {
                this.partner_migration_code = str2;
            }
            if ((i & 8) == 0) {
                this.migration_id = null;
            } else {
                this.migration_id = str3;
            }
            if ((i & 16) == 0) {
                this.current_state = null;
            } else {
                this.current_state = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_portkey_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.eligibility_status != MigrationEligibilityStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MigrationEligibilityStatusDto.Serializer.INSTANCE, self.eligibility_status);
            }
            String str = self.failure_reason;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            String str2 = self.partner_migration_code;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.migration_id;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.current_state;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str4);
            }
        }

        public Surrogate(MigrationEligibilityStatusDto eligibility_status, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
            this.eligibility_status = eligibility_status;
            this.failure_reason = str;
            this.partner_migration_code = str2;
            this.migration_id = str3;
            this.current_state = str4;
        }

        public final MigrationEligibilityStatusDto getEligibility_status() {
            return this.eligibility_status;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(crypto_portkey.service.p443v1.MigrationEligibilityStatusDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                crypto_portkey.service.v1.MigrationEligibilityStatusDto$Companion r2 = crypto_portkey.service.p443v1.MigrationEligibilityStatusDto.INSTANCE
                crypto_portkey.service.v1.MigrationEligibilityStatusDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto L10
                r3 = r0
            L10:
                r8 = r7 & 4
                if (r8 == 0) goto L15
                r4 = r0
            L15:
                r8 = r7 & 8
                if (r8 == 0) goto L1a
                r5 = r0
            L1a:
                r7 = r7 & 16
                if (r7 == 0) goto L25
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2b
            L25:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2b:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_portkey.service.p443v1.CheckMigrationEligibilityAuthedResponseDto.Surrogate.<init>(crypto_portkey.service.v1.MigrationEligibilityStatusDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getFailure_reason() {
            return this.failure_reason;
        }

        public final String getPartner_migration_code() {
            return this.partner_migration_code;
        }

        public final String getMigration_id() {
            return this.migration_id;
        }

        public final String getCurrent_state() {
            return this.current_state;
        }
    }

    /* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CheckMigrationEligibilityAuthedResponseDto, CheckMigrationEligibilityAuthedResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckMigrationEligibilityAuthedResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckMigrationEligibilityAuthedResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckMigrationEligibilityAuthedResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckMigrationEligibilityAuthedResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckMigrationEligibilityAuthedResponse> getProtoAdapter() {
            return CheckMigrationEligibilityAuthedResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckMigrationEligibilityAuthedResponseDto getZeroValue() {
            return CheckMigrationEligibilityAuthedResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckMigrationEligibilityAuthedResponseDto fromProto(CheckMigrationEligibilityAuthedResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CheckMigrationEligibilityAuthedResponseDto(new Surrogate(MigrationEligibilityStatusDto.INSTANCE.fromProto(proto.getEligibility_status()), proto.getFailure_reason(), proto.getPartner_migration_code(), proto.getMigration_id(), proto.getCurrent_state()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.CheckMigrationEligibilityAuthedResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckMigrationEligibilityAuthedResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckMigrationEligibilityAuthedResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckMigrationEligibilityAuthedResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_portkey.service.v1.CheckMigrationEligibilityAuthedResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckMigrationEligibilityAuthedResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckMigrationEligibilityAuthedResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckMigrationEligibilityAuthedResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckMigrationEligibilityAuthedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "crypto_portkey.service.v1.CheckMigrationEligibilityAuthedResponseDto";
        }
    }
}
