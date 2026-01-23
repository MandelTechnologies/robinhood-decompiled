package gold_flow.proto.p466v1;

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

/* compiled from: GoldPromoPlanSection.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPromoPlanSection;", "Lcom/squareup/wire/Message;", "", "info_tag", "Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "title", "", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold_flow/proto/v1/GoldValuePropsInfoTag;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTag;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldPromoPlanSection extends Message {

    @JvmField
    public static final ProtoAdapter<GoldPromoPlanSection> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.GoldValuePropsInfoTag#ADAPTER", jsonName = "infoTag", schemaIndex = 0, tag = 1)
    private final GoldValuePropsInfoTag info_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String title;

    public GoldPromoPlanSection() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28168newBuilder();
    }

    public final GoldValuePropsInfoTag getInfo_tag() {
        return this.info_tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public /* synthetic */ GoldPromoPlanSection(GoldValuePropsInfoTag goldValuePropsInfoTag, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldValuePropsInfoTag, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPromoPlanSection(GoldValuePropsInfoTag goldValuePropsInfoTag, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.info_tag = goldValuePropsInfoTag;
        this.title = str;
        this.subtitle = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28168newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldPromoPlanSection)) {
            return false;
        }
        GoldPromoPlanSection goldPromoPlanSection = (GoldPromoPlanSection) other;
        return Intrinsics.areEqual(unknownFields(), goldPromoPlanSection.unknownFields()) && Intrinsics.areEqual(this.info_tag, goldPromoPlanSection.info_tag) && Intrinsics.areEqual(this.title, goldPromoPlanSection.title) && Intrinsics.areEqual(this.subtitle, goldPromoPlanSection.subtitle);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        int iHashCode2 = (iHashCode + (goldValuePropsInfoTag != null ? goldValuePropsInfoTag.hashCode() : 0)) * 37;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GoldValuePropsInfoTag goldValuePropsInfoTag = this.info_tag;
        if (goldValuePropsInfoTag != null) {
            arrayList.add("info_tag=" + goldValuePropsInfoTag);
        }
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldPromoPlanSection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldPromoPlanSection copy$default(GoldPromoPlanSection goldPromoPlanSection, GoldValuePropsInfoTag goldValuePropsInfoTag, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            goldValuePropsInfoTag = goldPromoPlanSection.info_tag;
        }
        if ((i & 2) != 0) {
            str = goldPromoPlanSection.title;
        }
        if ((i & 4) != 0) {
            str2 = goldPromoPlanSection.subtitle;
        }
        if ((i & 8) != 0) {
            byteString = goldPromoPlanSection.unknownFields();
        }
        return goldPromoPlanSection.copy(goldValuePropsInfoTag, str, str2, byteString);
    }

    public final GoldPromoPlanSection copy(GoldValuePropsInfoTag info_tag, String title, String subtitle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldPromoPlanSection(info_tag, title, subtitle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldPromoPlanSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldPromoPlanSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.GoldPromoPlanSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldPromoPlanSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + GoldValuePropsInfoTag.ADAPTER.encodedSizeWithTag(1, value.getInfo_tag());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getTitle()) + protoAdapter.encodedSizeWithTag(3, value.getSubtitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldPromoPlanSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 1, (int) value.getInfo_tag());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldPromoPlanSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                GoldValuePropsInfoTag.ADAPTER.encodeWithTag(writer, 1, (int) value.getInfo_tag());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPromoPlanSection redact(GoldPromoPlanSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldValuePropsInfoTag info_tag = value.getInfo_tag();
                return GoldPromoPlanSection.copy$default(value, info_tag != null ? GoldValuePropsInfoTag.ADAPTER.redact(info_tag) : null, null, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldPromoPlanSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GoldValuePropsInfoTag goldValuePropsInfoTagDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldPromoPlanSection(goldValuePropsInfoTagDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        goldValuePropsInfoTagDecode = GoldValuePropsInfoTag.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
