package com.robinhood.android.pictureinpicture.pip;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Hammer_PictureInPictureActivity_Companion_NavigationResolverModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/Hammer_PictureInPictureActivity_Companion_NavigationResolverModule;", "", "<init>", "()V", "getter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "provide_PictureInPictureKey_Crypto", "provide_PictureInPictureKey_Event", "provide_PictureInPictureKey_FuturesOutright", "provide_PictureInPictureKey_Index", "provide_PictureInPictureKey_Instrument", "provide_PictureInPictureKey_Option", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pictureinpicture.pip.Hammer_PictureInPictureActivity_Companion_NavigationResolverModule */
/* loaded from: classes17.dex */
public final class C25477x733504d5 {
    public static final int $stable = 0;
    public static final C25477x733504d5 INSTANCE = new C25477x733504d5();
    private static final Function0<NavigationResolver> getter = NavigationResolver.INSTANCE.lazyGetter("com.robinhood.android.pictureinpicture.pip.PictureInPictureActivity", "Companion");

    private C25477x733504d5() {
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_Crypto() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_Event() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_FuturesOutright() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_Index() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_Instrument() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_PictureInPictureKey_Option() {
        return getter;
    }
}
