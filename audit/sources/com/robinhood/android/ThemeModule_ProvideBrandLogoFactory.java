package com.robinhood.android;

import android.graphics.drawable.Drawable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeModule_ProvideBrandLogoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ThemeModule_ProvideBrandLogoFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideBrandLogo", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ThemeModule_ProvideBrandLogoFactory implements Factory<DirectResourceReference<Drawable>> {
    public static final ThemeModule_ProvideBrandLogoFactory INSTANCE = new ThemeModule_ProvideBrandLogoFactory();

    private ThemeModule_ProvideBrandLogoFactory() {
    }

    @Override // javax.inject.Provider
    public DirectResourceReference<Drawable> get() {
        return provideBrandLogo();
    }

    @JvmStatic
    public static final ThemeModule_ProvideBrandLogoFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final DirectResourceReference<Drawable> provideBrandLogo() {
        Object objCheckNotNull = Preconditions.checkNotNull(ThemeModule.INSTANCE.provideBrandLogo(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (DirectResourceReference) objCheckNotNull;
    }
}
