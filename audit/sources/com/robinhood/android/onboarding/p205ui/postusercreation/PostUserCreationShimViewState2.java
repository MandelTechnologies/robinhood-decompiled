package com.robinhood.android.onboarding.p205ui.postusercreation;

import android.net.Uri;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostUserCreationShimViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "", "RhyUpgrade", "SdOnboarding", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs$RhyUpgrade;", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs$SdOnboarding;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postusercreation.OnboardingArgs, reason: use source file name */
/* loaded from: classes10.dex */
public interface PostUserCreationShimViewState2 {

    /* compiled from: PostUserCreationShimViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs$RhyUpgrade;", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "exitDeeplinkOverride", "Landroid/net/Uri;", "queryParameters", "", "", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getQueryParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.OnboardingArgs$RhyUpgrade, reason: from toString */
    public static final /* data */ class RhyUpgrade implements PostUserCreationShimViewState2 {
        public static final int $stable = 8;
        private final Uri exitDeeplinkOverride;
        private final Map<String, String> queryParameters;

        /* JADX WARN: Multi-variable type inference failed */
        public RhyUpgrade() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RhyUpgrade copy$default(RhyUpgrade rhyUpgrade, Uri uri, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = rhyUpgrade.exitDeeplinkOverride;
            }
            if ((i & 2) != 0) {
                map = rhyUpgrade.queryParameters;
            }
            return rhyUpgrade.copy(uri, map);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }

        public final Map<String, String> component2() {
            return this.queryParameters;
        }

        public final RhyUpgrade copy(Uri exitDeeplinkOverride, Map<String, String> queryParameters) {
            Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
            return new RhyUpgrade(exitDeeplinkOverride, queryParameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhyUpgrade)) {
                return false;
            }
            RhyUpgrade rhyUpgrade = (RhyUpgrade) other;
            return Intrinsics.areEqual(this.exitDeeplinkOverride, rhyUpgrade.exitDeeplinkOverride) && Intrinsics.areEqual(this.queryParameters, rhyUpgrade.queryParameters);
        }

        public int hashCode() {
            Uri uri = this.exitDeeplinkOverride;
            return ((uri == null ? 0 : uri.hashCode()) * 31) + this.queryParameters.hashCode();
        }

        public String toString() {
            return "RhyUpgrade(exitDeeplinkOverride=" + this.exitDeeplinkOverride + ", queryParameters=" + this.queryParameters + ")";
        }

        public RhyUpgrade(Uri uri, Map<String, String> queryParameters) {
            Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
            this.exitDeeplinkOverride = uri;
            this.queryParameters = queryParameters;
        }

        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }

        public /* synthetic */ RhyUpgrade(Uri uri, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, String> getQueryParameters() {
            return this.queryParameters;
        }
    }

    /* compiled from: PostUserCreationShimViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs$SdOnboarding;", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "flowPathType", "Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "entryPointIdentifier", "", "exitDeeplinkOverride", "Landroid/net/Uri;", "<init>", "(Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;Ljava/lang/String;Landroid/net/Uri;)V", "getFlowPathType", "()Lcom/robinhood/android/onboarding/contracts/OnboardingFlowPathType;", "getEntryPointIdentifier", "()Ljava/lang/String;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.OnboardingArgs$SdOnboarding, reason: from toString */
    public static final /* data */ class SdOnboarding implements PostUserCreationShimViewState2 {
        public static final int $stable = 8;
        private final String entryPointIdentifier;
        private final Uri exitDeeplinkOverride;
        private final OnboardingFlowPathType flowPathType;

        public static /* synthetic */ SdOnboarding copy$default(SdOnboarding sdOnboarding, OnboardingFlowPathType onboardingFlowPathType, String str, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                onboardingFlowPathType = sdOnboarding.flowPathType;
            }
            if ((i & 2) != 0) {
                str = sdOnboarding.entryPointIdentifier;
            }
            if ((i & 4) != 0) {
                uri = sdOnboarding.exitDeeplinkOverride;
            }
            return sdOnboarding.copy(onboardingFlowPathType, str, uri);
        }

        /* renamed from: component1, reason: from getter */
        public final OnboardingFlowPathType getFlowPathType() {
            return this.flowPathType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }

        public final SdOnboarding copy(OnboardingFlowPathType flowPathType, String entryPointIdentifier, Uri exitDeeplinkOverride) {
            Intrinsics.checkNotNullParameter(flowPathType, "flowPathType");
            return new SdOnboarding(flowPathType, entryPointIdentifier, exitDeeplinkOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdOnboarding)) {
                return false;
            }
            SdOnboarding sdOnboarding = (SdOnboarding) other;
            return Intrinsics.areEqual(this.flowPathType, sdOnboarding.flowPathType) && Intrinsics.areEqual(this.entryPointIdentifier, sdOnboarding.entryPointIdentifier) && Intrinsics.areEqual(this.exitDeeplinkOverride, sdOnboarding.exitDeeplinkOverride);
        }

        public int hashCode() {
            int iHashCode = this.flowPathType.hashCode() * 31;
            String str = this.entryPointIdentifier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Uri uri = this.exitDeeplinkOverride;
            return iHashCode2 + (uri != null ? uri.hashCode() : 0);
        }

        public String toString() {
            return "SdOnboarding(flowPathType=" + this.flowPathType + ", entryPointIdentifier=" + this.entryPointIdentifier + ", exitDeeplinkOverride=" + this.exitDeeplinkOverride + ")";
        }

        public SdOnboarding(OnboardingFlowPathType flowPathType, String str, Uri uri) {
            Intrinsics.checkNotNullParameter(flowPathType, "flowPathType");
            this.flowPathType = flowPathType;
            this.entryPointIdentifier = str;
            this.exitDeeplinkOverride = uri;
        }

        public /* synthetic */ SdOnboarding(OnboardingFlowPathType onboardingFlowPathType, String str, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(onboardingFlowPathType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uri);
        }

        public final OnboardingFlowPathType getFlowPathType() {
            return this.flowPathType;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }
    }
}
