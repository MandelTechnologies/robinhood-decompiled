package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRoleDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiarySignedAgreementDto;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequestDto;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: CreateBeneficiaryRequestDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;)V", "", "account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "beneficiary_info", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreementDto;", "agreements_to_sign", "additional_account_numbers", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "beneficiary_role", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class CreateBeneficiaryRequestDto implements Dto3<CreateBeneficiaryRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateBeneficiaryRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateBeneficiaryRequestDto, CreateBeneficiaryRequest>> binaryBase64Serializer$delegate;
    private static final CreateBeneficiaryRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateBeneficiaryRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateBeneficiaryRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreateBeneficiaryRequestDto(java.lang.String r2, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoDto r3, java.util.List r4, java.util.List r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRoleDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L14
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L14:
            r8 = r7 & 8
            if (r8 == 0) goto L1c
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L1c:
            r7 = r7 & 16
            if (r7 == 0) goto L27
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2d
        L27:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2d:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequestDto.<init>(java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto, java.util.List, java.util.List, bonfire.proto.idl.beneficiaries.v1.BeneficiaryRoleDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateBeneficiaryRequestDto(String account_number, BeneficiaryInfoDto beneficiaryInfoDto, List<BeneficiarySignedAgreementDto> agreements_to_sign, List<String> additional_account_numbers, BeneficiaryRoleDto beneficiaryRoleDto) {
        this(new Surrogate(account_number, beneficiaryInfoDto, agreements_to_sign, additional_account_numbers, beneficiaryRoleDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
        Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateBeneficiaryRequest toProto() {
        String account_number = this.surrogate.getAccount_number();
        BeneficiaryInfoDto beneficiary_info = this.surrogate.getBeneficiary_info();
        BeneficiaryInfo proto = beneficiary_info != null ? beneficiary_info.toProto() : null;
        List<BeneficiarySignedAgreementDto> agreements_to_sign = this.surrogate.getAgreements_to_sign();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreements_to_sign, 10));
        Iterator<T> it = agreements_to_sign.iterator();
        while (it.hasNext()) {
            arrayList.add(((BeneficiarySignedAgreementDto) it.next()).toProto());
        }
        List<String> additional_account_numbers = this.surrogate.getAdditional_account_numbers();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_account_numbers, 10));
        Iterator<T> it2 = additional_account_numbers.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        BeneficiaryRoleDto beneficiary_role = this.surrogate.getBeneficiary_role();
        return new CreateBeneficiaryRequest(account_number, proto, arrayList, arrayList2, beneficiary_role != null ? (BeneficiaryRole) beneficiary_role.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[CreateBeneficiaryRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateBeneficiaryRequestDto) && Intrinsics.areEqual(((CreateBeneficiaryRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateBeneficiaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010.R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010'\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;", "", "", "account_number", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "beneficiary_info", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreementDto;", "agreements_to_sign", "additional_account_numbers", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "beneficiary_role", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "getBeneficiary_info", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "getBeneficiary_info$annotations", "Ljava/util/List;", "getAgreements_to_sign", "()Ljava/util/List;", "getAgreements_to_sign$annotations", "getAdditional_account_numbers", "getAdditional_account_numbers$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "getBeneficiary_role", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "getBeneficiary_role$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final List<String> additional_account_numbers;
        private final List<BeneficiarySignedAgreementDto> agreements_to_sign;
        private final BeneficiaryInfoDto beneficiary_info;
        private final BeneficiaryRoleDto beneficiary_role;

        public Surrogate() {
            this((String) null, (BeneficiaryInfoDto) null, (List) null, (List) null, (BeneficiaryRoleDto) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(BeneficiarySignedAgreementDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.beneficiary_info, surrogate.beneficiary_info) && Intrinsics.areEqual(this.agreements_to_sign, surrogate.agreements_to_sign) && Intrinsics.areEqual(this.additional_account_numbers, surrogate.additional_account_numbers) && this.beneficiary_role == surrogate.beneficiary_role;
        }

        public int hashCode() {
            int iHashCode = this.account_number.hashCode() * 31;
            BeneficiaryInfoDto beneficiaryInfoDto = this.beneficiary_info;
            int iHashCode2 = (((((iHashCode + (beneficiaryInfoDto == null ? 0 : beneficiaryInfoDto.hashCode())) * 31) + this.agreements_to_sign.hashCode()) * 31) + this.additional_account_numbers.hashCode()) * 31;
            BeneficiaryRoleDto beneficiaryRoleDto = this.beneficiary_role;
            return iHashCode2 + (beneficiaryRoleDto != null ? beneficiaryRoleDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", beneficiary_info=" + this.beneficiary_info + ", agreements_to_sign=" + this.agreements_to_sign + ", additional_account_numbers=" + this.additional_account_numbers + ", beneficiary_role=" + this.beneficiary_role + ")";
        }

        /* compiled from: CreateBeneficiaryRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateBeneficiaryRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateBeneficiaryRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateBeneficiaryRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, BeneficiaryInfoDto beneficiaryInfoDto, List list, List list2, BeneficiaryRoleDto beneficiaryRoleDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.beneficiary_info = null;
            } else {
                this.beneficiary_info = beneficiaryInfoDto;
            }
            if ((i & 4) == 0) {
                this.agreements_to_sign = CollectionsKt.emptyList();
            } else {
                this.agreements_to_sign = list;
            }
            if ((i & 8) == 0) {
                this.additional_account_numbers = CollectionsKt.emptyList();
            } else {
                this.additional_account_numbers = list2;
            }
            if ((i & 16) == 0) {
                this.beneficiary_role = null;
            } else {
                this.beneficiary_role = beneficiaryRoleDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            BeneficiaryInfoDto beneficiaryInfoDto = self.beneficiary_info;
            if (beneficiaryInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BeneficiaryInfoDto.Serializer.INSTANCE, beneficiaryInfoDto);
            }
            if (!Intrinsics.areEqual(self.agreements_to_sign, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.agreements_to_sign);
            }
            if (!Intrinsics.areEqual(self.additional_account_numbers, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.additional_account_numbers);
            }
            BeneficiaryRoleDto beneficiaryRoleDto = self.beneficiary_role;
            if (beneficiaryRoleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BeneficiaryRoleDto.Serializer.INSTANCE, beneficiaryRoleDto);
            }
        }

        public Surrogate(String account_number, BeneficiaryInfoDto beneficiaryInfoDto, List<BeneficiarySignedAgreementDto> agreements_to_sign, List<String> additional_account_numbers, BeneficiaryRoleDto beneficiaryRoleDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(agreements_to_sign, "agreements_to_sign");
            Intrinsics.checkNotNullParameter(additional_account_numbers, "additional_account_numbers");
            this.account_number = account_number;
            this.beneficiary_info = beneficiaryInfoDto;
            this.agreements_to_sign = agreements_to_sign;
            this.additional_account_numbers = additional_account_numbers;
            this.beneficiary_role = beneficiaryRoleDto;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoDto r3, java.util.List r4, java.util.List r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRoleDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L14
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L14:
                r8 = r7 & 8
                if (r8 == 0) goto L1c
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L1c:
                r7 = r7 & 16
                if (r7 == 0) goto L27
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2d
            L27:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2d:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequestDto.Surrogate.<init>(java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoDto, java.util.List, java.util.List, bonfire.proto.idl.beneficiaries.v1.BeneficiaryRoleDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final BeneficiaryInfoDto getBeneficiary_info() {
            return this.beneficiary_info;
        }

        public final List<BeneficiarySignedAgreementDto> getAgreements_to_sign() {
            return this.agreements_to_sign;
        }

        public final List<String> getAdditional_account_numbers() {
            return this.additional_account_numbers;
        }

        public final BeneficiaryRoleDto getBeneficiary_role() {
            return this.beneficiary_role;
        }
    }

    /* compiled from: CreateBeneficiaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateBeneficiaryRequestDto, CreateBeneficiaryRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateBeneficiaryRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateBeneficiaryRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateBeneficiaryRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateBeneficiaryRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateBeneficiaryRequest> getProtoAdapter() {
            return CreateBeneficiaryRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateBeneficiaryRequestDto getZeroValue() {
            return CreateBeneficiaryRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateBeneficiaryRequestDto fromProto(CreateBeneficiaryRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            BeneficiaryInfo beneficiary_info = proto.getBeneficiary_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BeneficiaryInfoDto beneficiaryInfoDtoFromProto = beneficiary_info != null ? BeneficiaryInfoDto.INSTANCE.fromProto(beneficiary_info) : null;
            List<BeneficiarySignedAgreement> agreements_to_sign = proto.getAgreements_to_sign();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreements_to_sign, 10));
            Iterator<T> it = agreements_to_sign.iterator();
            while (it.hasNext()) {
                arrayList.add(BeneficiarySignedAgreementDto.INSTANCE.fromProto((BeneficiarySignedAgreement) it.next()));
            }
            List<String> additional_account_numbers = proto.getAdditional_account_numbers();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_account_numbers, 10));
            Iterator<T> it2 = additional_account_numbers.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            BeneficiaryRole beneficiary_role = proto.getBeneficiary_role();
            return new CreateBeneficiaryRequestDto(new Surrogate(account_number, beneficiaryInfoDtoFromProto, arrayList, arrayList2, beneficiary_role != null ? BeneficiaryRoleDto.INSTANCE.fromProto(beneficiary_role) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateBeneficiaryRequestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new CreateBeneficiaryRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateBeneficiaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateBeneficiaryRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateBeneficiaryRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateBeneficiaryRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateBeneficiaryRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateBeneficiaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.CreateBeneficiaryRequestDto";
        }
    }
}
