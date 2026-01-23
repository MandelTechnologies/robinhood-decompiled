package search_coprocessor.p542v1;

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
import p479j$.time.Instant;

/* compiled from: GetSearchSubpageContentResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BE\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchSubpageContentResponse;", "Lcom/squareup/wire/Message;", "", "", "Lsearch_coprocessor/v1/HighlightItem;", "items", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "valid_until", "next_refresh_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lsearch_coprocessor/v1/GetSearchSubpageContentResponse;", "Lj$/time/Instant;", "getValid_until", "()Lj$/time/Instant;", "getNext_refresh_at", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GetSearchSubpageContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetSearchSubpageContentResponse> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.HighlightItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<HighlightItem> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextRefreshAt", schemaIndex = 2, tag = 3)
    private final Instant next_refresh_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "validUntil", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant valid_until;

    public GetSearchSubpageContentResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29959newBuilder();
    }

    public /* synthetic */ GetSearchSubpageContentResponse(List list, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getValid_until() {
        return this.valid_until;
    }

    public final Instant getNext_refresh_at() {
        return this.next_refresh_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchSubpageContentResponse(List<HighlightItem> items, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.valid_until = instant;
        this.next_refresh_at = instant2;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final List<HighlightItem> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29959newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSearchSubpageContentResponse)) {
            return false;
        }
        GetSearchSubpageContentResponse getSearchSubpageContentResponse = (GetSearchSubpageContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSearchSubpageContentResponse.unknownFields()) && Intrinsics.areEqual(this.items, getSearchSubpageContentResponse.items) && Intrinsics.areEqual(this.valid_until, getSearchSubpageContentResponse.valid_until) && Intrinsics.areEqual(this.next_refresh_at, getSearchSubpageContentResponse.next_refresh_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.items.hashCode()) * 37;
        Instant instant = this.valid_until;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.next_refresh_at;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        Instant instant = this.valid_until;
        if (instant != null) {
            arrayList.add("valid_until=" + instant);
        }
        Instant instant2 = this.next_refresh_at;
        if (instant2 != null) {
            arrayList.add("next_refresh_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSearchSubpageContentResponse{", "}", 0, null, null, 56, null);
    }

    public final GetSearchSubpageContentResponse copy(List<HighlightItem> items, Instant valid_until, Instant next_refresh_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSearchSubpageContentResponse(items, valid_until, next_refresh_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSearchSubpageContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSearchSubpageContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.GetSearchSubpageContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSearchSubpageContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + HighlightItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getItems());
                if (value.getValid_until() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getValid_until());
                }
                return size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getNext_refresh_at());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSearchSubpageContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                HighlightItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
                if (value.getValid_until() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getValid_until());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getNext_refresh_at());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSearchSubpageContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getNext_refresh_at());
                if (value.getValid_until() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getValid_until());
                }
                HighlightItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchSubpageContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSearchSubpageContentResponse(arrayList, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(HighlightItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchSubpageContentResponse redact(GetSearchSubpageContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<HighlightItem> listM26823redactElements = Internal.m26823redactElements(value.getItems(), HighlightItem.ADAPTER);
                Instant valid_until = value.getValid_until();
                Instant instantRedact = valid_until != null ? ProtoAdapter.INSTANT.redact(valid_until) : null;
                Instant next_refresh_at = value.getNext_refresh_at();
                return value.copy(listM26823redactElements, instantRedact, next_refresh_at != null ? ProtoAdapter.INSTANT.redact(next_refresh_at) : null, ByteString.EMPTY);
            }
        };
    }
}
