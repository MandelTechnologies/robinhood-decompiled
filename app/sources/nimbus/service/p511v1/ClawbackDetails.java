package nimbus.service.p511v1;

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

/* compiled from: ClawbackDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lnimbus/service/v1/ClawbackDetails;", "Lcom/squareup/wire/Message;", "", "is_insufficient_funds", "", "clawback_amount", "", "moved_match_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getClawback_amount", "()Ljava/lang/String;", "getMoved_match_amount", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ClawbackDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ClawbackDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clawbackAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String clawback_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isInsufficientFunds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_insufficient_funds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "movedMatchAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String moved_match_amount;

    public ClawbackDetails() {
        this(false, null, null, null, 15, null);
    }

    public /* synthetic */ ClawbackDetails(boolean z, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29353newBuilder();
    }

    /* renamed from: is_insufficient_funds, reason: from getter */
    public final boolean getIs_insufficient_funds() {
        return this.is_insufficient_funds;
    }

    public final String getClawback_amount() {
        return this.clawback_amount;
    }

    public final String getMoved_match_amount() {
        return this.moved_match_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClawbackDetails(boolean z, String clawback_amount, String moved_match_amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(clawback_amount, "clawback_amount");
        Intrinsics.checkNotNullParameter(moved_match_amount, "moved_match_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_insufficient_funds = z;
        this.clawback_amount = clawback_amount;
        this.moved_match_amount = moved_match_amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29353newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClawbackDetails)) {
            return false;
        }
        ClawbackDetails clawbackDetails = (ClawbackDetails) other;
        return Intrinsics.areEqual(unknownFields(), clawbackDetails.unknownFields()) && this.is_insufficient_funds == clawbackDetails.is_insufficient_funds && Intrinsics.areEqual(this.clawback_amount, clawbackDetails.clawback_amount) && Intrinsics.areEqual(this.moved_match_amount, clawbackDetails.moved_match_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_insufficient_funds)) * 37) + this.clawback_amount.hashCode()) * 37) + this.moved_match_amount.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_insufficient_funds=" + this.is_insufficient_funds);
        arrayList.add("clawback_amount=" + Internal.sanitize(this.clawback_amount));
        arrayList.add("moved_match_amount=" + Internal.sanitize(this.moved_match_amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClawbackDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClawbackDetails copy$default(ClawbackDetails clawbackDetails, boolean z, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = clawbackDetails.is_insufficient_funds;
        }
        if ((i & 2) != 0) {
            str = clawbackDetails.clawback_amount;
        }
        if ((i & 4) != 0) {
            str2 = clawbackDetails.moved_match_amount;
        }
        if ((i & 8) != 0) {
            byteString = clawbackDetails.unknownFields();
        }
        return clawbackDetails.copy(z, str, str2, byteString);
    }

    public final ClawbackDetails copy(boolean is_insufficient_funds, String clawback_amount, String moved_match_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(clawback_amount, "clawback_amount");
        Intrinsics.checkNotNullParameter(moved_match_amount, "moved_match_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClawbackDetails(is_insufficient_funds, clawback_amount, moved_match_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClawbackDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClawbackDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.ClawbackDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClawbackDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_insufficient_funds()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_insufficient_funds()));
                }
                if (!Intrinsics.areEqual(value.getClawback_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getClawback_amount());
                }
                return !Intrinsics.areEqual(value.getMoved_match_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMoved_match_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClawbackDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_insufficient_funds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_insufficient_funds()));
                }
                if (!Intrinsics.areEqual(value.getClawback_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClawback_amount());
                }
                if (!Intrinsics.areEqual(value.getMoved_match_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMoved_match_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClawbackDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMoved_match_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMoved_match_amount());
                }
                if (!Intrinsics.areEqual(value.getClawback_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClawback_amount());
                }
                if (value.getIs_insufficient_funds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_insufficient_funds()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClawbackDetails redact(ClawbackDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClawbackDetails.copy$default(value, false, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClawbackDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClawbackDetails(zBooleanValue, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
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
