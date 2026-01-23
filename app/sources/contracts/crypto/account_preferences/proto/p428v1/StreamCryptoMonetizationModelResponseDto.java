package contracts.crypto.account_preferences.proto.p428v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelErrorDto;
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
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;

/* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponse;", "Landroid/os/Parcelable;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;)V", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "", "ineligible_for_monetization", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "error", "(Lrosetta/nummus/MonetizationModelDto;ZLcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;)V", "toProto", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class StreamCryptoMonetizationModelResponseDto implements Dto3<StreamCryptoMonetizationModelResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoMonetizationModelResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoMonetizationModelResponseDto, StreamCryptoMonetizationModelResponse>> binaryBase64Serializer$delegate;
    private static final StreamCryptoMonetizationModelResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoMonetizationModelResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoMonetizationModelResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamCryptoMonetizationModelResponseDto(MonetizationModelDto monetizationModelDto, boolean z, StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : streamCryptoMonetizationModelErrorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamCryptoMonetizationModelResponseDto(MonetizationModelDto monetization_model, boolean z, StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto) {
        this(new Surrogate(monetization_model, z, streamCryptoMonetizationModelErrorDto));
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamCryptoMonetizationModelResponse toProto() {
        MonetizationModel monetizationModel = (MonetizationModel) this.surrogate.getMonetization_model().toProto();
        boolean ineligible_for_monetization = this.surrogate.getIneligible_for_monetization();
        StreamCryptoMonetizationModelErrorDto error = this.surrogate.getError();
        return new StreamCryptoMonetizationModelResponse(monetizationModel, ineligible_for_monetization, error != null ? error.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[StreamCryptoMonetizationModelResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoMonetizationModelResponseDto) && Intrinsics.areEqual(((StreamCryptoMonetizationModelResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;", "", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "", "ineligible_for_monetization", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "error", "<init>", "(Lrosetta/nummus/MonetizationModelDto;ZLcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/MonetizationModelDto;ZLcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_account_preferences_proto_v1_externalRelease", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model$annotations", "()V", "Z", "getIneligible_for_monetization", "()Z", "getIneligible_for_monetization$annotations", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "getError", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelErrorDto;", "getError$annotations", "Companion", "$serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StreamCryptoMonetizationModelErrorDto error;
        private final boolean ineligible_for_monetization;
        private final MonetizationModelDto monetization_model;

        public Surrogate() {
            this((MonetizationModelDto) null, false, (StreamCryptoMonetizationModelErrorDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.monetization_model == surrogate.monetization_model && this.ineligible_for_monetization == surrogate.ineligible_for_monetization && Intrinsics.areEqual(this.error, surrogate.error);
        }

        public int hashCode() {
            int iHashCode = ((this.monetization_model.hashCode() * 31) + Boolean.hashCode(this.ineligible_for_monetization)) * 31;
            StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto = this.error;
            return iHashCode + (streamCryptoMonetizationModelErrorDto == null ? 0 : streamCryptoMonetizationModelErrorDto.hashCode());
        }

        public String toString() {
            return "Surrogate(monetization_model=" + this.monetization_model + ", ineligible_for_monetization=" + this.ineligible_for_monetization + ", error=" + this.error + ")";
        }

        /* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoMonetizationModelResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MonetizationModelDto monetizationModelDto, boolean z, StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.monetization_model = (i & 1) == 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto;
            if ((i & 2) == 0) {
                this.ineligible_for_monetization = false;
            } else {
                this.ineligible_for_monetization = z;
            }
            if ((i & 4) == 0) {
                this.error = null;
            } else {
                this.error = streamCryptoMonetizationModelErrorDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$contracts_crypto_account_preferences_proto_v1_externalRelease */
        public static final /* synthetic */ void m3271x17db00b5(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
            }
            boolean z = self.ineligible_for_monetization;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto = self.error;
            if (streamCryptoMonetizationModelErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StreamCryptoMonetizationModelErrorDto.Serializer.INSTANCE, streamCryptoMonetizationModelErrorDto);
            }
        }

        public Surrogate(MonetizationModelDto monetization_model, boolean z, StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto) {
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            this.monetization_model = monetization_model;
            this.ineligible_for_monetization = z;
            this.error = streamCryptoMonetizationModelErrorDto;
        }

        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        public /* synthetic */ Surrogate(MonetizationModelDto monetizationModelDto, boolean z, StreamCryptoMonetizationModelErrorDto streamCryptoMonetizationModelErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : streamCryptoMonetizationModelErrorDto);
        }

        public final boolean getIneligible_for_monetization() {
            return this.ineligible_for_monetization;
        }

        public final StreamCryptoMonetizationModelErrorDto getError() {
            return this.error;
        }
    }

    /* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoMonetizationModelResponseDto, StreamCryptoMonetizationModelResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoMonetizationModelResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoMonetizationModelResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoMonetizationModelResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoMonetizationModelResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoMonetizationModelResponse> getProtoAdapter() {
            return StreamCryptoMonetizationModelResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoMonetizationModelResponseDto getZeroValue() {
            return StreamCryptoMonetizationModelResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoMonetizationModelResponseDto fromProto(StreamCryptoMonetizationModelResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MonetizationModelDto monetizationModelDtoFromProto = MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model());
            boolean ineligible_for_monetization = proto.getIneligible_for_monetization();
            StreamCryptoMonetizationModelError error = proto.getError();
            return new StreamCryptoMonetizationModelResponseDto(new Surrogate(monetizationModelDtoFromProto, ineligible_for_monetization, error != null ? StreamCryptoMonetizationModelErrorDto.INSTANCE.fromProto(error) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoMonetizationModelResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamCryptoMonetizationModelResponseDto(null, false, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoMonetizationModelResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoMonetizationModelResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoMonetizationModelResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoMonetizationModelResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamCryptoMonetizationModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelResponseDto";
        }
    }
}
