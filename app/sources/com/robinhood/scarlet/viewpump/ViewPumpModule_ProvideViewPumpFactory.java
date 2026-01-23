package com.robinhood.scarlet.viewpump;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.github.inflationx.viewpump.ViewPump;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewPumpModule_ProvideViewPumpFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/scarlet/viewpump/ViewPumpModule_ProvideViewPumpFactory;", "Ldagger/internal/Factory;", "Lio/github/inflationx/viewpump/ViewPump;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideViewPump", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ViewPumpModule_ProvideViewPumpFactory implements Factory<ViewPump> {
    public static final int $stable = 0;
    public static final ViewPumpModule_ProvideViewPumpFactory INSTANCE = new ViewPumpModule_ProvideViewPumpFactory();

    private ViewPumpModule_ProvideViewPumpFactory() {
    }

    @Override // javax.inject.Provider
    public ViewPump get() {
        return provideViewPump();
    }

    @JvmStatic
    public static final ViewPumpModule_ProvideViewPumpFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ViewPump provideViewPump() {
        Object objCheckNotNull = Preconditions.checkNotNull(ViewPumpModule.INSTANCE.provideViewPump(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ViewPump) objCheckNotNull;
    }
}
