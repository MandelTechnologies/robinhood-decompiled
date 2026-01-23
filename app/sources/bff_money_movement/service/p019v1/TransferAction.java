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

/* compiled from: TransferAction.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAction;", "Lcom/squareup/wire/Message;", "", "type", "Lbff_money_movement/service/v1/TransferActionType;", "uri", "", "amount", "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/TransferActionType;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getType", "()Lbff_money_movement/service/v1/TransferActionType;", "getUri", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class TransferAction extends Message {

    @JvmField
    public static final ProtoAdapter<TransferAction> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "bff_money_movement.service.v1.TransferActionType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferActionType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String uri;

    public TransferAction() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8517newBuilder();
    }

    public final TransferActionType getType() {
        return this.type;
    }

    public /* synthetic */ TransferAction(TransferActionType transferActionType, String str, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED : transferActionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : money, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getUri() {
        return this.uri;
    }

    public final Money getAmount() {
        return this.amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAction(TransferActionType type2, String str, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.uri = str;
        this.amount = money;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8517newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TransferAction)) {
            return false;
        }
        TransferAction transferAction = (TransferAction) other;
        return Intrinsics.areEqual(unknownFields(), transferAction.unknownFields()) && this.type == transferAction.type && Intrinsics.areEqual(this.uri, transferAction.uri) && Intrinsics.areEqual(this.amount, transferAction.amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int iHashCode3 = iHashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        String str = this.uri;
        if (str != null) {
            arrayList.add("uri=" + Internal.sanitize(str));
        }
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TransferAction copy$default(TransferAction transferAction, TransferActionType transferActionType, String str, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferActionType = transferAction.type;
        }
        if ((i & 2) != 0) {
            str = transferAction.uri;
        }
        if ((i & 4) != 0) {
            money = transferAction.amount;
        }
        if ((i & 8) != 0) {
            byteString = transferAction.unknownFields();
        }
        return transferAction.copy(transferActionType, str, money, byteString);
    }

    public final TransferAction copy(TransferActionType type2, String uri, Money amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TransferAction(type2, uri, amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TransferAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.TransferAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TransferAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED) {
                    size += TransferActionType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUri()) + Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TransferAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED) {
                    TransferActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUri());
                Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TransferAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUri());
                if (value.getType() != TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED) {
                    TransferActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TransferAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferActionType transferActionTypeDecode = TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TransferAction(transferActionTypeDecode, strDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            transferActionTypeDecode = TransferActionType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TransferAction redact(TransferAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                return TransferAction.copy$default(value, null, null, amount != null ? Money.ADAPTER.redact(amount) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
