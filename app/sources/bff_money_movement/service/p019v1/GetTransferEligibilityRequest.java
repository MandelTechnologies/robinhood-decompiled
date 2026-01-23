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
import rosetta.payment_hub.p540v1.service.TransferType;

/* compiled from: GetTransferEligibilityRequest.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequest;", "Lcom/squareup/wire/Message;", "", "transfer_type", "Lrosetta/payment_hub/v1/service/TransferType;", "source", "Lbff_money_movement/service/v1/CreateTransferAccount;", "sink", "amount", "Lcom/robinhood/rosetta/common/Money;", "frequency", "Lbff_money_movement/service/v1/TransferFrequency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/payment_hub/v1/service/TransferType;Lbff_money_movement/service/v1/CreateTransferAccount;Lbff_money_movement/service/v1/CreateTransferAccount;Lcom/robinhood/rosetta/common/Money;Lbff_money_movement/service/v1/TransferFrequency;Lokio/ByteString;)V", "getTransfer_type", "()Lrosetta/payment_hub/v1/service/TransferType;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccount;", "getSink", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getFrequency", "()Lbff_money_movement/service/v1/TransferFrequency;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetTransferEligibilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransferEligibilityRequest> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money amount;

    @WireField(adapter = "bff_money_movement.service.v1.TransferFrequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TransferFrequency frequency;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CreateTransferAccount sink;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CreateTransferAccount source;

    @WireField(adapter = "rosetta.payment_hub.v1.service.TransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferType transfer_type;

    public GetTransferEligibilityRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8435newBuilder();
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public /* synthetic */ GetTransferEligibilityRequest(TransferType transferType, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, Money money, TransferFrequency transferFrequency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferType.TRANSFER_TYPE__UNSPECIFIED : transferType, (i & 2) != 0 ? null : createTransferAccount, (i & 4) != 0 ? null : createTransferAccount2, (i & 8) != 0 ? null : money, (i & 16) != 0 ? TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED : transferFrequency, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CreateTransferAccount getSource() {
        return this.source;
    }

    public final CreateTransferAccount getSink() {
        return this.sink;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final TransferFrequency getFrequency() {
        return this.frequency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransferEligibilityRequest(TransferType transfer_type, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, Money money, TransferFrequency frequency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_type = transfer_type;
        this.source = createTransferAccount;
        this.sink = createTransferAccount2;
        this.amount = money;
        this.frequency = frequency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8435newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransferEligibilityRequest)) {
            return false;
        }
        GetTransferEligibilityRequest getTransferEligibilityRequest = (GetTransferEligibilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), getTransferEligibilityRequest.unknownFields()) && this.transfer_type == getTransferEligibilityRequest.transfer_type && Intrinsics.areEqual(this.source, getTransferEligibilityRequest.source) && Intrinsics.areEqual(this.sink, getTransferEligibilityRequest.sink) && Intrinsics.areEqual(this.amount, getTransferEligibilityRequest.amount) && this.frequency == getTransferEligibilityRequest.frequency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.transfer_type.hashCode()) * 37;
        CreateTransferAccount createTransferAccount = this.source;
        int iHashCode2 = (iHashCode + (createTransferAccount != null ? createTransferAccount.hashCode() : 0)) * 37;
        CreateTransferAccount createTransferAccount2 = this.sink;
        int iHashCode3 = (iHashCode2 + (createTransferAccount2 != null ? createTransferAccount2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int iHashCode4 = ((iHashCode3 + (money != null ? money.hashCode() : 0)) * 37) + this.frequency.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_type=" + this.transfer_type);
        CreateTransferAccount createTransferAccount = this.source;
        if (createTransferAccount != null) {
            arrayList.add("source=" + createTransferAccount);
        }
        CreateTransferAccount createTransferAccount2 = this.sink;
        if (createTransferAccount2 != null) {
            arrayList.add("sink=" + createTransferAccount2);
        }
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("frequency=" + this.frequency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransferEligibilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTransferEligibilityRequest copy$default(GetTransferEligibilityRequest getTransferEligibilityRequest, TransferType transferType, CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, Money money, TransferFrequency transferFrequency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferType = getTransferEligibilityRequest.transfer_type;
        }
        if ((i & 2) != 0) {
            createTransferAccount = getTransferEligibilityRequest.source;
        }
        if ((i & 4) != 0) {
            createTransferAccount2 = getTransferEligibilityRequest.sink;
        }
        if ((i & 8) != 0) {
            money = getTransferEligibilityRequest.amount;
        }
        if ((i & 16) != 0) {
            transferFrequency = getTransferEligibilityRequest.frequency;
        }
        if ((i & 32) != 0) {
            byteString = getTransferEligibilityRequest.unknownFields();
        }
        TransferFrequency transferFrequency2 = transferFrequency;
        ByteString byteString2 = byteString;
        return getTransferEligibilityRequest.copy(transferType, createTransferAccount, createTransferAccount2, money, transferFrequency2, byteString2);
    }

    public final GetTransferEligibilityRequest copy(TransferType transfer_type, CreateTransferAccount source, CreateTransferAccount sink, Money amount, TransferFrequency frequency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransferEligibilityRequest(transfer_type, source, sink, amount, frequency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransferEligibilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransferEligibilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetTransferEligibilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransferEligibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    size += TransferType.ADAPTER.encodedSizeWithTag(1, value.getTransfer_type());
                }
                if (value.getSource() != null) {
                    size += CreateTransferAccount.ADAPTER.encodedSizeWithTag(2, value.getSource());
                }
                if (value.getSink() != null) {
                    size += CreateTransferAccount.ADAPTER.encodedSizeWithTag(3, value.getSink());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getAmount());
                }
                return value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED ? size + TransferFrequency.ADAPTER.encodedSizeWithTag(5, value.getFrequency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransferEligibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
                if (value.getSource() != null) {
                    CreateTransferAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (value.getSink() != null) {
                    CreateTransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSink());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED) {
                    TransferFrequency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrequency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransferEligibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED) {
                    TransferFrequency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrequency());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (value.getSink() != null) {
                    CreateTransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSink());
                }
                if (value.getSource() != null) {
                    CreateTransferAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferEligibilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferType transferTypeDecode = TransferType.TRANSFER_TYPE__UNSPECIFIED;
                TransferFrequency transferFrequency = TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CreateTransferAccount createTransferAccountDecode = null;
                CreateTransferAccount createTransferAccountDecode2 = null;
                Money moneyDecode = null;
                TransferFrequency transferFrequencyDecode = transferFrequency;
                while (true) {
                    TransferType transferType = transferTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetTransferEligibilityRequest(transferType, createTransferAccountDecode, createTransferAccountDecode2, moneyDecode, transferFrequencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                transferTypeDecode = TransferType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            createTransferAccountDecode = CreateTransferAccount.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            createTransferAccountDecode2 = CreateTransferAccount.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            moneyDecode = Money.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                transferFrequencyDecode = TransferFrequency.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferEligibilityRequest redact(GetTransferEligibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CreateTransferAccount source = value.getSource();
                CreateTransferAccount createTransferAccountRedact = source != null ? CreateTransferAccount.ADAPTER.redact(source) : null;
                CreateTransferAccount sink = value.getSink();
                CreateTransferAccount createTransferAccountRedact2 = sink != null ? CreateTransferAccount.ADAPTER.redact(sink) : null;
                Money amount = value.getAmount();
                return GetTransferEligibilityRequest.copy$default(value, null, createTransferAccountRedact, createTransferAccountRedact2, amount != null ? Money.ADAPTER.redact(amount) : null, null, ByteString.EMPTY, 17, null);
            }
        };
    }
}
