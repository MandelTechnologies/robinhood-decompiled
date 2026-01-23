package com.robinhood.android.listsoptions.optionwatchlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.extensions.RecyclerViews;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistHubContentBinding;
import com.robinhood.android.listsoptions.databinding.RowActiveHeaderBinding;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistSortBottomSheetFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment;
import com.robinhood.viewmode.ViewModeSelectionType;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: OptionWatchlistHubContentFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003xyzB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010O\u001a\u00020<H\u0016J\u001a\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020;2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010T\u001a\u00020<H\u0002J\u0010\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020(H\u0016J \u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020;2\u000e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140ZH\u0002J\u0010\u0010[\u001a\u00020<2\u0006\u0010X\u001a\u00020;H\u0016J\u001e\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0`H\u0016J\u0010\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020^H\u0016J\b\u0010c\u001a\u00020<H\u0016J\u0010\u0010d\u001a\u00020<2\u0006\u0010e\u001a\u00020fH\u0016J\u001a\u0010g\u001a\u00020D2\u0006\u0010h\u001a\u00020\u00142\b\u0010i\u001a\u0004\u0018\u00010SH\u0016J\f\u0010j\u001a\u00020<*\u00020kH\u0003J\b\u0010l\u001a\u00020<H\u0002J\u0010\u0010m\u001a\u00020\u00142\u0006\u0010n\u001a\u00020oH\u0002J\u0010\u0010p\u001a\u00020<2\u0006\u0010/\u001a\u00020\u0014H\u0002J\b\u0010q\u001a\u00020<H\u0002JW\u0010r\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\b\b\u0001\u0010s\u001a\u00020\u00142\u0012\b\u0002\u0010Y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010Z2\u0019\b\u0002\u0010t\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0u¢\u0006\u0002\bv2\b\b\u0002\u0010w\u001a\u00020DH\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R/\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R/\u0010$\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0013\u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u001b\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0017R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020D8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u00020D2\u0006\u0010C\u001a\u00020D8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter$Callbacks;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo;", "getDuxo", "()Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistHubContentBinding;", "getBinding", "()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistHubContentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "rowHeight", "getRowHeight", "()Ljava/lang/Integer;", "setRowHeight", "(Ljava/lang/Integer;)V", "rowHeight$delegate", "Lkotlin/properties/ReadWriteProperty;", "activeHeaderHeight", "getActiveHeaderHeight", "setActiveHeaderHeight", "activeHeaderHeight$delegate", "expiredHeaderHeight", "getExpiredHeaderHeight", "setExpiredHeaderHeight", "expiredHeaderHeight$delegate", "disclosureHeight", "getDisclosureHeight", "setDisclosureHeight", "disclosureHeight$delegate", "Lcom/robinhood/models/ui/SortOption;", "cachedSortOption", "getCachedSortOption", "()Lcom/robinhood/models/ui/SortOption;", "setCachedSortOption", "(Lcom/robinhood/models/ui/SortOption;)V", "cachedSortOption$delegate", "compositeAdapterPosition", "getCompositeAdapterPosition", "()I", "setCompositeAdapterPosition", "(I)V", "compositeAdapterPosition$delegate", "headerHeight", "getHeaderHeight", "chipGestureDetector", "Landroid/view/GestureDetector;", "activeStrategyHeaderAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/View;", "", "activeStrategyRowAdapter", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter;", "spacerAdapter", "expiredStrategyHeaderAdapter", "expiredStrategyRowAdapter", "expiredStrategyDisclosureAdapter", "value", "", "activeStrategyHeaderVisibility", "getActiveStrategyHeaderVisibility", "()Z", "setActiveStrategyHeaderVisibility", "(Z)V", "expiredStrategyHeaderVisibility", "getExpiredStrategyHeaderVisibility", "setExpiredStrategyHeaderVisibility", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onStart", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "showSortingBottomSheet", "onSortOptionSelected", "sortOption", "setRecyclerViewPadding", "rowView", "heightProperty", "Lkotlin/reflect/KMutableProperty0;", "onStrategyRowBound", "showAggregateDetail", "initialStrategyCode", "", "strategyCodeList", "", "onExpiredOptionStrategyRowTapped", "strategyCode", "onQuoteClicked", "onOptionsWatchlistViewModeChange", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "onPositiveButtonClicked", "id", "passthroughArgs", "bindSortChip", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "selectFirstItemIfNothingSelected", "getSelectedItemIndex", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onCompositeAdapterPositionSelected", "updateRecyclerViewBottomPadding", "createSingleAdapter", "layoutResId", "bind", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "isVisible", "OptionWatchlistHubSnapHelper", "Args", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionWatchlistHubContentFragment extends BaseFragment implements OptionWatchlistHubContentAdapter.Callbacks, CuratedListSortCallbacks, ViewModeSelectionBottomSheetFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionWatchlistHubContentFragment.class, "binding", "getBinding()Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistHubContentBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "rowHeight", "getRowHeight()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "activeHeaderHeight", "getActiveHeaderHeight()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "expiredHeaderHeight", "getExpiredHeaderHeight()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "disclosureHeight", "getDisclosureHeight()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "cachedSortOption", "getCachedSortOption()Lcom/robinhood/models/ui/SortOption;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionWatchlistHubContentFragment.class, "compositeAdapterPosition", "getCompositeAdapterPosition()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXPIRED_ERROR_DIALOG_STRATEGY_CODE = "EXPIRED_ERROR_DIALOG_STRATEGY_CODE";

    /* renamed from: activeHeaderHeight$delegate, reason: from kotlin metadata */
    private final Interfaces3 activeHeaderHeight;
    private final SingleItemAdapter<View, Unit> activeStrategyHeaderAdapter;
    private final OptionWatchlistHubContentAdapter activeStrategyRowAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: cachedSortOption$delegate, reason: from kotlin metadata */
    private final Interfaces3 cachedSortOption;
    private final GestureDetector chipGestureDetector;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: compositeAdapterPosition$delegate, reason: from kotlin metadata */
    private final Interfaces3 compositeAdapterPosition;

    /* renamed from: disclosureHeight$delegate, reason: from kotlin metadata */
    private final Interfaces3 disclosureHeight;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: expiredHeaderHeight$delegate, reason: from kotlin metadata */
    private final Interfaces3 expiredHeaderHeight;
    private final SingleItemAdapter<View, Unit> expiredStrategyDisclosureAdapter;
    private final SingleItemAdapter<View, Unit> expiredStrategyHeaderAdapter;
    private final OptionWatchlistHubContentAdapter expiredStrategyRowAdapter;

    /* renamed from: rowHeight$delegate, reason: from kotlin metadata */
    private final Interfaces3 rowHeight;
    private final SingleItemAdapter<View, Unit> spacerAdapter;

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onAllCuratedListsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onAllCuratedListsViewModeChange(this, securityViewMode);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onCuratedListViewModeChange(SecurityViewMode securityViewMode, UUID uuid, String str) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onCuratedListViewModeChange(this, securityViewMode, uuid, str);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onHoldingsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onHoldingsViewModeChange(this, securityViewMode);
    }

    public OptionWatchlistHubContentFragment() {
        super(C20943R.layout.fragment_option_watchlist_hub_content);
        this.duxo = OldDuxos.oldDuxo(this, OptionWatchlistHubContentDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionWatchlistHubContentFragment3.INSTANCE);
        Interfaces<Object, Interfaces3<Object, Integer>> interfacesSavedInt = BindSavedState2.savedInt(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.rowHeight = interfacesSavedInt.provideDelegate(this, kPropertyArr[1]);
        this.activeHeaderHeight = BindSavedState2.savedInt(this).provideDelegate(this, kPropertyArr[2]);
        this.expiredHeaderHeight = BindSavedState2.savedInt(this).provideDelegate(this, kPropertyArr[3]);
        this.disclosureHeight = BindSavedState2.savedInt(this).provideDelegate(this, kPropertyArr[4]);
        this.cachedSortOption = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[5]);
        this.compositeAdapterPosition = BindSavedState2.savedInt(this, 0).provideDelegate(this, kPropertyArr[6]);
        this.chipGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$chipGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.this$0.showSortingBottomSheet();
                return true;
            }
        });
        SingleItemAdapter<View, Unit> singleItemAdapterCreateSingleAdapter$default = createSingleAdapter$default(this, C20943R.layout.row_active_header, new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$activeStrategyHeaderAdapter$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((OptionWatchlistHubContentFragment) this.receiver).getActiveHeaderHeight();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((OptionWatchlistHubContentFragment) this.receiver).setActiveHeaderHeight((Integer) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.activeStrategyHeaderAdapter$lambda$0(this.f$0, (View) obj);
            }
        }, false, 8, null);
        this.activeStrategyHeaderAdapter = singleItemAdapterCreateSingleAdapter$default;
        OptionWatchlistHubContentAdapter optionWatchlistHubContentAdapter = new OptionWatchlistHubContentAdapter(this, false);
        this.activeStrategyRowAdapter = optionWatchlistHubContentAdapter;
        SingleItemAdapter<View, Unit> singleItemAdapterCreateSingleAdapter$default2 = createSingleAdapter$default(this, C20943R.layout.row_expired_header_space, null, null, false, 6, null);
        this.spacerAdapter = singleItemAdapterCreateSingleAdapter$default2;
        SingleItemAdapter<View, Unit> singleItemAdapterCreateSingleAdapter$default3 = createSingleAdapter$default(this, C20943R.layout.row_expired_header, new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$expiredStrategyHeaderAdapter$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((OptionWatchlistHubContentFragment) this.receiver).getExpiredHeaderHeight();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((OptionWatchlistHubContentFragment) this.receiver).setExpiredHeaderHeight((Integer) obj);
            }
        }, null, false, 4, null);
        this.expiredStrategyHeaderAdapter = singleItemAdapterCreateSingleAdapter$default3;
        OptionWatchlistHubContentAdapter optionWatchlistHubContentAdapter2 = new OptionWatchlistHubContentAdapter(this, true);
        this.expiredStrategyRowAdapter = optionWatchlistHubContentAdapter2;
        SingleItemAdapter<View, Unit> singleItemAdapterCreateSingleAdapter$default4 = createSingleAdapter$default(this, C20943R.layout.row_expired_disclosure, new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$expiredStrategyDisclosureAdapter$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((OptionWatchlistHubContentFragment) this.receiver).getDisclosureHeight();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((OptionWatchlistHubContentFragment) this.receiver).setDisclosureHeight((Integer) obj);
            }
        }, null, false, 4, null);
        this.expiredStrategyDisclosureAdapter = singleItemAdapterCreateSingleAdapter$default4;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterCreateSingleAdapter$default, optionWatchlistHubContentAdapter, singleItemAdapterCreateSingleAdapter$default2, singleItemAdapterCreateSingleAdapter$default3, optionWatchlistHubContentAdapter2, singleItemAdapterCreateSingleAdapter$default4});
    }

    private final OptionWatchlistHubContentDuxo getDuxo() {
        return (OptionWatchlistHubContentDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionWatchlistHubContentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionWatchlistHubContentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getRowHeight() {
        return (Integer) this.rowHeight.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRowHeight(Integer num) {
        this.rowHeight.setValue(this, $$delegatedProperties[1], num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getActiveHeaderHeight() {
        return (Integer) this.activeHeaderHeight.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveHeaderHeight(Integer num) {
        this.activeHeaderHeight.setValue(this, $$delegatedProperties[2], num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getExpiredHeaderHeight() {
        return (Integer) this.expiredHeaderHeight.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpiredHeaderHeight(Integer num) {
        this.expiredHeaderHeight.setValue(this, $$delegatedProperties[3], num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getDisclosureHeight() {
        return (Integer) this.disclosureHeight.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisclosureHeight(Integer num) {
        this.disclosureHeight.setValue(this, $$delegatedProperties[4], num);
    }

    private final SortOption getCachedSortOption() {
        return (SortOption) this.cachedSortOption.getValue(this, $$delegatedProperties[5]);
    }

    private final void setCachedSortOption(SortOption sortOption) {
        this.cachedSortOption.setValue(this, $$delegatedProperties[5], sortOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCompositeAdapterPosition() {
        return ((Number) this.compositeAdapterPosition.getValue(this, $$delegatedProperties[6])).intValue();
    }

    private final void setCompositeAdapterPosition(int i) {
        this.compositeAdapterPosition.setValue(this, $$delegatedProperties[6], Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getHeaderHeight() {
        return getExpiredStrategyHeaderVisibility() ? getExpiredHeaderHeight() : getActiveHeaderHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit activeStrategyHeaderAdapter$lambda$0(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, View createSingleAdapter) {
        Intrinsics.checkNotNullParameter(createSingleAdapter, "$this$createSingleAdapter");
        RdsChip optionWatchlistSortChip = RowActiveHeaderBinding.bind(createSingleAdapter).optionWatchlistSortChip;
        Intrinsics.checkNotNullExpressionValue(optionWatchlistSortChip, "optionWatchlistSortChip");
        optionWatchlistHubContentFragment.bindSortChip(optionWatchlistSortChip);
        return Unit.INSTANCE;
    }

    private final boolean getActiveStrategyHeaderVisibility() {
        return this.activeStrategyHeaderAdapter.getData() != null;
    }

    private final void setActiveStrategyHeaderVisibility(boolean z) {
        Unit unit = z ? Unit.INSTANCE : null;
        if (Intrinsics.areEqual(unit, this.activeStrategyHeaderAdapter.getData())) {
            return;
        }
        this.spacerAdapter.setData(unit);
        this.activeStrategyHeaderAdapter.setData(unit);
        updateRecyclerViewBottomPadding();
    }

    private final boolean getExpiredStrategyHeaderVisibility() {
        return this.expiredStrategyHeaderAdapter.getData() != null;
    }

    private final void setExpiredStrategyHeaderVisibility(boolean z) {
        Unit unit = z ? Unit.INSTANCE : null;
        if (Intrinsics.areEqual(unit, this.expiredStrategyHeaderAdapter.getData())) {
            return;
        }
        this.spacerAdapter.setData(unit);
        this.expiredStrategyHeaderAdapter.setData(unit);
        this.expiredStrategyDisclosureAdapter.setData(unit);
        updateRecyclerViewBottomPadding();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final OptionWatchlistGraphViewState apply(OptionWatchlistHubContentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getGraphState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209732(getBinding().optionWatchlistGraphLayout));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().optionWatchlistGraphLayout.getGraphSelectionChangedObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209743(getDuxo()));
    }

    /* compiled from: OptionWatchlistHubContentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onStart$2 */
    /* synthetic */ class C209732 extends FunctionReferenceImpl implements Function1<OptionWatchlistGraphViewState, Unit> {
        C209732(Object obj) {
            super(1, obj, OptionWatchlistGraphLayout.class, "bind", "bind(Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionWatchlistGraphViewState optionWatchlistGraphViewState) {
            invoke2(optionWatchlistGraphViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionWatchlistGraphViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionWatchlistGraphLayout) this.receiver).bind(p0);
        }
    }

    /* compiled from: OptionWatchlistHubContentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onStart$3 */
    /* synthetic */ class C209743 extends FunctionReferenceImpl implements Function1<GraphSelection, Unit> {
        C209743(Object obj) {
            super(1, obj, OptionWatchlistHubContentDuxo.class, "setGraphSelection", "setGraphSelection(Lcom/robinhood/models/ui/GraphSelection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GraphSelection graphSelection) {
            invoke2(graphSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphSelection p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionWatchlistHubContentDuxo) this.receiver).setGraphSelection(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().optionWatchlistRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.onViewCreated.1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                OptionWatchlistHubContentFragment.this.updateRecyclerViewBottomPadding();
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionWatchlistHubContentViewState) it).getActiveWatchlistItems();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.onViewCreated$lambda$2(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionWatchlistHubContentViewState) it).getExpiredWatchlistItems();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.onViewCreated$lambda$4(this.f$0, (List) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionWatchlistHubContentViewState) it).getUpdatedListErrorEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C20967x9fa23ab4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.onViewCreated$lambda$7(this.f$0, (UiEvent) obj);
            }
        });
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new OptionWatchlistItemTouchHelperCallbacks(contextRequireContext, this.activeStrategyRowAdapter, new Function2() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionWatchlistHubContentFragment.onViewCreated$lambda$8(this.f$0, (String) obj, ((Integer) obj2).intValue());
            }
        }, new OptionWatchlistHubContentFragment9(getDuxo())));
        RecyclerView recyclerView = getBinding().optionWatchlistRecyclerView;
        recyclerView.setAdapter(this.compositeAdapter);
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new StickyHeaderDecoration(recyclerView, this.compositeAdapter, new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionWatchlistHubContentFragment.onViewCreated$lambda$10$lambda$9(this.f$0, ((Integer) obj).intValue()));
            }
        }));
        itemTouchHelper.attachToRecyclerView(recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerViews.addAutoSelectingScrollListener$default(recyclerView, new OptionWatchlistHubContentFragment7(this), new OptionWatchlistHubContentFragment8(this), null, 4, null);
        new OptionWatchlistHubSnapHelper().attachToRecyclerView(recyclerView);
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.onViewCreated.9
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionWatchlistHubContentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isLoadingListItems());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.onViewCreated$lambda$11((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, List activeWatchlistItems) {
        Intrinsics.checkNotNullParameter(activeWatchlistItems, "activeWatchlistItems");
        optionWatchlistHubContentFragment.setActiveStrategyHeaderVisibility(!activeWatchlistItems.isEmpty());
        optionWatchlistHubContentFragment.activeStrategyRowAdapter.submitList(activeWatchlistItems);
        optionWatchlistHubContentFragment.selectFirstItemIfNothingSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, List expiredWatchlistItems) {
        Intrinsics.checkNotNullParameter(expiredWatchlistItems, "expiredWatchlistItems");
        optionWatchlistHubContentFragment.setExpiredStrategyHeaderVisibility(!expiredWatchlistItems.isEmpty());
        optionWatchlistHubContentFragment.expiredStrategyRowAdapter.submitList(expiredWatchlistItems);
        optionWatchlistHubContentFragment.selectFirstItemIfNothingSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, UiEvent updateErrorEvent) {
        String string2;
        Intrinsics.checkNotNullParameter(updateErrorEvent, "updateErrorEvent");
        Throwable th = (Throwable) updateErrorEvent.consume();
        if (th != null) {
            optionWatchlistHubContentFragment.activeStrategyRowAdapter.notifyDataSetChanged();
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
            GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
            if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
                string2 = optionWatchlistHubContentFragment.getString(C11048R.string.general_error_unable_to_save_changes);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            FragmentActivity fragmentActivityRequireActivity = optionWatchlistHubContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, string2, -1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, String strategyCode, int i) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        optionWatchlistHubContentFragment.getDuxo().synchronizeActiveListPositionChange(strategyCode, i - optionWatchlistHubContentFragment.compositeAdapter.getFirstItemPositionOf(optionWatchlistHubContentFragment.activeStrategyRowAdapter));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$10$lambda$9(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, int i) {
        RecyclerView.Adapter<?> value = optionWatchlistHubContentFragment.compositeAdapter.adapterPositionToTarget(i).getChild().getValue();
        return Intrinsics.areEqual(value, optionWatchlistHubContentFragment.activeStrategyHeaderAdapter) || Intrinsics.areEqual(value, optionWatchlistHubContentFragment.expiredStrategyHeaderAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSortingBottomSheet() {
        Observable<OptionWatchlistHubContentViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable<R> map = observableTake.map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$showSortingBottomSheet$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionWatchlistHubContentViewState) it).getLocalSortOption());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C20968xa4c32d09<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.showSortingBottomSheet$lambda$13(this.f$0, (SortOption) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSortingBottomSheet$lambda$13(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        OptionWatchlistSortBottomSheetFragment optionWatchlistSortBottomSheetFragment = (OptionWatchlistSortBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(OptionWatchlistSortBottomSheetFragment.INSTANCE, new OptionWatchlistSortBottomSheetFragment.Args(sortOption), optionWatchlistHubContentFragment, 0, 4, null);
        FragmentManager parentFragmentManager = optionWatchlistHubContentFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        optionWatchlistSortBottomSheetFragment.show(parentFragmentManager, "CuratedListSortItemsBottomSheetFragment");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks
    public void onSortOptionSelected(SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        getDuxo().sortList(sortOption);
    }

    private final void setRecyclerViewPadding(final View rowView, final KProperty3<Integer> heightProperty) {
        if (heightProperty.get() == null) {
            rowView.post(new Runnable() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.setRecyclerViewPadding.1
                @Override // java.lang.Runnable
                public final void run() {
                    heightProperty.set(Integer.valueOf(rowView.getHeight()));
                    this.updateRecyclerViewBottomPadding();
                }
            });
        }
    }

    @Override // com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter.Callbacks
    public void onStrategyRowBound(View rowView) {
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        setRecyclerViewPadding(rowView, new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.onStrategyRowBound.1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((OptionWatchlistHubContentFragment) this.receiver).getRowHeight();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((OptionWatchlistHubContentFragment) this.receiver).setRowHeight((Integer) obj);
            }
        });
    }

    @Override // com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter.Callbacks
    public void showAggregateDetail(String initialStrategyCode, List<String> strategyCodeList) {
        Intrinsics.checkNotNullParameter(initialStrategyCode, "initialStrategyCode");
        Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(initialStrategyCode, false, strategyCodeList, null, null, 26, null)), false, false, false, null, false, null, false, false, null, null, 4092, null);
        getDuxo().logActiveRowTap(initialStrategyCode);
    }

    @Override // com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter.Callbacks
    public void onExpiredOptionStrategyRowTapped(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Bundle bundle = new Bundle();
        bundle.putString(EXPIRED_ERROR_DIALOG_STRATEGY_CODE, strategyCode);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder passthroughArgs = companion.create(contextRequireContext).setId(C20943R.id.dialog_id_option_watchlist_hub_expired_error).setUseDesignSystemOverlay(true).setTitle(C20943R.string.option_watchlist_expired_dialog_title, new Object[0]).setMessage(C20943R.string.option_watchlist_expired_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setPassthroughArgs(bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, "option-strategy-expired", false, 4, null).setCancelable(false);
        getDuxo().logExpiredDialogAppear(strategyCode);
    }

    @Override // com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter.Callbacks
    public void onQuoteClicked() {
        ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment = (ViewModeSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(ViewModeSelectionBottomSheetFragment.INSTANCE, new ViewModeSelectionBottomSheetFragment.Args(ViewModeSelectionType.OptionsWatchlist.INSTANCE, ((Args) INSTANCE.getArgs((Fragment) this)).getOptionsWatchlistId(), getString(C20943R.string.option_watchlist_title)), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        viewModeSelectionBottomSheetFragment.show(parentFragmentManager, "viewModeBottomSheet");
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onOptionsWatchlistViewModeChange(SecurityViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        OptionWatchlistHubContentAdapter optionWatchlistHubContentAdapter = this.activeStrategyRowAdapter;
        optionWatchlistHubContentAdapter.notifyItemRangeChanged(0, optionWatchlistHubContentAdapter.getSize());
        OptionWatchlistHubContentAdapter optionWatchlistHubContentAdapter2 = this.expiredStrategyRowAdapter;
        optionWatchlistHubContentAdapter2.notifyItemRangeChanged(0, optionWatchlistHubContentAdapter2.getSize());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        String string2;
        if (id != C20943R.id.dialog_id_option_watchlist_hub_expired_error) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        if (passthroughArgs != null && (string2 = passthroughArgs.getString(EXPIRED_ERROR_DIALOG_STRATEGY_CODE)) != null) {
            getDuxo().logExpiredDialogDisappear(string2);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindSortChip(final RdsChip rdsChip) {
        rdsChip.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.bindSortChip.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                OptionWatchlistHubContentFragment.this.chipGestureDetector.onTouchEvent(motionEvent);
                return false;
            }
        });
        SortOption cachedSortOption = getCachedSortOption();
        if (cachedSortOption != null) {
            rdsChip.setText(getString(SortOptions.getOptionWatchlistChipRes(cachedSortOption.getSortOrder())));
        }
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$bindSortChip$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionWatchlistHubContentViewState) it).getLocalSortOption();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.bindSortChip$lambda$18(this.f$0, rdsChip, (SortOption) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSortChip$lambda$18(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, RdsChip rdsChip, SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        optionWatchlistHubContentFragment.setCachedSortOption(sortOption);
        rdsChip.setText(optionWatchlistHubContentFragment.getString(SortOptions.getOptionWatchlistChipRes(sortOption.getSortOrder())));
        return Unit.INSTANCE;
    }

    private final void selectFirstItemIfNothingSelected() {
        getBinding().optionWatchlistRecyclerView.post(new Runnable() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment.selectFirstItemIfNothingSelected.1
            @Override // java.lang.Runnable
            public final void run() {
                if (OptionWatchlistHubContentFragment.this.activeStrategyRowAdapter.getHighlightedRowIndex() == null && OptionWatchlistHubContentFragment.this.expiredStrategyRowAdapter.getHighlightedRowIndex() == null) {
                    OptionWatchlistHubContentFragment.this.onCompositeAdapterPositionSelected(0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectedItemIndex(LinearLayoutManager layoutManager) {
        Integer next;
        Iterator<Integer> it = RangesKt.until(layoutManager.findFirstVisibleItemPosition(), layoutManager.getItemCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View viewFindViewByPosition = layoutManager.findViewByPosition(next.intValue());
            if (viewFindViewByPosition == null) {
                return -1;
            }
            int top = viewFindViewByPosition.getTop();
            Integer headerHeight = getHeaderHeight();
            if (Math.abs(Math.min(top - (headerHeight != null ? headerHeight.intValue() : 0), 0)) <= viewFindViewByPosition.getHeight() / 3) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCompositeAdapterPositionSelected(int compositeAdapterPosition) {
        if (compositeAdapterPosition >= this.compositeAdapter.getSize()) {
            return;
        }
        CompositeAdapter.Target targetAdapterPositionToTarget = this.compositeAdapter.adapterPositionToTarget(compositeAdapterPosition);
        RecyclerView.Adapter<?> value = targetAdapterPositionToTarget.getChild().getValue();
        if (Intrinsics.areEqual(value, this.activeStrategyRowAdapter)) {
            this.activeStrategyRowAdapter.setHighlightedRowIndex(Integer.valueOf(targetAdapterPositionToTarget.getChildPosition()));
            this.expiredStrategyRowAdapter.setHighlightedRowIndex(null);
            getDuxo().setSelectedRowIndex(targetAdapterPositionToTarget.getChildPosition(), false);
            setCompositeAdapterPosition(compositeAdapterPosition);
            return;
        }
        if (Intrinsics.areEqual(value, this.expiredStrategyRowAdapter)) {
            this.expiredStrategyRowAdapter.setHighlightedRowIndex(Integer.valueOf(targetAdapterPositionToTarget.getChildPosition()));
            this.activeStrategyRowAdapter.setHighlightedRowIndex(null);
            getDuxo().setSelectedRowIndex(targetAdapterPositionToTarget.getChildPosition(), true);
            setCompositeAdapterPosition(compositeAdapterPosition);
            return;
        }
        if (Intrinsics.areEqual(value, this.activeStrategyHeaderAdapter) || Intrinsics.areEqual(value, this.expiredStrategyHeaderAdapter)) {
            onCompositeAdapterPositionSelected(compositeAdapterPosition + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecyclerViewBottomPadding() {
        Integer rowHeight;
        LifecycleEvent value = getLifecycleEvents().getValue();
        if ((value == null || !value.isAtLeast(LifecycleEvent.ON_DESTROY_VIEW)) && (rowHeight = getRowHeight()) != null) {
            final int iIntValue = rowHeight.intValue();
            Integer headerHeight = getHeaderHeight();
            final int iIntValue2 = 0;
            final int iIntValue3 = headerHeight != null ? headerHeight.intValue() : 0;
            Integer disclosureHeight = getDisclosureHeight();
            if (disclosureHeight != null) {
                if (!getExpiredStrategyHeaderVisibility()) {
                    disclosureHeight = null;
                }
                if (disclosureHeight != null) {
                    iIntValue2 = disclosureHeight.intValue();
                }
            }
            final RecyclerView optionWatchlistRecyclerView = getBinding().optionWatchlistRecyclerView;
            Intrinsics.checkNotNullExpressionValue(optionWatchlistRecyclerView, "optionWatchlistRecyclerView");
            OneShotPreDrawListener.add(optionWatchlistRecyclerView, new Runnable() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$updateRecyclerViewBottomPadding$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = optionWatchlistRecyclerView;
                    ViewsKt.setBottomPadding(view, ((view.getHeight() - iIntValue) - iIntValue3) - iIntValue2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ SingleItemAdapter createSingleAdapter$default(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, int i, KProperty3 kProperty3, Function1 function1, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            kProperty3 = null;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionWatchlistHubContentFragment.createSingleAdapter$lambda$22((View) obj2);
                }
            };
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        return optionWatchlistHubContentFragment.createSingleAdapter(i, kProperty3, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSingleAdapter$lambda$22(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return Unit.INSTANCE;
    }

    private final SingleItemAdapter<View, Unit> createSingleAdapter(int layoutResId, final KProperty3<Integer> heightProperty, final Function1<? super View, Unit> bind, boolean isVisible) {
        SingleItemAdapter<View, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(SingleItemAdapter.INSTANCE, layoutResId, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentFragment.createSingleAdapter$lambda$23(heightProperty, this, bind, (View) obj);
            }
        }, 2, (Object) null);
        if (!isVisible) {
            singleItemAdapterOfUnit$default.setData(null);
        }
        return singleItemAdapterOfUnit$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSingleAdapter$lambda$23(KProperty3 kProperty3, OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, Function1 function1, View ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        if (kProperty3 != null) {
            optionWatchlistHubContentFragment.setRecyclerViewPadding(ofUnit, kProperty3);
        }
        function1.invoke(ofUnit);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionWatchlistHubContentFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment$OptionWatchlistHubSnapHelper;", "Landroidx/recyclerview/widget/LinearSnapHelper;", "<init>", "(Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment;)V", "orientationHelper", "Landroidx/recyclerview/widget/OrientationHelper;", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "findSnapView", "findTargetSnapPosition", "", "velocityX", "velocityY", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class OptionWatchlistHubSnapHelper extends LinearSnapHelper {
        private final OrientationHelper orientationHelper;

        @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
        public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
            return -1;
        }

        public OptionWatchlistHubSnapHelper() {
            OrientationHelper orientationHelperCreateVerticalHelper = OrientationHelper.createVerticalHelper(OptionWatchlistHubContentFragment.this.getBinding().optionWatchlistRecyclerView.getLayoutManager());
            Intrinsics.checkNotNullExpressionValue(orientationHelperCreateVerticalHelper, "createVerticalHelper(...)");
            this.orientationHelper = orientationHelperCreateVerticalHelper;
        }

        @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
        public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            int decoratedStart = this.orientationHelper.getDecoratedStart(targetView);
            Integer headerHeight = OptionWatchlistHubContentFragment.this.getHeaderHeight();
            return new int[]{0, decoratedStart - (headerHeight != null ? headerHeight.intValue() : 0)};
        }

        @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = OptionWatchlistHubContentFragment.this.getBinding().optionWatchlistRecyclerView.findViewHolderForAdapterPosition(OptionWatchlistHubContentFragment.this.getCompositeAdapterPosition());
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                return viewHolderFindViewHolderForAdapterPosition.itemView;
            }
            return null;
        }
    }

    /* compiled from: OptionWatchlistHubContentFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment$Args;", "Landroid/os/Parcelable;", "optionsWatchlistId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionsWatchlistId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID optionsWatchlistId;

        /* compiled from: OptionWatchlistHubContentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.optionsWatchlistId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOptionsWatchlistId() {
            return this.optionsWatchlistId;
        }

        public final Args copy(UUID optionsWatchlistId) {
            Intrinsics.checkNotNullParameter(optionsWatchlistId, "optionsWatchlistId");
            return new Args(optionsWatchlistId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.optionsWatchlistId, ((Args) other).optionsWatchlistId);
        }

        public int hashCode() {
            return this.optionsWatchlistId.hashCode();
        }

        public String toString() {
            return "Args(optionsWatchlistId=" + this.optionsWatchlistId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.optionsWatchlistId);
        }

        public Args(UUID optionsWatchlistId) {
            Intrinsics.checkNotNullParameter(optionsWatchlistId, "optionsWatchlistId");
            this.optionsWatchlistId = optionsWatchlistId;
        }

        public final UUID getOptionsWatchlistId() {
            return this.optionsWatchlistId;
        }
    }

    /* compiled from: OptionWatchlistHubContentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment$Args;", "<init>", "()V", OptionWatchlistHubContentFragment.EXPIRED_ERROR_DIALOG_STRATEGY_CODE, "", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionWatchlistHubContentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionWatchlistHubContentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionWatchlistHubContentFragment newInstance(Args args) {
            return (OptionWatchlistHubContentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionWatchlistHubContentFragment optionWatchlistHubContentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionWatchlistHubContentFragment, args);
        }
    }
}
