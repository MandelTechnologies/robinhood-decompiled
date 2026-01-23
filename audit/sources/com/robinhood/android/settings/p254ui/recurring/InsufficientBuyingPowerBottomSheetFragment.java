package com.robinhood.android.settings.p254ui.recurring;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InsufficientBuyingPowerBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\"H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0017¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/CharSequence;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "secondaryButtonLabel", "getSecondaryButtonLabel", "amount", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", "amount$delegate", "Lkotlin/Lazy;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency$delegate", "recommendedDeposit", "getRecommendedDeposit", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "Callbacks", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InsufficientBuyingPowerBottomSheetFragment extends RhBottomSheetDialogFragment {
    private static final String ARG_AMOUNT = "amount";
    private static final String ARG_FREQUENCY = "frequency";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InsufficientBuyingPowerBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.recurring.InsufficientBuyingPowerBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: amount$delegate, reason: from kotlin metadata */
    private final Lazy amount = Fragments2.argument(this, "amount");

    /* renamed from: frequency$delegate, reason: from kotlin metadata */
    private final Lazy frequency = Fragments2.argument(this, "frequency");

    /* compiled from: InsufficientBuyingPowerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Callbacks;", "", "onDepositFundsClicked", "", "recommendedDeposit", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "onChangePaymentMethodClicked", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChangePaymentMethodClicked();

        void onDepositFundsClicked(BigDecimal recommendedDeposit, ApiInvestmentSchedule.Frequency frequency);
    }

    /* compiled from: InsufficientBuyingPowerBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected CharSequence getTitleTextLabel() {
        return getString(C28446R.string.settings_investment_schedule_insufficient_funds_dialog_title);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected CharSequence getDescriptionTextLabel() {
        return getString(C28446R.string.f4963x4ace03fa);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected CharSequence getPrimaryButtonLabel() {
        return getString(C28446R.string.f4961x58c795c6);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected CharSequence getSecondaryButtonLabel() {
        return getString(C28446R.string.f4962x9882211f);
    }

    private final Money getAmount() {
        return (Money) this.amount.getValue();
    }

    private final ApiInvestmentSchedule.Frequency getFrequency() {
        return (ApiInvestmentSchedule.Frequency) this.frequency.getValue();
    }

    private final Money getRecommendedDeposit() {
        long j;
        int i = WhenMappings.$EnumSwitchMapping$0[getFrequency().ordinal()];
        if (i != 1) {
            if (i != 2) {
                j = 4;
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = 3;
                }
            } else {
                j = 5;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
            Money amount = getAmount();
            Intrinsics.checkNotNull(bigDecimalValueOf);
            return amount.times(bigDecimalValueOf);
        }
        throw new IllegalStateException("Paycheck frequency should never be paused due to insufficient funds");
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        getCallbacks().onDepositFundsClicked(getRecommendedDeposit().getDecimalValue(), getFrequency());
        dismiss();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        getCallbacks().onChangePaymentMethodClicked();
        dismiss();
    }

    /* compiled from: InsufficientBuyingPowerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_AMOUNT", "", "ARG_FREQUENCY", "newInstance", "Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment;", "amount", "Lcom/robinhood/models/util/Money;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InsufficientBuyingPowerBottomSheetFragment newInstance(Money amount, ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            InsufficientBuyingPowerBottomSheetFragment insufficientBuyingPowerBottomSheetFragment = new InsufficientBuyingPowerBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("amount", amount);
            bundle.putSerializable("frequency", frequency);
            insufficientBuyingPowerBottomSheetFragment.setArguments(bundle);
            return insufficientBuyingPowerBottomSheetFragment;
        }
    }
}
