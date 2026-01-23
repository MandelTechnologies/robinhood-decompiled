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

/* compiled from: TableColumnHeader.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010-R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#¨\u0006/"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeader;", "Lcom/squareup/wire/Message;", "", "title", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "secondary_icon", "active", "", "action", "Lrh_server_driven_ui/v1/Action;", "secondary_icon_action", "alignment", "Lrh_server_driven_ui/v1/TableColumnAlignment;", "left_padding", "", "right_padding", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/Icon;ZLrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/TableColumnAlignment;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getSecondary_icon", "getActive", "()Z", "getAction", "()Lrh_server_driven_ui/v1/Action;", "getSecondary_icon_action", "getAlignment", "()Lrh_server_driven_ui/v1/TableColumnAlignment;", "getLeft_padding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRight_padding", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/Icon;ZLrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/TableColumnAlignment;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)Lrh_server_driven_ui/v1/TableColumnHeader;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TableColumnHeader extends Message {

    @JvmField
    public static final ProtoAdapter<TableColumnHeader> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 4, tag = 5)
    private final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean active;

    @WireField(adapter = "rh_server_driven_ui.v1.TableColumnAlignment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TableColumnAlignment alignment;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 1, tag = 2)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "leftPadding", schemaIndex = 7, tag = 8)
    private final Integer left_padding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rightPadding", schemaIndex = 8, tag = 9)
    private final Integer right_padding;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "secondaryIcon", schemaIndex = 2, tag = 3)
    private final Icon secondary_icon;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "secondaryIconAction", schemaIndex = 5, tag = 6)
    private final Action secondary_icon_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TableColumnHeader() {
        this(null, null, null, false, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29826newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ TableColumnHeader(String str, Icon icon, Icon icon2, boolean z, Action action, Action action2, TableColumnAlignment tableColumnAlignment, Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : icon2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : action2, (i & 64) != 0 ? TableColumnAlignment.LEFT_UNSPECIFIED : tableColumnAlignment, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Icon getSecondary_icon() {
        return this.secondary_icon;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Action getAction() {
        return this.action;
    }

    public final Action getSecondary_icon_action() {
        return this.secondary_icon_action;
    }

    public final TableColumnAlignment getAlignment() {
        return this.alignment;
    }

    public final Integer getLeft_padding() {
        return this.left_padding;
    }

    public final Integer getRight_padding() {
        return this.right_padding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableColumnHeader(String title, Icon icon, Icon icon2, boolean z, Action action, Action action2, TableColumnAlignment alignment, Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.icon = icon;
        this.secondary_icon = icon2;
        this.active = z;
        this.action = action;
        this.secondary_icon_action = action2;
        this.alignment = alignment;
        this.left_padding = num;
        this.right_padding = num2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29826newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TableColumnHeader)) {
            return false;
        }
        TableColumnHeader tableColumnHeader = (TableColumnHeader) other;
        return Intrinsics.areEqual(unknownFields(), tableColumnHeader.unknownFields()) && Intrinsics.areEqual(this.title, tableColumnHeader.title) && this.icon == tableColumnHeader.icon && this.secondary_icon == tableColumnHeader.secondary_icon && this.active == tableColumnHeader.active && Intrinsics.areEqual(this.action, tableColumnHeader.action) && Intrinsics.areEqual(this.secondary_icon_action, tableColumnHeader.secondary_icon_action) && this.alignment == tableColumnHeader.alignment && Intrinsics.areEqual(this.left_padding, tableColumnHeader.left_padding) && Intrinsics.areEqual(this.right_padding, tableColumnHeader.right_padding);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        Icon icon2 = this.secondary_icon;
        int iHashCode3 = (((iHashCode2 + (icon2 != null ? icon2.hashCode() : 0)) * 37) + Boolean.hashCode(this.active)) * 37;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action != null ? action.hashCode() : 0)) * 37;
        Action action2 = this.secondary_icon_action;
        int iHashCode5 = (((iHashCode4 + (action2 != null ? action2.hashCode() : 0)) * 37) + this.alignment.hashCode()) * 37;
        Integer num = this.left_padding;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.right_padding;
        int iHashCode7 = iHashCode6 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        Icon icon2 = this.secondary_icon;
        if (icon2 != null) {
            arrayList.add("secondary_icon=" + icon2);
        }
        arrayList.add("active=" + this.active);
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Action action2 = this.secondary_icon_action;
        if (action2 != null) {
            arrayList.add("secondary_icon_action=" + action2);
        }
        arrayList.add("alignment=" + this.alignment);
        Integer num = this.left_padding;
        if (num != null) {
            arrayList.add("left_padding=" + num);
        }
        Integer num2 = this.right_padding;
        if (num2 != null) {
            arrayList.add("right_padding=" + num2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TableColumnHeader{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TableColumnHeader copy$default(TableColumnHeader tableColumnHeader, String str, Icon icon, Icon icon2, boolean z, Action action, Action action2, TableColumnAlignment tableColumnAlignment, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableColumnHeader.title;
        }
        if ((i & 2) != 0) {
            icon = tableColumnHeader.icon;
        }
        if ((i & 4) != 0) {
            icon2 = tableColumnHeader.secondary_icon;
        }
        if ((i & 8) != 0) {
            z = tableColumnHeader.active;
        }
        if ((i & 16) != 0) {
            action = tableColumnHeader.action;
        }
        if ((i & 32) != 0) {
            action2 = tableColumnHeader.secondary_icon_action;
        }
        if ((i & 64) != 0) {
            tableColumnAlignment = tableColumnHeader.alignment;
        }
        if ((i & 128) != 0) {
            num = tableColumnHeader.left_padding;
        }
        if ((i & 256) != 0) {
            num2 = tableColumnHeader.right_padding;
        }
        if ((i & 512) != 0) {
            byteString = tableColumnHeader.unknownFields();
        }
        Integer num3 = num2;
        ByteString byteString2 = byteString;
        TableColumnAlignment tableColumnAlignment2 = tableColumnAlignment;
        Integer num4 = num;
        Action action3 = action;
        Action action4 = action2;
        return tableColumnHeader.copy(str, icon, icon2, z, action3, action4, tableColumnAlignment2, num4, num3, byteString2);
    }

    public final TableColumnHeader copy(String title, Icon icon, Icon secondary_icon, boolean active, Action action, Action secondary_icon_action, TableColumnAlignment alignment, Integer left_padding, Integer right_padding, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TableColumnHeader(title, icon, secondary_icon, active, action, secondary_icon_action, alignment, left_padding, right_padding, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TableColumnHeader.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TableColumnHeader>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TableColumnHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TableColumnHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<Icon> protoAdapter = Icon.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getIcon()) + protoAdapter.encodedSizeWithTag(3, value.getSecondary_icon());
                if (value.getActive()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getActive()));
                }
                ProtoAdapter<Action> protoAdapter2 = Action.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, value.getAction()) + protoAdapter2.encodedSizeWithTag(6, value.getSecondary_icon_action());
                if (value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += TableColumnAlignment.ADAPTER.encodedSizeWithTag(7, value.getAlignment());
                }
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, value.getLeft_padding()) + protoAdapter3.encodedSizeWithTag(9, value.getRight_padding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TableColumnHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<Icon> protoAdapter = Icon.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getIcon());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSecondary_icon());
                if (value.getActive()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getActive()));
                }
                ProtoAdapter<Action> protoAdapter2 = Action.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getAction());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_icon_action());
                if (value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED) {
                    TableColumnAlignment.ADAPTER.encodeWithTag(writer, 7, (int) value.getAlignment());
                }
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 8, (int) value.getLeft_padding());
                protoAdapter3.encodeWithTag(writer, 9, (int) value.getRight_padding());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TableColumnHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getRight_padding());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getLeft_padding());
                if (value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED) {
                    TableColumnAlignment.ADAPTER.encodeWithTag(writer, 7, (int) value.getAlignment());
                }
                ProtoAdapter<Action> protoAdapter2 = Action.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_icon_action());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getAction());
                if (value.getActive()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getActive()));
                }
                ProtoAdapter<Icon> protoAdapter3 = Icon.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, (int) value.getSecondary_icon());
                protoAdapter3.encodeWithTag(writer, 2, (int) value.getIcon());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableColumnHeader decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TableColumnAlignment tableColumnAlignmentDecode = TableColumnAlignment.LEFT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                Action actionDecode = null;
                Action actionDecode2 = null;
                Integer numDecode = null;
                Integer numDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                Icon iconDecode2 = null;
                while (true) {
                    TableColumnAlignment tableColumnAlignment = tableColumnAlignmentDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        iconDecode2 = Icon.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        iconDecode = Icon.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 5:
                                    actionDecode = Action.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    actionDecode2 = Action.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        tableColumnAlignmentDecode = TableColumnAlignment.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 8:
                                    numDecode = ProtoAdapter.INT32.decode(reader);
                                    break;
                                case 9:
                                    numDecode2 = ProtoAdapter.INT32.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TableColumnHeader(strDecode, iconDecode2, iconDecode, zBooleanValue, actionDecode, actionDecode2, tableColumnAlignment, numDecode, numDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableColumnHeader redact(TableColumnHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                Action secondary_icon_action = value.getSecondary_icon_action();
                return TableColumnHeader.copy$default(value, null, null, null, false, actionRedact, secondary_icon_action != null ? Action.ADAPTER.redact(secondary_icon_action) : null, null, null, null, ByteString.EMPTY, 463, null);
            }
        };
    }
}
