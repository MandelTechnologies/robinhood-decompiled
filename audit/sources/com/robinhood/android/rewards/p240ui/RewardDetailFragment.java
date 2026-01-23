package com.robinhood.android.rewards.p240ui;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rewards.C27314R;
import com.robinhood.android.rewards.databinding.FragmentRewardDetailBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.RewardData;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.contracts.RewardDetailFragmentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/RewardDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/rewards/databinding/FragmentRewardDetailBinding;", "getBinding", "()Lcom/robinhood/android/rewards/databinding/FragmentRewardDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/rewards/ui/RewardDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/rewards/ui/RewardDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "showClaimRewardSection", "reward", "Lcom/robinhood/models/db/RewardData;", "hideClaimRewardSection", "openDeepLink", DeepLink.INTENT_ARG_DEEP_LINK, "", "Companion", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardDetailFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/rewards/databinding/FragmentRewardDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public RewardDetailFragment() {
        super(C27314R.layout.fragment_reward_detail);
        this.binding = ViewBinding5.viewBinding(this, RewardDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RewardDetailDuxo.class);
    }

    private final FragmentRewardDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardDetailBinding) value;
    }

    private final RewardDetailDuxo getDuxo() {
        return (RewardDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardDetailFragment.onStart$lambda$3(this.f$0, (RewardDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RewardDetailFragment rewardDetailFragment, RewardDetailViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentRewardDetailBinding binding = rewardDetailFragment.getBinding();
        binding.rewardDetailHeader.setText(rewardDetailFragment.getResources().getString(state.getHeader()));
        RhTextView rewardDetailSubheader = binding.rewardDetailSubheader;
        Intrinsics.checkNotNullExpressionValue(rewardDetailSubheader, "rewardDetailSubheader");
        TextViewsKt.setVisibilityText(rewardDetailSubheader, state.getSubheader());
        RewardData rewardData = state.getRewardData();
        if (rewardData != null) {
            RdsDataRowView rdsDataRowView = binding.rewardDetailStatus;
            Resources resources = rewardDetailFragment.getResources();
            Integer labelResId = state.getLabelResId();
            Intrinsics.checkNotNull(labelResId);
            rdsDataRowView.setValueText(resources.getString(labelResId.intValue()));
            binding.rewardDetailDate.setValueText(state.getRewardCreatedAt());
            binding.rewardDetailReward.setValueText(state.getRewardDescription());
            binding.rewardDetailRewardValue.setValueText(state.getRewardValue());
            if (state.isRewardClaimable()) {
                rewardDetailFragment.showClaimRewardSection(rewardData);
            } else {
                rewardDetailFragment.hideClaimRewardSection();
            }
            RdsDataRowView rdsDataRowView2 = binding.rewardDetailBackupWithholding;
            WithholdingAmount backupWithholdingResponse = state.getBackupWithholdingResponse();
            rdsDataRowView2.setVisibilityValueText(backupWithholdingResponse != null ? WithholdingAmount2.getBackupWithholdingAmountString(backupWithholdingResponse) : null);
            RdsDataRowView rdsDataRowView3 = binding.rewardDetailNetCredit;
            WithholdingAmount backupWithholdingResponse2 = state.getBackupWithholdingResponse();
            rdsDataRowView3.setVisibilityValueText(backupWithholdingResponse2 != null ? WithholdingAmount2.getNetCreditAmountString(backupWithholdingResponse2, state.getRewardValueMoney()) : null);
        }
        return Unit.INSTANCE;
    }

    private final void showClaimRewardSection(final RewardData reward) {
        getBinding().rewardDetailCostValue.setVisibility(0);
        RdsInfoBannerView rdsInfoBannerView = getBinding().rewardClaimBanner;
        rdsInfoBannerView.setVisibility(0);
        rdsInfoBannerView.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.rewards.ui.RewardDetailFragment$showClaimRewardSection$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.openDeepLink(reward.getClaimDeeplink());
            }
        });
    }

    private final void hideClaimRewardSection() {
        getBinding().rewardDetailCostValue.setVisibility(8);
        getBinding().rewardClaimBanner.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDeepLink(String deepLink) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Uri uri = Uri.parse(deepLink);
        if (!getNavigator().isDeepLinkSupported(uri)) {
            uri = null;
        }
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, Boolean.FALSE, null, false, null, 56, null);
    }

    /* compiled from: RewardDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/RewardDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rewards/ui/RewardDetailFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RewardDetailFragmentKey>, FragmentWithArgsCompanion<RewardDetailFragment, RewardDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RewardDetailFragmentKey getArgs(RewardDetailFragment rewardDetailFragment) {
            return (RewardDetailFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardDetailFragment newInstance(RewardDetailFragmentKey rewardDetailFragmentKey) {
            return (RewardDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rewardDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardDetailFragment rewardDetailFragment, RewardDetailFragmentKey rewardDetailFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardDetailFragment, rewardDetailFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RewardDetailFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return RewardDetailFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
