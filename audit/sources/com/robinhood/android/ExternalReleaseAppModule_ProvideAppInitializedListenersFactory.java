package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.manager.GdprManager;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.store.supportchat.ChatCacheCleanAppInitializedListener;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalReleaseAppModule_ProvideAppInitializedListenersFactory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseAppModule_ProvideAppInitializedListenersFactory;", "Ldagger/internal/Factory;", "", "Lcom/robinhood/utils/AppInitializedListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "rxGlobalErrorHandler", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxAndroidAppInitializedListener", "Lcom/robinhood/android/RxAndroidAppInitializedListener;", "temporalFormatterLifecycleListener", "Lcom/robinhood/android/TemporalFormatterLifecycleListener;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "scarletAppInitializedListener", "Lcom/robinhood/android/ScarletAppInitializedListener;", "chatCacheCleanAppInitializedListener", "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "formatterLocaleLifecycleListener", "Lcom/robinhood/android/FormatterLocaleLifecycleListener;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ExternalReleaseAppModule_ProvideAppInitializedListenersFactory implements Factory<Set<AppInitializedListener>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<ChatCacheCleanAppInitializedListener> chatCacheCleanAppInitializedListener;
    private final Provider<FormatterLocaleLifecycleListener> formatterLocaleLifecycleListener;
    private final Provider<GdprManager> gdprManager;
    private final Provider<RxAndroidAppInitializedListener> rxAndroidAppInitializedListener;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<ScarletAppInitializedListener> scarletAppInitializedListener;
    private final Provider<TemporalFormatterLifecycleListener> temporalFormatterLifecycleListener;

    @JvmStatic
    public static final ExternalReleaseAppModule_ProvideAppInitializedListenersFactory create(Provider<RxGlobalErrorHandler> provider, Provider<RxAndroidAppInitializedListener> provider2, Provider<TemporalFormatterLifecycleListener> provider3, Provider<GdprManager> provider4, Provider<ScarletAppInitializedListener> provider5, Provider<ChatCacheCleanAppInitializedListener> provider6, Provider<FormatterLocaleLifecycleListener> provider7, Provider<AccountSelectorHomeManager> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final Set<AppInitializedListener> provideAppInitializedListeners(RxGlobalErrorHandler rxGlobalErrorHandler, RxAndroidAppInitializedListener rxAndroidAppInitializedListener, TemporalFormatterLifecycleListener temporalFormatterLifecycleListener, GdprManager gdprManager, ScarletAppInitializedListener scarletAppInitializedListener, ChatCacheCleanAppInitializedListener chatCacheCleanAppInitializedListener, FormatterLocaleLifecycleListener formatterLocaleLifecycleListener, AccountSelectorHomeManager accountSelectorHomeManager) {
        return INSTANCE.provideAppInitializedListeners(rxGlobalErrorHandler, rxAndroidAppInitializedListener, temporalFormatterLifecycleListener, gdprManager, scarletAppInitializedListener, chatCacheCleanAppInitializedListener, formatterLocaleLifecycleListener, accountSelectorHomeManager);
    }

    public ExternalReleaseAppModule_ProvideAppInitializedListenersFactory(Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<RxAndroidAppInitializedListener> rxAndroidAppInitializedListener, Provider<TemporalFormatterLifecycleListener> temporalFormatterLifecycleListener, Provider<GdprManager> gdprManager, Provider<ScarletAppInitializedListener> scarletAppInitializedListener, Provider<ChatCacheCleanAppInitializedListener> chatCacheCleanAppInitializedListener, Provider<FormatterLocaleLifecycleListener> formatterLocaleLifecycleListener, Provider<AccountSelectorHomeManager> accountSelectorHomeManager) {
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        Intrinsics.checkNotNullParameter(rxAndroidAppInitializedListener, "rxAndroidAppInitializedListener");
        Intrinsics.checkNotNullParameter(temporalFormatterLifecycleListener, "temporalFormatterLifecycleListener");
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        Intrinsics.checkNotNullParameter(scarletAppInitializedListener, "scarletAppInitializedListener");
        Intrinsics.checkNotNullParameter(chatCacheCleanAppInitializedListener, "chatCacheCleanAppInitializedListener");
        Intrinsics.checkNotNullParameter(formatterLocaleLifecycleListener, "formatterLocaleLifecycleListener");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
        this.rxAndroidAppInitializedListener = rxAndroidAppInitializedListener;
        this.temporalFormatterLifecycleListener = temporalFormatterLifecycleListener;
        this.gdprManager = gdprManager;
        this.scarletAppInitializedListener = scarletAppInitializedListener;
        this.chatCacheCleanAppInitializedListener = chatCacheCleanAppInitializedListener;
        this.formatterLocaleLifecycleListener = formatterLocaleLifecycleListener;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
    }

    @Override // javax.inject.Provider
    public Set<AppInitializedListener> get() {
        Companion companion = INSTANCE;
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        RxAndroidAppInitializedListener rxAndroidAppInitializedListener = this.rxAndroidAppInitializedListener.get();
        Intrinsics.checkNotNullExpressionValue(rxAndroidAppInitializedListener, "get(...)");
        TemporalFormatterLifecycleListener temporalFormatterLifecycleListener = this.temporalFormatterLifecycleListener.get();
        Intrinsics.checkNotNullExpressionValue(temporalFormatterLifecycleListener, "get(...)");
        GdprManager gdprManager = this.gdprManager.get();
        Intrinsics.checkNotNullExpressionValue(gdprManager, "get(...)");
        ScarletAppInitializedListener scarletAppInitializedListener = this.scarletAppInitializedListener.get();
        Intrinsics.checkNotNullExpressionValue(scarletAppInitializedListener, "get(...)");
        ChatCacheCleanAppInitializedListener chatCacheCleanAppInitializedListener = this.chatCacheCleanAppInitializedListener.get();
        Intrinsics.checkNotNullExpressionValue(chatCacheCleanAppInitializedListener, "get(...)");
        FormatterLocaleLifecycleListener formatterLocaleLifecycleListener = this.formatterLocaleLifecycleListener.get();
        Intrinsics.checkNotNullExpressionValue(formatterLocaleLifecycleListener, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        return companion.provideAppInitializedListeners(rxGlobalErrorHandler, rxAndroidAppInitializedListener, temporalFormatterLifecycleListener, gdprManager, scarletAppInitializedListener, chatCacheCleanAppInitializedListener, formatterLocaleLifecycleListener, accountSelectorHomeManager);
    }

    /* compiled from: ExternalReleaseAppModule_ProvideAppInitializedListenersFactory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JS\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseAppModule_ProvideAppInitializedListenersFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ExternalReleaseAppModule_ProvideAppInitializedListenersFactory;", "rxGlobalErrorHandler", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxAndroidAppInitializedListener", "Lcom/robinhood/android/RxAndroidAppInitializedListener;", "temporalFormatterLifecycleListener", "Lcom/robinhood/android/TemporalFormatterLifecycleListener;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "scarletAppInitializedListener", "Lcom/robinhood/android/ScarletAppInitializedListener;", "chatCacheCleanAppInitializedListener", "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "formatterLocaleLifecycleListener", "Lcom/robinhood/android/FormatterLocaleLifecycleListener;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "provideAppInitializedListeners", "", "Lcom/robinhood/utils/AppInitializedListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ExternalReleaseAppModule_ProvideAppInitializedListenersFactory create(Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<RxAndroidAppInitializedListener> rxAndroidAppInitializedListener, Provider<TemporalFormatterLifecycleListener> temporalFormatterLifecycleListener, Provider<GdprManager> gdprManager, Provider<ScarletAppInitializedListener> scarletAppInitializedListener, Provider<ChatCacheCleanAppInitializedListener> chatCacheCleanAppInitializedListener, Provider<FormatterLocaleLifecycleListener> formatterLocaleLifecycleListener, Provider<AccountSelectorHomeManager> accountSelectorHomeManager) {
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            Intrinsics.checkNotNullParameter(rxAndroidAppInitializedListener, "rxAndroidAppInitializedListener");
            Intrinsics.checkNotNullParameter(temporalFormatterLifecycleListener, "temporalFormatterLifecycleListener");
            Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
            Intrinsics.checkNotNullParameter(scarletAppInitializedListener, "scarletAppInitializedListener");
            Intrinsics.checkNotNullParameter(chatCacheCleanAppInitializedListener, "chatCacheCleanAppInitializedListener");
            Intrinsics.checkNotNullParameter(formatterLocaleLifecycleListener, "formatterLocaleLifecycleListener");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            return new ExternalReleaseAppModule_ProvideAppInitializedListenersFactory(rxGlobalErrorHandler, rxAndroidAppInitializedListener, temporalFormatterLifecycleListener, gdprManager, scarletAppInitializedListener, chatCacheCleanAppInitializedListener, formatterLocaleLifecycleListener, accountSelectorHomeManager);
        }

        @JvmStatic
        public final Set<AppInitializedListener> provideAppInitializedListeners(RxGlobalErrorHandler rxGlobalErrorHandler, RxAndroidAppInitializedListener rxAndroidAppInitializedListener, TemporalFormatterLifecycleListener temporalFormatterLifecycleListener, GdprManager gdprManager, ScarletAppInitializedListener scarletAppInitializedListener, ChatCacheCleanAppInitializedListener chatCacheCleanAppInitializedListener, FormatterLocaleLifecycleListener formatterLocaleLifecycleListener, AccountSelectorHomeManager accountSelectorHomeManager) {
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            Intrinsics.checkNotNullParameter(rxAndroidAppInitializedListener, "rxAndroidAppInitializedListener");
            Intrinsics.checkNotNullParameter(temporalFormatterLifecycleListener, "temporalFormatterLifecycleListener");
            Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
            Intrinsics.checkNotNullParameter(scarletAppInitializedListener, "scarletAppInitializedListener");
            Intrinsics.checkNotNullParameter(chatCacheCleanAppInitializedListener, "chatCacheCleanAppInitializedListener");
            Intrinsics.checkNotNullParameter(formatterLocaleLifecycleListener, "formatterLocaleLifecycleListener");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Object objCheckNotNull = Preconditions.checkNotNull(ExternalReleaseAppModule.INSTANCE.provideAppInitializedListeners(rxGlobalErrorHandler, rxAndroidAppInitializedListener, temporalFormatterLifecycleListener, gdprManager, scarletAppInitializedListener, chatCacheCleanAppInitializedListener, formatterLocaleLifecycleListener, accountSelectorHomeManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Set) objCheckNotNull;
        }
    }
}
