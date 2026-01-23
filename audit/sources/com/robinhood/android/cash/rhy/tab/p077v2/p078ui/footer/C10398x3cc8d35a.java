package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.footer;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.cash.rhy.tab.p077v2.RhyOverviewV2ViewState;
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
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.footer.RhyOverviewFooterComposableKt$RhyOverviewFooterComposable$$inlined$ConstraintLayout$1 */
/* loaded from: classes7.dex */
public final class C10398x3cc8d35a extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState4 $debitCardAnimated$delegate$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function0 $openCardSettings$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ Function1 $showTransferMoney$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ SnapshotState4 $transferCtaAnimated$delegate$inlined;
    final /* synthetic */ RhyOverviewV2ViewState $viewState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10398x3cc8d35a(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, RhyOverviewV2ViewState rhyOverviewV2ViewState, Function1 function1, Function0 function0, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$viewState$inlined = rhyOverviewV2ViewState;
        this.$showTransferMoney$inlined = function1;
        this.$openCardSettings$inlined = function0;
        this.$transferCtaAnimated$delegate$inlined = snapshotState4;
        this.$debitCardAnimated$delegate$inlined = snapshotState42;
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
            composer.startReplaceGroup(-786459579);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            composer.startReplaceGroup(2052841480);
            if (this.$viewState$inlined.getCanShowTransferCta()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = RhyOverviewFooterComposable3.INSTANCE;
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RhyOverviewFooterComposable.TransferCta(OffsetKt.m5125offsetVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), 0.0f, RhyOverviewFooterComposable.RhyOverviewFooterComposable$lambda$6(this.$transferCtaAnimated$delegate$inlined), 1, null), this.$showTransferMoney$inlined, composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(2052856159);
            if (this.$viewState$inlined.getIsActiveAccount()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = RhyOverviewFooterComposable4.INSTANCE;
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                RhyOverviewFooterComposable.DebitCard(OffsetKt.m5125offsetVpY3zN4$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), 0.0f, RhyOverviewFooterComposable.RhyOverviewFooterComposable$lambda$5(this.$debitCardAnimated$delegate$inlined), 1, null), this.$openCardSettings$inlined, composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.footer.RhyOverviewFooterComposableKt$RhyOverviewFooterComposable$$inlined$ConstraintLayout$1.1
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
