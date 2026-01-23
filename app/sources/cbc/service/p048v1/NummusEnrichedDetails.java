package cbc.service.p048v1;

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

/* compiled from: NummusEnrichedDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B7\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0018¨\u0006\""}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetails;", "Lcom/squareup/wire/Message;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "executed_at", "", "aggregation_id", "rhs_account_number", "Lokio/ByteString;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcbc/service/v1/NummusEnrichedDetails;", "Lj$/time/Instant;", "getExecuted_at", "()Lj$/time/Instant;", "Ljava/lang/String;", "getAggregation_id", "getRhs_account_number", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class NummusEnrichedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<NummusEnrichedDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "aggregationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String aggregation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "executedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant executed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhs_account_number;

    public NummusEnrichedDetails() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ NummusEnrichedDetails(Instant instant, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9089newBuilder();
    }

    public final Instant getExecuted_at() {
        return this.executed_at;
    }

    public final String getAggregation_id() {
        return this.aggregation_id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NummusEnrichedDetails(Instant instant, String aggregation_id, String rhs_account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.executed_at = instant;
        this.aggregation_id = aggregation_id;
        this.rhs_account_number = rhs_account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9089newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NummusEnrichedDetails)) {
            return false;
        }
        NummusEnrichedDetails nummusEnrichedDetails = (NummusEnrichedDetails) other;
        return Intrinsics.areEqual(unknownFields(), nummusEnrichedDetails.unknownFields()) && Intrinsics.areEqual(this.executed_at, nummusEnrichedDetails.executed_at) && Intrinsics.areEqual(this.aggregation_id, nummusEnrichedDetails.aggregation_id) && Intrinsics.areEqual(this.rhs_account_number, nummusEnrichedDetails.rhs_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.executed_at;
        int iHashCode2 = ((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.aggregation_id.hashCode()) * 37) + this.rhs_account_number.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.executed_at;
        if (instant != null) {
            arrayList.add("executed_at=" + instant);
        }
        arrayList.add("aggregation_id=" + Internal.sanitize(this.aggregation_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NummusEnrichedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NummusEnrichedDetails copy$default(NummusEnrichedDetails nummusEnrichedDetails, Instant instant, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = nummusEnrichedDetails.executed_at;
        }
        if ((i & 2) != 0) {
            str = nummusEnrichedDetails.aggregation_id;
        }
        if ((i & 4) != 0) {
            str2 = nummusEnrichedDetails.rhs_account_number;
        }
        if ((i & 8) != 0) {
            byteString = nummusEnrichedDetails.unknownFields();
        }
        return nummusEnrichedDetails.copy(instant, str, str2, byteString);
    }

    public final NummusEnrichedDetails copy(Instant executed_at, String aggregation_id, String rhs_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NummusEnrichedDetails(executed_at, aggregation_id, rhs_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NummusEnrichedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NummusEnrichedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cbc.service.v1.NummusEnrichedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NummusEnrichedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getExecuted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getExecuted_at());
                }
                if (!Intrinsics.areEqual(value.getAggregation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAggregation_id());
                }
                return !Intrinsics.areEqual(value.getRhs_account_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhs_account_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NummusEnrichedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getExecuted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getExecuted_at());
                }
                if (!Intrinsics.areEqual(value.getAggregation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAggregation_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NummusEnrichedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getAggregation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAggregation_id());
                }
                if (value.getExecuted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getExecuted_at());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NummusEnrichedDetails redact(NummusEnrichedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant executed_at = value.getExecuted_at();
                return NummusEnrichedDetails.copy$default(value, executed_at != null ? ProtoAdapter.INSTANT.redact(executed_at) : null, null, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NummusEnrichedDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NummusEnrichedDetails(instantDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
