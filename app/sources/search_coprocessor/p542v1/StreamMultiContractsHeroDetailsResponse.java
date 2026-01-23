package search_coprocessor.p542v1;

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

/* compiled from: StreamMultiContractsHeroDetailsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsResponse;", "Lcom/squareup/wire/Message;", "", "value", "Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsearch_coprocessor/v1/MultiContractsHeroDetails;Lokio/ByteString;)V", "getValue", "()Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class StreamMultiContractsHeroDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamMultiContractsHeroDetailsResponse> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.MultiContractsHeroDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MultiContractsHeroDetails value;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamMultiContractsHeroDetailsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29997newBuilder();
    }

    public final MultiContractsHeroDetails getValue() {
        return this.value;
    }

    public /* synthetic */ StreamMultiContractsHeroDetailsResponse(MultiContractsHeroDetails multiContractsHeroDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multiContractsHeroDetails, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamMultiContractsHeroDetailsResponse(MultiContractsHeroDetails multiContractsHeroDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.value = multiContractsHeroDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29997newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamMultiContractsHeroDetailsResponse)) {
            return false;
        }
        StreamMultiContractsHeroDetailsResponse streamMultiContractsHeroDetailsResponse = (StreamMultiContractsHeroDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamMultiContractsHeroDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.value, streamMultiContractsHeroDetailsResponse.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MultiContractsHeroDetails multiContractsHeroDetails = this.value;
        int iHashCode2 = iHashCode + (multiContractsHeroDetails != null ? multiContractsHeroDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MultiContractsHeroDetails multiContractsHeroDetails = this.value;
        if (multiContractsHeroDetails != null) {
            arrayList.add("value=" + multiContractsHeroDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamMultiContractsHeroDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamMultiContractsHeroDetailsResponse copy(MultiContractsHeroDetails value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamMultiContractsHeroDetailsResponse(value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamMultiContractsHeroDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamMultiContractsHeroDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.StreamMultiContractsHeroDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamMultiContractsHeroDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getValue() != null ? size + MultiContractsHeroDetails.ADAPTER.encodedSizeWithTag(1, value.getValue()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamMultiContractsHeroDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getValue() != null) {
                    MultiContractsHeroDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getValue());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamMultiContractsHeroDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getValue() != null) {
                    MultiContractsHeroDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getValue());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamMultiContractsHeroDetailsResponse redact(StreamMultiContractsHeroDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MultiContractsHeroDetails value2 = value.getValue();
                return value.copy(value2 != null ? MultiContractsHeroDetails.ADAPTER.redact(value2) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamMultiContractsHeroDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MultiContractsHeroDetails multiContractsHeroDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamMultiContractsHeroDetailsResponse(multiContractsHeroDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        multiContractsHeroDetailsDecode = MultiContractsHeroDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
