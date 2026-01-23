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

/* compiled from: GetSearchHighlightsResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Be\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJk\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b'\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b(\u0010&¨\u0006*"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponse;", "Lcom/squareup/wire/Message;", "", "", "Lsearch_coprocessor/v1/HighlightItem;", "items", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "valid_until", "next_refresh_at", "", "templates_to_exclude", "Lsearch_coprocessor/v1/SearchSubpage;", "subpages", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)Lsearch_coprocessor/v1/GetSearchHighlightsResponse;", "Lj$/time/Instant;", "getValid_until", "()Lj$/time/Instant;", "getNext_refresh_at", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getTemplates_to_exclude", "getSubpages", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GetSearchHighlightsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetSearchHighlightsResponse> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.HighlightItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<HighlightItem> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextRefreshAt", schemaIndex = 2, tag = 3)
    private final Instant next_refresh_at;

    @WireField(adapter = "search_coprocessor.v1.SearchSubpage#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<SearchSubpage> subpages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "templatesToExclude", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> templates_to_exclude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "validUntil", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant valid_until;

    public GetSearchHighlightsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29957newBuilder();
    }

    public /* synthetic */ GetSearchHighlightsResponse(List list, Instant instant, Instant instant2, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getValid_until() {
        return this.valid_until;
    }

    public final Instant getNext_refresh_at() {
        return this.next_refresh_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchHighlightsResponse(List<HighlightItem> items, Instant instant, Instant instant2, List<String> templates_to_exclude, List<SearchSubpage> subpages, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(templates_to_exclude, "templates_to_exclude");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.valid_until = instant;
        this.next_refresh_at = instant2;
        this.items = Internal.immutableCopyOf("items", items);
        this.templates_to_exclude = Internal.immutableCopyOf("templates_to_exclude", templates_to_exclude);
        this.subpages = Internal.immutableCopyOf("subpages", subpages);
    }

    public final List<HighlightItem> getItems() {
        return this.items;
    }

    public final List<String> getTemplates_to_exclude() {
        return this.templates_to_exclude;
    }

    public final List<SearchSubpage> getSubpages() {
        return this.subpages;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29957newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSearchHighlightsResponse)) {
            return false;
        }
        GetSearchHighlightsResponse getSearchHighlightsResponse = (GetSearchHighlightsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSearchHighlightsResponse.unknownFields()) && Intrinsics.areEqual(this.items, getSearchHighlightsResponse.items) && Intrinsics.areEqual(this.valid_until, getSearchHighlightsResponse.valid_until) && Intrinsics.areEqual(this.next_refresh_at, getSearchHighlightsResponse.next_refresh_at) && Intrinsics.areEqual(this.templates_to_exclude, getSearchHighlightsResponse.templates_to_exclude) && Intrinsics.areEqual(this.subpages, getSearchHighlightsResponse.subpages);
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
        int iHashCode3 = ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.templates_to_exclude.hashCode()) * 37) + this.subpages.hashCode();
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
        if (!this.templates_to_exclude.isEmpty()) {
            arrayList.add("templates_to_exclude=" + Internal.sanitize(this.templates_to_exclude));
        }
        if (!this.subpages.isEmpty()) {
            arrayList.add("subpages=" + this.subpages);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSearchHighlightsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetSearchHighlightsResponse copy$default(GetSearchHighlightsResponse getSearchHighlightsResponse, List list, Instant instant, Instant instant2, List list2, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSearchHighlightsResponse.items;
        }
        if ((i & 2) != 0) {
            instant = getSearchHighlightsResponse.valid_until;
        }
        if ((i & 4) != 0) {
            instant2 = getSearchHighlightsResponse.next_refresh_at;
        }
        if ((i & 8) != 0) {
            list2 = getSearchHighlightsResponse.templates_to_exclude;
        }
        if ((i & 16) != 0) {
            list3 = getSearchHighlightsResponse.subpages;
        }
        if ((i & 32) != 0) {
            byteString = getSearchHighlightsResponse.unknownFields();
        }
        List list4 = list3;
        ByteString byteString2 = byteString;
        return getSearchHighlightsResponse.copy(list, instant, instant2, list2, list4, byteString2);
    }

    public final GetSearchHighlightsResponse copy(List<HighlightItem> items, Instant valid_until, Instant next_refresh_at, List<String> templates_to_exclude, List<SearchSubpage> subpages, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(templates_to_exclude, "templates_to_exclude");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSearchHighlightsResponse(items, valid_until, next_refresh_at, templates_to_exclude, subpages, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSearchHighlightsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSearchHighlightsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.GetSearchHighlightsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSearchHighlightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + HighlightItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getItems());
                if (value.getValid_until() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getValid_until());
                }
                return size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getNext_refresh_at()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.getTemplates_to_exclude()) + SearchSubpage.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getSubpages());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSearchHighlightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                HighlightItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
                if (value.getValid_until() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getValid_until());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getNext_refresh_at());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, (int) value.getTemplates_to_exclude());
                SearchSubpage.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getSubpages());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSearchHighlightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SearchSubpage.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getSubpages());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, (int) value.getTemplates_to_exclude());
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getNext_refresh_at());
                if (value.getValid_until() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getValid_until());
                }
                HighlightItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchHighlightsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSearchHighlightsResponse(arrayList, instantDecode, instantDecode2, arrayList2, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(HighlightItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 5) {
                        arrayList3.add(SearchSubpage.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchHighlightsResponse redact(GetSearchHighlightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getItems(), HighlightItem.ADAPTER);
                Instant valid_until = value.getValid_until();
                Instant instantRedact = valid_until != null ? ProtoAdapter.INSTANT.redact(valid_until) : null;
                Instant next_refresh_at = value.getNext_refresh_at();
                return GetSearchHighlightsResponse.copy$default(value, listM26823redactElements, instantRedact, next_refresh_at != null ? ProtoAdapter.INSTANT.redact(next_refresh_at) : null, null, Internal.m26823redactElements(value.getSubpages(), SearchSubpage.ADAPTER), ByteString.EMPTY, 8, null);
            }
        };
    }
}
