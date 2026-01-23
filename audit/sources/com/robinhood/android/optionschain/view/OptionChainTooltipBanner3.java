package com.robinhood.android.optionschain.view;

import android.content.res.Resources;
import com.robinhood.android.optionschain.C24135R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainTooltipBanner.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "", "<init>", "(Ljava/lang/String;I)V", "LONG_PRESS", "TAP_TO_SIMULATE", "SELECT_TO_SIMULATE", "getMessage", "", "resources", "Landroid/content/res/Resources;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.view.OptionChainTooltipBannerType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainTooltipBanner3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainTooltipBanner3[] $VALUES;
    public static final OptionChainTooltipBanner3 LONG_PRESS = new OptionChainTooltipBanner3("LONG_PRESS", 0);
    public static final OptionChainTooltipBanner3 TAP_TO_SIMULATE = new OptionChainTooltipBanner3("TAP_TO_SIMULATE", 1);
    public static final OptionChainTooltipBanner3 SELECT_TO_SIMULATE = new OptionChainTooltipBanner3("SELECT_TO_SIMULATE", 2);

    /* compiled from: OptionChainTooltipBanner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.view.OptionChainTooltipBannerType$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainTooltipBanner3.values().length];
            try {
                iArr[OptionChainTooltipBanner3.LONG_PRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainTooltipBanner3.TAP_TO_SIMULATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionChainTooltipBanner3.SELECT_TO_SIMULATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OptionChainTooltipBanner3[] $values() {
        return new OptionChainTooltipBanner3[]{LONG_PRESS, TAP_TO_SIMULATE, SELECT_TO_SIMULATE};
    }

    public static EnumEntries<OptionChainTooltipBanner3> getEntries() {
        return $ENTRIES;
    }

    private OptionChainTooltipBanner3(String str, int i) {
    }

    static {
        OptionChainTooltipBanner3[] optionChainTooltipBanner3Arr$values = $values();
        $VALUES = optionChainTooltipBanner3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainTooltipBanner3Arr$values);
    }

    public final String getMessage(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C24135R.string.option_chain_simulated_return_pre_trade_banner_nux_long_press);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = resources.getString(C24135R.string.f4803xba5e274a);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = resources.getString(C24135R.string.f4802x677c9967);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static OptionChainTooltipBanner3 valueOf(String str) {
        return (OptionChainTooltipBanner3) Enum.valueOf(OptionChainTooltipBanner3.class, str);
    }

    public static OptionChainTooltipBanner3[] values() {
        return (OptionChainTooltipBanner3[]) $VALUES.clone();
    }
}
