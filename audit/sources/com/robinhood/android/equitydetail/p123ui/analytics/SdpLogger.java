package com.robinhood.android.equitydetail.p123ui.analytics;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: SdpLogger.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010)\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010BR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020(0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010I\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u00102R\u0014\u0010M\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010/¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "event", "", "logTap", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Swipe;", "logSwipe", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Swipe;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Scrub;", "logScrub", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Scrub;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ViewContextUpdate;", "logViewContextUpdate", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ViewContextUpdate;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$Graph;", "incoming", "logGraphUpdate", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$Graph;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$EtpComposition;", "logEtpCompositionUpdate", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext$EtpComposition;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onPause", "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentType", "logAppearance", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "logDisappearance", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "logEvent", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;)V", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "context", "changeContext", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;)V", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "provideEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "provideEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/analytics/EventLogger;", "Ljava/util/UUID;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "setInstrumentId", "(Ljava/util/UUID;)V", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "setSource", "(Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;)V", "Lcom/robinhood/rosetta/eventlogging/Context;", "", "j$/time/Instant", "componentAppearanceTimes", "Ljava/util/Map;", "viewContexts", "getScreen", "screen", "Lcom/robinhood/rosetta/eventlogging/Asset;", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/Asset;", "asset", "getDefaultContext", "defaultContext", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SdpLogger implements DefaultLifecycleObserver, LoggableSdpView.Callbacks {
    public static final int $stable = 8;
    private final Map<Component.ComponentType, Instant> componentAppearanceTimes;
    private Context context;
    private final EventLogger eventLogger;
    private UUID instrumentId;
    private InstrumentDetailSource source;
    private final Map<Component.ComponentType, LoggableViewContext> viewContexts;

    public SdpLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, getAsset(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
        this.componentAppearanceTimes = new LinkedHashMap();
        this.viewContexts = new LinkedHashMap();
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final void setInstrumentId(UUID uuid) {
        this.instrumentId = uuid;
    }

    public final InstrumentDetailSource getSource() {
        return this.source;
    }

    public final void setSource(InstrumentDetailSource instrumentDetailSource) {
        this.source = instrumentDetailSource;
    }

    private final Screen getScreen() {
        String serverValue;
        String string2;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        UUID uuid = this.instrumentId;
        String str = "";
        String str2 = (uuid == null || (string2 = uuid.toString()) == null) ? "" : string2;
        InstrumentDetailSource instrumentDetailSource = this.source;
        if (instrumentDetailSource != null && (serverValue = instrumentDetailSource.getServerValue()) != null) {
            str = serverValue;
        }
        return new Screen(name, str, str2, null, 8, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.componentAppearanceTimes.clear();
        this.viewContexts.clear();
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public void logAppearance(Component.ComponentType componentType) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        if (!this.componentAppearanceTimes.containsKey(componentType)) {
            EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, getScreen(), new Component(componentType, null, null, 6, null), null, getDefaultContext(), 9, null);
        }
        this.componentAppearanceTimes.put(componentType, Instant.now());
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public void logDisappearance(Component.ComponentType componentType) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Instant instant = this.componentAppearanceTimes.get(componentType);
        if (instant == null) {
            return;
        }
        EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, null, getScreen(), new Component(componentType, null, null, 6, null), null, Context.copy$default(getDefaultContext(), 0, 0, 0, null, null, null, null, null, (int) (Instant.now().toEpochMilli() - instant.toEpochMilli()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 9, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public void logEvent(SdpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof SdpEvent.Tap) {
            logTap((SdpEvent.Tap) event);
            return;
        }
        if (event instanceof SdpEvent.Swipe) {
            logSwipe((SdpEvent.Swipe) event);
        } else if (event instanceof SdpEvent.Scrub) {
            logScrub((SdpEvent.Scrub) event);
        } else {
            if (!(event instanceof SdpEvent.ViewContextUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            logViewContextUpdate((SdpEvent.ViewContextUpdate) event);
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public void changeContext(LoggableViewContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.buildContext(this.context);
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public Context provideEventContext() {
        return getDefaultContext();
    }

    @Override // com.robinhood.android.equitydetail.ui.analytics.LoggableSdpView.Callbacks
    public Screen provideEventScreen() {
        return getScreen();
    }

    private final void logTap(SdpEvent.Tap event) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, event.getAction(), getScreen(), new Component(event.getComponentType(), event.getCompnentIdentifier(), null, 4, null), null, event.buildContext(getDefaultContext()), false, 40, null);
    }

    private final void logSwipe(SdpEvent.Swipe event) {
        EventLogger.DefaultImpls.logSwipe$default(this.eventLogger, null, getScreen(), new Component(event.getComponentType(), null, null, 6, null), null, getDefaultContext(), false, 41, null);
    }

    private final void logScrub(SdpEvent.Scrub event) {
        Context defaultContext;
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = event.getAction();
        Screen screen = getScreen();
        Component component = new Component(event.getComponentType(), null, null, 6, null);
        LoggableViewContext loggableViewContext = this.viewContexts.get(event.getComponentType());
        if (loggableViewContext == null || (defaultContext = loggableViewContext.buildContext(getDefaultContext())) == null) {
            defaultContext = getDefaultContext();
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, defaultContext, false, 40, null);
    }

    private final void logViewContextUpdate(SdpEvent.ViewContextUpdate event) {
        if (!event.getSilent()) {
            LoggableViewContext context = event.getContext();
            if (context instanceof LoggableViewContext.Graph) {
                logGraphUpdate((LoggableViewContext.Graph) event.getContext());
            } else if (context instanceof LoggableViewContext.EtpComposition) {
                logEtpCompositionUpdate((LoggableViewContext.EtpComposition) event.getContext());
            } else if (!(context instanceof LoggableViewContext.ShareholderExperience)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.viewContexts.put(event.getComponentType(), event.getContext());
    }

    private final void logGraphUpdate(LoggableViewContext.Graph incoming) {
        Map<Component.ComponentType, LoggableViewContext> map = this.viewContexts;
        Component.ComponentType componentType = Component.ComponentType.GRAPH_SECTION;
        LoggableViewContext loggableViewContext = map.get(componentType);
        LoggableViewContext.Graph graph = loggableViewContext instanceof LoggableViewContext.Graph ? (LoggableViewContext.Graph) loggableViewContext : null;
        if (graph == null) {
            return;
        }
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = incoming.getAction(graph);
        if (action == null) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, getScreen(), new Component(componentType, null, null, 6, null), null, incoming.buildContext(getDefaultContext()), false, 40, null);
    }

    private final void logEtpCompositionUpdate(LoggableViewContext.EtpComposition incoming) {
        Map<Component.ComponentType, LoggableViewContext> map = this.viewContexts;
        Component.ComponentType componentType = Component.ComponentType.ETP_COMPOSITION_SECTION;
        LoggableViewContext loggableViewContext = map.get(componentType);
        LoggableViewContext.EtpComposition etpComposition = loggableViewContext instanceof LoggableViewContext.EtpComposition ? (LoggableViewContext.EtpComposition) loggableViewContext : null;
        if ((etpComposition != null ? etpComposition.getDataType() : null) == incoming.getDataType()) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.TOGGLE_ETP_COMPOSITION_VIEW, getScreen(), new Component(componentType, null, null, 6, null), null, incoming.buildContext(getDefaultContext()), false, 40, null);
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, getScreen(), new Component(componentType, null, null, 6, null), null, incoming.buildContext(getDefaultContext()), 9, null);
        if (etpComposition != null) {
            EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, null, getScreen(), new Component(componentType, null, null, 6, null), null, etpComposition.buildContext(Context.copy$default(getDefaultContext(), 0, 0, 0, null, null, null, null, null, (int) (incoming.getTransitionTime().toEpochMilli() - etpComposition.getTransitionTime().toEpochMilli()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null)), 9, null);
        }
    }

    private final Asset getAsset() {
        String string2;
        Asset asset = new Asset(null, Asset.AssetType.INSTRUMENT, null, null, 13, null);
        UUID uuid = this.instrumentId;
        return (uuid == null || (string2 = uuid.toString()) == null) ? asset : Asset.copy$default(asset, string2, null, null, null, 14, null);
    }

    private final Context getDefaultContext() {
        return Context.copy$default(this.context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, getAsset(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
    }
}
