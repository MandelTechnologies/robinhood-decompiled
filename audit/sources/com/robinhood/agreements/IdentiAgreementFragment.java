package com.robinhood.agreements;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.agreements.IdentiAgreementFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen4;
import com.robinhood.shared.agreements.contracts.IdentiAgreementKey;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: IdentiAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/agreements/IdentiAgreementFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementEvent;", "Companion", "feature-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class IdentiAgreementFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IdentiAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(IdentiAgreementKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.agreements.IdentiAgreementFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof IdentiAgreementKey.Callbacks)) {
                parentFragment = null;
            }
            IdentiAgreementKey.Callbacks callbacks = (IdentiAgreementKey.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof IdentiAgreementKey.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(IdentiAgreementFragment identiAgreementFragment, int i, Composer composer, int i2) {
        identiAgreementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final IdentiAgreementKey.Callbacks getCallbacks() {
        return (IdentiAgreementKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(716735023);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(716735023, i2, -1, "com.robinhood.agreements.IdentiAgreementFragment.ComposeContent (IdentiAgreementFragment.kt:25)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-798613446, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.agreements.IdentiAgreementFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-798613446, i3, -1, "com.robinhood.agreements.IdentiAgreementFragment.ComposeContent.<anonymous> (IdentiAgreementFragment.kt:27)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((IdentiAgreementKey) IdentiAgreementFragment.INSTANCE.getArgs((Fragment) IdentiAgreementFragment.this)).getScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1592352219, true, new AnonymousClass1(IdentiAgreementFragment.this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: IdentiAgreementFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.agreements.IdentiAgreementFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ IdentiAgreementFragment this$0;

                    AnonymousClass1(IdentiAgreementFragment identiAgreementFragment) {
                        this.this$0 = identiAgreementFragment;
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
                            ComposerKt.traceEventStart(-1592352219, i, -1, "com.robinhood.agreements.IdentiAgreementFragment.ComposeContent.<anonymous>.<anonymous> (IdentiAgreementFragment.kt:32)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        Companion companion = IdentiAgreementFragment.INSTANCE;
                        IdentiAgreementType agreementType = ((IdentiAgreementKey) companion.getArgs((Fragment) this.this$0)).getAgreementType();
                        String accountNumber = ((IdentiAgreementKey) companion.getArgs((Fragment) this.this$0)).getAccountNumber();
                        IdentiAgreementFragment identiAgreementFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(identiAgreementFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new IdentiAgreementFragment2(identiAgreementFragment);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final IdentiAgreementFragment identiAgreementFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.agreements.IdentiAgreementFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IdentiAgreementFragment.C72931.AnonymousClass1.invoke$lambda$2$lambda$1(identiAgreementFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IdentiAgreementScreen4.IdentiAgreementScreen(agreementType, accountNumber, (Function0) objRememberedValue2, (Function1) kFunction, modifierLogScreenTransitions$default, null, null, null, composer, 0, 224);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(IdentiAgreementFragment identiAgreementFragment) {
                        identiAgreementFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.agreements.IdentiAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdentiAgreementFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(IdentiAgreementEvent event) {
        if (event instanceof IdentiAgreementEvent.Submitting) {
            getCallbacks().onSubmissionStateChanged(true);
            return;
        }
        if (event instanceof IdentiAgreementEvent.Error) {
            getCallbacks().onSubmissionStateChanged(false);
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((IdentiAgreementEvent.Error) event).getCause(), false, 2, null);
        } else {
            if (!(event instanceof IdentiAgreementEvent.Submitted)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onAgreementAccepted();
        }
    }

    /* compiled from: IdentiAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/agreements/IdentiAgreementFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/agreements/IdentiAgreementFragment;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey;", "<init>", "()V", "feature-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<IdentiAgreementFragment, IdentiAgreementKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(IdentiAgreementKey identiAgreementKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, identiAgreementKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IdentiAgreementKey getArgs(IdentiAgreementFragment identiAgreementFragment) {
            return (IdentiAgreementKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, identiAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IdentiAgreementFragment newInstance(IdentiAgreementKey identiAgreementKey) {
            return (IdentiAgreementFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, identiAgreementKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IdentiAgreementFragment identiAgreementFragment, IdentiAgreementKey identiAgreementKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, identiAgreementFragment, identiAgreementKey);
        }
    }
}
