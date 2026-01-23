package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: InstrumentDigestDetail.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", "Lcom/squareup/wire/Message;", "", "title", "", CarResultComposable2.BODY, "", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestBody;", "sources", "Lbonfire/proto/idl/copilot/v1/ArticleSource;", "disclosure_markdown", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure_markdown", "getBody", "()Ljava/util/List;", "getSources", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InstrumentDigestDetail extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentDigestDetail> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestBody#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<InstrumentDigestBody> body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclosure_markdown;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.ArticleSource#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ArticleSource> sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public InstrumentDigestDetail() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InstrumentDigestDetail(String str, List list, List list2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8869newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDigestDetail(String title, List<InstrumentDigestBody> body, List<ArticleSource> sources, String disclosure_markdown, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.disclosure_markdown = disclosure_markdown;
        this.body = Internal.immutableCopyOf(CarResultComposable2.BODY, body);
        this.sources = Internal.immutableCopyOf("sources", sources);
    }

    public final List<InstrumentDigestBody> getBody() {
        return this.body;
    }

    public final List<ArticleSource> getSources() {
        return this.sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8869newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentDigestDetail)) {
            return false;
        }
        InstrumentDigestDetail instrumentDigestDetail = (InstrumentDigestDetail) other;
        return Intrinsics.areEqual(unknownFields(), instrumentDigestDetail.unknownFields()) && Intrinsics.areEqual(this.title, instrumentDigestDetail.title) && Intrinsics.areEqual(this.body, instrumentDigestDetail.body) && Intrinsics.areEqual(this.sources, instrumentDigestDetail.sources) && Intrinsics.areEqual(this.disclosure_markdown, instrumentDigestDetail.disclosure_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.sources.hashCode()) * 37) + this.disclosure_markdown.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.body.isEmpty()) {
            arrayList.add("body=" + this.body);
        }
        if (!this.sources.isEmpty()) {
            arrayList.add("sources=" + this.sources);
        }
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentDigestDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InstrumentDigestDetail copy$default(InstrumentDigestDetail instrumentDigestDetail, String str, List list, List list2, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instrumentDigestDetail.title;
        }
        if ((i & 2) != 0) {
            list = instrumentDigestDetail.body;
        }
        if ((i & 4) != 0) {
            list2 = instrumentDigestDetail.sources;
        }
        if ((i & 8) != 0) {
            str2 = instrumentDigestDetail.disclosure_markdown;
        }
        if ((i & 16) != 0) {
            byteString = instrumentDigestDetail.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list3 = list2;
        return instrumentDigestDetail.copy(str, list, list3, str2, byteString2);
    }

    public final InstrumentDigestDetail copy(String title, List<InstrumentDigestBody> body, List<ArticleSource> sources, String disclosure_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentDigestDetail(title, body, sources, disclosure_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentDigestDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentDigestDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.InstrumentDigestDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentDigestDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + InstrumentDigestBody.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getBody()) + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSources());
                return !Intrinsics.areEqual(value.getDisclosure_markdown(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure_markdown()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentDigestDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                InstrumentDigestBody.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getBody());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSources());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentDigestDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSources());
                InstrumentDigestBody.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getBody());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDigestDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InstrumentDigestDetail(strDecode, arrayList, arrayList2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(InstrumentDigestBody.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(ArticleSource.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDigestDetail redact(InstrumentDigestDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InstrumentDigestDetail.copy$default(value, null, Internal.m26823redactElements(value.getBody(), InstrumentDigestBody.ADAPTER), Internal.m26823redactElements(value.getSources(), ArticleSource.ADAPTER), null, ByteString.EMPTY, 9, null);
            }
        };
    }
}
