package com.stripe.android.model.parsers;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.wallets.Wallet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* compiled from: PaymentMethodJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AuBecsDebitJsonParser", "BacsDebitJsonParser", "BillingDetails", "CardJsonParser", "Companion", "FpxJsonParser", "IdealJsonParser", "NetbankingJsonParser", "SepaDebitJsonParser", "SofortJsonParser", "USBankAccountJsonParser", "UpiJsonParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PaymentMethodJsonParser implements ModelJsonParser<PaymentMethod> {
    private static final Companion Companion = new Companion(null);

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Ideal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.Type.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.Type.Upi.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.Type.Netbanking.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethod parse(JSONObject json) {
        PaymentMethod.AllowRedisplay allowRedisplay;
        PaymentMethod.AllowRedisplay next;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "type");
        PaymentMethod.Type typeFromCode = PaymentMethod.Type.INSTANCE.fromCode(strOptString);
        PaymentMethod.Builder created = new PaymentMethod.Builder().setId(StripeJsonUtils.optString(json, "id")).setType(typeFromCode).setCode(strOptString).setCreated(StripeJsonUtils.INSTANCE.optLong(json, "created"));
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("billing_details");
        PaymentMethod.Builder billingDetails = created.setBillingDetails(jSONObjectOptJSONObject != null ? new BillingDetails().parse(jSONObjectOptJSONObject) : null);
        String strOptString2 = StripeJsonUtils.optString(json, "allow_redisplay");
        if (strOptString2 != null) {
            Iterator<PaymentMethod.AllowRedisplay> it = PaymentMethod.AllowRedisplay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(strOptString2, next.getValue())) {
                    break;
                }
            }
            allowRedisplay = next;
        } else {
            allowRedisplay = null;
        }
        PaymentMethod.Builder liveMode = billingDetails.setAllowRedisplay(allowRedisplay).setCustomerId(StripeJsonUtils.optString(json, "customer")).setLiveMode(json.optBoolean("livemode"));
        switch (typeFromCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeFromCode.ordinal()]) {
            case 1:
                JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(typeFromCode.code);
                liveMode.setCard(jSONObjectOptJSONObject2 != null ? new CardJsonParser().parse(jSONObjectOptJSONObject2) : null);
                break;
            case 2:
                liveMode.setCardPresent(PaymentMethod.CardPresent.INSTANCE.getEMPTY$payments_core_release());
                break;
            case 3:
                JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(typeFromCode.code);
                liveMode.setIdeal(jSONObjectOptJSONObject3 != null ? new IdealJsonParser().parse(jSONObjectOptJSONObject3) : null);
                break;
            case 4:
                JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(typeFromCode.code);
                liveMode.setFpx(jSONObjectOptJSONObject4 != null ? new FpxJsonParser().parse(jSONObjectOptJSONObject4) : null);
                break;
            case 5:
                JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(typeFromCode.code);
                liveMode.setSepaDebit(jSONObjectOptJSONObject5 != null ? new SepaDebitJsonParser().parse(jSONObjectOptJSONObject5) : null);
                break;
            case 6:
                JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(typeFromCode.code);
                liveMode.setAuBecsDebit(jSONObjectOptJSONObject6 != null ? new AuBecsDebitJsonParser().parse(jSONObjectOptJSONObject6) : null);
                break;
            case 7:
                JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(typeFromCode.code);
                liveMode.setBacsDebit(jSONObjectOptJSONObject7 != null ? new BacsDebitJsonParser().parse(jSONObjectOptJSONObject7) : null);
                break;
            case 8:
                JSONObject jSONObjectOptJSONObject8 = json.optJSONObject(typeFromCode.code);
                liveMode.setSofort(jSONObjectOptJSONObject8 != null ? new SofortJsonParser().parse(jSONObjectOptJSONObject8) : null);
                break;
            case 9:
                JSONObject jSONObjectOptJSONObject9 = json.optJSONObject(typeFromCode.code);
                liveMode.setUpi(jSONObjectOptJSONObject9 != null ? new UpiJsonParser().parse(jSONObjectOptJSONObject9) : null);
                break;
            case 10:
                JSONObject jSONObjectOptJSONObject10 = json.optJSONObject(typeFromCode.code);
                liveMode.setNetbanking(jSONObjectOptJSONObject10 != null ? new NetbankingJsonParser().parse(jSONObjectOptJSONObject10) : null);
                break;
            case 11:
                JSONObject jSONObjectOptJSONObject11 = json.optJSONObject(typeFromCode.code);
                liveMode.setUSBankAccount(jSONObjectOptJSONObject11 != null ? new USBankAccountJsonParser().parse(jSONObjectOptJSONObject11) : null);
                break;
        }
        return liveMode.build();
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BillingDetails implements ModelJsonParser<PaymentMethod.BillingDetails> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BillingDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            return new PaymentMethod.BillingDetails(jSONObjectOptJSONObject != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject) : null, StripeJsonUtils.optString(json, "email"), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "ChecksJsonParser", "Companion", "NetworksJsonParser", "ThreeDSecureUsageJsonParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CardJsonParser implements ModelJsonParser<PaymentMethod.Card> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Card parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            CardBrand cardBrandFromCode = CardBrand.INSTANCE.fromCode(StripeJsonUtils.optString(json, "brand"));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("checks");
            PaymentMethod.Card.Checks checks = jSONObjectOptJSONObject != null ? new ChecksJsonParser().parse(jSONObjectOptJSONObject) : null;
            String strOptString = StripeJsonUtils.optString(json, PlaceTypes.COUNTRY);
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer numOptInteger = stripeJsonUtils.optInteger(json, "exp_month");
            Integer numOptInteger2 = stripeJsonUtils.optInteger(json, "exp_year");
            String strOptString2 = StripeJsonUtils.optString(json, "fingerprint");
            String strOptString3 = StripeJsonUtils.optString(json, "funding");
            String strOptString4 = StripeJsonUtils.optString(json, "last4");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("three_d_secure_usage");
            PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage = jSONObjectOptJSONObject2 != null ? new ThreeDSecureUsageJsonParser().parse(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("wallet");
            Wallet wallet = jSONObjectOptJSONObject3 != null ? new WalletJsonParser().parse(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("networks");
            return new PaymentMethod.Card(cardBrandFromCode, checks, strOptString, numOptInteger, numOptInteger2, strOptString2, strOptString3, strOptString4, threeDSecureUsage, wallet, jSONObjectOptJSONObject4 != null ? new NetworksJsonParser().parse(jSONObjectOptJSONObject4) : null, StripeJsonUtils.optString(json, "display_brand"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class ChecksJsonParser implements ModelJsonParser<PaymentMethod.Card.Checks> {
            private static final Companion Companion = new Companion(null);

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Checks parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.Checks(StripeJsonUtils.optString(json, "address_line1_check"), StripeJsonUtils.optString(json, "address_postal_code_check"), StripeJsonUtils.optString(json, "cvc_check"));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_LINE1_CHECK", "", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class ThreeDSecureUsageJsonParser implements ModelJsonParser<PaymentMethod.Card.ThreeDSecureUsage> {
            private static final Companion Companion = new Companion(null);

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.ThreeDSecureUsage parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(StripeJsonUtils.INSTANCE.optBoolean(json, "supported"));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser$Companion;", "", "()V", "FIELD_IS_SUPPORTED", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class NetworksJsonParser implements ModelJsonParser<PaymentMethod.Card.Networks> {
            private static final Companion Companion = new Companion(null);

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Networks parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                List listJsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(json.optJSONArray("available"));
                if (listJsonArrayToList == null) {
                    listJsonArrayToList = CollectionsKt.emptyList();
                }
                List list = listJsonArrayToList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new PaymentMethod.Card.Networks(CollectionsKt.toSet(arrayList), StripeJsonUtils.INSTANCE.optBoolean(json, "selection_mandatory"), StripeJsonUtils.optString(json, "preferred"));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser$Companion;", "", "()V", "FIELD_AVAIABLE", "", "FIELD_PREFERRED", "FIELD_SELECTION_MANDATORY", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$Companion;", "", "()V", "FIELD_BRAND", "", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_DISPLAY_BRAND", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class IdealJsonParser implements ModelJsonParser<PaymentMethod.Ideal> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Ideal parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Ideal(StripeJsonUtils.optString(json, "bank"), StripeJsonUtils.optString(json, "bic"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "FIELD_BIC", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class FpxJsonParser implements ModelJsonParser<PaymentMethod.Fpx> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Fpx parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Fpx(StripeJsonUtils.optString(json, "bank"), StripeJsonUtils.optString(json, "account_holder_type"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_BANK", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class NetbankingJsonParser implements ModelJsonParser<PaymentMethod.Netbanking> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Netbanking parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Netbanking(StripeJsonUtils.optString(json, "bank"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class USBankAccountJsonParser implements ModelJsonParser<PaymentMethod.USBankAccount> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.USBankAccount parse(JSONObject json) {
            PaymentMethod.USBankAccount.USBankAccountHolderType next;
            PaymentMethod.USBankAccount.USBankAccountType next2;
            PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
            Intrinsics.checkNotNullParameter(json, "json");
            Iterator<PaymentMethod.USBankAccount.USBankAccountHolderType> it = PaymentMethod.USBankAccount.USBankAccountHolderType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, "account_holder_type"), next.getValue())) {
                    break;
                }
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = next;
            if (uSBankAccountHolderType == null) {
                uSBankAccountHolderType = PaymentMethod.USBankAccount.USBankAccountHolderType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType2 = uSBankAccountHolderType;
            Iterator<PaymentMethod.USBankAccount.USBankAccountType> it2 = PaymentMethod.USBankAccount.USBankAccountType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, InstantCashConstants.ACCOUNT_TYPE_KEY), next2.getValue())) {
                    break;
                }
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = next2;
            if (uSBankAccountType == null) {
                uSBankAccountType = PaymentMethod.USBankAccount.USBankAccountType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType;
            String strOptString = StripeJsonUtils.optString(json, "bank_name");
            String strOptString2 = StripeJsonUtils.optString(json, "fingerprint");
            String strOptString3 = StripeJsonUtils.optString(json, "last4");
            String strOptString4 = StripeJsonUtils.optString(json, "financial_connections_account");
            if (json.has("networks")) {
                String strOptString5 = StripeJsonUtils.optString(json.optJSONObject("networks"), "preferred");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                JSONObject jSONObjectOptJSONObject = json.optJSONObject("networks");
                List listJsonArrayToList = stripeJsonUtils.jsonArrayToList(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getJSONArray("supported") : null);
                if (listJsonArrayToList == null) {
                    listJsonArrayToList = CollectionsKt.emptyList();
                }
                List list = listJsonArrayToList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                uSBankNetworks = new PaymentMethod.USBankAccount.USBankNetworks(strOptString5, arrayList);
            } else {
                uSBankNetworks = null;
            }
            return new PaymentMethod.USBankAccount(uSBankAccountHolderType2, uSBankAccountType2, strOptString, strOptString2, strOptString3, strOptString4, uSBankNetworks, StripeJsonUtils.optString(json, "routing_number"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_ACCOUNT_TYPE", "FIELD_BANK_NAME", "FIELD_FINANCIAL_CONNECTIONS_ACCOUNT", "FIELD_FINGERPRINT", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_NETWORKS_PREFERRED", "FIELD_NETWORKS_SUPPORTED", "FIELD_ROUTING_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SepaDebitJsonParser implements ModelJsonParser<PaymentMethod.SepaDebit> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.SepaDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.SepaDebit(StripeJsonUtils.optString(json, "bank_code"), StripeJsonUtils.optString(json, "branch_code"), StripeJsonUtils.optString(json, PlaceTypes.COUNTRY), StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser$Companion;", "", "()V", "FIELD_BANK_CODE", "", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AuBecsDebitJsonParser implements ModelJsonParser<PaymentMethod.AuBecsDebit> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.AuBecsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.AuBecsDebit(StripeJsonUtils.optString(json, "bsb_number"), StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser$Companion;", "", "()V", "FIELD_BSB_NUMBER", "", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BacsDebitJsonParser implements ModelJsonParser<PaymentMethod.BacsDebit> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BacsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.BacsDebit(StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"), StripeJsonUtils.optString(json, "sort_code"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser$Companion;", "", "()V", "FIELD_FINGERPRINT", "", "FIELD_LAST4", "FIELD_SORT_CODE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SofortJsonParser implements ModelJsonParser<PaymentMethod.Sofort> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Sofort parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Sofort(StripeJsonUtils.optString(json, PlaceTypes.COUNTRY));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser$Companion;", "", "()V", "FIELD_COUNTRY", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UpiJsonParser implements ModelJsonParser<PaymentMethod.Upi> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Upi parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Upi(StripeJsonUtils.optString(json, "vpa"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser$Companion;", "", "()V", "FIELD_VPA", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$Companion;", "", "()V", "FIELD_ALLOW_REDISPLAY", "", "FIELD_BILLING_DETAILS", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
