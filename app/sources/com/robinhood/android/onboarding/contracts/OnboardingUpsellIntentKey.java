package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellIntentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "", "amount", "isFromRhfOnboarding", "", "showThanksScreenOnly", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/models/api/ColorTheme;)V", "getSource", "()Ljava/lang/String;", "getAmount", "()Z", "getShowThanksScreenOnly", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnboardingUpsellIntentKey implements IntentKey, Parcelable {
    public static final String GOLD_DEFAULT_OPT_IN = "gold_default_opt_in";
    public static final String MENU_OF_OPTIONS_UPSELL = "menu_of_options_upsell";
    public static final String ONBOARDING_UPSELL = "onboarding_upsell";
    public static final String RESURRECTIONS_M2_UPSELL = "resurrections_m2_upsell";
    public static final String RETIREMENT_MATCH_PROMO = "retirement_match_promo";
    private final String amount;
    private final boolean isFromRhfOnboarding;
    private final boolean showThanksScreenOnly;
    private final String source;
    private final ColorTheme theme;
    public static final Parcelable.Creator<OnboardingUpsellIntentKey> CREATOR = new Creator();

    /* compiled from: OnboardingUpsellIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<OnboardingUpsellIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingUpsellIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new OnboardingUpsellIntentKey(string2, string3, z2, parcel.readInt() == 0 ? z : true, ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingUpsellIntentKey[] newArray(int i) {
            return new OnboardingUpsellIntentKey[i];
        }
    }

    public static /* synthetic */ OnboardingUpsellIntentKey copy$default(OnboardingUpsellIntentKey onboardingUpsellIntentKey, String str, String str2, boolean z, boolean z2, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingUpsellIntentKey.source;
        }
        if ((i & 2) != 0) {
            str2 = onboardingUpsellIntentKey.amount;
        }
        if ((i & 4) != 0) {
            z = onboardingUpsellIntentKey.isFromRhfOnboarding;
        }
        if ((i & 8) != 0) {
            z2 = onboardingUpsellIntentKey.showThanksScreenOnly;
        }
        if ((i & 16) != 0) {
            colorTheme = onboardingUpsellIntentKey.theme;
        }
        ColorTheme colorTheme2 = colorTheme;
        boolean z3 = z;
        return onboardingUpsellIntentKey.copy(str, str2, z3, z2, colorTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowThanksScreenOnly() {
        return this.showThanksScreenOnly;
    }

    /* renamed from: component5, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final OnboardingUpsellIntentKey copy(String source, String amount, boolean isFromRhfOnboarding, boolean showThanksScreenOnly, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new OnboardingUpsellIntentKey(source, amount, isFromRhfOnboarding, showThanksScreenOnly, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingUpsellIntentKey)) {
            return false;
        }
        OnboardingUpsellIntentKey onboardingUpsellIntentKey = (OnboardingUpsellIntentKey) other;
        return Intrinsics.areEqual(this.source, onboardingUpsellIntentKey.source) && Intrinsics.areEqual(this.amount, onboardingUpsellIntentKey.amount) && this.isFromRhfOnboarding == onboardingUpsellIntentKey.isFromRhfOnboarding && this.showThanksScreenOnly == onboardingUpsellIntentKey.showThanksScreenOnly && this.theme == onboardingUpsellIntentKey.theme;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.amount;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + Boolean.hashCode(this.showThanksScreenOnly)) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "OnboardingUpsellIntentKey(source=" + this.source + ", amount=" + this.amount + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", showThanksScreenOnly=" + this.showThanksScreenOnly + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.amount);
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeInt(this.showThanksScreenOnly ? 1 : 0);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OnboardingUpsellIntentKey(String source, String str, boolean z, boolean z2, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.source = source;
        this.amount = str;
        this.isFromRhfOnboarding = z;
        this.showThanksScreenOnly = z2;
        this.theme = theme;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final boolean isFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    public final boolean getShowThanksScreenOnly() {
        return this.showThanksScreenOnly;
    }

    public /* synthetic */ OnboardingUpsellIntentKey(String str, String str2, boolean z, boolean z2, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
