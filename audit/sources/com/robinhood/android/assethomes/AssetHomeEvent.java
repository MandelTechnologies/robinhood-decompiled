package com.robinhood.android.assethomes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeEvent;", "", "ShowEducationTour", "Lcom/robinhood/android/assethomes/AssetHomeEvent$ShowEducationTour;", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AssetHomeEvent {

    /* compiled from: AssetHomeEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeEvent$ShowEducationTour;", "Lcom/robinhood/android/assethomes/AssetHomeEvent;", "tourScreenName", "", "<init>", "(Ljava/lang/String;)V", "getTourScreenName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEducationTour implements AssetHomeEvent {
        public static final int $stable = 0;
        private final String tourScreenName;

        public static /* synthetic */ ShowEducationTour copy$default(ShowEducationTour showEducationTour, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showEducationTour.tourScreenName;
            }
            return showEducationTour.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTourScreenName() {
            return this.tourScreenName;
        }

        public final ShowEducationTour copy(String tourScreenName) {
            Intrinsics.checkNotNullParameter(tourScreenName, "tourScreenName");
            return new ShowEducationTour(tourScreenName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEducationTour) && Intrinsics.areEqual(this.tourScreenName, ((ShowEducationTour) other).tourScreenName);
        }

        public int hashCode() {
            return this.tourScreenName.hashCode();
        }

        public String toString() {
            return "ShowEducationTour(tourScreenName=" + this.tourScreenName + ")";
        }

        public ShowEducationTour(String tourScreenName) {
            Intrinsics.checkNotNullParameter(tourScreenName, "tourScreenName");
            this.tourScreenName = tourScreenName;
        }

        public final String getTourScreenName() {
            return this.tourScreenName;
        }
    }
}
