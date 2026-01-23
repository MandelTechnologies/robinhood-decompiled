package com.robinhood.android.common.margin.p083ui.withdrawal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.databinding.FragmentMarginWithdrawalPromptBinding;
import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptFragment;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.MarginWithdrawalRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginWithdrawalPromptFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003234B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\t\u0010,\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198D@DX\u0084\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptDuxo;", "getDuxo", "()Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "promptCallbacks", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "getPromptCallbacks", "()Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "promptCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/common/margin/databinding/FragmentMarginWithdrawalPromptBinding;", "getBinding", "()Lcom/robinhood/android/common/margin/databinding/FragmentMarginWithdrawalPromptBinding;", "binding$delegate", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "value", "", "areButtonsLoading", "getAreButtonsLoading", "()Z", "setAreButtonsLoading", "(Z)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "bind", "state", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;", "showLoading", "hideLoading", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class MarginWithdrawalPromptFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: promptCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 promptCallbacks;
    private ToolbarScrollAnimator toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginWithdrawalPromptFragment.class, "promptCallbacks", "getPromptCallbacks()Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(MarginWithdrawalPromptFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/margin/databinding/FragmentMarginWithdrawalPromptBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MarginWithdrawalPromptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "", "onConfigureMarginWithdrawal", "", "enable", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfigureMarginWithdrawal(boolean enable);
    }

    /* compiled from: MarginWithdrawalPromptFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginSpendingProduct.values().length];
            try {
                iArr[MarginSpendingProduct.RHY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
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

    public MarginWithdrawalPromptFragment() {
        super(C11223R.layout.fragment_margin_withdrawal_prompt);
        this.$$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE, MarginWithdrawalRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, MarginWithdrawalPromptDuxo.class);
        this.promptCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof MarginWithdrawalPromptFragment.Callbacks)) {
                    parentFragment = null;
                }
                MarginWithdrawalPromptFragment.Callbacks callbacks = (MarginWithdrawalPromptFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof MarginWithdrawalPromptFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, MarginWithdrawalPromptFragment4.INSTANCE);
    }

    protected MarginWithdrawalPromptDuxo getDuxo() {
        return (MarginWithdrawalPromptDuxo) this.duxo.getValue();
    }

    protected Callbacks getPromptCallbacks() {
        return (Callbacks) this.promptCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentMarginWithdrawalPromptBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMarginWithdrawalPromptBinding) value;
    }

    protected final boolean getAreButtonsLoading() {
        return getBinding().turnOnBtn.getIsLoading();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setAreButtonsLoading(boolean z) {
        FragmentMarginWithdrawalPromptBinding binding = getBinding();
        binding.turnOnBtn.setLoading(z);
        binding.leaveOffBtn.setLoading(z);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScrollView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            this.toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbar, getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C112541(this));
    }

    /* compiled from: MarginWithdrawalPromptFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment$onStart$1 */
    /* synthetic */ class C112541 extends FunctionReferenceImpl implements Function1<MarginWithdrawalPromptViewState, Unit> {
        C112541(Object obj) {
            super(1, obj, MarginWithdrawalPromptFragment.class, "bind", "bind(Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MarginWithdrawalPromptViewState marginWithdrawalPromptViewState) throws Throwable {
            invoke2(marginWithdrawalPromptViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MarginWithdrawalPromptViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MarginWithdrawalPromptFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator != null) {
            ScrollView root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            toolbarScrollAnimator.subscribe(root, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MarginWithdrawalPromptViewState state) throws Throwable {
        int i;
        int i2;
        if (state instanceof MarginWithdrawalPromptViewState.Loading) {
            showLoading();
            return;
        }
        if (state instanceof MarginWithdrawalPromptViewState.Failure) {
            showLoading();
            getActivityErrorHandler().invoke2(((MarginWithdrawalPromptViewState.Failure) state).getThrowable());
            return;
        }
        if (!(state instanceof MarginWithdrawalPromptViewState.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        hideLoading();
        MarginWithdrawalPromptViewState.Success success = (MarginWithdrawalPromptViewState.Success) state;
        MarginSpendingProduct product = success.getProduct();
        ProductMarketingContent.Feature feature = success.getFeature();
        FragmentMarginWithdrawalPromptBinding binding = getBinding();
        binding.titleTxt.setText(feature.getTitle());
        binding.descriptionTxt.setText(feature.getDescription());
        RhTextView disclosureTxt = binding.disclosureTxt;
        Intrinsics.checkNotNullExpressionValue(disclosureTxt, "disclosureTxt");
        DisclosureContent disclosure = feature.getDisclosure();
        TextViewsKt.setVisibilityText(disclosureTxt, disclosure != null ? disclosure.getContent() : null);
        SparkleButton sparkleButton = binding.turnOnBtn;
        if ((product == null ? -1 : WhenMappings.$EnumSwitchMapping$0[product.ordinal()]) == 1) {
            i = C11223R.string.margin_withdrawal_prompt_enable_cta_decoupled;
        } else {
            i = C11223R.string.margin_spending_prompt_enable_cta_decoupled;
        }
        sparkleButton.setText(getString(i));
        RdsButton rdsButton = binding.leaveOffBtn;
        if ((product != null ? WhenMappings.$EnumSwitchMapping$0[product.ordinal()] : -1) == 1) {
            i2 = C11223R.string.margin_withdrawal_prompt_decline_cta_decoupled;
        } else {
            i2 = C11223R.string.margin_spending_prompt_decline_cta_decoupled;
        }
        rdsButton.setText(getString(i2));
        binding.turnOnBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment$bind$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.getPromptCallbacks().onConfigureMarginWithdrawal(true);
            }
        });
        binding.leaveOffBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment$bind$1$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.getPromptCallbacks().onConfigureMarginWithdrawal(false);
            }
        });
    }

    private final void showLoading() {
        FragmentMarginWithdrawalPromptBinding binding = getBinding();
        binding.loadingView.show();
        ConstraintLayout content = binding.content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.setVisibility(8);
    }

    private final void hideLoading() {
        FragmentMarginWithdrawalPromptBinding binding = getBinding();
        binding.loadingView.hide();
        ConstraintLayout content = binding.content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.setVisibility(0);
    }

    /* compiled from: MarginWithdrawalPromptFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Args;", "Landroid/os/Parcelable;", "marginSpendingProduct", "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "<init>", "(Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;)V", "getMarginSpendingProduct", "()Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final MarginSpendingProduct marginSpendingProduct;

        /* compiled from: MarginWithdrawalPromptFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : MarginSpendingProduct.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, MarginSpendingProduct marginSpendingProduct, int i, Object obj) {
            if ((i & 1) != 0) {
                marginSpendingProduct = args.marginSpendingProduct;
            }
            return args.copy(marginSpendingProduct);
        }

        /* renamed from: component1, reason: from getter */
        public final MarginSpendingProduct getMarginSpendingProduct() {
            return this.marginSpendingProduct;
        }

        public final Args copy(MarginSpendingProduct marginSpendingProduct) {
            return new Args(marginSpendingProduct);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.marginSpendingProduct == ((Args) other).marginSpendingProduct;
        }

        public int hashCode() {
            MarginSpendingProduct marginSpendingProduct = this.marginSpendingProduct;
            if (marginSpendingProduct == null) {
                return 0;
            }
            return marginSpendingProduct.hashCode();
        }

        public String toString() {
            return "Args(marginSpendingProduct=" + this.marginSpendingProduct + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            MarginSpendingProduct marginSpendingProduct = this.marginSpendingProduct;
            if (marginSpendingProduct == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                marginSpendingProduct.writeToParcel(dest, flags);
            }
        }

        public Args(MarginSpendingProduct marginSpendingProduct) {
            this.marginSpendingProduct = marginSpendingProduct;
        }

        public final MarginSpendingProduct getMarginSpendingProduct() {
            return this.marginSpendingProduct;
        }
    }

    /* compiled from: MarginWithdrawalPromptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Args;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginWithdrawalPromptFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginWithdrawalPromptFragment marginWithdrawalPromptFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginWithdrawalPromptFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginWithdrawalPromptFragment newInstance(Args args) {
            return (MarginWithdrawalPromptFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginWithdrawalPromptFragment marginWithdrawalPromptFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginWithdrawalPromptFragment, args);
        }
    }
}
