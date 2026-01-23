package microgram.contracts.invest_tab_highlights.proto.p494v1;

import bonfire.proto.idl.copilot.p032v1.GetPortfolioDigestResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: PortfolioDigestContent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContent;", "Lcom/squareup/wire/Message;", "", "digest_response", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;Lokio/ByteString;)V", "getDigest_response", "()Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PortfolioDigestContent extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigestContent> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.GetPortfolioDigestResponse#ADAPTER", jsonName = "digestResponse", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GetPortfolioDigestResponse digest_response;

    /* JADX WARN: Multi-variable type inference failed */
    public PortfolioDigestContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29130newBuilder();
    }

    public final GetPortfolioDigestResponse getDigest_response() {
        return this.digest_response;
    }

    public /* synthetic */ PortfolioDigestContent(GetPortfolioDigestResponse getPortfolioDigestResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getPortfolioDigestResponse, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestContent(GetPortfolioDigestResponse getPortfolioDigestResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_response = getPortfolioDigestResponse;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29130newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigestContent)) {
            return false;
        }
        PortfolioDigestContent portfolioDigestContent = (PortfolioDigestContent) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigestContent.unknownFields()) && Intrinsics.areEqual(this.digest_response, portfolioDigestContent.digest_response);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GetPortfolioDigestResponse getPortfolioDigestResponse = this.digest_response;
        int iHashCode2 = iHashCode + (getPortfolioDigestResponse != null ? getPortfolioDigestResponse.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GetPortfolioDigestResponse getPortfolioDigestResponse = this.digest_response;
        if (getPortfolioDigestResponse != null) {
            arrayList.add("digest_response=" + getPortfolioDigestResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigestContent{", "}", 0, null, null, 56, null);
    }

    public final PortfolioDigestContent copy(GetPortfolioDigestResponse digest_response, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigestContent(digest_response, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigestContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.PortfolioDigestContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigestContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getDigest_response() != null ? size + GetPortfolioDigestResponse.ADAPTER.encodedSizeWithTag(1, value.getDigest_response()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigestContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDigest_response() != null) {
                    GetPortfolioDigestResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getDigest_response());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigestContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDigest_response() != null) {
                    GetPortfolioDigestResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getDigest_response());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestContent redact(PortfolioDigestContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetPortfolioDigestResponse digest_response = value.getDigest_response();
                return value.copy(digest_response != null ? GetPortfolioDigestResponse.ADAPTER.redact(digest_response) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GetPortfolioDigestResponse getPortfolioDigestResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioDigestContent(getPortfolioDigestResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        getPortfolioDigestResponseDecode = GetPortfolioDigestResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
