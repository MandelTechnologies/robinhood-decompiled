package com.robinhood.android.settings.p254ui.recurring.detail;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.p254ui.recurring.C28446R;
import com.robinhood.android.settings.p254ui.recurring.InsufficientBuyingPowerBottomSheetFragment;
import com.robinhood.android.settings.p254ui.recurring.InvestmentScheduleDataView;
import com.robinhood.android.settings.p254ui.recurring.databinding.FragmentInvestmentScheduleSettingsBinding;
import com.robinhood.android.settings.p254ui.recurring.detail.DateRowState;
import com.robinhood.android.settings.p254ui.recurring.detail.DeleteInvestmentScheduleDialogFragment;
import com.robinhood.android.settings.p254ui.recurring.detail.InvestmentScheduleSettingsType;
import com.robinhood.android.settings.p254ui.recurring.detail.SourceOfFundsRowState;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.recurring.UiInvestmentSchedule2;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002yzB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000204H\u0016J\u001a\u00108\u001a\u0002042\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000204H\u0016J\u0010\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020@H\u0016J\u0018\u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0014J\u0010\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020HH\u0016J\"\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0012\u0010O\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010QH\u0002J\u0010\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u0002042\u0006\u0010P\u001a\u00020VH\u0002J\u0012\u0010W\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010XH\u0002J\u0012\u0010Y\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010[\u001a\u0002042\u0006\u0010P\u001a\u00020\\H\u0002J\u0010\u0010]\u001a\u0002042\u0006\u0010P\u001a\u00020^H\u0002J\u0012\u0010_\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010`H\u0002J\u0012\u0010a\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010bH\u0002J\u0012\u0010c\u001a\u0002042\b\u0010P\u001a\u0004\u0018\u00010dH\u0002J\u0010\u0010e\u001a\u0002042\u0006\u0010P\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u0002042\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u0002042\u0006\u0010P\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u0002042\u0006\u0010P\u001a\u00020mH\u0002J\u0010\u0010n\u001a\u0002042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010o\u001a\u0002042\u0006\u0010p\u001a\u00020qH\u0002J\u0018\u0010r\u001a\u0002042\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0016J\b\u0010w\u001a\u000204H\u0016J\b\u0010x\u001a\u000204H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0014\u0010-\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0015R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/settings/ui/recurring/InsufficientBuyingPowerBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "isActive", "()Z", "setActive", "(Z)V", "isActive$delegate", "Lkotlin/properties/ReadWriteProperty;", "duxo", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/settings/ui/recurring/databinding/FragmentInvestmentScheduleSettingsBinding;", "getBinding", "()Lcom/robinhood/android/settings/ui/recurring/databinding/FragmentInvestmentScheduleSettingsBinding;", "binding$delegate", "questionMarkDrawable", "Landroid/graphics/drawable/Drawable;", "getQuestionMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "questionMarkDrawable$delegate", "showPastInvestmentsCta", "_isCrypto", "isCrypto", "fromInsights", "getFromInsights", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onAttach", "", "context", "Landroid/content/Context;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "bindSypHeader", "state", "Lcom/robinhood/android/settings/ui/recurring/detail/SypHeaderState;", "showPriceChangeInfo", "description", "Lcom/robinhood/utils/resource/StringResource;", "showEndRecurringInvestmentDialog", "Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "bindInfoBanner", "Lcom/robinhood/android/settings/ui/recurring/detail/InfoBannerState;", "bindDateRow", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "bindAmountRow", "Lcom/robinhood/android/settings/ui/recurring/detail/AmountRowState;", "bindFrequencyRow", "Lcom/robinhood/android/settings/ui/recurring/detail/FrequencyRowState;", "bindTaxYear", "Lcom/robinhood/android/settings/ui/recurring/detail/RetirementTaxYearRowState;", "bindSourceOfFunds", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState;", "bindBackupPayment", "Lcom/robinhood/android/settings/ui/recurring/detail/BackupPaymentRowState;", "bindCtas", "Lcom/robinhood/android/settings/ui/recurring/detail/CtaState;", "onInfoBannerCtaClicked", "url", "", "onDateRowClicked", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Date;", "setState", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState;", "bindToggle", "onSourceOfFundsRowClicked", "destination", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "onDepositFundsClicked", "recommendedDeposit", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "onChangePaymentMethodClicked", "onInvestmentScheduleDeleted", "Callbacks", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestmentScheduleSettingsFragment extends BaseFragment implements InsufficientBuyingPowerBottomSheetFragment.Callbacks, DeleteInvestmentScheduleDialogFragment.Callbacks {
    private static final int REQUEST_CODE_DATE_PICKER = 2000;
    private boolean _isCrypto;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: isActive$delegate, reason: from kotlin metadata */
    private final Interfaces3 isActive;
    private final AppBarLayout.OnOffsetChangedListener offsetChangedListener;

    /* renamed from: questionMarkDrawable$delegate, reason: from kotlin metadata */
    private final Lazy questionMarkDrawable;
    private boolean showPastInvestmentsCta;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestmentScheduleSettingsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InvestmentScheduleSettingsFragment.class, "isActive", "isActive()Z", 0)), Reflection.property1(new PropertyReference1Impl(InvestmentScheduleSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/ui/recurring/databinding/FragmentInvestmentScheduleSettingsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestmentScheduleSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Callbacks;", "", "onAmountSelected", "", "fromInsights", "", "onScheduleSelected", "onPaycheckSourceOfFundsSelected", "onSourceOfFundsSelected", "onBackupPaymentSelected", "onInsufficientBuyingPowerChangePaymentSelected", "onPastInvestmentsClicked", "onInvestmentScheduleDeleted", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountSelected(boolean fromInsights);

        void onBackupPaymentSelected(boolean fromInsights);

        void onInsufficientBuyingPowerChangePaymentSelected(boolean fromInsights);

        void onInvestmentScheduleDeleted();

        void onPastInvestmentsClicked();

        void onPaycheckSourceOfFundsSelected();

        void onScheduleSelected(boolean fromInsights);

        void onSourceOfFundsSelected(boolean fromInsights);
    }

    public InvestmentScheduleSettingsFragment() {
        super(C28446R.layout.fragment_investment_schedule_settings);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.isActive = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
        this.duxo = OldDuxos.oldDuxo(this, InvestmentScheduleSettingsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, InvestmentScheduleSettingsFragment2.INSTANCE);
        this.questionMarkDrawable = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.questionMarkDrawable_delegate$lambda$0(this.f$0);
            }
        });
        this.useDesignSystemToolbar = true;
        this.offsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$offsetChangedListener$1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                float fAbs = Math.abs(i) / appBarLayout.getTotalScrollRange();
                this.this$0.getBinding().investmentScheduleSettingsCollapsingTitle.setAlpha(1.0f - fAbs);
                RhToolbar rhToolbar = this.this$0.getRhToolbar();
                if (rhToolbar != null) {
                    rhToolbar.setTitleAlpha(fAbs);
                }
            }
        };
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean isActive() {
        return ((Boolean) this.isActive.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setActive(boolean z) {
        this.isActive.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final InvestmentScheduleSettingsDuxo getDuxo() {
        return (InvestmentScheduleSettingsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentInvestmentScheduleSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestmentScheduleSettingsBinding) value;
    }

    private final Drawable getQuestionMarkDrawable() {
        return (Drawable) this.questionMarkDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable questionMarkDrawable_delegate$lambda$0(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        Drawable drawable = investmentScheduleSettingsFragment.requireContext().getDrawable(C11048R.drawable.svg_ic_question);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        return drawableMutate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto, reason: from getter */
    public boolean get_isCrypto() {
        return this._isCrypto;
    }

    private final boolean getFromInsights() {
        return ((InvestmentScheduleSettingsArgs) INSTANCE.getArgs((Fragment) this)).getFromInsights();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentScheduleSettingsFragment.onAttach$lambda$2$lambda$1(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        setScarletContextWrapper(scarletContextWrapper2);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        LifecycleHost.DefaultImpls.bind$default(this, baseActivity.getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsFragment.onAttach$lambda$5(context, this, (DayNightOverlay) obj);
            }
        });
        setHasOptionsMenu(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$1(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$5(Context context, InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, R.attr.colorPrimary);
        if (themeAttribute != null) {
            investmentScheduleSettingsFragment.getQuestionMarkDrawable().setTint(context.getColor(themeAttribute.intValue()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C284601(this));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.onResume.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(InvestmentScheduleSettingsState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isActive());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsFragment.onResume$lambda$6(this.f$0, (Boolean) obj);
            }
        });
        if (!getFromInsights()) {
            getBinding().investmentScheduleToggleView.onCheckedChanged(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentScheduleSettingsFragment.onResume$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        FragmentInvestmentScheduleSettingsBinding binding = getBinding();
        RdsButton investmentSchedulePauseBtn = binding.investmentSchedulePauseBtn;
        Intrinsics.checkNotNullExpressionValue(investmentSchedulePauseBtn, "investmentSchedulePauseBtn");
        OnClickListeners.onClick(investmentSchedulePauseBtn, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.onResume$lambda$10$lambda$8(this.f$0);
            }
        });
        RdsButton investmentScheduleUnpauseBtn = binding.investmentScheduleUnpauseBtn;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleUnpauseBtn, "investmentScheduleUnpauseBtn");
        OnClickListeners.onClick(investmentScheduleUnpauseBtn, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.onResume$lambda$10$lambda$9(this.f$0);
            }
        });
    }

    /* compiled from: InvestmentScheduleSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$onResume$1 */
    /* synthetic */ class C284601 extends FunctionReferenceImpl implements Function1<InvestmentScheduleSettingsState, Unit> {
        C284601(Object obj) {
            super(1, obj, InvestmentScheduleSettingsFragment.class, "setState", "setState(Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestmentScheduleSettingsState investmentScheduleSettingsState) throws Resources.NotFoundException {
            invoke2(investmentScheduleSettingsState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestmentScheduleSettingsState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestmentScheduleSettingsFragment) this.receiver).setState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, Boolean bool) throws Resources.NotFoundException {
        Intrinsics.checkNotNull(bool);
        investmentScheduleSettingsFragment.bindToggle(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, boolean z) throws Resources.NotFoundException {
        investmentScheduleSettingsFragment.getBinding().investmentScheduleToggleView.setChecked(!z);
        investmentScheduleSettingsFragment.getDuxo().toggleInvestmentSchedule(z);
        if (!z) {
            investmentScheduleSettingsFragment.getUserLeapManager().presentSurveyIfNecessary(investmentScheduleSettingsFragment, Survey.RECURRING_INVESTMENTS_PAUSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10$lambda$8(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        investmentScheduleSettingsFragment.getDuxo().toggleInvestmentSchedule(false);
        investmentScheduleSettingsFragment.getDuxo().logPauseButtonTap();
        investmentScheduleSettingsFragment.getUserLeapManager().presentSurveyIfNecessary(investmentScheduleSettingsFragment, Survey.RECURRING_INVESTMENTS_PAUSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10$lambda$9(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        investmentScheduleSettingsFragment.getDuxo().toggleInvestmentSchedule(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().investmentScheduleSettingsLayout.addOnOffsetChangedListener(this.offsetChangedListener);
        if (getFromInsights()) {
            FragmentInvestmentScheduleSettingsBinding binding = getBinding();
            binding.investmentSchedulePauseReasonBanner.setVisibility(8);
            binding.investmentScheduleDataSectionFirst.setVisibility(8);
            binding.investmentScheduleDataNextInvestmentDate.setVisibility(8);
            binding.investmentScheduleDataTotalInvested.setVisibility(8);
            binding.investmentScheduleDataPriceChange.setVisibility(8);
            binding.investmentScheduleDataFirstInvestmentDate.setVisibility(8);
            binding.investmentScheduleDataDivider.setVisibility(8);
            binding.investmentScheduleToggleView.setVisibility(8);
            binding.investmentScheduleDeleteBtn.setVisibility(8);
        } else {
            FragmentInvestmentScheduleSettingsBinding binding2 = getBinding();
            binding2.investmentSchedulePauseBtn.setVisibility(8);
            binding2.investmentScheduleUnpauseBtn.setVisibility(8);
            binding2.investmentScheduleEndBtn.setVisibility(8);
        }
        bindToggle(isActive());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().investmentScheduleSettingsLayout.removeOnOffsetChangedListener(this.offsetChangedListener);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitleAlpha(0.0f);
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C28446R.menu.menu_investment_schedule, menu);
        MenuItem menuItemFindItem = menu.findItem(C28446R.id.action_past_investments);
        menuItemFindItem.setVisible(this.showPastInvestmentsCta);
        menuItemFindItem.setTitle(getResources().getString(C28446R.string.past_investments_title));
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C28446R.id.action_past_investments && this.showPastInvestmentsCta) {
            getCallbacks().onPastInvestmentsClicked();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2000) {
            if (resultCode != -1 || data == null) {
                getDuxo().logNextOrderDatePickerDismiss();
                return;
            }
            Serializable serializableExtra = data.getSerializableExtra(RecurringDatePickerActivity.ARG_SELECTED_DATE);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.time.LocalDate");
            getDuxo().logNextOrderDateChanged();
            getDuxo().setNextDate((LocalDate) serializableExtra);
        }
    }

    private final void bindSypHeader(final SypHeaderState state) throws Resources.NotFoundException {
        FragmentInvestmentScheduleSettingsBinding binding = getBinding();
        LinearLayout investmentScheduleDataSectionFirst = binding.investmentScheduleDataSectionFirst;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleDataSectionFirst, "investmentScheduleDataSectionFirst");
        investmentScheduleDataSectionFirst.setVisibility(state != null ? 0 : 8);
        LinearLayout investmentScheduleDataSectionSecond = binding.investmentScheduleDataSectionSecond;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleDataSectionSecond, "investmentScheduleDataSectionSecond");
        investmentScheduleDataSectionSecond.setVisibility(state != null ? 0 : 8);
        LinearLayout investmentScheduleDataDivider = binding.investmentScheduleDataDivider;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleDataDivider, "investmentScheduleDataDivider");
        investmentScheduleDataDivider.setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        InvestmentScheduleDataView investmentScheduleDataView = binding.investmentScheduleDataPriceChange;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getResources().getString(C28446R.string.settings_investment_schedule_data_price_change));
        spannableStringBuilder.append(' ');
        ImageSpan imageSpan = new ImageSpan(getQuestionMarkDrawable());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(' ');
        spannableStringBuilder.setSpan(imageSpan, length, spannableStringBuilder.length(), 17);
        investmentScheduleDataView.setLabelText(new SpannedString(spannableStringBuilder));
        String string2 = getResources().getString(C11048R.string.general_label_emdash);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        binding.investmentScheduleDataNextInvestmentDate.setValueText(isActive() ? getResources().getString(C28446R.string.settings_paycheck_investment_schedule_data_next_date_value) : string2);
        binding.investmentScheduleDataTotalInvested.setValueText(state.getTotalInvestedText());
        InvestmentScheduleDataView investmentScheduleDataView2 = binding.investmentScheduleDataPriceChange;
        String priceChangeText = state.getPriceChangeText();
        if (priceChangeText == null) {
            priceChangeText = string2;
        }
        investmentScheduleDataView2.setValueText(priceChangeText);
        InvestmentScheduleDataView investmentScheduleDataView3 = binding.investmentScheduleDataFirstInvestmentDate;
        LocalDate firstInvestmentDate = state.getFirstInvestmentDate();
        if (firstInvestmentDate != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String recent = LocalDates4.formatRecent(firstInvestmentDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
            if (recent != null) {
                string2 = recent;
            }
        }
        investmentScheduleDataView3.setValueText(string2);
        InvestmentScheduleDataView investmentScheduleDataPriceChange = binding.investmentScheduleDataPriceChange;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleDataPriceChange, "investmentScheduleDataPriceChange");
        OnClickListeners.onClick(investmentScheduleDataPriceChange, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.bindSypHeader$lambda$17$lambda$16(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSypHeader$lambda$17$lambda$16(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, SypHeaderState sypHeaderState) {
        investmentScheduleSettingsFragment.showPriceChangeInfo(sypHeaderState.getDialogDescription());
        return Unit.INSTANCE;
    }

    private final void showPriceChangeInfo(StringResource description) {
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        String string2 = getString(C28446R.string.settings_investment_schedule_price_change_dialog_title);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, string2, null, description.getText(resources), null, getString(C11048R.string.general_label_done), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, "alert");
    }

    private final void showEndRecurringInvestmentDialog(EndInvestmentState state) throws Resources.NotFoundException {
        DeleteInvestmentScheduleDialogFragment.Companion companion = DeleteInvestmentScheduleDialogFragment.INSTANCE;
        DeleteInvestmentScheduleDialogFragment.Args args = new DeleteInvestmentScheduleDialogFragment.Args(UiInvestmentSchedule2.toInvestmentSchedule(state.getSchedule()), getFromInsights());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        StringResource title = state.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = title.getText(resources).toString();
        StringResource message = state.getMessage();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String string3 = message.getText(resources2).toString();
        String string4 = getResources().getString(state.getPositiveButtonRes());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = getResources().getString(state.getNegativeButtonRes());
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        companion.show(args, contextRequireContext, childFragmentManager, string2, string3, string4, string5);
    }

    private final void bindInfoBanner(final InfoBannerState state) {
        RdsInfoBannerView rdsInfoBannerView = getBinding().investmentSchedulePauseReasonBanner;
        Intrinsics.checkNotNull(rdsInfoBannerView);
        rdsInfoBannerView.setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        RichText text = state.getText();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsInfoBannerView.setText(RichTexts.toSpannableString$default(text, contextRequireContext, null, false, null, 14, null));
        rdsInfoBannerView.setCtaText(state.getShowLearnMore() ? rdsInfoBannerView.getResources().getString(C11048R.string.general_action_learn_more) : null);
        ServerToBentoAssetMapper2 icon = state.getIcon();
        rdsInfoBannerView.setIcon(icon != null ? rdsInfoBannerView.getResources().getDrawable(icon.getResourceId()) : null);
        rdsInfoBannerView.setArrowVisible(state.getShowArrow());
        if (state.getShowLearnMore()) {
            OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentScheduleSettingsFragment.bindInfoBanner$lambda$20$lambda$19(this.f$0, state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInfoBanner$lambda$20$lambda$19(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, InfoBannerState infoBannerState) {
        investmentScheduleSettingsFragment.onInfoBannerCtaClicked(infoBannerState.getUrl());
        return Unit.INSTANCE;
    }

    private final void bindDateRow(final DateRowState state) throws Resources.NotFoundException {
        String string2;
        RdsRowView rdsRowView = getBinding().investmentScheduleNextDateRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        boolean z = state instanceof DateRowState.Date;
        if (z) {
            LocalDate nextInvestmentDate = ((DateRowState.Date) state).getNextInvestmentDate();
            Resources resources = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            string2 = LocalDates4.formatRecent(nextInvestmentDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
        } else {
            if (!Intrinsics.areEqual(state, DateRowState.Paused.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = rdsRowView.getResources().getString(C11048R.string.general_label_emdash);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        rdsRowView.setMetadataPrimaryText(string2);
        if (z) {
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentScheduleSettingsFragment.bindDateRow$lambda$22$lambda$21(this.f$0, state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDateRow$lambda$22$lambda$21(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, DateRowState dateRowState) {
        investmentScheduleSettingsFragment.onDateRowClicked((DateRowState.Date) dateRowState);
        return Unit.INSTANCE;
    }

    private final void bindAmountRow(AmountRowState state) {
        RdsRowView rdsRowView = getBinding().investmentScheduleAmountRow;
        rdsRowView.setMetadataPrimaryText(state.getMetaText());
        Intrinsics.checkNotNull(rdsRowView);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.bindAmountRow$lambda$24$lambda$23(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAmountRow$lambda$24$lambda$23(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        investmentScheduleSettingsFragment.getCallbacks().onAmountSelected(investmentScheduleSettingsFragment.getFromInsights());
        return Unit.INSTANCE;
    }

    private final void bindFrequencyRow(FrequencyRowState state) {
        RdsRowView rdsRowView = getBinding().investmentScheduleScheduleRow;
        rdsRowView.setMetadataPrimaryText(rdsRowView.getResources().getString(state.getMetaTextRes()));
        if (state.getEnabled()) {
            Intrinsics.checkNotNull(rdsRowView);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentScheduleSettingsFragment.bindFrequencyRow$lambda$26$lambda$25(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindFrequencyRow$lambda$26$lambda$25(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        investmentScheduleSettingsFragment.getCallbacks().onScheduleSelected(investmentScheduleSettingsFragment.getFromInsights());
        return Unit.INSTANCE;
    }

    private final void bindTaxYear(RetirementTaxYearRowState state) {
        String yearText;
        RdsRowView rdsRowView = getBinding().investmentScheduleRetirementTaxYearRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state != null ? 0 : 8);
        if (state == null || (yearText = state.getYearText()) == null) {
            return;
        }
        rdsRowView.setMetadataPrimaryText(yearText);
        rdsRowView.setTrailingIconDrawable(AppCompatResources.getDrawable(requireContext(), InvestmentScheduleSettingsState.INSTANCE.getRetirementRowTrailingIconRes()));
    }

    private final void bindSourceOfFunds(final SourceOfFundsRowState state) throws Resources.NotFoundException {
        StringResource metaText;
        RdsRowView rdsRowView = getBinding().investmentScheduleSourceOfFundsRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state != null ? 0 : 8);
        if (state == null || (metaText = state.getMetaText()) == null) {
            return;
        }
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = metaText.getText(resources);
        if (text == null) {
            return;
        }
        if (state.getShowMetaAsCta()) {
            rdsRowView.setCtaText(text);
            rdsRowView.setMetadataPrimaryText(null);
        } else {
            rdsRowView.setMetadataPrimaryText(text);
            rdsRowView.setCtaText(null);
        }
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.bindSourceOfFunds$lambda$29$lambda$28(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSourceOfFunds$lambda$29$lambda$28(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, SourceOfFundsRowState sourceOfFundsRowState) {
        investmentScheduleSettingsFragment.onSourceOfFundsRowClicked(sourceOfFundsRowState.getDestination());
        return Unit.INSTANCE;
    }

    private final void bindBackupPayment(BackupPaymentRowState state) throws Resources.NotFoundException {
        StringResource text;
        RdsRowView rdsRowView = getBinding().investmentScheduleBackupRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state != null ? 0 : 8);
        if (state == null || (text = state.getText()) == null) {
            return;
        }
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text2 = text.getText(resources);
        if (text2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!state.getBold()) {
            spannableStringBuilder.length();
            spannableStringBuilder.append(text2);
        } else {
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_PRIMARY());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(text2);
            spannableStringBuilder.setSpan(themableColorSpans3, length2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        }
        rdsRowView.setMetadataPrimaryText(new SpannedString(spannableStringBuilder));
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.bindBackupPayment$lambda$35$lambda$34(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindBackupPayment$lambda$35$lambda$34(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
        investmentScheduleSettingsFragment.getCallbacks().onBackupPaymentSelected(investmentScheduleSettingsFragment.getFromInsights());
        return Unit.INSTANCE;
    }

    private final void bindCtas(CtaState state) {
        FragmentInvestmentScheduleSettingsBinding binding = getBinding();
        InvestmentScheduleSettingsType type2 = state.getType();
        if (type2 instanceof InvestmentScheduleSettingsType.Default) {
            binding.investmentScheduleEndBtn.setEnabled(state.getEndInvestmentState() != null);
            binding.investmentSchedulePauseBtn.setEnabled(state.isToggleable());
            binding.investmentSchedulePauseBtn.setEnabled(state.isActive());
            binding.investmentScheduleUnpauseBtn.setEnabled(state.isToggleable());
            RdsButton investmentScheduleUnpauseBtn = binding.investmentScheduleUnpauseBtn;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleUnpauseBtn, "investmentScheduleUnpauseBtn");
            investmentScheduleUnpauseBtn.setVisibility(state.isActive() ? 8 : 0);
            final EndInvestmentState endInvestmentState = state.getEndInvestmentState();
            if (endInvestmentState == null) {
                return;
            }
            RdsButton investmentScheduleEndBtn = binding.investmentScheduleEndBtn;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleEndBtn, "investmentScheduleEndBtn");
            OnClickListeners.onClick(investmentScheduleEndBtn, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestmentScheduleSettingsFragment.bindCtas$lambda$38$lambda$36(this.f$0, endInvestmentState);
                }
            });
            return;
        }
        if (!(type2 instanceof InvestmentScheduleSettingsType.Syp)) {
            throw new NoWhenBranchMatchedException();
        }
        binding.investmentScheduleToggleView.setEnabled(state.isToggleable());
        binding.investmentScheduleDeleteBtn.setEnabled(state.getEndInvestmentState() != null);
        binding.investmentScheduleToggleView.setPrimaryText(getResources().getString(((InvestmentScheduleSettingsType.Syp) state.getType()).getToggleRes()));
        RdsButton rdsButton = binding.investmentScheduleDeleteBtn;
        StringResource deleteButtonText = ((InvestmentScheduleSettingsType.Syp) state.getType()).getDeleteButtonText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsButton.setText(deleteButtonText.getText(resources));
        final EndInvestmentState endInvestmentState2 = state.getEndInvestmentState();
        if (endInvestmentState2 == null) {
            return;
        }
        RdsButton investmentScheduleDeleteBtn = binding.investmentScheduleDeleteBtn;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleDeleteBtn, "investmentScheduleDeleteBtn");
        OnClickListeners.onClick(investmentScheduleDeleteBtn, new Function0() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentScheduleSettingsFragment.bindCtas$lambda$38$lambda$37(this.f$0, endInvestmentState2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCtas$lambda$38$lambda$36(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, EndInvestmentState endInvestmentState) throws Resources.NotFoundException {
        investmentScheduleSettingsFragment.showEndRecurringInvestmentDialog(endInvestmentState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCtas$lambda$38$lambda$37(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, EndInvestmentState endInvestmentState) throws Resources.NotFoundException {
        investmentScheduleSettingsFragment.showEndRecurringInvestmentDialog(endInvestmentState);
        return Unit.INSTANCE;
    }

    private final void onInfoBannerCtaClicked(String url) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
    }

    private final void onDateRowClicked(DateRowState.Date state) {
        getDuxo().logNextOrderDateRowTap();
        RecurringDatePickerActivity.Companion companion = RecurringDatePickerActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivityForResult(companion.getIntent(contextRequireContext, state.getNextInvestmentDate(), state.isCrypto()), 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(InvestmentScheduleSettingsState state) throws Resources.NotFoundException {
        Throwable thConsume;
        setActive(state.isActive());
        bindCtas(state.getCtaState());
        AmountRowState amountRowState = state.getAmountRowState();
        if (amountRowState != null) {
            bindAmountRow(amountRowState);
        }
        FrequencyRowState frequencyRowState = state.getFrequencyRowState();
        if (frequencyRowState != null) {
            bindFrequencyRow(frequencyRowState);
        }
        bindInfoBanner(state.getInfoBannerState());
        bindSypHeader(state.getSypHeaderState());
        bindDateRow(state.getDateRowState());
        bindSourceOfFunds(state.getSourceOfFundsRowState());
        bindBackupPayment(state.getBackupPaymentRowState());
        bindTaxYear(state.getRetirementTaxYearRowState());
        RdsRowView rdsRowView = getBinding().investmentScheduleRetirementTypeRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state.getShowRetirementRows() ? 0 : 8);
        rdsRowView.setTrailingIconDrawable(AppCompatResources.getDrawable(requireContext(), InvestmentScheduleSettingsState.INSTANCE.getRetirementRowTrailingIconRes()));
        if (this.showPastInvestmentsCta != state.getShowPastInvestmentsCta()) {
            this.showPastInvestmentsCta = state.getShowPastInvestmentsCta();
            requireActivity().invalidateOptionsMenu();
        }
        FragmentInvestmentScheduleSettingsBinding binding = getBinding();
        binding.investmentScheduleNextDateRow.setEnabled(state.isEnabled());
        binding.investmentScheduleAmountRow.setEnabled(state.isEnabled());
        binding.investmentScheduleScheduleRow.setEnabled(state.isEnabled());
        binding.investmentScheduleSourceOfFundsRow.setEnabled(state.isEnabled());
        binding.investmentScheduleBackupRow.setEnabled(state.isEnabled());
        UiEvent<Unit> toggleEvent = state.getToggleEvent();
        if ((toggleEvent != null ? toggleEvent.consume() : null) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Snackbars.show(BaseContexts.requireActivityBaseContext(contextRequireContext), C28446R.string.settings_investment_schedule_saved, -1);
        }
        UiEvent<Throwable> toggleErrorEvent = state.getToggleErrorEvent();
        if (toggleErrorEvent != null && (thConsume = toggleErrorEvent.consume()) != null) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
        }
        this._isCrypto = state.isCrypto();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        StringResource title = state.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhToolbar.setTitle(title.getText(resources));
        RhTextView rhTextView = getBinding().investmentScheduleSettingsCollapsingTitle;
        StringResource title2 = state.getTitle();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView.setText(title2.getText(resources2));
    }

    private final void bindToggle(boolean isActive) throws Resources.NotFoundException {
        FragmentInvestmentScheduleSettingsBinding binding = getBinding();
        if (!getFromInsights()) {
            if (binding.investmentScheduleToggleView.isChecked() != isActive) {
                binding.investmentScheduleToggleView.setCheckedProgrammatically(isActive);
            }
        } else if (isActive) {
            binding.investmentSchedulePauseBtn.setVisibility(0);
            binding.investmentScheduleUnpauseBtn.setVisibility(8);
        } else {
            binding.investmentSchedulePauseBtn.setVisibility(8);
            binding.investmentScheduleUnpauseBtn.setVisibility(0);
        }
    }

    private final void onSourceOfFundsRowClicked(SourceOfFundsRowState.Destination destination) {
        if (destination instanceof SourceOfFundsRowState.Destination.PaycheckSourceOfFunds) {
            getCallbacks().onPaycheckSourceOfFundsSelected();
            return;
        }
        if (destination instanceof SourceOfFundsRowState.Destination.InsufficientBuyingPower) {
            SourceOfFundsRowState.Destination.InsufficientBuyingPower insufficientBuyingPower = (SourceOfFundsRowState.Destination.InsufficientBuyingPower) destination;
            InsufficientBuyingPowerBottomSheetFragment insufficientBuyingPowerBottomSheetFragmentNewInstance = InsufficientBuyingPowerBottomSheetFragment.INSTANCE.newInstance(insufficientBuyingPower.getAmount(), insufficientBuyingPower.getFrequency());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            insufficientBuyingPowerBottomSheetFragmentNewInstance.show(childFragmentManager, "insufficientBuyingPower");
            return;
        }
        if (!(destination instanceof SourceOfFundsRowState.Destination.DefaultSourceOfFunds)) {
            throw new NoWhenBranchMatchedException();
        }
        getCallbacks().onSourceOfFundsSelected(getFromInsights());
    }

    @Override // com.robinhood.android.settings.ui.recurring.InsufficientBuyingPowerBottomSheetFragment.Callbacks
    public void onDepositFundsClicked(BigDecimal recommendedDeposit, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(recommendedDeposit, "recommendedDeposit");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferContext.RecurringInsufficientBuyingPower(recommendedDeposit, frequency)), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.settings.ui.recurring.InsufficientBuyingPowerBottomSheetFragment.Callbacks
    public void onChangePaymentMethodClicked() {
        getCallbacks().onInsufficientBuyingPowerChangePaymentSelected(getFromInsights());
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment.Callbacks
    public void onInvestmentScheduleDeleted() {
        getCallbacks().onInvestmentScheduleDeleted();
    }

    /* compiled from: InvestmentScheduleSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsArgs;", "<init>", "()V", "REQUEST_CODE_DATE_PICKER", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestmentScheduleSettingsFragment, InvestmentScheduleSettingsArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestmentScheduleSettingsArgs getArgs(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment) {
            return (InvestmentScheduleSettingsArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investmentScheduleSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestmentScheduleSettingsFragment newInstance(InvestmentScheduleSettingsArgs investmentScheduleSettingsArgs) {
            return (InvestmentScheduleSettingsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investmentScheduleSettingsArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestmentScheduleSettingsFragment investmentScheduleSettingsFragment, InvestmentScheduleSettingsArgs investmentScheduleSettingsArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investmentScheduleSettingsFragment, investmentScheduleSettingsArgs);
        }
    }
}
