package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SnackbarScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"SNACKBAR_DURATION_IN_MILLIONS_SEC", "", "SCREEN_MAX_DURATION_IN_MILLIONS_SEC", "SnackBarScreen", "", "viewState", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "onDisappear", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackbarScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SnackbarScreen {
    public static final long SCREEN_MAX_DURATION_IN_MILLIONS_SEC = 10000;
    public static final long SNACKBAR_DURATION_IN_MILLIONS_SEC = 2750;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SnackBarScreen$lambda$4(SlipOneClickSnackBarViewDuxo4 slipOneClickSnackBarViewDuxo4, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SnackBarScreen(slipOneClickSnackBarViewDuxo4, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SnackBarScreen(final SlipOneClickSnackBarViewDuxo4 viewState, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zBooleanValue;
        Function1 function1Component2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        Continuation continuation;
        int i4;
        Modifier modifier4;
        Modifier.Companion companion2;
        Continuation continuation2;
        int i5;
        int i6;
        Composer composer2;
        float f;
        int i7;
        int i8;
        Object objRememberedValue3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onDisappear = function0;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onDisappear, "onDisappear");
        Composer composerStartRestartGroup = composer.startRestartGroup(930454454);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisappear) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(930454454, i3, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackBarScreen (SnackbarScreen.kt:34)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                zBooleanValue = ((Boolean) snapshotState.component1()).booleanValue();
                function1Component2 = snapshotState.component2();
                composerStartRestartGroup.startReplaceGroup(813541562);
                if (!(viewState instanceof SlipOneClickSnackBarViewDuxo4.Success) || (viewState instanceof SlipOneClickSnackBarViewDuxo4.Error)) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(function1Component2) | ((i3 & 112) != 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        continuation = null;
                        objRememberedValue2 = new SnackbarScreen2(function1Component2, onDisappear, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1277889482);
                    if (zBooleanValue) {
                        i4 = i3;
                        modifier4 = modifier3;
                        companion2 = companion4;
                        continuation2 = continuation;
                        i5 = 0;
                        i6 = 1;
                        composer2 = composerStartRestartGroup;
                        f = 0.0f;
                    } else {
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_xsmall, composerStartRestartGroup, 0));
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_small, composerStartRestartGroup, 0));
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2022504335, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackbarScreenKt$SnackBarScreen$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) throws Resources.NotFoundException {
                                String strStringResource;
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2022504335, i10, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackBarScreen.<anonymous>.<anonymous> (SnackbarScreen.kt:54)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                SlipOneClickSnackBarViewDuxo4 slipOneClickSnackBarViewDuxo4 = viewState;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion5);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                if (slipOneClickSnackBarViewDuxo4 instanceof SlipOneClickSnackBarViewDuxo4.Success) {
                                    composer3.startReplaceGroup(-2144869250);
                                    strStringResource = StringResources_androidKt.stringResource(C28532R.string.stock_lending_oneclick_success, new Object[]{StringResources6.getText(((SlipOneClickSnackBarViewDuxo4.Success) slipOneClickSnackBarViewDuxo4).getAccountDisplayName().getShort().getTitle(), composer3, StringResource.$stable)}, composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-2144620599);
                                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composer3, 0);
                                    composer3.endReplaceGroup();
                                }
                                String str = strStringResource;
                                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C13997R.drawable.svg_ic_checkmark_24dp, composer3, 0), str, (Modifier) null, 0L, composer3, 0, 12);
                                TextKt.m6028Text4IGK_g(str, PaddingKt.m5144paddingVpY3zN4$default(companion5, PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.rds_spacing_small, composer3, 0), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131068);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        modifier4 = modifier3;
                        i5 = 0;
                        i4 = i3;
                        continuation2 = null;
                        companion2 = companion4;
                        i6 = 1;
                        f = 0.0f;
                        SnackbarKt.m5963SnackbareQBnUkQ(modifierM5142padding3ABfNKs, null, null, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, 0L, 0L, 0L, 0L, composableLambdaRememberComposableLambda, composerStartRestartGroup, 805306368, 494);
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    i7 = 6;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, f, i6, continuation2), C2002Dp.m7995constructorimpl(56)), composer2, 6);
                    composer2.endNode();
                } else {
                    i4 = i3;
                    modifier4 = modifier3;
                    continuation2 = null;
                    i5 = 0;
                    i6 = 1;
                    i7 = 6;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                composer2.startReplaceGroup(-1633490746);
                i8 = (composer2.changed(function1Component2) ? 1 : 0) | ((i4 & 112) != 32 ? i6 : i5);
                objRememberedValue3 = composer2.rememberedValue();
                if (i8 == 0 || objRememberedValue3 == companion.getEmpty()) {
                    onDisappear = function0;
                    objRememberedValue3 = new SnackbarScreen4(function1Component2, onDisappear, continuation2);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    onDisappear = function0;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SnackbarScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SnackbarScreen.SnackBarScreen$lambda$4(viewState, onDisappear, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            zBooleanValue = ((Boolean) snapshotState2.component1()).booleanValue();
            function1Component2 = snapshotState2.component2();
            composerStartRestartGroup.startReplaceGroup(813541562);
            if (viewState instanceof SlipOneClickSnackBarViewDuxo4.Success) {
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    Unit unit3 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(function1Component2) | ((i3 & 112) != 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        continuation = null;
                        objRememberedValue2 = new SnackbarScreen2(function1Component2, onDisappear, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1277889482);
                        if (zBooleanValue) {
                        }
                        composer2.endReplaceGroup();
                        i7 = 6;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, f, i6, continuation2), C2002Dp.m7995constructorimpl(56)), composer2, 6);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        Unit unit22 = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        i8 = (composer2.changed(function1Component2) ? 1 : 0) | ((i4 & 112) != 32 ? i6 : i5);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (i8 == 0) {
                            onDisappear = function0;
                            objRememberedValue3 = new SnackbarScreen4(function1Component2, onDisappear, continuation2);
                            composer2.updateRememberedValue(objRememberedValue3);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i7);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier5 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
