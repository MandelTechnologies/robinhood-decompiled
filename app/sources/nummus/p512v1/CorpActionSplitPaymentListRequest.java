package nummus.p512v1;

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
import p479j$.time.Instant;

/* compiled from: CorpActionSplitPaymentListRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B7\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0018¨\u0006\""}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentListRequest;", "Lcom/squareup/wire/Message;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "", "cursor", "currency_pair_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lnummus/v1/CorpActionSplitPaymentListRequest;", "Lj$/time/Instant;", "getUpdated_at_gte", "()Lj$/time/Instant;", "Ljava/lang/String;", "getCursor", "getCurrency_pair_id", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CorpActionSplitPaymentListRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CorpActionSplitPaymentListRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAtGte", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant updated_at_gte;

    public CorpActionSplitPaymentListRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ CorpActionSplitPaymentListRequest(Instant instant, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29404newBuilder();
    }

    public final Instant getUpdated_at_gte() {
        return this.updated_at_gte;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpActionSplitPaymentListRequest(Instant instant, String cursor, String currency_pair_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.updated_at_gte = instant;
        this.cursor = cursor;
        this.currency_pair_id = currency_pair_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29404newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CorpActionSplitPaymentListRequest)) {
            return false;
        }
        CorpActionSplitPaymentListRequest corpActionSplitPaymentListRequest = (CorpActionSplitPaymentListRequest) other;
        return Intrinsics.areEqual(unknownFields(), corpActionSplitPaymentListRequest.unknownFields()) && Intrinsics.areEqual(this.updated_at_gte, corpActionSplitPaymentListRequest.updated_at_gte) && Intrinsics.areEqual(this.cursor, corpActionSplitPaymentListRequest.cursor) && Intrinsics.areEqual(this.currency_pair_id, corpActionSplitPaymentListRequest.currency_pair_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.updated_at_gte;
        int iHashCode2 = ((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.cursor.hashCode()) * 37) + this.currency_pair_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.updated_at_gte;
        if (instant != null) {
            arrayList.add("updated_at_gte=" + instant);
        }
        arrayList.add("cursor=" + Internal.sanitize(this.cursor));
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CorpActionSplitPaymentListRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CorpActionSplitPaymentListRequest copy$default(CorpActionSplitPaymentListRequest corpActionSplitPaymentListRequest, Instant instant, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = corpActionSplitPaymentListRequest.updated_at_gte;
        }
        if ((i & 2) != 0) {
            str = corpActionSplitPaymentListRequest.cursor;
        }
        if ((i & 4) != 0) {
            str2 = corpActionSplitPaymentListRequest.currency_pair_id;
        }
        if ((i & 8) != 0) {
            byteString = corpActionSplitPaymentListRequest.unknownFields();
        }
        return corpActionSplitPaymentListRequest.copy(instant, str, str2, byteString);
    }

    public final CorpActionSplitPaymentListRequest copy(Instant updated_at_gte, String cursor, String currency_pair_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CorpActionSplitPaymentListRequest(updated_at_gte, cursor, currency_pair_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CorpActionSplitPaymentListRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CorpActionSplitPaymentListRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CorpActionSplitPaymentListRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CorpActionSplitPaymentListRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUpdated_at_gte() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getUpdated_at_gte());
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCursor());
                }
                return !Intrinsics.areEqual(value.getCurrency_pair_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCurrency_pair_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CorpActionSplitPaymentListRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUpdated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getUpdated_at_gte());
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCursor());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CorpActionSplitPaymentListRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCursor());
                }
                if (value.getUpdated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getUpdated_at_gte());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplitPaymentListRequest redact(CorpActionSplitPaymentListRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at_gte = value.getUpdated_at_gte();
                return CorpActionSplitPaymentListRequest.copy$default(value, updated_at_gte != null ? ProtoAdapter.INSTANT.redact(updated_at_gte) : null, null, null, ByteString.EMPTY, 6, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplitPaymentListRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CorpActionSplitPaymentListRequest(instantDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
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
