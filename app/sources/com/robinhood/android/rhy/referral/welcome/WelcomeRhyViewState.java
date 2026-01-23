package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState;", "", "ctaConfig", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "disclosureContent", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "<init>", "(Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;)V", "getCtaConfig", "()Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "getDisclosureContent", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "showContinue", "", "getShowContinue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "CtaConfig", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WelcomeRhyViewState {
    public static final int $stable = 8;
    private final CtaConfig ctaConfig;
    private final DisclosureContent disclosureContent;

    public static /* synthetic */ WelcomeRhyViewState copy$default(WelcomeRhyViewState welcomeRhyViewState, CtaConfig ctaConfig, DisclosureContent disclosureContent, int i, Object obj) {
        if ((i & 1) != 0) {
            ctaConfig = welcomeRhyViewState.ctaConfig;
        }
        if ((i & 2) != 0) {
            disclosureContent = welcomeRhyViewState.disclosureContent;
        }
        return welcomeRhyViewState.copy(ctaConfig, disclosureContent);
    }

    /* renamed from: component1, reason: from getter */
    public final CtaConfig getCtaConfig() {
        return this.ctaConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }

    public final WelcomeRhyViewState copy(CtaConfig ctaConfig, DisclosureContent disclosureContent) {
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        return new WelcomeRhyViewState(ctaConfig, disclosureContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeRhyViewState)) {
            return false;
        }
        WelcomeRhyViewState welcomeRhyViewState = (WelcomeRhyViewState) other;
        return Intrinsics.areEqual(this.ctaConfig, welcomeRhyViewState.ctaConfig) && Intrinsics.areEqual(this.disclosureContent, welcomeRhyViewState.disclosureContent);
    }

    public int hashCode() {
        int iHashCode = this.ctaConfig.hashCode() * 31;
        DisclosureContent disclosureContent = this.disclosureContent;
        return iHashCode + (disclosureContent == null ? 0 : disclosureContent.hashCode());
    }

    public String toString() {
        return "WelcomeRhyViewState(ctaConfig=" + this.ctaConfig + ", disclosureContent=" + this.disclosureContent + ")";
    }

    public WelcomeRhyViewState(CtaConfig ctaConfig, DisclosureContent disclosureContent) {
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        this.ctaConfig = ctaConfig;
        this.disclosureContent = disclosureContent;
    }

    public final CtaConfig getCtaConfig() {
        return this.ctaConfig;
    }

    public final DisclosureContent getDisclosureContent() {
        return this.disclosureContent;
    }

    public final boolean getShowContinue() {
        return this.ctaConfig instanceof CtaConfig.Continue;
    }

    /* compiled from: WelcomeRhyViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "loading", "getLoading", "Auth", "Continue", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig$Auth;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig$Continue;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CtaConfig {
        public static final int $stable = 0;
        private final boolean enabled;
        private final boolean loading;

        public /* synthetic */ CtaConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CtaConfig() {
            this.enabled = true;
        }

        public boolean getEnabled() {
            return this.enabled;
        }

        public boolean getLoading() {
            return this.loading;
        }

        /* compiled from: WelcomeRhyViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig$Auth;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "enabled", "", "loading", "<init>", "(ZZ)V", "getEnabled", "()Z", "getLoading", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Auth extends CtaConfig {
            public static final int $stable = 0;
            private final boolean enabled;
            private final boolean loading;

            public static /* synthetic */ Auth copy$default(Auth auth, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = auth.enabled;
                }
                if ((i & 2) != 0) {
                    z2 = auth.loading;
                }
                return auth.copy(z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getLoading() {
                return this.loading;
            }

            public final Auth copy(boolean enabled, boolean loading) {
                return new Auth(enabled, loading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Auth)) {
                    return false;
                }
                Auth auth = (Auth) other;
                return this.enabled == auth.enabled && this.loading == auth.loading;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.loading);
            }

            public String toString() {
                return "Auth(enabled=" + this.enabled + ", loading=" + this.loading + ")";
            }

            @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState.CtaConfig
            public boolean getEnabled() {
                return this.enabled;
            }

            @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState.CtaConfig
            public boolean getLoading() {
                return this.loading;
            }

            public Auth(boolean z, boolean z2) {
                super(null);
                this.enabled = z;
                this.loading = z2;
            }
        }

        /* compiled from: WelcomeRhyViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig$Continue;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "enabled", "", "loading", "outAction", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "<init>", "(ZZLcom/robinhood/rhy/referral/RhyReferralOutAction;)V", "getEnabled", "()Z", "getLoading", "getOutAction", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Continue extends CtaConfig {
            public static final int $stable = 8;
            private final boolean enabled;
            private final boolean loading;
            private final RhyReferralOnboardingStore4 outAction;

            public static /* synthetic */ Continue copy$default(Continue r0, boolean z, boolean z2, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = r0.enabled;
                }
                if ((i & 2) != 0) {
                    z2 = r0.loading;
                }
                if ((i & 4) != 0) {
                    rhyReferralOnboardingStore4 = r0.outAction;
                }
                return r0.copy(z, z2, rhyReferralOnboardingStore4);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getLoading() {
                return this.loading;
            }

            /* renamed from: component3, reason: from getter */
            public final RhyReferralOnboardingStore4 getOutAction() {
                return this.outAction;
            }

            public final Continue copy(boolean enabled, boolean loading, RhyReferralOnboardingStore4 outAction) {
                return new Continue(enabled, loading, outAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Continue)) {
                    return false;
                }
                Continue r5 = (Continue) other;
                return this.enabled == r5.enabled && this.loading == r5.loading && Intrinsics.areEqual(this.outAction, r5.outAction);
            }

            public int hashCode() {
                int iHashCode = ((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.loading)) * 31;
                RhyReferralOnboardingStore4 rhyReferralOnboardingStore4 = this.outAction;
                return iHashCode + (rhyReferralOnboardingStore4 == null ? 0 : rhyReferralOnboardingStore4.hashCode());
            }

            public String toString() {
                return "Continue(enabled=" + this.enabled + ", loading=" + this.loading + ", outAction=" + this.outAction + ")";
            }

            @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState.CtaConfig
            public boolean getEnabled() {
                return this.enabled;
            }

            @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState.CtaConfig
            public boolean getLoading() {
                return this.loading;
            }

            public final RhyReferralOnboardingStore4 getOutAction() {
                return this.outAction;
            }

            public Continue(boolean z, boolean z2, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4) {
                super(null);
                this.enabled = z;
                this.loading = z2;
                this.outAction = rhyReferralOnboardingStore4;
            }
        }
    }
}
