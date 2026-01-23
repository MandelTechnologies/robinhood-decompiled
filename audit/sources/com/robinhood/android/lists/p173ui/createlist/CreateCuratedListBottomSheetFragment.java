package com.robinhood.android.lists.p173ui.createlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.lists.quickadd.OnCuratedListCreatedCallbacks;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: CreateCuratedListBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010=\u001a\u0002022\u0006\u0010>\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\"\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b/\u0010,¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListDuxo;", "getDuxo", "()Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/lists/quickadd/OnCuratedListCreatedCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/lists/quickadd/OnCuratedListCreatedCallbacks;", CreateCuratedListBottomSheetFragment.ARG_SHOULD_REDIRECT_AFTER_CREATION, "", "getShouldRedirectAfterCreation", "()Z", "shouldRedirectAfterCreation$delegate", "snackbarContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getSnackbarContainer", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "snackbarContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "emojiBoxTxt", "Landroid/widget/TextView;", "getEmojiBoxTxt", "()Landroid/widget/TextView;", "emojiBoxTxt$delegate", "listNameTextInput", "Landroid/widget/EditText;", "getListNameTextInput", "()Landroid/widget/EditText;", "listNameTextInput$delegate", "createListBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getCreateListBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "createListBtn$delegate", "cancelBtn", "getCancelBtn", "cancelBtn$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreateCuratedListBottomSheetFragment extends BaseBottomSheetDialogFragment {
    private static final String ARG_SHOULD_REDIRECT_AFTER_CREATION = "shouldRedirectAfterCreation";
    public static final int REQUEST_CODE = 12;
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateCuratedListBottomSheetFragment.class, "snackbarContainer", "getSnackbarContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), Reflection.property1(new PropertyReference1Impl(CreateCuratedListBottomSheetFragment.class, "emojiBoxTxt", "getEmojiBoxTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(CreateCuratedListBottomSheetFragment.class, "listNameTextInput", "getListNameTextInput()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(CreateCuratedListBottomSheetFragment.class, "createListBtn", "getCreateListBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(CreateCuratedListBottomSheetFragment.class, "cancelBtn", "getCancelBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CreateCuratedListDuxo.class);

    /* renamed from: shouldRedirectAfterCreation$delegate, reason: from kotlin metadata */
    private final Lazy shouldRedirectAfterCreation = Fragments2.argument(this, ARG_SHOULD_REDIRECT_AFTER_CREATION);

    /* renamed from: snackbarContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 snackbarContainer = bindView(C20839R.id.create_curated_list_snackbar_container);

    /* renamed from: emojiBoxTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 emojiBoxTxt = bindView(C20839R.id.create_curated_list_emoji_box);

    /* renamed from: listNameTextInput$delegate, reason: from kotlin metadata */
    private final Interfaces2 listNameTextInput = bindView(C20839R.id.create_curated_list_list_name_text_input);

    /* renamed from: createListBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 createListBtn = bindView(C20839R.id.create_curated_list_create);

    /* renamed from: cancelBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 cancelBtn = bindView(C20839R.id.create_curated_list_cancel);

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

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateCuratedListDuxo getDuxo() {
        return (CreateCuratedListDuxo) this.duxo.getValue();
    }

    private final OnCuratedListCreatedCallbacks getCallbacks() {
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof OnCuratedListCreatedCallbacks) {
            return (OnCuratedListCreatedCallbacks) targetFragment;
        }
        return null;
    }

    private final boolean getShouldRedirectAfterCreation() {
        return ((Boolean) this.shouldRedirectAfterCreation.getValue()).booleanValue();
    }

    private final CoordinatorLayout getSnackbarContainer() {
        return (CoordinatorLayout) this.snackbarContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getEmojiBoxTxt() {
        return (TextView) this.emojiBoxTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final EditText getListNameTextInput() {
        return (EditText) this.listNameTextInput.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsButton getCreateListBtn() {
        return (RdsButton) this.createListBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsButton getCancelBtn() {
        return (RdsButton) this.cancelBtn.getValue(this, $$delegatedProperties[4]);
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
        View viewInflate = inflater.inflate(C20839R.layout.create_curated_list_bottom_sheet_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getEmojiBoxTxt(), new Function0() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCuratedListBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getListNameTextInput().addTextChangedListener(new TextWatcherAdapter.Stub() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListBottomSheetFragment.onViewCreated.2
            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter.Stub, com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                Intrinsics.checkNotNullParameter(text, "text");
                CreateCuratedListBottomSheetFragment.this.getDuxo().setListName(text.toString());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListBottomSheetFragment.onViewCreated$lambda$6(this.f$0, view, (CreateCuratedListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CreateCuratedListBottomSheetFragment createCuratedListBottomSheetFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(createCuratedListBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEW_LIST, AnalyticsStrings.BUTTON_LIST_OPEN_EMOJI_PICKER, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        EmojiPickerBottomSheetFragment emojiPickerBottomSheetFragmentNewInstance = EmojiPickerBottomSheetFragment.INSTANCE.newInstance(createCuratedListBottomSheetFragment.getEmojiBoxTxt().getText().toString());
        emojiPickerBottomSheetFragmentNewInstance.setTargetFragment(createCuratedListBottomSheetFragment, 12);
        FragmentManager parentFragmentManager = createCuratedListBottomSheetFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        emojiPickerBottomSheetFragmentNewInstance.show(parentFragmentManager, "emojiPickerBottomSheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(final CreateCuratedListBottomSheetFragment createCuratedListBottomSheetFragment, final View view, final CreateCuratedListViewState state) {
        Throwable thConsume;
        String string2;
        CuratedList curatedListConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        createCuratedListBottomSheetFragment.getEmojiBoxTxt().setText(state.getEmoji());
        RdsButton createListBtn = createCuratedListBottomSheetFragment.getCreateListBtn();
        String listName = state.getListName();
        createListBtn.setEnabled(!(listName == null || listName.length() == 0));
        createCuratedListBottomSheetFragment.getCreateListBtn().setLoading(state.isCreatingList());
        OnClickListeners.onClick(createCuratedListBottomSheetFragment.getCreateListBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCuratedListBottomSheetFragment.onViewCreated$lambda$6$lambda$2(state, createCuratedListBottomSheetFragment);
            }
        });
        OnClickListeners.onClick(createCuratedListBottomSheetFragment.getCancelBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCuratedListBottomSheetFragment.onViewCreated$lambda$6$lambda$3(this.f$0, view);
            }
        });
        UiEvent<CuratedList> createListSuccess = state.getCreateListSuccess();
        if (createListSuccess != null && (curatedListConsume = createListSuccess.consume()) != null) {
            ViewsKt.hideKeyboard$default(view, false, 1, null);
            if (createCuratedListBottomSheetFragment.getShouldRedirectAfterCreation()) {
                Navigator navigator = createCuratedListBottomSheetFragment.getNavigator();
                Context contextRequireContext = createCuratedListBottomSheetFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CuratedListKey.UserList(curatedListConsume.getId(), true, null, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            }
            OnCuratedListCreatedCallbacks callbacks = createCuratedListBottomSheetFragment.getCallbacks();
            if (callbacks != null) {
                callbacks.onCuratedListCreated(curatedListConsume);
            }
            createCuratedListBottomSheetFragment.dismiss();
        }
        UiEvent<Throwable> createListError = state.getCreateListError();
        if (createListError != null && (thConsume = createListError.consume()) != null) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thConsume);
            GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
            if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
                string2 = createCuratedListBottomSheetFragment.getString(C20839R.string.create_list_generic_error_message);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            Snackbars.show$default(createCuratedListBottomSheetFragment.getSnackbarContainer(), string2, -1, 0, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$2(CreateCuratedListViewState createCuratedListViewState, CreateCuratedListBottomSheetFragment createCuratedListBottomSheetFragment) {
        if (!createCuratedListViewState.isCreatingList()) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(createCuratedListBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEW_LIST, AnalyticsStrings.BUTTON_NEW_LIST_CREATE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            CreateCuratedListDuxo duxo = createCuratedListBottomSheetFragment.getDuxo();
            String listName = createCuratedListViewState.getListName();
            Intrinsics.checkNotNull(listName);
            duxo.createList(listName, createCuratedListViewState.getEmoji());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$3(CreateCuratedListBottomSheetFragment createCuratedListBottomSheetFragment, View view) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(createCuratedListBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEW_LIST, "cancel", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        ViewsKt.hideKeyboard$default(view, false, 1, null);
        createCuratedListBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 12 && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            String stringExtra = data.getStringExtra(EmojiPickerBottomSheetFragment.UPDATED_EMOJI_EXTRA);
            Intrinsics.checkNotNull(stringExtra);
            getDuxo().setEmoji(stringExtra);
        }
    }

    /* compiled from: CreateCuratedListBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CreateCuratedList;", "<init>", "()V", "REQUEST_CODE", "", "ARG_SHOULD_REDIRECT_AFTER_CREATION", "", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.CreateCuratedList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.CreateCuratedList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            CreateCuratedListBottomSheetFragment createCuratedListBottomSheetFragment = new CreateCuratedListBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(CreateCuratedListBottomSheetFragment.ARG_SHOULD_REDIRECT_AFTER_CREATION, key.getRedirect());
            createCuratedListBottomSheetFragment.setArguments(bundle);
            return createCuratedListBottomSheetFragment;
        }
    }
}
