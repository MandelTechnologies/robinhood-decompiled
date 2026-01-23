package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelmDuxoEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent;", "", "ProcessDestination", "LaunchUi", "EndFlow", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$EndFlow;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$LaunchUi;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$ProcessDestination;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface HelmDuxoEvent {

    /* compiled from: HelmDuxoEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$ProcessDestination;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent;", "destination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "<init>", "(Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;)V", "getDestination", "()Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ProcessDestination implements HelmDuxoEvent {
        public static final int $stable = 0;
        private final PostSignUpDestination destination;

        public static /* synthetic */ ProcessDestination copy$default(ProcessDestination processDestination, PostSignUpDestination postSignUpDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                postSignUpDestination = processDestination.destination;
            }
            return processDestination.copy(postSignUpDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final PostSignUpDestination getDestination() {
            return this.destination;
        }

        public final ProcessDestination copy(PostSignUpDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new ProcessDestination(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessDestination) && Intrinsics.areEqual(this.destination, ((ProcessDestination) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "ProcessDestination(destination=" + this.destination + ")";
        }

        public ProcessDestination(PostSignUpDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
        }

        public final PostSignUpDestination getDestination() {
            return this.destination;
        }
    }

    /* compiled from: HelmDuxoEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$LaunchUi;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchUi implements HelmDuxoEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ LaunchUi copy$default(LaunchUi launchUi, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = launchUi.fragmentKey;
            }
            return launchUi.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final LaunchUi copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new LaunchUi(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchUi) && Intrinsics.areEqual(this.fragmentKey, ((LaunchUi) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "LaunchUi(fragmentKey=" + this.fragmentKey + ")";
        }

        public LaunchUi(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: HelmDuxoEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent$EndFlow;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxoEvent;", "isRhy", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EndFlow implements HelmDuxoEvent {
        public static final int $stable = 0;
        private final boolean isRhy;

        public static /* synthetic */ EndFlow copy$default(EndFlow endFlow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = endFlow.isRhy;
            }
            return endFlow.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRhy() {
            return this.isRhy;
        }

        public final EndFlow copy(boolean isRhy) {
            return new EndFlow(isRhy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EndFlow) && this.isRhy == ((EndFlow) other).isRhy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRhy);
        }

        public String toString() {
            return "EndFlow(isRhy=" + this.isRhy + ")";
        }

        public EndFlow(boolean z) {
            this.isRhy = z;
        }

        public final boolean isRhy() {
            return this.isRhy;
        }
    }
}
