package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.StrategiesDigestDto;
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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;)V", "", "payload", ErrorBundle.SUMMARY_ENTRY, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "strategies_digest", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;)Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "getPayload", "getSummary", "getLast_updated_at", "()Lj$/time/Instant;", "getStrategies_digest", "()Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetLatestPulseDigestInternalResponseDto implements Dto3<GetLatestPulseDigestInternalResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLatestPulseDigestInternalResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLatestPulseDigestInternalResponseDto, GetLatestPulseDigestInternalResponse>> binaryBase64Serializer$delegate;
    private static final GetLatestPulseDigestInternalResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLatestPulseDigestInternalResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLatestPulseDigestInternalResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPayload() {
        return this.surrogate.getPayload();
    }

    public final String getSummary() {
        return this.surrogate.getSummary();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public final StrategiesDigestDto getStrategies_digest() {
        return this.surrogate.getStrategies_digest();
    }

    public /* synthetic */ GetLatestPulseDigestInternalResponseDto(String str, String str2, Instant instant, StrategiesDigestDto strategiesDigestDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : strategiesDigestDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetLatestPulseDigestInternalResponseDto(String payload, String summary, Instant instant, StrategiesDigestDto strategiesDigestDto) {
        this(new Surrogate(payload, summary, instant, strategiesDigestDto));
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(summary, "summary");
    }

    public static /* synthetic */ GetLatestPulseDigestInternalResponseDto copy$default(GetLatestPulseDigestInternalResponseDto getLatestPulseDigestInternalResponseDto, String str, String str2, Instant instant, StrategiesDigestDto strategiesDigestDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestPulseDigestInternalResponseDto.surrogate.getPayload();
        }
        if ((i & 2) != 0) {
            str2 = getLatestPulseDigestInternalResponseDto.surrogate.getSummary();
        }
        if ((i & 4) != 0) {
            instant = getLatestPulseDigestInternalResponseDto.surrogate.getLast_updated_at();
        }
        if ((i & 8) != 0) {
            strategiesDigestDto = getLatestPulseDigestInternalResponseDto.surrogate.getStrategies_digest();
        }
        return getLatestPulseDigestInternalResponseDto.copy(str, str2, instant, strategiesDigestDto);
    }

    public final GetLatestPulseDigestInternalResponseDto copy(String payload, String summary, Instant last_updated_at, StrategiesDigestDto strategies_digest) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new GetLatestPulseDigestInternalResponseDto(new Surrogate(payload, summary, last_updated_at, strategies_digest));
    }

    @Override // com.robinhood.idl.Dto
    public GetLatestPulseDigestInternalResponse toProto() {
        String payload = this.surrogate.getPayload();
        String summary = this.surrogate.getSummary();
        Instant last_updated_at = this.surrogate.getLast_updated_at();
        StrategiesDigestDto strategies_digest = this.surrogate.getStrategies_digest();
        return new GetLatestPulseDigestInternalResponse(payload, summary, last_updated_at, strategies_digest != null ? strategies_digest.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetLatestPulseDigestInternalResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLatestPulseDigestInternalResponseDto) && Intrinsics.areEqual(((GetLatestPulseDigestInternalResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ6\u0010 \u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001eRF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "", "", "payload", ErrorBundle.SUMMARY_ENTRY, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "strategies_digest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;)Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPayload", "getPayload$annotations", "()V", "getSummary", "getSummary$annotations", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "getStrategies_digest", "getStrategies_digest$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant last_updated_at;
        private final String payload;
        private final StrategiesDigestDto strategies_digest;
        private final String summary;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (StrategiesDigestDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, StrategiesDigestDto strategiesDigestDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.payload;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.summary;
            }
            if ((i & 4) != 0) {
                instant = surrogate.last_updated_at;
            }
            if ((i & 8) != 0) {
                strategiesDigestDto = surrogate.strategies_digest;
            }
            return surrogate.copy(str, str2, instant, strategiesDigestDto);
        }

        @SerialName("lastUpdatedAt")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        @SerialName("payload")
        @JsonAnnotations2(names = {"payload"})
        public static /* synthetic */ void getPayload$annotations() {
        }

        @SerialName("strategiesDigest")
        @JsonAnnotations2(names = {"strategies_digest"})
        public static /* synthetic */ void getStrategies_digest$annotations() {
        }

        @SerialName(ErrorBundle.SUMMARY_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.SUMMARY_ENTRY})
        public static /* synthetic */ void getSummary$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final StrategiesDigestDto getStrategies_digest() {
            return this.strategies_digest;
        }

        public final Surrogate copy(String payload, String summary, Instant last_updated_at, StrategiesDigestDto strategies_digest) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Surrogate(payload, summary, last_updated_at, strategies_digest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.payload, surrogate.payload) && Intrinsics.areEqual(this.summary, surrogate.summary) && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at) && Intrinsics.areEqual(this.strategies_digest, surrogate.strategies_digest);
        }

        public int hashCode() {
            int iHashCode = ((this.payload.hashCode() * 31) + this.summary.hashCode()) * 31;
            Instant instant = this.last_updated_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            StrategiesDigestDto strategiesDigestDto = this.strategies_digest;
            return iHashCode2 + (strategiesDigestDto != null ? strategiesDigestDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(payload=" + this.payload + ", summary=" + this.summary + ", last_updated_at=" + this.last_updated_at + ", strategies_digest=" + this.strategies_digest + ")";
        }

        /* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLatestPulseDigestInternalResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, StrategiesDigestDto strategiesDigestDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.payload = "";
            } else {
                this.payload = str;
            }
            if ((i & 2) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
            if ((i & 4) == 0) {
                this.last_updated_at = null;
            } else {
                this.last_updated_at = instant;
            }
            if ((i & 8) == 0) {
                this.strategies_digest = null;
            } else {
                this.strategies_digest = strategiesDigestDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.payload, "")) {
                output.encodeStringElement(serialDesc, 0, self.payload);
            }
            if (!Intrinsics.areEqual(self.summary, "")) {
                output.encodeStringElement(serialDesc, 1, self.summary);
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            StrategiesDigestDto strategiesDigestDto = self.strategies_digest;
            if (strategiesDigestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StrategiesDigestDto.Serializer.INSTANCE, strategiesDigestDto);
            }
        }

        public Surrogate(String payload, String summary, Instant instant, StrategiesDigestDto strategiesDigestDto) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.payload = payload;
            this.summary = summary;
            this.last_updated_at = instant;
            this.strategies_digest = strategiesDigestDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, StrategiesDigestDto strategiesDigestDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : strategiesDigestDto);
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final StrategiesDigestDto getStrategies_digest() {
            return this.strategies_digest;
        }
    }

    /* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetLatestPulseDigestInternalResponseDto, GetLatestPulseDigestInternalResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLatestPulseDigestInternalResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestPulseDigestInternalResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestPulseDigestInternalResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLatestPulseDigestInternalResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLatestPulseDigestInternalResponse> getProtoAdapter() {
            return GetLatestPulseDigestInternalResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestPulseDigestInternalResponseDto getZeroValue() {
            return GetLatestPulseDigestInternalResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestPulseDigestInternalResponseDto fromProto(GetLatestPulseDigestInternalResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String payload = proto.getPayload();
            String summary = proto.getSummary();
            Instant last_updated_at = proto.getLast_updated_at();
            StrategiesDigest strategies_digest = proto.getStrategies_digest();
            return new GetLatestPulseDigestInternalResponseDto(new Surrogate(payload, summary, last_updated_at, strategies_digest != null ? StrategiesDigestDto.INSTANCE.fromProto(strategies_digest) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestPulseDigestInternalResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestPulseDigestInternalResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetLatestPulseDigestInternalResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLatestPulseDigestInternalResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetLatestPulseDigestInternalResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLatestPulseDigestInternalResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLatestPulseDigestInternalResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLatestPulseDigestInternalResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetLatestPulseDigestInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetLatestPulseDigestInternalResponseDto";
        }
    }
}
