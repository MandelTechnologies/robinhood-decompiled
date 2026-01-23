package com.robinhood.android.acats.plaid.transfer.partial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState;
import com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsPlaidPartialTransferComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000f2'\u0010\u0015\u001a#\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u001d\u001a1\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010!¨\u0006\""}, m3636d2 = {"AcatsPlaidPartialTransferComposable", "", "viewState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "confirmationBottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "onBack", "Lkotlin/Function0;", "onEditClose", "onEditComplete", "onCancelRemoval", "onShowUnsupportedAssets", "onFilterClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "onRowClicked", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "onRemoveAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "onConfirmRemove", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isSwipe", "onAssetEditComplete", "hasSubZero", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;Landroidx/compose/material/ModalBottomSheetState;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "AcatsPlaidPartialTransferTopAppBar", "onBackPressed", "onClosePressed", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferComposable$lambda$0(AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, ModalBottomSheetState modalBottomSheetState, AcatsInScreenContext acatsInScreenContext, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14, boolean z, int i, int i2, Composer composer, int i3) {
        AcatsPlaidPartialTransferComposable(acatsPlaidPartialTransferViewState, modalBottomSheetState, acatsInScreenContext, function0, function02, function03, function04, function05, function1, function12, function13, function2, function14, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferTopAppBar$lambda$1(AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferTopAppBar(acatsPlaidPartialTransferViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void AcatsPlaidPartialTransferComposable(final AcatsPlaidPartialTransferViewState viewState, final ModalBottomSheetState confirmationBottomSheetState, final AcatsInScreenContext screenContext, final Function0<Unit> onBack, final Function0<Unit> onEditClose, final Function0<Unit> onEditComplete, final Function0<Unit> onCancelRemoval, final Function0<Unit> onShowUnsupportedAssets, final Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> onFilterClicked, final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> onRowClicked, final Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onRemoveAsset, final Function2<? super AcatsPlaidPartialTransferAssetRowData, ? super Boolean, Unit> onConfirmRemove, final Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onAssetEditComplete, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(confirmationBottomSheetState, "confirmationBottomSheetState");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onEditClose, "onEditClose");
        Intrinsics.checkNotNullParameter(onEditComplete, "onEditComplete");
        Intrinsics.checkNotNullParameter(onCancelRemoval, "onCancelRemoval");
        Intrinsics.checkNotNullParameter(onShowUnsupportedAssets, "onShowUnsupportedAssets");
        Intrinsics.checkNotNullParameter(onFilterClicked, "onFilterClicked");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Intrinsics.checkNotNullParameter(onRemoveAsset, "onRemoveAsset");
        Intrinsics.checkNotNullParameter(onConfirmRemove, "onConfirmRemove");
        Intrinsics.checkNotNullParameter(onAssetEditComplete, "onAssetEditComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(1526872604);
        if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(confirmationBottomSheetState) : composerStartRestartGroup.changedInstance(confirmationBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(screenContext) : composerStartRestartGroup.changedInstance(screenContext) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditClose) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditComplete) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCancelRemoval) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowUnsupportedAssets) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFilterClicked) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onRemoveAsset) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onConfirmRemove) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onAssetEditComplete) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (i6 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1526872604, i5, i6, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable (AcatsPlaidPartialTransferComposable.kt:41)");
            }
            composer2 = composerStartRestartGroup;
            ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(ComposableLambda3.rememberComposableLambda(-691817014, true, new C74681(viewState, ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources(), onRemoveAsset, onCancelRemoval), composerStartRestartGroup, 54), null, confirmationBottomSheetState, false, null, 0.0f, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-890713213, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt.AcatsPlaidPartialTransferComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-890713213, i7, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous> (AcatsPlaidPartialTransferComposable.kt:46)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                    final AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState = viewState;
                    final Function0<Unit> function0 = onBack;
                    final Function0<Unit> function02 = onEditClose;
                    ScaffoldKt.m5625Scaffold27mzLpw(modifierNavigationBarsPadding, null, ComposableLambda3.rememberComposableLambda(1127829064, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt.AcatsPlaidPartialTransferComposable.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i9) {
                            if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1127829064, i9, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous>.<anonymous> (AcatsPlaidPartialTransferComposable.kt:51)");
                            }
                            AcatsPlaidPartialTransferComposable.AcatsPlaidPartialTransferTopAppBar(acatsPlaidPartialTransferViewState, function0, function02, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(119840833, true, new AnonymousClass2(viewState, onFilterClicked, onShowUnsupportedAssets, onRowClicked, onEditComplete, onConfirmRemove, screenContext, onAssetEditComplete, z), composer3, 54), composer3, 384, 12582912, 32762);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AcatsPlaidPartialTransferComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ boolean $hasSubZero;
                    final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo3, Unit> $onAssetEditComplete;
                    final /* synthetic */ Function2<AcatsPlaidPartialTransferAssetRowData, Boolean, Unit> $onConfirmRemove;
                    final /* synthetic */ Function0<Unit> $onEditComplete;
                    final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo6, Unit> $onFilterClicked;
                    final /* synthetic */ Function1<AcatsPlaidPartialTransferAssetRowData, Unit> $onRowClicked;
                    final /* synthetic */ Function0<Unit> $onShowUnsupportedAssets;
                    final /* synthetic */ AcatsInScreenContext $screenContext;
                    final /* synthetic */ AcatsPlaidPartialTransferViewState $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Function0<Unit> function0, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function12, Function0<Unit> function02, Function2<? super AcatsPlaidPartialTransferAssetRowData, ? super Boolean, Unit> function2, AcatsInScreenContext acatsInScreenContext, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function13, boolean z) {
                        this.$viewState = acatsPlaidPartialTransferViewState;
                        this.$onFilterClicked = function1;
                        this.$onShowUnsupportedAssets = function0;
                        this.$onRowClicked = function12;
                        this.$onEditComplete = function02;
                        this.$onConfirmRemove = function2;
                        this.$screenContext = acatsInScreenContext;
                        this.$onAssetEditComplete = function13;
                        this.$hasSubZero = z;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(119840833, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous>.<anonymous> (AcatsPlaidPartialTransferComposable.kt:58)");
                        }
                        AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState = this.$viewState;
                        if (acatsPlaidPartialTransferViewState instanceof AcatsPlaidPartialTransferViewState.Ready) {
                            composer.startReplaceGroup(1060581264);
                            if (((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getEditAssetState() == null) {
                                composer.startReplaceGroup(1060622587);
                                AcatsPlaidPartialTransferUiState uiState = ((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getUiState();
                                AcatsPlaidPartialTransferDuxo6 filterState = ((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getFilterState();
                                boolean allowDeletion = ((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getAllowDeletion();
                                Function1<AcatsPlaidPartialTransferDuxo6, Unit> function1 = this.$onFilterClicked;
                                Function0<Unit> function0 = this.$onShowUnsupportedAssets;
                                Function1<AcatsPlaidPartialTransferAssetRowData, Unit> function12 = this.$onRowClicked;
                                Function0<Unit> function02 = this.$onEditComplete;
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$onConfirmRemove);
                                final Function2<AcatsPlaidPartialTransferAssetRowData, Boolean, Unit> function2 = this.$onConfirmRemove;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AcatsPlaidPartialTransferComposable.C74692.AnonymousClass2.invoke$lambda$1$lambda$0(function2, (AcatsPlaidPartialTransferAssetRowData) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable(uiState, filterState, function1, function0, function12, function02, (Function1) objRememberedValue, allowDeletion, composer, 0);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(1061360914);
                                AcatsPlaidPartialTransferAssetRowData editAssetState = ((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getEditAssetState();
                                boolean allowDeletion2 = ((AcatsPlaidPartialTransferViewState.Ready) this.$viewState).getAllowDeletion();
                                AcatsInScreenContext acatsInScreenContext = this.$screenContext;
                                Function1<AcatsPlaidPartialTransferDuxo3, Unit> function13 = this.$onAssetEditComplete;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composer.changed(this.$onConfirmRemove) | composer.changedInstance(this.$viewState);
                                final Function2<AcatsPlaidPartialTransferAssetRowData, Boolean, Unit> function22 = this.$onConfirmRemove;
                                final AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState2 = this.$viewState;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AcatsPlaidPartialTransferComposable.C74692.AnonymousClass2.invoke$lambda$3$lambda$2(function22, acatsPlaidPartialTransferViewState2, (AcatsPlaidPartialTransferDuxo3) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditComposable(editAssetState, allowDeletion2, acatsInScreenContext, function13, (Function1) objRememberedValue2, this.$hasSubZero, null, composer, AcatsInScreenContext.$stable << 6, 64);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                        } else {
                            if (!(acatsPlaidPartialTransferViewState instanceof AcatsPlaidPartialTransferViewState.Loading)) {
                                composer.startReplaceGroup(-797073585);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(1062073139);
                            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1159564366, true, new AnonymousClass3(this.$viewState), composer, 54), composer, 3078, 6);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, AcatsPlaidPartialTransferAssetRowData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function2.invoke(it, Boolean.TRUE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(Function2 function2, AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, AcatsPlaidPartialTransferDuxo3 it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function2.invoke(((AcatsPlaidPartialTransferViewState.Ready) acatsPlaidPartialTransferViewState).getEditAssetState(), Boolean.FALSE);
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AcatsPlaidPartialTransferComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ AcatsPlaidPartialTransferViewState $viewState;

                        AnonymousClass3(AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState) {
                            this.$viewState = acatsPlaidPartialTransferViewState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1159564366, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferComposable.kt:89)");
                            }
                            AcatsPlaidPartialTransferUiState uiState = ((AcatsPlaidPartialTransferViewState.Loading) this.$viewState).getMock().getUiState();
                            AcatsPlaidPartialTransferDuxo6 filterState = ((AcatsPlaidPartialTransferViewState.Loading) this.$viewState).getMock().getFilterState();
                            boolean allowDeletion = ((AcatsPlaidPartialTransferViewState.Loading) this.$viewState).getMock().getAllowDeletion();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AcatsPlaidPartialTransferComposable.C74692.AnonymousClass2.AnonymousClass3.invoke$lambda$1$lambda$0((AcatsPlaidPartialTransferDuxo6) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AcatsPlaidPartialTransferComposable.C74692.AnonymousClass2.AnonymousClass3.invoke$lambda$5$lambda$4((AcatsPlaidPartialTransferAssetRowData) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function12 = (Function1) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            Function0 function02 = (Function0) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$2$2$3$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AcatsPlaidPartialTransferComposable.C74692.AnonymousClass2.AnonymousClass3.invoke$lambda$9$lambda$8((AcatsPlaidPartialTransferAssetRowData) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            composer.endReplaceGroup();
                            AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable(uiState, filterState, function1, function0, function12, function02, (Function1) objRememberedValue5, allowDeletion, composer, 1797504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AcatsPlaidPartialTransferDuxo6 it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(AcatsPlaidPartialTransferAssetRowData it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$9$lambda$8(AcatsPlaidPartialTransferAssetRowData it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }
                    }
                }
            }, composer2, 54), composer2, (ModalBottomSheetState.$stable << 6) | 805306374 | ((i5 << 3) & 896), 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferComposable.AcatsPlaidPartialTransferComposable$lambda$0(viewState, confirmationBottomSheetState, screenContext, onBack, onEditClose, onEditComplete, onCancelRemoval, onShowUnsupportedAssets, onFilterClicked, onRowClicked, onRemoveAsset, onConfirmRemove, onAssetEditComplete, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsPlaidPartialTransferComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$1 */
    static final class C74681 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onCancelRemoval;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo3, Unit> $onRemoveAsset;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ AcatsPlaidPartialTransferViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C74681(AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, Resources resources, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function1, Function0<Unit> function0) {
            this.$viewState = acatsPlaidPartialTransferViewState;
            this.$resources = resources;
            this.$onRemoveAsset = function1;
            this.$onCancelRemoval = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 ModalBottomSheetLayout, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691817014, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous> (AcatsPlaidPartialTransferComposable.kt:105)");
            }
            final AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState = this.$viewState.getRemoveAssetConfirmationState();
            if (removeAssetConfirmationState != null) {
                Resources resources = this.$resources;
                final Function1<AcatsPlaidPartialTransferDuxo3, Unit> function1 = this.$onRemoveAsset;
                Function0<Unit> function0 = this.$onCancelRemoval;
                int i2 = C7376R.string.acats_plaid_partial_transfer_removal_title;
                StringResource stringResourceAssetName = AcatsPlaidPartialTransferDuxo4.assetName(removeAssetConfirmationState);
                Intrinsics.checkNotNull(resources);
                String strStringResource = StringResources_androidKt.stringResource(i2, new Object[]{stringResourceAssetName.getText(resources)}, composer, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_removal_body, composer, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_removal_confirm, composer, 0);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(removeAssetConfirmationState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$AcatsPlaidPartialTransferComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferComposable.C74681.invoke$lambda$2$lambda$1$lambda$0(function1, removeAssetConfirmationState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue);
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_removal_cancel, composer, 0), function0);
                int i3 = BentoAlertButton.$stable;
                BentoAlertSheet.BentoAlertSheet(strStringResource, strStringResource2, bentoAlertButton, bentoAlertButton2, null, null, composer, (i3 << 6) | (i3 << 9), 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3) {
            function1.invoke(acatsPlaidPartialTransferDuxo3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferTopAppBar(final AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(104555244);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(acatsPlaidPartialTransferViewState) : composerStartRestartGroup.changedInstance(acatsPlaidPartialTransferViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(104555244, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferTopAppBar (AcatsPlaidPartialTransferComposable.kt:131)");
            }
            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1828507161, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt.AcatsPlaidPartialTransferTopAppBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1828507161, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferTopAppBar.<anonymous> (AcatsPlaidPartialTransferComposable.kt:157)");
                    }
                    StringResource toolbarTitle = acatsPlaidPartialTransferViewState.getToolbarTitle();
                    Resources resources2 = resources;
                    Intrinsics.checkNotNull(resources2);
                    BentoText2.m20747BentoText38GnDrw(toolbarTitle.getText(resources2).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1692024211, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt.AcatsPlaidPartialTransferTopAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i4 = ((i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1692024211, i4, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferTopAppBar.<anonymous> (AcatsPlaidPartialTransferComposable.kt:135)");
                    }
                    AcatsPlaidPartialTransferViewState acatsPlaidPartialTransferViewState2 = acatsPlaidPartialTransferViewState;
                    if (acatsPlaidPartialTransferViewState2 instanceof AcatsPlaidPartialTransferViewState.Loading) {
                        composer3.startReplaceGroup(-1356982766);
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(acatsPlaidPartialTransferViewState2 instanceof AcatsPlaidPartialTransferViewState.Ready)) {
                            composer3.startReplaceGroup(1757339536);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-1356780584);
                        if (((AcatsPlaidPartialTransferViewState.Ready) acatsPlaidPartialTransferViewState).getEditAssetState() != null) {
                            composer3.startReplaceGroup(-1356728225);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1356573566);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1914);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferComposable.AcatsPlaidPartialTransferTopAppBar$lambda$1(acatsPlaidPartialTransferViewState, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
