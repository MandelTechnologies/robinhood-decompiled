package com.robinhood.android.wires.p278ui;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.wires.p278ui.WiresLinkAccountFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireContent;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: WiresLinkAccountFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001f\u001a\u00020 H\u0017¢\u0006\u0002\u0010!R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "createIavRelationshipLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresLinkAccountFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private static final String RESULT_EXTRA_ACH_RELATIONSHIP = "achRelationship";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.wires.ui.WiresLinkAccountFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WiresLinkAccountFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final ActivityResultLauncher<Intent> createIavRelationshipLauncher;
    public EventLogger eventLogger;
    private final Screen eventScreen;

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WiresLinkAccountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WiresLinkAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Callbacks;", "", "onAccountLinked", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountLinked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(WiresLinkAccountFragment wiresLinkAccountFragment, int i, Composer composer, int i2) {
        wiresLinkAccountFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public WiresLinkAccountFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.wires.ui.WiresLinkAccountFragment$createIavRelationshipLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intent data;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1 && (data = result.getData()) != null && data.hasExtra("achRelationship")) {
                    this.this$0.getCallbacks().onAccountLinked();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.createIavRelationshipLauncher = activityResultLauncherRegisterForActivityResult;
        this.eventScreen = new Screen(Screen.Name.OUTGOING_WIRE_LINK_ACCOUNT, null, null, null, 14, null);
        this.screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.wires.ui.WiresLinkAccountFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WiresLinkAccountFragment.screenEventContext_delegate$lambda$0(this.f$0);
            }
        });
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.robinhood.rosetta.eventlogging.Context screenEventContext_delegate$lambda$0(WiresLinkAccountFragment wiresLinkAccountFragment) {
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GetWiresContext.getWiresContext(wiresLinkAccountFragment), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -65, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(707443783);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(707443783, i2, -1, "com.robinhood.android.wires.ui.WiresLinkAccountFragment.ComposeContent (WiresLinkAccountFragment.kt:53)");
            }
            ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails linkAccountDetails = (ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.wires.ui.WiresLinkAccountFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WiresLinkAccountFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            WiresLinkAccountComposable.WiresLinkAccountComposable(linkAccountDetails, (Function0) objRememberedValue, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresLinkAccountFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresLinkAccountFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(WiresLinkAccountFragment wiresLinkAccountFragment) {
        EventLogger.DefaultImpls.logTap$default(wiresLinkAccountFragment.getEventLogger(), null, wiresLinkAccountFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "link-bank-account", null, 4, null), null, wiresLinkAccountFragment.getScreenEventContext(), false, 41, null);
        ActivityResultLauncher<Intent> activityResultLauncher = wiresLinkAccountFragment.createIavRelationshipLauncher;
        Navigator navigator = wiresLinkAccountFragment.getNavigator();
        Context contextRequireContext = wiresLinkAccountFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new CreateIavRelationshipIntentKey(IavSource.OUTGOING_WIRE, TransferDirection.DEPOSIT, null, null, false, true, null, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null), null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* compiled from: WiresLinkAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireContent$ApiOutgoingWireDetails$LinkAccountDetails;", "<init>", "()V", "RESULT_EXTRA_ACH_RELATIONSHIP", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WiresLinkAccountFragment, ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails getArgs(WiresLinkAccountFragment wiresLinkAccountFragment) {
            return (ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, wiresLinkAccountFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WiresLinkAccountFragment newInstance(ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails linkAccountDetails) {
            return (WiresLinkAccountFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, linkAccountDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WiresLinkAccountFragment wiresLinkAccountFragment, ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails linkAccountDetails) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, wiresLinkAccountFragment, linkAccountDetails);
        }
    }
}
