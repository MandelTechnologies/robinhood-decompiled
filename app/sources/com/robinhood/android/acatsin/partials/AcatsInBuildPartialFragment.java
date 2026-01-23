package com.robinhood.android.acatsin.partials;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInBuildPartialBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.partials.AcatsInBuildPartialEvent;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: AcatsInBuildPartialFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0003CDEB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016J\u000e\u00102\u001a\u00020!2\u0006\u00100\u001a\u000201J\u000e\u00103\u001a\u00020!2\u0006\u00100\u001a\u000201J\u000e\u00104\u001a\u00020!2\u0006\u00100\u001a\u000201J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u00020!2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u000201H\u0002J\b\u0010@\u001a\u00020!H\u0002J\u0016\u0010A\u001a\u00020!*\u00020B2\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInBuildPartialBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInBuildPartialBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter;", "accountHasAccessToOptions", "", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAddAssetClicked", "addAssetItem", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "onEditAssetClicked", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "addAsset", "updateAsset", "removeAsset", "bind", "state", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialViewState;", "setAssetTypeSelection", "assetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialEvent;", "showConflictingAssetAlert", "conflictingAsset", "showOptionsNotEnabledAlert", "setFilterChipOnClick", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "Callbacks", "Args", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInBuildPartialFragment extends AcatsFlowStepFragment3 implements BuildPartialAdapter.Callbacks {
    public static final String CONFLICTING_ASSET_KEY = "conflicting-asset";
    private boolean accountHasAccessToOptions;
    private final BuildPartialAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInBuildPartialFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInBuildPartialBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInBuildPartialFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInBuildPartialFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Callbacks;", "", "onAddAssetClicked", "", "addAssetItem", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "onEditAssetClicked", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onDoneClicked", "assets", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddAssetClicked(BuildPartialItem.AddAsset addAssetItem);

        void onDoneClicked(List<? extends UiAcatsAsset> assets);

        void onEditAssetClicked(UiAcatsAsset asset);
    }

    public AcatsInBuildPartialFragment() {
        super(C7686R.layout.fragment_acats_in_build_partial, null, AcatsFlowStep.PARTIAL_TRANSFER_FLOW, 2, null);
        this.binding = ViewBinding5.viewBinding(this, AcatsInBuildPartialFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, AcatsInBuildPartialDuxo.class);
        this.adapter = new BuildPartialAdapter(this, false, 2, null);
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

    private final FragmentAcatsInBuildPartialBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInBuildPartialBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInBuildPartialDuxo getDuxo() {
        return (AcatsInBuildPartialDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((Args) INSTANCE.getArgs((Fragment) this)).isAcatsRetry()) {
            toolbar.removeCustomView();
            RhToolbars.setCenteredTitle(toolbar, C7686R.string.acats_page_title);
        } else {
            super.configureToolbar(toolbar);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C79631(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C79642(null), 1, null);
        FragmentAcatsInBuildPartialBinding binding = getBinding();
        RecyclerView assetList = binding.assetList;
        Intrinsics.checkNotNullExpressionValue(assetList, "assetList");
        bindAdapter(assetList, this.adapter);
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
    }

    /* compiled from: AcatsInBuildPartialFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$1", m3645f = "AcatsInBuildPartialFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$1 */
    static final class C79631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79631(Continuation<? super C79631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInBuildPartialFragment.this.new C79631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInBuildPartialFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInBuildPartialFragment $tmp0;

            AnonymousClass1(AcatsInBuildPartialFragment acatsInBuildPartialFragment) {
                this.$tmp0 = acatsInBuildPartialFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInBuildPartialFragment.class, "bind", "bind(Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInBuildPartialViewState acatsInBuildPartialViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C79631.invokeSuspend$bind(this.$tmp0, acatsInBuildPartialViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInBuildPartialViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(AcatsInBuildPartialFragment acatsInBuildPartialFragment, AcatsInBuildPartialViewState acatsInBuildPartialViewState, Continuation continuation) {
            acatsInBuildPartialFragment.bind(acatsInBuildPartialViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInBuildPartialViewState> stateFlow = AcatsInBuildPartialFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInBuildPartialFragment.this);
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

    /* compiled from: AcatsInBuildPartialFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$2", m3645f = "AcatsInBuildPartialFragment.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$2 */
    static final class C79642 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79642(Continuation<? super C79642> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInBuildPartialFragment.this.new C79642(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInBuildPartialEvent>> eventFlow = AcatsInBuildPartialFragment.this.getDuxo().getEventFlow();
                final AcatsInBuildPartialFragment acatsInBuildPartialFragment = AcatsInBuildPartialFragment.this;
                FlowCollector<? super Event<AcatsInBuildPartialEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment.onViewCreated.2.1
                    public final Object emit(final Event<AcatsInBuildPartialEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInBuildPartialEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInBuildPartialFragment acatsInBuildPartialFragment2 = acatsInBuildPartialFragment;
                            if ((event.getData() instanceof AcatsInBuildPartialEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10759invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10759invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInBuildPartialFragment2.handleEvent((AcatsInBuildPartialEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInBuildPartialEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter.Callbacks
    public void onAddAssetClicked(BuildPartialItem.AddAsset addAssetItem) {
        Intrinsics.checkNotNullParameter(addAssetItem, "addAssetItem");
        if (!this.accountHasAccessToOptions && addAssetItem.getType() == ApiAcatsTransfer.Asset.AssetType.OPTION) {
            showOptionsNotEnabledAlert();
        } else {
            getCallbacks().onAddAssetClicked(addAssetItem);
        }
    }

    @Override // com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter.Callbacks
    public void onEditAssetClicked(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getCallbacks().onEditAssetClicked(asset);
    }

    public final void addAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getDuxo().addAsset(asset);
    }

    public final void updateAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getDuxo().updateAsset(asset);
    }

    public final void removeAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        getDuxo().removeAsset(asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final AcatsInBuildPartialViewState state) {
        String bannerMarkdown;
        getBinding().ctaBtn.setEnabled(state.getCanContinue());
        RdsInfoBannerView banner = getBinding().banner;
        Intrinsics.checkNotNullExpressionValue(banner, "banner");
        banner.setVisibility(state.getIsBannerReady() ? 0 : 8);
        AcatsInBuildPartialViewState acatsInBuildPartialViewState = state.getIsBannerReady() ? state : null;
        if (acatsInBuildPartialViewState != null && (bannerMarkdown = acatsInBuildPartialViewState.getBannerMarkdown()) != null) {
            getBinding().banner.setText(getMarkwon().toMarkdown(bannerMarkdown));
        }
        this.adapter.submitList(state.getDisplayList());
        this.accountHasAccessToOptions = state.getAccountHasAccessToOptions();
        RdsButton ctaBtn = getBinding().ctaBtn;
        Intrinsics.checkNotNullExpressionValue(ctaBtn, "ctaBtn");
        OnClickListeners.onClick(ctaBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInBuildPartialFragment.bind$lambda$3(this.f$0, state);
            }
        });
        RdsChip rdsChip = getBinding().cashChip;
        StringResource cashChipStringResource = state.getCashChipStringResource();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsChip.setText(cashChipStringResource.getText(resources));
        RdsChip optionsChip = getBinding().optionsChip;
        Intrinsics.checkNotNullExpressionValue(optionsChip, "optionsChip");
        optionsChip.setVisibility(state.getShouldDisplayOptionsChip() ? 0 : 8);
        setAssetTypeSelection(state.getAssetFilterType$lib_acats_ui_externalDebug());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(AcatsInBuildPartialFragment acatsInBuildPartialFragment, AcatsInBuildPartialViewState acatsInBuildPartialViewState) {
        acatsInBuildPartialFragment.getCallbacks().onDoneClicked(acatsInBuildPartialViewState.getAssets());
        return Unit.INSTANCE;
    }

    private final void setAssetTypeSelection(ApiAcatsTransfer.Asset.AssetType assetType) {
        getBinding().allAssetsChip.setSelected(assetType == null || assetType == ApiAcatsTransfer.Asset.AssetType.UNKNOWN);
        getBinding().cashChip.setSelected(assetType == ApiAcatsTransfer.Asset.AssetType.CASH);
        getBinding().equityChip.setSelected(assetType == ApiAcatsTransfer.Asset.AssetType.EQUITY);
        getBinding().optionsChip.setSelected(assetType == ApiAcatsTransfer.Asset.AssetType.OPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInBuildPartialEvent event) {
        if (!(event instanceof AcatsInBuildPartialEvent.ConflictingAssetEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        showConflictingAssetAlert(((AcatsInBuildPartialEvent.ConflictingAssetEvent) event).getAsset());
    }

    private final void showConflictingAssetAlert(UiAcatsAsset conflictingAsset) {
        RhBottomSheetDialogFragment.Args args;
        if (conflictingAsset instanceof UiAcatsAsset.CashAsset) {
            throw new IllegalStateException("Cash asset cannot conflict");
        }
        if (conflictingAsset instanceof UiAcatsAsset.EquityAsset) {
            int i = C7686R.id.dialog_id_conflicting_asset_entered;
            UiAcatsAsset.EquityAsset equityAsset = (UiAcatsAsset.EquityAsset) conflictingAsset;
            String string2 = getString(C7686R.string.acats_in_build_partial_conflicting_equity_alert_title, equityAsset.getSymbol());
            String string3 = getString(C7686R.string.acats_in_build_partial_conflicting_equity_alert_message, equityAsset.getSymbol());
            String string4 = getString(C7686R.string.acats_in_build_partial_conflicting_alert_button);
            Bundle bundle = new Bundle();
            bundle.putParcelable(CONFLICTING_ASSET_KEY, conflictingAsset);
            Unit unit = Unit.INSTANCE;
            args = new RhBottomSheetDialogFragment.Args(i, string2, null, string3, null, string4, null, null, null, false, false, null, bundle, null, false, false, false, false, null, null, null, 2093012, null);
        } else {
            if (!(conflictingAsset instanceof UiAcatsAsset.OptionAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = C7686R.id.dialog_id_conflicting_asset_entered;
            String string5 = getString(C7686R.string.acats_in_build_partial_conflicting_option_alert_title);
            String string6 = getString(C7686R.string.acats_in_build_partial_conflicting_option_alert_message);
            String string7 = getString(C7686R.string.acats_in_build_partial_conflicting_alert_button);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(CONFLICTING_ASSET_KEY, conflictingAsset);
            Unit unit2 = Unit.INSTANCE;
            args = new RhBottomSheetDialogFragment.Args(i2, string5, null, string6, null, string7, null, null, null, false, false, null, bundle2, null, false, false, false, false, null, null, null, 2093012, null);
        }
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) args);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, CONFLICTING_ASSET_KEY);
    }

    private final void showOptionsNotEnabledAlert() {
        if (getChildFragmentManager().findFragmentByTag("options-not-enabled") == null) {
            RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C7686R.id.dialog_id_options_not_enabled, getString(C7686R.string.acats_in_options_not_enabled_title), null, getString(C7686R.string.acats_in_options_not_enabled_description), null, getString(C7686R.string.acats_in_enable_options), null, getString(C11048R.string.general_label_got_it), null, false, false, null, null, null, false, false, false, false, null, null, null, 2096980, null));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rhBottomSheetDialogFragment.show(childFragmentManager, "options-not-enabled");
        }
    }

    private final void setFilterChipOnClick(final RdsChip rdsChip, final ApiAcatsTransfer.Asset.AssetType assetType) {
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInBuildPartialFragment.setFilterChipOnClick$lambda$7(this.f$0, assetType, rdsChip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFilterChipOnClick$lambda$7(AcatsInBuildPartialFragment acatsInBuildPartialFragment, ApiAcatsTransfer.Asset.AssetType assetType, RdsChip rdsChip) {
        ChipGroup assetTypeChipGroup = acatsInBuildPartialFragment.getBinding().assetTypeChipGroup;
        Intrinsics.checkNotNullExpressionValue(assetTypeChipGroup, "assetTypeChipGroup");
        for (View view : ViewGroup2.getChildren(assetTypeChipGroup)) {
            view.setSelected(Intrinsics.areEqual(view, rdsChip));
        }
        acatsInBuildPartialFragment.getDuxo().setAssetFilterType(assetType);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInBuildPartialFragment.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003Jw\u0010(\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Args;", "Landroid/os/Parcelable;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountNumber", "rhsAccountTitle", "supportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "bannerContentfulId", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "isAcatsRetry", "", "hasSubzeroExperiment", "<init>", "(Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;ZZ)V", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountNumber", "()Ljava/lang/String;", "getRhsAccountTitle", "getSupportedContentTypes", "()Ljava/util/Set;", "getBannerContentfulId", "getAssets", "()Ljava/util/List;", "()Z", "getHasSubzeroExperiment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<UiAcatsAsset> assets;
        private final String bannerContentfulId;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final boolean hasSubzeroExperiment;
        private final boolean isAcatsRetry;
        private final String rhsAccountNumber;
        private final String rhsAccountTitle;
        private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

        /* compiled from: AcatsInBuildPartialFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(ApiAcatsAccountContentsResponse.SupportedContentType.valueOf(parcel.readString()));
                }
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new Args(eitherM23663create, string2, string3, linkedHashSet, string4, arrayList, z2, parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Either either, String str, String str2, Set set, String str3, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                either = args.brokerageOrDtcNumber;
            }
            if ((i & 2) != 0) {
                str = args.rhsAccountNumber;
            }
            if ((i & 4) != 0) {
                str2 = args.rhsAccountTitle;
            }
            if ((i & 8) != 0) {
                set = args.supportedContentTypes;
            }
            if ((i & 16) != 0) {
                str3 = args.bannerContentfulId;
            }
            if ((i & 32) != 0) {
                list = args.assets;
            }
            if ((i & 64) != 0) {
                z = args.isAcatsRetry;
            }
            if ((i & 128) != 0) {
                z2 = args.hasSubzeroExperiment;
            }
            boolean z3 = z;
            boolean z4 = z2;
            String str4 = str3;
            List list2 = list;
            return args.copy(either, str, str2, set, str4, list2, z3, z4);
        }

        public final Either<ApiBrokerage, String> component1() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountTitle() {
            return this.rhsAccountTitle;
        }

        public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> component4() {
            return this.supportedContentTypes;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBannerContentfulId() {
            return this.bannerContentfulId;
        }

        public final List<UiAcatsAsset> component6() {
            return this.assets;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }

        public final Args copy(Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountNumber, String rhsAccountTitle, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String bannerContentfulId, List<? extends UiAcatsAsset> assets, boolean isAcatsRetry, boolean hasSubzeroExperiment) {
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            Intrinsics.checkNotNullParameter(assets, "assets");
            return new Args(brokerageOrDtcNumber, rhsAccountNumber, rhsAccountTitle, supportedContentTypes, bannerContentfulId, assets, isAcatsRetry, hasSubzeroExperiment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.brokerageOrDtcNumber, args.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountNumber, args.rhsAccountNumber) && Intrinsics.areEqual(this.rhsAccountTitle, args.rhsAccountTitle) && Intrinsics.areEqual(this.supportedContentTypes, args.supportedContentTypes) && Intrinsics.areEqual(this.bannerContentfulId, args.bannerContentfulId) && Intrinsics.areEqual(this.assets, args.assets) && this.isAcatsRetry == args.isAcatsRetry && this.hasSubzeroExperiment == args.hasSubzeroExperiment;
        }

        public int hashCode() {
            int iHashCode = this.brokerageOrDtcNumber.hashCode() * 31;
            String str = this.rhsAccountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rhsAccountTitle;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.supportedContentTypes.hashCode()) * 31;
            String str3 = this.bannerContentfulId;
            return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.assets.hashCode()) * 31) + Boolean.hashCode(this.isAcatsRetry)) * 31) + Boolean.hashCode(this.hasSubzeroExperiment);
        }

        public String toString() {
            return "Args(brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountNumber=" + this.rhsAccountNumber + ", rhsAccountTitle=" + this.rhsAccountTitle + ", supportedContentTypes=" + this.supportedContentTypes + ", bannerContentfulId=" + this.bannerContentfulId + ", assets=" + this.assets + ", isAcatsRetry=" + this.isAcatsRetry + ", hasSubzeroExperiment=" + this.hasSubzeroExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.rhsAccountTitle);
            Set<ApiAcatsAccountContentsResponse.SupportedContentType> set = this.supportedContentTypes;
            dest.writeInt(set.size());
            Iterator<ApiAcatsAccountContentsResponse.SupportedContentType> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeString(this.bannerContentfulId);
            List<UiAcatsAsset> list = this.assets;
            dest.writeInt(list.size());
            Iterator<UiAcatsAsset> it2 = list.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
            dest.writeInt(this.hasSubzeroExperiment ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, String str2, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String str3, List<? extends UiAcatsAsset> assets, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.rhsAccountNumber = str;
            this.rhsAccountTitle = str2;
            this.supportedContentTypes = supportedContentTypes;
            this.bannerContentfulId = str3;
            this.assets = assets;
            this.isAcatsRetry = z;
            this.hasSubzeroExperiment = z2;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final String getRhsAccountTitle() {
            return this.rhsAccountTitle;
        }

        public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
            return this.supportedContentTypes;
        }

        public final String getBannerContentfulId() {
            return this.bannerContentfulId;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Args(com.robinhood.utils.Either r12, java.lang.String r13, java.lang.String r14, java.util.Set r15, java.lang.String r16, java.util.List r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r11 = this;
                r0 = r20
                r1 = r0 & 32
                if (r1 == 0) goto Lc
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                r8 = r1
                goto Le
            Lc:
                r8 = r17
            Le:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L15
                r9 = r2
                goto L17
            L15:
                r9 = r18
            L17:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L24
                r10 = r2
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r2 = r11
                goto L2d
            L24:
                r10 = r19
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
            L2d:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment.Args.<init>(com.robinhood.utils.Either, java.lang.String, java.lang.String, java.util.Set, java.lang.String, java.util.List, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<UiAcatsAsset> getAssets() {
            return this.assets;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }
    }

    /* compiled from: AcatsInBuildPartialFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Args;", "<init>", "()V", "CONFLICTING_ASSET_KEY", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsInBuildPartialFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsInBuildPartialFragment acatsInBuildPartialFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsInBuildPartialFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInBuildPartialFragment newInstance(Args args) {
            return (AcatsInBuildPartialFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInBuildPartialFragment acatsInBuildPartialFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsInBuildPartialFragment, args);
        }
    }
}
