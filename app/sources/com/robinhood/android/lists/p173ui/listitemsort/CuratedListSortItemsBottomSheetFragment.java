package com.robinhood.android.lists.p173ui.listitemsort;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.extensions.SortDirections;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListItemSortDuxo;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListItemSortViewState;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.UUID;
import kotlin.Lazy;
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

/* compiled from: CuratedListSortItemsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002BCB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020'H\u0016J\b\u00106\u001a\u00020'H\u0002J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020;X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010;X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010=¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortItemsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortDuxo;", "getDuxo", "()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "sortOptionRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getSortOptionRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "sortOptionRecyclerView$delegate", "sortOptionAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortOptionItemView;", "Lcom/robinhood/models/ui/SortOption;", "doneBtn", "Landroid/widget/Button;", "getDoneBtn", "()Landroid/widget/Button;", "doneBtn$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "currentSortOption", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "onResume", "onSortOptionSelected", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "entityId", "getEntityId", "Args", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListSortItemsBottomSheetFragment extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String SCREEN_DESCRIPTION = "ldp_sort";
    private static final String SCREEN_NAME = "ListDetailPage";
    public AnalyticsLogger analytics;
    private SortOption currentSortOption;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListSortItemsBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListSortItemsBottomSheetFragment.class, "sortOptionRecyclerView", "getSortOptionRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListSortItemsBottomSheetFragment.class, "doneBtn", "getDoneBtn()Landroid/widget/Button;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CuratedListSortCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CuratedListItemSortDuxo.class);

    /* renamed from: sortOptionRecyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 sortOptionRecyclerView = bindView(C20839R.id.curated_list_item_sort_option_recycler_view);
    private final GenericListAdapter<CuratedListSortOptionItemView, SortOption> sortOptionAdapter = GenericListAdapter.INSTANCE.m2987of(CuratedListSortOptionItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$sortOptionAdapter$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((SortOption) obj).getSortOrder();
        }
    }), new Function2() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return CuratedListSortItemsBottomSheetFragment.sortOptionAdapter$lambda$1(this.f$0, (CuratedListSortOptionItemView) obj, (SortOption) obj2);
        }
    });

    /* renamed from: doneBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneBtn = bindView(C20839R.id.curated_list_item_sort_done_btn);
    private final String screenName = SCREEN_NAME;
    private final String screenDescription = "ldp_sort";

    private final CuratedListSortCallbacks getCallbacks() {
        return (CuratedListSortCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final CuratedListItemSortDuxo getDuxo() {
        return (CuratedListItemSortDuxo) this.duxo.getValue();
    }

    private final RecyclerView getSortOptionRecyclerView() {
        return (RecyclerView) this.sortOptionRecyclerView.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortOptionAdapter$lambda$1(final CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment, CuratedListSortOptionItemView of, final SortOption state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListSortItemsBottomSheetFragment.sortOptionAdapter$lambda$1$lambda$0(state, curatedListSortItemsBottomSheetFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortOptionAdapter$lambda$1$lambda$0(SortOption sortOption, CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment) {
        String str;
        ApiCuratedList.SortDirection sortDirection = sortOption.getSortDirection();
        ApiCuratedList.SortDirection[] sortDirectionArrValues = ApiCuratedList.SortDirection.values();
        ApiCuratedList.SortDirection sortDirection2 = sortDirectionArrValues[(sortDirection.ordinal() + 1) % sortDirectionArrValues.length];
        if (sortDirection2 == ApiCuratedList.SortDirection.EMPTY) {
            str = "custom";
        } else {
            str = SortOrders.getAnalyticsString(sortOption.getSortOrder()) + "_" + SortDirections.getAnalyticsString(sortDirection2);
        }
        String str2 = str;
        AnalyticsLogger analytics = curatedListSortItemsBottomSheetFragment.getAnalytics();
        Companion companion = INSTANCE;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, "ldp_sort", str2, null, null, ((Args) companion.getArgs((Fragment) curatedListSortItemsBottomSheetFragment)).getListId().toString(), ((Args) companion.getArgs((Fragment) curatedListSortItemsBottomSheetFragment)).getDisplayName(), ((Args) companion.getArgs((Fragment) curatedListSortItemsBottomSheetFragment)).getAnalyticsTag(), null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        curatedListSortItemsBottomSheetFragment.getDuxo().updateSortOption(sortOption);
        return Unit.INSTANCE;
    }

    private final Button getDoneBtn() {
        return (Button) this.doneBtn.getValue(this, $$delegatedProperties[2]);
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

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CuratedListItemSortDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.setSortOption(((Args) companion.getArgs((Fragment) this)).getSortOption());
        getDuxo().setIsFuturesOnlyList(((Args) companion.getArgs((Fragment) this)).isFuturesOnlyRhList());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C20839R.layout.curated_list_sort_items_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindAdapter(getSortOptionRecyclerView(), this.sortOptionAdapter);
        RecyclerView sortOptionRecyclerView = getSortOptionRecyclerView();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        sortOptionRecyclerView.setItemAnimator(defaultItemAnimator);
        OnClickListeners.onClick(getDoneBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListSortItemsBottomSheetFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment) {
        curatedListSortItemsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListSortItemsBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListSortItemsBottomSheetFragment.onResume$lambda$5(this.f$0, (CuratedListItemSortViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment, CuratedListItemSortViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        curatedListSortItemsBottomSheetFragment.sortOptionAdapter.submitList(state.getSortOptions());
        curatedListSortItemsBottomSheetFragment.currentSortOption = state.getCurrentSortOption();
        return Unit.INSTANCE;
    }

    private final void onSortOptionSelected() {
        SortOption sortOption = this.currentSortOption;
        if (sortOption == null || Intrinsics.areEqual(sortOption, ((Args) INSTANCE.getArgs((Fragment) this)).getSortOption())) {
            return;
        }
        getCallbacks().onSortOptionSelected(sortOption);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        onSortOptionSelected();
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return this.screenDescription;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getListId().toString();
    }

    /* compiled from: CuratedListSortItemsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortItemsBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "sortOption", "Lcom/robinhood/models/ui/SortOption;", "listId", "Ljava/util/UUID;", "displayName", "", "analyticsTag", "isFuturesOnlyRhList", "", "<init>", "(Lcom/robinhood/models/ui/SortOption;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "getSortOption", "()Lcom/robinhood/models/ui/SortOption;", "getListId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getAnalyticsTag", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String analyticsTag;
        private final String displayName;
        private final boolean isFuturesOnlyRhList;
        private final UUID listId;
        private final SortOption sortOption;

        /* compiled from: CuratedListSortItemsBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((SortOption) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, SortOption sortOption, UUID uuid, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                sortOption = args.sortOption;
            }
            if ((i & 2) != 0) {
                uuid = args.listId;
            }
            if ((i & 4) != 0) {
                str = args.displayName;
            }
            if ((i & 8) != 0) {
                str2 = args.analyticsTag;
            }
            if ((i & 16) != 0) {
                z = args.isFuturesOnlyRhList;
            }
            boolean z2 = z;
            String str3 = str;
            return args.copy(sortOption, uuid, str3, str2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final SortOption getSortOption() {
            return this.sortOption;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getListId() {
            return this.listId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsTag() {
            return this.analyticsTag;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFuturesOnlyRhList() {
            return this.isFuturesOnlyRhList;
        }

        public final Args copy(SortOption sortOption, UUID listId, String displayName, String analyticsTag, boolean isFuturesOnlyRhList) {
            Intrinsics.checkNotNullParameter(sortOption, "sortOption");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(analyticsTag, "analyticsTag");
            return new Args(sortOption, listId, displayName, analyticsTag, isFuturesOnlyRhList);
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
            return Intrinsics.areEqual(this.sortOption, args.sortOption) && Intrinsics.areEqual(this.listId, args.listId) && Intrinsics.areEqual(this.displayName, args.displayName) && Intrinsics.areEqual(this.analyticsTag, args.analyticsTag) && this.isFuturesOnlyRhList == args.isFuturesOnlyRhList;
        }

        public int hashCode() {
            return (((((((this.sortOption.hashCode() * 31) + this.listId.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.analyticsTag.hashCode()) * 31) + Boolean.hashCode(this.isFuturesOnlyRhList);
        }

        public String toString() {
            return "Args(sortOption=" + this.sortOption + ", listId=" + this.listId + ", displayName=" + this.displayName + ", analyticsTag=" + this.analyticsTag + ", isFuturesOnlyRhList=" + this.isFuturesOnlyRhList + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sortOption, flags);
            dest.writeSerializable(this.listId);
            dest.writeString(this.displayName);
            dest.writeString(this.analyticsTag);
            dest.writeInt(this.isFuturesOnlyRhList ? 1 : 0);
        }

        public Args(SortOption sortOption, UUID listId, String displayName, String analyticsTag, boolean z) {
            Intrinsics.checkNotNullParameter(sortOption, "sortOption");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(analyticsTag, "analyticsTag");
            this.sortOption = sortOption;
            this.listId = listId;
            this.displayName = displayName;
            this.analyticsTag = analyticsTag;
            this.isFuturesOnlyRhList = z;
        }

        public final SortOption getSortOption() {
            return this.sortOption;
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getAnalyticsTag() {
            return this.analyticsTag;
        }

        public final boolean isFuturesOnlyRhList() {
            return this.isFuturesOnlyRhList;
        }
    }

    /* compiled from: CuratedListSortItemsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortItemsBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortItemsBottomSheetFragment;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortItemsBottomSheetFragment$Args;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "<init>", "()V", "SCREEN_NAME", "", "SCREEN_DESCRIPTION", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<CuratedListSortItemsBottomSheetFragment, Args, CuratedListSortCallbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, curatedListSortItemsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & CuratedListSortCallbacks> CuratedListSortItemsBottomSheetFragment newInstance(Args args, C c, int i) {
            return (CuratedListSortItemsBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
