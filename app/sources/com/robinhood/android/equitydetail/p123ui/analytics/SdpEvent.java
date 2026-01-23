package com.robinhood.android.equitydetail.p123ui.analytics;

import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdpEvent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0004\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "compnentIdentifier", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Ljava/lang/String;)V", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getCompnentIdentifier", "()Ljava/lang/String;", "Tap", "Swipe", "Scrub", "ViewContextUpdate", "RelatedInstrumentSelected", "SimilarInstrumentSelected", "EtpItemSelected", "ShareholderEntrypointTapped", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Scrub;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Swipe;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ViewContextUpdate;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class SdpEvent {
    public static final int $stable = 0;
    private final String compnentIdentifier;
    private final Component.ComponentType componentType;

    public /* synthetic */ SdpEvent(Component.ComponentType componentType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentType, str);
    }

    private SdpEvent(Component.ComponentType componentType, String str) {
        this.componentType = componentType;
        this.compnentIdentifier = str;
    }

    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    public /* synthetic */ SdpEvent(Component.ComponentType componentType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentType, (i & 2) != 0 ? "" : str, null);
    }

    public String getCompnentIdentifier() {
        return this.compnentIdentifier;
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "compnentIdentifier", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getCompnentIdentifier", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class Tap extends SdpEvent {
        public static final int $stable = 0;
        private final UserInteractionEventData.Action action;
        private final String compnentIdentifier;
        private final Component.ComponentType componentType;

        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent
        public Component.ComponentType getComponentType() {
            return this.componentType;
        }

        public /* synthetic */ Tap(Component.ComponentType componentType, String str, UserInteractionEventData.Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(componentType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? UserInteractionEventData.Action.ACTION_UNSPECIFIED : action);
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent
        public String getCompnentIdentifier() {
            return this.compnentIdentifier;
        }

        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tap(Component.ComponentType componentType, String compnentIdentifier, UserInteractionEventData.Action action) {
            super(componentType, compnentIdentifier, null);
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            Intrinsics.checkNotNullParameter(compnentIdentifier, "compnentIdentifier");
            Intrinsics.checkNotNullParameter(action, "action");
            this.componentType = componentType;
            this.compnentIdentifier = compnentIdentifier;
            this.action = action;
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Swipe;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Swipe extends SdpEvent {
        public static final int $stable = 0;
        private final Component.ComponentType componentType;

        public static /* synthetic */ Swipe copy$default(Swipe swipe, Component.ComponentType componentType, int i, Object obj) {
            if ((i & 1) != 0) {
                componentType = swipe.componentType;
            }
            return swipe.copy(componentType);
        }

        /* renamed from: component1, reason: from getter */
        public final Component.ComponentType getComponentType() {
            return this.componentType;
        }

        public final Swipe copy(Component.ComponentType componentType) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            return new Swipe(componentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Swipe) && this.componentType == ((Swipe) other).componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return "Swipe(componentType=" + this.componentType + ")";
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent
        public Component.ComponentType getComponentType() {
            return this.componentType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Swipe(Component.ComponentType componentType) {
            super(componentType, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            this.componentType = componentType;
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Scrub;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Scrub extends SdpEvent {
        public static final int $stable = 0;
        private final UserInteractionEventData.Action action;
        private final Component.ComponentType componentType;

        public static /* synthetic */ Scrub copy$default(Scrub scrub, Component.ComponentType componentType, UserInteractionEventData.Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                componentType = scrub.componentType;
            }
            if ((i & 2) != 0) {
                action = scrub.action;
            }
            return scrub.copy(componentType, action);
        }

        /* renamed from: component1, reason: from getter */
        public final Component.ComponentType getComponentType() {
            return this.componentType;
        }

        /* renamed from: component2, reason: from getter */
        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        public final Scrub copy(Component.ComponentType componentType, UserInteractionEventData.Action action) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Scrub(componentType, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scrub)) {
                return false;
            }
            Scrub scrub = (Scrub) other;
            return this.componentType == scrub.componentType && this.action == scrub.action;
        }

        public int hashCode() {
            return (this.componentType.hashCode() * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Scrub(componentType=" + this.componentType + ", action=" + this.action + ")";
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent
        public Component.ComponentType getComponentType() {
            return this.componentType;
        }

        public /* synthetic */ Scrub(Component.ComponentType componentType, UserInteractionEventData.Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(componentType, (i & 2) != 0 ? UserInteractionEventData.Action.SCRUB : action);
        }

        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Scrub(Component.ComponentType componentType, UserInteractionEventData.Action action) {
            super(componentType, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            Intrinsics.checkNotNullParameter(action, "action");
            this.componentType = componentType;
            this.action = action;
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ViewContextUpdate;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "context", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "silent", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;Z)V", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getContext", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "getSilent", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewContextUpdate extends SdpEvent {
        public static final int $stable = 0;
        private final Component.ComponentType componentType;
        private final LoggableViewContext context;
        private final boolean silent;

        public static /* synthetic */ ViewContextUpdate copy$default(ViewContextUpdate viewContextUpdate, Component.ComponentType componentType, LoggableViewContext loggableViewContext, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                componentType = viewContextUpdate.componentType;
            }
            if ((i & 2) != 0) {
                loggableViewContext = viewContextUpdate.context;
            }
            if ((i & 4) != 0) {
                z = viewContextUpdate.silent;
            }
            return viewContextUpdate.copy(componentType, loggableViewContext, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Component.ComponentType getComponentType() {
            return this.componentType;
        }

        /* renamed from: component2, reason: from getter */
        public final LoggableViewContext getContext() {
            return this.context;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSilent() {
            return this.silent;
        }

        public final ViewContextUpdate copy(Component.ComponentType componentType, LoggableViewContext context, boolean silent) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            Intrinsics.checkNotNullParameter(context, "context");
            return new ViewContextUpdate(componentType, context, silent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewContextUpdate)) {
                return false;
            }
            ViewContextUpdate viewContextUpdate = (ViewContextUpdate) other;
            return this.componentType == viewContextUpdate.componentType && Intrinsics.areEqual(this.context, viewContextUpdate.context) && this.silent == viewContextUpdate.silent;
        }

        public int hashCode() {
            return (((this.componentType.hashCode() * 31) + this.context.hashCode()) * 31) + Boolean.hashCode(this.silent);
        }

        public String toString() {
            return "ViewContextUpdate(componentType=" + this.componentType + ", context=" + this.context + ", silent=" + this.silent + ")";
        }

        public /* synthetic */ ViewContextUpdate(Component.ComponentType componentType, LoggableViewContext loggableViewContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(componentType, loggableViewContext, (i & 4) != 0 ? false : z);
        }

        @Override // com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent
        public Component.ComponentType getComponentType() {
            return this.componentType;
        }

        public final LoggableViewContext getContext() {
            return this.context;
        }

        public final boolean getSilent() {
            return this.silent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewContextUpdate(Component.ComponentType componentType, LoggableViewContext context, boolean z) {
            super(componentType, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            Intrinsics.checkNotNullParameter(context, "context");
            this.componentType = componentType;
            this.context = context;
            this.silent = z;
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$RelatedInstrumentSelected;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "displayName", "", "<init>", "(Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RelatedInstrumentSelected extends Tap {
        public static final int $stable = 0;
        private final String displayName;

        public static /* synthetic */ RelatedInstrumentSelected copy$default(RelatedInstrumentSelected relatedInstrumentSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = relatedInstrumentSelected.displayName;
            }
            return relatedInstrumentSelected.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public final RelatedInstrumentSelected copy(String displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new RelatedInstrumentSelected(displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelatedInstrumentSelected) && Intrinsics.areEqual(this.displayName, ((RelatedInstrumentSelected) other).displayName);
        }

        public int hashCode() {
            return this.displayName.hashCode();
        }

        public String toString() {
            return "RelatedInstrumentSelected(displayName=" + this.displayName + ")";
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelatedInstrumentSelected(String displayName) {
            super(Component.ComponentType.RELATED_LISTS_SECTION, null, null, 6, null);
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.displayName = displayName;
        }

        @Override // com.robinhood.android.equitydetail.ui.analytics.SdpEvent.Tap
        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(this.displayName, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$SimilarInstrumentSelected;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "selectedInstrumentId", "", "<init>", "(Ljava/lang/String;)V", "getSelectedInstrumentId", "()Ljava/lang/String;", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SimilarInstrumentSelected extends Tap {
        public static final int $stable = 0;
        private final String selectedInstrumentId;

        public static /* synthetic */ SimilarInstrumentSelected copy$default(SimilarInstrumentSelected similarInstrumentSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = similarInstrumentSelected.selectedInstrumentId;
            }
            return similarInstrumentSelected.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        public final SimilarInstrumentSelected copy(String selectedInstrumentId) {
            Intrinsics.checkNotNullParameter(selectedInstrumentId, "selectedInstrumentId");
            return new SimilarInstrumentSelected(selectedInstrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SimilarInstrumentSelected) && Intrinsics.areEqual(this.selectedInstrumentId, ((SimilarInstrumentSelected) other).selectedInstrumentId);
        }

        public int hashCode() {
            return this.selectedInstrumentId.hashCode();
        }

        public String toString() {
            return "SimilarInstrumentSelected(selectedInstrumentId=" + this.selectedInstrumentId + ")";
        }

        public final String getSelectedInstrumentId() {
            return this.selectedInstrumentId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimilarInstrumentSelected(String selectedInstrumentId) {
            super(Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION, null, null, 6, null);
            Intrinsics.checkNotNullParameter(selectedInstrumentId, "selectedInstrumentId");
            this.selectedInstrumentId = selectedInstrumentId;
        }

        @Override // com.robinhood.android.equitydetail.ui.analytics.SdpEvent.Tap
        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(this.selectedInstrumentId, Asset.AssetType.INSTRUMENT, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$EtpItemSelected;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;)V", "getItem", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EtpItemSelected extends Tap {
        public static final int $stable = 8;
        private final EtpCompositionItemHolder item;

        public static /* synthetic */ EtpItemSelected copy$default(EtpItemSelected etpItemSelected, EtpCompositionItemHolder etpCompositionItemHolder, int i, Object obj) {
            if ((i & 1) != 0) {
                etpCompositionItemHolder = etpItemSelected.item;
            }
            return etpItemSelected.copy(etpCompositionItemHolder);
        }

        /* renamed from: component1, reason: from getter */
        public final EtpCompositionItemHolder getItem() {
            return this.item;
        }

        public final EtpItemSelected copy(EtpCompositionItemHolder item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new EtpItemSelected(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EtpItemSelected) && Intrinsics.areEqual(this.item, ((EtpItemSelected) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "EtpItemSelected(item=" + this.item + ")";
        }

        public final EtpCompositionItemHolder getItem() {
            return this.item;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EtpItemSelected(EtpCompositionItemHolder item) {
            super(Component.ComponentType.ETP_COMPOSITION_SECTION, null, null, 6, null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        @Override // com.robinhood.android.equitydetail.ui.analytics.SdpEvent.Tap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Context buildContext(Context context) {
            EtpCompositionContext.CompositionType compositionType;
            EtpCompositionItemHolder etpCompositionItemHolder;
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            EtpCompositionItemHolder etpCompositionItemHolder2 = this.item;
            if (etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Sector) {
                compositionType = EtpCompositionContext.CompositionType.SECTORS;
            } else {
                if (!(etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Holding)) {
                    throw new NoWhenBranchMatchedException();
                }
                compositionType = EtpCompositionContext.CompositionType.HOLDINGS;
            }
            EtpCompositionContext.CompositionType compositionType2 = compositionType;
            String name = "";
            if (!(etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Holding)) {
                if (!(etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Sector)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                UUID instrumentId = ((EtpCompositionItemHolder.Holding) etpCompositionItemHolder2).getHolding().getInstrumentId();
                if (instrumentId == null || (string = instrumentId.toString()) == null) {
                }
                etpCompositionItemHolder = this.item;
                if (etpCompositionItemHolder instanceof EtpCompositionItemHolder.Sector) {
                    if (etpCompositionItemHolder instanceof EtpCompositionItemHolder.Holding) {
                        String sector = ((EtpCompositionItemHolder.Holding) etpCompositionItemHolder).getHolding().getSector();
                        if (sector != null) {
                            str = sector;
                        }
                        return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EtpCompositionContext(compositionType2, string, str, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -134217729, -1, -1, -1, -1, 16383, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                name = ((EtpCompositionItemHolder.Sector) etpCompositionItemHolder).getSector().getName();
                str = name;
                return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EtpCompositionContext(compositionType2, string, str, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -134217729, -1, -1, -1, -1, 16383, null);
            }
            String string2 = "";
            etpCompositionItemHolder = this.item;
            if (etpCompositionItemHolder instanceof EtpCompositionItemHolder.Sector) {
            }
            str = name;
            return Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EtpCompositionContext(compositionType2, string2, str, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -134217729, -1, -1, -1, -1, 16383, null);
        }
    }

    /* compiled from: SdpEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ShareholderEntrypointTapped;", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$Tap;", "eventSlug", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "buttonText", "isShareholder", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEventSlug", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "getButtonText", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "buildContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "context", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent$ShareholderEntrypointTapped;", "equals", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareholderEntrypointTapped extends Tap {
        public static final int $stable = 0;
        private final String buttonText;
        private final ShareholderQAContext.EntryPoint entryPoint;
        private final String eventSlug;
        private final Boolean isShareholder;

        public static /* synthetic */ ShareholderEntrypointTapped copy$default(ShareholderEntrypointTapped shareholderEntrypointTapped, String str, ShareholderQAContext.EntryPoint entryPoint, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareholderEntrypointTapped.eventSlug;
            }
            if ((i & 2) != 0) {
                entryPoint = shareholderEntrypointTapped.entryPoint;
            }
            if ((i & 4) != 0) {
                str2 = shareholderEntrypointTapped.buttonText;
            }
            if ((i & 8) != 0) {
                bool = shareholderEntrypointTapped.isShareholder;
            }
            return shareholderEntrypointTapped.copy(str, entryPoint, str2, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventSlug() {
            return this.eventSlug;
        }

        /* renamed from: component2, reason: from getter */
        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsShareholder() {
            return this.isShareholder;
        }

        public final ShareholderEntrypointTapped copy(String eventSlug, ShareholderQAContext.EntryPoint entryPoint, String buttonText, Boolean isShareholder) {
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            return new ShareholderEntrypointTapped(eventSlug, entryPoint, buttonText, isShareholder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareholderEntrypointTapped)) {
                return false;
            }
            ShareholderEntrypointTapped shareholderEntrypointTapped = (ShareholderEntrypointTapped) other;
            return Intrinsics.areEqual(this.eventSlug, shareholderEntrypointTapped.eventSlug) && this.entryPoint == shareholderEntrypointTapped.entryPoint && Intrinsics.areEqual(this.buttonText, shareholderEntrypointTapped.buttonText) && Intrinsics.areEqual(this.isShareholder, shareholderEntrypointTapped.isShareholder);
        }

        public int hashCode() {
            int iHashCode = ((((this.eventSlug.hashCode() * 31) + this.entryPoint.hashCode()) * 31) + this.buttonText.hashCode()) * 31;
            Boolean bool = this.isShareholder;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "ShareholderEntrypointTapped(eventSlug=" + this.eventSlug + ", entryPoint=" + this.entryPoint + ", buttonText=" + this.buttonText + ", isShareholder=" + this.isShareholder + ")";
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final ShareholderQAContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public /* synthetic */ ShareholderEntrypointTapped(String str, ShareholderQAContext.EntryPoint entryPoint, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, entryPoint, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : bool);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final Boolean isShareholder() {
            return this.isShareholder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareholderEntrypointTapped(String eventSlug, ShareholderQAContext.EntryPoint entryPoint, String buttonText, Boolean bool) {
            super(Component.ComponentType.SHAREHOLDER_QA_SECTION, null, null, 6, null);
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.eventSlug = eventSlug;
            this.entryPoint = entryPoint;
            this.buttonText = buttonText;
            this.isShareholder = bool;
        }

        @Override // com.robinhood.android.equitydetail.ui.analytics.SdpEvent.Tap
        public Context buildContext(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Context.copy$default(context, 0, 0, 0, this.buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ShareholderQAContext(this.eventSlug, this.entryPoint, ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED, Booleans2.toProtobuf(this.isShareholder), ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED, ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1025, -1, -1, -1, 16383, null);
        }
    }
}
