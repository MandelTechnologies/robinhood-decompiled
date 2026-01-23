package com.robinhood.rosetta.brokerage;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: BrokerageAccountingDetails.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016JX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "Lcom/squareup/wire/Message;", "", "source_id", "Lokio/ByteString;", "cash_hold", "Lcom/robinhood/rosetta/brokerage/CashHold;", "cash_adjustment", "", "Lcom/robinhood/rosetta/brokerage/CashAdjustment;", "moving_cash", "Lcom/robinhood/rosetta/brokerage/MovingCash;", "cash_limitation", "Lcom/robinhood/rosetta/brokerage/CashLimitation;", "process_cash_hold_last", "", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/brokerage/CashHold;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/MovingCash;Lcom/robinhood/rosetta/brokerage/CashLimitation;ZLokio/ByteString;)V", "getSource_id", "()Lokio/ByteString;", "getCash_hold", "()Lcom/robinhood/rosetta/brokerage/CashHold;", "getMoving_cash", "()Lcom/robinhood/rosetta/brokerage/MovingCash;", "getCash_limitation", "()Lcom/robinhood/rosetta/brokerage/CashLimitation;", "getProcess_cash_hold_last", "()Z", "getCash_adjustment", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BrokerageAccountingDetails extends Message {

    @JvmField
    public static final ProtoAdapter<BrokerageAccountingDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.CashAdjustment#ADAPTER", jsonName = "cashAdjustment", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<CashAdjustment> cash_adjustment;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.CashHold#ADAPTER", jsonName = "cashHold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CashHold cash_hold;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.CashLimitation#ADAPTER", jsonName = "cashLimitation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final CashLimitation cash_limitation;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.MovingCash#ADAPTER", jsonName = "movingCash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final MovingCash moving_cash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "processCashHoldLast", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final boolean process_cash_hold_last;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString source_id;

    public BrokerageAccountingDetails() {
        this(null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23946newBuilder();
    }

    public final ByteString getSource_id() {
        return this.source_id;
    }

    public /* synthetic */ BrokerageAccountingDetails(ByteString byteString, CashHold cashHold, List list, MovingCash movingCash, CashLimitation cashLimitation, boolean z, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : cashHold, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : movingCash, (i & 16) != 0 ? null : cashLimitation, (i & 32) != 0 ? false : z, (i & 64) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final CashHold getCash_hold() {
        return this.cash_hold;
    }

    public final MovingCash getMoving_cash() {
        return this.moving_cash;
    }

    public final CashLimitation getCash_limitation() {
        return this.cash_limitation;
    }

    public final boolean getProcess_cash_hold_last() {
        return this.process_cash_hold_last;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrokerageAccountingDetails(ByteString source_id, CashHold cashHold, List<CashAdjustment> cash_adjustment, MovingCash movingCash, CashLimitation cashLimitation, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_id = source_id;
        this.cash_hold = cashHold;
        this.moving_cash = movingCash;
        this.cash_limitation = cashLimitation;
        this.process_cash_hold_last = z;
        this.cash_adjustment = Internal.immutableCopyOf("cash_adjustment", cash_adjustment);
    }

    public final List<CashAdjustment> getCash_adjustment() {
        return this.cash_adjustment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23946newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrokerageAccountingDetails)) {
            return false;
        }
        BrokerageAccountingDetails brokerageAccountingDetails = (BrokerageAccountingDetails) other;
        return Intrinsics.areEqual(unknownFields(), brokerageAccountingDetails.unknownFields()) && Intrinsics.areEqual(this.source_id, brokerageAccountingDetails.source_id) && Intrinsics.areEqual(this.cash_hold, brokerageAccountingDetails.cash_hold) && Intrinsics.areEqual(this.cash_adjustment, brokerageAccountingDetails.cash_adjustment) && Intrinsics.areEqual(this.moving_cash, brokerageAccountingDetails.moving_cash) && Intrinsics.areEqual(this.cash_limitation, brokerageAccountingDetails.cash_limitation) && this.process_cash_hold_last == brokerageAccountingDetails.process_cash_hold_last;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.source_id.hashCode()) * 37;
        CashHold cashHold = this.cash_hold;
        int iHashCode2 = (((iHashCode + (cashHold != null ? cashHold.hashCode() : 0)) * 37) + this.cash_adjustment.hashCode()) * 37;
        MovingCash movingCash = this.moving_cash;
        int iHashCode3 = (iHashCode2 + (movingCash != null ? movingCash.hashCode() : 0)) * 37;
        CashLimitation cashLimitation = this.cash_limitation;
        int iHashCode4 = ((iHashCode3 + (cashLimitation != null ? cashLimitation.hashCode() : 0)) * 37) + Boolean.hashCode(this.process_cash_hold_last);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source_id=" + this.source_id);
        CashHold cashHold = this.cash_hold;
        if (cashHold != null) {
            arrayList.add("cash_hold=" + cashHold);
        }
        if (!this.cash_adjustment.isEmpty()) {
            arrayList.add("cash_adjustment=" + this.cash_adjustment);
        }
        MovingCash movingCash = this.moving_cash;
        if (movingCash != null) {
            arrayList.add("moving_cash=" + movingCash);
        }
        CashLimitation cashLimitation = this.cash_limitation;
        if (cashLimitation != null) {
            arrayList.add("cash_limitation=" + cashLimitation);
        }
        arrayList.add("process_cash_hold_last=" + this.process_cash_hold_last);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrokerageAccountingDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BrokerageAccountingDetails copy$default(BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, CashHold cashHold, List list, MovingCash movingCash, CashLimitation cashLimitation, boolean z, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = brokerageAccountingDetails.source_id;
        }
        if ((i & 2) != 0) {
            cashHold = brokerageAccountingDetails.cash_hold;
        }
        if ((i & 4) != 0) {
            list = brokerageAccountingDetails.cash_adjustment;
        }
        if ((i & 8) != 0) {
            movingCash = brokerageAccountingDetails.moving_cash;
        }
        if ((i & 16) != 0) {
            cashLimitation = brokerageAccountingDetails.cash_limitation;
        }
        if ((i & 32) != 0) {
            z = brokerageAccountingDetails.process_cash_hold_last;
        }
        if ((i & 64) != 0) {
            byteString2 = brokerageAccountingDetails.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString3 = byteString2;
        CashLimitation cashLimitation2 = cashLimitation;
        List list2 = list;
        return brokerageAccountingDetails.copy(byteString, cashHold, list2, movingCash, cashLimitation2, z2, byteString3);
    }

    public final BrokerageAccountingDetails copy(ByteString source_id, CashHold cash_hold, List<CashAdjustment> cash_adjustment, MovingCash moving_cash, CashLimitation cash_limitation, boolean process_cash_hold_last, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BrokerageAccountingDetails(source_id, cash_hold, cash_adjustment, moving_cash, cash_limitation, process_cash_hold_last, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokerageAccountingDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrokerageAccountingDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.brokerage.BrokerageAccountingDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrokerageAccountingDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSource_id(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSource_id());
                }
                if (value.getCash_hold() != null) {
                    size += CashHold.ADAPTER.encodedSizeWithTag(2, value.getCash_hold());
                }
                int iEncodedSizeWithTag = size + CashAdjustment.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getCash_adjustment());
                if (value.getMoving_cash() != null) {
                    iEncodedSizeWithTag += MovingCash.ADAPTER.encodedSizeWithTag(5, value.getMoving_cash());
                }
                if (value.getCash_limitation() != null) {
                    iEncodedSizeWithTag += CashLimitation.ADAPTER.encodedSizeWithTag(6, value.getCash_limitation());
                }
                return value.getProcess_cash_hold_last() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getProcess_cash_hold_last())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrokerageAccountingDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSource_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSource_id());
                }
                if (value.getCash_hold() != null) {
                    CashHold.ADAPTER.encodeWithTag(writer, 2, (int) value.getCash_hold());
                }
                CashAdjustment.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCash_adjustment());
                if (value.getMoving_cash() != null) {
                    MovingCash.ADAPTER.encodeWithTag(writer, 5, (int) value.getMoving_cash());
                }
                if (value.getCash_limitation() != null) {
                    CashLimitation.ADAPTER.encodeWithTag(writer, 6, (int) value.getCash_limitation());
                }
                if (value.getProcess_cash_hold_last()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getProcess_cash_hold_last()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrokerageAccountingDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getProcess_cash_hold_last()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getProcess_cash_hold_last()));
                }
                if (value.getCash_limitation() != null) {
                    CashLimitation.ADAPTER.encodeWithTag(writer, 6, (int) value.getCash_limitation());
                }
                if (value.getMoving_cash() != null) {
                    MovingCash.ADAPTER.encodeWithTag(writer, 5, (int) value.getMoving_cash());
                }
                CashAdjustment.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCash_adjustment());
                if (value.getCash_hold() != null) {
                    CashHold.ADAPTER.encodeWithTag(writer, 2, (int) value.getCash_hold());
                }
                if (Intrinsics.areEqual(value.getSource_id(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSource_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountingDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                CashHold cashHoldDecode = null;
                CashLimitation cashLimitationDecode = null;
                boolean zBooleanValue = false;
                MovingCash movingCashDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BrokerageAccountingDetails(byteStringDecode, cashHoldDecode, arrayList, movingCashDecode, cashLimitationDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag == 2) {
                        cashHoldDecode = CashHold.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(CashAdjustment.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        movingCashDecode = MovingCash.ADAPTER.decode(reader);
                    } else if (iNextTag == 6) {
                        cashLimitationDecode = CashLimitation.ADAPTER.decode(reader);
                    } else if (iNextTag == 7) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountingDetails redact(BrokerageAccountingDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CashHold cash_hold = value.getCash_hold();
                CashHold cashHoldRedact = cash_hold != null ? CashHold.ADAPTER.redact(cash_hold) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCash_adjustment(), CashAdjustment.ADAPTER);
                MovingCash moving_cash = value.getMoving_cash();
                MovingCash movingCashRedact = moving_cash != null ? MovingCash.ADAPTER.redact(moving_cash) : null;
                CashLimitation cash_limitation = value.getCash_limitation();
                return BrokerageAccountingDetails.copy$default(value, null, cashHoldRedact, listM26823redactElements, movingCashRedact, cash_limitation != null ? CashLimitation.ADAPTER.redact(cash_limitation) : null, false, ByteString.EMPTY, 33, null);
            }
        };
    }
}
