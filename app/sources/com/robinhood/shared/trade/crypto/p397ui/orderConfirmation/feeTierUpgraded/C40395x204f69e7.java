package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$1 */
/* loaded from: classes12.dex */
public final class C40395x204f69e7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ CryptoFeeTierUpgradedViewState2 $section$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ CryptoFeeTierUpgradedViewState $viewState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40395x204f69e7(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, CryptoFeeTierUpgradedViewState2 cryptoFeeTierUpgradedViewState2, CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$section$inlined = cryptoFeeTierUpgradedViewState2;
        this.$viewState$inlined = cryptoFeeTierUpgradedViewState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
                this.$compositionSource.setValue(CompositionSource.Content);
            }
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            composer.startReplaceGroup(1917249285);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = C40404x983fb944.INSTANCE;
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay currentTierFeeRateDisplay = ((CryptoFeeTierUpgradedViewState2.Show) this.$section$inlined).getCurrentTierFeeRateDisplay();
            StringResource title = currentTierFeeRateDisplay != null ? currentTierFeeRateDisplay.getTitle() : null;
            composer.startReplaceGroup(-1046518302);
            String string2 = title == null ? null : StringResource2.getString(title, composer, StringResource.$stable);
            composer.endReplaceGroup();
            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay currentTierFeeRateDisplay2 = ((CryptoFeeTierUpgradedViewState2.Show) this.$section$inlined).getCurrentTierFeeRateDisplay();
            String feeRate = currentTierFeeRateDisplay2 != null ? currentTierFeeRateDisplay2.getFeeRate() : null;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal start = companion3.getStart();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            CryptoFeeTierUpgradedComposableKt.m25892FeeRateT042LqI(string2, feeRate, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), start, modifierConstrainAs, composer, 3072, 0);
            LocalShowPlaceholder.Loadable(this.$viewState$inlined.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1610577433, true, new C40405x5b437678(constraintLayoutScope, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component1), composer, 54), composer, 3072, 6);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = C40407x983fc0c6.INSTANCE;
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay nextTierFeeRateDisplay = ((CryptoFeeTierUpgradedViewState2.Show) this.$section$inlined).getNextTierFeeRateDisplay();
            StringResource title2 = nextTierFeeRateDisplay != null ? nextTierFeeRateDisplay.getTitle() : null;
            composer.startReplaceGroup(-1046471230);
            String string3 = title2 == null ? null : StringResource2.getString(title2, composer, StringResource.$stable);
            composer.endReplaceGroup();
            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay nextTierFeeRateDisplay2 = ((CryptoFeeTierUpgradedViewState2.Show) this.$section$inlined).getNextTierFeeRateDisplay();
            CryptoFeeTierUpgradedComposableKt.m25892FeeRateT042LqI(string3, nextTierFeeRateDisplay2 != null ? nextTierFeeRateDisplay2.getFeeRate() : null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), companion3.getEnd(), modifierConstrainAs2, composer, 3072, 0);
            composer.endReplaceGroup();
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                        if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                            snapshotState.setValue(constraintSet3);
                            snapshotState2.setValue(snapshotState.getValue());
                        } else {
                            channel.mo8337trySendJP2dKIU(constraintSet3);
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
