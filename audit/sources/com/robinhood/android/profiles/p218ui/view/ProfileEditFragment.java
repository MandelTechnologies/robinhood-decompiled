package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.CropImageArgs;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.profiles.C25898R;
import com.robinhood.android.profiles.databinding.FragmentProfileEditBinding;
import com.robinhood.android.profiles.extensions.ProfileColors;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.android.profiles.p218ui.ProfileEditDuxo;
import com.robinhood.android.profiles.p218ui.ProfileEditState;
import com.robinhood.android.profiles.p218ui.ProfileEditViewState;
import com.robinhood.android.profiles.p218ui.ProfileEditViewState3;
import com.robinhood.android.profiles.p218ui.extensions.ProfilePictureViews;
import com.robinhood.android.profiles.p218ui.view.ChangeProfilePictureBottomSheetFragment;
import com.robinhood.android.profiles.p218ui.view.ProfileEditColorItemView;
import com.robinhood.android.profiles.p218ui.view.ProfilePictureView;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.FragmentWithCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: ProfileEditFragment.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0001qB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u0002052\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010>\u001a\u000205H\u0016J\b\u0010?\u001a\u000205H\u0016J\b\u0010@\u001a\u000205H\u0016J\b\u0010A\u001a\u000205H\u0016J\b\u0010B\u001a\u000200H\u0016J\u0018\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0014J\u0010\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020,H\u0016J\u001a\u0010J\u001a\u0002002\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010N\u001a\u0002002\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010:H\u0016J\"\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020L2\u0006\u0010Q\u001a\u00020L2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010T\u001a\u000205H\u0016J\b\u0010U\u001a\u000205H\u0016J\u0010\u0010V\u001a\u0002052\u0006\u0010W\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u0002052\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u000205H\u0002J\b\u0010]\u001a\u000205H\u0002J\b\u0010c\u001a\u000205H\u0002J\b\u0010d\u001a\u000205H\u0002J\b\u0010e\u001a\u000205H\u0002J\u0010\u0010f\u001a\u0002052\u0006\u0010g\u001a\u000200H\u0002J\b\u0010h\u001a\u00020LH\u0002J\u0018\u0010i\u001a\u0002052\u0006\u0010g\u001a\u0002002\u0006\u0010j\u001a\u00020kH\u0002J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020k0m2\u0006\u0010g\u001a\u000200H\u0002J\u0010\u0010n\u001a\u0002052\u0006\u0010o\u001a\u00020pH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010)R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u000200X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010^\u001a\u00020.X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`¨\u0006r"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileEditFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "getImagePicker", "()Lcom/robinhood/android/mediaservice/ImagePicker;", "setImagePicker", "(Lcom/robinhood/android/mediaservice/ImagePicker;)V", "logOnceAnalytics", "Lcom/robinhood/analytics/LogOnceAnalytics;", "getLogOnceAnalytics", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/profiles/ui/ProfileEditDuxo;", "getDuxo", "()Lcom/robinhood/android/profiles/ui/ProfileEditDuxo;", "duxo$delegate", "binding", "Lcom/robinhood/android/profiles/databinding/FragmentProfileEditBinding;", "getBinding", "()Lcom/robinhood/android/profiles/databinding/FragmentProfileEditBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "colorAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView;", "Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView$Item;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "saveMenuItem", "Landroid/view/MenuItem;", "profileId", "", "hasPendingChanges", "", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onPause", "onStop", "onBackPressed", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onUploadImageClick", "onRemoveImageClick", "bind", "viewState", "Lcom/robinhood/android/profiles/ui/ProfileEditViewState;", "bindProfileEditNameInput", "profile", "Lcom/robinhood/android/profiles/ui/ProfileEditState;", "updateProfile", "exitEditScreen", "screenName", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onSaveClick", "onPictureClick", "startImagePicker", "logButtonGroupAppearances", "showGoldTheme", "calculateProfileColorSpanCount", "refreshProfileColors", "editedColor", "Lcom/robinhood/models/db/ProfileColor;", "getValidProfileColors", "", "showErrorAlert", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "Companion", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileEditFragment extends BaseFragment implements ChangeProfilePictureBottomSheetFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProfileEditFragment.class, "binding", "getBinding()Lcom/robinhood/android/profiles/databinding/FragmentProfileEditBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_CODE_PICK_IMAGE = 50;
    private static final String SCREEN_NAME = "EditProfile";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ProfileEditColorItemView, ProfileEditColorItemView.Item> colorAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean hasPendingChanges;
    public ImagePicker imagePicker;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;
    private String profileId;
    private MenuItem saveMenuItem;
    private final String screenName;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;

    /* compiled from: ProfileEditFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyFragmentKey.ProfileEdit.Context.values().length];
            try {
                iArr[LegacyFragmentKey.ProfileEdit.Context.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyFragmentKey.ProfileEdit.Context.FROM_EDIT_VISIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileEditFragment() {
        super(C25898R.layout.fragment_profile_edit);
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditFragment.logOnceAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, ProfileEditDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ProfileEditFragment2.INSTANCE);
        this.colorAdapter = GenericListAdapter.INSTANCE.m2987of(ProfileEditColorItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$colorAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ProfileEditColorItemView.Item) obj).getColor();
            }
        }), new Function2() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProfileEditFragment.colorAdapter$lambda$2(this.f$0, (ProfileEditColorItemView) obj, (ProfileEditColorItemView.Item) obj2);
            }
        });
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditFragment.toolbarScrollAnimator_delegate$lambda$3(this.f$0);
            }
        });
        this.useDesignSystemToolbar = true;
        this.screenName = SCREEN_NAME;
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

    public final ImagePicker getImagePicker() {
        ImagePicker imagePicker = this.imagePicker;
        if (imagePicker != null) {
            return imagePicker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
        return null;
    }

    public final void setImagePicker(ImagePicker imagePicker) {
        Intrinsics.checkNotNullParameter(imagePicker, "<set-?>");
        this.imagePicker = imagePicker;
    }

    private final LogOnceAnalytics getLogOnceAnalytics() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$0(ProfileEditFragment profileEditFragment) {
        return new LogOnceAnalytics(profileEditFragment.getAnalytics());
    }

    private final ProfileEditDuxo getDuxo() {
        return (ProfileEditDuxo) this.duxo.getValue();
    }

    private final FragmentProfileEditBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentProfileEditBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit colorAdapter$lambda$2(final ProfileEditFragment profileEditFragment, ProfileEditColorItemView of, final ProfileEditColorItemView.Item item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.bind(item);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditFragment.colorAdapter$lambda$2$lambda$1(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit colorAdapter$lambda$2$lambda$1(ProfileEditFragment profileEditFragment, ProfileEditColorItemView.Item item) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(profileEditFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_COLOR, item.getColor().getServerValue(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        profileEditFragment.getDuxo().changeColorSelection(item.getColor());
        return Unit.INSTANCE;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$3(ProfileEditFragment profileEditFragment) {
        RhToolbar rhToolbar = profileEditFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, profileEditFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((ProfileEditViewState) it).getProfileId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ProfileEditFragment$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onCreate$lambda$6(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(ProfileEditFragment profileEditFragment, String str) {
        profileEditFragment.profileId = str;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView profileEditContentScrollView = getBinding().profileEditContentScrollView;
        Intrinsics.checkNotNullExpressionValue(profileEditContentScrollView, "profileEditContentScrollView");
        toolbarScrollAnimator.subscribe(profileEditContentScrollView, this);
        FragmentProfileEditBinding binding = getBinding();
        final RecyclerView recyclerView = binding.profileEditColorRecyclerView;
        recyclerView.setAdapter(this.colorAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        Intrinsics.checkNotNull(recyclerView);
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onViewCreated$lambda$14$lambda$9$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    view.post(new ProfileEditFragment4(this, recyclerView));
                }
            });
        } else {
            view.post(new ProfileEditFragment4(this, recyclerView));
        }
        ProfilePictureView profileEditPictureView = binding.profileEditPictureView;
        Intrinsics.checkNotNullExpressionValue(profileEditPictureView, "profileEditPictureView");
        OnClickListeners.onClick(profileEditPictureView, new ProfileEditFragment5(this));
        Observable<Boolean> observableFilter = binding.profileEditUsernameInput.focusChanges().filter(new Predicate() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onViewCreated$1$3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean focused) {
                Intrinsics.checkNotNullParameter(focused, "focused");
                return focused.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onViewCreated$lambda$14$lambda$10(this.f$0, (Boolean) obj);
            }
        });
        RdsTextInputEditText profileEditUsernameInput = binding.profileEditUsernameInput;
        Intrinsics.checkNotNullExpressionValue(profileEditUsernameInput, "profileEditUsernameInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(profileEditUsernameInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onViewCreated$lambda$14$lambda$11(this.f$0, (CharSequence) obj);
            }
        });
        binding.profileEditErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditFragment.onViewCreated$lambda$14$lambda$12(this.f$0);
            }
        });
        RhTextView profileEditDisclosure = binding.profileEditDisclosure;
        Intrinsics.checkNotNullExpressionValue(profileEditDisclosure, "profileEditDisclosure");
        int i = C25898R.string.profile_edit_disclosure;
        int i2 = C25898R.string.profile_edit_disclosure_app_use_standards;
        String string2 = ViewsKt.getString(profileEditDisclosure, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) profileEditDisclosure, (CharSequence) string2, true, true, numValueOf != null ? ViewsKt.getString(profileEditDisclosure, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onViewCreated$lambda$14$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.getContext(), this.this$0.getResources().getString(C25898R.string.app_use_standards_link), 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$10(ProfileEditFragment profileEditFragment, Boolean bool) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(profileEditFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_USERNAME, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$11(ProfileEditFragment profileEditFragment, CharSequence editedUsername) {
        Intrinsics.checkNotNullParameter(editedUsername, "editedUsername");
        profileEditFragment.getDuxo().changeUsername(editedUsername.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$12(ProfileEditFragment profileEditFragment) {
        profileEditFragment.getDuxo().fetchProfile();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (((LegacyFragmentKey.ProfileEdit) INSTANCE.getArgs((Fragment) this)).getContext() != LegacyFragmentKey.ProfileEdit.Context.FROM_EDIT_VISIBILITY) {
            Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onStart$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ProfileEditState profile = ((ProfileEditViewState) it).getProfile();
                    return Optional3.asOptional(profile != null ? profile.getEditedColor() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((ProfileEditFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileEditFragment.onStart$lambda$16(this.f$0, (Profile2) obj);
                }
            });
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onStart$lambda$17(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$16(ProfileEditFragment profileEditFragment, Profile2 profile2) {
        View viewRequireView = profileEditFragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ScarletManager scarletManager = ScarletManager2.getScarletManager(viewRequireView);
        Intrinsics.checkNotNull(profile2);
        ScarletManager.putOverlay$default(scarletManager, ProfileColors.getThemeReference(profile2), null, 2, null);
        RhToolbar rhToolbar = profileEditFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(rhToolbar), ProfileColors.getThemeReference(profile2), null, 2, null);
        Context context = viewRequireView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        profileEditFragment.overrideMenuItemTint(Integer.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$17(ProfileEditFragment profileEditFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = profileEditFragment.requireView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        profileEditFragment.overrideMenuItemTint(Integer.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView profileEditContentScrollView = getBinding().profileEditContentScrollView;
        Intrinsics.checkNotNullExpressionValue(profileEditContentScrollView, "profileEditContentScrollView");
        toolbarScrollAnimator.dispatchScroll(profileEditContentScrollView);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onResume$lambda$18(this.f$0, (ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(ProfileEditFragment profileEditFragment, ProfileEditViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        profileEditFragment.bind(viewState);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getLogOnceAnalytics().reset();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.hasPendingChanges) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C25898R.id.profile_edit_discard_changes).setUseDesignSystemOverlay(true).setTitle(C25898R.string.profile_edit_discard_changes_title, new Object[0]).setMessage(C25898R.string.profile_edit_discard_changes_message, new Object[0]).setPositiveButton(C25898R.string.profile_edit_discard_changes_positive_button, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "profileEditDiscard", false, 4, null);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C25898R.menu.menu_profile_edit, menu);
        this.saveMenuItem = menu.findItem(C25898R.id.profile_menu_edit_save);
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment.createOptionsMenu.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(ProfileEditViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowSaveAsMenuItem());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.createOptionsMenu$lambda$19(this.f$0, (Boolean) obj);
            }
        });
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOptionsMenu$lambda$19(ProfileEditFragment profileEditFragment, Boolean bool) {
        MenuItem menuItem = profileEditFragment.saveMenuItem;
        if (menuItem != null) {
            Intrinsics.checkNotNull(bool);
            menuItem.setVisible(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != C25898R.id.profile_menu_edit_save) {
            return true;
        }
        onSaveClick();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25898R.id.profile_edit_discard_changes) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_DISCARD_CONFIRM, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            exitEditScreen();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25898R.id.profile_edit_discard_changes) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_DISCARD_CANCEL, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 50) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            ImagePicker imagePicker = getImagePicker();
            Intrinsics.checkNotNull(data);
            bind(SinglesAndroid.observeOnMainThread(imagePicker.extractImagesFromResultIntent(data)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileEditFragment.onActivityResult$lambda$20(this.f$0, (List) obj);
                }
            });
        } else if (resultCode == 2) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, C11048R.string.general_error_no_image_picker_found, -1);
        } else {
            if (resultCode != 3) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity2, C25904R.string.profile_edit_failed_to_add_image_error_message, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$20(ProfileEditFragment profileEditFragment, List bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Bitmap bitmap = (Bitmap) CollectionsKt.firstOrNull(bitmaps);
        if (bitmap != null) {
            profileEditFragment.getDuxo().changePicture(bitmap);
        } else {
            FragmentActivity fragmentActivityRequireActivity = profileEditFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, C25904R.string.profile_edit_failed_to_add_image_error_message, -1);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment.Callbacks
    public void onUploadImageClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, "upload_image", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        startImagePicker();
    }

    @Override // com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment.Callbacks
    public void onRemoveImageClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, "remove_image", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getDuxo().removePicture();
    }

    private final void bind(ProfileEditViewState viewState) {
        UiEvent<GenericAlert> alertEvent;
        GenericAlert genericAlertConsume;
        UiEvent<String> genericErrorEvent;
        String strConsume;
        FragmentProfileEditBinding binding = getBinding();
        RdsProgressBar profileEditProgressBar = binding.profileEditProgressBar;
        Intrinsics.checkNotNullExpressionValue(profileEditProgressBar, "profileEditProgressBar");
        profileEditProgressBar.setVisibility(viewState.getShowLoading() ? 0 : 8);
        ScrollView profileEditContentScrollView = binding.profileEditContentScrollView;
        Intrinsics.checkNotNullExpressionValue(profileEditContentScrollView, "profileEditContentScrollView");
        profileEditContentScrollView.setVisibility(viewState.getShowContent() ? 0 : 8);
        ErrorView profileEditErrorView = binding.profileEditErrorView;
        Intrinsics.checkNotNullExpressionValue(profileEditErrorView, "profileEditErrorView");
        profileEditErrorView.setVisibility(viewState.getShowErrorView() ? 0 : 8);
        binding.profileEditTicker.setText(getString(C25898R.string.profile_edit_username));
        binding.profileEditUsernameInput.setHint(getString(C25898R.string.profile_edit_username));
        ScrollView profileEditContentScrollView2 = binding.profileEditContentScrollView;
        Intrinsics.checkNotNullExpressionValue(profileEditContentScrollView2, "profileEditContentScrollView");
        if (profileEditContentScrollView2.getVisibility() == 0) {
            logButtonGroupAppearances(viewState.getShowGoldTheme());
        }
        MenuItem menuItem = this.saveMenuItem;
        if (menuItem != null) {
            menuItem.setEnabled(viewState.getEnableSaveAction());
        }
        MenuItem menuItem2 = this.saveMenuItem;
        if (menuItem2 != null) {
            menuItem2.setVisible(viewState.getShowSaveAsMenuItem());
        }
        RdsButtonBarView saveBtnBar = getBinding().saveBtnBar;
        Intrinsics.checkNotNullExpressionValue(saveBtnBar, "saveBtnBar");
        saveBtnBar.setVisibility(viewState.getShowSaveAsMenuItem() ? 8 : 0);
        getBinding().saveBtnBar.onPrimaryButtonClick(new C259112(this));
        ProfileEditState profile = viewState.getProfile();
        if (profile != null) {
            this.hasPendingChanges = profile.getHasPendingChanges();
            UiEvent<Unit> initialTextFieldsSetEvent = viewState.getInitialTextFieldsSetEvent();
            if ((initialTextFieldsSetEvent != null ? initialTextFieldsSetEvent.consume() : null) != null) {
                bindProfileEditNameInput(profile);
            }
            refreshProfileColors(viewState.getShowGoldTheme(), profile.getEditedColor());
            if (profile.getEditedPicture() != null) {
                getBinding().profileEditPictureView.bind(profile.getEditedPicture(), ProfilePictureView.ActionIcon.PLUS);
            } else {
                getBinding().profileEditPictureView.bind(profile.getDisplayPicture(), ProfilePictureView.ActionIcon.PLUS);
            }
            UiEvent<Unit> profileSaveSuccessEvent = viewState.getProfileSaveSuccessEvent();
            if ((profileSaveSuccessEvent != null ? profileSaveSuccessEvent.consume() : null) != null) {
                exitEditScreen();
            }
            RdsTextInputContainerView rdsTextInputContainerView = getBinding().profileEditUsernameInputContainer;
            ProfileEditViewState3.LegacyError profileSaveLegacyError = viewState.getProfileSaveLegacyError();
            rdsTextInputContainerView.setErrorText(profileSaveLegacyError != null ? profileSaveLegacyError.getSaveUsernameErrorMessage() : null);
            ProfileEditViewState3.LegacyError profileSaveLegacyError2 = viewState.getProfileSaveLegacyError();
            if (profileSaveLegacyError2 != null && (genericErrorEvent = profileSaveLegacyError2.getGenericErrorEvent()) != null && (strConsume = genericErrorEvent.consume()) != null) {
                if (strConsume.length() == 0) {
                    strConsume = getString(C25898R.string.profile_edit_save_profile_generic_error);
                    Intrinsics.checkNotNullExpressionValue(strConsume, "getString(...)");
                }
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Snackbars.show(fragmentActivityRequireActivity, strConsume, -1);
            }
            ProfileEditViewState3.Error profileSaveError = viewState.getProfileSaveError();
            if (profileSaveError == null || (alertEvent = profileSaveError.getAlertEvent()) == null || (genericAlertConsume = alertEvent.consume()) == null) {
                return;
            }
            showErrorAlert(genericAlertConsume);
        }
    }

    /* compiled from: ProfileEditFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.profiles.ui.view.ProfileEditFragment$bind$2 */
    /* synthetic */ class C259112 extends FunctionReferenceImpl implements Function0<Unit> {
        C259112(Object obj) {
            super(0, obj, ProfileEditFragment.class, "onSaveClick", "onSaveClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ProfileEditFragment) this.receiver).onSaveClick();
        }
    }

    private final void bindProfileEditNameInput(ProfileEditState profile) {
        FragmentProfileEditBinding binding = getBinding();
        Editable text = binding.profileEditUsernameInput.getText();
        if (text == null || text.length() != 0) {
            return;
        }
        binding.profileEditUsernameInput.setText(profile.getUsername());
    }

    private final void updateProfile() {
        String string2 = StringsKt.trim(String.valueOf(getBinding().profileEditUsernameInput.getText())).toString();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        getDuxo().updateProfile(string2);
    }

    private final void exitEditScreen() {
        this.hasPendingChanges = false;
        int i = WhenMappings.$EnumSwitchMapping$0[((LegacyFragmentKey.ProfileEdit) INSTANCE.getArgs((Fragment) this)).getContext().ordinal()];
        if (i == 1) {
            requireActivity().onBackPressed();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription, reason: from getter */
    public String getProfileId() {
        return this.profileId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveClick() {
        Observable<ProfileEditViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable<R> map = observableTake.map(new Function() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onSaveClick$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((ProfileEditViewState) it).getProfile());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ProfileEditFragment$onSaveClick$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onSaveClick$lambda$27(this.f$0, (ProfileEditState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveClick$lambda$27(ProfileEditFragment profileEditFragment, ProfileEditState profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        String strValueOf = String.valueOf(profileEditFragment.getBinding().profileEditUsernameInput.getText());
        Sequence sequenceSequenceOf = SequencesKt.sequenceOf(new String[0]);
        if (profile.getEditedPicture() != null) {
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, AnalyticsStrings.BUTTON_EDIT_PROFILE_UPLOAD_PROFILE_PIC);
        }
        if (profile.getColor() != profile.getEditedColor()) {
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_COLOR);
        }
        if (!Intrinsics.areEqual(strValueOf, profile.getUsername())) {
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_USERNAME);
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(profileEditFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, SequencesKt.joinToString$default(sequenceSequenceOf, ",", null, null, 0, null, null, 62, null), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        profileEditFragment.updateProfile();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPictureClick() {
        AnalyticsLogger analytics = getAnalytics();
        ProfilePictureView profileEditPictureView = getBinding().profileEditPictureView;
        Intrinsics.checkNotNullExpressionValue(profileEditPictureView, "profileEditPictureView");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_UPLOAD_PROFILE_PIC, ProfilePictureViews.getAnalyticsButtonDescription(profileEditPictureView), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        Observable<ProfileEditViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.onPictureClick$lambda$28(this.f$0, (ProfileEditViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPictureClick$lambda$28(ProfileEditFragment profileEditFragment, ProfileEditViewState profileEditViewState) {
        ProfileEditState profile = profileEditViewState.getProfile();
        if (profile != null && profile.getShowRemovePictureOption()) {
            ChangeProfilePictureBottomSheetFragment changeProfilePictureBottomSheetFragment = (ChangeProfilePictureBottomSheetFragment) FragmentWithCallbacksCompanion.DefaultImpls.newInstance$default(ChangeProfilePictureBottomSheetFragment.INSTANCE, profileEditFragment, 0, 2, null);
            FragmentManager parentFragmentManager = profileEditFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            changeProfilePictureBottomSheetFragment.show(parentFragmentManager, "changeProfilePictureBottomSheet");
        } else {
            profileEditFragment.startImagePicker();
        }
        return Unit.INSTANCE;
    }

    private final void startImagePicker() {
        ImagePicker imagePicker = getImagePicker();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(ImagePicker.getImagePickerIntent$default(imagePicker, contextRequireContext, new CropImageArgs(ImagePicker.CropShape.OVAL, 1, 1, 0L, null, false, 56, null), null, false, false, 28, null), 50);
    }

    private final void logButtonGroupAppearances(boolean showGoldTheme) {
        LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_UPLOAD_PROFILE_PIC, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        for (Profile2 profile2 : getValidProfileColors(showGoldTheme)) {
            LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_COLOR, "profile_color_" + profile2.getServerValue(), profile2.getServerValue(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        }
        LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, AnalyticsStrings.BUTTON_EDIT_PROFILE_PROFILE_USERNAME, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateProfileColorSpanCount() {
        return Math.max(1, getBinding().profileEditColorRecyclerView.getMeasuredWidth() / getResources().getDimensionPixelSize(C25898R.dimen.profile_edit_color_column_width));
    }

    private final void refreshProfileColors(boolean showGoldTheme, Profile2 editedColor) {
        List<Profile2> validProfileColors = getValidProfileColors(showGoldTheme);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(validProfileColors, 10));
        for (Profile2 profile2 : validProfileColors) {
            arrayList.add(new ProfileEditColorItemView.Item(profile2, profile2 == editedColor || profile2 == editedColor.getMobiusRemapping()));
        }
        this.colorAdapter.submitList(arrayList);
    }

    private final List<Profile2> getValidProfileColors(boolean showGoldTheme) {
        Profile2[] profile2ArrValues = Profile2.values();
        ArrayList arrayList = new ArrayList();
        for (Profile2 profile2 : profile2ArrValues) {
            if (profile2 != Profile2.UNKNOWN && profile2 != Profile2.DARK_BLUE) {
                arrayList.add(profile2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Profile2 profile22 = (Profile2) obj;
            if (showGoldTheme || profile22 != Profile2.GOLD) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.profiles.ui.view.ProfileEditFragment$getValidProfileColors$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(ProfileColors.getDisplayOrder((Profile2) t)), Integer.valueOf(ProfileColors.getDisplayOrder((Profile2) t2)));
            }
        });
    }

    private final void showErrorAlert(GenericAlert alert) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(alert, false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "profile-error");
    }

    /* compiled from: ProfileEditFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileEditFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/profiles/ui/view/ProfileEditFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileEdit;", "<init>", "()V", "REQUEST_CODE_PICK_IMAGE", "", "SCREEN_NAME", "", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ProfileEditFragment, LegacyFragmentKey.ProfileEdit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ProfileEdit profileEdit) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, profileEdit);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ProfileEdit getArgs(ProfileEditFragment profileEditFragment) {
            return (LegacyFragmentKey.ProfileEdit) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, profileEditFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ProfileEditFragment newInstance(LegacyFragmentKey.ProfileEdit profileEdit) {
            return (ProfileEditFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, profileEdit);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ProfileEditFragment profileEditFragment, LegacyFragmentKey.ProfileEdit profileEdit) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, profileEditFragment, profileEdit);
        }
    }
}
