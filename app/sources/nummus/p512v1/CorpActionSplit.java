package nummus.p512v1;

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
import p479j$.time.Instant;

/* compiled from: CorpActionSplit.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\u001cR\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u001c¨\u0006+"}, m3636d2 = {"Lnummus/v1/CorpActionSplit;", "Lcom/squareup/wire/Message;", "", "", "currency_id", "Lnummus/v1/SplitDirection;", "split_direction", "multiplier", "divisor", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "effective_date", "currency_pair_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lnummus/v1/SplitDirection;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lnummus/v1/SplitDirection;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lnummus/v1/CorpActionSplit;", "Ljava/lang/String;", "getCurrency_id", "Lnummus/v1/SplitDirection;", "getSplit_direction", "()Lnummus/v1/SplitDirection;", "getMultiplier", "getDivisor", "Lj$/time/Instant;", "getEffective_date", "()Lj$/time/Instant;", "getCurrency_pair_id", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CorpActionSplit extends Message {

    @JvmField
    public static final ProtoAdapter<CorpActionSplit> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String divisor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "effectiveDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant effective_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String multiplier;

    @WireField(adapter = "nummus.v1.SplitDirection#ADAPTER", jsonName = "splitDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SplitDirection split_direction;

    public CorpActionSplit() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CorpActionSplit(String str, SplitDirection splitDirection, String str2, String str3, Instant instant, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SplitDirection.SPLIT_DIRECTION_UNSPECIFIED : splitDirection, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29402newBuilder();
    }

    public final String getCurrency_id() {
        return this.currency_id;
    }

    public final SplitDirection getSplit_direction() {
        return this.split_direction;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final String getDivisor() {
        return this.divisor;
    }

    public final Instant getEffective_date() {
        return this.effective_date;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpActionSplit(String currency_id, SplitDirection split_direction, String multiplier, String divisor, Instant instant, String currency_pair_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(split_direction, "split_direction");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_id = currency_id;
        this.split_direction = split_direction;
        this.multiplier = multiplier;
        this.divisor = divisor;
        this.effective_date = instant;
        this.currency_pair_id = currency_pair_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29402newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CorpActionSplit)) {
            return false;
        }
        CorpActionSplit corpActionSplit = (CorpActionSplit) other;
        return Intrinsics.areEqual(unknownFields(), corpActionSplit.unknownFields()) && Intrinsics.areEqual(this.currency_id, corpActionSplit.currency_id) && this.split_direction == corpActionSplit.split_direction && Intrinsics.areEqual(this.multiplier, corpActionSplit.multiplier) && Intrinsics.areEqual(this.divisor, corpActionSplit.divisor) && Intrinsics.areEqual(this.effective_date, corpActionSplit.effective_date) && Intrinsics.areEqual(this.currency_pair_id, corpActionSplit.currency_pair_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.currency_id.hashCode()) * 37) + this.split_direction.hashCode()) * 37) + this.multiplier.hashCode()) * 37) + this.divisor.hashCode()) * 37;
        Instant instant = this.effective_date;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.currency_pair_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_id=" + Internal.sanitize(this.currency_id));
        arrayList.add("split_direction=" + this.split_direction);
        arrayList.add("multiplier=" + Internal.sanitize(this.multiplier));
        arrayList.add("divisor=" + Internal.sanitize(this.divisor));
        Instant instant = this.effective_date;
        if (instant != null) {
            arrayList.add("effective_date=" + instant);
        }
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CorpActionSplit{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CorpActionSplit copy$default(CorpActionSplit corpActionSplit, String str, SplitDirection splitDirection, String str2, String str3, Instant instant, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = corpActionSplit.currency_id;
        }
        if ((i & 2) != 0) {
            splitDirection = corpActionSplit.split_direction;
        }
        if ((i & 4) != 0) {
            str2 = corpActionSplit.multiplier;
        }
        if ((i & 8) != 0) {
            str3 = corpActionSplit.divisor;
        }
        if ((i & 16) != 0) {
            instant = corpActionSplit.effective_date;
        }
        if ((i & 32) != 0) {
            str4 = corpActionSplit.currency_pair_id;
        }
        if ((i & 64) != 0) {
            byteString = corpActionSplit.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        String str6 = str2;
        return corpActionSplit.copy(str, splitDirection, str6, str3, instant2, str5, byteString2);
    }

    public final CorpActionSplit copy(String currency_id, SplitDirection split_direction, String multiplier, String divisor, Instant effective_date, String currency_pair_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(split_direction, "split_direction");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CorpActionSplit(currency_id, split_direction, multiplier, divisor, effective_date, currency_pair_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CorpActionSplit.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CorpActionSplit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CorpActionSplit$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CorpActionSplit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_id());
                }
                if (value.getSplit_direction() != SplitDirection.SPLIT_DIRECTION_UNSPECIFIED) {
                    size += SplitDirection.ADAPTER.encodedSizeWithTag(2, value.getSplit_direction());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMultiplier());
                }
                if (!Intrinsics.areEqual(value.getDivisor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDivisor());
                }
                if (value.getEffective_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getEffective_date());
                }
                return !Intrinsics.areEqual(value.getCurrency_pair_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCurrency_pair_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CorpActionSplit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
                }
                if (value.getSplit_direction() != SplitDirection.SPLIT_DIRECTION_UNSPECIFIED) {
                    SplitDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSplit_direction());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMultiplier());
                }
                if (!Intrinsics.areEqual(value.getDivisor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDivisor());
                }
                if (value.getEffective_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEffective_date());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCurrency_pair_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CorpActionSplit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCurrency_pair_id());
                }
                if (value.getEffective_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEffective_date());
                }
                if (!Intrinsics.areEqual(value.getDivisor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDivisor());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMultiplier());
                }
                if (value.getSplit_direction() != SplitDirection.SPLIT_DIRECTION_UNSPECIFIED) {
                    SplitDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSplit_direction());
                }
                if (Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplit decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SplitDirection splitDirection = SplitDirection.SPLIT_DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                SplitDirection splitDirectionDecode = splitDirection;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    splitDirectionDecode = SplitDirection.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CorpActionSplit(strDecode4, splitDirectionDecode, strDecode, strDecode2, instantDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionSplit redact(CorpActionSplit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant effective_date = value.getEffective_date();
                return CorpActionSplit.copy$default(value, null, null, null, null, effective_date != null ? ProtoAdapter.INSTANT.redact(effective_date) : null, null, ByteString.EMPTY, 47, null);
            }
        };
    }
}
