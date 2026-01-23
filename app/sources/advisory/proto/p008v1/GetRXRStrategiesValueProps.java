package advisory.proto.p008v1;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: GetRXRStrategiesValueProps.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Ladvisory/proto/v1/GetRXRStrategiesValueProps;", "Lcom/squareup/wire/Message;", "", "image_url", "", "title", "value_props", "", "Ladvisory/proto/v1/ValuePropRow;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getImage_url", "()Ljava/lang/String;", "getTitle", "getDisclosure", "getValue_props", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRXRStrategiesValueProps extends Message {

    @JvmField
    public static final ProtoAdapter<GetRXRStrategiesValueProps> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "advisory.proto.v1.ValuePropRow#ADAPTER", jsonName = "valueProps", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ValuePropRow> value_props;

    public GetRXRStrategiesValueProps() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ GetRXRStrategiesValueProps(String str, String str2, List list, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4472newBuilder();
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRXRStrategiesValueProps(String image_url, String title, List<ValuePropRow> value_props, String disclosure, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_url = image_url;
        this.title = title;
        this.disclosure = disclosure;
        this.value_props = Internal.immutableCopyOf("value_props", value_props);
    }

    public final List<ValuePropRow> getValue_props() {
        return this.value_props;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4472newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRXRStrategiesValueProps)) {
            return false;
        }
        GetRXRStrategiesValueProps getRXRStrategiesValueProps = (GetRXRStrategiesValueProps) other;
        return Intrinsics.areEqual(unknownFields(), getRXRStrategiesValueProps.unknownFields()) && Intrinsics.areEqual(this.image_url, getRXRStrategiesValueProps.image_url) && Intrinsics.areEqual(this.title, getRXRStrategiesValueProps.title) && Intrinsics.areEqual(this.value_props, getRXRStrategiesValueProps.value_props) && Intrinsics.areEqual(this.disclosure, getRXRStrategiesValueProps.disclosure);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.image_url.hashCode()) * 37) + this.title.hashCode()) * 37) + this.value_props.hashCode()) * 37) + this.disclosure.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_url=" + Internal.sanitize(this.image_url));
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.value_props.isEmpty()) {
            arrayList.add("value_props=" + this.value_props);
        }
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRXRStrategiesValueProps{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRXRStrategiesValueProps copy$default(GetRXRStrategiesValueProps getRXRStrategiesValueProps, String str, String str2, List list, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRXRStrategiesValueProps.image_url;
        }
        if ((i & 2) != 0) {
            str2 = getRXRStrategiesValueProps.title;
        }
        if ((i & 4) != 0) {
            list = getRXRStrategiesValueProps.value_props;
        }
        if ((i & 8) != 0) {
            str3 = getRXRStrategiesValueProps.disclosure;
        }
        if ((i & 16) != 0) {
            byteString = getRXRStrategiesValueProps.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return getRXRStrategiesValueProps.copy(str, str2, list2, str3, byteString2);
    }

    public final GetRXRStrategiesValueProps copy(String image_url, String title, List<ValuePropRow> value_props, String disclosure, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRXRStrategiesValueProps(image_url, title, value_props, disclosure, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRXRStrategiesValueProps.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRXRStrategiesValueProps>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetRXRStrategiesValueProps$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRXRStrategiesValueProps value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                int iEncodedSizeWithTag = size + ValuePropRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getValue_props());
                return !Intrinsics.areEqual(value.getDisclosure(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRXRStrategiesValueProps value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ValuePropRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValue_props());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRXRStrategiesValueProps value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure());
                }
                ValuePropRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValue_props());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getImage_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetRXRStrategiesValueProps decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRXRStrategiesValueProps(strDecode, strDecode2, arrayList, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ValuePropRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRXRStrategiesValueProps redact(GetRXRStrategiesValueProps value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRXRStrategiesValueProps.copy$default(value, null, null, Internal.m26823redactElements(value.getValue_props(), ValuePropRow.ADAPTER), null, ByteString.EMPTY, 11, null);
            }
        };
    }
}
