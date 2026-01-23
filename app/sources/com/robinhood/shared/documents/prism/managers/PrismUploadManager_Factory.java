package com.robinhood.shared.documents.prism.managers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismUploadManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "documentRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismUploadManager_Factory implements Factory<PrismUploadManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<DeviceAttestationManager> deviceAttestationManager;
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<ExperimentsStore> experimentsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PrismUploadManager_Factory create(Provider<DocumentRequestStore> provider, Provider<DeviceAttestationManager> provider2, Provider<ExperimentsStore> provider3, Provider<CoroutineScope> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final PrismUploadManager newInstance(DocumentRequestStore documentRequestStore, DeviceAttestationManager deviceAttestationManager, ExperimentsStore experimentsStore, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(documentRequestStore, deviceAttestationManager, experimentsStore, coroutineScope);
    }

    public PrismUploadManager_Factory(Provider<DocumentRequestStore> documentRequestStore, Provider<DeviceAttestationManager> deviceAttestationManager, Provider<ExperimentsStore> experimentsStore, Provider<CoroutineScope> coroutineScope) {
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.documentRequestStore = documentRequestStore;
        this.deviceAttestationManager = deviceAttestationManager;
        this.experimentsStore = experimentsStore;
        this.coroutineScope = coroutineScope;
    }

    @Override // javax.inject.Provider
    public PrismUploadManager get() {
        Companion companion = INSTANCE;
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        DeviceAttestationManager deviceAttestationManager = this.deviceAttestationManager.get();
        Intrinsics.checkNotNullExpressionValue(deviceAttestationManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(documentRequestStore, deviceAttestationManager, experimentsStore, coroutineScope);
    }

    /* compiled from: PrismUploadManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager_Factory;", "documentRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PrismUploadManager_Factory create(Provider<DocumentRequestStore> documentRequestStore, Provider<DeviceAttestationManager> deviceAttestationManager, Provider<ExperimentsStore> experimentsStore, Provider<CoroutineScope> coroutineScope) {
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new PrismUploadManager_Factory(documentRequestStore, deviceAttestationManager, experimentsStore, coroutineScope);
        }

        @JvmStatic
        public final PrismUploadManager newInstance(DocumentRequestStore documentRequestStore, DeviceAttestationManager deviceAttestationManager, ExperimentsStore experimentsStore, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new PrismUploadManager(documentRequestStore, deviceAttestationManager, experimentsStore, coroutineScope);
        }
    }
}
