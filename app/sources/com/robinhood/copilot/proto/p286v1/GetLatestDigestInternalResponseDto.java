package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.CopilotStatusDto;
import com.robinhood.copilot.proto.p286v1.DigestV2Dto;
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
import p479j$.time.Instant;

/* compiled from: GetLatestDigestInternalResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ5\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;)V", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", "(Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)V", "copy", "(Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "getDigest", "()Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "getLast_updated_at", "()Lj$/time/Instant;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetLatestDigestInternalResponseDto implements Dto3<GetLatestDigestInternalResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLatestDigestInternalResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLatestDigestInternalResponseDto, GetLatestDigestInternalResponse>> binaryBase64Serializer$delegate;
    private static final GetLatestDigestInternalResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLatestDigestInternalResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLatestDigestInternalResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DigestV2Dto getDigest() {
        return this.surrogate.getDigest();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public final CopilotStatusDto getCopilot_status() {
        return this.surrogate.getCopilot_status();
    }

    public /* synthetic */ GetLatestDigestInternalResponseDto(DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : digestV2Dto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetLatestDigestInternalResponseDto(DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilot_status) {
        this(new Surrogate(digestV2Dto, instant, copilot_status));
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
    }

    public static /* synthetic */ GetLatestDigestInternalResponseDto copy$default(GetLatestDigestInternalResponseDto getLatestDigestInternalResponseDto, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, int i, Object obj) {
        if ((i & 1) != 0) {
            digestV2Dto = getLatestDigestInternalResponseDto.surrogate.getDigest();
        }
        if ((i & 2) != 0) {
            instant = getLatestDigestInternalResponseDto.surrogate.getLast_updated_at();
        }
        if ((i & 4) != 0) {
            copilotStatusDto = getLatestDigestInternalResponseDto.surrogate.getCopilot_status();
        }
        return getLatestDigestInternalResponseDto.copy(digestV2Dto, instant, copilotStatusDto);
    }

    public final GetLatestDigestInternalResponseDto copy(DigestV2Dto digest, Instant last_updated_at, CopilotStatusDto copilot_status) {
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        return new GetLatestDigestInternalResponseDto(new Surrogate(digest, last_updated_at, copilot_status));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetLatestDigestInternalResponse toProto() {
        DigestV2Dto digest = this.surrogate.getDigest();
        return new GetLatestDigestInternalResponse(digest != null ? digest.toProto() : null, this.surrogate.getLast_updated_at(), (CopilotStatus) this.surrogate.getCopilot_status().toProto(), null, 8, null);
    }

    public String toString() {
        return "[GetLatestDigestInternalResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLatestDigestInternalResponseDto) && Intrinsics.areEqual(((GetLatestDigestInternalResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLatestDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB9\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001fR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010!¨\u00069"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copy", "(Lcom/robinhood/copilot/proto/v1/DigestV2Dto;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/copilot/proto/v1/DigestV2Dto;", "getDigest", "getDigest$annotations", "()V", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "getCopilot_status", "getCopilot_status$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CopilotStatusDto copilot_status;
        private final DigestV2Dto digest;
        private final Instant last_updated_at;

        public Surrogate() {
            this((DigestV2Dto) null, (Instant) null, (CopilotStatusDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, int i, Object obj) {
            if ((i & 1) != 0) {
                digestV2Dto = surrogate.digest;
            }
            if ((i & 2) != 0) {
                instant = surrogate.last_updated_at;
            }
            if ((i & 4) != 0) {
                copilotStatusDto = surrogate.copilot_status;
            }
            return surrogate.copy(digestV2Dto, instant, copilotStatusDto);
        }

        @SerialName("copilotStatus")
        @JsonAnnotations2(names = {"copilot_status"})
        public static /* synthetic */ void getCopilot_status$annotations() {
        }

        @SerialName("digest")
        @JsonAnnotations2(names = {"digest"})
        public static /* synthetic */ void getDigest$annotations() {
        }

        @SerialName("lastUpdatedAt")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DigestV2Dto getDigest() {
            return this.digest;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        /* renamed from: component3, reason: from getter */
        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }

        public final Surrogate copy(DigestV2Dto digest, Instant last_updated_at, CopilotStatusDto copilot_status) {
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            return new Surrogate(digest, last_updated_at, copilot_status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.digest, surrogate.digest) && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at) && this.copilot_status == surrogate.copilot_status;
        }

        public int hashCode() {
            DigestV2Dto digestV2Dto = this.digest;
            int iHashCode = (digestV2Dto == null ? 0 : digestV2Dto.hashCode()) * 31;
            Instant instant = this.last_updated_at;
            return ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 31) + this.copilot_status.hashCode();
        }

        public String toString() {
            return "Surrogate(digest=" + this.digest + ", last_updated_at=" + this.last_updated_at + ", copilot_status=" + this.copilot_status + ")";
        }

        /* compiled from: GetLatestDigestInternalResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLatestDigestInternalResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.digest = null;
            } else {
                this.digest = digestV2Dto;
            }
            if ((i & 2) == 0) {
                this.last_updated_at = null;
            } else {
                this.last_updated_at = instant;
            }
            if ((i & 4) == 0) {
                this.copilot_status = CopilotStatusDto.INSTANCE.getZeroValue();
            } else {
                this.copilot_status = copilotStatusDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DigestV2Dto digestV2Dto = self.digest;
            if (digestV2Dto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DigestV2Dto.Serializer.INSTANCE, digestV2Dto);
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.copilot_status != CopilotStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CopilotStatusDto.Serializer.INSTANCE, self.copilot_status);
            }
        }

        public Surrogate(DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilot_status) {
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            this.digest = digestV2Dto;
            this.last_updated_at = instant;
            this.copilot_status = copilot_status;
        }

        public final DigestV2Dto getDigest() {
            return this.digest;
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }

        public /* synthetic */ Surrogate(DigestV2Dto digestV2Dto, Instant instant, CopilotStatusDto copilotStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : digestV2Dto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto);
        }
    }

    /* compiled from: GetLatestDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetLatestDigestInternalResponseDto, GetLatestDigestInternalResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLatestDigestInternalResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestDigestInternalResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestDigestInternalResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLatestDigestInternalResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLatestDigestInternalResponse> getProtoAdapter() {
            return GetLatestDigestInternalResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestDigestInternalResponseDto getZeroValue() {
            return GetLatestDigestInternalResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestDigestInternalResponseDto fromProto(GetLatestDigestInternalResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DigestV2 digest = proto.getDigest();
            return new GetLatestDigestInternalResponseDto(new Surrogate(digest != null ? DigestV2Dto.INSTANCE.fromProto(digest) : null, proto.getLast_updated_at(), CopilotStatusDto.INSTANCE.fromProto(proto.getCopilot_status())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestDigestInternalResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestDigestInternalResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetLatestDigestInternalResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLatestDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLatestDigestInternalResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetLatestDigestInternalResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLatestDigestInternalResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLatestDigestInternalResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLatestDigestInternalResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetLatestDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetLatestDigestInternalResponseDto";
        }
    }
}
