package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferEnrollmentMfaFragmentKey;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaEvent;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferMfaCallbacks;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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

/* compiled from: CryptoTransferEnrollmentMfaFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\t\u0010\u0015\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/lib/crypto/transfer/CryptoTransferMfaCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/lib/crypto/transfer/CryptoTransferMfaCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "navigate", "event", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferEnrollmentMfaFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CryptoTransferMfaCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferEnrollmentMfaFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/lib/crypto/transfer/CryptoTransferMfaCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment, int i, Composer composer, int i2) {
        cryptoTransferEnrollmentMfaFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final CryptoTransferMfaCallbacks getCallbacks() {
        return (CryptoTransferMfaCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: CryptoTransferEnrollmentMfaFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment$ComposeContent$1 */
    static final class C379781 implements Function2<Composer, Integer, Unit> {
        C379781() {
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
                ComposerKt.traceEventStart(2103746364, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment.ComposeContent.<anonymous> (CryptoTransferEnrollmentMfaFragment.kt:27)");
            }
            CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment = CryptoTransferEnrollmentMfaFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(cryptoTransferEnrollmentMfaFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CryptoTransferEnrollmentMfaFragment2(cryptoTransferEnrollmentMfaFragment);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CryptoTransferEnrollmentMfaFragment.this);
            final CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment2 = CryptoTransferEnrollmentMfaFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferEnrollmentMfaFragment.C379781.invoke$lambda$2$lambda$1(cryptoTransferEnrollmentMfaFragment2, (Throwable) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable(function1, (Function1) objRememberedValue2, null, null, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment, Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            CryptoTransferErrorHandler.Companion companion = CryptoTransferErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = cryptoTransferEnrollmentMfaFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            CryptoTransferErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, t, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1218206503);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1218206503, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment.ComposeContent (CryptoTransferEnrollmentMfaFragment.kt:25)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2103746364, true, new C379781(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferEnrollmentMfaFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigate(CryptoTransferEnrollmentMfaEvent.Navigate event) {
        if (Intrinsics.areEqual(event, CryptoTransferEnrollmentMfaEvent.Navigate.Phone.INSTANCE)) {
            getCallbacks().loadPhoneVerification();
        } else if (Intrinsics.areEqual(event, CryptoTransferEnrollmentMfaEvent.Navigate.Email.INSTANCE)) {
            getCallbacks().loadEmailVerification();
        } else {
            if (!Intrinsics.areEqual(event, CryptoTransferEnrollmentMfaEvent.Navigate.Enroll.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onEndMfaSetup();
        }
    }

    /* compiled from: CryptoTransferEnrollmentMfaFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaFragment;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferEnrollmentMfaFragmentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CryptoTransferEnrollmentMfaFragment, CryptoTransferEnrollmentMfaFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CryptoTransferEnrollmentMfaFragmentKey cryptoTransferEnrollmentMfaFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, cryptoTransferEnrollmentMfaFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoTransferEnrollmentMfaFragmentKey getArgs(CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment) {
            return (CryptoTransferEnrollmentMfaFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferEnrollmentMfaFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferEnrollmentMfaFragment newInstance(CryptoTransferEnrollmentMfaFragmentKey cryptoTransferEnrollmentMfaFragmentKey) {
            return (CryptoTransferEnrollmentMfaFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cryptoTransferEnrollmentMfaFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferEnrollmentMfaFragment cryptoTransferEnrollmentMfaFragment, CryptoTransferEnrollmentMfaFragmentKey cryptoTransferEnrollmentMfaFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferEnrollmentMfaFragment, cryptoTransferEnrollmentMfaFragmentKey);
        }
    }
}
