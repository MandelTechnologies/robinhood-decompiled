package com.robinhood.android.transfers.p271ui.max.i18n;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.banking.util.ShowFxExchangeRateBottomSheet;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferFragment;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.CreateTransferScreen;
import com.robinhood.android.transfers.p271ui.max.i18n.logging.UKTransferFragmentErrorDialogLogger;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternationalTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003IJKB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u0002012\u0006\u00105\u001a\u0002062\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00107\u001a\u000208H\u0016J\r\u00109\u001a\u000201H\u0017¢\u0006\u0002\u0010:J\u001a\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u0002012\b\u0010C\u001a\u0004\u0018\u00010DJ\u0016\u0010E\u001a\u0002012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "sessionId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getSessionId", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "duxo$delegate", "callbacks", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "externalAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferFragment extends GenericComposeFragment implements AutoLoggableFragment, ClientComponentAlertFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InternationalTransferFragment.eventScreen_delegate$lambda$0();
        }
    });
    public MicrogramManager microgramManager;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternationalTransferFragment.class, "sessionId", "getSessionId()Ljava/util/UUID;", 0)), Reflection.property1(new PropertyReference1Impl(InternationalTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternationalTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Callbacks;", "", "onTransferCreated", "", "createTransferResponse", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "onShowAccountSelection", "key", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onShowAccountSelection(TransferAccountSelectionKey key);

        void onTransferCreated(ApiCreateTransferResponse createTransferResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(InternationalTransferFragment internationalTransferFragment, int i, Composer composer, int i2) {
        internationalTransferFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<InternationalTransferEvent> event) {
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke2;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke3;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke4;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof InternationalTransferEvent.Exit) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19848invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19848invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getUserLeapManager().setPendingSurvey(Survey.UK_ABANDON_POST_APPROVAL_DEPOSIT_FLOW);
                    this.requireActivity().finish();
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.NavigateAfterTransferCreation) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19849invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19849invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onTransferCreated(((InternationalTransferEvent.NavigateAfterTransferCreation) event.getData()).getResponse());
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.SelectAccount) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19850invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19850invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onShowAccountSelection(((InternationalTransferEvent.SelectAccount) event.getData()).getKey());
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowTransferCreationAlertError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19851invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19851invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransferEvent.ShowTransferCreationAlertError showTransferCreationAlertError = (InternationalTransferEvent.ShowTransferCreationAlertError) event.getData();
                    GenericAlert alert = showTransferCreationAlertError.getAlert();
                    String errorCode = showTransferCreationAlertError.getErrorCode();
                    UKTransferFragmentErrorDialogLogger.logServerErrorAlertDialogAppear(this, showTransferCreationAlertError.getEventContext(), errorCode);
                    Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(alert, false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(this.getChildFragmentManager(), alert.getTitle());
                }
            });
        }
        if (!(event.getData() instanceof InternationalTransferEvent.ShowTransferCreationGenericError) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                m19852invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19852invoke(Object it) throws Resources.NotFoundException {
                CharSequence text;
                Intrinsics.checkNotNullParameter(it, "it");
                InternationalTransferEvent.ShowTransferCreationGenericError showTransferCreationGenericError = (InternationalTransferEvent.ShowTransferCreationGenericError) event.getData();
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(showTransferCreationGenericError.getId()).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                StringResource title = showTransferCreationGenericError.getTitle();
                CharSequence text2 = null;
                if (title != null) {
                    Resources resources = this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    text = title.getText(resources);
                } else {
                    text = null;
                }
                RhDialogFragment.Builder title2 = theme.setTitle(text);
                StringResource detail = showTransferCreationGenericError.getDetail();
                Resources resources2 = this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                RhDialogFragment.Builder message = title2.setMessage(detail.getText(resources2));
                StringResource positiveButton = showTransferCreationGenericError.getPositiveButton();
                Resources resources3 = this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                RhDialogFragment.Builder positiveButton2 = message.setPositiveButton(positiveButton.getText(resources3));
                StringResource negativeButton = showTransferCreationGenericError.getNegativeButton();
                if (negativeButton != null) {
                    Resources resources4 = this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    text2 = negativeButton.getText(resources4);
                }
                RhDialogFragment.Builder negativeButton2 = positiveButton2.setNegativeButton(text2);
                FragmentManager childFragmentManager = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton2, childFragmentManager, "error", false, 4, null);
            }
        });
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public InternationalTransferFragment() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
        this.duxo = DuxosKt.duxo(this, InternationalTransferDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof InternationalTransferFragment.Callbacks)) {
                    parentFragment = null;
                }
                InternationalTransferFragment.Callbacks callbacks = (InternationalTransferFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InternationalTransferFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null);
    }

    private final UUID getSessionId() {
        return (UUID) this.sessionId.getValue(this, $$delegatedProperties[0]);
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

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
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
    public final InternationalTransferDuxo getDuxo() {
        return (InternationalTransferDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        InternationalTransferDuxo duxo = getDuxo();
        UUID sessionId = getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "<get-sessionId>(...)");
        duxo.setSessionId(sessionId);
        super.onCreate(savedInstanceState);
    }

    /* compiled from: InternationalTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$onViewCreated$1", m3645f = "InternationalTransferFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$onViewCreated$1 */
    static final class C307581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307581(Continuation<? super C307581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferFragment.this.new C307581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(InternationalTransferFragment.this.getDuxo().getEventFlow());
                final InternationalTransferFragment internationalTransferFragment = InternationalTransferFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment.onViewCreated.1.1
                    public final Object emit(Event<InternationalTransferEvent> event, Continuation<? super Unit> continuation) {
                        internationalTransferFragment.handleEvent(event);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<InternationalTransferEvent>) obj2, (Continuation<? super Unit>) continuation);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C307581(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C307592(null), 1, null);
    }

    /* compiled from: InternationalTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$onViewCreated$2", m3645f = "InternationalTransferFragment.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$onViewCreated$2 */
    static final class C307592 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307592(Continuation<? super C307592> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferFragment.this.new C307592(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(InternationalTransferFragment.this.getDuxo().getStateFlow());
                final InternationalTransferFragment internationalTransferFragment = InternationalTransferFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InternationalTransferViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InternationalTransferViewState internationalTransferViewState, Continuation<? super Unit> continuation) {
                        RhToolbar rhToolbarRequireToolbar = internationalTransferFragment.requireToolbar();
                        Integer toolbarTitleRes = internationalTransferViewState.getToolbarTitleRes();
                        rhToolbarRequireToolbar.setTitle(toolbarTitleRes != null ? internationalTransferFragment.getString(toolbarTitleRes.intValue()) : null);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return getDuxo().onBackPressed();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(996488359);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996488359, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment.ComposeContent (InternationalTransferFragment.kt:100)");
            }
            Screen eventScreen = getEventScreen();
            Navigator navigator = getNavigator();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternationalTransferFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CreateTransferScreen.CreateTransferScreen(eventScreen, navigator, (Function0) objRememberedValue, null, null, composerStartRestartGroup, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternationalTransferFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(InternationalTransferFragment internationalTransferFragment) {
        ShowFxExchangeRateBottomSheet.showFxExchangeRateBottomSheet(internationalTransferFragment, internationalTransferFragment.getEventScreen());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_uk_withdrawal_no_external_account_selected) {
            BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
            Navigator.DefaultImpls.startActivity$default(baseActivityRequireBaseActivity.getNavigator(), baseActivityRequireBaseActivity, new UkTransfer(TransferDirectionV2.DEPOSIT, null, null, null, null, 30, null), null, false, null, null, 60, null);
            baseActivityRequireBaseActivity.finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!(button.getTypedAction() instanceof GenericAction.DismissAction)) {
            return false;
        }
        UKTransferFragmentErrorDialogLogger.logServerErrorAlertDialogDismiss(this);
        return true;
    }

    public final void externalAccountSelected(TransferAccount account) {
        getDuxo().externalAccountSelected(account);
    }

    /* compiled from: InternationalTransferFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Args;", "Landroid/os/Parcelable;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "amount", "Ljava/math/BigDecimal;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getAmount", "()Ljava/math/BigDecimal;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final TransferDirection transferDirection;

        /* compiled from: InternationalTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(TransferDirection.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.transferDirection.name());
            dest.writeSerializable(this.amount);
            dest.writeString(this.entryPoint.name());
        }

        public Args(TransferDirection transferDirection, BigDecimal bigDecimal, MAXTransferContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.transferDirection = transferDirection;
            this.amount = bigDecimal;
            this.entryPoint = entryPoint;
        }

        public /* synthetic */ Args(TransferDirection transferDirection, BigDecimal bigDecimal, MAXTransferContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferDirection, (i & 2) != 0 ? null : bigDecimal, entryPoint);
        }

        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: InternationalTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternationalTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternationalTransferFragment internationalTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internationalTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternationalTransferFragment newInstance(Args args) {
            return (InternationalTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternationalTransferFragment internationalTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internationalTransferFragment, args);
        }
    }
}
