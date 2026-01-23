package futures_asset_home.proto.p462v1;

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

/* compiled from: GetFuturesAssetHomeDisclosuresResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lfutures_asset_home/proto/v1/GetFuturesAssetHomeDisclosuresResponse;", "Lcom/squareup/wire/Message;", "", "disclosure_markdown", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getDisclosure_markdown", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetFuturesAssetHomeDisclosuresResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesAssetHomeDisclosuresResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String disclosure_markdown;

    /* JADX WARN: Multi-variable type inference failed */
    public GetFuturesAssetHomeDisclosuresResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28089newBuilder();
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public /* synthetic */ GetFuturesAssetHomeDisclosuresResponse(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesAssetHomeDisclosuresResponse(String disclosure_markdown, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.disclosure_markdown = disclosure_markdown;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28089newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesAssetHomeDisclosuresResponse)) {
            return false;
        }
        GetFuturesAssetHomeDisclosuresResponse getFuturesAssetHomeDisclosuresResponse = (GetFuturesAssetHomeDisclosuresResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesAssetHomeDisclosuresResponse.unknownFields()) && Intrinsics.areEqual(this.disclosure_markdown, getFuturesAssetHomeDisclosuresResponse.disclosure_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.disclosure_markdown.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesAssetHomeDisclosuresResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFuturesAssetHomeDisclosuresResponse copy$default(GetFuturesAssetHomeDisclosuresResponse getFuturesAssetHomeDisclosuresResponse, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFuturesAssetHomeDisclosuresResponse.disclosure_markdown;
        }
        if ((i & 2) != 0) {
            byteString = getFuturesAssetHomeDisclosuresResponse.unknownFields();
        }
        return getFuturesAssetHomeDisclosuresResponse.copy(str, byteString);
    }

    public final GetFuturesAssetHomeDisclosuresResponse copy(String disclosure_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesAssetHomeDisclosuresResponse(disclosure_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesAssetHomeDisclosuresResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesAssetHomeDisclosuresResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_asset_home.proto.v1.GetFuturesAssetHomeDisclosuresResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesAssetHomeDisclosuresResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getDisclosure_markdown(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDisclosure_markdown()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesAssetHomeDisclosuresResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisclosure_markdown());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesAssetHomeDisclosuresResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisclosure_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesAssetHomeDisclosuresResponse redact(GetFuturesAssetHomeDisclosuresResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFuturesAssetHomeDisclosuresResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesAssetHomeDisclosuresResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFuturesAssetHomeDisclosuresResponse(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
