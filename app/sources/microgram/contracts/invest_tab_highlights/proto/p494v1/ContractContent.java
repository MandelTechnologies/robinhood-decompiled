package microgram.contracts.invest_tab_highlights.proto.p494v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: ContractContent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "Lcom/squareup/wire/Message;", "", "contract_name", "", "score", "last_trade_price", ResourceTypes.COLOR, "Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColor;Lokio/ByteString;)V", "getContract_name", "()Ljava/lang/String;", "getScore", "getLast_trade_price", "getColor", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ContractContent extends Message {

    @JvmField
    public static final ProtoAdapter<ContractContent> ADAPTER;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.DayNightColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final DayNightColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String last_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String score;

    public ContractContent() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ContractContent(String str, String str2, String str3, DayNightColor dayNightColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : dayNightColor, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29120newBuilder();
    }

    public final String getContract_name() {
        return this.contract_name;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getLast_trade_price() {
        return this.last_trade_price;
    }

    public final DayNightColor getColor() {
        return this.color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractContent(String contract_name, String score, String last_trade_price, DayNightColor dayNightColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_name, "contract_name");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_name = contract_name;
        this.score = score;
        this.last_trade_price = last_trade_price;
        this.color = dayNightColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29120newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractContent)) {
            return false;
        }
        ContractContent contractContent = (ContractContent) other;
        return Intrinsics.areEqual(unknownFields(), contractContent.unknownFields()) && Intrinsics.areEqual(this.contract_name, contractContent.contract_name) && Intrinsics.areEqual(this.score, contractContent.score) && Intrinsics.areEqual(this.last_trade_price, contractContent.last_trade_price) && Intrinsics.areEqual(this.color, contractContent.color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.contract_name.hashCode()) * 37) + this.score.hashCode()) * 37) + this.last_trade_price.hashCode()) * 37;
        DayNightColor dayNightColor = this.color;
        int iHashCode2 = iHashCode + (dayNightColor != null ? dayNightColor.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_name=" + Internal.sanitize(this.contract_name));
        arrayList.add("score=" + Internal.sanitize(this.score));
        arrayList.add("last_trade_price=" + Internal.sanitize(this.last_trade_price));
        DayNightColor dayNightColor = this.color;
        if (dayNightColor != null) {
            arrayList.add("color=" + dayNightColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractContent copy$default(ContractContent contractContent, String str, String str2, String str3, DayNightColor dayNightColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractContent.contract_name;
        }
        if ((i & 2) != 0) {
            str2 = contractContent.score;
        }
        if ((i & 4) != 0) {
            str3 = contractContent.last_trade_price;
        }
        if ((i & 8) != 0) {
            dayNightColor = contractContent.color;
        }
        if ((i & 16) != 0) {
            byteString = contractContent.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return contractContent.copy(str, str2, str4, dayNightColor, byteString2);
    }

    public final ContractContent copy(String contract_name, String score, String last_trade_price, DayNightColor color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_name, "contract_name");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractContent(contract_name, score, last_trade_price, color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.ContractContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_name());
                }
                if (!Intrinsics.areEqual(value.getScore(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScore());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLast_trade_price());
                }
                return value.getColor() != null ? size + DayNightColor.ADAPTER.encodedSizeWithTag(4, value.getColor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_name());
                }
                if (!Intrinsics.areEqual(value.getScore(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScore());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLast_trade_price());
                }
                if (value.getColor() != null) {
                    DayNightColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getColor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getColor() != null) {
                    DayNightColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getColor());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getScore(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScore());
                }
                if (Intrinsics.areEqual(value.getContract_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractContent redact(ContractContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DayNightColor color = value.getColor();
                return ContractContent.copy$default(value, null, null, null, color != null ? DayNightColor.ADAPTER.redact(color) : null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                DayNightColor dayNightColorDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContractContent(strDecode, strDecode3, strDecode2, dayNightColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        dayNightColorDecode = DayNightColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
