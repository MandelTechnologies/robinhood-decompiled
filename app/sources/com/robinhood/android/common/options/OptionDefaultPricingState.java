package com.robinhood.android.common.options;

import com.robinhood.models.p320db.OptionSettings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionDefaultPricingState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "", "defaultPricingSettingForOptionOrder", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "overallDefaultPricingType", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getDefaultPricingSettingForOptionOrder", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getOverallDefaultPricingType", "NATURAL_PRICE", "MARK_PRICE", "LOADING", "NOT_AVAILABLE", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionDefaultPricingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionDefaultPricingState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionDefaultPricingState LOADING;
    public static final OptionDefaultPricingState MARK_PRICE;
    public static final OptionDefaultPricingState NATURAL_PRICE;
    public static final OptionDefaultPricingState NOT_AVAILABLE;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingForOptionOrder;
    private final OptionSettings.DefaultPricingSetting overallDefaultPricingType;

    private static final /* synthetic */ OptionDefaultPricingState[] $values() {
        return new OptionDefaultPricingState[]{NATURAL_PRICE, MARK_PRICE, LOADING, NOT_AVAILABLE};
    }

    public static EnumEntries<OptionDefaultPricingState> getEntries() {
        return $ENTRIES;
    }

    private OptionDefaultPricingState(String str, int i, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2) {
        this.defaultPricingSettingForOptionOrder = defaultPricingSetting;
        this.overallDefaultPricingType = defaultPricingSetting2;
    }

    /* synthetic */ OptionDefaultPricingState(String str, int i, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : defaultPricingSetting, defaultPricingSetting2);
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingForOptionOrder() {
        return this.defaultPricingSettingForOptionOrder;
    }

    public final OptionSettings.DefaultPricingSetting getOverallDefaultPricingType() {
        return this.overallDefaultPricingType;
    }

    static {
        OptionSettings.DefaultPricingSetting defaultPricingSetting = OptionSettings.DefaultPricingSetting.NATURAL_PRICE;
        NATURAL_PRICE = new OptionDefaultPricingState("NATURAL_PRICE", 0, defaultPricingSetting, defaultPricingSetting);
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = OptionSettings.DefaultPricingSetting.MARK_PRICE;
        MARK_PRICE = new OptionDefaultPricingState("MARK_PRICE", 1, defaultPricingSetting2, defaultPricingSetting2);
        LOADING = new OptionDefaultPricingState("LOADING", 2, null, null);
        NOT_AVAILABLE = new OptionDefaultPricingState("NOT_AVAILABLE", 3, null, defaultPricingSetting2);
        OptionDefaultPricingState[] optionDefaultPricingStateArr$values = $values();
        $VALUES = optionDefaultPricingStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionDefaultPricingStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: OptionDefaultPricingState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/options/OptionDefaultPricingState$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "defaultPricingSettingServerValue", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingSettingOverride", "shouldIgnoreDefaultPricing", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: OptionDefaultPricingState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionSettings.DefaultPricingSetting.values().length];
                try {
                    iArr[OptionSettings.DefaultPricingSetting.NATURAL_PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionSettings.DefaultPricingSetting.MARK_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionDefaultPricingState from(OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, boolean shouldIgnoreDefaultPricing) {
            if (shouldIgnoreDefaultPricing) {
                return OptionDefaultPricingState.NOT_AVAILABLE;
            }
            if (defaultPricingSettingOverride != null) {
                defaultPricingSettingServerValue = defaultPricingSettingOverride;
            }
            int i = defaultPricingSettingServerValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[defaultPricingSettingServerValue.ordinal()];
            if (i == -1) {
                return OptionDefaultPricingState.LOADING;
            }
            if (i == 1) {
                return OptionDefaultPricingState.NATURAL_PRICE;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return OptionDefaultPricingState.MARK_PRICE;
        }
    }

    public static OptionDefaultPricingState valueOf(String str) {
        return (OptionDefaultPricingState) Enum.valueOf(OptionDefaultPricingState.class, str);
    }

    public static OptionDefaultPricingState[] values() {
        return (OptionDefaultPricingState[]) $VALUES.clone();
    }
}
