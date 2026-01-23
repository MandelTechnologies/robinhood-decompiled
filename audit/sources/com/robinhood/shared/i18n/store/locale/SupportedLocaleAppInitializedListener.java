package com.robinhood.shared.i18n.store.locale;

import android.app.Application;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.AppInitializedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportedLocaleAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "supportedLocaleStore", "Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleStore;Lcom/robinhood/shared/app/type/AppType;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "lib-store-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SupportedLocaleAppInitializedListener implements AppInitializedListener {
    private final AppType appType;
    private final SupportedLocaleStore supportedLocaleStore;

    public SupportedLocaleAppInitializedListener(SupportedLocaleStore supportedLocaleStore, AppType appType) {
        Intrinsics.checkNotNullParameter(supportedLocaleStore, "supportedLocaleStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.supportedLocaleStore = supportedLocaleStore;
        this.appType = appType;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (this.appType == AppType.RHC) {
            SupportedLocaleStore.refreshSupportedLocale$default(this.supportedLocaleStore, false, 1, null);
        }
    }
}
