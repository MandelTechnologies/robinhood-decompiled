package com.robinhood.viewmode;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.lib.watchlist.C20683R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.viewmode.ViewModeSelectionType;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
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

/* compiled from: ViewModeSelectionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020 H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "duxo", "Lcom/robinhood/viewmode/ViewModeSelectionDuxo;", "getDuxo", "()Lcom/robinhood/viewmode/ViewModeSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewModeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getViewModeRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "viewModeRecyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sheetTitleTxt", "Landroid/widget/TextView;", "getSheetTitleTxt", "()Landroid/widget/TextView;", "sheetTitleTxt$delegate", "viewModeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/viewmode/ViewModeSelectionRowView;", "Lkotlin/Pair;", "Lcom/robinhood/android/common/util/SecurityViewMode;", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onResume", "Callbacks", "Args", "Companion", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ViewModeSelectionBottomSheetFragment extends BaseBottomSheetDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ViewModeSelectionBottomSheetFragment.class, "viewModeRecyclerView", "getViewModeRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(ViewModeSelectionBottomSheetFragment.class, "sheetTitleTxt", "getSheetTitleTxt()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, ViewModeSelectionDuxo.class);

    /* renamed from: viewModeRecyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewModeRecyclerView = bindView(C20683R.id.view_mode_selection_recycler_view);

    /* renamed from: sheetTitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 sheetTitleTxt = bindView(C20683R.id.view_mode_selection_title_txt);
    private final GenericListAdapter<ViewModeSelectionRowView, Tuples2<SecurityViewMode, Boolean>> viewModeAdapter = GenericListAdapter.INSTANCE.m2987of(ViewModeSelectionRowView.INSTANCE, new DiffUtil.ItemCallback<Tuples2<? extends SecurityViewMode, ? extends Boolean>>() { // from class: com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment$viewModeAdapter$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(Tuples2<? extends SecurityViewMode, ? extends Boolean> tuples2, Tuples2<? extends SecurityViewMode, ? extends Boolean> tuples22) {
            return areContentsTheSame2((Tuples2<? extends SecurityViewMode, Boolean>) tuples2, (Tuples2<? extends SecurityViewMode, Boolean>) tuples22);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(Tuples2<? extends SecurityViewMode, ? extends Boolean> tuples2, Tuples2<? extends SecurityViewMode, ? extends Boolean> tuples22) {
            return areItemsTheSame2((Tuples2<? extends SecurityViewMode, Boolean>) tuples2, (Tuples2<? extends SecurityViewMode, Boolean>) tuples22);
        }

        /* renamed from: areItemsTheSame, reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(Tuples2<? extends SecurityViewMode, Boolean> oldItem, Tuples2<? extends SecurityViewMode, Boolean> newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getFirst() == newItem.getFirst();
        }

        /* renamed from: areContentsTheSame, reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(Tuples2<? extends SecurityViewMode, Boolean> oldItem, Tuples2<? extends SecurityViewMode, Boolean> newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getSecond().booleanValue() == newItem.getSecond().booleanValue();
        }
    }, new Function2() { // from class: com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ViewModeSelectionBottomSheetFragment.viewModeAdapter$lambda$1(this.f$0, (ViewModeSelectionRowView) obj, (Tuples2) obj2);
        }
    });

    /* compiled from: ViewModeSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "", "onHoldingsViewModeChange", "", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "onAllCuratedListsViewModeChange", "onCuratedListViewModeChange", "listId", "Ljava/util/UUID;", "listDisplayName", "", "onOptionsWatchlistViewModeChange", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: ViewModeSelectionBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onAllCuratedListsViewModeChange(Callbacks callbacks, SecurityViewMode viewMode) {
                Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            }

            public static void onCuratedListViewModeChange(Callbacks callbacks, SecurityViewMode viewMode, UUID listId, String listDisplayName) {
                Intrinsics.checkNotNullParameter(viewMode, "viewMode");
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(listDisplayName, "listDisplayName");
            }

            public static void onHoldingsViewModeChange(Callbacks callbacks, SecurityViewMode viewMode) {
                Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            }

            public static void onOptionsWatchlistViewModeChange(Callbacks callbacks, SecurityViewMode viewMode) {
                Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            }
        }

        void onAllCuratedListsViewModeChange(SecurityViewMode viewMode);

        void onCuratedListViewModeChange(SecurityViewMode viewMode, UUID listId, String listDisplayName);

        void onHoldingsViewModeChange(SecurityViewMode viewMode);

        void onOptionsWatchlistViewModeChange(SecurityViewMode viewMode);
    }

    private final Callbacks getCallbacks() {
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof Callbacks) {
            return (Callbacks) targetFragment;
        }
        return null;
    }

    private final ViewModeSelectionDuxo getDuxo() {
        return (ViewModeSelectionDuxo) this.duxo.getValue();
    }

    private final RecyclerView getViewModeRecyclerView() {
        return (RecyclerView) this.viewModeRecyclerView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getSheetTitleTxt() {
        return (TextView) this.sheetTitleTxt.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewModeAdapter$lambda$1(final ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment, ViewModeSelectionRowView of, Tuples2 securityViewModeToIsSelected) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(securityViewModeToIsSelected, "securityViewModeToIsSelected");
        final SecurityViewMode securityViewMode = (SecurityViewMode) securityViewModeToIsSelected.getFirst();
        of.bind(securityViewMode, ((Boolean) securityViewModeToIsSelected.getSecond()).booleanValue());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModeSelectionBottomSheetFragment.viewModeAdapter$lambda$1$lambda$0(this.f$0, securityViewMode);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewModeAdapter$lambda$1$lambda$0(ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment, SecurityViewMode securityViewMode) {
        viewModeSelectionBottomSheetFragment.getDuxo().setSecurityViewMode(securityViewMode);
        Companion companion = INSTANCE;
        ViewModeSelectionType viewModeSelectionType = ((Args) companion.getArgs((Fragment) viewModeSelectionBottomSheetFragment)).getViewModeSelectionType();
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.HoldingsAndCrypto.INSTANCE)) {
            Callbacks callbacks = viewModeSelectionBottomSheetFragment.getCallbacks();
            if (callbacks != null) {
                callbacks.onHoldingsViewModeChange(securityViewMode);
            }
        } else {
            if (viewModeSelectionType instanceof ViewModeSelectionType.PositionsV2) {
                throw new IllegalStateException("Should be handled by HoldingsValueDisplayBottomSheetFragment");
            }
            if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.AllCuratedLists.INSTANCE)) {
                Callbacks callbacks2 = viewModeSelectionBottomSheetFragment.getCallbacks();
                if (callbacks2 != null) {
                    callbacks2.onAllCuratedListsViewModeChange(securityViewMode);
                }
            } else if ((viewModeSelectionType instanceof ViewModeSelectionType.CuratedList) || Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.FuturesCuratedRhList.INSTANCE)) {
                Callbacks callbacks3 = viewModeSelectionBottomSheetFragment.getCallbacks();
                if (callbacks3 != null) {
                    UUID listId = ((Args) companion.getArgs((Fragment) viewModeSelectionBottomSheetFragment)).getListId();
                    Intrinsics.checkNotNull(listId);
                    String listDisplayName = ((Args) companion.getArgs((Fragment) viewModeSelectionBottomSheetFragment)).getListDisplayName();
                    Intrinsics.checkNotNull(listDisplayName);
                    callbacks3.onCuratedListViewModeChange(securityViewMode, listId, listDisplayName);
                }
            } else {
                if (!Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.OptionsWatchlist.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                Callbacks callbacks4 = viewModeSelectionBottomSheetFragment.getCallbacks();
                if (callbacks4 != null) {
                    callbacks4.onOptionsWatchlistViewModeChange(securityViewMode);
                }
            }
        }
        viewModeSelectionBottomSheetFragment.dismiss();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C20683R.layout.view_mode_selection_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindAdapter(getViewModeRecyclerView(), this.viewModeAdapter);
        RecyclerView viewModeRecyclerView = getViewModeRecyclerView();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        viewModeRecyclerView.setItemAnimator(defaultItemAnimator);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewModeSelectionBottomSheetFragment.onResume$lambda$4(this.f$0, (ViewModeSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment, ViewModeSelectionViewState state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModeSelectionType viewModeSelectionType = ((Args) INSTANCE.getArgs((Fragment) viewModeSelectionBottomSheetFragment)).getViewModeSelectionType();
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.HoldingsAndCrypto.INSTANCE)) {
            i = C20683R.string.watchlist_holdings_display_data;
        } else {
            if (viewModeSelectionType instanceof ViewModeSelectionType.PositionsV2) {
                throw new IllegalStateException("Should be handled by HoldingsValueDisplayBottomSheetFragment");
            }
            if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.AllCuratedLists.INSTANCE)) {
                i = C20683R.string.lists_display_data;
            } else {
                if (!(viewModeSelectionType instanceof ViewModeSelectionType.CuratedList) && !Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.OptionsWatchlist.INSTANCE) && !Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.FuturesCuratedRhList.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C20683R.string.display_data;
            }
        }
        viewModeSelectionBottomSheetFragment.getSheetTitleTxt().setText(i);
        viewModeSelectionBottomSheetFragment.viewModeAdapter.submitList(state.getSecurityViewModes());
        return Unit.INSTANCE;
    }

    /* compiled from: ViewModeSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "viewModeSelectionType", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "listId", "Ljava/util/UUID;", "listDisplayName", "", "<init>", "(Lcom/robinhood/viewmode/ViewModeSelectionType;Ljava/util/UUID;Ljava/lang/String;)V", "getViewModeSelectionType", "()Lcom/robinhood/viewmode/ViewModeSelectionType;", "getListId", "()Ljava/util/UUID;", "getListDisplayName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String listDisplayName;
        private final UUID listId;
        private final ViewModeSelectionType viewModeSelectionType;

        /* compiled from: ViewModeSelectionBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ViewModeSelectionType) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ViewModeSelectionType viewModeSelectionType, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                viewModeSelectionType = args.viewModeSelectionType;
            }
            if ((i & 2) != 0) {
                uuid = args.listId;
            }
            if ((i & 4) != 0) {
                str = args.listDisplayName;
            }
            return args.copy(viewModeSelectionType, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ViewModeSelectionType getViewModeSelectionType() {
            return this.viewModeSelectionType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getListId() {
            return this.listId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getListDisplayName() {
            return this.listDisplayName;
        }

        public final Args copy(ViewModeSelectionType viewModeSelectionType, UUID listId, String listDisplayName) {
            Intrinsics.checkNotNullParameter(viewModeSelectionType, "viewModeSelectionType");
            return new Args(viewModeSelectionType, listId, listDisplayName);
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
            return Intrinsics.areEqual(this.viewModeSelectionType, args.viewModeSelectionType) && Intrinsics.areEqual(this.listId, args.listId) && Intrinsics.areEqual(this.listDisplayName, args.listDisplayName);
        }

        public int hashCode() {
            int iHashCode = this.viewModeSelectionType.hashCode() * 31;
            UUID uuid = this.listId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.listDisplayName;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(viewModeSelectionType=" + this.viewModeSelectionType + ", listId=" + this.listId + ", listDisplayName=" + this.listDisplayName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.viewModeSelectionType, flags);
            dest.writeSerializable(this.listId);
            dest.writeString(this.listDisplayName);
        }

        public Args(ViewModeSelectionType viewModeSelectionType, UUID uuid, String str) {
            Intrinsics.checkNotNullParameter(viewModeSelectionType, "viewModeSelectionType");
            this.viewModeSelectionType = viewModeSelectionType;
            this.listId = uuid;
            this.listDisplayName = str;
        }

        public /* synthetic */ Args(ViewModeSelectionType viewModeSelectionType, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewModeSelectionType, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str);
        }

        public final ViewModeSelectionType getViewModeSelectionType() {
            return this.viewModeSelectionType;
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final String getListDisplayName() {
            return this.listDisplayName;
        }
    }

    /* compiled from: ViewModeSelectionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u0007\u001a\u00020\u0002\"\f\b\u0000\u0010\b*\u00020\t*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Args;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "<init>", "()V", "newInstance", "C", "Landroidx/fragment/app/Fragment;", "args", "callbacks", "requestCode", "", "(Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Args;Landroidx/fragment/app/Fragment;I)Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment;", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<ViewModeSelectionBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, viewModeSelectionBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> ViewModeSelectionBottomSheetFragment newInstance(Args args, C callbacks, int requestCode) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            if (args.getViewModeSelectionType() instanceof ViewModeSelectionType.CuratedList) {
                if (args.getListId() == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (args.getListDisplayName() == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return (ViewModeSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, callbacks, requestCode);
        }
    }
}
