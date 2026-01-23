package com.robinhood.android.onboarding.p205ui.postfundupsell.loading;

import com.robinhood.android.onboarding.p205ui.postfundupsell.OnboardingUpsellVariant;
import com.robinhood.models.onboardingupsell.ApiOnboardingUpsellFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent;", "", "Loaded", "Error", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent$Error;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent$Loaded;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface OnboardingUpsellLoadingEvent {

    /* compiled from: OnboardingUpsellLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent$Loaded;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent;", "onboardingUpsellFlow", "Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "upsellVariant", "Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", "<init>", "(Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;)V", "getOnboardingUpsellFlow", "()Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "getUpsellVariant", "()Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements OnboardingUpsellLoadingEvent {
        public static final int $stable = 8;
        private final ApiOnboardingUpsellFlow onboardingUpsellFlow;
        private final OnboardingUpsellVariant upsellVariant;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiOnboardingUpsellFlow apiOnboardingUpsellFlow, OnboardingUpsellVariant onboardingUpsellVariant, int i, Object obj) {
            if ((i & 1) != 0) {
                apiOnboardingUpsellFlow = loaded.onboardingUpsellFlow;
            }
            if ((i & 2) != 0) {
                onboardingUpsellVariant = loaded.upsellVariant;
            }
            return loaded.copy(apiOnboardingUpsellFlow, onboardingUpsellVariant);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiOnboardingUpsellFlow getOnboardingUpsellFlow() {
            return this.onboardingUpsellFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final OnboardingUpsellVariant getUpsellVariant() {
            return this.upsellVariant;
        }

        public final Loaded copy(ApiOnboardingUpsellFlow onboardingUpsellFlow, OnboardingUpsellVariant upsellVariant) {
            Intrinsics.checkNotNullParameter(onboardingUpsellFlow, "onboardingUpsellFlow");
            Intrinsics.checkNotNullParameter(upsellVariant, "upsellVariant");
            return new Loaded(onboardingUpsellFlow, upsellVariant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.onboardingUpsellFlow, loaded.onboardingUpsellFlow) && this.upsellVariant == loaded.upsellVariant;
        }

        public int hashCode() {
            return (this.onboardingUpsellFlow.hashCode() * 31) + this.upsellVariant.hashCode();
        }

        public String toString() {
            return "Loaded(onboardingUpsellFlow=" + this.onboardingUpsellFlow + ", upsellVariant=" + this.upsellVariant + ")";
        }

        public Loaded(ApiOnboardingUpsellFlow onboardingUpsellFlow, OnboardingUpsellVariant upsellVariant) {
            Intrinsics.checkNotNullParameter(onboardingUpsellFlow, "onboardingUpsellFlow");
            Intrinsics.checkNotNullParameter(upsellVariant, "upsellVariant");
            this.onboardingUpsellFlow = onboardingUpsellFlow;
            this.upsellVariant = upsellVariant;
        }

        public final ApiOnboardingUpsellFlow getOnboardingUpsellFlow() {
            return this.onboardingUpsellFlow;
        }

        public final OnboardingUpsellVariant getUpsellVariant() {
            return this.upsellVariant;
        }
    }

    /* compiled from: OnboardingUpsellLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent$Error;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements OnboardingUpsellLoadingEvent {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
