package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: FundingRoundDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetails;", "Lcom/squareup/wire/Message;", "", "funding_date", "", "round_name", "amount_raised", "Lcom/robinhood/rosetta/common/Money;", "issue_price", "implied_valuation", "investors", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lokio/ByteString;)V", "getFunding_date", "()Ljava/lang/String;", "getRound_name", "getAmount_raised", "()Lcom/robinhood/rosetta/common/Money;", "getIssue_price", "getImplied_valuation", "getInvestors", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FundingRoundDetails extends Message {

    @JvmField
    public static final ProtoAdapter<FundingRoundDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountRaised", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount_raised;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fundingDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String funding_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "impliedValuation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money implied_valuation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<String> investors;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "issuePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money issue_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "roundName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String round_name;

    public FundingRoundDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ FundingRoundDetails(String str, String str2, Money money, Money money2, Money money3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20143newBuilder();
    }

    public final String getFunding_date() {
        return this.funding_date;
    }

    public final String getRound_name() {
        return this.round_name;
    }

    public final Money getAmount_raised() {
        return this.amount_raised;
    }

    public final Money getIssue_price() {
        return this.issue_price;
    }

    public final Money getImplied_valuation() {
        return this.implied_valuation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingRoundDetails(String funding_date, String round_name, Money money, Money money2, Money money3, List<String> investors, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(funding_date, "funding_date");
        Intrinsics.checkNotNullParameter(round_name, "round_name");
        Intrinsics.checkNotNullParameter(investors, "investors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.funding_date = funding_date;
        this.round_name = round_name;
        this.amount_raised = money;
        this.issue_price = money2;
        this.implied_valuation = money3;
        this.investors = Internal.immutableCopyOf("investors", investors);
    }

    public final List<String> getInvestors() {
        return this.investors;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20143newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FundingRoundDetails)) {
            return false;
        }
        FundingRoundDetails fundingRoundDetails = (FundingRoundDetails) other;
        return Intrinsics.areEqual(unknownFields(), fundingRoundDetails.unknownFields()) && Intrinsics.areEqual(this.funding_date, fundingRoundDetails.funding_date) && Intrinsics.areEqual(this.round_name, fundingRoundDetails.round_name) && Intrinsics.areEqual(this.amount_raised, fundingRoundDetails.amount_raised) && Intrinsics.areEqual(this.issue_price, fundingRoundDetails.issue_price) && Intrinsics.areEqual(this.implied_valuation, fundingRoundDetails.implied_valuation) && Intrinsics.areEqual(this.investors, fundingRoundDetails.investors);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.funding_date.hashCode()) * 37) + this.round_name.hashCode()) * 37;
        Money money = this.amount_raised;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.issue_price;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.implied_valuation;
        int iHashCode4 = ((iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.investors.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("funding_date=" + Internal.sanitize(this.funding_date));
        arrayList.add("round_name=" + Internal.sanitize(this.round_name));
        Money money = this.amount_raised;
        if (money != null) {
            arrayList.add("amount_raised=" + money);
        }
        Money money2 = this.issue_price;
        if (money2 != null) {
            arrayList.add("issue_price=" + money2);
        }
        Money money3 = this.implied_valuation;
        if (money3 != null) {
            arrayList.add("implied_valuation=" + money3);
        }
        if (!this.investors.isEmpty()) {
            arrayList.add("investors=" + Internal.sanitize(this.investors));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FundingRoundDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FundingRoundDetails copy$default(FundingRoundDetails fundingRoundDetails, String str, String str2, Money money, Money money2, Money money3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingRoundDetails.funding_date;
        }
        if ((i & 2) != 0) {
            str2 = fundingRoundDetails.round_name;
        }
        if ((i & 4) != 0) {
            money = fundingRoundDetails.amount_raised;
        }
        if ((i & 8) != 0) {
            money2 = fundingRoundDetails.issue_price;
        }
        if ((i & 16) != 0) {
            money3 = fundingRoundDetails.implied_valuation;
        }
        if ((i & 32) != 0) {
            list = fundingRoundDetails.investors;
        }
        if ((i & 64) != 0) {
            byteString = fundingRoundDetails.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        Money money4 = money3;
        Money money5 = money;
        return fundingRoundDetails.copy(str, str2, money5, money2, money4, list2, byteString2);
    }

    public final FundingRoundDetails copy(String funding_date, String round_name, Money amount_raised, Money issue_price, Money implied_valuation, List<String> investors, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(funding_date, "funding_date");
        Intrinsics.checkNotNullParameter(round_name, "round_name");
        Intrinsics.checkNotNullParameter(investors, "investors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FundingRoundDetails(funding_date, round_name, amount_raised, issue_price, implied_valuation, investors, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundingRoundDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FundingRoundDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.FundingRoundDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FundingRoundDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFunding_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFunding_date());
                }
                if (!Intrinsics.areEqual(value.getRound_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRound_name());
                }
                if (value.getAmount_raised() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount_raised());
                }
                if (value.getIssue_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getIssue_price());
                }
                if (value.getImplied_valuation() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getImplied_valuation());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.getInvestors());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FundingRoundDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFunding_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFunding_date());
                }
                if (!Intrinsics.areEqual(value.getRound_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRound_name());
                }
                if (value.getAmount_raised() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount_raised());
                }
                if (value.getIssue_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getIssue_price());
                }
                if (value.getImplied_valuation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getImplied_valuation());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, (int) value.getInvestors());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FundingRoundDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getInvestors());
                if (value.getImplied_valuation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getImplied_valuation());
                }
                if (value.getIssue_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getIssue_price());
                }
                if (value.getAmount_raised() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount_raised());
                }
                if (!Intrinsics.areEqual(value.getRound_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getRound_name());
                }
                if (Intrinsics.areEqual(value.getFunding_date(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFunding_date());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FundingRoundDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FundingRoundDetails(strDecode, strDecode2, moneyDecode, moneyDecode2, moneyDecode3, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundingRoundDetails redact(FundingRoundDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount_raised = value.getAmount_raised();
                Money moneyRedact = amount_raised != null ? Money.ADAPTER.redact(amount_raised) : null;
                Money issue_price = value.getIssue_price();
                Money moneyRedact2 = issue_price != null ? Money.ADAPTER.redact(issue_price) : null;
                Money implied_valuation = value.getImplied_valuation();
                return FundingRoundDetails.copy$default(value, null, null, moneyRedact, moneyRedact2, implied_valuation != null ? Money.ADAPTER.redact(implied_valuation) : null, null, ByteString.EMPTY, 35, null);
            }
        };
    }
}
