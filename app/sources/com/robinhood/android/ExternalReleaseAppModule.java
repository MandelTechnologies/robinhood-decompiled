package com.robinhood.android;

import com.robinhood.android.common.util.AppContainer;
import com.robinhood.android.gdpr.manager.GdprManager;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.store.supportchat.ChatCacheCleanAppInitializedListener;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.RxGlobalErrorHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalReleaseAppModule.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007JN\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseAppModule;", "", "<init>", "()V", "provideAppContainer", "Lcom/robinhood/android/common/util/AppContainer;", "provideAppInitializedListeners", "", "Lcom/robinhood/utils/AppInitializedListener;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxAndroidAppInitializedListener", "Lcom/robinhood/android/RxAndroidAppInitializedListener;", "temporalFormatterLifecycleListener", "Lcom/robinhood/android/TemporalFormatterLifecycleListener;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "scarletAppInitializedListener", "Lcom/robinhood/android/ScarletAppInitializedListener;", "chatCacheCleanAppInitializedListener", "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "formatterLocaleLifecycleListener", "Lcom/robinhood/android/FormatterLocaleLifecycleListener;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ExternalReleaseAppModule {
    public static final ExternalReleaseAppModule INSTANCE = new ExternalReleaseAppModule();

    private ExternalReleaseAppModule() {
    }

    public final AppContainer provideAppContainer() {
        return AppContainer.INSTANCE.getDEFAULT();
    }

    public final Set<AppInitializedListener> provideAppInitializedListeners(RxGlobalErrorHandler rxGlobalErrorHandler, RxAndroidAppInitializedListener rxAndroidAppInitializedListener, TemporalFormatterLifecycleListener temporalFormatterLifecycleListener, GdprManager gdprManager, ScarletAppInitializedListener scarletAppInitializedListener, ChatCacheCleanAppInitializedListener chatCacheCleanAppInitializedListener, FormatterLocaleLifecycleListener formatterLocaleLifecycleListener, AccountSelectorHomeManager accountSelectorHomeManager) {
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        Intrinsics.checkNotNullParameter(rxAndroidAppInitializedListener, "rxAndroidAppInitializedListener");
        Intrinsics.checkNotNullParameter(temporalFormatterLifecycleListener, "temporalFormatterLifecycleListener");
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        Intrinsics.checkNotNullParameter(scarletAppInitializedListener, "scarletAppInitializedListener");
        Intrinsics.checkNotNullParameter(chatCacheCleanAppInitializedListener, "chatCacheCleanAppInitializedListener");
        Intrinsics.checkNotNullParameter(formatterLocaleLifecycleListener, "formatterLocaleLifecycleListener");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        return SetsKt.setOf((Object[]) new AppInitializedListener[]{rxGlobalErrorHandler, rxAndroidAppInitializedListener, temporalFormatterLifecycleListener, gdprManager, scarletAppInitializedListener, chatCacheCleanAppInitializedListener, formatterLocaleLifecycleListener, accountSelectorHomeManager});
    }
}
