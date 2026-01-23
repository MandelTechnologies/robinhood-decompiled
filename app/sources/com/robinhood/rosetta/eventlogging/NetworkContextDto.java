package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NetworkContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: NetworkContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate;)V", "error_type", "", "isSuccessful", "", "status_code", "", "tag", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "(Ljava/lang/String;ZILcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;)V", "getError_type", "()Ljava/lang/String;", "()Z", "getStatus_code", "()I", "getTag", "()Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TagDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NetworkContextDto implements Dto3<NetworkContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NetworkContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NetworkContextDto, NetworkContext>> binaryBase64Serializer$delegate;
    private static final NetworkContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NetworkContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NetworkContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getError_type() {
        return this.surrogate.getError_type();
    }

    public final boolean isSuccessful() {
        return this.surrogate.isSuccessful();
    }

    public final int getStatus_code() {
        return this.surrogate.getStatus_code();
    }

    public final TagDto getTag() {
        return this.surrogate.getTag();
    }

    public /* synthetic */ NetworkContextDto(String str, boolean z, int i, TagDto tagDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? TagDto.INSTANCE.getZeroValue() : tagDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkContextDto(String error_type, boolean z, int i, TagDto tag) {
        this(new Surrogate(error_type, z, i, tag));
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public static /* synthetic */ NetworkContextDto copy$default(NetworkContextDto networkContextDto, String str, boolean z, int i, TagDto tagDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkContextDto.surrogate.getError_type();
        }
        if ((i2 & 2) != 0) {
            z = networkContextDto.surrogate.isSuccessful();
        }
        if ((i2 & 4) != 0) {
            i = networkContextDto.surrogate.getStatus_code();
        }
        if ((i2 & 8) != 0) {
            tagDto = networkContextDto.surrogate.getTag();
        }
        return networkContextDto.copy(str, z, i, tagDto);
    }

    public final NetworkContextDto copy(String error_type, boolean isSuccessful, int status_code, TagDto tag) {
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new NetworkContextDto(new Surrogate(error_type, isSuccessful, status_code, tag));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NetworkContext toProto() {
        return new NetworkContext(this.surrogate.getError_type(), this.surrogate.isSuccessful(), this.surrogate.getStatus_code(), (NetworkContext.Tag) this.surrogate.getTag().toProto(), null, 16, null);
    }

    public String toString() {
        return "[NetworkContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NetworkContextDto) && Intrinsics.areEqual(((NetworkContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: NetworkContextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0018\u0010!\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0004\u0010\u0018R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate;", "", "error_type", "", "isSuccessful", "", "status_code", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "tag", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "<init>", "(Ljava/lang/String;ZILcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZILcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getError_type$annotations", "()V", "getError_type", "()Ljava/lang/String;", "isSuccessful$annotations", "()Z", "getStatus_code$annotations", "getStatus_code", "()I", "getTag$annotations", "getTag", "()Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String error_type;
        private final boolean isSuccessful;
        private final int status_code;
        private final TagDto tag;

        public Surrogate() {
            this((String) null, false, 0, (TagDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, boolean z, int i, TagDto tagDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.error_type;
            }
            if ((i2 & 2) != 0) {
                z = surrogate.isSuccessful;
            }
            if ((i2 & 4) != 0) {
                i = surrogate.status_code;
            }
            if ((i2 & 8) != 0) {
                tagDto = surrogate.tag;
            }
            return surrogate.copy(str, z, i, tagDto);
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("statusCode")
        @JsonAnnotations2(names = {"status_code"})
        public static /* synthetic */ void getStatus_code$annotations() {
        }

        @SerialName("tag")
        @JsonAnnotations2(names = {"tag"})
        public static /* synthetic */ void getTag$annotations() {
        }

        @SerialName("isSuccessful")
        @JsonAnnotations2(names = {"isSuccessful"})
        public static /* synthetic */ void isSuccessful$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getError_type() {
            return this.error_type;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        /* renamed from: component3, reason: from getter */
        public final int getStatus_code() {
            return this.status_code;
        }

        /* renamed from: component4, reason: from getter */
        public final TagDto getTag() {
            return this.tag;
        }

        public final Surrogate copy(String error_type, boolean isSuccessful, int status_code, TagDto tag) {
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Surrogate(error_type, isSuccessful, status_code, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.error_type, surrogate.error_type) && this.isSuccessful == surrogate.isSuccessful && this.status_code == surrogate.status_code && this.tag == surrogate.tag;
        }

        public int hashCode() {
            return (((((this.error_type.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSuccessful)) * 31) + Integer.hashCode(this.status_code)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Surrogate(error_type=" + this.error_type + ", isSuccessful=" + this.isSuccessful + ", status_code=" + this.status_code + ", tag=" + this.tag + ")";
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NetworkContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, int i2, TagDto tagDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.error_type = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.isSuccessful = false;
            } else {
                this.isSuccessful = z;
            }
            if ((i & 4) == 0) {
                this.status_code = 0;
            } else {
                this.status_code = i2;
            }
            if ((i & 8) == 0) {
                this.tag = TagDto.INSTANCE.getZeroValue();
            } else {
                this.tag = tagDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.error_type, "")) {
                output.encodeStringElement(serialDesc, 0, self.error_type);
            }
            boolean z = self.isSuccessful;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            int i = self.status_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.tag != TagDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TagDto.Serializer.INSTANCE, self.tag);
            }
        }

        public Surrogate(String error_type, boolean z, int i, TagDto tag) {
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.error_type = error_type;
            this.isSuccessful = z;
            this.status_code = i;
            this.tag = tag;
        }

        public final String getError_type() {
            return this.error_type;
        }

        public /* synthetic */ Surrogate(String str, boolean z, int i, TagDto tagDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? TagDto.INSTANCE.getZeroValue() : tagDto);
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public final int getStatus_code() {
            return this.status_code;
        }

        public final TagDto getTag() {
            return this.tag;
        }
    }

    /* compiled from: NetworkContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NetworkContextDto, NetworkContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NetworkContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkContextDto> getBinaryBase64Serializer() {
            return (KSerializer) NetworkContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NetworkContext> getProtoAdapter() {
            return NetworkContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkContextDto getZeroValue() {
            return NetworkContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkContextDto fromProto(NetworkContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NetworkContextDto(new Surrogate(proto.getError_type(), proto.getIsSuccessful(), proto.getStatus_code(), TagDto.INSTANCE.fromProto(proto.getTag())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NetworkContextDto(null, false, 0, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TAG_TYPE_UNSPECIFIED", "IAV_CONNECT", "IAV_CREATE_RELATIONSHIP", "IAV_LINK_TOKEN", "IAV_EXCHANGE_TOKEN", "SUBMIT_QUEUED_DEPOSIT", "SUBMIT_RECURRING_DEPOSIT", "SKIP_RECURRING_DEPOSIT", "SUBMIT_TRANSFER", "LINK_DEBIT_CARD", "VERIFY_DEBIT_CARD", "DEBIT_CARD_LINKING_PRECHECK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TagDto implements Dto2<NetworkContext.Tag>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TagDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TagDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TagDto, NetworkContext.Tag>> binaryBase64Serializer$delegate;
        public static final TagDto TAG_TYPE_UNSPECIFIED = new TAG_TYPE_UNSPECIFIED("TAG_TYPE_UNSPECIFIED", 0);
        public static final TagDto IAV_CONNECT = new IAV_CONNECT("IAV_CONNECT", 1);
        public static final TagDto IAV_CREATE_RELATIONSHIP = new IAV_CREATE_RELATIONSHIP("IAV_CREATE_RELATIONSHIP", 2);
        public static final TagDto IAV_LINK_TOKEN = new IAV_LINK_TOKEN("IAV_LINK_TOKEN", 3);
        public static final TagDto IAV_EXCHANGE_TOKEN = new IAV_EXCHANGE_TOKEN("IAV_EXCHANGE_TOKEN", 4);
        public static final TagDto SUBMIT_QUEUED_DEPOSIT = new SUBMIT_QUEUED_DEPOSIT("SUBMIT_QUEUED_DEPOSIT", 5);
        public static final TagDto SUBMIT_RECURRING_DEPOSIT = new SUBMIT_RECURRING_DEPOSIT("SUBMIT_RECURRING_DEPOSIT", 6);
        public static final TagDto SKIP_RECURRING_DEPOSIT = new SKIP_RECURRING_DEPOSIT("SKIP_RECURRING_DEPOSIT", 7);
        public static final TagDto SUBMIT_TRANSFER = new SUBMIT_TRANSFER("SUBMIT_TRANSFER", 8);
        public static final TagDto LINK_DEBIT_CARD = new LINK_DEBIT_CARD("LINK_DEBIT_CARD", 9);
        public static final TagDto VERIFY_DEBIT_CARD = new VERIFY_DEBIT_CARD("VERIFY_DEBIT_CARD", 10);
        public static final TagDto DEBIT_CARD_LINKING_PRECHECK = new DEBIT_CARD_LINKING_PRECHECK("DEBIT_CARD_LINKING_PRECHECK", 11);

        private static final /* synthetic */ TagDto[] $values() {
            return new TagDto[]{TAG_TYPE_UNSPECIFIED, IAV_CONNECT, IAV_CREATE_RELATIONSHIP, IAV_LINK_TOKEN, IAV_EXCHANGE_TOKEN, SUBMIT_QUEUED_DEPOSIT, SUBMIT_RECURRING_DEPOSIT, SKIP_RECURRING_DEPOSIT, SUBMIT_TRANSFER, LINK_DEBIT_CARD, VERIFY_DEBIT_CARD, DEBIT_CARD_LINKING_PRECHECK};
        }

        public /* synthetic */ TagDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TagDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.TAG_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TAG_TYPE_UNSPECIFIED extends TagDto {
            TAG_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.TAG_TYPE_UNSPECIFIED;
            }
        }

        private TagDto(String str, int i) {
        }

        static {
            TagDto[] tagDtoArr$values = $values();
            $VALUES = tagDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tagDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkContextDto$TagDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkContextDto.TagDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.IAV_CONNECT", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IAV_CONNECT extends TagDto {
            IAV_CONNECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.IAV_CONNECT;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.IAV_CREATE_RELATIONSHIP", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IAV_CREATE_RELATIONSHIP extends TagDto {
            IAV_CREATE_RELATIONSHIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.IAV_CREATE_RELATIONSHIP;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.IAV_LINK_TOKEN", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IAV_LINK_TOKEN extends TagDto {
            IAV_LINK_TOKEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.IAV_LINK_TOKEN;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.IAV_EXCHANGE_TOKEN", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IAV_EXCHANGE_TOKEN extends TagDto {
            IAV_EXCHANGE_TOKEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.IAV_EXCHANGE_TOKEN;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.SUBMIT_QUEUED_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT_QUEUED_DEPOSIT extends TagDto {
            SUBMIT_QUEUED_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.SUBMIT_QUEUED_DEPOSIT;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.SUBMIT_RECURRING_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT_RECURRING_DEPOSIT extends TagDto {
            SUBMIT_RECURRING_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.SUBMIT_RECURRING_DEPOSIT;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.SKIP_RECURRING_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SKIP_RECURRING_DEPOSIT extends TagDto {
            SKIP_RECURRING_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.SKIP_RECURRING_DEPOSIT;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.SUBMIT_TRANSFER", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMIT_TRANSFER extends TagDto {
            SUBMIT_TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.SUBMIT_TRANSFER;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.LINK_DEBIT_CARD", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINK_DEBIT_CARD extends TagDto {
            LINK_DEBIT_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.LINK_DEBIT_CARD;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.VERIFY_DEBIT_CARD", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VERIFY_DEBIT_CARD extends TagDto {
            VERIFY_DEBIT_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.VERIFY_DEBIT_CARD;
            }
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkContextDto.TagDto.DEBIT_CARD_LINKING_PRECHECK", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEBIT_CARD_LINKING_PRECHECK extends TagDto {
            DEBIT_CARD_LINKING_PRECHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkContext.Tag toProto() {
                return NetworkContext.Tag.DEBIT_CARD_LINKING_PRECHECK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TagDto, NetworkContext.Tag> {

            /* compiled from: NetworkContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NetworkContext.Tag.values().length];
                    try {
                        iArr[NetworkContext.Tag.TAG_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NetworkContext.Tag.IAV_CONNECT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NetworkContext.Tag.IAV_CREATE_RELATIONSHIP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NetworkContext.Tag.IAV_LINK_TOKEN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NetworkContext.Tag.IAV_EXCHANGE_TOKEN.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NetworkContext.Tag.SUBMIT_QUEUED_DEPOSIT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NetworkContext.Tag.SUBMIT_RECURRING_DEPOSIT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[NetworkContext.Tag.SKIP_RECURRING_DEPOSIT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[NetworkContext.Tag.SUBMIT_TRANSFER.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[NetworkContext.Tag.LINK_DEBIT_CARD.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[NetworkContext.Tag.VERIFY_DEBIT_CARD.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[NetworkContext.Tag.DEBIT_CARD_LINKING_PRECHECK.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TagDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TagDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TagDto> getBinaryBase64Serializer() {
                return (KSerializer) TagDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NetworkContext.Tag> getProtoAdapter() {
                return NetworkContext.Tag.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TagDto getZeroValue() {
                return TagDto.TAG_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TagDto fromProto(NetworkContext.Tag proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TagDto.TAG_TYPE_UNSPECIFIED;
                    case 2:
                        return TagDto.IAV_CONNECT;
                    case 3:
                        return TagDto.IAV_CREATE_RELATIONSHIP;
                    case 4:
                        return TagDto.IAV_LINK_TOKEN;
                    case 5:
                        return TagDto.IAV_EXCHANGE_TOKEN;
                    case 6:
                        return TagDto.SUBMIT_QUEUED_DEPOSIT;
                    case 7:
                        return TagDto.SUBMIT_RECURRING_DEPOSIT;
                    case 8:
                        return TagDto.SKIP_RECURRING_DEPOSIT;
                    case 9:
                        return TagDto.SUBMIT_TRANSFER;
                    case 10:
                        return TagDto.LINK_DEBIT_CARD;
                    case 11:
                        return TagDto.VERIFY_DEBIT_CARD;
                    case 12:
                        return TagDto.DEBIT_CARD_LINKING_PRECHECK;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NetworkContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$TagDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TagDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TagDto, NetworkContext.Tag> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NetworkContext.Tag", TagDto.getEntries(), TagDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TagDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TagDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TagDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TagDto valueOf(String str) {
            return (TagDto) Enum.valueOf(TagDto.class, str);
        }

        public static TagDto[] values() {
            return (TagDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NetworkContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NetworkContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NetworkContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NetworkContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NetworkContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NetworkContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NetworkContextDto";
        }
    }
}
