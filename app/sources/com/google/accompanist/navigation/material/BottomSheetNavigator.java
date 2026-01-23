package com.google.accompanist.navigation.material;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolder7;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorState;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BottomSheetNavigator.kt */
@Navigator.Name("BottomSheetNavigator")
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010/\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,¢\u0006\u0002\b.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f07038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00105¨\u0006=²\u0006\u0012\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f078\nX\u008a\u0084\u0002²\u0006\u000e\u0010<\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "Landroidx/navigation/Navigator;", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "Landroidx/compose/material/ModalBottomSheetState;", "sheetState", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;)V", "Landroidx/navigation/NavigatorState;", "state", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "createDestination", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "Landroidx/compose/material/ModalBottomSheetState;", "getSheetState$navigation_material_release", "()Landroidx/compose/material/ModalBottomSheetState;", "<set-?>", "attached$delegate", "Landroidx/compose/runtime/MutableState;", "getAttached", "()Z", "setAttached", "(Z)V", "attached", "Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "navigatorSheetState", "Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "getNavigatorSheetState", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Lkotlin/jvm/functions/Function3;", "getSheetContent", "()Lkotlin/jvm/functions/Function3;", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "", "getTransitionsInProgress$navigation_material_release", "transitionsInProgress", "Destination", "transitionsInProgressEntries", "retainedEntry", "navigation-material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class BottomSheetNavigator extends Navigator<Destination> {
    public static final int $stable = ModalBottomSheetState.$stable;

    /* renamed from: attached$delegate, reason: from kotlin metadata */
    private final SnapshotState attached;
    private final BottomSheetNavigator4 navigatorSheetState;
    private final Function3<Column5, Composer, Integer, Unit> sheetContent;
    private final ModalBottomSheetState sheetState;

    /* renamed from: getSheetState$navigation_material_release, reason: from getter */
    public final ModalBottomSheetState getSheetState() {
        return this.sheetState;
    }

    public BottomSheetNavigator(ModalBottomSheetState sheetState) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        this.sheetState = sheetState;
        this.attached = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.navigatorSheetState = new BottomSheetNavigator4(sheetState);
        this.sheetContent = ComposableLambda3.composableLambdaInstance(2102030527, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                invoke(column5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Column5 column5, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(column5, "$this$null");
                if ((i & 14) == 0) {
                    i |= composer.changed(column5) ? 4 : 2;
                }
                if ((i & 91) != 18 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2102030527, i, -1, "com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.<anonymous> (BottomSheetNavigator.kt:155)");
                    }
                    SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolder7.rememberSaveableStateHolder(composer, 0);
                    final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(this.this$0.getTransitionsInProgress$navigation_material_release(), null, composer, 8, 1);
                    final SnapshotState4 snapshotState4ProduceState = SnapshotStateKt.produceState((Object) null, this.this$0.getBackStack(), new BottomSheetNavigator3(this.this$0, null), composer, 582);
                    composer.startReplaceableGroup(-1918910316);
                    if (invoke$lambda$1(snapshotState4ProduceState) != null) {
                        EffectsKt.LaunchedEffect(invoke$lambda$1(snapshotState4ProduceState), new C48241(this.this$0, null), composer, 72);
                        final BottomSheetNavigator bottomSheetNavigator = this.this$0;
                        BackHandler.BackHandler(false, new Function0<Unit>() { // from class: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1.2
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
                                NavigatorState state = bottomSheetNavigator.getState();
                                NavBackStackEntry navBackStackEntryInvoke$lambda$1 = BottomSheetNavigator2.invoke$lambda$1(snapshotState4ProduceState);
                                Intrinsics.checkNotNull(navBackStackEntryInvoke$lambda$1);
                                state.popWithTransition(navBackStackEntryInvoke$lambda$1, false);
                            }
                        }, composer, 0, 1);
                    }
                    composer.endReplaceableGroup();
                    NavBackStackEntry navBackStackEntryInvoke$lambda$1 = invoke$lambda$1(snapshotState4ProduceState);
                    ModalBottomSheetState sheetState2 = this.this$0.getSheetState();
                    final BottomSheetNavigator bottomSheetNavigator2 = this.this$0;
                    Function1<NavBackStackEntry, Unit> function1 = new Function1<NavBackStackEntry, Unit>() { // from class: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                            invoke2(navBackStackEntry);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(NavBackStackEntry it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Set setInvoke$lambda$0 = BottomSheetNavigator2.invoke$lambda$0(snapshotState4CollectAsState);
                            NavigatorState state = bottomSheetNavigator2.getState();
                            Iterator it2 = setInvoke$lambda$0.iterator();
                            while (it2.hasNext()) {
                                state.markTransitionComplete((NavBackStackEntry) it2.next());
                            }
                        }
                    };
                    final BottomSheetNavigator bottomSheetNavigator3 = this.this$0;
                    SheetContentHost.SheetContentHost(column5, navBackStackEntryInvoke$lambda$1, sheetState2, saveableStateHolderRememberSaveableStateHolder, function1, new Function1<NavBackStackEntry, Unit>() { // from class: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                            invoke2(navBackStackEntry);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(NavBackStackEntry backStackEntry) {
                            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                            if (BottomSheetNavigator2.invoke$lambda$0(snapshotState4CollectAsState).contains(backStackEntry)) {
                                bottomSheetNavigator3.getState().markTransitionComplete(backStackEntry);
                            } else {
                                bottomSheetNavigator3.getState().pop(backStackEntry, false);
                            }
                        }
                    }, composer, (i & 14) | 4160 | (ModalBottomSheetState.$stable << 6));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* compiled from: BottomSheetNavigator.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$1", m3645f = "BottomSheetNavigator.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$1 */
            static final class C48241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ BottomSheetNavigator this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C48241(BottomSheetNavigator bottomSheetNavigator, Continuation<? super C48241> continuation) {
                    super(2, continuation);
                    this.this$0 = bottomSheetNavigator;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C48241(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C48241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ModalBottomSheetState sheetState = this.this$0.getSheetState();
                        this.label = 1;
                        if (sheetState.show(this) == coroutine_suspended) {
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
            public static final Set<NavBackStackEntry> invoke$lambda$0(SnapshotState4<? extends Set<NavBackStackEntry>> snapshotState4) {
                return snapshotState4.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final NavBackStackEntry invoke$lambda$1(SnapshotState4<NavBackStackEntry> snapshotState4) {
                return snapshotState4.getValue();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAttached() {
        return ((Boolean) this.attached.getValue()).booleanValue();
    }

    private final void setAttached(boolean z) {
        this.attached.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        if (getAttached()) {
            return getState().getBackStack();
        }
        return StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
    }

    public final StateFlow<Set<NavBackStackEntry>> getTransitionsInProgress$navigation_material_release() {
        if (getAttached()) {
            return getState().getTransitionsInProgress();
        }
        return StateFlow4.MutableStateFlow(SetsKt.emptySet());
    }

    public final Function3<Column5, Composer, Integer, Unit> getSheetContent() {
        return this.sheetContent;
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onAttach(state);
        setAttached(true);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, BottomSheetNavigator5.INSTANCE.m9190getLambda1$navigation_material_release());
    }

    @Override // androidx.navigation.Navigator
    @SuppressLint({"NewApi"})
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean savedState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        getState().popWithTransition(popUpTo, savedState);
    }

    /* compiled from: BottomSheetNavigator.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fR1\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function4;", "getContent$navigation_material_release", "()Lkotlin/jvm/functions/Function4;", "navigation-material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Destination extends NavDestination implements FloatingWindow {
        private final Function4<Column5, NavBackStackEntry, Composer, Integer, Unit> content;

        public final Function4<Column5, NavBackStackEntry, Composer, Integer, Unit> getContent$navigation_material_release() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Destination(BottomSheetNavigator navigator, Function4<? super Column5, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> content) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }
}
