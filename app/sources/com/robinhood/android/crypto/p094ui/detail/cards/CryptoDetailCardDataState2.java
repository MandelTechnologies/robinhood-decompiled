package com.robinhood.android.crypto.p094ui.detail.cards;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailCardDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CardState;", "T", "", "<init>", "()V", "Loaded", "DoNotShow", "Lcom/robinhood/android/crypto/ui/detail/cards/CardState$DoNotShow;", "Lcom/robinhood/android/crypto/ui/detail/cards/CardState$Loaded;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CardState, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class CryptoDetailCardDataState2<T> {
    public static final int $stable = 0;

    public /* synthetic */ CryptoDetailCardDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoDetailCardDataState2() {
    }

    /* compiled from: CryptoDetailCardDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CardState$Loaded;", "T", "Lcom/robinhood/android/crypto/ui/detail/cards/CardState;", "card", "<init>", "(Ljava/lang/Object;)V", "getCard", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/android/crypto/ui/detail/cards/CardState$Loaded;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CardState$Loaded, reason: from toString */
    public static final /* data */ class Loaded<T> extends CryptoDetailCardDataState2<T> {
        public static final int $stable = 0;
        private final T card;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loaded.card;
            }
            return loaded.copy(obj);
        }

        public final T component1() {
            return this.card;
        }

        public final Loaded<T> copy(T card) {
            return new Loaded<>(card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.card, ((Loaded) other).card);
        }

        public int hashCode() {
            T t = this.card;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Loaded(card=" + this.card + ")";
        }

        public Loaded(T t) {
            super(null);
            this.card = t;
        }

        public final T getCard() {
            return this.card;
        }
    }

    /* compiled from: CryptoDetailCardDataState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CardState$DoNotShow;", "Lcom/robinhood/android/crypto/ui/detail/cards/CardState;", "", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CardState$DoNotShow */
    public static final /* data */ class DoNotShow extends CryptoDetailCardDataState2 {
        public static final int $stable = 0;
        public static final DoNotShow INSTANCE = new DoNotShow();

        public boolean equals(Object other) {
            return this == other || (other instanceof DoNotShow);
        }

        public int hashCode() {
            return 1384302897;
        }

        public String toString() {
            return "DoNotShow";
        }

        private DoNotShow() {
            super(null);
        }
    }
}
