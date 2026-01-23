package rh_server_driven_ui.p531v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.TimelineRow;

/* compiled from: TimelineRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'(B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRow;", "Lcom/squareup/wire/Message;", "", "state", "Lrh_server_driven_ui/v1/TimelineRow$State;", "primary_information", "", "secondary_information", "detail_text", "detail_action", "Lrh_server_driven_ui/v1/Action;", "info_icon", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "action", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/TimelineRow$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getState", "()Lrh_server_driven_ui/v1/TimelineRow$State;", "getPrimary_information", "()Ljava/lang/String;", "getSecondary_information", "getDetail_text", "getDetail_action", "()Lrh_server_driven_ui/v1/Action;", "getInfo_icon", "()Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "getAction", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "InfoIcon", "State", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TimelineRow extends Message {

    @JvmField
    public static final ProtoAdapter<TimelineRow> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 6, tag = 7)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "detailAction", schemaIndex = 4, tag = 5)
    private final Action detail_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailText", schemaIndex = 3, tag = 4)
    private final String detail_text;

    @WireField(adapter = "rh_server_driven_ui.v1.TimelineRow$InfoIcon#ADAPTER", jsonName = "infoIcon", schemaIndex = 5, tag = 6)
    private final InfoIcon info_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryInformation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_information;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryInformation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String secondary_information;

    @WireField(adapter = "rh_server_driven_ui.v1.TimelineRow$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final State state;

    public TimelineRow() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29855newBuilder();
    }

    public final State getState() {
        return this.state;
    }

    public /* synthetic */ TimelineRow(State state, String str, String str2, String str3, Action action, InfoIcon infoIcon, Action action2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.STATE_UNSPECIFIED : state, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : infoIcon, (i & 64) != 0 ? null : action2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrimary_information() {
        return this.primary_information;
    }

    public final String getSecondary_information() {
        return this.secondary_information;
    }

    public final String getDetail_text() {
        return this.detail_text;
    }

    public final Action getDetail_action() {
        return this.detail_action;
    }

    public final InfoIcon getInfo_icon() {
        return this.info_icon;
    }

    public final Action getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineRow(State state, String primary_information, String secondary_information, String str, Action action, InfoIcon infoIcon, Action action2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(primary_information, "primary_information");
        Intrinsics.checkNotNullParameter(secondary_information, "secondary_information");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.primary_information = primary_information;
        this.secondary_information = secondary_information;
        this.detail_text = str;
        this.detail_action = action;
        this.info_icon = infoIcon;
        this.action = action2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29855newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimelineRow)) {
            return false;
        }
        TimelineRow timelineRow = (TimelineRow) other;
        return Intrinsics.areEqual(unknownFields(), timelineRow.unknownFields()) && this.state == timelineRow.state && Intrinsics.areEqual(this.primary_information, timelineRow.primary_information) && Intrinsics.areEqual(this.secondary_information, timelineRow.secondary_information) && Intrinsics.areEqual(this.detail_text, timelineRow.detail_text) && Intrinsics.areEqual(this.detail_action, timelineRow.detail_action) && this.info_icon == timelineRow.info_icon && Intrinsics.areEqual(this.action, timelineRow.action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37) + this.primary_information.hashCode()) * 37) + this.secondary_information.hashCode()) * 37;
        String str = this.detail_text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.detail_action;
        int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        InfoIcon infoIcon = this.info_icon;
        int iHashCode4 = (iHashCode3 + (infoIcon != null ? infoIcon.hashCode() : 0)) * 37;
        Action action2 = this.action;
        int iHashCode5 = iHashCode4 + (action2 != null ? action2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        arrayList.add("primary_information=" + Internal.sanitize(this.primary_information));
        arrayList.add("secondary_information=" + Internal.sanitize(this.secondary_information));
        String str = this.detail_text;
        if (str != null) {
            arrayList.add("detail_text=" + Internal.sanitize(str));
        }
        Action action = this.detail_action;
        if (action != null) {
            arrayList.add("detail_action=" + action);
        }
        InfoIcon infoIcon = this.info_icon;
        if (infoIcon != null) {
            arrayList.add("info_icon=" + infoIcon);
        }
        Action action2 = this.action;
        if (action2 != null) {
            arrayList.add("action=" + action2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TimelineRow copy$default(TimelineRow timelineRow, State state, String str, String str2, String str3, Action action, InfoIcon infoIcon, Action action2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            state = timelineRow.state;
        }
        if ((i & 2) != 0) {
            str = timelineRow.primary_information;
        }
        if ((i & 4) != 0) {
            str2 = timelineRow.secondary_information;
        }
        if ((i & 8) != 0) {
            str3 = timelineRow.detail_text;
        }
        if ((i & 16) != 0) {
            action = timelineRow.detail_action;
        }
        if ((i & 32) != 0) {
            infoIcon = timelineRow.info_icon;
        }
        if ((i & 64) != 0) {
            action2 = timelineRow.action;
        }
        if ((i & 128) != 0) {
            byteString = timelineRow.unknownFields();
        }
        Action action3 = action2;
        ByteString byteString2 = byteString;
        Action action4 = action;
        InfoIcon infoIcon2 = infoIcon;
        return timelineRow.copy(state, str, str2, str3, action4, infoIcon2, action3, byteString2);
    }

    public final TimelineRow copy(State state, String primary_information, String secondary_information, String detail_text, Action detail_action, InfoIcon info_icon, Action action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(primary_information, "primary_information");
        Intrinsics.checkNotNullParameter(secondary_information, "secondary_information");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimelineRow(state, primary_information, secondary_information, detail_text, detail_action, info_icon, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimelineRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimelineRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TimelineRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimelineRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != TimelineRow.State.STATE_UNSPECIFIED) {
                    size += TimelineRow.State.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (!Intrinsics.areEqual(value.getPrimary_information(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_information());
                }
                if (!Intrinsics.areEqual(value.getSecondary_information(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSecondary_information());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDetail_text());
                ProtoAdapter<Action> protoAdapter = Action.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getDetail_action()) + TimelineRow.InfoIcon.ADAPTER.encodedSizeWithTag(6, value.getInfo_icon()) + protoAdapter.encodedSizeWithTag(7, value.getAction());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimelineRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != TimelineRow.State.STATE_UNSPECIFIED) {
                    TimelineRow.State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getPrimary_information(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_information());
                }
                if (!Intrinsics.areEqual(value.getSecondary_information(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSecondary_information());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDetail_text());
                ProtoAdapter<Action> protoAdapter = Action.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDetail_action());
                TimelineRow.InfoIcon.ADAPTER.encodeWithTag(writer, 6, (int) value.getInfo_icon());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAction());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimelineRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Action> protoAdapter = Action.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAction());
                TimelineRow.InfoIcon.ADAPTER.encodeWithTag(writer, 6, (int) value.getInfo_icon());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDetail_action());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getDetail_text());
                if (!Intrinsics.areEqual(value.getSecondary_information(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getSecondary_information());
                }
                if (!Intrinsics.areEqual(value.getPrimary_information(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getPrimary_information());
                }
                if (value.getState() != TimelineRow.State.STATE_UNSPECIFIED) {
                    TimelineRow.State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimelineRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TimelineRow.State state = TimelineRow.State.STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Action actionDecode = null;
                TimelineRow.InfoIcon infoIconDecode = null;
                Action actionDecode2 = null;
                TimelineRow.State stateDecode = state;
                String strDecode3 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    stateDecode = TimelineRow.State.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 6:
                                try {
                                    infoIconDecode = TimelineRow.InfoIcon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                actionDecode2 = Action.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TimelineRow(stateDecode, strDecode3, strDecode, strDecode2, actionDecode, infoIconDecode, actionDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimelineRow redact(TimelineRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action detail_action = value.getDetail_action();
                Action actionRedact = detail_action != null ? Action.ADAPTER.redact(detail_action) : null;
                Action action = value.getAction();
                return TimelineRow.copy$default(value, null, null, null, null, actionRedact, null, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 47, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INFO_ICON_UNSPECIFIED", "INFO_ICON_TITLE", "INFO_ICON_METADATA", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class InfoIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoIcon[] $VALUES;

        @JvmField
        public static final ProtoAdapter<InfoIcon> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InfoIcon INFO_ICON_METADATA;
        public static final InfoIcon INFO_ICON_TITLE;
        public static final InfoIcon INFO_ICON_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ InfoIcon[] $values() {
            return new InfoIcon[]{INFO_ICON_UNSPECIFIED, INFO_ICON_TITLE, INFO_ICON_METADATA};
        }

        @JvmStatic
        public static final InfoIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<InfoIcon> getEntries() {
            return $ENTRIES;
        }

        private InfoIcon(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final InfoIcon infoIcon = new InfoIcon("INFO_ICON_UNSPECIFIED", 0, 0);
            INFO_ICON_UNSPECIFIED = infoIcon;
            INFO_ICON_TITLE = new InfoIcon("INFO_ICON_TITLE", 1, 1);
            INFO_ICON_METADATA = new InfoIcon("INFO_ICON_METADATA", 2, 2);
            InfoIcon[] infoIconArr$values = $values();
            $VALUES = infoIconArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoIconArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InfoIcon.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<InfoIcon>(orCreateKotlinClass, syntax, infoIcon) { // from class: rh_server_driven_ui.v1.TimelineRow$InfoIcon$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TimelineRow.InfoIcon fromValue(int value) {
                    return TimelineRow.InfoIcon.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TimelineRow.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRow$InfoIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final InfoIcon fromValue(int value) {
                if (value == 0) {
                    return InfoIcon.INFO_ICON_UNSPECIFIED;
                }
                if (value == 1) {
                    return InfoIcon.INFO_ICON_TITLE;
                }
                if (value != 2) {
                    return null;
                }
                return InfoIcon.INFO_ICON_METADATA;
            }
        }

        public static InfoIcon valueOf(String str) {
            return (InfoIcon) Enum.valueOf(InfoIcon.class, str);
        }

        public static InfoIcon[] values() {
            return (InfoIcon[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRow$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "STATE_INCOMPLETE", "STATE_COMPLETE", "STATE_ERROR", "STATE_WARNING", "STATE_ONGOING", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State STATE_COMPLETE;
        public static final State STATE_ERROR;
        public static final State STATE_INCOMPLETE;
        public static final State STATE_ONGOING;
        public static final State STATE_UNSPECIFIED;
        public static final State STATE_WARNING;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_UNSPECIFIED, STATE_INCOMPLETE, STATE_COMPLETE, STATE_ERROR, STATE_WARNING, STATE_ONGOING};
        }

        @JvmStatic
        public static final State fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final State state = new State("STATE_UNSPECIFIED", 0, 0);
            STATE_UNSPECIFIED = state;
            STATE_INCOMPLETE = new State("STATE_INCOMPLETE", 1, 1);
            STATE_COMPLETE = new State("STATE_COMPLETE", 2, 2);
            STATE_ERROR = new State("STATE_ERROR", 3, 3);
            STATE_WARNING = new State("STATE_WARNING", 4, 4);
            STATE_ONGOING = new State("STATE_ONGOING", 5, 5);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: rh_server_driven_ui.v1.TimelineRow$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TimelineRow.State fromValue(int value) {
                    return TimelineRow.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TimelineRow.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRow$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TimelineRow$State;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return State.STATE_INCOMPLETE;
                }
                if (value == 2) {
                    return State.STATE_COMPLETE;
                }
                if (value == 3) {
                    return State.STATE_ERROR;
                }
                if (value == 4) {
                    return State.STATE_WARNING;
                }
                if (value != 5) {
                    return null;
                }
                return State.STATE_ONGOING;
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }
}
