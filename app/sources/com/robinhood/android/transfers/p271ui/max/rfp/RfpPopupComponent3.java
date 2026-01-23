package com.robinhood.android.transfers.p271ui.max.rfp;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.transfers.p271ui.max.rfp.RfpPopupComponent3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.RfpContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RfpPopupComponent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"RfpPopupComponent", "", "content", "Lcom/robinhood/models/api/bonfire/transfer/ApiPreCreateTransferSduiContainer;", DirectDepositBrokerageExperimentPage.SDUI_CONTENT, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "themeStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "onDismissRequest", "Lkotlin/Function0;", "onPrimaryButtonSelected", "onSecondaryButtonSelected", "(Lcom/robinhood/models/api/bonfire/transfer/ApiPreCreateTransferSduiContainer;Lkotlinx/collections/immutable/ImmutableList;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-transfers_externalRelease", "requestingRfpTransfer", "requestingStandardTransfer", "enableRfp", "enableStandard"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RfpPopupComponent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RfpPopupComponent$lambda$12(ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer, ImmutableList immutableList, Observable observable, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        RfpPopupComponent(apiPreCreateTransferSduiContainer, immutableList, observable, function1, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RfpPopupComponent(final ApiPreCreateTransferSduiContainer content, final ImmutableList<? extends UIComponent<? extends GenericAction>> sduiContent, final Observable<ThemesFromScarlet> themeStream, final Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, final Function0<Unit> onDismissRequest, final Function0<Unit> onPrimaryButtonSelected, final Function0<Unit> onSecondaryButtonSelected, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(sduiContent, "sduiContent");
        Intrinsics.checkNotNullParameter(themeStream, "themeStream");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onPrimaryButtonSelected, "onPrimaryButtonSelected");
        Intrinsics.checkNotNullParameter(onSecondaryButtonSelected, "onSecondaryButtonSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(227942314);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiContent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(themeStream) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(confirmValueChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonSelected) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonSelected) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(227942314, i3, -1, "com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponent (RfpPopupComponent.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(themeStream, null, ComposableLambda3.rememberComposableLambda(1815344568, true, new C309811(confirmValueChange, onDismissRequest, sduiContent, content, onPrimaryButtonSelected, snapshotState, snapshotState3, snapshotState2, (SnapshotState) objRememberedValue4, onSecondaryButtonSelected), composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RfpPopupComponent3.RfpPopupComponent$lambda$12(content, sduiContent, themeStream, confirmValueChange, onDismissRequest, onPrimaryButtonSelected, onSecondaryButtonSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RfpPopupComponent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RfpPopupComponent$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RfpPopupComponent$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: RfpPopupComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1 */
    static final class C309811 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmValueChange;
        final /* synthetic */ ApiPreCreateTransferSduiContainer $content;
        final /* synthetic */ SnapshotState<Boolean> $enableRfp$delegate;
        final /* synthetic */ SnapshotState<Boolean> $enableStandard$delegate;
        final /* synthetic */ Function0<Unit> $onDismissRequest;
        final /* synthetic */ Function0<Unit> $onPrimaryButtonSelected;
        final /* synthetic */ Function0<Unit> $onSecondaryButtonSelected;
        final /* synthetic */ SnapshotState<Boolean> $requestingRfpTransfer$delegate;
        final /* synthetic */ SnapshotState<Boolean> $requestingStandardTransfer$delegate;
        final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $sduiContent;

        /* JADX WARN: Multi-variable type inference failed */
        C309811(Function1<? super ModalBottomSheetValue, Boolean> function1, Function0<Unit> function0, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer, Function0<Unit> function02, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Boolean> snapshotState4, Function0<Unit> function03) {
            this.$confirmValueChange = function1;
            this.$onDismissRequest = function0;
            this.$sduiContent = immutableList;
            this.$content = apiPreCreateTransferSduiContainer;
            this.$onPrimaryButtonSelected = function02;
            this.$requestingRfpTransfer$delegate = snapshotState;
            this.$enableRfp$delegate = snapshotState2;
            this.$requestingStandardTransfer$delegate = snapshotState3;
            this.$enableStandard$delegate = snapshotState4;
            this.$onSecondaryButtonSelected = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1$lambda$0(SystemUiController systemUiController, long j, Function1 function1, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
            return ((Boolean) function1.invoke(it)).booleanValue();
        }

        /* compiled from: RfpPopupComponent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ ApiPreCreateTransferSduiContainer $content;
            final /* synthetic */ long $dismissStatusBarColor;
            final /* synthetic */ SnapshotState<Boolean> $enableRfp$delegate;
            final /* synthetic */ SnapshotState<Boolean> $enableStandard$delegate;
            final /* synthetic */ Function0<Unit> $onDismissRequest;
            final /* synthetic */ Function0<Unit> $onPrimaryButtonSelected;
            final /* synthetic */ Function0<Unit> $onSecondaryButtonSelected;
            final /* synthetic */ SnapshotState<Boolean> $requestingRfpTransfer$delegate;
            final /* synthetic */ SnapshotState<Boolean> $requestingStandardTransfer$delegate;
            final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $sduiContent;
            final /* synthetic */ ModalBottomSheetState $sheetState;
            final /* synthetic */ SystemUiController $systemUiController;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(SystemUiController systemUiController, long j, Function0<Unit> function0, ModalBottomSheetState modalBottomSheetState, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer, Function0<Unit> function02, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Boolean> snapshotState4, Function0<Unit> function03) {
                this.$systemUiController = systemUiController;
                this.$dismissStatusBarColor = j;
                this.$onDismissRequest = function0;
                this.$sheetState = modalBottomSheetState;
                this.$sduiContent = immutableList;
                this.$content = apiPreCreateTransferSduiContainer;
                this.$onPrimaryButtonSelected = function02;
                this.$requestingRfpTransfer$delegate = snapshotState;
                this.$enableRfp$delegate = snapshotState2;
                this.$requestingStandardTransfer$delegate = snapshotState3;
                this.$enableStandard$delegate = snapshotState4;
                this.$onSecondaryButtonSelected = function03;
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
                    ComposerKt.traceEventStart(1602656845, i, -1, "com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponent.<anonymous>.<anonymous> (RfpPopupComponent.kt:64)");
                }
                DialogProperties dialogProperties = new DialogProperties(true, false, null, false, false, 6, null);
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(this.$systemUiController) | composer.changed(this.$dismissStatusBarColor) | composer.changed(this.$onDismissRequest);
                final SystemUiController systemUiController = this.$systemUiController;
                final long j = this.$dismissStatusBarColor;
                final Function0<Unit> function0 = this.$onDismissRequest;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RfpPopupComponent3.C309811.AnonymousClass1.invoke$lambda$1$lambda$0(systemUiController, j, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                final ImmutableList<UIComponent<GenericAction>> immutableList = this.$sduiContent;
                final ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer = this.$content;
                final Function0<Unit> function03 = this.$onPrimaryButtonSelected;
                final SnapshotState<Boolean> snapshotState = this.$requestingRfpTransfer$delegate;
                final SnapshotState<Boolean> snapshotState2 = this.$enableRfp$delegate;
                final SnapshotState<Boolean> snapshotState3 = this.$requestingStandardTransfer$delegate;
                final SnapshotState<Boolean> snapshotState4 = this.$enableStandard$delegate;
                final Function0<Unit> function04 = this.$onSecondaryButtonSelected;
                AndroidDialog_androidKt.Dialog(function02, dialogProperties, ComposableLambda3.rememberComposableLambda(-750928618, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt.RfpPopupComponent.1.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-750928618, i2, -1, "com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponent.<anonymous>.<anonymous>.<anonymous> (RfpPopupComponent.kt:75)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                        long jM21464getScrimColor0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21464getScrimColor0d7_KjU();
                        ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(ComposableLambda3.rememberComposableLambda(1407288616, true, new C506251(immutableList, apiPreCreateTransferSduiContainer, function03, snapshotState, snapshotState2, snapshotState3, snapshotState4, function04), composer2, 54), modifierNavigationBarsPadding, modalBottomSheetState, false, null, 0.0f, Color.INSTANCE.m6727getWhite0d7_KjU(), 0L, jM21464getScrimColor0d7_KjU, RfpPopupComponent.INSTANCE.m19916getLambda$927543409$feature_transfers_externalRelease(), composer2, (ModalBottomSheetState.$stable << 6) | 806879238, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RfpPopupComponent.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    static final class C506251 implements Function3<Column5, Composer, Integer, Unit> {
                        final /* synthetic */ ApiPreCreateTransferSduiContainer $content;
                        final /* synthetic */ SnapshotState<Boolean> $enableRfp$delegate;
                        final /* synthetic */ SnapshotState<Boolean> $enableStandard$delegate;
                        final /* synthetic */ Function0<Unit> $onPrimaryButtonSelected;
                        final /* synthetic */ Function0<Unit> $onSecondaryButtonSelected;
                        final /* synthetic */ SnapshotState<Boolean> $requestingRfpTransfer$delegate;
                        final /* synthetic */ SnapshotState<Boolean> $requestingStandardTransfer$delegate;
                        final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $sduiContent;

                        /* JADX WARN: Multi-variable type inference failed */
                        C506251(ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Boolean> snapshotState4, Function0<Unit> function02) {
                            this.$sduiContent = immutableList;
                            this.$content = apiPreCreateTransferSduiContainer;
                            this.$onPrimaryButtonSelected = function0;
                            this.$requestingRfpTransfer$delegate = snapshotState;
                            this.$enableRfp$delegate = snapshotState2;
                            this.$requestingStandardTransfer$delegate = snapshotState3;
                            this.$enableStandard$delegate = snapshotState4;
                            this.$onSecondaryButtonSelected = function02;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                            invoke(column5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3) {
                            if (!RfpPopupComponent3.RfpPopupComponent$lambda$1(snapshotState) && !RfpPopupComponent3.RfpPopupComponent$lambda$4(snapshotState2)) {
                                RfpPopupComponent3.RfpPopupComponent$lambda$2(snapshotState, true);
                                function0.invoke();
                                RfpPopupComponent3.RfpPopupComponent$lambda$11(snapshotState3, false);
                            }
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 ModalBottomSheetLayout, Composer composer, int i) {
                            Modifier.Companion companion;
                            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1407288616, i, -1, "com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RfpPopupComponent.kt:81)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), null, false, 3, null), Color.INSTANCE.m6727getWhite0d7_KjU(), null, 2, null);
                            ImmutableList<UIComponent<GenericAction>> immutableList = this.$sduiContent;
                            composer.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierM4872backgroundbw27NRU$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, 100663680, 0);
                            composer.endReplaceGroup();
                            RfpContent rfpContent = this.$content.getRfpContent();
                            String primaryButtonText = rfpContent != null ? rfpContent.getPrimaryButtonText() : null;
                            composer.startReplaceGroup(-510322623);
                            if (primaryButtonText == null) {
                                companion = companion2;
                            } else {
                                ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer = this.$content;
                                final Function0<Unit> function0 = this.$onPrimaryButtonSelected;
                                final SnapshotState<Boolean> snapshotState = this.$requestingRfpTransfer$delegate;
                                SnapshotState<Boolean> snapshotState2 = this.$enableRfp$delegate;
                                final SnapshotState<Boolean> snapshotState3 = this.$requestingStandardTransfer$delegate;
                                final SnapshotState<Boolean> snapshotState4 = this.$enableStandard$delegate;
                                ServerToBentoAssetMapper2.Companion companion3 = ServerToBentoAssetMapper2.INSTANCE;
                                RfpContent rfpContent2 = apiPreCreateTransferSduiContainer.getRfpContent();
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion3.fromServerValue(rfpContent2 != null ? rfpContent2.getPrimaryButtonIcon() : null);
                                BentoButtons.Icon.Size16 size16 = serverToBentoAssetMapper2FromServerValue != null ? new BentoButtons.Icon.Size16(serverToBentoAssetMapper2FromServerValue, null, 2, null) : null;
                                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                boolean zRfpPopupComponent$lambda$1 = RfpPopupComponent3.RfpPopupComponent$lambda$1(snapshotState);
                                boolean zRfpPopupComponent$lambda$7 = RfpPopupComponent3.RfpPopupComponent$lambda$7(snapshotState2);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                String str = primaryButtonText;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged = composer.changed(function0);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$1$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RfpPopupComponent3.C309811.AnonymousClass1.AnonymousClass2.C506251.invoke$lambda$3$lambda$2$lambda$1(function0, snapshotState, snapshotState3, snapshotState4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                companion = companion2;
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str, modifierFillMaxWidth$default, size16, type2, zRfpPopupComponent$lambda$7, zRfpPopupComponent$lambda$1, null, null, null, null, false, null, composer, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 8064);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            RfpContent rfpContent3 = this.$content.getRfpContent();
                            String secondaryButtonText = rfpContent3 != null ? rfpContent3.getSecondaryButtonText() : null;
                            if (secondaryButtonText != null) {
                                final Function0<Unit> function02 = this.$onSecondaryButtonSelected;
                                final SnapshotState<Boolean> snapshotState5 = this.$requestingStandardTransfer$delegate;
                                SnapshotState<Boolean> snapshotState6 = this.$enableStandard$delegate;
                                final SnapshotState<Boolean> snapshotState7 = this.$requestingRfpTransfer$delegate;
                                final SnapshotState<Boolean> snapshotState8 = this.$enableRfp$delegate;
                                BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                                boolean zRfpPopupComponent$lambda$4 = RfpPopupComponent3.RfpPopupComponent$lambda$4(snapshotState5);
                                boolean zRfpPopupComponent$lambda$10 = RfpPopupComponent3.RfpPopupComponent$lambda$10(snapshotState6);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 5, null), 0.0f, 1, null);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged2 = composer.changed(function02);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$1$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RfpPopupComponent3.C309811.AnonymousClass1.AnonymousClass2.C506251.invoke$lambda$6$lambda$5$lambda$4(function02, snapshotState7, snapshotState5, snapshotState8);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, secondaryButtonText, modifierFillMaxWidth$default2, null, type3, zRfpPopupComponent$lambda$10, zRfpPopupComponent$lambda$4, null, null, null, null, false, null, composer, 24576, 0, 8072);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3) {
                            if (!RfpPopupComponent3.RfpPopupComponent$lambda$1(snapshotState) && !RfpPopupComponent3.RfpPopupComponent$lambda$4(snapshotState2)) {
                                RfpPopupComponent3.RfpPopupComponent$lambda$5(snapshotState2, true);
                                function0.invoke();
                                RfpPopupComponent3.RfpPopupComponent$lambda$8(snapshotState3, false);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composer, 54), composer, 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SystemUiController systemUiController, long j, Function0 function0) {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1815344568, i, -1, "com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponent.<anonymous> (RfpPopupComponent.kt:52)");
            }
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer, 0, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, bentoTheme.getColors(composer, i2).m21464getScrimColor0d7_KjU(), false, null, 6, null);
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(systemUiControllerRememberSystemUiController) | composer.changed(jM21371getBg0d7_KjU) | composer.changed(this.$confirmValueChange);
            final Function1<ModalBottomSheetValue, Boolean> function1 = this.$confirmValueChange;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.rfp.RfpPopupComponentKt$RfpPopupComponent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(RfpPopupComponent3.C309811.invoke$lambda$1$lambda$0(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, function1, (ModalBottomSheetValue) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1602656845, true, new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, this.$onDismissRequest, new ModalBottomSheetState(modalBottomSheetValue, density, (Function1) objRememberedValue, null, false, 24, null), this.$sduiContent, this.$content, this.$onPrimaryButtonSelected, this.$requestingRfpTransfer$delegate, this.$enableRfp$delegate, this.$requestingStandardTransfer$delegate, this.$enableStandard$delegate, this.$onSecondaryButtonSelected), composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RfpPopupComponent$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RfpPopupComponent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RfpPopupComponent$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RfpPopupComponent$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RfpPopupComponent$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
