package com.robinhood.android.gold.upgrade.agreements;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsLoadingState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "", "<init>", "()V", "Loaded", "Loading", "Failed", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Failed;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Loading;", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingViewState, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class GoldAgreementsLoadingState3 {
    public static final int $stable = 0;

    public /* synthetic */ GoldAgreementsLoadingState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldAgreementsLoadingState3() {
    }

    /* compiled from: GoldAgreementsLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "context", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", "<init>", "(Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;)V", "getContext", "()Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends GoldAgreementsLoadingState3 {
        public static final int $stable = 8;
        private final GoldAgreementsContext context;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, GoldAgreementsContext goldAgreementsContext, int i, Object obj) {
            if ((i & 1) != 0) {
                goldAgreementsContext = loaded.context;
            }
            return loaded.copy(goldAgreementsContext);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldAgreementsContext getContext() {
            return this.context;
        }

        public final Loaded copy(GoldAgreementsContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Loaded(context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.context, ((Loaded) other).context);
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "Loaded(context=" + this.context + ")";
        }

        public final GoldAgreementsContext getContext() {
            return this.context;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(GoldAgreementsContext context) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }
    }

    /* compiled from: GoldAgreementsLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Loading;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingViewState$Loading */
    public static final /* data */ class Loading extends GoldAgreementsLoadingState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1649091200;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GoldAgreementsLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState$Failed;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingViewState$Failed */
    public static final /* data */ class Failed extends GoldAgreementsLoadingState3 {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return 455081849;
        }

        public String toString() {
            return "Failed";
        }

        private Failed() {
            super(null);
        }
    }
}
