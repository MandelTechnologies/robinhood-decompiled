package com.robinhood.shared.posttransfer;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.TransferLottieAsset;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.api.ApiGenericButton;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferConfirmationWithDisclaimerBinding;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002EFB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u001a\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u000208H\u0016J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020DH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\"\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u0006G"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "getGoldDepositBoostTransferIdPref$annotations", "getGoldDepositBoostTransferIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldDepositBoostTransferIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "goldDepositBoostTransferAmountPref", "getGoldDepositBoostTransferAmountPref$annotations", "getGoldDepositBoostTransferAmountPref", "setGoldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "getGoldDepositBoostTransferTimestampPref$annotations", "getGoldDepositBoostTransferTimestampPref", "setGoldDepositBoostTransferTimestampPref", "binding", "Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationWithDisclaimerBinding;", "getBinding", "()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationWithDisclaimerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "getLottieUrlForRhc", "", "isDay", "", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferConfirmationWithDisclaimerFragment extends BaseFragment implements AutoLoggableFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    public StringPreference goldDepositBoostTransferAmountPref;
    public StringPreference goldDepositBoostTransferIdPref;
    public StringPreference goldDepositBoostTransferTimestampPref;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferConfirmationWithDisclaimerFragment.class, "binding", "getBinding()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationWithDisclaimerBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferConfirmationWithDisclaimerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Callbacks;", "", "onPrimaryButtonClicked", "", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onSecondaryButtonClicked", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPrimaryButtonClicked(ApiGenericAction action);

        void onSecondaryButtonClicked(ApiGenericAction action);
    }

    /* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferLottieAsset.values().length];
            try {
                iArr[TransferLottieAsset.CHECKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferLottieAsset.HOURGLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferLottieAsset.BLOCKS_X_MARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferLottieAsset.RH_PLAID_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferLottieAsset.TRANSFERS_MOTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferLottieAsset.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public TransferConfirmationWithDisclaimerFragment() {
        super(C39496R.layout.fragment_transfer_confirmation_with_disclaimer);
        this.binding = ViewBinding5.viewBinding(this, TransferConfirmationWithDisclaimerFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferConfirmationWithDisclaimerFragment.eventScreen_delegate$lambda$0(this.f$0);
            }
        });
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

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
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

    private final FragmentTransferConfirmationWithDisclaimerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferConfirmationWithDisclaimerBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment) {
        Screen.Name name = Screen.Name.POST_TRANSFER_CONFIRMATION;
        String loggingIdentifier = ((UiPostTransferPage.ConfirmationWithDisclaimer) INSTANCE.getArgs((Fragment) transferConfirmationWithDisclaimerFragment)).getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        return new Screen(name, null, loggingIdentifier, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getAppType() == AppType.RHC) {
            ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            putAchromaticOverlay(scarletContextWrapper);
            setScarletContextWrapper(scarletContextWrapper);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        StringPreference goldDepositBoostTransferIdPref = getGoldDepositBoostTransferIdPref();
        Companion companion = INSTANCE;
        goldDepositBoostTransferIdPref.set(((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getTransferId());
        getGoldDepositBoostTransferAmountPref().set(((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getAmount());
        getGoldDepositBoostTransferTimestampPref().set(Instant.now().toString());
        final FragmentTransferConfirmationWithDisclaimerBinding binding = getBinding();
        AppType appType = getAppType();
        AppType appType2 = AppType.RHC;
        if (appType != appType2) {
            Observable observableDistinctUntilChanged = requireBaseActivity().getDayNightStyleChanges().map(new Function() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$onViewCreated$1$1

                /* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$onViewCreated$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[DayNightOverlay.values().length];
                        try {
                            iArr[DayNightOverlay.DAY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[TransferLottieAsset.values().length];
                        try {
                            iArr2[TransferLottieAsset.BLOCKS_X_MARK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr2[TransferLottieAsset.CHECKMARK.ordinal()] = 2;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[TransferLottieAsset.HOURGLASS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[TransferLottieAsset.RH_PLAID_CONNECTION.ordinal()] = 4;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr2[TransferLottieAsset.TRANSFERS_MOTION.ordinal()] = 5;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr2[TransferLottieAsset.UNKNOWN.ordinal()] = 6;
                        } catch (NoSuchFieldError unused8) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // io.reactivex.functions.Function
                public final Tuples2<Integer, Boolean> apply(DayNightOverlay dayNightOverlay) {
                    int i;
                    Integer numValueOf;
                    int i2;
                    int i3;
                    Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
                    TransferConfirmationWithDisclaimerFragment.Companion companion2 = TransferConfirmationWithDisclaimerFragment.INSTANCE;
                    switch (WhenMappings.$EnumSwitchMapping$1[((UiPostTransferPage.ConfirmationWithDisclaimer) companion2.getArgs((Fragment) this.this$0)).getAsset().ordinal()]) {
                        case 1:
                            int i4 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
                            if (i4 == 1) {
                                i = C39496R.drawable.ic_blocks_x_mark_day;
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = C39496R.drawable.ic_blocks_x_mark_night;
                            }
                            numValueOf = Integer.valueOf(i);
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(C39496R.raw.lottie_transfers_checkmark);
                            break;
                        case 3:
                            numValueOf = Integer.valueOf(C39496R.raw.lottie_acats_eligible_no);
                            break;
                        case 4:
                            int i5 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
                            if (i5 == 1) {
                                i2 = C39496R.drawable.ic_rh_plaid_connection_day;
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = C39496R.drawable.ic_rh_plaid_connection_night;
                            }
                            numValueOf = Integer.valueOf(i2);
                            break;
                        case 5:
                            int i6 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
                            if (i6 == 1) {
                                i3 = C39496R.raw.lottie_transfers_motion_light;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = C39496R.raw.lottie_transfers_motion_dark;
                            }
                            numValueOf = Integer.valueOf(i3);
                            break;
                        case 6:
                            numValueOf = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    return Tuples4.m3642to(numValueOf, Boolean.valueOf(((UiPostTransferPage.ConfirmationWithDisclaimer) companion2.getArgs((Fragment) this.this$0)).getAsset().getIsLottieAsset()));
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferConfirmationWithDisclaimerFragment.onViewCreated$lambda$11$lambda$3(binding, (Tuples2) obj);
                }
            });
        }
        binding.title.setText(((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getTitle());
        if (getAppType() == appType2) {
            RhTextView title = binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            ViewsKt.setMarginTop(title, getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xlarge));
        }
        binding.subtitle.setText(((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getSubtitle());
        RhTextView disclaimer = binding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        TextViewsKt.setVisibilityText(disclaimer, ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getDisclaimer());
        RdsButton rdsButton = binding.primaryBtn;
        final ApiGenericButton primaryButton = ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getPrimaryButton();
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreen, new Component(componentType, primaryButton.getLogging_identifier(), null, 4, null), null, null, 25, null);
        rdsButton.setText(primaryButton.getTitle());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferConfirmationWithDisclaimerFragment.onViewCreated$lambda$11$lambda$5$lambda$4(this.f$0, primaryButton);
            }
        });
        RdsButton rdsButton2 = binding.secondaryBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ApiGenericButton secondaryButton = ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getSecondaryButton();
        TextViewsKt.setVisibilityText(rdsButton2, secondaryButton != null ? secondaryButton.getTitle() : null);
        final ApiGenericButton secondaryButton2 = ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getSecondaryButton();
        if (secondaryButton2 != null) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(componentType, secondaryButton2.getLogging_identifier(), null, 4, null), null, null, 25, null);
            OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferConfirmationWithDisclaimerFragment.onViewCreated$lambda$11$lambda$7$lambda$6(this.f$0, secondaryButton2);
                }
            });
        }
        final GenericAlert additionalDetailAlert = ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getAdditionalDetailAlert();
        if (additionalDetailAlert != null) {
            binding.additionalDetailTxt.onLinkClick(new Function1() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TransferConfirmationWithDisclaimerFragment.onViewCreated$lambda$11$lambda$9$lambda$8(this.f$0, additionalDetailAlert, (String) obj));
                }
            });
        }
        RhTextView rhTextView = binding.additionalDetailTxt;
        String additionalDetailMarkdown = ((UiPostTransferPage.ConfirmationWithDisclaimer) companion.getArgs((Fragment) this)).getAdditionalDetailMarkdown();
        rhTextView.setText(additionalDetailMarkdown != null ? getMarkwon().toMarkdown(additionalDetailMarkdown) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$3(FragmentTransferConfirmationWithDisclaimerBinding fragmentTransferConfirmationWithDisclaimerBinding, Tuples2 tuples2) {
        Integer num = (Integer) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        LottieAnimationView lottie = fragmentTransferConfirmationWithDisclaimerBinding.lottie;
        Intrinsics.checkNotNullExpressionValue(lottie, "lottie");
        lottie.setVisibility(zBooleanValue ? 0 : 8);
        ImageView image = fragmentTransferConfirmationWithDisclaimerBinding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        image.setVisibility(zBooleanValue ? 8 : 0);
        if (zBooleanValue) {
            if (num != null) {
                fragmentTransferConfirmationWithDisclaimerBinding.lottie.setAnimation(num.intValue());
            }
        } else if (num != null) {
            fragmentTransferConfirmationWithDisclaimerBinding.image.setImageResource(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$5$lambda$4(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, ApiGenericButton apiGenericButton) {
        EventLogger.DefaultImpls.logTap$default(transferConfirmationWithDisclaimerFragment.getEventLogger(), null, transferConfirmationWithDisclaimerFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, apiGenericButton.getLogging_identifier(), null, 4, null), null, null, false, 57, null);
        transferConfirmationWithDisclaimerFragment.getCallbacks().onPrimaryButtonClicked(apiGenericButton.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$7$lambda$6(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, ApiGenericButton apiGenericButton) {
        EventLogger.DefaultImpls.logTap$default(transferConfirmationWithDisclaimerFragment.getEventLogger(), null, transferConfirmationWithDisclaimerFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, apiGenericButton.getLogging_identifier(), null, 4, null), null, null, false, 57, null);
        transferConfirmationWithDisclaimerFragment.getCallbacks().onSecondaryButtonClicked(apiGenericButton.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$11$lambda$9$lambda$8(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, GenericAlert genericAlert, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(transferConfirmationWithDisclaimerFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(genericAlert, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(transferConfirmationWithDisclaimerFragment.getParentFragmentManager(), "transfer-confirmation-disclaimer-additional-learn-more");
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        ScarletManager scarletManager;
        super.onStart();
        if (getAppType() == AppType.RHC) {
            ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                scarletManager = getScarletManager();
            }
            Observable<R> map = DayNightChanges.isDayChanges(scarletManager).map(new Function() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment.onStart.1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(DayNightOverlay it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(DayNightChanges.isDay(it));
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferConfirmationWithDisclaimerFragment.onStart$lambda$13(this.f$0, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        String lottieUrlForRhc = transferConfirmationWithDisclaimerFragment.getLottieUrlForRhc(bool.booleanValue());
        LottieAnimationView lottieAnimationView = transferConfirmationWithDisclaimerFragment.getBinding().lottie;
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setAnimationFromUrl(lottieUrlForRhc);
        return Unit.INSTANCE;
    }

    private final String getLottieUrlForRhc(boolean isDay) {
        LottieUrl lottieUrl;
        HttpUrl url;
        switch (WhenMappings.$EnumSwitchMapping$0[((UiPostTransferPage.ConfirmationWithDisclaimer) INSTANCE.getArgs((Fragment) this)).getAsset().ordinal()]) {
            case 1:
                if (isDay) {
                    lottieUrl = LottieUrl.RHC_TRANSFER_COMPLETED_REBRAND_LIGHT;
                    break;
                } else {
                    lottieUrl = LottieUrl.RHC_TRANSFER_COMPLETED_REBRAND_DARK;
                    break;
                }
            case 2:
                if (isDay) {
                    lottieUrl = LottieUrl.RHC_TRANSFER_STAY_TUNED_REBRAND_LIGHT;
                    break;
                } else {
                    lottieUrl = LottieUrl.RHC_TRANSFER_STAY_TUNED_REBRAND_DARK;
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 6:
                lottieUrl = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (lottieUrl == null || (url = lottieUrl.getUrl()) == null) {
            return null;
        }
        return url.getUrl();
    }

    /* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$ConfirmationWithDisclaimer;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferConfirmationWithDisclaimerFragment, UiPostTransferPage.ConfirmationWithDisclaimer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.ConfirmationWithDisclaimer getArgs(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment) {
            return (UiPostTransferPage.ConfirmationWithDisclaimer) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferConfirmationWithDisclaimerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferConfirmationWithDisclaimerFragment newInstance(UiPostTransferPage.ConfirmationWithDisclaimer confirmationWithDisclaimer) {
            return (TransferConfirmationWithDisclaimerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, confirmationWithDisclaimer);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, UiPostTransferPage.ConfirmationWithDisclaimer confirmationWithDisclaimer) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferConfirmationWithDisclaimerFragment, confirmationWithDisclaimer);
        }
    }
}
