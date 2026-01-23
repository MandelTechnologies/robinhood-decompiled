package com.robinhood.android.privacysettings.p217ui.visibility;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.privacysettings.C25869R;
import com.robinhood.android.privacysettings.p217ui.PrivacySettingsDialogFragment;
import com.robinhood.android.privacysettings.p217ui.visibility.ProfileVisibilityFragment;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ProfileVisibilityFragment.kt */
@Metadata(m3635d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0011\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+²\u0006\n\u0010,\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityDuxo;", "getDuxo", "()Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorHandler", "com/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$errorHandler$2$1;", "errorHandler$delegate", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAttach", "context", "Landroid/content/Context;", "onStart", "bind", "state", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;", "onDialogDismissed", "id", "", "Callbacks", "Companion", "feature-privacy-settings_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileVisibilityFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProfileVisibilityFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, ProfileVisibilityDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProfileVisibilityFragment.errorHandler_delegate$lambda$0(this.f$0);
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* compiled from: ProfileVisibilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Callbacks;", "", "setupProfile", "", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void setupProfile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(ProfileVisibilityFragment profileVisibilityFragment, int i, Composer composer, int i2) {
        profileVisibilityFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileVisibilityDuxo getDuxo() {
        return (ProfileVisibilityDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ProfileVisibilityFragment2 getErrorHandler() {
        return (ProfileVisibilityFragment2) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$errorHandler$2$1] */
    public static final ProfileVisibilityFragment2 errorHandler_delegate$lambda$0(final ProfileVisibilityFragment profileVisibilityFragment) {
        final FragmentActivity fragmentActivityRequireActivity = profileVisibilityFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, true, 0, null, 12, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                PrivacySettingsDialogFragment.Companion companion = PrivacySettingsDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity2).setId(C11048R.id.dialog_id_generic_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle(getString(C25869R.string.profile_visibility_toolbar_title));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(320264788);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320264788, i2, -1, "com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment.ComposeContent (ProfileVisibilityFragment.kt:56)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new ProfileVisibilityViewState(false, false, null, null, 15, null), composerStartRestartGroup, 0);
            LocalShowPlaceholder.Loadable(ComposeContent$lambda$1(snapshotState4SubscribeAsState).isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1192943932, true, new C258931(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileVisibilityFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ProfileVisibilityFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1 */
    static final class C258931 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<ProfileVisibilityViewState> $viewState$delegate;

        C258931(SnapshotState4<ProfileVisibilityViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-1192943932, i, -1, "com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment.ComposeContent.<anonymous> (ProfileVisibilityFragment.kt:60)");
            }
            ProfileVisibilityViewState profileVisibilityViewStateComposeContent$lambda$1 = ProfileVisibilityFragment.ComposeContent$lambda$1(this.$viewState$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(ProfileVisibilityFragment.this) | composer.changed(this.$viewState$delegate);
            final ProfileVisibilityFragment profileVisibilityFragment = ProfileVisibilityFragment.this;
            final SnapshotState4<ProfileVisibilityViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileVisibilityFragment.C258931.invoke$lambda$1$lambda$0(profileVisibilityFragment, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(ProfileVisibilityFragment.this);
            final ProfileVisibilityFragment profileVisibilityFragment2 = ProfileVisibilityFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ProfileVisibilityFragment.C258931.invoke$lambda$3$lambda$2(profileVisibilityFragment2, (OptOutConsentType) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function2 function2 = (Function2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(ProfileVisibilityFragment.this) | composer.changed(this.$viewState$delegate);
            final ProfileVisibilityFragment profileVisibilityFragment3 = ProfileVisibilityFragment.this;
            final SnapshotState4<ProfileVisibilityViewState> snapshotState42 = this.$viewState$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileVisibilityFragment.C258931.invoke$lambda$5$lambda$4(profileVisibilityFragment3, snapshotState42);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(ProfileVisibilityFragment.this);
            final ProfileVisibilityFragment profileVisibilityFragment4 = ProfileVisibilityFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProfileVisibilityFragment.C258931.invoke$lambda$7$lambda$6(profileVisibilityFragment4, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function1 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            boolean showSetupProfileButton = ((LegacyFragmentKey.ProfileVisibility) ProfileVisibilityFragment.INSTANCE.getArgs((Fragment) ProfileVisibilityFragment.this)).getShowSetupProfileButton();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(ProfileVisibilityFragment.this);
            final ProfileVisibilityFragment profileVisibilityFragment5 = ProfileVisibilityFragment.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileVisibilityFragment.C258931.invoke$lambda$9$lambda$8(profileVisibilityFragment5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            ProfileVisibilityComposable.ProfileVisibilityComposable(profileVisibilityViewStateComposeContent$lambda$1, function0, function2, function02, function1, showSetupProfileButton, (Function0) objRememberedValue5, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ProfileVisibilityFragment profileVisibilityFragment, SnapshotState4 snapshotState4) {
            profileVisibilityFragment.getDuxo().onAnyoneRowClicked(ProfileVisibilityFragment.ComposeContent$lambda$1(snapshotState4).isAnyoneRowChecked());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ProfileVisibilityFragment profileVisibilityFragment, OptOutConsentType type2, boolean z) {
            Intrinsics.checkNotNullParameter(type2, "type");
            profileVisibilityFragment.getDuxo().onConsentTypeRowClicked(type2, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(ProfileVisibilityFragment profileVisibilityFragment, SnapshotState4 snapshotState4) {
            profileVisibilityFragment.getDuxo().onNobodyRowClicked(ProfileVisibilityFragment.ComposeContent$lambda$1(snapshotState4).isNobodyRowChecked());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(ProfileVisibilityFragment profileVisibilityFragment, int i) {
            WebUtils.viewUrl$default(profileVisibilityFragment.requireContext(), profileVisibilityFragment.getString(i), 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(ProfileVisibilityFragment profileVisibilityFragment) {
            profileVisibilityFragment.getCallbacks().setupProfile();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C258941(this));
    }

    /* compiled from: ProfileVisibilityFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment$onStart$1 */
    /* synthetic */ class C258941 extends FunctionReferenceImpl implements Function1<ProfileVisibilityViewState, Unit> {
        C258941(Object obj) {
            super(1, obj, ProfileVisibilityFragment.class, "bind", "bind(Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProfileVisibilityViewState profileVisibilityViewState) {
            invoke2(profileVisibilityViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProfileVisibilityViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ProfileVisibilityFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState ComposeContent$lambda$1(SnapshotState4<ProfileVisibilityViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ProfileVisibilityViewState state) {
        ErrorHandlers.handleErrorEvent(getErrorHandler(), state.getErrorEvent());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: ProfileVisibilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProfileVisibility;", "<init>", "()V", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ProfileVisibilityFragment, LegacyFragmentKey.ProfileVisibility> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ProfileVisibility profileVisibility) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, profileVisibility);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ProfileVisibility getArgs(ProfileVisibilityFragment profileVisibilityFragment) {
            return (LegacyFragmentKey.ProfileVisibility) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, profileVisibilityFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ProfileVisibilityFragment newInstance(LegacyFragmentKey.ProfileVisibility profileVisibility) {
            return (ProfileVisibilityFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, profileVisibility);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ProfileVisibilityFragment profileVisibilityFragment, LegacyFragmentKey.ProfileVisibility profileVisibility) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, profileVisibilityFragment, profileVisibility);
        }
    }
}
