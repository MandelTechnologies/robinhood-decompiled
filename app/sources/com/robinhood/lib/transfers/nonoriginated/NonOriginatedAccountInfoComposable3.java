package com.robinhood.lib.transfers.nonoriginated;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.DataRowDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NonOriginatedAccountInfoComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aP\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"NonOriginatedAccountInfoComposable", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "state", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;", "duxo", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Sections", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState$Section;", "onExpandOrCollapseClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NonOriginatedAccountInfoComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NonOriginatedAccountInfoComposable$lambda$5(Screen screen, NonOriginatedAccountInfoState nonOriginatedAccountInfoState, NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NonOriginatedAccountInfoComposable(screen, nonOriginatedAccountInfoState, nonOriginatedAccountInfoDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sections$lambda$13(Screen screen, ImmutableList immutableList, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        Sections(screen, immutableList, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NonOriginatedAccountInfoComposable(final Screen eventScreen, final NonOriginatedAccountInfoState state, final NonOriginatedAccountInfoDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        String disclosureMarkdown;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        Modifier.Companion companion;
        Composer composer2;
        Modifier modifier3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-39292673);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2) | i;
        } else {
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
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-39292673, i3, -1, "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposable (NonOriginatedAccountInfoComposable.kt:73)");
                }
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
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
                String title = state.getTitle();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme2.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                String subtitleMarkdown = state.getSubtitleMarkdown();
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextM();
                int i8 = BentoMarkdownText.$stable;
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, 0, jM21425getFg0d7_KjU, 0L, false, composerStartRestartGroup, i8 << 15, 26);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 2, null);
                int i9 = MarkdownStyle.$stable;
                BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i9 << 6, 24);
                ImmutableList<NonOriginatedAccountInfoState.Section> sections = state.getSections();
                Modifier modifierWeight$default = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new NonOriginatedAccountInfoComposable4(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Sections(eventScreen, sections, modifierWeight$default, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, i3 & 14, 0);
                disclosureMarkdown = state.getDisclosureMarkdown();
                composerStartRestartGroup.startReplaceGroup(1167374823);
                if (disclosureMarkdown != null) {
                    composer2 = composerStartRestartGroup;
                    i4 = 5004770;
                    bentoTheme = bentoTheme2;
                    i5 = i7;
                    companion = companion4;
                } else {
                    long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                    i4 = 5004770;
                    bentoTheme = bentoTheme2;
                    i5 = i7;
                    companion = companion4;
                    BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), companion2.getCenterHorizontally()), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, 0L, false, composerStartRestartGroup, i8 << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i9 << 6, 24);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                modifier3 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), new UserInteractionEventDescriptor(null, eventScreen, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0);
                composer2.startReplaceGroup(i4);
                zChangedInstance2 = composer2.changedInstance(duxo);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NonOriginatedAccountInfoComposable3.NonOriginatedAccountInfoComposable$lambda$4$lambda$3$lambda$2(duxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Composer composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                composerStartRestartGroup = composer3;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NonOriginatedAccountInfoComposable3.NonOriginatedAccountInfoComposable$lambda$5(eventScreen, state, duxo, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String title2 = state.getTitle();
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme22.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m5145paddingqDBjuR0(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                String subtitleMarkdown2 = state.getSubtitleMarkdown();
                BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                long jM21425getFg0d7_KjU2 = bentoTheme22.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                TextStyle textM2 = bentoTheme22.getTypography(composerStartRestartGroup, i72).getTextM();
                int i82 = BentoMarkdownText.$stable;
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText2.m21100withTextStylesYhh7B2I(textM2, 0, jM21425getFg0d7_KjU2, 0L, false, composerStartRestartGroup, i82 << 15, 26);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 2, null);
                int i92 = MarkdownStyle.$stable;
                BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown2, modifierM5146paddingqDBjuR0$default2, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i92 << 6, 24);
                ImmutableList<NonOriginatedAccountInfoState.Section> sections2 = state.getSections();
                Modifier modifierWeight$default2 = Column5.weight$default(column62, companion42, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new NonOriginatedAccountInfoComposable4(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Sections(eventScreen, sections2, modifierWeight$default2, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, i3 & 14, 0);
                    disclosureMarkdown = state.getDisclosureMarkdown();
                    composerStartRestartGroup.startReplaceGroup(1167374823);
                    if (disclosureMarkdown != null) {
                    }
                    composer2.endReplaceGroup();
                    modifier3 = modifier4;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), new UserInteractionEventDescriptor(null, eventScreen, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0);
                    composer2.startReplaceGroup(i4);
                    zChangedInstance2 = composer2.changedInstance(duxo);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NonOriginatedAccountInfoComposable3.NonOriginatedAccountInfoComposable$lambda$4$lambda$3$lambda$2(duxo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        Composer composer32 = composer2;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composer32, 0, 0, 8184);
                        composerStartRestartGroup = composer32;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NonOriginatedAccountInfoComposable$lambda$4$lambda$3$lambda$2(NonOriginatedAccountInfoDuxo nonOriginatedAccountInfoDuxo) {
        nonOriginatedAccountInfoDuxo.onDoneButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Sections(final Screen screen, final ImmutableList<NonOriginatedAccountInfoState.Section> immutableList, Modifier modifier, final Function1<? super Integer, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Function1<? super Integer, Unit> function12;
        int i4;
        final ClipboardUtil clipboardUtil;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-994542376);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i4 = i3;
                if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-994542376, i4, -1, "com.robinhood.lib.transfers.nonoriginated.Sections (NonOriginatedAccountInfoComposable.kt:153)");
                    }
                    clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i4 & 7168) == 2048) | composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(clipboardUtil);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        final Function1<? super Integer, Unit> function13 = function12;
                        Function1 function14 = new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NonOriginatedAccountInfoComposable3.Sections$lambda$12$lambda$11(immutableList, screen, coroutineScope, clipboardUtil, function13, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function14);
                        objRememberedValue2 = function14;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    LazyDslKt.LazyColumn(modifier5, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i4 >> 6) & 14, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NonOriginatedAccountInfoComposable3.Sections$lambda$13(screen, immutableList, modifier3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            i4 = i3;
            if ((i4 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i4 & 7168) == 2048) | composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(clipboardUtil);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    final Function1 function132 = function12;
                    Function1 function142 = new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NonOriginatedAccountInfoComposable3.Sections$lambda$12$lambda$11(immutableList, screen, coroutineScope, clipboardUtil, function132, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function142);
                    objRememberedValue2 = function142;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    LazyDslKt.LazyColumn(modifier52, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i4 >> 6) & 14, 510);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 8) != 0) {
        }
        function12 = function1;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sections$lambda$12$lambda$11(ImmutableList immutableList, final Screen screen, final CoroutineScope coroutineScope, final ClipboardUtil clipboardUtil, Function1 function1, LazyListScope lazyListScope) {
        LazyListScope lazyListScope2;
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        int i = 0;
        for (Object obj : immutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            NonOriginatedAccountInfoState.Section section = (NonOriginatedAccountInfoState.Section) obj;
            if (i > 0) {
                LazyListScope.item$default(LazyColumn, null, null, NonOriginatedAccountInfoComposable.INSTANCE.m2600x3e226fac(), 3, null);
            }
            final String title = section.getTitle();
            if (title != null) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1605253533, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1605253533, i3, -1, "com.robinhood.lib.transfers.nonoriginated.Sections.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NonOriginatedAccountInfoComposable.kt:165)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        TextStyle textL = bentoTheme.getTypography(composer, i4).getTextL();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 2, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, textL, composer, 24576, 0, 8172);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            final String subtitleMarkdown = section.getSubtitleMarkdown();
            if (subtitleMarkdown != null) {
                ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(-833019238, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-833019238, i3, -1, "com.robinhood.lib.transfers.nonoriginated.Sections.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NonOriginatedAccountInfoComposable.kt:179)");
                        }
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i4).getTextM(), 0, bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26);
                        BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 10, null), markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                lazyListScope2 = lazyListScope;
                LazyListScope.item$default(lazyListScope2, null, null, composableLambdaComposableLambdaInstance, 3, null);
            } else {
                lazyListScope2 = lazyListScope;
            }
            final List<DataRowDto> visibleRows = section.getVisibleRows();
            final C33406xe47179e0 c33406xe47179e0 = new Function1() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$lambda$12$lambda$11$lambda$10$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(DataRowDto dataRowDto) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((DataRowDto) obj2);
                }
            };
            lazyListScope2.items(visibleRows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$lambda$12$lambda$11$lambda$10$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i3) {
                    return c33406xe47179e0.invoke(visibleRows.get(i3));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$lambda$12$lambda$11$lambda$10$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                    int i5;
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i5 |= composer.changed(i3) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final DataRowDto dataRowDto = (DataRowDto) visibleRows.get(i3);
                    composer.startReplaceGroup(2004547013);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.COPY, null, new Component(Component.ComponentType.ROW, dataRowDto.getLogging_identifier(), null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
                    String title2 = dataRowDto.getTitle();
                    String body = dataRowDto.getBody();
                    BentoSettingsRows.EndElement.Icon icon = new BentoSettingsRows.EndElement.Icon(ServerToBentoAssetMapper2.COPY_16, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), null);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(clipboardUtil) | composer.changedInstance(dataRowDto);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final ClipboardUtil clipboardUtil2 = clipboardUtil;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$3$1$1

                            /* compiled from: NonOriginatedAccountInfoComposable.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$3$1$1$1", m3645f = "NonOriginatedAccountInfoComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$Sections$1$1$1$3$1$1$1 */
                            static final class C334111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ClipboardUtil $clipboardUtil;
                                final /* synthetic */ DataRowDto $row;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C334111(ClipboardUtil clipboardUtil, DataRowDto dataRowDto, Continuation<? super C334111> continuation) {
                                    super(2, continuation);
                                    this.$clipboardUtil = clipboardUtil;
                                    this.$row = dataRowDto;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C334111(this.$clipboardUtil, this.$row, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C334111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ClipboardUtil clipboardUtil = this.$clipboardUtil;
                                        String body = this.$row.getBody();
                                        this.label = 1;
                                        if (clipboardUtil.copyToClipboardWithHapticFeedback(body, true, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C334111(clipboardUtil2, dataRowDto, null), 3, null);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSettingsRowKt.BentoSettingsRow(modifierAutoLogEvents$default, title2, body, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon, false, false, (Function0<Unit>) objRememberedValue, composer, (BentoSettingsRows.EndElement.Icon.$stable << 12) | 1572864, 40);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (section.isCollapsable()) {
                LazyListScope.item$default(lazyListScope2, null, null, ComposableLambda3.composableLambdaInstance(-1321883819, true, new NonOriginatedAccountInfoComposable8(section, function1, i)), 3, null);
            }
            LazyColumn = lazyListScope;
            i = i2;
        }
        return Unit.INSTANCE;
    }
}
