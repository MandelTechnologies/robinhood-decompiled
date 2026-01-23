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

/* compiled from: IndicatorTemplateAction.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorTemplateAction;", "Lcom/squareup/wire/Message;", "", "add", "Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorTemplateAction;", AnalyticsStrings.BUTTON_LIST_DELETE, "Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorTemplateAction;", "rename", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RenameIndicatorTemplateAction;", "apply", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ApplyIndicatorTemplateAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorTemplateAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorTemplateAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/RenameIndicatorTemplateAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/ApplyIndicatorTemplateAction;Lokio/ByteString;)V", "getAdd", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/AddIndicatorTemplateAction;", "getDelete", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DeleteIndicatorTemplateAction;", "getRename", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/RenameIndicatorTemplateAction;", "getApply", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ApplyIndicatorTemplateAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorTemplateAction extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorTemplateAction> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.AddIndicatorTemplateAction#ADAPTER", oneofName = "action", schemaIndex = 0, tag = 1)
    private final AddIndicatorTemplateAction add;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ApplyIndicatorTemplateAction#ADAPTER", oneofName = "action", schemaIndex = 3, tag = 4)
    private final ApplyIndicatorTemplateAction apply;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.DeleteIndicatorTemplateAction#ADAPTER", oneofName = "action", schemaIndex = 1, tag = 2)
    private final DeleteIndicatorTemplateAction delete;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.RenameIndicatorTemplateAction#ADAPTER", oneofName = "action", schemaIndex = 2, tag = 3)
    private final RenameIndicatorTemplateAction rename;

    public IndicatorTemplateAction() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8612newBuilder();
    }

    public final AddIndicatorTemplateAction getAdd() {
        return this.add;
    }

    public final DeleteIndicatorTemplateAction getDelete() {
        return this.delete;
    }

    public final RenameIndicatorTemplateAction getRename() {
        return this.rename;
    }

    public final ApplyIndicatorTemplateAction getApply() {
        return this.apply;
    }

    public /* synthetic */ IndicatorTemplateAction(AddIndicatorTemplateAction addIndicatorTemplateAction, DeleteIndicatorTemplateAction deleteIndicatorTemplateAction, RenameIndicatorTemplateAction renameIndicatorTemplateAction, ApplyIndicatorTemplateAction applyIndicatorTemplateAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addIndicatorTemplateAction, (i & 2) != 0 ? null : deleteIndicatorTemplateAction, (i & 4) != 0 ? null : renameIndicatorTemplateAction, (i & 8) != 0 ? null : applyIndicatorTemplateAction, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorTemplateAction(AddIndicatorTemplateAction addIndicatorTemplateAction, DeleteIndicatorTemplateAction deleteIndicatorTemplateAction, RenameIndicatorTemplateAction renameIndicatorTemplateAction, ApplyIndicatorTemplateAction applyIndicatorTemplateAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.add = addIndicatorTemplateAction;
        this.delete = deleteIndicatorTemplateAction;
        this.rename = renameIndicatorTemplateAction;
        this.apply = applyIndicatorTemplateAction;
        if (Internal.countNonNull(addIndicatorTemplateAction, deleteIndicatorTemplateAction, renameIndicatorTemplateAction, applyIndicatorTemplateAction, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of add, delete, rename, apply may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8612newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorTemplateAction)) {
            return false;
        }
        IndicatorTemplateAction indicatorTemplateAction = (IndicatorTemplateAction) other;
        return Intrinsics.areEqual(unknownFields(), indicatorTemplateAction.unknownFields()) && Intrinsics.areEqual(this.add, indicatorTemplateAction.add) && Intrinsics.areEqual(this.delete, indicatorTemplateAction.delete) && Intrinsics.areEqual(this.rename, indicatorTemplateAction.rename) && Intrinsics.areEqual(this.apply, indicatorTemplateAction.apply);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AddIndicatorTemplateAction addIndicatorTemplateAction = this.add;
        int iHashCode2 = (iHashCode + (addIndicatorTemplateAction != null ? addIndicatorTemplateAction.hashCode() : 0)) * 37;
        DeleteIndicatorTemplateAction deleteIndicatorTemplateAction = this.delete;
        int iHashCode3 = (iHashCode2 + (deleteIndicatorTemplateAction != null ? deleteIndicatorTemplateAction.hashCode() : 0)) * 37;
        RenameIndicatorTemplateAction renameIndicatorTemplateAction = this.rename;
        int iHashCode4 = (iHashCode3 + (renameIndicatorTemplateAction != null ? renameIndicatorTemplateAction.hashCode() : 0)) * 37;
        ApplyIndicatorTemplateAction applyIndicatorTemplateAction = this.apply;
        int iHashCode5 = iHashCode4 + (applyIndicatorTemplateAction != null ? applyIndicatorTemplateAction.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AddIndicatorTemplateAction addIndicatorTemplateAction = this.add;
        if (addIndicatorTemplateAction != null) {
            arrayList.add("add=" + addIndicatorTemplateAction);
        }
        DeleteIndicatorTemplateAction deleteIndicatorTemplateAction = this.delete;
        if (deleteIndicatorTemplateAction != null) {
            arrayList.add("delete=" + deleteIndicatorTemplateAction);
        }
        RenameIndicatorTemplateAction renameIndicatorTemplateAction = this.rename;
        if (renameIndicatorTemplateAction != null) {
            arrayList.add("rename=" + renameIndicatorTemplateAction);
        }
        ApplyIndicatorTemplateAction applyIndicatorTemplateAction = this.apply;
        if (applyIndicatorTemplateAction != null) {
            arrayList.add("apply=" + applyIndicatorTemplateAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorTemplateAction{", "}", 0, null, null, 56, null);
    }

    public final IndicatorTemplateAction copy(AddIndicatorTemplateAction add, DeleteIndicatorTemplateAction delete, RenameIndicatorTemplateAction rename, ApplyIndicatorTemplateAction apply, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorTemplateAction(add, delete, rename, apply, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorTemplateAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorTemplateAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorTemplateAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorTemplateAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + AddIndicatorTemplateAction.ADAPTER.encodedSizeWithTag(1, value.getAdd()) + DeleteIndicatorTemplateAction.ADAPTER.encodedSizeWithTag(2, value.getDelete()) + RenameIndicatorTemplateAction.ADAPTER.encodedSizeWithTag(3, value.getRename()) + ApplyIndicatorTemplateAction.ADAPTER.encodedSizeWithTag(4, value.getApply());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorTemplateAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AddIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd());
                DeleteIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelete());
                RenameIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getRename());
                ApplyIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getApply());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorTemplateAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ApplyIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getApply());
                RenameIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getRename());
                DeleteIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelete());
                AddIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAdd());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorTemplateAction redact(IndicatorTemplateAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AddIndicatorTemplateAction add = value.getAdd();
                AddIndicatorTemplateAction addIndicatorTemplateActionRedact = add != null ? AddIndicatorTemplateAction.ADAPTER.redact(add) : null;
                DeleteIndicatorTemplateAction delete = value.getDelete();
                DeleteIndicatorTemplateAction deleteIndicatorTemplateActionRedact = delete != null ? DeleteIndicatorTemplateAction.ADAPTER.redact(delete) : null;
                RenameIndicatorTemplateAction rename = value.getRename();
                RenameIndicatorTemplateAction renameIndicatorTemplateActionRedact = rename != null ? RenameIndicatorTemplateAction.ADAPTER.redact(rename) : null;
                ApplyIndicatorTemplateAction apply = value.getApply();
                return value.copy(addIndicatorTemplateActionRedact, deleteIndicatorTemplateActionRedact, renameIndicatorTemplateActionRedact, apply != null ? ApplyIndicatorTemplateAction.ADAPTER.redact(apply) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorTemplateAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AddIndicatorTemplateAction addIndicatorTemplateActionDecode = null;
                DeleteIndicatorTemplateAction deleteIndicatorTemplateActionDecode = null;
                RenameIndicatorTemplateAction renameIndicatorTemplateActionDecode = null;
                ApplyIndicatorTemplateAction applyIndicatorTemplateActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IndicatorTemplateAction(addIndicatorTemplateActionDecode, deleteIndicatorTemplateActionDecode, renameIndicatorTemplateActionDecode, applyIndicatorTemplateActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        addIndicatorTemplateActionDecode = AddIndicatorTemplateAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        deleteIndicatorTemplateActionDecode = DeleteIndicatorTemplateAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        renameIndicatorTemplateActionDecode = RenameIndicatorTemplateAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        applyIndicatorTemplateActionDecode = ApplyIndicatorTemplateAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
