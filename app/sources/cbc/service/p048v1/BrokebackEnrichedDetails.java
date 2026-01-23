package cbc.service.p048v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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
import p479j$.time.Instant;

/* compiled from: BrokebackEnrichedDetails.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB-\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017¨\u0006 "}, m3636d2 = {"Lcbc/service/v1/BrokebackEnrichedDetails;", "Lcom/squareup/wire/Message;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "executed_at", "", "aggregation_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcbc/service/v1/BrokebackEnrichedDetails;", "Lj$/time/Instant;", "getExecuted_at", "()Lj$/time/Instant;", "Ljava/lang/String;", "getAggregation_id", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class BrokebackEnrichedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<BrokebackEnrichedDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "aggregationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String aggregation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "executedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant executed_at;

    public BrokebackEnrichedDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9086newBuilder();
    }

    public final Instant getExecuted_at() {
        return this.executed_at;
    }

    public final String getAggregation_id() {
        return this.aggregation_id;
    }

    public /* synthetic */ BrokebackEnrichedDetails(Instant instant, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrokebackEnrichedDetails(Instant instant, String aggregation_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.executed_at = instant;
        this.aggregation_id = aggregation_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9086newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrokebackEnrichedDetails)) {
            return false;
        }
        BrokebackEnrichedDetails brokebackEnrichedDetails = (BrokebackEnrichedDetails) other;
        return Intrinsics.areEqual(unknownFields(), brokebackEnrichedDetails.unknownFields()) && Intrinsics.areEqual(this.executed_at, brokebackEnrichedDetails.executed_at) && Intrinsics.areEqual(this.aggregation_id, brokebackEnrichedDetails.aggregation_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.executed_at;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.aggregation_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.executed_at;
        if (instant != null) {
            arrayList.add("executed_at=" + instant);
        }
        arrayList.add("aggregation_id=" + Internal.sanitize(this.aggregation_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrokebackEnrichedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BrokebackEnrichedDetails copy$default(BrokebackEnrichedDetails brokebackEnrichedDetails, Instant instant, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = brokebackEnrichedDetails.executed_at;
        }
        if ((i & 2) != 0) {
            str = brokebackEnrichedDetails.aggregation_id;
        }
        if ((i & 4) != 0) {
            byteString = brokebackEnrichedDetails.unknownFields();
        }
        return brokebackEnrichedDetails.copy(instant, str, byteString);
    }

    public final BrokebackEnrichedDetails copy(Instant executed_at, String aggregation_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BrokebackEnrichedDetails(executed_at, aggregation_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokebackEnrichedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrokebackEnrichedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cbc.service.v1.BrokebackEnrichedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrokebackEnrichedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getExecuted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getExecuted_at());
                }
                return !Intrinsics.areEqual(value.getAggregation_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAggregation_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrokebackEnrichedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getExecuted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getExecuted_at());
                }
                if (!Intrinsics.areEqual(value.getAggregation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAggregation_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrokebackEnrichedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAggregation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAggregation_id());
                }
                if (value.getExecuted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getExecuted_at());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrokebackEnrichedDetails redact(BrokebackEnrichedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant executed_at = value.getExecuted_at();
                return BrokebackEnrichedDetails.copy$default(value, executed_at != null ? ProtoAdapter.INSTANT.redact(executed_at) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrokebackEnrichedDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BrokebackEnrichedDetails(instantDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
