package com.robinhood.android.pathfinder.corepages.attestation;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.pathfinder.contexts.AgreementSectionType;
import com.robinhood.models.p355ui.pathfinder.contexts.AttestationContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AttestationComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0000\"\u000e\u0010\u0018\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {"AttestationComposable", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/AttestationContext;", "isSendingContinue", "", "onClickCta", "Lkotlin/Function0;", "(Lcom/robinhood/models/ui/pathfinder/contexts/AttestationContext;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Agreement", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "agreementSectionType", "Lcom/robinhood/models/ui/pathfinder/contexts/AgreementSectionType;", "isChecked", "onClickCheckBox", "(ILcom/robinhood/models/ui/pathfinder/contexts/AgreementSectionType;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "indexed", "primaryIndex", "subIndex", "AttesttationTestTagHeading", AttestationComposable.AttesttationTestTagAgreementList, AttestationComposable.AttesttationTestTagAgreementRow, AttestationComposable.AttesttationTestTagAgreementCheckbox, AttestationComposable.AttesttationTestTagAgreementSection, AttestationComposable.AttesttationTestTagAgreementCta, "feature-pathfinder-core-pages_externalDebug", "allChecked"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class AttestationComposable {
    public static final String AttesttationTestTagAgreementCheckbox = "AttesttationTestTagAgreementCheckbox";
    public static final String AttesttationTestTagAgreementCta = "AttesttationTestTagAgreementCta";
    public static final String AttesttationTestTagAgreementList = "AttesttationTestTagAgreementList";
    public static final String AttesttationTestTagAgreementRow = "AttesttationTestTagAgreementRow";
    public static final String AttesttationTestTagAgreementSection = "AttesttationTestTagAgreementSection";
    public static final String AttesttationTestTagHeading = "AttesttationTestTagHeader";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Agreement$lambda$16(int i, AgreementSectionType agreementSectionType, boolean z, Function0 function0, int i2, Composer composer, int i3) {
        Agreement(i, agreementSectionType, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttestationComposable$lambda$11(AttestationContext attestationContext, boolean z, Function0 function0, int i, Composer composer, int i2) {
        AttestationComposable(attestationContext, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$12(String str, int i, Composer composer, int i2) {
        Heading(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AttestationComposable(final AttestationContext context, final boolean z, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> onClickCta = function0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-741857289);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741857289, i2, -1, "com.robinhood.android.pathfinder.corepages.attestation.AttestationComposable (AttestationComposable.kt:41)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(AttestationComposable.AttestationComposable$lambda$3$lambda$2(snapshotStateMap, context));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, TestTag3.testTag(companion2, AttesttationTestTagAgreementList), 1.0f, false, 2, null);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AttestationComposable.AttestationComposable$lambda$10$lambda$9$lambda$8(context, snapshotStateMap, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 506);
            composerStartRestartGroup = composerStartRestartGroup;
            onClickCta = function0;
            BentoButtonKt.m20586BentoButtonEikTQX8(onClickCta, context.getCtaText(), SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(TestTag3.testTag(companion2, AttesttationTestTagAgreementCta), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), null, BentoButtons.Type.Primary, AttestationComposable$lambda$4(snapshotState4), z, null, null, null, null, false, null, composerStartRestartGroup, ((i2 >> 6) & 14) | 24576 | ((i2 << 15) & 3670016), 0, 8072);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttestationComposable.AttestationComposable$lambda$11(context, z, onClickCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AttestationComposable$lambda$3$lambda$2(SnapshotStateMap snapshotStateMap, AttestationContext attestationContext) {
        int i;
        Collection collectionValues = snapshotStateMap.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            i = 0;
        } else {
            Iterator it = collectionValues.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i == attestationContext.getAgreements().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttestationComposable$lambda$10$lambda$9$lambda$8(final AttestationContext attestationContext, final SnapshotStateMap snapshotStateMap, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, AttestationComposable5.Heading, ComposableLambda3.composableLambdaInstance(-990203956, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$AttestationComposable$1$1$1$1
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
                    ComposerKt.traceEventStart(-990203956, i, -1, "com.robinhood.android.pathfinder.corepages.attestation.AttestationComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AttestationComposable.kt:55)");
                }
                AttestationComposable.Heading(attestationContext.getHeading(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        final List<AgreementSectionType> agreements = attestationContext.getAgreements();
        LazyColumn.items(agreements.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$AttestationComposable$lambda$10$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return AttestationComposable5.Agreement;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$AttestationComposable$lambda$10$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope lazyItemScope, final int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = agreements.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                AgreementSectionType agreementSectionType = (AgreementSectionType) obj;
                composer.startReplaceGroup(1232947870);
                final boolean zBooleanValue = ((Boolean) snapshotStateMap.getOrDefault(Integer.valueOf(i), Boolean.FALSE)).booleanValue();
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(zBooleanValue) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotStateMap snapshotStateMap2 = snapshotStateMap;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$AttestationComposable$1$1$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotStateMap2.put(Integer.valueOf(i), Boolean.valueOf(!zBooleanValue));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                AttestationComposable.Agreement(i, agreementSectionType, zBooleanValue, (Function0) objRememberedValue, composer, (i4 >> 3) & 14);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final boolean AttestationComposable$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Heading(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-345607428);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-345607428, i2, -1, "com.robinhood.android.pathfinder.corepages.attestation.Heading (AttestationComposable.kt:84)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AttesttationTestTagHeading);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttestationComposable.Heading$lambda$12(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Agreement(final int i, final AgreementSectionType agreementSectionType, final boolean z, Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        Function0<Unit> function02;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(162255133);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(agreementSectionType) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(162255133, i3, -1, "com.robinhood.android.pathfinder.corepages.attestation.Agreement (AttestationComposable.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, indexed(AttesttationTestTagAgreementRow, i));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, function0, 7, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM4893clickableXHw0xAI$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null);
            function02 = function0;
            BentoText2.m20747BentoText38GnDrw(agreementSectionType.getTitle(), modifierWeight$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 24576, 0, 8168);
            composer2 = composerStartRestartGroup;
            CompositionLocal3.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumTouchTargetEnforcement().provides(Boolean.FALSE), ComposableLambda3.rememberComposableLambda(-539440445, true, new AttestationComposable2(i, z, function02), composer2, 54), composer2, ProvidedValue.$stable | 48);
            composer2.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i4).m21427getFg30d7_KjU(), 0.0f, composer2, 0, 5);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
            composer2.startReplaceGroup(154774696);
            Iterator it = agreementSectionType.getSections().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Composer composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(((RichText) next).getText(), TestTag3.testTag(companion4, indexed(AttesttationTestTagAgreementSection, i, i5)), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                composer2 = composer3;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                it = it;
                i5 = i6;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttestationComposable.Agreement$lambda$16(i, agreementSectionType, z, function03, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String indexed(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + "_" + i;
    }

    public static final String indexed(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + "_" + i + "_" + i2;
    }
}
