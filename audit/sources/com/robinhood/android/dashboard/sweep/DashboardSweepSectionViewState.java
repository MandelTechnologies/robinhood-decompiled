package com.robinhood.android.dashboard.sweep;

import com.robinhood.models.api.bonfire.ApiSweepSplash;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardSweepSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "", "Loading", "V1", "V2", "Empty", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$Empty;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$Loading;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$V1;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$V2;", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface DashboardSweepSectionViewState {

    /* compiled from: DashboardSweepSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$Loading;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements DashboardSweepSectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1366075997;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: DashboardSweepSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$V1;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "section", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSection;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSection;)V", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class V1 implements DashboardSweepSectionViewState {
        public static final int $stable = 8;
        private final ApiSweepSplash.SweepSection section;

        public static /* synthetic */ V1 copy$default(V1 v1, ApiSweepSplash.SweepSection sweepSection, int i, Object obj) {
            if ((i & 1) != 0) {
                sweepSection = v1.section;
            }
            return v1.copy(sweepSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepSplash.SweepSection getSection() {
            return this.section;
        }

        public final V1 copy(ApiSweepSplash.SweepSection section) {
            Intrinsics.checkNotNullParameter(section, "section");
            return new V1(section);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof V1) && Intrinsics.areEqual(this.section, ((V1) other).section);
        }

        public int hashCode() {
            return this.section.hashCode();
        }

        public String toString() {
            return "V1(section=" + this.section + ")";
        }

        public V1(ApiSweepSplash.SweepSection section) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.section = section;
        }

        public final ApiSweepSplash.SweepSection getSection() {
            return this.section;
        }
    }

    /* compiled from: DashboardSweepSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$V2;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "section", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionV2;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionV2;)V", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionV2;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class V2 implements DashboardSweepSectionViewState {
        public static final int $stable = 8;
        private final ApiSweepSplash.SweepSectionV2 section;

        public static /* synthetic */ V2 copy$default(V2 v2, ApiSweepSplash.SweepSectionV2 sweepSectionV2, int i, Object obj) {
            if ((i & 1) != 0) {
                sweepSectionV2 = v2.section;
            }
            return v2.copy(sweepSectionV2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepSplash.SweepSectionV2 getSection() {
            return this.section;
        }

        public final V2 copy(ApiSweepSplash.SweepSectionV2 section) {
            Intrinsics.checkNotNullParameter(section, "section");
            return new V2(section);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof V2) && Intrinsics.areEqual(this.section, ((V2) other).section);
        }

        public int hashCode() {
            return this.section.hashCode();
        }

        public String toString() {
            return "V2(section=" + this.section + ")";
        }

        public V2(ApiSweepSplash.SweepSectionV2 section) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.section = section;
        }

        public final ApiSweepSplash.SweepSectionV2 getSection() {
            return this.section;
        }
    }

    /* compiled from: DashboardSweepSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState$Empty;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements DashboardSweepSectionViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -1609555282;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }
}
