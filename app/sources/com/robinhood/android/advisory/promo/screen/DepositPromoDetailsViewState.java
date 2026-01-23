package com.robinhood.android.advisory.promo.screen;

import com.robinhood.models.advisory.p304db.promo.PromoDetailsScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DepositPromoDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Error;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Loading;", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DepositPromoDetailsViewState {

    /* compiled from: DepositPromoDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Loading;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements DepositPromoDetailsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -275000949;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: DepositPromoDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Error;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements DepositPromoDetailsViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 882739735;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: DepositPromoDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/advisory/db/promo/PromoDetailsScreen;", "<init>", "(Lcom/robinhood/models/advisory/db/promo/PromoDetailsScreen;)V", "getDetails", "()Lcom/robinhood/models/advisory/db/promo/PromoDetailsScreen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DepositPromoDetailsViewState {
        public static final int $stable = 8;
        private final PromoDetailsScreen details;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, PromoDetailsScreen promoDetailsScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                promoDetailsScreen = loaded.details;
            }
            return loaded.copy(promoDetailsScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final PromoDetailsScreen getDetails() {
            return this.details;
        }

        public final Loaded copy(PromoDetailsScreen details) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new Loaded(details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.details, ((Loaded) other).details);
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return "Loaded(details=" + this.details + ")";
        }

        public Loaded(PromoDetailsScreen details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        public final PromoDetailsScreen getDetails() {
            return this.details;
        }
    }
}
