package com.robinhood.android.trade.directipo.p260ui.limittype;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.FragmentDirectIpoOrderLimitTypeExplanationBinding;
import com.robinhood.android.trade.directipo.p260ui.limittype.DirectIpoOrderLimitTypeExplanationFragment;
import com.robinhood.directipo.models.api.ApiDirectIpoLimitTypeExplanation;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOrderLimitTypeExplanationFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\t\u0010 \u001a\u00020!H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "viewBinding", "Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderLimitTypeExplanationBinding;", "getViewBinding", "()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderLimitTypeExplanationBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoLimitTypeExplanation$Row;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderLimitTypeExplanationFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsRowView, ApiDirectIpoLimitTypeExplanation.Row> adapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderLimitTypeExplanationFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderLimitTypeExplanationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderLimitTypeExplanationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderLimitTypeExplanationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Callbacks;", "", "onDismissLimitTypeExplanation", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDismissLimitTypeExplanation();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOrderLimitTypeExplanationFragment() {
        super(C29323R.layout.fragment_direct_ipo_order_limit_type_explanation);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.viewBinding = ViewBinding5.viewBinding(this, DirectIpoOrderLimitTypeExplanationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectIpoOrderLimitTypeExplanationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.ValuePropRowInflater valuePropRowInflater = RdsRowView.ValuePropRowInflater.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(valuePropRowInflater, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoOrderLimitTypeExplanationFragment.adapter$lambda$0(this.f$0, (RdsRowView) obj, (ApiDirectIpoLimitTypeExplanation.Row) obj2);
            }
        });
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

    private final FragmentDirectIpoOrderLimitTypeExplanationBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoOrderLimitTypeExplanationBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(DirectIpoOrderLimitTypeExplanationFragment directIpoOrderLimitTypeExplanationFragment, RdsRowView of, ApiDirectIpoLimitTypeExplanation.Row item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLeadingIconDrawable(ContextCompat.getDrawable(directIpoOrderLimitTypeExplanationFragment.requireContext(), item.getIcon().getResourceId()));
        of.setPrimaryText(item.getTitle());
        of.setSecondaryText(directIpoOrderLimitTypeExplanationFragment.getMarkwon().toMarkdown(item.getSubtitle_markdown()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsPogView rdsPogView = getViewBinding().limitTypeExplanationPog;
        Context contextRequireContext = requireContext();
        Companion companion = INSTANCE;
        rdsPogView.setPictogram(ContextCompat.getDrawable(contextRequireContext, ((ApiDirectIpoLimitTypeExplanation) companion.getArgs((Fragment) this)).getPog().getResourceId()));
        getViewBinding().limitTypeExplanationTitle.setText(((ApiDirectIpoLimitTypeExplanation) companion.getArgs((Fragment) this)).getTitle());
        getViewBinding().limitTypeExplanationDescription.setText(getMarkwon().toMarkdown(((ApiDirectIpoLimitTypeExplanation) companion.getArgs((Fragment) this)).getDescription_markdown()));
        RecyclerView recyclerView = getViewBinding().limitTypeExplanationRecyclerView;
        GenericListAdapter<RdsRowView, ApiDirectIpoLimitTypeExplanation.Row> genericListAdapter = this.adapter;
        genericListAdapter.submitList(((ApiDirectIpoLimitTypeExplanation) companion.getArgs((Fragment) this)).getRows());
        recyclerView.setAdapter(genericListAdapter);
        getViewBinding().limitTypeExplanationDismiss.setText(((ApiDirectIpoLimitTypeExplanation) companion.getArgs((Fragment) this)).getDismiss_title());
        RdsButton limitTypeExplanationDismiss = getViewBinding().limitTypeExplanationDismiss;
        Intrinsics.checkNotNullExpressionValue(limitTypeExplanationDismiss, "limitTypeExplanationDismiss");
        OnClickListeners.onClick(limitTypeExplanationDismiss, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderLimitTypeExplanationFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(DirectIpoOrderLimitTypeExplanationFragment directIpoOrderLimitTypeExplanationFragment) {
        directIpoOrderLimitTypeExplanationFragment.getCallbacks().onDismissLimitTypeExplanation();
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOrderLimitTypeExplanationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoLimitTypeExplanation;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderLimitTypeExplanationFragment, ApiDirectIpoLimitTypeExplanation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiDirectIpoLimitTypeExplanation getArgs(DirectIpoOrderLimitTypeExplanationFragment directIpoOrderLimitTypeExplanationFragment) {
            return (ApiDirectIpoLimitTypeExplanation) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderLimitTypeExplanationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderLimitTypeExplanationFragment newInstance(ApiDirectIpoLimitTypeExplanation apiDirectIpoLimitTypeExplanation) {
            return (DirectIpoOrderLimitTypeExplanationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiDirectIpoLimitTypeExplanation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderLimitTypeExplanationFragment directIpoOrderLimitTypeExplanationFragment, ApiDirectIpoLimitTypeExplanation apiDirectIpoLimitTypeExplanation) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderLimitTypeExplanationFragment, apiDirectIpoLimitTypeExplanation);
        }
    }
}
