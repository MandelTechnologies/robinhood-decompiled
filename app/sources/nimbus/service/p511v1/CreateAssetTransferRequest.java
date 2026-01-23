package nimbus.service.p511v1;

import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
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

/* compiled from: CreateAssetTransferRequest.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016JL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lnimbus/service/v1/CreateAssetTransferRequest;", "Lcom/squareup/wire/Message;", "", "source_account", "Lnimbus/service/v1/TransferAccountInfo;", "destination_account", "cash_amount", "", "equity_positions", "", "Lnimbus/service/v1/EquityPosition;", "ref_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnimbus/service/v1/TransferAccountInfo;Lnimbus/service/v1/TransferAccountInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getSource_account", "()Lnimbus/service/v1/TransferAccountInfo;", "getDestination_account", "getCash_amount", "()Ljava/lang/String;", "getRef_id", "getEquity_positions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class CreateAssetTransferRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateAssetTransferRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cashAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cash_amount;

    @WireField(adapter = "nimbus.service.v1.TransferAccountInfo#ADAPTER", jsonName = "destinationAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferAccountInfo destination_account;

    @WireField(adapter = "nimbus.service.v1.EquityPosition#ADAPTER", jsonName = "equityPositions", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<EquityPosition> equity_positions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String ref_id;

    @WireField(adapter = "nimbus.service.v1.TransferAccountInfo#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferAccountInfo source_account;

    public CreateAssetTransferRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CreateAssetTransferRequest(TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transferAccountInfo, (i & 2) != 0 ? null : transferAccountInfo2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29355newBuilder();
    }

    public final TransferAccountInfo getSource_account() {
        return this.source_account;
    }

    public final TransferAccountInfo getDestination_account() {
        return this.destination_account;
    }

    public final String getCash_amount() {
        return this.cash_amount;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAssetTransferRequest(TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String cash_amount, List<EquityPosition> equity_positions, String ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_account = transferAccountInfo;
        this.destination_account = transferAccountInfo2;
        this.cash_amount = cash_amount;
        this.ref_id = ref_id;
        this.equity_positions = Internal.immutableCopyOf("equity_positions", equity_positions);
    }

    public final List<EquityPosition> getEquity_positions() {
        return this.equity_positions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29355newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateAssetTransferRequest)) {
            return false;
        }
        CreateAssetTransferRequest createAssetTransferRequest = (CreateAssetTransferRequest) other;
        return Intrinsics.areEqual(unknownFields(), createAssetTransferRequest.unknownFields()) && Intrinsics.areEqual(this.source_account, createAssetTransferRequest.source_account) && Intrinsics.areEqual(this.destination_account, createAssetTransferRequest.destination_account) && Intrinsics.areEqual(this.cash_amount, createAssetTransferRequest.cash_amount) && Intrinsics.areEqual(this.equity_positions, createAssetTransferRequest.equity_positions) && Intrinsics.areEqual(this.ref_id, createAssetTransferRequest.ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TransferAccountInfo transferAccountInfo = this.source_account;
        int iHashCode2 = (iHashCode + (transferAccountInfo != null ? transferAccountInfo.hashCode() : 0)) * 37;
        TransferAccountInfo transferAccountInfo2 = this.destination_account;
        int iHashCode3 = ((((((iHashCode2 + (transferAccountInfo2 != null ? transferAccountInfo2.hashCode() : 0)) * 37) + this.cash_amount.hashCode()) * 37) + this.equity_positions.hashCode()) * 37) + this.ref_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TransferAccountInfo transferAccountInfo = this.source_account;
        if (transferAccountInfo != null) {
            arrayList.add("source_account=" + transferAccountInfo);
        }
        TransferAccountInfo transferAccountInfo2 = this.destination_account;
        if (transferAccountInfo2 != null) {
            arrayList.add("destination_account=" + transferAccountInfo2);
        }
        arrayList.add("cash_amount=" + Internal.sanitize(this.cash_amount));
        if (!this.equity_positions.isEmpty()) {
            arrayList.add("equity_positions=" + this.equity_positions);
        }
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateAssetTransferRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateAssetTransferRequest copy$default(CreateAssetTransferRequest createAssetTransferRequest, TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccountInfo = createAssetTransferRequest.source_account;
        }
        if ((i & 2) != 0) {
            transferAccountInfo2 = createAssetTransferRequest.destination_account;
        }
        if ((i & 4) != 0) {
            str = createAssetTransferRequest.cash_amount;
        }
        if ((i & 8) != 0) {
            list = createAssetTransferRequest.equity_positions;
        }
        if ((i & 16) != 0) {
            str2 = createAssetTransferRequest.ref_id;
        }
        if ((i & 32) != 0) {
            byteString = createAssetTransferRequest.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return createAssetTransferRequest.copy(transferAccountInfo, transferAccountInfo2, str, list, str3, byteString2);
    }

    public final CreateAssetTransferRequest copy(TransferAccountInfo source_account, TransferAccountInfo destination_account, String cash_amount, List<EquityPosition> equity_positions, String ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateAssetTransferRequest(source_account, destination_account, cash_amount, equity_positions, ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateAssetTransferRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateAssetTransferRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.CreateAssetTransferRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateAssetTransferRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSource_account() != null) {
                    size += TransferAccountInfo.ADAPTER.encodedSizeWithTag(1, value.getSource_account());
                }
                if (value.getDestination_account() != null) {
                    size += TransferAccountInfo.ADAPTER.encodedSizeWithTag(2, value.getDestination_account());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCash_amount());
                }
                int iEncodedSizeWithTag = size + EquityPosition.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getEquity_positions());
                return !Intrinsics.areEqual(value.getRef_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRef_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateAssetTransferRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource_account() != null) {
                    TransferAccountInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_account());
                }
                if (value.getDestination_account() != null) {
                    TransferAccountInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getDestination_account());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCash_amount());
                }
                EquityPosition.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getEquity_positions());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateAssetTransferRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                EquityPosition.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getEquity_positions());
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCash_amount());
                }
                if (value.getDestination_account() != null) {
                    TransferAccountInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getDestination_account());
                }
                if (value.getSource_account() != null) {
                    TransferAccountInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_account());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateAssetTransferRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                TransferAccountInfo transferAccountInfoDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                TransferAccountInfo transferAccountInfoDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateAssetTransferRequest(transferAccountInfoDecode, transferAccountInfoDecode2, strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        transferAccountInfoDecode = TransferAccountInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        transferAccountInfoDecode2 = TransferAccountInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(EquityPosition.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateAssetTransferRequest redact(CreateAssetTransferRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TransferAccountInfo source_account = value.getSource_account();
                TransferAccountInfo transferAccountInfoRedact = source_account != null ? TransferAccountInfo.ADAPTER.redact(source_account) : null;
                TransferAccountInfo destination_account = value.getDestination_account();
                return CreateAssetTransferRequest.copy$default(value, transferAccountInfoRedact, destination_account != null ? TransferAccountInfo.ADAPTER.redact(destination_account) : null, null, Internal.m26823redactElements(value.getEquity_positions(), EquityPosition.ADAPTER), null, ByteString.EMPTY, 20, null);
            }
        };
    }
}
