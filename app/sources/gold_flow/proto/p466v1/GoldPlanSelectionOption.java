package gold_flow.proto.p466v1;

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

/* compiled from: GoldPlanSelectionOption.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u007f\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010'R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006)"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOption;", "Lcom/squareup/wire/Message;", "", "title", "", "plan_id", "badge", "description", "description_secondary", "on_select_action", "Lgold_flow/proto/v1/Action;", "logging_identifier", "is_selected", "", "accessibility_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Action;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getPlan_id", "getBadge", "getDescription", "getDescription_secondary", "getOn_select_action", "()Lgold_flow/proto/v1/Action;", "getLogging_identifier", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccessibility_identifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Action;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)Lgold_flow/proto/v1/GoldPlanSelectionOption;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GoldPlanSelectionOption extends Message {

    @JvmField
    public static final ProtoAdapter<GoldPlanSelectionOption> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accessibilityIdentifier", schemaIndex = 8, tag = 9)
    private final String accessibility_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String badge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionSecondary", schemaIndex = 4, tag = 5)
    private final String description_secondary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSelected", schemaIndex = 7, tag = 8)
    private final Boolean is_selected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "gold_flow.proto.v1.Action#ADAPTER", jsonName = "onSelectAction", schemaIndex = 5, tag = 6)
    private final Action on_select_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "planId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String plan_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public GoldPlanSelectionOption() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28161newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPlan_id() {
        return this.plan_id;
    }

    public /* synthetic */ GoldPlanSelectionOption(String str, String str2, String str3, String str4, String str5, Action action, String str6, Boolean bool, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : action, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBadge() {
        return this.badge;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescription_secondary() {
        return this.description_secondary;
    }

    public final Action getOn_select_action() {
        return this.on_select_action;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* renamed from: is_selected, reason: from getter */
    public final Boolean getIs_selected() {
        return this.is_selected;
    }

    public final String getAccessibility_identifier() {
        return this.accessibility_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPlanSelectionOption(String str, String plan_id, String str2, String str3, String str4, Action action, String str5, Boolean bool, String str6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.plan_id = plan_id;
        this.badge = str2;
        this.description = str3;
        this.description_secondary = str4;
        this.on_select_action = action;
        this.logging_identifier = str5;
        this.is_selected = bool;
        this.accessibility_identifier = str6;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28161newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldPlanSelectionOption)) {
            return false;
        }
        GoldPlanSelectionOption goldPlanSelectionOption = (GoldPlanSelectionOption) other;
        return Intrinsics.areEqual(unknownFields(), goldPlanSelectionOption.unknownFields()) && Intrinsics.areEqual(this.title, goldPlanSelectionOption.title) && Intrinsics.areEqual(this.plan_id, goldPlanSelectionOption.plan_id) && Intrinsics.areEqual(this.badge, goldPlanSelectionOption.badge) && Intrinsics.areEqual(this.description, goldPlanSelectionOption.description) && Intrinsics.areEqual(this.description_secondary, goldPlanSelectionOption.description_secondary) && Intrinsics.areEqual(this.on_select_action, goldPlanSelectionOption.on_select_action) && Intrinsics.areEqual(this.logging_identifier, goldPlanSelectionOption.logging_identifier) && Intrinsics.areEqual(this.is_selected, goldPlanSelectionOption.is_selected) && Intrinsics.areEqual(this.accessibility_identifier, goldPlanSelectionOption.accessibility_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.plan_id.hashCode()) * 37;
        String str2 = this.badge;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.description_secondary;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Action action = this.on_select_action;
        int iHashCode6 = (iHashCode5 + (action != null ? action.hashCode() : 0)) * 37;
        String str5 = this.logging_identifier;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.is_selected;
        int iHashCode8 = (iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str6 = this.accessibility_identifier;
        int iHashCode9 = iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        arrayList.add("plan_id=" + Internal.sanitize(this.plan_id));
        String str2 = this.badge;
        if (str2 != null) {
            arrayList.add("badge=" + Internal.sanitize(str2));
        }
        String str3 = this.description;
        if (str3 != null) {
            arrayList.add("description=" + Internal.sanitize(str3));
        }
        String str4 = this.description_secondary;
        if (str4 != null) {
            arrayList.add("description_secondary=" + Internal.sanitize(str4));
        }
        Action action = this.on_select_action;
        if (action != null) {
            arrayList.add("on_select_action=" + action);
        }
        String str5 = this.logging_identifier;
        if (str5 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str5));
        }
        Boolean bool = this.is_selected;
        if (bool != null) {
            arrayList.add("is_selected=" + bool);
        }
        String str6 = this.accessibility_identifier;
        if (str6 != null) {
            arrayList.add("accessibility_identifier=" + Internal.sanitize(str6));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldPlanSelectionOption{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldPlanSelectionOption copy$default(GoldPlanSelectionOption goldPlanSelectionOption, String str, String str2, String str3, String str4, String str5, Action action, String str6, Boolean bool, String str7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldPlanSelectionOption.title;
        }
        if ((i & 2) != 0) {
            str2 = goldPlanSelectionOption.plan_id;
        }
        if ((i & 4) != 0) {
            str3 = goldPlanSelectionOption.badge;
        }
        if ((i & 8) != 0) {
            str4 = goldPlanSelectionOption.description;
        }
        if ((i & 16) != 0) {
            str5 = goldPlanSelectionOption.description_secondary;
        }
        if ((i & 32) != 0) {
            action = goldPlanSelectionOption.on_select_action;
        }
        if ((i & 64) != 0) {
            str6 = goldPlanSelectionOption.logging_identifier;
        }
        if ((i & 128) != 0) {
            bool = goldPlanSelectionOption.is_selected;
        }
        if ((i & 256) != 0) {
            str7 = goldPlanSelectionOption.accessibility_identifier;
        }
        if ((i & 512) != 0) {
            byteString = goldPlanSelectionOption.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str6;
        Boolean bool2 = bool;
        String str10 = str5;
        Action action2 = action;
        return goldPlanSelectionOption.copy(str, str2, str3, str4, str10, action2, str9, bool2, str8, byteString2);
    }

    public final GoldPlanSelectionOption copy(String title, String plan_id, String badge, String description, String description_secondary, Action on_select_action, String logging_identifier, Boolean is_selected, String accessibility_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldPlanSelectionOption(title, plan_id, badge, description, description_secondary, on_select_action, logging_identifier, is_selected, accessibility_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldPlanSelectionOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldPlanSelectionOption>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.GoldPlanSelectionOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldPlanSelectionOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle());
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getPlan_id());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getBadge()) + protoAdapter.encodedSizeWithTag(4, value.getDescription()) + protoAdapter.encodedSizeWithTag(5, value.getDescription_secondary()) + Action.ADAPTER.encodedSizeWithTag(6, value.getOn_select_action()) + protoAdapter.encodedSizeWithTag(7, value.getLogging_identifier()) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.getIs_selected()) + protoAdapter.encodedSizeWithTag(9, value.getAccessibility_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldPlanSelectionOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPlan_id());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBadge());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription_secondary());
                Action.ADAPTER.encodeWithTag(writer, 6, (int) value.getOn_select_action());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getIs_selected());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getAccessibility_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldPlanSelectionOption value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getAccessibility_identifier());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getIs_selected());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                Action.ADAPTER.encodeWithTag(writer, 6, (int) value.getOn_select_action());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription_secondary());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBadge());
                if (!Intrinsics.areEqual(value.getPlan_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPlan_id());
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldPlanSelectionOption redact(GoldPlanSelectionOption value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action on_select_action = value.getOn_select_action();
                return GoldPlanSelectionOption.copy$default(value, null, null, null, null, null, on_select_action != null ? Action.ADAPTER.redact(on_select_action) : null, null, null, null, ByteString.EMPTY, 479, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldPlanSelectionOption decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                Action actionDecode = null;
                String strDecode4 = null;
                Boolean boolDecode = null;
                String strDecode5 = null;
                String strDecode6 = "";
                String strDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GoldPlanSelectionOption(strDecode, strDecode6, strDecode7, strDecode2, strDecode3, actionDecode, strDecode4, boolDecode, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
