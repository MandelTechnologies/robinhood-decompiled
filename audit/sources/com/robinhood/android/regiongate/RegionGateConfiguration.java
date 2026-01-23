package com.robinhood.android.regiongate;

import com.robinhood.experiments.Experiment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.KaizenExperiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RegionGateConfiguration.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\t\n\u000bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "", "supportedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getSupportedCountries", "()Ljava/util/Set;", "excludedCountries", "getExcludedCountries", "UserInSupportedCountries", "UserInSupportedCountriesOrInAnyExperiment", "UserInAnyExperiment", "Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInAnyExperiment;", "Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountries;", "Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountriesOrInAnyExperiment;", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface RegionGateConfiguration {
    Set<CountryCode.Supported> getExcludedCountries();

    Set<CountryCode.Supported> getSupportedCountries();

    /* compiled from: RegionGateConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountries;", "Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "supportedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "excludedCountries", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "supportedCountry", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getSupportedCountries", "()Ljava/util/Set;", "getExcludedCountries", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UserInSupportedCountries implements RegionGateConfiguration {
        private final Set<CountryCode.Supported> excludedCountries;
        private final Set<CountryCode.Supported> supportedCountries;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserInSupportedCountries copy$default(UserInSupportedCountries userInSupportedCountries, Set set, Set set2, int i, Object obj) {
            if ((i & 1) != 0) {
                set = userInSupportedCountries.supportedCountries;
            }
            if ((i & 2) != 0) {
                set2 = userInSupportedCountries.excludedCountries;
            }
            return userInSupportedCountries.copy(set, set2);
        }

        public final Set<CountryCode.Supported> component1() {
            return this.supportedCountries;
        }

        public final Set<CountryCode.Supported> component2() {
            return this.excludedCountries;
        }

        public final UserInSupportedCountries copy(Set<? extends CountryCode.Supported> supportedCountries, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            return new UserInSupportedCountries(supportedCountries, excludedCountries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInSupportedCountries)) {
                return false;
            }
            UserInSupportedCountries userInSupportedCountries = (UserInSupportedCountries) other;
            return Intrinsics.areEqual(this.supportedCountries, userInSupportedCountries.supportedCountries) && Intrinsics.areEqual(this.excludedCountries, userInSupportedCountries.excludedCountries);
        }

        public int hashCode() {
            return (this.supportedCountries.hashCode() * 31) + this.excludedCountries.hashCode();
        }

        public String toString() {
            return "UserInSupportedCountries(supportedCountries=" + this.supportedCountries + ", excludedCountries=" + this.excludedCountries + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserInSupportedCountries(Set<? extends CountryCode.Supported> supportedCountries, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            this.supportedCountries = supportedCountries;
            this.excludedCountries = excludedCountries;
            if (getSupportedCountries().isEmpty()) {
                throw new IllegalArgumentException("supportedCountries should never be empty");
            }
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getSupportedCountries() {
            return this.supportedCountries;
        }

        public /* synthetic */ UserInSupportedCountries(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? SetsKt.emptySet() : set2);
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getExcludedCountries() {
            return this.excludedCountries;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UserInSupportedCountries(CountryCode.Supported supportedCountry) {
            this(SetsKt.setOf(supportedCountry), null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(supportedCountry, "supportedCountry");
        }
    }

    /* compiled from: RegionGateConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J=\u0010\u0013\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountriesOrInAnyExperiment;", "Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "experimentTargets", "", "Lcom/robinhood/android/regiongate/ExperimentTarget;", "supportedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "excludedCountries", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V", "getExperimentTargets", "()Ljava/util/List;", "getSupportedCountries", "()Ljava/util/Set;", "getExcludedCountries", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes5.dex */
    public static final /* data */ class UserInSupportedCountriesOrInAnyExperiment implements RegionGateConfiguration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Set<CountryCode.Supported> excludedCountries;
        private final List<ExperimentTarget<?>> experimentTargets;
        private final Set<CountryCode.Supported> supportedCountries;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserInSupportedCountriesOrInAnyExperiment copy$default(UserInSupportedCountriesOrInAnyExperiment userInSupportedCountriesOrInAnyExperiment, List list, Set set, Set set2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = userInSupportedCountriesOrInAnyExperiment.experimentTargets;
            }
            if ((i & 2) != 0) {
                set = userInSupportedCountriesOrInAnyExperiment.supportedCountries;
            }
            if ((i & 4) != 0) {
                set2 = userInSupportedCountriesOrInAnyExperiment.excludedCountries;
            }
            return userInSupportedCountriesOrInAnyExperiment.copy(list, set, set2);
        }

        public final List<ExperimentTarget<?>> component1() {
            return this.experimentTargets;
        }

        public final Set<CountryCode.Supported> component2() {
            return this.supportedCountries;
        }

        public final Set<CountryCode.Supported> component3() {
            return this.excludedCountries;
        }

        public final UserInSupportedCountriesOrInAnyExperiment copy(List<? extends ExperimentTarget<?>> experimentTargets, Set<? extends CountryCode.Supported> supportedCountries, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(experimentTargets, "experimentTargets");
            Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            return new UserInSupportedCountriesOrInAnyExperiment(experimentTargets, supportedCountries, excludedCountries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInSupportedCountriesOrInAnyExperiment)) {
                return false;
            }
            UserInSupportedCountriesOrInAnyExperiment userInSupportedCountriesOrInAnyExperiment = (UserInSupportedCountriesOrInAnyExperiment) other;
            return Intrinsics.areEqual(this.experimentTargets, userInSupportedCountriesOrInAnyExperiment.experimentTargets) && Intrinsics.areEqual(this.supportedCountries, userInSupportedCountriesOrInAnyExperiment.supportedCountries) && Intrinsics.areEqual(this.excludedCountries, userInSupportedCountriesOrInAnyExperiment.excludedCountries);
        }

        public int hashCode() {
            return (((this.experimentTargets.hashCode() * 31) + this.supportedCountries.hashCode()) * 31) + this.excludedCountries.hashCode();
        }

        public String toString() {
            return "UserInSupportedCountriesOrInAnyExperiment(experimentTargets=" + this.experimentTargets + ", supportedCountries=" + this.supportedCountries + ", excludedCountries=" + this.excludedCountries + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserInSupportedCountriesOrInAnyExperiment(List<? extends ExperimentTarget<?>> experimentTargets, Set<? extends CountryCode.Supported> supportedCountries, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(experimentTargets, "experimentTargets");
            Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            this.experimentTargets = experimentTargets;
            this.supportedCountries = supportedCountries;
            this.excludedCountries = excludedCountries;
            if (getSupportedCountries().isEmpty()) {
                throw new IllegalArgumentException("supportedCountries should never be empty");
            }
            if (experimentTargets.isEmpty()) {
                throw new IllegalArgumentException("experiments should never be empty otherwise use UserInSupportedCountries");
            }
            List<? extends ExperimentTarget<?>> list = experimentTargets;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ExperimentTarget) it.next()).getMemberVariants().isEmpty()) {
                    throw new IllegalArgumentException("All experiment targets must have at least 1 member variant");
                }
            }
        }

        public final List<ExperimentTarget<?>> getExperimentTargets() {
            return this.experimentTargets;
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getSupportedCountries() {
            return this.supportedCountries;
        }

        public /* synthetic */ UserInSupportedCountriesOrInAnyExperiment(List list, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, set, (i & 4) != 0 ? SetsKt.emptySet() : set2);
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getExcludedCountries() {
            return this.excludedCountries;
        }

        /* compiled from: RegionGateConfiguration.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\u0002JC\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\u0002J=\u0010\u0004\u001a\u00020\u00052\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\u0002¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountriesOrInAnyExperiment$Companion;", "", "<init>", "()V", "invoke", "Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInSupportedCountriesOrInAnyExperiment;", "experiments", "", "Lcom/robinhood/experiments/Experiment;", "supportedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "excludedCountries", "disabledVariants", "", "supportedCountry", "experiment", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UserInSupportedCountriesOrInAnyExperiment invoke$default(Companion companion, List list, Set set, Set set2, Set set3, int i, Object obj) {
                if ((i & 4) != 0) {
                    set2 = SetsKt.emptySet();
                }
                if ((i & 8) != 0) {
                    set3 = KaizenExperiment.INSTANCE.getDisabledExperimentVariants();
                }
                return companion.invoke((List<? extends Experiment<?>>) list, (Set<? extends CountryCode.Supported>) set, (Set<? extends CountryCode.Supported>) set2, (Set<String>) set3);
            }

            public final UserInSupportedCountriesOrInAnyExperiment invoke(List<? extends Experiment<?>> experiments, Set<? extends CountryCode.Supported> supportedCountries, Set<? extends CountryCode.Supported> excludedCountries, Set<String> disabledVariants) {
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
                Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
                Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
                List<? extends Experiment<?>> list = experiments;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ExperimentTarget2.toExperimentTarget((Experiment) it.next(), disabledVariants));
                }
                return new UserInSupportedCountriesOrInAnyExperiment(arrayList, supportedCountries, excludedCountries);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UserInSupportedCountriesOrInAnyExperiment invoke$default(Companion companion, List list, CountryCode.Supported supported, Set set, Set set2, int i, Object obj) {
                if ((i & 4) != 0) {
                    set = SetsKt.emptySet();
                }
                if ((i & 8) != 0) {
                    set2 = KaizenExperiment.INSTANCE.getDisabledExperimentVariants();
                }
                return companion.invoke((List<? extends Experiment<?>>) list, supported, (Set<? extends CountryCode.Supported>) set, (Set<String>) set2);
            }

            public final UserInSupportedCountriesOrInAnyExperiment invoke(List<? extends Experiment<?>> experiments, CountryCode.Supported supportedCountry, Set<? extends CountryCode.Supported> excludedCountries, Set<String> disabledVariants) {
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                Intrinsics.checkNotNullParameter(supportedCountry, "supportedCountry");
                Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
                Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
                List<? extends Experiment<?>> list = experiments;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ExperimentTarget2.toExperimentTarget((Experiment) it.next(), disabledVariants));
                }
                return new UserInSupportedCountriesOrInAnyExperiment(arrayList, SetsKt.setOf(supportedCountry), excludedCountries);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UserInSupportedCountriesOrInAnyExperiment invoke$default(Companion companion, Experiment experiment, CountryCode.Supported supported, Set set, Set set2, int i, Object obj) {
                if ((i & 4) != 0) {
                    set = SetsKt.emptySet();
                }
                if ((i & 8) != 0) {
                    set2 = KaizenExperiment.INSTANCE.getDisabledExperimentVariants();
                }
                return companion.invoke((Experiment<?>) experiment, supported, (Set<? extends CountryCode.Supported>) set, (Set<String>) set2);
            }

            public final UserInSupportedCountriesOrInAnyExperiment invoke(Experiment<?> experiment, CountryCode.Supported supportedCountry, Set<? extends CountryCode.Supported> excludedCountries, Set<String> disabledVariants) {
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                Intrinsics.checkNotNullParameter(supportedCountry, "supportedCountry");
                Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
                Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
                return new UserInSupportedCountriesOrInAnyExperiment(CollectionsKt.listOf(ExperimentTarget2.toExperimentTarget(experiment, disabledVariants)), SetsKt.setOf(supportedCountry), excludedCountries);
            }
        }
    }

    /* compiled from: RegionGateConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInAnyExperiment;", "Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "experimentTargets", "", "Lcom/robinhood/android/regiongate/ExperimentTarget;", "excludedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "getExperimentTargets", "()Ljava/util/List;", "getExcludedCountries", "()Ljava/util/Set;", "supportedCountries", "getSupportedCountries", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class UserInAnyExperiment implements RegionGateConfiguration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Set<CountryCode.Supported> excludedCountries;
        private final List<ExperimentTarget<?>> experimentTargets;
        private final Set<CountryCode.Supported> supportedCountries;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserInAnyExperiment copy$default(UserInAnyExperiment userInAnyExperiment, List list, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                list = userInAnyExperiment.experimentTargets;
            }
            if ((i & 2) != 0) {
                set = userInAnyExperiment.excludedCountries;
            }
            return userInAnyExperiment.copy(list, set);
        }

        public final List<ExperimentTarget<?>> component1() {
            return this.experimentTargets;
        }

        public final Set<CountryCode.Supported> component2() {
            return this.excludedCountries;
        }

        public final UserInAnyExperiment copy(List<? extends ExperimentTarget<?>> experimentTargets, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(experimentTargets, "experimentTargets");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            return new UserInAnyExperiment(experimentTargets, excludedCountries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInAnyExperiment)) {
                return false;
            }
            UserInAnyExperiment userInAnyExperiment = (UserInAnyExperiment) other;
            return Intrinsics.areEqual(this.experimentTargets, userInAnyExperiment.experimentTargets) && Intrinsics.areEqual(this.excludedCountries, userInAnyExperiment.excludedCountries);
        }

        public int hashCode() {
            return (this.experimentTargets.hashCode() * 31) + this.excludedCountries.hashCode();
        }

        public String toString() {
            return "UserInAnyExperiment(experimentTargets=" + this.experimentTargets + ", excludedCountries=" + this.excludedCountries + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserInAnyExperiment(List<? extends ExperimentTarget<?>> experimentTargets, Set<? extends CountryCode.Supported> excludedCountries) {
            Intrinsics.checkNotNullParameter(experimentTargets, "experimentTargets");
            Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
            this.experimentTargets = experimentTargets;
            this.excludedCountries = excludedCountries;
            this.supportedCountries = SetsKt.emptySet();
            List<? extends ExperimentTarget<?>> list = experimentTargets;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ExperimentTarget) it.next()).getMemberVariants().isEmpty()) {
                    throw new IllegalArgumentException("All experiment targets must have at least 1 member variant");
                }
            }
        }

        public final List<ExperimentTarget<?>> getExperimentTargets() {
            return this.experimentTargets;
        }

        public /* synthetic */ UserInAnyExperiment(List list, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? SetsKt.emptySet() : set);
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getExcludedCountries() {
            return this.excludedCountries;
        }

        @Override // com.robinhood.android.regiongate.RegionGateConfiguration
        public Set<CountryCode.Supported> getSupportedCountries() {
            return this.supportedCountries;
        }

        /* compiled from: RegionGateConfiguration.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0086\u0002J5\u0010\u0004\u001a\u00020\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0086\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInAnyExperiment$Companion;", "", "<init>", "()V", "invoke", "Lcom/robinhood/android/regiongate/RegionGateConfiguration$UserInAnyExperiment;", "experiments", "", "Lcom/robinhood/experiments/Experiment;", "excludedCountries", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "disabledVariants", "", "experiment", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UserInAnyExperiment invoke$default(Companion companion, List list, Set set, Set set2, int i, Object obj) {
                if ((i & 2) != 0) {
                    set = SetsKt.emptySet();
                }
                if ((i & 4) != 0) {
                    set2 = KaizenExperiment.INSTANCE.getDisabledExperimentVariants();
                }
                return companion.invoke((List<? extends Experiment<?>>) list, (Set<? extends CountryCode.Supported>) set, (Set<String>) set2);
            }

            public final UserInAnyExperiment invoke(List<? extends Experiment<?>> experiments, Set<? extends CountryCode.Supported> excludedCountries, Set<String> disabledVariants) {
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
                Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
                List<? extends Experiment<?>> list = experiments;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ExperimentTarget2.toExperimentTarget((Experiment) it.next(), disabledVariants));
                }
                return new UserInAnyExperiment(arrayList, excludedCountries);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UserInAnyExperiment invoke$default(Companion companion, Experiment experiment, Set set, Set set2, int i, Object obj) {
                if ((i & 2) != 0) {
                    set = SetsKt.emptySet();
                }
                if ((i & 4) != 0) {
                    set2 = KaizenExperiment.INSTANCE.getDisabledExperimentVariants();
                }
                return companion.invoke((Experiment<?>) experiment, (Set<? extends CountryCode.Supported>) set, (Set<String>) set2);
            }

            public final UserInAnyExperiment invoke(Experiment<?> experiment, Set<? extends CountryCode.Supported> excludedCountries, Set<String> disabledVariants) {
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                Intrinsics.checkNotNullParameter(excludedCountries, "excludedCountries");
                Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
                return new UserInAnyExperiment(CollectionsKt.listOf(ExperimentTarget2.toExperimentTarget(experiment, disabledVariants)), excludedCountries);
            }
        }
    }
}
