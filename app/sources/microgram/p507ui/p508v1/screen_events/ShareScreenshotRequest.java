package microgram.p507ui.p508v1.screen_events;

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

/* compiled from: ShareScreenshotRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ShareScreenshotRequest;", "Lcom/squareup/wire/Message;", "", "component_item_identifier", "", "screenshot_frame", "Lmicrogram/ui/v1/screen_events/Frame;", "share_sheet_title", "share_sheet_subtitle", "custom_share_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/screen_events/Frame;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getComponent_item_identifier", "()Ljava/lang/String;", "getScreenshot_frame", "()Lmicrogram/ui/v1/screen_events/Frame;", "getShare_sheet_title", "getShare_sheet_subtitle", "getCustom_share_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ShareScreenshotRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ShareScreenshotRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "componentItemIdentifier", oneofName = "component_item", schemaIndex = 0, tag = 1)
    private final String component_item_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customShareContent", schemaIndex = 4, tag = 5)
    private final String custom_share_content;

    @WireField(adapter = "microgram.ui.v1.screen_events.Frame#ADAPTER", jsonName = "screenshotFrame", oneofName = "component_item", schemaIndex = 1, tag = 2)
    private final Frame screenshot_frame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shareSheetSubtitle", schemaIndex = 3, tag = 4)
    private final String share_sheet_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shareSheetTitle", schemaIndex = 2, tag = 3)
    private final String share_sheet_title;

    public ShareScreenshotRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29311newBuilder();
    }

    public final String getComponent_item_identifier() {
        return this.component_item_identifier;
    }

    public final Frame getScreenshot_frame() {
        return this.screenshot_frame;
    }

    public final String getShare_sheet_title() {
        return this.share_sheet_title;
    }

    public final String getShare_sheet_subtitle() {
        return this.share_sheet_subtitle;
    }

    public final String getCustom_share_content() {
        return this.custom_share_content;
    }

    public /* synthetic */ ShareScreenshotRequest(String str, Frame frame, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : frame, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareScreenshotRequest(String str, Frame frame, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.component_item_identifier = str;
        this.screenshot_frame = frame;
        this.share_sheet_title = str2;
        this.share_sheet_subtitle = str3;
        this.custom_share_content = str4;
        if (Internal.countNonNull(str, frame) > 1) {
            throw new IllegalArgumentException("At most one of component_item_identifier, screenshot_frame may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29311newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ShareScreenshotRequest)) {
            return false;
        }
        ShareScreenshotRequest shareScreenshotRequest = (ShareScreenshotRequest) other;
        return Intrinsics.areEqual(unknownFields(), shareScreenshotRequest.unknownFields()) && Intrinsics.areEqual(this.component_item_identifier, shareScreenshotRequest.component_item_identifier) && Intrinsics.areEqual(this.screenshot_frame, shareScreenshotRequest.screenshot_frame) && Intrinsics.areEqual(this.share_sheet_title, shareScreenshotRequest.share_sheet_title) && Intrinsics.areEqual(this.share_sheet_subtitle, shareScreenshotRequest.share_sheet_subtitle) && Intrinsics.areEqual(this.custom_share_content, shareScreenshotRequest.custom_share_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.component_item_identifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Frame frame = this.screenshot_frame;
        int iHashCode3 = (iHashCode2 + (frame != null ? frame.hashCode() : 0)) * 37;
        String str2 = this.share_sheet_title;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.share_sheet_subtitle;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.custom_share_content;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.component_item_identifier;
        if (str != null) {
            arrayList.add("component_item_identifier=" + Internal.sanitize(str));
        }
        Frame frame = this.screenshot_frame;
        if (frame != null) {
            arrayList.add("screenshot_frame=" + frame);
        }
        String str2 = this.share_sheet_title;
        if (str2 != null) {
            arrayList.add("share_sheet_title=" + Internal.sanitize(str2));
        }
        String str3 = this.share_sheet_subtitle;
        if (str3 != null) {
            arrayList.add("share_sheet_subtitle=" + Internal.sanitize(str3));
        }
        String str4 = this.custom_share_content;
        if (str4 != null) {
            arrayList.add("custom_share_content=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShareScreenshotRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ShareScreenshotRequest copy$default(ShareScreenshotRequest shareScreenshotRequest, String str, Frame frame, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareScreenshotRequest.component_item_identifier;
        }
        if ((i & 2) != 0) {
            frame = shareScreenshotRequest.screenshot_frame;
        }
        if ((i & 4) != 0) {
            str2 = shareScreenshotRequest.share_sheet_title;
        }
        if ((i & 8) != 0) {
            str3 = shareScreenshotRequest.share_sheet_subtitle;
        }
        if ((i & 16) != 0) {
            str4 = shareScreenshotRequest.custom_share_content;
        }
        if ((i & 32) != 0) {
            byteString = shareScreenshotRequest.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return shareScreenshotRequest.copy(str, frame, str2, str3, str5, byteString2);
    }

    public final ShareScreenshotRequest copy(String component_item_identifier, Frame screenshot_frame, String share_sheet_title, String share_sheet_subtitle, String custom_share_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ShareScreenshotRequest(component_item_identifier, screenshot_frame, share_sheet_title, share_sheet_subtitle, custom_share_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShareScreenshotRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ShareScreenshotRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.screen_events.ShareScreenshotRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShareScreenshotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getComponent_item_identifier()) + Frame.ADAPTER.encodedSizeWithTag(2, value.getScreenshot_frame()) + protoAdapter.encodedSizeWithTag(3, value.getShare_sheet_title()) + protoAdapter.encodedSizeWithTag(4, value.getShare_sheet_subtitle()) + protoAdapter.encodedSizeWithTag(5, value.getCustom_share_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ShareScreenshotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getShare_sheet_title());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getShare_sheet_subtitle());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCustom_share_content());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getComponent_item_identifier());
                Frame.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreenshot_frame());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ShareScreenshotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Frame.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreenshot_frame());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getComponent_item_identifier());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCustom_share_content());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getShare_sheet_subtitle());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getShare_sheet_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShareScreenshotRequest redact(ShareScreenshotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Frame screenshot_frame = value.getScreenshot_frame();
                return ShareScreenshotRequest.copy$default(value, null, screenshot_frame != null ? Frame.ADAPTER.redact(screenshot_frame) : null, null, null, null, ByteString.EMPTY, 29, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShareScreenshotRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Frame frameDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ShareScreenshotRequest(strDecode, frameDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        frameDecode = Frame.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
