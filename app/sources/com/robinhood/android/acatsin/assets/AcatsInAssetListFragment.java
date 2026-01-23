package com.robinhood.android.acatsin.assets;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys3;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.assets.AcatsInAssetListViewState;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInAssetListBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AcatsInAssetListFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInAssetListBinding;", "getBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInAssetListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "assetListAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse$AcatsListPageRow;", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "viewState", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "bindAssetTypes", "types", "", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse$AcatsListAssetType;", "createFilterChip", "Lcom/robinhood/android/designsystem/chip/RdsChip;", AnnotatedPrivateKey.LABEL, "", "assetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAssetListFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, AcatsListPageResponse.AcatsListPageRow> assetListAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInAssetListFragment.class, "binding", "getBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInAssetListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public AcatsInAssetListFragment() {
        super(C7725R.layout.fragment_acats_in_asset_list);
        this.binding = ViewBinding5.viewBinding(this, AcatsInAssetListFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInAssetListDuxo.class);
        this.assetListAdapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAssetListFragment.assetListAdapter$lambda$0((AcatsListPageResponse.AcatsListPageRow) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInAssetListFragment.assetListAdapter$lambda$2(this.f$0, (RdsRowView) obj, (AcatsListPageResponse.AcatsListPageRow) obj2);
            }
        });
    }

    private final FragmentAcatsInAssetListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInAssetListBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInAssetListDuxo getDuxo() {
        return (AcatsInAssetListDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object assetListAdapter$lambda$0(AcatsListPageResponse.AcatsListPageRow byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getRow().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetListAdapter$lambda$2(final AcatsInAssetListFragment acatsInAssetListFragment, RdsRowView of, AcatsListPageResponse.AcatsListPageRow rowData) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        GenericAction annotatedAction = rowData.getRow().getAnnotatedAction();
        GenericAction.DeeplinkAction deeplinkAction = annotatedAction instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) annotatedAction : null;
        final Uri uri = deeplinkAction != null ? deeplinkAction.getUri() : null;
        of.setPrimaryText(rowData.getRow().getLabel());
        of.setSecondaryText(rowData.getRow().getValue());
        of.setMetadataPrimaryText(rowData.getRow().getValueDescription());
        of.setTrailingIconDrawable(uri != null ? of.getContext().getDrawable(C20690R.drawable.ic_rds_caret_right_16dp) : null);
        ScarletManager2.overrideAttribute(of, C13997R.attr.trailingIconTint, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInAssetListFragment.assetListAdapter$lambda$2$lambda$1(this.f$0, uri);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetListAdapter$lambda$2$lambda$1(AcatsInAssetListFragment acatsInAssetListFragment, Uri uri) {
        Navigator navigator = acatsInAssetListFragment.getNavigator();
        Context contextRequireContext = acatsInAssetListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, Boolean.FALSE, null, false, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        putAchromaticOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        AcatsInAssetListViewState value = getDuxo().getStateFlow().getValue();
        AcatsInAssetListViewState.Loaded loaded = value instanceof AcatsInAssetListViewState.Loaded ? (AcatsInAssetListViewState.Loaded) value : null;
        if (loaded != null) {
            toolbar.setTitle(loaded.getTitle());
            toolbar.setSubtitle(loaded.getSubtitle());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().assetListRecycler;
        Intrinsics.checkNotNull(recyclerView);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(recyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        recyclerView.setAdapter(this.assetListAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C77842(null), 1, null);
    }

    /* compiled from: AcatsInAssetListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$onViewCreated$2", m3645f = "AcatsInAssetListFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$onViewCreated$2 */
    static final class C77842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77842(Continuation<? super C77842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAssetListFragment.this.new C77842(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInAssetListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInAssetListFragment $tmp0;

            AnonymousClass1(AcatsInAssetListFragment acatsInAssetListFragment) {
                this.$tmp0 = acatsInAssetListFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInAssetListFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInAssetListViewState acatsInAssetListViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C77842.invokeSuspend$setViewState(this.$tmp0, acatsInAssetListViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInAssetListViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInAssetListViewState> stateFlow = AcatsInAssetListFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInAssetListFragment.this);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInAssetListFragment acatsInAssetListFragment, AcatsInAssetListViewState acatsInAssetListViewState, Continuation continuation) throws Resources.NotFoundException {
            acatsInAssetListFragment.setViewState(acatsInAssetListViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(AcatsInAssetListViewState viewState) throws Resources.NotFoundException {
        if (viewState instanceof AcatsInAssetListViewState.Loading) {
            HorizontalScrollView assetTypeChipContainer = getBinding().assetTypeChipContainer;
            Intrinsics.checkNotNullExpressionValue(assetTypeChipContainer, "assetTypeChipContainer");
            assetTypeChipContainer.setVisibility(8);
            RecyclerView assetListRecycler = getBinding().assetListRecycler;
            Intrinsics.checkNotNullExpressionValue(assetListRecycler, "assetListRecycler");
            assetListRecycler.setVisibility(8);
            ShimmerLoadingView loadingView = getBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(0);
            return;
        }
        if (viewState instanceof AcatsInAssetListViewState.Loaded) {
            ShimmerLoadingView loadingView2 = getBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
            loadingView2.setVisibility(8);
            RecyclerView assetListRecycler2 = getBinding().assetListRecycler;
            Intrinsics.checkNotNullExpressionValue(assetListRecycler2, "assetListRecycler");
            assetListRecycler2.setVisibility(0);
            HorizontalScrollView assetTypeChipContainer2 = getBinding().assetTypeChipContainer;
            Intrinsics.checkNotNullExpressionValue(assetTypeChipContainer2, "assetTypeChipContainer");
            AcatsInAssetListViewState.Loaded loaded = (AcatsInAssetListViewState.Loaded) viewState;
            assetTypeChipContainer2.setVisibility(loaded.getAssetChipsVisible() ? 0 : 8);
            requireToolbar().setTitle(loaded.getTitle());
            requireToolbar().setSubtitle(loaded.getSubtitle());
            bindAssetTypes(loaded.getAssetTypes());
            this.assetListAdapter.submitList(loaded.getAssetRows());
        }
    }

    private final void bindAssetTypes(List<AcatsListPageResponse.AcatsListAssetType> types) throws Resources.NotFoundException {
        ChipGroup chipGroup = getBinding().assetTypeChipGroup;
        if (types.size() == chipGroup.getChildCount() - 1) {
            return;
        }
        chipGroup.removeAllViews();
        chipGroup.setSingleSelection(true);
        String string2 = chipGroup.getResources().getString(C7725R.string.acats_asset_list_all_assets);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsChip rdsChipCreateFilterChip = createFilterChip(string2, null);
        rdsChipCreateFilterChip.setSelected(true);
        getDuxo().setAssetTypeSelection(null);
        chipGroup.addView(rdsChipCreateFilterChip);
        for (AcatsListPageResponse.AcatsListAssetType acatsListAssetType : types) {
            chipGroup.addView(createFilterChip(acatsListAssetType.getDisplayName(), acatsListAssetType.getType()));
        }
    }

    private final RdsChip createFilterChip(String label, final ApiAcatsTransfer.Asset.AssetType assetType) {
        RdsChip.Companion companion = RdsChip.INSTANCE;
        HorizontalScrollView assetTypeChipContainer = getBinding().assetTypeChipContainer;
        Intrinsics.checkNotNullExpressionValue(assetTypeChipContainer, "assetTypeChipContainer");
        final RdsChip rdsChipInflate = companion.inflate((ViewGroup) assetTypeChipContainer);
        rdsChipInflate.setText(label);
        OnClickListeners.onClick(rdsChipInflate, new Function0() { // from class: com.robinhood.android.acatsin.assets.AcatsInAssetListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInAssetListFragment.createFilterChip$lambda$11$lambda$10(rdsChipInflate, this, assetType);
            }
        });
        return rdsChipInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createFilterChip$lambda$11$lambda$10(RdsChip rdsChip, AcatsInAssetListFragment acatsInAssetListFragment, ApiAcatsTransfer.Asset.AssetType assetType) {
        if (!rdsChip.isSelected()) {
            ChipGroup assetTypeChipGroup = acatsInAssetListFragment.getBinding().assetTypeChipGroup;
            Intrinsics.checkNotNullExpressionValue(assetTypeChipGroup, "assetTypeChipGroup");
            for (View view : ViewGroup2.getChildren(assetTypeChipGroup)) {
                view.setSelected(Intrinsics.areEqual(view, rdsChip));
            }
            acatsInAssetListFragment.getDuxo().setAssetTypeSelection(assetType);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInAssetListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListFragment;", "Lcom/robinhood/android/acats/contracts/AcatsInAssetList;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInAssetListFragment, AcatsFragmentKeys3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsFragmentKeys3 acatsFragmentKeys3) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, acatsFragmentKeys3);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsFragmentKeys3 getArgs(AcatsInAssetListFragment acatsInAssetListFragment) {
            return (AcatsFragmentKeys3) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInAssetListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInAssetListFragment newInstance(AcatsFragmentKeys3 acatsFragmentKeys3) {
            return (AcatsInAssetListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, acatsFragmentKeys3);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInAssetListFragment acatsInAssetListFragment, AcatsFragmentKeys3 acatsFragmentKeys3) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInAssetListFragment, acatsFragmentKeys3);
        }
    }
}
