package equity_earnings.proto.p458v1;

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
import p479j$.time.Instant;

/* compiled from: Earning.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lequity_earnings/proto/v1/Earning;", "Lcom/squareup/wire/Message;", "", "", "actual", "expected", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "quarter", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Lj$/time/Instant;Lokio/ByteString;)Lequity_earnings/proto/v1/Earning;", "Ljava/lang/Float;", "getActual", "()Ljava/lang/Float;", "getExpected", "Lj$/time/Instant;", "getQuarter", "()Lj$/time/Instant;", "Companion", "equity_earnings.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Earning extends Message {

    @JvmField
    public static final ProtoAdapter<Earning> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 0, tag = 1)
    private final Float actual;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
    private final Float expected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant quarter;

    public Earning() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28011newBuilder();
    }

    public final Float getActual() {
        return this.actual;
    }

    public final Float getExpected() {
        return this.expected;
    }

    public final Instant getQuarter() {
        return this.quarter;
    }

    public /* synthetic */ Earning(Float f, Float f2, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Earning(Float f, Float f2, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.actual = f;
        this.expected = f2;
        this.quarter = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28011newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Earning)) {
            return false;
        }
        Earning earning = (Earning) other;
        return Intrinsics.areEqual(unknownFields(), earning.unknownFields()) && Intrinsics.areEqual(this.actual, earning.actual) && Intrinsics.areEqual(this.expected, earning.expected) && Intrinsics.areEqual(this.quarter, earning.quarter);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f = this.actual;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        Float f2 = this.expected;
        int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
        Instant instant = this.quarter;
        int iHashCode4 = iHashCode3 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Float f = this.actual;
        if (f != null) {
            arrayList.add("actual=" + f);
        }
        Float f2 = this.expected;
        if (f2 != null) {
            arrayList.add("expected=" + f2);
        }
        Instant instant = this.quarter;
        if (instant != null) {
            arrayList.add("quarter=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Earning{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Earning copy$default(Earning earning, Float f, Float f2, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = earning.actual;
        }
        if ((i & 2) != 0) {
            f2 = earning.expected;
        }
        if ((i & 4) != 0) {
            instant = earning.quarter;
        }
        if ((i & 8) != 0) {
            byteString = earning.unknownFields();
        }
        return earning.copy(f, f2, instant, byteString);
    }

    public final Earning copy(Float actual, Float expected, Instant quarter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Earning(actual, expected, quarter, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Earning.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Earning>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_earnings.proto.v1.Earning$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Earning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getActual()) + protoAdapter.encodedSizeWithTag(2, value.getExpected());
                return value.getQuarter() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getQuarter()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Earning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getActual());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getExpected());
                if (value.getQuarter() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getQuarter());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Earning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getQuarter() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getQuarter());
                }
                ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getExpected());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getActual());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Earning redact(Earning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant quarter = value.getQuarter();
                return Earning.copy$default(value, null, null, quarter != null ? ProtoAdapter.INSTANT.redact(quarter) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Earning decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Float fDecode = null;
                Float fDecode2 = null;
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Earning(fDecode, fDecode2, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else if (iNextTag == 2) {
                        fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
