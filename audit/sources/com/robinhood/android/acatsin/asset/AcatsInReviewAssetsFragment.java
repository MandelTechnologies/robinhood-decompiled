package com.robinhood.android.acatsin.asset;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInAssetsReviewBinding;
import com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInReviewAssetsFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u00020\u0019*\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAssetsReviewBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAssetsReviewBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAddAssetClicked", "addAssetItem", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "onEditAssetClicked", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "bind", "state", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsViewState;", "setFilterChipOnClick", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "assetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInReviewAssetsFragment extends BaseFragment implements BuildPartialAdapter.Callbacks {
    private final BuildPartialAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInReviewAssetsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInReviewAssetsFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAssetsReviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter.Callbacks
    public void onEditAssetClicked(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
    }

    public AcatsInReviewAssetsFragment() {
        super(C7686R.layout.fragment_acats_in_assets_review);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInReviewAssetsContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInReviewAssetsContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, AcatsInReviewAssetsFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInReviewAssetsDuxo.class);
        this.adapter = new BuildPartialAdapter(this, false);
    }

    private final AcatsInReviewAssetsContract.Callbacks getCallbacks() {
        return (AcatsInReviewAssetsContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentAcatsInAssetsReviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInAssetsReviewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInReviewAssetsDuxo getDuxo() {
        return (AcatsInReviewAssetsDuxo) this.duxo.getValue();
    }

    /* compiled from: AcatsInReviewAssetsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$onViewCreated$1", m3645f = "AcatsInReviewAssetsFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$onViewCreated$1 */
    static final class C77781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77781(Continuation<? super C77781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInReviewAssetsFragment.this.new C77781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInReviewAssetsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInReviewAssetsFragment $tmp0;

            AnonymousClass1(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment) {
                this.$tmp0 = acatsInReviewAssetsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInReviewAssetsFragment.class, "bind", "bind(Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInReviewAssetsViewState acatsInReviewAssetsViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C77781.invokeSuspend$bind(this.$tmp0, acatsInReviewAssetsViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInReviewAssetsViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment, AcatsInReviewAssetsViewState acatsInReviewAssetsViewState, Continuation continuation) {
            acatsInReviewAssetsFragment.bind(acatsInReviewAssetsViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInReviewAssetsViewState> stateFlow = AcatsInReviewAssetsFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInReviewAssetsFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C77781(null), 1, null);
        FragmentAcatsInAssetsReviewBinding binding = getBinding();
        RecyclerView assetList = binding.assetList;
        Intrinsics.checkNotNullExpressionValue(assetList, "assetList");
        bindAdapter(assetList, this.adapter);
        binding.allAssetsChip.setSelected(true);
        RdsChip allAssetsChip = binding.allAssetsChip;
        Intrinsics.checkNotNullExpressionValue(allAssetsChip, "allAssetsChip");
        setFilterChipOnClick(allAssetsChip, null);
        RdsChip cashChip = binding.cashChip;
        Intrinsics.checkNotNullExpressionValue(cashChip, "cashChip");
        setFilterChipOnClick(cashChip, ApiAcatsTransfer.Asset.AssetType.CASH);
        RdsChip equityChip = binding.equityChip;
        Intrinsics.checkNotNullExpressionValue(equityChip, "equityChip");
        setFilterChipOnClick(equityChip, ApiAcatsTransfer.Asset.AssetType.EQUITY);
        RdsChip optionsChip = binding.optionsChip;
        Intrinsics.checkNotNullExpressionValue(optionsChip, "optionsChip");
        setFilterChipOnClick(optionsChip, ApiAcatsTransfer.Asset.AssetType.OPTION);
        Companion companion = INSTANCE;
        if (((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) this)).isAcatsRetry()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        } else {
            RecyclerView assetList2 = binding.assetList;
            Intrinsics.checkNotNullExpressionValue(assetList2, "assetList");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(assetList2, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RdsButton rdsButton = binding.ctaBtn;
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) this)).isAcatsRetry() ? 0 : 8);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInReviewAssetsFragment.onViewCreated$lambda$2$lambda$1$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1$lambda$0(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment) {
        acatsInReviewAssetsFragment.getCallbacks().onAcatsRetryAssetVerified(((AcatsInReviewAssetsContract.Key) INSTANCE.getArgs((Fragment) acatsInReviewAssetsFragment)).getAssets());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        RhToolbars.setCenteredTitle(toolbar, C7686R.string.assets_label);
        if (((AcatsInReviewAssetsContract.Key) INSTANCE.getArgs((Fragment) this)).isAcatsRetry()) {
            View viewFindViewById = RhToolbar.addCustomView$default(toolbar, C7686R.layout.include_asset_review_toolbar_edit_button, false, 0, 6, null).findViewById(C7686R.id.action_edit);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsInReviewAssetsFragment.configureToolbar$lambda$3(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$3(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment) {
        AcatsInReviewAssetsContract.Callbacks callbacks = acatsInReviewAssetsFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onAcatsRetryEditClicked(((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) acatsInReviewAssetsFragment)).getAssets(), ((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) acatsInReviewAssetsFragment)).getRhsAccountNumber(), ((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) acatsInReviewAssetsFragment)).getAccountNumber(), ((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) acatsInReviewAssetsFragment)).getBrokerageAccountType(), ((AcatsInReviewAssetsContract.Key) companion.getArgs((Fragment) acatsInReviewAssetsFragment)).getScreenContext());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter.Callbacks
    public void onAddAssetClicked(BuildPartialItem.AddAsset addAssetItem) {
        Intrinsics.checkNotNullParameter(addAssetItem, "addAssetItem");
        throw new IllegalStateException("Can't add assets from review page");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(AcatsInReviewAssetsViewState state) {
        TextView assetsReviewTitle = getBinding().assetsReviewTitle;
        Intrinsics.checkNotNullExpressionValue(assetsReviewTitle, "assetsReviewTitle");
        assetsReviewTitle.setVisibility(state.getShowTitle() ? 0 : 8);
        this.adapter.submitList(state.getDisplayList());
    }

    private final void setFilterChipOnClick(final RdsChip rdsChip, final ApiAcatsTransfer.Asset.AssetType assetType) {
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.acatsin.asset.AcatsInReviewAssetsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInReviewAssetsFragment.setFilterChipOnClick$lambda$5(this.f$0, assetType, rdsChip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFilterChipOnClick$lambda$5(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment, ApiAcatsTransfer.Asset.AssetType assetType, RdsChip rdsChip) {
        ChipGroup assetTypeChipGroup = acatsInReviewAssetsFragment.getBinding().assetTypeChipGroup;
        Intrinsics.checkNotNullExpressionValue(assetTypeChipGroup, "assetTypeChipGroup");
        for (View view : ViewGroup2.getChildren(assetTypeChipGroup)) {
            view.setSelected(Intrinsics.areEqual(view, rdsChip));
        }
        acatsInReviewAssetsFragment.getDuxo().setAssetFilterType(assetType);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInReviewAssetsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsFragment;", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInReviewAssetsFragment, AcatsInReviewAssetsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInReviewAssetsContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInReviewAssetsContract.Key getArgs(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment) {
            return (AcatsInReviewAssetsContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInReviewAssetsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInReviewAssetsFragment newInstance(AcatsInReviewAssetsContract.Key key) {
            return (AcatsInReviewAssetsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInReviewAssetsFragment acatsInReviewAssetsFragment, AcatsInReviewAssetsContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInReviewAssetsFragment, key);
        }
    }
}
