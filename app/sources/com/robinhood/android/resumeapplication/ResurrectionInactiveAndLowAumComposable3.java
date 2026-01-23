package com.robinhood.android.resumeapplication;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.ResumeApplicationChurnedAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ResurrectionInactiveAndLowAumComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"ResurrectionInactiveAndLowAumComposable", "", "headerImage", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "title", "", "subtitle", "valueProps", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/ResumeApplicationChurnedAction;", "gradientBackground", "Landroidx/compose/ui/graphics/Brush;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "onFundAccountCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/graphics/Brush;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TEST_TAG_HEADER_IMAGE", NavIconButton.TEST_TAG_CLOSE_BUTTON, "TEST_TAG_CTA_BUTTON", "feature-lib-resume-application_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ResurrectionInactiveAndLowAumComposable3 {
    public static final String TEST_TAG_CLOSE_BUTTON = "ResumeApplicationChurnedFundV2Composable.CloseButton";
    public static final String TEST_TAG_CTA_BUTTON = "ResumeApplicationChurnedFundV2Composable.CtaButton";
    public static final String TEST_TAG_HEADER_IMAGE = "ResumeApplicationChurnedFundV2Composable.HeaderImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResurrectionInactiveAndLowAumComposable$lambda$0(ThemedImageSource themedImageSource, String str, String str2, ImmutableList immutableList, RichText richText, UIComponent uIComponent, Brush brush, SduiActionHandler sduiActionHandler, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ResurrectionInactiveAndLowAumComposable(themedImageSource, str, str2, immutableList, richText, uIComponent, brush, sduiActionHandler, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ResurrectionInactiveAndLowAumComposable(final ThemedImageSource headerImage, final String title, final String subtitle, final ImmutableList<? extends UIComponent<? extends GenericAction>> valueProps, final RichText disclosure, final UIComponent<? extends ResumeApplicationChurnedAction> cta, final Brush gradientBackground, final SduiActionHandler<? super ResumeApplicationChurnedAction> actionHandler, final Function0<Unit> onFundAccountCancel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(gradientBackground, "gradientBackground");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onFundAccountCancel, "onFundAccountCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(346573039);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(headerImage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(subtitle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(valueProps) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(disclosure) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cta) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(gradientBackground) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFundAccountCancel) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 == 0) {
            if ((805306368 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(346573039, i3, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable (ResurrectionInactiveAndLowAumComposable.kt:59)");
                }
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2051778505, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1
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
                            ComposerKt.traceEventStart(-2051778505, i5, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:61)");
                        }
                        SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ResurrectionInactiveAndLowAumComposable4(systemUiControllerRememberSystemUiController, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                        Modifier modifierBackground$default = Background3.background$default(modifier4, gradientBackground, null, 0.0f, 6, null);
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                        final Function0<Unit> function0 = onFundAccountCancel;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierBackground$default, ComposableLambda3.rememberComposableLambda(-729879565, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1.2
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
                                    ComposerKt.traceEventStart(-729879565, i6, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:77)");
                                }
                                Function2<Composer, Integer, Unit> function2M2422xcd65f908 = ResurrectionInactiveAndLowAumComposable.INSTANCE.m2422xcd65f908();
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2422xcd65f908, null, ComposableLambda3.rememberComposableLambda(1300126034, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                        invoke(bentoAppBarScope, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1300126034, i7, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:80)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, ResurrectionInactiveAndLowAumComposable3.TEST_TAG_CLOSE_BUTTON), false, 0L, function02, composer5, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, null, 0, jM6725getTransparent0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(523895432, true, new AnonymousClass3(headerImage, title, subtitle, valueProps, disclosure, actionHandler, cta), composer3, 54), composer3, 806879280, 316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ResurrectionInactiveAndLowAumComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SduiActionHandler<ResumeApplicationChurnedAction> $actionHandler;
                        final /* synthetic */ UIComponent<ResumeApplicationChurnedAction> $cta;
                        final /* synthetic */ RichText $disclosure;
                        final /* synthetic */ ThemedImageSource $headerImage;
                        final /* synthetic */ String $subtitle;
                        final /* synthetic */ String $title;
                        final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $valueProps;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass3(ThemedImageSource themedImageSource, String str, String str2, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, RichText richText, SduiActionHandler<? super ResumeApplicationChurnedAction> sduiActionHandler, UIComponent<? extends ResumeApplicationChurnedAction> uIComponent) {
                            this.$headerImage = themedImageSource;
                            this.$title = str;
                            this.$subtitle = str2;
                            this.$valueProps = immutableList;
                            this.$disclosure = richText;
                            this.$actionHandler = sduiActionHandler;
                            this.$cta = uIComponent;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            BentoTheme bentoTheme;
                            int i3;
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
                                ComposerKt.traceEventStart(523895432, i2, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:89)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                            ThemedImageSource themedImageSource = this.$headerImage;
                            String str = this.$title;
                            String str2 = this.$subtitle;
                            ImmutableList<UIComponent<GenericAction>> immutableList = this.$valueProps;
                            RichText richText = this.$disclosure;
                            SduiActionHandler<ResumeApplicationChurnedAction> sduiActionHandler = this.$actionHandler;
                            final UIComponent<ResumeApplicationChurnedAction> uIComponent = this.$cta;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), composer, 0);
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(UtilKt.toImageUrl(themedImageSource.getLight(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer, 0, 62), "", TestTag3.testTag(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(188)), 0.0f, 1, null), ResurrectionInactiveAndLowAumComposable3.TEST_TAG_HEADER_IMAGE), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), composer, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null);
                            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer, i4).getDisplayCapsuleLarge();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
                            composer.startReplaceGroup(-584339505);
                            if (Intrinsics.areEqual(str2, "")) {
                                bentoTheme = bentoTheme2;
                                i3 = i4;
                            } else {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), composer, 0);
                                bentoTheme = bentoTheme2;
                                i3 = i4;
                                BentoText2.m20747BentoText38GnDrw(str2, SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 48, 0, 8124);
                            }
                            composer.endReplaceGroup();
                            int i5 = i3;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21591getLargeD9Ej5fM()), composer, 0);
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 1, null);
                            ImmutableList immutableList2 = extensions2.toImmutableList(immutableList);
                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                            composer.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList2, GenericAction.class, modifierM5144paddingVpY3zN4$default2, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer, 100862976, 0);
                            composer.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21591getLargeD9Ej5fM()), composer, 0);
                            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 7, null);
                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i5).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion4.m7922getLefte0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i5).m21426getFg20d7_KjU();
                            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer, i5).m21426getFg20d7_KjU();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(uriHandler);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ResurrectionInactiveAndLowAumComposable3.C269521.AnonymousClass3.invoke$lambda$4$lambda$2$lambda$1$lambda$0(uriHandler, (Uri) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoRichText.m15949BentoRichText0sCZWFg(richText, modifierM5146paddingqDBjuR0$default, textStyleM7655copyp1EtxEg$default, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 480);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM()), composer, 0);
                            composer.endNode();
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(195951884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3$1$2$1
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
                                        ComposerKt.traceEventStart(195951884, i6, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:165)");
                                    }
                                    SduiComponent3.SduiComponent(uIComponent, SizeKt.fillMaxWidth$default(TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null), ResurrectionInactiveAndLowAumComposable3.TEST_TAG_CTA_BUTTON), 0.0f, 1, null), null, composer2, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 48);
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$2$lambda$1$lambda$0(UriHandler uriHandler, Uri uri) {
                            Intrinsics.checkNotNullParameter(uri, "uri");
                            String string2 = uri.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            uriHandler.openUri(string2);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ResurrectionInactiveAndLowAumComposable3.ResurrectionInactiveAndLowAumComposable$lambda$0(headerImage, title, subtitle, valueProps, disclosure, cta, gradientBackground, actionHandler, onFundAccountCancel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 805306368;
        modifier2 = modifier;
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2051778505, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1
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
                        ComposerKt.traceEventStart(-2051778505, i5, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:61)");
                    }
                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceGroup(5004770);
                    boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ResurrectionInactiveAndLowAumComposable4(systemUiControllerRememberSystemUiController, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                    Modifier modifierBackground$default = Background3.background$default(modifier4, gradientBackground, null, 0.0f, 6, null);
                    long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                    final Function0<Unit> function0 = onFundAccountCancel;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierBackground$default, ComposableLambda3.rememberComposableLambda(-729879565, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1.2
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
                                ComposerKt.traceEventStart(-729879565, i6, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:77)");
                            }
                            Function2<Composer, Integer, Unit> function2M2422xcd65f908 = ResurrectionInactiveAndLowAumComposable.INSTANCE.m2422xcd65f908();
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2422xcd65f908, null, ComposableLambda3.rememberComposableLambda(1300126034, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt.ResurrectionInactiveAndLowAumComposable.1.2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                    invoke(bentoAppBarScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1300126034, i7, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:80)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, ResurrectionInactiveAndLowAumComposable3.TEST_TAG_CLOSE_BUTTON), false, 0L, function02, composer5, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, null, 0, jM6725getTransparent0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(523895432, true, new AnonymousClass3(headerImage, title, subtitle, valueProps, disclosure, actionHandler, cta), composer3, 54), composer3, 806879280, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ResurrectionInactiveAndLowAumComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3, reason: invalid class name */
                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SduiActionHandler<ResumeApplicationChurnedAction> $actionHandler;
                    final /* synthetic */ UIComponent<ResumeApplicationChurnedAction> $cta;
                    final /* synthetic */ RichText $disclosure;
                    final /* synthetic */ ThemedImageSource $headerImage;
                    final /* synthetic */ String $subtitle;
                    final /* synthetic */ String $title;
                    final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $valueProps;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass3(ThemedImageSource themedImageSource, String str, String str2, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, RichText richText, SduiActionHandler<? super ResumeApplicationChurnedAction> sduiActionHandler, UIComponent<? extends ResumeApplicationChurnedAction> uIComponent) {
                        this.$headerImage = themedImageSource;
                        this.$title = str;
                        this.$subtitle = str2;
                        this.$valueProps = immutableList;
                        this.$disclosure = richText;
                        this.$actionHandler = sduiActionHandler;
                        this.$cta = uIComponent;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        BentoTheme bentoTheme;
                        int i3;
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
                            ComposerKt.traceEventStart(523895432, i2, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:89)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        ThemedImageSource themedImageSource = this.$headerImage;
                        String str = this.$title;
                        String str2 = this.$subtitle;
                        ImmutableList<UIComponent<GenericAction>> immutableList = this.$valueProps;
                        RichText richText = this.$disclosure;
                        SduiActionHandler<ResumeApplicationChurnedAction> sduiActionHandler = this.$actionHandler;
                        final UIComponent<? extends ResumeApplicationChurnedAction> uIComponent = this.$cta;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), composer, 0);
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(UtilKt.toImageUrl(themedImageSource.getLight(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer, 0, 62), "", TestTag3.testTag(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(188)), 0.0f, 1, null), ResurrectionInactiveAndLowAumComposable3.TEST_TAG_HEADER_IMAGE), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), composer, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null);
                        TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer, i4).getDisplayCapsuleLarge();
                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
                        composer.startReplaceGroup(-584339505);
                        if (Intrinsics.areEqual(str2, "")) {
                            bentoTheme = bentoTheme2;
                            i3 = i4;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), composer, 0);
                            bentoTheme = bentoTheme2;
                            i3 = i4;
                            BentoText2.m20747BentoText38GnDrw(str2, SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 48, 0, 8124);
                        }
                        composer.endReplaceGroup();
                        int i5 = i3;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21591getLargeD9Ej5fM()), composer, 0);
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 1, null);
                        ImmutableList immutableList2 = extensions2.toImmutableList(immutableList);
                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                        composer.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList2, GenericAction.class, modifierM5144paddingVpY3zN4$default2, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer, 100862976, 0);
                        composer.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21591getLargeD9Ej5fM()), composer, 0);
                        final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 7, null);
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i5).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion4.m7922getLefte0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i5).m21426getFg20d7_KjU();
                        long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer, i5).m21426getFg20d7_KjU();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(uriHandler);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ResurrectionInactiveAndLowAumComposable3.C269521.AnonymousClass3.invoke$lambda$4$lambda$2$lambda$1$lambda$0(uriHandler, (Uri) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoRichText.m15949BentoRichText0sCZWFg(richText, modifierM5146paddingqDBjuR0$default, textStyleM7655copyp1EtxEg$default, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 480);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM()), composer, 0);
                        composer.endNode();
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM());
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(195951884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposableKt$ResurrectionInactiveAndLowAumComposable$1$3$1$2$1
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
                                    ComposerKt.traceEventStart(195951884, i6, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:165)");
                                }
                                SduiComponent3.SduiComponent(uIComponent, SizeKt.fillMaxWidth$default(TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null), ResurrectionInactiveAndLowAumComposable3.TEST_TAG_CTA_BUTTON), 0.0f, 1, null), null, composer2, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 48);
                        composer.endNode();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$2$lambda$1$lambda$0(UriHandler uriHandler, Uri uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        String string2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        uriHandler.openUri(string2);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
