package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.gold.LegacyGoldUpgradeWelcomeIncompleteComposable;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001au\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r26\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0003¢\u0006\u0002\u0010\u001a\u001aE\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"ConfirmationImageTestTag", "", "getConfirmationImageTestTag$annotations", "()V", "CONFIRMATION_IMAGE_ASPECT_RATIO", "", "GoldUpgradeConfirmationComposable", "", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "goldConfirmation", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "isSweepEnabled", "", "onClickCta", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isActionHandled", "onClickFailedCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConfirmationIncomplete", "errorDescription", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConfirmationComplete", "onClickSecondaryCta", "alertMessage", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeConfirmationComposable {
    private static final float CONFIRMATION_IMAGE_ASPECT_RATIO = 0.77319586f;
    public static final String ConfirmationImageTestTag = "confirmationImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationComplete$lambda$3(ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, Function0 function0, Function0 function02, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConfirmationComplete(apiGoldConfirmation, function0, function02, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationIncomplete$lambda$1(String str, Function0 function0, int i, Composer composer, int i2) {
        ConfirmationIncomplete(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeConfirmationComposable$lambda$0(GoldUpgradeOutcome goldUpgradeOutcome, ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, boolean z, Function2 function2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldUpgradeConfirmationComposable(goldUpgradeOutcome, apiGoldConfirmation, z, function2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getConfirmationImageTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeConfirmationComposable(final GoldUpgradeOutcome outcome, final ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation, final boolean z, final Function2<? super Boolean, ? super Boolean, Unit> onClickCta, final Function0<Unit> onClickFailedCta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(goldConfirmation, "goldConfirmation");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(onClickFailedCta, "onClickFailedCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(844056506);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(outcome) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(goldConfirmation) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClickFailedCta) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844056506, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeConfirmationComposable (LegacyGoldUpgradeConfirmationComposable.kt:61)");
                    }
                    final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    if (!(outcome instanceof GoldUpgradeOutcome.Complete)) {
                        composerStartRestartGroup.startReplaceGroup(-610501108);
                        final boolean z3 = z2;
                        modifier3 = modifier4;
                        BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1889694070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt.GoldUpgradeConfirmationComposable.1

                            /* compiled from: LegacyGoldUpgradeConfirmationComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$GoldUpgradeConfirmationComposable$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldConfirmation $goldConfirmation;
                                final /* synthetic */ boolean $isSweepEnabled;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Function2<Boolean, Boolean, Unit> $onClickCta;
                                final /* synthetic */ GoldUpgradeOutcome $outcome;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(GoldUpgradeOutcome goldUpgradeOutcome, ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, Modifier modifier) {
                                    this.$outcome = goldUpgradeOutcome;
                                    this.$goldConfirmation = apiGoldConfirmation;
                                    this.$onClickCta = function2;
                                    this.$isSweepEnabled = z;
                                    this.$modifier = modifier;
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
                                        ComposerKt.traceEventStart(-690056932, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeConfirmationComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:68)");
                                    }
                                    final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
                                    String alertMessage = ((GoldUpgradeOutcome.Complete) this.$outcome).getAlertMessage();
                                    ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation = this.$goldConfirmation;
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$goldConfirmation) | composer.changedInstance(sduiActionHandlerCurrentActionHandler) | composer.changed(this.$onClickCta) | composer.changed(this.$isSweepEnabled);
                                    final ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation2 = this.$goldConfirmation;
                                    final Function2<Boolean, Boolean, Unit> function2 = this.$onClickCta;
                                    final boolean z = this.$isSweepEnabled;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$GoldUpgradeConfirmationComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return LegacyGoldUpgradeConfirmationComposable.C180631.AnonymousClass1.invoke$lambda$2$lambda$1(apiGoldConfirmation2, function2, z, sduiActionHandlerCurrentActionHandler);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$goldConfirmation) | composer.changedInstance(sduiActionHandlerCurrentActionHandler) | composer.changed(this.$onClickCta) | composer.changed(this.$isSweepEnabled);
                                    final ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation3 = this.$goldConfirmation;
                                    final Function2<Boolean, Boolean, Unit> function22 = this.$onClickCta;
                                    final boolean z2 = this.$isSweepEnabled;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$GoldUpgradeConfirmationComposable$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return LegacyGoldUpgradeConfirmationComposable.C180631.AnonymousClass1.invoke$lambda$5$lambda$4(apiGoldConfirmation3, sduiActionHandlerCurrentActionHandler, function22, z2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    LegacyGoldUpgradeConfirmationComposable.ConfirmationComplete(apiGoldConfirmation, function0, (Function0) objRememberedValue2, alertMessage, this.$modifier, composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, Function2 function2, boolean z, SduiActionHandler sduiActionHandler) {
                                    GenericAction ctaGenericAction = apiGoldConfirmation.getCtaGenericAction();
                                    if (ctaGenericAction != null) {
                                        function2.invoke(Boolean.valueOf(z), Boolean.valueOf(sduiActionHandler.mo15941handle(ctaGenericAction)));
                                    } else {
                                        function2.invoke(Boolean.valueOf(z), Boolean.FALSE);
                                    }
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, SduiActionHandler sduiActionHandler, Function2 function2, boolean z) {
                                    GenericAction secondaryCtaGenericAction = apiGoldConfirmation.getSecondaryCtaGenericAction();
                                    if (secondaryCtaGenericAction != null) {
                                        function2.invoke(Boolean.valueOf(z), Boolean.valueOf(sduiActionHandler.mo15941handle(secondaryCtaGenericAction)));
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-1889694070, i5, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeConfirmationComposable.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:67)");
                                }
                                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(-690056932, true, new AnonymousClass1(outcome, goldConfirmation, onClickCta, z3, modifier3), composer3, 54), composer3, 24576, 15);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        if (!(outcome instanceof GoldUpgradeOutcome.Incomplete)) {
                            composer2.startReplaceGroup(-610503006);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-610464727);
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1724235826, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt.GoldUpgradeConfirmationComposable.2
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
                                    ComposerKt.traceEventStart(-1724235826, i5, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeConfirmationComposable.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:92)");
                                }
                                StringResource message = ((GoldUpgradeOutcome.Incomplete) outcome).getMessage();
                                Resources resources2 = resources;
                                Intrinsics.checkNotNull(resources2);
                                LegacyGoldUpgradeConfirmationComposable.ConfirmationIncomplete(message.getText(resources2).toString(), onClickFailedCta, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LegacyGoldUpgradeConfirmationComposable.GoldUpgradeConfirmationComposable$lambda$0(outcome, goldConfirmation, z, onClickCta, onClickFailedCta, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                if (!(outcome instanceof GoldUpgradeOutcome.Complete)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConfirmationIncomplete(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(12143506);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(12143506, i2, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationIncomplete (LegacyGoldUpgradeConfirmationComposable.kt:101)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1450326599, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt.ConfirmationIncomplete.1
                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1450326599, i3, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationIncomplete.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:103)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer2, 6, 0));
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C18003R.string.gold_upgrade_confirmation_failed_cta, composer2, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer2, 384, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-561197446, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt.ConfirmationIncomplete.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-561197446, i3, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationIncomplete.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:115)");
                    }
                    LegacyGoldUpgradeWelcomeIncompleteComposable.GoldUpgradeWelcomeIncompleteComposable(str, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeConfirmationComposable.ConfirmationIncomplete$lambda$1(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationComplete(final ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, final Function0<Unit> function0, final Function0<Unit> function02, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1462345653);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGoldConfirmation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1462345653, i3, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete (LegacyGoldUpgradeConfirmationComposable.kt:128)");
                }
                LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable(str2, null, null, null, composerStartRestartGroup, (i3 >> 9) & 14, 14);
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(274299509, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$1
                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(274299509, i5, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:133)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 0, 0));
                        Function0<Unit> function03 = function0;
                        ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation2 = apiGoldConfirmation;
                        Function0<Unit> function04 = function02;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String ctaText = apiGoldConfirmation2.getCtaText();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        String ctaText2 = apiGoldConfirmation2.getCtaText();
                        Screen.Name name = Screen.Name.GOLD_UPGRADE_SUCCESS;
                        Screen screen = new Screen(name, null, null, null, 14, null);
                        String ctaText3 = apiGoldConfirmation2.getCtaText();
                        Component.ComponentType componentType = Component.ComponentType.BUTTON;
                        BentoSparkleButton2.BentoSparkleButton(function03, ctaText, ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, new UserInteractionEventDescriptor(ctaText2, screen, null, null, new Component(componentType, ctaText3, null, 4, null), null, 44, null), false, false, false, true, false, null, 110, null), null, false, false, false, composer2, 0, 120);
                        String secondaryCtaText = apiGoldConfirmation2.getSecondaryCtaText();
                        composer2.startReplaceGroup(-263339226);
                        if (secondaryCtaText != null) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, secondaryCtaText, ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new UserInteractionEventDescriptor(secondaryCtaText, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, secondaryCtaText, null, 4, null), null, 44, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1771620382, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1771620382, i5, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:175)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier3, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                        final ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation2 = apiGoldConfirmation;
                        BoxWithConstraints.BoxWithConstraints(modifierFillMaxSize$default, topCenter, false, ComposableLambda3.rememberComposableLambda(-300628660, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$2.1
                            public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i6) {
                                int i7;
                                Modifier modifierM5146paddingqDBjuR0$default;
                                Modifier.Companion companion;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-300628660, i7, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:181)");
                                }
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * 1.2933334f);
                                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(200);
                                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldConfirmation2.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62);
                                ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, TestTag3.testTag(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.77319586f, false, 2, null), "confirmationImage"), (Alignment) null, fillWidth, 0.0f, (ColorFilter) null, composer3, 25008, 104);
                                if (C2002Dp.m7994compareTo0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl + fM7995constructorimpl2), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM()) >= 0) {
                                    modifierM5146paddingqDBjuR0$default = BoxWithConstraints.align(companion2, Alignment.INSTANCE.getBottomCenter());
                                    companion = companion2;
                                } else {
                                    modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, fM7995constructorimpl, 0.0f, 0.0f, 13, null);
                                    companion = companion2;
                                }
                                Modifier modifierThen = companion.then(modifierM5146paddingqDBjuR0$default);
                                Brush.Companion companion3 = Brush.INSTANCE;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()));
                                Float fValueOf = Float.valueOf(0.3f);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.background$default(modifierThen, Brush.Companion.m6683verticalGradient8A3gB4$default(companion3, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, composer3, 0, 1);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation3 = apiGoldConfirmation2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String title = apiGoldConfirmation3.getTitle();
                                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i8).getDisplayCapsuleLarge();
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                Modifier.Companion companion6 = companion;
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8126);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), composer3, 0);
                                BentoText2.m20747BentoText38GnDrw(apiGoldConfirmation3.getDescription(), null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM()), composer3, 0);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                invoke(boxWithConstraints4, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeConfirmationComposable.ConfirmationComplete$lambda$3(apiGoldConfirmation, function0, function02, str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable(str2, null, null, null, composerStartRestartGroup, (i3 >> 9) & 14, 14);
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(274299509, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$1
                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274299509, i5, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:133)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 0, 0));
                    Function0<Unit> function03 = function0;
                    ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation2 = apiGoldConfirmation;
                    Function0<Unit> function04 = function02;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String ctaText = apiGoldConfirmation2.getCtaText();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    String ctaText2 = apiGoldConfirmation2.getCtaText();
                    Screen.Name name = Screen.Name.GOLD_UPGRADE_SUCCESS;
                    Screen screen = new Screen(name, null, null, null, 14, null);
                    String ctaText3 = apiGoldConfirmation2.getCtaText();
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    BentoSparkleButton2.BentoSparkleButton(function03, ctaText, ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, new UserInteractionEventDescriptor(ctaText2, screen, null, null, new Component(componentType, ctaText3, null, 4, null), null, 44, null), false, false, false, true, false, null, 110, null), null, false, false, false, composer2, 0, 120);
                    String secondaryCtaText = apiGoldConfirmation2.getSecondaryCtaText();
                    composer2.startReplaceGroup(-263339226);
                    if (secondaryCtaText != null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function04, secondaryCtaText, ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new UserInteractionEventDescriptor(secondaryCtaText, new Screen(name, null, null, null, 14, null), null, null, new Component(componentType, secondaryCtaText, null, 4, null), null, 44, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1771620382, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1771620382, i5, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:175)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier3, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                    final ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation2 = apiGoldConfirmation;
                    BoxWithConstraints.BoxWithConstraints(modifierFillMaxSize$default, topCenter, false, ComposableLambda3.rememberComposableLambda(-300628660, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationComposableKt$ConfirmationComplete$1$2.1
                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i6) {
                            int i7;
                            Modifier modifierM5146paddingqDBjuR0$default;
                            Modifier.Companion companion;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-300628660, i7, -1, "com.robinhood.android.gold.upgrade.legacy.ConfirmationComplete.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeConfirmationComposable.kt:181)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * 1.2933334f);
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(200);
                            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(apiGoldConfirmation2.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62);
                            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, TestTag3.testTag(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.77319586f, false, 2, null), "confirmationImage"), (Alignment) null, fillWidth, 0.0f, (ColorFilter) null, composer3, 25008, 104);
                            if (C2002Dp.m7994compareTo0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl + fM7995constructorimpl2), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM()) >= 0) {
                                modifierM5146paddingqDBjuR0$default = BoxWithConstraints.align(companion2, Alignment.INSTANCE.getBottomCenter());
                                companion = companion2;
                            } else {
                                modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, fM7995constructorimpl, 0.0f, 0.0f, 13, null);
                                companion = companion2;
                            }
                            Modifier modifierThen = companion.then(modifierM5146paddingqDBjuR0$default);
                            Brush.Companion companion3 = Brush.INSTANCE;
                            Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()));
                            Float fValueOf = Float.valueOf(0.3f);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.background$default(modifierThen, Brush.Companion.m6683verticalGradient8A3gB4$default(companion3, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, composer3, 0, 1);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation3 = apiGoldConfirmation2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title = apiGoldConfirmation3.getTitle();
                            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i8).getDisplayCapsuleLarge();
                            TextAlign.Companion companion5 = TextAlign.INSTANCE;
                            Modifier.Companion companion6 = companion;
                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8126);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), composer3, 0);
                            BentoText2.m20747BentoText38GnDrw(apiGoldConfirmation3.getDescription(), null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM()), composer3, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                            invoke(boxWithConstraints4, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
