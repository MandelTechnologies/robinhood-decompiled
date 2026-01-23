package com.robinhood.android.lists.p173ui.deletelist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DeleteCuratedListBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J$\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u0002002\u0006\u0010<\u001a\u0002042\b\u00109\u001a\u0004\u0018\u00010:H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010=\u001a\u00020&X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0016\u0010?\u001a\u0004\u0018\u00010&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0016\u0010A\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010(¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "duxo", "Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListDuxo;", "getDuxo", "()Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "snackbarContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getSnackbarContainer", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "snackbarContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTitleTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "titleTxt$delegate", "subtitleTxt", "getSubtitleTxt", "subtitleTxt$delegate", "deleteListBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getDeleteListBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "deleteListBtn$delegate", "cancelBtn", "getCancelBtn", "cancelBtn$delegate", "curatedListId", "Ljava/util/UUID;", "getCuratedListId", "()Ljava/util/UUID;", "curatedListDisplayName", "", "getCuratedListDisplayName", "()Ljava/lang/String;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "screenName", "getScreenName", "screenDescription", "getScreenDescription", "entityId", "getEntityId", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DeleteCuratedListBottomSheetFragment extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String SCREEN_DESCRIPTION = "ldp_delete";
    private static final String SCREEN_NAME = "ListDetailPage";
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeleteCuratedListBottomSheetFragment.class, "snackbarContainer", "getSnackbarContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), Reflection.property1(new PropertyReference1Impl(DeleteCuratedListBottomSheetFragment.class, "titleTxt", "getTitleTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(DeleteCuratedListBottomSheetFragment.class, "subtitleTxt", "getSubtitleTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(DeleteCuratedListBottomSheetFragment.class, "deleteListBtn", "getDeleteListBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(DeleteCuratedListBottomSheetFragment.class, "cancelBtn", "getCancelBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DeleteCuratedListDuxo.class);

    /* renamed from: snackbarContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 snackbarContainer = bindView(C20839R.id.delete_list_snackbar_container);

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt = bindView(C20839R.id.delete_list_bottom_sheet_title_txt);

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleTxt = bindView(C20839R.id.delete_list_bottom_sheet_subtitle_txt);

    /* renamed from: deleteListBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 deleteListBtn = bindView(C20839R.id.delete_list_bottom_sheet_delete_list_btn);

    /* renamed from: cancelBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 cancelBtn = bindView(C20839R.id.delete_list_bottom_sheet_cancel_btn);
    private final String screenName = SCREEN_NAME;
    private final String screenDescription = SCREEN_DESCRIPTION;

    private final DeleteCuratedListDuxo getDuxo() {
        return (DeleteCuratedListDuxo) this.duxo.getValue();
    }

    private final CoordinatorLayout getSnackbarContainer() {
        return (CoordinatorLayout) this.snackbarContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getTitleTxt() {
        return (RhTextView) this.titleTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RhTextView getSubtitleTxt() {
        return (RhTextView) this.subtitleTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsButton getDeleteListBtn() {
        return (RdsButton) this.deleteListBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsButton getCancelBtn() {
        return (RdsButton) this.cancelBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final UUID getCuratedListId() {
        return ((LegacyDialogFragmentKey.DeleteCuratedList) INSTANCE.getArgs((Fragment) this)).getListId();
    }

    private final String getCuratedListDisplayName() {
        return ((LegacyDialogFragmentKey.DeleteCuratedList) INSTANCE.getArgs((Fragment) this)).getListDisplayName();
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
        View viewInflate = inflater.inflate(C20839R.layout.delete_list_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteCuratedListBottomSheetFragment.onViewCreated$lambda$4(this.f$0, (DeleteCuratedListState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(final DeleteCuratedListBottomSheetFragment deleteCuratedListBottomSheetFragment, final DeleteCuratedListState state) {
        Throwable thConsume;
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        final CuratedList curatedList = state.getCuratedList();
        if (curatedList != null) {
            deleteCuratedListBottomSheetFragment.getTitleTxt().setText(deleteCuratedListBottomSheetFragment.getString(C20839R.string.delete_list_title, curatedList.getDisplayName()));
            deleteCuratedListBottomSheetFragment.getSubtitleTxt().setText(deleteCuratedListBottomSheetFragment.getString(C20839R.string.delete_list_subtitle));
            deleteCuratedListBottomSheetFragment.getDeleteListBtn().setLoading(state.isDeletingList());
            OnClickListeners.onClick(deleteCuratedListBottomSheetFragment.getDeleteListBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeleteCuratedListBottomSheetFragment.onViewCreated$lambda$4$lambda$1(state, deleteCuratedListBottomSheetFragment, curatedList);
                }
            });
            OnClickListeners.onClick(deleteCuratedListBottomSheetFragment.getCancelBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.deletelist.DeleteCuratedListBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeleteCuratedListBottomSheetFragment.onViewCreated$lambda$4$lambda$2(this.f$0);
                }
            });
            UiEvent<Unit> deleteListSuccess = state.getDeleteListSuccess();
            if ((deleteListSuccess != null ? deleteListSuccess.consume() : null) != null) {
                Fragment targetFragment = deleteCuratedListBottomSheetFragment.getTargetFragment();
                if (targetFragment != null) {
                    targetFragment.onActivityResult(deleteCuratedListBottomSheetFragment.getTargetRequestCode(), -1, null);
                }
                deleteCuratedListBottomSheetFragment.dismiss();
            }
            UiEvent<Throwable> deleteListError = state.getDeleteListError();
            if (deleteListError != null && (thConsume = deleteListError.consume()) != null) {
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thConsume);
                GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
                if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
                    string2 = deleteCuratedListBottomSheetFragment.getString(C20839R.string.delete_list_generic_error_message);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                }
                Snackbars.show$default(deleteCuratedListBottomSheetFragment.getSnackbarContainer(), string2, -1, 0, 8, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$1(DeleteCuratedListState deleteCuratedListState, DeleteCuratedListBottomSheetFragment deleteCuratedListBottomSheetFragment, CuratedList curatedList) {
        if (!deleteCuratedListState.isDeletingList()) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(deleteCuratedListBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_OVERFLOW_DELETE, AnalyticsStrings.BUTTON_LIST_DELETE_LIST, null, null, deleteCuratedListBottomSheetFragment.getCuratedListId().toString(), deleteCuratedListBottomSheetFragment.getCuratedListDisplayName(), null, null, 204, null);
            deleteCuratedListBottomSheetFragment.getDuxo().deleteList(curatedList.getId(), curatedList.getOwnerType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$2(DeleteCuratedListBottomSheetFragment deleteCuratedListBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(deleteCuratedListBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_OVERFLOW_DELETE, "cancel", null, null, deleteCuratedListBottomSheetFragment.getCuratedListId().toString(), deleteCuratedListBottomSheetFragment.getCuratedListDisplayName(), null, null, 204, null);
        deleteCuratedListBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
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

    /* compiled from: DeleteCuratedListBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DeleteCuratedList;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lists/ui/deletelist/DeleteCuratedListBottomSheetFragment;", "<init>", "()V", "SCREEN_NAME", "", "SCREEN_DESCRIPTION", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.DeleteCuratedList>, FragmentWithArgsCompanion<DeleteCuratedListBottomSheetFragment, LegacyDialogFragmentKey.DeleteCuratedList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.DeleteCuratedList getArgs(DeleteCuratedListBottomSheetFragment deleteCuratedListBottomSheetFragment) {
            return (LegacyDialogFragmentKey.DeleteCuratedList) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, deleteCuratedListBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DeleteCuratedListBottomSheetFragment newInstance(LegacyDialogFragmentKey.DeleteCuratedList deleteCuratedList) {
            return (DeleteCuratedListBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, deleteCuratedList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DeleteCuratedListBottomSheetFragment deleteCuratedListBottomSheetFragment, LegacyDialogFragmentKey.DeleteCuratedList deleteCuratedList) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, deleteCuratedListBottomSheetFragment, deleteCuratedList);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.DeleteCuratedList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) newInstance((Parcelable) key);
        }
    }
}
