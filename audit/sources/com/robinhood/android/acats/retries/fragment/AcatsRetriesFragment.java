package com.robinhood.android.acats.retries.fragment;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.acats.retries.C7659R;
import com.robinhood.android.acats.retries.activity.AcatsRetriesActivityStore;
import com.robinhood.android.acats.retries.activity.AcatsRetriesViewState;
import com.robinhood.android.acats.retries.composables.AcatsRetriesLayoutComposable;
import com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: AcatsRetriesFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\"²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragmentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragmentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "activityViewStateStore", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;", "getActivityViewStateStore", "()Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;", "setActivityViewStateStore", "(Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "Companion", "feature-acats-retries_externalDebug", "viewState", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsRetriesFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public AcatsRetriesActivityStore activityViewStateStore;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsRetriesFragmentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AcatsRetriesFragmentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsRetriesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragmentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AcatsRetriesFragment acatsRetriesFragment, int i, Composer composer, int i2) {
        acatsRetriesFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsRetriesFragmentContract.Callbacks getCallbacks() {
        return (AcatsRetriesFragmentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final AcatsRetriesActivityStore getActivityViewStateStore() {
        AcatsRetriesActivityStore acatsRetriesActivityStore = this.activityViewStateStore;
        if (acatsRetriesActivityStore != null) {
            return acatsRetriesActivityStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityViewStateStore");
        return null;
    }

    public final void setActivityViewStateStore(AcatsRetriesActivityStore acatsRetriesActivityStore) {
        Intrinsics.checkNotNullParameter(acatsRetriesActivityStore, "<set-?>");
        this.activityViewStateStore = acatsRetriesActivityStore;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACAT_RETRY, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsRetriesFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getLoggingContext();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1040962099);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040962099, i2, -1, "com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment.ComposeContent (AcatsRetriesFragment.kt:36)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getActivityViewStateStore().getViewStateStream(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-1312130203, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) throws Resources.NotFoundException {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1312130203, i3, -1, "com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment.ComposeContent.<anonymous> (AcatsRetriesFragment.kt:39)");
                    }
                    AcatsRetriesViewState acatsRetriesViewStateComposeContent$lambda$0 = AcatsRetriesFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (acatsRetriesViewStateComposeContent$lambda$0 != null) {
                        AcatsRetriesFragment acatsRetriesFragment = this;
                        AcatsRetriesFragmentContract.Callbacks callbacks = acatsRetriesFragment.getCallbacks();
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer3.changedInstance(callbacks);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new AcatsRetriesFragment2(callbacks);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        Function3 function3 = (Function3) ((KFunction) objRememberedValue);
                        AcatsRetriesFragmentContract.Callbacks callbacks2 = acatsRetriesFragment.getCallbacks();
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer3.changedInstance(callbacks2);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new AcatsRetriesFragment3(callbacks2);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                        AcatsRetriesFragmentContract.Callbacks callbacks3 = acatsRetriesFragment.getCallbacks();
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer3.changedInstance(callbacks3);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new AcatsRetriesFragment4(callbacks3);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        AcatsRetriesLayoutComposable.AcatsRetriesLayout(acatsRetriesViewStateComposeContent$lambda$0, function3, function0, (Function1) ((KFunction) objRememberedValue3), null, composer3, 0, 16);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsRetriesFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.removeCustomView();
        RhToolbars.setCenteredTitle(toolbar, C7659R.string.acats_retries_header_toolbar_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: AcatsRetriesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragment;", "Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragmentContract$Key;", "<init>", "()V", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsRetriesFragment, AcatsRetriesFragmentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsRetriesFragmentContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsRetriesFragmentContract.Key getArgs(AcatsRetriesFragment acatsRetriesFragment) {
            return (AcatsRetriesFragmentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsRetriesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsRetriesFragment newInstance(AcatsRetriesFragmentContract.Key key) {
            return (AcatsRetriesFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsRetriesFragment acatsRetriesFragment, AcatsRetriesFragmentContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsRetriesFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsRetriesViewState ComposeContent$lambda$0(SnapshotState4<AcatsRetriesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
