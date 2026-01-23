package com.robinhood.android.isa.tab;

import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaNavHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardState;", "", "Loading", "SignUp", "Dashboard", "Lcom/robinhood/android/isa/tab/IsaDashboardState$Dashboard;", "Lcom/robinhood/android/isa/tab/IsaDashboardState$Loading;", "Lcom/robinhood/android/isa/tab/IsaDashboardState$SignUp;", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.tab.IsaDashboardState, reason: use source file name */
/* loaded from: classes10.dex */
public interface IsaNavHostDuxo2 {

    /* compiled from: IsaNavHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardState$Loading;", "Lcom/robinhood/android/isa/tab/IsaDashboardState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.tab.IsaDashboardState$Loading */
    public static final /* data */ class Loading implements IsaNavHostDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -186970722;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: IsaNavHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardState$SignUp;", "Lcom/robinhood/android/isa/tab/IsaDashboardState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.tab.IsaDashboardState$SignUp */
    public static final /* data */ class SignUp implements IsaNavHostDuxo2 {
        public static final int $stable = 0;
        public static final SignUp INSTANCE = new SignUp();

        public boolean equals(Object other) {
            return this == other || (other instanceof SignUp);
        }

        public int hashCode() {
            return -2027737962;
        }

        public String toString() {
            return "SignUp";
        }

        private SignUp() {
        }
    }

    /* compiled from: IsaNavHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardState$Dashboard;", "Lcom/robinhood/android/isa/tab/IsaDashboardState;", "accounts", "", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.tab.IsaDashboardState$Dashboard, reason: from toString */
    public static final /* data */ class Dashboard implements IsaNavHostDuxo2 {
        public static final int $stable = 8;
        private final List<Account> accounts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dashboard copy$default(Dashboard dashboard, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dashboard.accounts;
            }
            return dashboard.copy(list);
        }

        public final List<Account> component1() {
            return this.accounts;
        }

        public final Dashboard copy(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            return new Dashboard(accounts2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dashboard) && Intrinsics.areEqual(this.accounts, ((Dashboard) other).accounts);
        }

        public int hashCode() {
            return this.accounts.hashCode();
        }

        public String toString() {
            return "Dashboard(accounts=" + this.accounts + ")";
        }

        public Dashboard(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            this.accounts = accounts2;
        }

        public final List<Account> getAccounts() {
            return this.accounts;
        }
    }
}
