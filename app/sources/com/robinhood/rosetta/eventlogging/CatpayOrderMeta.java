package com.robinhood.rosetta.eventlogging;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CatpayOrderMeta.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;", "Lcom/squareup/wire/Message;", "", "robinhood_fee_in_fiat", "", "network_fee_in_fiat", "network_fee_in_asset", "crypto_transfers_account_state", "bill_quote_status", "catpayability", "Lcom/robinhood/rosetta/eventlogging/Catpayability;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Catpayability;Lokio/ByteString;)V", "getRobinhood_fee_in_fiat", "()Ljava/lang/String;", "getNetwork_fee_in_fiat", "getNetwork_fee_in_asset", "getCrypto_transfers_account_state", "getBill_quote_status", "getCatpayability", "()Lcom/robinhood/rosetta/eventlogging/Catpayability;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayOrderMeta extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayOrderMeta> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billQuoteStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String bill_quote_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Catpayability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Catpayability catpayability;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoTransfersAccountState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String crypto_transfers_account_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkFeeInAsset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String network_fee_in_asset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkFeeInFiat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String network_fee_in_fiat;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "robinhoodFeeInFiat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String robinhood_fee_in_fiat;

    public CatpayOrderMeta() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CatpayOrderMeta(String str, String str2, String str3, String str4, String str5, Catpayability catpayability, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : catpayability, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24058newBuilder();
    }

    public final String getRobinhood_fee_in_fiat() {
        return this.robinhood_fee_in_fiat;
    }

    public final String getNetwork_fee_in_fiat() {
        return this.network_fee_in_fiat;
    }

    public final String getNetwork_fee_in_asset() {
        return this.network_fee_in_asset;
    }

    public final String getCrypto_transfers_account_state() {
        return this.crypto_transfers_account_state;
    }

    public final String getBill_quote_status() {
        return this.bill_quote_status;
    }

    public final Catpayability getCatpayability() {
        return this.catpayability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayOrderMeta(String robinhood_fee_in_fiat, String network_fee_in_fiat, String network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, Catpayability catpayability, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
        Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
        Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.robinhood_fee_in_fiat = robinhood_fee_in_fiat;
        this.network_fee_in_fiat = network_fee_in_fiat;
        this.network_fee_in_asset = network_fee_in_asset;
        this.crypto_transfers_account_state = crypto_transfers_account_state;
        this.bill_quote_status = bill_quote_status;
        this.catpayability = catpayability;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24058newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayOrderMeta)) {
            return false;
        }
        CatpayOrderMeta catpayOrderMeta = (CatpayOrderMeta) other;
        return Intrinsics.areEqual(unknownFields(), catpayOrderMeta.unknownFields()) && Intrinsics.areEqual(this.robinhood_fee_in_fiat, catpayOrderMeta.robinhood_fee_in_fiat) && Intrinsics.areEqual(this.network_fee_in_fiat, catpayOrderMeta.network_fee_in_fiat) && Intrinsics.areEqual(this.network_fee_in_asset, catpayOrderMeta.network_fee_in_asset) && Intrinsics.areEqual(this.crypto_transfers_account_state, catpayOrderMeta.crypto_transfers_account_state) && Intrinsics.areEqual(this.bill_quote_status, catpayOrderMeta.bill_quote_status) && Intrinsics.areEqual(this.catpayability, catpayOrderMeta.catpayability);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.robinhood_fee_in_fiat.hashCode()) * 37) + this.network_fee_in_fiat.hashCode()) * 37) + this.network_fee_in_asset.hashCode()) * 37) + this.crypto_transfers_account_state.hashCode()) * 37) + this.bill_quote_status.hashCode()) * 37;
        Catpayability catpayability = this.catpayability;
        int iHashCode2 = iHashCode + (catpayability != null ? catpayability.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("robinhood_fee_in_fiat=" + Internal.sanitize(this.robinhood_fee_in_fiat));
        arrayList.add("network_fee_in_fiat=" + Internal.sanitize(this.network_fee_in_fiat));
        arrayList.add("network_fee_in_asset=" + Internal.sanitize(this.network_fee_in_asset));
        arrayList.add("crypto_transfers_account_state=" + Internal.sanitize(this.crypto_transfers_account_state));
        arrayList.add("bill_quote_status=" + Internal.sanitize(this.bill_quote_status));
        Catpayability catpayability = this.catpayability;
        if (catpayability != null) {
            arrayList.add("catpayability=" + catpayability);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayOrderMeta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CatpayOrderMeta copy$default(CatpayOrderMeta catpayOrderMeta, String str, String str2, String str3, String str4, String str5, Catpayability catpayability, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catpayOrderMeta.robinhood_fee_in_fiat;
        }
        if ((i & 2) != 0) {
            str2 = catpayOrderMeta.network_fee_in_fiat;
        }
        if ((i & 4) != 0) {
            str3 = catpayOrderMeta.network_fee_in_asset;
        }
        if ((i & 8) != 0) {
            str4 = catpayOrderMeta.crypto_transfers_account_state;
        }
        if ((i & 16) != 0) {
            str5 = catpayOrderMeta.bill_quote_status;
        }
        if ((i & 32) != 0) {
            catpayability = catpayOrderMeta.catpayability;
        }
        if ((i & 64) != 0) {
            byteString = catpayOrderMeta.unknownFields();
        }
        Catpayability catpayability2 = catpayability;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return catpayOrderMeta.copy(str, str2, str7, str4, str6, catpayability2, byteString2);
    }

    public final CatpayOrderMeta copy(String robinhood_fee_in_fiat, String network_fee_in_fiat, String network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, Catpayability catpayability, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
        Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
        Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayOrderMeta(robinhood_fee_in_fiat, network_fee_in_fiat, network_fee_in_asset, crypto_transfers_account_state, bill_quote_status, catpayability, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayOrderMeta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayOrderMeta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderMeta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRobinhood_fee_in_fiat(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRobinhood_fee_in_fiat());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_fiat(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNetwork_fee_in_fiat());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_asset(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNetwork_fee_in_asset());
                }
                if (!Intrinsics.areEqual(value.getCrypto_transfers_account_state(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCrypto_transfers_account_state());
                }
                if (!Intrinsics.areEqual(value.getBill_quote_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBill_quote_status());
                }
                return value.getCatpayability() != null ? size + Catpayability.ADAPTER.encodedSizeWithTag(6, value.getCatpayability()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRobinhood_fee_in_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRobinhood_fee_in_fiat());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNetwork_fee_in_fiat());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_asset(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNetwork_fee_in_asset());
                }
                if (!Intrinsics.areEqual(value.getCrypto_transfers_account_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCrypto_transfers_account_state());
                }
                if (!Intrinsics.areEqual(value.getBill_quote_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBill_quote_status());
                }
                if (value.getCatpayability() != null) {
                    Catpayability.ADAPTER.encodeWithTag(writer, 6, (int) value.getCatpayability());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCatpayability() != null) {
                    Catpayability.ADAPTER.encodeWithTag(writer, 6, (int) value.getCatpayability());
                }
                if (!Intrinsics.areEqual(value.getBill_quote_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBill_quote_status());
                }
                if (!Intrinsics.areEqual(value.getCrypto_transfers_account_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCrypto_transfers_account_state());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_asset(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNetwork_fee_in_asset());
                }
                if (!Intrinsics.areEqual(value.getNetwork_fee_in_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNetwork_fee_in_fiat());
                }
                if (Intrinsics.areEqual(value.getRobinhood_fee_in_fiat(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRobinhood_fee_in_fiat());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderMeta redact(CatpayOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Catpayability catpayability = value.getCatpayability();
                return CatpayOrderMeta.copy$default(value, null, null, null, null, null, catpayability != null ? Catpayability.ADAPTER.redact(catpayability) : null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderMeta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Catpayability catpayabilityDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                catpayabilityDecode = Catpayability.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CatpayOrderMeta(strDecode, strDecode5, strDecode2, strDecode3, strDecode4, catpayabilityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
