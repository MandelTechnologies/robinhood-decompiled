package com.robinhood.android.transfers.lib.validation;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponseDetails;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MaxAmountLimitCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MaxAmountLimitCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "Failure", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MaxAmountLimitCheck implements TransferCheck {
    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        List<ApiLimitsHubResponse> transferLimits;
        TransferDirectionV2 direction;
        Intrinsics.checkNotNullParameter(input, "input");
        if (!input.isLimitWireUpsellEnabled() || (transferLimits = input.getTransferLimits()) == null || (direction = input.getDirection()) == null || direction == TransferDirectionV2.INTER_ENTITY) {
            return null;
        }
        ArrayList<ApiLimitsHubResponse> arrayList = new ArrayList();
        for (Object obj : transferLimits) {
            ApiLimitsHubResponseDetails details = ((ApiLimitsHubResponse) obj).getDetails();
            if ((details != null ? details.getDirection() : null) == input.getDirection().toTransferDirection()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ApiLimitsHubResponse apiLimitsHubResponse : arrayList) {
            List<ApiAmountLimit> amount_limits = apiLimitsHubResponse.getAmount_limits();
            if (amount_limits == null) {
                amount_limits = CollectionsKt.emptyList();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : amount_limits) {
                if (((ApiAmountLimit) obj2).getLimits_interval() == LimitsInterval.DAILY) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(Tuples4.m3642to((ApiAmountLimit) it.next(), apiLimitsHubResponse.getProduct_type()));
            }
            CollectionsKt.addAll(arrayList2, arrayList4);
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            BigDecimal total_amount = ((ApiAmountLimit) ((Tuples2) next).component1()).getTotal_amount();
            do {
                Object next2 = it2.next();
                BigDecimal total_amount2 = ((ApiAmountLimit) ((Tuples2) next2).component1()).getTotal_amount();
                if (total_amount.compareTo(total_amount2) < 0) {
                    next = next2;
                    total_amount = total_amount2;
                }
            } while (it2.hasNext());
        }
        Tuples2 tuples2 = (Tuples2) next;
        ApiAmountLimit apiAmountLimit = (ApiAmountLimit) tuples2.component1();
        TransferProductType transferProductType = (TransferProductType) tuples2.component2();
        if (input.getAmount().compareTo(apiAmountLimit.getTotal_amount()) <= 0 || !Failure.INSTANCE.getAPPLICABLE_PRODUCT_TYPES$lib_transfers_externalDebug().contains(transferProductType)) {
            return null;
        }
        return new Failure(direction, apiAmountLimit.getTotal_amount());
    }

    /* compiled from: MaxAmountLimitCheck.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MaxAmountLimitCheck$Failure;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "maxAmount", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Ljava/math/BigDecimal;)V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Failure implements ValidationFailure {
        private final TransferDirectionV2 direction;
        private final BigDecimal maxAmount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Set<TransferProductType> APPLICABLE_PRODUCT_TYPES = SetsKt.setOf((Object[]) new TransferProductType[]{TransferProductType.ORIGINATED_ACH, TransferProductType.INSTANT_BANK_TRANSFER});

        /* compiled from: MaxAmountLimitCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferDirectionV2.values().length];
                try {
                    iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final TransferDirectionV2 getDirection() {
            return this.direction;
        }

        /* renamed from: component2, reason: from getter */
        private final BigDecimal getMaxAmount() {
            return this.maxAmount;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, TransferDirectionV2 transferDirectionV2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                transferDirectionV2 = failure.direction;
            }
            if ((i & 2) != 0) {
                bigDecimal = failure.maxAmount;
            }
            return failure.copy(transferDirectionV2, bigDecimal);
        }

        public final Failure copy(TransferDirectionV2 direction, BigDecimal maxAmount) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            return new Failure(direction, maxAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.direction == failure.direction && Intrinsics.areEqual(this.maxAmount, failure.maxAmount);
        }

        public int hashCode() {
            return (this.direction.hashCode() * 31) + this.maxAmount.hashCode();
        }

        public String toString() {
            return "Failure(direction=" + this.direction + ", maxAmount=" + this.maxAmount + ")";
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            int i;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = C30383R.string.limits_hub_amount_error_wires_upsell_dialog_message;
            NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
            BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.maxAmount);
            Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
            spannableStringBuilder.append((CharSequence) activity.getString(i2, strikePriceFormat.format(bigDecimalM822m)));
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create(activity).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i3 == 1) {
                i = C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_deposit;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        throw new IllegalStateException("Unexpected direction");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                i = C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_withdrawal;
            }
            RhDialogFragment.Builder negativeButton = theme.setId(i).setTitle(C30383R.string.limits_hub_error_dialog_title, new Object[0]).setMessage(spannedString).setDismissOnLinkTextClick(true).setPositiveButton(C30383R.string.limits_hub_amount_error_wires_upsell_dialog_primary_button, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "maxAmountLimitError", false, 4, null);
        }

        public Failure(TransferDirectionV2 direction, BigDecimal maxAmount) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            this.direction = direction;
            this.maxAmount = maxAmount;
        }

        /* compiled from: MaxAmountLimitCheck.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MaxAmountLimitCheck$Failure$Companion;", "", "<init>", "()V", "APPLICABLE_PRODUCT_TYPES", "", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "getAPPLICABLE_PRODUCT_TYPES$lib_transfers_externalDebug", "()Ljava/util/Set;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Set<TransferProductType> getAPPLICABLE_PRODUCT_TYPES$lib_transfers_externalDebug() {
                return Failure.APPLICABLE_PRODUCT_TYPES;
            }
        }
    }
}
