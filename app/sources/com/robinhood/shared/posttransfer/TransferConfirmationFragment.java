package com.robinhood.shared.posttransfer;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p355ui.bonfire.UiPostTransferBanner;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.posttransfer.TransferConfirmationEvent;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferConfirmationBinding;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: TransferConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\n\u0010<\u001a\u0004\u0018\u00010=H\u0002R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b3\u00104¨\u0006@"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "getGoldDepositBoostTransferIdPref$annotations", "getGoldDepositBoostTransferIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldDepositBoostTransferIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "goldDepositBoostTransferAmountPref", "getGoldDepositBoostTransferAmountPref$annotations", "getGoldDepositBoostTransferAmountPref", "setGoldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "getGoldDepositBoostTransferTimestampPref$annotations", "getGoldDepositBoostTransferTimestampPref", "setGoldDepositBoostTransferTimestampPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/shared/posttransfer/TransferConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/shared/posttransfer/TransferConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationBinding;", "getBinding", "()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getSurvey", "Lcom/robinhood/userleap/survey/Survey;", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferConfirmationFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public StringPreference goldDepositBoostTransferAmountPref;
    public StringPreference goldDepositBoostTransferIdPref;
    public StringPreference goldDepositBoostTransferTimestampPref;
    public Markwon markwon;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Callbacks;", "", "onContinueClick", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClick();
    }

    @GoldDepositBoostTransferAmountPref
    public static /* synthetic */ void getGoldDepositBoostTransferAmountPref$annotations() {
    }

    @GoldDepositBoostTransferIdPref
    public static /* synthetic */ void getGoldDepositBoostTransferIdPref$annotations() {
    }

    @GoldDepositBoostTransferTimestampPref
    public static /* synthetic */ void getGoldDepositBoostTransferTimestampPref$annotations() {
    }

    public TransferConfirmationFragment() {
        super(C39496R.layout.fragment_transfer_confirmation);
        this.duxo = DuxosKt.duxo(this, TransferConfirmationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, TransferConfirmationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final StringPreference getGoldDepositBoostTransferIdPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferIdPref");
        return null;
    }

    public final void setGoldDepositBoostTransferIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferIdPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferAmountPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferAmountPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferAmountPref");
        return null;
    }

    public final void setGoldDepositBoostTransferAmountPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferAmountPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferTimestampPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferTimestampPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferTimestampPref");
        return null;
    }

    public final void setGoldDepositBoostTransferTimestampPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferTimestampPref = stringPreference;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferConfirmationDuxo getDuxo() {
        return (TransferConfirmationDuxo) this.duxo.getValue();
    }

    private final FragmentTransferConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferConfirmationBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.CharSequence] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        StringPreference goldDepositBoostTransferIdPref = getGoldDepositBoostTransferIdPref();
        Companion companion = INSTANCE;
        goldDepositBoostTransferIdPref.set(((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getTransferId());
        getGoldDepositBoostTransferAmountPref().set(((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getAmount());
        getGoldDepositBoostTransferTimestampPref().set(Instant.now().toString());
        BaseFragment.collectDuxoState$default(this, null, new C395011(null), 1, null);
        FragmentTransferConfirmationBinding binding = getBinding();
        binding.titleTxt.setText(((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getTitle());
        RichText detail = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getDetail();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SpannableString spannableString$default = RichTexts.toSpannableString$default(detail, contextRequireContext, null, false, null, 14, null);
        RhTextView rhTextView = binding.detailTxt;
        final GenericAlert detailLearnMoreAlert = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getDetailLearnMoreAlert();
        if (detailLearnMoreAlert != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ?? BuildTextWithLearnMore$default = LearnMoresKt.buildTextWithLearnMore$default(resources, spannableString$default, false, null, false, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$lambda$6$lambda$1$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Navigator.DefaultImpls.createDialogFragment$default(this.this$0.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(detailLearnMoreAlert, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(this.this$0.getParentFragmentManager(), "transfer-confirmation-learn-more");
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
            if (BuildTextWithLearnMore$default != 0) {
                spannableString$default = BuildTextWithLearnMore$default;
            }
        }
        rhTextView.setText(spannableString$default);
        final GenericAlert additionalDetailAlert = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getAdditionalDetailAlert();
        if (additionalDetailAlert != null) {
            binding.additionalDetailTxt.onLinkClick(new Function1() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TransferConfirmationFragment.onViewCreated$lambda$6$lambda$3$lambda$2(this.f$0, additionalDetailAlert, (String) obj));
                }
            });
        }
        RhTextView rhTextView2 = binding.additionalDetailTxt;
        String additionalDetailMarkdown = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getAdditionalDetailMarkdown();
        rhTextView2.setText(additionalDetailMarkdown != null ? getMarkwon().toMarkdown(additionalDetailMarkdown) : null);
        final UiPostTransferBanner banner = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getBanner();
        if (banner != null) {
            EventLogger eventLogger = getEventLogger();
            Component component = new Component(Component.ComponentType.LINK_DEBIT_CARD_BANNER, null, null, 6, null);
            Screen.Name name = Screen.Name.POST_TRANSFER_CONFIRMATION;
            String loggingIdentifier = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getLoggingIdentifier();
            if (loggingIdentifier == null) {
                loggingIdentifier = "";
            }
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(name, null, loggingIdentifier, null, 10, null), component, null, null, 25, null);
            RdsInfoBannerView banner2 = binding.banner;
            Intrinsics.checkNotNullExpressionValue(banner2, "banner");
            banner2.setVisibility(0);
            if (banner.getIcon() != null) {
                RdsInfoBannerView rdsInfoBannerView = binding.banner;
                Context contextRequireContext2 = requireContext();
                ServerToBentoAssetMapper2 icon = banner.getIcon();
                Intrinsics.checkNotNull(icon);
                rdsInfoBannerView.setIcon(ContextCompat.getDrawable(contextRequireContext2, icon.getResourceId()));
            }
            RdsInfoBannerView rdsInfoBannerView2 = binding.banner;
            RichText info = banner.getInfo();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            rdsInfoBannerView2.setText(RichTexts.toSpannableString$default(info, contextRequireContext3, null, false, null, 14, null));
            binding.banner.setCtaText(banner.getActionText());
            binding.banner.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$2$4$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EventLogger eventLogger2 = this.this$0.getEventLogger();
                    Component component2 = new Component(Component.ComponentType.LINK_DEBIT_CARD_BANNER, null, null, 6, null);
                    Screen.Name name2 = Screen.Name.POST_TRANSFER_CONFIRMATION;
                    String loggingIdentifier2 = ((UiPostTransferPage.Confirmation) TransferConfirmationFragment.INSTANCE.getArgs((Fragment) this.this$0)).getLoggingIdentifier();
                    if (loggingIdentifier2 == null) {
                        loggingIdentifier2 = "";
                    }
                    EventLogger.DefaultImpls.logTap$default(eventLogger2, null, new Screen(name2, null, loggingIdentifier2, null, 10, null), component2, null, null, false, 57, null);
                    GenericAction action = banner.getAction();
                    if (action == null || !(action instanceof GenericAction.DeeplinkAction)) {
                        return;
                    }
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext4 = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext4, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
                }
            });
        }
        binding.primaryBtn.setText(((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getPrimaryButton().getTitle());
        RdsButton primaryBtn = binding.primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new TransferConfirmationFragment4(getCallbacks()));
        GenericButton detailButton = ((UiPostTransferPage.Confirmation) companion.getArgs((Fragment) this)).getDetailButton();
        if (detailButton != null) {
            ClientComponentButtonView detailBtn = binding.detailBtn;
            Intrinsics.checkNotNullExpressionValue(detailBtn, "detailBtn");
            detailBtn.setVisibility(0);
            binding.detailBtn.bind(ServerDrivenButton.INSTANCE.from(detailButton));
        }
        Survey survey = getSurvey();
        if (survey != null) {
            getUserLeapManager().presentSurveyIfNecessary(this, survey);
        }
    }

    /* compiled from: TransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$1", m3645f = "TransferConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$1 */
    static final class C395011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C395011(Continuation<? super C395011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C395011 c395011 = TransferConfirmationFragment.this.new C395011(continuation);
            c395011.L$0 = obj;
            return c395011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C395011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TransferConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$1$1", m3645f = "TransferConfirmationFragment.kt", m3646l = {80}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TransferConfirmationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransferConfirmationFragment transferConfirmationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = transferConfirmationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final TransferConfirmationFragment transferConfirmationFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<TransferConfirmationEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<TransferConfirmationEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<TransferConfirmationEvent> eventConsumerInvoke;
                            final TransferConfirmationFragment transferConfirmationFragment2 = transferConfirmationFragment;
                            if ((event.getData() instanceof TransferConfirmationEvent.LaunchNgGoldEarningsBottomSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m25625invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25625invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        Navigator.DefaultImpls.createDialogFragment$default(transferConfirmationFragment2.getNavigator(), ((TransferConfirmationEvent.LaunchNgGoldEarningsBottomSheet) event.getData()).getKey(), null, 2, null).show(transferConfirmationFragment2.getChildFragmentManager(), "accountSelectionDialog");
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(TransferConfirmationFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$6$lambda$3$lambda$2(TransferConfirmationFragment transferConfirmationFragment, GenericAlert genericAlert, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(transferConfirmationFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(genericAlert, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(transferConfirmationFragment.getParentFragmentManager(), "transfer-confirmation-additional-learn-more");
        return true;
    }

    private final Survey getSurvey() {
        Survey next;
        Iterator<Survey> it = Survey.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getServerValue(), ((UiPostTransferPage.Confirmation) INSTANCE.getArgs((Fragment) this)).getSurveyName())) {
                break;
            }
        }
        return next;
    }

    /* compiled from: TransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Confirmation;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferConfirmationFragment, UiPostTransferPage.Confirmation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.Confirmation getArgs(TransferConfirmationFragment transferConfirmationFragment) {
            return (UiPostTransferPage.Confirmation) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferConfirmationFragment newInstance(UiPostTransferPage.Confirmation confirmation) {
            return (TransferConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, confirmation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferConfirmationFragment transferConfirmationFragment, UiPostTransferPage.Confirmation confirmation) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferConfirmationFragment, confirmation);
        }
    }
}
