package com.robinhood.android.transfers.lib.validation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: IraDistributionCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraDistributionCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "ARG_LOGGING_IDENTIFIER", "", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "EnokiRemovalFee", "PreDistributionReview", "FailureEntryPoint", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraDistributionCheck implements TransferCheck {
    public static final String ARG_LOGGING_IDENTIFIER = "iraDistributionCheckLoggingIdentifier";
    public static final IraDistributionCheck INSTANCE = new IraDistributionCheck();

    /* compiled from: IraDistributionCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraDistributionCheck$FailureEntryPoint;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface FailureEntryPoint {
        EventLogger eventLogger();

        Markwon markwon();
    }

    /* compiled from: IraDistributionCheck.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraDistributionCheck$EnokiRemovalFee;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_IRA_DISTRIBUTION_FEE, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;)V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class EnokiRemovalFee implements ValidationFailure {
        public static final String FALLBACK_LOGGING_IDENTIFIER = "confirm-enoki-clawback";
        private final BigDecimal amount;
        private final ApiIraDistributionFee iraDistributionFee;

        /* renamed from: component1, reason: from getter */
        private final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        private final ApiIraDistributionFee getIraDistributionFee() {
            return this.iraDistributionFee;
        }

        public static /* synthetic */ EnokiRemovalFee copy$default(EnokiRemovalFee enokiRemovalFee, BigDecimal bigDecimal, ApiIraDistributionFee apiIraDistributionFee, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = enokiRemovalFee.amount;
            }
            if ((i & 2) != 0) {
                apiIraDistributionFee = enokiRemovalFee.iraDistributionFee;
            }
            return enokiRemovalFee.copy(bigDecimal, apiIraDistributionFee);
        }

        public final EnokiRemovalFee copy(BigDecimal amount, ApiIraDistributionFee iraDistributionFee) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new EnokiRemovalFee(amount, iraDistributionFee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnokiRemovalFee)) {
                return false;
            }
            EnokiRemovalFee enokiRemovalFee = (EnokiRemovalFee) other;
            return Intrinsics.areEqual(this.amount, enokiRemovalFee.amount) && Intrinsics.areEqual(this.iraDistributionFee, enokiRemovalFee.iraDistributionFee);
        }

        public int hashCode() {
            int iHashCode = this.amount.hashCode() * 31;
            ApiIraDistributionFee apiIraDistributionFee = this.iraDistributionFee;
            return iHashCode + (apiIraDistributionFee == null ? 0 : apiIraDistributionFee.hashCode());
        }

        public String toString() {
            return "EnokiRemovalFee(amount=" + this.amount + ", iraDistributionFee=" + this.iraDistributionFee + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            String logging_identifier;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            FailureEntryPoint failureEntryPoint = (FailureEntryPoint) ((ApplicationComponentManagerHolder) ((Application) applicationContext)).getComponentManager().get();
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ira_distribution_enoki_removal);
            ApiIraDistributionFee apiIraDistributionFee = this.iraDistributionFee;
            ApiIraDistributionFee.EnokiRemovalAlert enoki_removal_alert = apiIraDistributionFee != null ? apiIraDistributionFee.getEnoki_removal_alert() : null;
            if (enoki_removal_alert != null) {
                BigDecimal bigDecimal = this.amount;
                ApiIraDistributionFee apiIraDistributionFee2 = this.iraDistributionFee;
                if (BigDecimals7.m2977eq(bigDecimal, apiIraDistributionFee2 != null ? apiIraDistributionFee2.getAmount() : null)) {
                    Spanned markdown = failureEntryPoint.markwon().toMarkdown(enoki_removal_alert.getBody_markdown());
                    Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
                    logging_identifier = enoki_removal_alert.getLogging_identifier();
                    id.setTitle(enoki_removal_alert.getTitle()).setMessage(markdown).setPositiveButton(enoki_removal_alert.getConfirm_button_title()).setNegativeButton(enoki_removal_alert.getDismiss_button_title());
                } else {
                    id.setTitle(C30383R.string.transfer_ira_distribution_enoki_removal_error_title, new Object[0]).setMessage(C30383R.string.transfer_ira_distribution_enoki_removal_error_message, Money.format$default(Money3.toMoney(this.amount, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_action_learn_more, new Object[0]);
                    logging_identifier = FALLBACK_LOGGING_IDENTIFIER;
                }
            }
            String str = logging_identifier;
            EventLogger.DefaultImpls.logAppear$default(failureEntryPoint.eventLogger(), null, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, str, null, 4, 0 == true ? 1 : 0), null, null, 25, null);
            Bundle bundle = new Bundle();
            bundle.putString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER, str);
            RhDialogFragment.Builder passthroughArgs = id.setPassthroughArgs(bundle);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, str, false, 4, null);
        }

        public EnokiRemovalFee(BigDecimal amount, ApiIraDistributionFee apiIraDistributionFee) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
            this.iraDistributionFee = apiIraDistributionFee;
        }
    }

    /* compiled from: IraDistributionCheck.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraDistributionCheck$PreDistributionReview;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "preReviewAlert", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding$DistributionAlert;", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding$DistributionAlert;)V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class PreDistributionReview implements ValidationFailure {
        private final ApiIraDistributionTaxWithholding.DistributionAlert preReviewAlert;

        /* renamed from: component1, reason: from getter */
        private final ApiIraDistributionTaxWithholding.DistributionAlert getPreReviewAlert() {
            return this.preReviewAlert;
        }

        public static /* synthetic */ PreDistributionReview copy$default(PreDistributionReview preDistributionReview, ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                distributionAlert = preDistributionReview.preReviewAlert;
            }
            return preDistributionReview.copy(distributionAlert);
        }

        public final PreDistributionReview copy(ApiIraDistributionTaxWithholding.DistributionAlert preReviewAlert) {
            Intrinsics.checkNotNullParameter(preReviewAlert, "preReviewAlert");
            return new PreDistributionReview(preReviewAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreDistributionReview) && Intrinsics.areEqual(this.preReviewAlert, ((PreDistributionReview) other).preReviewAlert);
        }

        public int hashCode() {
            return this.preReviewAlert.hashCode();
        }

        public String toString() {
            return "PreDistributionReview(preReviewAlert=" + this.preReviewAlert + ")";
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            FailureEntryPoint failureEntryPoint = (FailureEntryPoint) ((ApplicationComponentManagerHolder) ((Application) applicationContext)).getComponentManager().get();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ByteString byteString = null;
            EventLogger.DefaultImpls.logAppear$default(failureEntryPoint.eventLogger(), null, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.ALERT, this.preReviewAlert.getLogging_identifier(), byteString, 4, defaultConstructorMarker), null, null, 25, null);
            Spanned markdown = failureEntryPoint.markwon().toMarkdown(this.preReviewAlert.getBody_markdown());
            Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ira_distribution_pre_review).setTitle(this.preReviewAlert.getTitle()).setMessage(markdown).setPositiveButton(this.preReviewAlert.getConfirm_button_title()).setNegativeButton(this.preReviewAlert.getDismiss_button_title());
            Bundle bundle = new Bundle();
            bundle.putString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER, this.preReviewAlert.getLogging_identifier());
            RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(bundle);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, this.preReviewAlert.getLogging_identifier(), false, 4, null);
        }

        public PreDistributionReview(ApiIraDistributionTaxWithholding.DistributionAlert preReviewAlert) {
            Intrinsics.checkNotNullParameter(preReviewAlert, "preReviewAlert");
            this.preReviewAlert = preReviewAlert;
        }
    }

    private IraDistributionCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getIraDistribution() == null) {
            return null;
        }
        if ((input.getIraDistributionFee() == null || !BigDecimals7.m2977eq(input.getAmount(), input.getIraDistributionFee().getAmount()) || input.getIraDistributionFee().getEnoki_removal_alert() != null) && !input.getOverrideDistributionEnokiRemovalAlert()) {
            return new EnokiRemovalFee(input.getAmount(), input.getIraDistributionFee());
        }
        if (input.getDistributionPreReviewAlert() == null || input.getOverrideDistributionPreReviewAlert()) {
            return null;
        }
        return new PreDistributionReview(input.getDistributionPreReviewAlert());
    }
}
