package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButtonContainerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.deletelist.DeleteCuratedListBottomSheetFragment;
import com.robinhood.android.lists.p173ui.userlist.CuratedListMenuOptionsBottomSheetFragment;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: CuratedListMenuOptionsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0003DEFB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u00020.2\u0006\u0010:\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020=H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010>\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u001eR\u0016\u0010@\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001eR\u0016\u0010B\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u001e¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "doneButtonContainer", "Lcom/robinhood/android/designsystem/button/RdsButtonContainerView;", "getDoneButtonContainer", "()Lcom/robinhood/android/designsystem/button/RdsButtonContainerView;", "doneButtonContainer$delegate", CuratedListMenuOptionsBottomSheetFragment.ARG_CURATED_LIST_ID, "Ljava/util/UUID;", "getCuratedListId", "()Ljava/util/UUID;", "curatedListId$delegate", "Lkotlin/Lazy;", CuratedListMenuOptionsBottomSheetFragment.ARG_CURATED_LIST_DISPLAY_NAME, "", "getCuratedListDisplayName", "()Ljava/lang/String;", "curatedListDisplayName$delegate", "curatedOwnerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getCuratedOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "curatedOwnerType$delegate", "dismissingByMenuItemClick", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "screenName", "getScreenName", "screenDescription", "getScreenDescription", "entityId", "getEntityId", "Callbacks", "MenuOptionItem", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListMenuOptionsBottomSheetFragment extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String ARG_CURATED_LIST_DISPLAY_NAME = "curatedListDisplayName";
    private static final String ARG_CURATED_LIST_ID = "curatedListId";
    private static final String ARG_CURATED_LIST_OWNER_TYPE = "curatedListOwnerType";
    private static final int ARG_REQUEST_CODE = 14;
    private static final String SCREEN_DESCRIPTION = "ldp_edit";
    private static final String SCREEN_NAME = "ListDetailPage";
    public AnalyticsLogger analytics;
    private boolean dismissingByMenuItemClick;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListMenuOptionsBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListMenuOptionsBottomSheetFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListMenuOptionsBottomSheetFragment.class, "doneButtonContainer", "getDoneButtonContainer()Lcom/robinhood/android/designsystem/button/RdsButtonContainerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
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

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView = bindView(C20839R.id.curated_list_menu_options_recycler_view);

    /* renamed from: doneButtonContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneButtonContainer = bindView(C20839R.id.curated_list_menu_options_done_button_container);

    /* renamed from: curatedListId$delegate, reason: from kotlin metadata */
    private final Lazy curatedListId = Fragments2.argument(this, ARG_CURATED_LIST_ID);

    /* renamed from: curatedListDisplayName$delegate, reason: from kotlin metadata */
    private final Lazy curatedListDisplayName = Fragments2.argument(this, ARG_CURATED_LIST_DISPLAY_NAME);

    /* renamed from: curatedOwnerType$delegate, reason: from kotlin metadata */
    private final Lazy curatedOwnerType = Fragments2.argument(this, ARG_CURATED_LIST_OWNER_TYPE);
    private final String screenName = SCREEN_NAME;
    private final String screenDescription = SCREEN_DESCRIPTION;

    /* compiled from: CuratedListMenuOptionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", "", "onEditClicked", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEditClicked();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsButtonContainerView getDoneButtonContainer() {
        return (RdsButtonContainerView) this.doneButtonContainer.getValue(this, $$delegatedProperties[2]);
    }

    private final UUID getCuratedListId() {
        return (UUID) this.curatedListId.getValue();
    }

    private final String getCuratedListDisplayName() {
        return (String) this.curatedListDisplayName.getValue();
    }

    private final ApiCuratedList.OwnerType getCuratedOwnerType() {
        return (ApiCuratedList.OwnerType) this.curatedOwnerType.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C20839R.layout.curated_list_menu_options_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = getRecyclerView();
        GenericListAdapter genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C20839R.layout.curated_list_menu_options_item, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListMenuOptionsBottomSheetFragment.onViewCreated$lambda$2(this.f$0, (RdsRowView) obj, (CuratedListMenuOptionsBottomSheetFragment.MenuOptionItem) obj2);
            }
        });
        genericListAdapterM2985of.submitList(CollectionsKt.listOf((Object[]) new MenuOptionItem[]{new MenuOptionItem(C20839R.string.curated_list_edit, C20690R.drawable.ic_rds_edit_24dp, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListMenuOptionsBottomSheetFragment.onViewCreated$lambda$5$lambda$3(this.f$0);
            }
        }), new MenuOptionItem(C32428R.string.general_label_delete, C20839R.drawable.svg_ic_watchlist_remove_24dp, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListMenuOptionsBottomSheetFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        })}));
        Unit unit = Unit.INSTANCE;
        bindAdapter(recyclerView, genericListAdapterM2985of);
        getDoneButtonContainer().getButton().setText(getString(C11048R.string.general_label_done));
        OnClickListeners.onClick(getDoneButtonContainer().getButton(), new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListMenuOptionsBottomSheetFragment.onViewCreated$lambda$6(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragment, RdsRowView of, final MenuOptionItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, item.getIconResId()));
        of.setPrimaryText(curatedListMenuOptionsBottomSheetFragment.getString(item.getTitleResId()));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListMenuOptionsBottomSheetFragment.onViewCreated$lambda$2$lambda$1(item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(MenuOptionItem menuOptionItem) {
        menuOptionItem.getOnClick().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$3(CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(curatedListMenuOptionsBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_OVERFLOW, AnalyticsStrings.BUTTON_LIST_EDIT, null, null, curatedListMenuOptionsBottomSheetFragment.getCuratedListId().toString(), curatedListMenuOptionsBottomSheetFragment.getCuratedListDisplayName(), null, null, 204, null);
        curatedListMenuOptionsBottomSheetFragment.getCallbacks().onEditClicked();
        curatedListMenuOptionsBottomSheetFragment.dismissingByMenuItemClick = true;
        curatedListMenuOptionsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(curatedListMenuOptionsBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_OVERFLOW, AnalyticsStrings.BUTTON_LIST_DELETE, null, null, curatedListMenuOptionsBottomSheetFragment.getCuratedListId().toString(), curatedListMenuOptionsBottomSheetFragment.getCuratedListDisplayName(), null, null, 204, null);
        DeleteCuratedListBottomSheetFragment.INSTANCE.createDialogFragment(new LegacyDialogFragmentKey.DeleteCuratedList(curatedListMenuOptionsBottomSheetFragment.getCuratedListId(), curatedListMenuOptionsBottomSheetFragment.getCuratedListDisplayName(), curatedListMenuOptionsBottomSheetFragment.getCuratedOwnerType())).show(curatedListMenuOptionsBottomSheetFragment.requireActivity().getSupportFragmentManager(), "deleteCuratedListBottomSheet");
        curatedListMenuOptionsBottomSheetFragment.dismissingByMenuItemClick = true;
        curatedListMenuOptionsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragment) {
        curatedListMenuOptionsBottomSheetFragment.dismissingByMenuItemClick = true;
        curatedListMenuOptionsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.dismissingByMenuItemClick) {
            return;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_OVERFLOW, "done", null, null, getCuratedListId().toString(), getCuratedListDisplayName(), null, null, 204, null);
    }

    /* compiled from: CuratedListMenuOptionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$MenuOptionItem;", "", "titleResId", "", "iconResId", "onClick", "Lkotlin/Function0;", "", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "getTitleResId", "()I", "getIconResId", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MenuOptionItem {
        public static final int $stable = 0;
        private final int iconResId;
        private final Function0<Unit> onClick;
        private final int titleResId;

        public MenuOptionItem(int i, int i2, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.titleResId = i;
            this.iconResId = i2;
            this.onClick = onClick;
        }

        public final int getTitleResId() {
            return this.titleResId;
        }

        public final int getIconResId() {
            return this.iconResId;
        }

        public /* synthetic */ MenuOptionItem(int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment$MenuOptionItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0);
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }
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
        return getCuratedListId().toString();
    }

    /* compiled from: CuratedListMenuOptionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\r\"\f\b\u0000\u0010\u000e*\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u0002H\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_CURATED_LIST_ID", "", "ARG_CURATED_LIST_DISPLAY_NAME", "ARG_CURATED_LIST_OWNER_TYPE", "ARG_REQUEST_CODE", "", "SCREEN_NAME", "SCREEN_DESCRIPTION", "newInstance", "Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment;", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", "callbacks", "listId", "Ljava/util/UUID;", "listDisplayName", "listOwnerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "(Landroidx/fragment/app/Fragment;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;)Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> CuratedListMenuOptionsBottomSheetFragment newInstance(C callbacks, UUID listId, String listDisplayName, ApiCuratedList.OwnerType listOwnerType) {
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(listDisplayName, "listDisplayName");
            Intrinsics.checkNotNullParameter(listOwnerType, "listOwnerType");
            CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragment = new CuratedListMenuOptionsBottomSheetFragment();
            curatedListMenuOptionsBottomSheetFragment.setTargetFragment(callbacks, 14);
            Bundle bundle = new Bundle();
            bundle.putSerializable(CuratedListMenuOptionsBottomSheetFragment.ARG_CURATED_LIST_ID, listId);
            bundle.putString(CuratedListMenuOptionsBottomSheetFragment.ARG_CURATED_LIST_DISPLAY_NAME, listDisplayName);
            bundle.putSerializable(CuratedListMenuOptionsBottomSheetFragment.ARG_CURATED_LIST_OWNER_TYPE, listOwnerType);
            curatedListMenuOptionsBottomSheetFragment.setArguments(bundle);
            return curatedListMenuOptionsBottomSheetFragment;
        }
    }
}
