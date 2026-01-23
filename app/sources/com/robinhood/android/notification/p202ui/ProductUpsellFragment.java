package com.robinhood.android.notification.p202ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.notification.Loggable;
import com.robinhood.android.notification.data.ProductUpsellActionType;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0007J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0007R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/notification/ui/ProductUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "()Landroidx/core/app/NotificationManagerCompat;", "notificationManager$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "baseTapInteractionEvent", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getBaseTapInteractionEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "baseTapInteractionEvent$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "close", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleCtaClick", "actionType", "Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "handleNotificationPermissionRequest", "openAndroidPermissionSettings", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Companion", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ProductUpsellFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: notificationManager$delegate, reason: from kotlin metadata */
    private final Lazy notificationManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductUpsellFragment.notificationManager_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductUpsellFragment.eventScreen_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: baseTapInteractionEvent$delegate, reason: from kotlin metadata */
    private final Lazy baseTapInteractionEvent = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductUpsellFragment.baseTapInteractionEvent_delegate$lambda$2(this.f$0);
        }
    });

    /* compiled from: ProductUpsellFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductUpsellActionType.values().length];
            try {
                iArr[ProductUpsellActionType.REQUEST_NOTIFICATION_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductUpsellActionType.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(ProductUpsellFragment productUpsellFragment, int i, Composer composer, int i2) {
        productUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final NotificationManagerCompat getNotificationManager() {
        return (NotificationManagerCompat) this.notificationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManagerCompat notificationManager_delegate$lambda$0(ProductUpsellFragment productUpsellFragment) {
        android.content.Context contextRequireContext = productUpsellFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ContextSystemServices.getNotificationManager(contextRequireContext);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$1(ProductUpsellFragment productUpsellFragment) {
        return new Screen(Screen.Name.PRODUCT_UPSELL, null, ((ProductUpsellKey) INSTANCE.getArgs((Fragment) productUpsellFragment)).getContentfulIdentifier(), null, 10, null);
    }

    private final UserInteractionEventData getBaseTapInteractionEvent() {
        return (UserInteractionEventData) this.baseTapInteractionEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData baseTapInteractionEvent_delegate$lambda$2(ProductUpsellFragment productUpsellFragment) {
        return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, productUpsellFragment.getEventScreen(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(643977154);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643977154, i2, -1, "com.robinhood.android.notification.ui.ProductUpsellFragment.ComposeContent (ProductUpsellFragment.kt:54)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), ScarletComposeInterop.themesForCompose(getScarletManager()), ComposableLambda3.rememberComposableLambda(-1473826992, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1473826992, i3, -1, "com.robinhood.android.notification.ui.ProductUpsellFragment.ComposeContent.<anonymous> (ProductUpsellFragment.kt:74)");
                    }
                    ProductUpsellFragment.ComposeContent$EmbeddedContent(ProductUpsellFragment.this, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$EmbeddedContent(ProductUpsellFragment productUpsellFragment, Composer composer, int i) {
        composer.startReplaceGroup(-1063930453);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1063930453, i, -1, "com.robinhood.android.notification.ui.ProductUpsellFragment.ComposeContent.EmbeddedContent (ProductUpsellFragment.kt:56)");
        }
        CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(productUpsellFragment.getEventLogger()), ComposableLambda3.rememberComposableLambda(108656875, true, new ProductUpsellFragment2(productUpsellFragment), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final void close() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    @SuppressLint({"MissingSuperCall"})
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCtaClick(ProductUpsellActionType actionType) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventData.copy$default(getBaseTapInteractionEvent(), null, null, new Component(Component.ComponentType.BUTTON, actionType.getActionType(), null, 4, null), null, null, null, null, 123, null), false, false, 6, null);
        int i = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i == 1) {
            handleNotificationPermissionRequest();
        } else if (i == 2) {
            close();
        } else {
            close();
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    public final void handleNotificationPermissionRequest() {
        if (getNotificationManager().areNotificationsEnabled()) {
            Loggable.debugLog("Notifications are already enabled. Closing upsell screen.");
            close();
        } else {
            openAndroidPermissionSettings(requireBaseActivity());
            close();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void openAndroidPermissionSettings(BaseActivity activity) {
        Context context;
        Context contextCopy$default;
        Intrinsics.checkNotNullParameter(activity, "activity");
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.DEEPLINK;
        Screen eventScreen = getEventScreen();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.OPEN_URL;
        Context screenEventContext = getScreenEventContext();
        if (screenEventContext == null || (contextCopy$default = Context.copy$default(screenEventContext, 0, 0, 0, null, null, null, "android.settings.APP_NOTIFICATION_SETTINGS", null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null)) == null) {
            context = new Context(0, 0, 0, null, null, null, "android.settings.APP_NOTIFICATION_SETTINGS", null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null);
        } else {
            context = contextCopy$default;
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, eventScreen, null, action, context, null, null, 100, null), false, false, 6, null);
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", Contexts8.getPackageInfo$default(activity, 0, 1, null).packageName);
        activity.startActivity(intent);
    }

    /* compiled from: ProductUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/notification/ui/ProductUpsellFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/notification/ui/ProductUpsellFragment;", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "<init>", "()V", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ProductUpsellFragment, ProductUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ProductUpsellKey getArgs(ProductUpsellFragment productUpsellFragment) {
            return (ProductUpsellKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, productUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ProductUpsellFragment newInstance(ProductUpsellKey productUpsellKey) {
            return (ProductUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, productUpsellKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ProductUpsellFragment productUpsellFragment, ProductUpsellKey productUpsellKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, productUpsellFragment, productUpsellKey);
        }
    }
}
