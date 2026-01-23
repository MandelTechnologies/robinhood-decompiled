package wormhole.service.p554v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetRealizedPerformanceSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006 "}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponse;", "Lcom/squareup/wire/Message;", "", "has_closed_pnl", "", "ytd_gain_loss", "Lcom/robinhood/rosetta/common/Money;", "past_month_gain_loss", "instrument_id", "", "account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getHas_closed_pnl", "()Z", "getYtd_gain_loss", "()Lcom/robinhood/rosetta/common/Money;", "getPast_month_gain_loss", "getInstrument_id", "()Ljava/lang/String;", "getAccount_number", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedPerformanceSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedPerformanceSummaryResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasClosedPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean has_closed_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "pastMonthGainLoss", schemaIndex = 2, tag = 3)
    private final Money past_month_gain_loss;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "ytdGainLoss", schemaIndex = 1, tag = 2)
    private final Money ytd_gain_loss;

    public GetRealizedPerformanceSummaryResponse() {
        this(false, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetRealizedPerformanceSummaryResponse(boolean z, Money money, Money money2, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30066newBuilder();
    }

    public final boolean getHas_closed_pnl() {
        return this.has_closed_pnl;
    }

    public final Money getYtd_gain_loss() {
        return this.ytd_gain_loss;
    }

    public final Money getPast_month_gain_loss() {
        return this.past_month_gain_loss;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedPerformanceSummaryResponse(boolean z, Money money, Money money2, String instrument_id, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_closed_pnl = z;
        this.ytd_gain_loss = money;
        this.past_month_gain_loss = money2;
        this.instrument_id = instrument_id;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30066newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedPerformanceSummaryResponse)) {
            return false;
        }
        GetRealizedPerformanceSummaryResponse getRealizedPerformanceSummaryResponse = (GetRealizedPerformanceSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedPerformanceSummaryResponse.unknownFields()) && this.has_closed_pnl == getRealizedPerformanceSummaryResponse.has_closed_pnl && Intrinsics.areEqual(this.ytd_gain_loss, getRealizedPerformanceSummaryResponse.ytd_gain_loss) && Intrinsics.areEqual(this.past_month_gain_loss, getRealizedPerformanceSummaryResponse.past_month_gain_loss) && Intrinsics.areEqual(this.instrument_id, getRealizedPerformanceSummaryResponse.instrument_id) && Intrinsics.areEqual(this.account_number, getRealizedPerformanceSummaryResponse.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.has_closed_pnl)) * 37;
        Money money = this.ytd_gain_loss;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.past_month_gain_loss;
        int iHashCode3 = ((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.instrument_id.hashCode()) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_closed_pnl=" + this.has_closed_pnl);
        Money money = this.ytd_gain_loss;
        if (money != null) {
            arrayList.add("ytd_gain_loss=" + money);
        }
        Money money2 = this.past_month_gain_loss;
        if (money2 != null) {
            arrayList.add("past_month_gain_loss=" + money2);
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedPerformanceSummaryResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRealizedPerformanceSummaryResponse copy$default(GetRealizedPerformanceSummaryResponse getRealizedPerformanceSummaryResponse, boolean z, Money money, Money money2, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getRealizedPerformanceSummaryResponse.has_closed_pnl;
        }
        if ((i & 2) != 0) {
            money = getRealizedPerformanceSummaryResponse.ytd_gain_loss;
        }
        if ((i & 4) != 0) {
            money2 = getRealizedPerformanceSummaryResponse.past_month_gain_loss;
        }
        if ((i & 8) != 0) {
            str = getRealizedPerformanceSummaryResponse.instrument_id;
        }
        if ((i & 16) != 0) {
            str2 = getRealizedPerformanceSummaryResponse.account_number;
        }
        if ((i & 32) != 0) {
            byteString = getRealizedPerformanceSummaryResponse.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return getRealizedPerformanceSummaryResponse.copy(z, money, money2, str, str3, byteString2);
    }

    public final GetRealizedPerformanceSummaryResponse copy(boolean has_closed_pnl, Money ytd_gain_loss, Money past_month_gain_loss, String instrument_id, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedPerformanceSummaryResponse(has_closed_pnl, ytd_gain_loss, past_month_gain_loss, instrument_id, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedPerformanceSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedPerformanceSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedPerformanceSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedPerformanceSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHas_closed_pnl()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getHas_closed_pnl()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getYtd_gain_loss()) + protoAdapter.encodedSizeWithTag(3, value.getPast_month_gain_loss());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInstrument_id());
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAccount_number()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedPerformanceSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHas_closed_pnl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getHas_closed_pnl()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getYtd_gain_loss());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPast_month_gain_loss());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedPerformanceSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPast_month_gain_loss());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getYtd_gain_loss());
                if (value.getHas_closed_pnl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getHas_closed_pnl()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryResponse redact(GetRealizedPerformanceSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money ytd_gain_loss = value.getYtd_gain_loss();
                Money moneyRedact = ytd_gain_loss != null ? Money.ADAPTER.redact(ytd_gain_loss) : null;
                Money past_month_gain_loss = value.getPast_month_gain_loss();
                return GetRealizedPerformanceSummaryResponse.copy$default(value, false, moneyRedact, past_month_gain_loss != null ? Money.ADAPTER.redact(past_month_gain_loss) : null, null, null, ByteString.EMPTY, 25, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                Money moneyDecode2 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedPerformanceSummaryResponse(zBooleanValue, moneyDecode, moneyDecode2, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
