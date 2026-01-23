package com.robinhood.android.autoeventlogging;

import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;

/* compiled from: AutoLoggableFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "excludeFromAutoScreenAppearEventLogging", "getExcludeFromAutoScreenAppearEventLogging", "excludeFromAutoScreenDisappearEventLogging", "getExcludeFromAutoScreenDisappearEventLogging", "excludeFromAutoScreenSourceEventLogging", "getExcludeFromAutoScreenSourceEventLogging", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AutoLoggableFragment {
    Screen getEventScreen();

    boolean getExcludeFromAutoScreenAppearEventLogging();

    boolean getExcludeFromAutoScreenDisappearEventLogging();

    boolean getExcludeFromAutoScreenEventLogging();

    boolean getExcludeFromAutoScreenSourceEventLogging();

    Component getScreenEventComponent();

    Context getScreenEventContext();

    UserInteractionEventData getScreenEventData();

    /* compiled from: AutoLoggableFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getExcludeFromAutoScreenAppearEventLogging(AutoLoggableFragment autoLoggableFragment) {
            return false;
        }

        public static boolean getExcludeFromAutoScreenDisappearEventLogging(AutoLoggableFragment autoLoggableFragment) {
            return false;
        }

        public static boolean getExcludeFromAutoScreenEventLogging(AutoLoggableFragment autoLoggableFragment) {
            return false;
        }

        public static Component getScreenEventComponent(AutoLoggableFragment autoLoggableFragment) {
            return null;
        }

        public static Context getScreenEventContext(AutoLoggableFragment autoLoggableFragment) {
            return null;
        }

        public static UserInteractionEventData getScreenEventData(AutoLoggableFragment autoLoggableFragment) {
            return new UserInteractionEventData(null, autoLoggableFragment.getEventScreen(), autoLoggableFragment.getScreenEventComponent(), null, autoLoggableFragment.getScreenEventContext(), null, null, 105, null);
        }

        public static boolean getExcludeFromAutoScreenSourceEventLogging(AutoLoggableFragment autoLoggableFragment) {
            return autoLoggableFragment.getExcludeFromAutoScreenEventLogging();
        }
    }
}
