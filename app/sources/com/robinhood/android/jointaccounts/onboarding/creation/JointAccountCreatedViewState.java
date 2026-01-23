package com.robinhood.android.jointaccounts.onboarding.creation;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCreatedViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \n2\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Loading", "Success", "InitializationError", "LoadAccountError", "Companion", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$InitializationError;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$LoadAccountError;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Loading;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Success;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountCreatedViewState {
    public static final String ACCOUNT_CREATED_IDENTIFIER = "account-created";
    public static final String APPLICATION_PENDING_IDENTIFIER = "application-pending";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int LOADING_LOOP_END_FRAME = 204;

    UserInteractionEventDescriptor getDescriptor();

    /* compiled from: JointAccountCreatedViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Loading;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "titleText", "", "bodyText", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getTitleText", "()Ljava/lang/String;", "getBodyText", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements JointAccountCreatedViewState {
        public static final int $stable = 8;
        private final String bodyText;
        private final UserInteractionEventDescriptor descriptor;
        private final String titleText;

        public static /* synthetic */ Loading copy$default(Loading loading, String str, String str2, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.titleText;
            }
            if ((i & 2) != 0) {
                str2 = loading.bodyText;
            }
            if ((i & 4) != 0) {
                userInteractionEventDescriptor = loading.descriptor;
            }
            return loading.copy(str, str2, userInteractionEventDescriptor);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBodyText() {
            return this.bodyText;
        }

        /* renamed from: component3, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final Loading copy(String titleText, String bodyText, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new Loading(titleText, bodyText, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.titleText, loading.titleText) && Intrinsics.areEqual(this.bodyText, loading.bodyText) && Intrinsics.areEqual(this.descriptor, loading.descriptor);
        }

        public int hashCode() {
            String str = this.titleText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bodyText;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "Loading(titleText=" + this.titleText + ", bodyText=" + this.bodyText + ", descriptor=" + this.descriptor + ")";
        }

        public Loading(String str, String str2, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.titleText = str;
            this.bodyText = str2;
            this.descriptor = descriptor;
        }

        public /* synthetic */ Loading(String str, String str2, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, userInteractionEventDescriptor);
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public final String getBodyText() {
            return this.bodyText;
        }

        @Override // com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }

    /* compiled from: JointAccountCreatedViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\u000eHÆ\u0003Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Success;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "titleText", "", "bodyText", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "invitationState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "textAnimationFrame", "", "ctaAnimationFrame", "animationLoopStartFrame", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getTitleText", "()Ljava/lang/String;", "getBodyText", "getCta", "()Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "getInvitationState", "()Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "getTextAnimationFrame", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCtaAnimationFrame", "getAnimationLoopStartFrame", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Success;", "equals", "", "other", "", "hashCode", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements JointAccountCreatedViewState {
        public static final int $stable = 8;
        private final Integer animationLoopStartFrame;
        private final String bodyText;
        private final JointAccountCta cta;
        private final Integer ctaAnimationFrame;
        private final UserInteractionEventDescriptor descriptor;
        private final InvitationState invitationState;
        private final Integer textAnimationFrame;
        private final String titleText;

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, JointAccountCta jointAccountCta, InvitationState invitationState, Integer num, Integer num2, Integer num3, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.titleText;
            }
            if ((i & 2) != 0) {
                str2 = success.bodyText;
            }
            if ((i & 4) != 0) {
                jointAccountCta = success.cta;
            }
            if ((i & 8) != 0) {
                invitationState = success.invitationState;
            }
            if ((i & 16) != 0) {
                num = success.textAnimationFrame;
            }
            if ((i & 32) != 0) {
                num2 = success.ctaAnimationFrame;
            }
            if ((i & 64) != 0) {
                num3 = success.animationLoopStartFrame;
            }
            if ((i & 128) != 0) {
                userInteractionEventDescriptor = success.descriptor;
            }
            Integer num4 = num3;
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            Integer num5 = num;
            Integer num6 = num2;
            return success.copy(str, str2, jointAccountCta, invitationState, num5, num6, num4, userInteractionEventDescriptor2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBodyText() {
            return this.bodyText;
        }

        /* renamed from: component3, reason: from getter */
        public final JointAccountCta getCta() {
            return this.cta;
        }

        /* renamed from: component4, reason: from getter */
        public final InvitationState getInvitationState() {
            return this.invitationState;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getTextAnimationFrame() {
            return this.textAnimationFrame;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getCtaAnimationFrame() {
            return this.ctaAnimationFrame;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getAnimationLoopStartFrame() {
            return this.animationLoopStartFrame;
        }

        /* renamed from: component8, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final Success copy(String titleText, String bodyText, JointAccountCta cta, InvitationState invitationState, Integer textAnimationFrame, Integer ctaAnimationFrame, Integer animationLoopStartFrame, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(invitationState, "invitationState");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new Success(titleText, bodyText, cta, invitationState, textAnimationFrame, ctaAnimationFrame, animationLoopStartFrame, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.titleText, success.titleText) && Intrinsics.areEqual(this.bodyText, success.bodyText) && Intrinsics.areEqual(this.cta, success.cta) && Intrinsics.areEqual(this.invitationState, success.invitationState) && Intrinsics.areEqual(this.textAnimationFrame, success.textAnimationFrame) && Intrinsics.areEqual(this.ctaAnimationFrame, success.ctaAnimationFrame) && Intrinsics.areEqual(this.animationLoopStartFrame, success.animationLoopStartFrame) && Intrinsics.areEqual(this.descriptor, success.descriptor);
        }

        public int hashCode() {
            int iHashCode = ((((((this.titleText.hashCode() * 31) + this.bodyText.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.invitationState.hashCode()) * 31;
            Integer num = this.textAnimationFrame;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.ctaAnimationFrame;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.animationLoopStartFrame;
            return ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "Success(titleText=" + this.titleText + ", bodyText=" + this.bodyText + ", cta=" + this.cta + ", invitationState=" + this.invitationState + ", textAnimationFrame=" + this.textAnimationFrame + ", ctaAnimationFrame=" + this.ctaAnimationFrame + ", animationLoopStartFrame=" + this.animationLoopStartFrame + ", descriptor=" + this.descriptor + ")";
        }

        public Success(String titleText, String bodyText, JointAccountCta cta, InvitationState invitationState, Integer num, Integer num2, Integer num3, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(invitationState, "invitationState");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.titleText = titleText;
            this.bodyText = bodyText;
            this.cta = cta;
            this.invitationState = invitationState;
            this.textAnimationFrame = num;
            this.ctaAnimationFrame = num2;
            this.animationLoopStartFrame = num3;
            this.descriptor = descriptor;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public final String getBodyText() {
            return this.bodyText;
        }

        public final JointAccountCta getCta() {
            return this.cta;
        }

        public final InvitationState getInvitationState() {
            return this.invitationState;
        }

        public final Integer getTextAnimationFrame() {
            return this.textAnimationFrame;
        }

        public final Integer getCtaAnimationFrame() {
            return this.ctaAnimationFrame;
        }

        public final Integer getAnimationLoopStartFrame() {
            return this.animationLoopStartFrame;
        }

        @Override // com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Success(String titleText, String bodyText, JointAccountCta cta, InvitationState invitationState, UserInteractionEventDescriptor descriptor) {
            Integer num;
            Integer num2 = 352;
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(invitationState, "invitationState");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            boolean z = invitationState instanceof InvitationState.Complete;
            Integer numValueOf = null;
            if (z) {
                num = num2;
            } else {
                if (!Intrinsics.areEqual(invitationState, InvitationState.Incomplete.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                num = null;
            }
            if (!z) {
                if (!Intrinsics.areEqual(invitationState, InvitationState.Incomplete.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                num2 = null;
            }
            if (z) {
                numValueOf = Integer.valueOf(EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
            } else if (!Intrinsics.areEqual(invitationState, InvitationState.Incomplete.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            this(titleText, bodyText, cta, invitationState, num, num2, numValueOf, descriptor);
        }
    }

    /* compiled from: JointAccountCreatedViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$InitializationError;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitializationError implements JointAccountCreatedViewState {
        public static final int $stable = 8;
        private final UserInteractionEventDescriptor descriptor;

        public static /* synthetic */ InitializationError copy$default(InitializationError initializationError, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                userInteractionEventDescriptor = initializationError.descriptor;
            }
            return initializationError.copy(userInteractionEventDescriptor);
        }

        /* renamed from: component1, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final InitializationError copy(UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new InitializationError(descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializationError) && Intrinsics.areEqual(this.descriptor, ((InitializationError) other).descriptor);
        }

        public int hashCode() {
            return this.descriptor.hashCode();
        }

        public String toString() {
            return "InitializationError(descriptor=" + this.descriptor + ")";
        }

        public InitializationError(UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.descriptor = descriptor;
        }

        @Override // com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }

    /* compiled from: JointAccountCreatedViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$LoadAccountError;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "titleText", "", "bodyText", "refreshCta", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "contactSupportCta", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getTitleText", "()Ljava/lang/String;", "getBodyText", "getRefreshCta", "()Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "getContactSupportCta", "getDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadAccountError implements JointAccountCreatedViewState {
        public static final int $stable = 8;
        private final String bodyText;
        private final JointAccountCta contactSupportCta;
        private final UserInteractionEventDescriptor descriptor;
        private final JointAccountCta refreshCta;
        private final String titleText;

        public static /* synthetic */ LoadAccountError copy$default(LoadAccountError loadAccountError, String str, String str2, JointAccountCta jointAccountCta, JointAccountCta jointAccountCta2, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadAccountError.titleText;
            }
            if ((i & 2) != 0) {
                str2 = loadAccountError.bodyText;
            }
            if ((i & 4) != 0) {
                jointAccountCta = loadAccountError.refreshCta;
            }
            if ((i & 8) != 0) {
                jointAccountCta2 = loadAccountError.contactSupportCta;
            }
            if ((i & 16) != 0) {
                userInteractionEventDescriptor = loadAccountError.descriptor;
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            JointAccountCta jointAccountCta3 = jointAccountCta;
            return loadAccountError.copy(str, str2, jointAccountCta3, jointAccountCta2, userInteractionEventDescriptor2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBodyText() {
            return this.bodyText;
        }

        /* renamed from: component3, reason: from getter */
        public final JointAccountCta getRefreshCta() {
            return this.refreshCta;
        }

        /* renamed from: component4, reason: from getter */
        public final JointAccountCta getContactSupportCta() {
            return this.contactSupportCta;
        }

        /* renamed from: component5, reason: from getter */
        public final UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }

        public final LoadAccountError copy(String titleText, String bodyText, JointAccountCta refreshCta, JointAccountCta contactSupportCta, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(refreshCta, "refreshCta");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new LoadAccountError(titleText, bodyText, refreshCta, contactSupportCta, descriptor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadAccountError)) {
                return false;
            }
            LoadAccountError loadAccountError = (LoadAccountError) other;
            return Intrinsics.areEqual(this.titleText, loadAccountError.titleText) && Intrinsics.areEqual(this.bodyText, loadAccountError.bodyText) && Intrinsics.areEqual(this.refreshCta, loadAccountError.refreshCta) && Intrinsics.areEqual(this.contactSupportCta, loadAccountError.contactSupportCta) && Intrinsics.areEqual(this.descriptor, loadAccountError.descriptor);
        }

        public int hashCode() {
            int iHashCode = ((((this.titleText.hashCode() * 31) + this.bodyText.hashCode()) * 31) + this.refreshCta.hashCode()) * 31;
            JointAccountCta jointAccountCta = this.contactSupportCta;
            return ((iHashCode + (jointAccountCta == null ? 0 : jointAccountCta.hashCode())) * 31) + this.descriptor.hashCode();
        }

        public String toString() {
            return "LoadAccountError(titleText=" + this.titleText + ", bodyText=" + this.bodyText + ", refreshCta=" + this.refreshCta + ", contactSupportCta=" + this.contactSupportCta + ", descriptor=" + this.descriptor + ")";
        }

        public LoadAccountError(String titleText, String bodyText, JointAccountCta refreshCta, JointAccountCta jointAccountCta, UserInteractionEventDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyText, "bodyText");
            Intrinsics.checkNotNullParameter(refreshCta, "refreshCta");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.titleText = titleText;
            this.bodyText = bodyText;
            this.refreshCta = refreshCta;
            this.contactSupportCta = jointAccountCta;
            this.descriptor = descriptor;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public final String getBodyText() {
            return this.bodyText;
        }

        public final JointAccountCta getRefreshCta() {
            return this.refreshCta;
        }

        public final JointAccountCta getContactSupportCta() {
            return this.contactSupportCta;
        }

        @Override // com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState
        public UserInteractionEventDescriptor getDescriptor() {
            return this.descriptor;
        }
    }

    /* compiled from: JointAccountCreatedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState$Companion;", "", "<init>", "()V", "ACCOUNT_CREATED_IDENTIFIER", "", "APPLICATION_PENDING_IDENTIFIER", "LOADING_LOOP_END_FRAME", "", "SUCCESS_TEXT_ANIM_FRAME", "SUCCESS_CTA_ANIM_FRAME", "SUCCESS_LOOP_START_FRAME", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ACCOUNT_CREATED_IDENTIFIER = "account-created";
        public static final String APPLICATION_PENDING_IDENTIFIER = "application-pending";
        public static final int LOADING_LOOP_END_FRAME = 204;
        private static final int SUCCESS_CTA_ANIM_FRAME = 352;
        private static final int SUCCESS_LOOP_START_FRAME = 205;
        private static final int SUCCESS_TEXT_ANIM_FRAME = 352;

        private Companion() {
        }
    }
}
