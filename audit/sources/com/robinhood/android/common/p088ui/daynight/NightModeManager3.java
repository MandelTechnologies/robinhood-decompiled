package com.robinhood.android.common.p088ui.daynight;

import android.content.res.Resources;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.base.MarketHoursManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightModeManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePreference", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "resources", "Landroid/content/res/Resources;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/store/base/MarketHoursManager;Landroid/content/res/Resources;Lcom/robinhood/shared/app/type/AppType;)V", "isSystemSettingAvailable", "", "()Z", "dayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "getDayNightMode", "()Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "followMarket", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.daynight.RealNightModeManager, reason: use source file name */
/* loaded from: classes17.dex */
public final class NightModeManager3 implements NightModeManager {
    public static final int $stable = 8;
    private final AppType appType;
    private final MarketHoursManager marketHoursManager;
    private final Resources resources;
    private final EnumPreference<Theme> themePreference;

    /* compiled from: NightModeManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.ui.daynight.RealNightModeManager$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Theme.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Theme.NIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NightModeManager3(EnumPreference<Theme> themePreference, MarketHoursManager marketHoursManager, Resources resources, AppType appType) {
        Intrinsics.checkNotNullParameter(themePreference, "themePreference");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.themePreference = themePreference;
        this.marketHoursManager = marketHoursManager;
        this.resources = resources;
        this.appType = appType;
    }

    @Override // com.robinhood.android.common.p088ui.daynight.NightModeManager
    public boolean isSystemSettingAvailable() {
        int i = this.resources.getConfiguration().uiMode & 48;
        return i == 16 || i == 32;
    }

    @Override // com.robinhood.android.common.p088ui.daynight.NightModeManager
    public NightModeManager2 getDayNightMode() {
        Theme theme = (Theme) this.themePreference.getValue();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        if (iArr[theme.ordinal()] == 1) {
            theme = this.appType == AppType.RHC ? Theme.SYSTEM : Theme.MARKET;
        }
        int i = iArr[theme.ordinal()];
        if (i == 1) {
            return followMarket();
        }
        if (i != 2) {
            if (i == 3) {
                return NightModeManager2.DAY;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return NightModeManager2.NIGHT;
        }
        int i2 = this.resources.getConfiguration().uiMode & 48;
        if (i2 == 16) {
            return NightModeManager2.DAY;
        }
        if (i2 == 32) {
            return NightModeManager2.NIGHT;
        }
        return followMarket();
    }

    private final NightModeManager2 followMarket() {
        return this.marketHoursManager.areMarketsOpenExtended() ? NightModeManager2.DAY : NightModeManager2.NIGHT;
    }
}
