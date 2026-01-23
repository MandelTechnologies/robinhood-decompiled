package com.robinhood.android.transfers.p271ui.max.posttransfer.compose;

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
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
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
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.cards.BentoCelebrationCard;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.api.ApiGenericButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IraRewardConfirmation.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a3\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"RewardCelebrationCardTag", "", "IraRewardConfirmation", "", "page", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraRewardConfirmation;", "onButtonClick", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraRewardConfirmation;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RewardConfirmation", "GenericButton", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/serverdriven/api/ApiGenericButton;", "(Lcom/robinhood/models/serverdriven/api/ApiGenericButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IraRewardConfirmation2 {
    public static final String RewardCelebrationCardTag = "RewardCelebrationCard";

    /* compiled from: IraRewardConfirmation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericButtonType.values().length];
            try {
                iArr[GenericButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericButton$lambda$8(ApiGenericButton apiGenericButton, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GenericButton(apiGenericButton, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraRewardConfirmation$lambda$0(UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IraRewardConfirmation(iraRewardConfirmation, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardConfirmation$lambda$4(UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RewardConfirmation(iraRewardConfirmation, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IraRewardConfirmation(final UiPostTransferPage.IraRewardConfirmation page, final Function1<? super ApiGenericAction, Unit> onButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1808333919);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(page) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1808333919, i3, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation (IraRewardConfirmation.kt:36)");
                }
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-924183529, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-924183529, i5, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous> (IraRewardConfirmation.kt:38)");
                        }
                        final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation = page;
                        final Function1<ApiGenericAction, Unit> function1 = onButtonClick;
                        final Modifier modifier6 = modifier4;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(813954274, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1.1
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
                                    ComposerKt.traceEventStart(813954274, i6, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous>.<anonymous> (IraRewardConfirmation.kt:39)");
                                }
                                OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composer3, 6);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                long jade = bentoTheme.getColors(composer3, i7).getJade();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                                final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation2 = iraRewardConfirmation;
                                final Function1<ApiGenericAction, Unit> function12 = function1;
                                final Modifier modifier7 = modifier6;
                                ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jade, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(136317856, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i8 & 6) == 0) {
                                            i8 |= composer4.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(136317856, i8, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous>.<anonymous>.<anonymous> (IraRewardConfirmation.kt:44)");
                                        }
                                        IraRewardConfirmation2.RewardConfirmation(iraRewardConfirmation2, function12, PaddingKt.padding(modifier7, paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 0, 12582912, 32767);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IraRewardConfirmation2.IraRewardConfirmation$lambda$0(page, onButtonClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-924183529, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-924183529, i5, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous> (IraRewardConfirmation.kt:38)");
                    }
                    final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation = page;
                    final Function1<? super ApiGenericAction, Unit> function1 = onButtonClick;
                    final Modifier modifier6 = modifier4;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(813954274, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1.1
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
                                ComposerKt.traceEventStart(813954274, i6, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous>.<anonymous> (IraRewardConfirmation.kt:39)");
                            }
                            OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composer3, 6);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jade = bentoTheme.getColors(composer3, i7).getJade();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation2 = iraRewardConfirmation;
                            final Function1<? super ApiGenericAction, Unit> function12 = function1;
                            final Modifier modifier7 = modifier6;
                            ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jade, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(136317856, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt.IraRewardConfirmation.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                    invoke(paddingValues, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer4.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(136317856, i8, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmation.<anonymous>.<anonymous>.<anonymous> (IraRewardConfirmation.kt:44)");
                                    }
                                    IraRewardConfirmation2.RewardConfirmation(iraRewardConfirmation2, function12, PaddingKt.padding(modifier7, paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 0, 12582912, 32767);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RewardConfirmation(final UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation, final Function1<? super ApiGenericAction, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        UiPostTransferPage.IraRewardConfirmation iraRewardConfirmation2;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ApiGenericButton secondaryButton;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1437426429);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iraRewardConfirmation2 = iraRewardConfirmation;
        } else if ((i & 6) == 0) {
            iraRewardConfirmation2 = iraRewardConfirmation;
            i3 = (composerStartRestartGroup.changedInstance(iraRewardConfirmation2) ? 4 : 2) | i;
        } else {
            iraRewardConfirmation2 = iraRewardConfirmation;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1437426429, i3, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.RewardConfirmation (IraRewardConfirmation.kt:59)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Alignment center = companion.getCenter();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifier5 = modifier4;
                    String header = iraRewardConfirmation2.getHeader();
                    AnnotatedString annotatedString = new AnnotatedString(iraRewardConfirmation2.getTitle(), null, 2, null);
                    String subtitle = iraRewardConfirmation2.getSubtitle();
                    String footerLabel = iraRewardConfirmation2.getFooterLabel();
                    String footerValue = iraRewardConfirmation2.getFooterValue();
                    Modifier modifierTestTag = TestTag3.testTag(companion3, RewardCelebrationCardTag);
                    BentoColor bentoColor = BentoColor.INSTANCE;
                    BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(modifierTestTag, header, annotatedString, null, null, footerLabel, footerValue, subtitle, null, bentoColor.m21255getDayXrayLight0d7_KjU(), bentoColor.m21219getDayJade0d7_KjU(), composerStartRestartGroup, 6, 0, 280);
                    composerStartRestartGroup.endNode();
                    int i6 = i3 & 112;
                    composerStartRestartGroup = composerStartRestartGroup;
                    GenericButton(iraRewardConfirmation.getPrimaryButton(), function1, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, i6 | 384, 0);
                    secondaryButton = iraRewardConfirmation.getSecondaryButton();
                    composerStartRestartGroup.startReplaceGroup(956927427);
                    if (secondaryButton != null) {
                        GenericButton(secondaryButton, function1, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, i6, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IraRewardConfirmation2.RewardConfirmation$lambda$4(iraRewardConfirmation, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Alignment center2 = companion4.getCenter();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, companion32, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifier52 = modifier4;
                        String header2 = iraRewardConfirmation2.getHeader();
                        AnnotatedString annotatedString2 = new AnnotatedString(iraRewardConfirmation2.getTitle(), null, 2, null);
                        String subtitle2 = iraRewardConfirmation2.getSubtitle();
                        String footerLabel2 = iraRewardConfirmation2.getFooterLabel();
                        String footerValue2 = iraRewardConfirmation2.getFooterValue();
                        Modifier modifierTestTag2 = TestTag3.testTag(companion32, RewardCelebrationCardTag);
                        BentoColor bentoColor2 = BentoColor.INSTANCE;
                        BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(modifierTestTag2, header2, annotatedString2, null, null, footerLabel2, footerValue2, subtitle2, null, bentoColor2.m21255getDayXrayLight0d7_KjU(), bentoColor2.m21219getDayJade0d7_KjU(), composerStartRestartGroup, 6, 0, 280);
                        composerStartRestartGroup.endNode();
                        int i62 = i3 & 112;
                        composerStartRestartGroup = composerStartRestartGroup;
                        GenericButton(iraRewardConfirmation.getPrimaryButton(), function1, SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), composerStartRestartGroup, i62 | 384, 0);
                        secondaryButton = iraRewardConfirmation.getSecondaryButton();
                        composerStartRestartGroup.startReplaceGroup(956927427);
                        if (secondaryButton != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GenericButton(final ApiGenericButton apiGenericButton, final Function1<? super ApiGenericAction, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoButtons.Type type2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1586122951);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiGenericButton) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586122951, i3, -1, "com.robinhood.android.transfers.ui.max.posttransfer.compose.GenericButton (IraRewardConfirmation.kt:104)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[apiGenericButton.getType().ordinal()];
                if (i4 != 1) {
                    type2 = BentoButtons.Type.Primary;
                } else if (i4 == 2) {
                    type2 = BentoButtons.Type.Secondary;
                } else {
                    type2 = BentoButtons.Type.Text;
                }
                String title = apiGenericButton.getTitle();
                ServerToBentoAssetMapper2 icon = apiGenericButton.getIcon();
                BentoButtons.Icon.Size16 size16 = icon == null ? new BentoButtons.Icon.Size16(icon, null, 2, null) : null;
                boolean is_enabled = apiGenericButton.getIs_enabled();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, apiGenericButton.getLogging_identifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                Modifier modifier4 = modifier2;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(apiGenericButton) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IraRewardConfirmation2.GenericButton$lambda$7$lambda$6(function1, apiGenericButton);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, title, modifierAutoLogEvents$default, size16, type2, is_enabled, false, null, null, null, null, false, null, composer2, BentoButtons.Icon.Size16.$stable << 9, 0, 8128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IraRewardConfirmation2.GenericButton$lambda$8(apiGenericButton, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[apiGenericButton.getType().ordinal()];
            if (i4 != 1) {
            }
            String title2 = apiGenericButton.getTitle();
            ServerToBentoAssetMapper2 icon2 = apiGenericButton.getIcon();
            if (icon2 == null) {
            }
            boolean is_enabled2 = apiGenericButton.getIs_enabled();
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, apiGenericButton.getLogging_identifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
            Modifier modifier42 = modifier2;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(apiGenericButton) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.posttransfer.compose.IraRewardConfirmationKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IraRewardConfirmation2.GenericButton$lambda$7$lambda$6(function1, apiGenericButton);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, title2, modifierAutoLogEvents$default2, size16, type2, is_enabled2, false, null, null, null, null, false, null, composer2, BentoButtons.Icon.Size16.$stable << 9, 0, 8128);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericButton$lambda$7$lambda$6(Function1 function1, ApiGenericButton apiGenericButton) {
        function1.invoke(apiGenericButton.getAction());
        return Unit.INSTANCE;
    }
}
