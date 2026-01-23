package bonfire.proto.idl.crypto.p033v1;

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
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NewsfeedResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/NewsfeedResponse;", "Lcom/squareup/wire/Message;", "", "results", "", "Lbonfire/proto/idl/crypto/v1/Content;", "next", "", "previous", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrevious", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class NewsfeedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<NewsfeedResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String previous;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.Content#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 2)
    private final List<Content> results;

    public NewsfeedResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8958newBuilder();
    }

    public /* synthetic */ NewsfeedResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsfeedResponse(List<Content> results, String next, String previous, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = next;
        this.previous = previous;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<Content> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8958newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NewsfeedResponse)) {
            return false;
        }
        NewsfeedResponse newsfeedResponse = (NewsfeedResponse) other;
        return Intrinsics.areEqual(unknownFields(), newsfeedResponse.unknownFields()) && Intrinsics.areEqual(this.results, newsfeedResponse.results) && Intrinsics.areEqual(this.next, newsfeedResponse.next) && Intrinsics.areEqual(this.previous, newsfeedResponse.previous);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.results.hashCode()) * 37) + this.next.hashCode()) * 37) + this.previous.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        arrayList.add("next=" + Internal.sanitize(this.next));
        arrayList.add("previous=" + Internal.sanitize(this.previous));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewsfeedResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedResponse copy$default(NewsfeedResponse newsfeedResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedResponse.results;
        }
        if ((i & 2) != 0) {
            str = newsfeedResponse.next;
        }
        if ((i & 4) != 0) {
            str2 = newsfeedResponse.previous;
        }
        if ((i & 8) != 0) {
            byteString = newsfeedResponse.unknownFields();
        }
        return newsfeedResponse.copy(list, str, str2, byteString);
    }

    public final NewsfeedResponse copy(List<Content> results, String next, String previous, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NewsfeedResponse(results, next, previous, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NewsfeedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NewsfeedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.NewsfeedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NewsfeedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Content.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getResults());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNext());
                }
                return !Intrinsics.areEqual(value.getPrevious(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrevious()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NewsfeedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Content.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getResults());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext());
                }
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrevious());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NewsfeedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrevious());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext());
                }
                Content.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getResults());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NewsfeedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NewsfeedResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 2) {
                        arrayList.add(Content.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NewsfeedResponse redact(NewsfeedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NewsfeedResponse.copy$default(value, Internal.m26823redactElements(value.getResults(), Content.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
