package com.robinhood.android.acatsin.coowner.review;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState5;
import com.robinhood.android.acatsin.review.ReviewAcatsInComposable3;
import com.robinhood.android.acatsin.review.ReviewAcatsInViewState;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInCoOwnerReviewComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a[\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"CancelSheetTestTag", "", "AcatsInCoOwnerReviewComposable", "", "viewState", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "onContinueClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState$Loaded;", "onAssetsClicked", "Ljava/util/UUID;", "onCancelAcatRequestClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats-in-coowner_externalDebug", "showCancelSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewComposable {
    public static final String CancelSheetTestTag = "cancel_sheet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInCoOwnerReviewComposable$lambda$12(AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsInCoOwnerReviewComposable(acatsInCoOwnerReviewState5, function1, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsInCoOwnerReviewComposable(final AcatsInCoOwnerReviewState5 viewState, final Function1<? super AcatsInCoOwnerReviewState5.Loaded, Unit> onContinueClicked, final Function1<? super UUID, Unit> onAssetsClicked, final Function1<? super AcatsInCoOwnerReviewState5.Loaded, Unit> onCancelAcatRequestClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onAssetsClicked, "onAssetsClicked");
        Intrinsics.checkNotNullParameter(onCancelAcatRequestClicked, "onCancelAcatRequestClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1500377678);
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
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAssetsClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCancelAcatRequestClicked) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(1500377678, i3, -1, "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposable (AcatsInCoOwnerReviewComposable.kt:41)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!(viewState instanceof AcatsInCoOwnerReviewState5.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-1673879322);
                    LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(158089488, true, new AcatsInCoOwnerReviewComposable2(viewState), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    if (!(viewState instanceof AcatsInCoOwnerReviewState5.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(-885279857);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1673391599);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    ReviewAcatsInViewState reviewViewState = ((AcatsInCoOwnerReviewState5.Loaded) viewState).getReviewViewState();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i5 = i3 & 14;
                    boolean z = ((i3 & 112) == 32) | (i5 == 4);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable$lambda$11$lambda$4$lambda$3(onContinueClicked, viewState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable$lambda$11$lambda$6$lambda$5(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = ((i3 & 896) == 256) | (i5 == 4);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable$lambda$11$lambda$8$lambda$7(onAssetsClicked, viewState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    ReviewAcatsInComposable3.ReviewAcatsInComposable(reviewViewState, function0, function02, (Function0) objRememberedValue4, null, composerStartRestartGroup, ReviewAcatsInViewState.$stable | 384, 16);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (AcatsInCoOwnerReviewComposable$lambda$11$lambda$1(snapshotState)) {
                        SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CancelSheetTestTag);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable$lambda$11$lambda$10$lambda$9(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue5, modifierTestTag, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-1931961757, true, new AcatsInCoOwnerReviewComposable3(viewState, onCancelAcatRequestClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1572918, 52);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable$lambda$12(viewState, onContinueClicked, onAssetsClicked, onCancelAcatRequestClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!(viewState instanceof AcatsInCoOwnerReviewState5.Loading)) {
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AcatsInCoOwnerReviewComposable$lambda$11$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInCoOwnerReviewComposable$lambda$11$lambda$4$lambda$3(Function1 function1, AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5) {
        function1.invoke(acatsInCoOwnerReviewState5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInCoOwnerReviewComposable$lambda$11$lambda$6$lambda$5(SnapshotState snapshotState) {
        AcatsInCoOwnerReviewComposable$lambda$11$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInCoOwnerReviewComposable$lambda$11$lambda$8$lambda$7(Function1 function1, AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5) {
        function1.invoke(((AcatsInCoOwnerReviewState5.Loaded) acatsInCoOwnerReviewState5).getAcatsId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInCoOwnerReviewComposable$lambda$11$lambda$10$lambda$9(SnapshotState snapshotState) {
        AcatsInCoOwnerReviewComposable$lambda$11$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final boolean AcatsInCoOwnerReviewComposable$lambda$11$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
