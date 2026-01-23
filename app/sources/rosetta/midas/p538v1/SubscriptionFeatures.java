package rosetta.midas.p538v1;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.rhc.upsells.Upsell;
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

/* compiled from: SubscriptionFeatures.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\u0080\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-¨\u0006:"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeatures;", "Lcom/squareup/wire/Message;", "", "apy", "Lrosetta/midas/v1/APYFeature;", GoldFeature.MARGIN, "Lrosetta/midas/v1/MarginFeature;", "instant_deposit", "Lrosetta/midas/v1/InstantDepositFeature;", "retirement_match", "Lrosetta/midas/v1/RetirementMatchFeature;", Upsell.Single.DepositMatch.f5953ID, "Lrosetta/midas/v1/DepositMatchFeature;", "index_options_discount", "Lrosetta/midas/v1/IndexOptionsDiscountFeature;", "futures_discount", "Lrosetta/midas/v1/FuturesDiscountFeature;", "credit_card_boosted_cashback", "", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature;", "credit_card_cli", "Lrosetta/midas/v1/CreditCardCLIFeature;", "boosted_acats_match", "Lrosetta/midas/v1/BoostedACATsMatchFeature;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/midas/v1/APYFeature;Lrosetta/midas/v1/MarginFeature;Lrosetta/midas/v1/InstantDepositFeature;Lrosetta/midas/v1/RetirementMatchFeature;Lrosetta/midas/v1/DepositMatchFeature;Lrosetta/midas/v1/IndexOptionsDiscountFeature;Lrosetta/midas/v1/FuturesDiscountFeature;Ljava/util/List;Ljava/util/List;Lrosetta/midas/v1/BoostedACATsMatchFeature;Lokio/ByteString;)V", "getApy", "()Lrosetta/midas/v1/APYFeature;", "getMargin", "()Lrosetta/midas/v1/MarginFeature;", "getInstant_deposit", "()Lrosetta/midas/v1/InstantDepositFeature;", "getRetirement_match", "()Lrosetta/midas/v1/RetirementMatchFeature;", "getDeposit_match", "()Lrosetta/midas/v1/DepositMatchFeature;", "getIndex_options_discount", "()Lrosetta/midas/v1/IndexOptionsDiscountFeature;", "getFutures_discount", "()Lrosetta/midas/v1/FuturesDiscountFeature;", "getBoosted_acats_match", "()Lrosetta/midas/v1/BoostedACATsMatchFeature;", "getCredit_card_boosted_cashback", "()Ljava/util/List;", "getCredit_card_cli", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubscriptionFeatures extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionFeatures> ADAPTER;

    @WireField(adapter = "rosetta.midas.v1.APYFeature#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final APYFeature apy;

    @WireField(adapter = "rosetta.midas.v1.BoostedACATsMatchFeature#ADAPTER", jsonName = "boostedAcatsMatch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final BoostedACATsMatchFeature boosted_acats_match;

    @WireField(adapter = "rosetta.midas.v1.CreditCardBoostedCashbackFeature#ADAPTER", jsonName = "creditCardBoostedCashback", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<CreditCardBoostedCashbackFeature> credit_card_boosted_cashback;

    @WireField(adapter = "rosetta.midas.v1.CreditCardCLIFeature#ADAPTER", jsonName = "creditCardCli", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    private final List<CreditCardCLIFeature> credit_card_cli;

    @WireField(adapter = "rosetta.midas.v1.DepositMatchFeature#ADAPTER", jsonName = "depositMatch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final DepositMatchFeature deposit_match;

    @WireField(adapter = "rosetta.midas.v1.FuturesDiscountFeature#ADAPTER", jsonName = "futuresDiscount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final FuturesDiscountFeature futures_discount;

    @WireField(adapter = "rosetta.midas.v1.IndexOptionsDiscountFeature#ADAPTER", jsonName = "indexOptionsDiscount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final IndexOptionsDiscountFeature index_options_discount;

    @WireField(adapter = "rosetta.midas.v1.InstantDepositFeature#ADAPTER", jsonName = "instantDeposit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final InstantDepositFeature instant_deposit;

    @WireField(adapter = "rosetta.midas.v1.MarginFeature#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MarginFeature margin;

    @WireField(adapter = "rosetta.midas.v1.RetirementMatchFeature#ADAPTER", jsonName = "retirementMatch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RetirementMatchFeature retirement_match;

    public SubscriptionFeatures() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29907newBuilder();
    }

    public final APYFeature getApy() {
        return this.apy;
    }

    public /* synthetic */ SubscriptionFeatures(APYFeature aPYFeature, MarginFeature marginFeature, InstantDepositFeature instantDepositFeature, RetirementMatchFeature retirementMatchFeature, DepositMatchFeature depositMatchFeature, IndexOptionsDiscountFeature indexOptionsDiscountFeature, FuturesDiscountFeature futuresDiscountFeature, List list, List list2, BoostedACATsMatchFeature boostedACATsMatchFeature, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? APYFeature.APY_FEATURE_DISABLED : aPYFeature, (i & 2) != 0 ? MarginFeature.MARGIN_FEATURE_DISABLED : marginFeature, (i & 4) != 0 ? InstantDepositFeature.INSTANT_DEPOSIT_FEATURE_DISABLED : instantDepositFeature, (i & 8) != 0 ? RetirementMatchFeature.RETIREMENT_MATCH_FEATURE_DISABLED : retirementMatchFeature, (i & 16) != 0 ? DepositMatchFeature.DEPOSIT_MATCH_FEATURE_DISABLED : depositMatchFeature, (i & 32) != 0 ? IndexOptionsDiscountFeature.INDEX_OPTIONS_DISCOUNT_FEATURE_DISABLED : indexOptionsDiscountFeature, (i & 64) != 0 ? FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED : futuresDiscountFeature, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? BoostedACATsMatchFeature.BOOSTED_ACATS_MATCH_FEATURE_DISABLED : boostedACATsMatchFeature, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MarginFeature getMargin() {
        return this.margin;
    }

    public final InstantDepositFeature getInstant_deposit() {
        return this.instant_deposit;
    }

    public final RetirementMatchFeature getRetirement_match() {
        return this.retirement_match;
    }

    public final DepositMatchFeature getDeposit_match() {
        return this.deposit_match;
    }

    public final IndexOptionsDiscountFeature getIndex_options_discount() {
        return this.index_options_discount;
    }

    public final FuturesDiscountFeature getFutures_discount() {
        return this.futures_discount;
    }

    public final BoostedACATsMatchFeature getBoosted_acats_match() {
        return this.boosted_acats_match;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeatures(APYFeature apy, MarginFeature margin, InstantDepositFeature instant_deposit, RetirementMatchFeature retirement_match, DepositMatchFeature deposit_match, IndexOptionsDiscountFeature index_options_discount, FuturesDiscountFeature futures_discount, List<CreditCardBoostedCashbackFeature> credit_card_boosted_cashback, List<CreditCardCLIFeature> credit_card_cli, BoostedACATsMatchFeature boosted_acats_match, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.apy = apy;
        this.margin = margin;
        this.instant_deposit = instant_deposit;
        this.retirement_match = retirement_match;
        this.deposit_match = deposit_match;
        this.index_options_discount = index_options_discount;
        this.futures_discount = futures_discount;
        this.boosted_acats_match = boosted_acats_match;
        this.credit_card_boosted_cashback = Internal.immutableCopyOf("credit_card_boosted_cashback", credit_card_boosted_cashback);
        this.credit_card_cli = Internal.immutableCopyOf("credit_card_cli", credit_card_cli);
    }

    public final List<CreditCardBoostedCashbackFeature> getCredit_card_boosted_cashback() {
        return this.credit_card_boosted_cashback;
    }

    public final List<CreditCardCLIFeature> getCredit_card_cli() {
        return this.credit_card_cli;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29907newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionFeatures)) {
            return false;
        }
        SubscriptionFeatures subscriptionFeatures = (SubscriptionFeatures) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionFeatures.unknownFields()) && this.apy == subscriptionFeatures.apy && this.margin == subscriptionFeatures.margin && this.instant_deposit == subscriptionFeatures.instant_deposit && this.retirement_match == subscriptionFeatures.retirement_match && this.deposit_match == subscriptionFeatures.deposit_match && this.index_options_discount == subscriptionFeatures.index_options_discount && this.futures_discount == subscriptionFeatures.futures_discount && Intrinsics.areEqual(this.credit_card_boosted_cashback, subscriptionFeatures.credit_card_boosted_cashback) && Intrinsics.areEqual(this.credit_card_cli, subscriptionFeatures.credit_card_cli) && this.boosted_acats_match == subscriptionFeatures.boosted_acats_match;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.apy.hashCode()) * 37) + this.margin.hashCode()) * 37) + this.instant_deposit.hashCode()) * 37) + this.retirement_match.hashCode()) * 37) + this.deposit_match.hashCode()) * 37) + this.index_options_discount.hashCode()) * 37) + this.futures_discount.hashCode()) * 37) + this.credit_card_boosted_cashback.hashCode()) * 37) + this.credit_card_cli.hashCode()) * 37) + this.boosted_acats_match.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("apy=" + this.apy);
        arrayList.add("margin=" + this.margin);
        arrayList.add("instant_deposit=" + this.instant_deposit);
        arrayList.add("retirement_match=" + this.retirement_match);
        arrayList.add("deposit_match=" + this.deposit_match);
        arrayList.add("index_options_discount=" + this.index_options_discount);
        arrayList.add("futures_discount=" + this.futures_discount);
        if (!this.credit_card_boosted_cashback.isEmpty()) {
            arrayList.add("credit_card_boosted_cashback=" + this.credit_card_boosted_cashback);
        }
        if (!this.credit_card_cli.isEmpty()) {
            arrayList.add("credit_card_cli=" + this.credit_card_cli);
        }
        arrayList.add("boosted_acats_match=" + this.boosted_acats_match);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionFeatures{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionFeatures copy$default(SubscriptionFeatures subscriptionFeatures, APYFeature aPYFeature, MarginFeature marginFeature, InstantDepositFeature instantDepositFeature, RetirementMatchFeature retirementMatchFeature, DepositMatchFeature depositMatchFeature, IndexOptionsDiscountFeature indexOptionsDiscountFeature, FuturesDiscountFeature futuresDiscountFeature, List list, List list2, BoostedACATsMatchFeature boostedACATsMatchFeature, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            aPYFeature = subscriptionFeatures.apy;
        }
        if ((i & 2) != 0) {
            marginFeature = subscriptionFeatures.margin;
        }
        if ((i & 4) != 0) {
            instantDepositFeature = subscriptionFeatures.instant_deposit;
        }
        if ((i & 8) != 0) {
            retirementMatchFeature = subscriptionFeatures.retirement_match;
        }
        if ((i & 16) != 0) {
            depositMatchFeature = subscriptionFeatures.deposit_match;
        }
        if ((i & 32) != 0) {
            indexOptionsDiscountFeature = subscriptionFeatures.index_options_discount;
        }
        if ((i & 64) != 0) {
            futuresDiscountFeature = subscriptionFeatures.futures_discount;
        }
        if ((i & 128) != 0) {
            list = subscriptionFeatures.credit_card_boosted_cashback;
        }
        if ((i & 256) != 0) {
            list2 = subscriptionFeatures.credit_card_cli;
        }
        if ((i & 512) != 0) {
            boostedACATsMatchFeature = subscriptionFeatures.boosted_acats_match;
        }
        if ((i & 1024) != 0) {
            byteString = subscriptionFeatures.unknownFields();
        }
        BoostedACATsMatchFeature boostedACATsMatchFeature2 = boostedACATsMatchFeature;
        ByteString byteString2 = byteString;
        List list3 = list;
        List list4 = list2;
        IndexOptionsDiscountFeature indexOptionsDiscountFeature2 = indexOptionsDiscountFeature;
        FuturesDiscountFeature futuresDiscountFeature2 = futuresDiscountFeature;
        DepositMatchFeature depositMatchFeature2 = depositMatchFeature;
        InstantDepositFeature instantDepositFeature2 = instantDepositFeature;
        return subscriptionFeatures.copy(aPYFeature, marginFeature, instantDepositFeature2, retirementMatchFeature, depositMatchFeature2, indexOptionsDiscountFeature2, futuresDiscountFeature2, list3, list4, boostedACATsMatchFeature2, byteString2);
    }

    public final SubscriptionFeatures copy(APYFeature apy, MarginFeature margin, InstantDepositFeature instant_deposit, RetirementMatchFeature retirement_match, DepositMatchFeature deposit_match, IndexOptionsDiscountFeature index_options_discount, FuturesDiscountFeature futures_discount, List<CreditCardBoostedCashbackFeature> credit_card_boosted_cashback, List<CreditCardCLIFeature> credit_card_cli, BoostedACATsMatchFeature boosted_acats_match, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionFeatures(apy, margin, instant_deposit, retirement_match, deposit_match, index_options_discount, futures_discount, credit_card_boosted_cashback, credit_card_cli, boosted_acats_match, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionFeatures.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionFeatures>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.SubscriptionFeatures$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionFeatures value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getApy() != APYFeature.APY_FEATURE_DISABLED) {
                    size += APYFeature.ADAPTER.encodedSizeWithTag(1, value.getApy());
                }
                if (value.getMargin() != MarginFeature.MARGIN_FEATURE_DISABLED) {
                    size += MarginFeature.ADAPTER.encodedSizeWithTag(2, value.getMargin());
                }
                if (value.getInstant_deposit() != InstantDepositFeature.INSTANT_DEPOSIT_FEATURE_DISABLED) {
                    size += InstantDepositFeature.ADAPTER.encodedSizeWithTag(3, value.getInstant_deposit());
                }
                if (value.getRetirement_match() != RetirementMatchFeature.RETIREMENT_MATCH_FEATURE_DISABLED) {
                    size += RetirementMatchFeature.ADAPTER.encodedSizeWithTag(4, value.getRetirement_match());
                }
                if (value.getDeposit_match() != DepositMatchFeature.DEPOSIT_MATCH_FEATURE_DISABLED) {
                    size += DepositMatchFeature.ADAPTER.encodedSizeWithTag(5, value.getDeposit_match());
                }
                if (value.getIndex_options_discount() != IndexOptionsDiscountFeature.INDEX_OPTIONS_DISCOUNT_FEATURE_DISABLED) {
                    size += IndexOptionsDiscountFeature.ADAPTER.encodedSizeWithTag(6, value.getIndex_options_discount());
                }
                if (value.getFutures_discount() != FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED) {
                    size += FuturesDiscountFeature.ADAPTER.encodedSizeWithTag(7, value.getFutures_discount());
                }
                int iEncodedSizeWithTag = size + CreditCardBoostedCashbackFeature.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getCredit_card_boosted_cashback()) + CreditCardCLIFeature.ADAPTER.asRepeated().encodedSizeWithTag(9, value.getCredit_card_cli());
                return value.getBoosted_acats_match() != BoostedACATsMatchFeature.BOOSTED_ACATS_MATCH_FEATURE_DISABLED ? iEncodedSizeWithTag + BoostedACATsMatchFeature.ADAPTER.encodedSizeWithTag(10, value.getBoosted_acats_match()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionFeatures value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getApy() != APYFeature.APY_FEATURE_DISABLED) {
                    APYFeature.ADAPTER.encodeWithTag(writer, 1, (int) value.getApy());
                }
                if (value.getMargin() != MarginFeature.MARGIN_FEATURE_DISABLED) {
                    MarginFeature.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin());
                }
                if (value.getInstant_deposit() != InstantDepositFeature.INSTANT_DEPOSIT_FEATURE_DISABLED) {
                    InstantDepositFeature.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstant_deposit());
                }
                if (value.getRetirement_match() != RetirementMatchFeature.RETIREMENT_MATCH_FEATURE_DISABLED) {
                    RetirementMatchFeature.ADAPTER.encodeWithTag(writer, 4, (int) value.getRetirement_match());
                }
                if (value.getDeposit_match() != DepositMatchFeature.DEPOSIT_MATCH_FEATURE_DISABLED) {
                    DepositMatchFeature.ADAPTER.encodeWithTag(writer, 5, (int) value.getDeposit_match());
                }
                if (value.getIndex_options_discount() != IndexOptionsDiscountFeature.INDEX_OPTIONS_DISCOUNT_FEATURE_DISABLED) {
                    IndexOptionsDiscountFeature.ADAPTER.encodeWithTag(writer, 6, (int) value.getIndex_options_discount());
                }
                if (value.getFutures_discount() != FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED) {
                    FuturesDiscountFeature.ADAPTER.encodeWithTag(writer, 7, (int) value.getFutures_discount());
                }
                CreditCardBoostedCashbackFeature.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getCredit_card_boosted_cashback());
                CreditCardCLIFeature.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getCredit_card_cli());
                if (value.getBoosted_acats_match() != BoostedACATsMatchFeature.BOOSTED_ACATS_MATCH_FEATURE_DISABLED) {
                    BoostedACATsMatchFeature.ADAPTER.encodeWithTag(writer, 10, (int) value.getBoosted_acats_match());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionFeatures value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBoosted_acats_match() != BoostedACATsMatchFeature.BOOSTED_ACATS_MATCH_FEATURE_DISABLED) {
                    BoostedACATsMatchFeature.ADAPTER.encodeWithTag(writer, 10, (int) value.getBoosted_acats_match());
                }
                CreditCardCLIFeature.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getCredit_card_cli());
                CreditCardBoostedCashbackFeature.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getCredit_card_boosted_cashback());
                if (value.getFutures_discount() != FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED) {
                    FuturesDiscountFeature.ADAPTER.encodeWithTag(writer, 7, (int) value.getFutures_discount());
                }
                if (value.getIndex_options_discount() != IndexOptionsDiscountFeature.INDEX_OPTIONS_DISCOUNT_FEATURE_DISABLED) {
                    IndexOptionsDiscountFeature.ADAPTER.encodeWithTag(writer, 6, (int) value.getIndex_options_discount());
                }
                if (value.getDeposit_match() != DepositMatchFeature.DEPOSIT_MATCH_FEATURE_DISABLED) {
                    DepositMatchFeature.ADAPTER.encodeWithTag(writer, 5, (int) value.getDeposit_match());
                }
                if (value.getRetirement_match() != RetirementMatchFeature.RETIREMENT_MATCH_FEATURE_DISABLED) {
                    RetirementMatchFeature.ADAPTER.encodeWithTag(writer, 4, (int) value.getRetirement_match());
                }
                if (value.getInstant_deposit() != InstantDepositFeature.INSTANT_DEPOSIT_FEATURE_DISABLED) {
                    InstantDepositFeature.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstant_deposit());
                }
                if (value.getMargin() != MarginFeature.MARGIN_FEATURE_DISABLED) {
                    MarginFeature.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin());
                }
                if (value.getApy() != APYFeature.APY_FEATURE_DISABLED) {
                    APYFeature.ADAPTER.encodeWithTag(writer, 1, (int) value.getApy());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeatures decode(ProtoReader reader) throws IOException {
                APYFeature aPYFeature;
                MarginFeature marginFeature;
                InstantDepositFeature instantDepositFeature;
                Intrinsics.checkNotNullParameter(reader, "reader");
                APYFeature aPYFeature2 = APYFeature.APY_FEATURE_DISABLED;
                MarginFeature marginFeature2 = MarginFeature.MARGIN_FEATURE_DISABLED;
                InstantDepositFeature instantDepositFeature2 = InstantDepositFeature.INSTANT_DEPOSIT_FEATURE_DISABLED;
                RetirementMatchFeature retirementMatchFeature = RetirementMatchFeature.RETIREMENT_MATCH_FEATURE_DISABLED;
                DepositMatchFeature depositMatchFeature = DepositMatchFeature.DEPOSIT_MATCH_FEATURE_DISABLED;
                IndexOptionsDiscountFeature indexOptionsDiscountFeature = IndexOptionsDiscountFeature.INDEX_OPTIONS_DISCOUNT_FEATURE_DISABLED;
                FuturesDiscountFeature futuresDiscountFeature = FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                BoostedACATsMatchFeature boostedACATsMatchFeature = BoostedACATsMatchFeature.BOOSTED_ACATS_MATCH_FEATURE_DISABLED;
                long jBeginMessage = reader.beginMessage();
                BoostedACATsMatchFeature boostedACATsMatchFeatureDecode = boostedACATsMatchFeature;
                FuturesDiscountFeature futuresDiscountFeatureDecode = futuresDiscountFeature;
                IndexOptionsDiscountFeature indexOptionsDiscountFeatureDecode = indexOptionsDiscountFeature;
                DepositMatchFeature depositMatchFeatureDecode = depositMatchFeature;
                RetirementMatchFeature retirementMatchFeatureDecode = retirementMatchFeature;
                InstantDepositFeature instantDepositFeatureDecode = instantDepositFeature2;
                MarginFeature marginFeatureDecode = marginFeature2;
                APYFeature aPYFeatureDecode = aPYFeature2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    aPYFeatureDecode = APYFeature.ADAPTER.decode(reader);
                                    instantDepositFeatureDecode = instantDepositFeature;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                marginFeatureDecode = marginFeature;
                                break;
                            case 2:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    marginFeatureDecode = MarginFeature.ADAPTER.decode(reader);
                                    instantDepositFeatureDecode = instantDepositFeature;
                                    aPYFeatureDecode = aPYFeature;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    instantDepositFeatureDecode = InstantDepositFeature.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 4:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    retirementMatchFeatureDecode = RetirementMatchFeature.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 5:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    depositMatchFeatureDecode = DepositMatchFeature.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 6:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                try {
                                    indexOptionsDiscountFeatureDecode = IndexOptionsDiscountFeature.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 7:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                try {
                                    futuresDiscountFeatureDecode = FuturesDiscountFeature.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    instantDepositFeature = instantDepositFeatureDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                    break;
                                }
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 8:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                arrayList.add(CreditCardBoostedCashbackFeature.ADAPTER.decode(reader));
                                instantDepositFeature = instantDepositFeatureDecode;
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 9:
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                arrayList2.add(CreditCardCLIFeature.ADAPTER.decode(reader));
                                instantDepositFeature = instantDepositFeatureDecode;
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                            case 10:
                                try {
                                    boostedACATsMatchFeatureDecode = BoostedACATsMatchFeature.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                    aPYFeature = aPYFeatureDecode;
                                    marginFeature = marginFeatureDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                aPYFeature = aPYFeatureDecode;
                                marginFeature = marginFeatureDecode;
                                instantDepositFeature = instantDepositFeatureDecode;
                                instantDepositFeatureDecode = instantDepositFeature;
                                aPYFeatureDecode = aPYFeature;
                                marginFeatureDecode = marginFeature;
                                break;
                        }
                    } else {
                        return new SubscriptionFeatures(aPYFeatureDecode, marginFeatureDecode, instantDepositFeatureDecode, retirementMatchFeatureDecode, depositMatchFeatureDecode, indexOptionsDiscountFeatureDecode, futuresDiscountFeatureDecode, arrayList, arrayList2, boostedACATsMatchFeatureDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeatures redact(SubscriptionFeatures value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SubscriptionFeatures.copy$default(value, null, null, null, null, null, null, null, Internal.m26823redactElements(value.getCredit_card_boosted_cashback(), CreditCardBoostedCashbackFeature.ADAPTER), Internal.m26823redactElements(value.getCredit_card_cli(), CreditCardCLIFeature.ADAPTER), null, ByteString.EMPTY, 639, null);
            }
        };
    }
}
