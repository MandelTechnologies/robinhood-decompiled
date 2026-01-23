package com.robinhood.rosetta.brokerage;

import com.robinhood.rosetta.common.Date;
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

/* compiled from: CashAdjustment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashAdjustment;", "Lcom/squareup/wire/Message;", "", "trigger_id", "Lokio/ByteString;", "record_date", "Lcom/robinhood/rosetta/common/Date;", "trade_delta", "Lcom/robinhood/rosetta/common/Money;", "settle_delta", "funding_hold_delta", "settlement_date", "short_delta", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getTrigger_id", "()Lokio/ByteString;", "getRecord_date", "()Lcom/robinhood/rosetta/common/Date;", "getTrade_delta", "()Lcom/robinhood/rosetta/common/Money;", "getSettle_delta", "getFunding_hold_delta", "getSettlement_date", "getShort_delta", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CashAdjustment extends Message {

    @JvmField
    public static final ProtoAdapter<CashAdjustment> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "fundingHoldDelta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 7)
    private final Money funding_hold_delta;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final Date record_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "settleDelta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 6)
    private final Money settle_delta;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "settlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 8)
    private final Date settlement_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "shortDelta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 9)
    private final Money short_delta;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "tradeDelta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final Money trade_delta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "triggerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 3)
    private final ByteString trigger_id;

    public CashAdjustment() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23948newBuilder();
    }

    public final ByteString getTrigger_id() {
        return this.trigger_id;
    }

    public /* synthetic */ CashAdjustment(ByteString byteString, Date date, Money money, Money money2, Money money3, Date date2, Money money4, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? null : date2, (i & 64) != 0 ? null : money4, (i & 128) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final Date getRecord_date() {
        return this.record_date;
    }

    public final Money getTrade_delta() {
        return this.trade_delta;
    }

    public final Money getSettle_delta() {
        return this.settle_delta;
    }

    public final Money getFunding_hold_delta() {
        return this.funding_hold_delta;
    }

    public final Date getSettlement_date() {
        return this.settlement_date;
    }

    public final Money getShort_delta() {
        return this.short_delta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAdjustment(ByteString trigger_id, Date date, Money money, Money money2, Money money3, Date date2, Money money4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trigger_id = trigger_id;
        this.record_date = date;
        this.trade_delta = money;
        this.settle_delta = money2;
        this.funding_hold_delta = money3;
        this.settlement_date = date2;
        this.short_delta = money4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23948newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashAdjustment)) {
            return false;
        }
        CashAdjustment cashAdjustment = (CashAdjustment) other;
        return Intrinsics.areEqual(unknownFields(), cashAdjustment.unknownFields()) && Intrinsics.areEqual(this.trigger_id, cashAdjustment.trigger_id) && Intrinsics.areEqual(this.record_date, cashAdjustment.record_date) && Intrinsics.areEqual(this.trade_delta, cashAdjustment.trade_delta) && Intrinsics.areEqual(this.settle_delta, cashAdjustment.settle_delta) && Intrinsics.areEqual(this.funding_hold_delta, cashAdjustment.funding_hold_delta) && Intrinsics.areEqual(this.settlement_date, cashAdjustment.settlement_date) && Intrinsics.areEqual(this.short_delta, cashAdjustment.short_delta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.trigger_id.hashCode()) * 37;
        Date date = this.record_date;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
        Money money = this.trade_delta;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.settle_delta;
        int iHashCode4 = (iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.funding_hold_delta;
        int iHashCode5 = (iHashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Date date2 = this.settlement_date;
        int iHashCode6 = (iHashCode5 + (date2 != null ? date2.hashCode() : 0)) * 37;
        Money money4 = this.short_delta;
        int iHashCode7 = iHashCode6 + (money4 != null ? money4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trigger_id=" + this.trigger_id);
        Date date = this.record_date;
        if (date != null) {
            arrayList.add("record_date=" + date);
        }
        Money money = this.trade_delta;
        if (money != null) {
            arrayList.add("trade_delta=" + money);
        }
        Money money2 = this.settle_delta;
        if (money2 != null) {
            arrayList.add("settle_delta=" + money2);
        }
        Money money3 = this.funding_hold_delta;
        if (money3 != null) {
            arrayList.add("funding_hold_delta=" + money3);
        }
        Date date2 = this.settlement_date;
        if (date2 != null) {
            arrayList.add("settlement_date=" + date2);
        }
        Money money4 = this.short_delta;
        if (money4 != null) {
            arrayList.add("short_delta=" + money4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAdjustment{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashAdjustment copy$default(CashAdjustment cashAdjustment, ByteString byteString, Date date, Money money, Money money2, Money money3, Date date2, Money money4, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = cashAdjustment.trigger_id;
        }
        if ((i & 2) != 0) {
            date = cashAdjustment.record_date;
        }
        if ((i & 4) != 0) {
            money = cashAdjustment.trade_delta;
        }
        if ((i & 8) != 0) {
            money2 = cashAdjustment.settle_delta;
        }
        if ((i & 16) != 0) {
            money3 = cashAdjustment.funding_hold_delta;
        }
        if ((i & 32) != 0) {
            date2 = cashAdjustment.settlement_date;
        }
        if ((i & 64) != 0) {
            money4 = cashAdjustment.short_delta;
        }
        if ((i & 128) != 0) {
            byteString2 = cashAdjustment.unknownFields();
        }
        Money money5 = money4;
        ByteString byteString3 = byteString2;
        Money money6 = money3;
        Date date3 = date2;
        return cashAdjustment.copy(byteString, date, money, money2, money6, date3, money5, byteString3);
    }

    public final CashAdjustment copy(ByteString trigger_id, Date record_date, Money trade_delta, Money settle_delta, Money funding_hold_delta, Date settlement_date, Money short_delta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trigger_id, "trigger_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashAdjustment(trigger_id, record_date, trade_delta, settle_delta, funding_hold_delta, settlement_date, short_delta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashAdjustment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashAdjustment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.brokerage.CashAdjustment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashAdjustment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTrigger_id(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getTrigger_id());
                }
                if (value.getRecord_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(4, value.getRecord_date());
                }
                if (value.getTrade_delta() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getTrade_delta());
                }
                if (value.getSettle_delta() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getSettle_delta());
                }
                if (value.getFunding_hold_delta() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getFunding_hold_delta());
                }
                if (value.getSettlement_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(8, value.getSettlement_date());
                }
                return value.getShort_delta() != null ? size + Money.ADAPTER.encodedSizeWithTag(9, value.getShort_delta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashAdjustment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTrigger_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 3, (int) value.getTrigger_id());
                }
                if (value.getRecord_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getRecord_date());
                }
                if (value.getTrade_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrade_delta());
                }
                if (value.getSettle_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getSettle_delta());
                }
                if (value.getFunding_hold_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getFunding_hold_delta());
                }
                if (value.getSettlement_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getSettlement_date());
                }
                if (value.getShort_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 9, (int) value.getShort_delta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashAdjustment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShort_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 9, (int) value.getShort_delta());
                }
                if (value.getSettlement_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getSettlement_date());
                }
                if (value.getFunding_hold_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getFunding_hold_delta());
                }
                if (value.getSettle_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getSettle_delta());
                }
                if (value.getTrade_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrade_delta());
                }
                if (value.getRecord_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getRecord_date());
                }
                if (Intrinsics.areEqual(value.getTrigger_id(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, (int) value.getTrigger_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashAdjustment decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Date dateDecode2 = null;
                Money moneyDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 3:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 4:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                break;
                            case 9:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CashAdjustment(byteStringDecode, dateDecode, moneyDecode, moneyDecode2, moneyDecode3, dateDecode2, moneyDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashAdjustment redact(CashAdjustment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date record_date = value.getRecord_date();
                Date dateRedact = record_date != null ? Date.ADAPTER.redact(record_date) : null;
                Money trade_delta = value.getTrade_delta();
                Money moneyRedact = trade_delta != null ? Money.ADAPTER.redact(trade_delta) : null;
                Money settle_delta = value.getSettle_delta();
                Money moneyRedact2 = settle_delta != null ? Money.ADAPTER.redact(settle_delta) : null;
                Money funding_hold_delta = value.getFunding_hold_delta();
                Money moneyRedact3 = funding_hold_delta != null ? Money.ADAPTER.redact(funding_hold_delta) : null;
                Date settlement_date = value.getSettlement_date();
                Date dateRedact2 = settlement_date != null ? Date.ADAPTER.redact(settlement_date) : null;
                Money short_delta = value.getShort_delta();
                return CashAdjustment.copy$default(value, null, dateRedact, moneyRedact, moneyRedact2, moneyRedact3, dateRedact2, short_delta != null ? Money.ADAPTER.redact(short_delta) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
