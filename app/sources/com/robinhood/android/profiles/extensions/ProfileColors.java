package com.robinhood.android.profiles.extensions;

import com.robinhood.android.profiles.p218ui.view.ProfileOverlay;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileColors.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m3636d2 = {"themeReference", "Lcom/robinhood/android/profiles/ui/view/ProfileOverlay;", "Lcom/robinhood/models/db/ProfileColor;", "getThemeReference", "(Lcom/robinhood/models/db/ProfileColor;)Lcom/robinhood/android/profiles/ui/view/ProfileOverlay;", "displayOrder", "", "getDisplayOrder", "(Lcom/robinhood/models/db/ProfileColor;)I", "withFixedColor", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "feature-lib-profiles_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.profiles.extensions.ProfileColorsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfileColors {

    /* compiled from: ProfileColors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.extensions.ProfileColorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Profile2.values().length];
            try {
                iArr[Profile2.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Profile2.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Profile2.DARK_BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Profile2.GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Profile2.MAGENTA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Profile2.PINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Profile2.PURPLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Profile2.ORANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Profile2.TEAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Profile2.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProfileOverlay getThemeReference(Profile2 profile2) {
        Intrinsics.checkNotNullParameter(profile2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[profile2.ordinal()]) {
            case 1:
                return ProfileOverlay.BLACK;
            case 2:
                return ProfileOverlay.BLUE;
            case 3:
                return ProfileOverlay.DARK_BLUE;
            case 4:
                return ProfileOverlay.GOLD;
            case 5:
                return ProfileOverlay.MAGENTA;
            case 6:
                return ProfileOverlay.PINK;
            case 7:
                return ProfileOverlay.PURPLE;
            case 8:
                return ProfileOverlay.ORANGE;
            case 9:
                return ProfileOverlay.TEAL;
            case 10:
                return ProfileOverlay.BLUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getDisplayOrder(Profile2 profile2) {
        Intrinsics.checkNotNullParameter(profile2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[profile2.ordinal()]) {
            case 1:
                return 7;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 2147483646;
            case 5:
                return 2;
            case 6:
                return 1;
            case 7:
                return 3;
            case 8:
                return 0;
            case 9:
                return 6;
            case 10:
                return Integer.MAX_VALUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Profile2 withFixedColor(Profile2 profile2, MarginSubscription marginSubscription) {
        Intrinsics.checkNotNullParameter(profile2, "<this>");
        return profile2 == Profile2.GOLD ? (marginSubscription == null || !marginSubscription.is24Karat()) ? Profile2.BLACK : profile2 : profile2;
    }
}
