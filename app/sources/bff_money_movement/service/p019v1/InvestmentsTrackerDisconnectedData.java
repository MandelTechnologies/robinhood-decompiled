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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: InvestmentsTrackerDisconnectedData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "Lcom/squareup/wire/Message;", "", "display_text", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "institution_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Lokio/ByteString;)V", "getDisplay_text", "()Ljava/lang/String;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getInstitution_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerDisconnectedData extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerDisconnectedData> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String display_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String institution_id;

    public InvestmentsTrackerDisconnectedData() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ InvestmentsTrackerDisconnectedData(String str, ThemedColor themedColor, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8468newBuilder();
    }

    public final String getDisplay_text() {
        return this.display_text;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerDisconnectedData(String display_text, ThemedColor themedColor, String institution_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(display_text, "display_text");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.display_text = display_text;
        this.color = themedColor;
        this.institution_id = institution_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8468newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerDisconnectedData)) {
            return false;
        }
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = (InvestmentsTrackerDisconnectedData) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerDisconnectedData.unknownFields()) && Intrinsics.areEqual(this.display_text, investmentsTrackerDisconnectedData.display_text) && Intrinsics.areEqual(this.color, investmentsTrackerDisconnectedData.color) && Intrinsics.areEqual(this.institution_id, investmentsTrackerDisconnectedData.institution_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.display_text.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = ((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.institution_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("display_text=" + Internal.sanitize(this.display_text));
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerDisconnectedData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerDisconnectedData copy$default(InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, String str, ThemedColor themedColor, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerDisconnectedData.display_text;
        }
        if ((i & 2) != 0) {
            themedColor = investmentsTrackerDisconnectedData.color;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerDisconnectedData.institution_id;
        }
        if ((i & 8) != 0) {
            byteString = investmentsTrackerDisconnectedData.unknownFields();
        }
        return investmentsTrackerDisconnectedData.copy(str, themedColor, str2, byteString);
    }

    public final InvestmentsTrackerDisconnectedData copy(String display_text, ThemedColor color, String institution_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(display_text, "display_text");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerDisconnectedData(display_text, color, institution_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerDisconnectedData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerDisconnectedData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerDisconnectedData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerDisconnectedData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDisplay_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDisplay_text());
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getColor());
                }
                return !Intrinsics.areEqual(value.getInstitution_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstitution_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerDisconnectedData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDisplay_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_text());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstitution_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerDisconnectedData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstitution_id());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (Intrinsics.areEqual(value.getDisplay_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerDisconnectedData redact(InvestmentsTrackerDisconnectedData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return InvestmentsTrackerDisconnectedData.copy$default(value, null, color != null ? ThemedColor.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 5, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerDisconnectedData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ThemedColor themedColorDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerDisconnectedData(strDecode, themedColorDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
