package com.robinhood.baffi.proto.p282v1.publicservice;

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

/* compiled from: DeviceAttestStatusResponseDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate;)V", "registered", "", "nonce_base64", "", "(ZLjava/lang/String;)V", "getRegistered", "()Z", "getNonce_base64", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes3.dex */
public final class DeviceAttestStatusResponseDto implements Dto3<DeviceAttestStatusResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceAttestStatusResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceAttestStatusResponseDto, DeviceAttestStatusResponse>> binaryBase64Serializer$delegate;
    private static final DeviceAttestStatusResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceAttestStatusResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceAttestStatusResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getRegistered() {
        return this.surrogate.getRegistered();
    }

    public final String getNonce_base64() {
        return this.surrogate.getNonce_base64();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceAttestStatusResponseDto(boolean z, String nonce_base64) {
        this(new Surrogate(z, nonce_base64));
        Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
    }

    public /* synthetic */ DeviceAttestStatusResponseDto(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ DeviceAttestStatusResponseDto copy$default(DeviceAttestStatusResponseDto deviceAttestStatusResponseDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceAttestStatusResponseDto.surrogate.getRegistered();
        }
        if ((i & 2) != 0) {
            str = deviceAttestStatusResponseDto.surrogate.getNonce_base64();
        }
        return deviceAttestStatusResponseDto.copy(z, str);
    }

    public final DeviceAttestStatusResponseDto copy(boolean registered, String nonce_base64) {
        Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
        return new DeviceAttestStatusResponseDto(new Surrogate(registered, nonce_base64));
    }

    @Override // com.robinhood.idl.Dto
    public DeviceAttestStatusResponse toProto() {
        return new DeviceAttestStatusResponse(this.surrogate.getRegistered(), this.surrogate.getNonce_base64(), null, 4, null);
    }

    public String toString() {
        return "[DeviceAttestStatusResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceAttestStatusResponseDto) && Intrinsics.areEqual(((DeviceAttestStatusResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: DeviceAttestStatusResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate;", "", "registered", "", "nonce_base64", "", "<init>", "(ZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRegistered$annotations", "()V", "getRegistered", "()Z", "getNonce_base64$annotations", "getNonce_base64", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$baffi_service_v1_public_externalRelease", "$serializer", "Companion", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String nonce_base64;
        private final boolean registered;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this(false, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.registered;
            }
            if ((i & 2) != 0) {
                str = surrogate.nonce_base64;
            }
            return surrogate.copy(z, str);
        }

        @SerialName("nonceBase64")
        @JsonAnnotations2(names = {"nonce_base64"})
        public static /* synthetic */ void getNonce_base64$annotations() {
        }

        @SerialName("registered")
        @JsonAnnotations2(names = {"registered"})
        public static /* synthetic */ void getRegistered$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRegistered() {
            return this.registered;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNonce_base64() {
            return this.nonce_base64;
        }

        public final Surrogate copy(boolean registered, String nonce_base64) {
            Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
            return new Surrogate(registered, nonce_base64);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.registered == surrogate.registered && Intrinsics.areEqual(this.nonce_base64, surrogate.nonce_base64);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.registered) * 31) + this.nonce_base64.hashCode();
        }

        public String toString() {
            return "Surrogate(registered=" + this.registered + ", nonce_base64=" + this.nonce_base64 + ")";
        }

        /* compiled from: DeviceAttestStatusResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceAttestStatusResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.registered = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.nonce_base64 = "";
            } else {
                this.nonce_base64 = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$baffi_service_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.registered;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (Intrinsics.areEqual(self.nonce_base64, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.nonce_base64);
        }

        public Surrogate(boolean z, String nonce_base64) {
            Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
            this.registered = z;
            this.nonce_base64 = nonce_base64;
        }

        public final boolean getRegistered() {
            return this.registered;
        }

        public final String getNonce_base64() {
            return this.nonce_base64;
        }

        public /* synthetic */ Surrogate(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: DeviceAttestStatusResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DeviceAttestStatusResponseDto, DeviceAttestStatusResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceAttestStatusResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceAttestStatusResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceAttestStatusResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceAttestStatusResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceAttestStatusResponse> getProtoAdapter() {
            return DeviceAttestStatusResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceAttestStatusResponseDto getZeroValue() {
            return DeviceAttestStatusResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceAttestStatusResponseDto fromProto(DeviceAttestStatusResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DeviceAttestStatusResponseDto(new Surrogate(proto.getRegistered(), proto.getNonce_base64()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.baffi.proto.v1.publicservice.DeviceAttestStatusResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceAttestStatusResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceAttestStatusResponseDto(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DeviceAttestStatusResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DeviceAttestStatusResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/baffi.service.v1.public.DeviceAttestStatusResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceAttestStatusResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceAttestStatusResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceAttestStatusResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: DeviceAttestStatusResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.baffi.proto.v1.publicservice.DeviceAttestStatusResponseDto";
        }
    }
}
