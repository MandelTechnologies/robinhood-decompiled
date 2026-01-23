package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.FundingRoundGroupDto;
import com.robinhood.arsenal.proto.p281v1.idl.PrivateCompanyDetailsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PrivateCompanyDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00049:;<B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0019J\u0090\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\tJ\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\tH\u0016J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001b¨\u0006="}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate;)V", "id", "", "name", "legal_name", "description", "secondary_description", "headquarters", "funding_to_date", "Lcom/robinhood/rosetta/common/MoneyDto;", "year_founded", "company_status", "ceo", "num_employees", "funding_round_groups", "", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundGroupDto;", "instrument_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLegal_name", "getDescription", "getSecondary_description", "getHeadquarters", "getFunding_to_date", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getYear_founded", "getCompany_status", "getCeo", "getNum_employees", "getFunding_round_groups", "()Ljava/util/List;", "getInstrument_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PrivateCompanyDetailsDto implements Dto3<PrivateCompanyDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PrivateCompanyDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PrivateCompanyDetailsDto, PrivateCompanyDetails>> binaryBase64Serializer$delegate;
    private static final PrivateCompanyDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PrivateCompanyDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PrivateCompanyDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getLegal_name() {
        return this.surrogate.getLegal_name();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getSecondary_description() {
        return this.surrogate.getSecondary_description();
    }

    public final String getHeadquarters() {
        return this.surrogate.getHeadquarters();
    }

    public final MoneyDto getFunding_to_date() {
        return this.surrogate.getFunding_to_date();
    }

    public final String getYear_founded() {
        return this.surrogate.getYear_founded();
    }

    public final String getCompany_status() {
        return this.surrogate.getCompany_status();
    }

    public final String getCeo() {
        return this.surrogate.getCeo();
    }

    public final String getNum_employees() {
        return this.surrogate.getNum_employees();
    }

    public final List<FundingRoundGroupDto> getFunding_round_groups() {
        return this.surrogate.getFunding_round_groups();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public /* synthetic */ PrivateCompanyDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, MoneyDto moneyDto, String str7, String str8, String str9, String str10, List list, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : moneyDto, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? CollectionsKt.emptyList() : list, (i & 4096) != 0 ? "" : str11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrivateCompanyDetailsDto(String id, String name, String legal_name, String description, String secondary_description, String headquarters, MoneyDto moneyDto, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroupDto> funding_round_groups, String instrument_id) {
        this(new Surrogate(id, name, legal_name, description, secondary_description, headquarters, moneyDto, year_founded, company_status, ceo, num_employees, funding_round_groups, instrument_id));
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
    }

    public static /* synthetic */ PrivateCompanyDetailsDto copy$default(PrivateCompanyDetailsDto privateCompanyDetailsDto, String str, String str2, String str3, String str4, String str5, String str6, MoneyDto moneyDto, String str7, String str8, String str9, String str10, List list, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateCompanyDetailsDto.surrogate.getId();
        }
        return privateCompanyDetailsDto.copy(str, (i & 2) != 0 ? privateCompanyDetailsDto.surrogate.getName() : str2, (i & 4) != 0 ? privateCompanyDetailsDto.surrogate.getLegal_name() : str3, (i & 8) != 0 ? privateCompanyDetailsDto.surrogate.getDescription() : str4, (i & 16) != 0 ? privateCompanyDetailsDto.surrogate.getSecondary_description() : str5, (i & 32) != 0 ? privateCompanyDetailsDto.surrogate.getHeadquarters() : str6, (i & 64) != 0 ? privateCompanyDetailsDto.surrogate.getFunding_to_date() : moneyDto, (i & 128) != 0 ? privateCompanyDetailsDto.surrogate.getYear_founded() : str7, (i & 256) != 0 ? privateCompanyDetailsDto.surrogate.getCompany_status() : str8, (i & 512) != 0 ? privateCompanyDetailsDto.surrogate.getCeo() : str9, (i & 1024) != 0 ? privateCompanyDetailsDto.surrogate.getNum_employees() : str10, (i & 2048) != 0 ? privateCompanyDetailsDto.surrogate.getFunding_round_groups() : list, (i & 4096) != 0 ? privateCompanyDetailsDto.surrogate.getInstrument_id() : str11);
    }

    public final PrivateCompanyDetailsDto copy(String id, String name, String legal_name, String description, String secondary_description, String headquarters, MoneyDto funding_to_date, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroupDto> funding_round_groups, String instrument_id) {
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
        return new PrivateCompanyDetailsDto(new Surrogate(id, name, legal_name, description, secondary_description, headquarters, funding_to_date, year_founded, company_status, ceo, num_employees, funding_round_groups, instrument_id));
    }

    @Override // com.robinhood.idl.Dto
    public PrivateCompanyDetails toProto() {
        String id = this.surrogate.getId();
        String name = this.surrogate.getName();
        String legal_name = this.surrogate.getLegal_name();
        String description = this.surrogate.getDescription();
        String secondary_description = this.surrogate.getSecondary_description();
        String headquarters = this.surrogate.getHeadquarters();
        MoneyDto funding_to_date = this.surrogate.getFunding_to_date();
        Money proto = funding_to_date != null ? funding_to_date.toProto() : null;
        String year_founded = this.surrogate.getYear_founded();
        String company_status = this.surrogate.getCompany_status();
        String ceo = this.surrogate.getCeo();
        String num_employees = this.surrogate.getNum_employees();
        List<FundingRoundGroupDto> funding_round_groups = this.surrogate.getFunding_round_groups();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(funding_round_groups, 10));
        Iterator<T> it = funding_round_groups.iterator();
        while (it.hasNext()) {
            arrayList.add(((FundingRoundGroupDto) it.next()).toProto());
        }
        return new PrivateCompanyDetails(id, name, legal_name, description, secondary_description, headquarters, proto, year_founded, company_status, ceo, num_employees, arrayList, this.surrogate.getInstrument_id(), null, 8192, null);
    }

    public String toString() {
        return "[PrivateCompanyDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PrivateCompanyDetailsDto) && Intrinsics.areEqual(((PrivateCompanyDetailsDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PrivateCompanyDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 T2\u00020\u0001:\u0002STB\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014B£\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0013\u0010\u0019J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u0093\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0016HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001J%\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0001¢\u0006\u0002\bRR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001dR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001dR\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010\u001d¨\u0006U"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate;", "", "id", "", "name", "legal_name", "description", "secondary_description", "headquarters", "funding_to_date", "Lcom/robinhood/rosetta/common/MoneyDto;", "year_founded", "company_status", "ceo", "num_employees", "funding_round_groups", "", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundGroupDto;", "instrument_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "getLegal_name$annotations", "getLegal_name", "getDescription$annotations", "getDescription", "getSecondary_description$annotations", "getSecondary_description", "getHeadquarters$annotations", "getHeadquarters", "getFunding_to_date$annotations", "getFunding_to_date", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getYear_founded$annotations", "getYear_founded", "getCompany_status$annotations", "getCompany_status", "getCeo$annotations", "getCeo", "getNum_employees$annotations", "getNum_employees", "getFunding_round_groups$annotations", "getFunding_round_groups", "()Ljava/util/List;", "getInstrument_id$annotations", "getInstrument_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String ceo;
        private final String company_status;
        private final String description;
        private final List<FundingRoundGroupDto> funding_round_groups;
        private final MoneyDto funding_to_date;
        private final String headquarters;
        private final String id;
        private final String instrument_id;
        private final String legal_name;
        private final String name;
        private final String num_employees;
        private final String secondary_description;
        private final String year_founded;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.PrivateCompanyDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCompanyDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MoneyDto) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FundingRoundGroupDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, MoneyDto moneyDto, String str7, String str8, String str9, String str10, List list, String str11, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            return surrogate.copy(str, (i & 2) != 0 ? surrogate.name : str2, (i & 4) != 0 ? surrogate.legal_name : str3, (i & 8) != 0 ? surrogate.description : str4, (i & 16) != 0 ? surrogate.secondary_description : str5, (i & 32) != 0 ? surrogate.headquarters : str6, (i & 64) != 0 ? surrogate.funding_to_date : moneyDto, (i & 128) != 0 ? surrogate.year_founded : str7, (i & 256) != 0 ? surrogate.company_status : str8, (i & 512) != 0 ? surrogate.ceo : str9, (i & 1024) != 0 ? surrogate.num_employees : str10, (i & 2048) != 0 ? surrogate.funding_round_groups : list, (i & 4096) != 0 ? surrogate.instrument_id : str11);
        }

        @SerialName("ceo")
        @JsonAnnotations2(names = {"ceo"})
        public static /* synthetic */ void getCeo$annotations() {
        }

        @SerialName("companyStatus")
        @JsonAnnotations2(names = {"company_status"})
        public static /* synthetic */ void getCompany_status$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("fundingRoundGroups")
        @JsonAnnotations2(names = {"funding_round_groups"})
        public static /* synthetic */ void getFunding_round_groups$annotations() {
        }

        @SerialName("fundingToDate")
        @JsonAnnotations2(names = {"funding_to_date"})
        public static /* synthetic */ void getFunding_to_date$annotations() {
        }

        @SerialName("headquarters")
        @JsonAnnotations2(names = {"headquarters"})
        public static /* synthetic */ void getHeadquarters$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("legalName")
        @JsonAnnotations2(names = {"legal_name"})
        public static /* synthetic */ void getLegal_name$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("numEmployees")
        @JsonAnnotations2(names = {"num_employees"})
        public static /* synthetic */ void getNum_employees$annotations() {
        }

        @SerialName("secondaryDescription")
        @JsonAnnotations2(names = {"secondary_description"})
        public static /* synthetic */ void getSecondary_description$annotations() {
        }

        @SerialName("yearFounded")
        @JsonAnnotations2(names = {"year_founded"})
        public static /* synthetic */ void getYear_founded$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCeo() {
            return this.ceo;
        }

        /* renamed from: component11, reason: from getter */
        public final String getNum_employees() {
            return this.num_employees;
        }

        public final List<FundingRoundGroupDto> component12() {
            return this.funding_round_groups;
        }

        /* renamed from: component13, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLegal_name() {
            return this.legal_name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSecondary_description() {
            return this.secondary_description;
        }

        /* renamed from: component6, reason: from getter */
        public final String getHeadquarters() {
            return this.headquarters;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getFunding_to_date() {
            return this.funding_to_date;
        }

        /* renamed from: component8, reason: from getter */
        public final String getYear_founded() {
            return this.year_founded;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCompany_status() {
            return this.company_status;
        }

        public final Surrogate copy(String id, String name, String legal_name, String description, String secondary_description, String headquarters, MoneyDto funding_to_date, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroupDto> funding_round_groups, String instrument_id) {
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
            return new Surrogate(id, name, legal_name, description, secondary_description, headquarters, funding_to_date, year_founded, company_status, ceo, num_employees, funding_round_groups, instrument_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.legal_name, surrogate.legal_name) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.secondary_description, surrogate.secondary_description) && Intrinsics.areEqual(this.headquarters, surrogate.headquarters) && Intrinsics.areEqual(this.funding_to_date, surrogate.funding_to_date) && Intrinsics.areEqual(this.year_founded, surrogate.year_founded) && Intrinsics.areEqual(this.company_status, surrogate.company_status) && Intrinsics.areEqual(this.ceo, surrogate.ceo) && Intrinsics.areEqual(this.num_employees, surrogate.num_employees) && Intrinsics.areEqual(this.funding_round_groups, surrogate.funding_round_groups) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.legal_name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.secondary_description.hashCode()) * 31) + this.headquarters.hashCode()) * 31;
            MoneyDto moneyDto = this.funding_to_date;
            return ((((((((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.year_founded.hashCode()) * 31) + this.company_status.hashCode()) * 31) + this.ceo.hashCode()) * 31) + this.num_employees.hashCode()) * 31) + this.funding_round_groups.hashCode()) * 31) + this.instrument_id.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", legal_name=" + this.legal_name + ", description=" + this.description + ", secondary_description=" + this.secondary_description + ", headquarters=" + this.headquarters + ", funding_to_date=" + this.funding_to_date + ", year_founded=" + this.year_founded + ", company_status=" + this.company_status + ", ceo=" + this.ceo + ", num_employees=" + this.num_employees + ", funding_round_groups=" + this.funding_round_groups + ", instrument_id=" + this.instrument_id + ")";
        }

        /* compiled from: PrivateCompanyDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PrivateCompanyDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, MoneyDto moneyDto, String str7, String str8, String str9, String str10, List list, String str11, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.legal_name = "";
            } else {
                this.legal_name = str3;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str4;
            }
            if ((i & 16) == 0) {
                this.secondary_description = "";
            } else {
                this.secondary_description = str5;
            }
            if ((i & 32) == 0) {
                this.headquarters = "";
            } else {
                this.headquarters = str6;
            }
            if ((i & 64) == 0) {
                this.funding_to_date = null;
            } else {
                this.funding_to_date = moneyDto;
            }
            if ((i & 128) == 0) {
                this.year_founded = "";
            } else {
                this.year_founded = str7;
            }
            if ((i & 256) == 0) {
                this.company_status = "";
            } else {
                this.company_status = str8;
            }
            if ((i & 512) == 0) {
                this.ceo = "";
            } else {
                this.ceo = str9;
            }
            if ((i & 1024) == 0) {
                this.num_employees = "";
            } else {
                this.num_employees = str10;
            }
            if ((i & 2048) == 0) {
                this.funding_round_groups = CollectionsKt.emptyList();
            } else {
                this.funding_round_groups = list;
            }
            if ((i & 4096) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str11;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.legal_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.legal_name);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            if (!Intrinsics.areEqual(self.secondary_description, "")) {
                output.encodeStringElement(serialDesc, 4, self.secondary_description);
            }
            if (!Intrinsics.areEqual(self.headquarters, "")) {
                output.encodeStringElement(serialDesc, 5, self.headquarters);
            }
            MoneyDto moneyDto = self.funding_to_date;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.year_founded, "")) {
                output.encodeStringElement(serialDesc, 7, self.year_founded);
            }
            if (!Intrinsics.areEqual(self.company_status, "")) {
                output.encodeStringElement(serialDesc, 8, self.company_status);
            }
            if (!Intrinsics.areEqual(self.ceo, "")) {
                output.encodeStringElement(serialDesc, 9, self.ceo);
            }
            if (!Intrinsics.areEqual(self.num_employees, "")) {
                output.encodeStringElement(serialDesc, 10, self.num_employees);
            }
            if (!Intrinsics.areEqual(self.funding_round_groups, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.funding_round_groups);
            }
            if (Intrinsics.areEqual(self.instrument_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.instrument_id);
        }

        public Surrogate(String id, String name, String legal_name, String description, String secondary_description, String headquarters, MoneyDto moneyDto, String year_founded, String company_status, String ceo, String num_employees, List<FundingRoundGroupDto> funding_round_groups, String instrument_id) {
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
            this.id = id;
            this.name = name;
            this.legal_name = legal_name;
            this.description = description;
            this.secondary_description = secondary_description;
            this.headquarters = headquarters;
            this.funding_to_date = moneyDto;
            this.year_founded = year_founded;
            this.company_status = company_status;
            this.ceo = ceo;
            this.num_employees = num_employees;
            this.funding_round_groups = funding_round_groups;
            this.instrument_id = instrument_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, MoneyDto moneyDto, String str7, String str8, String str9, String str10, List list, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : moneyDto, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? CollectionsKt.emptyList() : list, (i & 4096) != 0 ? "" : str11);
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

        public final MoneyDto getFunding_to_date() {
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

        public final List<FundingRoundGroupDto> getFunding_round_groups() {
            return this.funding_round_groups;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }
    }

    /* compiled from: PrivateCompanyDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PrivateCompanyDetailsDto, PrivateCompanyDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrivateCompanyDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PrivateCompanyDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PrivateCompanyDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PrivateCompanyDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PrivateCompanyDetails> getProtoAdapter() {
            return PrivateCompanyDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PrivateCompanyDetailsDto getZeroValue() {
            return PrivateCompanyDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PrivateCompanyDetailsDto fromProto(PrivateCompanyDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String name = proto.getName();
            String legal_name = proto.getLegal_name();
            String description = proto.getDescription();
            String secondary_description = proto.getSecondary_description();
            String headquarters = proto.getHeadquarters();
            Money funding_to_date = proto.getFunding_to_date();
            MoneyDto moneyDtoFromProto = funding_to_date != null ? MoneyDto.INSTANCE.fromProto(funding_to_date) : null;
            String year_founded = proto.getYear_founded();
            String company_status = proto.getCompany_status();
            String ceo = proto.getCeo();
            String num_employees = proto.getNum_employees();
            List<FundingRoundGroup> funding_round_groups = proto.getFunding_round_groups();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(funding_round_groups, 10));
            Iterator<T> it = funding_round_groups.iterator();
            while (it.hasNext()) {
                arrayList.add(FundingRoundGroupDto.INSTANCE.fromProto((FundingRoundGroup) it.next()));
            }
            return new PrivateCompanyDetailsDto(new Surrogate(id, name, legal_name, description, secondary_description, headquarters, moneyDtoFromProto, year_founded, company_status, ceo, num_employees, arrayList, proto.getInstrument_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.PrivateCompanyDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCompanyDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PrivateCompanyDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PrivateCompanyDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PrivateCompanyDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.PrivateCompanyDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PrivateCompanyDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PrivateCompanyDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PrivateCompanyDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PrivateCompanyDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.PrivateCompanyDetailsDto";
        }
    }
}
