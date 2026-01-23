package bff_money_movement.service.p019v1;

import com.robinhood.rosetta.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetTransferValidationRequest.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006$"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequest;", "Lcom/squareup/wire/Message;", "", "state", "Lbff_money_movement/service/v1/TransferState;", "direction", "Lbff_money_movement/service/v1/TransferDirection;", "amount", "Lcom/robinhood/rosetta/common/Money;", "source", "Lbff_money_movement/service/v1/CreateTransferAccount;", "sink", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/TransferState;Lbff_money_movement/service/v1/TransferDirection;Lcom/robinhood/rosetta/common/Money;Lbff_money_movement/service/v1/CreateTransferAccount;Lbff_money_movement/service/v1/CreateTransferAccount;Lokio/ByteString;)V", "getState", "()Lbff_money_movement/service/v1/TransferState;", "getDirection", "()Lbff_money_movement/service/v1/TransferDirection;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccount;", "getSink", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetTransferValidationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransferValidationRequest> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "bff_money_movement.service.v1.TransferDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferDirection direction;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", schemaIndex = 4, tag = 5)
    private final CreateTransferAccount sink;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", schemaIndex = 3, tag = 4)
    private final CreateTransferAccount source;

    @WireField(adapter = "bff_money_movement.service.v1.TransferState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferState state;

    public GetTransferValidationRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8437newBuilder();
    }

    public final TransferState getState() {
        return this.state;
    }

    public /* synthetic */ GetTransferValidationRequest(TransferState transferState, TransferDirection transferDirection, Money money, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferState.TRANSFER_STATE_UNSPECIFIED : transferState, (i & 2) != 0 ? TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED : transferDirection, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : createTransferAccount, (i & 16) != 0 ? null : createTransferAccount2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TransferDirection getDirection() {
        return this.direction;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final CreateTransferAccount getSource() {
        return this.source;
    }

    public final CreateTransferAccount getSink() {
        return this.sink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransferValidationRequest(TransferState state, TransferDirection direction, Money money, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.direction = direction;
        this.amount = money;
        this.source = createTransferAccount;
        this.sink = createTransferAccount2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8437newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransferValidationRequest)) {
            return false;
        }
        GetTransferValidationRequest getTransferValidationRequest = (GetTransferValidationRequest) other;
        return Intrinsics.areEqual(unknownFields(), getTransferValidationRequest.unknownFields()) && this.state == getTransferValidationRequest.state && this.direction == getTransferValidationRequest.direction && Intrinsics.areEqual(this.amount, getTransferValidationRequest.amount) && Intrinsics.areEqual(this.source, getTransferValidationRequest.source) && Intrinsics.areEqual(this.sink, getTransferValidationRequest.sink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37) + this.direction.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        CreateTransferAccount createTransferAccount = this.source;
        int iHashCode3 = (iHashCode2 + (createTransferAccount != null ? createTransferAccount.hashCode() : 0)) * 37;
        CreateTransferAccount createTransferAccount2 = this.sink;
        int iHashCode4 = iHashCode3 + (createTransferAccount2 != null ? createTransferAccount2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        arrayList.add("direction=" + this.direction);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        CreateTransferAccount createTransferAccount = this.source;
        if (createTransferAccount != null) {
            arrayList.add("source=" + createTransferAccount);
        }
        CreateTransferAccount createTransferAccount2 = this.sink;
        if (createTransferAccount2 != null) {
            arrayList.add("sink=" + createTransferAccount2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransferValidationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTransferValidationRequest copy$default(GetTransferValidationRequest getTransferValidationRequest, TransferState transferState, TransferDirection transferDirection, Money money, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferState = getTransferValidationRequest.state;
        }
        if ((i & 2) != 0) {
            transferDirection = getTransferValidationRequest.direction;
        }
        if ((i & 4) != 0) {
            money = getTransferValidationRequest.amount;
        }
        if ((i & 8) != 0) {
            createTransferAccount = getTransferValidationRequest.source;
        }
        if ((i & 16) != 0) {
            createTransferAccount2 = getTransferValidationRequest.sink;
        }
        if ((i & 32) != 0) {
            byteString = getTransferValidationRequest.unknownFields();
        }
        CreateTransferAccount createTransferAccount3 = createTransferAccount2;
        ByteString byteString2 = byteString;
        return getTransferValidationRequest.copy(transferState, transferDirection, money, createTransferAccount, createTransferAccount3, byteString2);
    }

    public final GetTransferValidationRequest copy(TransferState state, TransferDirection direction, Money amount, CreateTransferAccount source, CreateTransferAccount sink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransferValidationRequest(state, direction, amount, source, sink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransferValidationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransferValidationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetTransferValidationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransferValidationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    size += TransferState.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (value.getDirection() != TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED) {
                    size += TransferDirection.ADAPTER.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
                }
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(4, value.getSource()) + protoAdapter.encodedSizeWithTag(5, value.getSink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransferValidationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    TransferState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (value.getDirection() != TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED) {
                    TransferDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSource());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransferValidationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSink());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSource());
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getDirection() != TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED) {
                    TransferDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getState() != TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    TransferState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferValidationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferState transferStateDecode = TransferState.TRANSFER_STATE_UNSPECIFIED;
                TransferDirection transferDirection = TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                CreateTransferAccount createTransferAccountDecode = null;
                CreateTransferAccount createTransferAccountDecode2 = null;
                TransferDirection transferDirectionDecode = transferDirection;
                while (true) {
                    TransferState transferState = transferStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetTransferValidationRequest(transferState, transferDirectionDecode, moneyDecode, createTransferAccountDecode, createTransferAccountDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                transferStateDecode = TransferState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                transferDirectionDecode = TransferDirection.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            moneyDecode = Money.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            createTransferAccountDecode = CreateTransferAccount.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            createTransferAccountDecode2 = CreateTransferAccount.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferValidationRequest redact(GetTransferValidationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                CreateTransferAccount source = value.getSource();
                CreateTransferAccount createTransferAccountRedact = source != null ? CreateTransferAccount.ADAPTER.redact(source) : null;
                CreateTransferAccount sink = value.getSink();
                return GetTransferValidationRequest.copy$default(value, null, null, moneyRedact, createTransferAccountRedact, sink != null ? CreateTransferAccount.ADAPTER.redact(sink) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
