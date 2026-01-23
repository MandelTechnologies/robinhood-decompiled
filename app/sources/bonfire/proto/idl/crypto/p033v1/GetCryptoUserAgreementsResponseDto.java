package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponse;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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

/* compiled from: GetCryptoUserAgreementsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;)V", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "crypto_agreements", "", "sign_agreements_individually", "(Ljava/util/List;Z)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;", "getCrypto_agreements", "()Ljava/util/List;", "getSign_agreements_individually", "()Z", "Companion", "Surrogate", "CryptoAgreementDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetCryptoUserAgreementsResponseDto implements Dto3<GetCryptoUserAgreementsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoUserAgreementsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoUserAgreementsResponseDto, GetCryptoUserAgreementsResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoUserAgreementsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoUserAgreementsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoUserAgreementsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<CryptoAgreementDto> getCrypto_agreements() {
        return this.surrogate.getCrypto_agreements();
    }

    public final boolean getSign_agreements_individually() {
        return this.surrogate.getSign_agreements_individually();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoUserAgreementsResponseDto(List<CryptoAgreementDto> crypto_agreements, boolean z) {
        this(new Surrogate(crypto_agreements, z));
        Intrinsics.checkNotNullParameter(crypto_agreements, "crypto_agreements");
    }

    public /* synthetic */ GetCryptoUserAgreementsResponseDto(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<CryptoAgreementDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list), (i & 2) != 0 ? false : z);
    }

    @Override // com.robinhood.idl.Dto
    public GetCryptoUserAgreementsResponse toProto() {
        List<CryptoAgreementDto> crypto_agreements = this.surrogate.getCrypto_agreements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_agreements, 10));
        Iterator<T> it = crypto_agreements.iterator();
        while (it.hasNext()) {
            arrayList.add(((CryptoAgreementDto) it.next()).toProto());
        }
        return new GetCryptoUserAgreementsResponse(arrayList, this.surrogate.getSign_agreements_individually(), null, 4, null);
    }

    public String toString() {
        return "[GetCryptoUserAgreementsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoUserAgreementsResponseDto) && Intrinsics.areEqual(((GetCryptoUserAgreementsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;", "", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "crypto_agreements", "", "sign_agreements_individually", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCrypto_agreements", "()Ljava/util/List;", "getCrypto_agreements$annotations", "()V", "Z", "getSign_agreements_individually", "()Z", "getSign_agreements_individually$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<CryptoAgreementDto> crypto_agreements;
        private final boolean sign_agreements_individually;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoUserAgreementsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CryptoAgreementDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.crypto_agreements, surrogate.crypto_agreements) && this.sign_agreements_individually == surrogate.sign_agreements_individually;
        }

        public int hashCode() {
            return (this.crypto_agreements.hashCode() * 31) + Boolean.hashCode(this.sign_agreements_individually);
        }

        public String toString() {
            return "Surrogate(crypto_agreements=" + this.crypto_agreements + ", sign_agreements_individually=" + this.sign_agreements_individually + ")";
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoUserAgreementsResponseDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.crypto_agreements = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.sign_agreements_individually = false;
            } else {
                this.sign_agreements_individually = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.crypto_agreements, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.crypto_agreements);
            }
            boolean z = self.sign_agreements_individually;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
        }

        public Surrogate(List<CryptoAgreementDto> crypto_agreements, boolean z) {
            Intrinsics.checkNotNullParameter(crypto_agreements, "crypto_agreements");
            this.crypto_agreements = crypto_agreements;
            this.sign_agreements_individually = z;
        }

        public final List<CryptoAgreementDto> getCrypto_agreements() {
            return this.crypto_agreements;
        }

        public /* synthetic */ Surrogate(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z);
        }

        public final boolean getSign_agreements_individually() {
            return this.sign_agreements_individually;
        }
    }

    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoUserAgreementsResponseDto, GetCryptoUserAgreementsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoUserAgreementsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoUserAgreementsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoUserAgreementsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoUserAgreementsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoUserAgreementsResponse> getProtoAdapter() {
            return GetCryptoUserAgreementsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoUserAgreementsResponseDto getZeroValue() {
            return GetCryptoUserAgreementsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoUserAgreementsResponseDto fromProto(GetCryptoUserAgreementsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<GetCryptoUserAgreementsResponse.CryptoAgreement> crypto_agreements = proto.getCrypto_agreements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_agreements, 10));
            Iterator<T> it = crypto_agreements.iterator();
            while (it.hasNext()) {
                arrayList.add(CryptoAgreementDto.INSTANCE.fromProto((GetCryptoUserAgreementsResponse.CryptoAgreement) it.next()));
            }
            return new GetCryptoUserAgreementsResponseDto(new Surrogate(arrayList, proto.getSign_agreements_individually()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoUserAgreementsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetCryptoUserAgreementsResponseDto(0 == true ? 1 : 0, false, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00070/12345B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010-¨\u00066"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;)V", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "signable_agreements", "", "title", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "subtitle_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "unscrolled_button", "scrolled_button", "(Ljava/util/List;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;", "getSignable_agreements", "()Ljava/util/List;", "getTitle", "getSubtitle_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "getUnscrolled_button", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "getScrolled_button", "Companion", "Surrogate", "SignableAgreementDto", "ButtonDto", "SubtitleContentDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoAgreementDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CryptoAgreementDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoAgreementDto, GetCryptoUserAgreementsResponse.CryptoAgreement>> binaryBase64Serializer$delegate;
        private static final CryptoAgreementDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CryptoAgreementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoAgreementDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final List<SignableAgreementDto> getSignable_agreements() {
            return this.surrogate.getSignable_agreements();
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final SubtitleContentDto getSubtitle_content() {
            return this.surrogate.getSubtitle_content();
        }

        public final ButtonDto getUnscrolled_button() {
            return this.surrogate.getUnscrolled_button();
        }

        public final ButtonDto getScrolled_button() {
            return this.surrogate.getScrolled_button();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CryptoAgreementDto(java.util.List r2, java.lang.String r3, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto r4, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto r5, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r8 = r7 & 2
                if (r8 == 0) goto Le
                java.lang.String r3 = ""
            Le:
                r8 = r7 & 4
                r0 = 0
                if (r8 == 0) goto L14
                r4 = r0
            L14:
                r8 = r7 & 8
                if (r8 == 0) goto L19
                r5 = r0
            L19:
                r7 = r7 & 16
                if (r7 == 0) goto L24
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2a
            L24:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2a:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.<init>(java.util.List, java.lang.String, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CryptoAgreementDto(List<SignableAgreementDto> signable_agreements, String title, SubtitleContentDto subtitleContentDto, ButtonDto buttonDto, ButtonDto buttonDto2) {
            this(new Surrogate(signable_agreements, title, subtitleContentDto, buttonDto, buttonDto2));
            Intrinsics.checkNotNullParameter(signable_agreements, "signable_agreements");
            Intrinsics.checkNotNullParameter(title, "title");
        }

        @Override // com.robinhood.idl.Dto
        public GetCryptoUserAgreementsResponse.CryptoAgreement toProto() {
            List<SignableAgreementDto> signable_agreements = this.surrogate.getSignable_agreements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signable_agreements, 10));
            Iterator<T> it = signable_agreements.iterator();
            while (it.hasNext()) {
                arrayList.add(((SignableAgreementDto) it.next()).toProto());
            }
            String title = this.surrogate.getTitle();
            SubtitleContentDto subtitle_content = this.surrogate.getSubtitle_content();
            GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent proto = subtitle_content != null ? subtitle_content.toProto() : null;
            ButtonDto unscrolled_button = this.surrogate.getUnscrolled_button();
            GetCryptoUserAgreementsResponse.CryptoAgreement.Button proto2 = unscrolled_button != null ? unscrolled_button.toProto() : null;
            ButtonDto scrolled_button = this.surrogate.getScrolled_button();
            return new GetCryptoUserAgreementsResponse.CryptoAgreement(arrayList, title, proto, proto2, scrolled_button != null ? scrolled_button.toProto() : null, null, 32, null);
        }

        public String toString() {
            return "[CryptoAgreementDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CryptoAgreementDto) && Intrinsics.areEqual(((CryptoAgreementDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b5\u0010(\u001a\u0004\b4\u00102¨\u00068"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;", "", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "signable_agreements", "", "title", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "subtitle_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "unscrolled_button", "scrolled_button", "<init>", "(Ljava/util/List;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSignable_agreements", "()Ljava/util/List;", "getSignable_agreements$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "getSubtitle_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "getSubtitle_content$annotations", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "getUnscrolled_button", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "getUnscrolled_button$annotations", "getScrolled_button", "getScrolled_button$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final ButtonDto scrolled_button;
            private final List<SignableAgreementDto> signable_agreements;
            private final SubtitleContentDto subtitle_content;
            private final String title;
            private final ButtonDto unscrolled_button;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null};

            public Surrogate() {
                this((List) null, (String) null, (SubtitleContentDto) null, (ButtonDto) null, (ButtonDto) null, 31, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(SignableAgreementDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.signable_agreements, surrogate.signable_agreements) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle_content, surrogate.subtitle_content) && Intrinsics.areEqual(this.unscrolled_button, surrogate.unscrolled_button) && Intrinsics.areEqual(this.scrolled_button, surrogate.scrolled_button);
            }

            public int hashCode() {
                int iHashCode = ((this.signable_agreements.hashCode() * 31) + this.title.hashCode()) * 31;
                SubtitleContentDto subtitleContentDto = this.subtitle_content;
                int iHashCode2 = (iHashCode + (subtitleContentDto == null ? 0 : subtitleContentDto.hashCode())) * 31;
                ButtonDto buttonDto = this.unscrolled_button;
                int iHashCode3 = (iHashCode2 + (buttonDto == null ? 0 : buttonDto.hashCode())) * 31;
                ButtonDto buttonDto2 = this.scrolled_button;
                return iHashCode3 + (buttonDto2 != null ? buttonDto2.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(signable_agreements=" + this.signable_agreements + ", title=" + this.title + ", subtitle_content=" + this.subtitle_content + ", unscrolled_button=" + this.unscrolled_button + ", scrolled_button=" + this.scrolled_button + ")";
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C4234xb3465b8d.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, List list, String str, SubtitleContentDto subtitleContentDto, ButtonDto buttonDto, ButtonDto buttonDto2, SerializationConstructorMarker serializationConstructorMarker) {
                this.signable_agreements = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
                if ((i & 2) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 4) == 0) {
                    this.subtitle_content = null;
                } else {
                    this.subtitle_content = subtitleContentDto;
                }
                if ((i & 8) == 0) {
                    this.unscrolled_button = null;
                } else {
                    this.unscrolled_button = buttonDto;
                }
                if ((i & 16) == 0) {
                    this.scrolled_button = null;
                } else {
                    this.scrolled_button = buttonDto2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.signable_agreements, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.signable_agreements);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 1, self.title);
                }
                SubtitleContentDto subtitleContentDto = self.subtitle_content;
                if (subtitleContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, SubtitleContentDto.Serializer.INSTANCE, subtitleContentDto);
                }
                ButtonDto buttonDto = self.unscrolled_button;
                if (buttonDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, ButtonDto.Serializer.INSTANCE, buttonDto);
                }
                ButtonDto buttonDto2 = self.scrolled_button;
                if (buttonDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, ButtonDto.Serializer.INSTANCE, buttonDto2);
                }
            }

            public Surrogate(List<SignableAgreementDto> signable_agreements, String title, SubtitleContentDto subtitleContentDto, ButtonDto buttonDto, ButtonDto buttonDto2) {
                Intrinsics.checkNotNullParameter(signable_agreements, "signable_agreements");
                Intrinsics.checkNotNullParameter(title, "title");
                this.signable_agreements = signable_agreements;
                this.title = title;
                this.subtitle_content = subtitleContentDto;
                this.unscrolled_button = buttonDto;
                this.scrolled_button = buttonDto2;
            }

            public final List<SignableAgreementDto> getSignable_agreements() {
                return this.signable_agreements;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ Surrogate(java.util.List r2, java.lang.String r3, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto r4, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto r5, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
                /*
                    r1 = this;
                    r8 = r7 & 1
                    if (r8 == 0) goto L8
                    java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
                L8:
                    r8 = r7 & 2
                    if (r8 == 0) goto Le
                    java.lang.String r3 = ""
                Le:
                    r8 = r7 & 4
                    r0 = 0
                    if (r8 == 0) goto L14
                    r4 = r0
                L14:
                    r8 = r7 & 8
                    if (r8 == 0) goto L19
                    r5 = r0
                L19:
                    r7 = r7 & 16
                    if (r7 == 0) goto L24
                    r8 = r0
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                    goto L2a
                L24:
                    r8 = r6
                    r7 = r5
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                L2a:
                    r3.<init>(r4, r5, r6, r7, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.Surrogate.<init>(java.util.List, java.lang.String, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto, bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final String getTitle() {
                return this.title;
            }

            public final SubtitleContentDto getSubtitle_content() {
                return this.subtitle_content;
            }

            public final ButtonDto getUnscrolled_button() {
                return this.unscrolled_button;
            }

            public final ButtonDto getScrolled_button() {
                return this.scrolled_button;
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CryptoAgreementDto, GetCryptoUserAgreementsResponse.CryptoAgreement> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoAgreementDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoAgreementDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoAgreementDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoAgreementDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement> getProtoAdapter() {
                return GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoAgreementDto getZeroValue() {
                return CryptoAgreementDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoAgreementDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                List<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement> signable_agreements = proto.getSignable_agreements();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signable_agreements, 10));
                Iterator<T> it = signable_agreements.iterator();
                while (it.hasNext()) {
                    arrayList.add(SignableAgreementDto.INSTANCE.fromProto((GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement) it.next()));
                }
                String title = proto.getTitle();
                GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent subtitle_content = proto.getSubtitle_content();
                DefaultConstructorMarker defaultConstructorMarker = null;
                SubtitleContentDto subtitleContentDtoFromProto = subtitle_content != null ? SubtitleContentDto.INSTANCE.fromProto(subtitle_content) : null;
                GetCryptoUserAgreementsResponse.CryptoAgreement.Button unscrolled_button = proto.getUnscrolled_button();
                ButtonDto buttonDtoFromProto = unscrolled_button != null ? ButtonDto.INSTANCE.fromProto(unscrolled_button) : null;
                GetCryptoUserAgreementsResponse.CryptoAgreement.Button scrolled_button = proto.getScrolled_button();
                return new CryptoAgreementDto(new Surrogate(arrayList, title, subtitleContentDtoFromProto, buttonDtoFromProto, scrolled_button != null ? ButtonDto.INSTANCE.fromProto(scrolled_button) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new CryptoAgreementDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Serializable(with = Serializer.class)
        @RhGenerated
        @SourceDebugExtension
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005(')*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;)V", "", "agreement_id", "agreement_sha256", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "agreement_content_sections", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;", "getAgreement_id", "getAgreement_sha256", "getAgreement_content_sections", "()Ljava/util/List;", "Companion", "Surrogate", "AgreementContentSectionDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SignableAgreementDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SignableAgreementDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SignableAgreementDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement>> binaryBase64Serializer$delegate;
            private static final SignableAgreementDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SignableAgreementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SignableAgreementDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getAgreement_id() {
                return this.surrogate.getAgreement_id();
            }

            public final String getAgreement_sha256() {
                return this.surrogate.getAgreement_sha256();
            }

            public final List<AgreementContentSectionDto> getAgreement_content_sections() {
                return this.surrogate.getAgreement_content_sections();
            }

            public /* synthetic */ SignableAgreementDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public SignableAgreementDto(String agreement_id, String agreement_sha256, List<AgreementContentSectionDto> agreement_content_sections) {
                this(new Surrogate(agreement_id, agreement_sha256, agreement_content_sections));
                Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
                Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
                Intrinsics.checkNotNullParameter(agreement_content_sections, "agreement_content_sections");
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement toProto() {
                String agreement_id = this.surrogate.getAgreement_id();
                String agreement_sha256 = this.surrogate.getAgreement_sha256();
                List<AgreementContentSectionDto> agreement_content_sections = this.surrogate.getAgreement_content_sections();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_content_sections, 10));
                Iterator<T> it = agreement_content_sections.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AgreementContentSectionDto) it.next()).toProto());
                }
                return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement(agreement_id, agreement_sha256, arrayList, null, 8, null);
            }

            public String toString() {
                return "[SignableAgreementDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SignableAgreementDto) && Intrinsics.areEqual(((SignableAgreementDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;", "", "", "agreement_id", "agreement_sha256", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "agreement_content_sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreement_id", "getAgreement_id$annotations", "()V", "getAgreement_sha256", "getAgreement_sha256$annotations", "Ljava/util/List;", "getAgreement_content_sections", "()Ljava/util/List;", "getAgreement_content_sections$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                private final List<AgreementContentSectionDto> agreement_content_sections;
                private final String agreement_id;
                private final String agreement_sha256;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                @JvmField
                private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.Surrogate._childSerializers$_anonymous_();
                    }
                })};

                public Surrogate() {
                    this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                    return new ArrayListSerializer(AgreementContentSectionDto.Serializer.INSTANCE);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.agreement_id, surrogate.agreement_id) && Intrinsics.areEqual(this.agreement_sha256, surrogate.agreement_sha256) && Intrinsics.areEqual(this.agreement_content_sections, surrogate.agreement_content_sections);
                }

                public int hashCode() {
                    return (((this.agreement_id.hashCode() * 31) + this.agreement_sha256.hashCode()) * 31) + this.agreement_content_sections.hashCode();
                }

                public String toString() {
                    return "Surrogate(agreement_id=" + this.agreement_id + ", agreement_sha256=" + this.agreement_sha256 + ", agreement_content_sections=" + this.agreement_content_sections + ")";
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C4230xc8aa950f.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.agreement_id = "";
                    } else {
                        this.agreement_id = str;
                    }
                    if ((i & 2) == 0) {
                        this.agreement_sha256 = "";
                    } else {
                        this.agreement_sha256 = str2;
                    }
                    if ((i & 4) == 0) {
                        this.agreement_content_sections = CollectionsKt.emptyList();
                    } else {
                        this.agreement_content_sections = list;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    if (!Intrinsics.areEqual(self.agreement_id, "")) {
                        output.encodeStringElement(serialDesc, 0, self.agreement_id);
                    }
                    if (!Intrinsics.areEqual(self.agreement_sha256, "")) {
                        output.encodeStringElement(serialDesc, 1, self.agreement_sha256);
                    }
                    if (Intrinsics.areEqual(self.agreement_content_sections, CollectionsKt.emptyList())) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.agreement_content_sections);
                }

                public Surrogate(String agreement_id, String agreement_sha256, List<AgreementContentSectionDto> agreement_content_sections) {
                    Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
                    Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
                    Intrinsics.checkNotNullParameter(agreement_content_sections, "agreement_content_sections");
                    this.agreement_id = agreement_id;
                    this.agreement_sha256 = agreement_sha256;
                    this.agreement_content_sections = agreement_content_sections;
                }

                public /* synthetic */ Surrogate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
                }

                public final String getAgreement_id() {
                    return this.agreement_id;
                }

                public final String getAgreement_sha256() {
                    return this.agreement_sha256;
                }

                public final List<AgreementContentSectionDto> getAgreement_content_sections() {
                    return this.agreement_content_sections;
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<SignableAgreementDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SignableAgreementDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SignableAgreementDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SignableAgreementDto> getBinaryBase64Serializer() {
                    return (KSerializer) SignableAgreementDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement> getProtoAdapter() {
                    return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SignableAgreementDto getZeroValue() {
                    return SignableAgreementDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SignableAgreementDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String agreement_id = proto.getAgreement_id();
                    String agreement_sha256 = proto.getAgreement_sha256();
                    List<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection> agreement_content_sections = proto.getAgreement_content_sections();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_content_sections, 10));
                    Iterator<T> it = agreement_content_sections.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AgreementContentSectionDto.INSTANCE.fromProto((GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection) it.next()));
                    }
                    return new SignableAgreementDto(new Surrogate(agreement_id, agreement_sha256, arrayList), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.binaryBase64Serializer_delegate$lambda$1();
                    }
                });
                zeroValue = new SignableAgreementDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;)V", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "type", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "MarkdownDto", "CheckboxDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class AgreementContentSectionDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<AgreementContentSectionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<AgreementContentSectionDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection>> binaryBase64Serializer$delegate;
                private static final AgreementContentSectionDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ AgreementContentSectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private AgreementContentSectionDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final TypeDto getType() {
                    if (this.surrogate.getMarkdown() != null) {
                        return new TypeDto.Markdown(this.surrogate.getMarkdown());
                    }
                    if (this.surrogate.getCheckbox() != null) {
                        return new TypeDto.Checkbox(this.surrogate.getCheckbox());
                    }
                    return null;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public AgreementContentSectionDto(TypeDto typeDto) {
                    TypeDto.Markdown markdown = typeDto instanceof TypeDto.Markdown ? (TypeDto.Markdown) typeDto : null;
                    MarkdownDto value = markdown != null ? markdown.getValue() : null;
                    TypeDto.Checkbox checkbox = typeDto instanceof TypeDto.Checkbox ? (TypeDto.Checkbox) typeDto : null;
                    this(new Surrogate(value, checkbox != null ? checkbox.getValue() : null));
                }

                public /* synthetic */ AgreementContentSectionDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : typeDto);
                }

                @Override // com.robinhood.idl.Dto
                public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection toProto() {
                    MarkdownDto markdown = this.surrogate.getMarkdown();
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown proto = markdown != null ? markdown.toProto() : null;
                    CheckboxDto checkbox = this.surrogate.getCheckbox();
                    return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection(proto, checkbox != null ? checkbox.toProto() : null, null, 4, null);
                }

                public String toString() {
                    return "[AgreementContentSectionDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof AgreementContentSectionDto) && Intrinsics.areEqual(((AgreementContentSectionDto) other).surrogate, this.surrogate);
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
                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", InstantRetirementAgreementComponents.MarkdownTag, "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "checkbox", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "getMarkdown", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "getMarkdown$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "getCheckbox", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "getCheckbox$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final CheckboxDto checkbox;
                    private final MarkdownDto markdown;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((MarkdownDto) null, (CheckboxDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.markdown, surrogate.markdown) && Intrinsics.areEqual(this.checkbox, surrogate.checkbox);
                    }

                    public int hashCode() {
                        MarkdownDto markdownDto = this.markdown;
                        int iHashCode = (markdownDto == null ? 0 : markdownDto.hashCode()) * 31;
                        CheckboxDto checkboxDto = this.checkbox;
                        return iHashCode + (checkboxDto != null ? checkboxDto.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(markdown=" + this.markdown + ", checkbox=" + this.checkbox + ")";
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C4228x4c32684a.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, MarkdownDto markdownDto, CheckboxDto checkboxDto, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.markdown = null;
                        } else {
                            this.markdown = markdownDto;
                        }
                        if ((i & 2) == 0) {
                            this.checkbox = null;
                        } else {
                            this.checkbox = checkboxDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        MarkdownDto markdownDto = self.markdown;
                        if (markdownDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, MarkdownDto.Serializer.INSTANCE, markdownDto);
                        }
                        CheckboxDto checkboxDto = self.checkbox;
                        if (checkboxDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, CheckboxDto.Serializer.INSTANCE, checkboxDto);
                        }
                    }

                    public Surrogate(MarkdownDto markdownDto, CheckboxDto checkboxDto) {
                        this.markdown = markdownDto;
                        this.checkbox = checkboxDto;
                    }

                    public /* synthetic */ Surrogate(MarkdownDto markdownDto, CheckboxDto checkboxDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : markdownDto, (i & 2) != 0 ? null : checkboxDto);
                    }

                    public final MarkdownDto getMarkdown() {
                        return this.markdown;
                    }

                    public final CheckboxDto getCheckbox() {
                        return this.checkbox;
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<AgreementContentSectionDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<AgreementContentSectionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AgreementContentSectionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AgreementContentSectionDto> getBinaryBase64Serializer() {
                        return (KSerializer) AgreementContentSectionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection> getProtoAdapter() {
                        return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AgreementContentSectionDto getZeroValue() {
                        return AgreementContentSectionDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AgreementContentSectionDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown markdown = proto.getMarkdown();
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        MarkdownDto markdownDtoFromProto = markdown != null ? MarkdownDto.INSTANCE.fromProto(markdown) : null;
                        GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox checkbox = proto.getCheckbox();
                        return new AgreementContentSectionDto(new Surrogate(markdownDtoFromProto, checkbox != null ? CheckboxDto.INSTANCE.fromProto(checkbox) : null), defaultConstructorMarker);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new AgreementContentSectionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Markdown", "Checkbox", "Companion", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto$Checkbox;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto$Markdown;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @RhGenerated
                public static abstract class TypeDto implements Dto4 {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);

                    public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private TypeDto() {
                    }

                    @Override // com.robinhood.idl.Dto
                    public Void toProto() {
                        return Dto4.DefaultImpls.toProto(this);
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto$Markdown;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "value", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "getValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Markdown extends TypeDto {
                        private final MarkdownDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Markdown) && Intrinsics.areEqual(this.value, ((Markdown) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "Markdown(value=" + this.value + ")";
                        }

                        public final MarkdownDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Markdown(MarkdownDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto$Checkbox;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "value", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "getValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Checkbox extends TypeDto {
                        private final CheckboxDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Checkbox) && Intrinsics.areEqual(this.value, ((Checkbox) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "Checkbox(value=" + this.value + ")";
                        }

                        public final CheckboxDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Checkbox(CheckboxDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto4.Creator<TypeDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public Void getZeroValue() {
                            return Dto4.Creator.DefaultImpls.getZeroValue(this);
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection> getProtoAdapter() {
                            return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public TypeDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            if (proto.getMarkdown() != null) {
                                return new Markdown(MarkdownDto.INSTANCE.fromProto(proto.getMarkdown()));
                            }
                            if (proto.getCheckbox() != null) {
                                return new Checkbox(CheckboxDto.INSTANCE.fromProto(proto.getCheckbox()));
                            }
                            return null;
                        }
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;)V", "", "markdown_text", "(Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;", "getMarkdown_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class MarkdownDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<MarkdownDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<MarkdownDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown>> binaryBase64Serializer$delegate;
                    private static final MarkdownDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ MarkdownDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private MarkdownDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public final String getMarkdown_text() {
                        return this.surrogate.getMarkdown_text();
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public MarkdownDto(String markdown_text) {
                        this(new Surrogate(markdown_text));
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                    }

                    public /* synthetic */ MarkdownDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown toProto() {
                        return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown(this.surrogate.getMarkdown_text(), null, 2, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[MarkdownDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof MarkdownDto) && Intrinsics.areEqual(((MarkdownDto) other).surrogate, this.surrogate);
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
                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;", "", "", "markdown_text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMarkdown_text", "getMarkdown_text$annotations", "()V", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private final String markdown_text;

                        /* JADX WARN: Multi-variable type inference failed */
                        public Surrogate() {
                            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Surrogate) && Intrinsics.areEqual(this.markdown_text, ((Surrogate) other).markdown_text);
                        }

                        public int hashCode() {
                            return this.markdown_text.hashCode();
                        }

                        public String toString() {
                            return "Surrogate(markdown_text=" + this.markdown_text + ")";
                        }

                        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion {
                            private Companion() {
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Surrogate> serializer() {
                                return C4227x39bea8f6.INSTANCE;
                            }
                        }

                        public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                            if ((i & 1) == 0) {
                                this.markdown_text = "";
                            } else {
                                this.markdown_text = str;
                            }
                        }

                        @JvmStatic
                        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                            if (Intrinsics.areEqual(self.markdown_text, "")) {
                                return;
                            }
                            output.encodeStringElement(serialDesc, 0, self.markdown_text);
                        }

                        public Surrogate(String markdown_text) {
                            Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                            this.markdown_text = markdown_text;
                        }

                        public final String getMarkdown_text() {
                            return this.markdown_text;
                        }

                        public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? "" : str);
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<MarkdownDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<MarkdownDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<MarkdownDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<MarkdownDto> getBinaryBase64Serializer() {
                            return (KSerializer) MarkdownDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown> getProtoAdapter() {
                            return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public MarkdownDto getZeroValue() {
                            return MarkdownDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public MarkdownDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new MarkdownDto(new Surrogate(proto.getMarkdown_text()), null);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new MarkdownDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<MarkdownDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, MarkdownDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public MarkdownDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new MarkdownDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                        public final String provideIntoMap() {
                            return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto";
                        }
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;)V", "", "id", "title", "markdown_text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;", "getId", "getTitle", "getMarkdown_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class CheckboxDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<CheckboxDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<CheckboxDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox>> binaryBase64Serializer$delegate;
                    private static final CheckboxDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ CheckboxDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private CheckboxDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public final String getId() {
                        return this.surrogate.getId();
                    }

                    public final String getTitle() {
                        return this.surrogate.getTitle();
                    }

                    public final String getMarkdown_text() {
                        return this.surrogate.getMarkdown_text();
                    }

                    public /* synthetic */ CheckboxDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public CheckboxDto(String id, String title, String markdown_text) {
                        this(new Surrogate(id, title, markdown_text));
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                    }

                    @Override // com.robinhood.idl.Dto
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox toProto() {
                        return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox(this.surrogate.getId(), this.surrogate.getTitle(), this.surrogate.getMarkdown_text(), null, 8, null);
                    }

                    public String toString() {
                        return "[CheckboxDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof CheckboxDto) && Intrinsics.areEqual(((CheckboxDto) other).surrogate, this.surrogate);
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
                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;", "", "", "id", "title", "markdown_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getMarkdown_text", "getMarkdown_text$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private final String id;
                        private final String markdown_text;
                        private final String title;

                        public Surrogate() {
                            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Surrogate)) {
                                return false;
                            }
                            Surrogate surrogate = (Surrogate) other;
                            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.markdown_text, surrogate.markdown_text);
                        }

                        public int hashCode() {
                            return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.markdown_text.hashCode();
                        }

                        public String toString() {
                            return "Surrogate(id=" + this.id + ", title=" + this.title + ", markdown_text=" + this.markdown_text + ")";
                        }

                        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion {
                            private Companion() {
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Surrogate> serializer() {
                                return C4225x21f220a2.INSTANCE;
                            }
                        }

                        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                            if ((i & 1) == 0) {
                                this.id = "";
                            } else {
                                this.id = str;
                            }
                            if ((i & 2) == 0) {
                                this.title = "";
                            } else {
                                this.title = str2;
                            }
                            if ((i & 4) == 0) {
                                this.markdown_text = "";
                            } else {
                                this.markdown_text = str3;
                            }
                        }

                        @JvmStatic
                        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                            if (!Intrinsics.areEqual(self.id, "")) {
                                output.encodeStringElement(serialDesc, 0, self.id);
                            }
                            if (!Intrinsics.areEqual(self.title, "")) {
                                output.encodeStringElement(serialDesc, 1, self.title);
                            }
                            if (Intrinsics.areEqual(self.markdown_text, "")) {
                                return;
                            }
                            output.encodeStringElement(serialDesc, 2, self.markdown_text);
                        }

                        public Surrogate(String id, String title, String markdown_text) {
                            Intrinsics.checkNotNullParameter(id, "id");
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                            this.id = id;
                            this.title = title;
                            this.markdown_text = markdown_text;
                        }

                        public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                        }

                        public final String getId() {
                            return this.id;
                        }

                        public final String getTitle() {
                            return this.title;
                        }

                        public final String getMarkdown_text() {
                            return this.markdown_text;
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<CheckboxDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<CheckboxDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<CheckboxDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<CheckboxDto> getBinaryBase64Serializer() {
                            return (KSerializer) CheckboxDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox> getProtoAdapter() {
                            return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public CheckboxDto getZeroValue() {
                            return CheckboxDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public CheckboxDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new CheckboxDto(new Surrogate(proto.getId(), proto.getTitle(), proto.getMarkdown_text()), null);
                        }
                    }

                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new CheckboxDto(null, null, null, 7, null);
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<CheckboxDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, CheckboxDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public CheckboxDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new CheckboxDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                        public final String provideIntoMap() {
                            return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto";
                        }
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<AgreementContentSectionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, AgreementContentSectionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public AgreementContentSectionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new AgreementContentSectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                    public final String provideIntoMap() {
                        return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto";
                    }
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SignableAgreementDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SignableAgreementDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SignableAgreementDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SignableAgreementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto";
                }
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;)V", "", "text", "helper_text", "analytics_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;", "getText", "getHelper_text", "getAnalytics_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ButtonDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.Button>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ButtonDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ButtonDto, GetCryptoUserAgreementsResponse.CryptoAgreement.Button>> binaryBase64Serializer$delegate;
            private static final ButtonDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ButtonDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getText() {
                return this.surrogate.getText();
            }

            public final String getHelper_text() {
                return this.surrogate.getHelper_text();
            }

            public final String getAnalytics_identifier() {
                return this.surrogate.getAnalytics_identifier();
            }

            public /* synthetic */ ButtonDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ButtonDto(String text, String str, String analytics_identifier) {
                this(new Surrogate(text, str, analytics_identifier));
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoUserAgreementsResponse.CryptoAgreement.Button toProto() {
                return new GetCryptoUserAgreementsResponse.CryptoAgreement.Button(this.surrogate.getText(), this.surrogate.getHelper_text(), this.surrogate.getAnalytics_identifier(), null, 8, null);
            }

            public String toString() {
                return "[ButtonDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ButtonDto) && Intrinsics.areEqual(((ButtonDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;", "", "", "text", "helper_text", "analytics_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "getHelper_text", "getHelper_text$annotations", "getAnalytics_identifier", "getAnalytics_identifier$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_identifier;
                private final String helper_text;
                private final String text;

                public Surrogate() {
                    this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.helper_text, surrogate.helper_text) && Intrinsics.areEqual(this.analytics_identifier, surrogate.analytics_identifier);
                }

                public int hashCode() {
                    int iHashCode = this.text.hashCode() * 31;
                    String str = this.helper_text;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.analytics_identifier.hashCode();
                }

                public String toString() {
                    return "Surrogate(text=" + this.text + ", helper_text=" + this.helper_text + ", analytics_identifier=" + this.analytics_identifier + ")";
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C4221x7bced396.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.text = "";
                    } else {
                        this.text = str;
                    }
                    if ((i & 2) == 0) {
                        this.helper_text = null;
                    } else {
                        this.helper_text = str2;
                    }
                    if ((i & 4) == 0) {
                        this.analytics_identifier = "";
                    } else {
                        this.analytics_identifier = str3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.text, "")) {
                        output.encodeStringElement(serialDesc, 0, self.text);
                    }
                    String str = self.helper_text;
                    if (str != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
                    }
                    if (Intrinsics.areEqual(self.analytics_identifier, "")) {
                        return;
                    }
                    output.encodeStringElement(serialDesc, 2, self.analytics_identifier);
                }

                public Surrogate(String text, String str, String analytics_identifier) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                    this.text = text;
                    this.helper_text = str;
                    this.analytics_identifier = analytics_identifier;
                }

                public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
                }

                public final String getText() {
                    return this.text;
                }

                public final String getHelper_text() {
                    return this.helper_text;
                }

                public final String getAnalytics_identifier() {
                    return this.analytics_identifier;
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<ButtonDto, GetCryptoUserAgreementsResponse.CryptoAgreement.Button> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ButtonDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ButtonDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ButtonDto> getBinaryBase64Serializer() {
                    return (KSerializer) ButtonDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.Button> getProtoAdapter() {
                    return GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ButtonDto getZeroValue() {
                    return ButtonDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ButtonDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.Button proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new ButtonDto(new Surrogate(proto.getText(), proto.getHelper_text(), proto.getAnalytics_identifier()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ButtonDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<ButtonDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.Button", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ButtonDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ButtonDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto";
                }
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;)V", "", "primary_text_markdown", "secondary_text_markdown", "start_image_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;", "getPrimary_text_markdown", "getSecondary_text_markdown", "getStart_image_url", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SubtitleContentDto implements Dto3<GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SubtitleContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SubtitleContentDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent>> binaryBase64Serializer$delegate;
            private static final SubtitleContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SubtitleContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SubtitleContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getPrimary_text_markdown() {
                return this.surrogate.getPrimary_text_markdown();
            }

            public final String getSecondary_text_markdown() {
                return this.surrogate.getSecondary_text_markdown();
            }

            public final String getStart_image_url() {
                return this.surrogate.getStart_image_url();
            }

            public /* synthetic */ SubtitleContentDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public SubtitleContentDto(String str, String secondary_text_markdown, String str2) {
                this(new Surrogate(str, secondary_text_markdown, str2));
                Intrinsics.checkNotNullParameter(secondary_text_markdown, "secondary_text_markdown");
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent toProto() {
                return new GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent(this.surrogate.getPrimary_text_markdown(), this.surrogate.getSecondary_text_markdown(), this.surrogate.getStart_image_url(), null, 8, null);
            }

            public String toString() {
                return "[SubtitleContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SubtitleContentDto) && Intrinsics.areEqual(((SubtitleContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;", "", "", "primary_text_markdown", "secondary_text_markdown", "start_image_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrimary_text_markdown", "getPrimary_text_markdown$annotations", "()V", "getSecondary_text_markdown", "getSecondary_text_markdown$annotations", "getStart_image_url", "getStart_image_url$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String primary_text_markdown;
                private final String secondary_text_markdown;
                private final String start_image_url;

                public Surrogate() {
                    this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.primary_text_markdown, surrogate.primary_text_markdown) && Intrinsics.areEqual(this.secondary_text_markdown, surrogate.secondary_text_markdown) && Intrinsics.areEqual(this.start_image_url, surrogate.start_image_url);
                }

                public int hashCode() {
                    String str = this.primary_text_markdown;
                    int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.secondary_text_markdown.hashCode()) * 31;
                    String str2 = this.start_image_url;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(primary_text_markdown=" + this.primary_text_markdown + ", secondary_text_markdown=" + this.secondary_text_markdown + ", start_image_url=" + this.start_image_url + ")";
                }

                /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C4232xdc33601.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.primary_text_markdown = null;
                    } else {
                        this.primary_text_markdown = str;
                    }
                    if ((i & 2) == 0) {
                        this.secondary_text_markdown = "";
                    } else {
                        this.secondary_text_markdown = str2;
                    }
                    if ((i & 4) == 0) {
                        this.start_image_url = null;
                    } else {
                        this.start_image_url = str3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    String str = self.primary_text_markdown;
                    if (str != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
                    }
                    if (!Intrinsics.areEqual(self.secondary_text_markdown, "")) {
                        output.encodeStringElement(serialDesc, 1, self.secondary_text_markdown);
                    }
                    String str2 = self.start_image_url;
                    if (str2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
                    }
                }

                public Surrogate(String str, String secondary_text_markdown, String str2) {
                    Intrinsics.checkNotNullParameter(secondary_text_markdown, "secondary_text_markdown");
                    this.primary_text_markdown = str;
                    this.secondary_text_markdown = secondary_text_markdown;
                    this.start_image_url = str2;
                }

                public final String getPrimary_text_markdown() {
                    return this.primary_text_markdown;
                }

                public final String getSecondary_text_markdown() {
                    return this.secondary_text_markdown;
                }

                public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
                }

                public final String getStart_image_url() {
                    return this.start_image_url;
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<SubtitleContentDto, GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SubtitleContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SubtitleContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SubtitleContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) SubtitleContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent> getProtoAdapter() {
                    return GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SubtitleContentDto getZeroValue() {
                    return SubtitleContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SubtitleContentDto fromProto(GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new SubtitleContentDto(new Surrogate(proto.getPrimary_text_markdown(), proto.getSecondary_text_markdown(), proto.getStart_image_url()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new SubtitleContentDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SubtitleContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SubtitleContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SubtitleContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SubtitleContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto";
                }
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CryptoAgreementDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse.CryptoAgreement", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoAgreementDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CryptoAgreementDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CryptoAgreementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto$CryptoAgreementDto";
            }
        }
    }

    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCryptoUserAgreementsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoUserAgreementsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoUserAgreementsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoUserAgreementsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetCryptoUserAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto";
        }
    }
}
