package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
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
import rh_server_driven_ui.p531v1.DirectionDto;
import rh_server_driven_ui.p531v1.LineDto;
import rh_server_driven_ui.p531v1.SegmentDto;

/* compiled from: LineDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013JI\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Line;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/LineDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/LineDto$Surrogate;)V", "", "identifier", "", "Lrh_server_driven_ui/v1/SegmentDto;", "segments", "Lrh_server_driven_ui/v1/DirectionDto;", "direction", "", "is_primary", "", "draw_layer", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/DirectionDto;ZLjava/lang/Float;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/DirectionDto;ZLjava/lang/Float;)Lrh_server_driven_ui/v1/LineDto;", "toProto", "()Lrh_server_driven_ui/v1/Line;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/LineDto$Surrogate;", "getSegments", "()Ljava/util/List;", "()Z", "getDraw_layer", "()Ljava/lang/Float;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class LineDto implements Dto3<Line>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LineDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LineDto, Line>> binaryBase64Serializer$delegate;
    private static final LineDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LineDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LineDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<SegmentDto> getSegments() {
        return this.surrogate.getSegments();
    }

    public final boolean is_primary() {
        return this.surrogate.getIs_primary();
    }

    public final Float getDraw_layer() {
        return this.surrogate.getDraw_layer();
    }

    public /* synthetic */ LineDto(String str, List list, DirectionDto directionDto, boolean z, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineDto(String str, List<SegmentDto> segments, DirectionDto direction, boolean z, Float f) {
        this(new Surrogate(str, segments, direction, z, f));
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public static /* synthetic */ LineDto copy$default(LineDto lineDto, String str, List list, DirectionDto directionDto, boolean z, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineDto.surrogate.getIdentifier();
        }
        if ((i & 2) != 0) {
            list = lineDto.surrogate.getSegments();
        }
        if ((i & 4) != 0) {
            directionDto = lineDto.surrogate.getDirection();
        }
        if ((i & 8) != 0) {
            z = lineDto.surrogate.getIs_primary();
        }
        if ((i & 16) != 0) {
            f = lineDto.surrogate.getDraw_layer();
        }
        Float f2 = f;
        DirectionDto directionDto2 = directionDto;
        return lineDto.copy(str, list, directionDto2, z, f2);
    }

    public final LineDto copy(String identifier, List<SegmentDto> segments, DirectionDto direction, boolean is_primary, Float draw_layer) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new LineDto(new Surrogate(identifier, segments, direction, is_primary, draw_layer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Line toProto() {
        String identifier = this.surrogate.getIdentifier();
        List<SegmentDto> segments = this.surrogate.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            arrayList.add(((SegmentDto) it.next()).toProto());
        }
        return new Line(identifier, arrayList, (Direction) this.surrogate.getDirection().toProto(), this.surrogate.getIs_primary(), this.surrogate.getDraw_layer(), null, 32, null);
    }

    public String toString() {
        return "[LineDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LineDto) && Intrinsics.areEqual(((LineDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LineDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BR\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011BQ\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b5\u0010*\u001a\u0004\b\n\u00104R1\u0010\u000f\u001a\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00106\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto$Surrogate;", "", "", "identifier", "", "Lrh_server_driven_ui/v1/SegmentDto;", "segments", "Lrh_server_driven_ui/v1/DirectionDto;", "direction", "", "is_primary", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "draw_layer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/DirectionDto;ZLjava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/DirectionDto;ZLjava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/LineDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "()V", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "getSegments$annotations", "Lrh_server_driven_ui/v1/DirectionDto;", "getDirection", "()Lrh_server_driven_ui/v1/DirectionDto;", "getDirection$annotations", "Z", "()Z", "is_primary$annotations", "Ljava/lang/Float;", "getDraw_layer", "()Ljava/lang/Float;", "getDraw_layer$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {
        private final DirectionDto direction;
        private final Float draw_layer;
        private final String identifier;
        private final boolean is_primary;
        private final List<SegmentDto> segments;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.LineDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (DirectionDto) null, false, (Float) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SegmentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.segments, surrogate.segments) && this.direction == surrogate.direction && this.is_primary == surrogate.is_primary && Intrinsics.areEqual((Object) this.draw_layer, (Object) surrogate.draw_layer);
        }

        public int hashCode() {
            String str = this.identifier;
            int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.segments.hashCode()) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.is_primary)) * 31;
            Float f = this.draw_layer;
            return iHashCode + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(identifier=" + this.identifier + ", segments=" + this.segments + ", direction=" + this.direction + ", is_primary=" + this.is_primary + ", draw_layer=" + this.draw_layer + ")";
        }

        /* compiled from: LineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/LineDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LineDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, DirectionDto directionDto, boolean z, Float f, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.identifier = null;
            } else {
                this.identifier = str;
            }
            if ((i & 2) == 0) {
                this.segments = CollectionsKt.emptyList();
            } else {
                this.segments = list;
            }
            if ((i & 4) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 8) == 0) {
                this.is_primary = false;
            } else {
                this.is_primary = z;
            }
            if ((i & 16) == 0) {
                this.draw_layer = null;
            } else {
                this.draw_layer = f;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.segments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.segments);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            boolean z = self.is_primary;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            Float f = self.draw_layer;
            if (f != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, f);
            }
        }

        public Surrogate(String str, List<SegmentDto> segments, DirectionDto direction, boolean z, Float f) {
            Intrinsics.checkNotNullParameter(segments, "segments");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.identifier = str;
            this.segments = segments;
            this.direction = direction;
            this.is_primary = z;
            this.draw_layer = f;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final List<SegmentDto> getSegments() {
            return this.segments;
        }

        public /* synthetic */ Surrogate(String str, List list, DirectionDto directionDto, boolean z, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : f);
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: is_primary, reason: from getter */
        public final boolean getIs_primary() {
            return this.is_primary;
        }

        public final Float getDraw_layer() {
            return this.draw_layer;
        }
    }

    /* compiled from: LineDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/LineDto;", "Lrh_server_driven_ui/v1/Line;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/LineDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LineDto, Line> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LineDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineDto> getBinaryBase64Serializer() {
            return (KSerializer) LineDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Line> getProtoAdapter() {
            return Line.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineDto getZeroValue() {
            return LineDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineDto fromProto(Line proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String identifier = proto.getIdentifier();
            List<Segment> segments = proto.getSegments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                arrayList.add(SegmentDto.INSTANCE.fromProto((Segment) it.next()));
            }
            return new LineDto(new Surrogate(identifier, arrayList, DirectionDto.INSTANCE.fromProto(proto.getDirection()), proto.getIs_primary(), proto.getDraw_layer()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.LineDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new LineDto(null, null, null, false, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LineDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/LineDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/LineDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LineDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Line", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LineDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LineDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LineDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LineDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.LineDto";
        }
    }
}
