package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Money;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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
import p479j$.time.Instant;

/* compiled from: AdvisoryFee.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFee;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/robinhood/rosetta/common/Money;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "transaction_time", "account_number", "Ladvisory/proto/v1/FeeState;", "state", "", "Ladvisory/proto/v1/AdvisoryFeeData;", WebsocketGatewayConstants.DATA_KEY, "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Ladvisory/proto/v1/FeeState;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Ladvisory/proto/v1/FeeState;Ljava/util/List;Lokio/ByteString;)Ladvisory/proto/v1/AdvisoryFee;", "Ljava/lang/String;", "getId", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "Lj$/time/Instant;", "getTransaction_time", "()Lj$/time/Instant;", "getAccount_number", "Ladvisory/proto/v1/FeeState;", "getState", "()Ladvisory/proto/v1/FeeState;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryFee extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryFee> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money amount;

    @WireField(adapter = "advisory.proto.v1.AdvisoryFeeData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<AdvisoryFeeData> data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "advisory.proto.v1.FeeState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FeeState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "transactionTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant transaction_time;

    public AdvisoryFee() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ AdvisoryFee(String str, Money money, Instant instant, String str2, FeeState feeState, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? FeeState.FEE_STATE_UNSPECIFIED : feeState, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4376newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Instant getTransaction_time() {
        return this.transaction_time;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final FeeState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFee(String id, Money money, Instant instant, String account_number, FeeState state, List<AdvisoryFeeData> data, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.amount = money;
        this.transaction_time = instant;
        this.account_number = account_number;
        this.state = state;
        this.data = Internal.immutableCopyOf(WebsocketGatewayConstants.DATA_KEY, data);
    }

    public final List<AdvisoryFeeData> getData() {
        return this.data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4376newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryFee)) {
            return false;
        }
        AdvisoryFee advisoryFee = (AdvisoryFee) other;
        return Intrinsics.areEqual(unknownFields(), advisoryFee.unknownFields()) && Intrinsics.areEqual(this.id, advisoryFee.id) && Intrinsics.areEqual(this.amount, advisoryFee.amount) && Intrinsics.areEqual(this.transaction_time, advisoryFee.transaction_time) && Intrinsics.areEqual(this.account_number, advisoryFee.account_number) && this.state == advisoryFee.state && Intrinsics.areEqual(this.data, advisoryFee.data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Instant instant = this.transaction_time;
        int iHashCode3 = ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.account_number.hashCode()) * 37) + this.state.hashCode()) * 37) + this.data.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        Instant instant = this.transaction_time;
        if (instant != null) {
            arrayList.add("transaction_time=" + instant);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("state=" + this.state);
        if (!this.data.isEmpty()) {
            arrayList.add("data=" + this.data);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryFee{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryFee copy$default(AdvisoryFee advisoryFee, String str, Money money, Instant instant, String str2, FeeState feeState, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryFee.id;
        }
        if ((i & 2) != 0) {
            money = advisoryFee.amount;
        }
        if ((i & 4) != 0) {
            instant = advisoryFee.transaction_time;
        }
        if ((i & 8) != 0) {
            str2 = advisoryFee.account_number;
        }
        if ((i & 16) != 0) {
            feeState = advisoryFee.state;
        }
        if ((i & 32) != 0) {
            list = advisoryFee.data;
        }
        if ((i & 64) != 0) {
            byteString = advisoryFee.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        FeeState feeState2 = feeState;
        Instant instant2 = instant;
        return advisoryFee.copy(str, money, instant2, str2, feeState2, list2, byteString2);
    }

    public final AdvisoryFee copy(String id, Money amount, Instant transaction_time, String account_number, FeeState state, List<AdvisoryFeeData> data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryFee(id, amount, transaction_time, account_number, state, data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryFee.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryFee>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryFee$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAmount());
                }
                if (value.getTransaction_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTransaction_time());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_number());
                }
                if (value.getState() != FeeState.FEE_STATE_UNSPECIFIED) {
                    size += FeeState.ADAPTER.encodedSizeWithTag(5, value.getState());
                }
                return size + AdvisoryFeeData.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getData());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getTransaction_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTransaction_time());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_number());
                }
                if (value.getState() != FeeState.FEE_STATE_UNSPECIFIED) {
                    FeeState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                AdvisoryFeeData.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getData());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryFeeData.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getData());
                if (value.getState() != FeeState.FEE_STATE_UNSPECIFIED) {
                    FeeState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_number());
                }
                if (value.getTransaction_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTransaction_time());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFee decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeeState feeState = FeeState.FEE_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Instant instantDecode = null;
                FeeState feeStateDecode = feeState;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    feeStateDecode = FeeState.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                arrayList.add(AdvisoryFeeData.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryFee(strDecode2, moneyDecode, instantDecode, strDecode, feeStateDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFee redact(AdvisoryFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Instant transaction_time = value.getTransaction_time();
                return AdvisoryFee.copy$default(value, null, moneyRedact, transaction_time != null ? ProtoAdapter.INSTANT.redact(transaction_time) : null, null, null, Internal.m26823redactElements(value.getData(), AdvisoryFeeData.ADAPTER), ByteString.EMPTY, 25, null);
            }
        };
    }
}
