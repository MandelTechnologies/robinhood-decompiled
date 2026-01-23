package com.robinhood.android.creditcard.p091ui.creditapplication.rejected;

import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RejectedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent;", "", "Error", "ViewLink", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent$ViewLink;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface RejectedDuxo4 {

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;)V", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedEvent$Error, reason: from toString */
    public static final /* data */ class Error implements RejectedDuxo4 {
        public static final int $stable = 0;
        private final ClaimSolidGoldCashPrizeResponse2 error;

        public static /* synthetic */ Error copy$default(Error error, ClaimSolidGoldCashPrizeResponse2 claimSolidGoldCashPrizeResponse2, int i, Object obj) {
            if ((i & 1) != 0) {
                claimSolidGoldCashPrizeResponse2 = error.error;
            }
            return error.copy(claimSolidGoldCashPrizeResponse2);
        }

        /* renamed from: component1, reason: from getter */
        public final ClaimSolidGoldCashPrizeResponse2 getError() {
            return this.error;
        }

        public final Error copy(ClaimSolidGoldCashPrizeResponse2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.error == ((Error) other).error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public Error(ClaimSolidGoldCashPrizeResponse2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final ClaimSolidGoldCashPrizeResponse2 getError() {
            return this.error;
        }
    }

    /* compiled from: RejectedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent$ViewLink;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedEvent;", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedEvent$ViewLink, reason: from toString */
    public static final /* data */ class ViewLink implements RejectedDuxo4 {
        public static final int $stable = 0;
        private final String link;

        public static /* synthetic */ ViewLink copy$default(ViewLink viewLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewLink.link;
            }
            return viewLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final ViewLink copy(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new ViewLink(link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewLink) && Intrinsics.areEqual(this.link, ((ViewLink) other).link);
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        public String toString() {
            return "ViewLink(link=" + this.link + ")";
        }

        public ViewLink(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public final String getLink() {
            return this.link;
        }
    }
}
