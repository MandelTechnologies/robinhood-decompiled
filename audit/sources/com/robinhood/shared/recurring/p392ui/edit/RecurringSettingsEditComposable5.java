package com.robinhood.shared.recurring.p392ui.edit;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.recurring.p392ui.edit.RecurringSettingsEditComposable5;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringSettingsEditComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"RecurringSettingsEditComposable", "", "state", "Lcom/robinhood/shared/recurring/ui/edit/RecurringSettingsEditState;", "onPrimaryButtonClicked", "Lkotlin/Function0;", "onSecondaryButtonClicked", "onRowTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/recurring/ui/edit/RecurringSettingsEditState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringSettingsEditComposablePreview", "(Lcom/robinhood/shared/recurring/ui/edit/RecurringSettingsEditState;Landroidx/compose/runtime/Composer;I)V", "lib-recurring-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecurringSettingsEditComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringSettingsEditComposable$lambda$0(RecurringSettingsEditState recurringSettingsEditState, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringSettingsEditComposable(recurringSettingsEditState, function0, function02, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringSettingsEditComposablePreview$lambda$1(RecurringSettingsEditState recurringSettingsEditState, int i, Composer composer, int i2) {
        RecurringSettingsEditComposablePreview(recurringSettingsEditState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringSettingsEditComposable(final RecurringSettingsEditState state, final Function0<Unit> onPrimaryButtonClicked, final Function0<Unit> onSecondaryButtonClicked, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onRowTap, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClicked, "onSecondaryButtonClicked");
        Intrinsics.checkNotNullParameter(onRowTap, "onRowTap");
        Composer composerStartRestartGroup = composer.startRestartGroup(-663892164);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowTap) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663892164, i3, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable (RecurringSettingsEditComposable.kt:42)");
                }
                int i5 = ((i3 >> 12) & 14) | 805306800;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, RecurringSettingsEditComposable.INSTANCE.getLambda$122750464$lib_recurring_ui_externalDebug(), ComposableLambda3.rememberComposableLambda(-445221759, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt.RecurringSettingsEditComposable.1
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
                            ComposerKt.traceEventStart(-445221759, i6, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous> (RecurringSettingsEditComposable.kt:58)");
                        }
                        if (state.getButtonsVisible()) {
                            Boolean bool = Boolean.TRUE;
                            final RecurringSettingsEditState recurringSettingsEditState = state;
                            final Function0<Unit> function0 = onPrimaryButtonClicked;
                            final Function0<Unit> function02 = onSecondaryButtonClicked;
                            BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-2084711468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt.RecurringSettingsEditComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2084711468, i7, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous>.<anonymous> (RecurringSettingsEditComposable.kt:60)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()));
                                    RecurringSettingsEditState recurringSettingsEditState2 = recurringSettingsEditState;
                                    Function0<Unit> function03 = function0;
                                    Function0<Unit> function04 = function02;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierNavigationBarsPadding);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    StringResource primaryButtonText = recurringSettingsEditState2.getPrimaryButtonText();
                                    int i9 = StringResource.$stable;
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResource2.getString(primaryButtonText, composer4, i9), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, recurringSettingsEditState2.getPrimaryButtonType(), false, recurringSettingsEditState2.getButtonsLoading(), null, null, null, null, false, null, composer4, 384, 0, 8104);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM()), composer4, 0);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResource2.getString(recurringSettingsEditState2.getSecondaryButtonText(), composer4, i9), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, recurringSettingsEditState2.getButtonsLoading(), null, null, null, null, false, null, composer4, 24960, 0, 8104);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1834035787, true, new C395972(state, onRowTap), composerStartRestartGroup, 54), composer2, i5, 504);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringSettingsEditComposable5.RecurringSettingsEditComposable$lambda$0(state, onPrimaryButtonClicked, onSecondaryButtonClicked, onRowTap, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 12) & 14) | 805306800;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, RecurringSettingsEditComposable.INSTANCE.getLambda$122750464$lib_recurring_ui_externalDebug(), ComposableLambda3.rememberComposableLambda(-445221759, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt.RecurringSettingsEditComposable.1
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
                        ComposerKt.traceEventStart(-445221759, i6, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous> (RecurringSettingsEditComposable.kt:58)");
                    }
                    if (state.getButtonsVisible()) {
                        Boolean bool = Boolean.TRUE;
                        final RecurringSettingsEditState recurringSettingsEditState = state;
                        final Function0<Unit> function0 = onPrimaryButtonClicked;
                        final Function0<Unit> function02 = onSecondaryButtonClicked;
                        BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-2084711468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt.RecurringSettingsEditComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2084711468, i7, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous>.<anonymous> (RecurringSettingsEditComposable.kt:60)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()));
                                RecurringSettingsEditState recurringSettingsEditState2 = recurringSettingsEditState;
                                Function0<Unit> function03 = function0;
                                Function0<Unit> function04 = function02;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierNavigationBarsPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                StringResource primaryButtonText = recurringSettingsEditState2.getPrimaryButtonText();
                                int i9 = StringResource.$stable;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResource2.getString(primaryButtonText, composer4, i9), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, recurringSettingsEditState2.getPrimaryButtonType(), false, recurringSettingsEditState2.getButtonsLoading(), null, null, null, null, false, null, composer4, 384, 0, 8104);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM()), composer4, 0);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResource2.getString(recurringSettingsEditState2.getSecondaryButtonText(), composer4, i9), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, recurringSettingsEditState2.getButtonsLoading(), null, null, null, null, false, null, composer4, 24960, 0, 8104);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1834035787, true, new C395972(state, onRowTap), composerStartRestartGroup, 54), composer2, i52, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: RecurringSettingsEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2 */
    static final class C395972 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function1<CryptoOrderReviewRowState.TapAction, Unit> $onRowTap;
        final /* synthetic */ RecurringSettingsEditState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C395972(RecurringSettingsEditState recurringSettingsEditState, Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function1) {
            this.$state = recurringSettingsEditState;
            this.$onRowTap = function1;
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
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1834035787, i2, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous> (RecurringSettingsEditComposable.kt:85)");
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onRowTap);
            final RecurringSettingsEditState recurringSettingsEditState = this.$state;
            final Function1<CryptoOrderReviewRowState.TapAction, Unit> function1 = this.$onRowTap;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringSettingsEditComposable5.C395972.invoke$lambda$2$lambda$1(recurringSettingsEditState, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final RecurringSettingsEditState recurringSettingsEditState, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1294262826, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1294262826, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringSettingsEditComposable.kt:92)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(recurringSettingsEditState.getTitle(), composer, StringResource.$stable), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final ImmutableList<CryptoOrderReviewRowState> rows = recurringSettingsEditState.getRows();
            final C39589x31b56c77 c39589x31b56c77 = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(CryptoOrderReviewRowState cryptoOrderReviewRowState) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CryptoOrderReviewRowState) obj);
                }
            };
            LazyColumn.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c39589x31b56c77.invoke(rows.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposable$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    CryptoOrderReviewRowState cryptoOrderReviewRowState = (CryptoOrderReviewRowState) rows.get(i);
                    composer.startReplaceGroup(-704568464);
                    CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState, null, function1, composer, CryptoOrderReviewRowState.$stable, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RecurringSettingsEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposablePreview$1 */
    static final class C395991 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RecurringSettingsEditState $state;

        C395991(RecurringSettingsEditState recurringSettingsEditState) {
            this.$state = recurringSettingsEditState;
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
                ComposerKt.traceEventStart(1150846572, i, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposablePreview.<anonymous> (RecurringSettingsEditComposable.kt:124)");
            }
            RecurringSettingsEditState recurringSettingsEditState = this.$state;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposablePreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposablePreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$RecurringSettingsEditComposablePreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringSettingsEditComposable5.C395991.invoke$lambda$5$lambda$4((CryptoOrderReviewRowState.TapAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            int i2 = StringResource.$stable;
            RecurringSettingsEditComposable5.RecurringSettingsEditComposable(recurringSettingsEditState, function0, function02, function1, null, composer, i2 | CryptoOrderReviewRowState.$stable | i2 | i2 | 3504, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CryptoOrderReviewRowState.TapAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void RecurringSettingsEditComposablePreview(final RecurringSettingsEditState recurringSettingsEditState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-420989260);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(recurringSettingsEditState) : composerStartRestartGroup.changedInstance(recurringSettingsEditState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-420989260, i2, -1, "com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposablePreview (RecurringSettingsEditComposable.kt:122)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1150846572, true, new C395991(recurringSettingsEditState), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.edit.RecurringSettingsEditComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringSettingsEditComposable5.RecurringSettingsEditComposablePreview$lambda$1(recurringSettingsEditState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
