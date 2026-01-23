package com.robinhood.android.options.settings;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.options.optionsstring.C23386R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionsSettingContract.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState;", "", "<init>", "()V", "dialogIdRes", "", "getDialogIdRes", "()I", "titleTextRes", "getTitleTextRes", "messageTextRes", "getMessageTextRes", "positiveButtonRes", "getPositiveButtonRes", "negativeButtonRes", "getNegativeButtonRes", "Control", "MarginRouting", "Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState$Control;", "Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState$MarginRouting;", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.settings.UpgradeCashAccountFailureState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsSettingContract3 {
    public static final int $stable = 0;

    public /* synthetic */ OptionsSettingContract3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getDialogIdRes();

    public abstract int getMessageTextRes();

    public abstract int getNegativeButtonRes();

    public abstract int getPositiveButtonRes();

    public abstract int getTitleTextRes();

    private OptionsSettingContract3() {
    }

    /* compiled from: OptionsSettingContract.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState$Control;", "Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState;", "<init>", "()V", "dialogIdRes", "", "getDialogIdRes", "()I", "titleTextRes", "getTitleTextRes", "messageTextRes", "getMessageTextRes", "positiveButtonRes", "getPositiveButtonRes", "negativeButtonRes", "getNegativeButtonRes", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.settings.UpgradeCashAccountFailureState$Control */
    public static final /* data */ class Control extends OptionsSettingContract3 {
        public static final int $stable = 0;
        public static final Control INSTANCE = new Control();
        private static final int dialogIdRes = C23695R.id.dialog_id_upgrade_cash_account_error;
        private static final int titleTextRes = C23695R.string.gated_cash_options_setting_upgrade_cash_account_failure_title;
        private static final int messageTextRes = C23695R.string.gated_cash_options_setting_upgrade_cash_account_failure_message;
        private static final int positiveButtonRes = C11048R.string.general_label_dismiss;
        private static final int negativeButtonRes = C23695R.string.gated_cash_options_setting_upgrade_cash_account_failure_action;

        public boolean equals(Object other) {
            return this == other || (other instanceof Control);
        }

        public int hashCode() {
            return -1646410117;
        }

        public String toString() {
            return "Control";
        }

        private Control() {
            super(null);
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getDialogIdRes() {
            return dialogIdRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getTitleTextRes() {
            return titleTextRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getMessageTextRes() {
            return messageTextRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getPositiveButtonRes() {
            return positiveButtonRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getNegativeButtonRes() {
            return negativeButtonRes;
        }
    }

    /* compiled from: OptionsSettingContract.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState$MarginRouting;", "Lcom/robinhood/android/options/settings/UpgradeCashAccountFailureState;", "<init>", "()V", "dialogIdRes", "", "getDialogIdRes", "()I", "titleTextRes", "getTitleTextRes", "messageTextRes", "getMessageTextRes", "positiveButtonRes", "getPositiveButtonRes", "negativeButtonRes", "getNegativeButtonRes", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.settings.UpgradeCashAccountFailureState$MarginRouting */
    public static final /* data */ class MarginRouting extends OptionsSettingContract3 {
        public static final int $stable = 0;
        public static final MarginRouting INSTANCE = new MarginRouting();
        private static final int dialogIdRes = C23695R.id.dialog_id_upgrade_cash_account_error_margin_routing;
        private static final int titleTextRes = C23386R.string.f4748xe25928f6;
        private static final int messageTextRes = C23386R.string.f4746x833100e7;
        private static final int positiveButtonRes = C23386R.string.f4745xfe6f58be;
        private static final int negativeButtonRes = C23386R.string.f4747x33ac315a;

        public boolean equals(Object other) {
            return this == other || (other instanceof MarginRouting);
        }

        public int hashCode() {
            return 406119894;
        }

        public String toString() {
            return "MarginRouting";
        }

        private MarginRouting() {
            super(null);
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getDialogIdRes() {
            return dialogIdRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getTitleTextRes() {
            return titleTextRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getMessageTextRes() {
            return messageTextRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getPositiveButtonRes() {
            return positiveButtonRes;
        }

        @Override // com.robinhood.android.options.settings.OptionsSettingContract3
        public int getNegativeButtonRes() {
            return negativeButtonRes;
        }
    }
}
