package rh_server_driven_ui.p531v1;

import com.adjust.sdk.Constants;
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

/* compiled from: NavigationRow.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000bH\u0016Jb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/NavigationRow;", "Lcom/squareup/wire/Message;", "", "title", "Lrh_server_driven_ui/v1/RenderableText;", "subtitle", "action", "Lrh_server_driven_ui/v1/Action;", "is_disabled", "", "logging_identifier", "", "start", "Lrh_server_driven_ui/v1/StartElement;", Constants.REFERRER_API_META, "Lrh_server_driven_ui/v1/MetaElement;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/Action;ZLjava/lang/String;Lrh_server_driven_ui/v1/StartElement;Lrh_server_driven_ui/v1/MetaElement;Lokio/ByteString;)V", "getTitle", "()Lrh_server_driven_ui/v1/RenderableText;", "getSubtitle", "getAction", "()Lrh_server_driven_ui/v1/Action;", "()Z", "getLogging_identifier", "()Ljava/lang/String;", "getStart", "()Lrh_server_driven_ui/v1/StartElement;", "getMeta", "()Lrh_server_driven_ui/v1/MetaElement;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class NavigationRow extends Message {

    @JvmField
    public static final ProtoAdapter<NavigationRow> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 2, tag = 3)
    private final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.MetaElement#ADAPTER", schemaIndex = 6, tag = 7)
    private final MetaElement meta;

    @WireField(adapter = "rh_server_driven_ui.v1.StartElement#ADAPTER", schemaIndex = 5, tag = 6)
    private final StartElement start;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", schemaIndex = 1, tag = 2)
    private final RenderableText subtitle;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final RenderableText title;

    public NavigationRow() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29784newBuilder();
    }

    public final RenderableText getTitle() {
        return this.title;
    }

    public final RenderableText getSubtitle() {
        return this.subtitle;
    }

    public final Action getAction() {
        return this.action;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final StartElement getStart() {
        return this.start;
    }

    public final MetaElement getMeta() {
        return this.meta;
    }

    public /* synthetic */ NavigationRow(RenderableText renderableText, RenderableText renderableText2, Action action, boolean z, String str, StartElement startElement, MetaElement metaElement, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renderableText, (i & 2) != 0 ? null : renderableText2, (i & 4) != 0 ? null : action, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : startElement, (i & 64) != 0 ? null : metaElement, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRow(RenderableText renderableText, RenderableText renderableText2, Action action, boolean z, String str, StartElement startElement, MetaElement metaElement, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = renderableText;
        this.subtitle = renderableText2;
        this.action = action;
        this.is_disabled = z;
        this.logging_identifier = str;
        this.start = startElement;
        this.meta = metaElement;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29784newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NavigationRow)) {
            return false;
        }
        NavigationRow navigationRow = (NavigationRow) other;
        return Intrinsics.areEqual(unknownFields(), navigationRow.unknownFields()) && Intrinsics.areEqual(this.title, navigationRow.title) && Intrinsics.areEqual(this.subtitle, navigationRow.subtitle) && Intrinsics.areEqual(this.action, navigationRow.action) && this.is_disabled == navigationRow.is_disabled && Intrinsics.areEqual(this.logging_identifier, navigationRow.logging_identifier) && Intrinsics.areEqual(this.start, navigationRow.start) && Intrinsics.areEqual(this.meta, navigationRow.meta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RenderableText renderableText = this.title;
        int iHashCode2 = (iHashCode + (renderableText != null ? renderableText.hashCode() : 0)) * 37;
        RenderableText renderableText2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (renderableText2 != null ? renderableText2.hashCode() : 0)) * 37;
        Action action = this.action;
        int iHashCode4 = (((iHashCode3 + (action != null ? action.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled)) * 37;
        String str = this.logging_identifier;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        StartElement startElement = this.start;
        int iHashCode6 = (iHashCode5 + (startElement != null ? startElement.hashCode() : 0)) * 37;
        MetaElement metaElement = this.meta;
        int iHashCode7 = iHashCode6 + (metaElement != null ? metaElement.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        RenderableText renderableText = this.title;
        if (renderableText != null) {
            arrayList.add("title=" + renderableText);
        }
        RenderableText renderableText2 = this.subtitle;
        if (renderableText2 != null) {
            arrayList.add("subtitle=" + renderableText2);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        StartElement startElement = this.start;
        if (startElement != null) {
            arrayList.add("start=" + startElement);
        }
        MetaElement metaElement = this.meta;
        if (metaElement != null) {
            arrayList.add("meta=" + metaElement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NavigationRow copy$default(NavigationRow navigationRow, RenderableText renderableText, RenderableText renderableText2, Action action, boolean z, String str, StartElement startElement, MetaElement metaElement, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            renderableText = navigationRow.title;
        }
        if ((i & 2) != 0) {
            renderableText2 = navigationRow.subtitle;
        }
        if ((i & 4) != 0) {
            action = navigationRow.action;
        }
        if ((i & 8) != 0) {
            z = navigationRow.is_disabled;
        }
        if ((i & 16) != 0) {
            str = navigationRow.logging_identifier;
        }
        if ((i & 32) != 0) {
            startElement = navigationRow.start;
        }
        if ((i & 64) != 0) {
            metaElement = navigationRow.meta;
        }
        if ((i & 128) != 0) {
            byteString = navigationRow.unknownFields();
        }
        MetaElement metaElement2 = metaElement;
        ByteString byteString2 = byteString;
        String str2 = str;
        StartElement startElement2 = startElement;
        return navigationRow.copy(renderableText, renderableText2, action, z, str2, startElement2, metaElement2, byteString2);
    }

    public final NavigationRow copy(RenderableText title, RenderableText subtitle, Action action, boolean is_disabled, String logging_identifier, StartElement start, MetaElement meta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NavigationRow(title, subtitle, action, is_disabled, logging_identifier, start, meta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NavigationRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.NavigationRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NavigationRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTitle() != null) {
                    size += RenderableText.ADAPTER.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + RenderableText.ADAPTER.encodedSizeWithTag(2, value.getSubtitle()) + Action.ADAPTER.encodedSizeWithTag(3, value.getAction());
                if (value.getIs_disabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_disabled()));
                }
                return iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLogging_identifier()) + StartElement.ADAPTER.encodedSizeWithTag(6, value.getStart()) + MetaElement.ADAPTER.encodedSizeWithTag(7, value.getMeta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NavigationRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTitle() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                RenderableText.ADAPTER.encodeWithTag(writer, 2, (int) value.getSubtitle());
                Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                StartElement.ADAPTER.encodeWithTag(writer, 6, (int) value.getStart());
                MetaElement.ADAPTER.encodeWithTag(writer, 7, (int) value.getMeta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NavigationRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MetaElement.ADAPTER.encodeWithTag(writer, 7, (int) value.getMeta());
                StartElement.ADAPTER.encodeWithTag(writer, 6, (int) value.getStart());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                ProtoAdapter<RenderableText> protoAdapter = RenderableText.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                if (value.getTitle() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationRow redact(NavigationRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RenderableText title = value.getTitle();
                RenderableText renderableTextRedact = title != null ? RenderableText.ADAPTER.redact(title) : null;
                RenderableText subtitle = value.getSubtitle();
                RenderableText renderableTextRedact2 = subtitle != null ? RenderableText.ADAPTER.redact(subtitle) : null;
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                StartElement start = value.getStart();
                StartElement startElementRedact = start != null ? StartElement.ADAPTER.redact(start) : null;
                MetaElement meta = value.getMeta();
                return NavigationRow.copy$default(value, renderableTextRedact, renderableTextRedact2, actionRedact, false, null, startElementRedact, meta != null ? MetaElement.ADAPTER.redact(meta) : null, ByteString.EMPTY, 24, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RenderableText renderableTextDecode = null;
                Action actionDecode = null;
                String strDecode = null;
                StartElement startElementDecode = null;
                MetaElement metaElementDecode = null;
                boolean zBooleanValue = false;
                RenderableText renderableTextDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                renderableTextDecode = RenderableText.ADAPTER.decode(reader);
                                break;
                            case 2:
                                renderableTextDecode2 = RenderableText.ADAPTER.decode(reader);
                                break;
                            case 3:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                startElementDecode = StartElement.ADAPTER.decode(reader);
                                break;
                            case 7:
                                metaElementDecode = MetaElement.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new NavigationRow(renderableTextDecode, renderableTextDecode2, actionDecode, zBooleanValue, strDecode, startElementDecode, metaElementDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
