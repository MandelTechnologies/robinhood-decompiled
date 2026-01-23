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

/* compiled from: GetTaxLossHarvestStrategiesRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J \u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesRequest;", "Lcom/squareup/wire/Message;", "", "account_numbers", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getAccount_numbers", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestStrategiesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxLossHarvestStrategiesRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumbers", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> account_numbers;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTaxLossHarvestStrategiesRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4498newBuilder();
    }

    public /* synthetic */ GetTaxLossHarvestStrategiesRequest(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxLossHarvestStrategiesRequest(List<String> account_numbers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_numbers = Internal.immutableCopyOf("account_numbers", account_numbers);
    }

    public final List<String> getAccount_numbers() {
        return this.account_numbers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4498newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxLossHarvestStrategiesRequest)) {
            return false;
        }
        GetTaxLossHarvestStrategiesRequest getTaxLossHarvestStrategiesRequest = (GetTaxLossHarvestStrategiesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getTaxLossHarvestStrategiesRequest.unknownFields()) && Intrinsics.areEqual(this.account_numbers, getTaxLossHarvestStrategiesRequest.account_numbers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.account_numbers.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.account_numbers.isEmpty()) {
            arrayList.add("account_numbers=" + Internal.sanitize(this.account_numbers));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxLossHarvestStrategiesRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTaxLossHarvestStrategiesRequest copy$default(GetTaxLossHarvestStrategiesRequest getTaxLossHarvestStrategiesRequest, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getTaxLossHarvestStrategiesRequest.account_numbers;
        }
        if ((i & 2) != 0) {
            byteString = getTaxLossHarvestStrategiesRequest.unknownFields();
        }
        return getTaxLossHarvestStrategiesRequest.copy(list, byteString);
    }

    public final GetTaxLossHarvestStrategiesRequest copy(List<String> account_numbers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_numbers, "account_numbers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxLossHarvestStrategiesRequest(account_numbers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxLossHarvestStrategiesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxLossHarvestStrategiesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxLossHarvestStrategiesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxLossHarvestStrategiesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getAccount_numbers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxLossHarvestStrategiesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getAccount_numbers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxLossHarvestStrategiesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getAccount_numbers());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestStrategiesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxLossHarvestStrategiesRequest(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestStrategiesRequest redact(GetTaxLossHarvestStrategiesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetTaxLossHarvestStrategiesRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
