package com.robinhood.android.retirement.lib;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UninvestedSection.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"UninvestedSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/retirement/lib/UninvestedSectionState;", "callbacks", "Lcom/robinhood/android/retirement/lib/UninvestedSectionCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/lib/UninvestedSectionState;Lcom/robinhood/android/retirement/lib/UninvestedSectionCallbacks;Landroidx/compose/runtime/Composer;II)V", "getStylizedPog", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$PictogramPog;", "", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$ModalCta;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "displayStyle", "Lcom/robinhood/android/retirement/lib/UninvestedDisplayStyle;", "(Ljava/util/List;ILcom/robinhood/android/retirement/lib/UninvestedDisplayStyle;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$PictogramPog;", "UninvestedContent", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;", "onDeeplinkClicked", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;Lcom/robinhood/android/retirement/lib/UninvestedDisplayStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.lib.UninvestedSectionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UninvestedSection3 {

    /* compiled from: UninvestedSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.lib.UninvestedSectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UninvestedSection.values().length];
            try {
                iArr[UninvestedSection.BottomSheet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UninvestedSection.Fullscreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UninvestedContent$lambda$8(Modifier modifier, RetirementUninvestedViewModel.Modal modal, UninvestedSection uninvestedSection, Function1 function1, int i, int i2, Composer composer, int i3) {
        UninvestedContent(modifier, modal, uninvestedSection, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UninvestedSection$lambda$3(Modifier modifier, UninvestedSectionState uninvestedSectionState, UninvestedSection2 uninvestedSection2, int i, int i2, Composer composer, int i3) {
        UninvestedSection(modifier, uninvestedSectionState, uninvestedSection2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UninvestedSection(Modifier modifier, final UninvestedSectionState state, final UninvestedSection2 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1164507174);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1164507174, i3, -1, "com.robinhood.android.retirement.lib.UninvestedSection (UninvestedSection.kt:71)");
            }
            final RetirementUninvestedViewModel.MobileContent content = state.getContent();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImmutableList immutableList = extensions2.toImmutableList(content.getComponents());
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            int i6 = i3;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier5 = modifier4;
            SduiColumns.SduiColumn(immutableList, GenericAction.class, companion3, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 196608, 0);
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(content.getMarkdown(), SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 48, 0, 16316);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(content) | ((i6 & 896) == 256 || ((i6 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.lib.UninvestedSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UninvestedSection3.UninvestedSection$lambda$2$lambda$1$lambda$0(callbacks, content, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, content.getCta().getTitle(), ModifiersKt.autoLogEvents$default(SizeKt.m5176widthInVpY3zN4$default(companion3, C2002Dp.m7995constructorimpl(192), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, content.getCta().getLoggingIdentifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.UninvestedSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UninvestedSection3.UninvestedSection$lambda$3(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UninvestedSection$lambda$2$lambda$1$lambda$0(UninvestedSection2 uninvestedSection2, RetirementUninvestedViewModel.MobileContent mobileContent, UninvestedSectionState uninvestedSectionState) {
        uninvestedSection2.onUninvestedCtaClicked(mobileContent.getCta(), uninvestedSectionState.getLoggingInfo());
        return Unit.INSTANCE;
    }

    private static final BentoBaseRowState.Start.PictogramPog getStylizedPog(List<RetirementUninvestedViewModel.ModalCta> list, int i, UninvestedSection uninvestedSection, Composer composer, int i2) {
        BentoBaseRowState.Start.PictogramPog pictogramPog;
        long prime;
        composer.startReplaceGroup(2133460721);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2133460721, i2, -1, "com.robinhood.android.retirement.lib.getStylizedPog (UninvestedSection.kt:129)");
        }
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(list.get(i).getPictogram().getServerValue());
        if (serverToBentoAssetMapper3FromServerValue == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        if (list.size() == 2 && uninvestedSection == UninvestedSection.Fullscreen) {
            if (i == 0) {
                composer.startReplaceGroup(1556369077);
                prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getXray();
            } else {
                composer.startReplaceGroup(1556369974);
                prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime();
            }
            composer.endReplaceGroup();
            pictogramPog = new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper3FromServerValue, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getJet()), Color.m6701boximpl(prime), null);
        } else {
            pictogramPog = new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper3FromServerValue, null, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pictogramPog;
    }

    public static final void UninvestedContent(Modifier modifier, final RetirementUninvestedViewModel.Modal state, final UninvestedSection displayStyle, final Function1<? super String, Unit> onDeeplinkClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Alignment.Horizontal centerHorizontally;
        int i4;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(displayStyle, "displayStyle");
        Intrinsics.checkNotNullParameter(onDeeplinkClicked, "onDeeplinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(979523195);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(displayStyle.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeeplinkClicked) ? 2048 : 1024;
        }
        int i6 = i3;
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(979523195, i6, -1, "com.robinhood.android.retirement.lib.UninvestedContent (UninvestedSection.kt:150)");
            }
            int i7 = WhenMappings.$EnumSwitchMapping$0[displayStyle.ordinal()];
            if (i7 == 1) {
                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                centerHorizontally = Alignment.INSTANCE.getStart();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(215136917);
            if (displayStyle == UninvestedSection.BottomSheet) {
                i4 = 0;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            } else {
                i4 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Modifier modifier5 = modifier4;
            BentoText2.m20747BentoText38GnDrw(state.getTitle(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, i4), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(215151656);
            int i9 = 0;
            for (Object obj : state.getCtas()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final RetirementUninvestedViewModel.ModalCta modalCta = (RetirementUninvestedViewModel.ModalCta) obj;
                String title = modalCta.getTitle();
                String subtitle = modalCta.getSubtitle();
                BentoBaseRowState.Start.PictogramPog stylizedPog = getStylizedPog(state.getCtas(), i9, displayStyle, composerStartRestartGroup, i6 & 896);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, modalCta.getLoggingIdentifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(modalCta) | ((i6 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.lib.UninvestedSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UninvestedSection3.UninvestedContent$lambda$7$lambda$6$lambda$5$lambda$4(onDeeplinkClicked, modalCta);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, stylizedPog, title, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, BentoBaseRowState.Start.PictogramPog.$stable << 3, 0, 2032);
                composerStartRestartGroup = composer2;
                i9 = i10;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.UninvestedSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UninvestedSection3.UninvestedContent$lambda$8(modifier3, state, displayStyle, onDeeplinkClicked, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UninvestedContent$lambda$7$lambda$6$lambda$5$lambda$4(Function1 function1, RetirementUninvestedViewModel.ModalCta modalCta) {
        function1.invoke(modalCta.getDeeplink());
        return Unit.INSTANCE;
    }
}
