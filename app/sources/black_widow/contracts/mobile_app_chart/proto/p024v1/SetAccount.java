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

/* compiled from: SetAccount.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAccount;", "Lcom/squareup/wire/Message;", "", "account", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;Lokio/ByteString;)V", "getAccount", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TradingAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetAccount extends Message {

    @JvmField
    public static final ProtoAdapter<SetAccount> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.TradingAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TradingAccount account;

    /* JADX WARN: Multi-variable type inference failed */
    public SetAccount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8645newBuilder();
    }

    public final TradingAccount getAccount() {
        return this.account;
    }

    public /* synthetic */ SetAccount(TradingAccount tradingAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tradingAccount, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAccount(TradingAccount tradingAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account = tradingAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8645newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetAccount)) {
            return false;
        }
        SetAccount setAccount = (SetAccount) other;
        return Intrinsics.areEqual(unknownFields(), setAccount.unknownFields()) && Intrinsics.areEqual(this.account, setAccount.account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TradingAccount tradingAccount = this.account;
        int iHashCode2 = iHashCode + (tradingAccount != null ? tradingAccount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TradingAccount tradingAccount = this.account;
        if (tradingAccount != null) {
            arrayList.add("account=" + tradingAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAccount{", "}", 0, null, null, 56, null);
    }

    public final SetAccount copy(TradingAccount account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetAccount(account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAccount() != null ? size + TradingAccount.ADAPTER.encodedSizeWithTag(1, value.getAccount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount() != null) {
                    TradingAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount() != null) {
                    TradingAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetAccount redact(SetAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TradingAccount account = value.getAccount();
                return value.copy(account != null ? TradingAccount.ADAPTER.redact(account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetAccount decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TradingAccount tradingAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetAccount(tradingAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        tradingAccountDecode = TradingAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
