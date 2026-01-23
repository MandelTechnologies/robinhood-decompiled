package advisory.proto.p008v1;

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

/* compiled from: GetTaxGainsAndLossesAccountSnapshot.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JJ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshot;", "Lcom/squareup/wire/Message;", "", "account_number", "", "sections", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesSection;", "account_display_name", "account_icon", "disclosure_markdown", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getAccount_display_name", "getAccount_icon", "getDisclosure_markdown", "getSections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxGainsAndLossesAccountSnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxGainsAndLossesAccountSnapshot> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountIcon", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 4, tag = 5)
    private final String disclosure_markdown;

    @WireField(adapter = "advisory.proto.v1.GetTaxGainsAndLossesSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<GetTaxGainsAndLossesSection> sections;

    public GetTaxGainsAndLossesAccountSnapshot() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetTaxGainsAndLossesAccountSnapshot(String str, List list, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4481newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getAccount_display_name() {
        return this.account_display_name;
    }

    public final String getAccount_icon() {
        return this.account_icon;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxGainsAndLossesAccountSnapshot(String account_number, List<GetTaxGainsAndLossesSection> sections, String account_display_name, String account_icon, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(account_display_name, "account_display_name");
        Intrinsics.checkNotNullParameter(account_icon, "account_icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.account_display_name = account_display_name;
        this.account_icon = account_icon;
        this.disclosure_markdown = str;
        this.sections = Internal.immutableCopyOf("sections", sections);
    }

    public final List<GetTaxGainsAndLossesSection> getSections() {
        return this.sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4481newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxGainsAndLossesAccountSnapshot)) {
            return false;
        }
        GetTaxGainsAndLossesAccountSnapshot getTaxGainsAndLossesAccountSnapshot = (GetTaxGainsAndLossesAccountSnapshot) other;
        return Intrinsics.areEqual(unknownFields(), getTaxGainsAndLossesAccountSnapshot.unknownFields()) && Intrinsics.areEqual(this.account_number, getTaxGainsAndLossesAccountSnapshot.account_number) && Intrinsics.areEqual(this.sections, getTaxGainsAndLossesAccountSnapshot.sections) && Intrinsics.areEqual(this.account_display_name, getTaxGainsAndLossesAccountSnapshot.account_display_name) && Intrinsics.areEqual(this.account_icon, getTaxGainsAndLossesAccountSnapshot.account_icon) && Intrinsics.areEqual(this.disclosure_markdown, getTaxGainsAndLossesAccountSnapshot.disclosure_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.sections.hashCode()) * 37) + this.account_display_name.hashCode()) * 37) + this.account_icon.hashCode()) * 37;
        String str = this.disclosure_markdown;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        if (!this.sections.isEmpty()) {
            arrayList.add("sections=" + this.sections);
        }
        arrayList.add("account_display_name=" + Internal.sanitize(this.account_display_name));
        arrayList.add("account_icon=" + Internal.sanitize(this.account_icon));
        String str = this.disclosure_markdown;
        if (str != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxGainsAndLossesAccountSnapshot{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTaxGainsAndLossesAccountSnapshot copy$default(GetTaxGainsAndLossesAccountSnapshot getTaxGainsAndLossesAccountSnapshot, String str, List list, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTaxGainsAndLossesAccountSnapshot.account_number;
        }
        if ((i & 2) != 0) {
            list = getTaxGainsAndLossesAccountSnapshot.sections;
        }
        if ((i & 4) != 0) {
            str2 = getTaxGainsAndLossesAccountSnapshot.account_display_name;
        }
        if ((i & 8) != 0) {
            str3 = getTaxGainsAndLossesAccountSnapshot.account_icon;
        }
        if ((i & 16) != 0) {
            str4 = getTaxGainsAndLossesAccountSnapshot.disclosure_markdown;
        }
        if ((i & 32) != 0) {
            byteString = getTaxGainsAndLossesAccountSnapshot.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return getTaxGainsAndLossesAccountSnapshot.copy(str, list, str2, str3, str5, byteString2);
    }

    public final GetTaxGainsAndLossesAccountSnapshot copy(String account_number, List<GetTaxGainsAndLossesSection> sections, String account_display_name, String account_icon, String disclosure_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(account_display_name, "account_display_name");
        Intrinsics.checkNotNullParameter(account_icon, "account_icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxGainsAndLossesAccountSnapshot(account_number, sections, account_display_name, account_icon, disclosure_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxGainsAndLossesAccountSnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxGainsAndLossesAccountSnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxGainsAndLossesAccountSnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                int iEncodedSizeWithTag = size + GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSections());
                if (!Intrinsics.areEqual(value.getAccount_display_name(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_display_name());
                }
                if (!Intrinsics.areEqual(value.getAccount_icon(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_icon());
                }
                return iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxGainsAndLossesAccountSnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSections());
                if (!Intrinsics.areEqual(value.getAccount_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_display_name());
                }
                if (!Intrinsics.areEqual(value.getAccount_icon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_icon());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxGainsAndLossesAccountSnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                if (!Intrinsics.areEqual(value.getAccount_icon(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getAccount_icon());
                }
                if (!Intrinsics.areEqual(value.getAccount_display_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_display_name());
                }
                GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSections());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxGainsAndLossesAccountSnapshot decode(ProtoReader reader) throws IOException {
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
                        return new GetTaxGainsAndLossesAccountSnapshot(strDecode, arrayList, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(GetTaxGainsAndLossesSection.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
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
            public GetTaxGainsAndLossesAccountSnapshot redact(GetTaxGainsAndLossesAccountSnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetTaxGainsAndLossesAccountSnapshot.copy$default(value, null, Internal.m26823redactElements(value.getSections(), GetTaxGainsAndLossesSection.ADAPTER), null, null, null, ByteString.EMPTY, 29, null);
            }
        };
    }
}
