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

/* compiled from: PreSubmissionChecksRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016JB\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequest;", "Lcom/squareup/wire/Message;", "", "source_account", "Lnimbus/service/v1/TransferAccountInfo;", "destination_account", "cash_amount", "", "equity_positions", "", "Lnimbus/service/v1/EquityPosition;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnimbus/service/v1/TransferAccountInfo;Lnimbus/service/v1/TransferAccountInfo;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getSource_account", "()Lnimbus/service/v1/TransferAccountInfo;", "getDestination_account", "getCash_amount", "()Ljava/lang/String;", "getEquity_positions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PreSubmissionChecksRequest extends Message {

    @JvmField
    public static final ProtoAdapter<PreSubmissionChecksRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cashAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cash_amount;

    @WireField(adapter = "nimbus.service.v1.TransferAccountInfo#ADAPTER", jsonName = "destinationAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferAccountInfo destination_account;

    @WireField(adapter = "nimbus.service.v1.EquityPosition#ADAPTER", jsonName = "equityPositions", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<EquityPosition> equity_positions;

    @WireField(adapter = "nimbus.service.v1.TransferAccountInfo#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferAccountInfo source_account;

    public PreSubmissionChecksRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29373newBuilder();
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

    public /* synthetic */ PreSubmissionChecksRequest(TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transferAccountInfo, (i & 2) != 0 ? null : transferAccountInfo2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSubmissionChecksRequest(TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String cash_amount, List<EquityPosition> equity_positions, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_account = transferAccountInfo;
        this.destination_account = transferAccountInfo2;
        this.cash_amount = cash_amount;
        this.equity_positions = Internal.immutableCopyOf("equity_positions", equity_positions);
    }

    public final List<EquityPosition> getEquity_positions() {
        return this.equity_positions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29373newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PreSubmissionChecksRequest)) {
            return false;
        }
        PreSubmissionChecksRequest preSubmissionChecksRequest = (PreSubmissionChecksRequest) other;
        return Intrinsics.areEqual(unknownFields(), preSubmissionChecksRequest.unknownFields()) && Intrinsics.areEqual(this.source_account, preSubmissionChecksRequest.source_account) && Intrinsics.areEqual(this.destination_account, preSubmissionChecksRequest.destination_account) && Intrinsics.areEqual(this.cash_amount, preSubmissionChecksRequest.cash_amount) && Intrinsics.areEqual(this.equity_positions, preSubmissionChecksRequest.equity_positions);
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
        int iHashCode3 = ((((iHashCode2 + (transferAccountInfo2 != null ? transferAccountInfo2.hashCode() : 0)) * 37) + this.cash_amount.hashCode()) * 37) + this.equity_positions.hashCode();
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreSubmissionChecksRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PreSubmissionChecksRequest copy$default(PreSubmissionChecksRequest preSubmissionChecksRequest, TransferAccountInfo transferAccountInfo, TransferAccountInfo transferAccountInfo2, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccountInfo = preSubmissionChecksRequest.source_account;
        }
        if ((i & 2) != 0) {
            transferAccountInfo2 = preSubmissionChecksRequest.destination_account;
        }
        if ((i & 4) != 0) {
            str = preSubmissionChecksRequest.cash_amount;
        }
        if ((i & 8) != 0) {
            list = preSubmissionChecksRequest.equity_positions;
        }
        if ((i & 16) != 0) {
            byteString = preSubmissionChecksRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return preSubmissionChecksRequest.copy(transferAccountInfo, transferAccountInfo2, str2, list, byteString2);
    }

    public final PreSubmissionChecksRequest copy(TransferAccountInfo source_account, TransferAccountInfo destination_account, String cash_amount, List<EquityPosition> equity_positions, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PreSubmissionChecksRequest(source_account, destination_account, cash_amount, equity_positions, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreSubmissionChecksRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PreSubmissionChecksRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.PreSubmissionChecksRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PreSubmissionChecksRequest value) {
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
                return size + EquityPosition.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getEquity_positions());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PreSubmissionChecksRequest value) throws IOException {
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
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PreSubmissionChecksRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
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
            public PreSubmissionChecksRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                TransferAccountInfo transferAccountInfoDecode = null;
                String strDecode = "";
                TransferAccountInfo transferAccountInfoDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PreSubmissionChecksRequest(transferAccountInfoDecode, transferAccountInfoDecode2, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        transferAccountInfoDecode = TransferAccountInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        transferAccountInfoDecode2 = TransferAccountInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(EquityPosition.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionChecksRequest redact(PreSubmissionChecksRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TransferAccountInfo source_account = value.getSource_account();
                TransferAccountInfo transferAccountInfoRedact = source_account != null ? TransferAccountInfo.ADAPTER.redact(source_account) : null;
                TransferAccountInfo destination_account = value.getDestination_account();
                return PreSubmissionChecksRequest.copy$default(value, transferAccountInfoRedact, destination_account != null ? TransferAccountInfo.ADAPTER.redact(destination_account) : null, null, Internal.m26823redactElements(value.getEquity_positions(), EquityPosition.ADAPTER), ByteString.EMPTY, 4, null);
            }
        };
    }
}
