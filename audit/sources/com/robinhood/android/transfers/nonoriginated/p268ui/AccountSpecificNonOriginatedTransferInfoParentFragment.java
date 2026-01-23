package com.robinhood.android.transfers.nonoriginated.p268ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.contracts.AccountSpecificNonOriginatedTransferInfo;
import com.robinhood.android.transfers.nonoriginated.p268ui.NonOriginatedTransferInfoAccountSelectionFragment;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.rosetta.common.CurrencyDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSpecificNonOriginatedTransferInfoParentFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/AccountSpecificNonOriginatedTransferInfoParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "transferType", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getTransferType", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "transferType$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showConfirmation", "screenData", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "exitNonOriginatedAccountInfo", "onAccountRowClick", "robinhoodAccount", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "Companion", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AccountSpecificNonOriginatedTransferInfoParentFragment extends BaseFragment implements NonOriginatedAccountInfoFragment.Callbacks, NonOriginatedTransferInfoAccountSelectionFragment.Callbacks {

    /* renamed from: transferType$delegate, reason: from kotlin metadata */
    private final Lazy transferType;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountSpecificNonOriginatedTransferInfoParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.transferType = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.nonoriginated.ui.AccountSpecificNonOriginatedTransferInfoParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSpecificNonOriginatedTransferInfoParentFragment.transferType_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final NonOriginatedTransferTypeDto getTransferType() {
        return (NonOriginatedTransferTypeDto) this.transferType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NonOriginatedTransferTypeDto transferType_delegate$lambda$0(AccountSpecificNonOriginatedTransferInfoParentFragment accountSpecificNonOriginatedTransferInfoParentFragment) {
        return ((AccountSpecificNonOriginatedTransferInfo) INSTANCE.getArgs((Fragment) accountSpecificNonOriginatedTransferInfoParentFragment)).getTransferType();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, NonOriginatedTransferInfoAccountSelectionFragment.INSTANCE.newInstance((Parcelable) new NonOriginatedTransferInfoAccountSelectionFragment.Args(getTransferType())));
        }
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void showConfirmation(StandardScreenDataDto screenData) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        requireActivity().finish();
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void exitNonOriginatedAccountInfo() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionFragment.Callbacks
    public void onAccountRowClick(RobinhoodAccountDto robinhoodAccount) {
        Intrinsics.checkNotNullParameter(robinhoodAccount, "robinhoodAccount");
        replaceFragment(NonOriginatedAccountInfoFragment.INSTANCE.newInstance((Parcelable) new NonOriginatedAccountInfoFragment.Args(getTransferType(), CurrencyDto.USD, robinhoodAccount, null, 8, null)));
    }

    /* compiled from: AccountSpecificNonOriginatedTransferInfoParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/AccountSpecificNonOriginatedTransferInfoParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/nonoriginated/ui/AccountSpecificNonOriginatedTransferInfoParentFragment;", "Lcom/robinhood/android/transfers/contracts/AccountSpecificNonOriginatedTransferInfo;", "<init>", "()V", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountSpecificNonOriginatedTransferInfoParentFragment, AccountSpecificNonOriginatedTransferInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountSpecificNonOriginatedTransferInfo accountSpecificNonOriginatedTransferInfo) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountSpecificNonOriginatedTransferInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountSpecificNonOriginatedTransferInfo getArgs(AccountSpecificNonOriginatedTransferInfoParentFragment accountSpecificNonOriginatedTransferInfoParentFragment) {
            return (AccountSpecificNonOriginatedTransferInfo) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountSpecificNonOriginatedTransferInfoParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSpecificNonOriginatedTransferInfoParentFragment newInstance(AccountSpecificNonOriginatedTransferInfo accountSpecificNonOriginatedTransferInfo) {
            return (AccountSpecificNonOriginatedTransferInfoParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountSpecificNonOriginatedTransferInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSpecificNonOriginatedTransferInfoParentFragment accountSpecificNonOriginatedTransferInfoParentFragment, AccountSpecificNonOriginatedTransferInfo accountSpecificNonOriginatedTransferInfo) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountSpecificNonOriginatedTransferInfoParentFragment, accountSpecificNonOriginatedTransferInfo);
        }
    }
}
