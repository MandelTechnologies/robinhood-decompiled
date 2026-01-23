package com.robinhood.android.paycheckhub.p213ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.FragmentPaycheckDetailBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: PaycheckDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckDetailBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bindViewState", "viewState", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailViewState;", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckDetailFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PaycheckDetailFragment() {
        super(C25434R.layout.fragment_paycheck_detail);
        this.duxo = OldDuxos.oldDuxo(this, PaycheckDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PaycheckDetailFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    private final PaycheckDetailDuxo getDuxo() {
        return (PaycheckDetailDuxo) this.duxo.getValue();
    }

    private final FragmentPaycheckDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPaycheckDetailBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C254431(this));
    }

    /* compiled from: PaycheckDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckDetailFragment$onStart$1 */
    /* synthetic */ class C254431 extends FunctionReferenceImpl implements Function1<PaycheckDetailViewState, Unit> {
        C254431(Object obj) {
            super(1, obj, PaycheckDetailFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckDetailViewState paycheckDetailViewState) throws Resources.NotFoundException {
            invoke2(paycheckDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckDetailViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckDetailFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(PaycheckDetailViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        FragmentPaycheckDetailBinding binding = getBinding();
        RhTextView paycheckAmount = binding.paycheckAmount;
        Intrinsics.checkNotNullExpressionValue(paycheckAmount, "paycheckAmount");
        TextViewsKt.setVisibilityText(paycheckAmount, viewState.getPaycheckAmountVisibilityText());
        RhTextView directDepositSourceAmountSubtitle = binding.directDepositSourceAmountSubtitle;
        Intrinsics.checkNotNullExpressionValue(directDepositSourceAmountSubtitle, "directDepositSourceAmountSubtitle");
        StringResource directDepositSubtitleVisibilityText = viewState.getDirectDepositSubtitleVisibilityText();
        CharSequence text3 = null;
        if (directDepositSubtitleVisibilityText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = directDepositSubtitleVisibilityText.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(directDepositSourceAmountSubtitle, text);
        RdsDataRowView rdsDataRowView = binding.statusSection;
        Integer statusSectionVisibilityValueText = viewState.getStatusSectionVisibilityValueText();
        rdsDataRowView.setVisibilityValueText(statusSectionVisibilityValueText != null ? getResources().getString(statusSectionVisibilityValueText.intValue()) : null);
        binding.directDepositSourceSection.setVisibilityValueText(viewState.getDirectDepositSourceSectionVisibilityValueText());
        binding.dateReceivedSection.setVisibilityValueText(viewState.getDateReceivedSectionVisibilityValueText());
        binding.netDepositSection.setVisibilityValueText(viewState.getNetDepositSectionVisibilityValueText());
        RdsDataRowView rdsDataRowView2 = binding.recurringBrokerageSplitsSection;
        StringResource recurringBrokerageSplitsSectionVisibilityValueText = viewState.getRecurringBrokerageSplitsSectionVisibilityValueText();
        if (recurringBrokerageSplitsSectionVisibilityValueText != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = recurringBrokerageSplitsSectionVisibilityValueText.getText(resources2);
        } else {
            text2 = null;
        }
        rdsDataRowView2.setVisibilityValueText(text2);
        RdsDataRowView rdsDataRowView3 = binding.recurringRetirementSplitsSection;
        StringResource recurringRetirementSplitsSectionVisibilityValueText = viewState.getRecurringRetirementSplitsSectionVisibilityValueText();
        if (recurringRetirementSplitsSectionVisibilityValueText != null) {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text3 = recurringRetirementSplitsSectionVisibilityValueText.getText(resources3);
        }
        rdsDataRowView3.setVisibilityValueText(text3);
    }

    /* compiled from: PaycheckDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckDetail;", "<init>", "()V", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PaycheckDetailFragment, LegacyFragmentKey.PaycheckDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PaycheckDetail paycheckDetail) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, paycheckDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PaycheckDetail getArgs(PaycheckDetailFragment paycheckDetailFragment) {
            return (LegacyFragmentKey.PaycheckDetail) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, paycheckDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckDetailFragment newInstance(LegacyFragmentKey.PaycheckDetail paycheckDetail) {
            return (PaycheckDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, paycheckDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckDetailFragment paycheckDetailFragment, LegacyFragmentKey.PaycheckDetail paycheckDetail) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, paycheckDetailFragment, paycheckDetail);
        }
    }
}
