package com.robinhood.android.acatsin.coowner.review;

import com.robinhood.android.acatsin.review.ReviewAcatsInViewState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInCoOwnerReviewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState$Loaded;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState$Loading;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewViewState, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AcatsInCoOwnerReviewState5 {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInCoOwnerReviewState5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInCoOwnerReviewState5() {
    }

    /* compiled from: AcatsInCoOwnerReviewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState$Loading;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "<init>", "()V", "loadingState", "Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "getLoadingState", "()Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewViewState$Loading */
    public static final /* data */ class Loading extends AcatsInCoOwnerReviewState5 {
        public static final int $stable;
        public static final Loading INSTANCE = new Loading();
        private static final ReviewAcatsInViewState loadingState;

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -645942546;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            loadingState = new ReviewAcatsInViewState(companion.invoke("------ ---- -------"), "------- ------", null, "---- - ----", null, companion.invoke("-- -------"), companion.invoke("---------"), extensions2.persistentListOf("---- ------", "------ --------"), null, null, companion.invoke(StringsKt.repeat("-", 85)), companion.invoke("-------- -- ----------"), companion.invoke("------ -------"));
            $stable = ReviewAcatsInViewState.$stable;
        }

        public final ReviewAcatsInViewState getLoadingState() {
            return loadingState;
        }
    }

    /* compiled from: AcatsInCoOwnerReviewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState$Loaded;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "acatsId", "Ljava/util/UUID;", "dtccNumber", "", "rhsAccountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "reviewViewState", "Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "isCancelSheetLoading", "", "cancelSheetBodyText", "Lcom/robinhood/utils/resource/StringResource;", "coOwnerName", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getAcatsId", "()Ljava/util/UUID;", "getDtccNumber", "()Ljava/lang/String;", "getRhsAccountNumber", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getReviewViewState", "()Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "()Z", "getCancelSheetBodyText", "()Lcom/robinhood/utils/resource/StringResource;", "getCoOwnerName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends AcatsInCoOwnerReviewState5 {
        public static final int $stable = 8;
        private final UUID acatsId;
        private final BrokerageAccountType brokerageAccountType;
        private final StringResource cancelSheetBodyText;
        private final String coOwnerName;
        private final String dtccNumber;
        private final boolean isCancelSheetLoading;
        private final ReviewAcatsInViewState reviewViewState;
        private final String rhsAccountNumber;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UUID uuid, String str, String str2, BrokerageAccountType brokerageAccountType, ReviewAcatsInViewState reviewAcatsInViewState, boolean z, StringResource stringResource, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loaded.acatsId;
            }
            if ((i & 2) != 0) {
                str = loaded.dtccNumber;
            }
            if ((i & 4) != 0) {
                str2 = loaded.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = loaded.brokerageAccountType;
            }
            if ((i & 16) != 0) {
                reviewAcatsInViewState = loaded.reviewViewState;
            }
            if ((i & 32) != 0) {
                z = loaded.isCancelSheetLoading;
            }
            if ((i & 64) != 0) {
                stringResource = loaded.cancelSheetBodyText;
            }
            if ((i & 128) != 0) {
                str3 = loaded.coOwnerName;
            }
            StringResource stringResource2 = stringResource;
            String str4 = str3;
            ReviewAcatsInViewState reviewAcatsInViewState2 = reviewAcatsInViewState;
            boolean z2 = z;
            return loaded.copy(uuid, str, str2, brokerageAccountType, reviewAcatsInViewState2, z2, stringResource2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAcatsId() {
            return this.acatsId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDtccNumber() {
            return this.dtccNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component5, reason: from getter */
        public final ReviewAcatsInViewState getReviewViewState() {
            return this.reviewViewState;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsCancelSheetLoading() {
            return this.isCancelSheetLoading;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getCancelSheetBodyText() {
            return this.cancelSheetBodyText;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCoOwnerName() {
            return this.coOwnerName;
        }

        public final Loaded copy(UUID acatsId, String dtccNumber, String rhsAccountNumber, BrokerageAccountType brokerageAccountType, ReviewAcatsInViewState reviewViewState, boolean isCancelSheetLoading, StringResource cancelSheetBodyText, String coOwnerName) {
            Intrinsics.checkNotNullParameter(acatsId, "acatsId");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(reviewViewState, "reviewViewState");
            Intrinsics.checkNotNullParameter(cancelSheetBodyText, "cancelSheetBodyText");
            Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
            return new Loaded(acatsId, dtccNumber, rhsAccountNumber, brokerageAccountType, reviewViewState, isCancelSheetLoading, cancelSheetBodyText, coOwnerName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.acatsId, loaded.acatsId) && Intrinsics.areEqual(this.dtccNumber, loaded.dtccNumber) && Intrinsics.areEqual(this.rhsAccountNumber, loaded.rhsAccountNumber) && this.brokerageAccountType == loaded.brokerageAccountType && Intrinsics.areEqual(this.reviewViewState, loaded.reviewViewState) && this.isCancelSheetLoading == loaded.isCancelSheetLoading && Intrinsics.areEqual(this.cancelSheetBodyText, loaded.cancelSheetBodyText) && Intrinsics.areEqual(this.coOwnerName, loaded.coOwnerName);
        }

        public int hashCode() {
            return (((((((((((((this.acatsId.hashCode() * 31) + this.dtccNumber.hashCode()) * 31) + this.rhsAccountNumber.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.reviewViewState.hashCode()) * 31) + Boolean.hashCode(this.isCancelSheetLoading)) * 31) + this.cancelSheetBodyText.hashCode()) * 31) + this.coOwnerName.hashCode();
        }

        public String toString() {
            return "Loaded(acatsId=" + this.acatsId + ", dtccNumber=" + this.dtccNumber + ", rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", reviewViewState=" + this.reviewViewState + ", isCancelSheetLoading=" + this.isCancelSheetLoading + ", cancelSheetBodyText=" + this.cancelSheetBodyText + ", coOwnerName=" + this.coOwnerName + ")";
        }

        public final UUID getAcatsId() {
            return this.acatsId;
        }

        public final String getDtccNumber() {
            return this.dtccNumber;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ReviewAcatsInViewState getReviewViewState() {
            return this.reviewViewState;
        }

        public final boolean isCancelSheetLoading() {
            return this.isCancelSheetLoading;
        }

        public final StringResource getCancelSheetBodyText() {
            return this.cancelSheetBodyText;
        }

        public final String getCoOwnerName() {
            return this.coOwnerName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(UUID acatsId, String dtccNumber, String rhsAccountNumber, BrokerageAccountType brokerageAccountType, ReviewAcatsInViewState reviewViewState, boolean z, StringResource cancelSheetBodyText, String coOwnerName) {
            super(null);
            Intrinsics.checkNotNullParameter(acatsId, "acatsId");
            Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(reviewViewState, "reviewViewState");
            Intrinsics.checkNotNullParameter(cancelSheetBodyText, "cancelSheetBodyText");
            Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
            this.acatsId = acatsId;
            this.dtccNumber = dtccNumber;
            this.rhsAccountNumber = rhsAccountNumber;
            this.brokerageAccountType = brokerageAccountType;
            this.reviewViewState = reviewViewState;
            this.isCancelSheetLoading = z;
            this.cancelSheetBodyText = cancelSheetBodyText;
            this.coOwnerName = coOwnerName;
        }
    }
}
