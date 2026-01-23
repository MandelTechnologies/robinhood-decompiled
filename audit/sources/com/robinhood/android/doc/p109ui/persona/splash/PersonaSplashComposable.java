package com.robinhood.android.doc.p109ui.persona.splash;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.persona.splash.PersonaSplashComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.documents.lib.docupload.SplashScreenStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PersonaSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"PersonaSplashComposable", "", ResourceTypes.STYLE, "Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;", "isLoading", "", "showSkipAlert", "showErrorAlert", "onErrorAlertDismissed", "Lkotlin/Function0;", "onAlertPrimaryCtaClicked", "onAlertSecondaryCtaClicked", "onPrimaryCtaClicked", "onSecondaryCtaClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PersonaSplashComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PersonaSplashComposable$lambda$0(SplashScreenStyle splashScreenStyle, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PersonaSplashComposable(splashScreenStyle, z, z2, z3, function0, function02, function03, function04, function05, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonaSplashComposable(final SplashScreenStyle style, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onErrorAlertDismissed, final Function0<Unit> onAlertPrimaryCtaClicked, final Function0<Unit> onAlertSecondaryCtaClicked, final Function0<Unit> onPrimaryCtaClicked, final Function0<Unit> onSecondaryCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(onErrorAlertDismissed, "onErrorAlertDismissed");
        Intrinsics.checkNotNullParameter(onAlertPrimaryCtaClicked, "onAlertPrimaryCtaClicked");
        Intrinsics.checkNotNullParameter(onAlertSecondaryCtaClicked, "onAlertSecondaryCtaClicked");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1379107684);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(style) : composerStartRestartGroup.changedInstance(style) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onErrorAlertDismissed) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onAlertPrimaryCtaClicked) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onAlertSecondaryCtaClicked) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClicked) ? 67108864 : 33554432;
                    }
                    i4 = i2 & 512;
                    if (i4 != 0) {
                        if ((805306368 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1379107684, i3, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable (PersonaSplashComposable.kt:46)");
                            }
                            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.m6702constructorimpl(style.m25313getAssetBackgroundColorValuesVKNKU()), false, null, 6, null);
                            final boolean z6 = z4;
                            final Modifier modifier4 = modifier2;
                            final boolean z7 = z5;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1526069585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt.PersonaSplashComposable.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: PersonaSplashComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $isLoading;
                                    final /* synthetic */ Function0<Unit> $onPrimaryCtaClicked;
                                    final /* synthetic */ Function0<Unit> $onSecondaryCtaClicked;
                                    final /* synthetic */ SplashScreenStyle $style;

                                    AnonymousClass1(SplashScreenStyle splashScreenStyle, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
                                        this.$style = splashScreenStyle;
                                        this.$isLoading = z;
                                        this.$onPrimaryCtaClicked = function0;
                                        this.$onSecondaryCtaClicked = function02;
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
                                            ComposerKt.traceEventStart(389339636, i, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous>.<anonymous> (PersonaSplashComposable.kt:55)");
                                        }
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                                        composer.startReplaceGroup(493247266);
                                        String strStringResource2 = this.$style.getAllowSkip() ? StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_secondary_cta, composer, 0) : null;
                                        composer.endReplaceGroup();
                                        boolean z = !this.$isLoading;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$onPrimaryCtaClicked);
                                        final Function0<Unit> function0 = this.$onPrimaryCtaClicked;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return PersonaSplashComposable.C143851.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue;
                                        composer.endReplaceGroup();
                                        boolean z2 = this.$isLoading;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer.changed(this.$onSecondaryCtaClicked);
                                        final Function0<Unit> function03 = this.$onSecondaryCtaClicked;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return PersonaSplashComposable.C143851.AnonymousClass1.invoke$lambda$3$lambda$2(function03);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function02, strStringResource, z2, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, z, composer, 0, 0, 26174);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer2, int i5) {
                                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1526069585, i5, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous> (PersonaSplashComposable.kt:50)");
                                    }
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i6 = BentoTheme.$stable;
                                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(389339636, true, new AnonymousClass1(style, z, onPrimaryCtaClicked, onSecondaryCtaClicked), composer2, 54);
                                    final SplashScreenStyle splashScreenStyle = style;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, null, composableLambdaRememberComposableLambda, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-996447298, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt.PersonaSplashComposable.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                            invoke(paddingValues, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                                            int i8;
                                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                            if ((i7 & 6) == 0) {
                                                i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                                            } else {
                                                i8 = i7;
                                            }
                                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-996447298, i8, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous>.<anonymous> (PersonaSplashComposable.kt:68)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, paddingValues.getBottom(), 7, null);
                                            SplashScreenStyle splashScreenStyle2 = splashScreenStyle;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            Spacer2.Spacer(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues.getTop()), Color.m6702constructorimpl(splashScreenStyle2.m25313getAssetBackgroundColorValuesVKNKU()), null, 2, null), composer3, 0);
                                            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, Color.m6702constructorimpl(splashScreenStyle2.m25313getAssetBackgroundColorValuesVKNKU()), null, 2, null), 0.0f, 1, null), 0.5f, false, 2, null);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(splashScreenStyle2.getAsset(), composer3, 0), (String) null, SizeKt.wrapContentSize$default(companion, null, false, 3, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                                            composer3.endNode();
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0.0f, composer3, 6, 6);
                                            Modifier modifierWeight$default2 = Column5.weight$default(column6, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 0.5f, false, 2, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(splashScreenStyle2.getTitle(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getBookCoverCapsuleSmall(), composer3, 0, 0, 8190);
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), composer3, 0);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(splashScreenStyle2.getSubtitle(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                                            composer3.endNode();
                                            composer3.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 805306752, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
                                    composer2.startReplaceGroup(-1968934007);
                                    if (z6) {
                                        String strStringResource = StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_title, composer2, 0);
                                        BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_message, composer2, 0));
                                        BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_positive_btn, composer2, 0), onAlertPrimaryCtaClicked);
                                        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_negative_btn, composer2, 0), onAlertSecondaryCtaClicked);
                                        Function0<Unit> function0 = onAlertSecondaryCtaClicked;
                                        int i7 = BentoAlertDialog2.Body.Text.$stable << 3;
                                        int i8 = BentoAlertButton.$stable;
                                        BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i7 | (i8 << 6) | (i8 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                    }
                                    composer2.endReplaceGroup();
                                    if (z7) {
                                        BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C14254R.string.persona_error_dialog_title, composer2, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14254R.string.persona_error_dialog_body, composer2, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), onErrorAlertDismissed), null, null, null, false, null, onErrorAlertDismissed, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PersonaSplashComposable.PersonaSplashComposable$lambda$0(style, z, z2, z3, onErrorAlertDismissed, onAlertPrimaryCtaClicked, onAlertSecondaryCtaClicked, onPrimaryCtaClicked, onSecondaryCtaClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    modifier2 = modifier;
                    if ((i3 & 306783379) != 306783378) {
                        if (i4 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.m6702constructorimpl(style.m25313getAssetBackgroundColorValuesVKNKU()), false, null, 6, null);
                        final boolean z62 = z4;
                        final Modifier modifier42 = modifier2;
                        final boolean z72 = z5;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1526069585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt.PersonaSplashComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: PersonaSplashComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ boolean $isLoading;
                                final /* synthetic */ Function0<Unit> $onPrimaryCtaClicked;
                                final /* synthetic */ Function0<Unit> $onSecondaryCtaClicked;
                                final /* synthetic */ SplashScreenStyle $style;

                                AnonymousClass1(SplashScreenStyle splashScreenStyle, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
                                    this.$style = splashScreenStyle;
                                    this.$isLoading = z;
                                    this.$onPrimaryCtaClicked = function0;
                                    this.$onSecondaryCtaClicked = function02;
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
                                        ComposerKt.traceEventStart(389339636, i, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous>.<anonymous> (PersonaSplashComposable.kt:55)");
                                    }
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                                    composer.startReplaceGroup(493247266);
                                    String strStringResource2 = this.$style.getAllowSkip() ? StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_secondary_cta, composer, 0) : null;
                                    composer.endReplaceGroup();
                                    boolean z = !this.$isLoading;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$onPrimaryCtaClicked);
                                    final Function0 function0 = this.$onPrimaryCtaClicked;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PersonaSplashComposable.C143851.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function02 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    boolean z2 = this.$isLoading;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer.changed(this.$onSecondaryCtaClicked);
                                    final Function0 function03 = this.$onSecondaryCtaClicked;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt$PersonaSplashComposable$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PersonaSplashComposable.C143851.AnonymousClass1.invoke$lambda$3$lambda$2(function03);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function02, strStringResource, z2, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, z, composer, 0, 0, 26174);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer2, int i5) {
                                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1526069585, i5, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous> (PersonaSplashComposable.kt:50)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier42);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(389339636, true, new AnonymousClass1(style, z, onPrimaryCtaClicked, onSecondaryCtaClicked), composer2, 54);
                                final SplashScreenStyle splashScreenStyle = style;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, null, composableLambdaRememberComposableLambda, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-996447298, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposableKt.PersonaSplashComposable.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                                        int i8;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i7 & 6) == 0) {
                                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                                        } else {
                                            i8 = i7;
                                        }
                                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-996447298, i8, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashComposable.<anonymous>.<anonymous> (PersonaSplashComposable.kt:68)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, paddingValues.getBottom(), 7, null);
                                        SplashScreenStyle splashScreenStyle2 = splashScreenStyle;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        Spacer2.Spacer(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues.getTop()), Color.m6702constructorimpl(splashScreenStyle2.m25313getAssetBackgroundColorValuesVKNKU()), null, 2, null), composer3, 0);
                                        Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, Color.m6702constructorimpl(splashScreenStyle2.m25313getAssetBackgroundColorValuesVKNKU()), null, 2, null), 0.0f, 1, null), 0.5f, false, 2, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(splashScreenStyle2.getAsset(), composer3, 0), (String) null, SizeKt.wrapContentSize$default(companion, null, false, 3, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                                        composer3.endNode();
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0.0f, composer3, 6, 6);
                                        Modifier modifierWeight$default2 = Column5.weight$default(column6, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 0.5f, false, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(splashScreenStyle2.getTitle(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getBookCoverCapsuleSmall(), composer3, 0, 0, 8190);
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM()), composer3, 0);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(splashScreenStyle2.getSubtitle(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                                        composer3.endNode();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 805306752, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
                                composer2.startReplaceGroup(-1968934007);
                                if (z62) {
                                    String strStringResource = StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_title, composer2, 0);
                                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_message, composer2, 0));
                                    BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_positive_btn, composer2, 0), onAlertPrimaryCtaClicked);
                                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C14254R.string.doc_upload_assistant_skip_dialog_negative_btn, composer2, 0), onAlertSecondaryCtaClicked);
                                    Function0<Unit> function0 = onAlertSecondaryCtaClicked;
                                    int i7 = BentoAlertDialog2.Body.Text.$stable << 3;
                                    int i8 = BentoAlertButton.$stable;
                                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i7 | (i8 << 6) | (i8 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                }
                                composer2.endReplaceGroup();
                                if (z72) {
                                    BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C14254R.string.persona_error_dialog_title, composer2, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14254R.string.persona_error_dialog_body, composer2, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), onErrorAlertDismissed), null, null, null, false, null, onErrorAlertDismissed, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z3;
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i4 = i2 & 512;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i2 & 8) != 0) {
            }
            z5 = z3;
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        z4 = z2;
        if ((i2 & 8) != 0) {
        }
        z5 = z3;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
