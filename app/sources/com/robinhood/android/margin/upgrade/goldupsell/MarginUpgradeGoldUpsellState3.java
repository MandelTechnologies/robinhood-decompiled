package com.robinhood.android.margin.upgrade.goldupsell;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeGoldUpsellState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Error;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Loaded;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Loading;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellViewState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MarginUpgradeGoldUpsellState3 {
    public static final int $stable = 0;

    public /* synthetic */ MarginUpgradeGoldUpsellState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginUpgradeGoldUpsellState3() {
    }

    /* compiled from: MarginUpgradeGoldUpsellState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Loading;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellViewState$Loading */
    public static final /* data */ class Loading extends MarginUpgradeGoldUpsellState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 583672738;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginUpgradeGoldUpsellState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Loaded;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "standardPageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;)V", "getStandardPageTemplate", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends MarginUpgradeGoldUpsellState3 {
        public static final int $stable = 8;
        private final StandardPageTemplate<GenericAction> standardPageTemplate;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StandardPageTemplate standardPageTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                standardPageTemplate = loaded.standardPageTemplate;
            }
            return loaded.copy(standardPageTemplate);
        }

        public final StandardPageTemplate<GenericAction> component1() {
            return this.standardPageTemplate;
        }

        public final Loaded copy(StandardPageTemplate<? extends GenericAction> standardPageTemplate) {
            Intrinsics.checkNotNullParameter(standardPageTemplate, "standardPageTemplate");
            return new Loaded(standardPageTemplate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.standardPageTemplate, ((Loaded) other).standardPageTemplate);
        }

        public int hashCode() {
            return this.standardPageTemplate.hashCode();
        }

        public String toString() {
            return "Loaded(standardPageTemplate=" + this.standardPageTemplate + ")";
        }

        public final StandardPageTemplate<GenericAction> getStandardPageTemplate() {
            return this.standardPageTemplate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StandardPageTemplate<? extends GenericAction> standardPageTemplate) {
            super(null);
            Intrinsics.checkNotNullParameter(standardPageTemplate, "standardPageTemplate");
            this.standardPageTemplate = standardPageTemplate;
        }
    }

    /* compiled from: MarginUpgradeGoldUpsellState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState$Error;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellViewState$Error, reason: from toString */
    public static final /* data */ class Error extends MarginUpgradeGoldUpsellState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
