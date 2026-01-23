package idl.idl_sample.proto.echo_microgram.p473v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Int32SumRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lidl/idl_sample/proto/echo_microgram/v1/Int32SumRequest;", "Lcom/squareup/wire/Message;", "", "summands", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getSummands", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "idl.sample.microgram.echo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Int32SumRequest extends Message {

    @JvmField
    public static final ProtoAdapter<Int32SumRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.PACKED, schemaIndex = 0, tag = 1)
    private final List<Integer> summands;

    /* JADX WARN: Multi-variable type inference failed */
    public Int32SumRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28440newBuilder();
    }

    public /* synthetic */ Int32SumRequest(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Int32SumRequest(List<Integer> summands, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(summands, "summands");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.summands = Internal.immutableCopyOf("summands", summands);
    }

    public final List<Integer> getSummands() {
        return this.summands;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28440newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Int32SumRequest)) {
            return false;
        }
        Int32SumRequest int32SumRequest = (Int32SumRequest) other;
        return Intrinsics.areEqual(unknownFields(), int32SumRequest.unknownFields()) && Intrinsics.areEqual(this.summands, int32SumRequest.summands);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.summands.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.summands.isEmpty()) {
            arrayList.add("summands=" + this.summands);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Int32SumRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Int32SumRequest copy$default(Int32SumRequest int32SumRequest, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = int32SumRequest.summands;
        }
        if ((i & 2) != 0) {
            byteString = int32SumRequest.unknownFields();
        }
        return int32SumRequest.copy(list, byteString);
    }

    public final Int32SumRequest copy(List<Integer> summands, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(summands, "summands");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Int32SumRequest(summands, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Int32SumRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Int32SumRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: idl.idl_sample.proto.echo_microgram.v1.Int32SumRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Int32SumRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, value.getSummands());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Int32SumRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, (int) value.getSummands());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Int32SumRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, (int) value.getSummands());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Int32SumRequest redact(Int32SumRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Int32SumRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Int32SumRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                List listEmptyList = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        break;
                    }
                    if (iNextTag == 1) {
                        if (listEmptyList == null) {
                            listEmptyList = new ArrayList((int) RangesKt.coerceAtMost(reader.nextFieldMinLengthInBytes() / 1, 2147483647L));
                        }
                        listEmptyList.add(ProtoAdapter.INT32.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
                ByteString byteStringEndMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(jBeginMessage);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                return new Int32SumRequest(listEmptyList, byteStringEndMessageAndGetUnknownFields);
            }
        };
    }
}
