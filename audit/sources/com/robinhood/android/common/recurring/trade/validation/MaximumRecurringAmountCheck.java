package com.robinhood.android.common.recurring.trade.validation;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.recurring.models.api.ApiAssetType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaximumRecurringAmountCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/MaximumRecurringAmountCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/common/recurring/trade/validation/MaximumRecurringAmountCheck$Failure;", "input", "Failure", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MaximumRecurringAmountCheck implements Validator.Check<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
    public static final int $stable = 0;

    /* compiled from: MaximumRecurringAmountCheck.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(RecurringOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i = WhenMappings.$EnumSwitchMapping$0[input.getAmountType().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ApiAssetType asset_type = input.getApiRequest().getInvestment_asset().getAsset_type();
        Money moneyMaxRecurringOrderAmount = RecurringInvestmentsConstants.INSTANCE.maxRecurringOrderAmount(asset_type);
        if (input.getApiRequest().getAmount().compareTo(moneyMaxRecurringOrderAmount) > 0) {
            return new Failure(asset_type, moneyMaxRecurringOrderAmount);
        }
        return null;
    }

    /* compiled from: MaximumRecurringAmountCheck.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/MaximumRecurringAmountCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "targetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "maxAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lcom/robinhood/models/util/Money;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final Money maxAmount;
        private final ApiAssetType targetType;

        public Failure(ApiAssetType targetType, Money maxAmount) {
            Intrinsics.checkNotNullParameter(targetType, "targetType");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            this.targetType = targetType;
            this.maxAmount = maxAmount;
            this.checkIdentifier = RecurringOrderValidator.CHECK_ID_RECURRING_MAXIMUM_AMOUNT_EXCEEDED;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onNegativeResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onPositiveResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onPositiveResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, RecurringOrderContext input) throws Resources.NotFoundException {
            String string2;
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            ApiAssetType apiAssetType = this.targetType;
            ApiAssetType apiAssetType2 = ApiAssetType.BROKERAGE_CASH;
            if (apiAssetType == apiAssetType2) {
                string2 = activity.getResources().getString(C11595R.string.f4004x5ee1cedd, Money.format$default(this.maxAmount, Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null));
            } else {
                string2 = activity.getResources().getString(C11595R.string.f4011x1ffd7644, Money.format$default(this.maxAmount, Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null));
            }
            Intrinsics.checkNotNull(string2);
            ApiAssetType apiAssetType3 = this.targetType;
            if (apiAssetType3 == apiAssetType2) {
                i = C11595R.string.f4005x47caeae;
            } else {
                i = C11595R.string.f4012xb5903d5;
            }
            if (apiAssetType3 == apiAssetType2) {
                i2 = C11595R.string.f4003x6d0b259c;
            } else {
                i2 = C11595R.string.f4010x41b97555;
            }
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(activity).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setUseDesignSystemOverlay(true).setTitle(i, new Object[0]).setMessage(string2).setPositiveButton(i2, new Object[0]);
            if (input.isCrypto()) {
                positiveButton.setUseParentFragmentScarletContext(true);
                positiveButton.setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog_Negative);
            } else if (input.isBrokerageCashTransfer()) {
                positiveButton.setUseParentFragmentScarletContext(true);
                positiveButton.setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            }
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "maximumRecurringAmount", false, 4, null);
        }
    }
}
