package com.robinhood.android.acatsin.agreement;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aU\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002"}, m3636d2 = {"TitleTestTag", "", "SlipContentTestTag", "SlipCheckboxSectionTestTag", "SlipCheckboxTestTag", "CtaTestTag", "AcatsInAgreementComposable", "", "state", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loaded;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onSlipAgreementsUpdated", "Lkotlin/Function1;", "", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "onAgreementAccepted", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState$Loaded;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-acats-ui_externalDebug", "shouldScrollToBottom", "", "hasScrolledToBottom", "slipCheckboxChecked"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInAgreementComposable {
    public static final String CtaTestTag = "ACATS_IN_AGREEMENT_CTA";
    public static final String SlipCheckboxSectionTestTag = "ACATS_IN_AGREEMENT_SLIP_CHECKBOX_SECTION";
    public static final String SlipCheckboxTestTag = "ACATS_IN_AGREEMENT_SLIP_CHECKBOX";
    public static final String SlipContentTestTag = "ACATS_IN_AGREEMENT_SLIP_CONTENT";
    public static final String TitleTestTag = "ACATS_IN_AGREEMENT_TITLE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInAgreementComposable$lambda$19(AcatsInAgreementViewState.Loaded loaded, Context context, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsInAgreementComposable(loaded, context, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsInAgreementComposable(final AcatsInAgreementViewState.Loaded state, final Context screenEventContext, final Function1<? super List<UiSlipAgreements.Agreement>, Unit> onSlipAgreementsUpdated, final Function0<Unit> onAgreementAccepted, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        final SnapshotState snapshotState3;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean zChanged;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        Composer composer2;
        final Modifier modifier3;
        UiSlipAgreementsSection.Checkbox checkbox;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(screenEventContext, "screenEventContext");
        Intrinsics.checkNotNullParameter(onSlipAgreementsUpdated, "onSlipAgreementsUpdated");
        Intrinsics.checkNotNullParameter(onAgreementAccepted, "onAgreementAccepted");
        Composer composerStartRestartGroup = composer.startRestartGroup(608819093);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenEventContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSlipAgreementsUpdated) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAgreementAccepted) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(608819093, i3, -1, "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposable (AcatsInAgreementComposable.kt:55)");
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    UiSlipAgreementsSection slipAgreementsSection = state.getSlipAgreementsSection();
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default((slipAgreementsSection == null || (checkbox = slipAgreementsSection.getCheckbox()) == null) ? null : Boolean.valueOf(checkbox.isCheckedByDefault()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolAcatsInAgreementComposable$lambda$7 = AcatsInAgreementComposable$lambda$7(snapshotState3);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new AcatsInAgreementComposable2(onSlipAgreementsUpdated, state, snapshotState3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolAcatsInAgreementComposable$lambda$7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                Boolean boolValueOf = Boolean.valueOf(AcatsInAgreementComposable$lambda$1(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new AcatsInAgreementComposable3(lazyListStateRememberLazyListState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new AcatsInAgreementComposable4(lazyListStateRememberLazyListState, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
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
                int i6 = i3;
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
                Modifier modifierWeight$default = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(screenEventContext);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$18$lambda$14$lambda$13(state, screenEventContext, snapshotState3, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function1 function1 = (Function1) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, function1, composerStartRestartGroup, 0, 508);
                composerStartRestartGroup.startReplaceGroup(-1360935897);
                if (state.isAcatsRetry()) {
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), CtaTestTag);
                    String strStringResource = StringResources_androidKt.stringResource((AcatsInAgreementComposable$lambda$4(snapshotState2) && state.isCoOwnerFlow()) ? C7686R.string.agreement_cta_coowner_accept : AcatsInAgreementComposable$lambda$4(snapshotState2) ? C7686R.string.agreement_cta_accept : C11048R.string.general_action_review, composerStartRestartGroup, 0);
                    boolean zIsAgreementSigningActive = state.isAgreementSigningActive();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean z = (i6 & 7168) == 2048;
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsInAgreementComposable.m1698xd22437ce(onAgreementAccepted, snapshotState2, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue8, strStringResource, modifierTestTag, null, null, false, zIsAgreementSigningActive, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8120);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$19(state, screenEventContext, onSlipAgreementsUpdated, onAgreementAccepted, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolAcatsInAgreementComposable$lambda$72 = AcatsInAgreementComposable$lambda$7(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(state);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue4 = new AcatsInAgreementComposable2(onSlipAgreementsUpdated, state, snapshotState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolAcatsInAgreementComposable$lambda$72, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                Boolean boolValueOf2 = Boolean.valueOf(AcatsInAgreementComposable$lambda$1(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue5 = new AcatsInAgreementComposable3(lazyListStateRememberLazyListState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue6 = new AcatsInAgreementComposable4(lazyListStateRememberLazyListState, snapshotState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN42);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        int i62 = i3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierWeight$default2 = Column5.weight$default(column62, companion42, 1.0f, false, 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(screenEventContext);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$18$lambda$14$lambda$13(state, screenEventContext, snapshotState3, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                Function1 function12 = (Function1) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier52 = modifier4;
                                LazyDslKt.LazyColumn(modifierWeight$default2, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, function12, composerStartRestartGroup, 0, 508);
                                composerStartRestartGroup.startReplaceGroup(-1360935897);
                                if (state.isAcatsRetry()) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsInAgreementComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsInAgreementComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AcatsInAgreementComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AcatsInAgreementComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean AcatsInAgreementComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInAgreementComposable$lambda$18$lambda$14$lambda$13(final AcatsInAgreementViewState.Loaded loaded, Context context, SnapshotState snapshotState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, AcatsInAgreementComposable8.INSTANCE.m10700getLambda$1829126614$lib_acats_ui_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-2021903277, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$4$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2021903277, i, -1, "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsInAgreementComposable.kt:117)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                BentoMarkdownText2.BentoMarkdownText(loaded.getAcatsAgreement().getContent(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, 0, 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final UiSlipAgreementsSection slipAgreementsSection = loaded.getSlipAgreementsSection();
        if (slipAgreementsSection != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1526039993, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$4$1$1$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1526039993, i, -1, "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsInAgreementComposable.kt:124)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                    Modifier modifierTestTag = TestTag3.testTag(companion, AcatsInAgreementComposable.SlipContentTestTag);
                    ImmutableList immutableList = extensions2.toImmutableList(slipAgreementsSection.getComponents());
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    composer.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierTestTag, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 196992, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(648816048, true, new AcatsInAgreementComposable7(slipAgreementsSection, context, snapshotState)), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AcatsInAgreementComposable$lambda$18$lambda$17$lambda$16$lambda$15 */
    public static final Unit m1698xd22437ce(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (AcatsInAgreementComposable$lambda$4(snapshotState)) {
            function0.invoke();
        } else {
            AcatsInAgreementComposable$lambda$2(snapshotState2, true);
        }
        return Unit.INSTANCE;
    }
}
