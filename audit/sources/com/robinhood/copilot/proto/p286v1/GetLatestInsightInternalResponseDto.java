package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.CopilotStatusDto;
import com.robinhood.copilot.proto.p286v1.GetLatestInsightInternalResponseDto;
import com.robinhood.copilot.proto.p286v1.InsightV2Dto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: GetLatestInsightInternalResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;)V", "", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "insights", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)V", "copy", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "getInsights", "()Ljava/util/List;", "getLast_updated_at", "()Lj$/time/Instant;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetLatestInsightInternalResponseDto implements Dto3<GetLatestInsightInternalResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLatestInsightInternalResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLatestInsightInternalResponseDto, GetLatestInsightInternalResponse>> binaryBase64Serializer$delegate;
    private static final GetLatestInsightInternalResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLatestInsightInternalResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLatestInsightInternalResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<InsightV2Dto> getInsights() {
        return this.surrogate.getInsights();
    }

    public final Instant getLast_updated_at() {
        return this.surrogate.getLast_updated_at();
    }

    public final CopilotStatusDto getCopilot_status() {
        return this.surrogate.getCopilot_status();
    }

    public /* synthetic */ GetLatestInsightInternalResponseDto(List list, Instant instant, CopilotStatusDto copilotStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetLatestInsightInternalResponseDto(List<InsightV2Dto> insights, Instant instant, CopilotStatusDto copilot_status) {
        this(new Surrogate(insights, instant, copilot_status));
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetLatestInsightInternalResponseDto copy$default(GetLatestInsightInternalResponseDto getLatestInsightInternalResponseDto, List list, Instant instant, CopilotStatusDto copilotStatusDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getLatestInsightInternalResponseDto.surrogate.getInsights();
        }
        if ((i & 2) != 0) {
            instant = getLatestInsightInternalResponseDto.surrogate.getLast_updated_at();
        }
        if ((i & 4) != 0) {
            copilotStatusDto = getLatestInsightInternalResponseDto.surrogate.getCopilot_status();
        }
        return getLatestInsightInternalResponseDto.copy(list, instant, copilotStatusDto);
    }

    public final GetLatestInsightInternalResponseDto copy(List<InsightV2Dto> insights, Instant last_updated_at, CopilotStatusDto copilot_status) {
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        return new GetLatestInsightInternalResponseDto(new Surrogate(insights, last_updated_at, copilot_status));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetLatestInsightInternalResponse toProto() {
        List<InsightV2Dto> insights = this.surrogate.getInsights();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(insights, 10));
        Iterator<T> it = insights.iterator();
        while (it.hasNext()) {
            arrayList.add(((InsightV2Dto) it.next()).toProto());
        }
        return new GetLatestInsightInternalResponse(arrayList, this.surrogate.getLast_updated_at(), (CopilotStatus) this.surrogate.getCopilot_status().toProto(), null, 8, null);
    }

    public String toString() {
        return "[GetLatestInsightInternalResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLatestInsightInternalResponseDto) && Intrinsics.areEqual(((GetLatestInsightInternalResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLatestInsightInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BQ\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JZ\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eRF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010 R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\"¨\u0006:"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "", "", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "insights", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copilot_status", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "copy", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInsights", "getInsights$annotations", "()V", "Lj$/time/Instant;", "getLast_updated_at", "getLast_updated_at$annotations", "Lcom/robinhood/copilot/proto/v1/CopilotStatusDto;", "getCopilot_status", "getCopilot_status$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final CopilotStatusDto copilot_status;
        private final List<InsightV2Dto> insights;
        private final Instant last_updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightInternalResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestInsightInternalResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((List) null, (Instant) null, (CopilotStatusDto) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InsightV2Dto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, Instant instant, CopilotStatusDto copilotStatusDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.insights;
            }
            if ((i & 2) != 0) {
                instant = surrogate.last_updated_at;
            }
            if ((i & 4) != 0) {
                copilotStatusDto = surrogate.copilot_status;
            }
            return surrogate.copy(list, instant, copilotStatusDto);
        }

        @SerialName("copilot_status")
        @JsonAnnotations2(names = {"copilot_status"})
        public static /* synthetic */ void getCopilot_status$annotations() {
        }

        @SerialName("insights")
        @JsonAnnotations2(names = {"insights"})
        public static /* synthetic */ void getInsights$annotations() {
        }

        @SerialName("last_updated_at")
        @JsonAnnotations2(names = {"last_updated_at"})
        public static /* synthetic */ void getLast_updated_at$annotations() {
        }

        public final List<InsightV2Dto> component1() {
            return this.insights;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        /* renamed from: component3, reason: from getter */
        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }

        public final Surrogate copy(List<InsightV2Dto> insights, Instant last_updated_at, CopilotStatusDto copilot_status) {
            Intrinsics.checkNotNullParameter(insights, "insights");
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            return new Surrogate(insights, last_updated_at, copilot_status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.insights, surrogate.insights) && Intrinsics.areEqual(this.last_updated_at, surrogate.last_updated_at) && this.copilot_status == surrogate.copilot_status;
        }

        public int hashCode() {
            int iHashCode = this.insights.hashCode() * 31;
            Instant instant = this.last_updated_at;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.copilot_status.hashCode();
        }

        public String toString() {
            return "Surrogate(insights=" + this.insights + ", last_updated_at=" + this.last_updated_at + ", copilot_status=" + this.copilot_status + ")";
        }

        /* compiled from: GetLatestInsightInternalResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLatestInsightInternalResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, Instant instant, CopilotStatusDto copilotStatusDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.insights = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
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
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.insights, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.insights);
            }
            Instant instant = self.last_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.copilot_status != CopilotStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CopilotStatusDto.Serializer.INSTANCE, self.copilot_status);
            }
        }

        public Surrogate(List<InsightV2Dto> insights, Instant instant, CopilotStatusDto copilot_status) {
            Intrinsics.checkNotNullParameter(insights, "insights");
            Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
            this.insights = insights;
            this.last_updated_at = instant;
            this.copilot_status = copilot_status;
        }

        public final List<InsightV2Dto> getInsights() {
            return this.insights;
        }

        public /* synthetic */ Surrogate(List list, Instant instant, CopilotStatusDto copilotStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatusDto.INSTANCE.getZeroValue() : copilotStatusDto);
        }

        public final Instant getLast_updated_at() {
            return this.last_updated_at;
        }

        public final CopilotStatusDto getCopilot_status() {
            return this.copilot_status;
        }
    }

    /* compiled from: GetLatestInsightInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetLatestInsightInternalResponseDto, GetLatestInsightInternalResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLatestInsightInternalResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestInsightInternalResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestInsightInternalResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLatestInsightInternalResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLatestInsightInternalResponse> getProtoAdapter() {
            return GetLatestInsightInternalResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestInsightInternalResponseDto getZeroValue() {
            return GetLatestInsightInternalResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestInsightInternalResponseDto fromProto(GetLatestInsightInternalResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<InsightV2> insights = proto.getInsights();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(insights, 10));
            Iterator<T> it = insights.iterator();
            while (it.hasNext()) {
                arrayList.add(InsightV2Dto.INSTANCE.fromProto((InsightV2) it.next()));
            }
            return new GetLatestInsightInternalResponseDto(new Surrogate(arrayList, proto.getLast_updated_at(), CopilotStatusDto.INSTANCE.fromProto(proto.getCopilot_status())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightInternalResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestInsightInternalResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetLatestInsightInternalResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLatestInsightInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLatestInsightInternalResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetLatestInsightInternalResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLatestInsightInternalResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLatestInsightInternalResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLatestInsightInternalResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetLatestInsightInternalResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetLatestInsightInternalResponseDto";
        }
    }
}
