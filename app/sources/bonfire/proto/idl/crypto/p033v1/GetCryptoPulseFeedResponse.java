package bonfire.proto.idl.crypto.p033v1;

import com.plaid.internal.EnumC7081g;
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
import rh_server_driven_ui.p531v1.Text;

/* compiled from: GetCryptoPulseFeedResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJc\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponse;", "Lcom/squareup/wire/Message;", "", "", "title", "subtitle", "Lrh_server_driven_ui/v1/Text;", "disclosure_text", "", "has_signed_agreement", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "", "sorted_currency_pair_ids", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Text;ZLj$/time/Instant;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Text;ZLj$/time/Instant;Ljava/util/List;Lokio/ByteString;)Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponse;", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lrh_server_driven_ui/v1/Text;", "getDisclosure_text", "()Lrh_server_driven_ui/v1/Text;", "Z", "getHas_signed_agreement", "()Z", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "Ljava/util/List;", "getSorted_currency_pair_ids", "()Ljava/util/List;", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoPulseFeedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoPulseFeedResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Text#ADAPTER", jsonName = "disclosureText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Text disclosure_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSignedAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean has_signed_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortedCurrencyPairIds", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<String> sorted_currency_pair_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant updated_at;

    public GetCryptoPulseFeedResponse() {
        this(null, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetCryptoPulseFeedResponse(String str, String str2, Text text, boolean z, Instant instant, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : text, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8923newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Text getDisclosure_text() {
        return this.disclosure_text;
    }

    public final boolean getHas_signed_agreement() {
        return this.has_signed_agreement;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulseFeedResponse(String title, String subtitle, Text text, boolean z, Instant instant, List<String> sorted_currency_pair_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sorted_currency_pair_ids, "sorted_currency_pair_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure_text = text;
        this.has_signed_agreement = z;
        this.updated_at = instant;
        this.sorted_currency_pair_ids = Internal.immutableCopyOf("sorted_currency_pair_ids", sorted_currency_pair_ids);
    }

    public final List<String> getSorted_currency_pair_ids() {
        return this.sorted_currency_pair_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8923newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoPulseFeedResponse)) {
            return false;
        }
        GetCryptoPulseFeedResponse getCryptoPulseFeedResponse = (GetCryptoPulseFeedResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoPulseFeedResponse.unknownFields()) && Intrinsics.areEqual(this.title, getCryptoPulseFeedResponse.title) && Intrinsics.areEqual(this.subtitle, getCryptoPulseFeedResponse.subtitle) && Intrinsics.areEqual(this.disclosure_text, getCryptoPulseFeedResponse.disclosure_text) && this.has_signed_agreement == getCryptoPulseFeedResponse.has_signed_agreement && Intrinsics.areEqual(this.updated_at, getCryptoPulseFeedResponse.updated_at) && Intrinsics.areEqual(this.sorted_currency_pair_ids, getCryptoPulseFeedResponse.sorted_currency_pair_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        Text text = this.disclosure_text;
        int iHashCode2 = (((iHashCode + (text != null ? text.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_signed_agreement)) * 37;
        Instant instant = this.updated_at;
        int iHashCode3 = ((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.sorted_currency_pair_ids.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        Text text = this.disclosure_text;
        if (text != null) {
            arrayList.add("disclosure_text=" + text);
        }
        arrayList.add("has_signed_agreement=" + this.has_signed_agreement);
        Instant instant = this.updated_at;
        if (instant != null) {
            arrayList.add("updated_at=" + instant);
        }
        if (!this.sorted_currency_pair_ids.isEmpty()) {
            arrayList.add("sorted_currency_pair_ids=" + Internal.sanitize(this.sorted_currency_pair_ids));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoPulseFeedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoPulseFeedResponse copy$default(GetCryptoPulseFeedResponse getCryptoPulseFeedResponse, String str, String str2, Text text, boolean z, Instant instant, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCryptoPulseFeedResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = getCryptoPulseFeedResponse.subtitle;
        }
        if ((i & 4) != 0) {
            text = getCryptoPulseFeedResponse.disclosure_text;
        }
        if ((i & 8) != 0) {
            z = getCryptoPulseFeedResponse.has_signed_agreement;
        }
        if ((i & 16) != 0) {
            instant = getCryptoPulseFeedResponse.updated_at;
        }
        if ((i & 32) != 0) {
            list = getCryptoPulseFeedResponse.sorted_currency_pair_ids;
        }
        if ((i & 64) != 0) {
            byteString = getCryptoPulseFeedResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        Text text2 = text;
        return getCryptoPulseFeedResponse.copy(str, str2, text2, z, instant2, list2, byteString2);
    }

    public final GetCryptoPulseFeedResponse copy(String title, String subtitle, Text disclosure_text, boolean has_signed_agreement, Instant updated_at, List<String> sorted_currency_pair_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sorted_currency_pair_ids, "sorted_currency_pair_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoPulseFeedResponse(title, subtitle, disclosure_text, has_signed_agreement, updated_at, sorted_currency_pair_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoPulseFeedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoPulseFeedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoPulseFeedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (value.getDisclosure_text() != null) {
                    size += Text.ADAPTER.encodedSizeWithTag(3, value.getDisclosure_text());
                }
                if (value.getHas_signed_agreement()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getUpdated_at());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.getSorted_currency_pair_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoPulseFeedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (value.getDisclosure_text() != null) {
                    Text.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisclosure_text());
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, (int) value.getSorted_currency_pair_ids());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getSorted_currency_pair_ids());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getDisclosure_text() != null) {
                    Text.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisclosure_text());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                String strDecode2 = "";
                Text textDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                textDecode = Text.ADAPTER.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetCryptoPulseFeedResponse(strDecode, strDecode2, textDecode, zBooleanValue, instantDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedResponse redact(GetCryptoPulseFeedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Text disclosure_text = value.getDisclosure_text();
                Text textRedact = disclosure_text != null ? Text.ADAPTER.redact(disclosure_text) : null;
                Instant updated_at = value.getUpdated_at();
                return GetCryptoPulseFeedResponse.copy$default(value, null, null, textRedact, false, updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, null, ByteString.EMPTY, 43, null);
            }
        };
    }
}
