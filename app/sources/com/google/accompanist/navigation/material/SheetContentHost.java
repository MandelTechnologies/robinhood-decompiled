package com.google.accompanist.navigation.material;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.NavBackStackEntryProvider2;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SheetContentHost.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aq\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006%\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008a\u0084\u0002²\u0006%\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008a\u0084\u0002"}, m3636d2 = {"SheetContentHost", "", "Landroidx/compose/foundation/layout/ColumnScope;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "onSheetShown", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "entry", "onSheetDismissed", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "navigation-material_release", "currentOnSheetShown", "currentOnSheetDismissed"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.accompanist.navigation.material.SheetContentHostKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class SheetContentHost {
    public static final void SheetContentHost(final Column5 column5, final NavBackStackEntry navBackStackEntry, final ModalBottomSheetState sheetState, final SaveableStateHolder saveableStateHolder, final Function1<? super NavBackStackEntry, Unit> onSheetShown, final Function1<? super NavBackStackEntry, Unit> onSheetDismissed, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(column5, "<this>");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(onSheetShown, "onSheetShown");
        Intrinsics.checkNotNullParameter(onSheetDismissed, "onSheetDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1740714725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1740714725, i, -1, "com.google.accompanist.navigation.material.SheetContentHost (SheetContentHost.kt:53)");
        }
        if (navBackStackEntry != null) {
            EffectsKt.LaunchedEffect(sheetState, navBackStackEntry, new C48291(sheetState, navBackStackEntry, SnapshotStateKt.rememberUpdatedState(onSheetShown, composerStartRestartGroup, (i >> 12) & 14), SnapshotStateKt.rememberUpdatedState(onSheetDismissed, composerStartRestartGroup, (i >> 15) & 14), null), composerStartRestartGroup, ModalBottomSheetState.$stable | 576 | ((i >> 6) & 14));
            NavBackStackEntryProvider2.LocalOwnersProvider(navBackStackEntry, saveableStateHolder, ComposableLambda3.composableLambda(composerStartRestartGroup, -1540712730, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.navigation.material.SheetContentHostKt.SheetContentHost.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1540712730, i2, -1, "com.google.accompanist.navigation.material.SheetContentHost.<anonymous> (SheetContentHost.kt:72)");
                        }
                        NavDestination destination = navBackStackEntry.getDestination();
                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type com.google.accompanist.navigation.material.BottomSheetNavigator.Destination");
                        ((BottomSheetNavigator.Destination) destination).getContent$navigation_material_release().invoke(column5, navBackStackEntry, composer2, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.navigation.material.SheetContentHostKt.SheetContentHost.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SheetContentHost.SheetContentHost(column5, navBackStackEntry, sheetState, saveableStateHolder, onSheetShown, onSheetDismissed, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: SheetContentHost.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.accompanist.navigation.material.SheetContentHostKt$SheetContentHost$1", m3645f = "SheetContentHost.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.google.accompanist.navigation.material.SheetContentHostKt$SheetContentHost$1 */
    static final class C48291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ SnapshotState4<Function1<NavBackStackEntry, Unit>> $currentOnSheetDismissed$delegate;
        final /* synthetic */ SnapshotState4<Function1<NavBackStackEntry, Unit>> $currentOnSheetShown$delegate;
        final /* synthetic */ ModalBottomSheetState $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C48291(ModalBottomSheetState modalBottomSheetState, NavBackStackEntry navBackStackEntry, SnapshotState4<? extends Function1<? super NavBackStackEntry, Unit>> snapshotState4, SnapshotState4<? extends Function1<? super NavBackStackEntry, Unit>> snapshotState42, Continuation<? super C48291> continuation) {
            super(2, continuation);
            this.$sheetState = modalBottomSheetState;
            this.$backStackEntry = navBackStackEntry;
            this.$currentOnSheetShown$delegate = snapshotState4;
            this.$currentOnSheetDismissed$delegate = snapshotState42;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C48291(this.$sheetState, this.$backStackEntry, this.$currentOnSheetShown$delegate, this.$currentOnSheetDismissed$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C48291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<Boolean>() { // from class: com.google.accompanist.navigation.material.SheetContentHostKt.SheetContentHost.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(modalBottomSheetState.isVisible());
                    }
                })), 1);
                final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
                final SnapshotState4<Function1<NavBackStackEntry, Unit>> snapshotState4 = this.$currentOnSheetShown$delegate;
                final SnapshotState4<Function1<NavBackStackEntry, Unit>> snapshotState42 = this.$currentOnSheetDismissed$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.accompanist.navigation.material.SheetContentHostKt.SheetContentHost.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            SheetContentHost.SheetContentHost$lambda$0(snapshotState4).invoke(navBackStackEntry);
                        } else {
                            SheetContentHost.SheetContentHost$lambda$1(snapshotState42).invoke(navBackStackEntry);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDrop.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<NavBackStackEntry, Unit> SheetContentHost$lambda$0(SnapshotState4<? extends Function1<? super NavBackStackEntry, Unit>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<NavBackStackEntry, Unit> SheetContentHost$lambda$1(SnapshotState4<? extends Function1<? super NavBackStackEntry, Unit>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }
}
