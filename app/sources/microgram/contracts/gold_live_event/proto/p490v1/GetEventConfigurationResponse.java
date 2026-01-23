package microgram.contracts.gold_live_event.proto.p490v1;

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

/* compiled from: GetEventConfigurationResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponse;", "Lcom/squareup/wire/Message;", "", "live_url", "", "intercept_dismiss", "", "event_title", "landscape_upsell_markdown", "accent_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLive_url", "()Ljava/lang/String;", "getIntercept_dismiss", "()Z", "getEvent_title", "getLandscape_upsell_markdown", "getAccent_color", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetEventConfigurationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetEventConfigurationResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accentColor", schemaIndex = 4, tag = 5)
    private final String accent_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String event_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "interceptDismiss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean intercept_dismiss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "landscapeUpsellMarkdown", schemaIndex = 3, tag = 4)
    private final String landscape_upsell_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "liveUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String live_url;

    public GetEventConfigurationResponse() {
        this(null, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetEventConfigurationResponse(String str, boolean z, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29086newBuilder();
    }

    public final String getLive_url() {
        return this.live_url;
    }

    public final boolean getIntercept_dismiss() {
        return this.intercept_dismiss;
    }

    public final String getEvent_title() {
        return this.event_title;
    }

    public final String getLandscape_upsell_markdown() {
        return this.landscape_upsell_markdown;
    }

    public final String getAccent_color() {
        return this.accent_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEventConfigurationResponse(String live_url, boolean z, String event_title, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(live_url, "live_url");
        Intrinsics.checkNotNullParameter(event_title, "event_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.live_url = live_url;
        this.intercept_dismiss = z;
        this.event_title = event_title;
        this.landscape_upsell_markdown = str;
        this.accent_color = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29086newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetEventConfigurationResponse)) {
            return false;
        }
        GetEventConfigurationResponse getEventConfigurationResponse = (GetEventConfigurationResponse) other;
        return Intrinsics.areEqual(unknownFields(), getEventConfigurationResponse.unknownFields()) && Intrinsics.areEqual(this.live_url, getEventConfigurationResponse.live_url) && this.intercept_dismiss == getEventConfigurationResponse.intercept_dismiss && Intrinsics.areEqual(this.event_title, getEventConfigurationResponse.event_title) && Intrinsics.areEqual(this.landscape_upsell_markdown, getEventConfigurationResponse.landscape_upsell_markdown) && Intrinsics.areEqual(this.accent_color, getEventConfigurationResponse.accent_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.live_url.hashCode()) * 37) + Boolean.hashCode(this.intercept_dismiss)) * 37) + this.event_title.hashCode()) * 37;
        String str = this.landscape_upsell_markdown;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accent_color;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("live_url=" + Internal.sanitize(this.live_url));
        arrayList.add("intercept_dismiss=" + this.intercept_dismiss);
        arrayList.add("event_title=" + Internal.sanitize(this.event_title));
        String str = this.landscape_upsell_markdown;
        if (str != null) {
            arrayList.add("landscape_upsell_markdown=" + Internal.sanitize(str));
        }
        String str2 = this.accent_color;
        if (str2 != null) {
            arrayList.add("accent_color=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEventConfigurationResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetEventConfigurationResponse copy$default(GetEventConfigurationResponse getEventConfigurationResponse, String str, boolean z, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEventConfigurationResponse.live_url;
        }
        if ((i & 2) != 0) {
            z = getEventConfigurationResponse.intercept_dismiss;
        }
        if ((i & 4) != 0) {
            str2 = getEventConfigurationResponse.event_title;
        }
        if ((i & 8) != 0) {
            str3 = getEventConfigurationResponse.landscape_upsell_markdown;
        }
        if ((i & 16) != 0) {
            str4 = getEventConfigurationResponse.accent_color;
        }
        if ((i & 32) != 0) {
            byteString = getEventConfigurationResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return getEventConfigurationResponse.copy(str, z, str2, str3, str5, byteString2);
    }

    public final GetEventConfigurationResponse copy(String live_url, boolean intercept_dismiss, String event_title, String landscape_upsell_markdown, String accent_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(live_url, "live_url");
        Intrinsics.checkNotNullParameter(event_title, "event_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetEventConfigurationResponse(live_url, intercept_dismiss, event_title, landscape_upsell_markdown, accent_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetEventConfigurationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetEventConfigurationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.gold_live_event.proto.v1.GetEventConfigurationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetEventConfigurationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLive_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLive_url());
                }
                if (value.getIntercept_dismiss()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIntercept_dismiss()));
                }
                if (!Intrinsics.areEqual(value.getEvent_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEvent_title());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getLandscape_upsell_markdown()) + protoAdapter.encodedSizeWithTag(5, value.getAccent_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetEventConfigurationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLive_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLive_url());
                }
                if (value.getIntercept_dismiss()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIntercept_dismiss()));
                }
                if (!Intrinsics.areEqual(value.getEvent_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEvent_title());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLandscape_upsell_markdown());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAccent_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetEventConfigurationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAccent_color());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLandscape_upsell_markdown());
                if (!Intrinsics.areEqual(value.getEvent_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEvent_title());
                }
                if (value.getIntercept_dismiss()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIntercept_dismiss()));
                }
                if (Intrinsics.areEqual(value.getLive_url(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLive_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetEventConfigurationResponse redact(GetEventConfigurationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetEventConfigurationResponse.copy$default(value, null, false, null, null, null, ByteString.EMPTY, 31, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetEventConfigurationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = null;
                String strDecode4 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetEventConfigurationResponse(strDecode, zBooleanValue, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
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
        };
    }
}
