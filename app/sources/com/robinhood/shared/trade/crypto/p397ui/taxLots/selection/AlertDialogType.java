package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType;", "", "<init>", "()V", "WorkLoss", "DismissableAlert", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType$DismissableAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType$WorkLoss;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
abstract class AlertDialogType {
    public /* synthetic */ AlertDialogType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoTaxLotSelectionComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType$WorkLoss;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WorkLoss extends AlertDialogType {
        public static final int $stable = 0;
        public static final WorkLoss INSTANCE = new WorkLoss();

        public boolean equals(Object other) {
            return this == other || (other instanceof WorkLoss);
        }

        public int hashCode() {
            return 1023200402;
        }

        public String toString() {
            return "WorkLoss";
        }

        private WorkLoss() {
            super(null);
        }
    }

    private AlertDialogType() {
    }

    /* compiled from: CryptoTaxLotSelectionComposable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType$DismissableAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType;", "title", "", CarResultComposable2.BODY, "analyticsIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getAnalyticsIdentifier", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissableAlert extends AlertDialogType {
        public static final int $stable = 0;
        private final String analyticsIdentifier;
        private final String body;
        private final String title;

        public static /* synthetic */ DismissableAlert copy$default(DismissableAlert dismissableAlert, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dismissableAlert.title;
            }
            if ((i & 2) != 0) {
                str2 = dismissableAlert.body;
            }
            if ((i & 4) != 0) {
                str3 = dismissableAlert.analyticsIdentifier;
            }
            return dismissableAlert.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }

        public final DismissableAlert copy(String title, String body, String analyticsIdentifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
            return new DismissableAlert(title, body, analyticsIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DismissableAlert)) {
                return false;
            }
            DismissableAlert dismissableAlert = (DismissableAlert) other;
            return Intrinsics.areEqual(this.title, dismissableAlert.title) && Intrinsics.areEqual(this.body, dismissableAlert.body) && Intrinsics.areEqual(this.analyticsIdentifier, dismissableAlert.analyticsIdentifier);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.analyticsIdentifier.hashCode();
        }

        public String toString() {
            return "DismissableAlert(title=" + this.title + ", body=" + this.body + ", analyticsIdentifier=" + this.analyticsIdentifier + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissableAlert(String title, String body, String analyticsIdentifier) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
            this.title = title;
            this.body = body;
            this.analyticsIdentifier = analyticsIdentifier;
        }
    }
}
