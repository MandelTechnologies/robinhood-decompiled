package com.robinhood.android.onboarding.directipo.p203ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.directipo.C22750R;
import com.robinhood.android.onboarding.directipo.databinding.FragmentDirectIpoLearnMoreBinding;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingLearnMore;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingLearnMoreAction;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOnboardingLearnMoreDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\t\u0010'\u001a\u00020(H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLearnMoreDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoLearnMoreBinding;", "getBinding", "()Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoLearnMoreBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMoreAction;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DirectIpoOnboardingLearnMoreDialogFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsRowView, UiDirectIpoOnboardingLearnMoreAction> adapter;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOnboardingLearnMoreDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoLearnMoreBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOnboardingLearnMoreDialogFragment() {
        super(C22750R.layout.fragment_direct_ipo_learn_more);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoOnboardingLearnMoreDialogFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLearnMoreDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoOnboardingLearnMoreDialogFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (UiDirectIpoOnboardingLearnMoreAction) obj2);
            }
        });
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    private final FragmentDirectIpoLearnMoreBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoLearnMoreBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment, RdsRowView of, final UiDirectIpoOnboardingLearnMoreAction item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLeadingIconImage(item.getIconUrl());
        of.setPrimaryText(item.getTitle());
        of.setSecondaryText(item.getDescription());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLearnMoreDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOnboardingLearnMoreDialogFragment.adapter$lambda$1$lambda$0(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment, UiDirectIpoOnboardingLearnMoreAction uiDirectIpoOnboardingLearnMoreAction) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(directIpoOnboardingLearnMoreDialogFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_DIRECT_IPO_ONBOARDING_LEARN_MORE, uiDirectIpoOnboardingLearnMoreAction.getId(), uiDirectIpoOnboardingLearnMoreAction.getActionUrl().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        Navigator navigator = directIpoOnboardingLearnMoreDialogFragment.getNavigator();
        Context contextRequireContext = directIpoOnboardingLearnMoreDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uiDirectIpoOnboardingLearnMoreAction.getActionUrl(), Boolean.FALSE, null, false, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentDirectIpoLearnMoreBinding binding = getBinding();
        ImageLoader imageLoader = getImageLoader();
        Companion companion = INSTANCE;
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(((UiDirectIpoOnboardingLearnMore) companion.getArgs((Fragment) this)).getIconUrl());
        ImageView directIpoOnboardingLearnMoreImage = binding.directIpoOnboardingLearnMoreImage;
        Intrinsics.checkNotNullExpressionValue(directIpoOnboardingLearnMoreImage, "directIpoOnboardingLearnMoreImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, directIpoOnboardingLearnMoreImage, null, null, 6, null);
        binding.directIpoOnboardingLearnMoreTitle.setText(((UiDirectIpoOnboardingLearnMore) companion.getArgs((Fragment) this)).getTitle());
        binding.directIpoOnboardingLearnMoreDescription.setText(Markwons.toSpanned$default(getMarkwon(), ((UiDirectIpoOnboardingLearnMore) companion.getArgs((Fragment) this)).getDescription(), null, 2, null));
        binding.directIpoOnboardingLearnMoreRecyclerView.setAdapter(this.adapter);
        RdsButton directIpoOnboardingLearnMoreDismiss = binding.directIpoOnboardingLearnMoreDismiss;
        Intrinsics.checkNotNullExpressionValue(directIpoOnboardingLearnMoreDismiss, "directIpoOnboardingLearnMoreDismiss");
        OnClickListeners.onClick(directIpoOnboardingLearnMoreDismiss, new Function0() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLearnMoreDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOnboardingLearnMoreDialogFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
        this.adapter.submitList(((UiDirectIpoOnboardingLearnMore) companion.getArgs((Fragment) this)).getActions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment) {
        directIpoOnboardingLearnMoreDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOnboardingLearnMoreDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLearnMoreDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLearnMoreDialogFragment;", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMore;", "<init>", "()V", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOnboardingLearnMoreDialogFragment, UiDirectIpoOnboardingLearnMore> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoOnboardingLearnMore getArgs(DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment) {
            return (UiDirectIpoOnboardingLearnMore) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOnboardingLearnMoreDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOnboardingLearnMoreDialogFragment newInstance(UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore) {
            return (DirectIpoOnboardingLearnMoreDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, uiDirectIpoOnboardingLearnMore);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment, UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOnboardingLearnMoreDialogFragment, uiDirectIpoOnboardingLearnMore);
        }
    }
}
