package com.robinhood.android.pathfinder.corepages.freetext;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportTextDescriptionComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001ao\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001f\u001a!\u0010 \u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010!\u001a=\u0010\"\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u0010%\"\u000e\u0010&\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"SupportTextDescriptionComposable", "", "state", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;", "onClickContinue", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Subheading", "subheading", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "Input", "inquiryId", "Ljava/util/UUID;", "text", "placeholder", "copies", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "maxCharacterLimit", "", "warningCharacterLimit", "showMinLengthError", "", "enabled", "modifier", "Landroidx/compose/ui/Modifier;", "onTextChange", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;IIZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Footer", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", CreateTransferV2Composable3.ContinueButtonTag, "loading", "Lkotlin/Function0;", "(Ljava/util/UUID;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", SupportTextDescriptionComposable.FreeTextTestTagHeading, SupportTextDescriptionComposable.FreeTextTestTagSubheading, SupportTextDescriptionComposable.FreeTextTestTagInput, SupportTextDescriptionComposable.FreeTextTestTagFooter, SupportTextDescriptionComposable.FreeTextTestTagContinueButton, "feature-pathfinder-core-pages_externalDebug", "input", "isInputLengthAboveLimit"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SupportTextDescriptionComposable {
    public static final String FreeTextTestTagContinueButton = "FreeTextTestTagContinueButton";
    public static final String FreeTextTestTagFooter = "FreeTextTestTagFooter";
    public static final String FreeTextTestTagHeading = "FreeTextTestTagHeading";
    public static final String FreeTextTestTagInput = "FreeTextTestTagInput";
    public static final String FreeTextTestTagSubheading = "FreeTextTestTagSubheading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$22(UUID uuid, String str, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        ContinueButton(uuid, str, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$20(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footer(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$21(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footer(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$16(String str, int i, Composer composer, int i2) {
        Heading(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input$lambda$19(UUID uuid, String str, String str2, CxVoiceContent cxVoiceContent, int i, int i2, boolean z, boolean z2, Modifier modifier, Function1 function1, int i3, int i4, Composer composer, int i5) {
        Input(uuid, str, str2, cxVoiceContent, i, i2, z, z2, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$17(RichText richText, int i, Composer composer, int i2) {
        Subheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTextDescriptionComposable$lambda$15(SupportTextDescriptionViewState supportTextDescriptionViewState, Function1 function1, int i, Composer composer, int i2) {
        SupportTextDescriptionComposable(supportTextDescriptionViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SupportTextDescriptionComposable(final SupportTextDescriptionViewState state, final Function1<? super String, Unit> onClickContinue, Composer composer, final int i) {
        int i2;
        String str;
        boolean zChangedInstance;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1353542182);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1353542182, i3, -1, "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposable (SupportTextDescriptionComposable.kt:35)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$1$lambda$0(state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$8$lambda$7(state, snapshotState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Heading(state.getTitle(), composerStartRestartGroup, 0);
            Subheading(state.getSubtitle(), composerStartRestartGroup, 0);
            Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 1, null), 1.0f, false, 2, null);
            UUID inquiryId = state.getInquiryId();
            String strSupportTextDescriptionComposable$lambda$2 = SupportTextDescriptionComposable$lambda$2(snapshotState);
            String placeholderText = state.getPlaceholderText();
            int formLengthLimit = state.getFormLengthLimit();
            int warningLengthLimit = state.getWarningLengthLimit();
            boolean zSupportTextDescriptionComposable$lambda$5 = SupportTextDescriptionComposable$lambda$5(snapshotState2);
            CxVoiceContent copies = state.getCopies();
            boolean z = !state.getShouldShowLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                str = strSupportTextDescriptionComposable$lambda$2;
            } else {
                str = strSupportTextDescriptionComposable$lambda$2;
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Input(inquiryId, str, placeholderText, copies, formLengthLimit, warningLengthLimit, zSupportTextDescriptionComposable$lambda$5, z, modifierWeight$default, (Function1) objRememberedValue5, composerStartRestartGroup, 0, 0);
                Footer(state.getFooterText(), null, composerStartRestartGroup, 0, 2);
                UUID inquiryId2 = state.getInquiryId();
                CxVoiceContent copies2 = state.getCopies();
                String textDescriptionButtonContinue = copies2 == null ? copies2.getTextDescriptionButtonContinue() : null;
                boolean z2 = !SupportTextDescriptionComposable$lambda$9(snapshotState4);
                boolean shouldShowLoading = state.getShouldShowLoading();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(snapshotState) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$14$lambda$13$lambda$12(state, onClickContinue, snapshotState, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ContinueButton(inquiryId2, textDescriptionButtonContinue, z2, shouldShowLoading, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$14$lambda$11$lambda$10(snapshotState, (String) obj);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            composerStartRestartGroup.endReplaceGroup();
            Input(inquiryId, str, placeholderText, copies, formLengthLimit, warningLengthLimit, zSupportTextDescriptionComposable$lambda$5, z, modifierWeight$default, (Function1) objRememberedValue5, composerStartRestartGroup, 0, 0);
            Footer(state.getFooterText(), null, composerStartRestartGroup, 0, 2);
            UUID inquiryId22 = state.getInquiryId();
            CxVoiceContent copies22 = state.getCopies();
            if (copies22 == null) {
            }
            boolean z22 = !SupportTextDescriptionComposable$lambda$9(snapshotState4);
            boolean shouldShowLoading2 = state.getShouldShowLoading();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(snapshotState) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$14$lambda$13$lambda$12(state, onClickContinue, snapshotState, snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                ContinueButton(inquiryId22, textDescriptionButtonContinue, z22, shouldShowLoading2, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportTextDescriptionComposable.SupportTextDescriptionComposable$lambda$15(state, onClickContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SupportTextDescriptionComposable$lambda$1$lambda$0(SupportTextDescriptionViewState supportTextDescriptionViewState) {
        return SnapshotState3.mutableStateOf$default(supportTextDescriptionViewState.getCachedDescription(), null, 2, null);
    }

    private static final void SupportTextDescriptionComposable$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SupportTextDescriptionComposable$lambda$8$lambda$7(SupportTextDescriptionViewState supportTextDescriptionViewState, SnapshotState snapshotState) {
        return SupportTextDescriptionComposable$lambda$2(snapshotState).length() > supportTextDescriptionViewState.getFormLengthLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTextDescriptionComposable$lambda$14$lambda$11$lambda$10(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportTextDescriptionComposable$lambda$14$lambda$13$lambda$12(SupportTextDescriptionViewState supportTextDescriptionViewState, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
        Integer formLengthMinimum = supportTextDescriptionViewState.getFormLengthMinimum();
        if (formLengthMinimum != null && formLengthMinimum.intValue() > SupportTextDescriptionComposable$lambda$2(snapshotState).length()) {
            SupportTextDescriptionComposable$lambda$6(snapshotState2, true);
        } else {
            SupportTextDescriptionComposable$lambda$6(snapshotState2, false);
            function1.invoke(SupportTextDescriptionComposable$lambda$2(snapshotState));
        }
        return Unit.INSTANCE;
    }

    private static final String SupportTextDescriptionComposable$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SupportTextDescriptionComposable$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean SupportTextDescriptionComposable$lambda$9(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    public static final void Heading(final String heading, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(heading, "heading");
        Composer composerStartRestartGroup = composer.startRestartGroup(200234623);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(heading) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(200234623, i2, -1, "com.robinhood.android.pathfinder.corepages.freetext.Heading (SupportTextDescriptionComposable.kt:96)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, FreeTextTestTagHeading), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(heading, PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportTextDescriptionComposable.Heading$lambda$16(heading, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Subheading(final RichText subheading, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Composer composerStartRestartGroup = composer.startRestartGroup(1641177787);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(subheading) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1641177787, i2, -1, "com.robinhood.android.pathfinder.corepages.freetext.Subheading (SupportTextDescriptionComposable.kt:110)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, FreeTextTestTagSubheading), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(subheading, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportTextDescriptionComposable.Subheading$lambda$17(subheading, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Input(final UUID uuid, final String str, final String str2, final CxVoiceContent cxVoiceContent, final int i, final int i2, final boolean z, final boolean z2, Modifier modifier, final Function1<? super String, Unit> function1, Composer composer, final int i3, final int i4) {
        UUID uuid2;
        int i5;
        String str3;
        CxVoiceContent cxVoiceContent2;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        Modifier modifier2;
        Function1<? super String, Unit> function12;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Composer composer2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2083295605);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            uuid2 = uuid;
        } else {
            uuid2 = uuid;
            if ((i3 & 6) == 0) {
                i5 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
            str3 = str;
        } else {
            str3 = str;
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    cxVoiceContent2 = cxVoiceContent;
                    i5 |= composerStartRestartGroup.changedInstance(cxVoiceContent2) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        i6 = i;
                        i5 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                    }
                    if ((i4 & 32) == 0) {
                        i5 |= 196608;
                    } else {
                        if ((i3 & 196608) == 0) {
                            i7 = i2;
                            i5 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                        } else {
                            if ((i3 & 1572864) == 0) {
                                z3 = z;
                                i5 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                            if ((i4 & 128) == 0) {
                                i5 |= 12582912;
                            } else {
                                if ((i3 & 12582912) == 0) {
                                    z4 = z2;
                                    i5 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                i8 = i4 & 256;
                                if (i8 != 0) {
                                    i5 |= 100663296;
                                } else {
                                    if ((100663296 & i3) == 0) {
                                        modifier2 = modifier;
                                        i5 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                                    }
                                    if ((i4 & 512) != 0) {
                                        if ((i3 & 805306368) == 0) {
                                            function12 = function1;
                                            i5 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                                        }
                                        if ((i5 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                            if (i8 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2083295605, i5, -1, "com.robinhood.android.pathfinder.corepages.freetext.Input (SupportTextDescriptionComposable.kt:133)");
                                            }
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            int i9 = i5;
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
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
                                            composer2 = composerStartRestartGroup;
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            FreeTextDescriptionInput.FreeTextDescriptionInput(uuid2, str3, str2, cxVoiceContent2, i6, i7, z3, z4, function12, composer2, (i9 & 33554430) | ((i9 >> 3) & 234881024));
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            composer2 = composerStartRestartGroup;
                                        }
                                        final Modifier modifier3 = modifier2;
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return SupportTextDescriptionComposable.Input$lambda$19(uuid, str, str2, cxVoiceContent, i, i2, z, z2, modifier3, function1, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i5 |= 805306368;
                                    function12 = function1;
                                    if ((i5 & 306783379) != 306783378) {
                                        if (i8 != 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        int i92 = i5;
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        composer2 = composerStartRestartGroup;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting()) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            FreeTextDescriptionInput.FreeTextDescriptionInput(uuid2, str3, str2, cxVoiceContent2, i6, i7, z3, z4, function12, composer2, (i92 & 33554430) | ((i92 >> 3) & 234881024));
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                    final Modifier modifier32 = modifier2;
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                modifier2 = modifier;
                                if ((i4 & 512) != 0) {
                                }
                                function12 = function1;
                                if ((i5 & 306783379) != 306783378) {
                                }
                                final Modifier modifier322 = modifier2;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            z4 = z2;
                            i8 = i4 & 256;
                            if (i8 != 0) {
                            }
                            modifier2 = modifier;
                            if ((i4 & 512) != 0) {
                            }
                            function12 = function1;
                            if ((i5 & 306783379) != 306783378) {
                            }
                            final Modifier modifier3222 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z3 = z;
                        if ((i4 & 128) == 0) {
                        }
                        z4 = z2;
                        i8 = i4 & 256;
                        if (i8 != 0) {
                        }
                        modifier2 = modifier;
                        if ((i4 & 512) != 0) {
                        }
                        function12 = function1;
                        if ((i5 & 306783379) != 306783378) {
                        }
                        final Modifier modifier32222 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i7 = i2;
                    if ((i4 & 64) != 0) {
                    }
                    z3 = z;
                    if ((i4 & 128) == 0) {
                    }
                    z4 = z2;
                    i8 = i4 & 256;
                    if (i8 != 0) {
                    }
                    modifier2 = modifier;
                    if ((i4 & 512) != 0) {
                    }
                    function12 = function1;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    final Modifier modifier322222 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i6 = i;
                if ((i4 & 32) == 0) {
                }
                i7 = i2;
                if ((i4 & 64) != 0) {
                }
                z3 = z;
                if ((i4 & 128) == 0) {
                }
                z4 = z2;
                i8 = i4 & 256;
                if (i8 != 0) {
                }
                modifier2 = modifier;
                if ((i4 & 512) != 0) {
                }
                function12 = function1;
                if ((i5 & 306783379) != 306783378) {
                }
                final Modifier modifier3222222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            cxVoiceContent2 = cxVoiceContent;
            if ((i4 & 16) != 0) {
            }
            i6 = i;
            if ((i4 & 32) == 0) {
            }
            i7 = i2;
            if ((i4 & 64) != 0) {
            }
            z3 = z;
            if ((i4 & 128) == 0) {
            }
            z4 = z2;
            i8 = i4 & 256;
            if (i8 != 0) {
            }
            modifier2 = modifier;
            if ((i4 & 512) != 0) {
            }
            function12 = function1;
            if ((i5 & 306783379) != 306783378) {
            }
            final Modifier modifier32222222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        cxVoiceContent2 = cxVoiceContent;
        if ((i4 & 16) != 0) {
        }
        i6 = i;
        if ((i4 & 32) == 0) {
        }
        i7 = i2;
        if ((i4 & 64) != 0) {
        }
        z3 = z;
        if ((i4 & 128) == 0) {
        }
        z4 = z2;
        i8 = i4 & 256;
        if (i8 != 0) {
        }
        modifier2 = modifier;
        if ((i4 & 512) != 0) {
        }
        function12 = function1;
        if ((i5 & 306783379) != 306783378) {
        }
        final Modifier modifier322222222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Footer(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1908503443);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1908503443, i3, -1, "com.robinhood.android.pathfinder.corepages.freetext.Footer (SupportTextDescriptionComposable.kt:153)");
                }
                if (str != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SupportTextDescriptionComposable.Footer$lambda$20(str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifierTestTag = TestTag3.testTag(modifier3, FreeTextTestTagFooter);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, i3 & 14, 0, 8124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SupportTextDescriptionComposable.Footer$lambda$21(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (str != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ContinueButton(UUID uuid, final String str, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        UUID uuid2;
        int i2;
        Function0<Unit> function02;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1106122049);
        if ((i & 6) == 0) {
            uuid2 = uuid;
            i2 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i;
        } else {
            uuid2 = uuid;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106122049, i2, -1, "com.robinhood.android.pathfinder.corepages.freetext.ContinueButton (SupportTextDescriptionComposable.kt:173)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, FreeTextTestTagContinueButton);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
            String string2 = uuid2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            String str2 = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifierTestTag, new UserInteractionEventDescriptor(null, null, action, new Context(i3, i4, i5, null, null, null, null, null, i6, null, str2, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), null, null, 51, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 5, null);
            composerStartRestartGroup.startReplaceGroup(-2126339716);
            String strStringResource = str == null ? StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0) : str;
            composerStartRestartGroup.endReplaceGroup();
            int i8 = (i2 >> 12) & 14;
            int i9 = i2 << 9;
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, z, z2, null, null, null, null, false, null, composer2, i8 | (458752 & i9) | (i9 & 3670016), 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final UUID uuid3 = uuid2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportTextDescriptionComposable.ContinueButton$lambda$22(uuid3, str, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
