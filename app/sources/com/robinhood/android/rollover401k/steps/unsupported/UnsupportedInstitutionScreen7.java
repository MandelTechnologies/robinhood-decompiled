package com.robinhood.android.rollover401k.steps.unsupported;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionRow;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionViewModel;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreen7;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnsupportedInstitutionScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"UnsupportedInstitutionScreen", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/UnsupportedInstitutionViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/retirement/db/UnsupportedInstitutionViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnsupportedInstitutionPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-rollover-401k_externalDebug", "loading", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UnsupportedInstitutionScreen7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsupportedInstitutionPreview$lambda$1(int i, Composer composer, int i2) {
        UnsupportedInstitutionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsupportedInstitutionScreen$lambda$0(UnsupportedInstitutionViewModel unsupportedInstitutionViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnsupportedInstitutionScreen(unsupportedInstitutionViewModel, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnsupportedInstitutionScreen(final UnsupportedInstitutionViewModel viewModel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1009541499);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1009541499, i3, -1, "com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreen (UnsupportedInstitutionScreen.kt:42)");
                }
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, UnsupportedInstitutionScreen.INSTANCE.m18454getLambda$162121161$feature_rollover_401k_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-731633012, true, new C277761(viewModel), composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UnsupportedInstitutionScreen7.UnsupportedInstitutionScreen$lambda$0(viewModel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, UnsupportedInstitutionScreen.INSTANCE.m18454getLambda$162121161$feature_rollover_401k_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-731633012, true, new C277761(viewModel), composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: UnsupportedInstitutionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreenKt$UnsupportedInstitutionScreen$1 */
    static final class C277761 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ UnsupportedInstitutionViewModel $viewModel;

        C277761(UnsupportedInstitutionViewModel unsupportedInstitutionViewModel) {
            this.$viewModel = unsupportedInstitutionViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final boolean invoke$lambda$6$lambda$2(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$6$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(CoroutineScope coroutineScope, Navigator navigator, Context context, UnsupportedInstitutionViewModel unsupportedInstitutionViewModel, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UnsupportedInstitutionScreen8(navigator, context, unsupportedInstitutionViewModel, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731633012, i2, -1, "com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreen.<anonymous> (UnsupportedInstitutionScreen.kt:55)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.padding(companion, paddingValues), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_NOT_SUPPORTED, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            final UnsupportedInstitutionViewModel unsupportedInstitutionViewModel = this.$viewModel;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String title = unsupportedInstitutionViewModel.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(unsupportedInstitutionViewModel.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            composer.startReplaceGroup(-942434788);
            int i4 = 0;
            for (Object obj : unsupportedInstitutionViewModel.getRows()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UnsupportedInstitutionRow unsupportedInstitutionRow = (UnsupportedInstitutionRow) obj;
                BentoValuePropRow3.BentoValuePropRow(unsupportedInstitutionRow.getText(), unsupportedInstitutionRow.getSubtext(), new BentoValuePropRow2.Number(i5), BentoValuePropRow.Top, (Modifier) null, composer, (BentoValuePropRow2.Number.$stable << 6) | 3072, 16);
                i4 = i5;
            }
            composer.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            String ctaText = unsupportedInstitutionViewModel.getCtaText();
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_NOT_SUPPORTED, null, null, null, 14, null), UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null)), false, false, false, true, false, null, 110, null);
            boolean zInvoke$lambda$6$lambda$2 = invoke$lambda$6$lambda$2(snapshotState);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(unsupportedInstitutionViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion4.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreenKt$UnsupportedInstitutionScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnsupportedInstitutionScreen7.C277761.invoke$lambda$6$lambda$5$lambda$4(coroutineScope, navigator, context, unsupportedInstitutionViewModel, snapshotState);
                    }
                };
                composer.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, ctaText, modifierAutoLogEvents$default2, null, null, false, zInvoke$lambda$6$lambda$2, null, null, null, null, false, null, composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void UnsupportedInstitutionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2079020151);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2079020151, i, -1, "com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionPreview (UnsupportedInstitutionScreen.kt:123)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, UnsupportedInstitutionScreen.INSTANCE.getLambda$865684527$feature_rollover_401k_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnsupportedInstitutionScreen7.UnsupportedInstitutionPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
