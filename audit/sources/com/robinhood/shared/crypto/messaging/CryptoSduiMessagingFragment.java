package com.robinhood.shared.crypto.messaging;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.librobinhood.data.store.CryptoMessagingStore;
import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.crypto.contracts.CryptoSduiMessagingIntentKey;
import com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoSduiMessagingFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/messaging/CryptoSduiMessagingFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "cryptoMessagingStore", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "getCryptoMessagingStore", "()Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "setCryptoMessagingStore", "(Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handle", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-sdui-messaging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoSduiMessagingFragment extends GenericActionHandlingFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
    public CryptoMessagingStore cryptoMessagingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoSduiMessagingFragment cryptoSduiMessagingFragment, int i, Composer composer, int i2) {
        cryptoSduiMessagingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final CryptoMessagingStore getCryptoMessagingStore() {
        CryptoMessagingStore cryptoMessagingStore = this.cryptoMessagingStore;
        if (cryptoMessagingStore != null) {
            return cryptoMessagingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoMessagingStore");
        return null;
    }

    public final void setCryptoMessagingStore(CryptoMessagingStore cryptoMessagingStore) {
        Intrinsics.checkNotNullParameter(cryptoMessagingStore, "<set-?>");
        this.cryptoMessagingStore = cryptoMessagingStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(403459786);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(403459786, i2, -1, "com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment.ComposeContent (CryptoSduiMessagingFragment.kt:28)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(366648338, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment.ComposeContent.1

                /* compiled from: CryptoSduiMessagingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoSduiMessagingFragment this$0;

                    AnonymousClass1(CryptoSduiMessagingFragment cryptoSduiMessagingFragment) {
                        this.this$0 = cryptoSduiMessagingFragment;
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
                            ComposerKt.traceEventStart(885482166, i, -1, "com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment.ComposeContent.<anonymous>.<anonymous> (CryptoSduiMessagingFragment.kt:31)");
                        }
                        ApiCryptoSduiMessageScreen data = ((CryptoSduiMessagingIntentKey) CryptoSduiMessagingFragment.INSTANCE.getArgs((Fragment) this.this$0)).getData();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final CryptoSduiMessagingFragment cryptoSduiMessagingFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSduiMessagingFragment.C377121.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoSduiMessagingFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final CryptoSduiMessagingFragment cryptoSduiMessagingFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoSduiMessagingFragment.C377121.AnonymousClass1.invoke$lambda$3$lambda$2(cryptoSduiMessagingFragment2, (ApiCryptoSduiMessageScreen) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        CryptoSduiMessagingScreen3.CryptoSduiMessagingScreen(data, function0, (Function1) objRememberedValue2, null, composer, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoSduiMessagingFragment cryptoSduiMessagingFragment) {
                        cryptoSduiMessagingFragment.requireActivity().finish();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(CryptoSduiMessagingFragment cryptoSduiMessagingFragment, ApiCryptoSduiMessageScreen it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        cryptoSduiMessagingFragment.getCryptoMessagingStore().markScreenAsViewed(it.getTouchPointData().getTouchPoint());
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(366648338, i3, -1, "com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment.ComposeContent.<anonymous> (CryptoSduiMessagingFragment.kt:30)");
                    }
                    CryptoSduiMessagingFragment cryptoSduiMessagingFragment = CryptoSduiMessagingFragment.this;
                    ActionHandlingFragment2.ContentWithDialog(cryptoSduiMessagingFragment, ComposableLambda3.rememberComposableLambda(885482166, true, new AnonymousClass1(cryptoSduiMessagingFragment), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSduiMessagingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment, com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Dismiss) {
            requireActivity().finish();
            return true;
        }
        return super.mo15941handle(action);
    }

    /* compiled from: CryptoSduiMessagingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/messaging/CryptoSduiMessagingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/messaging/CryptoSduiMessagingFragment;", "Lcom/robinhood/shared/crypto/contracts/CryptoSduiMessagingIntentKey;", "<init>", "()V", "feature-crypto-sdui-messaging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoSduiMessagingFragment, CryptoSduiMessagingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoSduiMessagingIntentKey getArgs(CryptoSduiMessagingFragment cryptoSduiMessagingFragment) {
            return (CryptoSduiMessagingIntentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoSduiMessagingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoSduiMessagingFragment newInstance(CryptoSduiMessagingIntentKey cryptoSduiMessagingIntentKey) {
            return (CryptoSduiMessagingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, cryptoSduiMessagingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoSduiMessagingFragment cryptoSduiMessagingFragment, CryptoSduiMessagingIntentKey cryptoSduiMessagingIntentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoSduiMessagingFragment, cryptoSduiMessagingIntentKey);
        }
    }
}
