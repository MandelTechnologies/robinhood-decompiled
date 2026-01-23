package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: PrivateCompanyDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u009a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00062"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetails;", "Lcom/squareup/wire/Message;", "", "id", "", "name", "legal_name", "description", "secondary_description", "headquarters", "funding_to_date", "Lcom/robinhood/rosetta/common/Money;", "year_founded", "company_status", "ceo", "num_employees", "funding_round_groups", "", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundGroup;", "instrument_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "getLegal_name", "getDescription", "getSecondary_description", "getHeadquarters", "getFunding_to_date", "()Lcom/robinhood/rosetta/common/Money;", "getYear_founded", "getCompany_status", "getCeo", "getNum_employees", "getInstrument_id", "getFunding_round_groups", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PrivateCompanyDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PrivateCompanyDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String ceo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "companyStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String company_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FundingRoundGroup#ADAPTER", jsonName = "fundingRoundGroups", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 12)
    private final List<FundingRoundGroup> funding_round_groups;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "fundingToDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money funding_to_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String headquarters;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "legalName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String legal_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "numEmployees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String num_employees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String secondary_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "yearFounded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String year_founded;

    public PrivateCompanyDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ PrivateCompanyDetails(String str, String str2, String str3, String str4, String str5, String str6, Money money, String str7, String str8, String str9, String str10, List list, String str11, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : money, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? CollectionsKt.emptyList() : list, (i & 4096) == 0 ? str11 : "", (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20198newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getLegal_name() {
        return this.legal_name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSecondary_description() {
        return this.secondary_description;
    }

    public final String getHeadquarters() {
        return this.headquarters;
    }

    public final Money getFunding_to_date() {
        return this.funding_to_date;
    }

    public final String getYear_founded() {
        return this.year_founded;
    }

    public final String getCompany_status() {
        return this.company_status;
    }

    public final String getCeo() {
        return this.ceo;
    }

    public final String getNum_employees() {
        return this.num_employees;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateCompanyDetails(String id, String name, String legal_name, String description, String secondary_description, String headquarters, Money money, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroup> funding_round_groups, String instrument_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(legal_name, "legal_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondary_description, "secondary_description");
        Intrinsics.checkNotNullParameter(headquarters, "headquarters");
        Intrinsics.checkNotNullParameter(year_founded, "year_founded");
        Intrinsics.checkNotNullParameter(company_status, "company_status");
        Intrinsics.checkNotNullParameter(ceo, "ceo");
        Intrinsics.checkNotNullParameter(num_employees, "num_employees");
        Intrinsics.checkNotNullParameter(funding_round_groups, "funding_round_groups");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.legal_name = legal_name;
        this.description = description;
        this.secondary_description = secondary_description;
        this.headquarters = headquarters;
        this.funding_to_date = money;
        this.year_founded = year_founded;
        this.company_status = company_status;
        this.ceo = ceo;
        this.num_employees = num_employees;
        this.instrument_id = instrument_id;
        this.funding_round_groups = Internal.immutableCopyOf("funding_round_groups", funding_round_groups);
    }

    public final List<FundingRoundGroup> getFunding_round_groups() {
        return this.funding_round_groups;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20198newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrivateCompanyDetails)) {
            return false;
        }
        PrivateCompanyDetails privateCompanyDetails = (PrivateCompanyDetails) other;
        return Intrinsics.areEqual(unknownFields(), privateCompanyDetails.unknownFields()) && Intrinsics.areEqual(this.id, privateCompanyDetails.id) && Intrinsics.areEqual(this.name, privateCompanyDetails.name) && Intrinsics.areEqual(this.legal_name, privateCompanyDetails.legal_name) && Intrinsics.areEqual(this.description, privateCompanyDetails.description) && Intrinsics.areEqual(this.secondary_description, privateCompanyDetails.secondary_description) && Intrinsics.areEqual(this.headquarters, privateCompanyDetails.headquarters) && Intrinsics.areEqual(this.funding_to_date, privateCompanyDetails.funding_to_date) && Intrinsics.areEqual(this.year_founded, privateCompanyDetails.year_founded) && Intrinsics.areEqual(this.company_status, privateCompanyDetails.company_status) && Intrinsics.areEqual(this.ceo, privateCompanyDetails.ceo) && Intrinsics.areEqual(this.num_employees, privateCompanyDetails.num_employees) && Intrinsics.areEqual(this.funding_round_groups, privateCompanyDetails.funding_round_groups) && Intrinsics.areEqual(this.instrument_id, privateCompanyDetails.instrument_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.legal_name.hashCode()) * 37) + this.description.hashCode()) * 37) + this.secondary_description.hashCode()) * 37) + this.headquarters.hashCode()) * 37;
        Money money = this.funding_to_date;
        int iHashCode2 = ((((((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.year_founded.hashCode()) * 37) + this.company_status.hashCode()) * 37) + this.ceo.hashCode()) * 37) + this.num_employees.hashCode()) * 37) + this.funding_round_groups.hashCode()) * 37) + this.instrument_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("legal_name=" + Internal.sanitize(this.legal_name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("secondary_description=" + Internal.sanitize(this.secondary_description));
        arrayList.add("headquarters=" + Internal.sanitize(this.headquarters));
        Money money = this.funding_to_date;
        if (money != null) {
            arrayList.add("funding_to_date=" + money);
        }
        arrayList.add("year_founded=" + Internal.sanitize(this.year_founded));
        arrayList.add("company_status=" + Internal.sanitize(this.company_status));
        arrayList.add("ceo=" + Internal.sanitize(this.ceo));
        arrayList.add("num_employees=" + Internal.sanitize(this.num_employees));
        if (!this.funding_round_groups.isEmpty()) {
            arrayList.add("funding_round_groups=" + this.funding_round_groups);
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrivateCompanyDetails{", "}", 0, null, null, 56, null);
    }

    public final PrivateCompanyDetails copy(String id, String name, String legal_name, String description, String secondary_description, String headquarters, Money funding_to_date, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroup> funding_round_groups, String instrument_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(legal_name, "legal_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondary_description, "secondary_description");
        Intrinsics.checkNotNullParameter(headquarters, "headquarters");
        Intrinsics.checkNotNullParameter(year_founded, "year_founded");
        Intrinsics.checkNotNullParameter(company_status, "company_status");
        Intrinsics.checkNotNullParameter(ceo, "ceo");
        Intrinsics.checkNotNullParameter(num_employees, "num_employees");
        Intrinsics.checkNotNullParameter(funding_round_groups, "funding_round_groups");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrivateCompanyDetails(id, name, legal_name, description, secondary_description, headquarters, funding_to_date, year_founded, company_status, ceo, num_employees, funding_round_groups, instrument_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrivateCompanyDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PrivateCompanyDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.PrivateCompanyDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PrivateCompanyDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getLegal_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLegal_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSecondary_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSecondary_description());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getHeadquarters());
                }
                if (value.getFunding_to_date() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getFunding_to_date());
                }
                if (!Intrinsics.areEqual(value.getYear_founded(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getYear_founded());
                }
                if (!Intrinsics.areEqual(value.getCompany_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCompany_status());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getNum_employees(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getNum_employees());
                }
                int iEncodedSizeWithTag = size + FundingRoundGroup.ADAPTER.asRepeated().encodedSizeWithTag(12, value.getFunding_round_groups());
                return !Intrinsics.areEqual(value.getInstrument_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(13, value.getInstrument_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PrivateCompanyDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getLegal_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLegal_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSecondary_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSecondary_description());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getHeadquarters());
                }
                if (value.getFunding_to_date() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getFunding_to_date());
                }
                if (!Intrinsics.areEqual(value.getYear_founded(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getYear_founded());
                }
                if (!Intrinsics.areEqual(value.getCompany_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCompany_status());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getNum_employees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getNum_employees());
                }
                FundingRoundGroup.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getFunding_round_groups());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getInstrument_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PrivateCompanyDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getInstrument_id());
                }
                FundingRoundGroup.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getFunding_round_groups());
                if (!Intrinsics.areEqual(value.getNum_employees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getNum_employees());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getCompany_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCompany_status());
                }
                if (!Intrinsics.areEqual(value.getYear_founded(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getYear_founded());
                }
                if (value.getFunding_to_date() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getFunding_to_date());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getHeadquarters());
                }
                if (!Intrinsics.areEqual(value.getSecondary_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSecondary_description());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getLegal_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLegal_name());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                Money moneyDecode = null;
                String strDecode11 = strDecode10;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode11;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                arrayList.add(FundingRoundGroup.ADAPTER.decode(reader));
                                break;
                            case 13:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode11 = str;
                    } else {
                        return new PrivateCompanyDetails(strDecode10, str, strDecode, strDecode2, strDecode3, strDecode4, moneyDecode, strDecode5, strDecode6, strDecode7, strDecode8, arrayList, strDecode9, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyDetails redact(PrivateCompanyDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money funding_to_date = value.getFunding_to_date();
                return value.copy((6079 & 1) != 0 ? value.id : null, (6079 & 2) != 0 ? value.name : null, (6079 & 4) != 0 ? value.legal_name : null, (6079 & 8) != 0 ? value.description : null, (6079 & 16) != 0 ? value.secondary_description : null, (6079 & 32) != 0 ? value.headquarters : null, (6079 & 64) != 0 ? value.funding_to_date : funding_to_date != null ? Money.ADAPTER.redact(funding_to_date) : null, (6079 & 128) != 0 ? value.year_founded : null, (6079 & 256) != 0 ? value.company_status : null, (6079 & 512) != 0 ? value.ceo : null, (6079 & 1024) != 0 ? value.num_employees : null, (6079 & 2048) != 0 ? value.funding_round_groups : Internal.m26823redactElements(value.getFunding_round_groups(), FundingRoundGroup.ADAPTER), (6079 & 4096) != 0 ? value.instrument_id : null, (6079 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
