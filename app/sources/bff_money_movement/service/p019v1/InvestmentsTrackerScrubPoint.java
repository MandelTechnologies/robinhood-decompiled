package bff_money_movement.service.p019v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerScrubPoint.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerScrubPoint;", "Lcom/squareup/wire/Message;", "", "point", "Lbff_money_movement/service/v1/Point2D;", "metadata", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointMetadata;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/Point2D;Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointMetadata;Lokio/ByteString;)V", "getPoint", "()Lbff_money_movement/service/v1/Point2D;", "getMetadata", "()Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointMetadata;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerScrubPoint extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerScrubPoint> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerScrubPointMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InvestmentsTrackerScrubPointMetadata metadata;

    @WireField(adapter = "bff_money_movement.service.v1.Point2D#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Point2D point;

    public InvestmentsTrackerScrubPoint() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8489newBuilder();
    }

    public final Point2D getPoint() {
        return this.point;
    }

    public final InvestmentsTrackerScrubPointMetadata getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ InvestmentsTrackerScrubPoint(Point2D point2D, InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : point2D, (i & 2) != 0 ? null : investmentsTrackerScrubPointMetadata, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerScrubPoint(Point2D point2D, InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.point = point2D;
        this.metadata = investmentsTrackerScrubPointMetadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8489newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerScrubPoint)) {
            return false;
        }
        InvestmentsTrackerScrubPoint investmentsTrackerScrubPoint = (InvestmentsTrackerScrubPoint) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerScrubPoint.unknownFields()) && Intrinsics.areEqual(this.point, investmentsTrackerScrubPoint.point) && Intrinsics.areEqual(this.metadata, investmentsTrackerScrubPoint.metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Point2D point2D = this.point;
        int iHashCode2 = (iHashCode + (point2D != null ? point2D.hashCode() : 0)) * 37;
        InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata = this.metadata;
        int iHashCode3 = iHashCode2 + (investmentsTrackerScrubPointMetadata != null ? investmentsTrackerScrubPointMetadata.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Point2D point2D = this.point;
        if (point2D != null) {
            arrayList.add("point=" + point2D);
        }
        InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata = this.metadata;
        if (investmentsTrackerScrubPointMetadata != null) {
            arrayList.add("metadata=" + investmentsTrackerScrubPointMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerScrubPoint{", "}", 0, null, null, 56, null);
    }

    public final InvestmentsTrackerScrubPoint copy(Point2D point, InvestmentsTrackerScrubPointMetadata metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerScrubPoint(point, metadata, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerScrubPoint.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerScrubPoint>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerScrubPoint$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerScrubPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPoint() != null) {
                    size += Point2D.ADAPTER.encodedSizeWithTag(1, value.getPoint());
                }
                return value.getMetadata() != null ? size + InvestmentsTrackerScrubPointMetadata.ADAPTER.encodedSizeWithTag(2, value.getMetadata()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerScrubPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPoint() != null) {
                    Point2D.ADAPTER.encodeWithTag(writer, 1, (int) value.getPoint());
                }
                if (value.getMetadata() != null) {
                    InvestmentsTrackerScrubPointMetadata.ADAPTER.encodeWithTag(writer, 2, (int) value.getMetadata());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerScrubPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMetadata() != null) {
                    InvestmentsTrackerScrubPointMetadata.ADAPTER.encodeWithTag(writer, 2, (int) value.getMetadata());
                }
                if (value.getPoint() != null) {
                    Point2D.ADAPTER.encodeWithTag(writer, 1, (int) value.getPoint());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerScrubPoint redact(InvestmentsTrackerScrubPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Point2D point = value.getPoint();
                Point2D point2DRedact = point != null ? Point2D.ADAPTER.redact(point) : null;
                InvestmentsTrackerScrubPointMetadata metadata = value.getMetadata();
                return value.copy(point2DRedact, metadata != null ? InvestmentsTrackerScrubPointMetadata.ADAPTER.redact(metadata) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerScrubPoint decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Point2D point2DDecode = null;
                InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerScrubPoint(point2DDecode, investmentsTrackerScrubPointMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        point2DDecode = Point2D.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        investmentsTrackerScrubPointMetadataDecode = InvestmentsTrackerScrubPointMetadata.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
