package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellStandardPageFragmentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OnboardingUpsellStandardPageFragmentContract {
    public static final OnboardingUpsellStandardPageFragmentContract INSTANCE = new OnboardingUpsellStandardPageFragmentContract();

    /* compiled from: OnboardingUpsellStandardPageFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", "", "onOnboardingUpsellAction", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onOnboardingUpsellAction(OnboardingFundingUpsellAction action);
    }

    private OnboardingUpsellStandardPageFragmentContract() {
    }

    /* compiled from: OnboardingUpsellStandardPageFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "shouldShowGoldNativeFundingNavBar", "", "useCloseNavigationIcon", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;ZZ)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getShouldShowGoldNativeFundingNavBar", "()Z", "getUseCloseNavigationIcon", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final StandardPageTemplate<OnboardingFundingUpsellAction> content;
        private final boolean shouldShowGoldNativeFundingNavBar;
        private final boolean useCloseNavigationIcon;

        /* compiled from: OnboardingUpsellStandardPageFragmentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes10.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((StandardPageTemplate) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key copy$default(Key key, StandardPageTemplate standardPageTemplate, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                standardPageTemplate = key.content;
            }
            if ((i & 2) != 0) {
                z = key.shouldShowGoldNativeFundingNavBar;
            }
            if ((i & 4) != 0) {
                z2 = key.useCloseNavigationIcon;
            }
            return key.copy(standardPageTemplate, z, z2);
        }

        public final StandardPageTemplate<OnboardingFundingUpsellAction> component1() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldShowGoldNativeFundingNavBar() {
            return this.shouldShowGoldNativeFundingNavBar;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseCloseNavigationIcon() {
            return this.useCloseNavigationIcon;
        }

        public final Key copy(StandardPageTemplate<? extends OnboardingFundingUpsellAction> content, boolean shouldShowGoldNativeFundingNavBar, boolean useCloseNavigationIcon) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Key(content, shouldShowGoldNativeFundingNavBar, useCloseNavigationIcon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.content, key.content) && this.shouldShowGoldNativeFundingNavBar == key.shouldShowGoldNativeFundingNavBar && this.useCloseNavigationIcon == key.useCloseNavigationIcon;
        }

        public int hashCode() {
            return (((this.content.hashCode() * 31) + Boolean.hashCode(this.shouldShowGoldNativeFundingNavBar)) * 31) + Boolean.hashCode(this.useCloseNavigationIcon);
        }

        public String toString() {
            return "Key(content=" + this.content + ", shouldShowGoldNativeFundingNavBar=" + this.shouldShowGoldNativeFundingNavBar + ", useCloseNavigationIcon=" + this.useCloseNavigationIcon + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
            dest.writeInt(this.shouldShowGoldNativeFundingNavBar ? 1 : 0);
            dest.writeInt(this.useCloseNavigationIcon ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(StandardPageTemplate<? extends OnboardingFundingUpsellAction> content, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.shouldShowGoldNativeFundingNavBar = z;
            this.useCloseNavigationIcon = z2;
        }

        public /* synthetic */ Key(StandardPageTemplate standardPageTemplate, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(standardPageTemplate, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final StandardPageTemplate<OnboardingFundingUpsellAction> getContent() {
            return this.content;
        }

        public final boolean getShouldShowGoldNativeFundingNavBar() {
            return this.shouldShowGoldNativeFundingNavBar;
        }

        public final boolean getUseCloseNavigationIcon() {
            return this.useCloseNavigationIcon;
        }
    }
}
