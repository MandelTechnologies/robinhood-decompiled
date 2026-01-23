package advisory.proto.p008v1;

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

/* compiled from: TaxLossHarvestDashboardCtaButton.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButton;", "Lcom/squareup/wire/Message;", "", "title", "", "is_primary", "", "action", "Ladvisory/proto/v1/TaxLossHarvestDashboardAction;", "action_url", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLadvisory/proto/v1/TaxLossHarvestDashboardAction;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "()Z", "getAction", "()Ladvisory/proto/v1/TaxLossHarvestDashboardAction;", "getAction_url", "getLogging_identifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardCtaButton extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestDashboardCtaButton> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TaxLossHarvestDashboardAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionUrl", schemaIndex = 3, tag = 4)
    private final String action_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_primary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestDashboardCtaButton() {
        this(null, false, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4549newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ TaxLossHarvestDashboardCtaButton(String str, boolean z, TaxLossHarvestDashboardAction taxLossHarvestDashboardAction, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? TaxLossHarvestDashboardAction.ACTION_UNSPECIFIED : taxLossHarvestDashboardAction, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_primary, reason: from getter */
    public final boolean getIs_primary() {
        return this.is_primary;
    }

    public final TaxLossHarvestDashboardAction getAction() {
        return this.action;
    }

    public final String getAction_url() {
        return this.action_url;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardCtaButton(String title, boolean z, TaxLossHarvestDashboardAction action, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.is_primary = z;
        this.action = action;
        this.action_url = str;
        this.logging_identifier = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4549newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardCtaButton)) {
            return false;
        }
        TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton = (TaxLossHarvestDashboardCtaButton) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestDashboardCtaButton.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestDashboardCtaButton.title) && this.is_primary == taxLossHarvestDashboardCtaButton.is_primary && this.action == taxLossHarvestDashboardCtaButton.action && Intrinsics.areEqual(this.action_url, taxLossHarvestDashboardCtaButton.action_url) && Intrinsics.areEqual(this.logging_identifier, taxLossHarvestDashboardCtaButton.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + Boolean.hashCode(this.is_primary)) * 37) + this.action.hashCode()) * 37;
        String str = this.action_url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.logging_identifier;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("is_primary=" + this.is_primary);
        arrayList.add("action=" + this.action);
        String str = this.action_url;
        if (str != null) {
            arrayList.add("action_url=" + Internal.sanitize(str));
        }
        String str2 = this.logging_identifier;
        if (str2 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestDashboardCtaButton{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestDashboardCtaButton copy$default(TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton, String str, boolean z, TaxLossHarvestDashboardAction taxLossHarvestDashboardAction, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestDashboardCtaButton.title;
        }
        if ((i & 2) != 0) {
            z = taxLossHarvestDashboardCtaButton.is_primary;
        }
        if ((i & 4) != 0) {
            taxLossHarvestDashboardAction = taxLossHarvestDashboardCtaButton.action;
        }
        if ((i & 8) != 0) {
            str2 = taxLossHarvestDashboardCtaButton.action_url;
        }
        if ((i & 16) != 0) {
            str3 = taxLossHarvestDashboardCtaButton.logging_identifier;
        }
        if ((i & 32) != 0) {
            byteString = taxLossHarvestDashboardCtaButton.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return taxLossHarvestDashboardCtaButton.copy(str, z, taxLossHarvestDashboardAction, str2, str4, byteString2);
    }

    public final TaxLossHarvestDashboardCtaButton copy(String title, boolean is_primary, TaxLossHarvestDashboardAction action, String action_url, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestDashboardCtaButton(title, is_primary, action, action_url, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestDashboardCtaButton.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestDashboardCtaButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestDashboardCtaButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestDashboardCtaButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (value.getIs_primary()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_primary()));
                }
                if (value.getAction() != TaxLossHarvestDashboardAction.ACTION_UNSPECIFIED) {
                    size += TaxLossHarvestDashboardAction.ADAPTER.encodedSizeWithTag(3, value.getAction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getAction_url()) + protoAdapter.encodedSizeWithTag(5, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestDashboardCtaButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (value.getAction() != TaxLossHarvestDashboardAction.ACTION_UNSPECIFIED) {
                    TaxLossHarvestDashboardAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAction_url());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestDashboardCtaButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAction_url());
                if (value.getAction() != TaxLossHarvestDashboardAction.ACTION_UNSPECIFIED) {
                    TaxLossHarvestDashboardAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardCtaButton decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLossHarvestDashboardAction taxLossHarvestDashboardActionDecode = TaxLossHarvestDashboardAction.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                boolean zBooleanValue = false;
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    TaxLossHarvestDashboardAction taxLossHarvestDashboardAction = taxLossHarvestDashboardActionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TaxLossHarvestDashboardCtaButton(strDecode3, zBooleanValue, taxLossHarvestDashboardAction, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 3) {
                            try {
                                taxLossHarvestDashboardActionDecode = TaxLossHarvestDashboardAction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardCtaButton redact(TaxLossHarvestDashboardCtaButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLossHarvestDashboardCtaButton.copy$default(value, null, false, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
