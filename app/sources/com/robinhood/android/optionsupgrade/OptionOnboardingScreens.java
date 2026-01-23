package com.robinhood.android.optionsupgrade;

import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;

/* compiled from: OptionOnboardingScreens.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "setLoading", "", "isLoading", "", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingScreen, reason: use source file name */
/* loaded from: classes11.dex */
public interface OptionOnboardingScreens extends AutoLoggableFragment {
    OptionOnboardingScreens2 getCallbacks();

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    Screen getEventScreen();

    ScreenArgs getScreenArgs();

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    Context getScreenEventContext();

    void setLoading(boolean isLoading, ScreenRequest currentScreenRequest);

    /* compiled from: OptionOnboardingScreens.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingScreen$DefaultImpls */
    public static final class DefaultImpls {
        public static boolean getExcludeFromAutoScreenAppearEventLogging(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(optionOnboardingScreens);
        }

        public static boolean getExcludeFromAutoScreenDisappearEventLogging(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(optionOnboardingScreens);
        }

        public static boolean getExcludeFromAutoScreenEventLogging(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(optionOnboardingScreens);
        }

        public static boolean getExcludeFromAutoScreenSourceEventLogging(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(optionOnboardingScreens);
        }

        public static Component getScreenEventComponent(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(optionOnboardingScreens);
        }

        public static UserInteractionEventData getScreenEventData(OptionOnboardingScreens optionOnboardingScreens) {
            return AutoLoggableFragment.DefaultImpls.getScreenEventData(optionOnboardingScreens);
        }

        public static Screen getEventScreen(OptionOnboardingScreens optionOnboardingScreens) {
            return OptionOnboardingLoggings.getEventScreen(optionOnboardingScreens.getScreenArgs());
        }

        public static Context getScreenEventContext(OptionOnboardingScreens optionOnboardingScreens) {
            return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionOnboardingScreens.getCallbacks().getOptionOnboardingScreenContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -65, 16383, null);
        }
    }
}
