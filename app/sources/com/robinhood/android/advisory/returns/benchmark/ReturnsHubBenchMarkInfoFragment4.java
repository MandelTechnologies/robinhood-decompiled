package com.robinhood.android.advisory.returns.benchmark;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.returns.C9338R;
import com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"ReturnsHubBenchmarkInfoScreen", "", "content", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "loggingIdentifier", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-returns-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsHubBenchMarkInfoFragment4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsHubBenchmarkInfoScreen$lambda$0(String str, String str2, String str3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReturnsHubBenchmarkInfoScreen(str, str2, str3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReturnsHubBenchmarkInfoScreen(final String content, final String disclosure, final String loggingIdentifier, final Function0<Unit> onClose, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1163259687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(disclosure) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(loggingIdentifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClose) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(-1163259687, i4, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen (ReturnsHubBenchMarkInfoFragment.kt:69)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(600060061, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.1
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
                            ComposerKt.traceEventStart(600060061, i6, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:75)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        Function2<Composer, Integer, Unit> lambda$371958218$feature_returns_hub_externalDebug = ReturnsHubBenchMarkInfoFragment2.INSTANCE.getLambda$371958218$feature_returns_hub_externalDebug();
                        final Function0<Unit> function0 = onClose;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$371958218$feature_returns_hub_externalDebug, null, ComposableLambda3.rememberComposableLambda(1403612702, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1403612702, i7, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous>.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:77)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1690067368, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt$ReturnsHubBenchmarkInfoScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $content;
                        final /* synthetic */ String $disclosure;
                        final /* synthetic */ PaddingValues $innerPadding;
                        final /* synthetic */ Function0<Unit> $onClose;
                        final /* synthetic */ ScrollState $scrollState;

                        AnonymousClass1(PaddingValues paddingValues, ScrollState scrollState, String str, Function0<Unit> function0, String str2) {
                            this.$innerPadding = paddingValues;
                            this.$scrollState = scrollState;
                            this.$disclosure = str;
                            this.$onClose = function0;
                            this.$content = str2;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(179098461, i, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous>.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:102)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(SizeKt.fillMaxSize$default(PaddingKt.defaultScaffoldPadding(companion, this.$innerPadding, composer, 6), 0.0f, 1, null), null, 1, null);
                            ScrollState scrollState = this.$scrollState;
                            String str = this.$disclosure;
                            final Function0<Unit> function0 = this.$onClose;
                            String str2 = this.$content;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            int iM7924getStarte0LSkKk = companion4.m7924getStarte0LSkKk();
                            int i3 = BentoMarkdownText.$stable;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, iM7924getStarte0LSkKk, jM21425getFg0d7_KjU, 0L, false, composer, i3 << 15, 24);
                            int i4 = MarkdownStyle.$stable;
                            BentoMarkdownText2.BentoMarkdownText(str2, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, i4 << 6, 24);
                            composer.endNode();
                            BentoMarkdownText2.BentoMarkdownText(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion4.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, i3 << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, i4 << 6, 24);
                            String strStringResource = StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_info_cta, composer, 0);
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt$ReturnsHubBenchmarkInfoScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReturnsHubBenchMarkInfoFragment4.C93622.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5144paddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(innerPadding) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1690067368, i6, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:92)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.DISCLOSURE, null, loggingIdentifier, null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(179098461, true, new AnonymousClass1(innerPadding, scrollStateRememberScrollState, disclosure, onClose, content), composer3, 54), composer3, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 805306416, 508);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReturnsHubBenchMarkInfoFragment4.ReturnsHubBenchmarkInfoScreen$lambda$0(content, disclosure, loggingIdentifier, onClose, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composer2 = composerStartRestartGroup;
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(600060061, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.1
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
                        ComposerKt.traceEventStart(600060061, i6, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:75)");
                    }
                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                    Function2<Composer, Integer, Unit> lambda$371958218$feature_returns_hub_externalDebug = ReturnsHubBenchMarkInfoFragment2.INSTANCE.getLambda$371958218$feature_returns_hub_externalDebug();
                    final Function0<Unit> function0 = onClose;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$371958218$feature_returns_hub_externalDebug, null, ComposableLambda3.rememberComposableLambda(1403612702, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1403612702, i7, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous>.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:77)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1690067368, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt.ReturnsHubBenchmarkInfoScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt$ReturnsHubBenchmarkInfoScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ String $content;
                    final /* synthetic */ String $disclosure;
                    final /* synthetic */ PaddingValues $innerPadding;
                    final /* synthetic */ Function0<Unit> $onClose;
                    final /* synthetic */ ScrollState $scrollState;

                    AnonymousClass1(PaddingValues paddingValues, ScrollState scrollState, String str, Function0<Unit> function0, String str2) {
                        this.$innerPadding = paddingValues;
                        this.$scrollState = scrollState;
                        this.$disclosure = str;
                        this.$onClose = function0;
                        this.$content = str2;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(179098461, i, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous>.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:102)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(SizeKt.fillMaxSize$default(PaddingKt.defaultScaffoldPadding(companion, this.$innerPadding, composer, 6), 0.0f, 1, null), null, 1, null);
                        ScrollState scrollState = this.$scrollState;
                        String str = this.$disclosure;
                        final Function0 function0 = this.$onClose;
                        String str2 = this.$content;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                        int iM7924getStarte0LSkKk = companion4.m7924getStarte0LSkKk();
                        int i3 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, iM7924getStarte0LSkKk, jM21425getFg0d7_KjU, 0L, false, composer, i3 << 15, 24);
                        int i4 = MarkdownStyle.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str2, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, i4 << 6, 24);
                        composer.endNode();
                        BentoMarkdownText2.BentoMarkdownText(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion4.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, i3 << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, i4 << 6, 24);
                        String strStringResource = StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_info_cta, composer, 0);
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(function0);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragmentKt$ReturnsHubBenchmarkInfoScreen$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReturnsHubBenchMarkInfoFragment4.C93622.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1(function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5144paddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(innerPadding) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1690067368, i6, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchmarkInfoScreen.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:92)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.DISCLOSURE, null, loggingIdentifier, null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(179098461, true, new AnonymousClass1(innerPadding, scrollStateRememberScrollState2, disclosure, onClose, content), composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
