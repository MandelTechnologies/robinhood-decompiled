package rosetta.midas.p538v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rhc.upsells.Upsell;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.midas.p538v1.APYFeatureDto;
import rosetta.midas.p538v1.BoostedACATsMatchFeatureDto;
import rosetta.midas.p538v1.CreditCardBoostedCashbackFeatureDto;
import rosetta.midas.p538v1.CreditCardCLIFeatureDto;
import rosetta.midas.p538v1.DepositMatchFeatureDto;
import rosetta.midas.p538v1.FuturesDiscountFeatureDto;
import rosetta.midas.p538v1.IndexOptionsDiscountFeatureDto;
import rosetta.midas.p538v1.InstantDepositFeatureDto;
import rosetta.midas.p538v1.MarginFeatureDto;
import rosetta.midas.p538v1.RetirementMatchFeatureDto;
import rosetta.midas.p538v1.SubscriptionFeaturesDto;

/* compiled from: SubscriptionFeaturesDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007By\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102¨\u00067"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/SubscriptionFeatures;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;)V", "Lrosetta/midas/v1/APYFeatureDto;", "apy", "Lrosetta/midas/v1/MarginFeatureDto;", GoldFeature.MARGIN, "Lrosetta/midas/v1/InstantDepositFeatureDto;", "instant_deposit", "Lrosetta/midas/v1/RetirementMatchFeatureDto;", "retirement_match", "Lrosetta/midas/v1/DepositMatchFeatureDto;", Upsell.Single.DepositMatch.f5953ID, "Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;", "index_options_discount", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "futures_discount", "", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "credit_card_boosted_cashback", "Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "credit_card_cli", "Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;", "boosted_acats_match", "(Lrosetta/midas/v1/APYFeatureDto;Lrosetta/midas/v1/MarginFeatureDto;Lrosetta/midas/v1/InstantDepositFeatureDto;Lrosetta/midas/v1/RetirementMatchFeatureDto;Lrosetta/midas/v1/DepositMatchFeatureDto;Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/util/List;Ljava/util/List;Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;)V", "toProto", "()Lrosetta/midas/v1/SubscriptionFeatures;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class SubscriptionFeaturesDto implements Dto3<SubscriptionFeatures>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionFeaturesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionFeaturesDto, SubscriptionFeatures>> binaryBase64Serializer$delegate;
    private static final SubscriptionFeaturesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionFeaturesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionFeaturesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ SubscriptionFeaturesDto(APYFeatureDto aPYFeatureDto, MarginFeatureDto marginFeatureDto, InstantDepositFeatureDto instantDepositFeatureDto, RetirementMatchFeatureDto retirementMatchFeatureDto, DepositMatchFeatureDto depositMatchFeatureDto, IndexOptionsDiscountFeatureDto indexOptionsDiscountFeatureDto, FuturesDiscountFeatureDto futuresDiscountFeatureDto, List list, List list2, BoostedACATsMatchFeatureDto boostedACATsMatchFeatureDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? APYFeatureDto.INSTANCE.getZeroValue() : aPYFeatureDto, (i & 2) != 0 ? MarginFeatureDto.INSTANCE.getZeroValue() : marginFeatureDto, (i & 4) != 0 ? InstantDepositFeatureDto.INSTANCE.getZeroValue() : instantDepositFeatureDto, (i & 8) != 0 ? RetirementMatchFeatureDto.INSTANCE.getZeroValue() : retirementMatchFeatureDto, (i & 16) != 0 ? DepositMatchFeatureDto.INSTANCE.getZeroValue() : depositMatchFeatureDto, (i & 32) != 0 ? IndexOptionsDiscountFeatureDto.INSTANCE.getZeroValue() : indexOptionsDiscountFeatureDto, (i & 64) != 0 ? FuturesDiscountFeatureDto.INSTANCE.getZeroValue() : futuresDiscountFeatureDto, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? BoostedACATsMatchFeatureDto.INSTANCE.getZeroValue() : boostedACATsMatchFeatureDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeaturesDto(APYFeatureDto apy, MarginFeatureDto margin, InstantDepositFeatureDto instant_deposit, RetirementMatchFeatureDto retirement_match, DepositMatchFeatureDto deposit_match, IndexOptionsDiscountFeatureDto index_options_discount, FuturesDiscountFeatureDto futures_discount, List<CreditCardBoostedCashbackFeatureDto> credit_card_boosted_cashback, List<CreditCardCLIFeatureDto> credit_card_cli, BoostedACATsMatchFeatureDto boosted_acats_match) {
        this(new Surrogate(apy, margin, instant_deposit, retirement_match, deposit_match, index_options_discount, futures_discount, credit_card_boosted_cashback, credit_card_cli, boosted_acats_match));
        Intrinsics.checkNotNullParameter(apy, "apy");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(instant_deposit, "instant_deposit");
        Intrinsics.checkNotNullParameter(retirement_match, "retirement_match");
        Intrinsics.checkNotNullParameter(deposit_match, "deposit_match");
        Intrinsics.checkNotNullParameter(index_options_discount, "index_options_discount");
        Intrinsics.checkNotNullParameter(futures_discount, "futures_discount");
        Intrinsics.checkNotNullParameter(credit_card_boosted_cashback, "credit_card_boosted_cashback");
        Intrinsics.checkNotNullParameter(credit_card_cli, "credit_card_cli");
        Intrinsics.checkNotNullParameter(boosted_acats_match, "boosted_acats_match");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionFeatures toProto() {
        APYFeature aPYFeature = (APYFeature) this.surrogate.getApy().toProto();
        MarginFeature marginFeature = (MarginFeature) this.surrogate.getMargin().toProto();
        InstantDepositFeature instantDepositFeature = (InstantDepositFeature) this.surrogate.getInstant_deposit().toProto();
        RetirementMatchFeature retirementMatchFeature = (RetirementMatchFeature) this.surrogate.getRetirement_match().toProto();
        DepositMatchFeature depositMatchFeature = (DepositMatchFeature) this.surrogate.getDeposit_match().toProto();
        IndexOptionsDiscountFeature indexOptionsDiscountFeature = (IndexOptionsDiscountFeature) this.surrogate.getIndex_options_discount().toProto();
        FuturesDiscountFeature futuresDiscountFeature = (FuturesDiscountFeature) this.surrogate.getFutures_discount().toProto();
        List<CreditCardBoostedCashbackFeatureDto> credit_card_boosted_cashback = this.surrogate.getCredit_card_boosted_cashback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(credit_card_boosted_cashback, 10));
        Iterator<T> it = credit_card_boosted_cashback.iterator();
        while (it.hasNext()) {
            arrayList.add(((CreditCardBoostedCashbackFeatureDto) it.next()).toProto());
        }
        List<CreditCardCLIFeatureDto> credit_card_cli = this.surrogate.getCredit_card_cli();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(credit_card_cli, 10));
        Iterator<T> it2 = credit_card_cli.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CreditCardCLIFeatureDto) it2.next()).toProto());
        }
        return new SubscriptionFeatures(aPYFeature, marginFeature, instantDepositFeature, retirementMatchFeature, depositMatchFeature, indexOptionsDiscountFeature, futuresDiscountFeature, arrayList, arrayList2, (BoostedACATsMatchFeature) this.surrogate.getBoosted_acats_match().toProto(), null, 1024, null);
    }

    public String toString() {
        return "[SubscriptionFeaturesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionFeaturesDto) && Intrinsics.areEqual(((SubscriptionFeaturesDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionFeaturesDto.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b,\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002XWBw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b>\u0010?R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bD\u00104\u001a\u0004\bB\u0010CR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bH\u00104\u001a\u0004\bF\u0010GR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bL\u00104\u001a\u0004\bJ\u0010KR&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010M\u0012\u0004\bP\u00104\u001a\u0004\bN\u0010OR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010M\u0012\u0004\bR\u00104\u001a\u0004\bQ\u0010OR \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010S\u0012\u0004\bV\u00104\u001a\u0004\bT\u0010U¨\u0006Y"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;", "", "Lrosetta/midas/v1/APYFeatureDto;", "apy", "Lrosetta/midas/v1/MarginFeatureDto;", GoldFeature.MARGIN, "Lrosetta/midas/v1/InstantDepositFeatureDto;", "instant_deposit", "Lrosetta/midas/v1/RetirementMatchFeatureDto;", "retirement_match", "Lrosetta/midas/v1/DepositMatchFeatureDto;", Upsell.Single.DepositMatch.f5953ID, "Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;", "index_options_discount", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "futures_discount", "", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "credit_card_boosted_cashback", "Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "credit_card_cli", "Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;", "boosted_acats_match", "<init>", "(Lrosetta/midas/v1/APYFeatureDto;Lrosetta/midas/v1/MarginFeatureDto;Lrosetta/midas/v1/InstantDepositFeatureDto;Lrosetta/midas/v1/RetirementMatchFeatureDto;Lrosetta/midas/v1/DepositMatchFeatureDto;Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/util/List;Ljava/util/List;Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/midas/v1/APYFeatureDto;Lrosetta/midas/v1/MarginFeatureDto;Lrosetta/midas/v1/InstantDepositFeatureDto;Lrosetta/midas/v1/RetirementMatchFeatureDto;Lrosetta/midas/v1/DepositMatchFeatureDto;Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/util/List;Ljava/util/List;Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/APYFeatureDto;", "getApy", "()Lrosetta/midas/v1/APYFeatureDto;", "getApy$annotations", "()V", "Lrosetta/midas/v1/MarginFeatureDto;", "getMargin", "()Lrosetta/midas/v1/MarginFeatureDto;", "getMargin$annotations", "Lrosetta/midas/v1/InstantDepositFeatureDto;", "getInstant_deposit", "()Lrosetta/midas/v1/InstantDepositFeatureDto;", "getInstant_deposit$annotations", "Lrosetta/midas/v1/RetirementMatchFeatureDto;", "getRetirement_match", "()Lrosetta/midas/v1/RetirementMatchFeatureDto;", "getRetirement_match$annotations", "Lrosetta/midas/v1/DepositMatchFeatureDto;", "getDeposit_match", "()Lrosetta/midas/v1/DepositMatchFeatureDto;", "getDeposit_match$annotations", "Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;", "getIndex_options_discount", "()Lrosetta/midas/v1/IndexOptionsDiscountFeatureDto;", "getIndex_options_discount$annotations", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "getFutures_discount", "()Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "getFutures_discount$annotations", "Ljava/util/List;", "getCredit_card_boosted_cashback", "()Ljava/util/List;", "getCredit_card_boosted_cashback$annotations", "getCredit_card_cli", "getCredit_card_cli$annotations", "Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;", "getBoosted_acats_match", "()Lrosetta/midas/v1/BoostedACATsMatchFeatureDto;", "getBoosted_acats_match$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final APYFeatureDto apy;
        private final BoostedACATsMatchFeatureDto boosted_acats_match;
        private final List<CreditCardBoostedCashbackFeatureDto> credit_card_boosted_cashback;
        private final List<CreditCardCLIFeatureDto> credit_card_cli;
        private final DepositMatchFeatureDto deposit_match;
        private final FuturesDiscountFeatureDto futures_discount;
        private final IndexOptionsDiscountFeatureDto index_options_discount;
        private final InstantDepositFeatureDto instant_deposit;
        private final MarginFeatureDto margin;
        private final RetirementMatchFeatureDto retirement_match;

        public Surrogate() {
            this((APYFeatureDto) null, (MarginFeatureDto) null, (InstantDepositFeatureDto) null, (RetirementMatchFeatureDto) null, (DepositMatchFeatureDto) null, (IndexOptionsDiscountFeatureDto) null, (FuturesDiscountFeatureDto) null, (List) null, (List) null, (BoostedACATsMatchFeatureDto) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CreditCardBoostedCashbackFeatureDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(CreditCardCLIFeatureDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.apy == surrogate.apy && this.margin == surrogate.margin && this.instant_deposit == surrogate.instant_deposit && this.retirement_match == surrogate.retirement_match && this.deposit_match == surrogate.deposit_match && this.index_options_discount == surrogate.index_options_discount && this.futures_discount == surrogate.futures_discount && Intrinsics.areEqual(this.credit_card_boosted_cashback, surrogate.credit_card_boosted_cashback) && Intrinsics.areEqual(this.credit_card_cli, surrogate.credit_card_cli) && this.boosted_acats_match == surrogate.boosted_acats_match;
        }

        public int hashCode() {
            return (((((((((((((((((this.apy.hashCode() * 31) + this.margin.hashCode()) * 31) + this.instant_deposit.hashCode()) * 31) + this.retirement_match.hashCode()) * 31) + this.deposit_match.hashCode()) * 31) + this.index_options_discount.hashCode()) * 31) + this.futures_discount.hashCode()) * 31) + this.credit_card_boosted_cashback.hashCode()) * 31) + this.credit_card_cli.hashCode()) * 31) + this.boosted_acats_match.hashCode();
        }

        public String toString() {
            return "Surrogate(apy=" + this.apy + ", margin=" + this.margin + ", instant_deposit=" + this.instant_deposit + ", retirement_match=" + this.retirement_match + ", deposit_match=" + this.deposit_match + ", index_options_discount=" + this.index_options_discount + ", futures_discount=" + this.futures_discount + ", credit_card_boosted_cashback=" + this.credit_card_boosted_cashback + ", credit_card_cli=" + this.credit_card_cli + ", boosted_acats_match=" + this.boosted_acats_match + ")";
        }

        /* compiled from: SubscriptionFeaturesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionFeaturesDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rosetta.midas.v1.SubscriptionFeaturesDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionFeaturesDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rosetta.midas.v1.SubscriptionFeaturesDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionFeaturesDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, APYFeatureDto aPYFeatureDto, MarginFeatureDto marginFeatureDto, InstantDepositFeatureDto instantDepositFeatureDto, RetirementMatchFeatureDto retirementMatchFeatureDto, DepositMatchFeatureDto depositMatchFeatureDto, IndexOptionsDiscountFeatureDto indexOptionsDiscountFeatureDto, FuturesDiscountFeatureDto futuresDiscountFeatureDto, List list, List list2, BoostedACATsMatchFeatureDto boostedACATsMatchFeatureDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.apy = (i & 1) == 0 ? APYFeatureDto.INSTANCE.getZeroValue() : aPYFeatureDto;
            if ((i & 2) == 0) {
                this.margin = MarginFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.margin = marginFeatureDto;
            }
            if ((i & 4) == 0) {
                this.instant_deposit = InstantDepositFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.instant_deposit = instantDepositFeatureDto;
            }
            if ((i & 8) == 0) {
                this.retirement_match = RetirementMatchFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.retirement_match = retirementMatchFeatureDto;
            }
            if ((i & 16) == 0) {
                this.deposit_match = DepositMatchFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.deposit_match = depositMatchFeatureDto;
            }
            if ((i & 32) == 0) {
                this.index_options_discount = IndexOptionsDiscountFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.index_options_discount = indexOptionsDiscountFeatureDto;
            }
            if ((i & 64) == 0) {
                this.futures_discount = FuturesDiscountFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.futures_discount = futuresDiscountFeatureDto;
            }
            if ((i & 128) == 0) {
                this.credit_card_boosted_cashback = CollectionsKt.emptyList();
            } else {
                this.credit_card_boosted_cashback = list;
            }
            if ((i & 256) == 0) {
                this.credit_card_cli = CollectionsKt.emptyList();
            } else {
                this.credit_card_cli = list2;
            }
            if ((i & 512) == 0) {
                this.boosted_acats_match = BoostedACATsMatchFeatureDto.INSTANCE.getZeroValue();
            } else {
                this.boosted_acats_match = boostedACATsMatchFeatureDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.apy != APYFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, APYFeatureDto.Serializer.INSTANCE, self.apy);
            }
            if (self.margin != MarginFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, MarginFeatureDto.Serializer.INSTANCE, self.margin);
            }
            if (self.instant_deposit != InstantDepositFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, InstantDepositFeatureDto.Serializer.INSTANCE, self.instant_deposit);
            }
            if (self.retirement_match != RetirementMatchFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, RetirementMatchFeatureDto.Serializer.INSTANCE, self.retirement_match);
            }
            if (self.deposit_match != DepositMatchFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, DepositMatchFeatureDto.Serializer.INSTANCE, self.deposit_match);
            }
            if (self.index_options_discount != IndexOptionsDiscountFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, IndexOptionsDiscountFeatureDto.Serializer.INSTANCE, self.index_options_discount);
            }
            if (self.futures_discount != FuturesDiscountFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, FuturesDiscountFeatureDto.Serializer.INSTANCE, self.futures_discount);
            }
            if (!Intrinsics.areEqual(self.credit_card_boosted_cashback, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.credit_card_boosted_cashback);
            }
            if (!Intrinsics.areEqual(self.credit_card_cli, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.credit_card_cli);
            }
            if (self.boosted_acats_match != BoostedACATsMatchFeatureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, BoostedACATsMatchFeatureDto.Serializer.INSTANCE, self.boosted_acats_match);
            }
        }

        public Surrogate(APYFeatureDto apy, MarginFeatureDto margin, InstantDepositFeatureDto instant_deposit, RetirementMatchFeatureDto retirement_match, DepositMatchFeatureDto deposit_match, IndexOptionsDiscountFeatureDto index_options_discount, FuturesDiscountFeatureDto futures_discount, List<CreditCardBoostedCashbackFeatureDto> credit_card_boosted_cashback, List<CreditCardCLIFeatureDto> credit_card_cli, BoostedACATsMatchFeatureDto boosted_acats_match) {
            Intrinsics.checkNotNullParameter(apy, "apy");
            Intrinsics.checkNotNullParameter(margin, "margin");
            Intrinsics.checkNotNullParameter(instant_deposit, "instant_deposit");
            Intrinsics.checkNotNullParameter(retirement_match, "retirement_match");
            Intrinsics.checkNotNullParameter(deposit_match, "deposit_match");
            Intrinsics.checkNotNullParameter(index_options_discount, "index_options_discount");
            Intrinsics.checkNotNullParameter(futures_discount, "futures_discount");
            Intrinsics.checkNotNullParameter(credit_card_boosted_cashback, "credit_card_boosted_cashback");
            Intrinsics.checkNotNullParameter(credit_card_cli, "credit_card_cli");
            Intrinsics.checkNotNullParameter(boosted_acats_match, "boosted_acats_match");
            this.apy = apy;
            this.margin = margin;
            this.instant_deposit = instant_deposit;
            this.retirement_match = retirement_match;
            this.deposit_match = deposit_match;
            this.index_options_discount = index_options_discount;
            this.futures_discount = futures_discount;
            this.credit_card_boosted_cashback = credit_card_boosted_cashback;
            this.credit_card_cli = credit_card_cli;
            this.boosted_acats_match = boosted_acats_match;
        }

        public final APYFeatureDto getApy() {
            return this.apy;
        }

        public /* synthetic */ Surrogate(APYFeatureDto aPYFeatureDto, MarginFeatureDto marginFeatureDto, InstantDepositFeatureDto instantDepositFeatureDto, RetirementMatchFeatureDto retirementMatchFeatureDto, DepositMatchFeatureDto depositMatchFeatureDto, IndexOptionsDiscountFeatureDto indexOptionsDiscountFeatureDto, FuturesDiscountFeatureDto futuresDiscountFeatureDto, List list, List list2, BoostedACATsMatchFeatureDto boostedACATsMatchFeatureDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? APYFeatureDto.INSTANCE.getZeroValue() : aPYFeatureDto, (i & 2) != 0 ? MarginFeatureDto.INSTANCE.getZeroValue() : marginFeatureDto, (i & 4) != 0 ? InstantDepositFeatureDto.INSTANCE.getZeroValue() : instantDepositFeatureDto, (i & 8) != 0 ? RetirementMatchFeatureDto.INSTANCE.getZeroValue() : retirementMatchFeatureDto, (i & 16) != 0 ? DepositMatchFeatureDto.INSTANCE.getZeroValue() : depositMatchFeatureDto, (i & 32) != 0 ? IndexOptionsDiscountFeatureDto.INSTANCE.getZeroValue() : indexOptionsDiscountFeatureDto, (i & 64) != 0 ? FuturesDiscountFeatureDto.INSTANCE.getZeroValue() : futuresDiscountFeatureDto, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? BoostedACATsMatchFeatureDto.INSTANCE.getZeroValue() : boostedACATsMatchFeatureDto);
        }

        public final MarginFeatureDto getMargin() {
            return this.margin;
        }

        public final InstantDepositFeatureDto getInstant_deposit() {
            return this.instant_deposit;
        }

        public final RetirementMatchFeatureDto getRetirement_match() {
            return this.retirement_match;
        }

        public final DepositMatchFeatureDto getDeposit_match() {
            return this.deposit_match;
        }

        public final IndexOptionsDiscountFeatureDto getIndex_options_discount() {
            return this.index_options_discount;
        }

        public final FuturesDiscountFeatureDto getFutures_discount() {
            return this.futures_discount;
        }

        public final List<CreditCardBoostedCashbackFeatureDto> getCredit_card_boosted_cashback() {
            return this.credit_card_boosted_cashback;
        }

        public final List<CreditCardCLIFeatureDto> getCredit_card_cli() {
            return this.credit_card_cli;
        }

        public final BoostedACATsMatchFeatureDto getBoosted_acats_match() {
            return this.boosted_acats_match;
        }
    }

    /* compiled from: SubscriptionFeaturesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/SubscriptionFeaturesDto;", "Lrosetta/midas/v1/SubscriptionFeatures;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/SubscriptionFeaturesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionFeaturesDto, SubscriptionFeatures> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionFeaturesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeaturesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeaturesDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionFeaturesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionFeatures> getProtoAdapter() {
            return SubscriptionFeatures.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeaturesDto getZeroValue() {
            return SubscriptionFeaturesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeaturesDto fromProto(SubscriptionFeatures proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            APYFeatureDto aPYFeatureDtoFromProto = APYFeatureDto.INSTANCE.fromProto(proto.getApy());
            MarginFeatureDto marginFeatureDtoFromProto = MarginFeatureDto.INSTANCE.fromProto(proto.getMargin());
            InstantDepositFeatureDto instantDepositFeatureDtoFromProto = InstantDepositFeatureDto.INSTANCE.fromProto(proto.getInstant_deposit());
            RetirementMatchFeatureDto retirementMatchFeatureDtoFromProto = RetirementMatchFeatureDto.INSTANCE.fromProto(proto.getRetirement_match());
            DepositMatchFeatureDto depositMatchFeatureDtoFromProto = DepositMatchFeatureDto.INSTANCE.fromProto(proto.getDeposit_match());
            IndexOptionsDiscountFeatureDto indexOptionsDiscountFeatureDtoFromProto = IndexOptionsDiscountFeatureDto.INSTANCE.fromProto(proto.getIndex_options_discount());
            FuturesDiscountFeatureDto futuresDiscountFeatureDtoFromProto = FuturesDiscountFeatureDto.INSTANCE.fromProto(proto.getFutures_discount());
            List<CreditCardBoostedCashbackFeature> credit_card_boosted_cashback = proto.getCredit_card_boosted_cashback();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(credit_card_boosted_cashback, 10));
            Iterator<T> it = credit_card_boosted_cashback.iterator();
            while (it.hasNext()) {
                arrayList.add(CreditCardBoostedCashbackFeatureDto.INSTANCE.fromProto((CreditCardBoostedCashbackFeature) it.next()));
            }
            List<CreditCardCLIFeature> credit_card_cli = proto.getCredit_card_cli();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(credit_card_cli, 10));
            Iterator<T> it2 = credit_card_cli.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CreditCardCLIFeatureDto.INSTANCE.fromProto((CreditCardCLIFeature) it2.next()));
            }
            return new SubscriptionFeaturesDto(new Surrogate(aPYFeatureDtoFromProto, marginFeatureDtoFromProto, instantDepositFeatureDtoFromProto, retirementMatchFeatureDtoFromProto, depositMatchFeatureDtoFromProto, indexOptionsDiscountFeatureDtoFromProto, futuresDiscountFeatureDtoFromProto, arrayList, arrayList2, BoostedACATsMatchFeatureDto.INSTANCE.fromProto(proto.getBoosted_acats_match())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.SubscriptionFeaturesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionFeaturesDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new SubscriptionFeaturesDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionFeaturesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/SubscriptionFeaturesDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/SubscriptionFeaturesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionFeaturesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionFeatures", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionFeaturesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionFeaturesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionFeaturesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionFeaturesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeaturesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.SubscriptionFeaturesDto";
        }
    }
}
