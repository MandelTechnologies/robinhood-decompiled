package com.robinhood.android.widget;

import android.content.SharedPreferences;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.android.widget.p277ui.PortfolioWidgetUpdateDispatcher;
import com.robinhood.android.widget.util.PortfolioWidgetInfo;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.android.widget.util.PortfolioWidgetLastUpdatedPref;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FeatureWidgetModule.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/widget/FeatureWidgetModule;", "", "<init>", "()V", "providePortfolioWidgetLastUpdatedPref", "Lcom/robinhood/prefs/LongPreference;", "prefs", "Landroid/content/SharedPreferences;", "providesPortfolioWidgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "sharedPreferences", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideUserLifecycleListener", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class FeatureWidgetModule {
    public static final FeatureWidgetModule INSTANCE = new FeatureWidgetModule();

    public final UserLifecycleListener provideUserLifecycleListener(PortfolioWidgetUpdateDispatcher updateDispatcher) {
        Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
        return updateDispatcher;
    }

    private FeatureWidgetModule() {
    }

    @PortfolioWidgetLastUpdatedPref
    public final LongPreference providePortfolioWidgetLastUpdatedPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "portfolioWidgetLastUpdated", 0L, 4, null);
    }

    public final PortfolioWidgetInfoPref providesPortfolioWidgetInfoPref(@DevicePrefs SharedPreferences sharedPreferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        return new PortfolioWidgetInfoPref(sharedPreferences, moshi.adapter(new TypeToken<PortfolioWidgetInfo>() { // from class: com.robinhood.android.widget.FeatureWidgetModule$providesPortfolioWidgetInfoPref$$inlined$getAdapter$1
        }.getType()));
    }
}
