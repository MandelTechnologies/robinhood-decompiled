package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "", "<init>", "()V", "Loading", "Loaded", "AccountDeficit", "AlreadyGold", "Failed", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$AccountDeficit;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$AlreadyGold;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Failed;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Loaded;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Loading;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class LegacyGoldUpgradeLoadPlanState {
    public static final int $stable = 0;

    public /* synthetic */ LegacyGoldUpgradeLoadPlanState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LegacyGoldUpgradeLoadPlanState() {
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Loading;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends LegacyGoldUpgradeLoadPlanState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1743633066;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Loaded;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "dynamicContext", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "<init>", "(Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;)V", "getDynamicContext", "()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends LegacyGoldUpgradeLoadPlanState {
        public static final int $stable = 8;
        private final LegacyGoldUpgradeDynamicContext dynamicContext;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, LegacyGoldUpgradeDynamicContext legacyGoldUpgradeDynamicContext, int i, Object obj) {
            if ((i & 1) != 0) {
                legacyGoldUpgradeDynamicContext = loaded.dynamicContext;
            }
            return loaded.copy(legacyGoldUpgradeDynamicContext);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyGoldUpgradeDynamicContext getDynamicContext() {
            return this.dynamicContext;
        }

        public final Loaded copy(LegacyGoldUpgradeDynamicContext dynamicContext) {
            Intrinsics.checkNotNullParameter(dynamicContext, "dynamicContext");
            return new Loaded(dynamicContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.dynamicContext, ((Loaded) other).dynamicContext);
        }

        public int hashCode() {
            return this.dynamicContext.hashCode();
        }

        public String toString() {
            return "Loaded(dynamicContext=" + this.dynamicContext + ")";
        }

        public final LegacyGoldUpgradeDynamicContext getDynamicContext() {
            return this.dynamicContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(LegacyGoldUpgradeDynamicContext dynamicContext) {
            super(null);
            Intrinsics.checkNotNullParameter(dynamicContext, "dynamicContext");
            this.dynamicContext = dynamicContext;
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$AccountDeficit;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountDeficit extends LegacyGoldUpgradeLoadPlanState {
        public static final int $stable = 0;
        public static final AccountDeficit INSTANCE = new AccountDeficit();

        public boolean equals(Object other) {
            return this == other || (other instanceof AccountDeficit);
        }

        public int hashCode() {
            return 841388291;
        }

        public String toString() {
            return "AccountDeficit";
        }

        private AccountDeficit() {
            super(null);
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$AlreadyGold;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyGold extends LegacyGoldUpgradeLoadPlanState {
        public static final int $stable = 0;
        public static final AlreadyGold INSTANCE = new AlreadyGold();

        public boolean equals(Object other) {
            return this == other || (other instanceof AlreadyGold);
        }

        public int hashCode() {
            return 1455259634;
        }

        public String toString() {
            return "AlreadyGold";
        }

        private AlreadyGold() {
            super(null);
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState$Failed;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "showErrorDialog", "", "<init>", "(Lcom/robinhood/udf/UiEvent;Z)V", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getShowErrorDialog", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends LegacyGoldUpgradeLoadPlanState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> errorEvent;
        private final boolean showErrorDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Failed() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failed copy$default(Failed failed, UiEvent uiEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = failed.errorEvent;
            }
            if ((i & 2) != 0) {
                z = failed.showErrorDialog;
            }
            return failed.copy(uiEvent, z);
        }

        public final UiEvent<Throwable> component1() {
            return this.errorEvent;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowErrorDialog() {
            return this.showErrorDialog;
        }

        public final Failed copy(UiEvent<Throwable> errorEvent, boolean showErrorDialog) {
            return new Failed(errorEvent, showErrorDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.errorEvent, failed.errorEvent) && this.showErrorDialog == failed.showErrorDialog;
        }

        public int hashCode() {
            UiEvent<Throwable> uiEvent = this.errorEvent;
            return ((uiEvent == null ? 0 : uiEvent.hashCode()) * 31) + Boolean.hashCode(this.showErrorDialog);
        }

        public String toString() {
            return "Failed(errorEvent=" + this.errorEvent + ", showErrorDialog=" + this.showErrorDialog + ")";
        }

        public /* synthetic */ Failed(UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? false : z);
        }

        public final UiEvent<Throwable> getErrorEvent() {
            return this.errorEvent;
        }

        public final boolean getShowErrorDialog() {
            return this.showErrorDialog;
        }

        public Failed(UiEvent<Throwable> uiEvent, boolean z) {
            super(null);
            this.errorEvent = uiEvent;
            this.showErrorDialog = z;
        }
    }
}
