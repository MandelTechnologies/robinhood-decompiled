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

/* compiled from: GetFullWithdrawalSummaryRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/GetFullWithdrawalSummaryRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "distribution_data", "Ladvisory/proto/v1/IRADistributionData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/IRADistributionData;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getDistribution_data", "()Ladvisory/proto/v1/IRADistributionData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetFullWithdrawalSummaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetFullWithdrawalSummaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.IRADistributionData#ADAPTER", jsonName = "distributionData", schemaIndex = 1, tag = 2)
    private final IRADistributionData distribution_data;

    public GetFullWithdrawalSummaryRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4448newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetFullWithdrawalSummaryRequest(String str, IRADistributionData iRADistributionData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : iRADistributionData, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final IRADistributionData getDistribution_data() {
        return this.distribution_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFullWithdrawalSummaryRequest(String account_number, IRADistributionData iRADistributionData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.distribution_data = iRADistributionData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4448newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFullWithdrawalSummaryRequest)) {
            return false;
        }
        GetFullWithdrawalSummaryRequest getFullWithdrawalSummaryRequest = (GetFullWithdrawalSummaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), getFullWithdrawalSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getFullWithdrawalSummaryRequest.account_number) && Intrinsics.areEqual(this.distribution_data, getFullWithdrawalSummaryRequest.distribution_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        IRADistributionData iRADistributionData = this.distribution_data;
        int iHashCode2 = iHashCode + (iRADistributionData != null ? iRADistributionData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        IRADistributionData iRADistributionData = this.distribution_data;
        if (iRADistributionData != null) {
            arrayList.add("distribution_data=" + iRADistributionData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFullWithdrawalSummaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFullWithdrawalSummaryRequest copy$default(GetFullWithdrawalSummaryRequest getFullWithdrawalSummaryRequest, String str, IRADistributionData iRADistributionData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFullWithdrawalSummaryRequest.account_number;
        }
        if ((i & 2) != 0) {
            iRADistributionData = getFullWithdrawalSummaryRequest.distribution_data;
        }
        if ((i & 4) != 0) {
            byteString = getFullWithdrawalSummaryRequest.unknownFields();
        }
        return getFullWithdrawalSummaryRequest.copy(str, iRADistributionData, byteString);
    }

    public final GetFullWithdrawalSummaryRequest copy(String account_number, IRADistributionData distribution_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFullWithdrawalSummaryRequest(account_number, distribution_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFullWithdrawalSummaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFullWithdrawalSummaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetFullWithdrawalSummaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFullWithdrawalSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return size + IRADistributionData.ADAPTER.encodedSizeWithTag(2, value.getDistribution_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFullWithdrawalSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                IRADistributionData.ADAPTER.encodeWithTag(writer, 2, (int) value.getDistribution_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFullWithdrawalSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IRADistributionData.ADAPTER.encodeWithTag(writer, 2, (int) value.getDistribution_data());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFullWithdrawalSummaryRequest redact(GetFullWithdrawalSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IRADistributionData distribution_data = value.getDistribution_data();
                return GetFullWithdrawalSummaryRequest.copy$default(value, null, distribution_data != null ? IRADistributionData.ADAPTER.redact(distribution_data) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFullWithdrawalSummaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                IRADistributionData iRADistributionDataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFullWithdrawalSummaryRequest(strDecode, iRADistributionDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iRADistributionDataDecode = IRADistributionData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
