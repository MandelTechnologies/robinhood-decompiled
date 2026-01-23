package com.robinhood.trader.onboarding.region;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment2;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.user.contracts.UserCreationRegionFragmentKey;
import com.robinhood.shared.user.contracts.UserCreationRegionSelectorFragmentKey;
import com.robinhood.shared.user.contracts.UserCreationUnsupportedRegionFragmentKey;
import com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: UserCreationRegionSelectorFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u001a\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorDuxo;", "getDuxo", "()Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/shared/user/contracts/UserCreationRegionFragmentKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/UserCreationRegionFragmentKey$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-onboarding_externalDebug", "viewState", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UserCreationRegionSelectorFragment extends GenericComposeFragment {
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationRegionSelectorFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/UserCreationRegionFragmentKey$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UserCreationRegionSelectorDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(UserCreationRegionFragmentKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UserCreationRegionFragmentKey.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, int i, Composer composer, int i2) {
        userCreationRegionSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationRegionSelectorDuxo getDuxo() {
        return (UserCreationRegionSelectorDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationRegionFragmentKey.Callbacks getCallbacks() {
        return (UserCreationRegionFragmentKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-349921581);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349921581, i2, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment.ComposeContent (UserCreationRegionSelectorFragment.kt:39)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1796297566, true, new C417421(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserCreationRegionSelectorFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UserCreationRegionSelectorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1 */
    static final class C417421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UserCreationRegionSelectorViewState> $viewState$delegate;

        C417421(SnapshotState4<UserCreationRegionSelectorViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796297566, i, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment.ComposeContent.<anonymous> (UserCreationRegionSelectorFragment.kt:43)");
            }
            CountryCode selectedRegion = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSelectedRegion();
            ImmutableList3<CountryCode> filteredRegions = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getFilteredRegions();
            ImmutableList3<CountryCode> suggestedRegions = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSuggestedRegions();
            ImmutableList3<CountryCode> allRegions = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getAllRegions();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UserCreationRegionSelectorFragment.this);
            final UserCreationRegionSelectorFragment userCreationRegionSelectorFragment = UserCreationRegionSelectorFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRegionSelectorFragment.C417421.invoke$lambda$1$lambda$0(userCreationRegionSelectorFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(UserCreationRegionSelectorFragment.this);
            final UserCreationRegionSelectorFragment userCreationRegionSelectorFragment2 = UserCreationRegionSelectorFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRegionSelectorFragment.C417421.invoke$lambda$3$lambda$2(userCreationRegionSelectorFragment2, (CountryCode) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(UserCreationRegionSelectorFragment.this);
            final UserCreationRegionSelectorFragment userCreationRegionSelectorFragment3 = UserCreationRegionSelectorFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRegionSelectorFragment.C417421.invoke$lambda$5$lambda$4(userCreationRegionSelectorFragment3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(UserCreationRegionSelectorFragment.this);
            final UserCreationRegionSelectorFragment userCreationRegionSelectorFragment4 = UserCreationRegionSelectorFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionSelectorFragment.C417421.invoke$lambda$7$lambda$6(userCreationRegionSelectorFragment4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(UserCreationRegionSelectorFragment.this);
            final UserCreationRegionSelectorFragment userCreationRegionSelectorFragment5 = UserCreationRegionSelectorFragment.this;
            final SnapshotState4<UserCreationRegionSelectorViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionSelectorFragment.C417421.invoke$lambda$9$lambda$8(userCreationRegionSelectorFragment5, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable(selectedRegion, filteredRegions, suggestedRegions, allRegions, function1, function12, function13, function0, (Function0) objRememberedValue5, null, composer, 0, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            userCreationRegionSelectorFragment.getDuxo().onSearch(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, CountryCode it) {
            Intrinsics.checkNotNullParameter(it, "it");
            userCreationRegionSelectorFragment.getDuxo().onRegionChange(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            UserCreationRegionSelectorFragment2.logUnsupportedRegion(userCreationRegionSelectorFragment.getEventLogger(), new Component(Component.ComponentType.ROW, "REGION_NOT_LISTED_ROW", null, 4, null), input);
            userCreationRegionSelectorFragment.getCallbacks().onUnsupportedRegionSelected(UserCreationUnsupportedRegionFragmentKey.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment) {
            userCreationRegionSelectorFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, SnapshotState4 snapshotState4) {
            String displayCountry$default;
            CountryCode selectedRegion = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(snapshotState4).getSelectedRegion();
            if ((selectedRegion instanceof CountryCode.Supported) || selectedRegion == null) {
                CountryCode selectedRegion2 = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(snapshotState4).getSelectedRegion();
                Fragment2.setFragmentResult(userCreationRegionSelectorFragment, Constants.USER_CREATION_REGION_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(Constants.USER_CREATION_REGION_BUNDLE_KEY, selectedRegion2 != null ? selectedRegion2.getIso3166CountryCode() : null)));
                userCreationRegionSelectorFragment.requireBaseActivity().onBackPressed();
            } else {
                if (!(selectedRegion instanceof CountryCode.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                EventLogger eventLogger = userCreationRegionSelectorFragment.getEventLogger();
                Component component = new Component(Component.ComponentType.BUTTON, "DONE_BUTTON", null, 4, null);
                CountryCode selectedRegion3 = UserCreationRegionSelectorFragment.ComposeContent$lambda$0(snapshotState4).getSelectedRegion();
                if (selectedRegion3 == null || (displayCountry$default = CountryCode.getDisplayCountry$default(selectedRegion3, null, 1, null)) == null) {
                    displayCountry$default = "";
                }
                UserCreationRegionSelectorFragment2.logUnsupportedRegion(eventLogger, component, displayCountry$default);
                userCreationRegionSelectorFragment.getCallbacks().onUnsupportedRegionSelected(UserCreationUnsupportedRegionFragmentKey.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserCreationRegionSelectorViewState ComposeContent$lambda$0(SnapshotState4<UserCreationRegionSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: UserCreationRegionSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorFragment;", "Lcom/robinhood/shared/user/contracts/UserCreationRegionSelectorFragmentKey;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UserCreationRegionSelectorFragment, UserCreationRegionSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(UserCreationRegionSelectorFragmentKey userCreationRegionSelectorFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, userCreationRegionSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UserCreationRegionSelectorFragmentKey getArgs(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment) {
            return (UserCreationRegionSelectorFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, userCreationRegionSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UserCreationRegionSelectorFragment newInstance(UserCreationRegionSelectorFragmentKey userCreationRegionSelectorFragmentKey) {
            return (UserCreationRegionSelectorFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, userCreationRegionSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UserCreationRegionSelectorFragment userCreationRegionSelectorFragment, UserCreationRegionSelectorFragmentKey userCreationRegionSelectorFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, userCreationRegionSelectorFragment, userCreationRegionSelectorFragmentKey);
        }
    }
}
