package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DirectDepositBrokerageExperimentPage.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"DirectDepositBrokerageExperimentPage", "", "overlayStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "viewState", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/DirectDepositToBrokeragePageAction;", "(Lio/reactivex/Observable;Landroidx/activity/OnBackPressedDispatcher;Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentViewState;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositBrokerageExperimentPage4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DirectDepositBrokerageExperimentPage$lambda$0(Observable observable, OnBackPressedDispatcher onBackPressedDispatcher, DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, Modifier modifier, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        DirectDepositBrokerageExperimentPage(observable, onBackPressedDispatcher, directDepositBrokerageExperimentViewState, modifier, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DirectDepositBrokerageExperimentPage(final Observable<ThemesFromScarlet> overlayStream, final OnBackPressedDispatcher onBackPressedDispatcher, final DirectDepositBrokerageExperimentViewState viewState, Modifier modifier, SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(overlayStream, "overlayStream");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "onBackPressedDispatcher");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1189528451);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(overlayStream) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressedDispatcher) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    sduiActionHandler2 = sduiActionHandler;
                    i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler3 = i4 == 0 ? null : sduiActionHandler2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1189528451, i3, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage (DirectDepositBrokerageExperimentPage.kt:34)");
                    }
                    BentoTheme2.BentoTheme(overlayStream, null, ComposableLambda3.rememberComposableLambda(795306543, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt.DirectDepositBrokerageExperimentPage.1

                        /* compiled from: DirectDepositBrokerageExperimentPage.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<DirectDepositToBrokeragePageAction> $actionHandler;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;
                            final /* synthetic */ DirectDepositBrokerageExperimentViewState $viewState;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Modifier modifier, DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler, OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$modifier = modifier;
                                this.$viewState = directDepositBrokerageExperimentViewState;
                                this.$actionHandler = sduiActionHandler;
                                this.$onBackPressedDispatcher = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$1$lambda$0(final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, final SduiActionHandler sduiActionHandler, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1306658921, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$1$2$1$1
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
                                            ComposerKt.traceEventStart(1306658921, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentPage.kt:60)");
                                        }
                                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), DirectDepositBrokerageExperimentPage.SDUI_CONTENT);
                                        ImmutableList3 persistentList = extensions2.toPersistentList(directDepositBrokerageExperimentViewState.getSduiContent());
                                        SduiActionHandler<DirectDepositToBrokeragePageAction> sduiActionHandler2 = sduiActionHandler;
                                        composer.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(persistentList, DirectDepositToBrokeragePageAction.class, modifierTestTag, null, sduiActionHandler2, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 384, 0);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-316425414, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentPage.kt:37)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(this.$modifier, 0.0f, 1, null), 0.0f, 1, null);
                                final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState = this.$viewState;
                                final SduiActionHandler<DirectDepositToBrokeragePageAction> sduiActionHandler = this.$actionHandler;
                                OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(DirectDepositBrokerageExperimentPage2.INSTANCE.m13307getLambda$80229603$feature_direct_deposit_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-859442575, true, new DirectDepositBrokerageExperimentPage5(onBackPressedDispatcher), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
                                if (directDepositBrokerageExperimentViewState.getSduiContent() == null) {
                                    composer.startReplaceGroup(-938205020);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, DirectDepositBrokerageExperimentPage.LOADING_INDICATOR), true, true, 3, composer, 3510, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-937868732);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(directDepositBrokerageExperimentViewState) | composer.changedInstance(sduiActionHandler);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return DirectDepositBrokerageExperimentPage4.C140601.AnonymousClass1.invoke$lambda$3$lambda$1$lambda$0(directDepositBrokerageExperimentViewState, sduiActionHandler, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                    List<UIComponent<DirectDepositToBrokeragePageAction>> footerContent = directDepositBrokerageExperimentViewState.getFooterContent();
                                    if (footerContent != null) {
                                        Arrangement.Vertical bottom = arrangement.getBottom();
                                        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), DirectDepositBrokerageExperimentPage.FOOTER_CONTENT);
                                        ImmutableList3 persistentList = extensions2.toPersistentList(footerContent);
                                        composer.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(persistentList, DirectDepositToBrokeragePageAction.class, modifierTestTag, null, sduiActionHandler, HorizontalPadding.Default, bottom, companion.getStart(), true, composer, 102236160, 0);
                                        composer.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer.endReplaceGroup();
                                }
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(795306543, i6, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous> (DirectDepositBrokerageExperimentPage.kt:36)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-316425414, true, new AnonymousClass1(modifier4, viewState, sduiActionHandler3, onBackPressedDispatcher), composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    sduiActionHandler2 = sduiActionHandler3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DirectDepositBrokerageExperimentPage4.DirectDepositBrokerageExperimentPage$lambda$0(overlayStream, onBackPressedDispatcher, viewState, modifier3, sduiActionHandler2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            sduiActionHandler2 = sduiActionHandler;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme2.BentoTheme(overlayStream, null, ComposableLambda3.rememberComposableLambda(795306543, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt.DirectDepositBrokerageExperimentPage.1

                    /* compiled from: DirectDepositBrokerageExperimentPage.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SduiActionHandler<DirectDepositToBrokeragePageAction> $actionHandler;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;
                        final /* synthetic */ DirectDepositBrokerageExperimentViewState $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Modifier modifier, DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler, OnBackPressedDispatcher onBackPressedDispatcher) {
                            this.$modifier = modifier;
                            this.$viewState = directDepositBrokerageExperimentViewState;
                            this.$actionHandler = sduiActionHandler;
                            this.$onBackPressedDispatcher = onBackPressedDispatcher;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$1$lambda$0(final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, final SduiActionHandler<? super DirectDepositToBrokeragePageAction> sduiActionHandler, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1306658921, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$1$2$1$1
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
                                        ComposerKt.traceEventStart(1306658921, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentPage.kt:60)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), DirectDepositBrokerageExperimentPage.SDUI_CONTENT);
                                    ImmutableList3 persistentList = extensions2.toPersistentList(directDepositBrokerageExperimentViewState.getSduiContent());
                                    SduiActionHandler<DirectDepositToBrokeragePageAction> sduiActionHandler2 = sduiActionHandler;
                                    composer.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(persistentList, DirectDepositToBrokeragePageAction.class, modifierTestTag, null, sduiActionHandler2, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 384, 0);
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 3, null);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-316425414, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentPage.kt:37)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(this.$modifier, 0.0f, 1, null), 0.0f, 1, null);
                            final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState = this.$viewState;
                            final SduiActionHandler sduiActionHandler = this.$actionHandler;
                            OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(DirectDepositBrokerageExperimentPage2.INSTANCE.m13307getLambda$80229603$feature_direct_deposit_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-859442575, true, new DirectDepositBrokerageExperimentPage5(onBackPressedDispatcher), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
                            if (directDepositBrokerageExperimentViewState.getSduiContent() == null) {
                                composer.startReplaceGroup(-938205020);
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, DirectDepositBrokerageExperimentPage.LOADING_INDICATOR), true, true, 3, composer, 3510, 0);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-937868732);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(directDepositBrokerageExperimentViewState) | composer.changedInstance(sduiActionHandler);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPageKt$DirectDepositBrokerageExperimentPage$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return DirectDepositBrokerageExperimentPage4.C140601.AnonymousClass1.invoke$lambda$3$lambda$1$lambda$0(directDepositBrokerageExperimentViewState, sduiActionHandler, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                List<UIComponent<DirectDepositToBrokeragePageAction>> footerContent = directDepositBrokerageExperimentViewState.getFooterContent();
                                if (footerContent != null) {
                                    Arrangement.Vertical bottom = arrangement.getBottom();
                                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), DirectDepositBrokerageExperimentPage.FOOTER_CONTENT);
                                    ImmutableList3 persistentList = extensions2.toPersistentList(footerContent);
                                    composer.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(persistentList, DirectDepositToBrokeragePageAction.class, modifierTestTag, null, sduiActionHandler, HorizontalPadding.Default, bottom, companion.getStart(), true, composer, 102236160, 0);
                                    composer.endReplaceGroup();
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                            }
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(795306543, i6, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage.<anonymous> (DirectDepositBrokerageExperimentPage.kt:36)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-316425414, true, new AnonymousClass1(modifier4, viewState, sduiActionHandler3, onBackPressedDispatcher), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                sduiActionHandler2 = sduiActionHandler3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        sduiActionHandler2 = sduiActionHandler;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
