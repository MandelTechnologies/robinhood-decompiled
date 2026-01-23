package com.robinhood.android.cash.transaction.p079ui.category;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.databinding.MerchantCategoryBottomSheetFragmentBinding;
import com.robinhood.android.cash.transaction.p079ui.category.MerchantChangeCategoryViewState;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MerchantChangeCategoryBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002)*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\t\u0010\"\u001a\u00020#H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/transaction/databinding/MerchantCategoryBottomSheetFragmentBinding;", "getBinding", "()Lcom/robinhood/android/cash/transaction/databinding/MerchantCategoryBottomSheetFragmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState$RowState;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "viewState", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "MerchantCategoryRowInflater", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MerchantChangeCategoryBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsRowView, MerchantChangeCategoryViewState.RowState> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MerchantChangeCategoryBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/transaction/databinding/MerchantCategoryBottomSheetFragmentBinding;", 0))};

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

    public MerchantChangeCategoryBottomSheetFragment() {
        super(C10421R.layout.merchant_category_bottom_sheet_fragment);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, MerchantChangeCategoryBottomSheetFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, MerchantChangeCategoryDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(MerchantCategoryRowInflater.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantChangeCategoryBottomSheetFragment.adapter$lambda$0((MerchantChangeCategoryViewState.RowState) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MerchantChangeCategoryBottomSheetFragment.adapter$lambda$2(this.f$0, (RdsRowView) obj, (MerchantChangeCategoryViewState.RowState) obj2);
            }
        });
    }

    private final MerchantCategoryBottomSheetFragmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MerchantCategoryBottomSheetFragmentBinding) value;
    }

    private final MerchantChangeCategoryDuxo getDuxo() {
        return (MerchantChangeCategoryDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object adapter$lambda$0(MerchantChangeCategoryViewState.RowState byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment, RdsRowView of, final MerchantChangeCategoryViewState.RowState rowState) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowState, "rowState");
        MerchantCategory category = rowState.getCategory();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(category.formatted(resources));
        if (rowState.isSelected()) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C20690R.drawable.ic_rds_bubble_checked_24dp), Integer.valueOf(C20690R.attr.colorPrimary));
        } else {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C20690R.drawable.ic_rds_bubble_empty_24dp), Integer.valueOf(C20690R.attr.colorForeground3));
        }
        int iIntValue = ((Number) tuples2M3642to.component1()).intValue();
        int iIntValue2 = ((Number) tuples2M3642to.component2()).intValue();
        of.setTrailingIconDrawable(ViewsKt.getDrawable(of, iIntValue));
        Context context = of.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        of.setTrailingIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context, iIntValue2)));
        of.setEnabled(rowState.isEnabled());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantChangeCategoryBottomSheetFragment.adapter$lambda$2$lambda$1(this.f$0, rowState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment, MerchantChangeCategoryViewState.RowState rowState) {
        merchantChangeCategoryBottomSheetFragment.getDuxo().selectCategory(rowState.getCategory());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView merchantCategoryList = getBinding().merchantCategoryList;
        Intrinsics.checkNotNullExpressionValue(merchantCategoryList, "merchantCategoryList");
        bindAdapter(merchantCategoryList, this.adapter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C104511(this));
    }

    /* compiled from: MerchantChangeCategoryBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$onStart$1 */
    /* synthetic */ class C104511 extends FunctionReferenceImpl implements Function1<MerchantChangeCategoryViewState, Unit> {
        C104511(Object obj) {
            super(1, obj, MerchantChangeCategoryBottomSheetFragment.class, "bind", "bind(Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MerchantChangeCategoryViewState merchantChangeCategoryViewState) {
            invoke2(merchantChangeCategoryViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MerchantChangeCategoryViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MerchantChangeCategoryBottomSheetFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final MerchantChangeCategoryViewState viewState) {
        this.adapter.submitList(viewState.getRows());
        RdsButton rdsButton = getBinding().merchantChangeCategoryDone;
        rdsButton.setLoading(viewState.isLoading());
        rdsButton.setEnabled(!viewState.isLoading());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantChangeCategoryBottomSheetFragment.bind$lambda$5$lambda$4(this.f$0, viewState);
            }
        });
        UiEvent<Result<Unit>> result = viewState.getResult();
        if (result != null) {
            result.consumeWith(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantChangeCategoryBottomSheetFragment.bind$lambda$6(this.f$0, (Result) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment, MerchantChangeCategoryViewState merchantChangeCategoryViewState) {
        merchantChangeCategoryBottomSheetFragment.getDuxo().saveCategory(merchantChangeCategoryViewState.getSelectedCategory());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment, Result result) throws Throwable {
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(result.getValue());
        if (thM28553exceptionOrNullimpl != null) {
            if (!AbsErrorHandler.handleError$default(Fragments2.getActivityErrorHandler(merchantChangeCategoryBottomSheetFragment), thM28553exceptionOrNullimpl, false, 2, null)) {
                throw thM28553exceptionOrNullimpl;
            }
        } else {
            merchantChangeCategoryBottomSheetFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MerchantChangeCategoryBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryBottomSheetFragment$MerchantCategoryRowInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MerchantCategoryRowInflater implements Inflater<RdsRowView> {
        private final /* synthetic */ Inflater<RdsRowView> $$delegate_0 = Inflater.INSTANCE.include(C10421R.layout.include_merchant_category_rds_row);
        public static final MerchantCategoryRowInflater INSTANCE = new MerchantCategoryRowInflater();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsRowView) this.$$delegate_0.inflate(parent);
        }

        private MerchantCategoryRowInflater() {
        }
    }

    /* compiled from: MerchantChangeCategoryBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MerchantChangeCategory;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<MerchantChangeCategoryBottomSheetFragment, LegacyDialogFragmentKey.MerchantChangeCategory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public MerchantChangeCategoryBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.MerchantChangeCategory merchantChangeCategory) {
            return (MerchantChangeCategoryBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, merchantChangeCategory);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.MerchantChangeCategory getArgs(MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment) {
            return (LegacyDialogFragmentKey.MerchantChangeCategory) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, merchantChangeCategoryBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantChangeCategoryBottomSheetFragment newInstance(LegacyDialogFragmentKey.MerchantChangeCategory merchantChangeCategory) {
            return (MerchantChangeCategoryBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, merchantChangeCategory);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantChangeCategoryBottomSheetFragment merchantChangeCategoryBottomSheetFragment, LegacyDialogFragmentKey.MerchantChangeCategory merchantChangeCategory) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, merchantChangeCategoryBottomSheetFragment, merchantChangeCategory);
        }
    }
}
