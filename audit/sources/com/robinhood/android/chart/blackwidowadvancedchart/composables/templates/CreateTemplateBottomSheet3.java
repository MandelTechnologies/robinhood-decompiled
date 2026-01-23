package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import android.view.View;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTemplateBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"CREATE_SET_BOTTOM_SHEET", "", "RENAME_SET_BOTTOM_SHEET", "CREATE_SET_BOTTOM_SHEET_CANCEL", "RENAME_SET_BOTTOM_SHEET_CANCEL", "CREATE_SET_BOTTOM_SHEET_CREATE", "RENAME_SET_BOTTOM_SHEET_SAVE", "CreateTemplateBottomSheet", "", "template", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "firstTemplate", "", "onSave", "Lkotlin/Function1;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BwCreateTemplateBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "playShakeAnimation", "shakeOffset", "Landroidx/compose/ui/unit/IntOffset;", "setName"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CreateTemplateBottomSheet3 {
    public static final String CREATE_SET_BOTTOM_SHEET = "CreateSetBottomSheet";
    public static final String CREATE_SET_BOTTOM_SHEET_CANCEL = "CreateSetBottomSheetCancel";
    public static final String CREATE_SET_BOTTOM_SHEET_CREATE = "CreateSetBottomSheetCreate";
    public static final String RENAME_SET_BOTTOM_SHEET = "RenameSetBottomSheet";
    public static final String RENAME_SET_BOTTOM_SHEET_CANCEL = "RenameSetBottomSheetCancel";
    public static final String RENAME_SET_BOTTOM_SHEET_SAVE = "RenameSetBottomSheetSave";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwCreateTemplateBottomSheetPreview$lambda$9(int i, Composer composer, int i2) {
        BwCreateTemplateBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTemplateBottomSheet$lambda$8(TemplateDto templateDto, boolean z, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTemplateBottomSheet(templateDto, z, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTemplateBottomSheet(final TemplateDto templateDto, final boolean z, final Function1<? super String, Unit> onSave, final Function0<Unit> onCancel, Modifier modifier, Composer composer, final int i, final int i2) {
        TemplateDto templateDto2;
        int i3;
        boolean z2;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        long j;
        long j2;
        Object objRememberedValue4;
        Composer composer2;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694890537);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            templateDto2 = templateDto;
        } else {
            templateDto2 = templateDto;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(templateDto2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSave) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCancel) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1694890537, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheet (CreateTemplateBottomSheet.kt:64)");
                }
                View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                if (CreateTemplateBottomSheet$lambda$2(snapshotState)) {
                    j = 0;
                    j2 = j << 32;
                } else {
                    j2 = 25 << 32;
                    j = 0;
                }
                long jM8033constructorimpl = IntOffset.m8033constructorimpl((j & 4294967295L) | j2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateTemplateBottomSheet3.CreateTemplateBottomSheet$lambda$5$lambda$4((KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl, AnimationSpecKt.keyframesWithSpline((Function1) objRememberedValue4), null, null, composerStartRestartGroup, 0, 12);
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-420325918, true, new C108901(modifier4, templateDto2, z2, focusRequester, snapshotState4M4813animateIntOffsetAsStateHyPO7BM, coroutineScope, snapshotState, view, onCancel, onSave), composer2, 54), composer2, 6);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new CreateTemplateBottomSheet5(focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTemplateBottomSheet3.CreateTemplateBottomSheet$lambda$8(templateDto, z, onSave, onCancel, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            if (CreateTemplateBottomSheet$lambda$2(snapshotState)) {
            }
            long jM8033constructorimpl2 = IntOffset.m8033constructorimpl((j & 4294967295L) | j2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM2 = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl2, AnimationSpecKt.keyframesWithSpline((Function1) objRememberedValue4), null, null, composerStartRestartGroup, 0, 12);
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-420325918, true, new C108901(modifier42, templateDto2, z2, focusRequester2, snapshotState4M4813animateIntOffsetAsStateHyPO7BM2, coroutineScope2, snapshotState, view2, onCancel, onSave), composer2, 54), composer2, 6);
            Unit unit2 = Unit.INSTANCE;
            composer2.startReplaceGroup(5004770);
            objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateTemplateBottomSheet$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTemplateBottomSheet$lambda$5$lambda$4(KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSpline) {
        Intrinsics.checkNotNullParameter(keyframesWithSpline, "$this$keyframesWithSpline");
        keyframesWithSpline.setDurationMillis(100);
        long j = 0;
        long j2 = j << 32;
        long j3 = j & 4294967295L;
        long j4 = j2 | j3;
        keyframesWithSpline.mo91at(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(j4)), 0);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((-25) << 32) | j3)), 0.33f);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(j4)), 0.66f);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((25 << 32) | j3)), 1.0f);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTemplateBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$CreateTemplateBottomSheet$1 */
    static final class C108901 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $firstTemplate;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onCancel;
        final /* synthetic */ Function1<String, Unit> $onSave;
        final /* synthetic */ SnapshotState<Boolean> $playShakeAnimation$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnapshotState4<IntOffset> $shakeOffset$delegate;
        final /* synthetic */ TemplateDto $template;
        final /* synthetic */ View $view;

        /* JADX WARN: Multi-variable type inference failed */
        C108901(Modifier modifier, TemplateDto templateDto, boolean z, FocusRequester focusRequester, SnapshotState4<IntOffset> snapshotState4, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, View view, Function0<Unit> function0, Function1<? super String, Unit> function1) {
            this.$modifier = modifier;
            this.$template = templateDto;
            this.$firstTemplate = z;
            this.$focusRequester = focusRequester;
            this.$shakeOffset$delegate = snapshotState4;
            this.$scope = coroutineScope;
            this.$playShakeAnimation$delegate = snapshotState;
            this.$view = view;
            this.$onCancel = function0;
            this.$onSave = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final String invoke$lambda$12$lambda$1(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }

        public final void invoke(Composer composer, int i) {
            String str;
            int i2;
            String id;
            String id2;
            String id3;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-420325918, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheet.<anonymous> (CreateTemplateBottomSheet.kt:80)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM());
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component = new Component(Component.ComponentType.BOTTOM_SHEET, this.$template == null ? CreateTemplateBottomSheet3.CREATE_SET_BOTTOM_SHEET : CreateTemplateBottomSheet3.RENAME_SET_BOTTOM_SHEET, null, 4, null);
            TemplateDto templateDto = this.$template;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN4, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, component, null, null, null, null, null, 0.0d, false, null, (templateDto == null || (id3 = templateDto.getId()) == null) ? "" : id3, null, null, 0.0d, null, null, 32254, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            boolean z = this.$firstTemplate;
            TemplateDto templateDto2 = this.$template;
            FocusRequester focusRequester = this.$focusRequester;
            final SnapshotState4<IntOffset> snapshotState4 = this.$shakeOffset$delegate;
            final CoroutineScope coroutineScope = this.$scope;
            final SnapshotState<Boolean> snapshotState = this.$playShakeAnimation$delegate;
            final View view = this.$view;
            final Function0<Unit> function0 = this.$onCancel;
            final Function1<String, Unit> function1 = this.$onSave;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z ? C10963R.string.template_create_bottom_sheet_first_template_title : templateDto2 == null ? C10963R.string.template_create_bottom_sheet_title : C10963R.string.template_create_bottom_sheet_edit_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                str = "";
                objRememberedValue = SnapshotState3.mutableStateOf$default(str, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                str = "";
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 5, null), focusRequester);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$CreateTemplateBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTemplateBottomSheet3.C108901.invoke$lambda$12$lambda$4$lambda$3(snapshotState4, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierOffset = OffsetKt.offset(modifierFocusRequester, (Function1) objRememberedValue2);
            String name = templateDto2 != null ? templateDto2.getName() : null;
            composer.startReplaceGroup(1397752458);
            if (name == null) {
                i2 = 0;
                name = StringResources_androidKt.stringResource(C10963R.string.template_create_bottom_sheet_text_input_placeholder, composer, 0);
            } else {
                i2 = 0;
            }
            composer.endReplaceGroup();
            String strInvoke$lambda$12$lambda$1 = invoke$lambda$12$lambda$1(snapshotState2);
            KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), KeyboardCapitalization.INSTANCE.m7768getSentencesIUNYP9k(), null, 0, 0, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(coroutineScope);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$CreateTemplateBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTemplateBottomSheet3.C108901.invoke$lambda$12$lambda$6$lambda$5(coroutineScope, snapshotState2, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            int i4 = i2;
            String str2 = str;
            BentoTextInput4.BentoTextInput(strInvoke$lambda$12$lambda$1, (Function1) objRememberedValue3, modifierOffset, null, name, null, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default, null, null, false, false, composer, 0, 0, 31720);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer, i4);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, i4);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion4);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor2, new Component(componentType, templateDto2 == null ? CreateTemplateBottomSheet3.CREATE_SET_BOTTOM_SHEET_CANCEL : CreateTemplateBottomSheet3.RENAME_SET_BOTTOM_SHEET_CANCEL, null, 4, null), null, null, null, null, null, 0.0d, false, null, (templateDto2 == null || (id2 = templateDto2.getId()) == null) ? str2 : id2, null, null, 0.0d, null, null, 32254, null), false, false, false, true, false, null, 110, null);
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.template_create_bottom_sheet_button_cancel, composer, i4);
            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(view) | composer.changed(function0);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$CreateTemplateBottomSheet$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTemplateBottomSheet3.C108901.invoke$lambda$12$lambda$11$lambda$8$lambda$7(view, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, strStringResource, modifierAutoLogEvents$default2, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(componentType, templateDto2 == null ? CreateTemplateBottomSheet3.CREATE_SET_BOTTOM_SHEET_CREATE : CreateTemplateBottomSheet3.RENAME_SET_BOTTOM_SHEET_SAVE, null, 4, null), null, null, null, null, null, 0.0d, false, null, (templateDto2 == null || (id = templateDto2.getId()) == null) ? str2 : id, null, null, 0.0d, null, null, 32254, null), false, false, false, true, false, null, 110, null);
            String strStringResource2 = StringResources_androidKt.stringResource((templateDto2 != null || z) ? C10963R.string.template_create_bottom_sheet_button_save : C10963R.string.template_create_bottom_sheet_button_create, composer, i4);
            boolean z2 = !StringsKt.isBlank(invoke$lambda$12$lambda$1(snapshotState2));
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composer.changedInstance(view) | composer.changed(function1);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$CreateTemplateBottomSheet$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTemplateBottomSheet3.C108901.invoke$lambda$12$lambda$11$lambda$10$lambda$9(view, function1, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource2, modifierAutoLogEvents$default3, null, null, z2, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$12$lambda$4$lambda$3(SnapshotState4 snapshotState4, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(CreateTemplateBottomSheet3.CreateTemplateBottomSheet$lambda$6(snapshotState4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$6$lambda$5(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            if (newValue.length() > 16) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CreateTemplateBottomSheet4(snapshotState2, null), 3, null);
            } else {
                snapshotState.setValue(newValue);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11$lambda$8$lambda$7(View view, Function0 function0) {
            HapticEvents.onRejectHapticEvent(view);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$9(View view, Function1 function1, SnapshotState snapshotState) {
            HapticEvents.onSuccessHapticEvent(view);
            function1.invoke(StringsKt.trim(invoke$lambda$12$lambda$1(snapshotState)).toString());
            return Unit.INSTANCE;
        }
    }

    private static final boolean CreateTemplateBottomSheet$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CreateTemplateBottomSheet$lambda$6(SnapshotState4<IntOffset> snapshotState4) {
        return snapshotState4.getValue().getPackedValue();
    }

    public static final void BwCreateTemplateBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(608802749);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(608802749, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.BwCreateTemplateBottomSheetPreview (CreateTemplateBottomSheet.kt:206)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CreateTemplateBottomSheet.INSTANCE.m1796x372b1747(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTemplateBottomSheet3.BwCreateTemplateBottomSheetPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
