package gold.proto.p464v1;

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

/* compiled from: GoldSageTimeline.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JJ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lgold/proto/v1/GoldSageTimeline;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "timeline", "", "Lgold/proto/v1/GoldSageTimelineItem;", "cta_text", "cta_disclosure", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getCta_text", "getCta_disclosure", "getTimeline", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldSageTimeline extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSageTimeline> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosure", schemaIndex = 4, tag = 5)
    private final String cta_disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "gold.proto.v1.GoldSageTimelineItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<GoldSageTimelineItem> timeline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GoldSageTimeline() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GoldSageTimeline(String str, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28139newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getCta_disclosure() {
        return this.cta_disclosure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageTimeline(String title, String description_markdown, List<GoldSageTimelineItem> timeline, String cta_text, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description_markdown = description_markdown;
        this.cta_text = cta_text;
        this.cta_disclosure = str;
        this.timeline = Internal.immutableCopyOf("timeline", timeline);
    }

    public final List<GoldSageTimelineItem> getTimeline() {
        return this.timeline;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28139newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSageTimeline)) {
            return false;
        }
        GoldSageTimeline goldSageTimeline = (GoldSageTimeline) other;
        return Intrinsics.areEqual(unknownFields(), goldSageTimeline.unknownFields()) && Intrinsics.areEqual(this.title, goldSageTimeline.title) && Intrinsics.areEqual(this.description_markdown, goldSageTimeline.description_markdown) && Intrinsics.areEqual(this.timeline, goldSageTimeline.timeline) && Intrinsics.areEqual(this.cta_text, goldSageTimeline.cta_text) && Intrinsics.areEqual(this.cta_disclosure, goldSageTimeline.cta_disclosure);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description_markdown.hashCode()) * 37) + this.timeline.hashCode()) * 37) + this.cta_text.hashCode()) * 37;
        String str = this.cta_disclosure;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
        if (!this.timeline.isEmpty()) {
            arrayList.add("timeline=" + this.timeline);
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        String str = this.cta_disclosure;
        if (str != null) {
            arrayList.add("cta_disclosure=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSageTimeline{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldSageTimeline copy$default(GoldSageTimeline goldSageTimeline, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageTimeline.title;
        }
        if ((i & 2) != 0) {
            str2 = goldSageTimeline.description_markdown;
        }
        if ((i & 4) != 0) {
            list = goldSageTimeline.timeline;
        }
        if ((i & 8) != 0) {
            str3 = goldSageTimeline.cta_text;
        }
        if ((i & 16) != 0) {
            str4 = goldSageTimeline.cta_disclosure;
        }
        if ((i & 32) != 0) {
            byteString = goldSageTimeline.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return goldSageTimeline.copy(str, str2, list, str3, str5, byteString2);
    }

    public final GoldSageTimeline copy(String title, String description_markdown, List<GoldSageTimelineItem> timeline, String cta_text, String cta_disclosure, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSageTimeline(title, description_markdown, timeline, cta_text, cta_disclosure, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSageTimeline.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSageTimeline>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GoldSageTimeline$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSageTimeline value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription_markdown());
                }
                int iEncodedSizeWithTag = size + GoldSageTimelineItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getTimeline());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_text());
                }
                return iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCta_disclosure());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSageTimeline value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                GoldSageTimelineItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getTimeline());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCta_disclosure());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSageTimeline value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCta_disclosure());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                GoldSageTimelineItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getTimeline());
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageTimeline decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldSageTimeline(strDecode, strDecode4, arrayList, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(GoldSageTimelineItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageTimeline redact(GoldSageTimeline value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldSageTimeline.copy$default(value, null, null, Internal.m26823redactElements(value.getTimeline(), GoldSageTimelineItem.ADAPTER), null, null, ByteString.EMPTY, 27, null);
            }
        };
    }
}
