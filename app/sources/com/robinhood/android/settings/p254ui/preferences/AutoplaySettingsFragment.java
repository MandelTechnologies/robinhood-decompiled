package com.robinhood.android.settings.p254ui.preferences;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.data.prefs.VideoAutoplaySettingPref;
import com.robinhood.android.common.data.prefs.VideoAutoplaySettingPref2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.settings.C28315R;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AutoplaySettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AutoplaySettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "autoplaySettingsPref", "Lcom/robinhood/prefs/StringPreference;", "getAutoplaySettingsPref", "()Lcom/robinhood/prefs/StringPreference;", "setAutoplaySettingsPref", "(Lcom/robinhood/prefs/StringPreference;)V", "autoplayRadioGroup", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "getAutoplayRadioGroup", "()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "autoplayRadioGroup$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AutoplaySettingsFragment extends BaseFragment {

    /* renamed from: autoplayRadioGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 autoplayRadioGroup;

    @VideoAutoplaySettingPref
    public StringPreference autoplaySettingsPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AutoplaySettingsFragment.class, "autoplayRadioGroup", "getAutoplayRadioGroup()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AutoplaySettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAutoplaySettingPref2.values().length];
            try {
                iArr[VideoAutoplaySettingPref2.MOBILE_AND_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAutoplaySettingPref2.WIFI_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAutoplaySettingPref2.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AutoplaySettingsFragment() {
        super(C28315R.layout.fragment_auto_play_settings);
        this.autoplayRadioGroup = bindView(C28315R.id.video_autoplay_radio_group);
    }

    public final StringPreference getAutoplaySettingsPref() {
        StringPreference stringPreference = this.autoplaySettingsPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("autoplaySettingsPref");
        return null;
    }

    public final void setAutoplaySettingsPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.autoplaySettingsPref = stringPreference;
    }

    private final LegacyRdsRadioGroup getAutoplayRadioGroup() {
        return (LegacyRdsRadioGroup) this.autoplayRadioGroup.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C28315R.string.autoplay_settings_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        VideoAutoplaySettingPref2.Companion companion = VideoAutoplaySettingPref2.INSTANCE;
        String str = getAutoplaySettingsPref().get();
        Intrinsics.checkNotNull(str);
        int i2 = WhenMappings.$EnumSwitchMapping$0[companion.fromValue(str).ordinal()];
        if (i2 == 1) {
            i = C28315R.id.mobile_and_wifi_radio;
        } else if (i2 == 2) {
            i = C28315R.id.wifi_only_radio;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C28315R.id.never_radio;
        }
        getAutoplayRadioGroup().check(i);
        getAutoplayRadioGroup().setOnCheckedChangeListener(new LegacyRdsRadioGroup.OnCheckedChangeListener() { // from class: com.robinhood.android.settings.ui.preferences.AutoplaySettingsFragment.onViewCreated.1
            @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
                VideoAutoplaySettingPref2 videoAutoplaySettingPref2;
                Intrinsics.checkNotNullParameter(group, "group");
                if (checkedId == C28315R.id.mobile_and_wifi_radio) {
                    videoAutoplaySettingPref2 = VideoAutoplaySettingPref2.MOBILE_AND_WIFI;
                } else if (checkedId == C28315R.id.wifi_only_radio) {
                    videoAutoplaySettingPref2 = VideoAutoplaySettingPref2.WIFI_ONLY;
                } else {
                    if (checkedId != C28315R.id.never_radio) {
                        Preconditions.INSTANCE.failUnknownEnumKotlin(Integer.valueOf(checkedId));
                        throw new ExceptionsH();
                    }
                    videoAutoplaySettingPref2 = VideoAutoplaySettingPref2.NEVER;
                }
                AutoplaySettingsFragment.this.getAutoplaySettingsPref().set(videoAutoplaySettingPref2.getValue());
            }
        });
    }

    /* compiled from: AutoplaySettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AutoplaySettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutoplaySettings;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "newInstance", "Lcom/robinhood/android/settings/ui/preferences/AutoplaySettingsFragment;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.AutoplaySettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AutoplaySettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new AutoplaySettingsFragment();
        }

        public final AutoplaySettingsFragment newInstance() {
            return new AutoplaySettingsFragment();
        }
    }
}
