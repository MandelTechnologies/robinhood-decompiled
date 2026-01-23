package bff_money_movement.service.p019v1;

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

/* compiled from: StandardScreenData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/StandardScreenData;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "disclosure_markdown", "lottie_info", "Lbff_money_movement/service/v1/LottieInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/LottieInfo;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getDisclosure_markdown", "getLottie_info", "()Lbff_money_movement/service/v1/LottieInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class StandardScreenData extends Message {

    @JvmField
    public static final ProtoAdapter<StandardScreenData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 2, tag = 3)
    private final String disclosure_markdown;

    @WireField(adapter = "bff_money_movement.service.v1.LottieInfo#ADAPTER", jsonName = "lottieInfo", schemaIndex = 3, tag = 4)
    private final LottieInfo lottie_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public StandardScreenData() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ StandardScreenData(String str, String str2, String str3, LottieInfo lottieInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : lottieInfo, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8513newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final LottieInfo getLottie_info() {
        return this.lottie_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardScreenData(String title, String subtitle_markdown, String str, LottieInfo lottieInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = subtitle_markdown;
        this.disclosure_markdown = str;
        this.lottie_info = lottieInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8513newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StandardScreenData)) {
            return false;
        }
        StandardScreenData standardScreenData = (StandardScreenData) other;
        return Intrinsics.areEqual(unknownFields(), standardScreenData.unknownFields()) && Intrinsics.areEqual(this.title, standardScreenData.title) && Intrinsics.areEqual(this.subtitle_markdown, standardScreenData.subtitle_markdown) && Intrinsics.areEqual(this.disclosure_markdown, standardScreenData.disclosure_markdown) && Intrinsics.areEqual(this.lottie_info, standardScreenData.lottie_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle_markdown.hashCode()) * 37;
        String str = this.disclosure_markdown;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        LottieInfo lottieInfo = this.lottie_info;
        int iHashCode3 = iHashCode2 + (lottieInfo != null ? lottieInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle_markdown=" + Internal.sanitize(this.subtitle_markdown));
        String str = this.disclosure_markdown;
        if (str != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str));
        }
        LottieInfo lottieInfo = this.lottie_info;
        if (lottieInfo != null) {
            arrayList.add("lottie_info=" + lottieInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StandardScreenData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StandardScreenData copy$default(StandardScreenData standardScreenData, String str, String str2, String str3, LottieInfo lottieInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = standardScreenData.title;
        }
        if ((i & 2) != 0) {
            str2 = standardScreenData.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            str3 = standardScreenData.disclosure_markdown;
        }
        if ((i & 8) != 0) {
            lottieInfo = standardScreenData.lottie_info;
        }
        if ((i & 16) != 0) {
            byteString = standardScreenData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return standardScreenData.copy(str, str2, str4, lottieInfo, byteString2);
    }

    public final StandardScreenData copy(String title, String subtitle_markdown, String disclosure_markdown, LottieInfo lottie_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StandardScreenData(title, subtitle_markdown, disclosure_markdown, lottie_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StandardScreenData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StandardScreenData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.StandardScreenData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StandardScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle_markdown());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclosure_markdown()) + LottieInfo.ADAPTER.encodedSizeWithTag(4, value.getLottie_info());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StandardScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                LottieInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getLottie_info());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StandardScreenData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LottieInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getLottie_info());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclosure_markdown());
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StandardScreenData redact(StandardScreenData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LottieInfo lottie_info = value.getLottie_info();
                return StandardScreenData.copy$default(value, null, null, null, lottie_info != null ? LottieInfo.ADAPTER.redact(lottie_info) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StandardScreenData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                LottieInfo lottieInfoDecode = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StandardScreenData(strDecode, strDecode3, strDecode2, lottieInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        lottieInfoDecode = LottieInfo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
