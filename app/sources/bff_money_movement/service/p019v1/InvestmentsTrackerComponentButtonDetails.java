package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerComponentButtonDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetails;", "Lcom/squareup/wire/Message;", "", "text", "", "action", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAction;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentButtonDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentButtonDetails> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InvestmentsTrackerAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public InvestmentsTrackerComponentButtonDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8453newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ InvestmentsTrackerComponentButtonDetails(String str, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? InvestmentsTrackerAction.ACTION_UNSPECIFIED : investmentsTrackerAction, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final InvestmentsTrackerAction getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentButtonDetails(String text, InvestmentsTrackerAction action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8453newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentButtonDetails)) {
            return false;
        }
        InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails = (InvestmentsTrackerComponentButtonDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentButtonDetails.unknownFields()) && Intrinsics.areEqual(this.text, investmentsTrackerComponentButtonDetails.text) && this.action == investmentsTrackerComponentButtonDetails.action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37) + this.action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("action=" + this.action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentButtonDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentButtonDetails copy$default(InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails, String str, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentButtonDetails.text;
        }
        if ((i & 2) != 0) {
            investmentsTrackerAction = investmentsTrackerComponentButtonDetails.action;
        }
        if ((i & 4) != 0) {
            byteString = investmentsTrackerComponentButtonDetails.unknownFields();
        }
        return investmentsTrackerComponentButtonDetails.copy(str, investmentsTrackerAction, byteString);
    }

    public final InvestmentsTrackerComponentButtonDetails copy(String text, InvestmentsTrackerAction action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentButtonDetails(text, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentButtonDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentButtonDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentButtonDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentButtonDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                return value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED ? size + InvestmentsTrackerAction.ADAPTER.encodedSizeWithTag(2, value.getAction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentButtonDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentButtonDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentButtonDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerAction investmentsTrackerActionDecode = InvestmentsTrackerAction.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerComponentButtonDetails(strDecode, investmentsTrackerActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            investmentsTrackerActionDecode = InvestmentsTrackerAction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentButtonDetails redact(InvestmentsTrackerComponentButtonDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentButtonDetails.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
