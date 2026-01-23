package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment;
import com.robinhood.android.staticcontent.p258ui.othermarkdown.OtherMarkdownStateProvider3;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OtherMarkdownFullScreen.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"OtherMarkdownFullScreen", "", "duxo", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;", "onBack", "Lkotlin/Function0;", "overrideToolbarTitle", "", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "(Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;Landroidx/compose/runtime/Composer;II)V", "viewState", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "(Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;Landroidx/compose/runtime/Composer;II)V", "Preview", "previewState", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/PreviewState;", "(Lcom/robinhood/android/staticcontent/ui/othermarkdown/PreviewState;Landroidx/compose/runtime/Composer;I)V", "lib-product-marketing_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class OtherMarkdownFullScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherMarkdownFullScreen$lambda$0(OtherMarkdownDuxo otherMarkdownDuxo, Function0 function0, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, int i, int i2, Composer composer, int i3) {
        OtherMarkdownFullScreen(otherMarkdownDuxo, (Function0<Unit>) function0, str, primaryButton, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherMarkdownFullScreen$lambda$1(OtherMarkdownStateProvider3 otherMarkdownStateProvider3, Function0 function0, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, int i, int i2, Composer composer, int i3) {
        OtherMarkdownFullScreen(otherMarkdownStateProvider3, (Function0<Unit>) function0, str, primaryButton, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$2(PreviewState previewState, int i, Composer composer, int i2) {
        Preview(previewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OtherMarkdownFullScreen(final OtherMarkdownDuxo duxo, final Function0<Unit> onBack, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, Composer composer, final int i, final int i2) {
        int i3;
        OtherMarkdownFragmentKey.PrimaryButton primaryButton2;
        final String str2;
        final OtherMarkdownFragmentKey.PrimaryButton primaryButton3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-163215316);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                primaryButton2 = primaryButton;
                i3 |= composerStartRestartGroup.changedInstance(primaryButton2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                String str3 = i4 == 0 ? null : str;
                OtherMarkdownFragmentKey.PrimaryButton primaryButton4 = i5 == 0 ? null : primaryButton2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-163215316, i3, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen (OtherMarkdownFullScreen.kt:46)");
                }
                OtherMarkdownFragmentKey.PrimaryButton primaryButton5 = primaryButton4;
                String str4 = str3;
                OtherMarkdownFullScreen((OtherMarkdownStateProvider3) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue(), onBack, str4, primaryButton5, composerStartRestartGroup, i3 & 8176, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str4;
                primaryButton3 = primaryButton5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str2 = str;
                primaryButton3 = primaryButton2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OtherMarkdownFullScreen.OtherMarkdownFullScreen$lambda$0(duxo, onBack, str2, primaryButton3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        primaryButton2 = primaryButton;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            OtherMarkdownFragmentKey.PrimaryButton primaryButton52 = primaryButton4;
            String str42 = str3;
            OtherMarkdownFullScreen((OtherMarkdownStateProvider3) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue(), onBack, str42, primaryButton52, composerStartRestartGroup, i3 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str42;
            primaryButton3 = primaryButton52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OtherMarkdownFullScreen(final OtherMarkdownStateProvider3 otherMarkdownStateProvider3, final Function0<Unit> function0, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        String str2;
        int i4;
        OtherMarkdownFragmentKey.PrimaryButton primaryButton2;
        final String str3;
        Composer composer2;
        final OtherMarkdownFragmentKey.PrimaryButton primaryButton3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final OtherMarkdownStateProvider3 otherMarkdownStateProvider32 = otherMarkdownStateProvider3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-547575762);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(otherMarkdownStateProvider32) : composerStartRestartGroup.changedInstance(otherMarkdownStateProvider32) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    primaryButton2 = primaryButton;
                    i3 |= composerStartRestartGroup.changedInstance(primaryButton2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    str3 = i5 == 0 ? null : str2;
                    final OtherMarkdownFragmentKey.PrimaryButton primaryButton4 = i4 == 0 ? null : primaryButton2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-547575762, i3, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen (OtherMarkdownFullScreen.kt:64)");
                    }
                    final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2
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
                                ComposerKt.traceEventStart(-350665230, i6, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous> (OtherMarkdownFullScreen.kt:71)");
                            }
                            Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, scrollStateRememberScrollState, topBarScrollStateRememberTopBarScrollState);
                            boolean showDivider = topBarScrollStateRememberTopBarScrollState.getShowDivider();
                            final String str4 = str3;
                            final OtherMarkdownStateProvider3 otherMarkdownStateProvider33 = otherMarkdownStateProvider3;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1931847521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2.1
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
                                        ComposerKt.traceEventStart(-1931847521, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous>.<anonymous> (OtherMarkdownFullScreen.kt:75)");
                                    }
                                    String titleMarkdown = str4;
                                    if (titleMarkdown == null) {
                                        OtherMarkdownStateProvider3 otherMarkdownStateProvider34 = otherMarkdownStateProvider33;
                                        OtherMarkdownStateProvider3.Ready ready = otherMarkdownStateProvider34 instanceof OtherMarkdownStateProvider3.Ready ? (OtherMarkdownStateProvider3.Ready) otherMarkdownStateProvider34 : null;
                                        titleMarkdown = ready != null ? ready.getTitleMarkdown() : null;
                                        if (titleMarkdown == null) {
                                            titleMarkdown = "";
                                        }
                                    }
                                    BentoMarkdownText2.BentoMarkdownText(titleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer4, BentoMarkdownText.$stable << 15, 31), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            final Function0<Unit> function03 = function02;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(53598963, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2.2
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
                                        ComposerKt.traceEventStart(53598963, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous>.<anonymous> (OtherMarkdownFullScreen.kt:83)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.BACK_BUTTON_TEST_TAG), false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, true, showDivider, null, null, 0L, null, composer3, 196998, 0, 1944);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    };
                    otherMarkdownStateProvider32 = otherMarkdownStateProvider3;
                    composer2 = composerStartRestartGroup;
                    OtherMarkdownFragmentKey.PrimaryButton primaryButton5 = primaryButton4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-350665230, true, function2, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1557399171, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1557399171, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous> (OtherMarkdownFullScreen.kt:92)");
                            }
                            OtherMarkdownStateProvider3 otherMarkdownStateProvider33 = otherMarkdownStateProvider32;
                            if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Loading) {
                                composer3.startReplaceGroup(-2011979199);
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                OtherMarkdownFragmentKey.PrimaryButton primaryButton6 = primaryButton4;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, primaryButton6 != null, composer3, 48, 1);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            } else if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Ready) {
                                composer3.startReplaceGroup(2053645840);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierPadding2 = PaddingKt.padding(companion2, paddingValues);
                                ScrollState scrollState = scrollStateRememberScrollState;
                                OtherMarkdownFragmentKey.PrimaryButton primaryButton7 = primaryButton4;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierPadding2);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, composer3, 0, 1), scrollState, false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                BentoMarkdownText2.BentoMarkdownText(((OtherMarkdownStateProvider3.Ready) otherMarkdownStateProvider33).getBodyMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 31), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer3, 0);
                                composer3.endNode();
                                composer3.startReplaceGroup(-1981464595);
                                if (primaryButton7 != null) {
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1294256736, true, new OtherMarkdownFullScreen2(primaryButton7, (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler())), composer3, 54), composer3, 6);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            } else if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Error) {
                                composer3.startReplaceGroup(2054939656);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composer3, 0), TestTag3.testTag(PaddingKt.padding(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), paddingValues), "error-message"), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(2055254213);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    primaryButton3 = primaryButton5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    composer2 = composerStartRestartGroup;
                    primaryButton3 = primaryButton2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OtherMarkdownFullScreen.OtherMarkdownFullScreen$lambda$1(otherMarkdownStateProvider32, function0, str3, primaryButton3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            primaryButton2 = primaryButton;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2
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
                            ComposerKt.traceEventStart(-350665230, i6, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous> (OtherMarkdownFullScreen.kt:71)");
                        }
                        Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, scrollStateRememberScrollState2, topBarScrollStateRememberTopBarScrollState2);
                        boolean showDivider = topBarScrollStateRememberTopBarScrollState2.getShowDivider();
                        final String str4 = str3;
                        final OtherMarkdownStateProvider3 otherMarkdownStateProvider33 = otherMarkdownStateProvider3;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1931847521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2.1
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
                                    ComposerKt.traceEventStart(-1931847521, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous>.<anonymous> (OtherMarkdownFullScreen.kt:75)");
                                }
                                String titleMarkdown = str4;
                                if (titleMarkdown == null) {
                                    OtherMarkdownStateProvider3 otherMarkdownStateProvider34 = otherMarkdownStateProvider33;
                                    OtherMarkdownStateProvider3.Ready ready = otherMarkdownStateProvider34 instanceof OtherMarkdownStateProvider3.Ready ? (OtherMarkdownStateProvider3.Ready) otherMarkdownStateProvider34 : null;
                                    titleMarkdown = ready != null ? ready.getTitleMarkdown() : null;
                                    if (titleMarkdown == null) {
                                        titleMarkdown = "";
                                    }
                                }
                                BentoMarkdownText2.BentoMarkdownText(titleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer4, BentoMarkdownText.$stable << 15, 31), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final Function0<Unit> function03 = function02;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(53598963, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.2.2
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
                                    ComposerKt.traceEventStart(53598963, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous>.<anonymous> (OtherMarkdownFullScreen.kt:83)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.BACK_BUTTON_TEST_TAG), false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, true, showDivider, null, null, 0L, null, composer3, 196998, 0, 1944);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                otherMarkdownStateProvider32 = otherMarkdownStateProvider3;
                composer2 = composerStartRestartGroup;
                OtherMarkdownFragmentKey.PrimaryButton primaryButton52 = primaryButton4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-350665230, true, function22, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1557399171, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt.OtherMarkdownFullScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1557399171, i7, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreen.<anonymous> (OtherMarkdownFullScreen.kt:92)");
                        }
                        OtherMarkdownStateProvider3 otherMarkdownStateProvider33 = otherMarkdownStateProvider32;
                        if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Loading) {
                            composer3.startReplaceGroup(-2011979199);
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            OtherMarkdownFragmentKey.PrimaryButton primaryButton6 = primaryButton4;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, primaryButton6 != null, composer3, 48, 1);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Ready) {
                            composer3.startReplaceGroup(2053645840);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierPadding2 = PaddingKt.padding(companion2, paddingValues);
                            ScrollState scrollState = scrollStateRememberScrollState2;
                            OtherMarkdownFragmentKey.PrimaryButton primaryButton7 = primaryButton4;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierPadding2);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, composer3, 0, 1), scrollState, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            BentoMarkdownText2.BentoMarkdownText(((OtherMarkdownStateProvider3.Ready) otherMarkdownStateProvider33).getBodyMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 31), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer3, 0);
                            composer3.endNode();
                            composer3.startReplaceGroup(-1981464595);
                            if (primaryButton7 != null) {
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1294256736, true, new OtherMarkdownFullScreen2(primaryButton7, (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler())), composer3, 54), composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else if (otherMarkdownStateProvider33 instanceof OtherMarkdownStateProvider3.Error) {
                            composer3.startReplaceGroup(2054939656);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composer3, 0), TestTag3.testTag(PaddingKt.padding(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), paddingValues), "error-message"), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(2055254213);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                }
                primaryButton3 = primaryButton52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        primaryButton2 = primaryButton;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OtherMarkdownFullScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$Preview$1 */
    static final class C287231 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PreviewState $previewState;

        C287231(PreviewState previewState) {
            this.$previewState = previewState;
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
                ComposerKt.traceEventStart(-2109708291, i, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.Preview.<anonymous> (OtherMarkdownFullScreen.kt:153)");
            }
            OtherMarkdownStateProvider3 viewState = this.$previewState.getViewState();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$Preview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            OtherMarkdownFullScreen.OtherMarkdownFullScreen(viewState, (Function0<Unit>) objRememberedValue, this.$previewState.getOverrideToolbarTitle(), this.$previewState.getPrimaryButton(), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void Preview(final PreviewState previewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1190647989);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(previewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1190647989, i2, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.Preview (OtherMarkdownFullScreen.kt:151)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2109708291, true, new C287231(previewState), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownFullScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OtherMarkdownFullScreen.Preview$lambda$2(previewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
