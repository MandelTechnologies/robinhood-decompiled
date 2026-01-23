package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.GoldUpgradeValuePropsAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: LegacyGoldUpgradeValuePropSduiFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u000201B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010 \u001a\u00020!2\n\u0010\"\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020$H\u0016J\r\u0010.\u001a\u00020$H\u0017¢\u0006\u0002\u0010/R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/GoldUpgradeValuePropSduiFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/StandardPageFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldUpgradeValuePropsAction;", "Lcom/robinhood/android/gold/upgrade/legacy/SduiActions;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "handle", "", "action", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeValuePropSduiFragment extends StandardPageFragment<GoldUpgradeValuePropsAction> {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(GoldUpgradeContract.ValuePropCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldUpgradeContract.ValuePropCallbacks)) {
                parentFragment = null;
            }
            GoldUpgradeContract.ValuePropCallbacks valuePropCallbacks = (GoldUpgradeContract.ValuePropCallbacks) parentFragment;
            if (valuePropCallbacks != null) {
                return valuePropCallbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldUpgradeContract.ValuePropCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EventLogger eventLogger;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeValuePropSduiFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LegacyGoldUpgradeValuePropSduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageThemeOverride.values().length];
            try {
                iArr[PageThemeOverride.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageThemeOverride.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(LegacyGoldUpgradeValuePropSduiFragment legacyGoldUpgradeValuePropSduiFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeValuePropSduiFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final GoldUpgradeContract.ValuePropCallbacks getCallbacks() {
        return (GoldUpgradeContract.ValuePropCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Screen getLoggingScreen() {
        Screen.Name name = Screen.Name.GOLD_VALUE_PROPS;
        String logging_screen_identifier = getContent().getLogging_screen_identifier();
        if (logging_screen_identifier == null) {
            logging_screen_identifier = "";
        }
        return new Screen(name, null, logging_screen_identifier, null, 10, null);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment
    public StandardPageTemplate<GoldUpgradeValuePropsAction> getContent() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getPageContent();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public boolean mo15941handle(GoldUpgradeValuePropsAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GoldUpgradeValuePropsAction.ContinueAction) {
            getCallbacks().onGoldValuePropsContinue();
            return true;
        }
        if (action instanceof GoldUpgradeValuePropsAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            GenericActionHandlerKt.handleDeeplinkAction$default(navigator, contextRequireContext, ((GoldUpgradeValuePropsAction.Deeplink) action).getValue2(), null, 4, null);
            return true;
        }
        if (action instanceof GoldUpgradeValuePropsAction.Dismiss) {
            requireBaseActivity().onBackPressed();
            return true;
        }
        if (!(action instanceof GoldUpgradeValuePropsAction.InfoAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        ActionHandlingFragment.handleAlert$default(this, ((GoldUpgradeValuePropsAction.InfoAlert) action).getValue2(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getLoggingScreen(), null, null, ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        DayNightOverlay dayNightOverlay;
        super.onStart();
        PageThemeOverride theme_override = getContent().getTheme_override();
        if (theme_override != null) {
            ScarletManager scarletManager = getScarletManager();
            int i = WhenMappings.$EnumSwitchMapping$0[theme_override.ordinal()];
            if (i == 1) {
                dayNightOverlay = DayNightOverlay.NIGHT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dayNightOverlay = DayNightOverlay.DAY;
            }
            scarletManager.putOverlay(dayNightOverlay, Boolean.FALSE);
        }
        if (getContent().is_full_bleed()) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(740400867);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740400867, i2, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment.ComposeContent (LegacyGoldUpgradeValuePropSduiFragment.kt:103)");
            }
            boolean shownInTab = ((Args) INSTANCE.getArgs((Fragment) this)).getShownInTab();
            StandardPageTemplate<GoldUpgradeValuePropsAction> content = getContent();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$ComposeContent$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GoldUpgradeValuePropsAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return this.this$0.mo15941handle(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LegacyGoldUpgradeValuePropSduiFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LegacyGoldUpgradeValuePropsSduiScreen3.GoldUpgradeValuePropsSduiScreen(content, (Function0) objRememberedValue2, shownInTab, null, null, null, sduiActionHandler, composerStartRestartGroup, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeValuePropSduiFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(LegacyGoldUpgradeValuePropSduiFragment legacyGoldUpgradeValuePropSduiFragment) {
        legacyGoldUpgradeValuePropSduiFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: LegacyGoldUpgradeValuePropSduiFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/GoldUpgradeValuePropSduiFragment$Args;", "Landroid/os/Parcelable;", "pageContent", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldUpgradeValuePropsAction;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/android/gold/upgrade/legacy/RosettaContext;", "shownInTab", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "getPageContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getShownInTab", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.rosetta.eventlogging.Context loggingContext;
        private final StandardPageTemplate<GoldUpgradeValuePropsAction> pageContent;
        private final boolean shownInTab;

        /* compiled from: LegacyGoldUpgradeValuePropSduiFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StandardPageTemplate) parcel.readParcelable(Args.class.getClassLoader()), (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, StandardPageTemplate standardPageTemplate, com.robinhood.rosetta.eventlogging.Context context, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                standardPageTemplate = args.pageContent;
            }
            if ((i & 2) != 0) {
                context = args.loggingContext;
            }
            if ((i & 4) != 0) {
                z = args.shownInTab;
            }
            return args.copy(standardPageTemplate, context, z);
        }

        public final StandardPageTemplate<GoldUpgradeValuePropsAction> component1() {
            return this.pageContent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShownInTab() {
            return this.shownInTab;
        }

        public final Args copy(StandardPageTemplate<? extends GoldUpgradeValuePropsAction> pageContent, com.robinhood.rosetta.eventlogging.Context loggingContext, boolean shownInTab) {
            Intrinsics.checkNotNullParameter(pageContent, "pageContent");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(pageContent, loggingContext, shownInTab);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.pageContent, args.pageContent) && Intrinsics.areEqual(this.loggingContext, args.loggingContext) && this.shownInTab == args.shownInTab;
        }

        public int hashCode() {
            return (((this.pageContent.hashCode() * 31) + this.loggingContext.hashCode()) * 31) + Boolean.hashCode(this.shownInTab);
        }

        public String toString() {
            return "Args(pageContent=" + this.pageContent + ", loggingContext=" + this.loggingContext + ", shownInTab=" + this.shownInTab + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.pageContent, flags);
            dest.writeSerializable(this.loggingContext);
            dest.writeInt(this.shownInTab ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(StandardPageTemplate<? extends GoldUpgradeValuePropsAction> pageContent, com.robinhood.rosetta.eventlogging.Context loggingContext, boolean z) {
            Intrinsics.checkNotNullParameter(pageContent, "pageContent");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.pageContent = pageContent;
            this.loggingContext = loggingContext;
            this.shownInTab = z;
        }

        public final StandardPageTemplate<GoldUpgradeValuePropsAction> getPageContent() {
            return this.pageContent;
        }

        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final boolean getShownInTab() {
            return this.shownInTab;
        }
    }

    /* compiled from: LegacyGoldUpgradeValuePropSduiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/GoldUpgradeValuePropSduiFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/GoldUpgradeValuePropSduiFragment;", "Lcom/robinhood/android/gold/upgrade/legacy/GoldUpgradeValuePropSduiFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropSduiFragment$Companion, reason: from kotlin metadata */
    public static final class Companion implements FragmentWithArgsCompanion<LegacyGoldUpgradeValuePropSduiFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LegacyGoldUpgradeValuePropSduiFragment legacyGoldUpgradeValuePropSduiFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeValuePropSduiFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeValuePropSduiFragment newInstance(Args args) {
            return (LegacyGoldUpgradeValuePropSduiFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeValuePropSduiFragment legacyGoldUpgradeValuePropSduiFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeValuePropSduiFragment, args);
        }
    }
}
