package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.FundingRoundDetailsDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FundingRoundDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0006\u0010\u0011JN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate;)V", "funding_date", "", "round_name", "amount_raised", "Lcom/robinhood/rosetta/common/MoneyDto;", "issue_price", "implied_valuation", "investors", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;)V", "getFunding_date", "()Ljava/lang/String;", "getRound_name", "getAmount_raised", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getIssue_price", "getImplied_valuation", "getInvestors", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class FundingRoundDetailsDto implements Dto3<FundingRoundDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FundingRoundDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FundingRoundDetailsDto, FundingRoundDetails>> binaryBase64Serializer$delegate;
    private static final FundingRoundDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FundingRoundDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FundingRoundDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFunding_date() {
        return this.surrogate.getFunding_date();
    }

    public final String getRound_name() {
        return this.surrogate.getRound_name();
    }

    public final MoneyDto getAmount_raised() {
        return this.surrogate.getAmount_raised();
    }

    public final MoneyDto getIssue_price() {
        return this.surrogate.getIssue_price();
    }

    public final MoneyDto getImplied_valuation() {
        return this.surrogate.getImplied_valuation();
    }

    public final List<String> getInvestors() {
        return this.surrogate.getInvestors();
    }

    public /* synthetic */ FundingRoundDetailsDto(String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? null : moneyDto3, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FundingRoundDetailsDto(String funding_date, String round_name, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List<String> investors) {
        this(new Surrogate(funding_date, round_name, moneyDto, moneyDto2, moneyDto3, investors));
        Intrinsics.checkNotNullParameter(funding_date, "funding_date");
        Intrinsics.checkNotNullParameter(round_name, "round_name");
        Intrinsics.checkNotNullParameter(investors, "investors");
    }

    public static /* synthetic */ FundingRoundDetailsDto copy$default(FundingRoundDetailsDto fundingRoundDetailsDto, String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingRoundDetailsDto.surrogate.getFunding_date();
        }
        if ((i & 2) != 0) {
            str2 = fundingRoundDetailsDto.surrogate.getRound_name();
        }
        if ((i & 4) != 0) {
            moneyDto = fundingRoundDetailsDto.surrogate.getAmount_raised();
        }
        if ((i & 8) != 0) {
            moneyDto2 = fundingRoundDetailsDto.surrogate.getIssue_price();
        }
        if ((i & 16) != 0) {
            moneyDto3 = fundingRoundDetailsDto.surrogate.getImplied_valuation();
        }
        if ((i & 32) != 0) {
            list = fundingRoundDetailsDto.surrogate.getInvestors();
        }
        MoneyDto moneyDto4 = moneyDto3;
        List list2 = list;
        return fundingRoundDetailsDto.copy(str, str2, moneyDto, moneyDto2, moneyDto4, list2);
    }

    public final FundingRoundDetailsDto copy(String funding_date, String round_name, MoneyDto amount_raised, MoneyDto issue_price, MoneyDto implied_valuation, List<String> investors) {
        Intrinsics.checkNotNullParameter(funding_date, "funding_date");
        Intrinsics.checkNotNullParameter(round_name, "round_name");
        Intrinsics.checkNotNullParameter(investors, "investors");
        return new FundingRoundDetailsDto(new Surrogate(funding_date, round_name, amount_raised, issue_price, implied_valuation, investors));
    }

    @Override // com.robinhood.idl.Dto
    public FundingRoundDetails toProto() {
        String funding_date = this.surrogate.getFunding_date();
        String round_name = this.surrogate.getRound_name();
        MoneyDto amount_raised = this.surrogate.getAmount_raised();
        Money proto = amount_raised != null ? amount_raised.toProto() : null;
        MoneyDto issue_price = this.surrogate.getIssue_price();
        Money proto2 = issue_price != null ? issue_price.toProto() : null;
        MoneyDto implied_valuation = this.surrogate.getImplied_valuation();
        Money proto3 = implied_valuation != null ? implied_valuation.toProto() : null;
        List<String> investors = this.surrogate.getInvestors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(investors, 10));
        Iterator<T> it = investors.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new FundingRoundDetails(funding_date, round_name, proto, proto2, proto3, arrayList, null, 64, null);
    }

    public String toString() {
        return "[FundingRoundDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FundingRoundDetailsDto) && Intrinsics.areEqual(((FundingRoundDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: FundingRoundDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JQ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate;", "", "funding_date", "", "round_name", "amount_raised", "Lcom/robinhood/rosetta/common/MoneyDto;", "issue_price", "implied_valuation", "investors", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFunding_date$annotations", "()V", "getFunding_date", "()Ljava/lang/String;", "getRound_name$annotations", "getRound_name", "getAmount_raised$annotations", "getAmount_raised", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getIssue_price$annotations", "getIssue_price", "getImplied_valuation$annotations", "getImplied_valuation", "getInvestors$annotations", "getInvestors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final MoneyDto amount_raised;
        private final String funding_date;
        private final MoneyDto implied_valuation;
        private final List<String> investors;
        private final MoneyDto issue_price;
        private final String round_name;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.FundingRoundDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRoundDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.funding_date;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.round_name;
            }
            if ((i & 4) != 0) {
                moneyDto = surrogate.amount_raised;
            }
            if ((i & 8) != 0) {
                moneyDto2 = surrogate.issue_price;
            }
            if ((i & 16) != 0) {
                moneyDto3 = surrogate.implied_valuation;
            }
            if ((i & 32) != 0) {
                list = surrogate.investors;
            }
            MoneyDto moneyDto4 = moneyDto3;
            List list2 = list;
            return surrogate.copy(str, str2, moneyDto, moneyDto2, moneyDto4, list2);
        }

        @SerialName("amountRaised")
        @JsonAnnotations2(names = {"amount_raised"})
        public static /* synthetic */ void getAmount_raised$annotations() {
        }

        @SerialName("fundingDate")
        @JsonAnnotations2(names = {"funding_date"})
        public static /* synthetic */ void getFunding_date$annotations() {
        }

        @SerialName("impliedValuation")
        @JsonAnnotations2(names = {"implied_valuation"})
        public static /* synthetic */ void getImplied_valuation$annotations() {
        }

        @SerialName("investors")
        @JsonAnnotations2(names = {"investors"})
        public static /* synthetic */ void getInvestors$annotations() {
        }

        @SerialName("issuePrice")
        @JsonAnnotations2(names = {"issue_price"})
        public static /* synthetic */ void getIssue_price$annotations() {
        }

        @SerialName("roundName")
        @JsonAnnotations2(names = {"round_name"})
        public static /* synthetic */ void getRound_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFunding_date() {
            return this.funding_date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRound_name() {
            return this.round_name;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getAmount_raised() {
            return this.amount_raised;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getIssue_price() {
            return this.issue_price;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getImplied_valuation() {
            return this.implied_valuation;
        }

        public final List<String> component6() {
            return this.investors;
        }

        public final Surrogate copy(String funding_date, String round_name, MoneyDto amount_raised, MoneyDto issue_price, MoneyDto implied_valuation, List<String> investors) {
            Intrinsics.checkNotNullParameter(funding_date, "funding_date");
            Intrinsics.checkNotNullParameter(round_name, "round_name");
            Intrinsics.checkNotNullParameter(investors, "investors");
            return new Surrogate(funding_date, round_name, amount_raised, issue_price, implied_valuation, investors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.funding_date, surrogate.funding_date) && Intrinsics.areEqual(this.round_name, surrogate.round_name) && Intrinsics.areEqual(this.amount_raised, surrogate.amount_raised) && Intrinsics.areEqual(this.issue_price, surrogate.issue_price) && Intrinsics.areEqual(this.implied_valuation, surrogate.implied_valuation) && Intrinsics.areEqual(this.investors, surrogate.investors);
        }

        public int hashCode() {
            int iHashCode = ((this.funding_date.hashCode() * 31) + this.round_name.hashCode()) * 31;
            MoneyDto moneyDto = this.amount_raised;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.issue_price;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.implied_valuation;
            return ((iHashCode3 + (moneyDto3 != null ? moneyDto3.hashCode() : 0)) * 31) + this.investors.hashCode();
        }

        public String toString() {
            return "Surrogate(funding_date=" + this.funding_date + ", round_name=" + this.round_name + ", amount_raised=" + this.amount_raised + ", issue_price=" + this.issue_price + ", implied_valuation=" + this.implied_valuation + ", investors=" + this.investors + ")";
        }

        /* compiled from: FundingRoundDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FundingRoundDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.funding_date = "";
            } else {
                this.funding_date = str;
            }
            if ((i & 2) == 0) {
                this.round_name = "";
            } else {
                this.round_name = str2;
            }
            if ((i & 4) == 0) {
                this.amount_raised = null;
            } else {
                this.amount_raised = moneyDto;
            }
            if ((i & 8) == 0) {
                this.issue_price = null;
            } else {
                this.issue_price = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.implied_valuation = null;
            } else {
                this.implied_valuation = moneyDto3;
            }
            if ((i & 32) == 0) {
                this.investors = CollectionsKt.emptyList();
            } else {
                this.investors = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.funding_date, "")) {
                output.encodeStringElement(serialDesc, 0, self.funding_date);
            }
            if (!Intrinsics.areEqual(self.round_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.round_name);
            }
            MoneyDto moneyDto = self.amount_raised;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.issue_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.implied_valuation;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (Intrinsics.areEqual(self.investors, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.investors);
        }

        public Surrogate(String funding_date, String round_name, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List<String> investors) {
            Intrinsics.checkNotNullParameter(funding_date, "funding_date");
            Intrinsics.checkNotNullParameter(round_name, "round_name");
            Intrinsics.checkNotNullParameter(investors, "investors");
            this.funding_date = funding_date;
            this.round_name = round_name;
            this.amount_raised = moneyDto;
            this.issue_price = moneyDto2;
            this.implied_valuation = moneyDto3;
            this.investors = investors;
        }

        public /* synthetic */ Surrogate(String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? null : moneyDto3, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getFunding_date() {
            return this.funding_date;
        }

        public final String getRound_name() {
            return this.round_name;
        }

        public final MoneyDto getAmount_raised() {
            return this.amount_raised;
        }

        public final MoneyDto getIssue_price() {
            return this.issue_price;
        }

        public final MoneyDto getImplied_valuation() {
            return this.implied_valuation;
        }

        public final List<String> getInvestors() {
            return this.investors;
        }
    }

    /* compiled from: FundingRoundDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FundingRoundDetailsDto, FundingRoundDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingRoundDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundingRoundDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundingRoundDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) FundingRoundDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FundingRoundDetails> getProtoAdapter() {
            return FundingRoundDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundingRoundDetailsDto getZeroValue() {
            return FundingRoundDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundingRoundDetailsDto fromProto(FundingRoundDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String funding_date = proto.getFunding_date();
            String round_name = proto.getRound_name();
            Money amount_raised = proto.getAmount_raised();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount_raised != null ? MoneyDto.INSTANCE.fromProto(amount_raised) : null;
            Money issue_price = proto.getIssue_price();
            MoneyDto moneyDtoFromProto2 = issue_price != null ? MoneyDto.INSTANCE.fromProto(issue_price) : null;
            Money implied_valuation = proto.getImplied_valuation();
            MoneyDto moneyDtoFromProto3 = implied_valuation != null ? MoneyDto.INSTANCE.fromProto(implied_valuation) : null;
            List<String> investors = proto.getInvestors();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(investors, 10));
            Iterator<T> it = investors.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new FundingRoundDetailsDto(new Surrogate(funding_date, round_name, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.FundingRoundDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRoundDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FundingRoundDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FundingRoundDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FundingRoundDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.FundingRoundDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FundingRoundDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FundingRoundDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FundingRoundDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FundingRoundDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FundingRoundDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.FundingRoundDetailsDto";
        }
    }
}
