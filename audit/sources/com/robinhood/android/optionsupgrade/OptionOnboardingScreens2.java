package com.robinhood.android.optionsupgrade;

import androidx.fragment.app.Fragment;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import kotlin.Metadata;

/* compiled from: OptionOnboardingScreens.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "", "startOptionOnboardingFlow", "", "startScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest$Start;", "startScreenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Start;", "goToNextScreen", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "currentScreenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "goToNonOptionOnboardingScreenFragment", "fragment", "Landroidx/fragment/app/Fragment;", "getOptionOnboardingScreenContext", "Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingScreenCallback, reason: use source file name */
/* loaded from: classes11.dex */
public interface OptionOnboardingScreens2 {
    OptionOnboardingContext getOptionOnboardingScreenContext();

    void goToNextScreen(ScreenRequest currentScreenRequest, ScreenArgs currentScreenArgs);

    void goToNonOptionOnboardingScreenFragment(Fragment fragment);

    void startOptionOnboardingFlow(ScreenRequest.Start startScreenRequest, ScreenArgs.Start startScreenArgs);
}
