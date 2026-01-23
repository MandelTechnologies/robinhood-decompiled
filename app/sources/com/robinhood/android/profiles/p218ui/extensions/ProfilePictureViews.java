package com.robinhood.android.profiles.p218ui.extensions;

import com.robinhood.android.profiles.p218ui.view.ProfilePictureView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfilePictureViews.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"analyticsButtonDescription", "", "Lcom/robinhood/android/profiles/ui/view/ProfilePictureView;", "getAnalyticsButtonDescription", "(Lcom/robinhood/android/profiles/ui/view/ProfilePictureView;)Ljava/lang/String;", "ANALYTICS_PROFILE_PIC_EMPTY", "ANALYTICS_PROFILE_PIC_IMAGE", "feature-lib-profiles_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.profiles.ui.extensions.ProfilePictureViewsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfilePictureViews {
    private static final String ANALYTICS_PROFILE_PIC_EMPTY = "empty";
    private static final String ANALYTICS_PROFILE_PIC_IMAGE = "image";

    public static final String getAnalyticsButtonDescription(ProfilePictureView profilePictureView) {
        Intrinsics.checkNotNullParameter(profilePictureView, "<this>");
        return profilePictureView.isPictureSet() ? "image" : ANALYTICS_PROFILE_PIC_EMPTY;
    }
}
