package com.robinhood.android.syp.retirement;

import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SypRetirementUpsellViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState$Loaded;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState$Loading;", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface SypRetirementUpsellViewState {

    /* compiled from: SypRetirementUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState$Loading;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState;", "<init>", "()V", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements SypRetirementUpsellViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: SypRetirementUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState$Loaded;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;", "<init>", "(Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;)V", "getDetails", "()Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements SypRetirementUpsellViewState {
        public static final int $stable = 8;
        private final SypRetirementUpsellDetails details;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, SypRetirementUpsellDetails sypRetirementUpsellDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                sypRetirementUpsellDetails = loaded.details;
            }
            return loaded.copy(sypRetirementUpsellDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final SypRetirementUpsellDetails getDetails() {
            return this.details;
        }

        public final Loaded copy(SypRetirementUpsellDetails details) {
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

        public Loaded(SypRetirementUpsellDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        public final SypRetirementUpsellDetails getDetails() {
            return this.details;
        }
    }
}
