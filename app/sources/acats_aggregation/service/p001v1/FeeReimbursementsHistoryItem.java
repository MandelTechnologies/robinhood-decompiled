package acats_aggregation.service.p001v1;

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
import p479j$.time.Instant;

/* compiled from: FeeReimbursementsHistoryItem.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\u001bR\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItem;", "Lcom/squareup/wire/Message;", "", "", "id", "account_number", "", "amount", "title", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "completion_date", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lacats_aggregation/service/v1/FeeReimbursementsHistoryItem;", "Ljava/lang/String;", "getId", "getAccount_number", "D", "getAmount", "()D", "getTitle", "Lj$/time/Instant;", "getCompletion_date", "()Lj$/time/Instant;", "Companion", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FeeReimbursementsHistoryItem extends Message {

    @JvmField
    public static final ProtoAdapter<FeeReimbursementsHistoryItem> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "completionDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant completion_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    public FeeReimbursementsHistoryItem() {
        this(null, null, 0.0d, null, null, null, 63, null);
    }

    public /* synthetic */ FeeReimbursementsHistoryItem(String str, String str2, double d, String str3, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4314newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Instant getCompletion_date() {
        return this.completion_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeReimbursementsHistoryItem(String id, String account_number, double d, String title, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.amount = d;
        this.title = title;
        this.completion_date = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4314newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeReimbursementsHistoryItem)) {
            return false;
        }
        FeeReimbursementsHistoryItem feeReimbursementsHistoryItem = (FeeReimbursementsHistoryItem) other;
        return Intrinsics.areEqual(unknownFields(), feeReimbursementsHistoryItem.unknownFields()) && Intrinsics.areEqual(this.id, feeReimbursementsHistoryItem.id) && Intrinsics.areEqual(this.account_number, feeReimbursementsHistoryItem.account_number) && this.amount == feeReimbursementsHistoryItem.amount && Intrinsics.areEqual(this.title, feeReimbursementsHistoryItem.title) && Intrinsics.areEqual(this.completion_date, feeReimbursementsHistoryItem.completion_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + this.title.hashCode()) * 37;
        Instant instant = this.completion_date;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("amount=" + this.amount);
        arrayList.add("title=" + Internal.sanitize(this.title));
        Instant instant = this.completion_date;
        if (instant != null) {
            arrayList.add("completion_date=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeReimbursementsHistoryItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeReimbursementsHistoryItem copy$default(FeeReimbursementsHistoryItem feeReimbursementsHistoryItem, String str, String str2, double d, String str3, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeReimbursementsHistoryItem.id;
        }
        if ((i & 2) != 0) {
            str2 = feeReimbursementsHistoryItem.account_number;
        }
        if ((i & 4) != 0) {
            d = feeReimbursementsHistoryItem.amount;
        }
        if ((i & 8) != 0) {
            str3 = feeReimbursementsHistoryItem.title;
        }
        if ((i & 16) != 0) {
            instant = feeReimbursementsHistoryItem.completion_date;
        }
        if ((i & 32) != 0) {
            byteString = feeReimbursementsHistoryItem.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        double d2 = d;
        return feeReimbursementsHistoryItem.copy(str, str2, d2, str4, instant, byteString2);
    }

    public final FeeReimbursementsHistoryItem copy(String id, String account_number, double amount, String title, Instant completion_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeReimbursementsHistoryItem(id, account_number, amount, title, completion_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeReimbursementsHistoryItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeReimbursementsHistoryItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: acats_aggregation.service.v1.FeeReimbursementsHistoryItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeReimbursementsHistoryItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTitle());
                }
                return value.getCompletion_date() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getCompletion_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeReimbursementsHistoryItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (value.getCompletion_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getCompletion_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeReimbursementsHistoryItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCompletion_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getCompletion_date());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeReimbursementsHistoryItem redact(FeeReimbursementsHistoryItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant completion_date = value.getCompletion_date();
                return FeeReimbursementsHistoryItem.copy$default(value, null, null, 0.0d, null, completion_date != null ? ProtoAdapter.INSTANT.redact(completion_date) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeReimbursementsHistoryItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                double dDoubleValue = 0.0d;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeReimbursementsHistoryItem(strDecode, strDecode2, dDoubleValue, strDecode3, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
