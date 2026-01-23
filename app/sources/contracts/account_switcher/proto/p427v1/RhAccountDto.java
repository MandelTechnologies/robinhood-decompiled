package contracts.account_switcher.proto.p427v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: RhAccountDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/account_switcher/proto/v1/RhAccount;", "Landroid/os/Parcelable;", "Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;)V", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "", "enabled", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "nickname", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZLj$/time/Instant;Ljava/lang/String;)V", "toProto", "()Lcontracts/account_switcher/proto/v1/RhAccount;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class RhAccountDto implements Dto3<RhAccount>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RhAccountDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RhAccountDto, RhAccount>> binaryBase64Serializer$delegate;
    private static final RhAccountDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RhAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RhAccountDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RhAccountDto(java.lang.String r2, rosetta.account.BrokerageAccountTypeDto r3, rosetta.account.ManagementTypeDto r4, boolean r5, p479j$.time.Instant r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            rosetta.account.BrokerageAccountTypeDto$Companion r3 = rosetta.account.BrokerageAccountTypeDto.INSTANCE
            rosetta.account.BrokerageAccountTypeDto r3 = r3.getZeroValue()
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            rosetta.account.ManagementTypeDto$Companion r4 = rosetta.account.ManagementTypeDto.INSTANCE
            rosetta.account.ManagementTypeDto r4 = r4.getZeroValue()
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L1f
            r5 = 0
        L1f:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L25
            r6 = r0
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: contracts.account_switcher.proto.p427v1.RhAccountDto.<init>(java.lang.String, rosetta.account.BrokerageAccountTypeDto, rosetta.account.ManagementTypeDto, boolean, j$.time.Instant, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RhAccountDto(String account_number, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, boolean z, Instant instant, String str) {
        this(new Surrogate(account_number, brokerage_account_type, management_type, z, instant, str));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RhAccount toProto() {
        return new RhAccount(this.surrogate.getAccount_number(), (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getEnabled(), this.surrogate.getCreated_at(), this.surrogate.getNickname(), null, 64, null);
    }

    public String toString() {
        return "[RhAccountDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RhAccountDto) && Intrinsics.areEqual(((RhAccountDto) other).surrogate, this.surrogate);
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
    /* compiled from: RhAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012BU\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010(\u0012\u0004\b=\u0010+\u001a\u0004\b<\u0010\"¨\u0006@"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;", "", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "", "enabled", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "nickname", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZLj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;ZLj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_account_switcher_proto_v1_externalRelease", "(Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "Z", "getEnabled", "()Z", "getEnabled$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getNickname", "getNickname$annotations", "Companion", "$serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final Instant created_at;
        private final boolean enabled;
        private final ManagementTypeDto management_type;
        private final String nickname;

        public Surrogate() {
            this((String) null, (BrokerageAccountTypeDto) null, (ManagementTypeDto) null, false, (Instant) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && this.enabled == surrogate.enabled && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.nickname, surrogate.nickname);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_number.hashCode() * 31) + this.brokerage_account_type.hashCode()) * 31) + this.management_type.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            String str = this.nickname;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", enabled=" + this.enabled + ", created_at=" + this.created_at + ", nickname=" + this.nickname + ")";
        }

        /* compiled from: RhAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RhAccountDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, boolean z, Instant instant, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
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
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            if ((i & 16) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 32) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_account_switcher_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            boolean z = self.enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            String str = self.nickname;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String account_number, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, boolean z, Instant instant, String str) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            this.account_number = account_number;
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.enabled = z;
            this.created_at = instant;
            this.nickname = str;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, rosetta.account.BrokerageAccountTypeDto r3, rosetta.account.ManagementTypeDto r4, boolean r5, p479j$.time.Instant r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                rosetta.account.BrokerageAccountTypeDto$Companion r3 = rosetta.account.BrokerageAccountTypeDto.INSTANCE
                rosetta.account.BrokerageAccountTypeDto r3 = r3.getZeroValue()
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L1a
                rosetta.account.ManagementTypeDto$Companion r4 = rosetta.account.ManagementTypeDto.INSTANCE
                rosetta.account.ManagementTypeDto r4 = r4.getZeroValue()
            L1a:
                r9 = r8 & 8
                if (r9 == 0) goto L1f
                r5 = 0
            L1f:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L25
                r6 = r0
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: contracts.account_switcher.proto.p427v1.RhAccountDto.Surrogate.<init>(java.lang.String, rosetta.account.BrokerageAccountTypeDto, rosetta.account.ManagementTypeDto, boolean, j$.time.Instant, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final String getNickname() {
            return this.nickname;
        }
    }

    /* compiled from: RhAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/account_switcher/proto/v1/RhAccountDto;", "Lcontracts/account_switcher/proto/v1/RhAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/account_switcher/proto/v1/RhAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RhAccountDto, RhAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RhAccountDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhAccountDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhAccountDto> getBinaryBase64Serializer() {
            return (KSerializer) RhAccountDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RhAccount> getProtoAdapter() {
            return RhAccount.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhAccountDto getZeroValue() {
            return RhAccountDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhAccountDto fromProto(RhAccount proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RhAccountDto(new Surrogate(proto.getAccount_number(), BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type()), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getEnabled(), proto.getCreated_at(), proto.getNickname()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.account_switcher.proto.v1.RhAccountDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhAccountDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RhAccountDto(null, null, null, false, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RhAccountDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/account_switcher/proto/v1/RhAccountDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/account_switcher/proto/v1/RhAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RhAccountDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.account_switcher.proto.v1.RhAccount", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RhAccountDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RhAccountDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RhAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RhAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/RhAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "contracts.account_switcher.proto.v1.RhAccountDto";
        }
    }
}
