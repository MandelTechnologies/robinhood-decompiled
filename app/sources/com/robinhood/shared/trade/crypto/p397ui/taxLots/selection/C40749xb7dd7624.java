package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.info.CryptoTaxLotMicrogramInfoActivity;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.AlertDialogType;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.C40749xb7dd7624;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionTapAction;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
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
import kotlin.reflect.KFunction;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1 */
/* loaded from: classes12.dex */
final class C40749xb7dd7624 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<AlertDialogType> $alertDialogType$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ CryptoTaxLotSelectionDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState4<CryptoTaxLotSelectionViewState> $viewState$delegate;

    C40749xb7dd7624(FocusManager focusManager, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Navigator navigator, Context context, SnapshotState4<CryptoTaxLotSelectionViewState> snapshotState4, EventLogger eventLogger, Screen screen, SnapshotState<AlertDialogType> snapshotState) {
        this.$focusManager = focusManager;
        this.$duxo = cryptoTaxLotSelectionDuxo;
        this.$navigator = navigator;
        this.$context = context;
        this.$viewState$delegate = snapshotState4;
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$alertDialogType$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
        invoke(bentoNumpadScopeV2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1073442373, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:78)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$duxo);
        final FocusManager focusManager = this.$focusManager;
        final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo = this.$duxo;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40749xb7dd7624.invoke$lambda$2$lambda$1(focusManager, cryptoTaxLotSelectionDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxSize$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
        final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo2 = this.$duxo;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(260508417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1.3
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
                    ComposerKt.traceEventStart(260508417, i2, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:89)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function2<Composer, Integer, Unit> function2M26017getLambda$1316131724$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoTaxLotSelectionComposableKt.INSTANCE.m26017getLambda$1316131724$feature_trade_crypto_externalDebug();
                final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo3 = cryptoTaxLotSelectionDuxo2;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M26017getLambda$1316131724$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-996180320, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable.2.1.3.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i3 & 6) == 0) {
                            i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i3 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-996180320, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:93)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotSelectionComposableKt.getCRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG());
                        CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo4 = cryptoTaxLotSelectionDuxo3;
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer3.changedInstance(cryptoTaxLotSelectionDuxo4);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new C40750x55613f5a(cryptoTaxLotSelectionDuxo4);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) ((KFunction) objRememberedValue3), composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), ComposableLambda3.rememberComposableLambda(-391688673, true, new AnonymousClass2(navigator, context), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3510, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: CryptoTaxLotSelectionComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ Navigator $navigator;

                AnonymousClass2(Navigator navigator, Context context) {
                    this.$navigator = navigator;
                    this.$context = context;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                    invoke(row5, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-391688673, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:99)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$3$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C40749xb7dd7624.AnonymousClass3.AnonymousClass2.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(SemanticsModifier6.semantics$default(modifierM5146paddingqDBjuR0$default, false, (Function1) objRememberedValue, 1, null), CryptoTaxLotSelectionComposableKt.getCRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                    final Navigator navigator = this.$navigator;
                    final Context context = this.$context;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$3$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C40749xb7dd7624.AnonymousClass3.AnonymousClass2.invoke$lambda$3$lambda$2(navigator, context);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context) {
                    Navigator.DefaultImpls.startActivity$default(navigator, context, CryptoTaxLotMicrogramInfoActivity.CryptoTaxLotMicrogramInfoIntentKey.INSTANCE, null, false, null, null, 60, null);
                    return Unit.INSTANCE;
                }
            }
        }, composer, 54);
        final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo3 = this.$duxo;
        final SnapshotState4<CryptoTaxLotSelectionViewState> snapshotState4 = this.$viewState$delegate;
        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierM4891clickableO2vRcR0$default, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(992683872, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1.4
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
                    ComposerKt.traceEventStart(992683872, i2, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:127)");
                }
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotSelectionComposableKt.getCRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG());
                CryptoTaxLotSelectionFooterState footerState = CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable$lambda$1(snapshotState4).getFooterState();
                CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo4 = cryptoTaxLotSelectionDuxo3;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(cryptoTaxLotSelectionDuxo4);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C40751x6e29a18e(cryptoTaxLotSelectionDuxo4);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooter(footerState, (Function0) ((KFunction) objRememberedValue3), modifierTestTag, composer2, StringResource.$stable | 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1709996458, true, new AnonymousClass5(this.$duxo, this.$focusManager, this.$eventLogger, this.$eventScreen, this.$viewState$delegate, this.$alertDialogType$delegate), composer, 54), composer, 805306800, 504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(FocusManager focusManager, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo) {
        focusManager.clearFocus(true);
        cryptoTaxLotSelectionDuxo.onInputFieldFocused(null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$5, reason: invalid class name */
    static final class AnonymousClass5 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<AlertDialogType> $alertDialogType$delegate;
        final /* synthetic */ CryptoTaxLotSelectionDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Screen $eventScreen;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ SnapshotState4<CryptoTaxLotSelectionViewState> $viewState$delegate;

        AnonymousClass5(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, FocusManager focusManager, EventLogger eventLogger, Screen screen, SnapshotState4<CryptoTaxLotSelectionViewState> snapshotState4, SnapshotState<AlertDialogType> snapshotState) {
            this.$duxo = cryptoTaxLotSelectionDuxo;
            this.$focusManager = focusManager;
            this.$eventLogger = eventLogger;
            this.$eventScreen = screen;
            this.$viewState$delegate = snapshotState4;
            this.$alertDialogType$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1709996458, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:134)");
            }
            CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewStateCryptoTaxLotSelectionComposable$lambda$1 = CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable$lambda$1(this.$viewState$delegate);
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, it);
            CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(cryptoTaxLotSelectionDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C40752x6e37b90f(cryptoTaxLotSelectionDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo2 = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(cryptoTaxLotSelectionDuxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C40753x6e37bcd0(cryptoTaxLotSelectionDuxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo3 = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(cryptoTaxLotSelectionDuxo3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C40754x6e37c091(cryptoTaxLotSelectionDuxo3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            Function0 function0 = (Function0) kFunction;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$duxo);
            final FocusManager focusManager = this.$focusManager;
            final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo4 = this.$duxo;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C40749xb7dd7624.AnonymousClass5.invoke$lambda$4$lambda$3(focusManager, cryptoTaxLotSelectionDuxo4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function1 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance5 = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$duxo);
            final FocusManager focusManager2 = this.$focusManager;
            final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo5 = this.$duxo;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C40749xb7dd7624.AnonymousClass5.invoke$lambda$6$lambda$5(focusManager2, cryptoTaxLotSelectionDuxo5, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function2 function2 = (Function2) objRememberedValue5;
            composer.endReplaceGroup();
            Function1 function12 = (Function1) kFunction2;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance6 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$eventScreen;
            final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo6 = this.$duxo;
            final SnapshotState<AlertDialogType> snapshotState = this.$alertDialogType$delegate;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$5$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C40749xb7dd7624.AnonymousClass5.invoke$lambda$8$lambda$7(eventLogger, screen, cryptoTaxLotSelectionDuxo6, snapshotState, (CryptoTaxLotSelectionTapAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            CryptoTaxLotSelectionComposableKt.MainContent(cryptoTaxLotSelectionViewStateCryptoTaxLotSelectionComposable$lambda$1, function0, function1, function2, function12, (Function1) objRememberedValue6, (Function0) kFunction3, modifierPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(FocusManager focusManager, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            focusManager.clearFocus(true);
            cryptoTaxLotSelectionDuxo.onInputFieldFocused(null);
            cryptoTaxLotSelectionDuxo.onHeaderClicked(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(FocusManager focusManager, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, String id, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            focusManager.clearFocus(true);
            cryptoTaxLotSelectionDuxo.onInputFieldFocused(null);
            cryptoTaxLotSelectionDuxo.onCheckBoxClicked(id, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(EventLogger eventLogger, Screen screen, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, SnapshotState snapshotState, CryptoTaxLotSelectionTapAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof CryptoTaxLotSelectionTapAction.ShowDismissableAlert) {
                CryptoTaxLotSelectionTapAction.ShowDismissableAlert showDismissableAlert = (CryptoTaxLotSelectionTapAction.ShowDismissableAlert) it;
                snapshotState.setValue(new AlertDialogType.DismissableAlert(showDismissableAlert.getDismissableAlert().getTitle(), showDismissableAlert.getDismissableAlert().getBody(), showDismissableAlert.getDismissableAlert().getAnalytics_identifier()));
            } else {
                if (!(it instanceof CryptoTaxLotSelectionTapAction.ShowTransferredInBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "transferred_info", null, 4, null), null, null, false, 57, null);
                cryptoTaxLotSelectionDuxo.showTransferredInBottomSheet();
            }
            return Unit.INSTANCE;
        }
    }
}
