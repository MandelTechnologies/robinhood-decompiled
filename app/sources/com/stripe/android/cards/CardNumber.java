package com.stripe.android.cards;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CardNumber.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/cards/CardNumber;", "", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber$Validated;", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class CardNumber {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> DEFAULT_SPACE_POSITIONS = SetsKt.setOf((Object[]) new Integer[]{4, 9, 14});
    private static final Map<Integer, Set<Integer>> SPACE_POSITIONS = MapsKt.mapOf(Tuples4.m3642to(14, SetsKt.setOf((Object[]) new Integer[]{4, 11})), Tuples4.m3642to(15, SetsKt.setOf((Object[]) new Integer[]{4, 11})), Tuples4.m3642to(16, SetsKt.setOf((Object[]) new Integer[]{4, 9, 14})), Tuples4.m3642to(19, SetsKt.setOf((Object[]) new Integer[]{4, 9, 14, 19})));

    public /* synthetic */ CardNumber(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardNumber() {
    }

    /* compiled from: CardNumber.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b(\u0010\u0012¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber;", "", "denormalized", "<init>", "(Ljava/lang/String;)V", "", "panLength", "formatNumber", "(I)Ljava/lang/String;", "Lcom/stripe/android/cards/CardNumber$Validated;", "validate", "(I)Lcom/stripe/android/cards/CardNumber$Validated;", "getFormatted", "", "isPartialEntry", "(I)Z", "isPossibleCardBrand", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "normalized", "getNormalized", "length", "I", "getLength", "isMaxLength", "Z", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "isValidLuhn", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Unvalidated extends CardNumber {
        private static final Companion Companion = new Companion(null);
        private static final Set<Character> REJECT_CHARS = SetsKt.setOf((Object[]) new Character[]{'-', ' '});
        private final Bin bin;
        private final String denormalized;
        private final boolean isMaxLength;
        private final boolean isValidLuhn;
        private final int length;
        private final String normalized;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unvalidated) && Intrinsics.areEqual(this.denormalized, ((Unvalidated) other).denormalized);
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.denormalized + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) throws IOException {
            super(null);
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < denormalized.length(); i++) {
                char cCharAt = denormalized.charAt(i);
                if (!REJECT_CHARS.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.normalized = string2;
            int length = string2.length();
            this.length = length;
            this.isMaxLength = length == 19;
            this.bin = Bin.INSTANCE.create(string2);
            this.isValidLuhn = CardUtils.INSTANCE.isValidLuhnNumber(string2);
        }

        public final String getNormalized() {
            return this.normalized;
        }

        public final int getLength() {
            return this.length;
        }

        /* renamed from: isMaxLength, reason: from getter */
        public final boolean getIsMaxLength() {
            return this.isMaxLength;
        }

        public final Bin getBin() {
            return this.bin;
        }

        /* renamed from: isValidLuhn, reason: from getter */
        public final boolean getIsValidLuhn() {
            return this.isValidLuhn;
        }

        public final Validated validate(int panLength) {
            if (panLength >= 14 && this.normalized.length() == panLength && this.isValidLuhn) {
                return new Validated(this.normalized);
            }
            return null;
        }

        public final String getFormatted(int panLength) {
            return formatNumber(panLength);
        }

        private final String formatNumber(int panLength) {
            Set<Integer> spacePositions = CardNumber.INSTANCE.getSpacePositions(panLength);
            String strTake = StringsKt.take(this.normalized, panLength);
            int size = spacePositions.size() + 1;
            String[] strArr = new String[size];
            int length = strTake.length();
            int i = 0;
            int i2 = 0;
            for (Object obj : CollectionsKt.sorted(CollectionsKt.toList(spacePositions))) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue() - i;
                if (length > iIntValue) {
                    String strSubstring = strTake.substring(i2, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    strArr[i] = strSubstring;
                    i2 = iIntValue;
                }
                i = i3;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (strArr[i4] == null) {
                    break;
                }
                i4++;
            }
            Integer numValueOf = Integer.valueOf(i4);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                String strSubstring2 = strTake.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strArr[iIntValue2] = strSubstring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < size; i5++) {
                String str = strArr[i5];
                if (str == null) {
                    break;
                }
                arrayList.add(str);
            }
            return CollectionsKt.joinToString$default(arrayList, PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
        }

        public final boolean isPartialEntry(int panLength) {
            return (this.normalized.length() == panLength || StringsKt.isBlank(this.normalized)) ? false : true;
        }

        public final boolean isPossibleCardBrand() {
            return (StringsKt.isBlank(this.normalized) || CollectionsKt.first((List) CardBrand.INSTANCE.getCardBrands(this.normalized)) == CardBrand.Unknown) ? false : true;
        }

        /* compiled from: CardNumber.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated$Companion;", "", "()V", "REJECT_CHARS", "", "", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: CardNumber.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/cards/CardNumber$Validated;", "Lcom/stripe/android/cards/CardNumber;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Validated extends CardNumber {
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Validated) && Intrinsics.areEqual(this.value, ((Validated) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.value + ")";
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* compiled from: CardNumber.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/cards/CardNumber$Companion;", "", "()V", "DEFAULT_PAN_LENGTH", "", "DEFAULT_SPACE_POSITIONS", "", "MAX_PAN_LENGTH", "MIN_PAN_LENGTH", "SPACE_POSITIONS", "", "getSpacePositions", "panLength", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<Integer> getSpacePositions(int panLength) {
            Set<Integer> set = (Set) CardNumber.SPACE_POSITIONS.get(Integer.valueOf(panLength));
            return set == null ? CardNumber.DEFAULT_SPACE_POSITIONS : set;
        }
    }
}
