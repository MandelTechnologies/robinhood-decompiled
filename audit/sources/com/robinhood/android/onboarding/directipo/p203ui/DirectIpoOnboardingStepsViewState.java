package com.robinhood.android.onboarding.directipo.p203ui;

import android.content.res.Resources;
import com.robinhood.android.onboarding.directipo.C22750R;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboarding;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoOnboardingStepsViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState;", "", "onboarding", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "selectedPage", "", "<init>", "(Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "currentProgress", "getCurrentProgress", "()I", "maxProgress", "getMaxProgress", "steps", "", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingStep;", "getSteps", "()Ljava/util/List;", "continueButtonAction", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction;", "getContinueButtonAction", "()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction;", "getPageIndicatorText", "", "resources", "Landroid/content/res/Resources;", "component1", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;Ljava/lang/Integer;)Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState;", "equals", "", "other", "hashCode", "toString", "", "ContinueButtonAction", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class DirectIpoOnboardingStepsViewState {
    public static final int $stable = 8;
    private final int currentProgress;
    private final int maxProgress;
    private final UiDirectIpoOnboarding onboarding;
    private final Integer selectedPage;
    private final List<UiDirectIpoOnboardingStep> steps;

    /* JADX WARN: Multi-variable type inference failed */
    public DirectIpoOnboardingStepsViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final UiDirectIpoOnboarding getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component2, reason: from getter */
    private final Integer getSelectedPage() {
        return this.selectedPage;
    }

    public static /* synthetic */ DirectIpoOnboardingStepsViewState copy$default(DirectIpoOnboardingStepsViewState directIpoOnboardingStepsViewState, UiDirectIpoOnboarding uiDirectIpoOnboarding, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            uiDirectIpoOnboarding = directIpoOnboardingStepsViewState.onboarding;
        }
        if ((i & 2) != 0) {
            num = directIpoOnboardingStepsViewState.selectedPage;
        }
        return directIpoOnboardingStepsViewState.copy(uiDirectIpoOnboarding, num);
    }

    public final DirectIpoOnboardingStepsViewState copy(UiDirectIpoOnboarding onboarding, Integer selectedPage) {
        return new DirectIpoOnboardingStepsViewState(onboarding, selectedPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoOnboardingStepsViewState)) {
            return false;
        }
        DirectIpoOnboardingStepsViewState directIpoOnboardingStepsViewState = (DirectIpoOnboardingStepsViewState) other;
        return Intrinsics.areEqual(this.onboarding, directIpoOnboardingStepsViewState.onboarding) && Intrinsics.areEqual(this.selectedPage, directIpoOnboardingStepsViewState.selectedPage);
    }

    public int hashCode() {
        UiDirectIpoOnboarding uiDirectIpoOnboarding = this.onboarding;
        int iHashCode = (uiDirectIpoOnboarding == null ? 0 : uiDirectIpoOnboarding.hashCode()) * 31;
        Integer num = this.selectedPage;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DirectIpoOnboardingStepsViewState(onboarding=" + this.onboarding + ", selectedPage=" + this.selectedPage + ")";
    }

    public DirectIpoOnboardingStepsViewState(UiDirectIpoOnboarding uiDirectIpoOnboarding, Integer num) {
        this.onboarding = uiDirectIpoOnboarding;
        this.selectedPage = num;
        this.currentProgress = num != null ? num.intValue() + 1 : 0;
        this.maxProgress = uiDirectIpoOnboarding != null ? uiDirectIpoOnboarding.getSteps().size() : 0;
        this.steps = uiDirectIpoOnboarding != null ? uiDirectIpoOnboarding.getSteps() : null;
    }

    public /* synthetic */ DirectIpoOnboardingStepsViewState(UiDirectIpoOnboarding uiDirectIpoOnboarding, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiDirectIpoOnboarding, (i & 2) != 0 ? null : num);
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public final List<UiDirectIpoOnboardingStep> getSteps() {
        return this.steps;
    }

    public final ContinueButtonAction getContinueButtonAction() {
        Integer num;
        if (this.onboarding == null || (num = this.selectedPage) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (this.currentProgress == this.maxProgress) {
            return new ContinueButtonAction.Complete(this.onboarding.getViewAvailableIposButtonTitle());
        }
        return new ContinueButtonAction.Next(iIntValue + 1);
    }

    public final CharSequence getPageIndicatorText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.onboarding == null) {
            return null;
        }
        return resources.getString(C22750R.string.direct_ipo_onboarding_page_indicator, Integer.valueOf(this.currentProgress));
    }

    /* compiled from: DirectIpoOnboardingStepsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction;", "", "<init>", "()V", "Next", "Complete", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction$Complete;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction$Next;", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContinueButtonAction {
        public static final int $stable = 0;

        public /* synthetic */ ContinueButtonAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContinueButtonAction() {
        }

        /* compiled from: DirectIpoOnboardingStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction$Next;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction;", "nextPage", "", "<init>", "(I)V", "getNextPage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Next extends ContinueButtonAction {
            public static final int $stable = 0;
            private final int nextPage;

            public static /* synthetic */ Next copy$default(Next next, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = next.nextPage;
                }
                return next.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNextPage() {
                return this.nextPage;
            }

            public final Next copy(int nextPage) {
                return new Next(nextPage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Next) && this.nextPage == ((Next) other).nextPage;
            }

            public int hashCode() {
                return Integer.hashCode(this.nextPage);
            }

            public String toString() {
                return "Next(nextPage=" + this.nextPage + ")";
            }

            public Next(int i) {
                super(null);
                this.nextPage = i;
            }

            public final int getNextPage() {
                return this.nextPage;
            }
        }

        /* compiled from: DirectIpoOnboardingStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction$Complete;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState$ContinueButtonAction;", "buttonTitle", "", "<init>", "(Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Complete extends ContinueButtonAction {
            public static final int $stable = 0;
            private final String buttonTitle;

            public static /* synthetic */ Complete copy$default(Complete complete, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = complete.buttonTitle;
                }
                return complete.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            public final Complete copy(String buttonTitle) {
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                return new Complete(buttonTitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && Intrinsics.areEqual(this.buttonTitle, ((Complete) other).buttonTitle);
            }

            public int hashCode() {
                return this.buttonTitle.hashCode();
            }

            public String toString() {
                return "Complete(buttonTitle=" + this.buttonTitle + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Complete(String buttonTitle) {
                super(null);
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                this.buttonTitle = buttonTitle;
            }

            public final String getButtonTitle() {
                return this.buttonTitle;
            }
        }
    }
}
