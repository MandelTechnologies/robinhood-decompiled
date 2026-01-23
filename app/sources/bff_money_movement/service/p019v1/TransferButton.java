package bff_money_movement.service.p019v1;

import com.robinhood.utils.extensions.ResourceTypes;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ButtonType;

/* compiled from: TransferButton.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferButton;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "action", "Lbff_money_movement/service/v1/TransferAction;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ButtonType;", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/TransferAction;Lrh_server_driven_ui/v1/ButtonType;Ljava/lang/String;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getAction", "()Lbff_money_movement/service/v1/TransferAction;", "getStyle", "()Lrh_server_driven_ui/v1/ButtonType;", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class TransferButton extends Message {

    @JvmField
    public static final ProtoAdapter<TransferButton> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.TransferAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 3, tag = 4)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.ButtonType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ButtonType style;

    public TransferButton() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8519newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ TransferButton(String str, TransferAction transferAction, ButtonType buttonType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : transferAction, (i & 4) != 0 ? ButtonType.BUTTON_TYPE_UNSPECIFIED : buttonType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TransferAction getAction() {
        return this.action;
    }

    public final ButtonType getStyle() {
        return this.style;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferButton(String label, TransferAction transferAction, ButtonType style, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.action = transferAction;
        this.style = style;
        this.logging_identifier = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8519newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TransferButton)) {
            return false;
        }
        TransferButton transferButton = (TransferButton) other;
        return Intrinsics.areEqual(unknownFields(), transferButton.unknownFields()) && Intrinsics.areEqual(this.label, transferButton.label) && Intrinsics.areEqual(this.action, transferButton.action) && this.style == transferButton.style && Intrinsics.areEqual(this.logging_identifier, transferButton.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37;
        TransferAction transferAction = this.action;
        int iHashCode2 = (((iHashCode + (transferAction != null ? transferAction.hashCode() : 0)) * 37) + this.style.hashCode()) * 37;
        String str = this.logging_identifier;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        TransferAction transferAction = this.action;
        if (transferAction != null) {
            arrayList.add("action=" + transferAction);
        }
        arrayList.add("style=" + this.style);
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferButton{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TransferButton copy$default(TransferButton transferButton, String str, TransferAction transferAction, ButtonType buttonType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferButton.label;
        }
        if ((i & 2) != 0) {
            transferAction = transferButton.action;
        }
        if ((i & 4) != 0) {
            buttonType = transferButton.style;
        }
        if ((i & 8) != 0) {
            str2 = transferButton.logging_identifier;
        }
        if ((i & 16) != 0) {
            byteString = transferButton.unknownFields();
        }
        ByteString byteString2 = byteString;
        ButtonType buttonType2 = buttonType;
        return transferButton.copy(str, transferAction, buttonType2, str2, byteString2);
    }

    public final TransferButton copy(String label, TransferAction action, ButtonType style, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TransferButton(label, action, style, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferButton.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TransferButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.TransferButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TransferButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (value.getAction() != null) {
                    size += TransferAction.ADAPTER.encodedSizeWithTag(2, value.getAction());
                }
                if (value.getStyle() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    size += ButtonType.ADAPTER.encodedSizeWithTag(3, value.getStyle());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TransferButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (value.getAction() != null) {
                    TransferAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                if (value.getStyle() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 3, (int) value.getStyle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TransferButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                if (value.getStyle() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 3, (int) value.getStyle());
                }
                if (value.getAction() != null) {
                    TransferAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TransferButton decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ButtonType buttonTypeDecode = ButtonType.BUTTON_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TransferAction transferActionDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                while (true) {
                    ButtonType buttonType = buttonTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TransferButton(strDecode2, transferActionDecode, buttonType, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            transferActionDecode = TransferAction.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                buttonTypeDecode = ButtonType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TransferButton redact(TransferButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TransferAction action = value.getAction();
                return TransferButton.copy$default(value, null, action != null ? TransferAction.ADAPTER.redact(action) : null, null, null, ByteString.EMPTY, 13, null);
            }
        };
    }
}
