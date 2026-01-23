package microgram.p507ui.p508v1;

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
import microgram.p507ui.p508v1.Toast;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: Toast.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lmicrogram/ui/v1/Toast;", "Lcom/squareup/wire/Message;", "", "id", "", "text", "leading_icon", "Lrh_server_driven_ui/v1/Icon;", "action_data", "Lmicrogram/ui/v1/Toast$ActionData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lmicrogram/ui/v1/Toast$ActionData;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getText", "getLeading_icon", "()Lrh_server_driven_ui/v1/Icon;", "getAction_data", "()Lmicrogram/ui/v1/Toast$ActionData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ActionData", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Toast extends Message {

    @JvmField
    public static final ProtoAdapter<Toast> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.Toast$ActionData#ADAPTER", jsonName = "actionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ActionData action_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "leadingIcon", schemaIndex = 2, tag = 3)
    private final Icon leading_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String text;

    public Toast() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ Toast(String str, String str2, Icon icon, ActionData actionData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : actionData, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29303newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final Icon getLeading_icon() {
        return this.leading_icon;
    }

    public final ActionData getAction_data() {
        return this.action_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toast(String id, String text, Icon icon, ActionData actionData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.text = text;
        this.leading_icon = icon;
        this.action_data = actionData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29303newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Toast)) {
            return false;
        }
        Toast toast = (Toast) other;
        return Intrinsics.areEqual(unknownFields(), toast.unknownFields()) && Intrinsics.areEqual(this.id, toast.id) && Intrinsics.areEqual(this.text, toast.text) && this.leading_icon == toast.leading_icon && Intrinsics.areEqual(this.action_data, toast.action_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.text.hashCode()) * 37;
        Icon icon = this.leading_icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        ActionData actionData = this.action_data;
        int iHashCode3 = iHashCode2 + (actionData != null ? actionData.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("text=" + Internal.sanitize(this.text));
        Icon icon = this.leading_icon;
        if (icon != null) {
            arrayList.add("leading_icon=" + icon);
        }
        ActionData actionData = this.action_data;
        if (actionData != null) {
            arrayList.add("action_data=" + actionData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Toast{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Toast copy$default(Toast toast, String str, String str2, Icon icon, ActionData actionData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toast.id;
        }
        if ((i & 2) != 0) {
            str2 = toast.text;
        }
        if ((i & 4) != 0) {
            icon = toast.leading_icon;
        }
        if ((i & 8) != 0) {
            actionData = toast.action_data;
        }
        if ((i & 16) != 0) {
            byteString = toast.unknownFields();
        }
        ByteString byteString2 = byteString;
        Icon icon2 = icon;
        return toast.copy(str, str2, icon2, actionData, byteString2);
    }

    public final Toast copy(String id, String text, Icon leading_icon, ActionData action_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Toast(id, text, leading_icon, action_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Toast.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Toast>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.Toast$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Toast value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                }
                int iEncodedSizeWithTag = size + Icon.ADAPTER.encodedSizeWithTag(3, value.getLeading_icon());
                return value.getAction_data() != null ? iEncodedSizeWithTag + Toast.ActionData.ADAPTER.encodedSizeWithTag(4, value.getAction_data()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Toast value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getLeading_icon());
                if (value.getAction_data() != null) {
                    Toast.ActionData.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Toast value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction_data() != null) {
                    Toast.ActionData.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction_data());
                }
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getLeading_icon());
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Toast redact(Toast value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Toast.ActionData action_data = value.getAction_data();
                return Toast.copy$default(value, null, null, null, action_data != null ? Toast.ActionData.ADAPTER.redact(action_data) : null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Toast decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Icon iconDecode = null;
                Toast.ActionData actionDataDecode = null;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Toast(strDecode2, strDecode, iconDecode, actionDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        actionDataDecode = Toast.ActionData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: Toast.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/ui/v1/Toast$ActionData;", "Lcom/squareup/wire/Message;", "", "title", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "action", "Lmicrogram/ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lmicrogram/ui/v1/Action;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getAction", "()Lmicrogram/ui/v1/Action;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionData extends Message {

        @JvmField
        public static final ProtoAdapter<ActionData> ADAPTER;

        @WireField(adapter = "microgram.ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Action action;

        @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 1, tag = 2)
        private final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String title;

        public ActionData() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29304newBuilder();
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ ActionData(String str, Icon icon, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : action, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final Action getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionData(String title, Icon icon, Action action, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.icon = icon;
            this.action = action;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29304newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ActionData)) {
                return false;
            }
            ActionData actionData = (ActionData) other;
            return Intrinsics.areEqual(unknownFields(), actionData.unknownFields()) && Intrinsics.areEqual(this.title, actionData.title) && this.icon == actionData.icon && Intrinsics.areEqual(this.action, actionData.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
            Icon icon = this.icon;
            int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            Action action = this.action;
            int iHashCode3 = iHashCode2 + (action != null ? action.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("title=" + Internal.sanitize(this.title));
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ActionData copy$default(ActionData actionData, String str, Icon icon, Action action, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionData.title;
            }
            if ((i & 2) != 0) {
                icon = actionData.icon;
            }
            if ((i & 4) != 0) {
                action = actionData.action;
            }
            if ((i & 8) != 0) {
                byteString = actionData.unknownFields();
            }
            return actionData.copy(str, icon, action, byteString);
        }

        public final ActionData copy(String title, Icon icon, Action action, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ActionData(title, icon, action, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActionData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ActionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.Toast$ActionData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Toast.ActionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                    }
                    int iEncodedSizeWithTag = size + Icon.ADAPTER.encodedSizeWithTag(2, value.getIcon());
                    return value.getAction() != null ? iEncodedSizeWithTag + Action.ADAPTER.encodedSizeWithTag(3, value.getAction()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Toast.ActionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                    if (value.getAction() != null) {
                        Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Toast.ActionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getAction() != null) {
                        Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                    }
                    Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                    if (Intrinsics.areEqual(value.getTitle(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Toast.ActionData redact(Toast.ActionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Action action = value.getAction();
                    return Toast.ActionData.copy$default(value, null, null, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Toast.ActionData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    Icon iconDecode = null;
                    Action actionDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Toast.ActionData(strDecode, iconDecode, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                iconDecode = Icon.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            actionDecode = Action.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
