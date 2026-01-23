package com.robinhood.android.futures.sharedfuturesui.contextualbar;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData;
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
/* renamed from: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C17455x6e7ef636 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function0 $onPrimaryClick$inlined;
    final /* synthetic */ Function0 $onSecondaryClick$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ FtuxContextualBarData $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17455x6e7ef636(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, FtuxContextualBarData ftuxContextualBarData, Function0 function0, Function0 function02) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = ftuxContextualBarData;
        this.$onPrimaryClick$inlined = function0;
        this.$onSecondaryClick$inlined = function02;
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
            composer.startReplaceGroup(-25052156);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            constraintLayoutScope.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
            FtuxContextualBarData.ButtonType secondaryButton = this.$state$inlined.getSecondaryButton();
            composer.startReplaceGroup(1246122355);
            if (secondaryButton != null) {
                composer.startReplaceGroup(1246126725);
                Function0 function0 = this.$onSecondaryClick$inlined;
                if (function0 == null) {
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = FuturesFtuxContextualBar4.INSTANCE;
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new FuturesFtuxContextualBar5(constraintLayoutBaseScope4Component2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                FuturesFtuxContextualBar3.ContextualBarButton(secondaryButton, function0, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2), composer, 0, 0);
            }
            composer.endReplaceGroup();
            FtuxContextualBarData.ButtonType primaryButton = this.$state$inlined.getPrimaryButton();
            Function0 function02 = this.$onPrimaryClick$inlined;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new FuturesFtuxContextualBar6(constraintLayoutBaseScope4Component1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            FuturesFtuxContextualBar3.ContextualBarButton(primaryButton, function02, constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue3), composer, 0, 0);
            composer.endReplaceGroup();
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBarKt$FuturesFtuxContextualBar$2$invoke$lambda$5$$inlined$ConstraintLayout$1.1
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
                composer.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
