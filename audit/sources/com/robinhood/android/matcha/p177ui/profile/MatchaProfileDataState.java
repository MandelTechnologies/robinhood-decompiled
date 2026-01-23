package com.robinhood.android.matcha.p177ui.profile;

import com.robinhood.android.models.matcha.api.profile.ApiMiniProfileResponse;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo2;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MatchaProfileDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;", "", "hasRhyAccountOrApplication", "", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "isPreOnboarding", "profileSduiResponse", "Lcom/robinhood/android/models/matcha/api/profile/ApiMiniProfileResponse;", "socialProfile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "showBlockConfirmationDialog", "errorAlert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(ZLcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;ZLcom/robinhood/android/models/matcha/api/profile/ApiMiniProfileResponse;Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;ZLcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getHasRhyAccountOrApplication", "()Z", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getProfileSduiResponse", "()Lcom/robinhood/android/models/matcha/api/profile/ApiMiniProfileResponse;", "getSocialProfile", "()Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "getShowBlockConfirmationDialog", "getErrorAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "isUserBlocked", "canReportUser", "getCanReportUser", "isPayButtonVisible", "isRequestButtonVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaProfileDataState {
    public static final int $stable = 8;
    private final MatchaTransaction.Direction direction;
    private final GenericAlert errorAlert;
    private final boolean hasRhyAccountOrApplication;
    private final boolean isPreOnboarding;
    private final ApiMiniProfileResponse profileSduiResponse;
    private final boolean showBlockConfirmationDialog;
    private final ApiSocialProfileInfo socialProfile;

    /* compiled from: MatchaProfileDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransaction.Direction.values().length];
            try {
                iArr[MatchaTransaction.Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransaction.Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ MatchaProfileDataState copy$default(MatchaProfileDataState matchaProfileDataState, boolean z, MatchaTransaction.Direction direction, boolean z2, ApiMiniProfileResponse apiMiniProfileResponse, ApiSocialProfileInfo apiSocialProfileInfo, boolean z3, GenericAlert genericAlert, int i, Object obj) {
        if ((i & 1) != 0) {
            z = matchaProfileDataState.hasRhyAccountOrApplication;
        }
        if ((i & 2) != 0) {
            direction = matchaProfileDataState.direction;
        }
        if ((i & 4) != 0) {
            z2 = matchaProfileDataState.isPreOnboarding;
        }
        if ((i & 8) != 0) {
            apiMiniProfileResponse = matchaProfileDataState.profileSduiResponse;
        }
        if ((i & 16) != 0) {
            apiSocialProfileInfo = matchaProfileDataState.socialProfile;
        }
        if ((i & 32) != 0) {
            z3 = matchaProfileDataState.showBlockConfirmationDialog;
        }
        if ((i & 64) != 0) {
            genericAlert = matchaProfileDataState.errorAlert;
        }
        boolean z4 = z3;
        GenericAlert genericAlert2 = genericAlert;
        ApiSocialProfileInfo apiSocialProfileInfo2 = apiSocialProfileInfo;
        boolean z5 = z2;
        return matchaProfileDataState.copy(z, direction, z5, apiMiniProfileResponse, apiSocialProfileInfo2, z4, genericAlert2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasRhyAccountOrApplication() {
        return this.hasRhyAccountOrApplication;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchaTransaction.Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPreOnboarding() {
        return this.isPreOnboarding;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiMiniProfileResponse getProfileSduiResponse() {
        return this.profileSduiResponse;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiSocialProfileInfo getSocialProfile() {
        return this.socialProfile;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowBlockConfirmationDialog() {
        return this.showBlockConfirmationDialog;
    }

    /* renamed from: component7, reason: from getter */
    public final GenericAlert getErrorAlert() {
        return this.errorAlert;
    }

    public final MatchaProfileDataState copy(boolean hasRhyAccountOrApplication, MatchaTransaction.Direction direction, boolean isPreOnboarding, ApiMiniProfileResponse profileSduiResponse, ApiSocialProfileInfo socialProfile, boolean showBlockConfirmationDialog, GenericAlert errorAlert) {
        return new MatchaProfileDataState(hasRhyAccountOrApplication, direction, isPreOnboarding, profileSduiResponse, socialProfile, showBlockConfirmationDialog, errorAlert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaProfileDataState)) {
            return false;
        }
        MatchaProfileDataState matchaProfileDataState = (MatchaProfileDataState) other;
        return this.hasRhyAccountOrApplication == matchaProfileDataState.hasRhyAccountOrApplication && this.direction == matchaProfileDataState.direction && this.isPreOnboarding == matchaProfileDataState.isPreOnboarding && Intrinsics.areEqual(this.profileSduiResponse, matchaProfileDataState.profileSduiResponse) && Intrinsics.areEqual(this.socialProfile, matchaProfileDataState.socialProfile) && this.showBlockConfirmationDialog == matchaProfileDataState.showBlockConfirmationDialog && Intrinsics.areEqual(this.errorAlert, matchaProfileDataState.errorAlert);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasRhyAccountOrApplication) * 31;
        MatchaTransaction.Direction direction = this.direction;
        int iHashCode2 = (((iHashCode + (direction == null ? 0 : direction.hashCode())) * 31) + Boolean.hashCode(this.isPreOnboarding)) * 31;
        ApiMiniProfileResponse apiMiniProfileResponse = this.profileSduiResponse;
        int iHashCode3 = (iHashCode2 + (apiMiniProfileResponse == null ? 0 : apiMiniProfileResponse.hashCode())) * 31;
        ApiSocialProfileInfo apiSocialProfileInfo = this.socialProfile;
        int iHashCode4 = (((iHashCode3 + (apiSocialProfileInfo == null ? 0 : apiSocialProfileInfo.hashCode())) * 31) + Boolean.hashCode(this.showBlockConfirmationDialog)) * 31;
        GenericAlert genericAlert = this.errorAlert;
        return iHashCode4 + (genericAlert != null ? genericAlert.hashCode() : 0);
    }

    public String toString() {
        return "MatchaProfileDataState(hasRhyAccountOrApplication=" + this.hasRhyAccountOrApplication + ", direction=" + this.direction + ", isPreOnboarding=" + this.isPreOnboarding + ", profileSduiResponse=" + this.profileSduiResponse + ", socialProfile=" + this.socialProfile + ", showBlockConfirmationDialog=" + this.showBlockConfirmationDialog + ", errorAlert=" + this.errorAlert + ")";
    }

    public MatchaProfileDataState(boolean z, MatchaTransaction.Direction direction, boolean z2, ApiMiniProfileResponse apiMiniProfileResponse, ApiSocialProfileInfo apiSocialProfileInfo, boolean z3, GenericAlert genericAlert) {
        this.hasRhyAccountOrApplication = z;
        this.direction = direction;
        this.isPreOnboarding = z2;
        this.profileSduiResponse = apiMiniProfileResponse;
        this.socialProfile = apiSocialProfileInfo;
        this.showBlockConfirmationDialog = z3;
        this.errorAlert = genericAlert;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MatchaProfileDataState(boolean r3, com.robinhood.android.social.contracts.matcha.MatchaTransaction.Direction r4, boolean r5, com.robinhood.android.models.matcha.api.profile.ApiMiniProfileResponse r6, com.robinhood.models.api.bonfire.ApiSocialProfileInfo r7, boolean r8, com.robinhood.models.serverdriven.p347db.GenericAlert r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r3 = 1
        L5:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto Lb
            r5 = r0
        Lb:
            r11 = r10 & 8
            r1 = 0
            if (r11 == 0) goto L11
            r6 = r1
        L11:
            r11 = r10 & 16
            if (r11 == 0) goto L16
            r7 = r1
        L16:
            r11 = r10 & 32
            if (r11 == 0) goto L1b
            r8 = r0
        L1b:
            r10 = r10 & 64
            if (r10 == 0) goto L28
            r11 = r1
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L30
        L28:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L30:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.matcha.p177ui.profile.MatchaProfileDataState.<init>(boolean, com.robinhood.android.social.contracts.matcha.MatchaTransaction$Direction, boolean, com.robinhood.android.models.matcha.api.profile.ApiMiniProfileResponse, com.robinhood.models.api.bonfire.ApiSocialProfileInfo, boolean, com.robinhood.models.serverdriven.db.GenericAlert, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getHasRhyAccountOrApplication() {
        return this.hasRhyAccountOrApplication;
    }

    public final MatchaTransaction.Direction getDirection() {
        return this.direction;
    }

    public final boolean isPreOnboarding() {
        return this.isPreOnboarding;
    }

    public final ApiMiniProfileResponse getProfileSduiResponse() {
        return this.profileSduiResponse;
    }

    public final ApiSocialProfileInfo getSocialProfile() {
        return this.socialProfile;
    }

    public final boolean getShowBlockConfirmationDialog() {
        return this.showBlockConfirmationDialog;
    }

    public final GenericAlert getErrorAlert() {
        return this.errorAlert;
    }

    public final boolean isUserBlocked() {
        ApiSocialProfileInfo apiSocialProfileInfo = this.socialProfile;
        if (apiSocialProfileInfo != null) {
            return apiSocialProfileInfo.isBlocked();
        }
        return false;
    }

    public final boolean getCanReportUser() {
        ApiSocialProfileInfo2 private_profile_info;
        String profile_picture;
        ApiSocialProfileInfo apiSocialProfileInfo = this.socialProfile;
        return (apiSocialProfileInfo == null || (private_profile_info = apiSocialProfileInfo.getPrivate_profile_info()) == null || (((profile_picture = private_profile_info.getProfile_picture()) == null || StringsKt.isBlank(profile_picture)) && StringsKt.isBlank(private_profile_info.getUsername()))) ? false : true;
    }

    public final boolean isPayButtonVisible() {
        if (this.isPreOnboarding) {
            return false;
        }
        MatchaTransaction.Direction direction = this.direction;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1 || i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isRequestButtonVisible() {
        if (this.isPreOnboarding) {
            return false;
        }
        MatchaTransaction.Direction direction = this.direction;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
