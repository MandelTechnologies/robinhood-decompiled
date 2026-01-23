package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable6;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistRowComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateWatchlistRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"CreateWatchlistRowComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-lists-ui_externalDebug", "showBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CreateWatchlistRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistRowComposable$lambda$7(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateWatchlistRowComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CreateWatchlistRowComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1062767360);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062767360, i3, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposable (CreateWatchlistRowComposable.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CREATE_NEW_LIST, null, null, null, 59, null), false, false, false, true, false, null, 108, null);
            modifier3 = modifier4;
            UserListRowComposable7.BaseRow baseRow = new UserListRowComposable7.BaseRow(StringResource.INSTANCE.invoke(C39419R.string.create_new_watchlist, new Object[0]), new UserListRowComposable6.BentoIconAsset(ServerToBentoAssetMapper2.PLUS_24), null, null, 4, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateWatchlistRowComposable.CreateWatchlistRowComposable$lambda$4$lambda$3(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            UserListRowComposable5.UserListRowComposable(baseRow, (Function0) objRememberedValue2, modifierAutoLogEvents$default, false, null, composerStartRestartGroup, 48, 24);
            if (CreateWatchlistRowComposable$lambda$1(snapshotState)) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateWatchlistRowComposable.CreateWatchlistRowComposable$lambda$6$lambda$5(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(2056283188, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt.CreateWatchlistRowComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2056283188, i5, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposable.<anonymous> (CreateWatchlistRowComposable.kt:50)");
                        }
                        final SnapshotState<Boolean> snapshotState2 = snapshotState;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-263680558, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt.CreateWatchlistRowComposable.3.1

                            /* compiled from: CreateWatchlistRowComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$CreateWatchlistRowComposable$3$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C507481 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<Boolean> $showBottomSheet$delegate;
                                final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;

                                C507481(RhModalBottomSheet5 rhModalBottomSheet5, SnapshotState<Boolean> snapshotState) {
                                    this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                                    this.$showBottomSheet$delegate = snapshotState;
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
                                        ComposerKt.traceEventStart(-1485661283, i, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposable.<anonymous>.<anonymous>.<anonymous> (CreateWatchlistRowComposable.kt:52)");
                                    }
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$this_RhModalBottomSheet);
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$CreateWatchlistRowComposable$3$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CreateWatchlistRowComposable.C394673.AnonymousClass1.C507481.invoke$lambda$1$lambda$0(rhModalBottomSheet5, (CuratedList) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<Boolean> snapshotState = this.$showBottomSheet$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$CreateWatchlistRowComposable$3$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateWatchlistRowComposable.C394673.AnonymousClass1.C507481.invoke$lambda$3$lambda$2(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    CreateWatchlistComposable.CreateWatchlistComposable(function1, (Function0) objRememberedValue2, null, null, composer, 48, 12);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, CuratedList it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    CreateWatchlistRowComposable.CreateWatchlistRowComposable$lambda$2(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-263680558, i6, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposable.<anonymous>.<anonymous> (CreateWatchlistRowComposable.kt:51)");
                                }
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1485661283, true, new C507481(RhModalBottomSheet, snapshotState2), composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistRowComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateWatchlistRowComposable.CreateWatchlistRowComposable$lambda$7(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateWatchlistRowComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistRowComposable$lambda$4$lambda$3(SnapshotState snapshotState) {
        CreateWatchlistRowComposable$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistRowComposable$lambda$6$lambda$5(SnapshotState snapshotState) {
        CreateWatchlistRowComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final boolean CreateWatchlistRowComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
