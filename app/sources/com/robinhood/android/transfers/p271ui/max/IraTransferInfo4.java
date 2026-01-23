package com.robinhood.android.transfers.p271ui.max;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.databinding.FragmentCreateTransferV2Binding;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.IraTransferInfo5;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: IraTransferInfo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"bindIraWithholding", "", "Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", "withholding", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$ShowIraDistributionTaxWithholdingInfo;", "onWithholdingClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "bindIraTransferInfo", "state", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoCallbacks;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IraTransferInfo4 {
    public static final void bindIraWithholding(FragmentCreateTransferV2Binding fragmentCreateTransferV2Binding, final CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo, final Function1<? super ApiIraDistributionTaxWithholding, Unit> onWithholdingClicked) {
        Intrinsics.checkNotNullParameter(fragmentCreateTransferV2Binding, "<this>");
        Intrinsics.checkNotNullParameter(onWithholdingClicked, "onWithholdingClicked");
        RdsSettingsRowView iraFederalWithholding = fragmentCreateTransferV2Binding.iraFederalWithholding;
        Intrinsics.checkNotNullExpressionValue(iraFederalWithholding, "iraFederalWithholding");
        iraFederalWithholding.setVisibility(showIraDistributionTaxWithholdingInfo != null && showIraDistributionTaxWithholdingInfo.getIsFederalAndStateTaxVisible() ? 0 : 8);
        RdsSettingsRowView iraStateWithholding = fragmentCreateTransferV2Binding.iraStateWithholding;
        Intrinsics.checkNotNullExpressionValue(iraStateWithholding, "iraStateWithholding");
        iraStateWithholding.setVisibility(showIraDistributionTaxWithholdingInfo != null && showIraDistributionTaxWithholdingInfo.getIsFederalAndStateTaxVisible() ? 0 : 8);
        RdsSettingsRowView iraMatchRemoval = fragmentCreateTransferV2Binding.iraMatchRemoval;
        Intrinsics.checkNotNullExpressionValue(iraMatchRemoval, "iraMatchRemoval");
        iraMatchRemoval.setVisibility(showIraDistributionTaxWithholdingInfo != null && showIraDistributionTaxWithholdingInfo.getIsEnokiFeeVisible() ? 0 : 8);
        if (showIraDistributionTaxWithholdingInfo == null) {
            return;
        }
        Resources resources = fragmentCreateTransferV2Binding.getRoot().getResources();
        if (showIraDistributionTaxWithholdingInfo.getIsFederalAndStateTaxVisible()) {
            RdsSettingsRowView rdsSettingsRowView = fragmentCreateTransferV2Binding.iraFederalWithholding;
            StringResource federalTaxWithholdingLabelText = showIraDistributionTaxWithholdingInfo.getFederalTaxWithholdingLabelText();
            Intrinsics.checkNotNull(resources);
            rdsSettingsRowView.setLabelText(federalTaxWithholdingLabelText.getText(resources));
            fragmentCreateTransferV2Binding.iraFederalWithholding.setValueText(showIraDistributionTaxWithholdingInfo.getFederalTaxWithholdingValueText().getText(resources));
            RdsSettingsRowView iraFederalWithholding2 = fragmentCreateTransferV2Binding.iraFederalWithholding;
            Intrinsics.checkNotNullExpressionValue(iraFederalWithholding2, "iraFederalWithholding");
            OnClickListeners.onClick(iraFederalWithholding2, new Function0() { // from class: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraTransferInfo4.bindIraWithholding$lambda$0(onWithholdingClicked, showIraDistributionTaxWithholdingInfo);
                }
            });
            RdsSettingsRowView iraStateWithholding2 = fragmentCreateTransferV2Binding.iraStateWithholding;
            Intrinsics.checkNotNullExpressionValue(iraStateWithholding2, "iraStateWithholding");
            iraStateWithholding2.setVisibility(0);
            fragmentCreateTransferV2Binding.iraStateWithholding.setLabelText(showIraDistributionTaxWithholdingInfo.getStateTaxWithholdingLabelText().getText(resources));
            fragmentCreateTransferV2Binding.iraStateWithholding.setValueText(showIraDistributionTaxWithholdingInfo.getStateTaxWithholdingValueText().getText(resources));
            RdsSettingsRowView iraStateWithholding3 = fragmentCreateTransferV2Binding.iraStateWithholding;
            Intrinsics.checkNotNullExpressionValue(iraStateWithholding3, "iraStateWithholding");
            OnClickListeners.onClick(iraStateWithholding3, new Function0() { // from class: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraTransferInfo4.bindIraWithholding$lambda$1(onWithholdingClicked, showIraDistributionTaxWithholdingInfo);
                }
            });
        }
        if (showIraDistributionTaxWithholdingInfo.getIsEnokiFeeVisible()) {
            RdsSettingsRowView rdsSettingsRowView2 = fragmentCreateTransferV2Binding.iraMatchRemoval;
            StringResource enokiRemovalFeeValueText = showIraDistributionTaxWithholdingInfo.getEnokiRemovalFeeValueText();
            Intrinsics.checkNotNull(resources);
            rdsSettingsRowView2.setValueText(enokiRemovalFeeValueText.getText(resources));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIraWithholding$lambda$0(Function1 function1, CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo) {
        function1.invoke(showIraDistributionTaxWithholdingInfo.getIraDistributionTaxWithholding());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIraWithholding$lambda$1(Function1 function1, CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo) {
        function1.invoke(showIraDistributionTaxWithholdingInfo.getIraDistributionTaxWithholding());
        return Unit.INSTANCE;
    }

    public static final void bindIraTransferInfo(FragmentCreateTransferV2Binding fragmentCreateTransferV2Binding, final IraTransferInfo5 iraTransferInfo5, final IraTransferInfo3 callbacks) {
        Intrinsics.checkNotNullParameter(fragmentCreateTransferV2Binding, "<this>");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Resources resources = fragmentCreateTransferV2Binding.getRoot().getResources();
        boolean z = iraTransferInfo5 instanceof IraTransferInfo5.Distribution;
        IraTransferInfo5.Distribution distribution = z ? (IraTransferInfo5.Distribution) iraTransferInfo5 : null;
        bindIraWithholding(fragmentCreateTransferV2Binding, distribution != null ? distribution.getWithholding() : null, new C306951(callbacks));
        if (iraTransferInfo5 instanceof IraTransferInfo5.Contribution) {
            RdsSettingsRowView iraDirectionDescription = fragmentCreateTransferV2Binding.iraDirectionDescription;
            Intrinsics.checkNotNullExpressionValue(iraDirectionDescription, "iraDirectionDescription");
            iraDirectionDescription.setVisibility(0);
            fragmentCreateTransferV2Binding.iraDirectionDescription.setLabelText(resources.getString(C30065R.string.transfer_ira_contribution_contribution_type_header));
            IraTransferInfo5.Contribution contribution = (IraTransferInfo5.Contribution) iraTransferInfo5;
            fragmentCreateTransferV2Binding.iraDirectionDescription.setValueText(resources.getString(contribution.getContributionRowValueRes()));
            RdsSettingsRowView iraDirectionDescription2 = fragmentCreateTransferV2Binding.iraDirectionDescription;
            Intrinsics.checkNotNullExpressionValue(iraDirectionDescription2, "iraDirectionDescription");
            OnClickListeners.onClick(iraDirectionDescription2, new Function0() { // from class: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraTransferInfo4.bindIraTransferInfo$lambda$2(iraTransferInfo5, callbacks);
                }
            });
            if (contribution.isRecurring()) {
                ConstraintLayout root = fragmentCreateTransferV2Binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                Drawable drawable = ViewsKt.getDrawable(root, C20690R.drawable.ic_rds_lock_24dp);
                fragmentCreateTransferV2Binding.iraTaxYear.setTrailingIcon(drawable);
                fragmentCreateTransferV2Binding.iraDirectionDescription.setTrailingIcon(drawable);
            } else {
                fragmentCreateTransferV2Binding.iraTaxYear.setTrailingIcon(null);
                fragmentCreateTransferV2Binding.iraDirectionDescription.setTrailingIcon(null);
            }
            Year taxYear = contribution.getTaxYear();
            if (taxYear == null) {
                RdsSettingsRowView iraTaxYear = fragmentCreateTransferV2Binding.iraTaxYear;
                Intrinsics.checkNotNullExpressionValue(iraTaxYear, "iraTaxYear");
                iraTaxYear.setVisibility(8);
                return;
            }
            RdsSettingsRowView iraTaxYear2 = fragmentCreateTransferV2Binding.iraTaxYear;
            Intrinsics.checkNotNullExpressionValue(iraTaxYear2, "iraTaxYear");
            iraTaxYear2.setVisibility(0);
            fragmentCreateTransferV2Binding.iraTaxYear.setValueText(taxYear.toString());
            RdsSettingsRowView iraTaxYear3 = fragmentCreateTransferV2Binding.iraTaxYear;
            Intrinsics.checkNotNullExpressionValue(iraTaxYear3, "iraTaxYear");
            OnClickListeners.onClick(iraTaxYear3, new Function0() { // from class: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraTransferInfo4.bindIraTransferInfo$lambda$4$lambda$3(iraTransferInfo5, callbacks);
                }
            });
            return;
        }
        if (z) {
            RdsSettingsRowView iraDirectionDescription3 = fragmentCreateTransferV2Binding.iraDirectionDescription;
            Intrinsics.checkNotNullExpressionValue(iraDirectionDescription3, "iraDirectionDescription");
            iraDirectionDescription3.setVisibility(0);
            fragmentCreateTransferV2Binding.iraDirectionDescription.setLabelText(resources.getString(C30065R.string.transfer_ira_distribution_type_header));
            fragmentCreateTransferV2Binding.iraDirectionDescription.setValueText(resources.getString(((IraTransferInfo5.Distribution) iraTransferInfo5).getDistributionRowValueRes()));
            RdsSettingsRowView iraDirectionDescription4 = fragmentCreateTransferV2Binding.iraDirectionDescription;
            Intrinsics.checkNotNullExpressionValue(iraDirectionDescription4, "iraDirectionDescription");
            OnClickListeners.onClick(iraDirectionDescription4, new Function0() { // from class: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraTransferInfo4.bindIraTransferInfo$lambda$6(callbacks, iraTransferInfo5);
                }
            });
            RdsSettingsRowView iraTaxYear4 = fragmentCreateTransferV2Binding.iraTaxYear;
            Intrinsics.checkNotNullExpressionValue(iraTaxYear4, "iraTaxYear");
            iraTaxYear4.setVisibility(8);
            return;
        }
        if (!(iraTransferInfo5 instanceof IraTransferInfo5.RothConversion)) {
            if (iraTransferInfo5 != null) {
                throw new NoWhenBranchMatchedException();
            }
            RdsSettingsRowView iraDirectionDescription5 = fragmentCreateTransferV2Binding.iraDirectionDescription;
            Intrinsics.checkNotNullExpressionValue(iraDirectionDescription5, "iraDirectionDescription");
            iraDirectionDescription5.setVisibility(8);
            RdsSettingsRowView iraTaxYear5 = fragmentCreateTransferV2Binding.iraTaxYear;
            Intrinsics.checkNotNullExpressionValue(iraTaxYear5, "iraTaxYear");
            iraTaxYear5.setVisibility(8);
            return;
        }
        RdsSettingsRowView iraDirectionDescription6 = fragmentCreateTransferV2Binding.iraDirectionDescription;
        Intrinsics.checkNotNullExpressionValue(iraDirectionDescription6, "iraDirectionDescription");
        iraDirectionDescription6.setVisibility(0);
        fragmentCreateTransferV2Binding.iraDirectionDescription.setLabelText(resources.getString(C30065R.string.transfer_ira_distribution_type_header));
        IraTransferInfo5.RothConversion rothConversion = (IraTransferInfo5.RothConversion) iraTransferInfo5;
        fragmentCreateTransferV2Binding.iraDirectionDescription.setValueText(rothConversion.getWithdrawalReason());
        RdsSettingsRowView rdsSettingsRowView = fragmentCreateTransferV2Binding.iraDirectionDescription;
        ConstraintLayout root2 = fragmentCreateTransferV2Binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        rdsSettingsRowView.setTrailingIcon(ViewsKt.getDrawable(root2, C20690R.drawable.ic_rds_lock_24dp));
        RdsSettingsRowView iraTaxYear6 = fragmentCreateTransferV2Binding.iraTaxYear;
        Intrinsics.checkNotNullExpressionValue(iraTaxYear6, "iraTaxYear");
        iraTaxYear6.setVisibility(0);
        fragmentCreateTransferV2Binding.iraTaxYear.setValueText(rothConversion.getTaxYearValue());
        RdsSettingsRowView rdsSettingsRowView2 = fragmentCreateTransferV2Binding.iraTaxYear;
        ConstraintLayout root3 = fragmentCreateTransferV2Binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        rdsSettingsRowView2.setTrailingIcon(ViewsKt.getDrawable(root3, C20690R.drawable.ic_rds_lock_24dp));
    }

    /* compiled from: IraTransferInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoKt$bindIraTransferInfo$1 */
    /* synthetic */ class C306951 extends FunctionReferenceImpl implements Function1<ApiIraDistributionTaxWithholding, Unit> {
        C306951(Object obj) {
            super(1, obj, IraTransferInfo3.class, "onIraTaxWithholdingClicked", "onIraTaxWithholdingClicked(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding) {
            invoke2(apiIraDistributionTaxWithholding);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ApiIraDistributionTaxWithholding p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((IraTransferInfo3) this.receiver).onIraTaxWithholdingClicked(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIraTransferInfo$lambda$2(IraTransferInfo5 iraTransferInfo5, IraTransferInfo3 iraTransferInfo3) {
        IraTransferInfo5.Contribution contribution = (IraTransferInfo5.Contribution) iraTransferInfo5;
        if (!contribution.isRecurring()) {
            iraTransferInfo3.onIraContributionTypeClicked(contribution.getValue().getAccount(), contribution.getCurrentContributionType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIraTransferInfo$lambda$4$lambda$3(IraTransferInfo5 iraTransferInfo5, IraTransferInfo3 iraTransferInfo3) {
        IraTransferInfo5.Contribution contribution = (IraTransferInfo5.Contribution) iraTransferInfo5;
        if (!contribution.isRecurring()) {
            iraTransferInfo3.onIraTaxYearClicked(contribution.getValue().getAccount());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIraTransferInfo$lambda$6(IraTransferInfo3 iraTransferInfo3, IraTransferInfo5 iraTransferInfo5) {
        iraTransferInfo3.onDistributionTypeClicked(((IraTransferInfo5.Distribution) iraTransferInfo5).getValue().getTransferAccount());
        return Unit.INSTANCE;
    }
}
