package com.robinhood.shared.crypto.expandableButtonTray;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import com.squareup.wire.AnyMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: CryptoExpandableButtonTrayComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a¹\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b2\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0015\u001ag\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a«\u0001\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0!2\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b2\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\"\u001a-\u0010#\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020$2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010%\u001a\u0017\u0010&\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020'H\u0001¢\u0006\u0002\u0010(¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"CryptoExpandableButtonTrayComposable", "", "T", "state", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "isExpanded", "", "onIdlButtonClick", "Lkotlin/Function2;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "Lrh_server_driven_ui/v1/GenericAction;", "onCustomButtonClick", "onExpand", "Lkotlin/Function0;", "onCollapse", "modifier", "Landroidx/compose/ui/Modifier;", "trayDecorationModifier", "removeHorizontalPadding", "removeVerticalPadding", "onPrefixBottomSheetSelectorClick", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ActionButtonComposable", "button", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ExpandableButtons", "expandAnimationType", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;", "expandButton", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;", "closeButtonTintOverride", "Lrh_server_driven_ui/v1/ColorDto;", CarResultComposable2.BUTTONS, "Lkotlinx/collections/immutable/ImmutableList;", "(ZLcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandAnimationType;Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ExpandButton;Lrh_server_driven_ui/v1/ColorDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrefixContent", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$PrefixContentState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ExpandableButtonTrayPreview", "Lcom/robinhood/shared/crypto/expandableButtonTray/PreviewState;", "(Lcom/robinhood/shared/crypto/expandableButtonTray/PreviewState;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-expandable-button-tray_externalDebug", "buttonHeight", "Landroidx/compose/ui/unit/Dp;", "offset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoExpandableButtonTrayComposable {

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExpandableButtonTrayState.ExpandAnimationType.values().length];
            try {
                iArr[ExpandableButtonTrayState.ExpandAnimationType.SPRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpandableButtonTrayState.ExpandAnimationType.BOUNCE_ON_EXPAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButtonComposable$lambda$12(ExpandableButtonTrayState.ActionButton actionButton, Function2 function2, Function2 function22, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ActionButtonComposable(actionButton, function2, function22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoExpandableButtonTrayComposable$lambda$5(ExpandableButtonTrayState expandableButtonTrayState, boolean z, Function2 function2, Function2 function22, Function0 function0, Function0 function02, Modifier modifier, Modifier modifier2, boolean z2, boolean z3, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        CryptoExpandableButtonTrayComposable(expandableButtonTrayState, z, function2, function22, function0, function02, modifier, modifier2, z2, z3, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableButtonTrayPreview$lambda$27(PreviewState previewState, int i, Composer composer, int i2) {
        ExpandableButtonTrayPreview(previewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableButtons$lambda$22(boolean z, ExpandableButtonTrayState.ExpandAnimationType expandAnimationType, ExpandableButtonTrayState.ExpandButton expandButton, ColorDto colorDto, ImmutableList immutableList, Function2 function2, Function2 function22, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExpandableButtons(z, expandAnimationType, expandButton, colorDto, immutableList, function2, function22, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrefixContent$lambda$26(ExpandableButtonTrayState.PrefixContentState prefixContentState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrefixContent(prefixContentState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtonTrayPreview$1 */
    static final class C376751 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PreviewState $state;

        C376751(PreviewState previewState) {
            this.$state = previewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$8$lambda$1$lambda$0(ExpandableButtonTrayState.ActionButton actionButton, GenericAction genericAction) {
            Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
            Intrinsics.checkNotNullParameter(genericAction, "<unused var>");
            return true;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-471432, i, -1, "com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayPreview.<anonymous> (CryptoExpandableButtonTrayComposable.kt:577)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            Alignment bottomEnd = Alignment.INSTANCE.getBottomEnd();
            PreviewState previewState = this.$state;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomEnd, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ExpandableButtonTrayState<Unit> trayState = previewState.getTrayState();
            boolean zIsExpanded = previewState.isExpanded();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtonTrayPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Boolean.valueOf(CryptoExpandableButtonTrayComposable.C376751.invoke$lambda$8$lambda$1$lambda$0((ExpandableButtonTrayState.ActionButton) obj, (GenericAction) obj2));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtonTrayPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoExpandableButtonTrayComposable.C376751.invoke$lambda$8$lambda$3$lambda$2((ExpandableButtonTrayState.ActionButton) obj, (Unit) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function2 function22 = (Function2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtonTrayPreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtonTrayPreview$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            CryptoExpandableButtonTrayComposable.CryptoExpandableButtonTrayComposable(trayState, zIsExpanded, function2, function22, function0, (Function0) objRememberedValue4, null, null, false, false, null, composer, StringResource.$stable | 224640, 0, 1984);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$3$lambda$2(ExpandableButtonTrayState.ActionButton actionButton, Unit unit) {
            Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
            Intrinsics.checkNotNullParameter(unit, "<unused var>");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void CryptoExpandableButtonTrayComposable(final ExpandableButtonTrayState<T> state, final boolean z, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super GenericAction, Boolean> onIdlButtonClick, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super T, Unit> onCustomButtonClick, final Function0<Unit> onExpand, final Function0<Unit> onCollapse, Modifier modifier, Modifier modifier2, boolean z2, boolean z3, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        Modifier modifier3;
        int i6;
        Modifier modifier4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        boolean z7;
        Function0<Unit> function02;
        Object objRememberedValue;
        int i13;
        float fM7995constructorimpl;
        Modifier modifier5;
        float fM7995constructorimpl2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function03;
        Modifier modifier6;
        final Function0<Unit> function04;
        final Modifier modifier7;
        final boolean z8;
        final boolean z9;
        final Modifier modifier8;
        Modifier modifierWeight$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onIdlButtonClick, "onIdlButtonClick");
        Intrinsics.checkNotNullParameter(onCustomButtonClick, "onCustomButtonClick");
        Intrinsics.checkNotNullParameter(onExpand, "onExpand");
        Intrinsics.checkNotNullParameter(onCollapse, "onCollapse");
        Composer composerStartRestartGroup = composer.startRestartGroup(2096671930);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z;
                i4 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onIdlButtonClick) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onCustomButtonClick) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onExpand) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onCollapse) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    modifier3 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier3) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    modifier4 = modifier2;
                } else {
                    modifier4 = modifier2;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier4) ? 8388608 : 4194304;
                    }
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(z5) ? 67108864 : 33554432;
                    }
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                    if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i10;
                        i12 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i12 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier9 = i5 == 0 ? Modifier.INSTANCE : modifier3;
                        Modifier modifier10 = i6 == 0 ? Modifier.INSTANCE : modifier4;
                        z6 = i7 == 0 ? false : z5;
                        z7 = i9 == 0 ? false : z3;
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function02 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function02 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2096671930, i4, i12, "com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable (CryptoExpandableButtonTrayComposable.kt:82)");
                        }
                        ExpandableButtonTrayStyle expandableButtonTray = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        int i14 = i12;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier9, 0.0f, 1, null), expandableButtonTray.getColors().m21771getBgColor0d7_KjU(), null, 2, null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierThen = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 6, null).then(modifier10);
                        if (z6) {
                            fM7995constructorimpl = expandableButtonTray.getSpacing().m21780getHorizontalContainerPaddingD9Ej5fM();
                            i13 = 0;
                        } else {
                            i13 = 0;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                        }
                        if (z7) {
                            modifier5 = modifier9;
                            fM7995constructorimpl2 = expandableButtonTray.getSpacing().m21783getVerticalTrayPaddingD9Ej5fM();
                        } else {
                            modifier5 = modifier9;
                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(i13);
                        }
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierThen, fM7995constructorimpl, fM7995constructorimpl2);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i13);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(373891859);
                        if (state.getPrefixContentState() == null) {
                            ExpandableButtonTrayState.PrefixContentState prefixContentState = state.getPrefixContentState();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            if (state.getShowWideButtons()) {
                                modifierWeight$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, expandableButtonTray.getSpacing().m21781getHorizontalItemPaddingD9Ej5fM(), 0.0f, 11, null);
                            } else {
                                modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                            }
                            Function0<Unit> function05 = function02;
                            PrefixContent(prefixContentState, function05, companion2.then(modifierWeight$default), composerStartRestartGroup, (i14 << 3) & 112, 0);
                            function03 = function05;
                        } else {
                            function03 = function02;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (!state.getButtons().isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-1293654407);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (!state.getAlwaysShowExpandButton() && state.getButtons().size() == 1) {
                            composerStartRestartGroup.startReplaceGroup(-1293530469);
                            ActionButtonComposable((ExpandableButtonTrayState.ActionButton) CollectionsKt.first((List) state.getButtons()), onCustomButtonClick, onIdlButtonClick, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, ((i4 >> 6) & 112) | (i4 & 896), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1293204101);
                            ExpandableButtonTrayState.ExpandAnimationType expandAnimationType = state.getExpandAnimationType();
                            ExpandableButtonTrayState.ExpandButton expandButton = state.getExpandButton();
                            int i15 = i4;
                            ColorDto closeButtonTintOverride = state.getCloseButtonTintOverride();
                            ImmutableList<ExpandableButtonTrayState.ActionButton<T>> buttons = state.getButtons();
                            Modifier modifierWeight$default2 = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
                            int i16 = ((i15 >> 3) & 14) | (StringResource.$stable << 6);
                            int i17 = i15 << 9;
                            int i18 = i16 | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024);
                            modifier6 = modifier10;
                            ExpandableButtons(z4, expandAnimationType, expandButton, closeButtonTintOverride, buttons, onIdlButtonClick, onCustomButtonClick, onExpand, onCollapse, modifierWeight$default2, composerStartRestartGroup, i18, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function04 = function03;
                            modifier7 = modifier6;
                            z8 = z6;
                            z9 = z7;
                            modifier8 = modifier5;
                        }
                        modifier6 = modifier10;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                        modifier7 = modifier6;
                        z8 = z6;
                        z9 = z7;
                        modifier8 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z9 = z3;
                        function04 = function0;
                        z8 = z5;
                        modifier7 = modifier4;
                        modifier8 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoExpandableButtonTrayComposable.CryptoExpandableButtonTrayComposable$lambda$5(state, z, onIdlButtonClick, onCustomButtonClick, onExpand, onCollapse, modifier8, modifier7, z8, z9, function04, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ExpandableButtonTrayStyle expandableButtonTray2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    int i142 = i12;
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier9, 0.0f, 1, null), expandableButtonTray2.getColors().m21771getBgColor0d7_KjU(), null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierThen2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue, 6, null).then(modifier10);
                    if (z6) {
                    }
                    if (z7) {
                    }
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierThen2, fM7995constructorimpl, fM7995constructorimpl2);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i13);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(373891859);
                        if (state.getPrefixContentState() == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (!state.getButtons().isEmpty()) {
                        }
                        modifier6 = modifier10;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                        modifier7 = modifier6;
                        z8 = z6;
                        z9 = z7;
                        modifier8 = modifier5;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier3 = modifier;
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        modifier3 = modifier;
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ExpandableButtons$lambda$14(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final float ExpandableButtons$lambda$21$lambda$20$lambda$17(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void ActionButtonComposable(final ExpandableButtonTrayState.ActionButton<T> button, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super T, Unit> onCustomButtonClick, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super GenericAction, Boolean> onIdlButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        boolean z;
        Modifier modifierAutoLogEvents$default;
        boolean z2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onCustomButtonClick, "onCustomButtonClick");
        Intrinsics.checkNotNullParameter(onIdlButtonClick, "onIdlButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(982143001);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(button) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCustomButtonClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIdlButtonClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(982143001, i3, -1, "com.robinhood.shared.crypto.expandableButtonTray.ActionButtonComposable (CryptoExpandableButtonTrayComposable.kt:150)");
                }
                if (!(button instanceof ExpandableButtonTrayState.ActionButton.CustomButton)) {
                    composerStartRestartGroup.startReplaceGroup(1705250018);
                    ExpandableButtonTrayState.ActionButton.CustomButton customButton = (ExpandableButtonTrayState.ActionButton.CustomButton) button;
                    ServerToBentoAssetMapper2 icon = customButton.getIcon();
                    BentoButtons.Icon.Size16 size16 = icon != null ? new BentoButtons.Icon.Size16(icon, null, 2, null) : null;
                    String string2 = StringResources6.getText(customButton.getLabel(), composerStartRestartGroup, StringResource.$stable).toString();
                    BentoButtons.Icon.Size16 size162 = size16;
                    boolean enabled = customButton.getEnabled();
                    boolean loading = customButton.getLoading();
                    BentoButtons.Type type2 = customButton.getType();
                    ColorDto textColorOverride = customButton.getTextColorOverride();
                    composerStartRestartGroup.startReplaceGroup(-1053360631);
                    Color composeColor = textColorOverride == null ? null : SduiColors2.toComposeColor(textColorOverride, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    ColorDto backgroundColorOverride = customButton.getBackgroundColorOverride();
                    composerStartRestartGroup.startReplaceGroup(-1053357687);
                    Color composeColor2 = backgroundColorOverride == null ? null : SduiColors2.toComposeColor(backgroundColorOverride, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1053351986);
                    UserInteractionEventDescriptor eventDescriptor = customButton.getEventDescriptor();
                    if (eventDescriptor != null) {
                        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), eventDescriptor);
                        z = true;
                        modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, userInteractionEventDescriptorUpdateWith, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        if (modifierAutoLogEvents$default == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z3 = (i3 & 14) != 4 ? z : false;
                        if ((i3 & 112) != 32) {
                            z = false;
                        }
                        z2 = z | z3;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoExpandableButtonTrayComposable.ActionButtonComposable$lambda$10$lambda$9(button, onCustomButtonClick);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier2;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierAutoLogEvents$default, size162, type2, enabled, loading, composeColor2, composeColor, null, null, false, null, composerStartRestartGroup, BentoButtons.Icon.Size16.$stable << 9, 0, 7680);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        z = true;
                    }
                    modifierAutoLogEvents$default = modifier2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 14) != 4) {
                    }
                    if ((i3 & 112) != 32) {
                    }
                    z2 = z | z3;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoExpandableButtonTrayComposable.ActionButtonComposable$lambda$10$lambda$9(button, onCustomButtonClick);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier2;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierAutoLogEvents$default, size162, type2, enabled, loading, composeColor2, composeColor, null, null, false, null, composerStartRestartGroup, BentoButtons.Icon.Size16.$stable << 9, 0, 7680);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    if (!(button instanceof ExpandableButtonTrayState.ActionButton.IdlButton)) {
                        if (!(button instanceof ExpandableButtonTrayState.ActionButton.SduiButton)) {
                            composer2.startReplaceGroup(-1053371743);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1706721960);
                        SduiButton2.SduiButton(((ExpandableButtonTrayState.ActionButton.SduiButton) button).getButton(), modifier3, composer2, (i3 >> 6) & 112, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1706232377);
                        composer2.startReplaceGroup(-1633490746);
                        boolean z4 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ActionButtonComposable$4$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(GenericAction it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return ((Boolean) onIdlButtonClick.invoke(button, it)).booleanValue();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-195236389, true, new C376745(button, modifier3), composer2, 54), composer2, 48);
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoExpandableButtonTrayComposable.ActionButtonComposable$lambda$12(button, onCustomButtonClick, onIdlButtonClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(button instanceof ExpandableButtonTrayState.ActionButton.CustomButton)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButtonComposable$lambda$10$lambda$9(ExpandableButtonTrayState.ActionButton actionButton, Function2 function2) {
        Object onClickAction = ((ExpandableButtonTrayState.ActionButton.CustomButton) actionButton).getOnClickAction();
        if (onClickAction != null) {
            function2.invoke(actionButton, onClickAction);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoExpandableButtonTrayComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ActionButtonComposable$5 */
    static final class C376745 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ExpandableButtonTrayState.ActionButton<T> $button;
        final /* synthetic */ Modifier $modifier;

        C376745(ExpandableButtonTrayState.ActionButton<T> actionButton, Modifier modifier) {
            this.$button = actionButton;
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
                ComposerKt.traceEventStart(-195236389, i, -1, "com.robinhood.shared.crypto.expandableButtonTray.ActionButtonComposable.<anonymous> (CryptoExpandableButtonTrayComposable.kt:177)");
            }
            ButtonDto button = ((ExpandableButtonTrayState.ActionButton.IdlButton) this.$button).getButton();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ActionButtonComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoExpandableButtonTrayComposable.C376745.invoke$lambda$1$lambda$0((ActionDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SduiButton2.SduiButton(button, (Function1) objRememberedValue, this.$modifier, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GenericAction invoke$lambda$1$lambda$0(ActionDto actionDto) {
            Intrinsics.checkNotNullParameter(actionDto, "actionDto");
            AnyMessage concrete = actionDto.getConcrete();
            if (concrete != null) {
                return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> void ExpandableButtons(final boolean z, final ExpandableButtonTrayState.ExpandAnimationType expandAnimationType, final ExpandableButtonTrayState.ExpandButton expandButton, final ColorDto colorDto, final ImmutableList<? extends ExpandableButtonTrayState.ActionButton<T>> immutableList, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super GenericAction, Boolean> function2, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super T, Unit> function22, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        ImmutableList<? extends ExpandableButtonTrayState.ActionButton<T>> immutableList2;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator<? extends ExpandableButtonTrayState.ActionButton<T>> it;
        final Modifier modifier3;
        Iterator<? extends ExpandableButtonTrayState.ActionButton<T>> it2;
        Object obj;
        SpringSpec springSpecSpring$default;
        int i5;
        float fM7995constructorimpl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1197323999);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(expandAnimationType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(expandButton) : composerStartRestartGroup.changedInstance(expandButton) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(colorDto == null ? -1 : colorDto.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                immutableList2 = immutableList;
                i3 |= composerStartRestartGroup.changed(immutableList2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                        }
                        i4 = i2 & 512;
                        if (i4 != 0) {
                            i3 |= 805306368;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                            }
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1197323999, i3, -1, "com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtons (CryptoExpandableButtonTrayComposable.kt:208)");
                            }
                            ExpandableButtonTrayStyle expandableButtonTray = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                            ButtonStyle button = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(button.getPrimary().m21717getMinHeightD9Ej5fM()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                objRememberedValue = snapshotStateMutableStateOf$default;
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            z2 = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(expandButton))) | ((234881024 & i3) != 67108864);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new CryptoExpandableButtonTrayComposable3(expandButton, function02, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(expandButton, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, StringResource.$stable | ((i3 >> 6) & 14));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            int i6 = i3;
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier4;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1873184804);
                            it = immutableList2.iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                ExpandableButtonTrayState.ActionButton<T> next = it.next();
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                ExpandableButtonTrayState.ActionButton<T> actionButton = next;
                                int i9 = WhenMappings.$EnumSwitchMapping$0[expandAnimationType.ordinal()];
                                if (i9 == 1) {
                                    it2 = it;
                                    obj = null;
                                    springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                } else {
                                    if (i9 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (z) {
                                        it2 = it;
                                        obj = null;
                                        springSpecSpring$default = AnimationSpecKt.spring$default(0.5f, 200.0f, null, 4, null);
                                    } else {
                                        it2 = it;
                                        obj = null;
                                        springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                }
                                if (z) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(-C2002Dp.m7995constructorimpl(ExpandableButtons$lambda$14(snapshotState) + expandableButtonTray.getSpacing().m21782getVerticalButtonSpacingD9Ej5fM())) * (immutableList2.size() - i7));
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                }
                                final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, springSpecSpring$default, null, null, composerStartRestartGroup, 0, 12);
                                composerStartRestartGroup.startReplaceGroup(-1873152016);
                                if (C2002Dp.m7997equalsimpl0(ExpandableButtons$lambda$21$lambda$20$lambda$17(snapshotState4M4812animateDpAsStateAjpBEmI), C2002Dp.m7995constructorimpl(i5))) {
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4M4812animateDpAsStateAjpBEmI);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return CryptoExpandableButtonTrayComposable.ExpandableButtons$lambda$21$lambda$20$lambda$19$lambda$18(snapshotState4M4812animateDpAsStateAjpBEmI, (GraphicsLayerScope) obj2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Composer composer3 = composerStartRestartGroup;
                                    ActionButtonComposable(actionButton, function22, function2, GraphicsLayerModifier6.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue3), composer3, ((i6 >> 15) & 112) | ((i6 >> 9) & 896), 0);
                                    composer2 = composer3;
                                }
                                composer2.endReplaceGroup();
                                it = it2;
                                composerStartRestartGroup = composer2;
                                i7 = i8;
                            }
                            Composer composer4 = composerStartRestartGroup;
                            composer4.endReplaceGroup();
                            composerStartRestartGroup = composer4;
                            Crossfade.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambda3.rememberComposableLambda(1978748516, true, new CryptoExpandableButtonTrayComposable4(expandableButtonTray, colorDto, function02, expandButton, density, function0, snapshotState), composer4, 54), composerStartRestartGroup, (i6 & 14) | 24960, 10);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return CryptoExpandableButtonTrayComposable.ExpandableButtons$lambda$22(z, expandAnimationType, expandButton, colorDto, immutableList, function2, function22, function0, function02, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    if ((i2 & 256) != 0) {
                    }
                    i4 = i2 & 512;
                    if (i4 != 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ExpandableButtonTrayStyle expandableButtonTray2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                        ButtonStyle button2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((i3 & 896) != 256) {
                            z2 = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(expandButton))) | ((234881024 & i3) != 67108864);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue2 = new CryptoExpandableButtonTrayComposable3(expandButton, function02, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(expandButton, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, StringResource.$stable | ((i3 >> 6) & 14));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                int i62 = i3;
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Modifier modifier52 = modifier4;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-1873184804);
                                    it = immutableList2.iterator();
                                    int i72 = 0;
                                    while (it.hasNext()) {
                                    }
                                    Composer composer42 = composerStartRestartGroup;
                                    composer42.endReplaceGroup();
                                    composerStartRestartGroup = composer42;
                                    Crossfade.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambda3.rememberComposableLambda(1978748516, true, new CryptoExpandableButtonTrayComposable4(expandableButtonTray2, colorDto, function02, expandButton, density2, function0, snapshotState2), composer42, 54), composerStartRestartGroup, (i62 & 14) | 24960, 10);
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i4 = i2 & 512;
                if (i4 != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i4 = i2 & 512;
            if (i4 != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        immutableList2 = immutableList;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i4 = i2 & 512;
        if (i4 != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandableButtons$lambda$15(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableButtons$lambda$21$lambda$20$lambda$19$lambda$18(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(graphicsLayer.mo5016toPx0680j_4(ExpandableButtons$lambda$21$lambda$20$lambda$17(snapshotState4)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PrefixContent(final ExpandableButtonTrayState.PrefixContentState prefixContentState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-524129323);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(prefixContentState) ? 4 : 2) | i;
        } else {
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
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-524129323, i3, -1, "com.robinhood.shared.crypto.expandableButtonTray.PrefixContent (CryptoExpandableButtonTrayComposable.kt:307)");
                    }
                    ExpandableButtonTrayStyle expandableButtonTray = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                    if (prefixContentState instanceof ExpandableButtonTrayState.PrefixContentState.TitleState) {
                        modifier3 = modifier5;
                        if (!(prefixContentState instanceof ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector)) {
                            composerStartRestartGroup.startReplaceGroup(-1177095666);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1177072267);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier3, (InteractionSource3) objRememberedValue, null, false, null, null, function02, 28, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                        ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector bottomSheetSelector = (ExpandableButtonTrayState.PrefixContentState.BottomSheetSelector) prefixContentState;
                        BentoIcon2.m20644BentoIconFU0evQE(bottomSheetSelector.getStartIcon(), null, expandableButtonTray.getColors().m21773getValueTextColor0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(StringResources6.getTextAsString(bottomSheetSelector.getText(), composerStartRestartGroup, StringResource.$stable), new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), null, expandableButtonTray.getColors().m21772getLabelTextColor0d7_KjU(), null, null, bold, null, null, 0, false, 0, 0, expandableButtonTray.getTypography().getValueTextStyle(), false, C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, false, 221104, null), null, null, null, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 14);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1177094038);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        ExpandableButtonTrayState.PrefixContentState.TitleState titleState = (ExpandableButtonTrayState.PrefixContentState.TitleState) prefixContentState;
                        StringResource label = titleState.getLabel();
                        int i6 = StringResource.$stable;
                        modifier3 = modifier5;
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(label, composerStartRestartGroup, i6).toString(), null, Color.m6701boximpl(expandableButtonTray.getColors().m21772getLabelTextColor0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, expandableButtonTray.getTypography().getLabelTextStyle(), composerStartRestartGroup, 0, 0, 8186);
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(titleState.getValue(), composerStartRestartGroup, i6).toString(), null, Color.m6701boximpl(expandableButtonTray.getColors().m21773getValueTextColor0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, expandableButtonTray.getTypography().getValueTextStyle(), composerStartRestartGroup, 24576, 0, 8170);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoExpandableButtonTrayComposable.PrefixContent$lambda$26(prefixContentState, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                ExpandableButtonTrayStyle expandableButtonTray2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getExpandableButtonTray(composerStartRestartGroup, 0);
                if (prefixContentState instanceof ExpandableButtonTrayState.PrefixContentState.TitleState) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void ExpandableButtonTrayPreview(final PreviewState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1909635264);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1909635264, i2, -1, "com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayPreview (CryptoExpandableButtonTrayComposable.kt:575)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-471432, true, new C376751(state), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoExpandableButtonTrayComposable.ExpandableButtonTrayPreview$lambda$27(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
