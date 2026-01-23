package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FeeDto;
import com.robinhood.ceres.p284v1.FeeTypeInfoDto;
import com.robinhood.ceres.p284v1.FeeTypeWithFeesDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FeeTypeWithFeesDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0006\u0010\u0010J6\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FeeTypeWithFees;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate;)V", "fee_type_id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "fee_schedule_id", "fees", "", "Lcom/robinhood/ceres/v1/FeeDto;", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/util/List;)V", "getFee_type_id", "()Ljava/lang/String;", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "getFee_schedule_id", "getFees", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class FeeTypeWithFeesDto implements Dto3<FeeTypeWithFees>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeTypeWithFeesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTypeWithFeesDto, FeeTypeWithFees>> binaryBase64Serializer$delegate;
    private static final FeeTypeWithFeesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeTypeWithFeesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTypeWithFeesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFee_type_id() {
        return this.surrogate.getFee_type_id();
    }

    public final FeeTypeInfoDto getFee_type_info() {
        return this.surrogate.getFee_type_info();
    }

    public final String getFee_schedule_id() {
        return this.surrogate.getFee_schedule_id();
    }

    public final List<FeeDto> getFees() {
        return this.surrogate.getFees();
    }

    public /* synthetic */ FeeTypeWithFeesDto(String str, FeeTypeInfoDto feeTypeInfoDto, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfoDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeTypeWithFeesDto(String fee_type_id, FeeTypeInfoDto feeTypeInfoDto, String fee_schedule_id, List<FeeDto> fees) {
        this(new Surrogate(fee_type_id, feeTypeInfoDto, fee_schedule_id, fees));
        Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
        Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
        Intrinsics.checkNotNullParameter(fees, "fees");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeeTypeWithFeesDto copy$default(FeeTypeWithFeesDto feeTypeWithFeesDto, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTypeWithFeesDto.surrogate.getFee_type_id();
        }
        if ((i & 2) != 0) {
            feeTypeInfoDto = feeTypeWithFeesDto.surrogate.getFee_type_info();
        }
        if ((i & 4) != 0) {
            str2 = feeTypeWithFeesDto.surrogate.getFee_schedule_id();
        }
        if ((i & 8) != 0) {
            list = feeTypeWithFeesDto.surrogate.getFees();
        }
        return feeTypeWithFeesDto.copy(str, feeTypeInfoDto, str2, list);
    }

    public final FeeTypeWithFeesDto copy(String fee_type_id, FeeTypeInfoDto fee_type_info, String fee_schedule_id, List<FeeDto> fees) {
        Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
        Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
        Intrinsics.checkNotNullParameter(fees, "fees");
        return new FeeTypeWithFeesDto(new Surrogate(fee_type_id, fee_type_info, fee_schedule_id, fees));
    }

    @Override // com.robinhood.idl.Dto
    public FeeTypeWithFees toProto() {
        String fee_type_id = this.surrogate.getFee_type_id();
        FeeTypeInfoDto fee_type_info = this.surrogate.getFee_type_info();
        FeeTypeInfo proto = fee_type_info != null ? fee_type_info.toProto() : null;
        String fee_schedule_id = this.surrogate.getFee_schedule_id();
        List<FeeDto> fees = this.surrogate.getFees();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fees, 10));
        Iterator<T> it = fees.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeeDto) it.next()).toProto());
        }
        return new FeeTypeWithFees(fee_type_id, proto, fee_schedule_id, arrayList, null, 16, null);
    }

    public String toString() {
        return "[FeeTypeWithFeesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeTypeWithFeesDto) && Intrinsics.areEqual(((FeeTypeWithFeesDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeTypeWithFeesDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate;", "", "fee_type_id", "", "fee_type_info", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "fee_schedule_id", "fees", "", "Lcom/robinhood/ceres/v1/FeeDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/FeeTypeInfoDto;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFee_type_id$annotations", "()V", "getFee_type_id", "()Ljava/lang/String;", "getFee_type_info$annotations", "getFee_type_info", "()Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "getFee_schedule_id$annotations", "getFee_schedule_id", "getFees$annotations", "getFees", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String fee_schedule_id;
        private final String fee_type_id;
        private final FeeTypeInfoDto fee_type_info;
        private final List<FeeDto> fees;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.FeeTypeWithFeesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTypeWithFeesDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (FeeTypeInfoDto) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FeeDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.fee_type_id;
            }
            if ((i & 2) != 0) {
                feeTypeInfoDto = surrogate.fee_type_info;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.fee_schedule_id;
            }
            if ((i & 8) != 0) {
                list = surrogate.fees;
            }
            return surrogate.copy(str, feeTypeInfoDto, str2, list);
        }

        @SerialName("feeScheduleId")
        @JsonAnnotations2(names = {"fee_schedule_id"})
        public static /* synthetic */ void getFee_schedule_id$annotations() {
        }

        @SerialName("feeTypeId")
        @JsonAnnotations2(names = {"fee_type_id"})
        public static /* synthetic */ void getFee_type_id$annotations() {
        }

        @SerialName("feeTypeInfo")
        @JsonAnnotations2(names = {"fee_type_info"})
        public static /* synthetic */ void getFee_type_info$annotations() {
        }

        @SerialName("fees")
        @JsonAnnotations2(names = {"fees"})
        public static /* synthetic */ void getFees$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFee_type_id() {
            return this.fee_type_id;
        }

        /* renamed from: component2, reason: from getter */
        public final FeeTypeInfoDto getFee_type_info() {
            return this.fee_type_info;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFee_schedule_id() {
            return this.fee_schedule_id;
        }

        public final List<FeeDto> component4() {
            return this.fees;
        }

        public final Surrogate copy(String fee_type_id, FeeTypeInfoDto fee_type_info, String fee_schedule_id, List<FeeDto> fees) {
            Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
            Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
            Intrinsics.checkNotNullParameter(fees, "fees");
            return new Surrogate(fee_type_id, fee_type_info, fee_schedule_id, fees);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fee_type_id, surrogate.fee_type_id) && Intrinsics.areEqual(this.fee_type_info, surrogate.fee_type_info) && Intrinsics.areEqual(this.fee_schedule_id, surrogate.fee_schedule_id) && Intrinsics.areEqual(this.fees, surrogate.fees);
        }

        public int hashCode() {
            int iHashCode = this.fee_type_id.hashCode() * 31;
            FeeTypeInfoDto feeTypeInfoDto = this.fee_type_info;
            return ((((iHashCode + (feeTypeInfoDto == null ? 0 : feeTypeInfoDto.hashCode())) * 31) + this.fee_schedule_id.hashCode()) * 31) + this.fees.hashCode();
        }

        public String toString() {
            return "Surrogate(fee_type_id=" + this.fee_type_id + ", fee_type_info=" + this.fee_type_info + ", fee_schedule_id=" + this.fee_schedule_id + ", fees=" + this.fees + ")";
        }

        /* compiled from: FeeTypeWithFeesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeTypeWithFeesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, FeeTypeInfoDto feeTypeInfoDto, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fee_type_id = "";
            } else {
                this.fee_type_id = str;
            }
            if ((i & 2) == 0) {
                this.fee_type_info = null;
            } else {
                this.fee_type_info = feeTypeInfoDto;
            }
            if ((i & 4) == 0) {
                this.fee_schedule_id = "";
            } else {
                this.fee_schedule_id = str2;
            }
            if ((i & 8) == 0) {
                this.fees = CollectionsKt.emptyList();
            } else {
                this.fees = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.fee_type_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.fee_type_id);
            }
            FeeTypeInfoDto feeTypeInfoDto = self.fee_type_info;
            if (feeTypeInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, FeeTypeInfoDto.Serializer.INSTANCE, feeTypeInfoDto);
            }
            if (!Intrinsics.areEqual(self.fee_schedule_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.fee_schedule_id);
            }
            if (Intrinsics.areEqual(self.fees, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.fees);
        }

        public Surrogate(String fee_type_id, FeeTypeInfoDto feeTypeInfoDto, String fee_schedule_id, List<FeeDto> fees) {
            Intrinsics.checkNotNullParameter(fee_type_id, "fee_type_id");
            Intrinsics.checkNotNullParameter(fee_schedule_id, "fee_schedule_id");
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.fee_type_id = fee_type_id;
            this.fee_type_info = feeTypeInfoDto;
            this.fee_schedule_id = fee_schedule_id;
            this.fees = fees;
        }

        public /* synthetic */ Surrogate(String str, FeeTypeInfoDto feeTypeInfoDto, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : feeTypeInfoDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getFee_type_id() {
            return this.fee_type_id;
        }

        public final FeeTypeInfoDto getFee_type_info() {
            return this.fee_type_info;
        }

        public final String getFee_schedule_id() {
            return this.fee_schedule_id;
        }

        public final List<FeeDto> getFees() {
            return this.fees;
        }
    }

    /* compiled from: FeeTypeWithFeesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto;", "Lcom/robinhood/ceres/v1/FeeTypeWithFees;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeTypeWithFeesDto, FeeTypeWithFees> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeTypeWithFeesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeWithFeesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeWithFeesDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTypeWithFeesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeTypeWithFees> getProtoAdapter() {
            return FeeTypeWithFees.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeWithFeesDto getZeroValue() {
            return FeeTypeWithFeesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeWithFeesDto fromProto(FeeTypeWithFees proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String fee_type_id = proto.getFee_type_id();
            FeeTypeInfo fee_type_info = proto.getFee_type_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FeeTypeInfoDto feeTypeInfoDtoFromProto = fee_type_info != null ? FeeTypeInfoDto.INSTANCE.fromProto(fee_type_info) : null;
            String fee_schedule_id = proto.getFee_schedule_id();
            List<Fee> fees = proto.getFees();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fees, 10));
            Iterator<T> it = fees.iterator();
            while (it.hasNext()) {
                arrayList.add(FeeDto.INSTANCE.fromProto((Fee) it.next()));
            }
            return new FeeTypeWithFeesDto(new Surrogate(fee_type_id, feeTypeInfoDtoFromProto, fee_schedule_id, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FeeTypeWithFeesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTypeWithFeesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FeeTypeWithFeesDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTypeWithFeesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTypeWithFeesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FeeTypeWithFees", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTypeWithFeesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeTypeWithFeesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeTypeWithFeesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeTypeWithFeesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeWithFeesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FeeTypeWithFeesDto";
        }
    }
}
