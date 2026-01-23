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

/* compiled from: GenericAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/GenericAction;", "Lcom/squareup/wire/Message;", "", "dismiss", "Lrh_server_driven_ui/v1/DismissAction;", "deeplink", "Lrh_server_driven_ui/v1/DeepLinkAction;", "alert", "Lrh_server_driven_ui/v1/AlertAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/DismissAction;Lrh_server_driven_ui/v1/DeepLinkAction;Lrh_server_driven_ui/v1/AlertAction;Lokio/ByteString;)V", "getDismiss", "()Lrh_server_driven_ui/v1/DismissAction;", "getDeeplink", "()Lrh_server_driven_ui/v1/DeepLinkAction;", "getAlert", "()Lrh_server_driven_ui/v1/AlertAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GenericAction extends Message {

    @JvmField
    public static final ProtoAdapter<GenericAction> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.AlertAction#ADAPTER", oneofName = "action", schemaIndex = 2, tag = 3)
    private final AlertAction alert;

    @WireField(adapter = "rh_server_driven_ui.v1.DeepLinkAction#ADAPTER", oneofName = "action", schemaIndex = 1, tag = 2)
    private final DeepLinkAction deeplink;

    @WireField(adapter = "rh_server_driven_ui.v1.DismissAction#ADAPTER", oneofName = "action", schemaIndex = 0, tag = 1)
    private final DismissAction dismiss;

    public GenericAction() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29740newBuilder();
    }

    public final DismissAction getDismiss() {
        return this.dismiss;
    }

    public final DeepLinkAction getDeeplink() {
        return this.deeplink;
    }

    public final AlertAction getAlert() {
        return this.alert;
    }

    public /* synthetic */ GenericAction(DismissAction dismissAction, DeepLinkAction deepLinkAction, AlertAction alertAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dismissAction, (i & 2) != 0 ? null : deepLinkAction, (i & 4) != 0 ? null : alertAction, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericAction(DismissAction dismissAction, DeepLinkAction deepLinkAction, AlertAction alertAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dismiss = dismissAction;
        this.deeplink = deepLinkAction;
        this.alert = alertAction;
        if (Internal.countNonNull(dismissAction, deepLinkAction, alertAction) > 1) {
            throw new IllegalArgumentException("At most one of dismiss, deeplink, alert may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29740newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GenericAction)) {
            return false;
        }
        GenericAction genericAction = (GenericAction) other;
        return Intrinsics.areEqual(unknownFields(), genericAction.unknownFields()) && Intrinsics.areEqual(this.dismiss, genericAction.dismiss) && Intrinsics.areEqual(this.deeplink, genericAction.deeplink) && Intrinsics.areEqual(this.alert, genericAction.alert);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DismissAction dismissAction = this.dismiss;
        int iHashCode2 = (iHashCode + (dismissAction != null ? dismissAction.hashCode() : 0)) * 37;
        DeepLinkAction deepLinkAction = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deepLinkAction != null ? deepLinkAction.hashCode() : 0)) * 37;
        AlertAction alertAction = this.alert;
        int iHashCode4 = iHashCode3 + (alertAction != null ? alertAction.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DismissAction dismissAction = this.dismiss;
        if (dismissAction != null) {
            arrayList.add("dismiss=" + dismissAction);
        }
        DeepLinkAction deepLinkAction = this.deeplink;
        if (deepLinkAction != null) {
            arrayList.add("deeplink=" + deepLinkAction);
        }
        AlertAction alertAction = this.alert;
        if (alertAction != null) {
            arrayList.add("alert=" + alertAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenericAction{", "}", 0, null, null, 56, null);
    }

    public final GenericAction copy(DismissAction dismiss, DeepLinkAction deeplink, AlertAction alert, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GenericAction(dismiss, deeplink, alert, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GenericAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GenericAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.GenericAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GenericAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + DismissAction.ADAPTER.encodedSizeWithTag(1, value.getDismiss()) + DeepLinkAction.ADAPTER.encodedSizeWithTag(2, value.getDeeplink()) + AlertAction.ADAPTER.encodedSizeWithTag(3, value.getAlert());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GenericAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DismissAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismiss());
                DeepLinkAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeeplink());
                AlertAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlert());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GenericAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AlertAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlert());
                DeepLinkAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeeplink());
                DismissAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismiss());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GenericAction redact(GenericAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DismissAction dismiss = value.getDismiss();
                DismissAction dismissActionRedact = dismiss != null ? DismissAction.ADAPTER.redact(dismiss) : null;
                DeepLinkAction deeplink = value.getDeeplink();
                DeepLinkAction deepLinkActionRedact = deeplink != null ? DeepLinkAction.ADAPTER.redact(deeplink) : null;
                AlertAction alert = value.getAlert();
                return value.copy(dismissActionRedact, deepLinkActionRedact, alert != null ? AlertAction.ADAPTER.redact(alert) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GenericAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DismissAction dismissActionDecode = null;
                DeepLinkAction deepLinkActionDecode = null;
                AlertAction alertActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GenericAction(dismissActionDecode, deepLinkActionDecode, alertActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dismissActionDecode = DismissAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        deepLinkActionDecode = DeepLinkAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        alertActionDecode = AlertAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
