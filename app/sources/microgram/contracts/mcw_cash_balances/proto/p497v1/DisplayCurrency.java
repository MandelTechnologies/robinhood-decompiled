package microgram.contracts.mcw_cash_balances.proto.p497v1;

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

/* compiled from: DisplayCurrency.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/DisplayCurrency;", "Lcom/squareup/wire/Message;", "", "title", "", "money", "Lcom/robinhood/rosetta/common/Money;", "sweep_interest_rate_display_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getMoney", "()Lcom/robinhood/rosetta/common/Money;", "getSweep_interest_rate_display_label", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DisplayCurrency extends Message {

    @JvmField
    public static final ProtoAdapter<DisplayCurrency> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money money;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sweepInterestRateDisplayLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String sweep_interest_rate_display_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public DisplayCurrency() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DisplayCurrency(String str, Money money, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29153newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getSweep_interest_rate_display_label() {
        return this.sweep_interest_rate_display_label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayCurrency(String title, Money money, String sweep_interest_rate_display_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sweep_interest_rate_display_label, "sweep_interest_rate_display_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.money = money;
        this.sweep_interest_rate_display_label = sweep_interest_rate_display_label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29153newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisplayCurrency)) {
            return false;
        }
        DisplayCurrency displayCurrency = (DisplayCurrency) other;
        return Intrinsics.areEqual(unknownFields(), displayCurrency.unknownFields()) && Intrinsics.areEqual(this.title, displayCurrency.title) && Intrinsics.areEqual(this.money, displayCurrency.money) && Intrinsics.areEqual(this.sweep_interest_rate_display_label, displayCurrency.sweep_interest_rate_display_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        Money money = this.money;
        int iHashCode2 = ((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.sweep_interest_rate_display_label.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        Money money = this.money;
        if (money != null) {
            arrayList.add("money=" + money);
        }
        arrayList.add("sweep_interest_rate_display_label=" + Internal.sanitize(this.sweep_interest_rate_display_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayCurrency{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisplayCurrency copy$default(DisplayCurrency displayCurrency, String str, Money money, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayCurrency.title;
        }
        if ((i & 2) != 0) {
            money = displayCurrency.money;
        }
        if ((i & 4) != 0) {
            str2 = displayCurrency.sweep_interest_rate_display_label;
        }
        if ((i & 8) != 0) {
            byteString = displayCurrency.unknownFields();
        }
        return displayCurrency.copy(str, money, str2, byteString);
    }

    public final DisplayCurrency copy(String title, Money money, String sweep_interest_rate_display_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sweep_interest_rate_display_label, "sweep_interest_rate_display_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisplayCurrency(title, money, sweep_interest_rate_display_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplayCurrency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisplayCurrency>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_cash_balances.proto.v1.DisplayCurrency$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisplayCurrency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (value.getMoney() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMoney());
                }
                return !Intrinsics.areEqual(value.getSweep_interest_rate_display_label(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSweep_interest_rate_display_label()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisplayCurrency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getMoney() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMoney());
                }
                if (!Intrinsics.areEqual(value.getSweep_interest_rate_display_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSweep_interest_rate_display_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisplayCurrency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSweep_interest_rate_display_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSweep_interest_rate_display_label());
                }
                if (value.getMoney() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMoney());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayCurrency redact(DisplayCurrency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money money = value.getMoney();
                return DisplayCurrency.copy$default(value, null, money != null ? Money.ADAPTER.redact(money) : null, null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayCurrency decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DisplayCurrency(strDecode, moneyDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
