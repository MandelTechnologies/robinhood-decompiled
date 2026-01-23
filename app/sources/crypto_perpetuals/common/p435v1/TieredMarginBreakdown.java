package crypto_perpetuals.common.p435v1;

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

/* compiled from: TieredMarginBreakdown.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdown;", "Lcom/squareup/wire/Message;", "", "leverage", "", "notional_size", "Lcrypto_perpetuals/common/v1/Money;", "initial_margin_rate", "margin_required", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Lokio/ByteString;)V", "getLeverage", "()Ljava/lang/String;", "getNotional_size", "()Lcrypto_perpetuals/common/v1/Money;", "getInitial_margin_rate", "getMargin_required", "getDescription", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TieredMarginBreakdown extends Message {

    @JvmField
    public static final ProtoAdapter<TieredMarginBreakdown> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initialMarginRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String initial_margin_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String leverage;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money margin_required;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "notionalSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money notional_size;

    public TieredMarginBreakdown() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ TieredMarginBreakdown(String str, Money money, String str2, Money money2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27820newBuilder();
    }

    public final String getLeverage() {
        return this.leverage;
    }

    public final Money getNotional_size() {
        return this.notional_size;
    }

    public final String getInitial_margin_rate() {
        return this.initial_margin_rate;
    }

    public final Money getMargin_required() {
        return this.margin_required;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TieredMarginBreakdown(String leverage, Money money, String initial_margin_rate, Money money2, String description, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(initial_margin_rate, "initial_margin_rate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.leverage = leverage;
        this.notional_size = money;
        this.initial_margin_rate = initial_margin_rate;
        this.margin_required = money2;
        this.description = description;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27820newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TieredMarginBreakdown)) {
            return false;
        }
        TieredMarginBreakdown tieredMarginBreakdown = (TieredMarginBreakdown) other;
        return Intrinsics.areEqual(unknownFields(), tieredMarginBreakdown.unknownFields()) && Intrinsics.areEqual(this.leverage, tieredMarginBreakdown.leverage) && Intrinsics.areEqual(this.notional_size, tieredMarginBreakdown.notional_size) && Intrinsics.areEqual(this.initial_margin_rate, tieredMarginBreakdown.initial_margin_rate) && Intrinsics.areEqual(this.margin_required, tieredMarginBreakdown.margin_required) && Intrinsics.areEqual(this.description, tieredMarginBreakdown.description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.leverage.hashCode()) * 37;
        Money money = this.notional_size;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.initial_margin_rate.hashCode()) * 37;
        Money money2 = this.margin_required;
        int iHashCode3 = ((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.description.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("leverage=" + Internal.sanitize(this.leverage));
        Money money = this.notional_size;
        if (money != null) {
            arrayList.add("notional_size=" + money);
        }
        arrayList.add("initial_margin_rate=" + Internal.sanitize(this.initial_margin_rate));
        Money money2 = this.margin_required;
        if (money2 != null) {
            arrayList.add("margin_required=" + money2);
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TieredMarginBreakdown{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TieredMarginBreakdown copy$default(TieredMarginBreakdown tieredMarginBreakdown, String str, Money money, String str2, Money money2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tieredMarginBreakdown.leverage;
        }
        if ((i & 2) != 0) {
            money = tieredMarginBreakdown.notional_size;
        }
        if ((i & 4) != 0) {
            str2 = tieredMarginBreakdown.initial_margin_rate;
        }
        if ((i & 8) != 0) {
            money2 = tieredMarginBreakdown.margin_required;
        }
        if ((i & 16) != 0) {
            str3 = tieredMarginBreakdown.description;
        }
        if ((i & 32) != 0) {
            byteString = tieredMarginBreakdown.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return tieredMarginBreakdown.copy(str, money, str2, money2, str4, byteString2);
    }

    public final TieredMarginBreakdown copy(String leverage, Money notional_size, String initial_margin_rate, Money margin_required, String description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(initial_margin_rate, "initial_margin_rate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TieredMarginBreakdown(leverage, notional_size, initial_margin_rate, margin_required, description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TieredMarginBreakdown.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TieredMarginBreakdown>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.TieredMarginBreakdown$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TieredMarginBreakdown value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLeverage());
                }
                if (value.getNotional_size() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getNotional_size());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInitial_margin_rate());
                }
                if (value.getMargin_required() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getMargin_required());
                }
                return !Intrinsics.areEqual(value.getDescription(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDescription()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TieredMarginBreakdown value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLeverage());
                }
                if (value.getNotional_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getNotional_size());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInitial_margin_rate());
                }
                if (value.getMargin_required() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_required());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TieredMarginBreakdown value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (value.getMargin_required() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_required());
                }
                if (!Intrinsics.areEqual(value.getInitial_margin_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInitial_margin_rate());
                }
                if (value.getNotional_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getNotional_size());
                }
                if (Intrinsics.areEqual(value.getLeverage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLeverage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TieredMarginBreakdown redact(TieredMarginBreakdown value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money notional_size = value.getNotional_size();
                Money moneyRedact = notional_size != null ? Money.ADAPTER.redact(notional_size) : null;
                Money margin_required = value.getMargin_required();
                return TieredMarginBreakdown.copy$default(value, null, moneyRedact, null, margin_required != null ? Money.ADAPTER.redact(margin_required) : null, null, ByteString.EMPTY, 21, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TieredMarginBreakdown decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TieredMarginBreakdown(strDecode, moneyDecode, strDecode3, moneyDecode2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
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
