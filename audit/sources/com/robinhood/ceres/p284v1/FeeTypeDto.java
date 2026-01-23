package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FeeTypeInfoDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FeeTypeDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJ:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FeeType;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate;)V", "id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "created_at", "updated_at", "created_by_alias", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "getCreated_at", "getUpdated_at", "getCreated_by_alias", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FeeTypeDto implements Dto3<FeeType>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTypeDto, FeeType>> binaryBase64Serializer$delegate;
    private static final FeeTypeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeTypeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTypeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final FeeTypeInfoDto getFee_type_info() {
        return this.surrogate.getFee_type_info();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final String getCreated_by_alias() {
        return this.surrogate.getCreated_by_alias();
    }

    public /* synthetic */ FeeTypeDto(String str, FeeTypeInfoDto feeTypeInfoDto, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfoDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeTypeDto(String id, FeeTypeInfoDto feeTypeInfoDto, String created_at, String updated_at, String created_by_alias) {
        this(new Surrogate(id, feeTypeInfoDto, created_at, updated_at, created_by_alias));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
    }

    public static /* synthetic */ FeeTypeDto copy$default(FeeTypeDto feeTypeDto, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTypeDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            feeTypeInfoDto = feeTypeDto.surrogate.getFee_type_info();
        }
        if ((i & 4) != 0) {
            str2 = feeTypeDto.surrogate.getCreated_at();
        }
        if ((i & 8) != 0) {
            str3 = feeTypeDto.surrogate.getUpdated_at();
        }
        if ((i & 16) != 0) {
            str4 = feeTypeDto.surrogate.getCreated_by_alias();
        }
        String str5 = str4;
        String str6 = str2;
        return feeTypeDto.copy(str, feeTypeInfoDto, str6, str3, str5);
    }

    public final FeeTypeDto copy(String id, FeeTypeInfoDto fee_type_info, String created_at, String updated_at, String created_by_alias) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
        return new FeeTypeDto(new Surrogate(id, fee_type_info, created_at, updated_at, created_by_alias));
    }

    @Override // com.robinhood.idl.Dto
    public FeeType toProto() {
        String id = this.surrogate.getId();
        FeeTypeInfoDto fee_type_info = this.surrogate.getFee_type_info();
        return new FeeType(id, fee_type_info != null ? fee_type_info.toProto() : null, this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getCreated_by_alias(), null, 32, null);
    }

    public String toString() {
        return "[FeeTypeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeTypeDto) && Intrinsics.areEqual(((FeeTypeDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J=\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u00062"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate;", "", "id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "created_at", "updated_at", "created_by_alias", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getFee_type_info$annotations", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getCreated_by_alias$annotations", "getCreated_by_alias", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String created_at;
        private final String created_by_alias;
        private final FeeTypeInfoDto fee_type_info;
        private final String id;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (FeeTypeInfoDto) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                feeTypeInfoDto = surrogate.fee_type_info;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.created_at;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.updated_at;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.created_by_alias;
            }
            String str5 = str4;
            String str6 = str2;
            return surrogate.copy(str, feeTypeInfoDto, str6, str3, str5);
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("createdByAlias")
        @JsonAnnotations2(names = {"created_by_alias"})
        public static /* synthetic */ void getCreated_by_alias$annotations() {
        }

        @SerialName("feeTypeInfo")
        @JsonAnnotations2(names = {"fee_type_info"})
        public static /* synthetic */ void getFee_type_info$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final FeeTypeInfoDto getFee_type_info() {
            return this.fee_type_info;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCreated_by_alias() {
            return this.created_by_alias;
        }

        public final Surrogate copy(String id, FeeTypeInfoDto fee_type_info, String created_at, String updated_at, String created_by_alias) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
            return new Surrogate(id, fee_type_info, created_at, updated_at, created_by_alias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.fee_type_info, surrogate.fee_type_info) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.created_by_alias, surrogate.created_by_alias);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            FeeTypeInfoDto feeTypeInfoDto = this.fee_type_info;
            return ((((((iHashCode + (feeTypeInfoDto == null ? 0 : feeTypeInfoDto.hashCode())) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.created_by_alias.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", fee_type_info=" + this.fee_type_info + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", created_by_alias=" + this.created_by_alias + ")";
        }

        /* compiled from: FeeTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeTypeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.fee_type_info = null;
            } else {
                this.fee_type_info = feeTypeInfoDto;
            }
            if ((i & 4) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str2;
            }
            if ((i & 8) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str3;
            }
            if ((i & 16) == 0) {
                this.created_by_alias = "";
            } else {
                this.created_by_alias = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            FeeTypeInfoDto feeTypeInfoDto = self.fee_type_info;
            if (feeTypeInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, FeeTypeInfoDto.Serializer.INSTANCE, feeTypeInfoDto);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 2, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 3, self.updated_at);
            }
            if (Intrinsics.areEqual(self.created_by_alias, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.created_by_alias);
        }

        public Surrogate(String id, FeeTypeInfoDto feeTypeInfoDto, String created_at, String updated_at, String created_by_alias) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(created_by_alias, "created_by_alias");
            this.id = id;
            this.fee_type_info = feeTypeInfoDto;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by_alias = created_by_alias;
        }

        public /* synthetic */ Surrogate(String str, FeeTypeInfoDto feeTypeInfoDto, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfoDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final FeeTypeInfoDto getFee_type_info() {
            return this.fee_type_info;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final String getCreated_by_alias() {
            return this.created_by_alias;
        }
    }

    /* compiled from: FeeTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FeeTypeDto;", "Lcom/robinhood/ceres/v1/FeeType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FeeTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeTypeDto, FeeType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeType> getProtoAdapter() {
            return FeeType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeDto getZeroValue() {
            return FeeTypeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeDto fromProto(FeeType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            FeeTypeInfo fee_type_info = proto.getFee_type_info();
            return new FeeTypeDto(new Surrogate(id, fee_type_info != null ? FeeTypeInfoDto.INSTANCE.fromProto(fee_type_info) : null, proto.getCreated_at(), proto.getUpdated_at(), proto.getCreated_by_alias()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FeeTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeTypeDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTypeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FeeTypeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FeeType", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeTypeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FeeTypeDto";
        }
    }
}
