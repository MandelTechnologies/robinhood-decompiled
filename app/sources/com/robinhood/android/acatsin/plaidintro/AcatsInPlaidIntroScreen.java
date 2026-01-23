package com.robinhood.android.acatsin.plaidintro;

import acats_aggregation.service.p001v1.PlaidIntroSelectionDto;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AcatsInPlaidIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\r\u001a;\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"PlaidIntroLoadingTag", "", "PlaidIntroScreen", "", "screenInfo", "Lcom/robinhood/android/acatsin/plaidintro/PlaidIntroScreenData;", "onPlaidClicked", "Lkotlin/Function0;", "onManualClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acatsin/plaidintro/PlaidIntroScreenData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaidLoadingScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaidLoadedScreen", "PlaidSelectionItem", WebsocketGatewayConstants.DATA_KEY, "Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "onClick", "(Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidIntroScreen {
    public static final String PlaidIntroLoadingTag = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidIntroScreen$lambda$0(PlaidIntroScreenData plaidIntroScreenData, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaidIntroScreen(plaidIntroScreenData, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidLoadedScreen$lambda$8(PlaidIntroScreenData plaidIntroScreenData, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaidLoadedScreen(plaidIntroScreenData, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidLoadingScreen$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaidLoadingScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidSelectionItem$lambda$14(PlaidIntroSelectionDto plaidIntroSelectionDto, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaidSelectionItem(plaidIntroSelectionDto, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlaidIntroScreen(final PlaidIntroScreenData plaidIntroScreenData, final Function0<Unit> onPlaidClicked, final Function0<Unit> onManualClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onPlaidClicked, "onPlaidClicked");
        Intrinsics.checkNotNullParameter(onManualClicked, "onManualClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-219315725);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(plaidIntroScreenData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPlaidClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onManualClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-219315725, i3, -1, "com.robinhood.android.acatsin.plaidintro.PlaidIntroScreen (AcatsInPlaidIntroScreen.kt:56)");
                }
                int i5 = ((i3 >> 9) & 14) | 805306368;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(-1477591676, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt.PlaidIntroScreen.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1477591676, i6, -1, "com.robinhood.android.acatsin.plaidintro.PlaidIntroScreen.<anonymous> (AcatsInPlaidIntroScreen.kt:62)");
                        }
                        if (plaidIntroScreenData == null) {
                            composer3.startReplaceGroup(186253100);
                            AcatsInPlaidIntroScreen.PlaidLoadingScreen(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), "loading"), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(186438077);
                            AcatsInPlaidIntroScreen.PlaidLoadedScreen(plaidIntroScreenData, onPlaidClicked, onManualClicked, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsInPlaidIntroScreen.PlaidIntroScreen$lambda$0(plaidIntroScreenData, onPlaidClicked, onManualClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 9) & 14) | 805306368;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(-1477591676, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt.PlaidIntroScreen.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1477591676, i6, -1, "com.robinhood.android.acatsin.plaidintro.PlaidIntroScreen.<anonymous> (AcatsInPlaidIntroScreen.kt:62)");
                    }
                    if (plaidIntroScreenData == null) {
                        composer3.startReplaceGroup(186253100);
                        AcatsInPlaidIntroScreen.PlaidLoadingScreen(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), "loading"), composer3, 0, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(186438077);
                        AcatsInPlaidIntroScreen.PlaidLoadedScreen(plaidIntroScreenData, onPlaidClicked, onManualClicked, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlaidLoadingScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2054869547);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2054869547, i3, -1, "com.robinhood.android.acatsin.plaidintro.PlaidLoadingScreen (AcatsInPlaidIntroScreen.kt:82)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(modifier, composerStartRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInPlaidIntroScreen.PlaidLoadingScreen$lambda$1(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlaidLoadedScreen(PlaidIntroScreenData plaidIntroScreenData, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        final PlaidIntroScreenData plaidIntroScreenData2;
        int i3;
        Function0<Unit> function03;
        Function0<Unit> function04;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2131752560);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            plaidIntroScreenData2 = plaidIntroScreenData;
        } else if ((i & 6) == 0) {
            plaidIntroScreenData2 = plaidIntroScreenData;
            i3 = (composerStartRestartGroup.changedInstance(plaidIntroScreenData2) ? 4 : 2) | i;
        } else {
            plaidIntroScreenData2 = plaidIntroScreenData;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2131752560, i3, -1, "com.robinhood.android.acatsin.plaidintro.PlaidLoadedScreen (AcatsInPlaidIntroScreen.kt:92)");
                        }
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor2);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        UIComponentDto.ConcreteDto bodyContent = plaidIntroScreenData2.getBodyContent();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AcatsInPlaidIntroScreen.PlaidLoadedScreen$lambda$7$lambda$4$lambda$3$lambda$2((ActionDto) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        SduiComponentIdl.SduiComponent(bodyContent, (Function1) objRememberedValue, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), (HorizontalPadding) null, composerStartRestartGroup, 48, 8);
                        PlaidSelectionItem(plaidIntroScreenData2.getPlaidSelection(), function03, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, i3 & 112, 0);
                        PlaidSelectionItem(plaidIntroScreenData2.getManualSelection(), function04, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i3 >> 3) & 112, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        UIComponentDto.ConcreteDto footerContent = plaidIntroScreenData2.getFooterContent();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AcatsInPlaidIntroScreen.PlaidLoadedScreen$lambda$7$lambda$6$lambda$5((ActionDto) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        SduiComponentIdl.SduiComponent(footerContent, (Function1) objRememberedValue2, PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), (HorizontalPadding) null, composer2, 48, 8);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AcatsInPlaidIntroScreen.PlaidLoadedScreen$lambda$8(plaidIntroScreenData2, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 1171) == 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), scrollStateRememberScrollState2, false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            UIComponentDto.ConcreteDto bodyContent2 = plaidIntroScreenData2.getBodyContent();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            SduiComponentIdl.SduiComponent(bodyContent2, (Function1) objRememberedValue, PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), (HorizontalPadding) null, composerStartRestartGroup, 48, 8);
                            PlaidSelectionItem(plaidIntroScreenData2.getPlaidSelection(), function03, PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, i3 & 112, 0);
                            PlaidSelectionItem(plaidIntroScreenData2.getManualSelection(), function04, PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i3 >> 3) & 112, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            UIComponentDto.ConcreteDto footerContent2 = plaidIntroScreenData2.getFooterContent();
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            SduiComponentIdl.SduiComponent(footerContent2, (Function1) objRememberedValue2, PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM()), (HorizontalPadding) null, composer2, 48, 8);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function04 = function02;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function03 = function0;
        if ((i2 & 4) == 0) {
        }
        function04 = function02;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAction PlaidLoadedScreen$lambda$7$lambda$4$lambda$3$lambda$2(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAction PlaidLoadedScreen$lambda$7$lambda$6$lambda$5(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PlaidSelectionItem(PlaidIntroSelectionDto plaidIntroSelectionDto, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        final PlaidIntroSelectionDto plaidIntroSelectionDto2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String info_tag_text;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-33885719);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            plaidIntroSelectionDto2 = plaidIntroSelectionDto;
        } else if ((i & 6) == 0) {
            plaidIntroSelectionDto2 = plaidIntroSelectionDto;
            i3 = (composerStartRestartGroup.changedInstance(plaidIntroSelectionDto2) ? 4 : 2) | i;
        } else {
            plaidIntroSelectionDto2 = plaidIntroSelectionDto;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-33885719, i3, -1, "com.robinhood.android.acatsin.plaidintro.PlaidSelectionItem (AcatsInPlaidIntroScreen.kt:132)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(modifier5, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()));
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM4876borderxT4_qwU, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 3, null), false, null, null, function02, 28, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, plaidIntroSelectionDto2.getLogging_id(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    info_tag_text = plaidIntroSelectionDto2.getInfo_tag_text();
                    composerStartRestartGroup.startReplaceGroup(-2083605884);
                    if (info_tag_text != null) {
                        modifier3 = modifier5;
                    } else {
                        modifier3 = modifier5;
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(info_tag_text, null, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getPrime()), null, false, null, null, composerStartRestartGroup, 12582912, 118);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(plaidIntroSelectionDto2.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 24576, 0, 8174);
                    BentoText2.m20747BentoText38GnDrw(plaidIntroSelectionDto2.getSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                    composer2.endNode();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer2, i5).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AcatsInPlaidIntroScreen.PlaidSelectionItem$lambda$14(plaidIntroSelectionDto2, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(modifier5, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM4876borderxT4_qwU2, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), 3, null), false, null, null, function02, 28, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, plaidIntroSelectionDto2.getLogging_id(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_43 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_43, centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_422 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_422, companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            info_tag_text = plaidIntroSelectionDto2.getInfo_tag_text();
                            composerStartRestartGroup.startReplaceGroup(-2083605884);
                            if (info_tag_text != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(plaidIntroSelectionDto2.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composer2, 24576, 0, 8174);
                            BentoText2.m20747BentoText38GnDrw(plaidIntroSelectionDto2.getSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            composer2.endNode();
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme2.getColors(composer2, i52).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
