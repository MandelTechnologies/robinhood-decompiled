package com.robinhood.shared.bitdrift;

import android.content.Context;
import androidx.startup.AppInitializer;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.shared.bitdrift.BitdriftCapture;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.bitdrift.capture.Capture;
import io.bitdrift.capture.Configuration;
import io.bitdrift.capture.ContextHolder;
import io.bitdrift.capture.providers.session.SessionStrategy;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import io.bitdrift.capture.timber.CaptureTree;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: BitdriftCapture.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/bitdrift/BitdriftCapture;", "", "initialize", "", "applicationContext", "Landroid/content/Context;", "startNewSession", "errorTriggered", "logEvent", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/bitdrift/BitdriftCapture$UserInteractionEvent;", "setEnabled", "enabled", "", "sessionUrl", "", "getSessionUrl", "()Ljava/lang/String;", "Companion", "UserInteractionEvent", "lib-bitdrift_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface BitdriftCapture {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void errorTriggered();

    String getSessionUrl();

    void initialize(Context applicationContext);

    void logEvent(UserInteractionEvent data);

    void setEnabled(Context applicationContext, boolean enabled);

    void startNewSession();

    /* compiled from: BitdriftCapture.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/bitdrift/BitdriftCapture$Companion;", "Lcom/robinhood/shared/bitdrift/BitdriftCapture;", "<init>", "()V", "bitdriftKey", "", "excludedViews", "", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "initialize", "", "applicationContext", "Landroid/content/Context;", "startNewSession", "errorTriggered", "logEvent", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/bitdrift/BitdriftCapture$UserInteractionEvent;", "setEnabled", "enabled", "", "sessionUrl", "getSessionUrl", "()Ljava/lang/String;", "onNewSessionStarted", "lib-bitdrift_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements BitdriftCapture {
        private static final String bitdriftKey = "ChAtJABhU7BI1J+senTJj5iwEAIaIA7RhJiC/rW52vQVpgpynuVY1z3D/15tSpT2al+sd2xg";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> excludedViews = CollectionsKt.listOf("com.robinhood.android.walletbackup.gateway.manual.viewphrase.GatewayViewPhraseComposable");
        private static final AtomicBoolean isEnabled = new AtomicBoolean(false);
        private static final AtomicBoolean initialized = new AtomicBoolean(false);

        private Companion() {
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public void initialize(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            if (!isEnabled.get() || initialized.getAndSet(true)) {
                return;
            }
            AppInitializer.getInstance(applicationContext).initializeComponent(ContextHolder.class);
            Capture.Logger.start$default(bitdriftKey, new SessionStrategy.ActivityBased(0L, null, 3, null), new Configuration(new SessionReplayConfiguration(MapsKt.mapOf(Tuples4.m3642to(ReplayType.Ignore.INSTANCE, excludedViews)))), null, null, null, 56, null);
            onNewSessionStarted();
            Timber.INSTANCE.plant(new CaptureTree());
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public void startNewSession() {
            if (isEnabled.get() && initialized.get()) {
                Capture.Logger.startNewSession();
                onNewSessionStarted();
            }
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public void errorTriggered() {
            if (isEnabled.get() && initialized.get()) {
                Capture.Logger.logError$default(null, null, new Function0() { // from class: com.robinhood.shared.bitdrift.BitdriftCapture$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BitdriftCapture.Companion.errorTriggered$lambda$0();
                    }
                }, 3, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String errorTriggered$lambda$0() {
            return "App Error Reported";
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public void logEvent(final UserInteractionEvent data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (isEnabled.get() && initialized.get()) {
                Tuples2 tuples2M3642to = Tuples4.m3642to("eventType", data.getEventType());
                String screenName = data.getScreenName();
                if (screenName == null) {
                    screenName = "";
                }
                Tuples2 tuples2M3642to2 = Tuples4.m3642to("screenName", screenName);
                String screenIdentifier = data.getScreenIdentifier();
                if (screenIdentifier == null) {
                    screenIdentifier = "";
                }
                Tuples2 tuples2M3642to3 = Tuples4.m3642to("screenIdentifier", screenIdentifier);
                String componentType = data.getComponentType();
                if (componentType == null) {
                    componentType = "";
                }
                Tuples2 tuples2M3642to4 = Tuples4.m3642to("componentType", componentType);
                String componentIdentifier = data.getComponentIdentifier();
                if (componentIdentifier == null) {
                    componentIdentifier = "";
                }
                Tuples2 tuples2M3642to5 = Tuples4.m3642to("componentIdentifier", componentIdentifier);
                String entryPointIdentifier = data.getEntryPointIdentifier();
                Map mapMapOf = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, Tuples4.m3642to("entryPointIdentifier", entryPointIdentifier != null ? entryPointIdentifier : ""));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapMapOf.entrySet()) {
                    if (((String) entry.getValue()).length() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Capture.Logger.logInfo$default(linkedHashMap, null, new Function0() { // from class: com.robinhood.shared.bitdrift.BitdriftCapture$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BitdriftCapture.Companion.logEvent$lambda$2(data);
                    }
                }, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String logEvent$lambda$2(UserInteractionEvent userInteractionEvent) {
            return "Goku - " + userInteractionEvent.getEventType();
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public void setEnabled(Context applicationContext, boolean enabled) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            if (enabled) {
                isEnabled.set(true);
                initialize(applicationContext);
            } else {
                isEnabled.set(false);
            }
        }

        @Override // com.robinhood.shared.bitdrift.BitdriftCapture
        public String getSessionUrl() {
            if (isEnabled.get() && initialized.get()) {
                return Capture.Logger.getSessionUrl();
            }
            return null;
        }

        private final void onNewSessionStarted() {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            String sessionUrl = Capture.Logger.getSessionUrl();
            if (sessionUrl == null) {
                sessionUrl = ApiRenderablePlatforms.VERSIONS_NONE;
            }
            companion.setContext("bitdrift_capture_session", sessionUrl);
            Timber.Companion companion2 = Timber.INSTANCE;
            companion2.mo3356i("Bitdrift Session Url: " + Capture.Logger.getSessionUrl(), new Object[0]);
            companion2.mo3356i("Bitdrift Session ID: " + Capture.Logger.getSessionId(), new Object[0]);
        }
    }

    /* compiled from: BitdriftCapture.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/bitdrift/BitdriftCapture$UserInteractionEvent;", "", "eventType", "", "screenName", "screenIdentifier", "componentType", "componentIdentifier", "entryPointIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getScreenName", "getScreenIdentifier", "getComponentType", "getComponentIdentifier", "getEntryPointIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-bitdrift_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UserInteractionEvent {
        private final String componentIdentifier;
        private final String componentType;
        private final String entryPointIdentifier;
        private final String eventType;
        private final String screenIdentifier;
        private final String screenName;

        public static /* synthetic */ UserInteractionEvent copy$default(UserInteractionEvent userInteractionEvent, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInteractionEvent.eventType;
            }
            if ((i & 2) != 0) {
                str2 = userInteractionEvent.screenName;
            }
            if ((i & 4) != 0) {
                str3 = userInteractionEvent.screenIdentifier;
            }
            if ((i & 8) != 0) {
                str4 = userInteractionEvent.componentType;
            }
            if ((i & 16) != 0) {
                str5 = userInteractionEvent.componentIdentifier;
            }
            if ((i & 32) != 0) {
                str6 = userInteractionEvent.entryPointIdentifier;
            }
            String str7 = str5;
            String str8 = str6;
            return userInteractionEvent.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final String getComponentType() {
            return this.componentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getComponentIdentifier() {
            return this.componentIdentifier;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final UserInteractionEvent copy(String eventType, String screenName, String screenIdentifier, String componentType, String componentIdentifier, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return new UserInteractionEvent(eventType, screenName, screenIdentifier, componentType, componentIdentifier, entryPointIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInteractionEvent)) {
                return false;
            }
            UserInteractionEvent userInteractionEvent = (UserInteractionEvent) other;
            return Intrinsics.areEqual(this.eventType, userInteractionEvent.eventType) && Intrinsics.areEqual(this.screenName, userInteractionEvent.screenName) && Intrinsics.areEqual(this.screenIdentifier, userInteractionEvent.screenIdentifier) && Intrinsics.areEqual(this.componentType, userInteractionEvent.componentType) && Intrinsics.areEqual(this.componentIdentifier, userInteractionEvent.componentIdentifier) && Intrinsics.areEqual(this.entryPointIdentifier, userInteractionEvent.entryPointIdentifier);
        }

        public int hashCode() {
            int iHashCode = this.eventType.hashCode() * 31;
            String str = this.screenName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.screenIdentifier;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.componentType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.componentIdentifier;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.entryPointIdentifier;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "UserInteractionEvent(eventType=" + this.eventType + ", screenName=" + this.screenName + ", screenIdentifier=" + this.screenIdentifier + ", componentType=" + this.componentType + ", componentIdentifier=" + this.componentIdentifier + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
        }

        public UserInteractionEvent(String eventType, String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            this.eventType = eventType;
            this.screenName = str;
            this.screenIdentifier = str2;
            this.componentType = str3;
            this.componentIdentifier = str4;
            this.entryPointIdentifier = str5;
        }

        public final String getEventType() {
            return this.eventType;
        }

        public final String getScreenName() {
            return this.screenName;
        }

        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        public final String getComponentType() {
            return this.componentType;
        }

        public final String getComponentIdentifier() {
            return this.componentIdentifier;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }
    }
}
