package com.robinhood.android.gdpr.consent;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.gdpr.contracts.PrivacySettingsFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PrivacySettingsFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a%\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0015\u001a\u00020\u00168\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0018\"\u0016\u0010\u0019\u001a\u00020\u00168\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0018\"\u0016\u0010\u001b\u001a\u00020\u00168\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0018¨\u0006\u001d²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"Content", "", "duxo", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;", "onClosedClick", "Lkotlin/Function0;", "buttonType", "Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;", "shouldShowSaveAndContinue", "", "(Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey$ButtonType;ZLandroidx/compose/runtime/Composer;I)V", "PrivacySettingsSubtitle", "(Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;Landroidx/compose/runtime/Composer;I)V", "PrivacySettingRow", "setting", "Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "viewState", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;", "(Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;Lcom/robinhood/android/gdpr/consent/PrivacySetting;Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;Landroidx/compose/runtime/Composer;I)V", "BottomBar", "(Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;ZLandroidx/compose/runtime/Composer;I)V", "TOP_BAR_TEST_TAG", "", "getTOP_BAR_TEST_TAG$annotations", "()V", "TOP_BAR_BACK_BUTTON_TEST_TAG", "getTOP_BAR_BACK_BUTTON_TEST_TAG$annotations", "TOP_BAR_CLOSE_BUTTON_TEST_TAG", "getTOP_BAR_CLOSE_BUTTON_TEST_TAG$annotations", "feature-gdpr-consent_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PrivacySettingsFragmentKt {
    public static final String TOP_BAR_BACK_BUTTON_TEST_TAG = "top_bar_back_button_test_tag";
    public static final String TOP_BAR_CLOSE_BUTTON_TEST_TAG = "top_bar_close_button_test_tag";
    public static final String TOP_BAR_TEST_TAG = "top_bar_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$24(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, boolean z, int i, Composer composer, int i2) {
        BottomBar(privacySettingsFragmentDuxo, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, Function0 function0, PrivacySettingsFragmentKey.ButtonType buttonType, boolean z, int i, Composer composer, int i2) {
        Content(privacySettingsFragmentDuxo, function0, buttonType, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacySettingRow$lambda$15(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, PrivacySetting privacySetting, PrivacySettingsFragmentViewState privacySettingsFragmentViewState, int i, Composer composer, int i2) {
        PrivacySettingRow(privacySettingsFragmentDuxo, privacySetting, privacySettingsFragmentViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacySettingsSubtitle$lambda$10(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, int i, Composer composer, int i2) {
        PrivacySettingsSubtitle(privacySettingsFragmentDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTOP_BAR_BACK_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getTOP_BAR_CLOSE_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getTOP_BAR_TEST_TAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrivacySettingsFragmentViewState Content$lambda$0(SnapshotState4<PrivacySettingsFragmentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void Content(final PrivacySettingsFragmentDuxo duxo, final Function0<Unit> onClosedClick, final PrivacySettingsFragmentKey.ButtonType buttonType, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onClosedClick, "onClosedClick");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436531646);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClosedClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(buttonType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436531646, i2, -1, "com.robinhood.android.gdpr.consent.Content (PrivacySettingsFragment.kt:107)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1188379113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1188379113, i3, -1, "com.robinhood.android.gdpr.consent.Content.<anonymous> (PrivacySettingsFragment.kt:110)");
                    }
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU();
                    final PrivacySettingsFragmentKey.ButtonType buttonType2 = buttonType;
                    final Function0<Unit> function0 = onClosedClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-884183853, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.Content.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i5) {
                            if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-884183853, i5, -1, "com.robinhood.android.gdpr.consent.Content.<anonymous>.<anonymous> (PrivacySettingsFragment.kt:115)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), PrivacySettingsFragmentKt.TOP_BAR_TEST_TAG);
                            Function2<Composer, Integer, Unit> lambda$2086717126$feature_gdpr_consent_externalDebug = ComposableSingletons$PrivacySettingsFragmentKt.INSTANCE.getLambda$2086717126$feature_gdpr_consent_externalDebug();
                            final PrivacySettingsFragmentKey.ButtonType buttonType3 = buttonType2;
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2086717126$feature_gdpr_consent_externalDebug, modifierTestTag, ComposableLambda3.rememberComposableLambda(-43070734, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.Content.1.1.1

                                /* compiled from: PrivacySettingsFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$Content$1$1$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[PrivacySettingsFragmentKey.ButtonType.values().length];
                                        try {
                                            iArr[PrivacySettingsFragmentKey.ButtonType.BACK_BUTTON.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[PrivacySettingsFragmentKey.ButtonType.CLOSE_BUTTON.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                    invoke(bentoAppBarScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i6) {
                                    int i7;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i6 & 6) == 0) {
                                        i7 = ((i6 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2) | i6;
                                    } else {
                                        i7 = i6;
                                    }
                                    if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-43070734, i7, -1, "com.robinhood.android.gdpr.consent.Content.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsFragment.kt:121)");
                                    }
                                    int i8 = WhenMappings.$EnumSwitchMapping$0[buttonType3.ordinal()];
                                    if (i8 == 1) {
                                        composer5.startReplaceGroup(1558702890);
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "top_bar_back_button_test_tag"), false, null, function02, composer5, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                        composer5.endReplaceGroup();
                                    } else {
                                        if (i8 != 2) {
                                            composer5.startReplaceGroup(1558699128);
                                            composer5.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer5.startReplaceGroup(1558713517);
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, PrivacySettingsFragmentKt.TOP_BAR_CLOSE_BUTTON_TEST_TAG), false, 0L, function02, composer5, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                        composer5.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), null, null, false, false, null, null, 0L, null, composer4, 390, 0, 2040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo = duxo;
                    final boolean z2 = z;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1234867122, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.Content.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i5) {
                            if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1234867122, i5, -1, "com.robinhood.android.gdpr.consent.Content.<anonymous>.<anonymous> (PrivacySettingsFragment.kt:137)");
                            }
                            PrivacySettingsFragmentKt.BottomBar(privacySettingsFragmentDuxo, z2, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo2 = duxo;
                    final SnapshotState4<PrivacySettingsFragmentViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-510051416, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.Content.1.3
                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i5 & 6) == 0) {
                                i6 = i5 | (composer4.changed(paddingValues) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-510051416, i6, -1, "com.robinhood.android.gdpr.consent.Content.<anonymous>.<anonymous> (PrivacySettingsFragment.kt:139)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                            PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo3 = privacySettingsFragmentDuxo2;
                            SnapshotState4<PrivacySettingsFragmentViewState> snapshotState42 = snapshotState4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
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
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17671R.string.privacy_settings_title, composer4, 0), PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i7).getDisplayCapsuleMedium(), composer4, 0, 0, 8188);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), composer4, 0);
                            PrivacySettingsFragmentKt.PrivacySettingsSubtitle(privacySettingsFragmentDuxo3, composer4, 0);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i7).m21592getMediumD9Ej5fM()), composer4, 0);
                            PrivacySettingsFragmentKt.PrivacySettingRow(privacySettingsFragmentDuxo3, PrivacySetting.STRICTLY_NECESSARY, PrivacySettingsFragmentKt.Content$lambda$0(snapshotState42), composer4, 48);
                            PrivacySettingsFragmentKt.PrivacySettingRow(privacySettingsFragmentDuxo3, PrivacySetting.PERFORMANCE, PrivacySettingsFragmentKt.Content$lambda$0(snapshotState42), composer4, 48);
                            PrivacySettingsFragmentKt.PrivacySettingRow(privacySettingsFragmentDuxo3, PrivacySetting.FUNCTIONAL, PrivacySettingsFragmentKt.Content$lambda$0(snapshotState42), composer4, 48);
                            PrivacySettingsFragmentKt.PrivacySettingRow(privacySettingsFragmentDuxo3, PrivacySetting.MARKETING, PrivacySettingsFragmentKt.Content$lambda$0(snapshotState42), composer4, 48);
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
                    }, composer3, 54), composer3, 805306800, EnumC7081g.f2774x74902ae0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacySettingsFragmentKt.Content$lambda$1(duxo, onClosedClick, buttonType, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrivacySettingsSubtitle(final PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1488345936);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1488345936, i2, -1, "com.robinhood.android.gdpr.consent.PrivacySettingsSubtitle (PrivacySettingsFragment.kt:165)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_subtitle_prefix, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_subtitle_privacy_policy_text, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_subtitle_cookie_policy_text, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            SpanStyle spanStyle = new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-76315334);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(strStringResource);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                builder.append(' ');
                TextLinkStyles textLinkStyles = new TextLinkStyles(spanStyle, null, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$PrivacySettingsSubtitle$annotatedString$1$2$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            privacySettingsFragmentDuxo.onLinkClicked(PrivacySettingsFragmentDuxo.LinkType.PRIVACY_POLICY);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("privacyPolicy", textLinkStyles, (LinkInteractionListener) objRememberedValue));
                try {
                    builder.append(strStringResource2);
                    builder.pop(iPushLink);
                    builder.append(' ');
                    composerStartRestartGroup.startReplaceGroup(-76297661);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(C17671R.string.privacy_settings_subtitle_and_text, composerStartRestartGroup, 0));
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        builder.append(' ');
                        TextLinkStyles textLinkStyles2 = new TextLinkStyles(spanStyle, null, null, null, 14, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new LinkInteractionListener() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$PrivacySettingsSubtitle$annotatedString$1$5$1
                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                public final void onClick(LinkAnnotation it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    privacySettingsFragmentDuxo.onLinkClicked(PrivacySettingsFragmentDuxo.LinkType.COOKIE_POLICY);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        iPushLink = builder.pushLink(new LinkAnnotation.Clickable("cookiePolicy", textLinkStyles2, (LinkInteractionListener) objRememberedValue2));
                        try {
                            builder.append(strStringResource3);
                            builder.pop(iPushLink);
                            iPushStyle = builder.pushStyle(spanStyle);
                            try {
                                builder.append('.');
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 0, 0, 8188);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacySettingsFragmentKt.PrivacySettingsSubtitle$lambda$10(privacySettingsFragmentDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrivacySettingRow(final PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, final PrivacySetting privacySetting, final PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-366455928);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(privacySetting.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(privacySettingsFragmentViewState) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366455928, i2, -1, "com.robinhood.android.gdpr.consent.PrivacySettingRow (PrivacySettingsFragment.kt:224)");
            }
            BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, PrivacySetting2.getTitle(privacySetting, composerStartRestartGroup, (i2 >> 3) & 14), null, false, privacySettingsFragmentViewState.getEnabledSet().contains(privacySetting), PrivacySetting2.getCheckedIcon(privacySetting), null, false, false, false, 973, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 112;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo) | (i3 == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PrivacySettingsFragmentKt.PrivacySettingRow$lambda$12$lambda$11(privacySettingsFragmentDuxo, privacySetting, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo) | (i3 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PrivacySettingsFragmentKt.PrivacySettingRow$lambda$14$lambda$13(privacySettingsFragmentDuxo, privacySetting, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAccordionToggleRowKt.BentoAccordionToggleRow(bentoToggleRowState, function1, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1859125534, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt.PrivacySettingRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1859125534, i4, -1, "com.robinhood.android.gdpr.consent.PrivacySettingRow.<anonymous> (PrivacySettingsFragment.kt:234)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU();
                    BentoText2.m20747BentoText38GnDrw(PrivacySetting2.getText(privacySetting, composer2, 0), null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, privacySettingsFragmentViewState.getExpandedSet().contains(privacySetting), composerStartRestartGroup, BentoToggleRowState.$stable | 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacySettingsFragmentKt.PrivacySettingRow$lambda$15(privacySettingsFragmentDuxo, privacySetting, privacySettingsFragmentViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacySettingRow$lambda$12$lambda$11(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, PrivacySetting privacySetting, boolean z) {
        privacySettingsFragmentDuxo.toggleEnabled(privacySetting);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacySettingRow$lambda$14$lambda$13(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, PrivacySetting privacySetting, boolean z) {
        privacySettingsFragmentDuxo.toggleExpanded(privacySetting);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(final PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(607718257);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(607718257, i2, -1, "com.robinhood.android.gdpr.consent.BottomBar (PrivacySettingsFragment.kt:248)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1247635089);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), companion2.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PrivacySettingsFragmentKt$BottomBar$1$1$1$1(privacySettingsFragmentDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_accept_all_button_text, composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), strStringResource, modifierWeight$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PrivacySettingsFragmentKt$BottomBar$1$1$2$1(privacySettingsFragmentDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C17671R.string.privacy_settings_reject_all_button_text, composerStartRestartGroup, 0), modifierWeight$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                composerStartRestartGroup.endNode();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new PrivacySettingsFragmentKt$BottomBar$1$2$1(privacySettingsFragmentDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), StringResources_androidKt.stringResource(C17671R.string.privacy_settings_save_and_continue_button_text, composerStartRestartGroup, 0), modifierFillMaxWidth$default2, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24960, 0, 8168);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1248957456);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new PrivacySettingsFragmentKt$BottomBar$2$1$1(privacySettingsFragmentDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource2 = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_accept_all_button_text, composerStartRestartGroup, 0);
                BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), strStringResource2, modifierFillMaxWidth$default3, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24960, 0, 8168);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(privacySettingsFragmentDuxo);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new PrivacySettingsFragmentKt$BottomBar$2$2$1(privacySettingsFragmentDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue5), StringResources_androidKt.stringResource(C17671R.string.privacy_settings_reject_all_button_text, composerStartRestartGroup, 0), modifierFillMaxWidth$default4, null, type3, false, false, null, null, null, null, false, null, composer2, 24960, 0, 8168);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacySettingsFragmentKt.BottomBar$lambda$24(privacySettingsFragmentDuxo, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
