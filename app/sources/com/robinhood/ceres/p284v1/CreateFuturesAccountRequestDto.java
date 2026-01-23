package com.robinhood.ceres.p284v1;

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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CreateFuturesAccountRequestDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate;)V", "user_uuid", "", "rhs_account_number", "allow_swaps_only_account_creation", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getUser_uuid", "()Ljava/lang/String;", "getRhs_account_number", "getAllow_swaps_only_account_creation", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CreateFuturesAccountRequestDto implements Dto3<CreateFuturesAccountRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateFuturesAccountRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateFuturesAccountRequestDto, CreateFuturesAccountRequest>> binaryBase64Serializer$delegate;
    private static final CreateFuturesAccountRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateFuturesAccountRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateFuturesAccountRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final boolean getAllow_swaps_only_account_creation() {
        return this.surrogate.getAllow_swaps_only_account_creation();
    }

    public /* synthetic */ CreateFuturesAccountRequestDto(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateFuturesAccountRequestDto(String user_uuid, String rhs_account_number, boolean z) {
        this(new Surrogate(user_uuid, rhs_account_number, z));
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
    }

    public static /* synthetic */ CreateFuturesAccountRequestDto copy$default(CreateFuturesAccountRequestDto createFuturesAccountRequestDto, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFuturesAccountRequestDto.surrogate.getUser_uuid();
        }
        if ((i & 2) != 0) {
            str2 = createFuturesAccountRequestDto.surrogate.getRhs_account_number();
        }
        if ((i & 4) != 0) {
            z = createFuturesAccountRequestDto.surrogate.getAllow_swaps_only_account_creation();
        }
        return createFuturesAccountRequestDto.copy(str, str2, z);
    }

    public final CreateFuturesAccountRequestDto copy(String user_uuid, String rhs_account_number, boolean allow_swaps_only_account_creation) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        return new CreateFuturesAccountRequestDto(new Surrogate(user_uuid, rhs_account_number, allow_swaps_only_account_creation));
    }

    @Override // com.robinhood.idl.Dto
    public CreateFuturesAccountRequest toProto() {
        return new CreateFuturesAccountRequest(this.surrogate.getUser_uuid(), this.surrogate.getRhs_account_number(), this.surrogate.getAllow_swaps_only_account_creation(), null, 8, null);
    }

    public String toString() {
        return "[CreateFuturesAccountRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateFuturesAccountRequestDto) && Intrinsics.areEqual(((CreateFuturesAccountRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateFuturesAccountRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate;", "", "user_uuid", "", "rhs_account_number", "allow_swaps_only_account_creation", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_uuid$annotations", "()V", "getUser_uuid", "()Ljava/lang/String;", "getRhs_account_number$annotations", "getRhs_account_number", "getAllow_swaps_only_account_creation$annotations", "getAllow_swaps_only_account_creation", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean allow_swaps_only_account_creation;
        private final String rhs_account_number;
        private final String user_uuid;

        public Surrogate() {
            this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.user_uuid;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.rhs_account_number;
            }
            if ((i & 4) != 0) {
                z = surrogate.allow_swaps_only_account_creation;
            }
            return surrogate.copy(str, str2, z);
        }

        @SerialName("allowSwapsOnlyAccountCreation")
        @JsonAnnotations2(names = {"allow_swaps_only_account_creation"})
        public static /* synthetic */ void getAllow_swaps_only_account_creation$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAllow_swaps_only_account_creation() {
            return this.allow_swaps_only_account_creation;
        }

        public final Surrogate copy(String user_uuid, String rhs_account_number, boolean allow_swaps_only_account_creation) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            return new Surrogate(user_uuid, rhs_account_number, allow_swaps_only_account_creation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.allow_swaps_only_account_creation == surrogate.allow_swaps_only_account_creation;
        }

        public int hashCode() {
            return (((this.user_uuid.hashCode() * 31) + this.rhs_account_number.hashCode()) * 31) + Boolean.hashCode(this.allow_swaps_only_account_creation);
        }

        public String toString() {
            return "Surrogate(user_uuid=" + this.user_uuid + ", rhs_account_number=" + this.rhs_account_number + ", allow_swaps_only_account_creation=" + this.allow_swaps_only_account_creation + ")";
        }

        /* compiled from: CreateFuturesAccountRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateFuturesAccountRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str;
            }
            if ((i & 2) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str2;
            }
            if ((i & 4) == 0) {
                this.allow_swaps_only_account_creation = false;
            } else {
                this.allow_swaps_only_account_creation = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_uuid);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.rhs_account_number);
            }
            boolean z = self.allow_swaps_only_account_creation;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
        }

        public Surrogate(String user_uuid, String rhs_account_number, boolean z) {
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            this.user_uuid = user_uuid;
            this.rhs_account_number = rhs_account_number;
            this.allow_swaps_only_account_creation = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final boolean getAllow_swaps_only_account_creation() {
            return this.allow_swaps_only_account_creation;
        }
    }

    /* compiled from: CreateFuturesAccountRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CreateFuturesAccountRequestDto, CreateFuturesAccountRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateFuturesAccountRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesAccountRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesAccountRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateFuturesAccountRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateFuturesAccountRequest> getProtoAdapter() {
            return CreateFuturesAccountRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesAccountRequestDto getZeroValue() {
            return CreateFuturesAccountRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesAccountRequestDto fromProto(CreateFuturesAccountRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CreateFuturesAccountRequestDto(new Surrogate(proto.getUser_uuid(), proto.getRhs_account_number(), proto.getAllow_swaps_only_account_creation()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CreateFuturesAccountRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateFuturesAccountRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateFuturesAccountRequestDto(null, null, false, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateFuturesAccountRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateFuturesAccountRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CreateFuturesAccountRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateFuturesAccountRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateFuturesAccountRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateFuturesAccountRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateFuturesAccountRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CreateFuturesAccountRequestDto";
        }
    }
}
