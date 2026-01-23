package contracts.crypto.trade.proto.p431v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.DeepLinkAction;

/* compiled from: ValidateCryptoOrderResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse;", "Lcom/squareup/wire/Message;", "", "mobile", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "web", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;Lokio/ByteString;)V", "getMobile", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "getWeb", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Mobile", "Web", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ValidateCryptoOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateCryptoOrderResponse> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Mobile mobile;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Web#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final Web web;

    public ValidateCryptoOrderResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27745newBuilder();
    }

    public final Mobile getMobile() {
        return this.mobile;
    }

    public final Web getWeb() {
        return this.web;
    }

    public /* synthetic */ ValidateCryptoOrderResponse(Mobile mobile, Web web, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mobile, (i & 2) != 0 ? null : web, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateCryptoOrderResponse(Mobile mobile, Web web, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.mobile = mobile;
        this.web = web;
        if (Internal.countNonNull(mobile, web) > 1) {
            throw new IllegalArgumentException("At most one of mobile, web may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27745newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateCryptoOrderResponse)) {
            return false;
        }
        ValidateCryptoOrderResponse validateCryptoOrderResponse = (ValidateCryptoOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), validateCryptoOrderResponse.unknownFields()) && Intrinsics.areEqual(this.mobile, validateCryptoOrderResponse.mobile) && Intrinsics.areEqual(this.web, validateCryptoOrderResponse.web);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Mobile mobile = this.mobile;
        int iHashCode2 = (iHashCode + (mobile != null ? mobile.hashCode() : 0)) * 37;
        Web web = this.web;
        int iHashCode3 = iHashCode2 + (web != null ? web.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Mobile mobile = this.mobile;
        if (mobile != null) {
            arrayList.add("mobile=" + mobile);
        }
        Web web = this.web;
        if (web != null) {
            arrayList.add("web=" + web);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateCryptoOrderResponse{", "}", 0, null, null, 56, null);
    }

    public final ValidateCryptoOrderResponse copy(Mobile mobile, Web web, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateCryptoOrderResponse(mobile, web, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateCryptoOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateCryptoOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateCryptoOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ValidateCryptoOrderResponse.Mobile.ADAPTER.encodedSizeWithTag(1, value.getMobile()) + ValidateCryptoOrderResponse.Web.ADAPTER.encodedSizeWithTag(2, value.getWeb());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateCryptoOrderResponse.Mobile.ADAPTER.encodeWithTag(writer, 1, (int) value.getMobile());
                ValidateCryptoOrderResponse.Web.ADAPTER.encodeWithTag(writer, 2, (int) value.getWeb());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ValidateCryptoOrderResponse.Web.ADAPTER.encodeWithTag(writer, 2, (int) value.getWeb());
                ValidateCryptoOrderResponse.Mobile.ADAPTER.encodeWithTag(writer, 1, (int) value.getMobile());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateCryptoOrderResponse redact(ValidateCryptoOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateCryptoOrderResponse.Mobile mobile = value.getMobile();
                ValidateCryptoOrderResponse.Mobile mobileRedact = mobile != null ? ValidateCryptoOrderResponse.Mobile.ADAPTER.redact(mobile) : null;
                ValidateCryptoOrderResponse.Web web = value.getWeb();
                return value.copy(mobileRedact, web != null ? ValidateCryptoOrderResponse.Web.ADAPTER.redact(web) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateCryptoOrderResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ValidateCryptoOrderResponse.Mobile mobileDecode = null;
                ValidateCryptoOrderResponse.Web webDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateCryptoOrderResponse(mobileDecode, webDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        mobileDecode = ValidateCryptoOrderResponse.Mobile.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        webDecode = ValidateCryptoOrderResponse.Web.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: ValidateCryptoOrderResponse.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "Lcom/squareup/wire/Message;", "", "alert", "Lrh_server_driven_ui/v1/Alert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Alert;Lokio/ByteString;)V", "getAlert", "()Lrh_server_driven_ui/v1/Alert;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Action", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Mobile extends Message {

        @JvmField
        public static final ProtoAdapter<Mobile> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Alert#ADAPTER", schemaIndex = 0, tag = 1)
        private final Alert alert;

        /* JADX WARN: Multi-variable type inference failed */
        public Mobile() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27746newBuilder();
        }

        public final Alert getAlert() {
            return this.alert;
        }

        public /* synthetic */ Mobile(Alert alert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : alert, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mobile(Alert alert, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.alert = alert;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27746newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Mobile)) {
                return false;
            }
            Mobile mobile = (Mobile) other;
            return Intrinsics.areEqual(unknownFields(), mobile.unknownFields()) && Intrinsics.areEqual(this.alert, mobile.alert);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Alert alert = this.alert;
            int iHashCode2 = iHashCode + (alert != null ? alert.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Alert alert = this.alert;
            if (alert != null) {
                arrayList.add("alert=" + alert);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Mobile{", "}", 0, null, null, 56, null);
        }

        public final Mobile copy(Alert alert, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Mobile(alert, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Mobile.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Mobile>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateCryptoOrderResponse.Mobile value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + Alert.ADAPTER.encodedSizeWithTag(1, value.getAlert());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Alert.ADAPTER.encodeWithTag(writer, 1, (int) value.getAlert());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Alert.ADAPTER.encodeWithTag(writer, 1, (int) value.getAlert());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderResponse.Mobile redact(ValidateCryptoOrderResponse.Mobile value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Alert alert = value.getAlert();
                    return value.copy(alert != null ? Alert.ADAPTER.redact(alert) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderResponse.Mobile decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Alert alertDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateCryptoOrderResponse.Mobile(alertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            alertDecode = Alert.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: ValidateCryptoOrderResponse.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action;", "Lcom/squareup/wire/Message;", "", "dismiss", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "acknowledge_and_continue", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;Lokio/ByteString;)V", "getDismiss", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "getAcknowledge_and_continue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", BentoAlertSheet6.button2Title, "AcknowledgeAndContinue", "SideEffect", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Action extends Message {

            @JvmField
            public static final ProtoAdapter<Action> ADAPTER;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue#ADAPTER", jsonName = "acknowledgeAndContinue", oneofName = "type", schemaIndex = 1, tag = 2)
            private final AcknowledgeAndContinue acknowledge_and_continue;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$Dismiss#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
            private final Dismiss dismiss;

            public Action() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27747newBuilder();
            }

            public final Dismiss getDismiss() {
                return this.dismiss;
            }

            public final AcknowledgeAndContinue getAcknowledge_and_continue() {
                return this.acknowledge_and_continue;
            }

            public /* synthetic */ Action(Dismiss dismiss, AcknowledgeAndContinue acknowledgeAndContinue, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : dismiss, (i & 2) != 0 ? null : acknowledgeAndContinue, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(Dismiss dismiss, AcknowledgeAndContinue acknowledgeAndContinue, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.dismiss = dismiss;
                this.acknowledge_and_continue = acknowledgeAndContinue;
                if (Internal.countNonNull(dismiss, acknowledgeAndContinue) > 1) {
                    throw new IllegalArgumentException("At most one of dismiss, acknowledge_and_continue may be non-null");
                }
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27747newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.dismiss, action.dismiss) && Intrinsics.areEqual(this.acknowledge_and_continue, action.acknowledge_and_continue);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Dismiss dismiss = this.dismiss;
                int iHashCode2 = (iHashCode + (dismiss != null ? dismiss.hashCode() : 0)) * 37;
                AcknowledgeAndContinue acknowledgeAndContinue = this.acknowledge_and_continue;
                int iHashCode3 = iHashCode2 + (acknowledgeAndContinue != null ? acknowledgeAndContinue.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Dismiss dismiss = this.dismiss;
                if (dismiss != null) {
                    arrayList.add("dismiss=" + dismiss);
                }
                AcknowledgeAndContinue acknowledgeAndContinue = this.acknowledge_and_continue;
                if (acknowledgeAndContinue != null) {
                    arrayList.add("acknowledge_and_continue=" + acknowledgeAndContinue);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
            }

            public final Action copy(Dismiss dismiss, AcknowledgeAndContinue acknowledge_and_continue, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Action(dismiss, acknowledge_and_continue, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Action.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER.encodedSizeWithTag(1, value.getDismiss()) + ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER.encodedSizeWithTag(2, value.getAcknowledge_and_continue());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismiss());
                        ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER.encodeWithTag(writer, 2, (int) value.getAcknowledge_and_continue());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER.encodeWithTag(writer, 2, (int) value.getAcknowledge_and_continue());
                        ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismiss());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderResponse.Mobile.Action redact(ValidateCryptoOrderResponse.Mobile.Action value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        ValidateCryptoOrderResponse.Mobile.Action.Dismiss dismiss = value.getDismiss();
                        ValidateCryptoOrderResponse.Mobile.Action.Dismiss dismissRedact = dismiss != null ? ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER.redact(dismiss) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue acknowledge_and_continue = value.getAcknowledge_and_continue();
                        return value.copy(dismissRedact, acknowledge_and_continue != null ? ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER.redact(acknowledge_and_continue) : null, ByteString.EMPTY);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public ValidateCryptoOrderResponse.Mobile.Action decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        ValidateCryptoOrderResponse.Mobile.Action.Dismiss dismissDecode = null;
                        ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue acknowledgeAndContinueDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new ValidateCryptoOrderResponse.Mobile.Action(dismissDecode, acknowledgeAndContinueDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dismissDecode = ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                acknowledgeAndContinueDecode = ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }

            /* compiled from: ValidateCryptoOrderResponse.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "Lcom/squareup/wire/Message;", "", "side_effects", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getSide_effects", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Dismiss extends Message {

                @JvmField
                public static final ProtoAdapter<Dismiss> ADAPTER;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect#ADAPTER", jsonName = "sideEffects", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
                private final List<SideEffect> side_effects;

                /* JADX WARN: Multi-variable type inference failed */
                public Dismiss() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27749newBuilder();
                }

                public /* synthetic */ Dismiss(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dismiss(List<SideEffect> side_effects, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(side_effects, "side_effects");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.side_effects = Internal.immutableCopyOf("side_effects", side_effects);
                }

                public final List<SideEffect> getSide_effects() {
                    return this.side_effects;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27749newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Dismiss)) {
                        return false;
                    }
                    Dismiss dismiss = (Dismiss) other;
                    return Intrinsics.areEqual(unknownFields(), dismiss.unknownFields()) && Intrinsics.areEqual(this.side_effects, dismiss.side_effects);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (unknownFields().hashCode() * 37) + this.side_effects.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    if (!this.side_effects.isEmpty()) {
                        arrayList.add("side_effects=" + this.side_effects);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Dismiss{", "}", 0, null, null, 56, null);
                }

                public final Dismiss copy(List<SideEffect> side_effects, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(side_effects, "side_effects");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Dismiss(side_effects, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Dismiss.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Dismiss>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$Dismiss$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.Dismiss value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSide_effects());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.Dismiss value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSide_effects());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.Dismiss value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSide_effects());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.Dismiss decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            ArrayList arrayList = new ArrayList();
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderResponse.Mobile.Action.Dismiss(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    arrayList.add(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER.decode(reader));
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.Dismiss redact(ValidateCryptoOrderResponse.Mobile.Action.Dismiss value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(Internal.m26823redactElements(value.getSide_effects(), ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER), ByteString.EMPTY);
                        }
                    };
                }
            }

            /* compiled from: ValidateCryptoOrderResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "Lcom/squareup/wire/Message;", "", "acknowledge_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAcknowledge_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class AcknowledgeAndContinue extends Message {

                @JvmField
                public static final ProtoAdapter<AcknowledgeAndContinue> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "acknowledgeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String acknowledge_id;

                /* JADX WARN: Multi-variable type inference failed */
                public AcknowledgeAndContinue() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27748newBuilder();
                }

                public final String getAcknowledge_id() {
                    return this.acknowledge_id;
                }

                public /* synthetic */ AcknowledgeAndContinue(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AcknowledgeAndContinue(String acknowledge_id, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(acknowledge_id, "acknowledge_id");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.acknowledge_id = acknowledge_id;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27748newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof AcknowledgeAndContinue)) {
                        return false;
                    }
                    AcknowledgeAndContinue acknowledgeAndContinue = (AcknowledgeAndContinue) other;
                    return Intrinsics.areEqual(unknownFields(), acknowledgeAndContinue.unknownFields()) && Intrinsics.areEqual(this.acknowledge_id, acknowledgeAndContinue.acknowledge_id);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (unknownFields().hashCode() * 37) + this.acknowledge_id.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("acknowledge_id=" + Internal.sanitize(this.acknowledge_id));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "AcknowledgeAndContinue{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ AcknowledgeAndContinue copy$default(AcknowledgeAndContinue acknowledgeAndContinue, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = acknowledgeAndContinue.acknowledge_id;
                    }
                    if ((i & 2) != 0) {
                        byteString = acknowledgeAndContinue.unknownFields();
                    }
                    return acknowledgeAndContinue.copy(str, byteString);
                }

                public final AcknowledgeAndContinue copy(String acknowledge_id, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(acknowledge_id, "acknowledge_id");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new AcknowledgeAndContinue(acknowledge_id, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AcknowledgeAndContinue.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<AcknowledgeAndContinue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            return !Intrinsics.areEqual(value.getAcknowledge_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAcknowledge_id()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getAcknowledge_id(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAcknowledge_id());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (Intrinsics.areEqual(value.getAcknowledge_id(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAcknowledge_id());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue redact(ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }

            /* compiled from: ValidateCryptoOrderResponse.kt */
            @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007-./0123Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016Jd\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "Lcom/squareup/wire/Message;", "", "deeplink_action", "Lrh_server_driven_ui/v1/DeepLinkAction;", "set_limit_price", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "set_order_size", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "convert_to_sell_all", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "start_deposit_flow", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "set_pdt_warning_as_seen", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "show_payment_method_selection", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/DeepLinkAction;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;Lokio/ByteString;)V", "getDeeplink_action", "()Lrh_server_driven_ui/v1/DeepLinkAction;", "getSet_limit_price", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "getSet_order_size", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "getConvert_to_sell_all", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "getStart_deposit_flow", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "getSet_pdt_warning_as_seen", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "getShow_payment_method_selection", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SetLimitPrice", "SetOrderSize", "ConvertToSellAll", "StartDepositFlow", "SetPdtWarningAsSeen", "ShowPaymentMethodSelection", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class SideEffect extends Message {

                @JvmField
                public static final ProtoAdapter<SideEffect> ADAPTER;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll#ADAPTER", jsonName = "convertToSellAll", oneofName = "type", schemaIndex = 3, tag = 4)
                private final ConvertToSellAll convert_to_sell_all;

                @WireField(adapter = "rh_server_driven_ui.v1.DeepLinkAction#ADAPTER", jsonName = "deeplinkAction", oneofName = "type", schemaIndex = 0, tag = 1)
                private final DeepLinkAction deeplink_action;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice#ADAPTER", jsonName = "setLimitPrice", oneofName = "type", schemaIndex = 1, tag = 2)
                private final SetLimitPrice set_limit_price;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize#ADAPTER", jsonName = "setOrderSize", oneofName = "type", schemaIndex = 2, tag = 3)
                private final SetOrderSize set_order_size;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen#ADAPTER", jsonName = "setPdtWarningAsSeen", oneofName = "type", schemaIndex = 5, tag = 6)
                private final SetPdtWarningAsSeen set_pdt_warning_as_seen;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection#ADAPTER", jsonName = "showPaymentMethodSelection", oneofName = "type", schemaIndex = 6, tag = 7)
                private final ShowPaymentMethodSelection show_payment_method_selection;

                @WireField(adapter = "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow#ADAPTER", jsonName = "startDepositFlow", oneofName = "type", schemaIndex = 4, tag = 5)
                private final StartDepositFlow start_deposit_flow;

                public SideEffect() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m27750newBuilder();
                }

                public final DeepLinkAction getDeeplink_action() {
                    return this.deeplink_action;
                }

                public final SetLimitPrice getSet_limit_price() {
                    return this.set_limit_price;
                }

                public final SetOrderSize getSet_order_size() {
                    return this.set_order_size;
                }

                public final ConvertToSellAll getConvert_to_sell_all() {
                    return this.convert_to_sell_all;
                }

                public final StartDepositFlow getStart_deposit_flow() {
                    return this.start_deposit_flow;
                }

                public final SetPdtWarningAsSeen getSet_pdt_warning_as_seen() {
                    return this.set_pdt_warning_as_seen;
                }

                public final ShowPaymentMethodSelection getShow_payment_method_selection() {
                    return this.show_payment_method_selection;
                }

                public /* synthetic */ SideEffect(DeepLinkAction deepLinkAction, SetLimitPrice setLimitPrice, SetOrderSize setOrderSize, ConvertToSellAll convertToSellAll, StartDepositFlow startDepositFlow, SetPdtWarningAsSeen setPdtWarningAsSeen, ShowPaymentMethodSelection showPaymentMethodSelection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : deepLinkAction, (i & 2) != 0 ? null : setLimitPrice, (i & 4) != 0 ? null : setOrderSize, (i & 8) != 0 ? null : convertToSellAll, (i & 16) != 0 ? null : startDepositFlow, (i & 32) != 0 ? null : setPdtWarningAsSeen, (i & 64) != 0 ? null : showPaymentMethodSelection, (i & 128) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SideEffect(DeepLinkAction deepLinkAction, SetLimitPrice setLimitPrice, SetOrderSize setOrderSize, ConvertToSellAll convertToSellAll, StartDepositFlow startDepositFlow, SetPdtWarningAsSeen setPdtWarningAsSeen, ShowPaymentMethodSelection showPaymentMethodSelection, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.deeplink_action = deepLinkAction;
                    this.set_limit_price = setLimitPrice;
                    this.set_order_size = setOrderSize;
                    this.convert_to_sell_all = convertToSellAll;
                    this.start_deposit_flow = startDepositFlow;
                    this.set_pdt_warning_as_seen = setPdtWarningAsSeen;
                    this.show_payment_method_selection = showPaymentMethodSelection;
                    if (Internal.countNonNull(deepLinkAction, setLimitPrice, setOrderSize, convertToSellAll, startDepositFlow, setPdtWarningAsSeen, showPaymentMethodSelection) > 1) {
                        throw new IllegalArgumentException("At most one of deeplink_action, set_limit_price, set_order_size, convert_to_sell_all, start_deposit_flow, set_pdt_warning_as_seen, show_payment_method_selection may be non-null");
                    }
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m27750newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof SideEffect)) {
                        return false;
                    }
                    SideEffect sideEffect = (SideEffect) other;
                    return Intrinsics.areEqual(unknownFields(), sideEffect.unknownFields()) && Intrinsics.areEqual(this.deeplink_action, sideEffect.deeplink_action) && Intrinsics.areEqual(this.set_limit_price, sideEffect.set_limit_price) && Intrinsics.areEqual(this.set_order_size, sideEffect.set_order_size) && Intrinsics.areEqual(this.convert_to_sell_all, sideEffect.convert_to_sell_all) && Intrinsics.areEqual(this.start_deposit_flow, sideEffect.start_deposit_flow) && Intrinsics.areEqual(this.set_pdt_warning_as_seen, sideEffect.set_pdt_warning_as_seen) && Intrinsics.areEqual(this.show_payment_method_selection, sideEffect.show_payment_method_selection);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    DeepLinkAction deepLinkAction = this.deeplink_action;
                    int iHashCode2 = (iHashCode + (deepLinkAction != null ? deepLinkAction.hashCode() : 0)) * 37;
                    SetLimitPrice setLimitPrice = this.set_limit_price;
                    int iHashCode3 = (iHashCode2 + (setLimitPrice != null ? setLimitPrice.hashCode() : 0)) * 37;
                    SetOrderSize setOrderSize = this.set_order_size;
                    int iHashCode4 = (iHashCode3 + (setOrderSize != null ? setOrderSize.hashCode() : 0)) * 37;
                    ConvertToSellAll convertToSellAll = this.convert_to_sell_all;
                    int iHashCode5 = (iHashCode4 + (convertToSellAll != null ? convertToSellAll.hashCode() : 0)) * 37;
                    StartDepositFlow startDepositFlow = this.start_deposit_flow;
                    int iHashCode6 = (iHashCode5 + (startDepositFlow != null ? startDepositFlow.hashCode() : 0)) * 37;
                    SetPdtWarningAsSeen setPdtWarningAsSeen = this.set_pdt_warning_as_seen;
                    int iHashCode7 = (iHashCode6 + (setPdtWarningAsSeen != null ? setPdtWarningAsSeen.hashCode() : 0)) * 37;
                    ShowPaymentMethodSelection showPaymentMethodSelection = this.show_payment_method_selection;
                    int iHashCode8 = iHashCode7 + (showPaymentMethodSelection != null ? showPaymentMethodSelection.hashCode() : 0);
                    this.hashCode = iHashCode8;
                    return iHashCode8;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    DeepLinkAction deepLinkAction = this.deeplink_action;
                    if (deepLinkAction != null) {
                        arrayList.add("deeplink_action=" + deepLinkAction);
                    }
                    SetLimitPrice setLimitPrice = this.set_limit_price;
                    if (setLimitPrice != null) {
                        arrayList.add("set_limit_price=" + setLimitPrice);
                    }
                    SetOrderSize setOrderSize = this.set_order_size;
                    if (setOrderSize != null) {
                        arrayList.add("set_order_size=" + setOrderSize);
                    }
                    ConvertToSellAll convertToSellAll = this.convert_to_sell_all;
                    if (convertToSellAll != null) {
                        arrayList.add("convert_to_sell_all=" + convertToSellAll);
                    }
                    StartDepositFlow startDepositFlow = this.start_deposit_flow;
                    if (startDepositFlow != null) {
                        arrayList.add("start_deposit_flow=" + startDepositFlow);
                    }
                    SetPdtWarningAsSeen setPdtWarningAsSeen = this.set_pdt_warning_as_seen;
                    if (setPdtWarningAsSeen != null) {
                        arrayList.add("set_pdt_warning_as_seen=" + setPdtWarningAsSeen);
                    }
                    ShowPaymentMethodSelection showPaymentMethodSelection = this.show_payment_method_selection;
                    if (showPaymentMethodSelection != null) {
                        arrayList.add("show_payment_method_selection=" + showPaymentMethodSelection);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "SideEffect{", "}", 0, null, null, 56, null);
                }

                public final SideEffect copy(DeepLinkAction deeplink_action, SetLimitPrice set_limit_price, SetOrderSize set_order_size, ConvertToSellAll convert_to_sell_all, StartDepositFlow start_deposit_flow, SetPdtWarningAsSeen set_pdt_warning_as_seen, ShowPaymentMethodSelection show_payment_method_selection, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new SideEffect(deeplink_action, set_limit_price, set_order_size, convert_to_sell_all, start_deposit_flow, set_pdt_warning_as_seen, show_payment_method_selection, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SideEffect.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<SideEffect>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.SideEffect decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            DeepLinkAction deepLinkActionDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice setLimitPriceDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize setOrderSizeDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll convertToSellAllDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow startDepositFlowDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen setPdtWarningAsSeenDecode = null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection showPaymentMethodSelectionDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    switch (iNextTag) {
                                        case 1:
                                            deepLinkActionDecode = DeepLinkAction.ADAPTER.decode(reader);
                                            break;
                                        case 2:
                                            setLimitPriceDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER.decode(reader);
                                            break;
                                        case 3:
                                            setOrderSizeDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER.decode(reader);
                                            break;
                                        case 4:
                                            convertToSellAllDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER.decode(reader);
                                            break;
                                        case 5:
                                            startDepositFlowDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER.decode(reader);
                                            break;
                                        case 6:
                                            setPdtWarningAsSeenDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER.decode(reader);
                                            break;
                                        case 7:
                                            showPaymentMethodSelectionDecode = ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER.decode(reader);
                                            break;
                                        default:
                                            reader.readUnknownField(iNextTag);
                                            break;
                                    }
                                } else {
                                    return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect(deepLinkActionDecode, setLimitPriceDecode, setOrderSizeDecode, convertToSellAllDecode, startDepositFlowDecode, setPdtWarningAsSeenDecode, showPaymentMethodSelectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + DeepLinkAction.ADAPTER.encodedSizeWithTag(1, value.getDeeplink_action()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER.encodedSizeWithTag(2, value.getSet_limit_price()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER.encodedSizeWithTag(3, value.getSet_order_size()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER.encodedSizeWithTag(4, value.getConvert_to_sell_all()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER.encodedSizeWithTag(5, value.getStart_deposit_flow()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER.encodedSizeWithTag(6, value.getSet_pdt_warning_as_seen()) + ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER.encodedSizeWithTag(7, value.getShow_payment_method_selection());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            DeepLinkAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeeplink_action());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_limit_price());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_order_size());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER.encodeWithTag(writer, 4, (int) value.getConvert_to_sell_all());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER.encodeWithTag(writer, 5, (int) value.getStart_deposit_flow());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER.encodeWithTag(writer, 6, (int) value.getSet_pdt_warning_as_seen());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getShow_payment_method_selection());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getShow_payment_method_selection());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER.encodeWithTag(writer, 6, (int) value.getSet_pdt_warning_as_seen());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER.encodeWithTag(writer, 5, (int) value.getStart_deposit_flow());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER.encodeWithTag(writer, 4, (int) value.getConvert_to_sell_all());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_order_size());
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_limit_price());
                            DeepLinkAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDeeplink_action());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public ValidateCryptoOrderResponse.Mobile.Action.SideEffect redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            DeepLinkAction deeplink_action = value.getDeeplink_action();
                            DeepLinkAction deepLinkActionRedact = deeplink_action != null ? DeepLinkAction.ADAPTER.redact(deeplink_action) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice set_limit_price = value.getSet_limit_price();
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice setLimitPriceRedact = set_limit_price != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER.redact(set_limit_price) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize set_order_size = value.getSet_order_size();
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize setOrderSizeRedact = set_order_size != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER.redact(set_order_size) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll convert_to_sell_all = value.getConvert_to_sell_all();
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll convertToSellAllRedact = convert_to_sell_all != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER.redact(convert_to_sell_all) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow start_deposit_flow = value.getStart_deposit_flow();
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow startDepositFlowRedact = start_deposit_flow != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER.redact(start_deposit_flow) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen set_pdt_warning_as_seen = value.getSet_pdt_warning_as_seen();
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen setPdtWarningAsSeenRedact = set_pdt_warning_as_seen != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER.redact(set_pdt_warning_as_seen) : null;
                            ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection show_payment_method_selection = value.getShow_payment_method_selection();
                            return value.copy(deepLinkActionRedact, setLimitPriceRedact, setOrderSizeRedact, convertToSellAllRedact, startDepositFlowRedact, setPdtWarningAsSeenRedact, show_payment_method_selection != null ? ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER.redact(show_payment_method_selection) : null, ByteString.EMPTY);
                        }
                    };
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "Lcom/squareup/wire/Message;", "", "limit_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getLimit_price", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class SetLimitPrice extends Message {

                    @JvmField
                    public static final ProtoAdapter<SetLimitPrice> ADAPTER;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                    private final String limit_price;

                    /* JADX WARN: Multi-variable type inference failed */
                    public SetLimitPrice() {
                        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27752newBuilder();
                    }

                    public final String getLimit_price() {
                        return this.limit_price;
                    }

                    public /* synthetic */ SetLimitPrice(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SetLimitPrice(String limit_price, ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        this.limit_price = limit_price;
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27752newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof SetLimitPrice)) {
                            return false;
                        }
                        SetLimitPrice setLimitPrice = (SetLimitPrice) other;
                        return Intrinsics.areEqual(unknownFields(), setLimitPrice.unknownFields()) && Intrinsics.areEqual(this.limit_price, setLimitPrice.limit_price);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = (unknownFields().hashCode() * 37) + this.limit_price.hashCode();
                        this.hashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("limit_price=" + Internal.sanitize(this.limit_price));
                        return CollectionsKt.joinToString$default(arrayList, ", ", "SetLimitPrice{", "}", 0, null, null, 56, null);
                    }

                    public static /* synthetic */ SetLimitPrice copy$default(SetLimitPrice setLimitPrice, String str, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = setLimitPrice.limit_price;
                        }
                        if ((i & 2) != 0) {
                            byteString = setLimitPrice.unknownFields();
                        }
                        return setLimitPrice.copy(str, byteString);
                    }

                    public final SetLimitPrice copy(String limit_price, ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new SetLimitPrice(limit_price, unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetLimitPrice.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<SetLimitPrice>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                String strDecode = "";
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                int size = value.unknownFields().size();
                                return !Intrinsics.areEqual(value.getLimit_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLimit_price()) : size;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (!Intrinsics.areEqual(value.getLimit_price(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                                }
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                                if (Intrinsics.areEqual(value.getLimit_price(), "")) {
                                    return;
                                }
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.copy$default(value, null, ByteString.EMPTY, 1, null);
                            }
                        };
                    }
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "Lcom/squareup/wire/Message;", "", "asset_amount", "", "quote_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_amount", "()Ljava/lang/String;", "getQuote_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class SetOrderSize extends Message {

                    @JvmField
                    public static final ProtoAdapter<SetOrderSize> ADAPTER;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                    private final String asset_amount;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                    private final String quote_amount;

                    public SetOrderSize() {
                        this(null, null, null, 7, null);
                    }

                    public /* synthetic */ SetOrderSize(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27753newBuilder();
                    }

                    public final String getAsset_amount() {
                        return this.asset_amount;
                    }

                    public final String getQuote_amount() {
                        return this.quote_amount;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SetOrderSize(String asset_amount, String quote_amount, ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(asset_amount, "asset_amount");
                        Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        this.asset_amount = asset_amount;
                        this.quote_amount = quote_amount;
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27753newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof SetOrderSize)) {
                            return false;
                        }
                        SetOrderSize setOrderSize = (SetOrderSize) other;
                        return Intrinsics.areEqual(unknownFields(), setOrderSize.unknownFields()) && Intrinsics.areEqual(this.asset_amount, setOrderSize.asset_amount) && Intrinsics.areEqual(this.quote_amount, setOrderSize.quote_amount);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = (((unknownFields().hashCode() * 37) + this.asset_amount.hashCode()) * 37) + this.quote_amount.hashCode();
                        this.hashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("asset_amount=" + Internal.sanitize(this.asset_amount));
                        arrayList.add("quote_amount=" + Internal.sanitize(this.quote_amount));
                        return CollectionsKt.joinToString$default(arrayList, ", ", "SetOrderSize{", "}", 0, null, null, 56, null);
                    }

                    public static /* synthetic */ SetOrderSize copy$default(SetOrderSize setOrderSize, String str, String str2, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = setOrderSize.asset_amount;
                        }
                        if ((i & 2) != 0) {
                            str2 = setOrderSize.quote_amount;
                        }
                        if ((i & 4) != 0) {
                            byteString = setOrderSize.unknownFields();
                        }
                        return setOrderSize.copy(str, str2, byteString);
                    }

                    public final SetOrderSize copy(String asset_amount, String quote_amount, ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(asset_amount, "asset_amount");
                        Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new SetOrderSize(asset_amount, quote_amount, unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetOrderSize.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<SetOrderSize>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                String strDecode = "";
                                String strDecode2 = "";
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                    } else if (iNextTag == 2) {
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                int size = value.unknownFields().size();
                                if (!Intrinsics.areEqual(value.getAsset_amount(), "")) {
                                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_amount());
                                }
                                return !Intrinsics.areEqual(value.getQuote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuote_amount()) : size;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (!Intrinsics.areEqual(value.getAsset_amount(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_amount());
                                }
                                if (!Intrinsics.areEqual(value.getQuote_amount(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuote_amount());
                                }
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                                if (!Intrinsics.areEqual(value.getQuote_amount(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuote_amount());
                                }
                                if (Intrinsics.areEqual(value.getAsset_amount(), "")) {
                                    return;
                                }
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_amount());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                            }
                        };
                    }
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class ConvertToSellAll extends Message {

                    @JvmField
                    public static final ProtoAdapter<ConvertToSellAll> ADAPTER;

                    /* JADX WARN: Multi-variable type inference failed */
                    public ConvertToSellAll() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27751newBuilder();
                    }

                    public /* synthetic */ ConvertToSellAll(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ConvertToSellAll(ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27751newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        return (other instanceof ConvertToSellAll) && Intrinsics.areEqual(unknownFields(), ((ConvertToSellAll) other).unknownFields());
                    }

                    public int hashCode() {
                        return unknownFields().hashCode();
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        return "ConvertToSellAll{}";
                    }

                    public final ConvertToSellAll copy(ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new ConvertToSellAll(unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConvertToSellAll.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<ConvertToSellAll>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag != -1) {
                                        reader.readUnknownField(iNextTag);
                                    } else {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.unknownFields().size();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll value) {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.copy(ByteString.EMPTY);
                            }
                        };
                    }
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class StartDepositFlow extends Message {

                    @JvmField
                    public static final ProtoAdapter<StartDepositFlow> ADAPTER;

                    /* JADX WARN: Multi-variable type inference failed */
                    public StartDepositFlow() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27756newBuilder();
                    }

                    public /* synthetic */ StartDepositFlow(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public StartDepositFlow(ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27756newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        return (other instanceof StartDepositFlow) && Intrinsics.areEqual(unknownFields(), ((StartDepositFlow) other).unknownFields());
                    }

                    public int hashCode() {
                        return unknownFields().hashCode();
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        return "StartDepositFlow{}";
                    }

                    public final StartDepositFlow copy(ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new StartDepositFlow(unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StartDepositFlow.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<StartDepositFlow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag != -1) {
                                        reader.readUnknownField(iNextTag);
                                    } else {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.unknownFields().size();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow value) {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.copy(ByteString.EMPTY);
                            }
                        };
                    }
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class SetPdtWarningAsSeen extends Message {

                    @JvmField
                    public static final ProtoAdapter<SetPdtWarningAsSeen> ADAPTER;

                    /* JADX WARN: Multi-variable type inference failed */
                    public SetPdtWarningAsSeen() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27754newBuilder();
                    }

                    public /* synthetic */ SetPdtWarningAsSeen(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SetPdtWarningAsSeen(ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27754newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        return (other instanceof SetPdtWarningAsSeen) && Intrinsics.areEqual(unknownFields(), ((SetPdtWarningAsSeen) other).unknownFields());
                    }

                    public int hashCode() {
                        return unknownFields().hashCode();
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        return "SetPdtWarningAsSeen{}";
                    }

                    public final SetPdtWarningAsSeen copy(ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new SetPdtWarningAsSeen(unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetPdtWarningAsSeen.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<SetPdtWarningAsSeen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag != -1) {
                                        reader.readUnknownField(iNextTag);
                                    } else {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.unknownFields().size();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen value) {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.copy(ByteString.EMPTY);
                            }
                        };
                    }
                }

                /* compiled from: ValidateCryptoOrderResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class ShowPaymentMethodSelection extends Message {

                    @JvmField
                    public static final ProtoAdapter<ShowPaymentMethodSelection> ADAPTER;

                    /* JADX WARN: Multi-variable type inference failed */
                    public ShowPaymentMethodSelection() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m27755newBuilder();
                    }

                    public /* synthetic */ ShowPaymentMethodSelection(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ShowPaymentMethodSelection(ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m27755newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        return (other instanceof ShowPaymentMethodSelection) && Intrinsics.areEqual(unknownFields(), ((ShowPaymentMethodSelection) other).unknownFields());
                    }

                    public int hashCode() {
                        return unknownFields().hashCode();
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        return "ShowPaymentMethodSelection{}";
                    }

                    public final ShowPaymentMethodSelection copy(ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new ShowPaymentMethodSelection(unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShowPaymentMethodSelection.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<ShowPaymentMethodSelection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag != -1) {
                                        reader.readUnknownField(iNextTag);
                                    } else {
                                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.unknownFields().size();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection value) {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection redact(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.copy(ByteString.EMPTY);
                            }
                        };
                    }
                }
            }
        }
    }

    /* compiled from: ValidateCryptoOrderResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "Lcom/squareup/wire/Message;", "", "", "title", "description_markdown", "", "Lrh_server_driven_ui/v1/Button;", CarResultComposable2.BUTTONS, "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "Ljava/lang/String;", "getTitle", "getDescription_markdown", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Web extends Message {

        @JvmField
        public static final ProtoAdapter<Web> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        private final List<Button> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String description_markdown;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String title;

        public Web() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ Web(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27757newBuilder();
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription_markdown() {
            return this.description_markdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Web(String title, String description_markdown, List<Button> buttons, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.description_markdown = description_markdown;
            this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27757newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Web)) {
                return false;
            }
            Web web = (Web) other;
            return Intrinsics.areEqual(unknownFields(), web.unknownFields()) && Intrinsics.areEqual(this.title, web.title) && Intrinsics.areEqual(this.description_markdown, web.description_markdown) && Intrinsics.areEqual(this.buttons, web.buttons);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description_markdown.hashCode()) * 37) + this.buttons.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
            if (!this.buttons.isEmpty()) {
                arrayList.add("buttons=" + this.buttons);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Web{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Web copy$default(Web web, String str, String str2, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = web.title;
            }
            if ((i & 2) != 0) {
                str2 = web.description_markdown;
            }
            if ((i & 4) != 0) {
                list = web.buttons;
            }
            if ((i & 8) != 0) {
                byteString = web.unknownFields();
            }
            return web.copy(str, str2, list, byteString);
        }

        public final Web copy(String title, String description_markdown, List<Button> buttons, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Web(title, description_markdown, buttons, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Web.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Web>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse$Web$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateCryptoOrderResponse.Web value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription_markdown());
                    }
                    return size + Button.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getButtons());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateCryptoOrderResponse.Web value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                    }
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateCryptoOrderResponse.Web value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                    if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                    }
                    if (Intrinsics.areEqual(value.getTitle(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderResponse.Web decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateCryptoOrderResponse.Web(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(Button.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateCryptoOrderResponse.Web redact(ValidateCryptoOrderResponse.Web value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ValidateCryptoOrderResponse.Web.copy$default(value, null, null, Internal.m26823redactElements(value.getButtons(), Button.ADAPTER), ByteString.EMPTY, 3, null);
                }
            };
        }
    }
}
