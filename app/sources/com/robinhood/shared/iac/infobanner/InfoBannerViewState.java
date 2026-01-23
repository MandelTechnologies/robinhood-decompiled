package com.robinhood.shared.iac.infobanner;

import com.robinhood.models.p320db.IacInfoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoBannerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState;", "", "None", "Loaded", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState$Loaded;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState$None;", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InfoBannerViewState {

    /* compiled from: InfoBannerViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState$None;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class None implements InfoBannerViewState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -1058047055;
        }

        public String toString() {
            return "None";
        }

        private None() {
        }
    }

    /* compiled from: InfoBannerViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState$Loaded;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState;", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "<init>", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "getInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InfoBannerViewState {
        public static final int $stable = 8;
        private final IacInfoBanner infoBanner;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, IacInfoBanner iacInfoBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                iacInfoBanner = loaded.infoBanner;
            }
            return loaded.copy(iacInfoBanner);
        }

        /* renamed from: component1, reason: from getter */
        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }

        public final Loaded copy(IacInfoBanner infoBanner) {
            Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
            return new Loaded(infoBanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.infoBanner, ((Loaded) other).infoBanner);
        }

        public int hashCode() {
            return this.infoBanner.hashCode();
        }

        public String toString() {
            return "Loaded(infoBanner=" + this.infoBanner + ")";
        }

        public Loaded(IacInfoBanner infoBanner) {
            Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
            this.infoBanner = infoBanner;
        }

        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }
    }
}
