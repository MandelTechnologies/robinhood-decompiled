package com.robinhood.android.transfers;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.p065ui.CardNetworkTypes;
import com.robinhood.android.debitcard.strings.ApiDebitCardInstruments;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.transfers.DebitCardsComposable;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DebitCardsComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u000e*\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"DebitCardsComposable", "", "debitCards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "overlayStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "onDebitCardRowClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoBaseRowState", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.DebitCardsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DebitCardsComposable {

    /* compiled from: DebitCardsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.DebitCardsComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentInstrumentStatus.values().length];
            try {
                iArr[PaymentInstrumentStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentInstrumentStatus.PENDING_KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentInstrumentStatus.PENDING_KYC_UNDER_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentInstrumentStatus.MANUAL_REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentInstrumentStatus.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentInstrumentStatus.PENDING_VERIFICATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentInstrumentStatus.NEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentInstrumentStatus.DELETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentInstrumentStatus.DISABLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentInstrumentStatus.DISABLED_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentInstrumentStatus.FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentInstrumentStatus.PENDING_ACTIVATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentInstrumentStatus.PENDING_DELETION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentInstrumentStatus.VERIFIED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentInstrumentStatus.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebitCardsComposable$lambda$0(ImmutableList immutableList, Observable observable, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DebitCardsComposable(immutableList, observable, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void DebitCardsComposable(final ImmutableList<ApiPaymentInstrument> debitCards, final Observable<ThemesFromScarlet> overlayStream, final Function1<? super ApiPaymentInstrument, Unit> onDebitCardRowClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(debitCards, "debitCards");
        Intrinsics.checkNotNullParameter(overlayStream, "overlayStream");
        Intrinsics.checkNotNullParameter(onDebitCardRowClick, "onDebitCardRowClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-621508271);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(debitCards) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(overlayStream) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDebitCardRowClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621508271, i3, -1, "com.robinhood.android.transfers.DebitCardsComposable (DebitCardsComposable.kt:26)");
            }
            BentoTheme2.BentoTheme(overlayStream, null, ComposableLambda3.rememberComposableLambda(-285468577, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.DebitCardsComposableKt.DebitCardsComposable.1

                /* compiled from: DebitCardsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.DebitCardsComposableKt$DebitCardsComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ImmutableList<ApiPaymentInstrument> $debitCards;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function1<ApiPaymentInstrument, Unit> $onDebitCardRowClick;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Modifier modifier, ImmutableList<ApiPaymentInstrument> immutableList, Function1<? super ApiPaymentInstrument, Unit> function1) {
                        this.$modifier = modifier;
                        this.$debitCards = immutableList;
                        this.$onDebitCardRowClick = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, ApiPaymentInstrument apiPaymentInstrument) {
                        function1.invoke(apiPaymentInstrument);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        Composer composer2 = composer;
                        if ((i & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1353421428, i, -1, "com.robinhood.android.transfers.DebitCardsComposable.<anonymous>.<anonymous> (DebitCardsComposable.kt:31)");
                        }
                        Modifier modifier = this.$modifier;
                        ImmutableList<ApiPaymentInstrument> immutableList = this.$debitCards;
                        final Function1<ApiPaymentInstrument, Unit> function1 = this.$onDebitCardRowClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(1363827792);
                        for (final ApiPaymentInstrument apiPaymentInstrument : immutableList) {
                            BentoBaseRowState bentoBaseRowState = DebitCardsComposable.toBentoBaseRowState(apiPaymentInstrument, composer2, 0);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged = composer2.changed(function1) | composer2.changedInstance(apiPaymentInstrument);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.DebitCardsComposableKt$DebitCardsComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return DebitCardsComposable.C300451.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function1, apiPaymentInstrument);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), bentoBaseRowState, false, false, false, 0L, null, composer2, BentoBaseRowState.$stable << 3, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composer2 = composer;
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

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
                        ComposerKt.traceEventStart(-285468577, i5, -1, "com.robinhood.android.transfers.DebitCardsComposable.<anonymous> (DebitCardsComposable.kt:30)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1353421428, true, new AnonymousClass1(modifier3, debitCards, onDebitCardRowClick), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.DebitCardsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DebitCardsComposable.DebitCardsComposable$lambda$0(debitCards, overlayStream, onDebitCardRowClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoBaseRowState toBentoBaseRowState(ApiPaymentInstrument apiPaymentInstrument, Composer composer, int i) throws Resources.NotFoundException {
        Color colorM6701boximpl;
        composer.startReplaceGroup(2094310086);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2094310086, i, -1, "com.robinhood.android.transfers.toBentoBaseRowState (DebitCardsComposable.kt:49)");
        }
        ApiPaymentInstrumentDetails payment_instrument_details = apiPaymentInstrument.getPayment_instrument_details();
        Intrinsics.checkNotNull(payment_instrument_details, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails.DebitCard");
        ApiPaymentInstrumentDetails.DebitCard debitCard = (ApiPaymentInstrumentDetails.DebitCard) payment_instrument_details;
        String strStringResource = StringResources_androidKt.stringResource(CardNetworkTypes.getStringResource(debitCard.getCard_network_type()), composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C9631R.string.debit_card_secondary_text, new Object[]{debitCard.getLast4()}, composer, 0);
        String strStringResource3 = StringResources_androidKt.stringResource(ApiDebitCardInstruments.getStatusRes(apiPaymentInstrument), composer, 0);
        switch (WhenMappings.$EnumSwitchMapping$0[apiPaymentInstrument.getPayment_instrument_status().ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1707648914);
                long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
                colorM6701boximpl = Color.m6701boximpl(jM21456getPositive0d7_KjU);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                composer.startReplaceGroup(-1707638162);
                long jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
                colorM6701boximpl = Color.m6701boximpl(jM21452getNegative0d7_KjU);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                composer.startReplaceGroup(-1396679593);
                composer.endReplaceGroup();
                colorM6701boximpl = null;
                break;
            default:
                composer.startReplaceGroup(-1707651912);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, strStringResource, strStringResource2, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.CallToAction(strStringResource3, colorM6701boximpl, null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }
}
