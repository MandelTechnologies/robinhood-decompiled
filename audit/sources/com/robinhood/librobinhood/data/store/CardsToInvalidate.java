package com.robinhood.librobinhood.data.store;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailIacHeroCardInvalidator.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CardsToInvalidate;", "", "cardIdentifiers", "", "", "<init>", "(Ljava/util/Set;)V", "getCardIdentifiers", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardsToInvalidate {
    private final Set<String> cardIdentifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardsToInvalidate copy$default(CardsToInvalidate cardsToInvalidate, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = cardsToInvalidate.cardIdentifiers;
        }
        return cardsToInvalidate.copy(set);
    }

    public final Set<String> component1() {
        return this.cardIdentifiers;
    }

    public final CardsToInvalidate copy(Set<String> cardIdentifiers) {
        Intrinsics.checkNotNullParameter(cardIdentifiers, "cardIdentifiers");
        return new CardsToInvalidate(cardIdentifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardsToInvalidate) && Intrinsics.areEqual(this.cardIdentifiers, ((CardsToInvalidate) other).cardIdentifiers);
    }

    public int hashCode() {
        return this.cardIdentifiers.hashCode();
    }

    public String toString() {
        return "CardsToInvalidate(cardIdentifiers=" + this.cardIdentifiers + ")";
    }

    public CardsToInvalidate(Set<String> cardIdentifiers) {
        Intrinsics.checkNotNullParameter(cardIdentifiers, "cardIdentifiers");
        this.cardIdentifiers = cardIdentifiers;
    }

    public final Set<String> getCardIdentifiers() {
        return this.cardIdentifiers;
    }
}
