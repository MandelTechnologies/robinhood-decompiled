package com.robinhood.android.cash.lib.atm.p072ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.robinhood.android.cash.lib.atm.p072ui.AtmMiniFinderComposable3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmMiniFinderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AtmMiniFinderComposable3 implements Function3<Boolean, Composer, Integer, Unit> {
    final /* synthetic */ MultiplePermissionsState $locationPermissionState;
    final /* synthetic */ Function0<Unit> $onMapClick;
    final /* synthetic */ AtmMiniFinderV2ViewState $viewState;

    AtmMiniFinderComposable3(MultiplePermissionsState multiplePermissionsState, AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, Function0<Unit> function0) {
        this.$locationPermissionState = multiplePermissionsState;
        this.$viewState = atmMiniFinderV2ViewState;
        this.$onMapClick = function0;
    }

    /* compiled from: AtmMiniFinderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$2$1$1 */
    static final class C101191 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onMapClick;
        final /* synthetic */ AtmMiniFinderV2ViewState $viewState;

        C101191(AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, Function0<Unit> function0) {
            this.$viewState = atmMiniFinderV2ViewState;
            this.$onMapClick = function0;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860604858, i, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinder.<anonymous>.<anonymous>.<anonymous> (AtmMiniFinderComposable.kt:116)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), AtmMiniFinderComposable.MiniFinderHeight);
            AtmMiniFinderV2ViewState atmMiniFinderV2ViewState = this.$viewState;
            final Function0<Unit> function0 = this.$onMapClick;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5156height3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AtmMiniFinderComposable.AtmMiniFinderMap(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, AtmMiniFinderComposable.MiniFinderHeight), 0.0f, 1, null), atmMiniFinderV2ViewState, composer, 6, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AtmMiniFinderComposable3.C101191.invoke$lambda$2$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxSize$default, false, null, null, (Function0) objRememberedValue, 7, null), composer, 0);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2128534140, i2, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinder.<anonymous>.<anonymous> (AtmMiniFinderComposable.kt:104)");
        }
        if (z) {
            composer.startReplaceGroup(-263276828);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            CardKt.m5548CardFjzlyU(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), composer, 6, 0), 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), 0L, null, C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-860604858, true, new C101191(this.$viewState, this.$onMapClick), composer, 54), composer, 1769472, 24);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-261690899);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), composer, 6, 0), 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
            long jM21371getBg0d7_KjU = bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU();
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(2);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$locationPermissionState);
            final MultiplePermissionsState multiplePermissionsState = this.$locationPermissionState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinder$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AtmMiniFinderComposable3.invoke$lambda$1$lambda$0(multiplePermissionsState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CardKt.m5549CardLPr_se0((Function0) objRememberedValue, modifierFillMaxWidth$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, null, fM7995constructorimpl, null, AtmMiniFinderComposable4.INSTANCE.m11557getLambda$1366625606$lib_cash_atm_externalDebug(), composer, 817889280, 356);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MultiplePermissionsState multiplePermissionsState) {
        multiplePermissionsState.launchMultiplePermissionRequest();
        return Unit.INSTANCE;
    }
}
