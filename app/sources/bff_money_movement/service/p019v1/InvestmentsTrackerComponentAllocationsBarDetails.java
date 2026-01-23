package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerComponentAllocationsBarDetails.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "Lcom/squareup/wire/Message;", "", "header", "", "amount", "sections", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarSectionDetails;", "amount_money", "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getHeader", "()Ljava/lang/String;", "getAmount", "getAmount_money", "()Lcom/robinhood/rosetta/common/Money;", "getSections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentAllocationsBarDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentAllocationsBarDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountMoney", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money amount_money;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarSectionDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<InvestmentsTrackerComponentAllocationsBarSectionDetails> sections;

    public InvestmentsTrackerComponentAllocationsBarDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentAllocationsBarDetails(String str, String str2, List list, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : money, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8451newBuilder();
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final Money getAmount_money() {
        return this.amount_money;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentAllocationsBarDetails(String header, String amount, List<InvestmentsTrackerComponentAllocationsBarSectionDetails> sections, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = header;
        this.amount = amount;
        this.amount_money = money;
        this.sections = Internal.immutableCopyOf("sections", sections);
    }

    public final List<InvestmentsTrackerComponentAllocationsBarSectionDetails> getSections() {
        return this.sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8451newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentAllocationsBarDetails)) {
            return false;
        }
        InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails = (InvestmentsTrackerComponentAllocationsBarDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentAllocationsBarDetails.unknownFields()) && Intrinsics.areEqual(this.header, investmentsTrackerComponentAllocationsBarDetails.header) && Intrinsics.areEqual(this.amount, investmentsTrackerComponentAllocationsBarDetails.amount) && Intrinsics.areEqual(this.sections, investmentsTrackerComponentAllocationsBarDetails.sections) && Intrinsics.areEqual(this.amount_money, investmentsTrackerComponentAllocationsBarDetails.amount_money);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.sections.hashCode()) * 37;
        Money money = this.amount_money;
        int iHashCode2 = iHashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        if (!this.sections.isEmpty()) {
            arrayList.add("sections=" + this.sections);
        }
        Money money = this.amount_money;
        if (money != null) {
            arrayList.add("amount_money=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentAllocationsBarDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentAllocationsBarDetails copy$default(InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails, String str, String str2, List list, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentAllocationsBarDetails.header;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentAllocationsBarDetails.amount;
        }
        if ((i & 4) != 0) {
            list = investmentsTrackerComponentAllocationsBarDetails.sections;
        }
        if ((i & 8) != 0) {
            money = investmentsTrackerComponentAllocationsBarDetails.amount_money;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerComponentAllocationsBarDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return investmentsTrackerComponentAllocationsBarDetails.copy(str, str2, list2, money, byteString2);
    }

    public final InvestmentsTrackerComponentAllocationsBarDetails copy(String header, String amount, List<InvestmentsTrackerComponentAllocationsBarSectionDetails> sections, Money amount_money, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentAllocationsBarDetails(header, amount, sections, amount_money, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentAllocationsBarDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentAllocationsBarDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentAllocationsBarDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmount());
                }
                int iEncodedSizeWithTag = size + InvestmentsTrackerComponentAllocationsBarSectionDetails.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSections());
                return value.getAmount_money() != null ? iEncodedSizeWithTag + Money.ADAPTER.encodedSizeWithTag(4, value.getAmount_money()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentAllocationsBarDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                InvestmentsTrackerComponentAllocationsBarSectionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSections());
                if (value.getAmount_money() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount_money());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentAllocationsBarDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAmount_money() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount_money());
                }
                InvestmentsTrackerComponentAllocationsBarSectionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSections());
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getHeader(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentAllocationsBarDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerComponentAllocationsBarDetails(strDecode, strDecode2, arrayList, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(InvestmentsTrackerComponentAllocationsBarSectionDetails.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentAllocationsBarDetails redact(InvestmentsTrackerComponentAllocationsBarDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getSections(), InvestmentsTrackerComponentAllocationsBarSectionDetails.ADAPTER);
                Money amount_money = value.getAmount_money();
                return InvestmentsTrackerComponentAllocationsBarDetails.copy$default(value, null, null, listM26823redactElements, amount_money != null ? Money.ADAPTER.redact(amount_money) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
