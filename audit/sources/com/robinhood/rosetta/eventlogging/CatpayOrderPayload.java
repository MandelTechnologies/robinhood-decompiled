package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.CatpayOrderPayload;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CatpayOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003789B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J¨\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;", "Lcom/squareup/wire/Message;", "", "bill_quote_id", "", "application_id", "asset_currency_code", "quote_currency_code", "network_code", "wallet_address", "flow", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "amount_in_quote", "amount_in_asset", "add_fee_to_amount", "", "payment_method", "Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethod;", "connect_id", "deposit_quote_id", "offramp", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/eventlogging/CatpayPaymentMethod;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getBill_quote_id", "()Ljava/lang/String;", "getApplication_id", "getAsset_currency_code", "getQuote_currency_code", "getNetwork_code", "getWallet_address", "getFlow", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "getAmount_in_quote", "getAmount_in_asset", "getAdd_fee_to_amount", "()Z", "getPayment_method", "()Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethod;", "getConnect_id", "getDeposit_quote_id", "getOfframp", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "CatpayEntryType", "CatpayFlow", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayOrderPayload> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "addFeeToAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean add_fee_to_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "amountInAsset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String amount_in_asset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "amountInQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String amount_in_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String application_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String asset_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billQuoteId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String bill_quote_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "connectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String connect_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "depositQuoteId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String deposit_quote_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderPayload$CatpayEntryType#ADAPTER", jsonName = "entryType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final CatpayEntryType entry_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderPayload$CatpayFlow#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final CatpayFlow flow;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String network_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final boolean offramp;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayPaymentMethod#ADAPTER", jsonName = "paymentMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final CatpayPaymentMethod payment_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quote_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "walletAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String wallet_address;

    public CatpayOrderPayload() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public /* synthetic */ CatpayOrderPayload(String str, String str2, String str3, String str4, String str5, String str6, CatpayFlow catpayFlow, CatpayEntryType catpayEntryType, String str7, String str8, boolean z, CatpayPaymentMethod catpayPaymentMethod, String str9, String str10, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? CatpayFlow.UNSPECIFIED : catpayFlow, (i & 128) != 0 ? CatpayEntryType.ENTRY_TYPE_UNSPECIFIED : catpayEntryType, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : catpayPaymentMethod, (i & 4096) != 0 ? "" : str9, (i & 8192) == 0 ? str10 : "", (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24059newBuilder();
    }

    public final String getBill_quote_id() {
        return this.bill_quote_id;
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    public final String getAsset_currency_code() {
        return this.asset_currency_code;
    }

    public final String getQuote_currency_code() {
        return this.quote_currency_code;
    }

    public final String getNetwork_code() {
        return this.network_code;
    }

    public final String getWallet_address() {
        return this.wallet_address;
    }

    public final CatpayFlow getFlow() {
        return this.flow;
    }

    public final CatpayEntryType getEntry_type() {
        return this.entry_type;
    }

    public final String getAmount_in_quote() {
        return this.amount_in_quote;
    }

    public final String getAmount_in_asset() {
        return this.amount_in_asset;
    }

    public final boolean getAdd_fee_to_amount() {
        return this.add_fee_to_amount;
    }

    public final CatpayPaymentMethod getPayment_method() {
        return this.payment_method;
    }

    public final String getConnect_id() {
        return this.connect_id;
    }

    public final String getDeposit_quote_id() {
        return this.deposit_quote_id;
    }

    public final boolean getOfframp() {
        return this.offramp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayOrderPayload(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlow flow, CatpayEntryType entry_type, String amount_in_quote, String amount_in_asset, boolean z, CatpayPaymentMethod catpayPaymentMethod, String connect_id, String deposit_quote_id, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(network_code, "network_code");
        Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
        Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bill_quote_id = bill_quote_id;
        this.application_id = application_id;
        this.asset_currency_code = asset_currency_code;
        this.quote_currency_code = quote_currency_code;
        this.network_code = network_code;
        this.wallet_address = wallet_address;
        this.flow = flow;
        this.entry_type = entry_type;
        this.amount_in_quote = amount_in_quote;
        this.amount_in_asset = amount_in_asset;
        this.add_fee_to_amount = z;
        this.payment_method = catpayPaymentMethod;
        this.connect_id = connect_id;
        this.deposit_quote_id = deposit_quote_id;
        this.offramp = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24059newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayOrderPayload)) {
            return false;
        }
        CatpayOrderPayload catpayOrderPayload = (CatpayOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), catpayOrderPayload.unknownFields()) && Intrinsics.areEqual(this.bill_quote_id, catpayOrderPayload.bill_quote_id) && Intrinsics.areEqual(this.application_id, catpayOrderPayload.application_id) && Intrinsics.areEqual(this.asset_currency_code, catpayOrderPayload.asset_currency_code) && Intrinsics.areEqual(this.quote_currency_code, catpayOrderPayload.quote_currency_code) && Intrinsics.areEqual(this.network_code, catpayOrderPayload.network_code) && Intrinsics.areEqual(this.wallet_address, catpayOrderPayload.wallet_address) && this.flow == catpayOrderPayload.flow && this.entry_type == catpayOrderPayload.entry_type && Intrinsics.areEqual(this.amount_in_quote, catpayOrderPayload.amount_in_quote) && Intrinsics.areEqual(this.amount_in_asset, catpayOrderPayload.amount_in_asset) && this.add_fee_to_amount == catpayOrderPayload.add_fee_to_amount && Intrinsics.areEqual(this.payment_method, catpayOrderPayload.payment_method) && Intrinsics.areEqual(this.connect_id, catpayOrderPayload.connect_id) && Intrinsics.areEqual(this.deposit_quote_id, catpayOrderPayload.deposit_quote_id) && this.offramp == catpayOrderPayload.offramp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((unknownFields().hashCode() * 37) + this.bill_quote_id.hashCode()) * 37) + this.application_id.hashCode()) * 37) + this.asset_currency_code.hashCode()) * 37) + this.quote_currency_code.hashCode()) * 37) + this.network_code.hashCode()) * 37) + this.wallet_address.hashCode()) * 37) + this.flow.hashCode()) * 37) + this.entry_type.hashCode()) * 37) + this.amount_in_quote.hashCode()) * 37) + this.amount_in_asset.hashCode()) * 37) + java.lang.Boolean.hashCode(this.add_fee_to_amount)) * 37;
        CatpayPaymentMethod catpayPaymentMethod = this.payment_method;
        int iHashCode2 = ((((((iHashCode + (catpayPaymentMethod != null ? catpayPaymentMethod.hashCode() : 0)) * 37) + this.connect_id.hashCode()) * 37) + this.deposit_quote_id.hashCode()) * 37) + java.lang.Boolean.hashCode(this.offramp);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bill_quote_id=" + Internal.sanitize(this.bill_quote_id));
        arrayList.add("application_id=" + Internal.sanitize(this.application_id));
        arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
        arrayList.add("quote_currency_code=" + Internal.sanitize(this.quote_currency_code));
        arrayList.add("network_code=" + Internal.sanitize(this.network_code));
        arrayList.add("wallet_address=" + Internal.sanitize(this.wallet_address));
        arrayList.add("flow=" + this.flow);
        arrayList.add("entry_type=" + this.entry_type);
        arrayList.add("amount_in_quote=" + Internal.sanitize(this.amount_in_quote));
        arrayList.add("amount_in_asset=" + Internal.sanitize(this.amount_in_asset));
        arrayList.add("add_fee_to_amount=" + this.add_fee_to_amount);
        CatpayPaymentMethod catpayPaymentMethod = this.payment_method;
        if (catpayPaymentMethod != null) {
            arrayList.add("payment_method=" + catpayPaymentMethod);
        }
        arrayList.add("connect_id=" + Internal.sanitize(this.connect_id));
        arrayList.add("deposit_quote_id=" + Internal.sanitize(this.deposit_quote_id));
        arrayList.add("offramp=" + this.offramp);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayOrderPayload{", "}", 0, null, null, 56, null);
    }

    public final CatpayOrderPayload copy(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlow flow, CatpayEntryType entry_type, String amount_in_quote, String amount_in_asset, boolean add_fee_to_amount, CatpayPaymentMethod payment_method, String connect_id, String deposit_quote_id, boolean offramp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(network_code, "network_code");
        Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
        Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayOrderPayload(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, flow, entry_type, amount_in_quote, amount_in_asset, add_fee_to_amount, payment_method, connect_id, deposit_quote_id, offramp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBill_quote_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBill_quote_id());
                }
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getApplication_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuote_currency_code());
                }
                if (!Intrinsics.areEqual(value.getNetwork_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getNetwork_code());
                }
                if (!Intrinsics.areEqual(value.getWallet_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getWallet_address());
                }
                if (value.getFlow() != CatpayOrderPayload.CatpayFlow.UNSPECIFIED) {
                    size += CatpayOrderPayload.CatpayFlow.ADAPTER.encodedSizeWithTag(7, value.getFlow());
                }
                if (value.getEntry_type() != CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED) {
                    size += CatpayOrderPayload.CatpayEntryType.ADAPTER.encodedSizeWithTag(8, value.getEntry_type());
                }
                if (!Intrinsics.areEqual(value.getAmount_in_quote(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getAmount_in_quote());
                }
                if (!Intrinsics.areEqual(value.getAmount_in_asset(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getAmount_in_asset());
                }
                if (value.getAdd_fee_to_amount()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(11, java.lang.Boolean.valueOf(value.getAdd_fee_to_amount()));
                }
                if (value.getPayment_method() != null) {
                    size += CatpayPaymentMethod.ADAPTER.encodedSizeWithTag(12, value.getPayment_method());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getConnect_id());
                }
                if (!Intrinsics.areEqual(value.getDeposit_quote_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getDeposit_quote_id());
                }
                return value.getOfframp() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(15, java.lang.Boolean.valueOf(value.getOfframp())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBill_quote_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBill_quote_id());
                }
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApplication_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuote_currency_code());
                }
                if (!Intrinsics.areEqual(value.getNetwork_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getNetwork_code());
                }
                if (!Intrinsics.areEqual(value.getWallet_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getWallet_address());
                }
                if (value.getFlow() != CatpayOrderPayload.CatpayFlow.UNSPECIFIED) {
                    CatpayOrderPayload.CatpayFlow.ADAPTER.encodeWithTag(writer, 7, (int) value.getFlow());
                }
                if (value.getEntry_type() != CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CatpayOrderPayload.CatpayEntryType.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntry_type());
                }
                if (!Intrinsics.areEqual(value.getAmount_in_quote(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAmount_in_quote());
                }
                if (!Intrinsics.areEqual(value.getAmount_in_asset(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAmount_in_asset());
                }
                if (value.getAdd_fee_to_amount()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getAdd_fee_to_amount()));
                }
                if (value.getPayment_method() != null) {
                    CatpayPaymentMethod.ADAPTER.encodeWithTag(writer, 12, (int) value.getPayment_method());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getConnect_id());
                }
                if (!Intrinsics.areEqual(value.getDeposit_quote_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDeposit_quote_id());
                }
                if (value.getOfframp()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getOfframp()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOfframp()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getOfframp()));
                }
                if (!Intrinsics.areEqual(value.getDeposit_quote_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDeposit_quote_id());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getConnect_id());
                }
                if (value.getPayment_method() != null) {
                    CatpayPaymentMethod.ADAPTER.encodeWithTag(writer, 12, (int) value.getPayment_method());
                }
                if (value.getAdd_fee_to_amount()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getAdd_fee_to_amount()));
                }
                if (!Intrinsics.areEqual(value.getAmount_in_asset(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAmount_in_asset());
                }
                if (!Intrinsics.areEqual(value.getAmount_in_quote(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAmount_in_quote());
                }
                if (value.getEntry_type() != CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CatpayOrderPayload.CatpayEntryType.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntry_type());
                }
                if (value.getFlow() != CatpayOrderPayload.CatpayFlow.UNSPECIFIED) {
                    CatpayOrderPayload.CatpayFlow.ADAPTER.encodeWithTag(writer, 7, (int) value.getFlow());
                }
                if (!Intrinsics.areEqual(value.getWallet_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getWallet_address());
                }
                if (!Intrinsics.areEqual(value.getNetwork_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getNetwork_code());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuote_currency_code());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApplication_id());
                }
                if (Intrinsics.areEqual(value.getBill_quote_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBill_quote_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderPayload decode(ProtoReader reader) throws IOException {
                CatpayOrderPayload.CatpayEntryType catpayEntryType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CatpayOrderPayload.CatpayFlow catpayFlow = CatpayOrderPayload.CatpayFlow.UNSPECIFIED;
                CatpayOrderPayload.CatpayEntryType catpayEntryType2 = CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CatpayOrderPayload.CatpayFlow catpayFlowDecode = catpayFlow;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                CatpayPaymentMethod catpayPaymentMethodDecode = null;
                CatpayOrderPayload.CatpayEntryType catpayEntryTypeDecode = catpayEntryType2;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                catpayEntryType = catpayEntryTypeDecode;
                                str = strDecode9;
                                str2 = strDecode10;
                                try {
                                    catpayFlowDecode = CatpayOrderPayload.CatpayFlow.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                try {
                                    catpayEntryTypeDecode = CatpayOrderPayload.CatpayEntryType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    catpayEntryType = catpayEntryTypeDecode;
                                    str = strDecode9;
                                    str2 = strDecode10;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 12:
                                catpayPaymentMethodDecode = CatpayPaymentMethod.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                catpayEntryType = catpayEntryTypeDecode;
                                str = strDecode9;
                                str2 = strDecode10;
                                break;
                        }
                        catpayEntryTypeDecode = catpayEntryType;
                        strDecode9 = str;
                        strDecode10 = str2;
                    } else {
                        return new CatpayOrderPayload(strDecode9, strDecode10, strDecode, strDecode2, strDecode3, strDecode4, catpayFlowDecode, catpayEntryTypeDecode, strDecode5, strDecode6, zBooleanValue, catpayPaymentMethodDecode, strDecode7, strDecode8, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderPayload redact(CatpayOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CatpayPaymentMethod payment_method = value.getPayment_method();
                return value.copy((30719 & 1) != 0 ? value.bill_quote_id : null, (30719 & 2) != 0 ? value.application_id : null, (30719 & 4) != 0 ? value.asset_currency_code : null, (30719 & 8) != 0 ? value.quote_currency_code : null, (30719 & 16) != 0 ? value.network_code : null, (30719 & 32) != 0 ? value.wallet_address : null, (30719 & 64) != 0 ? value.flow : null, (30719 & 128) != 0 ? value.entry_type : null, (30719 & 256) != 0 ? value.amount_in_quote : null, (30719 & 512) != 0 ? value.amount_in_asset : null, (30719 & 1024) != 0 ? value.add_fee_to_amount : false, (30719 & 2048) != 0 ? value.payment_method : payment_method != null ? CatpayPaymentMethod.ADAPTER.redact(payment_method) : null, (30719 & 4096) != 0 ? value.connect_id : null, (30719 & 8192) != 0 ? value.deposit_quote_id : null, (30719 & 16384) != 0 ? value.offramp : false, (30719 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderPayload.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayEntryType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayEntryType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CatpayEntryType> ADAPTER;
        public static final CatpayEntryType ASSET;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CatpayEntryType ENTRY_TYPE_UNSPECIFIED;
        public static final CatpayEntryType QUOTE;
        private final int value;

        private static final /* synthetic */ CatpayEntryType[] $values() {
            return new CatpayEntryType[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
        }

        @JvmStatic
        public static final CatpayEntryType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CatpayEntryType> getEntries() {
            return $ENTRIES;
        }

        private CatpayEntryType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CatpayEntryType catpayEntryType = new CatpayEntryType("ENTRY_TYPE_UNSPECIFIED", 0, 0);
            ENTRY_TYPE_UNSPECIFIED = catpayEntryType;
            ASSET = new CatpayEntryType("ASSET", 1, 1);
            QUOTE = new CatpayEntryType("QUOTE", 2, 2);
            CatpayEntryType[] catpayEntryTypeArr$values = $values();
            $VALUES = catpayEntryTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayEntryTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayEntryType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CatpayEntryType>(orCreateKotlinClass, syntax, catpayEntryType) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayload$CatpayEntryType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayOrderPayload.CatpayEntryType fromValue(int value) {
                    return CatpayOrderPayload.CatpayEntryType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayOrderPayload.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CatpayEntryType fromValue(int value) {
                if (value == 0) {
                    return CatpayEntryType.ENTRY_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CatpayEntryType.ASSET;
                }
                if (value != 2) {
                    return null;
                }
                return CatpayEntryType.QUOTE;
            }
        }

        public static CatpayEntryType valueOf(String str) {
            return (CatpayEntryType) Enum.valueOf(CatpayEntryType.class, str);
        }

        public static CatpayEntryType[] values() {
            return (CatpayEntryType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderPayload.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "BUY", "TRANSFER", "DEPOSIT", "SELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayFlow implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayFlow[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CatpayFlow> ADAPTER;
        public static final CatpayFlow BUY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CatpayFlow DEPOSIT;
        public static final CatpayFlow SELL;
        public static final CatpayFlow TRANSFER;
        public static final CatpayFlow UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ CatpayFlow[] $values() {
            return new CatpayFlow[]{UNSPECIFIED, BUY, TRANSFER, DEPOSIT, SELL};
        }

        @JvmStatic
        public static final CatpayFlow fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CatpayFlow> getEntries() {
            return $ENTRIES;
        }

        private CatpayFlow(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CatpayFlow catpayFlow = new CatpayFlow(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = catpayFlow;
            BUY = new CatpayFlow("BUY", 1, 1);
            TRANSFER = new CatpayFlow("TRANSFER", 2, 2);
            DEPOSIT = new CatpayFlow("DEPOSIT", 3, 3);
            SELL = new CatpayFlow("SELL", 4, 4);
            CatpayFlow[] catpayFlowArr$values = $values();
            $VALUES = catpayFlowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayFlowArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayFlow.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CatpayFlow>(orCreateKotlinClass, syntax, catpayFlow) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayload$CatpayFlow$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayOrderPayload.CatpayFlow fromValue(int value) {
                    return CatpayOrderPayload.CatpayFlow.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayOrderPayload.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CatpayFlow fromValue(int value) {
                if (value == 0) {
                    return CatpayFlow.UNSPECIFIED;
                }
                if (value == 1) {
                    return CatpayFlow.BUY;
                }
                if (value == 2) {
                    return CatpayFlow.TRANSFER;
                }
                if (value == 3) {
                    return CatpayFlow.DEPOSIT;
                }
                if (value != 4) {
                    return null;
                }
                return CatpayFlow.SELL;
            }
        }

        public static CatpayFlow valueOf(String str) {
            return (CatpayFlow) Enum.valueOf(CatpayFlow.class, str);
        }

        public static CatpayFlow[] values() {
            return (CatpayFlow[]) $VALUES.clone();
        }
    }
}
