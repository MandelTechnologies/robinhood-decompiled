package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.terms.TermsComposableKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TermsComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0015\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Terms", "", "isVermont", "", "onBack", "Lkotlin/Function0;", "onContinue", "onPrivacyPolicy", "onUrlClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "onVermontLendingLaws", "isLoading", "fullPageLoader", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "FullPageLoader", "visible", "(ZLandroidx/compose/runtime/Composer;I)V", "TERMS_TITLE_TEST_TAG", "TERMS_SUBTITLE_TEST_TAG", "TERMS_PRIVACY_LINK_TEST_TAG", "TERMS_ELECTRONIC_DISCLOSURE_TEST_TAG", "TERMS_VERMONT_LINK_TEST_TAG", "TERMS_TERMS_LINK_TEST_TAG", "TERMS_FULL_PAGE_LOADER_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TermsComposableKt {
    public static final String TERMS_ELECTRONIC_DISCLOSURE_TEST_TAG = "terms-electronic-disclosure-test-tag";
    public static final String TERMS_FULL_PAGE_LOADER_TEST_TAG = "terms-full-page-loader-test-tag";
    public static final String TERMS_PRIVACY_LINK_TEST_TAG = "terms-privacy-link-test-tag";
    public static final String TERMS_SUBTITLE_TEST_TAG = "terms-subtitle-test-tag";
    public static final String TERMS_TERMS_LINK_TEST_TAG = "terms-terms-link-test-tag";
    public static final String TERMS_TITLE_TEST_TAG = "terms-title-test-tag";
    public static final String TERMS_VERMONT_LINK_TEST_TAG = "terms-vermont-link-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FullPageLoader$lambda$2$lambda$1(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FullPageLoader$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullPageLoader$lambda$5(boolean z, int i, Composer composer, int i2) {
        FullPageLoader(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Terms$lambda$0(boolean z, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        Terms(z, function0, function02, function03, function1, function04, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Terms(final boolean z, final Function0<Unit> onBack, final Function0<Unit> onContinue, final Function0<Unit> onPrivacyPolicy, final Function1<? super String, Unit> onUrlClick, final Function0<Unit> onVermontLendingLaws, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onPrivacyPolicy, "onPrivacyPolicy");
        Intrinsics.checkNotNullParameter(onUrlClick, "onUrlClick");
        Intrinsics.checkNotNullParameter(onVermontLendingLaws, "onVermontLendingLaws");
        Composer composerStartRestartGroup = composer.startRestartGroup(1668205211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrivacyPolicy) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUrlClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onVermontLendingLaws) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                z5 = z2;
                i3 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((i & 12582912) == 0) {
                    z6 = z3;
                    i3 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
                }
                if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    final boolean z9 = i5 == 0 ? false : z5;
                    if (i4 != 0) {
                        z6 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1668205211, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms (TermsComposable.kt:68)");
                    }
                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    int i6 = i3;
                    boolean z10 = z6;
                    boolean z11 = z9;
                    CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_TERMS, null, null, null, 14, null), null, null, onBack, null, null, null, ComposableLambda3.rememberComposableLambda(410639200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt.Terms.1

                        /* compiled from: TermsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ boolean $isLoading;
                            final /* synthetic */ Function0<Unit> $onContinue;

                            AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0, boolean z) {
                                this.$eventLogger = eventLogger;
                                this.$onContinue = function0;
                                this.$isLoading = z;
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
                                    ComposerKt.traceEventStart(-2064876466, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms.<anonymous>.<anonymous> (TermsComposable.kt:75)");
                                }
                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composer, 0);
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                                final EventLogger eventLogger = this.$eventLogger;
                                final Function0<Unit> function0 = this.$onContinue;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TermsComposableKt.C126001.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, this.$isLoading, null, false, null, null, false, null, false, composer, 0, 0, 65086);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                                loggingUtils.logContinue$default(eventLogger, null, 1, null);
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(410639200, i7, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms.<anonymous> (TermsComposable.kt:74)");
                            }
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-2064876466, true, new AnonymousClass1(current, onContinue, z9), composer2, 54), composer2, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(1960266063, true, new C126012(current, onPrivacyPolicy, onUrlClick, z4, onVermontLendingLaws), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 6) & 7168) | 12582912, 384, 3958);
                    FullPageLoader(z10, composerStartRestartGroup, (i6 >> 21) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z10;
                    z8 = z11;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z8 = z5;
                    z7 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TermsComposableKt.Terms$lambda$0(z, onBack, onContinue, onPrivacyPolicy, onUrlClick, onVermontLendingLaws, z8, z7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            z6 = z3;
            if ((i3 & 4793491) != 4793490) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                int i62 = i3;
                boolean z102 = z6;
                boolean z112 = z9;
                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_TERMS, null, null, null, 14, null), null, null, onBack, null, null, null, ComposableLambda3.rememberComposableLambda(410639200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt.Terms.1

                    /* compiled from: TermsComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ boolean $isLoading;
                        final /* synthetic */ Function0<Unit> $onContinue;

                        AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0, boolean z) {
                            this.$eventLogger = eventLogger;
                            this.$onContinue = function0;
                            this.$isLoading = z;
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
                                ComposerKt.traceEventStart(-2064876466, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms.<anonymous>.<anonymous> (TermsComposable.kt:75)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composer, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Function0 function0 = this.$onContinue;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TermsComposableKt.C126001.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, this.$isLoading, null, false, null, null, false, null, false, composer, 0, 0, 65086);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                            loggingUtils.logContinue$default(eventLogger, null, 1, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(410639200, i7, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms.<anonymous> (TermsComposable.kt:74)");
                        }
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-2064876466, true, new AnonymousClass1(current2, onContinue, z9), composer2, 54), composer2, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(1960266063, true, new C126012(current2, onPrivacyPolicy, onUrlClick, z4, onVermontLendingLaws), composerStartRestartGroup, 54), composerStartRestartGroup, ((i62 << 6) & 7168) | 12582912, 384, 3958);
                FullPageLoader(z102, composerStartRestartGroup, (i62 >> 21) & 14);
                if (ComposerKt.isTraceInProgress()) {
                }
                z7 = z102;
                z8 = z112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z5 = z2;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        z6 = z3;
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TermsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2 */
    static final class C126012 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isVermont;
        final /* synthetic */ Function0<Unit> $onPrivacyPolicy;
        final /* synthetic */ Function1<String, Unit> $onUrlClick;
        final /* synthetic */ Function0<Unit> $onVermontLendingLaws;

        /* JADX WARN: Multi-variable type inference failed */
        C126012(EventLogger eventLogger, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z, Function0<Unit> function02) {
            this.$eventLogger = eventLogger;
            this.$onPrivacyPolicy = function0;
            this.$onUrlClick = function1;
            this.$isVermont = z;
            this.$onVermontLendingLaws = function02;
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
                ComposerKt.traceEventStart(1960266063, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.Terms.<anonymous> (TermsComposable.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$onPrivacyPolicy;
            final Function1<String, Unit> function1 = this.$onUrlClick;
            boolean z = this.$isVermont;
            Function0<Unit> function02 = this.$onVermontLendingLaws;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "terms-title-test-tag");
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_title, composer, 0);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_subtitle, composer, 0), TestTag3.testTag(companion, TermsComposableKt.TERMS_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8124);
            float f = 12;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(companion, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            Modifier modifierTestTag2 = TestTag3.testTag(companion, TermsComposableKt.TERMS_PRIVACY_LINK_TEST_TAG);
            BentoBaseRowState.Text.Plain plain = new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_privacy_notice, composer, 0));
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, plain, null, new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, "null", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, 117, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TermsComposableKt.C126012.invoke$lambda$11$lambda$4$lambda$1$lambda$0(eventLogger, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i4 = BentoBaseRowState.$stable;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierTestTag2, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer, (i4 << 3) | 390, 56);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            final String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_e_disclosures_link, composer, 0);
            Modifier modifierTestTag3 = TestTag3.testTag(companion, TermsComposableKt.TERMS_ELECTRONIC_DISCLOSURE_TEST_TAG);
            BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_e_disclosures, composer, 0)), null, new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, "null", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, 117, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changed(strStringResource2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TermsComposableKt.C126012.invoke$lambda$11$lambda$4$lambda$3$lambda$2(function1, strStringResource2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Composer composer2 = composer;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierTestTag3, bentoBaseRowState2, false, false, false, 0L, (Function0) objRememberedValue2, composer2, (i4 << 3) | 390, 56);
            composer2.startReplaceGroup(-309409552);
            if (z) {
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                composer2 = composer2;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(TestTag3.testTag(companion, TermsComposableKt.TERMS_VERMONT_LINK_TEST_TAG), new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_vermont_lending_laws, composer2, 0)), null, new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, "null", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, 117, null), false, false, false, 0L, function02, composer2, (i4 << 3) | 390, 56);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(companion, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getColors(composer2, i3).m21372getBg20d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_disclosures_and_agreements, composer2, 0)), null, null, null, false, false, 125, null), false, false, false, 0L, null, composer2, (i4 << 3) | 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            Composer composer3 = composer2;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
            final String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_inline_link, composer3, 0);
            Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null), bentoTheme.getColors(composer3, i3).m21372getBg20d7_KjU(), null, 2, null);
            composer3.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer3.changed(strStringResource3) | composer3.changed(function1);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TermsComposableKt.C126012.invoke$lambda$11$lambda$10$lambda$7$lambda$6(strStringResource3, function1, (Context) obj);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            composer3.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, modifierM4872backgroundbw27NRU$default3, null, composer, 0, 4);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            final String strStringResource4 = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_pdf_link, composer, 0);
            Modifier modifierTestTag4 = TestTag3.testTag(companion, TermsComposableKt.TERMS_TERMS_LINK_TEST_TAG);
            BentoBaseRowState bentoBaseRowState3 = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_view_as_pdf, composer, 0)), null, new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.POP_OUT_16, "null", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, 117, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer.changed(function1) | composer.changed(strStringResource4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TermsComposableKt.C126012.invoke$lambda$11$lambda$10$lambda$9$lambda$8(function1, strStringResource4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierTestTag4, bentoBaseRowState3, false, false, false, 0L, (Function0) objRememberedValue4, composer, (i4 << 3) | 390, 56);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$4$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingUtils.getCcScreen(), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, null, false, 57, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$4$lambda$3$lambda$2(Function1 function1, String str) {
            function1.invoke(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WebView invoke$lambda$11$lambda$10$lambda$7$lambda$6(String str, final Function1 function1, Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            final WebView webView = new WebView(ctx);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setBackgroundColor(0);
            webView.loadUrl(str);
            webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$Terms$2$1$2$1$1$1$1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(request, "request");
                    Function1<String, Unit> function12 = function1;
                    String string2 = request.getUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    function12.invoke(string2);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    webView.evaluateJavascript("var meta = document.createElement('meta');\nmeta.name = 'viewport';\nmeta.content = `width=(getMainScreen().width - (24 * 4)), \n    initial-scale=1.0, user-scalable=no`;\nvar head = document.getElementsByTagName('head')[0];\nhead.appendChild(meta);\n\nvar cssString = `\n    :root {\n        --fg: #EFE5D0;\n        --fg3: #877F7A;\n        --bg2: #2F2927;\n        --accent: #FFD670;\n    }\n    body {\n        color: var(--fg);\n        background-color: var(--bg2);\n        padding-top: 12px;\n        padding-bottom: 12px;\n        font-family: sans-serif;\n        font-size: 10px;\n    }\n    a {\n        color: var(--accent);\n        word-wrap: break-word;\n    }\n    td {\n        padding: 8px 0;\n        border-bottom: 1px solid var(--fg3);\n    }\n    tr:last-child td {\n        border-bottom: 1px solid transparent;\n    }\n    pre {\n        white-space: normal;\n    }\n    table {\n        table-layout: fixed;\n        width: 100%;\n        border-collapse: collapse;\n    }\n    h3 {\n        word-wrap: break-word;\n    }\n    tbody {\n        vertical-align: top;\n    }\n`;\nvar style = document.createElement('style');\nstyle.innerHTML = cssString;\ndocument.head.appendChild(style);", null);
                }
            });
            return webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(Function1 function1, String str) {
            function1.invoke(str);
            return Unit.INSTANCE;
        }
    }

    private static final void FullPageLoader(boolean z, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2145166378);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2145166378, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.FullPageLoader (TermsComposable.kt:297)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TermsComposableKt.FullPageLoader$lambda$2$lambda$1(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TermsComposableKt.FullPageLoader$lambda$4$lambda$3(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableSingletons$TermsComposableKt.INSTANCE.getLambda$499218178$feature_credit_card_externalDebug(), composerStartRestartGroup, (i2 & 14) | 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.TermsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TermsComposableKt.FullPageLoader$lambda$5(z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
