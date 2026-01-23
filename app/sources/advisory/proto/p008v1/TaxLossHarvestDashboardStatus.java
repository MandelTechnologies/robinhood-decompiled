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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: TaxLossHarvestDashboardStatus.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "Lcom/squareup/wire/Message;", "", "status", "", "status_color", "Lrh_server_driven_ui/v1/ThemedColor;", "description_markdown", "cta_button", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;Lokio/ByteString;)V", "getStatus", "()Ljava/lang/String;", "getStatus_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getDescription_markdown", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardStatus extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestDashboardStatus> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardStatusButton#ADAPTER", jsonName = "ctaButton", schemaIndex = 3, tag = 4)
    private final TaxLossHarvestDashboardStatusButton cta_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String status;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "statusColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor status_color;

    public TaxLossHarvestDashboardStatus() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ TaxLossHarvestDashboardStatus(String str, ThemedColor themedColor, String str2, TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButton, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestDashboardStatusButton, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4552newBuilder();
    }

    public final String getStatus() {
        return this.status;
    }

    public final ThemedColor getStatus_color() {
        return this.status_color;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final TaxLossHarvestDashboardStatusButton getCta_button() {
        return this.cta_button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardStatus(String status, ThemedColor themedColor, String description_markdown, TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButton, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.status_color = themedColor;
        this.description_markdown = description_markdown;
        this.cta_button = taxLossHarvestDashboardStatusButton;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4552newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardStatus)) {
            return false;
        }
        TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus = (TaxLossHarvestDashboardStatus) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestDashboardStatus.unknownFields()) && Intrinsics.areEqual(this.status, taxLossHarvestDashboardStatus.status) && Intrinsics.areEqual(this.status_color, taxLossHarvestDashboardStatus.status_color) && Intrinsics.areEqual(this.description_markdown, taxLossHarvestDashboardStatus.description_markdown) && Intrinsics.areEqual(this.cta_button, taxLossHarvestDashboardStatus.cta_button);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        ThemedColor themedColor = this.status_color;
        int iHashCode2 = (((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.description_markdown.hashCode()) * 37;
        TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButton = this.cta_button;
        int iHashCode3 = iHashCode2 + (taxLossHarvestDashboardStatusButton != null ? taxLossHarvestDashboardStatusButton.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + Internal.sanitize(this.status));
        ThemedColor themedColor = this.status_color;
        if (themedColor != null) {
            arrayList.add("status_color=" + themedColor);
        }
        arrayList.add("description_markdown=" + Internal.sanitize(this.description_markdown));
        TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButton = this.cta_button;
        if (taxLossHarvestDashboardStatusButton != null) {
            arrayList.add("cta_button=" + taxLossHarvestDashboardStatusButton);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestDashboardStatus{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestDashboardStatus copy$default(TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus, String str, ThemedColor themedColor, String str2, TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButton, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestDashboardStatus.status;
        }
        if ((i & 2) != 0) {
            themedColor = taxLossHarvestDashboardStatus.status_color;
        }
        if ((i & 4) != 0) {
            str2 = taxLossHarvestDashboardStatus.description_markdown;
        }
        if ((i & 8) != 0) {
            taxLossHarvestDashboardStatusButton = taxLossHarvestDashboardStatus.cta_button;
        }
        if ((i & 16) != 0) {
            byteString = taxLossHarvestDashboardStatus.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return taxLossHarvestDashboardStatus.copy(str, themedColor, str3, taxLossHarvestDashboardStatusButton, byteString2);
    }

    public final TaxLossHarvestDashboardStatus copy(String status, ThemedColor status_color, String description_markdown, TaxLossHarvestDashboardStatusButton cta_button, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestDashboardStatus(status, status_color, description_markdown, cta_button, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestDashboardStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestDashboardStatus>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestDashboardStatus$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestDashboardStatus value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStatus());
                }
                if (value.getStatus_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getStatus_color());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription_markdown());
                }
                return size + TaxLossHarvestDashboardStatusButton.ADAPTER.encodedSizeWithTag(4, value.getCta_button());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestDashboardStatus value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                if (value.getStatus_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus_color());
                }
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription_markdown());
                }
                TaxLossHarvestDashboardStatusButton.ADAPTER.encodeWithTag(writer, 4, (int) value.getCta_button());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestDashboardStatus value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxLossHarvestDashboardStatusButton.ADAPTER.encodeWithTag(writer, 4, (int) value.getCta_button());
                if (!Intrinsics.areEqual(value.getDescription_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription_markdown());
                }
                if (value.getStatus_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus_color());
                }
                if (Intrinsics.areEqual(value.getStatus(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStatus());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardStatus redact(TaxLossHarvestDashboardStatus value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor status_color = value.getStatus_color();
                ThemedColor themedColorRedact = status_color != null ? ThemedColor.ADAPTER.redact(status_color) : null;
                TaxLossHarvestDashboardStatusButton cta_button = value.getCta_button();
                return TaxLossHarvestDashboardStatus.copy$default(value, null, themedColorRedact, null, cta_button != null ? TaxLossHarvestDashboardStatusButton.ADAPTER.redact(cta_button) : null, ByteString.EMPTY, 5, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardStatus decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ThemedColor themedColorDecode = null;
                TaxLossHarvestDashboardStatusButton taxLossHarvestDashboardStatusButtonDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestDashboardStatus(strDecode, themedColorDecode, strDecode2, taxLossHarvestDashboardStatusButtonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        taxLossHarvestDashboardStatusButtonDecode = TaxLossHarvestDashboardStatusButton.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
