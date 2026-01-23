package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: StreamSuggestedActionContentResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016Jd\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSuggestedActionContentResponse;", "Lcom/squareup/wire/Message;", "", "asset_path", "", "title", "description", "disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/Cta;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_path", "()Ljava/lang/String;", "getTitle", "getDescription", "getDisclosure_markdown", "getCta", "()Lgold_flow/proto/v1/Cta;", "getSecondary_cta", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamSuggestedActionContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSuggestedActionContentResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPath", schemaIndex = 0, tag = 1)
    private final String asset_path;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 4, tag = 5)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", schemaIndex = 3, tag = 4)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 5, tag = 6)
    private final Cta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String title;

    public StreamSuggestedActionContentResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28214newBuilder();
    }

    public final String getAsset_path() {
        return this.asset_path;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public /* synthetic */ StreamSuggestedActionContentResponse(String str, String str2, String str3, String str4, Cta cta, Cta cta2, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : cta, (i & 32) != 0 ? null : cta2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSuggestedActionContentResponse(String str, String str2, String str3, String str4, Cta cta, Cta cta2, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_path = str;
        this.title = str2;
        this.description = str3;
        this.disclosure_markdown = str4;
        this.cta = cta;
        this.secondary_cta = cta2;
        this.logging_identifier = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28214newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSuggestedActionContentResponse)) {
            return false;
        }
        StreamSuggestedActionContentResponse streamSuggestedActionContentResponse = (StreamSuggestedActionContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSuggestedActionContentResponse.unknownFields()) && Intrinsics.areEqual(this.asset_path, streamSuggestedActionContentResponse.asset_path) && Intrinsics.areEqual(this.title, streamSuggestedActionContentResponse.title) && Intrinsics.areEqual(this.description, streamSuggestedActionContentResponse.description) && Intrinsics.areEqual(this.disclosure_markdown, streamSuggestedActionContentResponse.disclosure_markdown) && Intrinsics.areEqual(this.cta, streamSuggestedActionContentResponse.cta) && Intrinsics.areEqual(this.secondary_cta, streamSuggestedActionContentResponse.secondary_cta) && Intrinsics.areEqual(this.logging_identifier, streamSuggestedActionContentResponse.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.asset_path;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.disclosure_markdown;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode6 = (iHashCode5 + (cta != null ? cta.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode7 = (iHashCode6 + (cta2 != null ? cta2.hashCode() : 0)) * 37;
        String str5 = this.logging_identifier;
        int iHashCode8 = iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_path;
        if (str != null) {
            arrayList.add("asset_path=" + Internal.sanitize(str));
        }
        String str2 = this.title;
        if (str2 != null) {
            arrayList.add("title=" + Internal.sanitize(str2));
        }
        String str3 = this.description;
        if (str3 != null) {
            arrayList.add("description=" + Internal.sanitize(str3));
        }
        String str4 = this.disclosure_markdown;
        if (str4 != null) {
            arrayList.add("disclosure_markdown=" + Internal.sanitize(str4));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        String str5 = this.logging_identifier;
        if (str5 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSuggestedActionContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSuggestedActionContentResponse copy$default(StreamSuggestedActionContentResponse streamSuggestedActionContentResponse, String str, String str2, String str3, String str4, Cta cta, Cta cta2, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamSuggestedActionContentResponse.asset_path;
        }
        if ((i & 2) != 0) {
            str2 = streamSuggestedActionContentResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = streamSuggestedActionContentResponse.description;
        }
        if ((i & 8) != 0) {
            str4 = streamSuggestedActionContentResponse.disclosure_markdown;
        }
        if ((i & 16) != 0) {
            cta = streamSuggestedActionContentResponse.cta;
        }
        if ((i & 32) != 0) {
            cta2 = streamSuggestedActionContentResponse.secondary_cta;
        }
        if ((i & 64) != 0) {
            str5 = streamSuggestedActionContentResponse.logging_identifier;
        }
        if ((i & 128) != 0) {
            byteString = streamSuggestedActionContentResponse.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        Cta cta3 = cta;
        Cta cta4 = cta2;
        return streamSuggestedActionContentResponse.copy(str, str2, str3, str4, cta3, cta4, str6, byteString2);
    }

    public final StreamSuggestedActionContentResponse copy(String asset_path, String title, String description, String disclosure_markdown, Cta cta, Cta secondary_cta, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSuggestedActionContentResponse(asset_path, title, description, disclosure_markdown, cta, secondary_cta, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSuggestedActionContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSuggestedActionContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamSuggestedActionContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSuggestedActionContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getAsset_path()) + protoAdapter.encodedSizeWithTag(2, value.getTitle()) + protoAdapter.encodedSizeWithTag(3, value.getDescription()) + protoAdapter.encodedSizeWithTag(4, value.getDisclosure_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getCta()) + protoAdapter2.encodedSizeWithTag(6, value.getSecondary_cta()) + protoAdapter.encodedSizeWithTag(7, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSuggestedActionContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_path());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSuggestedActionContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisclosure_markdown());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_path());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSuggestedActionContentResponse redact(StreamSuggestedActionContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                return StreamSuggestedActionContentResponse.copy$default(value, null, null, null, null, ctaRedact, secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null, null, ByteString.EMPTY, 79, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamSuggestedActionContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                Cta ctaDecode = null;
                Cta ctaDecode2 = null;
                String strDecode5 = null;
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
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 6:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamSuggestedActionContentResponse(strDecode, strDecode2, strDecode3, strDecode4, ctaDecode, ctaDecode2, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
