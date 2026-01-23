package com.robinhood.android.retirement.onboarding.agreements;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.instant.C18943R;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.retirement.onboarding.C27032R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpFlowAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0006\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"HeaderImageHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AgreementsLazyColumnTag", "", "agreementSectionBottomPadding", "Landroidx/compose/ui/Modifier;", "RetirementAgreementsScreen", "", "state", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementInteractions;", "(Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementInteractions;Landroidx/compose/runtime/Composer;I)V", "AgreementSummaryHeader", "accountTypeDescription", "modifier", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-onboarding_externalDebug", "totalItemsCount", "", "lastFullyVisibleIndex", "nextAutoScrollIndex", "shouldScroll", "", "hasScrolledToBottom", "showDivider", "deepestScrollIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAgreementScreen2 {
    public static final String AgreementsLazyColumnTag = "agreements_column";
    private static final float HeaderImageHeight = C2002Dp.m7995constructorimpl(78);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementSummaryHeader$lambda$32(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AgreementSummaryHeader(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementAgreementsScreen$lambda$29(RetirementAgreementsViewState retirementAgreementsViewState, RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, int i, Composer composer, int i2) {
        RetirementAgreementsScreen(retirementAgreementsViewState, retirementSignUpFlowAgreementScreen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Modifier agreementSectionBottomPadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt.agreementSectionBottomPadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-503860469);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-503860469, i, -1, "com.robinhood.android.retirement.onboarding.agreements.agreementSectionBottomPadding.<anonymous> (RetirementSignUpFlowAgreementScreen.kt:67)");
                }
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(composed, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5146paddingqDBjuR0$default;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementAgreementsScreen(final RetirementAgreementsViewState state, RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, Composer composer, final int i) {
        int i2;
        final RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen2;
        boolean z;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        String strStringResource;
        SnapshotState snapshotState3;
        SnapshotState snapshotState4;
        boolean zChanged;
        Object objRememberedValue2;
        SnapshotIntState2 snapshotIntState2;
        SnapshotState4 snapshotState42;
        boolean zChanged2;
        Object objRememberedValue3;
        Continuation continuation;
        boolean z2;
        Object objRememberedValue4;
        final RetirementSignUpFlowAgreementScreen callbacks = retirementSignUpFlowAgreementScreen;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(673555236);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(673555236, i2, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsScreen (RetirementSignUpFlowAgreementScreen.kt:76)");
            }
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$1$lambda$0(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$16$lambda$15(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            SnapshotState4 snapshotState44 = (SnapshotState4) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$19$lambda$18(snapshotState6, snapshotState43, snapshotIntState23, snapshotIntState22));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            SnapshotState4 snapshotState45 = (SnapshotState4) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i4 = i2;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(companion2), 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null);
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
            Column6 column6 = Column6.INSTANCE;
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, fM21590getDefaultD9Ej5fM, 1, null);
            Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), AgreementsLazyColumnTag);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i5 = i4 & 112;
            boolean zChanged3 = composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM) | composerStartRestartGroup.changedInstance(state) | (i5 == 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$28$lambda$22$lambda$21(state, fM21590getDefaultD9Ej5fM, callbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue12, composerStartRestartGroup, 0, 504);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), RetirementAgreementsScreen$lambda$17(snapshotState44) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            if (i5 != 32) {
                if ((i4 & 64) != 0) {
                    retirementSignUpFlowAgreementScreen2 = retirementSignUpFlowAgreementScreen;
                    if (composerStartRestartGroup.changedInstance(retirementSignUpFlowAgreementScreen2)) {
                    }
                    zChangedInstance = z | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == companion.getEmpty()) {
                        snapshotState = snapshotState5;
                        snapshotState2 = snapshotState6;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$28$lambda$24$lambda$23(retirementSignUpFlowAgreementScreen2, state, snapshotState2, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        snapshotState = snapshotState5;
                        snapshotState2 = snapshotState6;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (RetirementAgreementsScreen$lambda$13(snapshotState2)) {
                        composerStartRestartGroup.startReplaceGroup(-1990330345);
                        strStringResource = StringResources_androidKt.stringResource(C18943R.string.retirement_agreement_review_steps, new Object[]{Integer.valueOf(RetirementAgreementsScreen$lambda$20(snapshotState45) + 1), Integer.valueOf(RetirementAgreementsScreen$lambda$2(snapshotState43) - 1)}, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1990429638);
                        strStringResource = StringResources_androidKt.stringResource(C18943R.string.retirement_agreement_agree, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    snapshotState3 = snapshotState2;
                    snapshotState4 = snapshotState;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Boolean boolValueOf = Boolean.valueOf(RetirementAgreementsScreen$lambda$10(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        RetirementSignUpFlowAgreementScreen6 retirementSignUpFlowAgreementScreen6 = new RetirementSignUpFlowAgreementScreen6(lazyListStateRememberLazyListState, snapshotState4, snapshotIntState22, snapshotIntState23, snapshotState43, null);
                        snapshotIntState2 = snapshotIntState22;
                        snapshotState42 = snapshotState43;
                        composerStartRestartGroup.updateRememberedValue(retirementSignUpFlowAgreementScreen6);
                        objRememberedValue2 = retirementSignUpFlowAgreementScreen6;
                    } else {
                        snapshotIntState2 = snapshotIntState22;
                        snapshotState42 = snapshotState43;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        continuation = null;
                        objRememberedValue3 = new RetirementSignUpFlowAgreementScreen7(lazyListStateRememberLazyListState, snapshotState3, snapshotIntState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                    Integer numValueOf = Integer.valueOf(RetirementAgreementsScreen$lambda$20(snapshotState45));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if (i5 == 32) {
                        if ((i4 & 64) != 0) {
                            callbacks = retirementSignUpFlowAgreementScreen;
                            if (composerStartRestartGroup.changedInstance(callbacks)) {
                            }
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new RetirementSignUpFlowAgreementScreen8(callbacks, snapshotState45, snapshotState42, continuation);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            callbacks = retirementSignUpFlowAgreementScreen;
                        }
                        z2 = false;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue4 = new RetirementSignUpFlowAgreementScreen8(callbacks, snapshotState45, snapshotState42, continuation);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        callbacks = retirementSignUpFlowAgreementScreen;
                    }
                    z2 = true;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                } else {
                    retirementSignUpFlowAgreementScreen2 = retirementSignUpFlowAgreementScreen;
                }
                z = false;
                zChangedInstance = z | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    snapshotState = snapshotState5;
                    snapshotState2 = snapshotState6;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$28$lambda$24$lambda$23(retirementSignUpFlowAgreementScreen2, state, snapshotState2, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (RetirementAgreementsScreen$lambda$13(snapshotState2)) {
                    }
                    snapshotState3 = snapshotState2;
                    snapshotState4 = snapshotState;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Boolean boolValueOf2 = Boolean.valueOf(RetirementAgreementsScreen$lambda$10(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        RetirementSignUpFlowAgreementScreen6 retirementSignUpFlowAgreementScreen62 = new RetirementSignUpFlowAgreementScreen6(lazyListStateRememberLazyListState, snapshotState4, snapshotIntState22, snapshotIntState23, snapshotState43, null);
                        snapshotIntState2 = snapshotIntState22;
                        snapshotState42 = snapshotState43;
                        composerStartRestartGroup.updateRememberedValue(retirementSignUpFlowAgreementScreen62);
                        objRememberedValue2 = retirementSignUpFlowAgreementScreen62;
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            continuation = null;
                            objRememberedValue3 = new RetirementSignUpFlowAgreementScreen7(lazyListStateRememberLazyListState, snapshotState3, snapshotIntState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                            Integer numValueOf2 = Integer.valueOf(RetirementAgreementsScreen$lambda$20(snapshotState45));
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            if (i5 == 32) {
                            }
                            z2 = true;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                            }
                        }
                    }
                }
            } else {
                retirementSignUpFlowAgreementScreen2 = retirementSignUpFlowAgreementScreen;
            }
            z = true;
            zChangedInstance = z | composerStartRestartGroup.changedInstance(state);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$29(state, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RetirementAgreementsScreen$lambda$1$lambda$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getTotalItemsCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RetirementAgreementsScreen$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RetirementAgreementsScreen$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean RetirementAgreementsScreen$lambda$17(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RetirementAgreementsScreen$lambda$2(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RetirementAgreementsScreen$lambda$20(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RetirementAgreementsScreen$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RetirementAgreementsScreen$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RetirementAgreementsScreen$lambda$16$lambda$15(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RetirementAgreementsScreen$lambda$19$lambda$18(SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22) {
        return RetirementAgreementsScreen$lambda$13(snapshotState) ? RetirementAgreementsScreen$lambda$2(snapshotState4) : Math.max(snapshotIntState2.getIntValue() - 1, snapshotIntState22.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementAgreementsScreen$lambda$28$lambda$22$lambda$21(final RetirementAgreementsViewState retirementAgreementsViewState, final float f, RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(78348153, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$1$1$1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(78348153, i, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementSignUpFlowAgreementScreen.kt:117)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierAgreementSectionBottomPadding = RetirementSignUpFlowAgreementScreen2.agreementSectionBottomPadding(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(f);
                RetirementAgreementsViewState retirementAgreementsViewState2 = retirementAgreementsViewState;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAgreementSectionBottomPadding);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C27032R.string.retirement_review_agreements, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                RetirementSignUpFlowAgreementScreen2.AgreementSummaryHeader(StringResources_androidKt.stringResource(retirementAgreementsViewState2.getAccountTypeDescription(), composer, 0), null, composer, 0, 2);
                InstantRetirementAgreementComponents.RetirementAgreement(retirementAgreementsViewState2.getAccountAgreement(), null, composer, 0, 2);
                composer.startReplaceGroup(-358535254);
                if (retirementAgreementsViewState2.getGoldSummarySection() != null) {
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(retirementAgreementsViewState2.getGoldSummarySection().getSection_title(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8174);
                    InstantRetirementAgreementComponents.SummarySection(retirementAgreementsViewState2.getGoldSummarySection().getSummary_title(), retirementAgreementsViewState2.getGoldSummarySection().getSummary_items(), null, composer, 0, 4);
                    composer.endNode();
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
        if (retirementAgreementsViewState.getSlipAgreement() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(213184446, true, new RetirementSignUpFlowAgreementScreen4(retirementAgreementsViewState, retirementSignUpFlowAgreementScreen)), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(389362274, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$1$1$3
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
                    ComposerKt.traceEventStart(389362274, i, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementSignUpFlowAgreementScreen.kt:177)");
                }
                InstantRetirementAgreementComponents.RetirementMarkdownText(retirementAgreementsViewState.getClosingText(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementAgreementsScreen$lambda$28$lambda$24$lambda$23(RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, RetirementAgreementsViewState retirementAgreementsViewState, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (RetirementAgreementsScreen$lambda$13(snapshotState)) {
            retirementSignUpFlowAgreementScreen.onAgreeClicked(retirementAgreementsViewState.getSignedAgreements());
        } else {
            RetirementAgreementsScreen$lambda$11(snapshotState2, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgreementSummaryHeader(String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1095990239);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1095990239, i4, -1, "com.robinhood.android.retirement.onboarding.agreements.AgreementSummaryHeader (RetirementSignUpFlowAgreementScreen.kt:268)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(C27032R.drawable.retirement_agreement_summary_icon, composerStartRestartGroup, 0);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ImageKt.Image(painterPainterResource, (String) null, SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 1, null), HeaderImageHeight), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27032R.string.retirement_agreement_summary_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                str2 = str;
                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16380);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpFlowAgreementScreen2.AgreementSummaryHeader$lambda$32(str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(C27032R.drawable.retirement_agreement_summary_icon, composerStartRestartGroup, 0);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                ImageKt.Image(painterPainterResource2, (String) null, SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 1, null), HeaderImageHeight), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27032R.string.retirement_agreement_summary_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                    str2 = str;
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16380);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
