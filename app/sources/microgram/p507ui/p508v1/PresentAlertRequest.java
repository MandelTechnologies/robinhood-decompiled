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
import okio.ByteString;
import rh_server_driven_ui.p531v1.Alert;

/* compiled from: PresentAlertRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/ui/v1/PresentAlertRequest;", "Lcom/squareup/wire/Message;", "", "router_identifier", "", "alert", "Lrh_server_driven_ui/v1/Alert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Alert;Lokio/ByteString;)V", "getRouter_identifier", "()Ljava/lang/String;", "getAlert", "()Lrh_server_driven_ui/v1/Alert;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PresentAlertRequest extends Message {

    @JvmField
    public static final ProtoAdapter<PresentAlertRequest> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Alert#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Alert alert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routerIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String router_identifier;

    public PresentAlertRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29260newBuilder();
    }

    public final String getRouter_identifier() {
        return this.router_identifier;
    }

    public /* synthetic */ PresentAlertRequest(String str, Alert alert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : alert, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Alert getAlert() {
        return this.alert;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentAlertRequest(String router_identifier, Alert alert, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.router_identifier = router_identifier;
        this.alert = alert;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29260newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PresentAlertRequest)) {
            return false;
        }
        PresentAlertRequest presentAlertRequest = (PresentAlertRequest) other;
        return Intrinsics.areEqual(unknownFields(), presentAlertRequest.unknownFields()) && Intrinsics.areEqual(this.router_identifier, presentAlertRequest.router_identifier) && Intrinsics.areEqual(this.alert, presentAlertRequest.alert);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.router_identifier.hashCode()) * 37;
        Alert alert = this.alert;
        int iHashCode2 = iHashCode + (alert != null ? alert.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("router_identifier=" + Internal.sanitize(this.router_identifier));
        Alert alert = this.alert;
        if (alert != null) {
            arrayList.add("alert=" + alert);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PresentAlertRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PresentAlertRequest copy$default(PresentAlertRequest presentAlertRequest, String str, Alert alert, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentAlertRequest.router_identifier;
        }
        if ((i & 2) != 0) {
            alert = presentAlertRequest.alert;
        }
        if ((i & 4) != 0) {
            byteString = presentAlertRequest.unknownFields();
        }
        return presentAlertRequest.copy(str, alert, byteString);
    }

    public final PresentAlertRequest copy(String router_identifier, Alert alert, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(router_identifier, "router_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PresentAlertRequest(router_identifier, alert, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentAlertRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PresentAlertRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.PresentAlertRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PresentAlertRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRouter_identifier());
                }
                return value.getAlert() != null ? size + Alert.ADAPTER.encodedSizeWithTag(2, value.getAlert()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PresentAlertRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouter_identifier());
                }
                if (value.getAlert() != null) {
                    Alert.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlert());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PresentAlertRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAlert() != null) {
                    Alert.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlert());
                }
                if (Intrinsics.areEqual(value.getRouter_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouter_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PresentAlertRequest redact(PresentAlertRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Alert alert = value.getAlert();
                return PresentAlertRequest.copy$default(value, null, alert != null ? Alert.ADAPTER.redact(alert) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PresentAlertRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Alert alertDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PresentAlertRequest(strDecode, alertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        alertDecode = Alert.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
