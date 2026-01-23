package com.robinhood.android.accountcenter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.AccountCenterViewState3;
import com.robinhood.android.accountcenter.AccountCenterViewState4;
import com.robinhood.android.accountcenter.databinding.FragmentAccountCenterBinding;
import com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView;
import com.robinhood.android.accountcenter.views.ReferralCallToActionView;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherLocation;
import com.robinhood.android.mediaservice.CropImageArgs;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.ReferralLaunchMode;
import com.robinhood.android.profiles.extensions.ProfileColors;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.android.profiles.p218ui.view.ChangeProfilePictureBottomSheetFragment;
import com.robinhood.android.profiles.p218ui.view.ProfileOverlay;
import com.robinhood.android.profiles.p218ui.view.ProfileReferralView;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.account.contracts.AccountNavigationTabFragmentKey;
import com.robinhood.shared.transfers.contracts.TransfersHub;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: AccountCenterFragment.kt */
@Metadata(m3635d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001d\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001pB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020=H\u0016J\u001a\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020=2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020=H\u0016J\b\u0010Q\u001a\u00020=H\u0016J\u0010\u0010R\u001a\u00020=2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010S\u001a\u00020=2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010T\u001a\u00020=2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010U\u001a\u00020=2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010V\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010W\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010X\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010Y\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020=H\u0016J\b\u0010^\u001a\u00020=H\u0016J\b\u0010_\u001a\u00020=H\u0016J\b\u0010`\u001a\u00020=H\u0016J\u0010\u0010a\u001a\u00020=2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020=H\u0002J\"\u0010e\u001a\u00020=2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020g2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u0012\u0010k\u001a\u00020=2\b\b\u0001\u0010l\u001a\u00020gH\u0002J \u0010m\u001a\u00020=2\b\b\u0001\u0010l\u001a\u00020g2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020=0oH\u0003R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u000203X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u000203X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006q"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Callbacks;", "Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "getImagePicker", "()Lcom/robinhood/android/mediaservice/ImagePicker;", "setImagePicker", "(Lcom/robinhood/android/mediaservice/ImagePicker;)V", "state", "Lcom/robinhood/android/accountcenter/AccountCenterViewState;", "actionHandler", "com/robinhood/android/accountcenter/AccountCenterFragment$actionHandler$1", "Lcom/robinhood/android/accountcenter/AccountCenterFragment$actionHandler$1;", "duxo", "Lcom/robinhood/android/accountcenter/AccountCenterDuxo;", "getDuxo", "()Lcom/robinhood/android/accountcenter/AccountCenterDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/accountcenter/databinding/FragmentAccountCenterBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/FragmentAccountCenterBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "accountCenterAdapter", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBannerClicked", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onValueTextClicked", "onInfoImageClicked", InstantRetirementAgreementComponents.MarkdownTag, "", "onReferralButtonClicked", "onPastInvitesClicked", "bind", "bindInvites", "bindProfilePicture", "bindDisplayCurrencySwitcher", "configureToolbarSettingsButton", "configureToolbarRewardButton", "configureToolbarInboxButton", "configureToolbarSearchButton", "onProfilePictureClicked", "accountCenterProfileHeaderView", "Lcom/robinhood/android/accountcenter/views/AccountCenterProfileHeaderView;", "onErrorActionClicked", "onUploadImageClick", "onRemoveImageClick", "onUsernameClicked", "onCollapsedSectionClicked", "collapsedSectionItem", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;", "startImagePicker", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "showSnackbar", "stringRes", "showPictureUpdateFailedSnackbar", "retryAction", "Lkotlin/Function0;", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterFragment extends BaseRhBottomSheetDialogHostFragment implements AccountCenterAdapter.Callbacks, ProfileReferralView.Callbacks, ChangeProfilePictureBottomSheetFragment.Callbacks, AutoLoggableFragment {
    private static final int PROFILE_PICTURE_FAILED_SNACK_BAR_DURATION_MS = 5000;
    private static final int REQUEST_CODE_PICK_IMAGE = 1;
    private final AccountCenterAdapter accountCenterAdapter;
    private final AccountCenterFragment2 actionHandler;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean hasBottomBar;
    public ImagePicker imagePicker;
    public Markwon markwon;
    private AccountCenterViewState state;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterFragment.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/FragmentAccountCenterBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.android.accountcenter.AccountCenterFragment$actionHandler$1, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler] */
    public AccountCenterFragment() {
        super(C8293R.layout.fragment_account_center);
        ?? r0 = new SduiActionHandler<GenericAction>() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$actionHandler$1

            /* compiled from: AccountCenterFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.accountcenter.AccountCenterFragment$actionHandler$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                    try {
                        iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof GenericAction.Deeplink) {
                    Navigator navigator = this.this$0.getNavigator();
                    android.content.Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                }
                if (action instanceof GenericAction.Dismiss) {
                    return true;
                }
                if (!(action instanceof GenericAction.InfoAlert)) {
                    throw new NoWhenBranchMatchedException();
                }
                GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
                int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                sduiAlert.presentGenericAlertSheet(parentFragmentManager, infoAlert.getValue2().getAlert());
                return true;
            }
        };
        this.actionHandler = r0;
        this.duxo = OldDuxos.oldDuxo(this, AccountCenterDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AccountCenterFragment4.INSTANCE);
        this.toolbarScrollAnimator = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.accountCenterAdapter = new AccountCenterAdapter(this, r0);
        this.useDesignSystemToolbar = true;
        this.hasBottomBar = true;
        this.eventScreen = new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null);
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

    private final AccountCenterDuxo getDuxo() {
        return (AccountCenterDuxo) this.duxo.getValue();
    }

    private final FragmentAccountCenterBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAccountCenterBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(AccountCenterFragment accountCenterFragment) throws Resources.NotFoundException {
        float dimension = accountCenterFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height);
        RhToolbar rhToolbar = accountCenterFragment.getRhToolbar();
        if (rhToolbar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new ToolbarScrollAnimator(rhToolbar, dimension, false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C82781(this));
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView accountCenterRecyclerView = getBinding().accountCenterRecyclerView;
        Intrinsics.checkNotNullExpressionValue(accountCenterRecyclerView, "accountCenterRecyclerView");
        toolbarScrollAnimator.dispatchScroll(accountCenterRecyclerView);
    }

    /* compiled from: AccountCenterFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.AccountCenterFragment$onResume$1 */
    /* synthetic */ class C82781 extends FunctionReferenceImpl implements Function1<AccountCenterViewState, Unit> {
        C82781(Object obj) {
            super(1, obj, AccountCenterFragment.class, "bind", "bind(Lcom/robinhood/android/accountcenter/AccountCenterViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccountCenterViewState accountCenterViewState) throws Throwable {
            invoke2(accountCenterViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AccountCenterViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AccountCenterFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView accountCenterRecyclerView = getBinding().accountCenterRecyclerView;
        Intrinsics.checkNotNullExpressionValue(accountCenterRecyclerView, "accountCenterRecyclerView");
        bindAdapter(accountCenterRecyclerView, this.accountCenterAdapter);
        getBinding().profileReferralView.setCallbacks(this);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        RecyclerView accountCenterRecyclerView2 = getBinding().accountCenterRecyclerView;
        Intrinsics.checkNotNullExpressionValue(accountCenterRecyclerView2, "accountCenterRecyclerView");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, accountCenterRecyclerView2, this, null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (((ViewGroup) toolbar.findViewById(C8293R.id.account_center_toolbar_container)) == null) {
            RhToolbar.addCustomView$default(toolbar, C8293R.layout.account_center_toolbar, false, 0, 6, null);
            configureToolbarSettingsButton(toolbar);
            configureToolbarRewardButton(toolbar);
            configureToolbarInboxButton(toolbar);
            configureToolbarSearchButton(toolbar);
        }
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onBannerClicked(com.robinhood.models.serverdriven.p347db.GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onValueTextClicked(com.robinhood.models.serverdriven.p347db.GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onInfoImageClicked(String markdown) {
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new AccountCenterInfoFragmentKey(markdown), false, true, false, false, null, false, null, null, 1012, null);
    }

    @Override // com.robinhood.android.profiles.ui.view.ProfileReferralView.Callbacks
    public void onReferralButtonClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RewardOfferIntentKey.Platform("profile", null, null, false, false, "profile", 30, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.profiles.ui.view.ProfileReferralView.Callbacks
    public void onPastInvitesClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RewardOfferIntentKey.PastReferrals("profile", null, 2, null), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(AccountCenterViewState state) throws Throwable {
        TopNavButtonView topNavButtonView;
        ReferralCallToActionView referralCallToActionView;
        Profile2 color;
        ProfileOverlay themeReference;
        TopNavButtonView topNavButtonView2;
        TopNavButtonView topNavButtonView3;
        ScarletManager scarletManager;
        ScarletManager scarletManager2;
        Throwable thConsume;
        this.state = state;
        AccountCenterAdapter accountCenterAdapter = this.accountCenterAdapter;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        accountCenterAdapter.submitList(state.accountCenterItems(contextRequireContext));
        UiEvent<Throwable> uiError = state.getUiError();
        if (uiError != null && (thConsume = uiError.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        Profile profile = state.getProfile();
        if (profile != null && (color = profile.getColor()) != null && (themeReference = ProfileColors.getThemeReference(color)) != null) {
            View view = getView();
            if (view != null && (scarletManager2 = ScarletManager2.getScarletManager(view)) != null) {
                ScarletManager.putOverlay$default(scarletManager2, themeReference, null, 2, null);
            }
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null && (scarletManager = ScarletManager2.getScarletManager(rhToolbar)) != null) {
                scarletManager.putOverlay(themeReference, Boolean.FALSE);
            }
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null && (topNavButtonView3 = (TopNavButtonView) rhToolbar2.findViewById(C8293R.id.account_center_toolbar_inbox_button)) != null) {
                topNavButtonView3.updateImageTint(C20690R.attr.colorPrimary);
            }
            RhToolbar rhToolbar3 = getRhToolbar();
            if (rhToolbar3 != null && (topNavButtonView2 = (TopNavButtonView) rhToolbar3.findViewById(C8293R.id.account_center_toolbar_search_button)) != null) {
                topNavButtonView2.updateImageTint(C20690R.attr.colorPrimary);
            }
        }
        RhToolbar rhToolbar4 = getRhToolbar();
        if (rhToolbar4 != null && (referralCallToActionView = (ReferralCallToActionView) rhToolbar4.findViewById(C8293R.id.account_center_toolbar_reward_button)) != null) {
            referralCallToActionView.setVisibility(state.getIsTopNavReferralIconVisible() ? 0 : 8);
        }
        RhToolbar rhToolbar5 = getRhToolbar();
        if (rhToolbar5 != null && (topNavButtonView = (TopNavButtonView) rhToolbar5.findViewById(C8293R.id.account_center_toolbar_search_button)) != null) {
            topNavButtonView.setVisibility(state.getShowSearchInToolbar() ? 0 : 8);
        }
        bindInvites(state);
        bindProfilePicture(state);
        bindDisplayCurrencySwitcher(state);
    }

    private final void bindInvites(AccountCenterViewState state) {
        if (state.getIsLegacyDesign() && state.getShowRewardInProfile()) {
            ProfileReferralView profileReferralView = getBinding().profileReferralView;
            Intrinsics.checkNotNullExpressionValue(profileReferralView, "profileReferralView");
            profileReferralView.setVisibility(state.getShowReferral() ? 0 : 8);
            Integer inviteCount = state.getInviteCount();
            if (inviteCount != null) {
                getBinding().profileReferralView.bind(inviteCount.intValue(), state.isRhubarbMember());
            }
        } else {
            ProfileReferralView profileReferralView2 = getBinding().profileReferralView;
            Intrinsics.checkNotNullExpressionValue(profileReferralView2, "profileReferralView");
            profileReferralView2.setVisibility(8);
            SparkleButton profileTransferButton = getBinding().profileTransferButton;
            Intrinsics.checkNotNullExpressionValue(profileTransferButton, "profileTransferButton");
            OnClickListeners.onClick(profileTransferButton, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.bindInvites$lambda$5(this.f$0);
                }
            });
        }
        ConstraintLayout profileTransferContent = getBinding().profileTransferContent;
        Intrinsics.checkNotNullExpressionValue(profileTransferContent, "profileTransferContent");
        profileTransferContent.setVisibility(state.isProfileTransferContentVisible() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInvites$lambda$5(AccountCenterFragment accountCenterFragment) {
        Navigator navigator = accountCenterFragment.getNavigator();
        android.content.Context contextRequireContext = accountCenterFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, TransfersHub.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void bindProfilePicture(AccountCenterViewState state) {
        final AccountCenterViewState4 updateProfilePictureStatus = state.getUpdateProfilePictureStatus();
        if (updateProfilePictureStatus instanceof AccountCenterViewState4.Success) {
            if (((AccountCenterViewState4.Success) updateProfilePictureStatus).getEvent().consume() != null) {
                showSnackbar(C25904R.string.profile_upload_photo_success);
            }
        } else if (updateProfilePictureStatus instanceof AccountCenterViewState4.FailedMediaUpload) {
            if (((AccountCenterViewState4.FailedMediaUpload) updateProfilePictureStatus).getEvent().consume() != null) {
                showPictureUpdateFailedSnackbar(C25904R.string.profile_upload_photo_error_message, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountCenterFragment.bindProfilePicture$lambda$6(this.f$0, updateProfilePictureStatus);
                    }
                });
            }
        } else if (updateProfilePictureStatus instanceof AccountCenterViewState4.FailedProfileUpdate) {
            if (((AccountCenterViewState4.FailedProfileUpdate) updateProfilePictureStatus).getEvent().consume() != null) {
                showPictureUpdateFailedSnackbar(C25904R.string.profile_update_photo_error_message, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountCenterFragment.bindProfilePicture$lambda$7(this.f$0, updateProfilePictureStatus);
                    }
                });
            }
        } else if (!(updateProfilePictureStatus instanceof AccountCenterViewState4.Updating) && updateProfilePictureStatus != null) {
            throw new NoWhenBranchMatchedException();
        }
        AccountCenterViewState3 removeProfilePictureStatus = state.getRemoveProfilePictureStatus();
        if (removeProfilePictureStatus instanceof AccountCenterViewState3.Success) {
            if (((AccountCenterViewState3.Success) removeProfilePictureStatus).getEvent().consume() != null) {
                showSnackbar(C25904R.string.profile_remove_photo_success);
            }
        } else if (removeProfilePictureStatus instanceof AccountCenterViewState3.Failed) {
            if (((AccountCenterViewState3.Failed) removeProfilePictureStatus).getEvent().consume() != null) {
                showSnackbar(C25904R.string.profile_remove_photo_error_message);
            }
        } else if (!(removeProfilePictureStatus instanceof AccountCenterViewState3.Removing) && removeProfilePictureStatus != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindProfilePicture$lambda$6(AccountCenterFragment accountCenterFragment, AccountCenterViewState4 accountCenterViewState4) {
        accountCenterFragment.getDuxo().updatePictureToMediaStore(((AccountCenterViewState4.FailedMediaUpload) accountCenterViewState4).getBitmap());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindProfilePicture$lambda$7(AccountCenterFragment accountCenterFragment, AccountCenterViewState4 accountCenterViewState4) {
        AccountCenterViewState4.FailedProfileUpdate failedProfileUpdate = (AccountCenterViewState4.FailedProfileUpdate) accountCenterViewState4;
        accountCenterFragment.getDuxo().updatePictureToProfileStore(failedProfileUpdate.getMediaId(), failedProfileUpdate.getProfilePictureLocal());
        return Unit.INSTANCE;
    }

    private final void bindDisplayCurrencySwitcher(final AccountCenterViewState state) {
        ComposeView composeView;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null || (composeView = (ComposeView) rhToolbar.findViewById(C8293R.id.display_currency_switcher)) == null) {
            return;
        }
        composeView.setVisibility(state.getShowMcwCurrencySwitcher() ? 0 : 8);
        if (!state.getShowMcwCurrencySwitcher() || state.getIndividualAccountNumber() == null) {
            return;
        }
        composeView.setContent(ComposableLambda3.composableLambdaInstance(1224129200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$bindDisplayCurrencySwitcher$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1224129200, i, -1, "com.robinhood.android.accountcenter.AccountCenterFragment.bindDisplayCurrencySwitcher.<anonymous>.<anonymous> (AccountCenterFragment.kt:320)");
                }
                Boolean bool = Boolean.TRUE;
                final AccountCenterViewState accountCenterViewState = state;
                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(1478193656, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$bindDisplayCurrencySwitcher$1$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1478193656, i2, -1, "com.robinhood.android.accountcenter.AccountCenterFragment.bindDisplayCurrencySwitcher.<anonymous>.<anonymous>.<anonymous> (AccountCenterFragment.kt:321)");
                        }
                        DisplayCurrencySwitcher.DisplayCurrencySwitcher(accountCenterViewState.getIndividualAccountNumber(), DisplayCurrencySwitcherLocation.ACCOUNT_TAB, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, false, false, null, null, composer2, 432, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void configureToolbarSettingsButton(RhToolbar toolbar) {
        ImageView imageView = (ImageView) toolbar.findViewById(C8293R.id.account_center_toolbar_settings_button);
        if (imageView != null) {
            ViewsKt.eventData$default(imageView, false, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarSettingsButton$lambda$11$lambda$9();
                }
            }, 1, null);
            OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarSettingsButton$lambda$11$lambda$10(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor configureToolbarSettingsButton$lambda$11$lambda$9() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_SETTINGS, null, new Component(Component.ComponentType.BUTTON, "settings", null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbarSettingsButton$lambda$11$lambda$10(AccountCenterFragment accountCenterFragment) {
        Navigator navigator = accountCenterFragment.getNavigator();
        android.content.Context contextRequireContext = accountCenterFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountNavigationTabFragmentKey(false, false, null, null, 15, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void configureToolbarRewardButton(RhToolbar toolbar) {
        final ReferralCallToActionView referralCallToActionView = (ReferralCallToActionView) toolbar.findViewById(C8293R.id.account_center_toolbar_reward_button);
        if (referralCallToActionView != null) {
            OnClickListeners.onClick(referralCallToActionView, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarRewardButton$lambda$13$lambda$12(this.f$0, referralCallToActionView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbarRewardButton$lambda$13$lambda$12(AccountCenterFragment accountCenterFragment, ReferralCallToActionView referralCallToActionView) {
        Navigator navigator = accountCenterFragment.getNavigator();
        android.content.Context context = referralCallToActionView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new RewardOfferIntentKey.Platform(ReferralLaunchMode.SOURCE_HOME_TAB_ICON, null, null, false, false, ReferralLaunchMode.INITIAL_SOURCE_HOME_REWARDS_PILL, 30, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void configureToolbarInboxButton(RhToolbar toolbar) {
        TopNavButtonView topNavButtonView = (TopNavButtonView) toolbar.findViewById(C8293R.id.account_center_toolbar_inbox_button);
        if (topNavButtonView != null) {
            OnClickListeners.onClick(topNavButtonView, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarInboxButton$lambda$14(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbarInboxButton$lambda$14(AccountCenterFragment accountCenterFragment) {
        Navigator navigator = accountCenterFragment.getNavigator();
        android.content.Context contextRequireContext = accountCenterFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void configureToolbarSearchButton(RhToolbar toolbar) {
        TopNavButtonView topNavButtonView = (TopNavButtonView) toolbar.findViewById(C8293R.id.account_center_toolbar_search_button);
        if (topNavButtonView != null) {
            ViewsKt.setLoggingConfig(topNavButtonView, new AutoLoggingConfig(false, false, 2, null));
            ViewsKt.eventData$default(topNavButtonView, false, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarSearchButton$lambda$17$lambda$15(this.f$0);
                }
            }, 1, null);
            OnClickListeners.onClick(topNavButtonView, new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterFragment.configureToolbarSearchButton$lambda$17$lambda$16(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor configureToolbarSearchButton$lambda$17$lambda$15(AccountCenterFragment accountCenterFragment) {
        return new UserInteractionEventDescriptor(null, accountCenterFragment.getEventScreen(), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbarSearchButton$lambda$17$lambda$16(AccountCenterFragment accountCenterFragment) {
        Navigator navigator = accountCenterFragment.getNavigator();
        android.content.Context contextRequireContext = accountCenterFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onProfilePictureClicked(AccountCenterProfileHeaderView accountCenterProfileHeaderView) {
        Intrinsics.checkNotNullParameter(accountCenterProfileHeaderView, "accountCenterProfileHeaderView");
        AccountCenterViewState accountCenterViewState = this.state;
        if ((accountCenterViewState != null ? accountCenterViewState.getUpdateProfilePictureStatus() : null) instanceof AccountCenterViewState4.Updating) {
            return;
        }
        AccountCenterViewState accountCenterViewState2 = this.state;
        if ((accountCenterViewState2 != null ? accountCenterViewState2.getRemoveProfilePictureStatus() : null) instanceof AccountCenterViewState3.Removing) {
            return;
        }
        if (accountCenterProfileHeaderView.getHasProfilePicture()) {
            ChangeProfilePictureBottomSheetFragment changeProfilePictureBottomSheetFragment = (ChangeProfilePictureBottomSheetFragment) FragmentWithCallbacksCompanion.DefaultImpls.newInstance$default(ChangeProfilePictureBottomSheetFragment.INSTANCE, this, 0, 2, null);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            changeProfilePictureBottomSheetFragment.show(parentFragmentManager, "changeProfilePictureBottomSheet");
            return;
        }
        startImagePicker();
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onErrorActionClicked() {
        getDuxo().retry();
    }

    @Override // com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment.Callbacks
    public void onUploadImageClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, "upload_image", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        startImagePicker();
    }

    @Override // com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment.Callbacks
    public void onRemoveImageClick() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, "remove_image", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getDuxo().removePicture();
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onUsernameClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.ProfileEdit(null, 1, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.accountcenter.AccountCenterAdapter.Callbacks
    public void onCollapsedSectionClicked(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem) {
        Intrinsics.checkNotNullParameter(collapsedSectionItem, "collapsedSectionItem");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountCenterAccountDetailBottomSheetFragmentKey(collapsedSectionItem), null, 2, null).show(getChildFragmentManager(), "account-center-account-section");
    }

    private final void startImagePicker() {
        ImagePicker imagePicker = getImagePicker();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(ImagePicker.getImagePickerIntent$default(imagePicker, contextRequireContext, new CropImageArgs(ImagePicker.CropShape.OVAL, 1, 1, 0L, null, false, 56, null), null, false, false, 28, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$18(AccountCenterFragment accountCenterFragment, List bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Bitmap bitmap = (Bitmap) CollectionsKt.firstOrNull(bitmaps);
        if (bitmap != null) {
            accountCenterFragment.getDuxo().updatePictureToMediaStore(bitmap);
        } else {
            accountCenterFragment.showSnackbar(C25904R.string.profile_edit_failed_to_add_image_error_message);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            ImagePicker imagePicker = getImagePicker();
            Intrinsics.checkNotNull(data);
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(imagePicker.extractImagesFromResultIntent(data)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterFragment.onActivityResult$lambda$18(this.f$0, (List) obj);
                }
            });
        } else if (resultCode == 2) {
            showSnackbar(C11048R.string.general_error_no_image_picker_found);
        } else {
            if (resultCode != 3) {
                return;
            }
            showSnackbar(C25904R.string.profile_edit_failed_to_add_image_error_message);
        }
    }

    private final void showSnackbar(int stringRes) {
        CoordinatorLayout snackbarContainer = getBinding().snackbarContainer;
        Intrinsics.checkNotNullExpressionValue(snackbarContainer, "snackbarContainer");
        Snackbars.show$default(snackbarContainer, stringRes, -1, 0, 8, (Object) null);
    }

    @SuppressLint({"WrongConstant"})
    private final void showPictureUpdateFailedSnackbar(int stringRes, final Function0<Unit> retryAction) {
        Snackbar.make(getBinding().snackbarContainer, stringRes, 5000).setAction(C11048R.string.general_label_retry, new View.OnClickListener() { // from class: com.robinhood.android.accountcenter.AccountCenterFragment.showPictureUpdateFailedSnackbar.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                retryAction.invoke();
            }
        }).setAnimationMode(0).show();
    }

    /* compiled from: AccountCenterFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountCenter;", "<init>", "()V", "REQUEST_CODE_PICK_IMAGE", "", "PROFILE_PICTURE_FAILED_SNACK_BAR_DURATION_MS", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.AccountCenter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AccountCenter key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new AccountCenterFragment();
        }
    }
}
