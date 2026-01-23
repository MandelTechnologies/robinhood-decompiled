package com.robinhood.android.transfers.ach.p265ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ActivityNoSnackbarErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentReviewAchTransferBinding;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseReviewAchTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 >2\u00020\u0001:\u0002=>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0016J\b\u00102\u001a\u00020\"H\u0015J\b\u00103\u001a\u00020\"H\u0004J\b\u00104\u001a\u00020\"H\u0004J\b\u00105\u001a\u00020\"H\u0004J\u0010\u00106\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0004J\u0010\u00109\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentReviewAchTransferBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentReviewAchTransferBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "transferContext$delegate", "Lkotlin/Lazy;", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "amount$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "onCreateButtonClicked", "onLoading", "onFinishLoading", "onSubmitting", "onError", "error", "", "handleError", "onSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "AchTransferResult", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseReviewAchTransferFragment extends BaseFragment {
    public static final String EXTRA_AMOUNT = "extraAmount";
    public static final String EXTRA_TRANSFER_CONTEXT = "extraTransferContext";

    /* renamed from: amount$delegate, reason: from kotlin metadata */
    private final Lazy amount;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public CardManager cardManager;

    /* renamed from: transferContext$delegate, reason: from kotlin metadata */
    private final Lazy transferContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseReviewAchTransferFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentReviewAchTransferBinding;", 0))};
    public static final int $stable = 8;

    protected abstract TransferDirection getDirection();

    public BaseReviewAchTransferFragment() {
        super(C30082R.layout.fragment_review_ach_transfer);
        this.binding = ViewBinding5.viewBinding(this, BaseReviewAchTransferFragment2.INSTANCE);
        this.transferContext = Fragments2.argument(this, "extraTransferContext");
        this.amount = Fragments2.argument(this, EXTRA_AMOUNT);
    }

    protected final FragmentReviewAchTransferBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentReviewAchTransferBinding) value;
    }

    public final TransferContext getTransferContext() {
        return (TransferContext) this.transferContext.getValue();
    }

    protected final BigDecimal getAmount() {
        return (BigDecimal) this.amount.getValue();
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentReviewAchTransferBinding binding = getBinding();
        RdsButton addWithdrawBtn = binding.addWithdrawBtn;
        Intrinsics.checkNotNullExpressionValue(addWithdrawBtn, "addWithdrawBtn");
        OnClickListeners.onClick(addWithdrawBtn, new BaseReviewAchTransferFragment3(this));
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        TransferDirection direction = getDirection();
        binding.addWithdrawLabelTxt.setText(AchTransferStringHelper.getReviewTransferHeader(resources, direction));
        binding.addWithdrawBtn.setText(AchTransferStringHelper.getReviewTransferButton(resources, direction));
        binding.amountTxt.setText(Formats.getCurrencyFormat().format(getAmount()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getTransferContext() instanceof TransferContext.QueuedDeposit) {
            return;
        }
        toolbar.setTitle(getString(C30082R.string.ach_transfer_review_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getTransferContext().toString();
    }

    protected void onCreateButtonClicked() {
        getBinding().addWithdrawBtn.setEnabled(false);
    }

    protected final void onLoading() {
        getBinding().loadingView.show();
    }

    protected final void onFinishLoading() {
        getBinding().loadingView.hide();
    }

    protected final void onSubmitting() {
        getBinding().loadingView.show();
    }

    protected final void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AnalyticsLogger.DefaultImpls.logError$default(getAnalytics(), AnalyticsStrings.ERROR_ACH_TRANSFER, null, 2, null);
        setTransitionReason("error");
        getBinding().addWithdrawBtn.setEnabled(true);
        if (getBinding().loadingView.getVisibility() == 0) {
            getBinding().loadingView.hide();
        }
        handleError(error);
        getParentFragmentManager().popBackStack();
    }

    private final void handleError(Throwable error) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AbsErrorHandler.handleError$default(new ActivityNoSnackbarErrorHandler(fragmentActivityRequireActivity), error, false, 2, null);
    }

    public void onSuccess(AchTransferResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getTransferContext().shouldRefreshCardStackUponCompletion()) {
            getCardManager().invalidateCardsBestEffort();
        }
        setTransitionReason("success");
    }

    /* compiled from: BaseReviewAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AutomaticDeposit;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "getAutomaticDeposit", "()Lcom/robinhood/models/db/AutomaticDeposit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AchTransferResult {
        public static final int $stable = 8;
        private final AchRelationship achRelationship;
        private final AchTransfer achTransfer;
        private final AutomaticDeposit automaticDeposit;

        public AchTransferResult() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ AchTransferResult copy$default(AchTransferResult achTransferResult, AchRelationship achRelationship, AchTransfer achTransfer, AutomaticDeposit automaticDeposit, int i, Object obj) {
            if ((i & 1) != 0) {
                achRelationship = achTransferResult.achRelationship;
            }
            if ((i & 2) != 0) {
                achTransfer = achTransferResult.achTransfer;
            }
            if ((i & 4) != 0) {
                automaticDeposit = achTransferResult.automaticDeposit;
            }
            return achTransferResult.copy(achRelationship, achTransfer, automaticDeposit);
        }

        /* renamed from: component1, reason: from getter */
        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* renamed from: component2, reason: from getter */
        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        /* renamed from: component3, reason: from getter */
        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }

        public final AchTransferResult copy(AchRelationship achRelationship, AchTransfer achTransfer, AutomaticDeposit automaticDeposit) {
            return new AchTransferResult(achRelationship, achTransfer, automaticDeposit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AchTransferResult)) {
                return false;
            }
            AchTransferResult achTransferResult = (AchTransferResult) other;
            return Intrinsics.areEqual(this.achRelationship, achTransferResult.achRelationship) && Intrinsics.areEqual(this.achTransfer, achTransferResult.achTransfer) && Intrinsics.areEqual(this.automaticDeposit, achTransferResult.automaticDeposit);
        }

        public int hashCode() {
            AchRelationship achRelationship = this.achRelationship;
            int iHashCode = (achRelationship == null ? 0 : achRelationship.hashCode()) * 31;
            AchTransfer achTransfer = this.achTransfer;
            int iHashCode2 = (iHashCode + (achTransfer == null ? 0 : achTransfer.hashCode())) * 31;
            AutomaticDeposit automaticDeposit = this.automaticDeposit;
            return iHashCode2 + (automaticDeposit != null ? automaticDeposit.hashCode() : 0);
        }

        public String toString() {
            return "AchTransferResult(achRelationship=" + this.achRelationship + ", achTransfer=" + this.achTransfer + ", automaticDeposit=" + this.automaticDeposit + ")";
        }

        public AchTransferResult(AchRelationship achRelationship, AchTransfer achTransfer, AutomaticDeposit automaticDeposit) {
            this.achRelationship = achRelationship;
            this.achTransfer = achTransfer;
            this.automaticDeposit = automaticDeposit;
        }

        public /* synthetic */ AchTransferResult(AchRelationship achRelationship, AchTransfer achTransfer, AutomaticDeposit automaticDeposit, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : achRelationship, (i & 2) != 0 ? null : achTransfer, (i & 4) != 0 ? null : automaticDeposit);
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }
    }
}
