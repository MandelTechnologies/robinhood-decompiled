package com.robinhood.android.referral.onboardingtakeover;

import com.robinhood.models.api.ReferralLandingSdui;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingTakeoverState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "", "<init>", "()V", "content", "Lcom/robinhood/models/api/ReferralLandingSdui;", "getContent", "()Lcom/robinhood/models/api/ReferralLandingSdui;", "Fresh", "EmailSuggestionAccepted", "LoadingChanged", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$EmailSuggestionAccepted;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$Fresh;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$LoadingChanged;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDataState, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class OnboardingTakeoverState {
    public static final int $stable = 0;

    public /* synthetic */ OnboardingTakeoverState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ReferralLandingSdui getContent();

    private OnboardingTakeoverState() {
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$Fresh;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "content", "Lcom/robinhood/models/api/ReferralLandingSdui;", "<init>", "(Lcom/robinhood/models/api/ReferralLandingSdui;)V", "getContent", "()Lcom/robinhood/models/api/ReferralLandingSdui;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDataState$Fresh, reason: from toString */
    public static final /* data */ class Fresh extends OnboardingTakeoverState {
        public static final int $stable = 8;
        private final ReferralLandingSdui content;

        public static /* synthetic */ Fresh copy$default(Fresh fresh, ReferralLandingSdui referralLandingSdui, int i, Object obj) {
            if ((i & 1) != 0) {
                referralLandingSdui = fresh.content;
            }
            return fresh.copy(referralLandingSdui);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralLandingSdui getContent() {
            return this.content;
        }

        public final Fresh copy(ReferralLandingSdui content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Fresh(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fresh) && Intrinsics.areEqual(this.content, ((Fresh) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Fresh(content=" + this.content + ")";
        }

        @Override // com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState
        public ReferralLandingSdui getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fresh(ReferralLandingSdui content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$EmailSuggestionAccepted;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "content", "Lcom/robinhood/models/api/ReferralLandingSdui;", "suggestedEmail", "", "<init>", "(Lcom/robinhood/models/api/ReferralLandingSdui;Ljava/lang/String;)V", "getContent", "()Lcom/robinhood/models/api/ReferralLandingSdui;", "getSuggestedEmail", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDataState$EmailSuggestionAccepted, reason: from toString */
    /* loaded from: classes5.dex */
    public static final /* data */ class EmailSuggestionAccepted extends OnboardingTakeoverState {
        public static final int $stable = 8;
        private final ReferralLandingSdui content;
        private final String suggestedEmail;

        public static /* synthetic */ EmailSuggestionAccepted copy$default(EmailSuggestionAccepted emailSuggestionAccepted, ReferralLandingSdui referralLandingSdui, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                referralLandingSdui = emailSuggestionAccepted.content;
            }
            if ((i & 2) != 0) {
                str = emailSuggestionAccepted.suggestedEmail;
            }
            return emailSuggestionAccepted.copy(referralLandingSdui, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralLandingSdui getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        public final EmailSuggestionAccepted copy(ReferralLandingSdui content, String suggestedEmail) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(suggestedEmail, "suggestedEmail");
            return new EmailSuggestionAccepted(content, suggestedEmail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailSuggestionAccepted)) {
                return false;
            }
            EmailSuggestionAccepted emailSuggestionAccepted = (EmailSuggestionAccepted) other;
            return Intrinsics.areEqual(this.content, emailSuggestionAccepted.content) && Intrinsics.areEqual(this.suggestedEmail, emailSuggestionAccepted.suggestedEmail);
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + this.suggestedEmail.hashCode();
        }

        public String toString() {
            return "EmailSuggestionAccepted(content=" + this.content + ", suggestedEmail=" + this.suggestedEmail + ")";
        }

        @Override // com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState
        public ReferralLandingSdui getContent() {
            return this.content;
        }

        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailSuggestionAccepted(ReferralLandingSdui content, String suggestedEmail) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(suggestedEmail, "suggestedEmail");
            this.content = content;
            this.suggestedEmail = suggestedEmail;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState$LoadingChanged;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "content", "Lcom/robinhood/models/api/ReferralLandingSdui;", "isLoading", "", "<init>", "(Lcom/robinhood/models/api/ReferralLandingSdui;Z)V", "getContent", "()Lcom/robinhood/models/api/ReferralLandingSdui;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDataState$LoadingChanged, reason: from toString */
    /* loaded from: classes5.dex */
    public static final /* data */ class LoadingChanged extends OnboardingTakeoverState {
        public static final int $stable = 8;
        private final ReferralLandingSdui content;
        private final boolean isLoading;

        public static /* synthetic */ LoadingChanged copy$default(LoadingChanged loadingChanged, ReferralLandingSdui referralLandingSdui, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                referralLandingSdui = loadingChanged.content;
            }
            if ((i & 2) != 0) {
                z = loadingChanged.isLoading;
            }
            return loadingChanged.copy(referralLandingSdui, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralLandingSdui getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final LoadingChanged copy(ReferralLandingSdui content, boolean isLoading) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new LoadingChanged(content, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingChanged)) {
                return false;
            }
            LoadingChanged loadingChanged = (LoadingChanged) other;
            return Intrinsics.areEqual(this.content, loadingChanged.content) && this.isLoading == loadingChanged.isLoading;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "LoadingChanged(content=" + this.content + ", isLoading=" + this.isLoading + ")";
        }

        @Override // com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState
        public ReferralLandingSdui getContent() {
            return this.content;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingChanged(ReferralLandingSdui content, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.isLoading = z;
        }
    }
}
