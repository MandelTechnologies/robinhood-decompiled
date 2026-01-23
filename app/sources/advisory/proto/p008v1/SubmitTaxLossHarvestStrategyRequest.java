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

/* compiled from: SubmitTaxLossHarvestStrategyRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/SubmitTaxLossHarvestStrategyRequest;", "Lcom/squareup/wire/Message;", "", "strategy_type", "Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "account_numbers", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategyType;Ljava/util/List;Lokio/ByteString;)V", "getStrategy_type", "()Ladvisory/proto/v1/TaxLossHarvestStrategyType;", "getAccount_numbers", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubmitTaxLossHarvestStrategyRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SubmitTaxLossHarvestStrategyRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumbers", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> account_numbers;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyType#ADAPTER", jsonName = "strategyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLossHarvestStrategyType strategy_type;

    public SubmitTaxLossHarvestStrategyRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4542newBuilder();
    }

    public final TaxLossHarvestStrategyType getStrategy_type() {
        return this.strategy_type;
    }

    public /* synthetic */ SubmitTaxLossHarvestStrategyRequest(TaxLossHarvestStrategyType taxLossHarvestStrategyType, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED : taxLossHarvestStrategyType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaxLossHarvestStrategyRequest(TaxLossHarvestStrategyType strategy_type, List<String> account_numbers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.strategy_type = strategy_type;
        this.account_numbers = Internal.immutableCopyOf("account_numbers", account_numbers);
    }

    public final List<String> getAccount_numbers() {
        return this.account_numbers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4542newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubmitTaxLossHarvestStrategyRequest)) {
            return false;
        }
        SubmitTaxLossHarvestStrategyRequest submitTaxLossHarvestStrategyRequest = (SubmitTaxLossHarvestStrategyRequest) other;
        return Intrinsics.areEqual(unknownFields(), submitTaxLossHarvestStrategyRequest.unknownFields()) && this.strategy_type == submitTaxLossHarvestStrategyRequest.strategy_type && Intrinsics.areEqual(this.account_numbers, submitTaxLossHarvestStrategyRequest.account_numbers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.strategy_type.hashCode()) * 37) + this.account_numbers.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("strategy_type=" + this.strategy_type);
        if (!this.account_numbers.isEmpty()) {
            arrayList.add("account_numbers=" + Internal.sanitize(this.account_numbers));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitTaxLossHarvestStrategyRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitTaxLossHarvestStrategyRequest copy$default(SubmitTaxLossHarvestStrategyRequest submitTaxLossHarvestStrategyRequest, TaxLossHarvestStrategyType taxLossHarvestStrategyType, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLossHarvestStrategyType = submitTaxLossHarvestStrategyRequest.strategy_type;
        }
        if ((i & 2) != 0) {
            list = submitTaxLossHarvestStrategyRequest.account_numbers;
        }
        if ((i & 4) != 0) {
            byteString = submitTaxLossHarvestStrategyRequest.unknownFields();
        }
        return submitTaxLossHarvestStrategyRequest.copy(taxLossHarvestStrategyType, list, byteString);
    }

    public final SubmitTaxLossHarvestStrategyRequest copy(TaxLossHarvestStrategyType strategy_type, List<String> account_numbers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubmitTaxLossHarvestStrategyRequest(strategy_type, account_numbers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubmitTaxLossHarvestStrategyRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubmitTaxLossHarvestStrategyRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.SubmitTaxLossHarvestStrategyRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubmitTaxLossHarvestStrategyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStrategy_type() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    size += TaxLossHarvestStrategyType.ADAPTER.encodedSizeWithTag(1, value.getStrategy_type());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getAccount_numbers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubmitTaxLossHarvestStrategyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStrategy_type() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    TaxLossHarvestStrategyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getStrategy_type());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getAccount_numbers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubmitTaxLossHarvestStrategyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getAccount_numbers());
                if (value.getStrategy_type() != TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED) {
                    TaxLossHarvestStrategyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getStrategy_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubmitTaxLossHarvestStrategyRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLossHarvestStrategyType taxLossHarvestStrategyTypeDecode = TaxLossHarvestStrategyType.STRATEGY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubmitTaxLossHarvestStrategyRequest(taxLossHarvestStrategyTypeDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            taxLossHarvestStrategyTypeDecode = TaxLossHarvestStrategyType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitTaxLossHarvestStrategyRequest redact(SubmitTaxLossHarvestStrategyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SubmitTaxLossHarvestStrategyRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
