package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.PeerAverageDto;
import com.robinhood.copilot.proto.p286v1.TopAnalystPriceTargetsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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

/* compiled from: BottomSheetDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/BottomSheet;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate;)V", "content", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "(Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;)V", "getContent", "()Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "analyst_price_targets", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "getAnalyst_price_targets", "()Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "peer_average", "Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "getPeer_average", "()Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ContentDto", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class BottomSheetDto implements Dto3<BottomSheet>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BottomSheetDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BottomSheetDto, BottomSheet>> binaryBase64Serializer$delegate;
    private static final BottomSheetDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BottomSheetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BottomSheetDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ContentDto getContent() {
        if (this.surrogate.getAnalyst_price_targets() != null) {
            return new ContentDto.AnalystPriceTargets(this.surrogate.getAnalyst_price_targets());
        }
        if (this.surrogate.getPeer_average() != null) {
            return new ContentDto.PeerAverage(this.surrogate.getPeer_average());
        }
        return null;
    }

    public final TopAnalystPriceTargetsDto getAnalyst_price_targets() {
        return this.surrogate.getAnalyst_price_targets();
    }

    public final PeerAverageDto getPeer_average() {
        return this.surrogate.getPeer_average();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomSheetDto(ContentDto contentDto) {
        ContentDto.AnalystPriceTargets analystPriceTargets = contentDto instanceof ContentDto.AnalystPriceTargets ? (ContentDto.AnalystPriceTargets) contentDto : null;
        TopAnalystPriceTargetsDto value = analystPriceTargets != null ? analystPriceTargets.getValue() : null;
        ContentDto.PeerAverage peerAverage = contentDto instanceof ContentDto.PeerAverage ? (ContentDto.PeerAverage) contentDto : null;
        this(new Surrogate(value, peerAverage != null ? peerAverage.getValue() : null));
    }

    public /* synthetic */ BottomSheetDto(ContentDto contentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contentDto);
    }

    public static /* synthetic */ BottomSheetDto copy$default(BottomSheetDto bottomSheetDto, ContentDto contentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            contentDto = bottomSheetDto.getContent();
        }
        return bottomSheetDto.copy(contentDto);
    }

    public final BottomSheetDto copy(ContentDto content) {
        ContentDto.AnalystPriceTargets analystPriceTargets = content instanceof ContentDto.AnalystPriceTargets ? (ContentDto.AnalystPriceTargets) content : null;
        TopAnalystPriceTargetsDto value = analystPriceTargets != null ? analystPriceTargets.getValue() : null;
        ContentDto.PeerAverage peerAverage = content instanceof ContentDto.PeerAverage ? (ContentDto.PeerAverage) content : null;
        return new BottomSheetDto(new Surrogate(value, peerAverage != null ? peerAverage.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public BottomSheet toProto() {
        TopAnalystPriceTargetsDto analyst_price_targets = this.surrogate.getAnalyst_price_targets();
        TopAnalystPriceTargets proto = analyst_price_targets != null ? analyst_price_targets.toProto() : null;
        PeerAverageDto peer_average = this.surrogate.getPeer_average();
        return new BottomSheet(proto, peer_average != null ? peer_average.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[BottomSheetDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BottomSheetDto) && Intrinsics.areEqual(((BottomSheetDto) other).surrogate, this.surrogate);
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
    /* compiled from: BottomSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate;", "", "analyst_price_targets", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "peer_average", "Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "<init>", "(Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;Lcom/robinhood/copilot/proto/v1/PeerAverageDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;Lcom/robinhood/copilot/proto/v1/PeerAverageDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAnalyst_price_targets$annotations", "()V", "getAnalyst_price_targets", "()Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "getPeer_average$annotations", "getPeer_average", "()Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TopAnalystPriceTargetsDto analyst_price_targets;
        private final PeerAverageDto peer_average;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((TopAnalystPriceTargetsDto) null, (PeerAverageDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, PeerAverageDto peerAverageDto, int i, Object obj) {
            if ((i & 1) != 0) {
                topAnalystPriceTargetsDto = surrogate.analyst_price_targets;
            }
            if ((i & 2) != 0) {
                peerAverageDto = surrogate.peer_average;
            }
            return surrogate.copy(topAnalystPriceTargetsDto, peerAverageDto);
        }

        @SerialName("analystPriceTargets")
        @JsonAnnotations2(names = {"analyst_price_targets"})
        public static /* synthetic */ void getAnalyst_price_targets$annotations() {
        }

        @SerialName("peerAverage")
        @JsonAnnotations2(names = {"peer_average"})
        public static /* synthetic */ void getPeer_average$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TopAnalystPriceTargetsDto getAnalyst_price_targets() {
            return this.analyst_price_targets;
        }

        /* renamed from: component2, reason: from getter */
        public final PeerAverageDto getPeer_average() {
            return this.peer_average;
        }

        public final Surrogate copy(TopAnalystPriceTargetsDto analyst_price_targets, PeerAverageDto peer_average) {
            return new Surrogate(analyst_price_targets, peer_average);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.analyst_price_targets, surrogate.analyst_price_targets) && Intrinsics.areEqual(this.peer_average, surrogate.peer_average);
        }

        public int hashCode() {
            TopAnalystPriceTargetsDto topAnalystPriceTargetsDto = this.analyst_price_targets;
            int iHashCode = (topAnalystPriceTargetsDto == null ? 0 : topAnalystPriceTargetsDto.hashCode()) * 31;
            PeerAverageDto peerAverageDto = this.peer_average;
            return iHashCode + (peerAverageDto != null ? peerAverageDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(analyst_price_targets=" + this.analyst_price_targets + ", peer_average=" + this.peer_average + ")";
        }

        /* compiled from: BottomSheetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BottomSheetDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, PeerAverageDto peerAverageDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.analyst_price_targets = null;
            } else {
                this.analyst_price_targets = topAnalystPriceTargetsDto;
            }
            if ((i & 2) == 0) {
                this.peer_average = null;
            } else {
                this.peer_average = peerAverageDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            TopAnalystPriceTargetsDto topAnalystPriceTargetsDto = self.analyst_price_targets;
            if (topAnalystPriceTargetsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TopAnalystPriceTargetsDto.Serializer.INSTANCE, topAnalystPriceTargetsDto);
            }
            PeerAverageDto peerAverageDto = self.peer_average;
            if (peerAverageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PeerAverageDto.Serializer.INSTANCE, peerAverageDto);
            }
        }

        public Surrogate(TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, PeerAverageDto peerAverageDto) {
            this.analyst_price_targets = topAnalystPriceTargetsDto;
            this.peer_average = peerAverageDto;
        }

        public /* synthetic */ Surrogate(TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, PeerAverageDto peerAverageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : topAnalystPriceTargetsDto, (i & 2) != 0 ? null : peerAverageDto);
        }

        public final TopAnalystPriceTargetsDto getAnalyst_price_targets() {
            return this.analyst_price_targets;
        }

        public final PeerAverageDto getPeer_average() {
            return this.peer_average;
        }
    }

    /* compiled from: BottomSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto;", "Lcom/robinhood/copilot/proto/v1/BottomSheet;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/BottomSheetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BottomSheetDto, BottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BottomSheetDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetDto> getBinaryBase64Serializer() {
            return (KSerializer) BottomSheetDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BottomSheet> getProtoAdapter() {
            return BottomSheet.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetDto getZeroValue() {
            return BottomSheetDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetDto fromProto(BottomSheet proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TopAnalystPriceTargets analyst_price_targets = proto.getAnalyst_price_targets();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TopAnalystPriceTargetsDto topAnalystPriceTargetsDtoFromProto = analyst_price_targets != null ? TopAnalystPriceTargetsDto.INSTANCE.fromProto(analyst_price_targets) : null;
            PeerAverage peer_average = proto.getPeer_average();
            return new BottomSheetDto(new Surrogate(topAnalystPriceTargetsDtoFromProto, peer_average != null ? PeerAverageDto.INSTANCE.fromProto(peer_average) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.BottomSheetDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BottomSheetDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BottomSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "AnalystPriceTargets", "PeerAverage", "Companion", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto$AnalystPriceTargets;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto$PeerAverage;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BottomSheetDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto$AnalystPriceTargets;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "value", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "<init>", "(Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;)V", "getValue", "()Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargetsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AnalystPriceTargets extends ContentDto {
            private final TopAnalystPriceTargetsDto value;

            public static /* synthetic */ AnalystPriceTargets copy$default(AnalystPriceTargets analystPriceTargets, TopAnalystPriceTargetsDto topAnalystPriceTargetsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    topAnalystPriceTargetsDto = analystPriceTargets.value;
                }
                return analystPriceTargets.copy(topAnalystPriceTargetsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final TopAnalystPriceTargetsDto getValue() {
                return this.value;
            }

            public final AnalystPriceTargets copy(TopAnalystPriceTargetsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AnalystPriceTargets(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AnalystPriceTargets) && Intrinsics.areEqual(this.value, ((AnalystPriceTargets) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AnalystPriceTargets(value=" + this.value + ")";
            }

            public final TopAnalystPriceTargetsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnalystPriceTargets(TopAnalystPriceTargetsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto$PeerAverage;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "value", "Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "<init>", "(Lcom/robinhood/copilot/proto/v1/PeerAverageDto;)V", "getValue", "()Lcom/robinhood/copilot/proto/v1/PeerAverageDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PeerAverage extends ContentDto {
            private final PeerAverageDto value;

            public static /* synthetic */ PeerAverage copy$default(PeerAverage peerAverage, PeerAverageDto peerAverageDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    peerAverageDto = peerAverage.value;
                }
                return peerAverage.copy(peerAverageDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PeerAverageDto getValue() {
                return this.value;
            }

            public final PeerAverage copy(PeerAverageDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PeerAverage(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PeerAverage) && Intrinsics.areEqual(this.value, ((PeerAverage) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PeerAverage(value=" + this.value + ")";
            }

            public final PeerAverageDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PeerAverage(PeerAverageDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$ContentDto;", "Lcom/robinhood/copilot/proto/v1/BottomSheet;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ContentDto, BottomSheet> {
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
            public ProtoAdapter<BottomSheet> getProtoAdapter() {
                return BottomSheet.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentDto fromProto(BottomSheet proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getAnalyst_price_targets() != null) {
                    return new AnalystPriceTargets(TopAnalystPriceTargetsDto.INSTANCE.fromProto(proto.getAnalyst_price_targets()));
                }
                if (proto.getPeer_average() != null) {
                    return new PeerAverage(PeerAverageDto.INSTANCE.fromProto(proto.getPeer_average()));
                }
                return null;
            }
        }
    }

    /* compiled from: BottomSheetDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/BottomSheetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BottomSheetDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.BottomSheet", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BottomSheetDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BottomSheetDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BottomSheetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BottomSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.BottomSheetDto";
        }
    }
}
