package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.InsightDto;
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

/* compiled from: GetLatestInsightResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u0006\u0010\rJ+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;)V", "Lcom/robinhood/copilot/proto/v1/InsightDto;", "insight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "(Lcom/robinhood/copilot/proto/v1/InsightDto;Lj$/time/Instant;)V", "copy", "(Lcom/robinhood/copilot/proto/v1/InsightDto;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "getInsight", "()Lcom/robinhood/copilot/proto/v1/InsightDto;", "getLast_updated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetLatestInsightResponseDto implements Dto3<GetLatestInsightResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLatestInsightResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLatestInsightResponseDto, GetLatestInsightResponse>> binaryBase64Serializer$delegate;
    private static final GetLatestInsightResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLatestInsightResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLatestInsightResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InsightDto getInsight() {
        return this.surrogate.getInsight();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public GetLatestInsightResponseDto(InsightDto insightDto, Instant instant) {
        this(new Surrogate(insightDto, instant));
    }

    public /* synthetic */ GetLatestInsightResponseDto(InsightDto insightDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : insightDto, (i & 2) != 0 ? null : instant);
    }

    public static /* synthetic */ GetLatestInsightResponseDto copy$default(GetLatestInsightResponseDto getLatestInsightResponseDto, InsightDto insightDto, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            insightDto = getLatestInsightResponseDto.surrogate.getInsight();
        }
        if ((i & 2) != 0) {
            instant = getLatestInsightResponseDto.surrogate.getLast_updated_at();
        }
        return getLatestInsightResponseDto.copy(insightDto, instant);
    }

    public final GetLatestInsightResponseDto copy(InsightDto insight, Instant last_updated_at) {
        return new GetLatestInsightResponseDto(new Surrogate(insight, last_updated_at));
    }

    @Override // com.robinhood.idl.Dto
    public GetLatestInsightResponse toProto() {
        InsightDto insight = this.surrogate.getInsight();
        return new GetLatestInsightResponse(insight != null ? insight.toProto() : null, this.surrogate.getLast_updated_at(), null, 4, null);
    }

    public String toString() {
        return "[GetLatestInsightResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLatestInsightResponseDto) && Intrinsics.areEqual(((GetLatestInsightResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLatestInsightResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001c\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "", "Lcom/robinhood/copilot/proto/v1/InsightDto;", "insight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "<init>", "(Lcom/robinhood/copilot/proto/v1/InsightDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/copilot/proto/v1/InsightDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/copilot/proto/v1/InsightDto;", "component2", "()Lj$/time/Instant;", "copy", "(Lcom/robinhood/copilot/proto/v1/InsightDto;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/copilot/proto/v1/InsightDto;", "getInsight", "getInsight$annotations", "()V", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InsightDto insight;
        private final Instant last_updated_at;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((InsightDto) null, (Instant) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, InsightDto insightDto, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                insightDto = surrogate.insight;
            }
            if ((i & 2) != 0) {
                instant = surrogate.last_updated_at;
            }
            return surrogate.copy(insightDto, instant);
        }

        @SerialName("insight")
        @JsonAnnotations2(names = {"insight"})
        public static /* synthetic */ void getInsight$annotations() {
        }

        @SerialName("last_updated_at")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final InsightDto getInsight() {
            return this.insight;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final Surrogate copy(InsightDto insight, Instant last_updated_at) {
            return new Surrogate(insight, last_updated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.insight, surrogate.insight) && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at);
        }

        public int hashCode() {
            InsightDto insightDto = this.insight;
            int iHashCode = (insightDto == null ? 0 : insightDto.hashCode()) * 31;
            Instant instant = this.last_updated_at;
            return iHashCode + (instant != null ? instant.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(insight=" + this.insight + ", last_updated_at=" + this.last_updated_at + ")";
        }

        /* compiled from: GetLatestInsightResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLatestInsightResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InsightDto insightDto, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.insight = null;
            } else {
                this.insight = insightDto;
            }
            if ((i & 2) == 0) {
                this.last_updated_at = null;
            } else {
                this.last_updated_at = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            InsightDto insightDto = self.insight;
            if (insightDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, InsightDto.Serializer.INSTANCE, insightDto);
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(InsightDto insightDto, Instant instant) {
            this.insight = insightDto;
            this.last_updated_at = instant;
        }

        public /* synthetic */ Surrogate(InsightDto insightDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : insightDto, (i & 2) != 0 ? null : instant);
        }

        public final InsightDto getInsight() {
            return this.insight;
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }
    }

    /* compiled from: GetLatestInsightResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetLatestInsightResponseDto, GetLatestInsightResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLatestInsightResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestInsightResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestInsightResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLatestInsightResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLatestInsightResponse> getProtoAdapter() {
            return GetLatestInsightResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestInsightResponseDto getZeroValue() {
            return GetLatestInsightResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestInsightResponseDto fromProto(GetLatestInsightResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Insight insight = proto.getInsight();
            return new GetLatestInsightResponseDto(new Surrogate(insight != null ? InsightDto.INSTANCE.fromProto(insight) : null, proto.getLast_updated_at()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestInsightResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetLatestInsightResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLatestInsightResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLatestInsightResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetLatestInsightResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLatestInsightResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLatestInsightResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLatestInsightResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetLatestInsightResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetLatestInsightResponseDto";
        }
    }
}
