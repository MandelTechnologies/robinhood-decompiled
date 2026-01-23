package com.robinhood.android.profiles.p218ui;

import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.profiles.p218ui.ProfileEditViewState3;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileEditViewState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00105\u001a\u00020\u0003HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÂ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÂ\u0003Jk\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010#\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010%\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010'\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/ProfileEditViewState;", "", "context", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;", "profileId", "", "profile", "Lcom/robinhood/android/profiles/ui/ProfileEditState;", "initialTextFieldsSetEvent", "Lcom/robinhood/udf/UiEvent;", "", "initialLoadError", "", "initialLoadComplete", "", "saveProfileStatus", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus;", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit$Context;Ljava/lang/String;Lcom/robinhood/android/profiles/ui/ProfileEditState;Lcom/robinhood/udf/UiEvent;Ljava/lang/Throwable;ZLcom/robinhood/android/profiles/ui/SaveProfileStatus;Lcom/robinhood/models/subscription/db/MarginSubscription;)V", "getProfileId", "()Ljava/lang/String;", "getProfile", "()Lcom/robinhood/android/profiles/ui/ProfileEditState;", "getInitialTextFieldsSetEvent", "()Lcom/robinhood/udf/UiEvent;", "getInitialLoadError", "()Ljava/lang/Throwable;", "getInitialLoadComplete", "()Z", "showLoading", "getShowLoading", "showContent", "getShowContent", "showErrorView", "getShowErrorView", "showGoldTheme", "getShowGoldTheme", "enableSaveAction", "getEnableSaveAction", "showSaveAsMenuItem", "getShowSaveAsMenuItem", "profileSaveSuccessEvent", "getProfileSaveSuccessEvent", "profileSaveError", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Error;", "getProfileSaveError", "()Lcom/robinhood/android/profiles/ui/SaveProfileStatus$Error;", "profileSaveLegacyError", "Lcom/robinhood/android/profiles/ui/SaveProfileStatus$LegacyError;", "getProfileSaveLegacyError", "()Lcom/robinhood/android/profiles/ui/SaveProfileStatus$LegacyError;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfileEditViewState {
    private final LegacyFragmentKey.ProfileEdit.Context context;
    private final boolean enableSaveAction;
    private final boolean initialLoadComplete;
    private final Throwable initialLoadError;
    private final UiEvent<Unit> initialTextFieldsSetEvent;
    private final MarginSubscription marginSubscription;
    private final ProfileEditState profile;
    private final String profileId;
    private final ProfileEditViewState3.Error profileSaveError;
    private final ProfileEditViewState3.LegacyError profileSaveLegacyError;
    private final UiEvent<Unit> profileSaveSuccessEvent;
    private final ProfileEditViewState3 saveProfileStatus;
    private final boolean showGoldTheme;
    private final boolean showSaveAsMenuItem;

    /* compiled from: ProfileEditViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyFragmentKey.ProfileEdit.Context.values().length];
            try {
                iArr[LegacyFragmentKey.ProfileEdit.Context.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyFragmentKey.ProfileEdit.Context.FROM_EDIT_VISIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileEditViewState() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    private final LegacyFragmentKey.ProfileEdit.Context getContext() {
        return this.context;
    }

    /* renamed from: component7, reason: from getter */
    private final ProfileEditViewState3 getSaveProfileStatus() {
        return this.saveProfileStatus;
    }

    /* renamed from: component8, reason: from getter */
    private final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    public static /* synthetic */ ProfileEditViewState copy$default(ProfileEditViewState profileEditViewState, LegacyFragmentKey.ProfileEdit.Context context, String str, ProfileEditState profileEditState, UiEvent uiEvent, Throwable th, boolean z, ProfileEditViewState3 profileEditViewState3, MarginSubscription marginSubscription, int i, Object obj) {
        if ((i & 1) != 0) {
            context = profileEditViewState.context;
        }
        if ((i & 2) != 0) {
            str = profileEditViewState.profileId;
        }
        if ((i & 4) != 0) {
            profileEditState = profileEditViewState.profile;
        }
        if ((i & 8) != 0) {
            uiEvent = profileEditViewState.initialTextFieldsSetEvent;
        }
        if ((i & 16) != 0) {
            th = profileEditViewState.initialLoadError;
        }
        if ((i & 32) != 0) {
            z = profileEditViewState.initialLoadComplete;
        }
        if ((i & 64) != 0) {
            profileEditViewState3 = profileEditViewState.saveProfileStatus;
        }
        if ((i & 128) != 0) {
            marginSubscription = profileEditViewState.marginSubscription;
        }
        ProfileEditViewState3 profileEditViewState32 = profileEditViewState3;
        MarginSubscription marginSubscription2 = marginSubscription;
        Throwable th2 = th;
        boolean z2 = z;
        return profileEditViewState.copy(context, str, profileEditState, uiEvent, th2, z2, profileEditViewState32, marginSubscription2);
    }

    /* renamed from: component2, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    /* renamed from: component3, reason: from getter */
    public final ProfileEditState getProfile() {
        return this.profile;
    }

    public final UiEvent<Unit> component4() {
        return this.initialTextFieldsSetEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final Throwable getInitialLoadError() {
        return this.initialLoadError;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInitialLoadComplete() {
        return this.initialLoadComplete;
    }

    public final ProfileEditViewState copy(LegacyFragmentKey.ProfileEdit.Context context, String profileId, ProfileEditState profile, UiEvent<Unit> initialTextFieldsSetEvent, Throwable initialLoadError, boolean initialLoadComplete, ProfileEditViewState3 saveProfileStatus, MarginSubscription marginSubscription) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ProfileEditViewState(context, profileId, profile, initialTextFieldsSetEvent, initialLoadError, initialLoadComplete, saveProfileStatus, marginSubscription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileEditViewState)) {
            return false;
        }
        ProfileEditViewState profileEditViewState = (ProfileEditViewState) other;
        return this.context == profileEditViewState.context && Intrinsics.areEqual(this.profileId, profileEditViewState.profileId) && Intrinsics.areEqual(this.profile, profileEditViewState.profile) && Intrinsics.areEqual(this.initialTextFieldsSetEvent, profileEditViewState.initialTextFieldsSetEvent) && Intrinsics.areEqual(this.initialLoadError, profileEditViewState.initialLoadError) && this.initialLoadComplete == profileEditViewState.initialLoadComplete && Intrinsics.areEqual(this.saveProfileStatus, profileEditViewState.saveProfileStatus) && Intrinsics.areEqual(this.marginSubscription, profileEditViewState.marginSubscription);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        String str = this.profileId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProfileEditState profileEditState = this.profile;
        int iHashCode3 = (iHashCode2 + (profileEditState == null ? 0 : profileEditState.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.initialTextFieldsSetEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        Throwable th = this.initialLoadError;
        int iHashCode5 = (((iHashCode4 + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.initialLoadComplete)) * 31;
        ProfileEditViewState3 profileEditViewState3 = this.saveProfileStatus;
        int iHashCode6 = (iHashCode5 + (profileEditViewState3 == null ? 0 : profileEditViewState3.hashCode())) * 31;
        MarginSubscription marginSubscription = this.marginSubscription;
        return iHashCode6 + (marginSubscription != null ? marginSubscription.hashCode() : 0);
    }

    public String toString() {
        return "ProfileEditViewState(context=" + this.context + ", profileId=" + this.profileId + ", profile=" + this.profile + ", initialTextFieldsSetEvent=" + this.initialTextFieldsSetEvent + ", initialLoadError=" + this.initialLoadError + ", initialLoadComplete=" + this.initialLoadComplete + ", saveProfileStatus=" + this.saveProfileStatus + ", marginSubscription=" + this.marginSubscription + ")";
    }

    public ProfileEditViewState(LegacyFragmentKey.ProfileEdit.Context context, String str, ProfileEditState profileEditState, UiEvent<Unit> uiEvent, Throwable th, boolean z, ProfileEditViewState3 profileEditViewState3, MarginSubscription marginSubscription) {
        MarginSubscription3 plan;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.profileId = str;
        this.profile = profileEditState;
        this.initialTextFieldsSetEvent = uiEvent;
        this.initialLoadError = th;
        this.initialLoadComplete = z;
        this.saveProfileStatus = profileEditViewState3;
        this.marginSubscription = marginSubscription;
        boolean z2 = false;
        this.showGoldTheme = (marginSubscription == null || (plan = marginSubscription.getPlan()) == null || !plan.is24Karat()) ? false : true;
        this.enableSaveAction = !(profileEditViewState3 instanceof ProfileEditViewState3.Saving);
        int i = WhenMappings.$EnumSwitchMapping$0[context.ordinal()];
        if (i == 1) {
            z2 = true;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.showSaveAsMenuItem = z2;
        ProfileEditViewState3.Success success = profileEditViewState3 instanceof ProfileEditViewState3.Success ? (ProfileEditViewState3.Success) profileEditViewState3 : null;
        this.profileSaveSuccessEvent = success != null ? success.getEvent() : null;
        this.profileSaveError = profileEditViewState3 instanceof ProfileEditViewState3.Error ? (ProfileEditViewState3.Error) profileEditViewState3 : null;
        this.profileSaveLegacyError = profileEditViewState3 instanceof ProfileEditViewState3.LegacyError ? (ProfileEditViewState3.LegacyError) profileEditViewState3 : null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProfileEditViewState(com.robinhood.android.navigation.app.keys.LegacyFragmentKey.ProfileEdit.Context r2, java.lang.String r3, com.robinhood.android.profiles.p218ui.ProfileEditState r4, com.robinhood.udf.UiEvent r5, java.lang.Throwable r6, boolean r7, com.robinhood.android.profiles.p218ui.ProfileEditViewState3 r8, com.robinhood.models.subscription.p352db.MarginSubscription r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.robinhood.android.navigation.app.keys.LegacyFragmentKey$ProfileEdit$Context r2 = com.robinhood.android.navigation.app.keys.LegacyFragmentKey.ProfileEdit.Context.STANDARD
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            r6 = r0
        L1b:
            r11 = r10 & 32
            if (r11 == 0) goto L20
            r7 = 0
        L20:
            r11 = r10 & 64
            if (r11 == 0) goto L25
            r8 = r0
        L25:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L33
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3c
        L33:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.profiles.p218ui.ProfileEditViewState.<init>(com.robinhood.android.navigation.app.keys.LegacyFragmentKey$ProfileEdit$Context, java.lang.String, com.robinhood.android.profiles.ui.ProfileEditState, com.robinhood.udf.UiEvent, java.lang.Throwable, boolean, com.robinhood.android.profiles.ui.SaveProfileStatus, com.robinhood.models.subscription.db.MarginSubscription, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final ProfileEditState getProfile() {
        return this.profile;
    }

    public final UiEvent<Unit> getInitialTextFieldsSetEvent() {
        return this.initialTextFieldsSetEvent;
    }

    public final Throwable getInitialLoadError() {
        return this.initialLoadError;
    }

    public final boolean getInitialLoadComplete() {
        return this.initialLoadComplete;
    }

    public final boolean getShowLoading() {
        return (this.profile == null && !this.initialLoadComplete) || Intrinsics.areEqual(this.saveProfileStatus, ProfileEditViewState3.Saving.INSTANCE);
    }

    public final boolean getShowContent() {
        return this.profile != null;
    }

    public final boolean getShowErrorView() {
        return this.initialLoadError != null && this.profile == null;
    }

    public final boolean getShowGoldTheme() {
        return this.showGoldTheme;
    }

    public final boolean getEnableSaveAction() {
        return this.enableSaveAction;
    }

    public final boolean getShowSaveAsMenuItem() {
        return this.showSaveAsMenuItem;
    }

    public final UiEvent<Unit> getProfileSaveSuccessEvent() {
        return this.profileSaveSuccessEvent;
    }

    public final ProfileEditViewState3.Error getProfileSaveError() {
        return this.profileSaveError;
    }

    public final ProfileEditViewState3.LegacyError getProfileSaveLegacyError() {
        return this.profileSaveLegacyError;
    }
}
