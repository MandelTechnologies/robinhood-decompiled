package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: StartChartApp.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/StartChartApp;", "Lcom/squareup/wire/Message;", "", "instrument_context", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "account", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;Lokio/ByteString;)V", "getInstrument_context", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "getAccount", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class StartChartApp extends Message {

    @JvmField
    public static final ProtoAdapter<StartChartApp> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.TradingAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TradingAccount account;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrument#ADAPTER", jsonName = "instrumentContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SetChartInstrument instrument_context;

    public StartChartApp() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8670newBuilder();
    }

    public final SetChartInstrument getInstrument_context() {
        return this.instrument_context;
    }

    public final TradingAccount getAccount() {
        return this.account;
    }

    public /* synthetic */ StartChartApp(SetChartInstrument setChartInstrument, TradingAccount tradingAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : setChartInstrument, (i & 2) != 0 ? null : tradingAccount, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartChartApp(SetChartInstrument setChartInstrument, TradingAccount tradingAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_context = setChartInstrument;
        this.account = tradingAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8670newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StartChartApp)) {
            return false;
        }
        StartChartApp startChartApp = (StartChartApp) other;
        return Intrinsics.areEqual(unknownFields(), startChartApp.unknownFields()) && Intrinsics.areEqual(this.instrument_context, startChartApp.instrument_context) && Intrinsics.areEqual(this.account, startChartApp.account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SetChartInstrument setChartInstrument = this.instrument_context;
        int iHashCode2 = (iHashCode + (setChartInstrument != null ? setChartInstrument.hashCode() : 0)) * 37;
        TradingAccount tradingAccount = this.account;
        int iHashCode3 = iHashCode2 + (tradingAccount != null ? tradingAccount.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SetChartInstrument setChartInstrument = this.instrument_context;
        if (setChartInstrument != null) {
            arrayList.add("instrument_context=" + setChartInstrument);
        }
        TradingAccount tradingAccount = this.account;
        if (tradingAccount != null) {
            arrayList.add("account=" + tradingAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartChartApp{", "}", 0, null, null, 56, null);
    }

    public final StartChartApp copy(SetChartInstrument instrument_context, TradingAccount account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StartChartApp(instrument_context, account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StartChartApp.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StartChartApp>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.StartChartApp$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StartChartApp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInstrument_context() != null) {
                    size += SetChartInstrument.ADAPTER.encodedSizeWithTag(1, value.getInstrument_context());
                }
                return value.getAccount() != null ? size + TradingAccount.ADAPTER.encodedSizeWithTag(2, value.getAccount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StartChartApp value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInstrument_context() != null) {
                    SetChartInstrument.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstrument_context());
                }
                if (value.getAccount() != null) {
                    TradingAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StartChartApp value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount() != null) {
                    TradingAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (value.getInstrument_context() != null) {
                    SetChartInstrument.ADAPTER.encodeWithTag(writer, 1, (int) value.getInstrument_context());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StartChartApp redact(StartChartApp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SetChartInstrument instrument_context = value.getInstrument_context();
                SetChartInstrument setChartInstrumentRedact = instrument_context != null ? SetChartInstrument.ADAPTER.redact(instrument_context) : null;
                TradingAccount account = value.getAccount();
                return value.copy(setChartInstrumentRedact, account != null ? TradingAccount.ADAPTER.redact(account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StartChartApp decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SetChartInstrument setChartInstrumentDecode = null;
                TradingAccount tradingAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StartChartApp(setChartInstrumentDecode, tradingAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        setChartInstrumentDecode = SetChartInstrument.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        tradingAccountDecode = TradingAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
