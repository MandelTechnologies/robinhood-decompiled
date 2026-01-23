package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Currency;
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

/* compiled from: CashBalance.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalance;", "Lcom/squareup/wire/Message;", "", "id", "", "account_id", "cash_amount", "currency_code", "Lcom/robinhood/rosetta/common/Currency;", "net_pending_cash_adjustment", "created_at", "updated_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getCash_amount", "getCurrency_code", "()Lcom/robinhood/rosetta/common/Currency;", "getNet_pending_cash_adjustment", "getCreated_at", "getUpdated_at", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashBalance extends Message {

    @JvmField
    public static final ProtoAdapter<CashBalance> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cashAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cash_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String created_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Currency currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "netPendingCashAdjustment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String net_pending_cash_adjustment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String updated_at;

    public CashBalance() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ CashBalance(String str, String str2, String str3, Currency currency, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20270newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getCash_amount() {
        return this.cash_amount;
    }

    public final Currency getCurrency_code() {
        return this.currency_code;
    }

    public final String getNet_pending_cash_adjustment() {
        return this.net_pending_cash_adjustment;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashBalance(String id, String account_id, String cash_amount, Currency currency_code, String net_pending_cash_adjustment, String created_at, String updated_at, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.cash_amount = cash_amount;
        this.currency_code = currency_code;
        this.net_pending_cash_adjustment = net_pending_cash_adjustment;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20270newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashBalance)) {
            return false;
        }
        CashBalance cashBalance = (CashBalance) other;
        return Intrinsics.areEqual(unknownFields(), cashBalance.unknownFields()) && Intrinsics.areEqual(this.id, cashBalance.id) && Intrinsics.areEqual(this.account_id, cashBalance.account_id) && Intrinsics.areEqual(this.cash_amount, cashBalance.cash_amount) && this.currency_code == cashBalance.currency_code && Intrinsics.areEqual(this.net_pending_cash_adjustment, cashBalance.net_pending_cash_adjustment) && Intrinsics.areEqual(this.created_at, cashBalance.created_at) && Intrinsics.areEqual(this.updated_at, cashBalance.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.cash_amount.hashCode()) * 37) + this.currency_code.hashCode()) * 37) + this.net_pending_cash_adjustment.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("cash_amount=" + Internal.sanitize(this.cash_amount));
        arrayList.add("currency_code=" + this.currency_code);
        arrayList.add("net_pending_cash_adjustment=" + Internal.sanitize(this.net_pending_cash_adjustment));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashBalance{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashBalance copy$default(CashBalance cashBalance, String str, String str2, String str3, Currency currency, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashBalance.id;
        }
        if ((i & 2) != 0) {
            str2 = cashBalance.account_id;
        }
        if ((i & 4) != 0) {
            str3 = cashBalance.cash_amount;
        }
        if ((i & 8) != 0) {
            currency = cashBalance.currency_code;
        }
        if ((i & 16) != 0) {
            str4 = cashBalance.net_pending_cash_adjustment;
        }
        if ((i & 32) != 0) {
            str5 = cashBalance.created_at;
        }
        if ((i & 64) != 0) {
            str6 = cashBalance.updated_at;
        }
        if ((i & 128) != 0) {
            byteString = cashBalance.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return cashBalance.copy(str, str2, str3, currency, str8, str9, str7, byteString2);
    }

    public final CashBalance copy(String id, String account_id, String cash_amount, Currency currency_code, String net_pending_cash_adjustment, String created_at, String updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashBalance(id, account_id, cash_amount, currency_code, net_pending_cash_adjustment, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashBalance.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashBalance>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CashBalance$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashBalance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCash_amount());
                }
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(4, value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getNet_pending_cash_adjustment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getNet_pending_cash_adjustment());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCreated_at());
                }
                return !Intrinsics.areEqual(value.getUpdated_at(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getUpdated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashBalance value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCash_amount());
                }
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getNet_pending_cash_adjustment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getNet_pending_cash_adjustment());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashBalance value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getNet_pending_cash_adjustment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getNet_pending_cash_adjustment());
                }
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCash_amount());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashBalance decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        currencyDecode = Currency.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new CashBalance(strDecode, strDecode2, strDecode3, currency, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashBalance redact(CashBalance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CashBalance.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
