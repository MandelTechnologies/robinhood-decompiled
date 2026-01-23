package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSavedState;", "Landroid/os/Parcelable;", "screenRequests", "", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "screenArgsInBackstack", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "currentScreen", "screenArgsRemaining", "sessionId", "Ljava/util/UUID;", "onboardingProgress", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Ljava/util/List;Ljava/util/UUID;Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;)V", "getScreenRequests", "()Ljava/util/List;", "getScreenArgsInBackstack", "getCurrentScreen", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgsRemaining", "getSessionId", "()Ljava/util/UUID;", "getOnboardingProgress", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingSavedState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionOnboardingSavedState> CREATOR = new Creator();
    private final ScreenArgs currentScreen;
    private final OptionOnboardingProgress onboardingProgress;
    private final List<ScreenArgs> screenArgsInBackstack;
    private final List<ScreenArgs> screenArgsRemaining;
    private final List<ScreenRequest> screenRequests;
    private final UUID sessionId;

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionOnboardingSavedState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOnboardingSavedState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(OptionOnboardingSavedState.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(OptionOnboardingSavedState.class.getClassLoader()));
            }
            ScreenArgs screenArgs = (ScreenArgs) parcel.readParcelable(OptionOnboardingSavedState.class.getClassLoader());
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(OptionOnboardingSavedState.class.getClassLoader()));
            }
            return new OptionOnboardingSavedState(arrayList, arrayList2, screenArgs, arrayList3, (UUID) parcel.readSerializable(), OptionOnboardingProgress.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOnboardingSavedState[] newArray(int i) {
            return new OptionOnboardingSavedState[i];
        }
    }

    public static /* synthetic */ OptionOnboardingSavedState copy$default(OptionOnboardingSavedState optionOnboardingSavedState, List list, List list2, ScreenArgs screenArgs, List list3, UUID uuid, OptionOnboardingProgress optionOnboardingProgress, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionOnboardingSavedState.screenRequests;
        }
        if ((i & 2) != 0) {
            list2 = optionOnboardingSavedState.screenArgsInBackstack;
        }
        if ((i & 4) != 0) {
            screenArgs = optionOnboardingSavedState.currentScreen;
        }
        if ((i & 8) != 0) {
            list3 = optionOnboardingSavedState.screenArgsRemaining;
        }
        if ((i & 16) != 0) {
            uuid = optionOnboardingSavedState.sessionId;
        }
        if ((i & 32) != 0) {
            optionOnboardingProgress = optionOnboardingSavedState.onboardingProgress;
        }
        UUID uuid2 = uuid;
        OptionOnboardingProgress optionOnboardingProgress2 = optionOnboardingProgress;
        return optionOnboardingSavedState.copy(list, list2, screenArgs, list3, uuid2, optionOnboardingProgress2);
    }

    public final List<ScreenRequest> component1() {
        return this.screenRequests;
    }

    public final List<ScreenArgs> component2() {
        return this.screenArgsInBackstack;
    }

    /* renamed from: component3, reason: from getter */
    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final List<ScreenArgs> component4() {
        return this.screenArgsRemaining;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionOnboardingProgress getOnboardingProgress() {
        return this.onboardingProgress;
    }

    public final OptionOnboardingSavedState copy(List<? extends ScreenRequest> screenRequests, List<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, List<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress) {
        Intrinsics.checkNotNullParameter(screenRequests, "screenRequests");
        Intrinsics.checkNotNullParameter(screenArgsInBackstack, "screenArgsInBackstack");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(screenArgsRemaining, "screenArgsRemaining");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
        return new OptionOnboardingSavedState(screenRequests, screenArgsInBackstack, currentScreen, screenArgsRemaining, sessionId, onboardingProgress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingSavedState)) {
            return false;
        }
        OptionOnboardingSavedState optionOnboardingSavedState = (OptionOnboardingSavedState) other;
        return Intrinsics.areEqual(this.screenRequests, optionOnboardingSavedState.screenRequests) && Intrinsics.areEqual(this.screenArgsInBackstack, optionOnboardingSavedState.screenArgsInBackstack) && Intrinsics.areEqual(this.currentScreen, optionOnboardingSavedState.currentScreen) && Intrinsics.areEqual(this.screenArgsRemaining, optionOnboardingSavedState.screenArgsRemaining) && Intrinsics.areEqual(this.sessionId, optionOnboardingSavedState.sessionId) && this.onboardingProgress == optionOnboardingSavedState.onboardingProgress;
    }

    public int hashCode() {
        return (((((((((this.screenRequests.hashCode() * 31) + this.screenArgsInBackstack.hashCode()) * 31) + this.currentScreen.hashCode()) * 31) + this.screenArgsRemaining.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.onboardingProgress.hashCode();
    }

    public String toString() {
        return "OptionOnboardingSavedState(screenRequests=" + this.screenRequests + ", screenArgsInBackstack=" + this.screenArgsInBackstack + ", currentScreen=" + this.currentScreen + ", screenArgsRemaining=" + this.screenArgsRemaining + ", sessionId=" + this.sessionId + ", onboardingProgress=" + this.onboardingProgress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<ScreenRequest> list = this.screenRequests;
        dest.writeInt(list.size());
        Iterator<ScreenRequest> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<ScreenArgs> list2 = this.screenArgsInBackstack;
        dest.writeInt(list2.size());
        Iterator<ScreenArgs> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.currentScreen, flags);
        List<ScreenArgs> list3 = this.screenArgsRemaining;
        dest.writeInt(list3.size());
        Iterator<ScreenArgs> it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable(it3.next(), flags);
        }
        dest.writeSerializable(this.sessionId);
        dest.writeString(this.onboardingProgress.name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionOnboardingSavedState(List<? extends ScreenRequest> screenRequests, List<? extends ScreenArgs> screenArgsInBackstack, ScreenArgs currentScreen, List<? extends ScreenArgs> screenArgsRemaining, UUID sessionId, OptionOnboardingProgress onboardingProgress) {
        Intrinsics.checkNotNullParameter(screenRequests, "screenRequests");
        Intrinsics.checkNotNullParameter(screenArgsInBackstack, "screenArgsInBackstack");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(screenArgsRemaining, "screenArgsRemaining");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(onboardingProgress, "onboardingProgress");
        this.screenRequests = screenRequests;
        this.screenArgsInBackstack = screenArgsInBackstack;
        this.currentScreen = currentScreen;
        this.screenArgsRemaining = screenArgsRemaining;
        this.sessionId = sessionId;
        this.onboardingProgress = onboardingProgress;
    }

    public final List<ScreenRequest> getScreenRequests() {
        return this.screenRequests;
    }

    public final List<ScreenArgs> getScreenArgsInBackstack() {
        return this.screenArgsInBackstack;
    }

    public final ScreenArgs getCurrentScreen() {
        return this.currentScreen;
    }

    public final List<ScreenArgs> getScreenArgsRemaining() {
        return this.screenArgsRemaining;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final OptionOnboardingProgress getOnboardingProgress() {
        return this.onboardingProgress;
    }
}
