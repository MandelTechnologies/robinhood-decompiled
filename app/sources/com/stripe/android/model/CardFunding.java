package com.stripe.android.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardFunding.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/CardFunding;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Credit", "Debit", "Prepaid", "Unknown", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CardFunding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardFunding[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CardFunding Credit = new CardFunding("Credit", 0, "credit");
    public static final CardFunding Debit = new CardFunding("Debit", 1, "debit");
    public static final CardFunding Prepaid = new CardFunding("Prepaid", 2, "prepaid");
    public static final CardFunding Unknown = new CardFunding("Unknown", 3, "unknown");
    private final String code;

    private static final /* synthetic */ CardFunding[] $values() {
        return new CardFunding[]{Credit, Debit, Prepaid, Unknown};
    }

    public static EnumEntries<CardFunding> getEntries() {
        return $ENTRIES;
    }

    public static CardFunding valueOf(String str) {
        return (CardFunding) Enum.valueOf(CardFunding.class, str);
    }

    public static CardFunding[] values() {
        return (CardFunding[]) $VALUES.clone();
    }

    private CardFunding(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        CardFunding[] cardFundingArr$values = $values();
        $VALUES = cardFundingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cardFundingArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CardFunding.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/CardFunding$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/CardFunding;", "code", "", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardFunding fromCode(String code) {
            CardFunding next;
            Iterator<CardFunding> it = CardFunding.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getCode(), code)) {
                    break;
                }
            }
            return next;
        }
    }
}
