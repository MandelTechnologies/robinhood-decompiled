package com.robinhood.shared.crypto.staking.staking.receipt;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable3;
import com.robinhood.shared.staking.contracts.CryptoStakingHistoryDetailFragmentKey;
import com.robinhood.shared.staking.contracts.CryptoStakingSummaryFragmentKey;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoStakingReceiptComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"CryptoStakingReceiptComposable", "", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReceiptContent", "state", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "onDone", "Lkotlin/Function0;", "onOpenTransactionDetails", "Lkotlin/Function1;", "Ljava/util/UUID;", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingReceiptComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$9(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Screen screen, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(uiCryptoStakingOrderModel, screen, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingReceiptComposable$lambda$0(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoStakingReceiptComposable(uiCryptoStakingOrderModel, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiptContent$lambda$3(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Screen screen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReceiptContent(uiCryptoStakingOrderModel, screen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingReceiptComposable(final UiCryptoStakingOrderModel order, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(order, "order");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2145576375);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(order) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-2145576375, i3, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable (CryptoStakingReceiptComposable.kt:51)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Activity activity = !(context instanceof Activity) ? (Activity) context : null;
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Screen.Name name = Screen.Name.CRYPTO_STAKING_ORDER_CONFIRMATION;
                String string2 = order.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                if (order.getOrderType() != ApiCryptoStakingOrder.OrderType.DEPOSIT) {
                    str = "staking";
                } else {
                    str = "unstaking";
                }
                final Screen screen = new Screen(name, str, string2, null, 8, null);
                modifier3 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-716709356, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-716709356, i5, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous> (CryptoStakingReceiptComposable.kt:65)");
                        }
                        final Modifier modifier5 = modifier3;
                        final UiCryptoStakingOrderModel uiCryptoStakingOrderModel = order;
                        final Navigator navigator2 = navigator;
                        final Context context2 = context;
                        final Screen screen2 = screen;
                        final Activity activity2 = activity;
                        GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(450690754, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(450690754, i6, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:66)");
                                }
                                Modifier modifier6 = modifier5;
                                final UiCryptoStakingOrderModel uiCryptoStakingOrderModel2 = uiCryptoStakingOrderModel;
                                final Navigator navigator3 = navigator2;
                                final Context context3 = context2;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1117165434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1117165434, i7, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:69)");
                                        }
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoStakingReceiptComposable.INSTANCE.getLambda$776577587$feature_crypto_staking_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(-935006040, true, new C506931(uiCryptoStakingOrderModel2, navigator3, context3), composer4, 54), null, false, false, null, null, 0L, null, composer4, 3078, 0, 2038);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: CryptoStakingReceiptComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C506931 implements Function3<Row5, Composer, Integer, Unit> {
                                        final /* synthetic */ Context $context;
                                        final /* synthetic */ Navigator $navigator;
                                        final /* synthetic */ UiCryptoStakingOrderModel $order;

                                        C506931(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Navigator navigator, Context context) {
                                            this.$order = uiCryptoStakingOrderModel;
                                            this.$navigator = navigator;
                                            this.$context = context;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) throws Resources.NotFoundException {
                                            invoke(row5, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-935006040, i, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:72)");
                                            }
                                            String strStringResource = StringResources_androidKt.stringResource(C37760R.string.crypto_staking_view_staking, new Object[]{this.$order.getCurrencyCode()}, composer, 0);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$order);
                                            final Navigator navigator = this.$navigator;
                                            final Context context = this.$context;
                                            final UiCryptoStakingOrderModel uiCryptoStakingOrderModel = this.$order;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.C506921.C506931.invoke$lambda$1$lambda$0(navigator, context, uiCryptoStakingOrderModel);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, ClickableKt.m4893clickableXHw0xAI$default(modifierM5144paddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, UiCryptoStakingOrderModel uiCryptoStakingOrderModel) {
                                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new CryptoStakingSummaryFragmentKey(uiCryptoStakingOrderModel.getCurrencyPairId()), false, false, false, false, null, false, null, null, 1020, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54);
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(25182151, true, new AnonymousClass2(uiCryptoStakingOrderModel, screen2, activity2, navigator2, context2), composer3, 54);
                                final UiCryptoStakingOrderModel uiCryptoStakingOrderModel3 = uiCryptoStakingOrderModel;
                                final Screen screen3 = screen2;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1390764783, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i7 & 6) == 0) {
                                            i7 |= composer4.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1390764783, i7, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:91)");
                                        }
                                        CryptoStakingReceiptComposable3.ReceiptContent(uiCryptoStakingOrderModel3, screen3, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306800, 504);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoStakingReceiptComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Activity $activity;
                                final /* synthetic */ Context $context;
                                final /* synthetic */ Screen $eventScreen;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ UiCryptoStakingOrderModel $order;

                                AnonymousClass2(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Screen screen, Activity activity, Navigator navigator, Context context) {
                                    this.$order = uiCryptoStakingOrderModel;
                                    this.$eventScreen = screen;
                                    this.$activity = activity;
                                    this.$navigator = navigator;
                                    this.$context = context;
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
                                        ComposerKt.traceEventStart(25182151, i, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:98)");
                                    }
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null));
                                    UiCryptoStakingOrderModel uiCryptoStakingOrderModel = this.$order;
                                    Screen screen = this.$eventScreen;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$activity);
                                    final Activity activity = this.$activity;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(activity);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(navigator, context, (UUID) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoStakingReceiptComposable3.BottomBar(uiCryptoStakingOrderModel, screen, function0, (Function1) objRememberedValue2, modifierNavigationBarsPadding, composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context, UUID yieldId) {
                                    Intrinsics.checkNotNullParameter(yieldId, "yieldId");
                                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new CryptoStakingHistoryDetailFragmentKey(yieldId), false, false, false, false, null, false, null, null, 1020, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), composer2, 24576, 15);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReceiptComposable3.CryptoStakingReceiptComposable$lambda$0(order, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Activity activity2 = !(context2 instanceof Activity) ? (Activity) context2 : null;
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Screen.Name name2 = Screen.Name.CRYPTO_STAKING_ORDER_CONFIRMATION;
            String string22 = order.getCurrencyPairId().toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            if (order.getOrderType() != ApiCryptoStakingOrder.OrderType.DEPOSIT) {
            }
            final Screen screen2 = new Screen(name2, str, string22, null, 8, null);
            modifier3 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-716709356, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-716709356, i5, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous> (CryptoStakingReceiptComposable.kt:65)");
                    }
                    final Modifier modifier5 = modifier3;
                    final UiCryptoStakingOrderModel uiCryptoStakingOrderModel = order;
                    final Navigator navigator22 = navigator2;
                    final Context context22 = context2;
                    final Screen screen22 = screen2;
                    final Activity activity22 = activity2;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(450690754, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(450690754, i6, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:66)");
                            }
                            Modifier modifier6 = modifier5;
                            final UiCryptoStakingOrderModel uiCryptoStakingOrderModel2 = uiCryptoStakingOrderModel;
                            final Navigator navigator3 = navigator22;
                            final Context context3 = context22;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1117165434, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1117165434, i7, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:69)");
                                    }
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoStakingReceiptComposable.INSTANCE.getLambda$776577587$feature_crypto_staking_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(-935006040, true, new C506931(uiCryptoStakingOrderModel2, navigator3, context3), composer4, 54), null, false, false, null, null, 0L, null, composer4, 3078, 0, 2038);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoStakingReceiptComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C506931 implements Function3<Row5, Composer, Integer, Unit> {
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ Navigator $navigator;
                                    final /* synthetic */ UiCryptoStakingOrderModel $order;

                                    C506931(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Navigator navigator, Context context) {
                                        this.$order = uiCryptoStakingOrderModel;
                                        this.$navigator = navigator;
                                        this.$context = context;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) throws Resources.NotFoundException {
                                        invoke(row5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) throws Resources.NotFoundException {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-935006040, i, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:72)");
                                        }
                                        String strStringResource = StringResources_androidKt.stringResource(C37760R.string.crypto_staking_view_staking, new Object[]{this.$order.getCurrencyCode()}, composer, 0);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$order);
                                        final Navigator navigator = this.$navigator;
                                        final Context context = this.$context;
                                        final UiCryptoStakingOrderModel uiCryptoStakingOrderModel = this.$order;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.C506921.C506931.invoke$lambda$1$lambda$0(navigator, context, uiCryptoStakingOrderModel);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, ClickableKt.m4893clickableXHw0xAI$default(modifierM5144paddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, UiCryptoStakingOrderModel uiCryptoStakingOrderModel) {
                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new CryptoStakingSummaryFragmentKey(uiCryptoStakingOrderModel.getCurrencyPairId()), false, false, false, false, null, false, null, null, 1020, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(25182151, true, new AnonymousClass2(uiCryptoStakingOrderModel, screen22, activity22, navigator22, context22), composer3, 54);
                            final UiCryptoStakingOrderModel uiCryptoStakingOrderModel3 = uiCryptoStakingOrderModel;
                            final Screen screen3 = screen22;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1390764783, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt.CryptoStakingReceiptComposable.1.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                    invoke(paddingValues, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i7 & 6) == 0) {
                                        i7 |= composer4.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1390764783, i7, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:91)");
                                    }
                                    CryptoStakingReceiptComposable3.ReceiptContent(uiCryptoStakingOrderModel3, screen3, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 805306800, 504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoStakingReceiptComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Activity $activity;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Screen $eventScreen;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ UiCryptoStakingOrderModel $order;

                            AnonymousClass2(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Screen screen, Activity activity, Navigator navigator, Context context) {
                                this.$order = uiCryptoStakingOrderModel;
                                this.$eventScreen = screen;
                                this.$activity = activity;
                                this.$navigator = navigator;
                                this.$context = context;
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
                                    ComposerKt.traceEventStart(25182151, i, -1, "com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingReceiptComposable.kt:98)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null));
                                UiCryptoStakingOrderModel uiCryptoStakingOrderModel = this.$order;
                                Screen screen = this.$eventScreen;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$activity);
                                final Activity activity = this.$activity;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(activity);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$CryptoStakingReceiptComposable$1$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoStakingReceiptComposable3.C378591.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(navigator, context, (UUID) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                CryptoStakingReceiptComposable3.BottomBar(uiCryptoStakingOrderModel, screen, function0, (Function1) objRememberedValue2, modifierNavigationBarsPadding, composer, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                                if (activity != null) {
                                    activity.finish();
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context, UUID yieldId) {
                                Intrinsics.checkNotNullParameter(yieldId, "yieldId");
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new CryptoStakingHistoryDetailFragmentKey(yieldId), false, false, false, false, null, false, null, null, 1020, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 24576, 15);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReceiptContent(final UiCryptoStakingOrderModel state, final Screen eventScreen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String title;
        Composer composer2;
        List<UIComponent<GenericAction>> confirmationComponents;
        final Modifier modifier3;
        ComponentCallbacks2 componentCallbacks2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1001718215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1001718215, i3, -1, "com.robinhood.shared.crypto.staking.staking.receipt.ReceiptContent (CryptoStakingReceiptComposable.kt:125)");
                }
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), new UserInteractionEventDescriptor(null, eventScreen, null, null, null, null, 61, null));
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierAlign = column6.align(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion.getCenterHorizontally());
                title = state.getTitle();
                if (title == null) {
                    title = "";
                }
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                FontWeight w500 = companion4.getW500();
                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk = companion5.m7919getCentere0LSkKk();
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, modifierAlign, Color.m6701boximpl(jM21425getFg0d7_KjU), null, w500, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 805330944, 0, 7592);
                Modifier modifierAlign2 = column6.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), companion.getCenterHorizontally());
                String subtitle = state.getSubtitle();
                String str = subtitle != null ? subtitle : "";
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                BentoText2.m20747BentoText38GnDrw(str, modifierAlign2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, companion4.getW400(), null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8104);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                confirmationComponents = state.getConfirmationComponents();
                composer2.startReplaceGroup(-476868718);
                if (confirmationComponents != null) {
                    Iterator<T> it = confirmationComponents.iterator();
                    while (it.hasNext()) {
                        final UIComponent uIComponent = (UIComponent) it.next();
                        final HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        composer2.startReplaceGroup(655834815);
                        final Modifier.Companion companion6 = Modifier.INSTANCE;
                        ProvidedValue<Class<?>> providedValueProvides = UtilKt.getLocalActionClass().provides(GenericAction.class);
                        AutoLoggingCompositionLocals4 localEventLogger = AutoLoggingCompositionLocals.getLocalEventLogger();
                        Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        if (context instanceof Application) {
                            componentCallbacks2 = (Application) context;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            componentCallbacks2 = (Application) applicationContext;
                        }
                        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, localEventLogger.provides(((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).eventLogger())}, ComposableLambda3.rememberComposableLambda(1969517439, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$ReceiptContent$lambda$2$lambda$1$$inlined$InlineSduiComponent$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1969517439, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.InlineSduiComponent.<anonymous> (SduiComponent.kt:385)");
                                }
                                SduiComponent3.SduiComponent(uIComponent, companion6, horizontalPadding, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReceiptComposable3.ReceiptContent$lambda$3(state, eventScreen, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), new UserInteractionEventDescriptor(null, eventScreen, null, null, null, null, 61, null));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
            Alignment.Companion companion7 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion7.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierAlign3 = column62.align(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion7.getCenterHorizontally());
                title = state.getTitle();
                if (title == null) {
                }
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                FontWeight.Companion companion42 = FontWeight.INSTANCE;
                FontWeight w5002 = companion42.getW500();
                TextAlign.Companion companion52 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk2 = companion52.m7919getCentere0LSkKk();
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, modifierAlign3, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, w5002, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 2, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 805330944, 0, 7592);
                Modifier modifierAlign22 = column62.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), companion7.getCenterHorizontally());
                String subtitle2 = state.getSubtitle();
                if (subtitle2 != null) {
                }
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
                BentoText2.m20747BentoText38GnDrw(str, modifierAlign22, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, companion42.getW400(), null, TextAlign.m7912boximpl(companion52.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 24576, 0, 8104);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer2, i52).m21592getMediumD9Ej5fM()), composer2, 0);
                confirmationComponents = state.getConfirmationComponents();
                composer2.startReplaceGroup(-476868718);
                if (confirmationComponents != null) {
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBar(final UiCryptoStakingOrderModel uiCryptoStakingOrderModel, final Screen screen, final Function0<Unit> function0, final Function1<? super UUID, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EventLogger current;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(369962297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uiCryptoStakingOrderModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(369962297, i3, -1, "com.robinhood.shared.crypto.staking.staking.receipt.BottomBar (CryptoStakingReceiptComposable.kt:177)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier5 = modifier4;
                String disclaimer = uiCryptoStakingOrderModel.getDisclaimer();
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C37760R.string.staking_confirmation_view_details, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((i3 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingReceiptComposable3.BottomBar$lambda$8$lambda$5$lambda$4(current, screen, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(uiCryptoStakingOrderModel);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingReceiptComposable3.BottomBar$lambda$8$lambda$7$lambda$6(current, screen, function1, uiCryptoStakingOrderModel);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(null, disclaimer, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer2, 0, 0, 59197);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingReceiptComposable3.BottomBar$lambda$9(uiCryptoStakingOrderModel, screen, function0, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier52 = modifier4;
                String disclaimer2 = uiCryptoStakingOrderModel.getDisclaimer();
                String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                String strStringResource22 = StringResources_androidKt.stringResource(C37760R.string.staking_confirmation_view_details, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((i3 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingReceiptComposable3.BottomBar$lambda$8$lambda$5$lambda$4(current, screen, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function022 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(uiCryptoStakingOrderModel);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoStakingReceiptComposable3.BottomBar$lambda$8$lambda$7$lambda$6(current, screen, function1, uiCryptoStakingOrderModel);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoButtonBar2.BentoButtonBar(null, disclaimer2, null, false, null, null, function022, strStringResource3, false, null, false, (Function0) objRememberedValue2, strStringResource22, false, null, false, composer2, 0, 0, 59197);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$8$lambda$5$lambda$4(EventLogger eventLogger, Screen screen, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, screen, new Component(Component.ComponentType.BUTTON, "done", null, 4, null), null, null, null, null, 120, null), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$8$lambda$7$lambda$6(EventLogger eventLogger, Screen screen, Function1 function1, UiCryptoStakingOrderModel uiCryptoStakingOrderModel) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, screen, new Component(Component.ComponentType.BUTTON, "view details", null, 4, null), null, null, null, null, 120, null), false, false, 6, null);
        function1.invoke(uiCryptoStakingOrderModel.getId());
        return Unit.INSTANCE;
    }
}
