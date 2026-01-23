package com.robinhood.android.gold.upgrade.tab.p151ui.upgrade;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.gold.contracts.GoldAgreementsActivityIntentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeTabContract;
import com.robinhood.android.gold.contracts.GoldUpgradeTabFragmentKey;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
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
import timber.log.Timber;

/* compiled from: GoldUpgradeTabFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "hostCallback", "Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "getHostCallback", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "hostCallback$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "openAgreementsPage", "Companion", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUpgradeTabFragment extends GenericComposeFragment {
    public static final int GOLD_AGREEMENTS_ACTIVITY_REQUEST_CODE = 4653;
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldUpgradeTabFragment.class, "hostCallback", "getHostCallback()Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: hostCallback$delegate, reason: from kotlin metadata */
    private final Interfaces2 hostCallback = new CallbacksProperty(Reflection.getOrCreateKotlinClass(GoldUpgradeTabContract.Callback.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldUpgradeTabContract.Callback)) {
                parentFragment = null;
            }
            GoldUpgradeTabContract.Callback callback = (GoldUpgradeTabContract.Callback) parentFragment;
            if (callback != null) {
                return callback;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldUpgradeTabContract.Callback) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(GoldUpgradeTabFragment goldUpgradeTabFragment, int i, Composer composer, int i2) {
        goldUpgradeTabFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final GoldUpgradeTabContract.Callback getHostCallback() {
        return (GoldUpgradeTabContract.Callback) this.hostCallback.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(610386946);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610386946, i2, -1, "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabFragment.ComposeContent (GoldUpgradeTabFragment.kt:28)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUpgradeTabFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(GoldUpgradeTabFragment.ComposeContent$lambda$3$lambda$2(this.f$0, (DeeplinkAction) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            GoldUpgradeTabComposable.GoldUpgradeValuePropsComposable(function0, null, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUpgradeTabFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$3$lambda$2(GoldUpgradeTabFragment goldUpgradeTabFragment, DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Navigator navigator = goldUpgradeTabFragment.getNavigator();
        Context contextRequireContext = goldUpgradeTabFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(action.getUri()), null, null, true, null, 44, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(GoldUpgradeTabFragment goldUpgradeTabFragment) {
        goldUpgradeTabFragment.openAgreementsPage();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3350d("Activity result - requestCode=" + requestCode + ", resultCode=" + resultCode, new Object[0]);
        if (requestCode == 4653 && resultCode == -1) {
            companion.mo3350d("Activity result - Gold upgrade success", new Object[0]);
            getHostCallback().onUpgradeSuccess();
        }
    }

    private final void openAgreementsPage() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new GoldAgreementsActivityIntentKey("gold_tab", null, false, false, 14, null), GOLD_AGREEMENTS_ACTIVITY_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    /* compiled from: GoldUpgradeTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabFragment;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeTabFragmentKey;", "<init>", "()V", "GOLD_AGREEMENTS_ACTIVITY_REQUEST_CODE", "", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<GoldUpgradeTabFragment, GoldUpgradeTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldUpgradeTabFragmentKey goldUpgradeTabFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, goldUpgradeTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((GoldUpgradeTabFragment) fragment);
        }

        public Void getArgs(GoldUpgradeTabFragment goldUpgradeTabFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, goldUpgradeTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldUpgradeTabFragment newInstance() {
            return (GoldUpgradeTabFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldUpgradeTabFragment newInstance(Void r1) {
            return (GoldUpgradeTabFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
