package microgram.android.inject;

import android.content.Context;
import com.robinhood.android.tracing.RhTrace;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.hammer.android.internal.LifecycleCoroutineScope;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.ReleaseVersion;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.serialization.json.Json;
import microgram.RuntimeInfo;
import microgram.android.HostMessageDispatcher;
import microgram.android.MicrogramSource;
import microgram.android.Monitoring3;
import microgram.android.Monitoring5;
import microgram.android.debug.DebugSettingsProvider;
import microgram.android.extension.BuildServiceExtensionMap;
import microgram.android.extension.ServiceExtension;
import microgram.android.internal.HostPlatformMessageTunnel;
import microgram.android.internal.HostReceiveMessageHandler;
import microgram.android.internal.HostReceiveMessageHandler3;
import microgram.android.internal.RuntimeInfo4;
import microgram.android.internal.bundle.PackageInitializer;
import microgram.android.internal.bundle.PackageInitializer4;
import microgram.android.internal.guest.GuestRuntime;
import microgram.android.internal.guest.ResourceLoader;
import microgram.android.internal.guest.webview.MicrogramWebViewClient;
import microgram.android.internal.guest.webview.WebViewGuestRuntime;
import microgram.android.service.ServiceLocator;
import microgram.android.service.ServiceLocator2;
import microgram.generator.IdGenerator;

/* compiled from: MicrogramRuntimeModule.kt */
@Metadata(m3635d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%J)\u0010-\u001a\u00020,2\b\b\u0001\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b-\u0010.J\u001d\u00103\u001a\u0002022\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020:2\f\u00101\u001a\b\u0012\u0004\u0012\u0002070/H\u0007¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020>2\f\u00101\u001a\b\u0012\u0004\u0012\u00020=0/H\u0007¢\u0006\u0004\b?\u0010@J|\u0010O\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020J0H¢\u0006\u0002\bK2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\b\b\u0001\u0010G\u001a\u00020F2\u001f\b\u0001\u0010L\u001a\u0019\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H¢\u0006\u0002\bK2\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020M0H¢\u0006\u0002\bKH\u0007¢\u0006\u0004\bO\u0010PJ\u001d\u0010R\u001a\u00020D2\f\u00101\u001a\b\u0012\u0004\u0012\u00020Q0/H\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule;", "", "<init>", "()V", "Lmicrogram/android/MicrogramSource;", "source", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "localeConfiguration", "Lmicrogram/android/debug/DebugSettingsProvider;", "debugSettingsProvider", "Lmicrogram/RuntimeInfo;", "provideRuntimeInfo", "(Lmicrogram/android/MicrogramSource;Lcom/robinhood/utils/ReleaseVersion;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;Lmicrogram/android/debug/DebugSettingsProvider;)Lmicrogram/RuntimeInfo;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "provideCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/CoroutineScope;", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "provideUuidGenerator", "()Lmicrogram/generator/IdGenerator;", "uuidGenerator", "", "provideStringIdGenerator", "(Lmicrogram/generator/IdGenerator;)Lmicrogram/generator/IdGenerator;", "Lmicrogram/android/internal/guest/ResourceLoader$Factory;", "factory", "Lmicrogram/android/internal/guest/ResourceLoader;", "provideResourceLoader", "(Lmicrogram/android/internal/guest/ResourceLoader$Factory;Lmicrogram/android/MicrogramSource;)Lmicrogram/android/internal/guest/ResourceLoader;", "Landroid/content/Context;", "context", "Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;", "client", "Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "provideGuestRuntimeFactory", "(Landroid/content/Context;Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;Lcom/robinhood/android/tracing/TrackTrace;)Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "Ldagger/Lazy;", "Lmicrogram/android/internal/RealHostReceiveMessageHandler;", "lazy", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "provideReceiveMessageHandler", "(Ldagger/Lazy;)Lmicrogram/android/internal/HostReceiveMessageHandler;", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "tunnel", "Lmicrogram/android/RealMonitor;", "provideRealMonitor", "(Lmicrogram/android/internal/HostPlatformMessageTunnel;Lcom/robinhood/android/tracing/TrackTrace;)Lmicrogram/android/RealMonitor;", "Lmicrogram/android/MonitorListener;", "provideMonitorListener", "(Ldagger/Lazy;)Lmicrogram/android/MonitorListener;", "Lmicrogram/android/internal/bundle/RealPackageInitializer;", "Lmicrogram/android/internal/bundle/PackageInitializer;", "providePackageInitializer", "(Ldagger/Lazy;)Lmicrogram/android/internal/bundle/PackageInitializer;", "coroutineScope", "Lmicrogram/android/HostMessageDispatcher;", "messageDispatcher", "Lmicrogram/android/service/ServiceLocator;", "serviceLocator", "Lkotlinx/serialization/json/Json;", "json", "", "Ljavax/inject/Provider;", "Lmicrogram/android/extension/ServiceExtension;", "Lkotlin/jvm/JvmSuppressWildcards;", "compileTimeExtensions", "Lmicrogram/android/extension/ServiceExtension$Factory;", "runtimeExtensions", "provideServiceExtensions", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/android/service/ServiceLocator;Lkotlinx/serialization/json/Json;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "Lmicrogram/android/service/RealServiceLocator;", "provideServiceLocator", "(Ldagger/Lazy;)Lmicrogram/android/service/ServiceLocator;", "provideTrackTrace", "(Lmicrogram/android/MicrogramSource;)Lcom/robinhood/android/tracing/TrackTrace;", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule {
    public static final MicrogramRuntimeModule INSTANCE = new MicrogramRuntimeModule();
    private static final AtomicInteger counter = new AtomicInteger();

    /* compiled from: MicrogramRuntimeModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MicrogramRuntimeModule() {
    }

    public final RuntimeInfo provideRuntimeInfo(MicrogramSource source, ReleaseVersion releaseVersion, TargetBackend targetBackend, AppType appType, LocaleConfiguration localeConfiguration, DebugSettingsProvider debugSettingsProvider) {
        RuntimeInfo.AppType appType2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        Intrinsics.checkNotNullParameter(debugSettingsProvider, "debugSettingsProvider");
        RuntimeInfo.Platform platform = RuntimeInfo.Platform.ANDROID;
        String versionName = releaseVersion.getVersionName();
        String strValueOf = String.valueOf(releaseVersion.getVersionCode());
        RuntimeInfo.ApiEnvironment apiEnvironment = RuntimeInfo4.getApiEnvironment(targetBackend.getId());
        String apolloNamespace = targetBackend.getEndpoint().getApolloNamespace();
        RuntimeInfo.ReleaseVariant release_variant = ReleaseVariant2.getRELEASE_VARIANT();
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            appType2 = RuntimeInfo.AppType.TRADER;
        } else if (i == 2) {
            appType2 = RuntimeInfo.AppType.RHC;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appType2 = RuntimeInfo.AppType.NCW;
        }
        RuntimeInfo.AppType appType3 = appType2;
        List<Locale> listPreferredLocales = localeConfiguration.preferredLocales(Locale.Category.DISPLAY);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPreferredLocales, 10));
        Iterator<T> it = listPreferredLocales.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        List<Locale> listPreferredLocales2 = localeConfiguration.preferredLocales(Locale.Category.FORMAT);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPreferredLocales2, 10));
        Iterator<T> it2 = listPreferredLocales2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Locale) it2.next()).toLanguageTag());
        }
        Object objFirst = CollectionsKt.first((List<? extends Object>) arrayList2);
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        return new RuntimeInfo(platform, versionName, strValueOf, apiEnvironment, apolloNamespace, release_variant, appType3, arrayList, (String) objFirst, debugSettingsProvider.shouldApplicationBeStartedFromDebugger(source.getIdentifier()));
    }

    public final CoroutineScope provideCoroutineScope(@LifecycleCoroutineScope CoroutineScope scope, @DefaultDispatcher CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return CoroutineScope2.plus(scope, dispatcher);
    }

    public final IdGenerator<UUID> provideUuidGenerator() {
        return new IdGenerator() { // from class: microgram.android.inject.MicrogramRuntimeModule.provideUuidGenerator.1
            @Override // microgram.generator.IdGenerator
            public final UUID next() {
                return UUID.randomUUID();
            }
        };
    }

    public final IdGenerator<String> provideStringIdGenerator(final IdGenerator<UUID> uuidGenerator) {
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        return new IdGenerator() { // from class: microgram.android.inject.MicrogramRuntimeModule.provideStringIdGenerator.1
            @Override // microgram.generator.IdGenerator
            public final String next() {
                return uuidGenerator.next().toString();
            }
        };
    }

    public final ResourceLoader provideResourceLoader(ResourceLoader.Factory factory, MicrogramSource source) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(source, "source");
        return factory.create(source);
    }

    public final GuestRuntime.Factory provideGuestRuntimeFactory(Context context, MicrogramWebViewClient client, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        return new WebViewGuestRuntime.Factory(context, client, instanceTrace);
    }

    /* compiled from: MicrogramRuntimeModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.inject.MicrogramRuntimeModule$provideReceiveMessageHandler$1 */
    /* synthetic */ class C462531 extends FunctionReferenceImpl implements Function0<HostReceiveMessageHandler3> {
        C462531(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HostReceiveMessageHandler3 invoke() {
            return (HostReceiveMessageHandler3) ((Lazy) this.receiver).get();
        }
    }

    public final HostReceiveMessageHandler provideReceiveMessageHandler(Lazy<HostReceiveMessageHandler3> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return HostReceiveMessageHandler.INSTANCE.wrapping(new C462531(lazy));
    }

    public final Monitoring5 provideRealMonitor(HostPlatformMessageTunnel tunnel, RhTrace6 instanceTrace) {
        Intrinsics.checkNotNullParameter(tunnel, "tunnel");
        Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
        return new Monitoring5(instanceTrace);
    }

    /* compiled from: MicrogramRuntimeModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.inject.MicrogramRuntimeModule$provideMonitorListener$1 */
    /* synthetic */ class C462511 extends FunctionReferenceImpl implements Function0<Monitoring5> {
        C462511(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Monitoring5 invoke() {
            return (Monitoring5) ((Lazy) this.receiver).get();
        }
    }

    public final Monitoring3 provideMonitorListener(Lazy<Monitoring5> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return Monitoring3.INSTANCE.wrapping(new C462511(lazy));
    }

    /* compiled from: MicrogramRuntimeModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.inject.MicrogramRuntimeModule$providePackageInitializer$1 */
    /* synthetic */ class C462521 extends FunctionReferenceImpl implements Function0<PackageInitializer4> {
        C462521(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PackageInitializer4 invoke() {
            return (PackageInitializer4) ((Lazy) this.receiver).get();
        }
    }

    public final PackageInitializer providePackageInitializer(Lazy<PackageInitializer4> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return PackageInitializer.INSTANCE.wrapping(new C462521(lazy));
    }

    public final Map<String, ServiceExtension> provideServiceExtensions(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, ServiceLocator serviceLocator, Json json, Map<String, Provider<ServiceExtension>> compileTimeExtensions, Map<String, ServiceExtension.Factory> runtimeExtensions) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(compileTimeExtensions, "compileTimeExtensions");
        Intrinsics.checkNotNullParameter(runtimeExtensions, "runtimeExtensions");
        return BuildServiceExtensionMap.buildServiceExtensionMap(coroutineScope, messageDispatcher, serviceLocator, json, compileTimeExtensions, runtimeExtensions);
    }

    public final ServiceLocator provideServiceLocator(Lazy<ServiceLocator2> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return ServiceLocator.INSTANCE.wrapping(lazy);
    }

    public final RhTrace6 provideTrackTrace(MicrogramSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return RhTrace.INSTANCE.getApp().forTrack("Microgram #" + counter.getAndIncrement() + " (" + source.getIdentifier() + ")");
    }
}
