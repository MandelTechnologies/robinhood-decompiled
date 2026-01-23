package bonfire.proto.idl.windsor.p041v1;

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

/* compiled from: GetContributionAllowanceItem.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItem;", "Lcom/squareup/wire/Message;", "", "tax_year", "", "allowance", "Lcom/robinhood/rosetta/common/Money;", "contributed", "tax_year_label", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "getTax_year", "()I", "getAllowance", "()Lcom/robinhood/rosetta/common/Money;", "getContributed", "getTax_year_label", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetContributionAllowanceItem extends Message {

    @JvmField
    public static final ProtoAdapter<GetContributionAllowanceItem> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money allowance;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money contributed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "taxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int tax_year;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxYearLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String tax_year_label;

    public GetContributionAllowanceItem() {
        this(0, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9054newBuilder();
    }

    public final int getTax_year() {
        return this.tax_year;
    }

    public final Money getAllowance() {
        return this.allowance;
    }

    public final Money getContributed() {
        return this.contributed;
    }

    public final String getTax_year_label() {
        return this.tax_year_label;
    }

    public /* synthetic */ GetContributionAllowanceItem(int i, Money money, Money money2, String str, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : money, (i2 & 4) != 0 ? null : money2, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContributionAllowanceItem(int i, Money money, Money money2, String tax_year_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tax_year_label, "tax_year_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tax_year = i;
        this.allowance = money;
        this.contributed = money2;
        this.tax_year_label = tax_year_label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9054newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetContributionAllowanceItem)) {
            return false;
        }
        GetContributionAllowanceItem getContributionAllowanceItem = (GetContributionAllowanceItem) other;
        return Intrinsics.areEqual(unknownFields(), getContributionAllowanceItem.unknownFields()) && this.tax_year == getContributionAllowanceItem.tax_year && Intrinsics.areEqual(this.allowance, getContributionAllowanceItem.allowance) && Intrinsics.areEqual(this.contributed, getContributionAllowanceItem.contributed) && Intrinsics.areEqual(this.tax_year_label, getContributionAllowanceItem.tax_year_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.tax_year)) * 37;
        Money money = this.allowance;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.contributed;
        int iHashCode3 = ((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.tax_year_label.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tax_year=" + this.tax_year);
        Money money = this.allowance;
        if (money != null) {
            arrayList.add("allowance=" + money);
        }
        Money money2 = this.contributed;
        if (money2 != null) {
            arrayList.add("contributed=" + money2);
        }
        arrayList.add("tax_year_label=" + Internal.sanitize(this.tax_year_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetContributionAllowanceItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetContributionAllowanceItem copy$default(GetContributionAllowanceItem getContributionAllowanceItem, int i, Money money, Money money2, String str, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getContributionAllowanceItem.tax_year;
        }
        if ((i2 & 2) != 0) {
            money = getContributionAllowanceItem.allowance;
        }
        if ((i2 & 4) != 0) {
            money2 = getContributionAllowanceItem.contributed;
        }
        if ((i2 & 8) != 0) {
            str = getContributionAllowanceItem.tax_year_label;
        }
        if ((i2 & 16) != 0) {
            byteString = getContributionAllowanceItem.unknownFields();
        }
        ByteString byteString2 = byteString;
        Money money3 = money2;
        return getContributionAllowanceItem.copy(i, money, money3, str, byteString2);
    }

    public final GetContributionAllowanceItem copy(int tax_year, Money allowance, Money contributed, String tax_year_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tax_year_label, "tax_year_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetContributionAllowanceItem(tax_year, allowance, contributed, tax_year_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetContributionAllowanceItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetContributionAllowanceItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.windsor.v1.GetContributionAllowanceItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetContributionAllowanceItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTax_year() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTax_year()));
                }
                if (value.getAllowance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAllowance());
                }
                if (value.getContributed() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getContributed());
                }
                return !Intrinsics.areEqual(value.getTax_year_label(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTax_year_label()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetContributionAllowanceItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTax_year()));
                }
                if (value.getAllowance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAllowance());
                }
                if (value.getContributed() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getContributed());
                }
                if (!Intrinsics.areEqual(value.getTax_year_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTax_year_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetContributionAllowanceItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTax_year_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTax_year_label());
                }
                if (value.getContributed() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getContributed());
                }
                if (value.getAllowance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAllowance());
                }
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTax_year()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetContributionAllowanceItem redact(GetContributionAllowanceItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money allowance = value.getAllowance();
                Money moneyRedact = allowance != null ? Money.ADAPTER.redact(allowance) : null;
                Money contributed = value.getContributed();
                return GetContributionAllowanceItem.copy$default(value, 0, moneyRedact, contributed != null ? Money.ADAPTER.redact(contributed) : null, null, ByteString.EMPTY, 9, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetContributionAllowanceItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = "";
                int iIntValue = 0;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetContributionAllowanceItem(iIntValue, moneyDecode, moneyDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
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
