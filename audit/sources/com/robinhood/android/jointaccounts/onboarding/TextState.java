package com.robinhood.android.jointaccounts.onboarding;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/TextState;", "", "title", "", CarResultComposable2.BODY, "textStyleData", "Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getTextStyleData", "()Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TextState {
    public static final int $stable = 0;
    private final String body;
    private final JointAccountCelebrationScreenTextStyleData textStyleData;
    private final String title;

    public static /* synthetic */ TextState copy$default(TextState textState, String str, String str2, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textState.title;
        }
        if ((i & 2) != 0) {
            str2 = textState.body;
        }
        if ((i & 4) != 0) {
            jointAccountCelebrationScreenTextStyleData = textState.textStyleData;
        }
        return textState.copy(str, str2, jointAccountCelebrationScreenTextStyleData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final JointAccountCelebrationScreenTextStyleData getTextStyleData() {
        return this.textStyleData;
    }

    public final TextState copy(String title, String body, JointAccountCelebrationScreenTextStyleData textStyleData) {
        return new TextState(title, body, textStyleData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextState)) {
            return false;
        }
        TextState textState = (TextState) other;
        return Intrinsics.areEqual(this.title, textState.title) && Intrinsics.areEqual(this.body, textState.body) && Intrinsics.areEqual(this.textStyleData, textState.textStyleData);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData = this.textStyleData;
        return iHashCode2 + (jointAccountCelebrationScreenTextStyleData != null ? jointAccountCelebrationScreenTextStyleData.hashCode() : 0);
    }

    public String toString() {
        return "TextState(title=" + this.title + ", body=" + this.body + ", textStyleData=" + this.textStyleData + ")";
    }

    public TextState(String str, String str2, JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData) {
        this.title = str;
        this.body = str2;
        this.textStyleData = jointAccountCelebrationScreenTextStyleData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final JointAccountCelebrationScreenTextStyleData getTextStyleData() {
        return this.textStyleData;
    }
}
