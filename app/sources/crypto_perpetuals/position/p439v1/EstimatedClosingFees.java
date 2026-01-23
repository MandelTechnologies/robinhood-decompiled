package crypto_perpetuals.position.p439v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.Money;
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

/* compiled from: EstimatedClosingFees.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/EstimatedClosingFees;", "Lcom/squareup/wire/Message;", "", "total_fee", "Lcrypto_perpetuals/common/v1/Money;", "robinhood_fee", "venue_fee", "summary_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Lokio/ByteString;)V", "getTotal_fee", "()Lcrypto_perpetuals/common/v1/Money;", "getRobinhood_fee", "getVenue_fee", "getSummary_text", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EstimatedClosingFees extends Message {

    @JvmField
    public static final ProtoAdapter<EstimatedClosingFees> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "robinhoodFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money robinhood_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "summaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String summary_text;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "totalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money total_fee;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "venueFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money venue_fee;

    public EstimatedClosingFees() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27856newBuilder();
    }

    public final Money getTotal_fee() {
        return this.total_fee;
    }

    public final Money getRobinhood_fee() {
        return this.robinhood_fee;
    }

    public final Money getVenue_fee() {
        return this.venue_fee;
    }

    public final String getSummary_text() {
        return this.summary_text;
    }

    public /* synthetic */ EstimatedClosingFees(Money money, Money money2, Money money3, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstimatedClosingFees(Money money, Money money2, Money money3, String summary_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(summary_text, "summary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_fee = money;
        this.robinhood_fee = money2;
        this.venue_fee = money3;
        this.summary_text = summary_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27856newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EstimatedClosingFees)) {
            return false;
        }
        EstimatedClosingFees estimatedClosingFees = (EstimatedClosingFees) other;
        return Intrinsics.areEqual(unknownFields(), estimatedClosingFees.unknownFields()) && Intrinsics.areEqual(this.total_fee, estimatedClosingFees.total_fee) && Intrinsics.areEqual(this.robinhood_fee, estimatedClosingFees.robinhood_fee) && Intrinsics.areEqual(this.venue_fee, estimatedClosingFees.venue_fee) && Intrinsics.areEqual(this.summary_text, estimatedClosingFees.summary_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.total_fee;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.robinhood_fee;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.venue_fee;
        int iHashCode4 = ((iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.summary_text.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.total_fee;
        if (money != null) {
            arrayList.add("total_fee=" + money);
        }
        Money money2 = this.robinhood_fee;
        if (money2 != null) {
            arrayList.add("robinhood_fee=" + money2);
        }
        Money money3 = this.venue_fee;
        if (money3 != null) {
            arrayList.add("venue_fee=" + money3);
        }
        arrayList.add("summary_text=" + Internal.sanitize(this.summary_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedClosingFees{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EstimatedClosingFees copy$default(EstimatedClosingFees estimatedClosingFees, Money money, Money money2, Money money3, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = estimatedClosingFees.total_fee;
        }
        if ((i & 2) != 0) {
            money2 = estimatedClosingFees.robinhood_fee;
        }
        if ((i & 4) != 0) {
            money3 = estimatedClosingFees.venue_fee;
        }
        if ((i & 8) != 0) {
            str = estimatedClosingFees.summary_text;
        }
        if ((i & 16) != 0) {
            byteString = estimatedClosingFees.unknownFields();
        }
        ByteString byteString2 = byteString;
        Money money4 = money3;
        return estimatedClosingFees.copy(money, money2, money4, str, byteString2);
    }

    public final EstimatedClosingFees copy(Money total_fee, Money robinhood_fee, Money venue_fee, String summary_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(summary_text, "summary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EstimatedClosingFees(total_fee, robinhood_fee, venue_fee, summary_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedClosingFees.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EstimatedClosingFees>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.position.v1.EstimatedClosingFees$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EstimatedClosingFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTotal_fee());
                }
                if (value.getRobinhood_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getRobinhood_fee());
                }
                if (value.getVenue_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getVenue_fee());
                }
                return !Intrinsics.areEqual(value.getSummary_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSummary_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EstimatedClosingFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_fee());
                }
                if (value.getRobinhood_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fee());
                }
                if (value.getVenue_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_fee());
                }
                if (!Intrinsics.areEqual(value.getSummary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSummary_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EstimatedClosingFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSummary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSummary_text());
                }
                if (value.getVenue_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_fee());
                }
                if (value.getRobinhood_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fee());
                }
                if (value.getTotal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_fee());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EstimatedClosingFees redact(EstimatedClosingFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_fee = value.getTotal_fee();
                Money moneyRedact = total_fee != null ? Money.ADAPTER.redact(total_fee) : null;
                Money robinhood_fee = value.getRobinhood_fee();
                Money moneyRedact2 = robinhood_fee != null ? Money.ADAPTER.redact(robinhood_fee) : null;
                Money venue_fee = value.getVenue_fee();
                return EstimatedClosingFees.copy$default(value, moneyRedact, moneyRedact2, venue_fee != null ? Money.ADAPTER.redact(venue_fee) : null, null, ByteString.EMPTY, 8, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EstimatedClosingFees decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode = "";
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EstimatedClosingFees(moneyDecode, moneyDecode3, moneyDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
