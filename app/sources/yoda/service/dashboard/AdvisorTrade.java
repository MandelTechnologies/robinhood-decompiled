package yoda.service.dashboard;

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

/* compiled from: AdvisorTrade.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 Jo\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b/\u0010.R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTrade;", "Lcom/squareup/wire/Message;", "", "", "id", "account_number", "", "Lyoda/service/dashboard/OrderGroup;", "order_groups", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "initiated_at", "Lyoda/service/dashboard/AdvisorTradeState;", "state", "Lcom/robinhood/rosetta/common/Money;", "total_bought", "total_sold", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lyoda/service/dashboard/AdvisorTradeState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lyoda/service/dashboard/AdvisorTradeState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)Lyoda/service/dashboard/AdvisorTrade;", "Ljava/lang/String;", "getId", "getAccount_number", "Lj$/time/Instant;", "getInitiated_at", "()Lj$/time/Instant;", "Lyoda/service/dashboard/AdvisorTradeState;", "getState", "()Lyoda/service/dashboard/AdvisorTradeState;", "Lcom/robinhood/rosetta/common/Money;", "getTotal_bought", "()Lcom/robinhood/rosetta/common/Money;", "getTotal_sold", "Ljava/util/List;", "getOrder_groups", "()Ljava/util/List;", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisorTrade extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorTrade> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "initiatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant initiated_at;

    @WireField(adapter = "yoda.service.dashboard.OrderGroup#ADAPTER", jsonName = "orderGroups", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<OrderGroup> order_groups;

    @WireField(adapter = "yoda.service.dashboard.AdvisorTradeState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AdvisorTradeState state;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalBought", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money total_bought;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalSold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money total_sold;

    public AdvisorTrade() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ AdvisorTrade(String str, String str2, List list, Instant instant, AdvisorTradeState advisorTradeState, Money money, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? AdvisorTradeState.ADVISOR_TRADE_STATE_UNSPECIFIED : advisorTradeState, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30085newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Instant getInitiated_at() {
        return this.initiated_at;
    }

    public final AdvisorTradeState getState() {
        return this.state;
    }

    public final Money getTotal_bought() {
        return this.total_bought;
    }

    public final Money getTotal_sold() {
        return this.total_sold;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorTrade(String id, String account_number, List<OrderGroup> order_groups, Instant instant, AdvisorTradeState state, Money money, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_groups, "order_groups");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.initiated_at = instant;
        this.state = state;
        this.total_bought = money;
        this.total_sold = money2;
        this.order_groups = Internal.immutableCopyOf("order_groups", order_groups);
    }

    public final List<OrderGroup> getOrder_groups() {
        return this.order_groups;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30085newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorTrade)) {
            return false;
        }
        AdvisorTrade advisorTrade = (AdvisorTrade) other;
        return Intrinsics.areEqual(unknownFields(), advisorTrade.unknownFields()) && Intrinsics.areEqual(this.id, advisorTrade.id) && Intrinsics.areEqual(this.account_number, advisorTrade.account_number) && Intrinsics.areEqual(this.order_groups, advisorTrade.order_groups) && Intrinsics.areEqual(this.initiated_at, advisorTrade.initiated_at) && this.state == advisorTrade.state && Intrinsics.areEqual(this.total_bought, advisorTrade.total_bought) && Intrinsics.areEqual(this.total_sold, advisorTrade.total_sold);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.order_groups.hashCode()) * 37;
        Instant instant = this.initiated_at;
        int iHashCode2 = (((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        Money money = this.total_bought;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_sold;
        int iHashCode4 = iHashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        if (!this.order_groups.isEmpty()) {
            arrayList.add("order_groups=" + this.order_groups);
        }
        Instant instant = this.initiated_at;
        if (instant != null) {
            arrayList.add("initiated_at=" + instant);
        }
        arrayList.add("state=" + this.state);
        Money money = this.total_bought;
        if (money != null) {
            arrayList.add("total_bought=" + money);
        }
        Money money2 = this.total_sold;
        if (money2 != null) {
            arrayList.add("total_sold=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorTrade{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorTrade copy$default(AdvisorTrade advisorTrade, String str, String str2, List list, Instant instant, AdvisorTradeState advisorTradeState, Money money, Money money2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorTrade.id;
        }
        if ((i & 2) != 0) {
            str2 = advisorTrade.account_number;
        }
        if ((i & 4) != 0) {
            list = advisorTrade.order_groups;
        }
        if ((i & 8) != 0) {
            instant = advisorTrade.initiated_at;
        }
        if ((i & 16) != 0) {
            advisorTradeState = advisorTrade.state;
        }
        if ((i & 32) != 0) {
            money = advisorTrade.total_bought;
        }
        if ((i & 64) != 0) {
            money2 = advisorTrade.total_sold;
        }
        if ((i & 128) != 0) {
            byteString = advisorTrade.unknownFields();
        }
        Money money3 = money2;
        ByteString byteString2 = byteString;
        AdvisorTradeState advisorTradeState2 = advisorTradeState;
        Money money4 = money;
        return advisorTrade.copy(str, str2, list, instant, advisorTradeState2, money4, money3, byteString2);
    }

    public final AdvisorTrade copy(String id, String account_number, List<OrderGroup> order_groups, Instant initiated_at, AdvisorTradeState state, Money total_bought, Money total_sold, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_groups, "order_groups");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorTrade(id, account_number, order_groups, initiated_at, state, total_bought, total_sold, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorTrade.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorTrade>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.AdvisorTrade$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorTrade value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                int iEncodedSizeWithTag = size + OrderGroup.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOrder_groups());
                if (value.getInitiated_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getInitiated_at());
                }
                if (value.getState() != AdvisorTradeState.ADVISOR_TRADE_STATE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AdvisorTradeState.ADAPTER.encodedSizeWithTag(5, value.getState());
                }
                if (value.getTotal_bought() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(6, value.getTotal_bought());
                }
                return value.getTotal_sold() != null ? iEncodedSizeWithTag + Money.ADAPTER.encodedSizeWithTag(7, value.getTotal_sold()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorTrade value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                OrderGroup.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOrder_groups());
                if (value.getInitiated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getInitiated_at());
                }
                if (value.getState() != AdvisorTradeState.ADVISOR_TRADE_STATE_UNSPECIFIED) {
                    AdvisorTradeState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (value.getTotal_bought() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_bought());
                }
                if (value.getTotal_sold() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getTotal_sold());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorTrade value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_sold() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getTotal_sold());
                }
                if (value.getTotal_bought() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_bought());
                }
                if (value.getState() != AdvisorTradeState.ADVISOR_TRADE_STATE_UNSPECIFIED) {
                    AdvisorTradeState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (value.getInitiated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getInitiated_at());
                }
                OrderGroup.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOrder_groups());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorTrade decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                AdvisorTradeState advisorTradeState = AdvisorTradeState.ADVISOR_TRADE_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                AdvisorTradeState advisorTradeStateDecode = advisorTradeState;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(OrderGroup.ADAPTER.decode(reader));
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                try {
                                    advisorTradeStateDecode = AdvisorTradeState.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisorTrade(strDecode2, strDecode, arrayList, instantDecode, advisorTradeStateDecode, moneyDecode, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorTrade redact(AdvisorTrade value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getOrder_groups(), OrderGroup.ADAPTER);
                Instant initiated_at = value.getInitiated_at();
                Instant instantRedact = initiated_at != null ? ProtoAdapter.INSTANT.redact(initiated_at) : null;
                Money total_bought = value.getTotal_bought();
                Money moneyRedact = total_bought != null ? Money.ADAPTER.redact(total_bought) : null;
                Money total_sold = value.getTotal_sold();
                return AdvisorTrade.copy$default(value, null, null, listM26823redactElements, instantRedact, null, moneyRedact, total_sold != null ? Money.ADAPTER.redact(total_sold) : null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
