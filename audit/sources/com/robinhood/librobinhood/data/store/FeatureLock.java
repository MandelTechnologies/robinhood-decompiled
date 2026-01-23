package com.robinhood.librobinhood.data.store;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLock.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock;", "", "And", "Or", "BrokerageAccountTypes", "ManagementTypes", "ExperimentLock", "OptionLevel", "Region", "AccountTypes", "OriginalAccount", "Lcom/robinhood/librobinhood/data/store/FeatureLock$AccountTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$And;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$BrokerageAccountTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$ExperimentLock;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$ManagementTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$OptionLevel;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$Or;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$OriginalAccount;", "Lcom/robinhood/librobinhood/data/store/FeatureLock$Region;", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface FeatureLock {

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$And;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "locks", "", "<init>", "(Ljava/util/List;)V", "getLocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class And implements FeatureLock {
        private final List<FeatureLock> locks;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ And copy$default(And and, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = and.locks;
            }
            return and.copy(list);
        }

        public final List<FeatureLock> component1() {
            return this.locks;
        }

        public final And copy(List<? extends FeatureLock> locks) {
            Intrinsics.checkNotNullParameter(locks, "locks");
            return new And(locks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof And) && Intrinsics.areEqual(this.locks, ((And) other).locks);
        }

        public int hashCode() {
            return this.locks.hashCode();
        }

        public String toString() {
            return "And(locks=" + this.locks + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public And(List<? extends FeatureLock> locks) {
            Intrinsics.checkNotNullParameter(locks, "locks");
            this.locks = locks;
        }

        public final List<FeatureLock> getLocks() {
            return this.locks;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$Or;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "locks", "", "<init>", "(Ljava/util/List;)V", "getLocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Or implements FeatureLock {
        private final List<FeatureLock> locks;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Or copy$default(Or or, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = or.locks;
            }
            return or.copy(list);
        }

        public final List<FeatureLock> component1() {
            return this.locks;
        }

        public final Or copy(List<? extends FeatureLock> locks) {
            Intrinsics.checkNotNullParameter(locks, "locks");
            return new Or(locks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Or) && Intrinsics.areEqual(this.locks, ((Or) other).locks);
        }

        public int hashCode() {
            return this.locks.hashCode();
        }

        public String toString() {
            return "Or(locks=" + this.locks + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Or(List<? extends FeatureLock> locks) {
            Intrinsics.checkNotNullParameter(locks, "locks");
            this.locks = locks;
        }

        public final List<FeatureLock> getLocks() {
            return this.locks;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$BrokerageAccountTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "brokerageAccountTypes", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/util/List;)V", "getBrokerageAccountTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrokerageAccountTypes implements FeatureLock {
        private final List<BrokerageAccountType> brokerageAccountTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BrokerageAccountTypes copy$default(BrokerageAccountTypes brokerageAccountTypes, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = brokerageAccountTypes.brokerageAccountTypes;
            }
            return brokerageAccountTypes.copy(list);
        }

        public final List<BrokerageAccountType> component1() {
            return this.brokerageAccountTypes;
        }

        public final BrokerageAccountTypes copy(List<? extends BrokerageAccountType> brokerageAccountTypes) {
            Intrinsics.checkNotNullParameter(brokerageAccountTypes, "brokerageAccountTypes");
            return new BrokerageAccountTypes(brokerageAccountTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrokerageAccountTypes) && Intrinsics.areEqual(this.brokerageAccountTypes, ((BrokerageAccountTypes) other).brokerageAccountTypes);
        }

        public int hashCode() {
            return this.brokerageAccountTypes.hashCode();
        }

        public String toString() {
            return "BrokerageAccountTypes(brokerageAccountTypes=" + this.brokerageAccountTypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BrokerageAccountTypes(List<? extends BrokerageAccountType> brokerageAccountTypes) {
            Intrinsics.checkNotNullParameter(brokerageAccountTypes, "brokerageAccountTypes");
            this.brokerageAccountTypes = brokerageAccountTypes;
        }

        public final List<BrokerageAccountType> getBrokerageAccountTypes() {
            return this.brokerageAccountTypes;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$ManagementTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "managementTypes", "", "Lcom/robinhood/models/api/ManagementType;", "<init>", "(Ljava/util/List;)V", "getManagementTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ManagementTypes implements FeatureLock {
        private final List<ManagementType> managementTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ManagementTypes copy$default(ManagementTypes managementTypes, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = managementTypes.managementTypes;
            }
            return managementTypes.copy(list);
        }

        public final List<ManagementType> component1() {
            return this.managementTypes;
        }

        public final ManagementTypes copy(List<? extends ManagementType> managementTypes) {
            Intrinsics.checkNotNullParameter(managementTypes, "managementTypes");
            return new ManagementTypes(managementTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ManagementTypes) && Intrinsics.areEqual(this.managementTypes, ((ManagementTypes) other).managementTypes);
        }

        public int hashCode() {
            return this.managementTypes.hashCode();
        }

        public String toString() {
            return "ManagementTypes(managementTypes=" + this.managementTypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ManagementTypes(List<? extends ManagementType> managementTypes) {
            Intrinsics.checkNotNullParameter(managementTypes, "managementTypes");
            this.managementTypes = managementTypes;
        }

        public final List<ManagementType> getManagementTypes() {
            return this.managementTypes;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$ExperimentLock;", "V", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "experiment", "Lcom/robinhood/experiments/Experiment;", "<init>", "(Lcom/robinhood/experiments/Experiment;)V", "getExperiment", "()Lcom/robinhood/experiments/Experiment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExperimentLock<V extends Enum<V> & RhEnum<V>> implements FeatureLock {
        private final Experiment<V> experiment;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExperimentLock copy$default(ExperimentLock experimentLock, Experiment experiment, int i, Object obj) {
            if ((i & 1) != 0) {
                experiment = experimentLock.experiment;
            }
            return experimentLock.copy(experiment);
        }

        public final Experiment<V> component1() {
            return this.experiment;
        }

        public final ExperimentLock<V> copy(Experiment<V> experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            return new ExperimentLock<>(experiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExperimentLock) && Intrinsics.areEqual(this.experiment, ((ExperimentLock) other).experiment);
        }

        public int hashCode() {
            return this.experiment.hashCode();
        }

        public String toString() {
            return "ExperimentLock(experiment=" + this.experiment + ")";
        }

        public ExperimentLock(Experiment<V> experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.experiment = experiment;
        }

        public final Experiment<V> getExperiment() {
            return this.experiment;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$OptionLevel;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "optionLevels", "", "", "<init>", "(Ljava/util/List;)V", "getOptionLevels", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionLevel implements FeatureLock {
        private final List<String> optionLevels;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionLevel copy$default(OptionLevel optionLevel, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = optionLevel.optionLevels;
            }
            return optionLevel.copy(list);
        }

        public final List<String> component1() {
            return this.optionLevels;
        }

        public final OptionLevel copy(List<String> optionLevels) {
            Intrinsics.checkNotNullParameter(optionLevels, "optionLevels");
            return new OptionLevel(optionLevels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionLevel) && Intrinsics.areEqual(this.optionLevels, ((OptionLevel) other).optionLevels);
        }

        public int hashCode() {
            return this.optionLevels.hashCode();
        }

        public String toString() {
            return "OptionLevel(optionLevels=" + this.optionLevels + ")";
        }

        public OptionLevel(List<String> optionLevels) {
            Intrinsics.checkNotNullParameter(optionLevels, "optionLevels");
            this.optionLevels = optionLevels;
        }

        public final List<String> getOptionLevels() {
            return this.optionLevels;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$Region;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "(Lcom/robinhood/android/regiongate/RegionGate;)V", "getRegionGate", "()Lcom/robinhood/android/regiongate/RegionGate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Region implements FeatureLock {
        private final RegionGate regionGate;

        public static /* synthetic */ Region copy$default(Region region, RegionGate regionGate, int i, Object obj) {
            if ((i & 1) != 0) {
                regionGate = region.regionGate;
            }
            return region.copy(regionGate);
        }

        /* renamed from: component1, reason: from getter */
        public final RegionGate getRegionGate() {
            return this.regionGate;
        }

        public final Region copy(RegionGate regionGate) {
            Intrinsics.checkNotNullParameter(regionGate, "regionGate");
            return new Region(regionGate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Region) && Intrinsics.areEqual(this.regionGate, ((Region) other).regionGate);
        }

        public int hashCode() {
            return this.regionGate.hashCode();
        }

        public String toString() {
            return "Region(regionGate=" + this.regionGate + ")";
        }

        public Region(RegionGate regionGate) {
            Intrinsics.checkNotNullParameter(regionGate, "regionGate");
            this.regionGate = regionGate;
        }

        public final RegionGate getRegionGate() {
            return this.regionGate;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$AccountTypes;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "accountTypes", "", "Lcom/robinhood/models/api/AccountType;", "<init>", "(Ljava/util/List;)V", "getAccountTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountTypes implements FeatureLock {
        private final List<AccountType> accountTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountTypes copy$default(AccountTypes accountTypes, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = accountTypes.accountTypes;
            }
            return accountTypes.copy(list);
        }

        public final List<AccountType> component1() {
            return this.accountTypes;
        }

        public final AccountTypes copy(List<? extends AccountType> accountTypes) {
            Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
            return new AccountTypes(accountTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountTypes) && Intrinsics.areEqual(this.accountTypes, ((AccountTypes) other).accountTypes);
        }

        public int hashCode() {
            return this.accountTypes.hashCode();
        }

        public String toString() {
            return "AccountTypes(accountTypes=" + this.accountTypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AccountTypes(List<? extends AccountType> accountTypes) {
            Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
            this.accountTypes = accountTypes;
        }

        public final List<AccountType> getAccountTypes() {
            return this.accountTypes;
        }
    }

    /* compiled from: FeatureLock.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLock$OriginalAccount;", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OriginalAccount implements FeatureLock {
        public static final OriginalAccount INSTANCE = new OriginalAccount();

        public boolean equals(Object other) {
            return this == other || (other instanceof OriginalAccount);
        }

        public int hashCode() {
            return 1738169654;
        }

        public String toString() {
            return "OriginalAccount";
        }

        private OriginalAccount() {
        }
    }
}
