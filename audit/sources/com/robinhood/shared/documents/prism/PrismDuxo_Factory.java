package com.robinhood.shared.documents.prism;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.shared.documents.prism.managers.PrismPollManager;
import com.robinhood.shared.documents.prism.managers.PrismSensorManager;
import com.robinhood.shared.documents.prism.managers.PrismUploadManager;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationManager;
import com.robinhood.utils.ReleaseVersion;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/documents/prism/PrismDuxo;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "prismUploadManager", "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "prismSensorManager", "Lcom/robinhood/shared/documents/prism/managers/PrismSensorManager;", "prismPollManager", "Lcom/robinhood/shared/documents/prism/managers/PrismPollManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/documents/prism/PrismStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismDuxo_Factory implements Factory<PrismDuxo> {
    private final Provider<Context> context;
    private final Provider<DeviceAttestationManager> deviceAttestationManager;
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<PrismPollManager> prismPollManager;
    private final Provider<PrismSensorManager> prismSensorManager;
    private final Provider<PrismUploadManager> prismUploadManager;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PrismStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PrismDuxo_Factory create(Provider<Context> provider, Provider<DocumentRequestStore> provider2, Provider<PrismUploadManager> provider3, Provider<PrismSensorManager> provider4, Provider<PrismPollManager> provider5, Provider<ExperimentsStore> provider6, Provider<DeviceAttestationManager> provider7, Provider<EventLogger> provider8, Provider<ReleaseVersion> provider9, Provider<SavedStateHandle> provider10, Provider<PrismStateProvider> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final PrismDuxo newInstance(Context context, DocumentRequestStore documentRequestStore, PrismUploadManager prismUploadManager, PrismSensorManager prismSensorManager, PrismPollManager prismPollManager, ExperimentsStore experimentsStore, DeviceAttestationManager deviceAttestationManager, EventLogger eventLogger, ReleaseVersion releaseVersion, SavedStateHandle savedStateHandle, PrismStateProvider prismStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(context, documentRequestStore, prismUploadManager, prismSensorManager, prismPollManager, experimentsStore, deviceAttestationManager, eventLogger, releaseVersion, savedStateHandle, prismStateProvider, duxoBundle);
    }

    public PrismDuxo_Factory(Provider<Context> context, Provider<DocumentRequestStore> documentRequestStore, Provider<PrismUploadManager> prismUploadManager, Provider<PrismSensorManager> prismSensorManager, Provider<PrismPollManager> prismPollManager, Provider<ExperimentsStore> experimentsStore, Provider<DeviceAttestationManager> deviceAttestationManager, Provider<EventLogger> eventLogger, Provider<ReleaseVersion> releaseVersion, Provider<SavedStateHandle> savedStateHandle, Provider<PrismStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(prismUploadManager, "prismUploadManager");
        Intrinsics.checkNotNullParameter(prismSensorManager, "prismSensorManager");
        Intrinsics.checkNotNullParameter(prismPollManager, "prismPollManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.context = context;
        this.documentRequestStore = documentRequestStore;
        this.prismUploadManager = prismUploadManager;
        this.prismSensorManager = prismSensorManager;
        this.prismPollManager = prismPollManager;
        this.experimentsStore = experimentsStore;
        this.deviceAttestationManager = deviceAttestationManager;
        this.eventLogger = eventLogger;
        this.releaseVersion = releaseVersion;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PrismDuxo get() {
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        PrismUploadManager prismUploadManager = this.prismUploadManager.get();
        Intrinsics.checkNotNullExpressionValue(prismUploadManager, "get(...)");
        PrismSensorManager prismSensorManager = this.prismSensorManager.get();
        Intrinsics.checkNotNullExpressionValue(prismSensorManager, "get(...)");
        PrismPollManager prismPollManager = this.prismPollManager.get();
        Intrinsics.checkNotNullExpressionValue(prismPollManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DeviceAttestationManager deviceAttestationManager = this.deviceAttestationManager.get();
        Intrinsics.checkNotNullExpressionValue(deviceAttestationManager, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        PrismStateProvider prismStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(prismStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(context, documentRequestStore, prismUploadManager, prismSensorManager, prismPollManager, experimentsStore, deviceAttestationManager, eventLogger, releaseVersion, savedStateHandle, prismStateProvider, duxoBundle);
    }

    /* compiled from: PrismDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/documents/prism/PrismDuxo_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "prismUploadManager", "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "prismSensorManager", "Lcom/robinhood/shared/documents/prism/managers/PrismSensorManager;", "prismPollManager", "Lcom/robinhood/shared/documents/prism/managers/PrismPollManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/documents/prism/PrismStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/documents/prism/PrismDuxo;", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PrismDuxo_Factory create(Provider<Context> context, Provider<DocumentRequestStore> documentRequestStore, Provider<PrismUploadManager> prismUploadManager, Provider<PrismSensorManager> prismSensorManager, Provider<PrismPollManager> prismPollManager, Provider<ExperimentsStore> experimentsStore, Provider<DeviceAttestationManager> deviceAttestationManager, Provider<EventLogger> eventLogger, Provider<ReleaseVersion> releaseVersion, Provider<SavedStateHandle> savedStateHandle, Provider<PrismStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(prismUploadManager, "prismUploadManager");
            Intrinsics.checkNotNullParameter(prismSensorManager, "prismSensorManager");
            Intrinsics.checkNotNullParameter(prismPollManager, "prismPollManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PrismDuxo_Factory(context, documentRequestStore, prismUploadManager, prismSensorManager, prismPollManager, experimentsStore, deviceAttestationManager, eventLogger, releaseVersion, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final PrismDuxo newInstance(Context context, DocumentRequestStore documentRequestStore, PrismUploadManager prismUploadManager, PrismSensorManager prismSensorManager, PrismPollManager prismPollManager, ExperimentsStore experimentsStore, DeviceAttestationManager deviceAttestationManager, EventLogger eventLogger, ReleaseVersion releaseVersion, SavedStateHandle savedStateHandle, PrismStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(prismUploadManager, "prismUploadManager");
            Intrinsics.checkNotNullParameter(prismSensorManager, "prismSensorManager");
            Intrinsics.checkNotNullParameter(prismPollManager, "prismPollManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PrismDuxo(context, documentRequestStore, prismUploadManager, prismSensorManager, prismPollManager, experimentsStore, deviceAttestationManager, eventLogger, releaseVersion, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
