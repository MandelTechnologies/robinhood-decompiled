package com.robinhood.shared.accountactivityexporter;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInputState;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: AccountActivityExporterRequestFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\r\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010!J?\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010'2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0003¢\u0006\u0002\u0010+J\r\u0010,\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010!J\r\u0010-\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010!J\u0018\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u000204H\u0002J(\u00105\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00067²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "getDuxo", "()Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "DatePickerRow", AnnotatedPrivateKey.LABEL, "", "dateValue", "calendarConstraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "datePickerSelection", "Landroidx/core/util/Pair;", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/datepicker/CalendarConstraints;Landroidx/core/util/Pair;Landroidx/compose/runtime/Composer;I)V", "RequestSuccessDialog", "RequestFailureDialog", "onAccountSelected", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "launchAccountSelector", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "launchCalendarPicker", "Companion", "feature-account-activity-exporter_externalDebug", "viewState", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AccountActivityExporterRequestFragment extends GenericComposeFragment implements AutoLoggableFragment, LocalAccountSwitcherCallbacks {
    public static final String DATE_PICKER_FRAGMENT = "date_picker_fragment";
    public AppType appType;
    public EventLogger eventLogger;
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(Screen.Name.GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountActivityExporterRequestDuxo.class);

    /* compiled from: AccountActivityExporterRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, int i, Composer composer, int i2) {
        accountActivityExporterRequestFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerRow$lambda$8(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, String str, String str2, CalendarConstraints calendarConstraints, Pair pair, int i, Composer composer, int i2) {
        accountActivityExporterRequestFragment.DatePickerRow(str, str2, calendarConstraints, pair, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestFailureDialog$lambda$18(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, int i, Composer composer, int i2) {
        accountActivityExporterRequestFragment.RequestFailureDialog(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestSuccessDialog$lambda$13(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, int i, Composer composer, int i2) {
        accountActivityExporterRequestFragment.RequestSuccessDialog(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountActivityExporterRequestDuxo getDuxo() {
        return (AccountActivityExporterRequestDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2025398586);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2025398586, i2, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.ComposeContent (AccountActivityExporterRequestFragment.kt:74)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(-787851948);
            if (ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getRequestCompleted()) {
                RequestSuccessDialog(composerStartRestartGroup, i2 & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-787849167);
            if (ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getRequestFailed()) {
                RequestFailureDialog(composerStartRestartGroup, i2 & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-495176591, true, new C373171(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-133523746, true, new C373182(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountActivityExporterRequestFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountActivityExporterRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$ComposeContent$1 */
    static final class C373171 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<AccountActivityExporterRequestViewState> $viewState$delegate;

        C373171(SnapshotState4<AccountActivityExporterRequestViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-495176591, i, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.ComposeContent.<anonymous> (AccountActivityExporterRequestFragment.kt:84)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(AccountActivityExporterRequestFragment.this);
            final AccountActivityExporterRequestFragment accountActivityExporterRequestFragment = AccountActivityExporterRequestFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.C373171.invoke$lambda$1$lambda$0(accountActivityExporterRequestFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_button, composer, 0);
            boolean showLoadingIndicatorOnSubmitButton = AccountActivityExporterRequestFragment.ComposeContent$lambda$1(this.$viewState$delegate).getShowLoadingIndicatorOnSubmitButton();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(AccountActivityExporterRequestFragment.this);
            final AccountActivityExporterRequestFragment accountActivityExporterRequestFragment2 = AccountActivityExporterRequestFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.C373171.invoke$lambda$3$lambda$2(accountActivityExporterRequestFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, function0, strStringResource, showLoadingIndicatorOnSubmitButton, null, false, (Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer, 0), false, null, false, composer, 0, 0, 58942);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
            EventLogger.DefaultImpls.logTap$default(accountActivityExporterRequestFragment.getEventLogger(), null, accountActivityExporterRequestFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "account_activity_generate_report_button", null, 4, null), null, null, false, 57, null);
            accountActivityExporterRequestFragment.getDuxo().submitRequest();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
            accountActivityExporterRequestFragment.getParentFragmentManager().popBackStack();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountActivityExporterRequestViewState ComposeContent$lambda$1(SnapshotState4<AccountActivityExporterRequestViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AccountActivityExporterRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$ComposeContent$2 */
    static final class C373182 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<AccountActivityExporterRequestViewState> $viewState$delegate;

        C373182(SnapshotState4<AccountActivityExporterRequestViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) throws Resources.NotFoundException {
            final AccountActivityExporterRequestFragment accountActivityExporterRequestFragment;
            final SnapshotState4<AccountActivityExporterRequestViewState> snapshotState4;
            CharSequence text;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-133523746, i, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.ComposeContent.<anonymous> (AccountActivityExporterRequestFragment.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            AccountActivityExporterRequestFragment accountActivityExporterRequestFragment2 = AccountActivityExporterRequestFragment.this;
            SnapshotState4<AccountActivityExporterRequestViewState> snapshotState42 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_title, composer, 0), PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            composer.startReplaceGroup(877570940);
            if (AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState42).getShouldShowAccountSelector()) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_account_selector_label, composer, 0), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 2, null);
                StringResource selectedAccountType = AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState42).getSelectedAccountType();
                if (selectedAccountType != null) {
                    Resources resources = accountActivityExporterRequestFragment2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    text = selectedAccountType.getText(resources);
                } else {
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                composer.startReplaceGroup(-1633490746);
                snapshotState4 = snapshotState42;
                accountActivityExporterRequestFragment = accountActivityExporterRequestFragment2;
                boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(accountActivityExporterRequestFragment);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$ComposeContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountActivityExporterRequestFragment.C373182.invoke$lambda$2$lambda$1$lambda$0(accountActivityExporterRequestFragment, snapshotState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoChip.BentoDropdownChip((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, false, null, strValueOf, composer, 0, 12);
            } else {
                accountActivityExporterRequestFragment = accountActivityExporterRequestFragment2;
                snapshotState4 = snapshotState42;
            }
            composer.endReplaceGroup();
            AccountActivityExporterRequestFragment accountActivityExporterRequestFragment3 = accountActivityExporterRequestFragment;
            accountActivityExporterRequestFragment3.DatePickerRow(StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_start_date_label, composer, 0), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getStartDate(), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getCalendarConstraints(), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getDatePickerSelection(), composer, 0);
            accountActivityExporterRequestFragment3.DatePickerRow(StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_end_date_label, composer, 0), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getEndDate(), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getCalendarConstraints(), AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getDatePickerSelection(), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, SnapshotState4 snapshotState4) {
            AccountSwitcherData accountSelectorArgs = AccountActivityExporterRequestFragment.ComposeContent$lambda$1(snapshotState4).getAccountSelectorArgs();
            if (accountSelectorArgs != null) {
                accountActivityExporterRequestFragment.launchAccountSelector(accountSelectorArgs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DatePickerRow(final String str, final String str2, final CalendarConstraints calendarConstraints, final Pair<Long, Long> pair, Composer composer, final int i) {
        String str3;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-917387399);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(calendarConstraints) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(pair) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917387399, i2, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.DatePickerRow (AccountActivityExporterRequestFragment.kt:164)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, i2 & 14, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoTextInputState bentoTextInputState = new BentoTextInputState(str2 == null ? "" : str2, null, null, null, null, null, null, null, false, 510, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountActivityExporterRequestFragment.DatePickerRow$lambda$7$lambda$4$lambda$3((String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(bentoTextInputState, (Function1<? super String, Unit>) objRememberedValue, modifierM5144paddingVpY3zN4$default, composerStartRestartGroup, BentoTextInputState.$stable | 48, 0);
            Modifier modifierAlpha = Alpha.alpha(boxScopeInstance.matchParentSize(companion), 0.0f);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(calendarConstraints) | composerStartRestartGroup.changedInstance(pair);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.DatePickerRow$lambda$7$lambda$6$lambda$5(this.f$0, calendarConstraints, pair);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierAlpha, false, null, null, (Function0) objRememberedValue2, 7, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountActivityExporterRequestFragment.DatePickerRow$lambda$8(this.f$0, str, str2, calendarConstraints, pair, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerRow$lambda$7$lambda$4$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerRow$lambda$7$lambda$6$lambda$5(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment, CalendarConstraints calendarConstraints, Pair pair) {
        accountActivityExporterRequestFragment.launchCalendarPicker(calendarConstraints, pair);
        return Unit.INSTANCE;
    }

    private final void RequestSuccessDialog(Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(263151825);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(263151825, i2, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.RequestSuccessDialog (AccountActivityExporterRequestFragment.kt:194)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_success_title, composerStartRestartGroup, 0);
            int i4 = WhenMappings.$EnumSwitchMapping$0[getAppType().ordinal()];
            if (i4 == 1) {
                i3 = C37321R.string.account_activity_exporter_request_success_message_rhc;
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C37321R.string.account_activity_exporter_request_success_message;
            }
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0));
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.GOLD_DOCUMENTS;
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.RequestSuccessDialog$lambda$10$lambda$9(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.RequestSuccessDialog$lambda$12$lambda$11(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, serverToBentoAssetMapper3, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 196608 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountActivityExporterRequestFragment.RequestSuccessDialog$lambda$13(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestSuccessDialog$lambda$10$lambda$9(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
        EventLogger.DefaultImpls.logTap$default(accountActivityExporterRequestFragment.getEventLogger(), null, accountActivityExporterRequestFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "account_activity_report_row_success", null, 4, null), null, null, false, 57, null);
        accountActivityExporterRequestFragment.getParentFragmentManager().popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestSuccessDialog$lambda$12$lambda$11(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
        accountActivityExporterRequestFragment.getParentFragmentManager().popBackStack();
        return Unit.INSTANCE;
    }

    private final void RequestFailureDialog(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1914317526);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914317526, i2, -1, "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment.RequestFailureDialog (AccountActivityExporterRequestFragment.kt:223)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_fail_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_fail_message, composerStartRestartGroup, 0));
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.GOLD_DOCUMENTS;
            String strStringResource2 = StringResources_androidKt.stringResource(C37321R.string.account_activity_exporter_request_fail_try_again_button, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.RequestFailureDialog$lambda$15$lambda$14(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountActivityExporterRequestFragment.RequestFailureDialog$lambda$17$lambda$16(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, serverToBentoAssetMapper3, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 196608 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountActivityExporterRequestFragment.RequestFailureDialog$lambda$18(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestFailureDialog$lambda$15$lambda$14(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
        EventLogger.DefaultImpls.logTap$default(accountActivityExporterRequestFragment.getEventLogger(), null, accountActivityExporterRequestFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "account_activity_report_row_failed", null, 4, null), null, null, false, 57, null);
        accountActivityExporterRequestFragment.getDuxo().clearResponse();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestFailureDialog$lambda$17$lambda$16(AccountActivityExporterRequestFragment accountActivityExporterRequestFragment) {
        accountActivityExporterRequestFragment.getDuxo().clearResponse();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().selectAccount(accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAccountSelector(AccountSwitcherData data) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(data), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    private final void launchCalendarPicker(CalendarConstraints calendarConstraints, Pair<Long, Long> datePickerSelection) {
        if (calendarConstraints == null || datePickerSelection == null) {
            return;
        }
        MaterialDatePicker<Pair<Long, Long>> materialDatePickerBuild = MaterialDatePicker.Builder.dateRangePicker().setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_DatePicker_Monochrome).setCalendarConstraints(calendarConstraints).setSelection(datePickerSelection).build();
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestFragment$launchCalendarPicker$1$1
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Pair<Long, Long> pair) {
                Long first = pair.first;
                Intrinsics.checkNotNullExpressionValue(first, "first");
                Instant instantOfEpochMilli = Instant.ofEpochMilli(first.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                ZoneIds zoneIds = ZoneIds.INSTANCE;
                LocalDate localDate = Instants.toLocalDate(instantOfEpochMilli, zoneIds.getUTC());
                Long second = pair.second;
                Intrinsics.checkNotNullExpressionValue(second, "second");
                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(second.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
                this.this$0.getDuxo().setDateSelection(localDate, Instants.toLocalDate(instantOfEpochMilli2, zoneIds.getUTC()));
            }
        });
        materialDatePickerBuild.show(getParentFragmentManager(), DATE_PICKER_FRAGMENT);
    }
}
