package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JU\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "entryContext", "", "ignoreExitDeepLink", "", "entryPoint", "showMaybeLaterButton", "managementTypeSelection", "Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;Lcom/robinhood/models/api/ColorTheme;)V", "getIntro", "()Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "getEntryContext", "()Ljava/lang/String;", "getIgnoreExitDeepLink", "()Z", "getEntryPoint", "getShowMaybeLaterButton", "getManagementTypeSelection", "()Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RetirementSignUp implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RetirementSignUp> CREATOR = new Creator();
    private final String entryContext;
    private final String entryPoint;
    private final boolean ignoreExitDeepLink;
    private final RetirementOnboardingIntro intro;
    private final RetirementIntentKeys5 managementTypeSelection;
    private final boolean showMaybeLaterButton;
    private final ColorTheme theme;

    /* compiled from: RetirementIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementSignUp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementSignUp createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RetirementOnboardingIntro retirementOnboardingIntro = (RetirementOnboardingIntro) parcel.readParcelable(RetirementSignUp.class.getClassLoader());
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new RetirementSignUp(retirementOnboardingIntro, string2, z3, string3, z2, RetirementIntentKeys5.valueOf(parcel.readString()), ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementSignUp[] newArray(int i) {
            return new RetirementSignUp[i];
        }
    }

    public RetirementSignUp() {
        this(null, null, false, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ RetirementSignUp copy$default(RetirementSignUp retirementSignUp, RetirementOnboardingIntro retirementOnboardingIntro, String str, boolean z, String str2, boolean z2, RetirementIntentKeys5 retirementIntentKeys5, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementOnboardingIntro = retirementSignUp.intro;
        }
        if ((i & 2) != 0) {
            str = retirementSignUp.entryContext;
        }
        if ((i & 4) != 0) {
            z = retirementSignUp.ignoreExitDeepLink;
        }
        if ((i & 8) != 0) {
            str2 = retirementSignUp.entryPoint;
        }
        if ((i & 16) != 0) {
            z2 = retirementSignUp.showMaybeLaterButton;
        }
        if ((i & 32) != 0) {
            retirementIntentKeys5 = retirementSignUp.managementTypeSelection;
        }
        if ((i & 64) != 0) {
            colorTheme = retirementSignUp.theme;
        }
        RetirementIntentKeys5 retirementIntentKeys52 = retirementIntentKeys5;
        ColorTheme colorTheme2 = colorTheme;
        boolean z3 = z2;
        boolean z4 = z;
        return retirementSignUp.copy(retirementOnboardingIntro, str, z4, str2, z3, retirementIntentKeys52, colorTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementOnboardingIntro getIntro() {
        return this.intro;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryContext() {
        return this.entryContext;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIgnoreExitDeepLink() {
        return this.ignoreExitDeepLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowMaybeLaterButton() {
        return this.showMaybeLaterButton;
    }

    /* renamed from: component6, reason: from getter */
    public final RetirementIntentKeys5 getManagementTypeSelection() {
        return this.managementTypeSelection;
    }

    /* renamed from: component7, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final RetirementSignUp copy(RetirementOnboardingIntro intro, String entryContext, boolean ignoreExitDeepLink, String entryPoint, boolean showMaybeLaterButton, RetirementIntentKeys5 managementTypeSelection, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new RetirementSignUp(intro, entryContext, ignoreExitDeepLink, entryPoint, showMaybeLaterButton, managementTypeSelection, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignUp)) {
            return false;
        }
        RetirementSignUp retirementSignUp = (RetirementSignUp) other;
        return Intrinsics.areEqual(this.intro, retirementSignUp.intro) && Intrinsics.areEqual(this.entryContext, retirementSignUp.entryContext) && this.ignoreExitDeepLink == retirementSignUp.ignoreExitDeepLink && Intrinsics.areEqual(this.entryPoint, retirementSignUp.entryPoint) && this.showMaybeLaterButton == retirementSignUp.showMaybeLaterButton && this.managementTypeSelection == retirementSignUp.managementTypeSelection && this.theme == retirementSignUp.theme;
    }

    public int hashCode() {
        RetirementOnboardingIntro retirementOnboardingIntro = this.intro;
        int iHashCode = (retirementOnboardingIntro == null ? 0 : retirementOnboardingIntro.hashCode()) * 31;
        String str = this.entryContext;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.ignoreExitDeepLink)) * 31;
        String str2 = this.entryPoint;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showMaybeLaterButton)) * 31) + this.managementTypeSelection.hashCode()) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "RetirementSignUp(intro=" + this.intro + ", entryContext=" + this.entryContext + ", ignoreExitDeepLink=" + this.ignoreExitDeepLink + ", entryPoint=" + this.entryPoint + ", showMaybeLaterButton=" + this.showMaybeLaterButton + ", managementTypeSelection=" + this.managementTypeSelection + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intro, flags);
        dest.writeString(this.entryContext);
        dest.writeInt(this.ignoreExitDeepLink ? 1 : 0);
        dest.writeString(this.entryPoint);
        dest.writeInt(this.showMaybeLaterButton ? 1 : 0);
        dest.writeString(this.managementTypeSelection.name());
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RetirementSignUp(RetirementOnboardingIntro retirementOnboardingIntro, String str, boolean z, String str2, boolean z2, RetirementIntentKeys5 managementTypeSelection, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.intro = retirementOnboardingIntro;
        this.entryContext = str;
        this.ignoreExitDeepLink = z;
        this.entryPoint = str2;
        this.showMaybeLaterButton = z2;
        this.managementTypeSelection = managementTypeSelection;
        this.theme = theme;
    }

    public final RetirementOnboardingIntro getIntro() {
        return this.intro;
    }

    public final String getEntryContext() {
        return this.entryContext;
    }

    public final boolean getIgnoreExitDeepLink() {
        return this.ignoreExitDeepLink;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean getShowMaybeLaterButton() {
        return this.showMaybeLaterButton;
    }

    public final RetirementIntentKeys5 getManagementTypeSelection() {
        return this.managementTypeSelection;
    }

    public /* synthetic */ RetirementSignUp(RetirementOnboardingIntro retirementOnboardingIntro, String str, boolean z, String str2, boolean z2, RetirementIntentKeys5 retirementIntentKeys5, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : retirementOnboardingIntro, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? RetirementIntentKeys5.SELF_DIRECTED : retirementIntentKeys5, (i & 64) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
