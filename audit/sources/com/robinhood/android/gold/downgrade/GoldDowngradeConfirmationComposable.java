package com.robinhood.android.gold.downgrade;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.gold.subscription.api.ApiGoldDowngradeConfirmation;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.util.text.MessageFormatting;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDowngradeConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002\u001a-\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001b\u001a_\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010%\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006&²\u0006\n\u0010 \u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"GoldDowngradeConfirmationCheckmark", "", "getGoldDowngradeConfirmationCheckmark$annotations", "()V", "GoldDowngradeConfirmationComposable", "", "goldDowngradeConfirmation", "Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "goldDowngradeContext", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "onClickDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "handleAndFinishIfDeeplink", "", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "context", "Landroid/content/Context;", "action", "DowngradeConfirmation", "onDismiss", "(Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegacyDowngradeConfirmation", "onClickDone", "(Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BaseDowngradeConfirmation", "assetPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "title", "descriptionMarkdown", "primaryCtaText", "primaryCtaAction", "secondaryCtaText", "secondaryCtaAction", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-downgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDowngradeConfirmationComposable {
    public static final String GoldDowngradeConfirmationCheckmark = "gold_downgrade_confirmation_checkmark";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseDowngradeConfirmation$lambda$7(Painter painter, String str, String str2, String str3, Function0 function0, String str4, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BaseDowngradeConfirmation(painter, str, str2, str3, function0, str4, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DowngradeConfirmation$lambda$2(ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DowngradeConfirmation(apiGoldDowngradeConfirmation, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDowngradeConfirmationComposable$lambda$0(ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, GoldDowngradeContext goldDowngradeContext, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDowngradeConfirmationComposable(apiGoldDowngradeConfirmation, goldDowngradeContext, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyDowngradeConfirmation$lambda$6(GoldDowngradeContext goldDowngradeContext, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LegacyDowngradeConfirmation(goldDowngradeContext, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldDowngradeConfirmationCheckmark$annotations() {
    }

    public static final void GoldDowngradeConfirmationComposable(final ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, GoldDowngradeContext goldDowngradeContext, Function0<Unit> onClickDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function0;
        final GoldDowngradeContext goldDowngradeContext2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(goldDowngradeContext, "goldDowngradeContext");
        Intrinsics.checkNotNullParameter(onClickDismiss, "onClickDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(901031840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGoldDowngradeConfirmation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(goldDowngradeContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickDismiss) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onClickDismiss;
            modifier2 = modifier;
            goldDowngradeContext2 = goldDowngradeContext;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901031840, i3, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposable (GoldDowngradeConfirmationComposable.kt:57)");
            }
            if (apiGoldDowngradeConfirmation != null) {
                composerStartRestartGroup.startReplaceGroup(-905773946);
                int i5 = i3 & 14;
                int i6 = i3 >> 3;
                function0 = onClickDismiss;
                DowngradeConfirmation(apiGoldDowngradeConfirmation, function0, modifier3, composerStartRestartGroup, i5 | (i6 & 112) | (i6 & 896), 0);
                composerStartRestartGroup.endReplaceGroup();
                goldDowngradeContext2 = goldDowngradeContext;
            } else {
                function0 = onClickDismiss;
                composerStartRestartGroup.startReplaceGroup(-905581560);
                LegacyDowngradeConfirmation(goldDowngradeContext, function0, modifier3, composerStartRestartGroup, (i3 >> 3) & 1022, 0);
                goldDowngradeContext2 = goldDowngradeContext;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function02 = function0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDowngradeConfirmationComposable.GoldDowngradeConfirmationComposable$lambda$0(apiGoldDowngradeConfirmation, goldDowngradeContext2, function02, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleAndFinishIfDeeplink(SduiActionHandler<? super GenericAction> sduiActionHandler, Context context, GenericAction genericAction) {
        if (genericAction instanceof GenericAction.Deeplink) {
            BaseContexts.requireActivityBaseContext(context).finish();
        }
        return sduiActionHandler.mo15941handle(genericAction);
    }

    private static final String LegacyDowngradeConfirmation$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final void DowngradeConfirmation(final ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1200674427);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGoldDowngradeConfirmation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1200674427, i3, -1, "com.robinhood.android.gold.downgrade.DowngradeConfirmation (GoldDowngradeConfirmationComposable.kt:94)");
            }
            GenericActionHandlerKt.GenericActionHandler(null, false, function0, null, ComposableLambda3.rememberComposableLambda(-533428513, true, new GoldDowngradeConfirmationComposable2(apiGoldDowngradeConfirmation, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 24576, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDowngradeConfirmationComposable.DowngradeConfirmation$lambda$2(apiGoldDowngradeConfirmation, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LegacyDowngradeConfirmation(GoldDowngradeContext goldDowngradeContext, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        final GoldDowngradeContext goldDowngradeContext2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Object objRememberedValue;
        SnapshotState snapshotState;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2145471240);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            goldDowngradeContext2 = goldDowngradeContext;
        } else if ((i & 6) == 0) {
            goldDowngradeContext2 = goldDowngradeContext;
            i3 = (composerStartRestartGroup.changedInstance(goldDowngradeContext2) ? 4 : 2) | i;
        } else {
            goldDowngradeContext2 = goldDowngradeContext;
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2145471240, i3, -1, "com.robinhood.android.gold.downgrade.LegacyDowngradeConfirmation (GoldDowngradeConfirmationComposable.kt:131)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(goldDowngradeContext2.getConfirmation().getMarkdown2(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (goldDowngradeContext2.getGoldSweepRate() != null && goldDowngradeContext2.getGoldMarginRate() != null) {
                    snapshotState.setValue(MessageFormatting.formatMessageWith(LegacyDowngradeConfirmation$lambda$4(snapshotState), MapsKt.mapOf(Tuples4.m3642to(GoldDowngradeConfirmationFragment.GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER, Formats.getInterestRateFormatShortWithPercentage().format(goldDowngradeContext2.getGoldSweepRate())), Tuples4.m3642to(GoldDowngradeConfirmationFragment.GOLD_MARGIN_INTEREST_RATE_PLACEHOLDER, Formats.getPercentFormat().format(goldDowngradeContext2.getGoldMarginRate())))));
                }
                BaseDowngradeConfirmation(PainterResources_androidKt.painterResource(C17756R.drawable.gold_checkmark, composerStartRestartGroup, 0), goldDowngradeContext2.getConfirmation().getTitle(), LegacyDowngradeConfirmation$lambda$4(snapshotState), StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), function02, null, null, modifier4, composerStartRestartGroup, ((i3 << 9) & 57344) | 1769472 | ((i3 << 15) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDowngradeConfirmationComposable.LegacyDowngradeConfirmation$lambda$6(goldDowngradeContext2, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (goldDowngradeContext2.getGoldSweepRate() != null) {
                snapshotState.setValue(MessageFormatting.formatMessageWith(LegacyDowngradeConfirmation$lambda$4(snapshotState), MapsKt.mapOf(Tuples4.m3642to(GoldDowngradeConfirmationFragment.GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER, Formats.getInterestRateFormatShortWithPercentage().format(goldDowngradeContext2.getGoldSweepRate())), Tuples4.m3642to(GoldDowngradeConfirmationFragment.GOLD_MARGIN_INTEREST_RATE_PLACEHOLDER, Formats.getPercentFormat().format(goldDowngradeContext2.getGoldMarginRate())))));
            }
            BaseDowngradeConfirmation(PainterResources_androidKt.painterResource(C17756R.drawable.gold_checkmark, composerStartRestartGroup, 0), goldDowngradeContext2.getConfirmation().getTitle(), LegacyDowngradeConfirmation$lambda$4(snapshotState), StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), function02, null, null, modifier4, composerStartRestartGroup, ((i3 << 9) & 57344) | 1769472 | ((i3 << 15) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BaseDowngradeConfirmation(final Painter painter, final String str, final String str2, final String str3, final Function0<Unit> function0, final String str4, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(27387573);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(27387573, i3, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeConfirmation (GoldDowngradeConfirmationComposable.kt:169)");
                }
                modifier3 = modifier4;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1651203286, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt.BaseDowngradeConfirmation.1
                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1651203286, i5, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeConfirmation.<anonymous> (GoldDowngradeConfirmationComposable.kt:171)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                        String str5 = str3;
                        Function0<Unit> function03 = function0;
                        String str6 = str4;
                        Function0<Unit> function04 = function02;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Component.ComponentType componentType = Component.ComponentType.BUTTON;
                        BentoButtonKt.BentoGoldButton(function03, str5, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, str5, false, composer2, 54, 4), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        composer2.startReplaceGroup(-1486471996);
                        if (str6 != null && function04 != null) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, str6, UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), componentType, str6, false, composer2, 54, 4), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
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
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-448837731, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt.BaseDowngradeConfirmation.2
                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        long solLight;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-448837731, i5, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeConfirmation.<anonymous> (GoldDowngradeConfirmationComposable.kt:198)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composer2, 0, 1), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Painter painter2 = painter;
                        String str5 = str;
                        String str6 = str2;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        ImageKt.Image(painter2, (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, GoldDowngradeConfirmationComposable.GoldDowngradeConfirmationCheckmark), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C17756R.dimen.gold_downgrade_confirmation_checkmark_height, composer2, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21594getXlargeD9Ej5fM()), composer2, 0);
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8126);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        if (bentoTheme.getColors(composer2, i6).getIsDay()) {
                            composer2.startReplaceGroup(-2030253205);
                            solLight = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-2030179611);
                            solLight = bentoTheme.getColors(composer2, i6).getSolLight();
                            composer2.endReplaceGroup();
                        }
                        BentoMarkdownText2.BentoMarkdownText(str6, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(null, iM7919getCentere0LSkKk, 0L, solLight, false, composer2, BentoMarkdownText.$stable << 15, 21), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDowngradeConfirmationComposable.BaseDowngradeConfirmation$lambda$7(painter, str, str2, str3, function0, str4, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1651203286, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt.BaseDowngradeConfirmation.1
                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651203286, i5, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeConfirmation.<anonymous> (GoldDowngradeConfirmationComposable.kt:171)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                    String str5 = str3;
                    Function0<Unit> function03 = function0;
                    String str6 = str4;
                    Function0<Unit> function04 = function02;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    BentoButtonKt.BentoGoldButton(function03, str5, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, str5, false, composer2, 54, 4), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composer2.startReplaceGroup(-1486471996);
                    if (str6 != null && function04 != null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function04, str6, UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), componentType, str6, false, composer2, 54, 4), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
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
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-448837731, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt.BaseDowngradeConfirmation.2
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    long solLight;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-448837731, i5, -1, "com.robinhood.android.gold.downgrade.BaseDowngradeConfirmation.<anonymous> (GoldDowngradeConfirmationComposable.kt:198)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composer2, 0, 1), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Painter painter2 = painter;
                    String str5 = str;
                    String str6 = str2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageKt.Image(painter2, (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, GoldDowngradeConfirmationComposable.GoldDowngradeConfirmationCheckmark), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C17756R.dimen.gold_downgrade_confirmation_checkmark_height, composer2, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21594getXlargeD9Ej5fM()), composer2, 0);
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                    if (bentoTheme.getColors(composer2, i6).getIsDay()) {
                        composer2.startReplaceGroup(-2030253205);
                        solLight = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2030179611);
                        solLight = bentoTheme.getColors(composer2, i6).getSolLight();
                        composer2.endReplaceGroup();
                    }
                    BentoMarkdownText2.BentoMarkdownText(str6, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(null, iM7919getCentere0LSkKk, 0L, solLight, false, composer2, BentoMarkdownText.$stable << 15, 21), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
