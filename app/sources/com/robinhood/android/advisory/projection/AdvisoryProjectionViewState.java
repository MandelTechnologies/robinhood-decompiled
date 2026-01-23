package com.robinhood.android.advisory.projection;

import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.models.advisory.p304db.projection.ProjectedReturns;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryProjectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState;", "", "defaultFrequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "getDefaultFrequency", "()Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "Loading", "Loaded", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState$Loaded;", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState$Loading;", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryProjectionViewState {
    SimulateDepositFrequency getDefaultFrequency();

    /* compiled from: AdvisoryProjectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState$Loading;", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState;", "defaultFrequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "<init>", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)V", "getDefaultFrequency", "()Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisoryProjectionViewState {
        public static final int $stable = 0;
        private final SimulateDepositFrequency defaultFrequency;

        public static /* synthetic */ Loading copy$default(Loading loading, SimulateDepositFrequency simulateDepositFrequency, int i, Object obj) {
            if ((i & 1) != 0) {
                simulateDepositFrequency = loading.defaultFrequency;
            }
            return loading.copy(simulateDepositFrequency);
        }

        /* renamed from: component1, reason: from getter */
        public final SimulateDepositFrequency getDefaultFrequency() {
            return this.defaultFrequency;
        }

        public final Loading copy(SimulateDepositFrequency defaultFrequency) {
            Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
            return new Loading(defaultFrequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.defaultFrequency == ((Loading) other).defaultFrequency;
        }

        public int hashCode() {
            return this.defaultFrequency.hashCode();
        }

        public String toString() {
            return "Loading(defaultFrequency=" + this.defaultFrequency + ")";
        }

        public Loading(SimulateDepositFrequency defaultFrequency) {
            Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
            this.defaultFrequency = defaultFrequency;
        }

        @Override // com.robinhood.android.advisory.projection.AdvisoryProjectionViewState
        public SimulateDepositFrequency getDefaultFrequency() {
            return this.defaultFrequency;
        }
    }

    /* compiled from: AdvisoryProjectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003Je\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState$Loaded;", "Lcom/robinhood/android/advisory/projection/AdvisoryProjectionViewState;", "projectedReturns", "Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "depositAmountList", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/util/Money;", "depositCtaData", "Lcom/robinhood/android/advisory/projection/DepositCtaData;", "currentYear", "", "initialSelectedYearIndex", "supportedFrequencies", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "projectionAccountInfo", "Lcom/robinhood/android/advisory/projection/ProjectionAccountInfo;", "defaultFrequency", "<init>", "(Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/advisory/projection/DepositCtaData;IILkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/advisory/projection/ProjectionAccountInfo;Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)V", "getProjectedReturns", "()Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "getDepositAmountList", "()Lkotlinx/collections/immutable/PersistentList;", "getDepositCtaData", "()Lcom/robinhood/android/advisory/projection/DepositCtaData;", "getCurrentYear", "()I", "getInitialSelectedYearIndex", "getSupportedFrequencies", "getProjectionAccountInfo", "()Lcom/robinhood/android/advisory/projection/ProjectionAccountInfo;", "getDefaultFrequency", "()Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisoryProjectionViewState {
        public static final int $stable = 8;
        private final int currentYear;
        private final SimulateDepositFrequency defaultFrequency;
        private final ImmutableList3<Money> depositAmountList;
        private final DepositCtaData depositCtaData;
        private final int initialSelectedYearIndex;
        private final ProjectedReturns projectedReturns;
        private final ProjectionAccountInfo projectionAccountInfo;
        private final ImmutableList3<SimulateDepositFrequency> supportedFrequencies;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ProjectedReturns projectedReturns, ImmutableList3 immutableList3, DepositCtaData depositCta, int i, int i2, ImmutableList3 immutableList32, ProjectionAccountInfo projectionAccountInfo, SimulateDepositFrequency simulateDepositFrequency, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                projectedReturns = loaded.projectedReturns;
            }
            if ((i3 & 2) != 0) {
                immutableList3 = loaded.depositAmountList;
            }
            if ((i3 & 4) != 0) {
                depositCta = loaded.depositCtaData;
            }
            if ((i3 & 8) != 0) {
                i = loaded.currentYear;
            }
            if ((i3 & 16) != 0) {
                i2 = loaded.initialSelectedYearIndex;
            }
            if ((i3 & 32) != 0) {
                immutableList32 = loaded.supportedFrequencies;
            }
            if ((i3 & 64) != 0) {
                projectionAccountInfo = loaded.projectionAccountInfo;
            }
            if ((i3 & 128) != 0) {
                simulateDepositFrequency = loaded.defaultFrequency;
            }
            ProjectionAccountInfo projectionAccountInfo2 = projectionAccountInfo;
            SimulateDepositFrequency simulateDepositFrequency2 = simulateDepositFrequency;
            int i4 = i2;
            ImmutableList3 immutableList33 = immutableList32;
            return loaded.copy(projectedReturns, immutableList3, depositCta, i, i4, immutableList33, projectionAccountInfo2, simulateDepositFrequency2);
        }

        /* renamed from: component1, reason: from getter */
        public final ProjectedReturns getProjectedReturns() {
            return this.projectedReturns;
        }

        public final ImmutableList3<Money> component2() {
            return this.depositAmountList;
        }

        /* renamed from: component3, reason: from getter */
        public final DepositCtaData getDepositCtaData() {
            return this.depositCtaData;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCurrentYear() {
            return this.currentYear;
        }

        /* renamed from: component5, reason: from getter */
        public final int getInitialSelectedYearIndex() {
            return this.initialSelectedYearIndex;
        }

        public final ImmutableList3<SimulateDepositFrequency> component6() {
            return this.supportedFrequencies;
        }

        /* renamed from: component7, reason: from getter */
        public final ProjectionAccountInfo getProjectionAccountInfo() {
            return this.projectionAccountInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final SimulateDepositFrequency getDefaultFrequency() {
            return this.defaultFrequency;
        }

        public final Loaded copy(ProjectedReturns projectedReturns, ImmutableList3<Money> depositAmountList, DepositCtaData depositCtaData, int currentYear, int initialSelectedYearIndex, ImmutableList3<? extends SimulateDepositFrequency> supportedFrequencies, ProjectionAccountInfo projectionAccountInfo, SimulateDepositFrequency defaultFrequency) {
            Intrinsics.checkNotNullParameter(projectedReturns, "projectedReturns");
            Intrinsics.checkNotNullParameter(depositAmountList, "depositAmountList");
            Intrinsics.checkNotNullParameter(depositCtaData, "depositCtaData");
            Intrinsics.checkNotNullParameter(supportedFrequencies, "supportedFrequencies");
            Intrinsics.checkNotNullParameter(projectionAccountInfo, "projectionAccountInfo");
            Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
            return new Loaded(projectedReturns, depositAmountList, depositCtaData, currentYear, initialSelectedYearIndex, supportedFrequencies, projectionAccountInfo, defaultFrequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.projectedReturns, loaded.projectedReturns) && Intrinsics.areEqual(this.depositAmountList, loaded.depositAmountList) && Intrinsics.areEqual(this.depositCtaData, loaded.depositCtaData) && this.currentYear == loaded.currentYear && this.initialSelectedYearIndex == loaded.initialSelectedYearIndex && Intrinsics.areEqual(this.supportedFrequencies, loaded.supportedFrequencies) && Intrinsics.areEqual(this.projectionAccountInfo, loaded.projectionAccountInfo) && this.defaultFrequency == loaded.defaultFrequency;
        }

        public int hashCode() {
            return (((((((((((((this.projectedReturns.hashCode() * 31) + this.depositAmountList.hashCode()) * 31) + this.depositCtaData.hashCode()) * 31) + Integer.hashCode(this.currentYear)) * 31) + Integer.hashCode(this.initialSelectedYearIndex)) * 31) + this.supportedFrequencies.hashCode()) * 31) + this.projectionAccountInfo.hashCode()) * 31) + this.defaultFrequency.hashCode();
        }

        public String toString() {
            return "Loaded(projectedReturns=" + this.projectedReturns + ", depositAmountList=" + this.depositAmountList + ", depositCtaData=" + this.depositCtaData + ", currentYear=" + this.currentYear + ", initialSelectedYearIndex=" + this.initialSelectedYearIndex + ", supportedFrequencies=" + this.supportedFrequencies + ", projectionAccountInfo=" + this.projectionAccountInfo + ", defaultFrequency=" + this.defaultFrequency + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(ProjectedReturns projectedReturns, ImmutableList3<Money> depositAmountList, DepositCtaData depositCtaData, int i, int i2, ImmutableList3<? extends SimulateDepositFrequency> supportedFrequencies, ProjectionAccountInfo projectionAccountInfo, SimulateDepositFrequency defaultFrequency) {
            Intrinsics.checkNotNullParameter(projectedReturns, "projectedReturns");
            Intrinsics.checkNotNullParameter(depositAmountList, "depositAmountList");
            Intrinsics.checkNotNullParameter(depositCtaData, "depositCtaData");
            Intrinsics.checkNotNullParameter(supportedFrequencies, "supportedFrequencies");
            Intrinsics.checkNotNullParameter(projectionAccountInfo, "projectionAccountInfo");
            Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
            this.projectedReturns = projectedReturns;
            this.depositAmountList = depositAmountList;
            this.depositCtaData = depositCtaData;
            this.currentYear = i;
            this.initialSelectedYearIndex = i2;
            this.supportedFrequencies = supportedFrequencies;
            this.projectionAccountInfo = projectionAccountInfo;
            this.defaultFrequency = defaultFrequency;
        }

        public final ProjectedReturns getProjectedReturns() {
            return this.projectedReturns;
        }

        public /* synthetic */ Loaded(ProjectedReturns projectedReturns, ImmutableList3 immutableList3, DepositCtaData depositCta, int i, int i2, ImmutableList3 immutableList32, ProjectionAccountInfo projectionAccountInfo, SimulateDepositFrequency simulateDepositFrequency, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(projectedReturns, (i3 & 2) != 0 ? extensions2.persistentListOf() : immutableList3, depositCta, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? extensions2.persistentListOf() : immutableList32, projectionAccountInfo, simulateDepositFrequency);
        }

        public final ImmutableList3<Money> getDepositAmountList() {
            return this.depositAmountList;
        }

        public final DepositCtaData getDepositCtaData() {
            return this.depositCtaData;
        }

        public final int getCurrentYear() {
            return this.currentYear;
        }

        public final int getInitialSelectedYearIndex() {
            return this.initialSelectedYearIndex;
        }

        public final ImmutableList3<SimulateDepositFrequency> getSupportedFrequencies() {
            return this.supportedFrequencies;
        }

        public final ProjectionAccountInfo getProjectionAccountInfo() {
            return this.projectionAccountInfo;
        }

        @Override // com.robinhood.android.advisory.projection.AdvisoryProjectionViewState
        public SimulateDepositFrequency getDefaultFrequency() {
            return this.defaultFrequency;
        }
    }
}
