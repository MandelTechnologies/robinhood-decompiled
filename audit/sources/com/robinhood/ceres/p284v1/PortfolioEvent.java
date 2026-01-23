package com.robinhood.ceres.p284v1;

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

/* compiled from: PortfolioEvent.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u008d\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\"R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b-\u0010\"R\"\u0010\u0010\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b.\u0010)R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b/\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b0\u0010\"R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b4\u00103¨\u00066"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PortfolioEvent;", "Lcom/squareup/wire/Message;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/ceres/v1/EventType;", "type", "account_id", "", "Lcom/robinhood/ceres/v1/PositionMovement;", "position_movements", "Lcom/robinhood/ceres/v1/CashMovement;", "cash_movements", "trade_date", "rhs_account_number", "rhd_sub_account_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/ceres/v1/EventType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/ceres/v1/PortfolioEvent;", "Ljava/lang/String;", "getId", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/ceres/v1/EventType;", "getType", "()Lcom/robinhood/ceres/v1/EventType;", "getAccount_id", "getTrade_date", "getRhs_account_number", "getRhd_sub_account_id", "Ljava/util/List;", "getPosition_movements", "()Ljava/util/List;", "getCash_movements", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioEvent extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.CashMovement#ADAPTER", jsonName = "cashMovements", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<CashMovement> cash_movements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.ceres.v1.PositionMovement#ADAPTER", jsonName = "positionMovements", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<PositionMovement> position_movements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhdSubAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String rhd_sub_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String rhs_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant trade_date;

    @WireField(adapter = "com.robinhood.ceres.v1.EventType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EventType type;

    public PortfolioEvent() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ PortfolioEvent(String str, Instant instant, EventType eventType, String str2, List list, List list2, Instant instant2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20405newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final EventType getType() {
        return this.type;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final Instant getTrade_date() {
        return this.trade_date;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getRhd_sub_account_id() {
        return this.rhd_sub_account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioEvent(String id, Instant instant, EventType type2, String account_id, List<PositionMovement> position_movements, List<CashMovement> cash_movements, Instant instant2, String rhs_account_number, String rhd_sub_account_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position_movements, "position_movements");
        Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.timestamp = instant;
        this.type = type2;
        this.account_id = account_id;
        this.trade_date = instant2;
        this.rhs_account_number = rhs_account_number;
        this.rhd_sub_account_id = rhd_sub_account_id;
        this.position_movements = Internal.immutableCopyOf("position_movements", position_movements);
        this.cash_movements = Internal.immutableCopyOf("cash_movements", cash_movements);
    }

    public final List<PositionMovement> getPosition_movements() {
        return this.position_movements;
    }

    public final List<CashMovement> getCash_movements() {
        return this.cash_movements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20405newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioEvent)) {
            return false;
        }
        PortfolioEvent portfolioEvent = (PortfolioEvent) other;
        return Intrinsics.areEqual(unknownFields(), portfolioEvent.unknownFields()) && Intrinsics.areEqual(this.id, portfolioEvent.id) && Intrinsics.areEqual(this.timestamp, portfolioEvent.timestamp) && this.type == portfolioEvent.type && Intrinsics.areEqual(this.account_id, portfolioEvent.account_id) && Intrinsics.areEqual(this.position_movements, portfolioEvent.position_movements) && Intrinsics.areEqual(this.cash_movements, portfolioEvent.cash_movements) && Intrinsics.areEqual(this.trade_date, portfolioEvent.trade_date) && Intrinsics.areEqual(this.rhs_account_number, portfolioEvent.rhs_account_number) && Intrinsics.areEqual(this.rhd_sub_account_id, portfolioEvent.rhd_sub_account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.type.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.position_movements.hashCode()) * 37) + this.cash_movements.hashCode()) * 37;
        Instant instant2 = this.trade_date;
        int iHashCode3 = ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.rhs_account_number.hashCode()) * 37) + this.rhd_sub_account_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("type=" + this.type);
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.position_movements.isEmpty()) {
            arrayList.add("position_movements=" + this.position_movements);
        }
        if (!this.cash_movements.isEmpty()) {
            arrayList.add("cash_movements=" + this.cash_movements);
        }
        Instant instant2 = this.trade_date;
        if (instant2 != null) {
            arrayList.add("trade_date=" + instant2);
        }
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("rhd_sub_account_id=" + Internal.sanitize(this.rhd_sub_account_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioEvent copy$default(PortfolioEvent portfolioEvent, String str, Instant instant, EventType eventType, String str2, List list, List list2, Instant instant2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioEvent.id;
        }
        if ((i & 2) != 0) {
            instant = portfolioEvent.timestamp;
        }
        if ((i & 4) != 0) {
            eventType = portfolioEvent.type;
        }
        if ((i & 8) != 0) {
            str2 = portfolioEvent.account_id;
        }
        if ((i & 16) != 0) {
            list = portfolioEvent.position_movements;
        }
        if ((i & 32) != 0) {
            list2 = portfolioEvent.cash_movements;
        }
        if ((i & 64) != 0) {
            instant2 = portfolioEvent.trade_date;
        }
        if ((i & 128) != 0) {
            str3 = portfolioEvent.rhs_account_number;
        }
        if ((i & 256) != 0) {
            str4 = portfolioEvent.rhd_sub_account_id;
        }
        if ((i & 512) != 0) {
            byteString = portfolioEvent.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        String str6 = str3;
        List list3 = list;
        List list4 = list2;
        return portfolioEvent.copy(str, instant, eventType, str2, list3, list4, instant3, str6, str5, byteString2);
    }

    public final PortfolioEvent copy(String id, Instant timestamp, EventType type2, String account_id, List<PositionMovement> position_movements, List<CashMovement> cash_movements, Instant trade_date, String rhs_account_number, String rhd_sub_account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position_movements, "position_movements");
        Intrinsics.checkNotNullParameter(cash_movements, "cash_movements");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_sub_account_id, "rhd_sub_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioEvent(id, timestamp, type2, account_id, position_movements, cash_movements, trade_date, rhs_account_number, rhd_sub_account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.PortfolioEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getType() != EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += EventType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + PositionMovement.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getPosition_movements()) + CashMovement.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getCash_movements());
                if (value.getTrade_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getRhs_account_number());
                }
                return !Intrinsics.areEqual(value.getRhd_sub_account_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getRhd_sub_account_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getType() != EventType.EVENT_TYPE_UNSPECIFIED) {
                    EventType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                }
                PositionMovement.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPosition_movements());
                CashMovement.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getCash_movements());
                if (value.getTrade_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getRhd_sub_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRhd_sub_account_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRhd_sub_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRhd_sub_account_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getRhs_account_number());
                }
                if (value.getTrade_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getTrade_date());
                }
                CashMovement.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getCash_movements());
                PositionMovement.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPosition_movements());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                }
                if (value.getType() != EventType.EVENT_TYPE_UNSPECIFIED) {
                    EventType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioEvent decode(ProtoReader reader) throws IOException {
                EventType eventType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventType eventType2 = EventType.EVENT_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                EventType eventTypeDecode = eventType2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                try {
                                    eventTypeDecode = EventType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    eventType = eventTypeDecode;
                                    str = strDecode4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                arrayList.add(PositionMovement.ADAPTER.decode(reader));
                                eventType = eventTypeDecode;
                                str = strDecode4;
                                strDecode4 = str;
                                eventTypeDecode = eventType;
                                break;
                            case 6:
                                arrayList2.add(CashMovement.ADAPTER.decode(reader));
                                eventType = eventTypeDecode;
                                str = strDecode4;
                                strDecode4 = str;
                                eventTypeDecode = eventType;
                                break;
                            case 7:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                eventType = eventTypeDecode;
                                str = strDecode4;
                                strDecode4 = str;
                                eventTypeDecode = eventType;
                                break;
                        }
                    } else {
                        return new PortfolioEvent(strDecode4, instantDecode, eventTypeDecode, strDecode, arrayList, arrayList2, instantDecode2, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioEvent redact(PortfolioEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getPosition_movements(), PositionMovement.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getCash_movements(), CashMovement.ADAPTER);
                Instant trade_date = value.getTrade_date();
                return PortfolioEvent.copy$default(value, null, instantRedact, null, null, listM26823redactElements, listM26823redactElements2, trade_date != null ? ProtoAdapter.INSTANT.redact(trade_date) : null, null, null, ByteString.EMPTY, 397, null);
            }
        };
    }
}
