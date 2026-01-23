package com.robinhood.android;

import android.graphics.drawable.Drawable;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: ThemeModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/ThemeModule;", "", "<init>", "()V", "provideLockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "provideBrandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ThemeModule {
    public static final ThemeModule INSTANCE = new ThemeModule();

    private ThemeModule() {
    }

    @LockscreenScarletOverlay
    public final ScarletOverlay provideLockscreenOverlay() {
        return new ScarletOverlay() { // from class: com.robinhood.android.ThemeModule.provideLockscreenOverlay.1
            private final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Lockscreen);

            @Override // com.robinhood.scarlet.ScarletOverlay
            public int getPriority() {
                return 123;
            }

            @Override // com.robinhood.scarlet.ScarletOverlay
            public DirectResourceReference<StyleResource> getStyleReference() {
                return this.styleReference;
            }
        };
    }

    @BrandLogo
    public final DirectResourceReference<Drawable> provideBrandLogo() {
        return new DirectResourceReference<>(ResourceType.DRAWABLE.INSTANCE, C20690R.drawable.rh_logo);
    }
}
