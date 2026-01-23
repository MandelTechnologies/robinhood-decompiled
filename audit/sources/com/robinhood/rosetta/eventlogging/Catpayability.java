package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
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

/* compiled from: Catpayability.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Catpayability;", "Lcom/squareup/wire/Message;", "", "withdraw", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;", "buy_withdraw", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "sell_deposit", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;Lokio/ByteString;)V", "getWithdraw", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityItem;", "getBuy_withdraw", "getDeposit", "getSell_deposit", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Catpayability extends Message {

    @JvmField
    public static final ProtoAdapter<Catpayability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayabilityItem#ADAPTER", jsonName = "buyWithdraw", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CatpayabilityItem buy_withdraw;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayabilityItem#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CatpayabilityItem deposit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayabilityItem#ADAPTER", jsonName = "sellDeposit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CatpayabilityItem sell_deposit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayabilityItem#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CatpayabilityItem withdraw;

    public Catpayability() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24063newBuilder();
    }

    public final CatpayabilityItem getWithdraw() {
        return this.withdraw;
    }

    public final CatpayabilityItem getBuy_withdraw() {
        return this.buy_withdraw;
    }

    public final CatpayabilityItem getDeposit() {
        return this.deposit;
    }

    public final CatpayabilityItem getSell_deposit() {
        return this.sell_deposit;
    }

    public /* synthetic */ Catpayability(CatpayabilityItem catpayabilityItem, CatpayabilityItem catpayabilityItem2, CatpayabilityItem catpayabilityItem3, CatpayabilityItem catpayabilityItem4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catpayabilityItem, (i & 2) != 0 ? null : catpayabilityItem2, (i & 4) != 0 ? null : catpayabilityItem3, (i & 8) != 0 ? null : catpayabilityItem4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Catpayability(CatpayabilityItem catpayabilityItem, CatpayabilityItem catpayabilityItem2, CatpayabilityItem catpayabilityItem3, CatpayabilityItem catpayabilityItem4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.withdraw = catpayabilityItem;
        this.buy_withdraw = catpayabilityItem2;
        this.deposit = catpayabilityItem3;
        this.sell_deposit = catpayabilityItem4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24063newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Catpayability)) {
            return false;
        }
        Catpayability catpayability = (Catpayability) other;
        return Intrinsics.areEqual(unknownFields(), catpayability.unknownFields()) && Intrinsics.areEqual(this.withdraw, catpayability.withdraw) && Intrinsics.areEqual(this.buy_withdraw, catpayability.buy_withdraw) && Intrinsics.areEqual(this.deposit, catpayability.deposit) && Intrinsics.areEqual(this.sell_deposit, catpayability.sell_deposit);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CatpayabilityItem catpayabilityItem = this.withdraw;
        int iHashCode2 = (iHashCode + (catpayabilityItem != null ? catpayabilityItem.hashCode() : 0)) * 37;
        CatpayabilityItem catpayabilityItem2 = this.buy_withdraw;
        int iHashCode3 = (iHashCode2 + (catpayabilityItem2 != null ? catpayabilityItem2.hashCode() : 0)) * 37;
        CatpayabilityItem catpayabilityItem3 = this.deposit;
        int iHashCode4 = (iHashCode3 + (catpayabilityItem3 != null ? catpayabilityItem3.hashCode() : 0)) * 37;
        CatpayabilityItem catpayabilityItem4 = this.sell_deposit;
        int iHashCode5 = iHashCode4 + (catpayabilityItem4 != null ? catpayabilityItem4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CatpayabilityItem catpayabilityItem = this.withdraw;
        if (catpayabilityItem != null) {
            arrayList.add("withdraw=" + catpayabilityItem);
        }
        CatpayabilityItem catpayabilityItem2 = this.buy_withdraw;
        if (catpayabilityItem2 != null) {
            arrayList.add("buy_withdraw=" + catpayabilityItem2);
        }
        CatpayabilityItem catpayabilityItem3 = this.deposit;
        if (catpayabilityItem3 != null) {
            arrayList.add("deposit=" + catpayabilityItem3);
        }
        CatpayabilityItem catpayabilityItem4 = this.sell_deposit;
        if (catpayabilityItem4 != null) {
            arrayList.add("sell_deposit=" + catpayabilityItem4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Catpayability{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Catpayability copy$default(Catpayability catpayability, CatpayabilityItem catpayabilityItem, CatpayabilityItem catpayabilityItem2, CatpayabilityItem catpayabilityItem3, CatpayabilityItem catpayabilityItem4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            catpayabilityItem = catpayability.withdraw;
        }
        if ((i & 2) != 0) {
            catpayabilityItem2 = catpayability.buy_withdraw;
        }
        if ((i & 4) != 0) {
            catpayabilityItem3 = catpayability.deposit;
        }
        if ((i & 8) != 0) {
            catpayabilityItem4 = catpayability.sell_deposit;
        }
        if ((i & 16) != 0) {
            byteString = catpayability.unknownFields();
        }
        ByteString byteString2 = byteString;
        CatpayabilityItem catpayabilityItem5 = catpayabilityItem3;
        return catpayability.copy(catpayabilityItem, catpayabilityItem2, catpayabilityItem5, catpayabilityItem4, byteString2);
    }

    public final Catpayability copy(CatpayabilityItem withdraw, CatpayabilityItem buy_withdraw, CatpayabilityItem deposit, CatpayabilityItem sell_deposit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Catpayability(withdraw, buy_withdraw, deposit, sell_deposit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Catpayability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Catpayability>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Catpayability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Catpayability value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getWithdraw() != null) {
                    size += CatpayabilityItem.ADAPTER.encodedSizeWithTag(1, value.getWithdraw());
                }
                if (value.getBuy_withdraw() != null) {
                    size += CatpayabilityItem.ADAPTER.encodedSizeWithTag(2, value.getBuy_withdraw());
                }
                if (value.getDeposit() != null) {
                    size += CatpayabilityItem.ADAPTER.encodedSizeWithTag(3, value.getDeposit());
                }
                return value.getSell_deposit() != null ? size + CatpayabilityItem.ADAPTER.encodedSizeWithTag(4, value.getSell_deposit()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Catpayability value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getWithdraw() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 1, (int) value.getWithdraw());
                }
                if (value.getBuy_withdraw() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuy_withdraw());
                }
                if (value.getDeposit() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 3, (int) value.getDeposit());
                }
                if (value.getSell_deposit() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 4, (int) value.getSell_deposit());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Catpayability value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSell_deposit() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 4, (int) value.getSell_deposit());
                }
                if (value.getDeposit() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 3, (int) value.getDeposit());
                }
                if (value.getBuy_withdraw() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuy_withdraw());
                }
                if (value.getWithdraw() != null) {
                    CatpayabilityItem.ADAPTER.encodeWithTag(writer, 1, (int) value.getWithdraw());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Catpayability redact(Catpayability value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CatpayabilityItem withdraw = value.getWithdraw();
                CatpayabilityItem catpayabilityItemRedact = withdraw != null ? CatpayabilityItem.ADAPTER.redact(withdraw) : null;
                CatpayabilityItem buy_withdraw = value.getBuy_withdraw();
                CatpayabilityItem catpayabilityItemRedact2 = buy_withdraw != null ? CatpayabilityItem.ADAPTER.redact(buy_withdraw) : null;
                CatpayabilityItem deposit = value.getDeposit();
                CatpayabilityItem catpayabilityItemRedact3 = deposit != null ? CatpayabilityItem.ADAPTER.redact(deposit) : null;
                CatpayabilityItem sell_deposit = value.getSell_deposit();
                return value.copy(catpayabilityItemRedact, catpayabilityItemRedact2, catpayabilityItemRedact3, sell_deposit != null ? CatpayabilityItem.ADAPTER.redact(sell_deposit) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Catpayability decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CatpayabilityItem catpayabilityItemDecode = null;
                CatpayabilityItem catpayabilityItemDecode2 = null;
                CatpayabilityItem catpayabilityItemDecode3 = null;
                CatpayabilityItem catpayabilityItemDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Catpayability(catpayabilityItemDecode, catpayabilityItemDecode2, catpayabilityItemDecode3, catpayabilityItemDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        catpayabilityItemDecode = CatpayabilityItem.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        catpayabilityItemDecode2 = CatpayabilityItem.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        catpayabilityItemDecode3 = CatpayabilityItem.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        catpayabilityItemDecode4 = CatpayabilityItem.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
