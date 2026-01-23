package rh_server_driven_ui.p531v1;

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

/* compiled from: ActivityFeedRow.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/ActivityFeedRow;", "Lcom/squareup/wire/Message;", "", "id", "", "content", "Lrh_server_driven_ui/v1/RenderableText;", "action", "Lrh_server_driven_ui/v1/Action;", "is_read", "", "image", "Lrh_server_driven_ui/v1/Image;", "relative_time_label", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/Action;ZLrh_server_driven_ui/v1/Image;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContent", "()Lrh_server_driven_ui/v1/RenderableText;", "getAction", "()Lrh_server_driven_ui/v1/Action;", "()Z", "getImage", "()Lrh_server_driven_ui/v1/Image;", "getRelative_time_label", "getLogging_identifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ActivityFeedRow extends Message {

    @JvmField
    public static final ProtoAdapter<ActivityFeedRow> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 2, tag = 3)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final RenderableText content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "rh_server_driven_ui.v1.Image#ADAPTER", schemaIndex = 4, tag = 5)
    private final Image image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRead", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_read;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relativeTimeLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String relative_time_label;

    public ActivityFeedRow() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    public /* synthetic */ ActivityFeedRow(String str, RenderableText renderableText, Action action, boolean z, Image image, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : renderableText, (i & 4) != 0 ? null : action, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : image, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29652newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final RenderableText getContent() {
        return this.content;
    }

    public final Action getAction() {
        return this.action;
    }

    /* renamed from: is_read, reason: from getter */
    public final boolean getIs_read() {
        return this.is_read;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getRelative_time_label() {
        return this.relative_time_label;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityFeedRow(String id, RenderableText renderableText, Action action, boolean z, Image image, String relative_time_label, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(relative_time_label, "relative_time_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.content = renderableText;
        this.action = action;
        this.is_read = z;
        this.image = image;
        this.relative_time_label = relative_time_label;
        this.logging_identifier = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29652newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivityFeedRow)) {
            return false;
        }
        ActivityFeedRow activityFeedRow = (ActivityFeedRow) other;
        return Intrinsics.areEqual(unknownFields(), activityFeedRow.unknownFields()) && Intrinsics.areEqual(this.id, activityFeedRow.id) && Intrinsics.areEqual(this.content, activityFeedRow.content) && Intrinsics.areEqual(this.action, activityFeedRow.action) && this.is_read == activityFeedRow.is_read && Intrinsics.areEqual(this.image, activityFeedRow.image) && Intrinsics.areEqual(this.relative_time_label, activityFeedRow.relative_time_label) && Intrinsics.areEqual(this.logging_identifier, activityFeedRow.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        RenderableText renderableText = this.content;
        int iHashCode2 = (iHashCode + (renderableText != null ? renderableText.hashCode() : 0)) * 37;
        Action action = this.action;
        int iHashCode3 = (((iHashCode2 + (action != null ? action.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_read)) * 37;
        Image image = this.image;
        int iHashCode4 = (((iHashCode3 + (image != null ? image.hashCode() : 0)) * 37) + this.relative_time_label.hashCode()) * 37;
        String str = this.logging_identifier;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        RenderableText renderableText = this.content;
        if (renderableText != null) {
            arrayList.add("content=" + renderableText);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        arrayList.add("is_read=" + this.is_read);
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        arrayList.add("relative_time_label=" + Internal.sanitize(this.relative_time_label));
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityFeedRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ActivityFeedRow copy$default(ActivityFeedRow activityFeedRow, String str, RenderableText renderableText, Action action, boolean z, Image image, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedRow.id;
        }
        if ((i & 2) != 0) {
            renderableText = activityFeedRow.content;
        }
        if ((i & 4) != 0) {
            action = activityFeedRow.action;
        }
        if ((i & 8) != 0) {
            z = activityFeedRow.is_read;
        }
        if ((i & 16) != 0) {
            image = activityFeedRow.image;
        }
        if ((i & 32) != 0) {
            str2 = activityFeedRow.relative_time_label;
        }
        if ((i & 64) != 0) {
            str3 = activityFeedRow.logging_identifier;
        }
        if ((i & 128) != 0) {
            byteString = activityFeedRow.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        Image image2 = image;
        String str5 = str2;
        return activityFeedRow.copy(str, renderableText, action, z, image2, str5, str4, byteString2);
    }

    public final ActivityFeedRow copy(String id, RenderableText content, Action action, boolean is_read, Image image, String relative_time_label, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(relative_time_label, "relative_time_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivityFeedRow(id, content, action, is_read, image, relative_time_label, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityFeedRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivityFeedRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ActivityFeedRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivityFeedRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getContent() != null) {
                    size += RenderableText.ADAPTER.encodedSizeWithTag(2, value.getContent());
                }
                int iEncodedSizeWithTag = size + Action.ADAPTER.encodedSizeWithTag(3, value.getAction());
                if (value.getIs_read()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_read()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + Image.ADAPTER.encodedSizeWithTag(5, value.getImage());
                if (!Intrinsics.areEqual(value.getRelative_time_label(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getRelative_time_label());
                }
                return iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivityFeedRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getContent() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent());
                }
                Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                if (value.getIs_read()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_read()));
                }
                Image.ADAPTER.encodeWithTag(writer, 5, (int) value.getImage());
                if (!Intrinsics.areEqual(value.getRelative_time_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRelative_time_label());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivityFeedRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                if (!Intrinsics.areEqual(value.getRelative_time_label(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getRelative_time_label());
                }
                Image.ADAPTER.encodeWithTag(writer, 5, (int) value.getImage());
                if (value.getIs_read()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_read()));
                }
                Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                if (value.getContent() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivityFeedRow redact(ActivityFeedRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RenderableText content = value.getContent();
                RenderableText renderableTextRedact = content != null ? RenderableText.ADAPTER.redact(content) : null;
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                Image image = value.getImage();
                return ActivityFeedRow.copy$default(value, null, renderableTextRedact, actionRedact, false, image != null ? Image.ADAPTER.redact(image) : null, null, null, ByteString.EMPTY, 105, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivityFeedRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Action actionDecode = null;
                Image imageDecode = null;
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = "";
                RenderableText renderableTextDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                renderableTextDecode = RenderableText.ADAPTER.decode(reader);
                                break;
                            case 3:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                imageDecode = Image.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ActivityFeedRow(strDecode, renderableTextDecode, actionDecode, zBooleanValue, imageDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
