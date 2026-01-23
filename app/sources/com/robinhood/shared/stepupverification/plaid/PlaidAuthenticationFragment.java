package com.robinhood.shared.stepupverification.plaid;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.security.contracts.PlaidAuthenticationFragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.pathfinder.contexts.PlaidAuthenticationContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.compose.LocalActivity3;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PlaidAuthenticationFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001e\u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;", "getDuxo", "()Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "linkAccountToPlaid", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "logPlaidEventData", "event", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "linkEventName", "", "errorMessage", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PlaidAuthenticationFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    private final ActivityResultLauncher<LinkTokenConfiguration> linkAccountToPlaid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(Screen.Name.PLAID_AUTHENTICATION, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PlaidAuthenticationDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PlaidAuthenticationFragment plaidAuthenticationFragment, int i, Composer composer, int i2) {
        plaidAuthenticationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PlaidAuthenticationFragment() {
        ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new OpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment$linkAccountToPlaid$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LinkResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof LinkSuccess) {
                    PlaidAuthenticationFragment.logPlaidEventData$default(this.this$0, PlaidEventData.Event.ON_SUCCESS, null, null, 6, null);
                    PlaidAuthenticationDuxo duxo = this.this$0.getDuxo();
                    LinkSuccess linkSuccess = (LinkSuccess) it;
                    String publicToken = linkSuccess.getPublicToken();
                    LinkInstitution institution = linkSuccess.getMetadata().getInstitution();
                    String id = institution != null ? institution.getId() : null;
                    LinkAccount linkAccount = (LinkAccount) CollectionsKt.firstOrNull((List) linkSuccess.getMetadata().getAccounts());
                    duxo.onLinkSuccess(publicToken, id, linkAccount != null ? linkAccount.getId() : null);
                    return;
                }
                if (it instanceof LinkExit) {
                    PlaidAuthenticationFragment plaidAuthenticationFragment = this.this$0;
                    PlaidEventData.Event event = PlaidEventData.Event.ON_EXIT;
                    LinkError error = ((LinkExit) it).getError();
                    PlaidAuthenticationFragment.logPlaidEventData$default(plaidAuthenticationFragment, event, null, error != null ? error.getErrorMessage() : null, 2, null);
                    this.this$0.getDuxo().showFallbackDialog();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.linkAccountToPlaid = activityResultLauncherRegisterForActivityResult;
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        String string2 = ((PlaidAuthenticationFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, null, null, null, null, null, null, null, null, null, string2, null, 3071, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidAuthenticationDuxo getDuxo() {
        return (PlaidAuthenticationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1655523143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1655523143, i2, -1, "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment.ComposeContent (PlaidAuthenticationFragment.kt:62)");
            }
            CompositionLocal6<FragmentActivity> localActivity = LocalActivity3.getLocalActivity();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            CompositionLocal3.CompositionLocalProvider(localActivity.provides(fragmentActivityRequireActivity), ComposableLambda3.rememberComposableLambda(-321586553, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-321586553, i3, -1, "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment.ComposeContent.<anonymous> (PlaidAuthenticationFragment.kt:64)");
                    }
                    final PlaidAuthenticationFragment plaidAuthenticationFragment = PlaidAuthenticationFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1903192036, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1903192036, i4, -1, "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment.ComposeContent.<anonymous>.<anonymous> (PlaidAuthenticationFragment.kt:65)");
                            }
                            PlaidAuthenticationContext context = ((UserViewStatePageContext.PlaidAuthentication) ((PlaidAuthenticationFragmentKey) PlaidAuthenticationFragment.INSTANCE.getArgs((Fragment) plaidAuthenticationFragment)).getUserViewState().getTypeContext()).getContext();
                            PlaidAuthenticationDuxo duxo = plaidAuthenticationFragment.getDuxo();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(duxo);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlaidAuthenticationFragment2(duxo);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            PlaidAuthenticationDuxo duxo2 = plaidAuthenticationFragment.getDuxo();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(duxo2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new PlaidAuthenticationFragment3(duxo2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            PlaidAuthenticationComposable.PlaidAuthenticationComposable(context, function0, (Function0) ((KFunction) objRememberedValue2), plaidAuthenticationFragment.getActivityErrorHandler(), null, null, composer3, ActivityErrorHandler.$stable << 9, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaidAuthenticationFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(UserInteractionEventData.EventType.INITIALIZE_PLAID, getEventScreen(), null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.ACCOUNT_SECURITY, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getScreenEventContext().getChallenge_context(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -4097, -1, -1, -1, 16383, null), null, null, 108, null), false, false, 6, null);
            Plaid.setLinkEventListener(new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlaidAuthenticationFragment.onCreate$lambda$1(this.f$0, (LinkEvent) obj);
                }
            });
            this.linkAccountToPlaid.launch(PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlaidAuthenticationFragment.onCreate$lambda$2(this.f$0, (LinkTokenConfiguration.Builder) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(PlaidAuthenticationFragment plaidAuthenticationFragment, LinkEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        logPlaidEventData$default(plaidAuthenticationFragment, PlaidEventData.Event.ON_EVENT, event.getEventName().toString(), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(PlaidAuthenticationFragment plaidAuthenticationFragment, LinkTokenConfiguration.Builder linkTokenConfiguration) {
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
        linkTokenConfiguration.setToken(((UserViewStatePageContext.PlaidAuthentication) ((PlaidAuthenticationFragmentKey) INSTANCE.getArgs((Fragment) plaidAuthenticationFragment)).getUserViewState().getTypeContext()).getContext().getLinkToken());
        return Unit.INSTANCE;
    }

    static /* synthetic */ void logPlaidEventData$default(PlaidAuthenticationFragment plaidAuthenticationFragment, PlaidEventData.Event event, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        plaidAuthenticationFragment.logPlaidEventData(event, str, str2);
    }

    private final void logPlaidEventData(PlaidEventData.Event event, String linkEventName, String errorMessage) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.PLAID_IAV;
        Screen screen = new Screen(Screen.Name.PLAID_AUTHENTICATION, null, null, null, 14, null);
        String string2 = ((PlaidAuthenticationFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.ACCOUNT_SECURITY, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, linkEventName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, null, null, null, null, null, null, null, String.valueOf(errorMessage), null, string2, null, 2815, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -16385, -4097, -1, -1, -1, 16383, null), null, null, 108, null), false, false, 6, null);
    }

    /* compiled from: PlaidAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationFragment;", "Lcom/robinhood/android/security/contracts/PlaidAuthenticationFragmentKey;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PlaidAuthenticationFragment, PlaidAuthenticationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PlaidAuthenticationFragmentKey plaidAuthenticationFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, plaidAuthenticationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PlaidAuthenticationFragmentKey getArgs(PlaidAuthenticationFragment plaidAuthenticationFragment) {
            return (PlaidAuthenticationFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, plaidAuthenticationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PlaidAuthenticationFragment newInstance(PlaidAuthenticationFragmentKey plaidAuthenticationFragmentKey) {
            return (PlaidAuthenticationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, plaidAuthenticationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PlaidAuthenticationFragment plaidAuthenticationFragment, PlaidAuthenticationFragmentKey plaidAuthenticationFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, plaidAuthenticationFragment, plaidAuthenticationFragmentKey);
        }
    }
}
