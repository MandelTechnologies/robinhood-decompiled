package com.robinhood.shared.crypto.transfer.verification;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: VerificationParentFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0007\u001a\u00020\b26\u0010\t\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u000bj\u0002`\u0012¢\u0006\u0002\b\u00110\nH\u0017¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "<init>", "()V", "isCrypto", "", "()Z", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class VerificationParentFragment extends BaseComposeNavHostFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseComposeNavHostFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(VerificationParentFragment verificationParentFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        verificationParentFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return true;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-736525669);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-736525669, i, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentFragment.NavHostComposeContent (VerificationParentFragment.kt:18)");
            }
            VerificationParentComposable3.VerificationParentComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationParentFragment.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: VerificationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentFragment;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<VerificationParentFragment, CryptoTransferVerificationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoTransferVerificationIntentKey getArgs(VerificationParentFragment verificationParentFragment) {
            return (CryptoTransferVerificationIntentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, verificationParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public VerificationParentFragment newInstance(CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey) {
            return (VerificationParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, cryptoTransferVerificationIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(VerificationParentFragment verificationParentFragment, CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, verificationParentFragment, cryptoTransferVerificationIntentKey);
        }
    }
}
