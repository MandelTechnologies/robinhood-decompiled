package com.robinhood.android.compose.maps;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;

/* compiled from: BentoMapDefaults.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/compose/maps/BentoMapDefaults;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/compose/maps/BentoMapStyle;", "night", "lib-maps_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BentoMapDefaults {
    public static final int $stable = 0;
    public static final BentoMapDefaults INSTANCE = new BentoMapDefaults();

    private BentoMapDefaults() {
    }

    /* renamed from: default, reason: not valid java name */
    public final BentoMapStyle m12534default() {
        return new BentoMapStyle() { // from class: com.robinhood.android.compose.maps.BentoMapDefaults.default.1
            @Override // com.robinhood.android.compose.maps.BentoMapStyle
            public MapStyle getEnabled() {
                return new MapStyle(C13997R.raw.google_map_style_standard);
            }

            @Override // com.robinhood.android.compose.maps.BentoMapStyle
            public MapStyle getDisabled() {
                return new MapStyle(C13997R.raw.google_map_style_silver);
            }
        };
    }

    public final BentoMapStyle night() {
        return new BentoMapStyle() { // from class: com.robinhood.android.compose.maps.BentoMapDefaults.night.1
            @Override // com.robinhood.android.compose.maps.BentoMapStyle
            public MapStyle getEnabled() {
                return new MapStyle(C13997R.raw.google_map_style_night);
            }

            @Override // com.robinhood.android.compose.maps.BentoMapStyle
            public MapStyle getDisabled() {
                return new MapStyle(C13997R.raw.google_map_style_dark);
            }
        };
    }
}
