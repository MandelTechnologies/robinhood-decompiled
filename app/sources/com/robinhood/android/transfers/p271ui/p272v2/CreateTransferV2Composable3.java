package com.robinhood.android.transfers.p271ui.p272v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutTag2;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.ConstraintSet;
import androidx.constraintlayout.compose.ConstraintSetScope;
import androidx.constraintlayout.compose.DebugFlags;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.EditableJSONLayout;
import androidx.constraintlayout.compose.InvalidationStrategy;
import androidx.constraintlayout.compose.LayoutInformationReceiver;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.MotionLayoutKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.engagement.depositincentive.DepositIncentivePillComposable3;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentivePillData;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataRowState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ModeState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ViewState;
import com.robinhood.android.transfers.util.Constants5;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import microgram.android.RemoteMicrogramApplication;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CreateTransferV2Composable.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2\u0016\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001aW\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001d\u001aI\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.\"\u000e\u0010 \u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u000200X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"CreateTransferV2Composable", "", "viewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;", "onEditAmount", "Lkotlin/Function0;", "onDropdownChipClick", "onAmountFooterClick", "onRowClick", "Lkotlin/Function1;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "onAchTransferOptionClick", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "onInstantTransfersButtonClick", "onContinueButtonClick", "onQuickSelectorChipClick", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "onKeyPress", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onRothInformationErrorTextClicked", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentManager;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "TickerInputComposable", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewDetailsComposable", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "tickerLayoutId", "", "detailsLayoutId", "ctaLayoutId", "disclosureLayoutId", "numpadLayoutId", "centerGuidelineLayoutId", "createConstraints", "Landroidx/constraintlayout/compose/ConstraintSet;", "isNumpadVisible", "", "navigationBarHeight", "Landroidx/compose/ui/unit/Dp;", "createConstraints-3ABfNKs", "(ZF)Landroidx/constraintlayout/compose/ConstraintSet;", "animationDuration", "", "AmountTickerInputViewTag", "DisclosureFooterTag", "InstantTransferButtonTag", "ContinueButtonTag", "NumpadTag", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2Composable3 {
    public static final String AmountTickerInputViewTag = "Ticker";
    public static final String ContinueButtonTag = "ContinueButton";
    public static final String DisclosureFooterTag = "DisclosureFooter";
    public static final String InstantTransferButtonTag = "InstantTransfer";
    public static final String NumpadTag = "Numpad";
    public static final int animationDuration = 300;
    private static final String centerGuidelineLayoutId = "centerGuideline";
    private static final String ctaLayoutId = "cta";
    private static final String detailsLayoutId = "details";
    private static final String disclosureLayoutId = "disclosure";
    private static final String numpadLayoutId = "numpad";
    private static final String tickerLayoutId = "ticker";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferV2Composable$lambda$1(CreateTransferV2ViewState createTransferV2ViewState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function0 function04, Function0 function05, Function1 function13, Function1 function14, Function0 function06, FragmentManager fragmentManager, Navigator navigator, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        CreateTransferV2Composable(createTransferV2ViewState, function0, function02, function03, function1, function12, function04, function05, function13, function14, function06, fragmentManager, navigator, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetailsComposable$lambda$27(CreateTransferV2ViewState createTransferV2ViewState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReviewDetailsComposable(createTransferV2ViewState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposable$lambda$21(CreateTransferV2ViewState createTransferV2ViewState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TickerInputComposable(createTransferV2ViewState, function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CreateTransferV2Composable(final CreateTransferV2ViewState viewState, final Function0<Unit> onEditAmount, final Function0<Unit> onDropdownChipClick, final Function0<Unit> onAmountFooterClick, final Function1<? super CreateTransferV2DataRowState.OnClickAction, Unit> onRowClick, final Function1<? super AchTransferOption, Unit> onAchTransferOptionClick, final Function0<Unit> onInstantTransfersButtonClick, final Function0<Unit> onContinueButtonClick, final Function1<? super QuickSelectorChip, Unit> onQuickSelectorChipClick, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> onRothInformationErrorTextClicked, final FragmentManager childFragmentManager, final Navigator navigator, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onEditAmount, "onEditAmount");
        Intrinsics.checkNotNullParameter(onDropdownChipClick, "onDropdownChipClick");
        Intrinsics.checkNotNullParameter(onAmountFooterClick, "onAmountFooterClick");
        Intrinsics.checkNotNullParameter(onRowClick, "onRowClick");
        Intrinsics.checkNotNullParameter(onAchTransferOptionClick, "onAchTransferOptionClick");
        Intrinsics.checkNotNullParameter(onInstantTransfersButtonClick, "onInstantTransfersButtonClick");
        Intrinsics.checkNotNullParameter(onContinueButtonClick, "onContinueButtonClick");
        Intrinsics.checkNotNullParameter(onQuickSelectorChipClick, "onQuickSelectorChipClick");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(onRothInformationErrorTextClicked, "onRothInformationErrorTextClicked");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1501832136);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onEditAmount) ? 32 : 16;
        }
        int i9 = i4;
        if ((i3 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onDropdownChipClick) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onAmountFooterClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i9 |= 24576;
        } else if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onRowClick) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i9 |= 196608;
        } else if ((i & 196608) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onAchTransferOptionClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i9 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onInstantTransfersButtonClick) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i9 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onContinueButtonClick) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i9 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onQuickSelectorChipClick) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i9 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 536870912 : 268435456;
        }
        if ((i3 & 1024) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(onRothInformationErrorTextClicked) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 32 : 16;
        }
        if ((i3 & 4096) != 0) {
            i7 = i5 | 384;
            i6 = i2;
        } else {
            i6 = i2;
            int i10 = i5;
            if ((i6 & 384) == 0) {
                i10 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
            }
            i7 = i10;
        }
        int i11 = i3 & 8192;
        if (i11 != 0) {
            i8 = i7 | 3072;
        } else {
            int i12 = i7;
            if ((i6 & 3072) == 0) {
                i8 = i12 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
            } else {
                i8 = i12;
            }
        }
        if ((i9 & 306783379) != 306783378 || (i8 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                modifier2 = modifier4;
                ComposerKt.traceEventStart(-1501832136, i9, i8, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable (CreateTransferV2Composable.kt:97)");
            } else {
                modifier2 = modifier4;
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-151647637);
            float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6).getBottom(density));
            composerStartRestartGroup.endReplaceGroup();
            final ConstraintSet constraintSetM19959createConstraints3ABfNKs = m19959createConstraints3ABfNKs(viewState.getModeState().isNumpadVisible(), fMo5013toDpu2uoSUM);
            final Modifier modifier5 = modifier2;
            composer2 = composerStartRestartGroup;
            AutoLoggingCompositionLocals.EventLoggable(viewState.getUserInteractionEventDescriptor(), ComposableLambda3.rememberComposableLambda(1883487715, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt.CreateTransferV2Composable.1
                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(Composer composer3, int i13) {
                    int i14;
                    Animatable animatable;
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1883487715, i13, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous> (CreateTransferV2Composable.kt:110)");
                    }
                    final ConstraintSet constraintSet = constraintSetM19959createConstraints3ABfNKs;
                    Modifier modifier6 = modifier5;
                    final CreateTransferV2ViewState createTransferV2ViewState = viewState;
                    final Function0<Unit> function0 = onEditAmount;
                    final Function0<Unit> function02 = onDropdownChipClick;
                    final Function0<Unit> function03 = onAmountFooterClick;
                    final Function0<Unit> function04 = onRothInformationErrorTextClicked;
                    final Function1<CreateTransferV2DataRowState.OnClickAction, Unit> function1 = onRowClick;
                    final Function1<AchTransferOption, Unit> function12 = onAchTransferOptionClick;
                    final Function1<KeyEvent, Unit> function13 = onKeyPress;
                    final Navigator navigator2 = navigator;
                    final FragmentManager fragmentManager = childFragmentManager;
                    final Function1<QuickSelectorChip, Unit> function14 = onQuickSelectorChipClick;
                    final Function0<Unit> function05 = onContinueButtonClick;
                    final Function0<Unit> function06 = onInstantTransfersButtonClick;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                    TweenSpec tweenSpecTween = AnimationSpecKt.tween(300, 0, new CubicBezierEasing(0.5f, 0.0f, 0.1f, 1.0f));
                    if (tweenSpecTween != null) {
                        composer3.startReplaceGroup(-2000135165);
                        Object objRememberedValue = composer3.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            i14 = 2;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(constraintSet, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        } else {
                            i14 = 2;
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(constraintSet, null, i14, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion4.getEmpty()) {
                            objRememberedValue3 = Animatable2.Animatable$default(0.0f, 0.0f, i14, null);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        Animatable animatable2 = (Animatable) objRememberedValue3;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion4.getEmpty()) {
                            objRememberedValue4 = Channel4.Channel$default(-1, null, null, 6, null);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final Channel channel = (Channel) objRememberedValue4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion4.getEmpty()) {
                            objRememberedValue5 = SnapshotIntState3.mutableIntStateOf(1);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue5;
                        boolean zChangedInstance = composer3.changedInstance(channel) | composer3.changed(constraintSet);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue6 == companion4.getEmpty()) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    channel.mo8337trySendJP2dKIU(constraintSet);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue6, composer3, 0);
                        boolean zChangedInstance2 = composer3.changedInstance(channel) | composer3.changedInstance(animatable2) | composer3.changedInstance(tweenSpecTween) | composer3.changed((Object) null);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue7 == companion4.getEmpty()) {
                            animatable = animatable2;
                            objRememberedValue7 = new C31116x37ecbe94(channel, snapshotIntState2, animatable, tweenSpecTween, null, snapshotState, snapshotState2, null);
                            composer3.updateRememberedValue(objRememberedValue7);
                        } else {
                            animatable = animatable2;
                        }
                        EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer3, 0);
                        ConstraintSet constraintSetM8144ConstraintLayout$lambda17 = ConstraintLayoutKt.m8144ConstraintLayout$lambda17(snapshotState);
                        ConstraintSet constraintSetM8146ConstraintLayout$lambda20 = ConstraintLayoutKt.m8146ConstraintLayout$lambda20(snapshotState2);
                        float fFloatValue = ((Number) animatable.getValue()).floatValue();
                        int iM8158getNonebfy_xzQ = DebugFlags.INSTANCE.m8158getNonebfy_xzQ();
                        final InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (objRememberedValue8 == companion4.getEmpty()) {
                            objRememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue8;
                        Object objRememberedValue9 = composer3.rememberedValue();
                        Object obj = objRememberedValue9;
                        if (objRememberedValue9 == companion4.getEmpty()) {
                            Ref ref = new Ref();
                            ref.setValue(CompositionSource.Unknown);
                            composer3.updateRememberedValue(ref);
                            obj = ref;
                        }
                        final Ref ref2 = (Ref) obj;
                        final int i15 = 0;
                        MotionLayoutKt.MotionLayoutCore(constraintSetM8144ConstraintLayout$lambda17, constraintSetM8146ConstraintLayout$lambda20, null, fFloatValue, null, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, DebugFlags.m8155getShowBoundsimpl(iM8158getNonebfy_xzQ), DebugFlags.m8157getShowPathsimpl(iM8158getNonebfy_xzQ), DebugFlags.m8156getShowKeyPositionsimpl(iM8158getNonebfy_xzQ), modifier6, snapshotState3, ref2, defaultInvalidationStrategy, ComposableLambda3.rememberComposableLambda(284503157, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer4, Integer num) {
                                invoke(motionLayoutScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer4, int i16) {
                                int i17;
                                boolean z;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(284503157, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
                                }
                                snapshotState3.setValue(Unit.INSTANCE);
                                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                                    ref2.setValue(CompositionSource.Content);
                                }
                                composer4.startReplaceGroup(-2075780874);
                                composer4.startReplaceGroup(-79004936);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                CreateTransferV2Composable3.TickerInputComposable(createTransferV2ViewState, function0, function02, function03, function04, TestTag3.testTag(ConstraintLayoutTag2.layoutId$default(companion5, "ticker", null, 2, null), CreateTransferV2Composable3.AmountTickerInputViewTag), composer4, 0, 0);
                                CreateTransferV2Composable3.ReviewDetailsComposable(createTransferV2ViewState, function1, function12, ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion5, -1.0f), ErrorBundle.DETAIL_ENTRY, null, 2, null), composer4, 0, 0);
                                Modifier modifierLayoutId$default = ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion5, -1.0f), OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, null, 2, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i18 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierLayoutId$default, bentoTheme.getSpacing(composer4, i18).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(1422442370);
                                if (createTransferV2ViewState.getShowDisclosure()) {
                                    Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> disclosureSource = createTransferV2ViewState.getDisclosureSource();
                                    if (disclosureSource instanceof Either.Left) {
                                        composer4.startReplaceGroup(1146167085);
                                        i17 = 54;
                                        z = true;
                                        GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator2, ComposableLambda3.rememberComposableLambda(1988873133, true, new CreateTransferV2Composable4(disclosureSource), composer4, 54), composer4, 24576, 7);
                                        composer4.endReplaceGroup();
                                    } else {
                                        i17 = 54;
                                        z = true;
                                        if (!(disclosureSource instanceof Either.Right)) {
                                            composer4.startReplaceGroup(1422444084);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(1147047113);
                                        CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(navigator2), ComposableLambda3.rememberComposableLambda(1951852306, true, new CreateTransferV2Composable5(disclosureSource, fragmentManager), composer4, 54), composer4, ProvidedValue.$stable | 48);
                                        composer4.endReplaceGroup();
                                    }
                                } else {
                                    i17 = 54;
                                    z = true;
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ConstraintLayoutTag2.layoutId$default(companion5, AccountOverviewOptionsSettingCard4.CTA, null, 2, null), bentoTheme.getSpacing(composer4, i18).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i18).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i18).m21590getDefaultD9Ej5fM(), 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                                Boolean boolValueOf = Boolean.valueOf(createTransferV2ViewState.getIsContinueButtonVisible());
                                List<QuickSelectorChip> quickSelectorChips = createTransferV2ViewState.getQuickSelectorChips();
                                Crossfade.Crossfade(Tuples4.m3642to(boolValueOf, Boolean.valueOf((quickSelectorChips == null || quickSelectorChips.isEmpty()) ? z : false)), (Modifier) null, AnimationSpecKt.tween$default(300, 0, null, 6, null), "transferCtaCrossFade", ComposableLambda3.rememberComposableLambda(-1452057584, z, new CreateTransferV2Composable6(createTransferV2ViewState, function14, function05, function06), composer4, i17), composer4, 28032, 2);
                                composer4.endNode();
                                BentoNumpad3.BentoNumpad(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(ConstraintLayoutTag2.layoutId$default(companion5, "numpad", null, 2, null), bentoTheme.getColors(composer4, i18).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i18).m21593getSmallD9Ej5fM(), 7, null), CreateTransferV2Composable3.NumpadTag), function13, true, null, false, false, composer4, 3456, 48);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(ConstraintLayoutTag2.layoutId$default(companion5, "centerGuideline", null, 2, null), C2002Dp.m7995constructorimpl(0)), composer4, 0);
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 24576, (Ref.$stable << 3) | 3078);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1998673515);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        Composer.Companion companion5 = Composer.INSTANCE;
                        if (objRememberedValue10 == companion5.getEmpty()) {
                            objRememberedValue10 = SnapshotLongState3.mutableLongStateOf(0L);
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue10;
                        Object objRememberedValue11 = composer3.rememberedValue();
                        if (objRememberedValue11 == companion5.getEmpty()) {
                            objRememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue11;
                        Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (objRememberedValue12 == companion5.getEmpty()) {
                            objRememberedValue12 = new Measurer2(density2);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue12;
                        boolean zChangedInstance3 = composer3.changedInstance(measurer2) | composer3.changed(constraintSet);
                        final int i16 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance3 | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue13 == companion5.getEmpty()) {
                            objRememberedValue13 = new MeasurePolicy() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$4
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i17);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i17);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i17);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i17);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState4.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSet, list, linkedHashMap, i16);
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$4.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
                        if (constraintSet instanceof EditableJSONLayout) {
                            ((EditableJSONLayout) constraintSet).setUpdateFlag(snapshotLongState2);
                        }
                        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
                        if (Float.isNaN(measurer2.getForcedScaleFactor())) {
                            composer3.startReplaceGroup(-1996827620);
                            boolean zChangedInstance4 = composer3.changedInstance(measurer2);
                            Object objRememberedValue14 = composer3.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue14 == companion5.getEmpty()) {
                                objRememberedValue14 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$7
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue14);
                            }
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier6, false, (Function1) objRememberedValue14, 1, null), ComposableLambda3.rememberComposableLambda(-207512644, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i17) {
                                    int i18;
                                    boolean z;
                                    if ((i17 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-207512644, i17, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:853)");
                                        }
                                        snapshotState4.setValue(Unit.INSTANCE);
                                        composer4.startReplaceGroup(-79004936);
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        CreateTransferV2Composable3.TickerInputComposable(createTransferV2ViewState, function0, function02, function03, function04, TestTag3.testTag(ConstraintLayoutTag2.layoutId$default(companion6, "ticker", null, 2, null), CreateTransferV2Composable3.AmountTickerInputViewTag), composer4, 0, 0);
                                        CreateTransferV2Composable3.ReviewDetailsComposable(createTransferV2ViewState, function1, function12, ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion6, -1.0f), ErrorBundle.DETAIL_ENTRY, null, 2, null), composer4, 0, 0);
                                        Modifier modifierLayoutId$default = ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion6, -1.0f), OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, null, 2, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i19 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierLayoutId$default, bentoTheme.getSpacing(composer4, i19).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                        Alignment.Companion companion7 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion8.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion8.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceGroup(1422442370);
                                        if (createTransferV2ViewState.getShowDisclosure()) {
                                            Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> disclosureSource = createTransferV2ViewState.getDisclosureSource();
                                            if (disclosureSource instanceof Either.Left) {
                                                composer4.startReplaceGroup(1146167085);
                                                i18 = 54;
                                                z = true;
                                                GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator2, ComposableLambda3.rememberComposableLambda(1988873133, true, new CreateTransferV2Composable4(disclosureSource), composer4, 54), composer4, 24576, 7);
                                                composer4.endReplaceGroup();
                                            } else {
                                                i18 = 54;
                                                z = true;
                                                if (!(disclosureSource instanceof Either.Right)) {
                                                    composer4.startReplaceGroup(1422444084);
                                                    composer4.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer4.startReplaceGroup(1147047113);
                                                CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(navigator2), ComposableLambda3.rememberComposableLambda(1951852306, true, new CreateTransferV2Composable5(disclosureSource, fragmentManager), composer4, 54), composer4, ProvidedValue.$stable | 48);
                                                composer4.endReplaceGroup();
                                            }
                                        } else {
                                            i18 = 54;
                                            z = true;
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ConstraintLayoutTag2.layoutId$default(companion6, AccountOverviewOptionsSettingCard4.CTA, null, 2, null), bentoTheme.getSpacing(composer4, i19).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i19).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i19).m21590getDefaultD9Ej5fM(), 2, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                                        Boolean boolValueOf = Boolean.valueOf(createTransferV2ViewState.getIsContinueButtonVisible());
                                        List<QuickSelectorChip> quickSelectorChips = createTransferV2ViewState.getQuickSelectorChips();
                                        Crossfade.Crossfade(Tuples4.m3642to(boolValueOf, Boolean.valueOf((quickSelectorChips == null || quickSelectorChips.isEmpty()) ? z : false)), (Modifier) null, AnimationSpecKt.tween$default(300, 0, null, 6, null), "transferCtaCrossFade", ComposableLambda3.rememberComposableLambda(-1452057584, z, new CreateTransferV2Composable6(createTransferV2ViewState, function14, function05, function06), composer4, i18), composer4, 28032, 2);
                                        composer4.endNode();
                                        BentoNumpad3.BentoNumpad(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(ConstraintLayoutTag2.layoutId$default(companion6, "numpad", null, 2, null), bentoTheme.getColors(composer4, i19).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i19).m21593getSmallD9Ej5fM(), 7, null), CreateTransferV2Composable3.NumpadTag), function13, true, null, false, false, composer4, 3456, 48);
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(ConstraintLayoutTag2.layoutId$default(companion6, "centerGuideline", null, 2, null), C2002Dp.m7995constructorimpl(0)), composer4, 0);
                                        composer4.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), measurePolicy, composer3, 48, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1997256040);
                            Modifier modifierScale = Scale2.scale(modifier6, measurer2.getForcedScaleFactor());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
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
                            boolean zChangedInstance5 = composer3.changedInstance(measurer2);
                            Object objRememberedValue15 = composer3.rememberedValue();
                            if (zChangedInstance5 || objRememberedValue15 == companion5.getEmpty()) {
                                objRememberedValue15 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$5
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierScale, false, (Function1) objRememberedValue15, 1, null), ComposableLambda3.rememberComposableLambda(1131308473, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @SuppressLint({"UnnecessaryLambdaCreation"})
                                public final void invoke(Composer composer4, int i17) {
                                    int i18;
                                    boolean z;
                                    if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1131308473, i17, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous>.<anonymous> (ConstraintLayout.kt:841)");
                                    }
                                    composer4.startReplaceGroup(-79004936);
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    CreateTransferV2Composable3.TickerInputComposable(createTransferV2ViewState, function0, function02, function03, function04, TestTag3.testTag(ConstraintLayoutTag2.layoutId$default(companion6, "ticker", null, 2, null), CreateTransferV2Composable3.AmountTickerInputViewTag), composer4, 0, 0);
                                    CreateTransferV2Composable3.ReviewDetailsComposable(createTransferV2ViewState, function1, function12, ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion6, -1.0f), ErrorBundle.DETAIL_ENTRY, null, 2, null), composer4, 0, 0);
                                    Modifier modifierLayoutId$default = ConstraintLayoutTag2.layoutId$default(ZIndexModifier2.zIndex(companion6, -1.0f), OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, null, 2, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i19 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierLayoutId$default, bentoTheme.getSpacing(composer4, i19).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                    Alignment.Companion companion7 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceGroup(1422442370);
                                    if (createTransferV2ViewState.getShowDisclosure()) {
                                        Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> disclosureSource = createTransferV2ViewState.getDisclosureSource();
                                        if (disclosureSource instanceof Either.Left) {
                                            composer4.startReplaceGroup(1146167085);
                                            i18 = 54;
                                            z = true;
                                            GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator2, ComposableLambda3.rememberComposableLambda(1988873133, true, new CreateTransferV2Composable4(disclosureSource), composer4, 54), composer4, 24576, 7);
                                            composer4.endReplaceGroup();
                                        } else {
                                            i18 = 54;
                                            z = true;
                                            if (!(disclosureSource instanceof Either.Right)) {
                                                composer4.startReplaceGroup(1422444084);
                                                composer4.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer4.startReplaceGroup(1147047113);
                                            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(navigator2), ComposableLambda3.rememberComposableLambda(1951852306, true, new CreateTransferV2Composable5(disclosureSource, fragmentManager), composer4, 54), composer4, ProvidedValue.$stable | 48);
                                            composer4.endReplaceGroup();
                                        }
                                    } else {
                                        i18 = 54;
                                        z = true;
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ConstraintLayoutTag2.layoutId$default(companion6, AccountOverviewOptionsSettingCard4.CTA, null, 2, null), bentoTheme.getSpacing(composer4, i19).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i19).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i19).m21590getDefaultD9Ej5fM(), 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
                                    Boolean boolValueOf = Boolean.valueOf(createTransferV2ViewState.getIsContinueButtonVisible());
                                    List<QuickSelectorChip> quickSelectorChips = createTransferV2ViewState.getQuickSelectorChips();
                                    Crossfade.Crossfade(Tuples4.m3642to(boolValueOf, Boolean.valueOf((quickSelectorChips == null || quickSelectorChips.isEmpty()) ? z : false)), (Modifier) null, AnimationSpecKt.tween$default(300, 0, null, 6, null), "transferCtaCrossFade", ComposableLambda3.rememberComposableLambda(-1452057584, z, new CreateTransferV2Composable6(createTransferV2ViewState, function14, function05, function06), composer4, i18), composer4, 28032, 2);
                                    composer4.endNode();
                                    BentoNumpad3.BentoNumpad(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(ConstraintLayoutTag2.layoutId$default(companion6, "numpad", null, 2, null), bentoTheme.getColors(composer4, i19).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i19).m21593getSmallD9Ej5fM(), 7, null), CreateTransferV2Composable3.NumpadTag), function13, true, null, false, false, composer4, 3456, 48);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(ConstraintLayoutTag2.layoutId$default(companion6, "centerGuideline", null, 2, null), C2002Dp.m7995constructorimpl(0)), composer4, 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), measurePolicy, composer3, 48, 0);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                    }
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
            }, composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTransferV2Composable3.CreateTransferV2Composable$lambda$1(viewState, onEditAmount, onDropdownChipClick, onAmountFooterClick, onRowClick, onAchTransferOptionClick, onInstantTransfersButtonClick, onContinueButtonClick, onQuickSelectorChipClick, onKeyPress, onRothInformationErrorTextClicked, childFragmentManager, navigator, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TickerInputComposable(final CreateTransferV2ViewState createTransferV2ViewState, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier3;
        int i5;
        float f;
        StringResource rothInformationErrorViewState;
        Modifier.Companion companion;
        int i6;
        DepositIncentivePillData depositIncentivePillData;
        Modifier.Companion companion2;
        CreateTransferV2ViewState.InfoTagState amountInfoTagState;
        Modifier.Companion companion3;
        StringResource amountFooterText;
        CreateTransferV2DropdownChipViewState dropdownChipViewState;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1160642689);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(createTransferV2ViewState) ? 4 : 2) | i;
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
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1160642689, i3, -1, "com.robinhood.android.transfers.ui.v2.TickerInputComposable (CreateTransferV2Composable.kt:298)");
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment center = companion4.getCenter();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion6);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1073357639);
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion6, Constants5.getTickerViewHeight());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion7 = Composer.INSTANCE;
                        if (objRememberedValue == companion7.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CreateTransferV2Composable3.TickerInputComposable$lambda$20$lambda$19$lambda$4$lambda$3((Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(createTransferV2ViewState);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion7.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CreateTransferV2Composable3.TickerInputComposable$lambda$20$lambda$19$lambda$8$lambda$7(createTransferV2ViewState, function0, (TickerInputView) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        i5 = 1;
                        f = 0.0f;
                        AndroidView_androidKt.AndroidView(function1, modifierM5156height3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        modifier3 = modifier5;
                        i5 = 1;
                        f = 0.0f;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    rothInformationErrorViewState = createTransferV2ViewState.getRothInformationErrorViewState();
                    composerStartRestartGroup.startReplaceGroup(1073409907);
                    if (rothInformationErrorViewState != null) {
                        companion = companion6;
                        i6 = 0;
                    } else {
                        String string2 = StringResource2.getString(rothInformationErrorViewState, composerStartRestartGroup, StringResource.$stable);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i7 = (57344 & i3) == 16384 ? i5 : 0;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (i7 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateTransferV2Composable3.m2548xee92728a(function04);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        companion = companion6;
                        Composer composer2 = composerStartRestartGroup;
                        i6 = 0;
                        BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue3, 7, null), f, i5, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                        composerStartRestartGroup = composer2;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    depositIncentivePillData = createTransferV2ViewState.getDepositIncentivePillData();
                    composerStartRestartGroup.startReplaceGroup(1073425136);
                    if (depositIncentivePillData != null) {
                        companion2 = companion;
                    } else {
                        companion2 = companion;
                        DepositIncentivePillComposable3.DepositIncentivePillComposable(depositIncentivePillData, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, DepositIncentivePillData.$stable, i6);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    amountInfoTagState = createTransferV2ViewState.getAmountInfoTagState();
                    composerStartRestartGroup.startReplaceGroup(1073434335);
                    if (amountInfoTagState != null) {
                        companion3 = companion2;
                    } else {
                        String text = amountInfoTagState.getText();
                        int resourceId = amountInfoTagState.getIcon().getResourceId();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Composer composer3 = composerStartRestartGroup;
                        companion3 = companion2;
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(text, PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion2, companion4.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), Integer.valueOf(resourceId), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU()), null, false, null, null, composer3, 12582912, 112);
                        composerStartRestartGroup = composer3;
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    amountFooterText = createTransferV2ViewState.getAmountFooterText();
                    composerStartRestartGroup.startReplaceGroup(1073450758);
                    if (amountFooterText != null) {
                        Modifier modifierAlign = column6.align(companion3, companion4.getCenterHorizontally());
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierAlign, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 7168) == 2048;
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateTransferV2Composable3.m2549x17c91cbd(function03);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs, false, null, null, (Function0) objRememberedValue4, 7, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Composer composer4 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(StringResource2.getString(amountFooterText, composerStartRestartGroup, StringResource.$stable), bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7922getLefte0LSkKk()), 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextS(), composer4, 0, 0, 8122);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme2.getColors(composer4, i9).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer4, i9).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(1), 6, null), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                        composerStartRestartGroup = composer4;
                        composerStartRestartGroup.endNode();
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    dropdownChipViewState = createTransferV2ViewState.getDropdownChipViewState();
                    composerStartRestartGroup.startReplaceGroup(1073493616);
                    if (dropdownChipViewState != null) {
                        String string3 = StringResource2.getString(dropdownChipViewState.getText(), composerStartRestartGroup, StringResource.$stable);
                        Modifier modifierAlign2 = column6.align(companion3, companion4.getCenterHorizontally());
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoChip.BentoDropdownChip(function02, PaddingKt.m5145paddingqDBjuR0(modifierAlign2, bentoTheme3.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM()), false, null, string3, composerStartRestartGroup, (i3 >> 6) & 14, 12);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CreateTransferV2Composable3.TickerInputComposable$lambda$21(createTransferV2ViewState, function0, function02, function03, function04, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Companion companion42 = Alignment.INSTANCE;
                Alignment center2 = companion42.getCenter();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion52.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion52.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion52.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion62 = Modifier.INSTANCE;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion42.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion62);
                    Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1073357639);
                        if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        rothInformationErrorViewState = createTransferV2ViewState.getRothInformationErrorViewState();
                        composerStartRestartGroup.startReplaceGroup(1073409907);
                        if (rothInformationErrorViewState != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        depositIncentivePillData = createTransferV2ViewState.getDepositIncentivePillData();
                        composerStartRestartGroup.startReplaceGroup(1073425136);
                        if (depositIncentivePillData != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        amountInfoTagState = createTransferV2ViewState.getAmountInfoTagState();
                        composerStartRestartGroup.startReplaceGroup(1073434335);
                        if (amountInfoTagState != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        amountFooterText = createTransferV2ViewState.getAmountFooterText();
                        composerStartRestartGroup.startReplaceGroup(1073450758);
                        if (amountFooterText != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        dropdownChipViewState = createTransferV2ViewState.getDropdownChipViewState();
                        composerStartRestartGroup.startReplaceGroup(1073493616);
                        if (dropdownChipViewState != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TickerInputView TickerInputComposable$lambda$20$lambda$19$lambda$4$lambda$3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, 0.0f, 0, 30, null);
        tickerInputView.setUseLegacyTextSizingAndLayout(false);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        return tickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposable$lambda$20$lambda$19$lambda$8$lambda$7(final CreateTransferV2ViewState createTransferV2ViewState, final Function0 function0, TickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        if (createTransferV2ViewState.getAnimateInput()) {
            view.transitionTo(createTransferV2ViewState.getInputChars());
        } else {
            view.setValue(createTransferV2ViewState.getInputChars());
        }
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferV2Composable3.m2550x4375b03(createTransferV2ViewState, function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TickerInputComposable$lambda$20$lambda$19$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final Unit m2550x4375b03(CreateTransferV2ViewState createTransferV2ViewState, Function0 function0) {
        if (createTransferV2ViewState.getModeState() instanceof CreateTransferV2ModeState.Review) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TickerInputComposable$lambda$20$lambda$19$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2548xee92728a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TickerInputComposable$lambda$20$lambda$19$lambda$17$lambda$15$lambda$14 */
    public static final Unit m2549x17c91cbd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewDetailsComposable(CreateTransferV2ViewState createTransferV2ViewState, final Function1<? super CreateTransferV2DataRowState.OnClickAction, Unit> function1, final Function1<? super AchTransferOption, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        final CreateTransferV2ViewState createTransferV2ViewState2;
        int i3;
        Function1<? super AchTransferOption, Unit> function13;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        CreateTransferV2InstantBankTransferSelectorViewState instantBankTransferViewState;
        final Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-478118933);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            createTransferV2ViewState2 = createTransferV2ViewState;
        } else if ((i & 6) == 0) {
            createTransferV2ViewState2 = createTransferV2ViewState;
            i3 = (composerStartRestartGroup.changedInstance(createTransferV2ViewState2) ? 4 : 2) | i;
        } else {
            createTransferV2ViewState2 = createTransferV2ViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function13 = function12;
        } else {
            function13 = function12;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-478118933, i3, -1, "com.robinhood.android.transfers.ui.v2.ReviewDetailsComposable (CreateTransferV2Composable.kt:428)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 4);
                composer2.startReplaceGroup(1255014103);
                for (CreateTransferV2DataRowState createTransferV2DataRowState : createTransferV2ViewState2.getReviewDataRowStates()) {
                    StringResource label = createTransferV2DataRowState.getLabel();
                    int i6 = StringResource.$stable;
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResource2.getString(label, composer2, i6), null, 2, null), null, createTransferV2DataRowState.isLocked() ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.LOCK_16) : null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), new AnnotatedString(StringResource2.getString(createTransferV2DataRowState.getValue(), composer2, i6), null, 2, null), null, null, null, null, false, false, 4037, null);
                    composer2.startReplaceGroup(1255034456);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final CreateTransferV2DataRowState.OnClickAction onClickAction = createTransferV2DataRowState.getOnClickAction();
                    if (onClickAction != null) {
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = ((i3 & 112) == 32) | composer2.changedInstance(onClickAction);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateTransferV2Composable3.ReviewDetailsComposable$lambda$26$lambda$24$lambda$23$lambda$22(function1, onClickAction);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null);
                        if (modifierM4893clickableXHw0xAI$default == null) {
                            modifierM4893clickableXHw0xAI$default = modifierFillMaxWidth$default;
                        }
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, TestTag3.testTag(modifierM4893clickableXHw0xAI$default, createTransferV2DataRowState.getTestTag()), null, null, null, composer3, BentoDataRowState.$stable, 28);
                    modifier4 = modifier4;
                    composer2 = composer3;
                }
                Modifier modifier5 = modifier4;
                composer2.endReplaceGroup();
                instantBankTransferViewState = createTransferV2ViewState2.getInstantBankTransferViewState();
                composer2.startReplaceGroup(1255044059);
                if (instantBankTransferViewState != null) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    int i8 = BentoIcon4.$stable;
                    int i9 = StringResource.$stable;
                    Composer composer4 = composer2;
                    CreateTransferV2InstantBankTransferSelectorComposable.CreateTransferV2InstantBankTransferSelectorComposable(instantBankTransferViewState, function13, modifierM5146paddingqDBjuR0$default, composer4, i8 | i9 | i9 | ((i3 >> 3) & 112), 0);
                    composer2 = composer4;
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferV2Composable3.ReviewDetailsComposable$lambda$27(createTransferV2ViewState2, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme3.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 4);
                composer2.startReplaceGroup(1255014103);
                while (r16.hasNext()) {
                }
                Modifier modifier52 = modifier4;
                composer2.endReplaceGroup();
                instantBankTransferViewState = createTransferV2ViewState2.getInstantBankTransferViewState();
                composer2.startReplaceGroup(1255044059);
                if (instantBankTransferViewState != null) {
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetailsComposable$lambda$26$lambda$24$lambda$23$lambda$22(Function1 function1, CreateTransferV2DataRowState.OnClickAction onClickAction) {
        function1.invoke(onClickAction);
        return Unit.INSTANCE;
    }

    /* renamed from: createConstraints-3ABfNKs, reason: not valid java name */
    private static final ConstraintSet m19959createConstraints3ABfNKs(final boolean z, final float f) {
        return ConstraintLayoutKt.ConstraintSet(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40(z, f, (ConstraintSetScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40(boolean z, final float f, ConstraintSetScope ConstraintSet) {
        Intrinsics.checkNotNullParameter(ConstraintSet, "$this$ConstraintSet");
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor = ConstraintSet.createRefFor(tickerLayoutId);
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor2 = ConstraintSet.createRefFor("details");
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor3 = ConstraintSet.createRefFor("cta");
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor4 = ConstraintSet.createRefFor("disclosure");
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor5 = ConstraintSet.createRefFor(numpadLayoutId);
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRefFor6 = ConstraintSet.createRefFor(centerGuidelineLayoutId);
        final ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = ConstraintSet.createGuidelineFromTop(0.4f);
        if (z) {
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor6, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$28(constraintLayoutBaseScope4CreateRefFor3, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$29(constraintLayoutBaseScope4CreateRefFor6, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor2, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$30(f, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor4, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$31(constraintLayoutBaseScope4CreateRefFor3, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor3, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$32(constraintLayoutBaseScope4CreateRefFor5, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor5, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$33((ConstrainScope) obj);
                }
            });
        } else {
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor6, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$34(horizontalAnchorCreateGuidelineFromTop, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$35(constraintLayoutBaseScope4CreateRefFor2, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor2, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$36(constraintLayoutBaseScope4CreateRefFor, constraintLayoutBaseScope4CreateRefFor4, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor4, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$37(constraintLayoutBaseScope4CreateRefFor2, constraintLayoutBaseScope4CreateRefFor3, (ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor3, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$38((ConstrainScope) obj);
                }
            });
            ConstraintSet.constrain(constraintLayoutBaseScope4CreateRefFor5, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Composable3.createConstraints_3ABfNKs$lambda$40$lambda$39(f, (ConstrainScope) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$28(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope4.getTop(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$29(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        constrain.centerTo(constraintLayoutBaseScope4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$30(float f, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getBottom(), C2002Dp.m7995constructorimpl(f + C2002Dp.m7995constructorimpl(16)), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$31(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope4.getTop(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$32(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope4.getTop(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$33(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$34(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), horizontalAnchor, 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$35(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope4.getTop(), 0.0f, 0.0f, 6, null);
        constrain.setHeight(Dimension.INSTANCE.getFillToConstraints());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$36(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope42.getTop(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$37(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constraintLayoutBaseScope4.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constraintLayoutBaseScope42.getTop(), C2002Dp.m7995constructorimpl(16), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$38(ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConstraints_3ABfNKs$lambda$40$lambda$39(float f, ConstrainScope constrain) {
        Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrain.getEnd(), constrain.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getBottom(), C2002Dp.m7995constructorimpl(f + C2002Dp.m7995constructorimpl(16)), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
