package com.stripe.android.model;

import com.robinhood.android.common.util.TransitionReason;
import com.stripe.android.cards.CardNumber;
import com.stripe.payments.model.R$drawable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardBrand.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0097\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0003J\u0010\u0010%\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, m3636d2 = {"Lcom/stripe/android/model/CardBrand;", "", "code", "", "displayName", "icon", "", "cvcIcon", "errorIcon", "cvcLength", "", "defaultMaxLength", "pattern", "Ljava/util/regex/Pattern;", "partialPatterns", "", "variantMaxLength", "shouldRender", "", "renderingOrder", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;ZI)V", "getCode", "()Ljava/lang/String;", "getCvcIcon", "()I", "getCvcLength", "()Ljava/util/Set;", "getDisplayName", "getErrorIcon", "getIcon", "maxCvcLength", "getMaxCvcLength", "getMaxLengthForCardNumber", "cardNumber", "getPatternForLength", "isMaxCvc", "cvcText", "isValidCardNumberLength", "isValidCvc", "cvc", "Visa", "MasterCard", "AmericanExpress", "Discover", "JCB", "DinersClub", "UnionPay", "CartesBancaires", "Unknown", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CardBrand {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardBrand[] $VALUES;
    public static final CardBrand AmericanExpress;
    public static final CardBrand CartesBancaires;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CardBrand DinersClub;
    public static final CardBrand Discover;
    public static final CardBrand JCB;
    public static final CardBrand UnionPay;
    public static final CardBrand Unknown;
    private static final List<CardBrand> orderedBrands;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final int renderingOrder;
    private final boolean shouldRender;
    private final Map<Pattern, Integer> variantMaxLength;
    public static final CardBrand Visa = new CardBrand("Visa", 0, "visa", "Visa", R$drawable.stripe_ic_visa, 0, 0, null, 0, Pattern.compile("^(4)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^4$"))), null, false, 1, 1656, null);
    public static final CardBrand MasterCard = new CardBrand("MasterCard", 1, "mastercard", "Mastercard", R$drawable.stripe_ic_mastercard, 0, 0, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^2|5|6$")), Tuples4.m3642to(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 2, 1656, null);

    private static final /* synthetic */ CardBrand[] $values() {
        return new CardBrand[]{Visa, MasterCard, AmericanExpress, Discover, JCB, DinersClub, UnionPay, CartesBancaires, Unknown};
    }

    public static EnumEntries<CardBrand> getEntries() {
        return $ENTRIES;
    }

    public static CardBrand valueOf(String str) {
        return (CardBrand) Enum.valueOf(CardBrand.class, str);
    }

    public static CardBrand[] values() {
        return (CardBrand[]) $VALUES.clone();
    }

    private CardBrand(String str, int i, String str2, String str3, int i2, int i3, int i4, Set set, int i5, Pattern pattern, Map map, Map map2, boolean z, int i6) {
        this.code = str2;
        this.displayName = str3;
        this.icon = i2;
        this.cvcIcon = i3;
        this.errorIcon = i4;
        this.cvcLength = set;
        this.defaultMaxLength = i5;
        this.pattern = pattern;
        this.partialPatterns = map;
        this.variantMaxLength = map2;
        this.shouldRender = z;
        this.renderingOrder = i6;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getIcon() {
        return this.icon;
    }

    /* synthetic */ CardBrand(String str, int i, String str2, String str3, int i2, int i3, int i4, Set set, int i5, Pattern pattern, Map map, Map map2, boolean z, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, i2, (i7 & 8) != 0 ? R$drawable.stripe_ic_cvc : i3, (i7 & 16) != 0 ? R$drawable.stripe_ic_error : i4, (i7 & 32) != 0 ? SetsKt.setOf(3) : set, (i7 & 64) != 0 ? 16 : i5, (i7 & 128) != 0 ? null : pattern, map, (i7 & 512) != 0 ? MapsKt.emptyMap() : map2, (i7 & 1024) != 0 ? true : z, i6);
    }

    public final int getCvcIcon() {
        return this.cvcIcon;
    }

    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public final Set<Integer> getCvcLength() {
        return this.cvcLength;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        AmericanExpress = new CardBrand("AmericanExpress", 2, "amex", "American Express", R$drawable.stripe_ic_amex, R$drawable.stripe_ic_cvc_amex, i, SetsKt.setOf((Object[]) new Integer[]{3, 4}), 15, Pattern.compile("^(34|37)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^3$"))), null, false, 3, 1552, null);
        int i2 = 0;
        Discover = new CardBrand("Discover", 3, TransitionReason.OPTION_TRADE_DISCOVER, "Discover", R$drawable.stripe_ic_discover, i, i2, null, 0, Pattern.compile("^(60|64|65)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^6$"))), null, false, 4, 1656, null);
        int i3 = 0;
        JCB = new CardBrand("JCB", 4, "jcb", "JCB", R$drawable.stripe_ic_jcb, i2, i3, null, 0, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^3$")), Tuples4.m3642to(2, Pattern.compile("^(35)$")), Tuples4.m3642to(3, Pattern.compile("^(35[2-8])$"))), null, false, 5, 1656, null);
        int i4 = 0;
        DinersClub = new CardBrand("DinersClub", 5, "diners", "Diners Club", R$drawable.stripe_ic_diners, i3, i4, null, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^3$"))), MapsKt.mapOf(Tuples4.m3642to(Pattern.compile("^(36)[0-9]*$"), 14)), false, 6, 1080, null);
        int i5 = 0;
        UnionPay = new CardBrand("UnionPay", 6, "unionpay", "UnionPay", R$drawable.stripe_ic_unionpay, i4, i5, null, 0, Pattern.compile("^(62|81)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^6|8$"))), null, false, 7, 1656, null);
        CartesBancaires = new CardBrand("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", R$drawable.stripe_ic_cartes_bancaires, i5, 0, null, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), MapsKt.mapOf(Tuples4.m3642to(1, Pattern.compile("^4$")), Tuples4.m3642to(2, Pattern.compile("^2|5|6$")), Tuples4.m3642to(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 8, 632, null);
        Object[] objArr = null == true ? 1 : 0;
        Unknown = new CardBrand("Unknown", 8, "unknown", "Unknown", R$drawable.stripe_ic_unknown, 0, null == true ? 1 : 0, SetsKt.setOf((Object[]) new Integer[]{3, 4}), 0, objArr, MapsKt.emptyMap(), null, false, -1, 1752, null);
        CardBrand[] cardBrandArr$values = $values();
        $VALUES = cardBrandArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cardBrandArr$values);
        INSTANCE = new Companion(null);
        EnumEntries<CardBrand> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (CardBrand cardBrand : entries) {
            if (cardBrand.shouldRender) {
                arrayList.add(cardBrand);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((CardBrand) obj).renderingOrder > 0) {
                arrayList2.add(obj);
            }
        }
        orderedBrands = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.stripe.android.model.CardBrand$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((CardBrand) t).renderingOrder), Integer.valueOf(((CardBrand) t2).renderingOrder));
            }
        });
    }

    public final int getMaxCvcLength() {
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) this.cvcLength);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final boolean isValidCardNumberLength(String cardNumber) {
        return (cardNumber == null || Unknown == this || cardNumber.length() != getMaxLengthForCardNumber(cardNumber)) ? false : true;
    }

    public final boolean isValidCvc(String cvc) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return this.cvcLength.contains(Integer.valueOf(cvc.length()));
    }

    public final boolean isMaxCvc(String cvcText) {
        String string2;
        return getMaxCvcLength() == ((cvcText == null || (string2 = StringsKt.trim(cvcText).toString()) == null) ? 0 : string2.length());
    }

    public final int getMaxLengthForCardNumber(String cardNumber) {
        Object next;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        String normalized = new CardNumber.Unvalidated(cardNumber).getNormalized();
        Iterator<T> it = this.variantMaxLength.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Pattern) ((Map.Entry) next).getKey()).matcher(normalized).matches()) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        return entry != null ? ((Number) entry.getValue()).intValue() : this.defaultMaxLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern getPatternForLength(String cardNumber) {
        Pattern pattern = this.partialPatterns.get(Integer.valueOf(cardNumber.length()));
        return pattern == null ? this.pattern : pattern;
    }

    /* compiled from: CardBrand.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/model/CardBrand$Companion;", "", "<init>", "()V", "", "cardNumber", "", "Lcom/stripe/android/model/CardBrand;", "getMatchingCards", "(Ljava/lang/String;)Ljava/util/List;", "getCardBrands", "code", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;", "orderedBrands", "Ljava/util/List;", "getOrderedBrands", "()Ljava/util/List;", "", "CVC_COMMON_LENGTH", "I", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<CardBrand> getCardBrands(String cardNumber) {
            if (cardNumber == null || StringsKt.isBlank(cardNumber)) {
                return getOrderedBrands();
            }
            List<CardBrand> matchingCards = getMatchingCards(cardNumber);
            if (matchingCards.isEmpty()) {
                matchingCards = null;
            }
            return matchingCards == null ? CollectionsKt.listOf(CardBrand.Unknown) : matchingCards;
        }

        private final List<CardBrand> getMatchingCards(String cardNumber) {
            Matcher matcher;
            EnumEntries<CardBrand> entries = CardBrand.getEntries();
            ArrayList arrayList = new ArrayList();
            for (CardBrand cardBrand : entries) {
                Pattern patternForLength = cardBrand.getPatternForLength(cardNumber);
                if (patternForLength != null && (matcher = patternForLength.matcher(cardNumber)) != null && matcher.matches()) {
                    arrayList.add(cardBrand);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((CardBrand) obj).shouldRender) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        public final CardBrand fromCode(String code) {
            CardBrand next;
            Iterator<CardBrand> it = CardBrand.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.equals(next.getCode(), code, true)) {
                    break;
                }
            }
            CardBrand cardBrand = next;
            return cardBrand == null ? CardBrand.Unknown : cardBrand;
        }

        public final List<CardBrand> getOrderedBrands() {
            return CardBrand.orderedBrands;
        }
    }
}
