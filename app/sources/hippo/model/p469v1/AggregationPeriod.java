package hippo.model.p469v1;

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

/* compiled from: AggregationPeriod.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lhippo/model/v1/AggregationPeriod;", "Lcom/squareup/wire/Message;", "", "duration", "", "duration_type", "Lhippo/model/v1/DurationTypeUnit;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILhippo/model/v1/DurationTypeUnit;Lokio/ByteString;)V", "getDuration", "()I", "getDuration_type", "()Lhippo/model/v1/DurationTypeUnit;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AggregationPeriod extends Message {

    @JvmField
    public static final ProtoAdapter<AggregationPeriod> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int duration;

    @WireField(adapter = "hippo.model.v1.DurationTypeUnit#ADAPTER", jsonName = "durationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DurationTypeUnit duration_type;

    public AggregationPeriod() {
        this(0, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28228newBuilder();
    }

    public final int getDuration() {
        return this.duration;
    }

    public final DurationTypeUnit getDuration_type() {
        return this.duration_type;
    }

    public /* synthetic */ AggregationPeriod(int i, DurationTypeUnit durationTypeUnit, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED : durationTypeUnit, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregationPeriod(int i, DurationTypeUnit duration_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.duration = i;
        this.duration_type = duration_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28228newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AggregationPeriod)) {
            return false;
        }
        AggregationPeriod aggregationPeriod = (AggregationPeriod) other;
        return Intrinsics.areEqual(unknownFields(), aggregationPeriod.unknownFields()) && this.duration == aggregationPeriod.duration && this.duration_type == aggregationPeriod.duration_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.duration)) * 37) + this.duration_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duration=" + this.duration);
        arrayList.add("duration_type=" + this.duration_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AggregationPeriod{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AggregationPeriod copy$default(AggregationPeriod aggregationPeriod, int i, DurationTypeUnit durationTypeUnit, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aggregationPeriod.duration;
        }
        if ((i2 & 2) != 0) {
            durationTypeUnit = aggregationPeriod.duration_type;
        }
        if ((i2 & 4) != 0) {
            byteString = aggregationPeriod.unknownFields();
        }
        return aggregationPeriod.copy(i, durationTypeUnit, byteString);
    }

    public final AggregationPeriod copy(int duration, DurationTypeUnit duration_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AggregationPeriod(duration, duration_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AggregationPeriod.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AggregationPeriod>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.AggregationPeriod$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AggregationPeriod value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDuration() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getDuration()));
                }
                return value.getDuration_type() != DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED ? size + DurationTypeUnit.ADAPTER.encodedSizeWithTag(2, value.getDuration_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AggregationPeriod value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDuration() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getDuration()));
                }
                if (value.getDuration_type() != DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED) {
                    DurationTypeUnit.ADAPTER.encodeWithTag(writer, 2, (int) value.getDuration_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AggregationPeriod value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDuration_type() != DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED) {
                    DurationTypeUnit.ADAPTER.encodeWithTag(writer, 2, (int) value.getDuration_type());
                }
                if (value.getDuration() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getDuration()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AggregationPeriod decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DurationTypeUnit durationTypeUnitDecode = DurationTypeUnit.DURATION_TYPE_UNIT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AggregationPeriod(iIntValue, durationTypeUnitDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        try {
                            durationTypeUnitDecode = DurationTypeUnit.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AggregationPeriod redact(AggregationPeriod value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AggregationPeriod.copy$default(value, 0, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
