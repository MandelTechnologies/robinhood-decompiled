package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.transfers.p271ui.max.rtp.AchTransferOptionsSelectorComposable;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2InstantBankTransferSelectorViewState;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateTransferV2InstantBankTransferSelectorComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a3\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"CreateTransferV2InstantBankTransferSelectorComposable", "", "viewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;", "onAchTransferOptionClick", "Lkotlin/Function1;", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CreateTransferV2InstantBankTransferSelectorOptionComposable", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;", "onClick", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InstantBankTransferSelectorStandardOption", "", "InstantBankTransferSelectorInstantOption", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2InstantBankTransferSelectorComposable {
    public static final String InstantBankTransferSelectorInstantOption = "InstantOption";
    public static final String InstantBankTransferSelectorStandardOption = "StandardOption";

    /* compiled from: CreateTransferV2InstantBankTransferSelectorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CreateTransferV2InstantBankTransferSelectorViewState.Option.State.values().length];
            try {
                iArr[CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_NOT_SELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AchTransferOption.values().length];
            try {
                iArr2[AchTransferOption.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AchTransferOption.INSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferV2InstantBankTransferSelectorComposable$lambda$0(CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferV2InstantBankTransferSelectorComposable(createTransferV2InstantBankTransferSelectorViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferV2InstantBankTransferSelectorComposable$lambda$2(CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferV2InstantBankTransferSelectorComposable(createTransferV2InstantBankTransferSelectorViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CreateTransferV2InstantBankTransferSelectorOptionComposable$lambda$6 */
    public static final Unit m2553xeb520737(CreateTransferV2InstantBankTransferSelectorViewState.Option option, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferV2InstantBankTransferSelectorOptionComposable(option, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferV2InstantBankTransferSelectorComposable(final CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, final Function1<? super AchTransferOption, Unit> onAchTransferOptionClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAchTransferOptionClick, "onAchTransferOptionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520962216);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(createTransferV2InstantBankTransferSelectorViewState) : composerStartRestartGroup.changedInstance(createTransferV2InstantBankTransferSelectorViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAchTransferOptionClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1520962216, i3, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposable (CreateTransferV2InstantBankTransferSelectorComposable.kt:38)");
                }
                if (createTransferV2InstantBankTransferSelectorViewState != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CreateTransferV2InstantBankTransferSelectorComposable.CreateTransferV2InstantBankTransferSelectorComposable$lambda$0(createTransferV2InstantBankTransferSelectorViewState, onAchTransferOptionClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                CreateTransferV2InstantBankTransferSelectorViewState.Option leftOption = createTransferV2InstantBankTransferSelectorViewState.getLeftOption();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 120;
                Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null);
                int i5 = BentoIcon4.$stable;
                int i6 = StringResource.$stable;
                int i7 = i3 & 112;
                CreateTransferV2InstantBankTransferSelectorOptionComposable(leftOption, onAchTransferOptionClick, modifierWeight$default, composerStartRestartGroup, i5 | i6 | i6 | i7, 0);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composerStartRestartGroup, 6);
                CreateTransferV2InstantBankTransferSelectorOptionComposable(createTransferV2InstantBankTransferSelectorViewState.getRightOption(), onAchTransferOptionClick, Row5.weight$default(row6, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composerStartRestartGroup, i5 | i6 | i6 | i7, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferV2InstantBankTransferSelectorComposable.CreateTransferV2InstantBankTransferSelectorComposable$lambda$2(createTransferV2InstantBankTransferSelectorViewState, onAchTransferOptionClick, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (createTransferV2InstantBankTransferSelectorViewState != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferV2InstantBankTransferSelectorOptionComposable(final CreateTransferV2InstantBankTransferSelectorViewState.Option viewState, final Function1<? super AchTransferOption, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color primaryTextEnabledColor;
        androidx.compose.p011ui.graphics.Color composeColor;
        long jM21427getFg30d7_KjU;
        CreateTransferV2InstantBankTransferSelectorViewState.Option.State state;
        CreateTransferV2InstantBankTransferSelectorViewState.Option.State state2;
        BorderStroke borderStroke;
        boolean z;
        int i5;
        String str;
        int i6;
        String str2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1050808496);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1050808496, i3, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorOptionComposable (CreateTransferV2InstantBankTransferSelectorComposable.kt:73)");
                }
                CreateTransferV2InstantBankTransferSelectorViewState.Option.State state3 = viewState.getState();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[state3.ordinal()];
                if (i4 != 1) {
                    primaryTextEnabledColor = Color.FG3;
                } else {
                    if (i4 != 2 && i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    primaryTextEnabledColor = viewState.getPrimaryTextEnabledColor();
                }
                composeColor = SduiColors2.toComposeColor(primaryTextEnabledColor, composerStartRestartGroup, 0);
                if (composeColor != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                final long value = composeColor.getValue();
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                int i8 = iArr[viewState.getState().ordinal()];
                if (i8 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1332816132);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = modifier2;
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, jM21427getFg30d7_KjU);
                    state = viewState.getState();
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
                    if (state != state2) {
                        borderStroke = borderStrokeM4886BorderStrokecXLIe8U;
                        z = true;
                    } else {
                        borderStroke = borderStrokeM4886BorderStrokecXLIe8U;
                        z = false;
                    }
                    float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.ACH_TRANSFER_OPTION_CARD;
                    AchTransferOption achTransferOption = viewState.getAchTransferOption();
                    int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
                    i5 = iArr2[achTransferOption.ordinal()];
                    if (i5 == 1) {
                        str = "standard";
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = GoldFeature.INSTANT;
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, str + (viewState.getState() == state2 ? "_disabled" : ""), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    i6 = iArr2[viewState.getAchTransferOption().ordinal()];
                    if (i6 == 1) {
                        str2 = InstantBankTransferSelectorStandardOption;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = InstantBankTransferSelectorInstantOption;
                    }
                    Modifier modifierTestTag = TestTag3.testTag(modifierAutoLogEvents$default, str2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CreateTransferV2InstantBankTransferSelectorComposable.m2552x7f364815(onClick, viewState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    CardKt.m5549CardLPr_se0((Function0) objRememberedValue, modifierTestTag, z, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, borderStroke, fM7995constructorimpl2, null, ComposableLambda3.rememberComposableLambda(1933449215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$CreateTransferV2InstantBankTransferSelectorOptionComposable$1$2
                        public final void invoke(Composer composer3, int i9) {
                            CreateTransferV2InstantBankTransferSelectorViewState.Option option;
                            Modifier.Companion companion;
                            int i10;
                            long jM21425getFg0d7_KjU;
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1933449215, i9, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorOptionComposable.<anonymous>.<anonymous> (CreateTransferV2InstantBankTransferSelectorComposable.kt:128)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
                            CreateTransferV2InstantBankTransferSelectorViewState.Option option2 = viewState;
                            long j = value;
                            CreateTransferV2InstantBankTransferSelectorViewState.Option option3 = viewState;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
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
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composer3.startReplaceGroup(-220790239);
                            if (option2.getPrimaryTextIcon() != null) {
                                companion = companion2;
                                option = option3;
                                i10 = 0;
                                BentoIcon2.m20644BentoIconFU0evQE(option2.getPrimaryTextIcon(), "", j, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), AchTransferOptionsSelectorComposable.TitleIconTag), null, false, composer3, BentoIcon4.$stable | 48, 48);
                            } else {
                                option = option3;
                                companion = companion2;
                                i10 = 0;
                            }
                            composer3.endReplaceGroup();
                            StringResource primaryText = option2.getPrimaryText();
                            int i12 = StringResource.$stable;
                            int i13 = i10;
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(primaryText, composer3, i12), null, androidx.compose.p011ui.graphics.Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextS(), composer3, 24576, 0, 8170);
                            composer3.endNode();
                            Modifier.Companion companion5 = companion;
                            Spacer2.Spacer(Column5.weight$default(column6, companion5, 1.0f, false, 2, null), composer3, i13);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, i13);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i13);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion5);
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion5, 1.0f, false, 2, null);
                            String string2 = StringResource2.getString(option2.getSecondaryText(), composer3, i12);
                            TextStyle textS = bentoTheme.getTypography(composer3, i11).getTextS();
                            if (option.getState() == CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED) {
                                composer3.startReplaceGroup(1313573285);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1313655590);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(string2, modifierWeight$default, androidx.compose.p011ui.graphics.Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8184);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHECKMARK_24), "selected ach option", bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU(), Alpha.alpha(companion5, option2.isCheckmarkVisible() ? 1.0f : 0.0f), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composer2, 817889280, 288);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-1332823306);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1332816132);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier42 = modifier2;
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, jM21427getFg30d7_KjU);
                    state = viewState.getState();
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
                    if (state != state2) {
                    }
                    float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(0);
                    long jM21371getBg0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType2 = Component.ComponentType.ACH_TRANSFER_OPTION_CARD;
                    AchTransferOption achTransferOption2 = viewState.getAchTransferOption();
                    int[] iArr22 = WhenMappings.$EnumSwitchMapping$1;
                    i5 = iArr22[achTransferOption2.ordinal()];
                    if (i5 == 1) {
                    }
                    if (viewState.getState() == state2) {
                    }
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier42, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, str + (viewState.getState() == state2 ? "_disabled" : ""), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    i6 = iArr22[viewState.getAchTransferOption().ordinal()];
                    if (i6 == 1) {
                    }
                    Modifier modifierTestTag2 = TestTag3.testTag(modifierAutoLogEvents$default2, str2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CreateTransferV2InstantBankTransferSelectorComposable.m2552x7f364815(onClick, viewState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        CardKt.m5549CardLPr_se0((Function0) objRememberedValue, modifierTestTag2, z, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU2, 0L, borderStroke, fM7995constructorimpl22, null, ComposableLambda3.rememberComposableLambda(1933449215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$CreateTransferV2InstantBankTransferSelectorOptionComposable$1$2
                            public final void invoke(Composer composer3, int i9) {
                                CreateTransferV2InstantBankTransferSelectorViewState.Option option;
                                Modifier.Companion companion;
                                int i10;
                                long jM21425getFg0d7_KjU;
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1933449215, i9, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorOptionComposable.<anonymous>.<anonymous> (CreateTransferV2InstantBankTransferSelectorComposable.kt:128)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
                                CreateTransferV2InstantBankTransferSelectorViewState.Option option2 = viewState;
                                long j = value;
                                CreateTransferV2InstantBankTransferSelectorViewState.Option option3 = viewState;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
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
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composer3.startReplaceGroup(-220790239);
                                if (option2.getPrimaryTextIcon() != null) {
                                    companion = companion2;
                                    option = option3;
                                    i10 = 0;
                                    BentoIcon2.m20644BentoIconFU0evQE(option2.getPrimaryTextIcon(), "", j, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), AchTransferOptionsSelectorComposable.TitleIconTag), null, false, composer3, BentoIcon4.$stable | 48, 48);
                                } else {
                                    option = option3;
                                    companion = companion2;
                                    i10 = 0;
                                }
                                composer3.endReplaceGroup();
                                StringResource primaryText = option2.getPrimaryText();
                                int i12 = StringResource.$stable;
                                int i13 = i10;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(primaryText, composer3, i12), null, androidx.compose.p011ui.graphics.Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextS(), composer3, 24576, 0, 8170);
                                composer3.endNode();
                                Modifier.Companion companion5 = companion;
                                Spacer2.Spacer(Column5.weight$default(column6, companion5, 1.0f, false, 2, null), composer3, i13);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, i13);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i13);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion5);
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
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                Modifier modifierWeight$default = Row5.weight$default(row6, companion5, 1.0f, false, 2, null);
                                String string2 = StringResource2.getString(option2.getSecondaryText(), composer3, i12);
                                TextStyle textS = bentoTheme.getTypography(composer3, i11).getTextS();
                                if (option.getState() == CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED) {
                                    composer3.startReplaceGroup(1313573285);
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21427getFg30d7_KjU();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(1313655590);
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU();
                                    composer3.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(string2, modifierWeight$default, androidx.compose.p011ui.graphics.Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8184);
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHECKMARK_24), "selected ach option", bentoTheme.getColors(composer3, i11).m21425getFg0d7_KjU(), Alpha.alpha(companion5, option2.isCheckmarkVisible() ? 1.0f : 0.0f), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), composer2, 817889280, 288);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1332820805);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier422 = modifier2;
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U22 = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, jM21427getFg30d7_KjU);
                    state = viewState.getState();
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
                    if (state != state2) {
                    }
                    float fM7995constructorimpl222 = C2002Dp.m7995constructorimpl(0);
                    long jM21371getBg0d7_KjU22 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType22 = Component.ComponentType.ACH_TRANSFER_OPTION_CARD;
                    AchTransferOption achTransferOption22 = viewState.getAchTransferOption();
                    int[] iArr222 = WhenMappings.$EnumSwitchMapping$1;
                    i5 = iArr222[achTransferOption22.ordinal()];
                    if (i5 == 1) {
                    }
                    if (viewState.getState() == state2) {
                    }
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(modifier422, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, null, null, null, new Component(componentType22, str + (viewState.getState() == state2 ? "_disabled" : ""), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    i6 = iArr222[viewState.getAchTransferOption().ordinal()];
                    if (i6 == 1) {
                    }
                    Modifier modifierTestTag22 = TestTag3.testTag(modifierAutoLogEvents$default22, str2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2InstantBankTransferSelectorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferV2InstantBankTransferSelectorComposable.m2553xeb520737(viewState, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            CreateTransferV2InstantBankTransferSelectorViewState.Option.State state32 = viewState.getState();
            int[] iArr3 = WhenMappings.$EnumSwitchMapping$0;
            i4 = iArr3[state32.ordinal()];
            if (i4 != 1) {
            }
            composeColor = SduiColors2.toComposeColor(primaryTextEnabledColor, composerStartRestartGroup, 0);
            if (composeColor != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CreateTransferV2InstantBankTransferSelectorOptionComposable$lambda$5$lambda$4$lambda$3 */
    public static final Unit m2552x7f364815(Function1 function1, CreateTransferV2InstantBankTransferSelectorViewState.Option option) {
        function1.invoke(option.getAchTransferOption());
        return Unit.INSTANCE;
    }
}
