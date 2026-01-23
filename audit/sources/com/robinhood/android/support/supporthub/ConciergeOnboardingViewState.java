package com.robinhood.android.support.supporthub;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: ConciergeOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;", "", "initialLoadingState", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "<init>", "(Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;)V", "getInitialLoadingState", "()Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InitialLoadingState", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConciergeOnboardingViewState {
    public static final int $stable = 8;
    private final InitialLoadingState initialLoadingState;

    /* JADX WARN: Multi-variable type inference failed */
    public ConciergeOnboardingViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ConciergeOnboardingViewState copy$default(ConciergeOnboardingViewState conciergeOnboardingViewState, InitialLoadingState initialLoadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            initialLoadingState = conciergeOnboardingViewState.initialLoadingState;
        }
        return conciergeOnboardingViewState.copy(initialLoadingState);
    }

    /* renamed from: component1, reason: from getter */
    public final InitialLoadingState getInitialLoadingState() {
        return this.initialLoadingState;
    }

    public final ConciergeOnboardingViewState copy(InitialLoadingState initialLoadingState) {
        Intrinsics.checkNotNullParameter(initialLoadingState, "initialLoadingState");
        return new ConciergeOnboardingViewState(initialLoadingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConciergeOnboardingViewState) && Intrinsics.areEqual(this.initialLoadingState, ((ConciergeOnboardingViewState) other).initialLoadingState);
    }

    public int hashCode() {
        return this.initialLoadingState.hashCode();
    }

    public String toString() {
        return "ConciergeOnboardingViewState(initialLoadingState=" + this.initialLoadingState + ")";
    }

    public ConciergeOnboardingViewState(InitialLoadingState initialLoadingState) {
        Intrinsics.checkNotNullParameter(initialLoadingState, "initialLoadingState");
        this.initialLoadingState = initialLoadingState;
    }

    public /* synthetic */ ConciergeOnboardingViewState(InitialLoadingState initialLoadingState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InitialLoadingState.Uninitialized.INSTANCE : initialLoadingState);
    }

    public final InitialLoadingState getInitialLoadingState() {
        return this.initialLoadingState;
    }

    /* compiled from: ConciergeOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "", "Uninitialized", "Loading", "Loaded", "Error", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Error;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Loaded;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Loading;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Uninitialized;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InitialLoadingState {

        /* compiled from: ConciergeOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Uninitialized;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Uninitialized implements InitialLoadingState {
            public static final int $stable = 0;
            public static final Uninitialized INSTANCE = new Uninitialized();

            public boolean equals(Object other) {
                return this == other || (other instanceof Uninitialized);
            }

            public int hashCode() {
                return 190995147;
            }

            public String toString() {
                return "Uninitialized";
            }

            private Uninitialized() {
            }
        }

        /* compiled from: ConciergeOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Loading;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements InitialLoadingState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -944803476;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: ConciergeOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Loaded;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "subScreen", "Lcom/robinhood/android/support/supporthub/SubScreen;", "useCloseNavButton", "", "useEndButton", "progressPercentage", "", "orderedScreens", "Lkotlinx/collections/immutable/PersistentList;", "<init>", "(Lcom/robinhood/android/support/supporthub/SubScreen;ZZFLkotlinx/collections/immutable/PersistentList;)V", "getSubScreen", "()Lcom/robinhood/android/support/supporthub/SubScreen;", "getUseCloseNavButton", "()Z", "getUseEndButton", "getProgressPercentage", "()F", "getOrderedScreens", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements InitialLoadingState {
            public static final int $stable = 0;
            private final ImmutableList3<ConciergeOnboardingViewState2> orderedScreens;
            private final float progressPercentage;
            private final ConciergeOnboardingViewState2 subScreen;
            private final boolean useCloseNavButton;
            private final boolean useEndButton;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, ConciergeOnboardingViewState2 conciergeOnboardingViewState2, boolean z, boolean z2, float f, ImmutableList3 immutableList3, int i, Object obj) {
                if ((i & 1) != 0) {
                    conciergeOnboardingViewState2 = loaded.subScreen;
                }
                if ((i & 2) != 0) {
                    z = loaded.useCloseNavButton;
                }
                if ((i & 4) != 0) {
                    z2 = loaded.useEndButton;
                }
                if ((i & 8) != 0) {
                    f = loaded.progressPercentage;
                }
                if ((i & 16) != 0) {
                    immutableList3 = loaded.orderedScreens;
                }
                ImmutableList3 immutableList32 = immutableList3;
                boolean z3 = z2;
                return loaded.copy(conciergeOnboardingViewState2, z, z3, f, immutableList32);
            }

            /* renamed from: component1, reason: from getter */
            public final ConciergeOnboardingViewState2 getSubScreen() {
                return this.subScreen;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getUseCloseNavButton() {
                return this.useCloseNavButton;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getUseEndButton() {
                return this.useEndButton;
            }

            /* renamed from: component4, reason: from getter */
            public final float getProgressPercentage() {
                return this.progressPercentage;
            }

            public final ImmutableList3<ConciergeOnboardingViewState2> component5() {
                return this.orderedScreens;
            }

            public final Loaded copy(ConciergeOnboardingViewState2 subScreen, boolean useCloseNavButton, boolean useEndButton, float progressPercentage, ImmutableList3<? extends ConciergeOnboardingViewState2> orderedScreens) {
                Intrinsics.checkNotNullParameter(subScreen, "subScreen");
                Intrinsics.checkNotNullParameter(orderedScreens, "orderedScreens");
                return new Loaded(subScreen, useCloseNavButton, useEndButton, progressPercentage, orderedScreens);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.subScreen, loaded.subScreen) && this.useCloseNavButton == loaded.useCloseNavButton && this.useEndButton == loaded.useEndButton && Float.compare(this.progressPercentage, loaded.progressPercentage) == 0 && Intrinsics.areEqual(this.orderedScreens, loaded.orderedScreens);
            }

            public int hashCode() {
                return (((((((this.subScreen.hashCode() * 31) + Boolean.hashCode(this.useCloseNavButton)) * 31) + Boolean.hashCode(this.useEndButton)) * 31) + Float.hashCode(this.progressPercentage)) * 31) + this.orderedScreens.hashCode();
            }

            public String toString() {
                return "Loaded(subScreen=" + this.subScreen + ", useCloseNavButton=" + this.useCloseNavButton + ", useEndButton=" + this.useEndButton + ", progressPercentage=" + this.progressPercentage + ", orderedScreens=" + this.orderedScreens + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Loaded(ConciergeOnboardingViewState2 subScreen, boolean z, boolean z2, float f, ImmutableList3<? extends ConciergeOnboardingViewState2> orderedScreens) {
                Intrinsics.checkNotNullParameter(subScreen, "subScreen");
                Intrinsics.checkNotNullParameter(orderedScreens, "orderedScreens");
                this.subScreen = subScreen;
                this.useCloseNavButton = z;
                this.useEndButton = z2;
                this.progressPercentage = f;
                this.orderedScreens = orderedScreens;
            }

            public final ConciergeOnboardingViewState2 getSubScreen() {
                return this.subScreen;
            }

            public final boolean getUseCloseNavButton() {
                return this.useCloseNavButton;
            }

            public final boolean getUseEndButton() {
                return this.useEndButton;
            }

            public final float getProgressPercentage() {
                return this.progressPercentage;
            }

            public final ImmutableList3<ConciergeOnboardingViewState2> getOrderedScreens() {
                return this.orderedScreens;
            }
        }

        /* compiled from: ConciergeOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState$Error;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState$InitialLoadingState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements InitialLoadingState {
            public static final int $stable = 8;
            private final Throwable cause;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.cause;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final Error copy(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new Error(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }

            public Error(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }
    }
}
