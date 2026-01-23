package com.salesforce.android.smi.core.internal;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.salesforce.android.smi.common.internal.util.NetworkStateManager;
import com.salesforce.android.smi.common.internal.util.SingletonHolder;
import com.salesforce.android.smi.core.Configuration;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.core.internal.ServiceLocator;
import com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger;
import com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager;
import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import com.salesforce.android.smi.core.internal.data.repository.ConversationRepository;
import com.salesforce.android.smi.core.internal.data.repository.FileRepository;
import com.salesforce.android.smi.core.internal.util.ConversationEntryFactory;
import com.salesforce.android.smi.database.AuthorizationStore;
import com.salesforce.android.smi.database.ConversationEntryStore;
import com.salesforce.android.smi.database.ConversationStorage;
import com.salesforce.android.smi.database.ConversationStore;
import com.salesforce.android.smi.database.DeviceRegistrationStore;
import com.salesforce.android.smi.database.Storage;
import com.salesforce.android.smi.network.data.model.Install;
import com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService;
import com.salesforce.android.smi.remote.internal.api.config.RemoteConfigService;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ServiceLocator.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 h2\u00020\u0001:\u0001hB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u000f\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u000f\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u000f\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u000f\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u000f\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\u000f\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010\u000f\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\u000f\u001a\u0004\be\u0010f¨\u0006i"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/ServiceLocator;", "", "Lkotlin/Pair;", "Landroid/content/Context;", "Lcom/salesforce/android/smi/core/Configuration;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "<init>", "(Lkotlin/Pair;)V", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "coreConfig", "Lcom/salesforce/android/smi/core/Configuration;", "Lcom/salesforce/android/smi/network/data/model/Install;", "install$delegate", "Lkotlin/Lazy;", "getInstall", "()Lcom/salesforce/android/smi/network/data/model/Install;", "install", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "coreEventFlow$delegate", "getCoreEventFlow", "()Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "coreEventFlow", "Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "conversationEntryFactory$delegate", "getConversationEntryFactory", "()Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "conversationEntryFactory", "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "readAcknowledger$delegate", "getReadAcknowledger", "()Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "readAcknowledger", "Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;", "networkStateManager$delegate", "getNetworkStateManager", "()Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;", "networkStateManager", "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "remoteConfigService$delegate", "getRemoteConfigService", "()Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "remoteConfigService", "Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "serverSentEventsManager$delegate", "getServerSentEventsManager", "()Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "serverSentEventsManager", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService$delegate", "getRestService", "()Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService$delegate", "getAuthorizationService", "()Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "Lcom/salesforce/android/smi/database/Storage;", "storage$delegate", "getStorage", "()Lcom/salesforce/android/smi/database/Storage;", PlaceTypes.STORAGE, "Lcom/salesforce/android/smi/database/ConversationStorage;", "conversationStorage$delegate", "getConversationStorage", "()Lcom/salesforce/android/smi/database/ConversationStorage;", "conversationStorage", "Lcom/salesforce/android/smi/database/AuthorizationStore;", "authorizationStore$delegate", "getAuthorizationStore", "()Lcom/salesforce/android/smi/database/AuthorizationStore;", "authorizationStore", "Lcom/salesforce/android/smi/database/DeviceRegistrationStore;", "deviceRegistrationStore$delegate", "getDeviceRegistrationStore", "()Lcom/salesforce/android/smi/database/DeviceRegistrationStore;", "deviceRegistrationStore", "Lcom/salesforce/android/smi/database/ConversationEntryStore;", "conversationEntryStore$delegate", "getConversationEntryStore", "()Lcom/salesforce/android/smi/database/ConversationEntryStore;", "conversationEntryStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "conversationStore$delegate", "getConversationStore", "()Lcom/salesforce/android/smi/database/ConversationStore;", "conversationStore", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository$delegate", "getConversationRepository", "()Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository$delegate", "getConversationEntryRepository", "()Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "fileRepository$delegate", "getFileRepository", "()Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "fileRepository", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ServiceLocator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context appContext;

    /* renamed from: authorizationService$delegate, reason: from kotlin metadata */
    private final Lazy authorizationService;

    /* renamed from: authorizationStore$delegate, reason: from kotlin metadata */
    private final Lazy authorizationStore;

    /* renamed from: conversationEntryFactory$delegate, reason: from kotlin metadata */
    private final Lazy conversationEntryFactory;

    /* renamed from: conversationEntryRepository$delegate, reason: from kotlin metadata */
    private final Lazy conversationEntryRepository;

    /* renamed from: conversationEntryStore$delegate, reason: from kotlin metadata */
    private final Lazy conversationEntryStore;

    /* renamed from: conversationRepository$delegate, reason: from kotlin metadata */
    private final Lazy conversationRepository;

    /* renamed from: conversationStorage$delegate, reason: from kotlin metadata */
    private final Lazy conversationStorage;

    /* renamed from: conversationStore$delegate, reason: from kotlin metadata */
    private final Lazy conversationStore;
    private final Configuration coreConfig;

    /* renamed from: coreEventFlow$delegate, reason: from kotlin metadata */
    private final Lazy coreEventFlow;

    /* renamed from: deviceRegistrationStore$delegate, reason: from kotlin metadata */
    private final Lazy deviceRegistrationStore;

    /* renamed from: fileRepository$delegate, reason: from kotlin metadata */
    private final Lazy fileRepository;

    /* renamed from: install$delegate, reason: from kotlin metadata */
    private final Lazy install;

    /* renamed from: networkStateManager$delegate, reason: from kotlin metadata */
    private final Lazy networkStateManager;

    /* renamed from: readAcknowledger$delegate, reason: from kotlin metadata */
    private final Lazy readAcknowledger;

    /* renamed from: remoteConfigService$delegate, reason: from kotlin metadata */
    private final Lazy remoteConfigService;

    /* renamed from: restService$delegate, reason: from kotlin metadata */
    private final Lazy restService;

    /* renamed from: serverSentEventsManager$delegate, reason: from kotlin metadata */
    private final Lazy serverSentEventsManager;

    /* renamed from: storage$delegate, reason: from kotlin metadata */
    private final Lazy storage;

    public /* synthetic */ ServiceLocator(Tuples2 tuples2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tuples2);
    }

    private ServiceLocator(Tuples2<? extends Context, ? extends Configuration> tuples2) {
        this.appContext = tuples2.getFirst().getApplicationContext();
        this.coreConfig = tuples2.getSecond();
        this.install = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.install_delegate$lambda$0(this.f$0);
            }
        });
        this.coreEventFlow = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.coreEventFlow_delegate$lambda$1();
            }
        });
        this.conversationEntryFactory = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationEntryFactory_delegate$lambda$2();
            }
        });
        this.readAcknowledger = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.readAcknowledger_delegate$lambda$3(this.f$0);
            }
        });
        this.networkStateManager = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.networkStateManager_delegate$lambda$4(this.f$0);
            }
        });
        this.remoteConfigService = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.remoteConfigService_delegate$lambda$5(this.f$0);
            }
        });
        this.serverSentEventsManager = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.serverSentEventsManager_delegate$lambda$6(this.f$0);
            }
        });
        this.restService = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.restService_delegate$lambda$7(this.f$0);
            }
        });
        this.authorizationService = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.authorizationService_delegate$lambda$8(this.f$0);
            }
        });
        this.storage = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.storage_delegate$lambda$11(this.f$0);
            }
        });
        this.conversationStorage = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationStorage_delegate$lambda$12(this.f$0);
            }
        });
        this.authorizationStore = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.authorizationStore_delegate$lambda$13(this.f$0);
            }
        });
        this.deviceRegistrationStore = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.deviceRegistrationStore_delegate$lambda$14(this.f$0);
            }
        });
        this.conversationEntryStore = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationEntryStore_delegate$lambda$15(this.f$0);
            }
        });
        this.conversationStore = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationStore_delegate$lambda$16(this.f$0);
            }
        });
        this.conversationRepository = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationRepository_delegate$lambda$17(this.f$0);
            }
        });
        this.conversationEntryRepository = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.conversationEntryRepository_delegate$lambda$18(this.f$0);
            }
        });
        this.fileRepository = LazyKt.lazy(new Function0() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ServiceLocator.fileRepository_delegate$lambda$19(this.f$0);
            }
        });
    }

    private final Install getInstall() {
        return (Install) this.install.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Install install_delegate$lambda$0(ServiceLocator serviceLocator) {
        Install.Companion companion = Install.INSTANCE;
        Context appContext = serviceLocator.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return companion.getInstance(appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoreEventFlow coreEventFlow_delegate$lambda$1() {
        return CoreEventFlow.INSTANCE.getInstance(Unit.INSTANCE);
    }

    public final CoreEventFlow getCoreEventFlow() {
        return (CoreEventFlow) this.coreEventFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ConversationEntryFactory conversationEntryFactory_delegate$lambda$2() {
        return new ConversationEntryFactory(null, 1, 0 == true ? 1 : 0);
    }

    public final ConversationEntryFactory getConversationEntryFactory() {
        return (ConversationEntryFactory) this.conversationEntryFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadAcknowledger readAcknowledger_delegate$lambda$3(ServiceLocator serviceLocator) {
        return ReadAcknowledger.Companion.create$default(ReadAcknowledger.INSTANCE, serviceLocator.getConversationStore(), serviceLocator.getRestService(), null, 4, null);
    }

    public final ReadAcknowledger getReadAcknowledger() {
        return (ReadAcknowledger) this.readAcknowledger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkStateManager networkStateManager_delegate$lambda$4(ServiceLocator serviceLocator) {
        NetworkStateManager.Companion companion = NetworkStateManager.INSTANCE;
        Context appContext = serviceLocator.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return companion.getInstance(appContext);
    }

    public final NetworkStateManager getNetworkStateManager() {
        return (NetworkStateManager) this.networkStateManager.getValue();
    }

    public final RemoteConfigService getRemoteConfigService() {
        return (RemoteConfigService) this.remoteConfigService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteConfigService remoteConfigService_delegate$lambda$5(ServiceLocator serviceLocator) {
        return RemoteConfigService.INSTANCE.create(serviceLocator.coreConfig.getServiceAPI(), serviceLocator.coreConfig.getOrganizationId(), serviceLocator.coreConfig.getDeveloperName(), serviceLocator.coreConfig.getRemoteLocaleMap());
    }

    public final ServerSentEventsManager getServerSentEventsManager() {
        return (ServerSentEventsManager) this.serverSentEventsManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServerSentEventsManager serverSentEventsManager_delegate$lambda$6(ServiceLocator serviceLocator) {
        ServerSentEventsManager.Companion companion = ServerSentEventsManager.INSTANCE;
        Configuration configuration = serviceLocator.coreConfig;
        AuthorizationService authorizationService = serviceLocator.getAuthorizationService();
        return companion.create(configuration, authorizationService, serviceLocator.getRestService(), serviceLocator.getConversationRepository(), serviceLocator.getConversationEntryRepository(), serviceLocator.getCoreEventFlow(), (192 & 64) != 0 ? new ServerSentEventsService(configuration.getServiceAPI(), configuration.getOrganizationId(), authorizationService, 0, 8, null) : null, (192 & 128) != 0 ? Dispatchers.getIO() : null);
    }

    public final RestService getRestService() {
        return (RestService) this.restService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestService restService_delegate$lambda$7(ServiceLocator serviceLocator) {
        return RestService.Companion.create$default(RestService.INSTANCE, serviceLocator.coreConfig.getServiceAPI(), null, serviceLocator.coreConfig.getDeveloperName(), serviceLocator.getDeviceRegistrationStore(), serviceLocator.getConversationStore(), serviceLocator.getAuthorizationService(), serviceLocator.coreConfig.getRemoteLocaleMap(), null, 128, null);
    }

    public final AuthorizationService getAuthorizationService() {
        return (AuthorizationService) this.authorizationService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorizationService authorizationService_delegate$lambda$8(ServiceLocator serviceLocator) {
        return AuthorizationService.INSTANCE.create(serviceLocator.coreConfig.getServiceAPI(), serviceLocator.coreConfig.getOrganizationId(), serviceLocator.coreConfig.getDeveloperName(), serviceLocator.coreConfig.isUserVerificationRequired(), serviceLocator.getInstall(), serviceLocator.getAuthorizationStore());
    }

    private final Storage getStorage() {
        return (Storage) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Storage storage_delegate$lambda$11(final ServiceLocator serviceLocator) {
        Storage.Companion companion = Storage.INSTANCE;
        Context appContext = serviceLocator.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        Storage storageCreate = companion.create(appContext);
        storageCreate.onError(new Function2() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ServiceLocator.storage_delegate$lambda$11$lambda$10$lambda$9(this.f$0, (String) obj, (Exception) obj2);
            }
        });
        return storageCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit storage_delegate$lambda$11$lambda$10$lambda$9(ServiceLocator serviceLocator, String message, Exception exception) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        serviceLocator.getCoreEventFlow().sendEvent(new CoreEvent.Error(message, exception));
        return Unit.INSTANCE;
    }

    private final ConversationStorage getConversationStorage() {
        return (ConversationStorage) this.conversationStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationStorage conversationStorage_delegate$lambda$12(ServiceLocator serviceLocator) {
        return serviceLocator.getStorage().conversationStorage(serviceLocator.coreConfig.getOrganizationId(), serviceLocator.coreConfig.getDeveloperName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorizationStore authorizationStore_delegate$lambda$13(ServiceLocator serviceLocator) {
        return serviceLocator.getStorage().getAuthorizationStore();
    }

    private final AuthorizationStore getAuthorizationStore() {
        return (AuthorizationStore) this.authorizationStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceRegistrationStore deviceRegistrationStore_delegate$lambda$14(ServiceLocator serviceLocator) {
        return serviceLocator.getStorage().getDeviceRegistrationStore();
    }

    private final DeviceRegistrationStore getDeviceRegistrationStore() {
        return (DeviceRegistrationStore) this.deviceRegistrationStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationEntryStore conversationEntryStore_delegate$lambda$15(ServiceLocator serviceLocator) {
        return serviceLocator.getConversationStorage().getConversationEntryStore();
    }

    private final ConversationEntryStore getConversationEntryStore() {
        return (ConversationEntryStore) this.conversationEntryStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationStore conversationStore_delegate$lambda$16(ServiceLocator serviceLocator) {
        return serviceLocator.getConversationStorage().getConversationStore();
    }

    private final ConversationStore getConversationStore() {
        return (ConversationStore) this.conversationStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationRepository conversationRepository_delegate$lambda$17(ServiceLocator serviceLocator) {
        return ConversationRepository.Companion.create$default(ConversationRepository.INSTANCE, serviceLocator.getRestService(), serviceLocator.getConversationStore(), null, 4, null);
    }

    public final ConversationRepository getConversationRepository() {
        return (ConversationRepository) this.conversationRepository.getValue();
    }

    public final ConversationEntryRepository getConversationEntryRepository() {
        return (ConversationEntryRepository) this.conversationEntryRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationEntryRepository conversationEntryRepository_delegate$lambda$18(ServiceLocator serviceLocator) {
        return ConversationEntryRepository.Companion.create$default(ConversationEntryRepository.INSTANCE, serviceLocator.getRestService(), serviceLocator.getFileRepository(), serviceLocator.getConversationEntryStore(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileRepository fileRepository_delegate$lambda$19(ServiceLocator serviceLocator) {
        FileRepository.Companion companion = FileRepository.INSTANCE;
        Context appContext = serviceLocator.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return FileRepository.Companion.create$default(companion, appContext, serviceLocator.getRestService(), null, null, 12, null);
    }

    private final FileRepository getFileRepository() {
        return (FileRepository) this.fileRepository.getValue();
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/ServiceLocator$Companion;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/core/internal/ServiceLocator;", "Lkotlin/Pair;", "Landroid/content/Context;", "Lcom/salesforce/android/smi/core/Configuration;", "<init>", "()V", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends SingletonHolder<ServiceLocator, Tuples2<? extends Context, ? extends Configuration>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ServiceLocator.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.salesforce.android.smi.core.internal.ServiceLocator$Companion$1 */
        /* synthetic */ class C420781 extends FunctionReferenceImpl implements Function1<Tuples2<? extends Context, ? extends Configuration>, ServiceLocator> {
            public static final C420781 INSTANCE = new C420781();

            C420781() {
                super(1, ServiceLocator.class, "<init>", "<init>(Lkotlin/Pair;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ServiceLocator invoke(Tuples2<? extends Context, ? extends Configuration> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new ServiceLocator(p0, null);
            }
        }

        private Companion() {
            super(C420781.INSTANCE, new Function1() { // from class: com.salesforce.android.smi.core.internal.ServiceLocator$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ServiceLocator.Companion._init_$lambda$0((ServiceLocator) obj);
                }
            }, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(ServiceLocator it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DeviceRegistrationStore.INSTANCE.invalidateCache();
            return Unit.INSTANCE;
        }
    }
}
