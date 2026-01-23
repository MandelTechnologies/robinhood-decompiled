package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponse;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import java.util.List;
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
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: GetCurrencyPairAccountSwitcherResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001e\u001f !BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "trade_bar", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "buy", "sell_dollars", "sell_units", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getTrade_bar", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "getBuy", "getSell_dollars", "getSell_units", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CurrencyPairAccountSwitcherType", "CurrencyPairAccountSwitcherAccount", "CurrencyPairAccountSwitcher", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCurrencyPairAccountSwitcherResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCurrencyPairAccountSwitcherResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CurrencyPairAccountSwitcher buy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CurrencyPairAccountSwitcher sell_dollars;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CurrencyPairAccountSwitcher sell_units;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CurrencyPairAccountSwitcher trade_bar;

    public GetCurrencyPairAccountSwitcherResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8943newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ GetCurrencyPairAccountSwitcherResponse(String str, CurrencyPairAccountSwitcher currencyPairAccountSwitcher, CurrencyPairAccountSwitcher currencyPairAccountSwitcher2, CurrencyPairAccountSwitcher currencyPairAccountSwitcher3, CurrencyPairAccountSwitcher currencyPairAccountSwitcher4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : currencyPairAccountSwitcher, (i & 4) != 0 ? null : currencyPairAccountSwitcher2, (i & 8) != 0 ? null : currencyPairAccountSwitcher3, (i & 16) != 0 ? null : currencyPairAccountSwitcher4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CurrencyPairAccountSwitcher getTrade_bar() {
        return this.trade_bar;
    }

    public final CurrencyPairAccountSwitcher getBuy() {
        return this.buy;
    }

    public final CurrencyPairAccountSwitcher getSell_dollars() {
        return this.sell_dollars;
    }

    public final CurrencyPairAccountSwitcher getSell_units() {
        return this.sell_units;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrencyPairAccountSwitcherResponse(String currency_pair_id, CurrencyPairAccountSwitcher currencyPairAccountSwitcher, CurrencyPairAccountSwitcher currencyPairAccountSwitcher2, CurrencyPairAccountSwitcher currencyPairAccountSwitcher3, CurrencyPairAccountSwitcher currencyPairAccountSwitcher4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.trade_bar = currencyPairAccountSwitcher;
        this.buy = currencyPairAccountSwitcher2;
        this.sell_dollars = currencyPairAccountSwitcher3;
        this.sell_units = currencyPairAccountSwitcher4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8943newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCurrencyPairAccountSwitcherResponse)) {
            return false;
        }
        GetCurrencyPairAccountSwitcherResponse getCurrencyPairAccountSwitcherResponse = (GetCurrencyPairAccountSwitcherResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCurrencyPairAccountSwitcherResponse.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, getCurrencyPairAccountSwitcherResponse.currency_pair_id) && Intrinsics.areEqual(this.trade_bar, getCurrencyPairAccountSwitcherResponse.trade_bar) && Intrinsics.areEqual(this.buy, getCurrencyPairAccountSwitcherResponse.buy) && Intrinsics.areEqual(this.sell_dollars, getCurrencyPairAccountSwitcherResponse.sell_dollars) && Intrinsics.areEqual(this.sell_units, getCurrencyPairAccountSwitcherResponse.sell_units);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher = this.trade_bar;
        int iHashCode2 = (iHashCode + (currencyPairAccountSwitcher != null ? currencyPairAccountSwitcher.hashCode() : 0)) * 37;
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher2 = this.buy;
        int iHashCode3 = (iHashCode2 + (currencyPairAccountSwitcher2 != null ? currencyPairAccountSwitcher2.hashCode() : 0)) * 37;
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher3 = this.sell_dollars;
        int iHashCode4 = (iHashCode3 + (currencyPairAccountSwitcher3 != null ? currencyPairAccountSwitcher3.hashCode() : 0)) * 37;
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher4 = this.sell_units;
        int iHashCode5 = iHashCode4 + (currencyPairAccountSwitcher4 != null ? currencyPairAccountSwitcher4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher = this.trade_bar;
        if (currencyPairAccountSwitcher != null) {
            arrayList.add("trade_bar=" + currencyPairAccountSwitcher);
        }
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher2 = this.buy;
        if (currencyPairAccountSwitcher2 != null) {
            arrayList.add("buy=" + currencyPairAccountSwitcher2);
        }
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher3 = this.sell_dollars;
        if (currencyPairAccountSwitcher3 != null) {
            arrayList.add("sell_dollars=" + currencyPairAccountSwitcher3);
        }
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher4 = this.sell_units;
        if (currencyPairAccountSwitcher4 != null) {
            arrayList.add("sell_units=" + currencyPairAccountSwitcher4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCurrencyPairAccountSwitcherResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCurrencyPairAccountSwitcherResponse copy$default(GetCurrencyPairAccountSwitcherResponse getCurrencyPairAccountSwitcherResponse, String str, CurrencyPairAccountSwitcher currencyPairAccountSwitcher, CurrencyPairAccountSwitcher currencyPairAccountSwitcher2, CurrencyPairAccountSwitcher currencyPairAccountSwitcher3, CurrencyPairAccountSwitcher currencyPairAccountSwitcher4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCurrencyPairAccountSwitcherResponse.currency_pair_id;
        }
        if ((i & 2) != 0) {
            currencyPairAccountSwitcher = getCurrencyPairAccountSwitcherResponse.trade_bar;
        }
        if ((i & 4) != 0) {
            currencyPairAccountSwitcher2 = getCurrencyPairAccountSwitcherResponse.buy;
        }
        if ((i & 8) != 0) {
            currencyPairAccountSwitcher3 = getCurrencyPairAccountSwitcherResponse.sell_dollars;
        }
        if ((i & 16) != 0) {
            currencyPairAccountSwitcher4 = getCurrencyPairAccountSwitcherResponse.sell_units;
        }
        if ((i & 32) != 0) {
            byteString = getCurrencyPairAccountSwitcherResponse.unknownFields();
        }
        CurrencyPairAccountSwitcher currencyPairAccountSwitcher5 = currencyPairAccountSwitcher4;
        ByteString byteString2 = byteString;
        return getCurrencyPairAccountSwitcherResponse.copy(str, currencyPairAccountSwitcher, currencyPairAccountSwitcher2, currencyPairAccountSwitcher3, currencyPairAccountSwitcher5, byteString2);
    }

    public final GetCurrencyPairAccountSwitcherResponse copy(String currency_pair_id, CurrencyPairAccountSwitcher trade_bar, CurrencyPairAccountSwitcher buy, CurrencyPairAccountSwitcher sell_dollars, CurrencyPairAccountSwitcher sell_units, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCurrencyPairAccountSwitcherResponse(currency_pair_id, trade_bar, buy, sell_dollars, sell_units, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCurrencyPairAccountSwitcherResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCurrencyPairAccountSwitcherResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCurrencyPairAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                if (value.getTrade_bar() != null) {
                    size += GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodedSizeWithTag(2, value.getTrade_bar());
                }
                if (value.getBuy() != null) {
                    size += GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodedSizeWithTag(3, value.getBuy());
                }
                if (value.getSell_dollars() != null) {
                    size += GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodedSizeWithTag(4, value.getSell_dollars());
                }
                return value.getSell_units() != null ? size + GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodedSizeWithTag(5, value.getSell_units()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCurrencyPairAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                if (value.getTrade_bar() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade_bar());
                }
                if (value.getBuy() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuy());
                }
                if (value.getSell_dollars() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 4, (int) value.getSell_dollars());
                }
                if (value.getSell_units() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 5, (int) value.getSell_units());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCurrencyPairAccountSwitcherResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSell_units() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 5, (int) value.getSell_units());
                }
                if (value.getSell_dollars() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 4, (int) value.getSell_dollars());
                }
                if (value.getBuy() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuy());
                }
                if (value.getTrade_bar() != null) {
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade_bar());
                }
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCurrencyPairAccountSwitcherResponse redact(GetCurrencyPairAccountSwitcherResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher trade_bar = value.getTrade_bar();
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherRedact = trade_bar != null ? GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.redact(trade_bar) : null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher buy = value.getBuy();
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherRedact2 = buy != null ? GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.redact(buy) : null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher sell_dollars = value.getSell_dollars();
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherRedact3 = sell_dollars != null ? GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.redact(sell_dollars) : null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher sell_units = value.getSell_units();
                return GetCurrencyPairAccountSwitcherResponse.copy$default(value, null, currencyPairAccountSwitcherRedact, currencyPairAccountSwitcherRedact2, currencyPairAccountSwitcherRedact3, sell_units != null ? GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.redact(sell_units) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCurrencyPairAccountSwitcherResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherDecode = null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherDecode2 = null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherDecode3 = null;
                GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher currencyPairAccountSwitcherDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCurrencyPairAccountSwitcherResponse(strDecode, currencyPairAccountSwitcherDecode, currencyPairAccountSwitcherDecode2, currencyPairAccountSwitcherDecode3, currencyPairAccountSwitcherDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        currencyPairAccountSwitcherDecode = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        currencyPairAccountSwitcherDecode2 = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        currencyPairAccountSwitcherDecode3 = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        currencyPairAccountSwitcherDecode4 = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyPairAccountSwitcherType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyPairAccountSwitcherType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CurrencyPairAccountSwitcherType> ADAPTER;
        public static final CurrencyPairAccountSwitcherType CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY;
        public static final CurrencyPairAccountSwitcherType CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS;
        public static final CurrencyPairAccountSwitcherType CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS;
        public static final CurrencyPairAccountSwitcherType CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR;
        public static final CurrencyPairAccountSwitcherType CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ CurrencyPairAccountSwitcherType[] $values() {
            return new CurrencyPairAccountSwitcherType[]{CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS};
        }

        @JvmStatic
        public static final CurrencyPairAccountSwitcherType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CurrencyPairAccountSwitcherType> getEntries() {
            return $ENTRIES;
        }

        private CurrencyPairAccountSwitcherType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CurrencyPairAccountSwitcherType currencyPairAccountSwitcherType = new CurrencyPairAccountSwitcherType("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", 0, 0);
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED = currencyPairAccountSwitcherType;
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR = new CurrencyPairAccountSwitcherType("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR", 1, 1);
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY = new CurrencyPairAccountSwitcherType("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY", 2, 2);
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS = new CurrencyPairAccountSwitcherType("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS", 3, 3);
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS = new CurrencyPairAccountSwitcherType("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS", 4, 4);
            CurrencyPairAccountSwitcherType[] currencyPairAccountSwitcherTypeArr$values = $values();
            $VALUES = currencyPairAccountSwitcherTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyPairAccountSwitcherTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairAccountSwitcherType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CurrencyPairAccountSwitcherType>(orCreateKotlinClass, syntax, currencyPairAccountSwitcherType) { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType fromValue(int value) {
                    return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "fromValue", "value", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CurrencyPairAccountSwitcherType fromValue(int value) {
                if (value == 0) {
                    return CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR;
                }
                if (value == 2) {
                    return CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY;
                }
                if (value == 3) {
                    return CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS;
                }
                if (value != 4) {
                    return null;
                }
                return CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS;
            }
        }

        public static CurrencyPairAccountSwitcherType valueOf(String str) {
            return (CurrencyPairAccountSwitcherType) Enum.valueOf(CurrencyPairAccountSwitcherType.class, str);
        }

        public static CurrencyPairAccountSwitcherType[] values() {
            return (CurrencyPairAccountSwitcherType[]) $VALUES.clone();
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0089\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u008f\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010#R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010#R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b+\u0010#R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b\r\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\"\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "Lcom/squareup/wire/Message;", "", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/Icon;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountType;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementType;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lj$/time/Instant;Lokio/ByteString;)Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "Ljava/lang/String;", "getRhf_account_number", "getRhs_account_number", "getCrypto_account_id", "getEntry_title", "getTitle", "getSubtitle", "Lrh_server_driven_ui/v1/Icon;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "Z", "()Z", "Lrosetta/account/BrokerageAccountType;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "Lrosetta/account/ManagementType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyPairAccountSwitcherAccount extends Message {

        @JvmField
        public static final ProtoAdapter<CurrencyPairAccountSwitcherAccount> ADAPTER;

        @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final BrokerageAccountType brokerage_account_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
        private final Instant created_at;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        private final String crypto_account_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String entry_title;

        @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final boolean is_selectable;

        @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final ManagementType management_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String rhf_account_number;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String rhs_account_number;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String title;

        public CurrencyPairAccountSwitcherAccount() {
            this(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null);
        }

        public /* synthetic */ CurrencyPairAccountSwitcherAccount(String str, String str2, String str3, String str4, String str5, String str6, Icon icon, boolean z, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 512) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 1024) == 0 ? instant : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8945newBuilder();
        }

        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getCrypto_account_id() {
            return this.crypto_account_id;
        }

        public final String getEntry_title() {
            return this.entry_title;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: is_selectable, reason: from getter */
        public final boolean getIs_selectable() {
            return this.is_selectable;
        }

        public final BrokerageAccountType getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ManagementType getManagement_type() {
            return this.management_type;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyPairAccountSwitcherAccount(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, Icon icon, boolean z, BrokerageAccountType brokerage_account_type, ManagementType management_type, Instant instant, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.rhf_account_number = rhf_account_number;
            this.rhs_account_number = rhs_account_number;
            this.crypto_account_id = str;
            this.entry_title = entry_title;
            this.title = title;
            this.subtitle = subtitle;
            this.icon = icon;
            this.is_selectable = z;
            this.brokerage_account_type = brokerage_account_type;
            this.management_type = management_type;
            this.created_at = instant;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8945newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CurrencyPairAccountSwitcherAccount)) {
                return false;
            }
            CurrencyPairAccountSwitcherAccount currencyPairAccountSwitcherAccount = (CurrencyPairAccountSwitcherAccount) other;
            return Intrinsics.areEqual(unknownFields(), currencyPairAccountSwitcherAccount.unknownFields()) && Intrinsics.areEqual(this.rhf_account_number, currencyPairAccountSwitcherAccount.rhf_account_number) && Intrinsics.areEqual(this.rhs_account_number, currencyPairAccountSwitcherAccount.rhs_account_number) && Intrinsics.areEqual(this.crypto_account_id, currencyPairAccountSwitcherAccount.crypto_account_id) && Intrinsics.areEqual(this.entry_title, currencyPairAccountSwitcherAccount.entry_title) && Intrinsics.areEqual(this.title, currencyPairAccountSwitcherAccount.title) && Intrinsics.areEqual(this.subtitle, currencyPairAccountSwitcherAccount.subtitle) && this.icon == currencyPairAccountSwitcherAccount.icon && this.is_selectable == currencyPairAccountSwitcherAccount.is_selectable && this.brokerage_account_type == currencyPairAccountSwitcherAccount.brokerage_account_type && this.management_type == currencyPairAccountSwitcherAccount.management_type && Intrinsics.areEqual(this.created_at, currencyPairAccountSwitcherAccount.created_at);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.rhf_account_number.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37;
            String str = this.crypto_account_id;
            int iHashCode2 = (((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.entry_title.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.icon.hashCode()) * 37) + Boolean.hashCode(this.is_selectable)) * 37) + this.brokerage_account_type.hashCode()) * 37) + this.management_type.hashCode()) * 37;
            Instant instant = this.created_at;
            int iHashCode3 = iHashCode2 + (instant != null ? instant.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("rhf_account_number=" + Internal.sanitize(this.rhf_account_number));
            arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
            String str = this.crypto_account_id;
            if (str != null) {
                arrayList.add("crypto_account_id=" + Internal.sanitize(str));
            }
            arrayList.add("entry_title=" + Internal.sanitize(this.entry_title));
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
            arrayList.add("icon=" + this.icon);
            arrayList.add("is_selectable=" + this.is_selectable);
            arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
            arrayList.add("management_type=" + this.management_type);
            Instant instant = this.created_at;
            if (instant != null) {
                arrayList.add("created_at=" + instant);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyPairAccountSwitcherAccount{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CurrencyPairAccountSwitcherAccount copy$default(CurrencyPairAccountSwitcherAccount currencyPairAccountSwitcherAccount, String str, String str2, String str3, String str4, String str5, String str6, Icon icon, boolean z, BrokerageAccountType brokerageAccountType, ManagementType managementType, Instant instant, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyPairAccountSwitcherAccount.rhf_account_number;
            }
            if ((i & 2) != 0) {
                str2 = currencyPairAccountSwitcherAccount.rhs_account_number;
            }
            if ((i & 4) != 0) {
                str3 = currencyPairAccountSwitcherAccount.crypto_account_id;
            }
            if ((i & 8) != 0) {
                str4 = currencyPairAccountSwitcherAccount.entry_title;
            }
            if ((i & 16) != 0) {
                str5 = currencyPairAccountSwitcherAccount.title;
            }
            if ((i & 32) != 0) {
                str6 = currencyPairAccountSwitcherAccount.subtitle;
            }
            if ((i & 64) != 0) {
                icon = currencyPairAccountSwitcherAccount.icon;
            }
            if ((i & 128) != 0) {
                z = currencyPairAccountSwitcherAccount.is_selectable;
            }
            if ((i & 256) != 0) {
                brokerageAccountType = currencyPairAccountSwitcherAccount.brokerage_account_type;
            }
            if ((i & 512) != 0) {
                managementType = currencyPairAccountSwitcherAccount.management_type;
            }
            if ((i & 1024) != 0) {
                instant = currencyPairAccountSwitcherAccount.created_at;
            }
            if ((i & 2048) != 0) {
                byteString = currencyPairAccountSwitcherAccount.unknownFields();
            }
            Instant instant2 = instant;
            ByteString byteString2 = byteString;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            ManagementType managementType2 = managementType;
            Icon icon2 = icon;
            boolean z2 = z;
            String str7 = str5;
            String str8 = str6;
            return currencyPairAccountSwitcherAccount.copy(str, str2, str3, str4, str7, str8, icon2, z2, brokerageAccountType2, managementType2, instant2, byteString2);
        }

        public final CurrencyPairAccountSwitcherAccount copy(String rhf_account_number, String rhs_account_number, String crypto_account_id, String entry_title, String title, String subtitle, Icon icon, boolean is_selectable, BrokerageAccountType brokerage_account_type, ManagementType management_type, Instant created_at, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CurrencyPairAccountSwitcherAccount(rhf_account_number, rhs_account_number, crypto_account_id, entry_title, title, subtitle, icon, is_selectable, brokerage_account_type, management_type, created_at, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairAccountSwitcherAccount.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CurrencyPairAccountSwitcherAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhf_account_number());
                    }
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRhs_account_number());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getEntry_title());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getSubtitle());
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        iEncodedSizeWithTag += Icon.ADAPTER.encodedSizeWithTag(7, value.getIcon());
                    }
                    if (value.getIs_selectable()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        iEncodedSizeWithTag += BrokerageAccountType.ADAPTER.encodedSizeWithTag(9, value.getBrokerage_account_type());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        iEncodedSizeWithTag += ManagementType.ADAPTER.encodedSizeWithTag(10, value.getManagement_type());
                    }
                    return value.getCreated_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCreated_at()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhf_account_number());
                    }
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getEntry_title());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        protoAdapter.encodeWithTag(writer, 6, (int) value.getSubtitle());
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getIcon());
                    }
                    if (value.getIs_selectable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        BrokerageAccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getBrokerage_account_type());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        ManagementType.ADAPTER.encodeWithTag(writer, 10, (int) value.getManagement_type());
                    }
                    if (value.getCreated_at() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getCreated_at() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                    }
                    if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                        ManagementType.ADAPTER.encodeWithTag(writer, 10, (int) value.getManagement_type());
                    }
                    if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                        BrokerageAccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getBrokerage_account_type());
                    }
                    if (value.getIs_selectable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_selectable()));
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 7, (int) value.getIcon());
                    }
                    if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSubtitle());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getEntry_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEntry_title());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCrypto_account_id());
                    if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                    }
                    if (Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getRhf_account_number());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount decode(ProtoReader reader) throws IOException {
                    Icon icon;
                    BrokerageAccountType brokerageAccountType;
                    ManagementType managementType;
                    String str;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Icon icon2 = Icon.ICON_UNSPECIFIED;
                    BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                    ManagementType managementType2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    String strDecode4 = null;
                    Instant instantDecode = null;
                    boolean zBooleanValue = false;
                    ManagementType managementTypeDecode = managementType2;
                    String strDecode5 = strDecode3;
                    String strDecode6 = strDecode5;
                    BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType2;
                    Icon iconDecode = icon2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 3:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 4:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 5:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 6:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 7:
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    managementType = managementTypeDecode;
                                    str = strDecode5;
                                    try {
                                        iconDecode = Icon.ADAPTER.decode(reader);
                                        strDecode5 = str;
                                        managementTypeDecode = managementType;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 8:
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                case 9:
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    try {
                                        brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                        iconDecode = icon;
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        managementType = managementTypeDecode;
                                        str = strDecode5;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 10:
                                    try {
                                        managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        icon = iconDecode;
                                        brokerageAccountType = brokerageAccountTypeDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 11:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    icon = iconDecode;
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    managementType = managementTypeDecode;
                                    str = strDecode5;
                                    strDecode5 = str;
                                    managementTypeDecode = managementType;
                                    iconDecode = icon;
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                            }
                        } else {
                            return new GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount(strDecode5, strDecode6, strDecode4, strDecode, strDecode2, strDecode3, iconDecode, zBooleanValue, brokerageAccountTypeDecode, managementTypeDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount redact(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant created_at = value.getCreated_at();
                    return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.copy$default(value, null, null, null, null, null, null, null, false, null, null, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, 1023, null);
                }
            };
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponse.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "type", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "title", "accounts", "", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "positive_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "getTitle", "getPositive_button_text", "getAccounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyPairAccountSwitcher extends Message {

        @JvmField
        public static final ProtoAdapter<CurrencyPairAccountSwitcher> ADAPTER;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        private final List<CurrencyPairAccountSwitcherAccount> accounts;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String currency_pair_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String positive_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final CurrencyPairAccountSwitcherType type;

        public CurrencyPairAccountSwitcher() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ CurrencyPairAccountSwitcher(String str, CurrencyPairAccountSwitcherType currencyPairAccountSwitcherType, String str2, List list, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED : currencyPairAccountSwitcherType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8944newBuilder();
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final CurrencyPairAccountSwitcherType getType() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPositive_button_text() {
            return this.positive_button_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyPairAccountSwitcher(String currency_pair_id, CurrencyPairAccountSwitcherType type2, String title, List<CurrencyPairAccountSwitcherAccount> accounts2, String positive_button_text, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.currency_pair_id = currency_pair_id;
            this.type = type2;
            this.title = title;
            this.positive_button_text = positive_button_text;
            this.accounts = Internal.immutableCopyOf("accounts", accounts2);
        }

        public final List<CurrencyPairAccountSwitcherAccount> getAccounts() {
            return this.accounts;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8944newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CurrencyPairAccountSwitcher)) {
                return false;
            }
            CurrencyPairAccountSwitcher currencyPairAccountSwitcher = (CurrencyPairAccountSwitcher) other;
            return Intrinsics.areEqual(unknownFields(), currencyPairAccountSwitcher.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, currencyPairAccountSwitcher.currency_pair_id) && this.type == currencyPairAccountSwitcher.type && Intrinsics.areEqual(this.title, currencyPairAccountSwitcher.title) && Intrinsics.areEqual(this.accounts, currencyPairAccountSwitcher.accounts) && Intrinsics.areEqual(this.positive_button_text, currencyPairAccountSwitcher.positive_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.title.hashCode()) * 37) + this.accounts.hashCode()) * 37) + this.positive_button_text.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
            arrayList.add("type=" + this.type);
            arrayList.add("title=" + Internal.sanitize(this.title));
            if (!this.accounts.isEmpty()) {
                arrayList.add("accounts=" + this.accounts);
            }
            arrayList.add("positive_button_text=" + Internal.sanitize(this.positive_button_text));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyPairAccountSwitcher{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CurrencyPairAccountSwitcher copy$default(CurrencyPairAccountSwitcher currencyPairAccountSwitcher, String str, CurrencyPairAccountSwitcherType currencyPairAccountSwitcherType, String str2, List list, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyPairAccountSwitcher.currency_pair_id;
            }
            if ((i & 2) != 0) {
                currencyPairAccountSwitcherType = currencyPairAccountSwitcher.type;
            }
            if ((i & 4) != 0) {
                str2 = currencyPairAccountSwitcher.title;
            }
            if ((i & 8) != 0) {
                list = currencyPairAccountSwitcher.accounts;
            }
            if ((i & 16) != 0) {
                str3 = currencyPairAccountSwitcher.positive_button_text;
            }
            if ((i & 32) != 0) {
                byteString = currencyPairAccountSwitcher.unknownFields();
            }
            String str4 = str3;
            ByteString byteString2 = byteString;
            return currencyPairAccountSwitcher.copy(str, currencyPairAccountSwitcherType, str2, list, str4, byteString2);
        }

        public final CurrencyPairAccountSwitcher copy(String currency_pair_id, CurrencyPairAccountSwitcherType type2, String title, List<CurrencyPairAccountSwitcherAccount> accounts2, String positive_button_text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CurrencyPairAccountSwitcher(currency_pair_id, type2, title, accounts2, positive_button_text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairAccountSwitcher.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CurrencyPairAccountSwitcher>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                    }
                    if (value.getType() != GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        size += GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.ADAPTER.encodedSizeWithTag(2, value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    int iEncodedSizeWithTag = size + GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAccounts());
                    return !Intrinsics.areEqual(value.getPositive_button_text(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPositive_button_text()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                    }
                    if (value.getType() != GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccounts());
                    if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPositive_button_text());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getPositive_button_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPositive_button_text());
                    }
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAccounts());
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (value.getType() != GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED) {
                        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType currencyPairAccountSwitcherTypeDecode = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    while (true) {
                        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType currencyPairAccountSwitcherType = currencyPairAccountSwitcherTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher(strDecode, currencyPairAccountSwitcherType, strDecode2, arrayList, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    currencyPairAccountSwitcherTypeDecode = GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                arrayList.add(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER.decode(reader));
                            } else if (iNextTag == 5) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher redact(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.copy$default(value, null, null, null, Internal.m26823redactElements(value.getAccounts(), GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER), null, ByteString.EMPTY, 23, null);
                }
            };
        }
    }
}
