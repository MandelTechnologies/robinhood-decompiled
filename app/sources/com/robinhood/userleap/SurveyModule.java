package com.robinhood.userleap;

import androidx.fragment.app.FragmentManager;
import com.userleap.UserLeap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/userleap/SurveyModule;", "", "<init>", "()V", "provideUserLeap", "Lcom/userleap/UserLeap;", "provideUserLeapFragmentLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SurveyModule {
    public static final SurveyModule INSTANCE = new SurveyModule();

    public final FragmentManager.FragmentLifecycleCallbacks provideUserLeapFragmentLifecycleCallbacks(SurveyManager3 userLeapManager) {
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        return userLeapManager;
    }

    private SurveyModule() {
    }

    public final UserLeap provideUserLeap() {
        return UserLeap.INSTANCE;
    }
}
