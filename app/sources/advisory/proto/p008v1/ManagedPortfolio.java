package advisory.proto.p008v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ManagedPortfolio.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Ladvisory/proto/v1/ManagedPortfolio;", "Lcom/squareup/wire/Message;", "", "account_number", "", "is_invested", "", "total_value", "Lcom/robinhood/rosetta/common/Money;", "regions", "", "Ladvisory/proto/v1/Region;", "portfolio_description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "()Z", "getTotal_value", "()Lcom/robinhood/rosetta/common/Money;", "getPortfolio_description", "getRegions", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class ManagedPortfolio extends Message {

    @JvmField
    public static final ProtoAdapter<ManagedPortfolio> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isInvested", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_invested;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "portfolioDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String portfolio_description;

    @WireField(adapter = "advisory.proto.v1.Region#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Region> regions;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money total_value;

    public ManagedPortfolio() {
        this(null, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ ManagedPortfolio(String str, boolean z, Money money, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : money, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4506newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* renamed from: is_invested, reason: from getter */
    public final boolean getIs_invested() {
        return this.is_invested;
    }

    public final Money getTotal_value() {
        return this.total_value;
    }

    public final String getPortfolio_description() {
        return this.portfolio_description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedPortfolio(String account_number, boolean z, Money money, List<Region> regions, String portfolio_description, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(portfolio_description, "portfolio_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.is_invested = z;
        this.total_value = money;
        this.portfolio_description = portfolio_description;
        this.regions = Internal.immutableCopyOf("regions", regions);
    }

    public final List<Region> getRegions() {
        return this.regions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4506newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagedPortfolio)) {
            return false;
        }
        ManagedPortfolio managedPortfolio = (ManagedPortfolio) other;
        return Intrinsics.areEqual(unknownFields(), managedPortfolio.unknownFields()) && Intrinsics.areEqual(this.account_number, managedPortfolio.account_number) && this.is_invested == managedPortfolio.is_invested && Intrinsics.areEqual(this.total_value, managedPortfolio.total_value) && Intrinsics.areEqual(this.regions, managedPortfolio.regions) && Intrinsics.areEqual(this.portfolio_description, managedPortfolio.portfolio_description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + Boolean.hashCode(this.is_invested)) * 37;
        Money money = this.total_value;
        int iHashCode2 = ((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.regions.hashCode()) * 37) + this.portfolio_description.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("is_invested=" + this.is_invested);
        Money money = this.total_value;
        if (money != null) {
            arrayList.add("total_value=" + money);
        }
        if (!this.regions.isEmpty()) {
            arrayList.add("regions=" + this.regions);
        }
        arrayList.add("portfolio_description=" + Internal.sanitize(this.portfolio_description));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagedPortfolio{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ManagedPortfolio copy$default(ManagedPortfolio managedPortfolio, String str, boolean z, Money money, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedPortfolio.account_number;
        }
        if ((i & 2) != 0) {
            z = managedPortfolio.is_invested;
        }
        if ((i & 4) != 0) {
            money = managedPortfolio.total_value;
        }
        if ((i & 8) != 0) {
            list = managedPortfolio.regions;
        }
        if ((i & 16) != 0) {
            str2 = managedPortfolio.portfolio_description;
        }
        if ((i & 32) != 0) {
            byteString = managedPortfolio.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return managedPortfolio.copy(str, z, money, list, str3, byteString2);
    }

    public final ManagedPortfolio copy(String account_number, boolean is_invested, Money total_value, List<Region> regions, String portfolio_description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(regions, "regions");
        Intrinsics.checkNotNullParameter(portfolio_description, "portfolio_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagedPortfolio(account_number, is_invested, total_value, regions, portfolio_description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagedPortfolio.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagedPortfolio>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ManagedPortfolio$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagedPortfolio value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getIs_invested()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_invested()));
                }
                if (value.getTotal_value() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getTotal_value());
                }
                int iEncodedSizeWithTag = size + Region.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getRegions());
                return !Intrinsics.areEqual(value.getPortfolio_description(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPortfolio_description()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagedPortfolio value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getIs_invested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_invested()));
                }
                if (value.getTotal_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getTotal_value());
                }
                Region.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRegions());
                if (!Intrinsics.areEqual(value.getPortfolio_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPortfolio_description());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagedPortfolio value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPortfolio_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPortfolio_description());
                }
                Region.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRegions());
                if (value.getTotal_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getTotal_value());
                }
                if (value.getIs_invested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_invested()));
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagedPortfolio decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ManagedPortfolio(strDecode, zBooleanValue, moneyDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(Region.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagedPortfolio redact(ManagedPortfolio value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_value = value.getTotal_value();
                return ManagedPortfolio.copy$default(value, null, false, total_value != null ? Money.ADAPTER.redact(total_value) : null, Internal.m26823redactElements(value.getRegions(), Region.ADAPTER), null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
