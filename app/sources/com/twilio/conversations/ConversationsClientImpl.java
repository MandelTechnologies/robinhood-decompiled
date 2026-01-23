package com.twilio.conversations;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.getkeepsafe.relinker.ReLinker;
import com.robinhood.utils.extensions.ResourceTypes;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.content.ContentClient;
import com.twilio.conversations.content.ContentClientExtensions;
import com.twilio.conversations.content.ContentClientFactory;
import com.twilio.conversations.content.ContentTemplate;
import com.twilio.conversations.extensions.MediaClientExtensions;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.internal.ConversationsClientListenerForwarder;
import com.twilio.conversations.internal.JSONObjectUtils;
import com.twilio.conversations.internal.StatusListenerForwarder;
import com.twilio.conversations.internal.Utils;
import com.twilio.conversations.media.MediaClient;
import com.twilio.conversations.media.mediaFactory;
import com.twilio.conversations.twilsock.TwilsockWrapper;
import com.twilio.twilsock.commands.CommandsConfig;
import com.twilio.twilsock.commands.CommandsConfig2;
import com.twilio.twilsock.commands.CommandsScheduler;
import com.twilio.util.ApplicationContextHolder;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
final class ConversationsClientImpl implements Disposable, ConversationsClient {
    private static final AtomicBoolean libraryIsLoaded = new AtomicBoolean(false);
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(ConversationsClientImpl.class));
    private StatusListenerForwarder appPushRegistrationStatusListener;
    private CommandsScheduler commandsScheduler;
    private ContentClient contentClient;
    private Context context;
    private String identity;
    private LifecycleListener lifecycleListener;
    private LifecycleListener2 lifecycleListener2;
    private ConversationsClientListenerForwarder listenerForwarder;
    private MediaClient mediaClient;
    private long nativeHandle;
    private ConversationsClient.Properties properties;
    private StatusListener pushRegistrationStatusListener;
    private final CoroutineScope coroutineScope = new CoroutineScope() { // from class: com.twilio.conversations.ConversationsClientImpl.1
        @Override // kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return Dispatchers.getDefault().plus(Supervisor3.SupervisorJob(null));
        }
    };
    private boolean isDisposed = false;
    private boolean wasBackgrounded = false;

    private native long nativeCreate(ConversationsClientListener conversationsClientListener, Object obj, StatusListener statusListener, String str, ClientMetadata clientMetadata, Object obj2, String str2);

    private native void nativeDispose();

    private native Conversations nativeGetChannels();

    private native MediaSettings nativeGetMediaSettings();

    private native TwilsockWrapper nativeGetTwilsockWrapper();

    private native Users nativeGetUsers();

    private native void nativeHandleNotification(long j, String str);

    private native void nativeRegisterToken(long j, String str, boolean z);

    private static native void nativeSetLogLevel(int i);

    private native void nativeShutdown(long j);

    private native void nativeSynchronizeConversations(long j);

    private native void nativeUnregisterToken(long j, String str, boolean z);

    private native void nativeUpdateToken(String str, long j, StatusListener statusListener);

    /* JADX INFO: Access modifiers changed from: private */
    public native void reconnect(long j);

    private native void simulateCrash(int i);

    @Override // com.twilio.conversations.ConversationsClient
    public native ConversationsClient.ConnectionState getConnectionState();

    @Override // com.twilio.conversations.ConversationsClient
    public native String getMyIdentity();

    @Override // com.twilio.conversations.ConversationsClient
    public native boolean isReachabilityEnabled();

    private final class LifecycleListener implements Application.ActivityLifecycleCallbacks {
        private Application application;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        LifecycleListener(Application application) {
            this.application = application;
            application.registerActivityLifecycleCallbacks(this);
            ConversationsClientImpl.logger.m3188d("Subscribed to ActivityLifecycleCallbacks");
        }

        void unregister() {
            this.application.unregisterActivityLifecycleCallbacks(this);
            this.application = null;
            ConversationsClientImpl.logger.m3188d("Unsubscribed from ActivityLifecycleCallbacks");
        }

        private void checkForegrounded() {
            if (!ConversationsClientImpl.this.wasBackgrounded || ConversationsClientImpl.this.isDisposed) {
                return;
            }
            ConversationsClientImpl.logger.m3188d("Application foregrounded");
            ConversationsClientImpl.this.wasBackgrounded = false;
            ConversationsClientImpl conversationsClientImpl = ConversationsClientImpl.this;
            conversationsClientImpl.reconnect(conversationsClientImpl.nativeHandle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            checkForegrounded();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            checkForegrounded();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            checkForegrounded();
        }
    }

    private final class LifecycleListener2 implements ComponentCallbacks2 {
        private Application application;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        LifecycleListener2(Application application) {
            this.application = application;
            application.registerComponentCallbacks(this);
            ConversationsClientImpl.logger.m3188d("Subscribed to ComponentCallbacks2");
        }

        void unregister() {
            this.application.unregisterComponentCallbacks(this);
            this.application = null;
            ConversationsClientImpl.logger.m3188d("Unsubscribed from ComponentCallbacks2");
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i == 20) {
                ConversationsClientImpl.this.wasBackgrounded = true;
                ConversationsClientImpl.logger.m3188d("Application backgrounded");
            }
        }
    }

    private static synchronized void loadNativeLibraries(Context context) {
        if (!libraryIsLoaded.getAndSet(true)) {
            ReLinker.loadLibrary(context.getApplicationContext(), "twilio-convo-native");
        }
    }

    public static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private static void dumpSdkVersion() {
        logger.info("Twilio Conversations SDK version " + getSdkVersion());
    }

    public static void create(Context context, String str, ConversationsClient.Properties properties, CallbackListener<ConversationsClient> callbackListener) {
        if (callbackListener == null) {
            throw new IllegalStateException("Listener cannot be null in ConversationsClient constructor");
        }
        ApplicationContextHolder.setApplicationContext(context.getApplicationContext());
        new ConversationsClientImpl(context, str, properties, callbackListener);
    }

    private StringBuilder fallbackCopy(Context context) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("rootcert", ResourceTypes.RAW, context.getPackageName()));
        StringBuilder sb = new StringBuilder();
        try {
            char[] cArr = new char[4096];
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, "UTF-8");
            while (true) {
                int i = inputStreamReader.read(cArr, 0, 4096);
                if (i < 0) {
                    return sb;
                }
                sb.append(cArr, 0, i);
            }
        } finally {
            inputStreamOpenRawResource.close();
        }
    }

    private String readCertificateStore(Context context, ConversationsClient.Properties properties) throws Resources.NotFoundException, NoSuchAlgorithmException, KeyStoreException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (properties.getDeferCA()) {
            z = true;
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                trustManagerFactory.init((KeyStore) null);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    if (x509TrustManager != null) {
                        arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
                    }
                }
                z = false;
            } catch (KeyStoreException | NoSuchAlgorithmException unused) {
            }
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (arrayList.size() == 0 || z || !properties.getDeferCA()) {
                sb = fallbackCopy(context);
            } else {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append("\n-----BEGIN CERTIFICATE-----\n" + Base64.encodeToString(((X509Certificate) it.next()).getEncoded(), 0) + "-----END CERTIFICATE-----\n");
                    }
                } catch (CertificateEncodingException e) {
                    logger.m3192e("SSL CA store error - fallback to default", e);
                    sb = fallbackCopy(context);
                }
            }
        } catch (IOException unused2) {
            logger.m3191e("Unable to install SSL certificate - connections will fail");
        }
        return sb.toString();
    }

    private ConversationsClientImpl(Context context, final String str, ConversationsClient.Properties properties, final CallbackListener<ConversationsClient> callbackListener) throws Resources.NotFoundException, NoSuchAlgorithmException, KeyStoreException {
        if (context == null) {
            throw new IllegalStateException("Context cannot be null in ConversationsClient constructor");
        }
        if (str == null) {
            throw new IllegalStateException("Token cannot be null in ConversationsClient constructor");
        }
        if (properties == null) {
            throw new IllegalStateException("Properties cannot be null in ConversationsClient constructor");
        }
        if (callbackListener == null) {
            throw new IllegalStateException("Listener cannot be null in ConversationsClient constructor");
        }
        loadNativeLibraries(context);
        dumpSdkVersion();
        nativeSetLogLevel(TwilioLogger.getLogLevel());
        Application application = (Application) context.getApplicationContext();
        this.lifecycleListener = new LifecycleListener(application);
        this.lifecycleListener2 = new LifecycleListener2(application);
        this.listenerForwarder = new ConversationsClientListenerForwarder();
        this.properties = properties;
        this.context = context;
        this.pushRegistrationStatusListener = new StatusListener() { // from class: com.twilio.conversations.ConversationsClientImpl.2
            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                if (ConversationsClientImpl.this.appPushRegistrationStatusListener != null) {
                    ConversationsClientImpl.this.appPushRegistrationStatusListener.onError(errorInfo);
                }
            }

            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                if (ConversationsClientImpl.this.appPushRegistrationStatusListener != null) {
                    ConversationsClientImpl.this.appPushRegistrationStatusListener.onSuccess();
                }
            }
        };
        final String certificateStore = readCertificateStore(context, properties);
        ClientMetadata clientMetadata = new ClientMetadata();
        clientMetadata.f6480os = "Android";
        clientMetadata.osv = Build.VERSION.RELEASE;
        clientMetadata.osa = System.getProperty("os.arch");
        clientMetadata.f10600dev = Utils.getDeviceName();
        clientMetadata.devv = Utils.getDeviceManufacturer();
        clientMetadata.devt = Utils.getDeviceType();
        clientMetadata.app = Utils.getAppName(context);
        clientMetadata.appv = Utils.getAppVersion(context);
        clientMetadata.sdk = "Android";
        clientMetadata.sdkv = BuildConfig.VERSION_NAME;
        if (properties instanceof PropertiesImpl) {
            PropertiesImpl propertiesImpl = (PropertiesImpl) properties;
            clientMetadata.env = propertiesImpl._sysPropGet("env");
            clientMetadata.envv = propertiesImpl._sysPropGet("envv");
            clientMetadata.app = propertiesImpl._sysPropGet("app");
            clientMetadata.appv = propertiesImpl._sysPropGet("appv");
        }
        TwilioLogger twilioLogger = logger;
        twilioLogger.m3188d("BOARD " + Build.BOARD);
        twilioLogger.m3188d("BRAND " + Build.BRAND);
        twilioLogger.m3188d("DEVICE " + Build.DEVICE);
        twilioLogger.m3188d("DISPLAY " + Build.DISPLAY);
        twilioLogger.m3188d("FINGERPRINT " + Build.FINGERPRINT);
        twilioLogger.m3188d("HARDWARE " + Build.HARDWARE);
        twilioLogger.m3188d("MANUFACTURER " + Build.MANUFACTURER);
        twilioLogger.m3188d("MODEL " + Build.MODEL);
        twilioLogger.m3188d("PRODUCT " + Build.PRODUCT);
        this.nativeHandle = nativeCreate(this.listenerForwarder, new CallbackListenerForwarder(new CallbackListener<ConversationsClient>() { // from class: com.twilio.conversations.ConversationsClientImpl.3
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(ConversationsClient conversationsClient) {
                ConversationsClientImpl.this.initCommandsScheduler();
                ConversationsClientImpl.this.initContentClient();
                ConversationsClientImpl.this.initMediaClient(str, certificateStore);
                callbackListener.onSuccess(conversationsClient);
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                ConversationsClientImpl.logger.m3201w("Failed to initialize ConversationsClient: " + errorInfo);
                ConversationsClientImpl.this.shutdown();
                callbackListener.onError(errorInfo);
            }
        }), this.pushRegistrationStatusListener, str, clientMetadata, properties, certificateStore);
        twilioLogger.m3188d("constructed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initCommandsScheduler() {
        CommandsConfig commandsConfigNewCommandsConfig = CommandsConfig2.newCommandsConfig();
        this.commandsScheduler = new CommandsScheduler(this.coroutineScope, nativeGetTwilsockWrapper().getTwilsock(), commandsConfigNewCommandsConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initContentClient() {
        this.contentClient = ContentClientFactory.createContentClient(this.coroutineScope, this.commandsScheduler, String.format("https://aim.%s.twilio.com/Client/v2/ContentTemplates", this.properties.getRegion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMediaClient(String str, String str2) {
        MediaSettings mediaSettingsNativeGetMediaSettings = nativeGetMediaSettings();
        this.mediaClient = mediaFactory.createMediaClient(mediaSettingsNativeGetMediaSettings.serviceUrl, mediaSettingsNativeGetMediaSettings.mediaSetUrl, mediaSettingsNativeGetMediaSettings.productId, str, str2, mediaSettingsNativeGetMediaSettings.activeUploadsLimit, mediaSettingsNativeGetMediaSettings.loadTimeoutMs, this.properties.useProxy());
    }

    private static class MediaSettings {
        final int activeUploadsLimit;
        final int loadTimeoutMs;
        final String mediaSetUrl;
        final String productId;
        final String serviceUrl;

        MediaSettings(String str, String str2, String str3, int i, int i2) {
            this.serviceUrl = str;
            this.mediaSetUrl = str2;
            this.productId = str3;
            this.loadTimeoutMs = i;
            this.activeUploadsLimit = i2;
        }
    }

    private static class ClientMetadata {
        public String app;
        public String appv;

        /* renamed from: dev, reason: collision with root package name */
        public String f10600dev;
        public String devt;
        public String devv;
        public String env;
        public String envv;

        /* renamed from: os */
        public String f6480os;
        public String osa;
        public String osv;
        public String sdk;
        public String sdkv;

        private ClientMetadata() {
        }

        public String getEnv() {
            return this.env;
        }

        public String getEnvv() {
            return this.envv;
        }

        public String getOs() {
            return this.f6480os;
        }

        public String getOsv() {
            return this.osv;
        }

        public String getOsa() {
            return this.osa;
        }

        public String getDev() {
            return this.f10600dev;
        }

        public String getDevv() {
            return this.devv;
        }

        public String getDevt() {
            return this.devt;
        }

        public String getApp() {
            return this.app;
        }

        public String getAppv() {
            return this.appv;
        }

        public String getSdk() {
            return this.sdk;
        }

        public String getSdkv() {
            return this.sdkv;
        }
    }

    @Override // com.twilio.conversations.ConversationsClient
    public ConversationsClient.Properties getProperties() {
        return this.properties;
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void updateToken(final String str, StatusListener statusListener) {
        checkDisposed("updateToken");
        if (str != null) {
            synchronized (this) {
                logger.m3188d("Calling update Token");
                nativeUpdateToken(str, this.nativeHandle, new StatusListenerForwarder(statusListener) { // from class: com.twilio.conversations.ConversationsClientImpl.4
                    @Override // com.twilio.conversations.internal.StatusListenerForwarder, com.twilio.conversations.StatusListener
                    public void onSuccess() {
                        ConversationsClientImpl.this.mediaClient.updateToken(str);
                        super.onSuccess();
                    }
                });
            }
        }
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void synchronizeConversations() {
        checkDisposed("synchronizeConversations");
        nativeSynchronizeConversations(this.nativeHandle);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void shutdown() {
        logger.m3188d("shutdown");
        checkDisposed("shutdown");
        synchronized (this) {
            this.lifecycleListener.unregister();
            this.lifecycleListener = null;
            this.lifecycleListener2.unregister();
            this.lifecycleListener2 = null;
            nativeShutdown(this.nativeHandle);
            CoroutineScope2.cancel(this.coroutineScope, null);
            dispose();
        }
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void addListener(ConversationsClientListener conversationsClientListener) {
        this.listenerForwarder.addListener(conversationsClientListener);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void removeListener(ConversationsClientListener conversationsClientListener) {
        this.listenerForwarder.removeListener(conversationsClientListener);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void removeAllListeners() {
        this.listenerForwarder.removeAllListeners();
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void registerFCMToken(ConversationsClient.FCMToken fCMToken, StatusListener statusListener) {
        checkDisposed("registerFCMToken");
        this.appPushRegistrationStatusListener = new StatusListenerForwarder(statusListener);
        nativeRegisterToken(this.nativeHandle, fCMToken.getToken(), true);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void unregisterFCMToken(ConversationsClient.FCMToken fCMToken, StatusListener statusListener) {
        checkDisposed("unregisterFCMToken");
        this.appPushRegistrationStatusListener = new StatusListenerForwarder(statusListener);
        nativeUnregisterToken(this.nativeHandle, fCMToken.getToken(), true);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void handleNotification(NotificationPayload notificationPayload) {
        checkDisposed("handleNotification");
        JSONObject jSONObject = new JSONObject();
        for (String str : notificationPayload.payload.keySet()) {
            try {
                jSONObject.put(str, JSONObjectUtils.wrap(notificationPayload.payload.get(str)));
            } catch (JSONException unused) {
            }
        }
        nativeHandleNotification(this.nativeHandle, jSONObject.toString());
    }

    private Users getUsers() {
        Users usersNativeGetUsers = nativeGetUsers();
        if (usersNativeGetUsers != null) {
            return usersNativeGetUsers;
        }
        throw new IllegalStateException("Client is not synchronized properly, internal Users object is null.");
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void getAndSubscribeUser(String str, CallbackListener<User> callbackListener) {
        checkDisposed("getAndSubscribeUser");
        getUsers().nativeGetAndSubscribeUser(str, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.ConversationsClient
    public List<User> getSubscribedUsers() {
        return getUsers().getSubscribedUsers();
    }

    @Override // com.twilio.conversations.ConversationsClient
    public User getMyUser() {
        return getUsers().getMyUser();
    }

    private Conversations getConversations() {
        Conversations conversationsNativeGetChannels = nativeGetChannels();
        if (conversationsNativeGetChannels != null) {
            return conversationsNativeGetChannels;
        }
        throw new IllegalStateException("Client is not synchronized properly, internal Conversations object is null.");
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void createConversation(String str, CallbackListener<Conversation> callbackListener) {
        getConversations().nativeCreateConversation(str, null, null, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.ConversationsClient
    public ConversationsClient.ConversationBuilder conversationBuilder() {
        checkDisposed("conversationBuilder");
        return new ConversationBuilderImpl(getConversations());
    }

    @Override // com.twilio.conversations.ConversationsClient
    public void getConversation(String str, CallbackListener<Conversation> callbackListener) {
        checkDisposed("getConversation");
        getConversations().nativeGetConversation(str, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.ConversationsClient
    public List<Conversation> getMyConversations() {
        return getConversations().nativeGetMyConversations();
    }

    @Override // com.twilio.conversations.ConversationsClient
    public CancellationToken getTemporaryContentUrlsForMedia(List<Media> list, CallbackListener<Map<String, String>> callbackListener) {
        return MediaClientExtensions.getTemporaryContentUrlsForMedia(this.mediaClient, this.coroutineScope, list, callbackListener);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public CancellationToken getTemporaryContentUrlsForMediaSids(List<String> list, CallbackListener<Map<String, String>> callbackListener) {
        return MediaClientExtensions.getTemporaryContentUrlsForMediaSids(this.mediaClient, this.coroutineScope, list, callbackListener);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public CancellationToken getContentTemplates(CallbackListener<List<ContentTemplate>> callbackListener) {
        return ContentClientExtensions.getContentTemplates(this.contentClient, this.coroutineScope, callbackListener);
    }

    @Override // com.twilio.conversations.ConversationsClient
    public List<Participant> getParticipantsByIdentity(String str) {
        return getConversations().nativeGetMembersByIdentity(str);
    }

    CommandsScheduler getCommandsScheduler() {
        return this.commandsScheduler;
    }

    MediaClient getMediaClient() {
        return this.mediaClient;
    }

    CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // com.twilio.conversations.Disposable
    public void dispose() {
        synchronized (this) {
            try {
                checkDisposed("dispose");
                if (!this.isDisposed) {
                    nativeDispose();
                }
                this.nativeHandle = 0L;
                this.isDisposed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void checkDisposed(String str) {
        if (this.isDisposed) {
            logger.m3191e("Attempt to use disposed object in ConversationsClient#" + str);
        }
    }

    public static void setLogLevel(int i) {
        TwilioLogger.setLogLevel(i);
    }

    class ConversationBuilderImpl implements ConversationsClient.ConversationBuilder {
        Attributes attributes;
        private Conversations backref;
        private String friendlyName;
        private String uniqueName;

        private ConversationBuilderImpl(Conversations conversations) {
            this.friendlyName = null;
            this.uniqueName = null;
            this.attributes = Attributes.DEFAULT;
            this.backref = conversations;
        }

        @Override // com.twilio.conversations.ConversationsClient.ConversationBuilder
        public ConversationsClient.ConversationBuilder withFriendlyName(String str) {
            this.friendlyName = str;
            return this;
        }

        @Override // com.twilio.conversations.ConversationsClient.ConversationBuilder
        public ConversationsClient.ConversationBuilder withUniqueName(String str) {
            this.uniqueName = str;
            return this;
        }

        @Override // com.twilio.conversations.ConversationsClient.ConversationBuilder
        public ConversationsClient.ConversationBuilder withAttributes(Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        @Override // com.twilio.conversations.ConversationsClient.ConversationBuilder
        public void build(CallbackListener<Conversation> callbackListener) {
            this.backref.nativeCreateConversation(this.friendlyName, this.uniqueName, this.attributes.toString(), new CallbackListenerForwarder(callbackListener));
        }
    }

    public static class PropertiesImpl implements ConversationsClient.Properties {
        private final int commandTimeout;
        private final boolean deferCA;
        private final String region;
        private final boolean synchronizeOnStartup;
        private final Map<String, String> sysProps;
        private final boolean useProxy;

        protected PropertiesImpl(String str, boolean z, boolean z2, int i, boolean z3, Map<String, String> map) {
            this.region = str;
            this.useProxy = z;
            this.deferCA = z2;
            this.commandTimeout = i;
            this.synchronizeOnStartup = z3;
            this.sysProps = map;
        }

        @Override // com.twilio.conversations.ConversationsClient.Properties
        public String getRegion() {
            return this.region;
        }

        @Override // com.twilio.conversations.ConversationsClient.Properties
        public boolean useProxy() {
            return this.useProxy;
        }

        @Override // com.twilio.conversations.ConversationsClient.Properties
        public boolean getDeferCA() {
            return this.deferCA;
        }

        @Override // com.twilio.conversations.ConversationsClient.Properties
        public int getCommandTimeout() {
            return this.commandTimeout;
        }

        @Override // com.twilio.conversations.ConversationsClient.Properties
        public boolean getSynchronizeOnStartup() {
            return this.synchronizeOnStartup;
        }

        public String _sysPropGet(String str) {
            return this.sysProps.get(str);
        }

        public static class BuilderImpl implements ConversationsClient.Properties.Builder {
            private boolean deferCA;
            private boolean useProxy;
            private int commandTimeout = 10000;
            private boolean synchronizeOnStartup = true;
            private String region = "us1";
            private Map<String, String> sysProps = new HashMap();

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties.Builder setRegion(String str) {
                this.region = str;
                return this;
            }

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties.Builder setUseProxy(boolean z) {
                this.useProxy = z;
                return this;
            }

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties.Builder setDeferCertificateTrustToPlatform(boolean z) {
                this.deferCA = z;
                return this;
            }

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties.Builder setCommandTimeout(int i) {
                if (i < 10000) {
                    throw new IllegalArgumentException("Command timeout must be greater than or equal to 10000");
                }
                this.commandTimeout = i;
                return this;
            }

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties.Builder setSynchronizeOnStartup(boolean z) {
                this.synchronizeOnStartup = z;
                return this;
            }

            public void _sysPropSet(String str, String str2) {
                this.sysProps.put(str, str2);
            }

            @Override // com.twilio.conversations.ConversationsClient.Properties.Builder
            public ConversationsClient.Properties createProperties() {
                return new PropertiesImpl(this.region, this.useProxy, this.deferCA, this.commandTimeout, this.synchronizeOnStartup, this.sysProps);
            }
        }
    }
}
