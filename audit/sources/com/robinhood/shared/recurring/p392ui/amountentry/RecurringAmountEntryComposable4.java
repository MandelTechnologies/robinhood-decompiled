package com.robinhood.shared.recurring.p392ui.amountentry;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadState;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon7;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputState;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoTickerInputComposable2;
import com.robinhood.shared.recurring.p392ui.C39558R;
import com.robinhood.shared.recurring.p392ui.amountentry.RecurringAmountEntryComposable4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecurringAmountEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"RecurringAmountEntryComposable", "", "state", "Lcom/robinhood/shared/recurring/ui/amountentry/RecurringAmountEntryState;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "primaryButtonOnClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/recurring/ui/amountentry/RecurringAmountEntryState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringAmountEntryComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-recurring-ui_externalDebug", "showBuyingPowerBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecurringAmountEntryComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposable$lambda$10(RecurringAmountEntryState recurringAmountEntryState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringAmountEntryComposable(recurringAmountEntryState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposablePreview$lambda$11(int i, Composer composer, int i2) {
        RecurringAmountEntryComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringAmountEntryComposable(final RecurringAmountEntryState state, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> primaryButtonOnClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(152189199);
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
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152189199, i3, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable (RecurringAmountEntryComposable.kt:52)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier4 = modifier2;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-581828198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-581828198, i5, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous> (RecurringAmountEntryComposable.kt:56)");
                        }
                        Modifier modifier5 = modifier4;
                        final RecurringAmountEntryState recurringAmountEntryState = state;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-63013026, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-63013026, i6, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:59)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                final RecurringAmountEntryState recurringAmountEntryState2 = recurringAmountEntryState;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(382970379, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i7) {
                                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(382970379, i7, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:62)");
                                        }
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        RecurringAmountEntryState recurringAmountEntryState3 = recurringAmountEntryState2;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer5, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        StringResource title = recurringAmountEntryState3.getTitle();
                                        int i8 = StringResource.$stable;
                                        String string2 = StringResource2.getString(title, composer5, i8);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer5, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i9).getTextM(), composer5, 0, 0, 8186);
                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(recurringAmountEntryState3.getSubtitle(), composer5, i8), null, Color.m6701boximpl(bentoTheme.getColors(composer5, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i9).getTextS(), composer5, 0, 0, 8186);
                                        composer5.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(317623391, true, new AnonymousClass2(recurringAmountEntryState), composer4, 54), null, null, false, false, appBarType, null, 0L, null, composer4, 12583350, 0, 1912);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: RecurringAmountEntryComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ RecurringAmountEntryState $state;

                                AnonymousClass2(RecurringAmountEntryState recurringAmountEntryState) {
                                    this.$state = recurringAmountEntryState;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(317623391, i, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:76)");
                                    }
                                    OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                                    final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                                    NavigationType navigationType = this.$state.getNavigationType();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RecurringAmountEntryComposable4.C395651.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, null, 0L, composer, 0, 12);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    if (onBackPressedDispatcher != null) {
                                        onBackPressedDispatcher.onBackPressed();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1996909471, true, new AnonymousClass2(state, snapshotState, onKeyPress, primaryButtonOnClick), composer3, 54);
                        final RecurringAmountEntryState recurringAmountEntryState2 = state;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1009736425, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.3
                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer4.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1009736425, i6, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:108)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                RecurringAmountEntryState recurringAmountEntryState3 = recurringAmountEntryState2;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                CryptoTickerInputComposable2.CryptoAmountInputComposable(recurringAmountEntryState3.getAmount(), null, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), composer4, CryptoAmountInputState.$stable | 48, 0);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RecurringAmountEntryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
                        final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
                        final /* synthetic */ SnapshotState<Boolean> $showBuyingPowerBottomSheet$delegate;
                        final /* synthetic */ RecurringAmountEntryState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(RecurringAmountEntryState recurringAmountEntryState, SnapshotState<Boolean> snapshotState, Function1<? super KeyEvent, Unit> function1, Function0<Unit> function0) {
                            this.$state = recurringAmountEntryState;
                            this.$showBuyingPowerBottomSheet$delegate = snapshotState;
                            this.$onKeyPress = function1;
                            this.$primaryButtonOnClick = function0;
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
                                ComposerKt.traceEventStart(1996909471, i, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:86)");
                            }
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            RecurringAmountEntryState recurringAmountEntryState = this.$state;
                            final SnapshotState<Boolean> snapshotState = this.$showBuyingPowerBottomSheet$delegate;
                            Function1<KeyEvent, Unit> function1 = this.$onKeyPress;
                            Function0<Unit> function0 = this.$primaryButtonOnClick;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                            String str = null;
                            FontStyle fontStyle = null;
                            FontWeight fontWeight = null;
                            TextDecoration textDecoration = null;
                            TextAlign textAlign = null;
                            int i3 = 0;
                            boolean z = false;
                            int i4 = 0;
                            int i5 = 0;
                            TextStyle textStyle = null;
                            boolean z2 = false;
                            C2002Dp c2002Dp = null;
                            BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7 = null;
                            boolean z3 = false;
                            BentoTextWithTrailingIconState bentoTextWithTrailingIcon4 = new BentoTextWithTrailingIconState(StringResource2.getString(recurringAmountEntryState.getBuyingPower(), composer, StringResource.$stable), new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), str, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), fontStyle, fontWeight, textDecoration, textAlign, i3, z, i4, i5, textStyle, z2, c2002Dp, bentoTextWithTrailingIcon7, z3, 262112, null);
                            composer.startReplaceGroup(5004770);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringAmountEntryComposable4.C395651.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIcon4, modifierM5144paddingVpY3zN4$default, null, (Function0) objRememberedValue, composer, BentoTextWithTrailingIconState.$stable | 3072, 4);
                            composer.startReplaceGroup(1585138202);
                            BentoNumpad4.INSTANCE.BentoNumpadWithButton(recurringAmountEntryState.getNumpadState(), null, function1, function0, composer, BentoNumpadState.$stable | (BentoNumpad4.$stable << 12), 2);
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$1$lambda$0(SnapshotState snapshotState) {
                            RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$2(snapshotState, true);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (RecurringAmountEntryComposable$lambda$1(snapshotState)) {
                    composer2 = composerStartRestartGroup;
                } else {
                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState, coroutineScope, new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$4$lambda$3(snapshotState);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final RhModalBottomSheet5 rhModalBottomSheet5 = (RhModalBottomSheet5) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke = companion2.invoke(C39558R.string.recurring_amount_buying_power_info_title, new Object[0]);
                    int i5 = StringResource.$stable;
                    String string2 = StringResource2.getString(stringResourceInvoke, composerStartRestartGroup, i5);
                    String string3 = StringResource2.getString(state.getBottomSheetDescription(), composerStartRestartGroup, i5);
                    String string4 = StringResource2.getString(companion2.invoke(C39558R.string.recurring_amount_buying_power_info_ok_button, new Object[0]), composerStartRestartGroup, i5);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(rhModalBottomSheet5);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$7$lambda$6(rhModalBottomSheet5, snapshotState, (RhModalBottomSheet5) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$9$lambda$8(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    RhContentBottomSheet2.RhContentBottomSheet(string2, string3, string4, function1, (Function0) objRememberedValue5, null, null, null, null, false, sheetStateRememberModalBottomSheetState, rhModalBottomSheet5, composer2, 14180352, RhModalBottomSheet5.$stable << 3, 800);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$10(state, onKeyPress, primaryButtonOnClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifier42 = modifier2;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-581828198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i52) {
                    if ((i52 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-581828198, i52, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous> (RecurringAmountEntryComposable.kt:56)");
                    }
                    Modifier modifier5 = modifier42;
                    final RecurringAmountEntryState recurringAmountEntryState = state;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-63013026, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-63013026, i6, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:59)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                            final RecurringAmountEntryState recurringAmountEntryState2 = recurringAmountEntryState;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(382970379, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i7) {
                                    if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(382970379, i7, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:62)");
                                    }
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    RecurringAmountEntryState recurringAmountEntryState3 = recurringAmountEntryState2;
                                    Modifier.Companion companion22 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer5, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion22);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    StringResource title = recurringAmountEntryState3.getTitle();
                                    int i8 = StringResource.$stable;
                                    String string22 = StringResource2.getString(title, composer5, i8);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string22, null, Color.m6701boximpl(bentoTheme.getColors(composer5, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i9).getTextM(), composer5, 0, 0, 8186);
                                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(recurringAmountEntryState3.getSubtitle(), composer5, i8), null, Color.m6701boximpl(bentoTheme.getColors(composer5, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i9).getTextS(), composer5, 0, 0, 8186);
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(317623391, true, new AnonymousClass2(recurringAmountEntryState), composer4, 54), null, null, false, false, appBarType, null, 0L, null, composer4, 12583350, 0, 1912);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RecurringAmountEntryComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ RecurringAmountEntryState $state;

                            AnonymousClass2(RecurringAmountEntryState recurringAmountEntryState) {
                                this.$state = recurringAmountEntryState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(317623391, i, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:76)");
                                }
                                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                                final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                                NavigationType navigationType = this.$state.getNavigationType();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringAmountEntryComposable4.C395651.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, null, 0L, composer, 0, 12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1996909471, true, new AnonymousClass2(state, snapshotState, onKeyPress, primaryButtonOnClick), composer3, 54);
                    final RecurringAmountEntryState recurringAmountEntryState2 = state;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1009736425, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt.RecurringAmountEntryComposable.1.3
                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i6 |= composer4.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1009736425, i6, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:108)");
                            }
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null), paddingValues);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            RecurringAmountEntryState recurringAmountEntryState3 = recurringAmountEntryState2;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CryptoTickerInputComposable2.CryptoAmountInputComposable(recurringAmountEntryState3.getAmount(), null, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), composer4, CryptoAmountInputState.$stable | 48, 0);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54), composer3, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RecurringAmountEntryComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
                    final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
                    final /* synthetic */ SnapshotState<Boolean> $showBuyingPowerBottomSheet$delegate;
                    final /* synthetic */ RecurringAmountEntryState $state;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(RecurringAmountEntryState recurringAmountEntryState, SnapshotState<Boolean> snapshotState, Function1<? super KeyEvent, Unit> function1, Function0<Unit> function0) {
                        this.$state = recurringAmountEntryState;
                        this.$showBuyingPowerBottomSheet$delegate = snapshotState;
                        this.$onKeyPress = function1;
                        this.$primaryButtonOnClick = function0;
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
                            ComposerKt.traceEventStart(1996909471, i, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposable.<anonymous>.<anonymous> (RecurringAmountEntryComposable.kt:86)");
                        }
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        RecurringAmountEntryState recurringAmountEntryState = this.$state;
                        final SnapshotState snapshotState = this.$showBuyingPowerBottomSheet$delegate;
                        Function1<KeyEvent, Unit> function1 = this.$onKeyPress;
                        Function0<Unit> function0 = this.$primaryButtonOnClick;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                        String str = null;
                        FontStyle fontStyle = null;
                        FontWeight fontWeight = null;
                        TextDecoration textDecoration = null;
                        TextAlign textAlign = null;
                        int i3 = 0;
                        boolean z = false;
                        int i4 = 0;
                        int i5 = 0;
                        TextStyle textStyle = null;
                        boolean z2 = false;
                        C2002Dp c2002Dp = null;
                        BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7 = null;
                        boolean z3 = false;
                        BentoTextWithTrailingIconState bentoTextWithTrailingIcon4 = new BentoTextWithTrailingIconState(StringResource2.getString(recurringAmountEntryState.getBuyingPower(), composer, StringResource.$stable), new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), str, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), fontStyle, fontWeight, textDecoration, textAlign, i3, z, i4, i5, textStyle, z2, c2002Dp, bentoTextWithTrailingIcon7, z3, 262112, null);
                        composer.startReplaceGroup(5004770);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$RecurringAmountEntryComposable$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringAmountEntryComposable4.C395651.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIcon4, modifierM5144paddingVpY3zN4$default, null, (Function0) objRememberedValue, composer, BentoTextWithTrailingIconState.$stable | 3072, 4);
                        composer.startReplaceGroup(1585138202);
                        BentoNumpad4.INSTANCE.BentoNumpadWithButton(recurringAmountEntryState.getNumpadState(), null, function1, function0, composer, BentoNumpadState.$stable | (BentoNumpad4.$stable << 12), 2);
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$1$lambda$0(SnapshotState snapshotState) {
                        RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$2(snapshotState, true);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (RecurringAmountEntryComposable$lambda$1(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecurringAmountEntryComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean RecurringAmountEntryComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposable$lambda$4$lambda$3(SnapshotState snapshotState) {
        RecurringAmountEntryComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposable$lambda$7$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, final SnapshotState snapshotState, RhModalBottomSheet5 RhContentBottomSheet) {
        Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
        rhModalBottomSheet5.hideBottomSheet(new Function0() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringAmountEntryComposable4.RecurringAmountEntryComposable$lambda$7$lambda$6$lambda$5(snapshotState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposable$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
        RecurringAmountEntryComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringAmountEntryComposable$lambda$9$lambda$8(SnapshotState snapshotState) {
        RecurringAmountEntryComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void RecurringAmountEntryComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1495168639);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1495168639, i, -1, "com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposablePreview (RecurringAmountEntryComposable.kt:157)");
            }
            CompositionLocal3.CompositionLocalProvider(InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), RecurringAmountEntryComposable.INSTANCE.m25633getLambda$1198490431$lib_recurring_ui_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.amountentry.RecurringAmountEntryComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAmountEntryComposable4.RecurringAmountEntryComposablePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
