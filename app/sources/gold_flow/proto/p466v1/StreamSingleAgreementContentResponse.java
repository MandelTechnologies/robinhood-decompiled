package gold_flow.proto.p466v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: StreamSingleAgreementContentResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\nH\u0016JQ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010$R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "Lcom/squareup/wire/Message;", "", "agreement", "Lgold_flow/proto/v1/FullAgreement;", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", "disable_sparkle_button_styling", "", "request_id", "", "web_sidebar_content", "Lgold_flow/proto/v1/WebSidebarContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold_flow/proto/v1/FullAgreement;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)V", "getAgreement", "()Lgold_flow/proto/v1/FullAgreement;", "getCta", "()Lgold_flow/proto/v1/Cta;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRequest_id", "()Ljava/lang/String;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContent;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lgold_flow/proto/v1/FullAgreement;Lgold_flow/proto/v1/Cta;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContent;Lokio/ByteString;)Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamSingleAgreementContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSingleAgreementContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.FullAgreement#ADAPTER", schemaIndex = 0, tag = 1)
    private final FullAgreement agreement;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 1, tag = 2)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableSparkleButtonStyling", schemaIndex = 2, tag = 3)
    private final Boolean disable_sparkle_button_styling;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", schemaIndex = 3, tag = 4)
    private final String request_id;

    @WireField(adapter = "gold_flow.proto.v1.WebSidebarContent#ADAPTER", jsonName = "webSidebarContent", schemaIndex = 4, tag = 5)
    private final WebSidebarContent web_sidebar_content;

    public StreamSingleAgreementContentResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28211newBuilder();
    }

    public final FullAgreement getAgreement() {
        return this.agreement;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Boolean getDisable_sparkle_button_styling() {
        return this.disable_sparkle_button_styling;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final WebSidebarContent getWeb_sidebar_content() {
        return this.web_sidebar_content;
    }

    public /* synthetic */ StreamSingleAgreementContentResponse(FullAgreement fullAgreement, Cta cta, Boolean bool, String str, WebSidebarContent webSidebarContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fullAgreement, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : webSidebarContent, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSingleAgreementContentResponse(FullAgreement fullAgreement, Cta cta, Boolean bool, String str, WebSidebarContent webSidebarContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.agreement = fullAgreement;
        this.cta = cta;
        this.disable_sparkle_button_styling = bool;
        this.request_id = str;
        this.web_sidebar_content = webSidebarContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28211newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSingleAgreementContentResponse)) {
            return false;
        }
        StreamSingleAgreementContentResponse streamSingleAgreementContentResponse = (StreamSingleAgreementContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSingleAgreementContentResponse.unknownFields()) && Intrinsics.areEqual(this.agreement, streamSingleAgreementContentResponse.agreement) && Intrinsics.areEqual(this.cta, streamSingleAgreementContentResponse.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, streamSingleAgreementContentResponse.disable_sparkle_button_styling) && Intrinsics.areEqual(this.request_id, streamSingleAgreementContentResponse.request_id) && Intrinsics.areEqual(this.web_sidebar_content, streamSingleAgreementContentResponse.web_sidebar_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FullAgreement fullAgreement = this.agreement;
        int iHashCode2 = (iHashCode + (fullAgreement != null ? fullAgreement.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode3 = (iHashCode2 + (cta != null ? cta.hashCode() : 0)) * 37;
        Boolean bool = this.disable_sparkle_button_styling;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.request_id;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        int iHashCode6 = iHashCode5 + (webSidebarContent != null ? webSidebarContent.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FullAgreement fullAgreement = this.agreement;
        if (fullAgreement != null) {
            arrayList.add("agreement=" + fullAgreement);
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Boolean bool = this.disable_sparkle_button_styling;
        if (bool != null) {
            arrayList.add("disable_sparkle_button_styling=" + bool);
        }
        String str = this.request_id;
        if (str != null) {
            arrayList.add("request_id=" + Internal.sanitize(str));
        }
        WebSidebarContent webSidebarContent = this.web_sidebar_content;
        if (webSidebarContent != null) {
            arrayList.add("web_sidebar_content=" + webSidebarContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSingleAgreementContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSingleAgreementContentResponse copy$default(StreamSingleAgreementContentResponse streamSingleAgreementContentResponse, FullAgreement fullAgreement, Cta cta, Boolean bool, String str, WebSidebarContent webSidebarContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            fullAgreement = streamSingleAgreementContentResponse.agreement;
        }
        if ((i & 2) != 0) {
            cta = streamSingleAgreementContentResponse.cta;
        }
        if ((i & 4) != 0) {
            bool = streamSingleAgreementContentResponse.disable_sparkle_button_styling;
        }
        if ((i & 8) != 0) {
            str = streamSingleAgreementContentResponse.request_id;
        }
        if ((i & 16) != 0) {
            webSidebarContent = streamSingleAgreementContentResponse.web_sidebar_content;
        }
        if ((i & 32) != 0) {
            byteString = streamSingleAgreementContentResponse.unknownFields();
        }
        WebSidebarContent webSidebarContent2 = webSidebarContent;
        ByteString byteString2 = byteString;
        return streamSingleAgreementContentResponse.copy(fullAgreement, cta, bool, str, webSidebarContent2, byteString2);
    }

    public final StreamSingleAgreementContentResponse copy(FullAgreement agreement, Cta cta, Boolean disable_sparkle_button_styling, String request_id, WebSidebarContent web_sidebar_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSingleAgreementContentResponse(agreement, cta, disable_sparkle_button_styling, request_id, web_sidebar_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSingleAgreementContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSingleAgreementContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamSingleAgreementContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSingleAgreementContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + FullAgreement.ADAPTER.encodedSizeWithTag(1, value.getAgreement()) + Cta.ADAPTER.encodedSizeWithTag(2, value.getCta()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getDisable_sparkle_button_styling()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRequest_id()) + WebSidebarContent.ADAPTER.encodedSizeWithTag(5, value.getWeb_sidebar_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSingleAgreementContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreement.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement());
                Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDisable_sparkle_button_styling());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRequest_id());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 5, (int) value.getWeb_sidebar_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSingleAgreementContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WebSidebarContent.ADAPTER.encodeWithTag(writer, 5, (int) value.getWeb_sidebar_content());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRequest_id());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDisable_sparkle_button_styling());
                Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta());
                FullAgreement.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSingleAgreementContentResponse redact(StreamSingleAgreementContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreement agreement = value.getAgreement();
                FullAgreement fullAgreementRedact = agreement != null ? FullAgreement.ADAPTER.redact(agreement) : null;
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                WebSidebarContent web_sidebar_content = value.getWeb_sidebar_content();
                return StreamSingleAgreementContentResponse.copy$default(value, fullAgreementRedact, ctaRedact, null, null, web_sidebar_content != null ? WebSidebarContent.ADAPTER.redact(web_sidebar_content) : null, ByteString.EMPTY, 12, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamSingleAgreementContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FullAgreement fullAgreementDecode = null;
                Cta ctaDecode = null;
                Boolean boolDecode = null;
                String strDecode = null;
                WebSidebarContent webSidebarContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamSingleAgreementContentResponse(fullAgreementDecode, ctaDecode, boolDecode, strDecode, webSidebarContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fullAgreementDecode = FullAgreement.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        ctaDecode = Cta.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        webSidebarContentDecode = WebSidebarContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
