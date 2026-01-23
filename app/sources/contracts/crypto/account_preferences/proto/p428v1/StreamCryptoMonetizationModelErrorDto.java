package contracts.crypto.account_preferences.proto.p428v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelError;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelErrorDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007! \"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "Landroid/os/Parcelable;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;)V", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;", "type", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "ErrorUnspecifiedDto", "NoCryptoAccountDto", "Serializer", "MultibindingModule", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class StreamCryptoMonetizationModelErrorDto implements Dto3<StreamCryptoMonetizationModelError>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoMonetizationModelErrorDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoMonetizationModelErrorDto, StreamCryptoMonetizationModelError>> binaryBase64Serializer$delegate;
    private static final StreamCryptoMonetizationModelErrorDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoMonetizationModelErrorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoMonetizationModelErrorDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamCryptoMonetizationModelErrorDto(TypeDto typeDto) {
        TypeDto.ErrorUnspecified errorUnspecified = typeDto instanceof TypeDto.ErrorUnspecified ? (TypeDto.ErrorUnspecified) typeDto : null;
        ErrorUnspecifiedDto value = errorUnspecified != null ? errorUnspecified.getValue() : null;
        TypeDto.NoCryptoAccount noCryptoAccount = typeDto instanceof TypeDto.NoCryptoAccount ? (TypeDto.NoCryptoAccount) typeDto : null;
        this(new Surrogate(value, noCryptoAccount != null ? noCryptoAccount.getValue() : null));
    }

    public /* synthetic */ StreamCryptoMonetizationModelErrorDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public StreamCryptoMonetizationModelError toProto() {
        ErrorUnspecifiedDto error_unspecified = this.surrogate.getError_unspecified();
        StreamCryptoMonetizationModelError.ErrorUnspecified proto = error_unspecified != null ? error_unspecified.toProto() : null;
        NoCryptoAccountDto no_crypto_account = this.surrogate.getNo_crypto_account();
        return new StreamCryptoMonetizationModelError(proto, no_crypto_account != null ? no_crypto_account.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[StreamCryptoMonetizationModelErrorDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoMonetizationModelErrorDto) && Intrinsics.areEqual(((StreamCryptoMonetizationModelErrorDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;", "", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "error_unspecified", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "no_crypto_account", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_account_preferences_proto_v1_externalRelease", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "getError_unspecified", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "getError_unspecified$annotations", "()V", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "getNo_crypto_account", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "getNo_crypto_account$annotations", "Companion", "$serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorUnspecifiedDto error_unspecified;
        private final NoCryptoAccountDto no_crypto_account;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ErrorUnspecifiedDto) null, (NoCryptoAccountDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.error_unspecified, surrogate.error_unspecified) && Intrinsics.areEqual(this.no_crypto_account, surrogate.no_crypto_account);
        }

        public int hashCode() {
            ErrorUnspecifiedDto errorUnspecifiedDto = this.error_unspecified;
            int iHashCode = (errorUnspecifiedDto == null ? 0 : errorUnspecifiedDto.hashCode()) * 31;
            NoCryptoAccountDto noCryptoAccountDto = this.no_crypto_account;
            return iHashCode + (noCryptoAccountDto != null ? noCryptoAccountDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(error_unspecified=" + this.error_unspecified + ", no_crypto_account=" + this.no_crypto_account + ")";
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoMonetizationModelErrorDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ErrorUnspecifiedDto errorUnspecifiedDto, NoCryptoAccountDto noCryptoAccountDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.error_unspecified = null;
            } else {
                this.error_unspecified = errorUnspecifiedDto;
            }
            if ((i & 2) == 0) {
                this.no_crypto_account = null;
            } else {
                this.no_crypto_account = noCryptoAccountDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$contracts_crypto_account_preferences_proto_v1_externalRelease */
        public static final /* synthetic */ void m3270x17db00b5(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ErrorUnspecifiedDto errorUnspecifiedDto = self.error_unspecified;
            if (errorUnspecifiedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ErrorUnspecifiedDto.Serializer.INSTANCE, errorUnspecifiedDto);
            }
            NoCryptoAccountDto noCryptoAccountDto = self.no_crypto_account;
            if (noCryptoAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, NoCryptoAccountDto.Serializer.INSTANCE, noCryptoAccountDto);
            }
        }

        public Surrogate(ErrorUnspecifiedDto errorUnspecifiedDto, NoCryptoAccountDto noCryptoAccountDto) {
            this.error_unspecified = errorUnspecifiedDto;
            this.no_crypto_account = noCryptoAccountDto;
        }

        public /* synthetic */ Surrogate(ErrorUnspecifiedDto errorUnspecifiedDto, NoCryptoAccountDto noCryptoAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : errorUnspecifiedDto, (i & 2) != 0 ? null : noCryptoAccountDto);
        }

        public final ErrorUnspecifiedDto getError_unspecified() {
            return this.error_unspecified;
        }

        public final NoCryptoAccountDto getNo_crypto_account() {
            return this.no_crypto_account;
        }
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoMonetizationModelErrorDto, StreamCryptoMonetizationModelError> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoMonetizationModelErrorDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoMonetizationModelErrorDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoMonetizationModelErrorDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoMonetizationModelErrorDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoMonetizationModelError> getProtoAdapter() {
            return StreamCryptoMonetizationModelError.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoMonetizationModelErrorDto getZeroValue() {
            return StreamCryptoMonetizationModelErrorDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoMonetizationModelErrorDto fromProto(StreamCryptoMonetizationModelError proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StreamCryptoMonetizationModelError.ErrorUnspecified error_unspecified = proto.getError_unspecified();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ErrorUnspecifiedDto errorUnspecifiedDtoFromProto = error_unspecified != null ? ErrorUnspecifiedDto.INSTANCE.fromProto(error_unspecified) : null;
            StreamCryptoMonetizationModelError.NoCryptoAccount no_crypto_account = proto.getNo_crypto_account();
            return new StreamCryptoMonetizationModelErrorDto(new Surrogate(errorUnspecifiedDtoFromProto, no_crypto_account != null ? NoCryptoAccountDto.INSTANCE.fromProto(no_crypto_account) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoMonetizationModelErrorDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamCryptoMonetizationModelErrorDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ErrorUnspecified", "NoCryptoAccount", "Companion", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto$ErrorUnspecified;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto$NoCryptoAccount;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto$ErrorUnspecified;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "value", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "getValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ErrorUnspecified extends TypeDto {
            private final ErrorUnspecifiedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorUnspecified) && Intrinsics.areEqual(this.value, ((ErrorUnspecified) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ErrorUnspecified(value=" + this.value + ")";
            }

            public final ErrorUnspecifiedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorUnspecified(ErrorUnspecifiedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto$NoCryptoAccount;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "value", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "getValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoCryptoAccount extends TypeDto {
            private final NoCryptoAccountDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoCryptoAccount) && Intrinsics.areEqual(this.value, ((NoCryptoAccount) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NoCryptoAccount(value=" + this.value + ")";
            }

            public final NoCryptoAccountDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoCryptoAccount(NoCryptoAccountDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$TypeDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TypeDto, StreamCryptoMonetizationModelError> {
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
            public ProtoAdapter<StreamCryptoMonetizationModelError> getProtoAdapter() {
                return StreamCryptoMonetizationModelError.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(StreamCryptoMonetizationModelError proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getError_unspecified() != null) {
                    return new ErrorUnspecified(ErrorUnspecifiedDto.INSTANCE.fromProto(proto.getError_unspecified()));
                }
                if (proto.getNo_crypto_account() != null) {
                    return new NoCryptoAccount(NoCryptoAccountDto.INSTANCE.fromProto(proto.getNo_crypto_account()));
                }
                return null;
            }
        }
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "Landroid/os/Parcelable;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorUnspecifiedDto implements Dto3<StreamCryptoMonetizationModelError.ErrorUnspecified>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ErrorUnspecifiedDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorUnspecifiedDto, StreamCryptoMonetizationModelError.ErrorUnspecified>> binaryBase64Serializer$delegate;
        private static final ErrorUnspecifiedDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ErrorUnspecifiedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ErrorUnspecifiedDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public ErrorUnspecifiedDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public StreamCryptoMonetizationModelError.ErrorUnspecified toProto() {
            return new StreamCryptoMonetizationModelError.ErrorUnspecified(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ErrorUnspecifiedDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ErrorUnspecifiedDto) && Intrinsics.areEqual(((ErrorUnspecifiedDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoMonetizationModelErrorDto.ErrorUnspecifiedDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1831897507;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto.ErrorUnspecifiedDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ErrorUnspecifiedDto, StreamCryptoMonetizationModelError.ErrorUnspecified> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorUnspecifiedDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorUnspecifiedDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorUnspecifiedDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorUnspecifiedDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamCryptoMonetizationModelError.ErrorUnspecified> getProtoAdapter() {
                return StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorUnspecifiedDto getZeroValue() {
                return ErrorUnspecifiedDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorUnspecifiedDto fromProto(StreamCryptoMonetizationModelError.ErrorUnspecified proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ErrorUnspecifiedDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoMonetizationModelErrorDto.ErrorUnspecifiedDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ErrorUnspecifiedDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ErrorUnspecifiedDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError.ErrorUnspecified", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorUnspecifiedDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ErrorUnspecifiedDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ErrorUnspecifiedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$ErrorUnspecifiedDto";
            }
        }
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "Landroid/os/Parcelable;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NoCryptoAccountDto implements Dto3<StreamCryptoMonetizationModelError.NoCryptoAccount>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<NoCryptoAccountDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NoCryptoAccountDto, StreamCryptoMonetizationModelError.NoCryptoAccount>> binaryBase64Serializer$delegate;
        private static final NoCryptoAccountDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ NoCryptoAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NoCryptoAccountDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public NoCryptoAccountDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public StreamCryptoMonetizationModelError.NoCryptoAccount toProto() {
            return new StreamCryptoMonetizationModelError.NoCryptoAccount(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[NoCryptoAccountDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof NoCryptoAccountDto) && Intrinsics.areEqual(((NoCryptoAccountDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoMonetizationModelErrorDto.NoCryptoAccountDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1149009893;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto.NoCryptoAccountDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<NoCryptoAccountDto, StreamCryptoMonetizationModelError.NoCryptoAccount> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NoCryptoAccountDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NoCryptoAccountDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NoCryptoAccountDto> getBinaryBase64Serializer() {
                return (KSerializer) NoCryptoAccountDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamCryptoMonetizationModelError.NoCryptoAccount> getProtoAdapter() {
                return StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NoCryptoAccountDto getZeroValue() {
                return NoCryptoAccountDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NoCryptoAccountDto fromProto(StreamCryptoMonetizationModelError.NoCryptoAccount proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new NoCryptoAccountDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoMonetizationModelErrorDto.NoCryptoAccountDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new NoCryptoAccountDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NoCryptoAccountDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError.NoCryptoAccount", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NoCryptoAccountDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public NoCryptoAccountDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new NoCryptoAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto$NoCryptoAccountDto";
            }
        }
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoMonetizationModelErrorDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoMonetizationModelErrorDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoMonetizationModelErrorDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoMonetizationModelErrorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamCryptoMonetizationModelErrorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelErrorDto";
        }
    }
}
