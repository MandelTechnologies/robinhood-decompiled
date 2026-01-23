package com.robinhood.android.crypto.p094ui.upgrade.underReview;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CryptoUpgradeUnderReviewFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\t\u0010\u0014\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/underReview/CryptoUpgradeUnderReviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", CryptoUpgradeUnderReviewFragment.EXTRA_MESSAGE_TYPE, "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "getMessageType", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "messageType$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onDone", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoUpgradeUnderReviewFragment extends GenericComposeFragment implements RegionGated {
    private static final String EXTRA_MESSAGE_TYPE = "messageType";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: messageType$delegate, reason: from kotlin metadata */
    private final Lazy messageType = Fragments2.argument(this, EXTRA_MESSAGE_TYPE);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoUpgradeUnderReviewFragment cryptoUpgradeUnderReviewFragment, int i, Composer composer, int i2) {
        cryptoUpgradeUnderReviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final CryptoUpgradeUnderReviewFragment newInstance(LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType messageType) {
        return INSTANCE.newInstance(messageType);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType getMessageType() {
        return (LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType) this.messageType.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2045077364);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2045077364, i2, -1, "com.robinhood.android.crypto.ui.upgrade.underReview.CryptoUpgradeUnderReviewFragment.ComposeContent (CryptoUpgradeUnderReviewFragment.kt:26)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(577920188, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.underReview.CryptoUpgradeUnderReviewFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(577920188, i3, -1, "com.robinhood.android.crypto.ui.upgrade.underReview.CryptoUpgradeUnderReviewFragment.ComposeContent.<anonymous> (CryptoUpgradeUnderReviewFragment.kt:28)");
                    }
                    LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType messageType = CryptoUpgradeUnderReviewFragment.this.getMessageType();
                    CryptoUpgradeUnderReviewFragment cryptoUpgradeUnderReviewFragment = CryptoUpgradeUnderReviewFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(cryptoUpgradeUnderReviewFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoUpgradeUnderReviewFragment2(cryptoUpgradeUnderReviewFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    CryptoUpgradeUnderReviewComposable3.CryptoUpgradeUnderReviewComposable(messageType, (Function0) ((KFunction) objRememberedValue), null, composer2, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.underReview.CryptoUpgradeUnderReviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoUpgradeUnderReviewFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        onDone();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDone() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
    }

    /* compiled from: CryptoUpgradeUnderReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/underReview/CryptoUpgradeUnderReviewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview;", "<init>", "()V", "EXTRA_MESSAGE_TYPE", "", "createFragment", "Lcom/robinhood/android/crypto/ui/upgrade/underReview/CryptoUpgradeUnderReviewFragment;", "key", "newInstance", CryptoUpgradeUnderReviewFragment.EXTRA_MESSAGE_TYPE, "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoUpgradeUnderReview$MessageType;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.CryptoUpgradeUnderReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public CryptoUpgradeUnderReviewFragment createFragment(LegacyFragmentKey.CryptoUpgradeUnderReview key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance(key.getMessageType());
        }

        @JvmStatic
        public final CryptoUpgradeUnderReviewFragment newInstance(LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            CryptoUpgradeUnderReviewFragment cryptoUpgradeUnderReviewFragment = new CryptoUpgradeUnderReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(CryptoUpgradeUnderReviewFragment.EXTRA_MESSAGE_TYPE, messageType);
            cryptoUpgradeUnderReviewFragment.setArguments(bundle);
            return cryptoUpgradeUnderReviewFragment;
        }
    }
}
