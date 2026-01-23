package com.robinhood.shared.stepupverification.challenge.email;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EmailChallengeDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÂ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;", "", "isLoading", "", "inputText", "", "fallbackCtaText", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getInputText", "()Ljava/lang/String;", "fallbackText", "Lcom/robinhood/utils/resource/StringResource;", "getFallbackText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class EmailChallengeDataState {
    public static final int $stable = 0;
    private final String fallbackCtaText;
    private final String inputText;
    private final boolean isLoading;

    public EmailChallengeDataState() {
        this(false, null, null, 7, null);
    }

    /* renamed from: component3, reason: from getter */
    private final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    public static /* synthetic */ EmailChallengeDataState copy$default(EmailChallengeDataState emailChallengeDataState, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailChallengeDataState.isLoading;
        }
        if ((i & 2) != 0) {
            str = emailChallengeDataState.inputText;
        }
        if ((i & 4) != 0) {
            str2 = emailChallengeDataState.fallbackCtaText;
        }
        return emailChallengeDataState.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    public final EmailChallengeDataState copy(boolean isLoading, String inputText, String fallbackCtaText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        return new EmailChallengeDataState(isLoading, inputText, fallbackCtaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailChallengeDataState)) {
            return false;
        }
        EmailChallengeDataState emailChallengeDataState = (EmailChallengeDataState) other;
        return this.isLoading == emailChallengeDataState.isLoading && Intrinsics.areEqual(this.inputText, emailChallengeDataState.inputText) && Intrinsics.areEqual(this.fallbackCtaText, emailChallengeDataState.fallbackCtaText);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.inputText.hashCode()) * 31;
        String str = this.fallbackCtaText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EmailChallengeDataState(isLoading=" + this.isLoading + ", inputText=" + this.inputText + ", fallbackCtaText=" + this.fallbackCtaText + ")";
    }

    public EmailChallengeDataState(boolean z, String inputText, String str) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.isLoading = z;
        this.inputText = inputText;
        this.fallbackCtaText = str;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ EmailChallengeDataState(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final StringResource getFallbackText() {
        String str = this.fallbackCtaText;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        return null;
    }
}
