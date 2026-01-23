package com.robinhood.android.gold.upgrade.unified;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldFlowScreen;
import gold_flow.proto.p466v1.PresentRouterMetadata;
import gold_flow.proto.p466v1.PresentationType;
import gold_flow.proto.p466v1.TransitionAnimation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedHostEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "", "<init>", "()V", "PushScreen", "OpenDeeplink", "DismissScreen", "DismissAll", "PresentRouter", "PresentDialog", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$DismissAll;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$DismissScreen;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$OpenDeeplink;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PresentDialog;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PresentRouter;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PushScreen;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldUnifiedHostEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldUnifiedHostEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PushScreen;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "screen", "Lgold_flow/proto/v1/GoldFlowScreen;", "genericArgs", "", "", "presentationType", "Lgold_flow/proto/v1/PresentationType;", "transitionAnimation", "Lgold_flow/proto/v1/TransitionAnimation;", "customBackAction", "Lgold_flow/proto/v1/Action;", "shouldDismissScreenWithCustomBackAction", "", "<init>", "(Lgold_flow/proto/v1/GoldFlowScreen;Ljava/util/Map;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;)V", "getScreen", "()Lgold_flow/proto/v1/GoldFlowScreen;", "getGenericArgs", "()Ljava/util/Map;", "getPresentationType", "()Lgold_flow/proto/v1/PresentationType;", "getTransitionAnimation", "()Lgold_flow/proto/v1/TransitionAnimation;", "getCustomBackAction", "()Lgold_flow/proto/v1/Action;", "getShouldDismissScreenWithCustomBackAction", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lgold_flow/proto/v1/GoldFlowScreen;Ljava/util/Map;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;)Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PushScreen;", "equals", "other", "", "hashCode", "", "toString", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushScreen extends GoldUnifiedHostEvent {
        public static final int $stable = 8;
        private final Action customBackAction;
        private final Map<String, String> genericArgs;
        private final PresentationType presentationType;
        private final GoldFlowScreen screen;
        private final Boolean shouldDismissScreenWithCustomBackAction;
        private final TransitionAnimation transitionAnimation;

        public static /* synthetic */ PushScreen copy$default(PushScreen pushScreen, GoldFlowScreen goldFlowScreen, Map map, PresentationType presentationType, TransitionAnimation transitionAnimation, Action action, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                goldFlowScreen = pushScreen.screen;
            }
            if ((i & 2) != 0) {
                map = pushScreen.genericArgs;
            }
            if ((i & 4) != 0) {
                presentationType = pushScreen.presentationType;
            }
            if ((i & 8) != 0) {
                transitionAnimation = pushScreen.transitionAnimation;
            }
            if ((i & 16) != 0) {
                action = pushScreen.customBackAction;
            }
            if ((i & 32) != 0) {
                bool = pushScreen.shouldDismissScreenWithCustomBackAction;
            }
            Action action2 = action;
            Boolean bool2 = bool;
            return pushScreen.copy(goldFlowScreen, map, presentationType, transitionAnimation, action2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldFlowScreen getScreen() {
            return this.screen;
        }

        public final Map<String, String> component2() {
            return this.genericArgs;
        }

        /* renamed from: component3, reason: from getter */
        public final PresentationType getPresentationType() {
            return this.presentationType;
        }

        /* renamed from: component4, reason: from getter */
        public final TransitionAnimation getTransitionAnimation() {
            return this.transitionAnimation;
        }

        /* renamed from: component5, reason: from getter */
        public final Action getCustomBackAction() {
            return this.customBackAction;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getShouldDismissScreenWithCustomBackAction() {
            return this.shouldDismissScreenWithCustomBackAction;
        }

        public final PushScreen copy(GoldFlowScreen screen, Map<String, String> genericArgs, PresentationType presentationType, TransitionAnimation transitionAnimation, Action customBackAction, Boolean shouldDismissScreenWithCustomBackAction) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(genericArgs, "genericArgs");
            Intrinsics.checkNotNullParameter(presentationType, "presentationType");
            Intrinsics.checkNotNullParameter(transitionAnimation, "transitionAnimation");
            return new PushScreen(screen, genericArgs, presentationType, transitionAnimation, customBackAction, shouldDismissScreenWithCustomBackAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushScreen)) {
                return false;
            }
            PushScreen pushScreen = (PushScreen) other;
            return this.screen == pushScreen.screen && Intrinsics.areEqual(this.genericArgs, pushScreen.genericArgs) && this.presentationType == pushScreen.presentationType && this.transitionAnimation == pushScreen.transitionAnimation && Intrinsics.areEqual(this.customBackAction, pushScreen.customBackAction) && Intrinsics.areEqual(this.shouldDismissScreenWithCustomBackAction, pushScreen.shouldDismissScreenWithCustomBackAction);
        }

        public int hashCode() {
            int iHashCode = ((((((this.screen.hashCode() * 31) + this.genericArgs.hashCode()) * 31) + this.presentationType.hashCode()) * 31) + this.transitionAnimation.hashCode()) * 31;
            Action action = this.customBackAction;
            int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
            Boolean bool = this.shouldDismissScreenWithCustomBackAction;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "PushScreen(screen=" + this.screen + ", genericArgs=" + this.genericArgs + ", presentationType=" + this.presentationType + ", transitionAnimation=" + this.transitionAnimation + ", customBackAction=" + this.customBackAction + ", shouldDismissScreenWithCustomBackAction=" + this.shouldDismissScreenWithCustomBackAction + ")";
        }

        public /* synthetic */ PushScreen(GoldFlowScreen goldFlowScreen, Map map, PresentationType presentationType, TransitionAnimation transitionAnimation, Action action, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(goldFlowScreen, map, presentationType, transitionAnimation, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : bool);
        }

        public final GoldFlowScreen getScreen() {
            return this.screen;
        }

        public final Map<String, String> getGenericArgs() {
            return this.genericArgs;
        }

        public final PresentationType getPresentationType() {
            return this.presentationType;
        }

        public final TransitionAnimation getTransitionAnimation() {
            return this.transitionAnimation;
        }

        public final Action getCustomBackAction() {
            return this.customBackAction;
        }

        public final Boolean getShouldDismissScreenWithCustomBackAction() {
            return this.shouldDismissScreenWithCustomBackAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushScreen(GoldFlowScreen screen, Map<String, String> genericArgs, PresentationType presentationType, TransitionAnimation transitionAnimation, Action action, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(genericArgs, "genericArgs");
            Intrinsics.checkNotNullParameter(presentationType, "presentationType");
            Intrinsics.checkNotNullParameter(transitionAnimation, "transitionAnimation");
            this.screen = screen;
            this.genericArgs = genericArgs;
            this.presentationType = presentationType;
            this.transitionAnimation = transitionAnimation;
            this.customBackAction = action;
            this.shouldDismissScreenWithCustomBackAction = bool;
        }
    }

    private GoldUnifiedHostEvent() {
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$OpenDeeplink;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "deeplinkUri", "", "presentationType", "Lgold_flow/proto/v1/PresentationType;", "genericArgs", "", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationType;Ljava/util/Map;)V", "getDeeplinkUri", "()Ljava/lang/String;", "getPresentationType", "()Lgold_flow/proto/v1/PresentationType;", "getGenericArgs", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenDeeplink extends GoldUnifiedHostEvent {
        public static final int $stable = 8;
        private final String deeplinkUri;
        private final Map<String, String> genericArgs;
        private final PresentationType presentationType;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, String str, PresentationType presentationType, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openDeeplink.deeplinkUri;
            }
            if ((i & 2) != 0) {
                presentationType = openDeeplink.presentationType;
            }
            if ((i & 4) != 0) {
                map = openDeeplink.genericArgs;
            }
            return openDeeplink.copy(str, presentationType, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplinkUri() {
            return this.deeplinkUri;
        }

        /* renamed from: component2, reason: from getter */
        public final PresentationType getPresentationType() {
            return this.presentationType;
        }

        public final Map<String, String> component3() {
            return this.genericArgs;
        }

        public final OpenDeeplink copy(String deeplinkUri, PresentationType presentationType, Map<String, String> genericArgs) {
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
            Intrinsics.checkNotNullParameter(presentationType, "presentationType");
            Intrinsics.checkNotNullParameter(genericArgs, "genericArgs");
            return new OpenDeeplink(deeplinkUri, presentationType, genericArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) other;
            return Intrinsics.areEqual(this.deeplinkUri, openDeeplink.deeplinkUri) && this.presentationType == openDeeplink.presentationType && Intrinsics.areEqual(this.genericArgs, openDeeplink.genericArgs);
        }

        public int hashCode() {
            return (((this.deeplinkUri.hashCode() * 31) + this.presentationType.hashCode()) * 31) + this.genericArgs.hashCode();
        }

        public String toString() {
            return "OpenDeeplink(deeplinkUri=" + this.deeplinkUri + ", presentationType=" + this.presentationType + ", genericArgs=" + this.genericArgs + ")";
        }

        public final String getDeeplinkUri() {
            return this.deeplinkUri;
        }

        public final PresentationType getPresentationType() {
            return this.presentationType;
        }

        public final Map<String, String> getGenericArgs() {
            return this.genericArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDeeplink(String deeplinkUri, PresentationType presentationType, Map<String, String> genericArgs) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
            Intrinsics.checkNotNullParameter(presentationType, "presentationType");
            Intrinsics.checkNotNullParameter(genericArgs, "genericArgs");
            this.deeplinkUri = deeplinkUri;
            this.presentationType = presentationType;
            this.genericArgs = genericArgs;
        }
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$DismissScreen;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissScreen extends GoldUnifiedHostEvent {
        public static final int $stable = 0;
        public static final DismissScreen INSTANCE = new DismissScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissScreen);
        }

        public int hashCode() {
            return -920805008;
        }

        public String toString() {
            return "DismissScreen";
        }

        private DismissScreen() {
            super(null);
        }
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$DismissAll;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "isSuccess", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissAll extends GoldUnifiedHostEvent {
        public static final int $stable = 0;
        private final boolean isSuccess;

        public static /* synthetic */ DismissAll copy$default(DismissAll dismissAll, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dismissAll.isSuccess;
            }
            return dismissAll.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSuccess() {
            return this.isSuccess;
        }

        public final DismissAll copy(boolean isSuccess) {
            return new DismissAll(isSuccess);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissAll) && this.isSuccess == ((DismissAll) other).isSuccess;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSuccess);
        }

        public String toString() {
            return "DismissAll(isSuccess=" + this.isSuccess + ")";
        }

        public DismissAll(boolean z) {
            super(null);
            this.isSuccess = z;
        }

        public final boolean isSuccess() {
            return this.isSuccess;
        }
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PresentRouter;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "presentRouterMetadata", "Lgold_flow/proto/v1/PresentRouterMetadata;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Lgold_flow/proto/v1/PresentRouterMetadata;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getPresentRouterMetadata", "()Lgold_flow/proto/v1/PresentRouterMetadata;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentRouter extends GoldUnifiedHostEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;
        private final PresentRouterMetadata presentRouterMetadata;

        public static /* synthetic */ PresentRouter copy$default(PresentRouter presentRouter, FragmentKey fragmentKey, PresentRouterMetadata presentRouterMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = presentRouter.fragmentKey;
            }
            if ((i & 2) != 0) {
                presentRouterMetadata = presentRouter.presentRouterMetadata;
            }
            return presentRouter.copy(fragmentKey, presentRouterMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* renamed from: component2, reason: from getter */
        public final PresentRouterMetadata getPresentRouterMetadata() {
            return this.presentRouterMetadata;
        }

        public final PresentRouter copy(FragmentKey fragmentKey, PresentRouterMetadata presentRouterMetadata) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new PresentRouter(fragmentKey, presentRouterMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentRouter)) {
                return false;
            }
            PresentRouter presentRouter = (PresentRouter) other;
            return Intrinsics.areEqual(this.fragmentKey, presentRouter.fragmentKey) && Intrinsics.areEqual(this.presentRouterMetadata, presentRouter.presentRouterMetadata);
        }

        public int hashCode() {
            int iHashCode = this.fragmentKey.hashCode() * 31;
            PresentRouterMetadata presentRouterMetadata = this.presentRouterMetadata;
            return iHashCode + (presentRouterMetadata == null ? 0 : presentRouterMetadata.hashCode());
        }

        public String toString() {
            return "PresentRouter(fragmentKey=" + this.fragmentKey + ", presentRouterMetadata=" + this.presentRouterMetadata + ")";
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final PresentRouterMetadata getPresentRouterMetadata() {
            return this.presentRouterMetadata;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentRouter(FragmentKey fragmentKey, PresentRouterMetadata presentRouterMetadata) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
            this.presentRouterMetadata = presentRouterMetadata;
        }
    }

    /* compiled from: GoldUnifiedHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PresentDialog;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentDialog extends GoldUnifiedHostEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey dialogFragmentKey;

        public static /* synthetic */ PresentDialog copy$default(PresentDialog presentDialog, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = presentDialog.dialogFragmentKey;
            }
            return presentDialog.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final PresentDialog copy(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new PresentDialog(dialogFragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentDialog) && Intrinsics.areEqual(this.dialogFragmentKey, ((PresentDialog) other).dialogFragmentKey);
        }

        public int hashCode() {
            return this.dialogFragmentKey.hashCode();
        }

        public String toString() {
            return "PresentDialog(dialogFragmentKey=" + this.dialogFragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentDialog(DialogFragmentKey dialogFragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }
}
