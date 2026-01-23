package com.robinhood.android.autoeventlogging;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggableViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/LoadedState;", "", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "Loading", "Completed", "Failed", "Lcom/robinhood/android/autoeventlogging/LoadedState$Completed;", "Lcom/robinhood/android/autoeventlogging/LoadedState$Failed;", "Lcom/robinhood/android/autoeventlogging/LoadedState$Loading;", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.autoeventlogging.LoadedState, reason: use source file name */
/* loaded from: classes7.dex */
public interface LoggableViewState2 {
    String getIdentifier();

    /* compiled from: LoggableViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/LoadedState$Loading;", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.autoeventlogging.LoadedState$Loading, reason: from toString */
    public static final /* data */ class Loading implements LoggableViewState2 {
        private final String identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.identifier;
            }
            return loading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Loading copy(String identifier) {
            return new Loading(identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.identifier, ((Loading) other).identifier);
        }

        public int hashCode() {
            String str = this.identifier;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Loading(identifier=" + this.identifier + ")";
        }

        public Loading(String str) {
            this.identifier = str;
        }

        public /* synthetic */ Loading(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState2
        public String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: LoggableViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/LoadedState$Completed;", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "identifier", "", "dependentIdentifiers", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "getIdentifier", "()Ljava/lang/String;", "getDependentIdentifiers", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.autoeventlogging.LoadedState$Completed, reason: from toString */
    public static final /* data */ class Completed implements LoggableViewState2 {
        private final Set<String> dependentIdentifiers;
        private final String identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public Completed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Completed copy$default(Completed completed, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = completed.identifier;
            }
            if ((i & 2) != 0) {
                set = completed.dependentIdentifiers;
            }
            return completed.copy(str, set);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Set<String> component2() {
            return this.dependentIdentifiers;
        }

        public final Completed copy(String identifier, Set<String> dependentIdentifiers) {
            Intrinsics.checkNotNullParameter(dependentIdentifiers, "dependentIdentifiers");
            return new Completed(identifier, dependentIdentifiers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.identifier, completed.identifier) && Intrinsics.areEqual(this.dependentIdentifiers, completed.dependentIdentifiers);
        }

        public int hashCode() {
            String str = this.identifier;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.dependentIdentifiers.hashCode();
        }

        public String toString() {
            return "Completed(identifier=" + this.identifier + ", dependentIdentifiers=" + this.dependentIdentifiers + ")";
        }

        public Completed(String str, Set<String> dependentIdentifiers) {
            Intrinsics.checkNotNullParameter(dependentIdentifiers, "dependentIdentifiers");
            this.identifier = str;
            this.dependentIdentifiers = dependentIdentifiers;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState2
        public String getIdentifier() {
            return this.identifier;
        }

        public /* synthetic */ Completed(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? SetsKt.emptySet() : set);
        }

        public final Set<String> getDependentIdentifiers() {
            return this.dependentIdentifiers;
        }
    }

    /* compiled from: LoggableViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/LoadedState$Failed;", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.autoeventlogging.LoadedState$Failed, reason: from toString */
    public static final /* data */ class Failed implements LoggableViewState2 {
        private final String identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public Failed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.identifier;
            }
            return failed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Failed copy(String identifier) {
            return new Failed(identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.identifier, ((Failed) other).identifier);
        }

        public int hashCode() {
            String str = this.identifier;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(identifier=" + this.identifier + ")";
        }

        public Failed(String str) {
            this.identifier = str;
        }

        public /* synthetic */ Failed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState2
        public String getIdentifier() {
            return this.identifier;
        }
    }
}
