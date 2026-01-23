package com.robinhood.android.gold.sage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.lib.sage.GoldSageBottomBar3;
import com.robinhood.android.gold.lib.sage.GoldSageScaffold3;
import com.robinhood.android.gold.sage.GoldSageSplashComposable3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.targetbackend.Endpoint;
import gold.proto.p464v1.GoldSageSplash;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldSageSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002"}, m3636d2 = {GoldSageSplashComposable3.GoldSageSplashLottieTestTag, "", "GoldSageSplashComposable", "", "content", "Lgold/proto/v1/GoldSageSplash;", "onClickPrimaryCta", "Lkotlin/Function0;", "onClickSecondaryCta", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "url", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lgold/proto/v1/GoldSageSplash;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Content", "animationPath", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-gold-sage_externalRelease", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageSplashComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageSplashComposable3 {
    public static final String GoldSageSplashLottieTestTag = "GoldSageSplashLottieTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(String str, String str2, String str3, int i, Composer composer, int i2) {
        Content(str, str2, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentPreview$lambda$5(int i, Composer composer, int i2) {
        ContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageSplashComposable$lambda$0(GoldSageSplash goldSageSplash, Function0 function0, Function1 function1, Modifier modifier, boolean z, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldSageSplashComposable(goldSageSplash, function0, function1, modifier, z, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageSplashComposable(final GoldSageSplash content, final Function0<Unit> onClickPrimaryCta, final Function1<? super String, Unit> onClickSecondaryCta, Modifier modifier, boolean z, Screen screen, Context context, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        Screen screen2;
        int i5;
        Context context2;
        Context context3;
        Screen screen3;
        final boolean z3;
        final boolean z4;
        final Screen screen4;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Intrinsics.checkNotNullParameter(onClickSecondaryCta, "onClickSecondaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1840849804);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickSecondaryCta) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        screen2 = screen;
                        int i7 = composerStartRestartGroup.changedInstance(screen2) ? 131072 : 65536;
                        i3 |= i7;
                    } else {
                        screen2 = screen;
                    }
                    i3 |= i7;
                } else {
                    screen2 = screen;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        context2 = context;
                        i3 |= composerStartRestartGroup.changedInstance(context2) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                screen2 = new Screen(Screen.Name.GOLD_SAGE_SPLASH, null, null, null, 14, null);
                            }
                            if (i5 == 0) {
                                context3 = null;
                                screen3 = screen2;
                                modifier2 = modifier3;
                                z3 = z2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1840849804, i3, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable (GoldSageSplashComposable.kt:46)");
                                }
                                final GoldSageSplash goldSageSplash = !z3 ? new GoldSageSplash("", "--- --- -- --- ------ -------- -----", "----- - -------- ---- ------ -- ----- ----- ----- ---- --- -------- ------- ------- -- ---- ---- ---------- ----- ---- ------ -- -------- ----- --- - ---- ------", "------- ------ ------ -----", "--------", "------- ---- ----", "", "", null, 256, null) : content;
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1233855201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i8) {
                                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1233855201, i8, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous> (GoldSageSplashComposable.kt:67)");
                                        }
                                        final boolean z5 = z3;
                                        final Modifier modifier4 = modifier2;
                                        final GoldSageSplash goldSageSplash2 = goldSageSplash;
                                        final Function0<Unit> function0 = onClickPrimaryCta;
                                        final Function1<String, Unit> function1 = onClickSecondaryCta;
                                        GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(249854700, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                                invoke(paddingValues, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(final PaddingValues paddingValues, Composer composer3, int i9) {
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i9 & 6) == 0) {
                                                    i9 |= composer3.changed(paddingValues) ? 4 : 2;
                                                }
                                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(249854700, i9, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:68)");
                                                }
                                                final boolean z6 = z5;
                                                final Modifier modifier5 = modifier4;
                                                final GoldSageSplash goldSageSplash3 = goldSageSplash2;
                                                final Function0<Unit> function02 = function0;
                                                final Function1<String, Unit> function12 = function1;
                                                LocalShowPlaceholder.Loadable(z6, null, null, ComposableLambda3.rememberComposableLambda(-858358660, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* compiled from: GoldSageSplashComposable.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    @SourceDebugExtension
                                                    /* renamed from: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$GoldSageSplashComposable$1$1$1$2, reason: invalid class name */
                                                    static final class AnonymousClass2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                                        final /* synthetic */ GoldSageSplash $contentToDisplay;
                                                        final /* synthetic */ Function0<Unit> $onClickPrimaryCta;
                                                        final /* synthetic */ Function1<String, Unit> $onClickSecondaryCta;

                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        AnonymousClass2(GoldSageSplash goldSageSplash, Function0<Unit> function0, Function1<? super String, Unit> function1) {
                                                            this.$contentToDisplay = goldSageSplash;
                                                            this.$onClickPrimaryCta = function0;
                                                            this.$onClickSecondaryCta = function1;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                                            invoke(bentoButtonBar3, composer, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                                            Function0 function0;
                                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                                composer.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(141181863, i, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:71)");
                                                            }
                                                            String cta_text = this.$contentToDisplay.getCta_text();
                                                            Function0<Unit> function02 = this.$onClickPrimaryCta;
                                                            String cta_disclosure = this.$contentToDisplay.getCta_disclosure();
                                                            String secondary_cta_text = this.$contentToDisplay.getSecondary_cta_text();
                                                            final String secondary_cta_url = this.$contentToDisplay.getSecondary_cta_url();
                                                            composer.startReplaceGroup(-1763168946);
                                                            if (secondary_cta_url == null) {
                                                                function0 = null;
                                                            } else {
                                                                final Function1<String, Unit> function1 = this.$onClickSecondaryCta;
                                                                composer.startReplaceGroup(-1633490746);
                                                                boolean zChanged = composer.changed(function1) | composer.changed(secondary_cta_url);
                                                                Object objRememberedValue = composer.rememberedValue();
                                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$GoldSageSplashComposable$1$1$1$2$$ExternalSyntheticLambda0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            return GoldSageSplashComposable3.C178881.AnonymousClass1.C501711.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(function1, secondary_cta_url);
                                                                        }
                                                                    };
                                                                    composer.updateRememberedValue(objRememberedValue);
                                                                }
                                                                function0 = (Function0) objRememberedValue;
                                                                composer.endReplaceGroup();
                                                            }
                                                            Function0 function03 = function0;
                                                            composer.endReplaceGroup();
                                                            GoldSageBottomBar3.GoldSageBottomBar(cta_text, function02, null, null, cta_disclosure, secondary_cta_text, function03, false, composer, 0, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, String str) {
                                                            function1.invoke(str);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    public final void invoke(Composer composer4, int i10) {
                                                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-858358660, i10, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:69)");
                                                        }
                                                        Modifier modifierPadding = PaddingKt.padding(modifier5, paddingValues);
                                                        if (!z6) {
                                                            modifierPadding = ModifiersKt.logScreenTransitions$default(modifierPadding, null, 1, null);
                                                        }
                                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(141181863, true, new AnonymousClass2(goldSageSplash3, function02, function12), composer4, 54);
                                                        final GoldSageSplash goldSageSplash4 = goldSageSplash3;
                                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-92659564, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1.1.3
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                                                invoke(boxScope, composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                                if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-92659564, i11, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:84)");
                                                                }
                                                                GoldSageSplashComposable3.Content(goldSageSplash4.getAnimation_path(), goldSageSplash4.getTitle(), goldSageSplash4.getDescription(), composer5, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer4, 54), composer4, 3504, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 3072, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, 48, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z3;
                                screen4 = screen3;
                                context4 = context3;
                            } else {
                                modifier2 = modifier3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        z3 = z2;
                        screen3 = screen2;
                        context3 = context2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z3) {
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1233855201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1233855201, i8, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous> (GoldSageSplashComposable.kt:67)");
                                }
                                final boolean z5 = z3;
                                final Modifier modifier4 = modifier2;
                                final GoldSageSplash goldSageSplash2 = goldSageSplash;
                                final Function0<Unit> function0 = onClickPrimaryCta;
                                final Function1<? super String, Unit> function1 = onClickSecondaryCta;
                                GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(249854700, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i9 & 6) == 0) {
                                            i9 |= composer3.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(249854700, i9, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:68)");
                                        }
                                        final boolean z6 = z5;
                                        final Modifier modifier5 = modifier4;
                                        final GoldSageSplash goldSageSplash3 = goldSageSplash2;
                                        final Function0<Unit> function02 = function0;
                                        final Function1<? super String, Unit> function12 = function1;
                                        LocalShowPlaceholder.Loadable(z6, null, null, ComposableLambda3.rememberComposableLambda(-858358660, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* compiled from: GoldSageSplashComposable.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$GoldSageSplashComposable$1$1$1$2, reason: invalid class name */
                                            static final class AnonymousClass2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                                final /* synthetic */ GoldSageSplash $contentToDisplay;
                                                final /* synthetic */ Function0<Unit> $onClickPrimaryCta;
                                                final /* synthetic */ Function1<String, Unit> $onClickSecondaryCta;

                                                /* JADX WARN: Multi-variable type inference failed */
                                                AnonymousClass2(GoldSageSplash goldSageSplash, Function0<Unit> function0, Function1<? super String, Unit> function1) {
                                                    this.$contentToDisplay = goldSageSplash;
                                                    this.$onClickPrimaryCta = function0;
                                                    this.$onClickSecondaryCta = function1;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                                    invoke(bentoButtonBar3, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                                    Function0 function0;
                                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(141181863, i, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:71)");
                                                    }
                                                    String cta_text = this.$contentToDisplay.getCta_text();
                                                    Function0<Unit> function02 = this.$onClickPrimaryCta;
                                                    String cta_disclosure = this.$contentToDisplay.getCta_disclosure();
                                                    String secondary_cta_text = this.$contentToDisplay.getSecondary_cta_text();
                                                    final String secondary_cta_url = this.$contentToDisplay.getSecondary_cta_url();
                                                    composer.startReplaceGroup(-1763168946);
                                                    if (secondary_cta_url == null) {
                                                        function0 = null;
                                                    } else {
                                                        final Function1 function1 = this.$onClickSecondaryCta;
                                                        composer.startReplaceGroup(-1633490746);
                                                        boolean zChanged = composer.changed(function1) | composer.changed(secondary_cta_url);
                                                        Object objRememberedValue = composer.rememberedValue();
                                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$GoldSageSplashComposable$1$1$1$2$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return GoldSageSplashComposable3.C178881.AnonymousClass1.C501711.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(function1, secondary_cta_url);
                                                                }
                                                            };
                                                            composer.updateRememberedValue(objRememberedValue);
                                                        }
                                                        function0 = (Function0) objRememberedValue;
                                                        composer.endReplaceGroup();
                                                    }
                                                    Function0 function03 = function0;
                                                    composer.endReplaceGroup();
                                                    GoldSageBottomBar3.GoldSageBottomBar(cta_text, function02, null, null, cta_disclosure, secondary_cta_text, function03, false, composer, 0, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, String str) {
                                                    function1.invoke(str);
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            public final void invoke(Composer composer4, int i10) {
                                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-858358660, i10, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:69)");
                                                }
                                                Modifier modifierPadding = PaddingKt.padding(modifier5, paddingValues);
                                                if (!z6) {
                                                    modifierPadding = ModifiersKt.logScreenTransitions$default(modifierPadding, null, 1, null);
                                                }
                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(141181863, true, new AnonymousClass2(goldSageSplash3, function02, function12), composer4, 54);
                                                final GoldSageSplash goldSageSplash4 = goldSageSplash3;
                                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-92659564, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt.GoldSageSplashComposable.1.1.1.3
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                                        invoke(boxScope, composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i11) {
                                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                        if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-92659564, i11, -1, "com.robinhood.android.gold.sage.GoldSageSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldSageSplashComposable.kt:84)");
                                                        }
                                                        GoldSageSplashComposable3.Content(goldSageSplash4.getAnimation_path(), goldSageSplash4.getTitle(), goldSageSplash4.getDescription(), composer5, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, 3504, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z3;
                        screen4 = screen3;
                        context4 = context3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        screen4 = screen2;
                        context4 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldSageSplashComposable3.GoldSageSplashComposable$lambda$0(content, onClickPrimaryCta, onClickSecondaryCta, modifier2, z4, screen4, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                context2 = context;
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            context2 = context;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        context2 = context;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition Content$lambda$3$lambda$2$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final String str, String str2, String str3, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        Composer composer2;
        final String str4;
        final String str5;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813125888);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str4 = str2;
            str5 = str3;
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813125888, i4, -1, "com.robinhood.android.gold.sage.Content (GoldSageSplashComposable.kt:100)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion3.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(-1778711134);
            if (str != null) {
                i3 = i4;
                companion = companion2;
                LottieAnimation2.LottieAnimation(Content$lambda$3$lambda$2$lambda$1(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(str).build().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), SizeKt.m5169size3ABfNKs(TestTag3.testTag(companion2, GoldSageSplashLottieTestTag), PrimitiveResources_androidKt.dimensionResource(C17907R.dimen.gold_sage_splash_lottie_height, composerStartRestartGroup, 0)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097148);
                composer2 = composerStartRestartGroup;
            } else {
                companion = companion2;
                i3 = i4;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM()), composer2, 0);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer2, i5).getDisplayCapsuleLarge();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            Composer composer4 = composer2;
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer4, (i3 >> 3) & 14, 0, 8126);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM()), composer4, 0);
            str4 = str2;
            str5 = str3;
            BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, (i3 >> 6) & 14, 0, 16318);
            composer3 = composer4;
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageSplashComposable3.Content$lambda$4(str, str4, str5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1145167485);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1145167485, i, -1, "com.robinhood.android.gold.sage.ContentPreview (GoldSageSplashComposable.kt:132)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, GoldSageSplashComposable.INSTANCE.m15068getLambda$666112459$feature_gold_sage_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageSplashComposable3.ContentPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
