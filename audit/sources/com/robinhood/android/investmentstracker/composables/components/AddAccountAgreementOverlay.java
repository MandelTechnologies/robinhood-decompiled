package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddAccountAgreementOverlay.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"AddAccountAgreementOverlay", "", "viewModel", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "onBackClicked", "Lkotlin/Function0;", "onAgreeClicked", "Lkotlin/Function1;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "onUriClicked", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug", "agreeEnabled", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AddAccountAgreementOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddAccountAgreementOverlay$lambda$3(InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, Function0 function0, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddAccountAgreementOverlay(investmentsTrackerAgreementViewModel, function0, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddAccountAgreementOverlay(final InvestmentsTrackerAgreementViewModel viewModel, final Function0<Unit> onBackClicked, final Function1<? super InvestmentsTrackerGetAgreementResponseDto, Unit> onAgreeClicked, final Function1<? super String, Unit> onUriClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onAgreeClicked, "onAgreeClicked");
        Intrinsics.checkNotNullParameter(onUriClicked, "onUriClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-123856791);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAgreeClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUriClicked) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-123856791, i4, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay (AddAccountAgreementOverlay.kt:43)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                final Screen screen = new Screen(Screen.Name.INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT, null, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(-2130229723, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt.AddAccountAgreementOverlay.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AddAccountAgreementOverlay.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackClicked;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onBackClicked = function0;
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
                                ComposerKt.traceEventStart(-1036058108, i, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous>.<anonymous> (AddAccountAgreementOverlay.kt:52)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_LEFT_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackClicked);
                            final Function0<Unit> function0 = this.$onBackClicked;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddAccountAgreementOverlay.C195241.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2130229723, i6, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous> (AddAccountAgreementOverlay.kt:50)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AddAccountAgreementOverlay3.INSTANCE.getLambda$1381087960$feature_investments_tracker_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1036058108, true, new AnonymousClass1(onBackClicked), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1229161788, true, new C195252(screen, viewModel, onAgreeClicked, snapshotState), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-178062278, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt.AddAccountAgreementOverlay.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(padding) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178062278, i7, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous> (AddAccountAgreementOverlay.kt:92)");
                        }
                        Integer numValueOf = Integer.valueOf(scrollStateRememberScrollState.getValue());
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged = composer3.changed(scrollStateRememberScrollState);
                        ScrollState scrollState = scrollStateRememberScrollState;
                        SnapshotState<Boolean> snapshotState2 = snapshotState;
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new AddAccountAgreementOverlay2(scrollState, snapshotState2, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ScrollKt.verticalScroll$default(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), padding), scrollStateRememberScrollState, false, null, false, 14, null), new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = viewModel;
                        Function1<String, Unit> function1 = onUriClicked;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(investmentsTrackerAgreementViewModel.getResponse().getTitle(), PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), null, null, FontWeight.INSTANCE.getW500(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 24576, 0, 8172);
                        BentoMarkdownText2.BentoMarkdownText(investmentsTrackerAgreementViewModel.getResponse().getAgreement_text(), PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i8).getTextS(), 0, bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, function1, composer3, MarkdownStyle.$stable << 6, 8);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 805306800, 504);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddAccountAgreementOverlay.AddAccountAgreementOverlay$lambda$3(viewModel, onBackClicked, onAgreeClicked, onUriClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            final Screen screen2 = new Screen(Screen.Name.INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT, null, null, null, 14, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(-2130229723, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt.AddAccountAgreementOverlay.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: AddAccountAgreementOverlay.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $onBackClicked;

                    AnonymousClass1(Function0<Unit> function0) {
                        this.$onBackClicked = function0;
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
                            ComposerKt.traceEventStart(-1036058108, i, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous>.<anonymous> (AddAccountAgreementOverlay.kt:52)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_LEFT_24);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.$onBackClicked);
                        final Function0 function0 = this.$onBackClicked;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddAccountAgreementOverlay.C195241.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2130229723, i6, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous> (AddAccountAgreementOverlay.kt:50)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(AddAccountAgreementOverlay3.INSTANCE.getLambda$1381087960$feature_investments_tracker_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1036058108, true, new AnonymousClass1(onBackClicked), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1229161788, true, new C195252(screen2, viewModel, onAgreeClicked, snapshotState2), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-178062278, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt.AddAccountAgreementOverlay.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues padding, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(padding, "padding");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(padding) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-178062278, i7, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous> (AddAccountAgreementOverlay.kt:92)");
                    }
                    Integer numValueOf = Integer.valueOf(scrollStateRememberScrollState2.getValue());
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged = composer3.changed(scrollStateRememberScrollState2);
                    ScrollState scrollState = scrollStateRememberScrollState2;
                    SnapshotState<Boolean> snapshotState22 = snapshotState2;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new AddAccountAgreementOverlay2(scrollState, snapshotState22, null);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ScrollKt.verticalScroll$default(PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), padding), scrollStateRememberScrollState2, false, null, false, 14, null), new UserInteractionEventDescriptor(null, screen2, null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = viewModel;
                    Function1<String, Unit> function1 = onUriClicked;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(investmentsTrackerAgreementViewModel.getResponse().getTitle(), PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), null, null, FontWeight.INSTANCE.getW500(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 24576, 0, 8172);
                    BentoMarkdownText2.BentoMarkdownText(investmentsTrackerAgreementViewModel.getResponse().getAgreement_text(), PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i8).getTextS(), 0, bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, function1, composer3, MarkdownStyle.$stable << 6, 8);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 805306800, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddAccountAgreementOverlay$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: AddAccountAgreementOverlay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$2 */
    static final class C195252 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $agreeEnabled$delegate;
        final /* synthetic */ Function1<InvestmentsTrackerGetAgreementResponseDto, Unit> $onAgreeClicked;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ InvestmentsTrackerAgreementViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        C195252(Screen screen, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, Function1<? super InvestmentsTrackerGetAgreementResponseDto, Unit> function1, SnapshotState<Boolean> snapshotState) {
            this.$screen = screen;
            this.$viewModel = investmentsTrackerAgreementViewModel;
            this.$onAgreeClicked = function1;
            this.$agreeEnabled$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-1229161788, i, -1, "com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay.<anonymous> (AddAccountAgreementOverlay.kt:66)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), new UserInteractionEventDescriptor(null, this.$screen, null, null, new Component(null, "InvestmentsTracker_AGREE", null, 5, null), null, 45, null), true, false, false, true, false, null, 108, null);
            BentoButtonState bentoButtonState = new BentoButtonState(this.$viewModel.getResponse().getPrimary_button_text(), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, !this.$viewModel.getSigningAgreement() && AddAccountAgreementOverlay.AddAccountAgreementOverlay$lambda$1(this.$agreeEnabled$delegate), this.$viewModel.getSigningAgreement(), (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2022, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAgreeClicked) | composer.changedInstance(this.$viewModel);
            final Function1<InvestmentsTrackerGetAgreementResponseDto, Unit> function1 = this.$onAgreeClicked;
            final InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = this.$viewModel;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlayKt$AddAccountAgreementOverlay$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddAccountAgreementOverlay.C195252.invoke$lambda$1$lambda$0(function1, investmentsTrackerAgreementViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue, modifierAutoLogEvents$default, (String) null, composer, BentoButtonState.$stable, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel) {
            function1.invoke(investmentsTrackerAgreementViewModel.getResponse());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddAccountAgreementOverlay$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
