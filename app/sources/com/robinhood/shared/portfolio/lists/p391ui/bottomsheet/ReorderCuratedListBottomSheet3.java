package com.robinhood.shared.portfolio.lists.p391ui.bottomsheet;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo6;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.bottomsheet.ReorderCuratedListBottomSheet3;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReorderCuratedListBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"ReorderCuratedListBottomSheet", "", "curatedListState", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;", "onClick", "Lkotlin/Function0;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReorderCuratedListBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReorderCuratedListBottomSheet$lambda$0(CuratedListState.Loaded loaded, Function0 function0, LazyListState lazyListState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReorderCuratedListBottomSheet(loaded, function0, lazyListState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReorderCuratedListBottomSheet(final CuratedListState.Loaded curatedListState, final Function0<Unit> onClick, final LazyListState listState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(curatedListState, "curatedListState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1866555196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(curatedListState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(listState) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1866555196, i3, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet (ReorderCuratedListBottomSheet.kt:37)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = ((i3 >> 9) & 14) | 805306752;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, ComposableLambda3.rememberComposableLambda(-342224041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt.ReorderCuratedListBottomSheet.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-342224041, i7, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous> (ReorderCuratedListBottomSheet.kt:43)");
                        }
                        final Function0<Unit> function0 = onClick;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-208406164, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt.ReorderCuratedListBottomSheet.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-208406164, i8, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous>.<anonymous> (ReorderCuratedListBottomSheet.kt:44)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer4, i9).m21591getLargeD9Ej5fM());
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), modifierM5145paddingqDBjuR0, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(125380685, true, new C394282(listState, curatedListState), composerStartRestartGroup, 54), composer2, i6, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReorderCuratedListBottomSheet3.ReorderCuratedListBottomSheet$lambda$0(curatedListState, onClick, listState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = ((i3 >> 9) & 14) | 805306752;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, ComposableLambda3.rememberComposableLambda(-342224041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt.ReorderCuratedListBottomSheet.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-342224041, i7, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous> (ReorderCuratedListBottomSheet.kt:43)");
                    }
                    final Function0<Unit> function0 = onClick;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-208406164, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt.ReorderCuratedListBottomSheet.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-208406164, i8, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous>.<anonymous> (ReorderCuratedListBottomSheet.kt:44)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme22.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer4, i9).m21591getLargeD9Ej5fM());
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), modifierM5145paddingqDBjuR0, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(125380685, true, new C394282(listState, curatedListState), composerStartRestartGroup, 54), composer2, i62, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ReorderCuratedListBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt$ReorderCuratedListBottomSheet$2 */
    static final class C394282 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CuratedListState.Loaded $curatedListState;
        final /* synthetic */ LazyListState $listState;

        C394282(LazyListState lazyListState, CuratedListState.Loaded loaded) {
            this.$listState = lazyListState;
            this.$curatedListState = loaded;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(125380685, i2, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous> (ReorderCuratedListBottomSheet.kt:60)");
            }
            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), new NestedScrollModifier() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt.ReorderCuratedListBottomSheet.2.1
                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostFling-RZ2iAVY */
                public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                    return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreFling-QWom1Mo */
                public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                    return super.mo5609onPreFlingQWom1Mo(j, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreScroll-OzD1aCk */
                public /* bridge */ /* synthetic */ long mo5298onPreScrollOzD1aCk(long j, int i3) {
                    return super.mo5298onPreScrollOzD1aCk(j, i3);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostScroll-DzOQY0M */
                public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
                    return Offset.m6537copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
                }
            }, null, 2, null);
            LazyListState lazyListState = this.$listState;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$curatedListState);
            final CuratedListState.Loaded loaded = this.$curatedListState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt$ReorderCuratedListBottomSheet$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReorderCuratedListBottomSheet3.C394282.invoke$lambda$2$lambda$1(loaded, (ReorderableLazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierNestedScroll$default, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final CuratedListState.Loaded loaded, ReorderableLazyListScope ReorderableLazyColumn) {
            Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
            LazyListScope.stickyHeader$default(ReorderableLazyColumn, null, null, ReorderCuratedListBottomSheet.INSTANCE.m25606getLambda$2037998069$lib_lists_ui_externalDebug(), 3, null);
            ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, loaded.getReorderableListState(), "CuratedListItems", new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt$ReorderCuratedListBottomSheet$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderCuratedListBottomSheet3.C394282.invoke$lambda$2$lambda$1$lambda$0(((Integer) obj).intValue(), (CuratedListDuxo7) obj2);
                }
            }, null, false, false, ComposableLambda3.composableLambdaInstance(2084957413, true, new Function6<LazyItemScope, CuratedListDuxo7, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheetKt$ReorderCuratedListBottomSheet$2$2$1$2
                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, CuratedListDuxo7 curatedListDuxo7, Integer num, Boolean bool, Composer composer, Integer num2) {
                    invoke(lazyItemScope, curatedListDuxo7, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope reorderableItems, CuratedListDuxo7 reorderableCuratedItem, int i, boolean z, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                    Intrinsics.checkNotNullParameter(reorderableCuratedItem, "reorderableCuratedItem");
                    if ((i2 & 48) == 0) {
                        i3 = ((i2 & 64) == 0 ? composer.changed(reorderableCuratedItem) : composer.changedInstance(reorderableCuratedItem) ? 32 : 16) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 3072) == 0) {
                        i3 |= composer.changed(z) ? 2048 : 1024;
                    }
                    if ((i3 & 9233) == 9232 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2084957413, i3, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ReorderCuratedListBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderCuratedListBottomSheet.kt:89)");
                    }
                    composer.startReplaceGroup(-2105650771);
                    Modifier modifierM4872backgroundbw27NRU$default = z ? Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null) : Modifier.INSTANCE;
                    composer.endReplaceGroup();
                    int i4 = i3;
                    CuratedListComposable5.CuratedListItem(reorderableCuratedItem, loaded, false, modifierM4872backgroundbw27NRU$default, false, ServerToBentoAssetMapper2.DRAG_16, null, null, composer, ((i4 >> 3) & 14) | 221568, 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 56, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invoke$lambda$2$lambda$1$lambda$0(int i, CuratedListDuxo7 curatedItem) {
            Intrinsics.checkNotNullParameter(curatedItem, "curatedItem");
            return CuratedListDuxo6.toListRecord(curatedItem).getListType().name() + PlaceholderUtils.XXShortPlaceholderText + curatedItem.getId();
        }
    }
}
