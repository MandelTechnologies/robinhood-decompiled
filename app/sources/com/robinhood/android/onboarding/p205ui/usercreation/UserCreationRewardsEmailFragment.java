package com.robinhood.android.onboarding.p205ui.usercreation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.UserCreationMarketBottomSheetFragmentKey;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailEvent;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationMarketOptInBottomSheetFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationRewardsEmailFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
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

/* compiled from: UserCreationRewardsEmailFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u0015\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationRewardsEmailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationMarketOptInBottomSheetFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onOptInMarketingSelected", "email", "", "optIn", "", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationRewardsEmailFragment extends GenericComposeFragment implements UserCreationMarketOptInBottomSheetFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationRewardsEmailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UserCreationEmailDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(UserCreationEmailFragment.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UserCreationEmailFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment, int i, Composer composer, int i2) {
        userCreationRewardsEmailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final UserCreationEmailDuxo getDuxo() {
        return (UserCreationEmailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationEmailFragment.Callbacks getCallbacks() {
        return (UserCreationEmailFragment.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: UserCreationRewardsEmailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$ComposeContent$1 */
    static final class C229701 implements Function2<Composer, Integer, Unit> {
        C229701() {
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
                ComposerKt.traceEventStart(-289884011, i, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment.ComposeContent.<anonymous> (UserCreationRewardsEmailFragment.kt:29)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UserCreationRewardsEmailFragment.this);
            final UserCreationRewardsEmailFragment userCreationRewardsEmailFragment = UserCreationRewardsEmailFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRewardsEmailFragment.C229701.invoke$lambda$1$lambda$0(userCreationRewardsEmailFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(UserCreationRewardsEmailFragment.this);
            final UserCreationRewardsEmailFragment userCreationRewardsEmailFragment2 = UserCreationRewardsEmailFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRewardsEmailFragment.C229701.invoke$lambda$3$lambda$2(userCreationRewardsEmailFragment2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(UserCreationRewardsEmailFragment.this);
            final UserCreationRewardsEmailFragment userCreationRewardsEmailFragment3 = UserCreationRewardsEmailFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRewardsEmailFragment.C229701.invoke$lambda$5$lambda$4(userCreationRewardsEmailFragment3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(UserCreationRewardsEmailFragment.this);
            final UserCreationRewardsEmailFragment userCreationRewardsEmailFragment4 = UserCreationRewardsEmailFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRewardsEmailFragment.C229701.invoke$lambda$7$lambda$6(userCreationRewardsEmailFragment4, (UserCreationEmailEvent.Finish) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function13 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            ActivityErrorHandler activityErrorHandler = UserCreationRewardsEmailFragment.this.getActivityErrorHandler();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(activityErrorHandler);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new UserCreationRewardsEmailFragment2(activityErrorHandler);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            UserCreationRewardsEmailComposable4.UserCreationRewardsEmailComposable(function0, function1, function12, function13, (Function1) objRememberedValue5, null, null, composer, 0, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment) {
            userCreationRewardsEmailFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment, String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            Navigator.DefaultImpls.createDialogFragment$default(userCreationRewardsEmailFragment.getNavigator(), new UserCreationMarketBottomSheetFragmentKey(email), null, 2, null).show(userCreationRewardsEmailFragment.getChildFragmentManager(), "user-creation-market-opt-in");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            userCreationRewardsEmailFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment, UserCreationEmailEvent.Finish event) {
            Intrinsics.checkNotNullParameter(event, "event");
            userCreationRewardsEmailFragment.getCallbacks().onEmailFragmentFinished(event.getEmail(), event.isFromCcWaitlist());
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1965086794);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1965086794, i2, -1, "com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment.ComposeContent (UserCreationRewardsEmailFragment.kt:27)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-289884011, true, new C229701(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationRewardsEmailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserCreationRewardsEmailFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationMarketOptInBottomSheetFragment.Callbacks
    public void onOptInMarketingSelected(String email, boolean optIn) {
        getDuxo().onMarketingOptInSubmitted(optIn, email);
    }

    /* compiled from: UserCreationRewardsEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationRewardsEmailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationRewardsEmailFragment;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UserCreationRewardsEmailFragment, UserCreationEmailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UserCreationEmailFragment.Args getArgs(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment) {
            return (UserCreationEmailFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, userCreationRewardsEmailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UserCreationRewardsEmailFragment newInstance(UserCreationEmailFragment.Args args) {
            return (UserCreationRewardsEmailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UserCreationRewardsEmailFragment userCreationRewardsEmailFragment, UserCreationEmailFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, userCreationRewardsEmailFragment, args);
        }
    }
}
