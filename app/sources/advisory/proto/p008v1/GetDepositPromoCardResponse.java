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
import com.truelayer.payments.analytics.sender.EventSenderWorker;
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

/* compiled from: GetDepositPromoCardResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/GetDepositPromoCardResponse;", "Lcom/squareup/wire/Message;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Ladvisory/proto/v1/DepositPromoCardConfiguration;", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/DepositPromoCardConfiguration;Ljava/lang/String;Lokio/ByteString;)V", "getConfiguration", "()Ladvisory/proto/v1/DepositPromoCardConfiguration;", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetDepositPromoCardResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetDepositPromoCardResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.DepositPromoCardConfiguration#ADAPTER", schemaIndex = 0, tag = 1)
    private final DepositPromoCardConfiguration configuration;

    public GetDepositPromoCardResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4442newBuilder();
    }

    public final DepositPromoCardConfiguration getConfiguration() {
        return this.configuration;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetDepositPromoCardResponse(DepositPromoCardConfiguration depositPromoCardConfiguration, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : depositPromoCardConfiguration, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDepositPromoCardResponse(DepositPromoCardConfiguration depositPromoCardConfiguration, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.configuration = depositPromoCardConfiguration;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4442newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetDepositPromoCardResponse)) {
            return false;
        }
        GetDepositPromoCardResponse getDepositPromoCardResponse = (GetDepositPromoCardResponse) other;
        return Intrinsics.areEqual(unknownFields(), getDepositPromoCardResponse.unknownFields()) && Intrinsics.areEqual(this.configuration, getDepositPromoCardResponse.configuration) && Intrinsics.areEqual(this.account_number, getDepositPromoCardResponse.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DepositPromoCardConfiguration depositPromoCardConfiguration = this.configuration;
        int iHashCode2 = ((iHashCode + (depositPromoCardConfiguration != null ? depositPromoCardConfiguration.hashCode() : 0)) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DepositPromoCardConfiguration depositPromoCardConfiguration = this.configuration;
        if (depositPromoCardConfiguration != null) {
            arrayList.add("configuration=" + depositPromoCardConfiguration);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDepositPromoCardResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetDepositPromoCardResponse copy$default(GetDepositPromoCardResponse getDepositPromoCardResponse, DepositPromoCardConfiguration depositPromoCardConfiguration, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            depositPromoCardConfiguration = getDepositPromoCardResponse.configuration;
        }
        if ((i & 2) != 0) {
            str = getDepositPromoCardResponse.account_number;
        }
        if ((i & 4) != 0) {
            byteString = getDepositPromoCardResponse.unknownFields();
        }
        return getDepositPromoCardResponse.copy(depositPromoCardConfiguration, str, byteString);
    }

    public final GetDepositPromoCardResponse copy(DepositPromoCardConfiguration configuration, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetDepositPromoCardResponse(configuration, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetDepositPromoCardResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetDepositPromoCardResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetDepositPromoCardResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetDepositPromoCardResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + DepositPromoCardConfiguration.ADAPTER.encodedSizeWithTag(1, value.getConfiguration());
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetDepositPromoCardResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DepositPromoCardConfiguration.ADAPTER.encodeWithTag(writer, 1, (int) value.getConfiguration());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetDepositPromoCardResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                DepositPromoCardConfiguration.ADAPTER.encodeWithTag(writer, 1, (int) value.getConfiguration());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetDepositPromoCardResponse redact(GetDepositPromoCardResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DepositPromoCardConfiguration configuration = value.getConfiguration();
                return GetDepositPromoCardResponse.copy$default(value, configuration != null ? DepositPromoCardConfiguration.ADAPTER.redact(configuration) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetDepositPromoCardResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DepositPromoCardConfiguration depositPromoCardConfigurationDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetDepositPromoCardResponse(depositPromoCardConfigurationDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        depositPromoCardConfigurationDecode = DepositPromoCardConfiguration.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
