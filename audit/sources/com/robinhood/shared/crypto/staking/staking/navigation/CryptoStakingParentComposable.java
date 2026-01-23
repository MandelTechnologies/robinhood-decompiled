package com.robinhood.shared.crypto.staking.staking.navigation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposable;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoStakingParentComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"CryptoStakingParentComposable", "", "initArgs", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingParentComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingParentComposable$lambda$0(CryptoStakingIntentKey cryptoStakingIntentKey, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoStakingParentComposable(cryptoStakingIntentKey, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoStakingParentComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposableKt$CryptoStakingParentComposable$1 */
    static final class C378361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoStakingIntentKey $initArgs;
        final /* synthetic */ Modifier $modifier;

        C378361(CryptoStakingIntentKey cryptoStakingIntentKey, Modifier modifier) {
            this.$initArgs = cryptoStakingIntentKey;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(867563919, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposable.<anonymous> (CryptoStakingParentComposable.kt:16)");
            }
            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composer, 0);
            StakingNavDests6 stakingNavDests6 = StakingNavDests6.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$initArgs);
            final CryptoStakingIntentKey cryptoStakingIntentKey = this.$initArgs;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposableKt$CryptoStakingParentComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingParentComposable.C378361.invoke$lambda$1$lambda$0(cryptoStakingIntentKey, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GenericNavHost.m20570GenericNavHostuDo3WH8(navHostControllerRememberNavController, extensions2.persistentSetOf((Function2) objRememberedValue), stakingNavDests6, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), this.$modifier, composer, ComposableDestination.$stable << 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoStakingIntentKey cryptoStakingIntentKey, NavGraphBuilder persistentSetOf, NavHostController controller) {
            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
            Intrinsics.checkNotNullParameter(controller, "controller");
            StakingNavGraph5.stakingNavGraph(persistentSetOf, controller, cryptoStakingIntentKey);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingParentComposable(final CryptoStakingIntentKey initArgs, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1703153705);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(initArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1703153705, i3, -1, "com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposable (CryptoStakingParentComposable.kt:14)");
                }
                modifier3 = modifier4;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(867563919, true, new C378361(initArgs, modifier4), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.CryptoStakingParentComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingParentComposable.CryptoStakingParentComposable$lambda$0(initArgs, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(867563919, true, new C378361(initArgs, modifier4), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
