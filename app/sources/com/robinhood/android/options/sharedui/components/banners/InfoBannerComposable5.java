package com.robinhood.android.options.sharedui.components.banners;

import com.robinhood.android.assethomes.AssetHomePositionListSections;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/options/sharedui/components/banners/Source;", "", "<init>", "(Ljava/lang/String;I)V", "OPTION_SETTINGS_SECTION", "OPTION_ASSET_HOME", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "lib-options-shared-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.sharedui.components.banners.Source, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class InfoBannerComposable5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InfoBannerComposable5[] $VALUES;
    public static final InfoBannerComposable5 OPTION_SETTINGS_SECTION = new InfoBannerComposable5("OPTION_SETTINGS_SECTION", 0) { // from class: com.robinhood.android.options.sharedui.components.banners.Source.OPTION_SETTINGS_SECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable5
        public Screen getScreen() {
            return new Screen(Screen.Name.INVESTING_SETTINGS, null, null, null, 14, null);
        }

        @Override // com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable5
        public Component getComponent() {
            return new Component(Component.ComponentType.OPTION_L3_ENTRYPOINT_TAG, "option_settings_section", null, 4, null);
        }
    };
    public static final InfoBannerComposable5 OPTION_ASSET_HOME = new InfoBannerComposable5("OPTION_ASSET_HOME", 1) { // from class: com.robinhood.android.options.sharedui.components.banners.Source.OPTION_ASSET_HOME
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable5
        public Screen getScreen() {
            return new Screen(Screen.Name.ASSET_HOME, null, AssetHomePositionListSections.OPTIONS_PNL_ENTRY_POINT_SOURCE, null, 10, null);
        }

        @Override // com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable5
        public Component getComponent() {
            return new Component(Component.ComponentType.OPTION_L3_ENTRYPOINT_TAG, AssetHomePositionListSections.OPTIONS_PNL_ENTRY_POINT_SOURCE, null, 4, null);
        }
    };

    private static final /* synthetic */ InfoBannerComposable5[] $values() {
        return new InfoBannerComposable5[]{OPTION_SETTINGS_SECTION, OPTION_ASSET_HOME};
    }

    public /* synthetic */ InfoBannerComposable5(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<InfoBannerComposable5> getEntries() {
        return $ENTRIES;
    }

    public abstract Component getComponent();

    public abstract Screen getScreen();

    private InfoBannerComposable5(String str, int i) {
    }

    static {
        InfoBannerComposable5[] infoBannerComposable5Arr$values = $values();
        $VALUES = infoBannerComposable5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(infoBannerComposable5Arr$values);
    }

    public static InfoBannerComposable5 valueOf(String str) {
        return (InfoBannerComposable5) Enum.valueOf(InfoBannerComposable5.class, str);
    }

    public static InfoBannerComposable5[] values() {
        return (InfoBannerComposable5[]) $VALUES.clone();
    }
}
