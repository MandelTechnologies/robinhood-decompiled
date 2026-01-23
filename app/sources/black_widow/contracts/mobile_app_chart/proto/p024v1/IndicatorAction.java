package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: IndicatorAction.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016Jd\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;", "Lcom/squareup/wire/Message;", "", "add", "Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorAction;", AnalyticsStrings.BUTTON_LIST_DELETE, "Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorAction;", "reset", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ResetIndicatorAction;", "toggle_visibility", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleIndicatorVisibilityAction;", "edit_parameter", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorParameterAction;", "toggle_all_visibility", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleAllIndicatorsVisibilityAction;", "edit_line", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorLineAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/ResetIndicatorAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleIndicatorVisibilityAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorParameterAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleAllIndicatorsVisibilityAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorLineAction;Lokio/ByteString;)V", "getAdd", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorAction;", "getDelete", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorAction;", "getReset", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ResetIndicatorAction;", "getToggle_visibility", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleIndicatorVisibilityAction;", "getEdit_parameter", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorParameterAction;", "getToggle_all_visibility", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ToggleAllIndicatorsVisibilityAction;", "getEdit_line", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorLineAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorAction extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorAction> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.AddIndicatorAction#ADAPTER", oneofName = "action", schemaIndex = 0, tag = 1)
    private final AddIndicatorAction add;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.DeleteIndicatorAction#ADAPTER", oneofName = "action", schemaIndex = 1, tag = 2)
    private final DeleteIndicatorAction delete;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EditIndicatorLineAction#ADAPTER", jsonName = "editLine", oneofName = "action", schemaIndex = 6, tag = 7)
    private final EditIndicatorLineAction edit_line;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EditIndicatorParameterAction#ADAPTER", jsonName = "editParameter", oneofName = "action", schemaIndex = 4, tag = 5)
    private final EditIndicatorParameterAction edit_parameter;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ResetIndicatorAction#ADAPTER", oneofName = "action", schemaIndex = 2, tag = 3)
    private final ResetIndicatorAction reset;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ToggleAllIndicatorsVisibilityAction#ADAPTER", jsonName = "toggleAllVisibility", oneofName = "action", schemaIndex = 5, tag = 6)
    private final ToggleAllIndicatorsVisibilityAction toggle_all_visibility;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ToggleIndicatorVisibilityAction#ADAPTER", jsonName = "toggleVisibility", oneofName = "action", schemaIndex = 3, tag = 4)
    private final ToggleIndicatorVisibilityAction toggle_visibility;

    public IndicatorAction() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8599newBuilder();
    }

    public final AddIndicatorAction getAdd() {
        return this.add;
    }

    public final DeleteIndicatorAction getDelete() {
        return this.delete;
    }

    public final ResetIndicatorAction getReset() {
        return this.reset;
    }

    public final ToggleIndicatorVisibilityAction getToggle_visibility() {
        return this.toggle_visibility;
    }

    public final EditIndicatorParameterAction getEdit_parameter() {
        return this.edit_parameter;
    }

    public final ToggleAllIndicatorsVisibilityAction getToggle_all_visibility() {
        return this.toggle_all_visibility;
    }

    public final EditIndicatorLineAction getEdit_line() {
        return this.edit_line;
    }

    public /* synthetic */ IndicatorAction(AddIndicatorAction addIndicatorAction, DeleteIndicatorAction deleteIndicatorAction, ResetIndicatorAction resetIndicatorAction, ToggleIndicatorVisibilityAction toggleIndicatorVisibilityAction, EditIndicatorParameterAction editIndicatorParameterAction, ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction, EditIndicatorLineAction editIndicatorLineAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addIndicatorAction, (i & 2) != 0 ? null : deleteIndicatorAction, (i & 4) != 0 ? null : resetIndicatorAction, (i & 8) != 0 ? null : toggleIndicatorVisibilityAction, (i & 16) != 0 ? null : editIndicatorParameterAction, (i & 32) != 0 ? null : toggleAllIndicatorsVisibilityAction, (i & 64) != 0 ? null : editIndicatorLineAction, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorAction(AddIndicatorAction addIndicatorAction, DeleteIndicatorAction deleteIndicatorAction, ResetIndicatorAction resetIndicatorAction, ToggleIndicatorVisibilityAction toggleIndicatorVisibilityAction, EditIndicatorParameterAction editIndicatorParameterAction, ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction, EditIndicatorLineAction editIndicatorLineAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.add = addIndicatorAction;
        this.delete = deleteIndicatorAction;
        this.reset = resetIndicatorAction;
        this.toggle_visibility = toggleIndicatorVisibilityAction;
        this.edit_parameter = editIndicatorParameterAction;
        this.toggle_all_visibility = toggleAllIndicatorsVisibilityAction;
        this.edit_line = editIndicatorLineAction;
        if (Internal.countNonNull(addIndicatorAction, deleteIndicatorAction, resetIndicatorAction, toggleIndicatorVisibilityAction, editIndicatorParameterAction, toggleAllIndicatorsVisibilityAction, editIndicatorLineAction) > 1) {
            throw new IllegalArgumentException("At most one of add, delete, reset, toggle_visibility, edit_parameter, toggle_all_visibility, edit_line may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8599newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorAction)) {
            return false;
        }
        IndicatorAction indicatorAction = (IndicatorAction) other;
        return Intrinsics.areEqual(unknownFields(), indicatorAction.unknownFields()) && Intrinsics.areEqual(this.add, indicatorAction.add) && Intrinsics.areEqual(this.delete, indicatorAction.delete) && Intrinsics.areEqual(this.reset, indicatorAction.reset) && Intrinsics.areEqual(this.toggle_visibility, indicatorAction.toggle_visibility) && Intrinsics.areEqual(this.edit_parameter, indicatorAction.edit_parameter) && Intrinsics.areEqual(this.toggle_all_visibility, indicatorAction.toggle_all_visibility) && Intrinsics.areEqual(this.edit_line, indicatorAction.edit_line);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AddIndicatorAction addIndicatorAction = this.add;
        int iHashCode2 = (iHashCode + (addIndicatorAction != null ? addIndicatorAction.hashCode() : 0)) * 37;
        DeleteIndicatorAction deleteIndicatorAction = this.delete;
        int iHashCode3 = (iHashCode2 + (deleteIndicatorAction != null ? deleteIndicatorAction.hashCode() : 0)) * 37;
        ResetIndicatorAction resetIndicatorAction = this.reset;
        int iHashCode4 = (iHashCode3 + (resetIndicatorAction != null ? resetIndicatorAction.hashCode() : 0)) * 37;
        ToggleIndicatorVisibilityAction toggleIndicatorVisibilityAction = this.toggle_visibility;
        int iHashCode5 = (iHashCode4 + (toggleIndicatorVisibilityAction != null ? toggleIndicatorVisibilityAction.hashCode() : 0)) * 37;
        EditIndicatorParameterAction editIndicatorParameterAction = this.edit_parameter;
        int iHashCode6 = (iHashCode5 + (editIndicatorParameterAction != null ? editIndicatorParameterAction.hashCode() : 0)) * 37;
        ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction = this.toggle_all_visibility;
        int iHashCode7 = (iHashCode6 + (toggleAllIndicatorsVisibilityAction != null ? toggleAllIndicatorsVisibilityAction.hashCode() : 0)) * 37;
        EditIndicatorLineAction editIndicatorLineAction = this.edit_line;
        int iHashCode8 = iHashCode7 + (editIndicatorLineAction != null ? editIndicatorLineAction.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AddIndicatorAction addIndicatorAction = this.add;
        if (addIndicatorAction != null) {
            arrayList.add("add=" + addIndicatorAction);
        }
        DeleteIndicatorAction deleteIndicatorAction = this.delete;
        if (deleteIndicatorAction != null) {
            arrayList.add("delete=" + deleteIndicatorAction);
        }
        ResetIndicatorAction resetIndicatorAction = this.reset;
        if (resetIndicatorAction != null) {
            arrayList.add("reset=" + resetIndicatorAction);
        }
        ToggleIndicatorVisibilityAction toggleIndicatorVisibilityAction = this.toggle_visibility;
        if (toggleIndicatorVisibilityAction != null) {
            arrayList.add("toggle_visibility=" + toggleIndicatorVisibilityAction);
        }
        EditIndicatorParameterAction editIndicatorParameterAction = this.edit_parameter;
        if (editIndicatorParameterAction != null) {
            arrayList.add("edit_parameter=" + editIndicatorParameterAction);
        }
        ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityAction = this.toggle_all_visibility;
        if (toggleAllIndicatorsVisibilityAction != null) {
            arrayList.add("toggle_all_visibility=" + toggleAllIndicatorsVisibilityAction);
        }
        EditIndicatorLineAction editIndicatorLineAction = this.edit_line;
        if (editIndicatorLineAction != null) {
            arrayList.add("edit_line=" + editIndicatorLineAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorAction{", "}", 0, null, null, 56, null);
    }

    public final IndicatorAction copy(AddIndicatorAction add, DeleteIndicatorAction delete, ResetIndicatorAction reset, ToggleIndicatorVisibilityAction toggle_visibility, EditIndicatorParameterAction edit_parameter, ToggleAllIndicatorsVisibilityAction toggle_all_visibility, EditIndicatorLineAction edit_line, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorAction(add, delete, reset, toggle_visibility, edit_parameter, toggle_all_visibility, edit_line, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + AddIndicatorAction.ADAPTER.encodedSizeWithTag(1, value.getAdd()) + DeleteIndicatorAction.ADAPTER.encodedSizeWithTag(2, value.getDelete()) + ResetIndicatorAction.ADAPTER.encodedSizeWithTag(3, value.getReset()) + ToggleIndicatorVisibilityAction.ADAPTER.encodedSizeWithTag(4, value.getToggle_visibility()) + EditIndicatorParameterAction.ADAPTER.encodedSizeWithTag(5, value.getEdit_parameter()) + ToggleAllIndicatorsVisibilityAction.ADAPTER.encodedSizeWithTag(6, value.getToggle_all_visibility()) + EditIndicatorLineAction.ADAPTER.encodedSizeWithTag(7, value.getEdit_line());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AddIndicatorAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd());
                DeleteIndicatorAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelete());
                ResetIndicatorAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getReset());
                ToggleIndicatorVisibilityAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getToggle_visibility());
                EditIndicatorParameterAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getEdit_parameter());
                ToggleAllIndicatorsVisibilityAction.ADAPTER.encodeWithTag(writer, 6, (int) value.getToggle_all_visibility());
                EditIndicatorLineAction.ADAPTER.encodeWithTag(writer, 7, (int) value.getEdit_line());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EditIndicatorLineAction.ADAPTER.encodeWithTag(writer, 7, (int) value.getEdit_line());
                ToggleAllIndicatorsVisibilityAction.ADAPTER.encodeWithTag(writer, 6, (int) value.getToggle_all_visibility());
                EditIndicatorParameterAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getEdit_parameter());
                ToggleIndicatorVisibilityAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getToggle_visibility());
                ResetIndicatorAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getReset());
                DeleteIndicatorAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelete());
                AddIndicatorAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorAction redact(IndicatorAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AddIndicatorAction add = value.getAdd();
                AddIndicatorAction addIndicatorActionRedact = add != null ? AddIndicatorAction.ADAPTER.redact(add) : null;
                DeleteIndicatorAction delete = value.getDelete();
                DeleteIndicatorAction deleteIndicatorActionRedact = delete != null ? DeleteIndicatorAction.ADAPTER.redact(delete) : null;
                ResetIndicatorAction reset = value.getReset();
                ResetIndicatorAction resetIndicatorActionRedact = reset != null ? ResetIndicatorAction.ADAPTER.redact(reset) : null;
                ToggleIndicatorVisibilityAction toggle_visibility = value.getToggle_visibility();
                ToggleIndicatorVisibilityAction toggleIndicatorVisibilityActionRedact = toggle_visibility != null ? ToggleIndicatorVisibilityAction.ADAPTER.redact(toggle_visibility) : null;
                EditIndicatorParameterAction edit_parameter = value.getEdit_parameter();
                EditIndicatorParameterAction editIndicatorParameterActionRedact = edit_parameter != null ? EditIndicatorParameterAction.ADAPTER.redact(edit_parameter) : null;
                ToggleAllIndicatorsVisibilityAction toggle_all_visibility = value.getToggle_all_visibility();
                ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityActionRedact = toggle_all_visibility != null ? ToggleAllIndicatorsVisibilityAction.ADAPTER.redact(toggle_all_visibility) : null;
                EditIndicatorLineAction edit_line = value.getEdit_line();
                return value.copy(addIndicatorActionRedact, deleteIndicatorActionRedact, resetIndicatorActionRedact, toggleIndicatorVisibilityActionRedact, editIndicatorParameterActionRedact, toggleAllIndicatorsVisibilityActionRedact, edit_line != null ? EditIndicatorLineAction.ADAPTER.redact(edit_line) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AddIndicatorAction addIndicatorActionDecode = null;
                DeleteIndicatorAction deleteIndicatorActionDecode = null;
                ResetIndicatorAction resetIndicatorActionDecode = null;
                ToggleIndicatorVisibilityAction toggleIndicatorVisibilityActionDecode = null;
                EditIndicatorParameterAction editIndicatorParameterActionDecode = null;
                ToggleAllIndicatorsVisibilityAction toggleAllIndicatorsVisibilityActionDecode = null;
                EditIndicatorLineAction editIndicatorLineActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                addIndicatorActionDecode = AddIndicatorAction.ADAPTER.decode(reader);
                                break;
                            case 2:
                                deleteIndicatorActionDecode = DeleteIndicatorAction.ADAPTER.decode(reader);
                                break;
                            case 3:
                                resetIndicatorActionDecode = ResetIndicatorAction.ADAPTER.decode(reader);
                                break;
                            case 4:
                                toggleIndicatorVisibilityActionDecode = ToggleIndicatorVisibilityAction.ADAPTER.decode(reader);
                                break;
                            case 5:
                                editIndicatorParameterActionDecode = EditIndicatorParameterAction.ADAPTER.decode(reader);
                                break;
                            case 6:
                                toggleAllIndicatorsVisibilityActionDecode = ToggleAllIndicatorsVisibilityAction.ADAPTER.decode(reader);
                                break;
                            case 7:
                                editIndicatorLineActionDecode = EditIndicatorLineAction.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new IndicatorAction(addIndicatorActionDecode, deleteIndicatorActionDecode, resetIndicatorActionDecode, toggleIndicatorVisibilityActionDecode, editIndicatorParameterActionDecode, toggleAllIndicatorsVisibilityActionDecode, editIndicatorLineActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
