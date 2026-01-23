package com.robinhood.android.margin.p174ui.instant;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.lib.store.margin.MarginUpgradeStore;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.databinding.FragmentInstantUpgradeConfirmationBinding;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.MarginUpgrade;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InstantUpgradeConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\t\u0010*\u001a\u00020+H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeConfirmationBinding;", "getBindings", "()Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeConfirmationBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "accountNumberUrl", "", "getAccountNumberUrl", "()Ljava/lang/String;", "accountNumberUrl$delegate", "Lkotlin/Lazy;", "marginUpgradeStore", "Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;", "getMarginUpgradeStore", "()Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;", "setMarginUpgradeStore", "(Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onDialogDismissed", "id", "", "onSuccess", "marginUpgrade", "Lcom/robinhood/models/api/MarginUpgrade;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantUpgradeConfirmationFragment extends BaseFragment implements RegionGated {
    private static final String EXTRA_ACCOUNT_NUMBER_URL = "extraAccountNumberUrl";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountNumberUrl$delegate, reason: from kotlin metadata */
    private final Lazy accountNumberUrl;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public ExperimentsStore experimentsStore;
    public MarginUpgradeStore marginUpgradeStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstantUpgradeConfirmationFragment.class, "bindings", "getBindings()Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstantUpgradeConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginUpgrade.State.values().length];
            try {
                iArr[MarginUpgrade.State.APPROVING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginUpgrade.State.SUBMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginUpgrade.State.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarginUpgrade.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarginUpgrade.State.APPROVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InstantUpgradeConfirmationFragment() {
        super(C20999R.layout.fragment_instant_upgrade_confirmation);
        this.$$delegate_0 = new RegionGated2(InstantDepositRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, InstantUpgradeConfirmationFragment2.INSTANCE);
        this.accountNumberUrl = Fragments2.argument(this, EXTRA_ACCOUNT_NUMBER_URL);
    }

    private final FragmentInstantUpgradeConfirmationBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstantUpgradeConfirmationBinding) value;
    }

    private final String getAccountNumberUrl() {
        return (String) this.accountNumberUrl.getValue();
    }

    public final MarginUpgradeStore getMarginUpgradeStore() {
        MarginUpgradeStore marginUpgradeStore = this.marginUpgradeStore;
        if (marginUpgradeStore != null) {
            return marginUpgradeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginUpgradeStore");
        return null;
    }

    public final void setMarginUpgradeStore(MarginUpgradeStore marginUpgradeStore) {
        Intrinsics.checkNotNullParameter(marginUpgradeStore, "<set-?>");
        this.marginUpgradeStore = marginUpgradeStore;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton positiveBtn = getBindings().positiveBtn;
        Intrinsics.checkNotNullExpressionValue(positiveBtn, "positiveBtn");
        OnClickListeners.onClick(positiveBtn, new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstantUpgradeConfirmationFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(InstantUpgradeConfirmationFragment instantUpgradeConfirmationFragment) {
        instantUpgradeConfirmationFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getMarginUpgradeStore().upgradeToInstant(getAccountNumberUrl())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C210401(this), getActivityErrorHandler());
    }

    /* compiled from: InstantUpgradeConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeConfirmationFragment$onResume$1 */
    /* synthetic */ class C210401 extends FunctionReferenceImpl implements Function1<MarginUpgrade, Unit> {
        C210401(Object obj) {
            super(1, obj, InstantUpgradeConfirmationFragment.class, "onSuccess", "onSuccess(Lcom/robinhood/models/api/MarginUpgrade;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MarginUpgrade marginUpgrade) {
            invoke2(marginUpgrade);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MarginUpgrade p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstantUpgradeConfirmationFragment) this.receiver).onSuccess(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(MarginUpgrade marginUpgrade) {
        RdsPogView headerPog = getBindings().headerPog;
        Intrinsics.checkNotNullExpressionValue(headerPog, "headerPog");
        MarginUpgrade.State state = marginUpgrade.getState();
        MarginUpgrade.State state2 = MarginUpgrade.State.APPROVED;
        headerPog.setVisibility(state != state2 ? 0 : 8);
        ImageView successImage = getBindings().successImage;
        Intrinsics.checkNotNullExpressionValue(successImage, "successImage");
        successImage.setVisibility(marginUpgrade.getState() == state2 ? 0 : 8);
        getBindings().loadingView.hide();
        int i = WhenMappings.$EnumSwitchMapping$0[marginUpgrade.getState().ordinal()];
        if (i == 1 || i == 2) {
            getBindings().headerPog.setPictogram(requireContext().getDrawable(C20690R.drawable.pict_clr_rds_stopwatch));
            getBindings().titleTxt.setText(C20999R.string.robinhood_instant_pending_title);
            getBindings().messageTxt.setText(C20999R.string.robinhood_instant_pending_summary);
        } else if (i == 3 || i == 4) {
            getBindings().headerPog.setPictogram(requireContext().getDrawable(C20690R.drawable.pict_mono_rds_warning));
            getBindings().titleTxt.setText(C20999R.string.robinhood_instant_failed_title);
            getBindings().messageTxt.setText(C20999R.string.robinhood_instant_failed_summary);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            getBindings().titleTxt.setText(C20999R.string.robinhood_instant_upgraded_title);
            getBindings().messageTxt.setText(C20999R.string.gated_options_robinhood_instant_upgraded_summary);
        }
    }

    /* compiled from: InstantUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment$Companion;", "", "<init>", "()V", "EXTRA_ACCOUNT_NUMBER_URL", "", "newInstance", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment;", "accountNumberUrl", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InstantUpgradeConfirmationFragment newInstance(String accountNumberUrl) {
            InstantUpgradeConfirmationFragment instantUpgradeConfirmationFragment = new InstantUpgradeConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putString(InstantUpgradeConfirmationFragment.EXTRA_ACCOUNT_NUMBER_URL, accountNumberUrl);
            instantUpgradeConfirmationFragment.setArguments(bundle);
            return instantUpgradeConfirmationFragment;
        }
    }
}
