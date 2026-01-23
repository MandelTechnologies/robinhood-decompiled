package com.robinhood.android.acats.plaid.transfer.unsupported;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt;
import com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AcatsInPlaidUnsupportedAssetsComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u001b\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"AcatsInPlaidUnsupportedAssetsComposable", "", "state", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsViewState;", "onLearnMore", "Lkotlin/Function0;", "onDone", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "sharesSection", "Landroidx/compose/foundation/lazy/LazyListScope;", "equityAssets", "", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/EquityAsset;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "formatShares", "", "Ljava/math/BigDecimal;", "scale", "(Ljava/math/BigDecimal;ILandroidx/compose/runtime/Composer;II)Ljava/lang/String;", "PreviewFormatShares", "(Landroidx/compose/runtime/Composer;I)V", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInPlaidUnsupportedAssetsComposable$lambda$0(AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsInPlaidUnsupportedAssetsComposable(acatsInPlaidUnsupportedAssetsViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFormatShares$lambda$3(int i, Composer composer, int i2) {
        PreviewFormatShares(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsInPlaidUnsupportedAssetsComposable(final AcatsInPlaidUnsupportedAssetsViewState state, final Function0<Unit> onLearnMore, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(1231246148);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMore) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1231246148, i3, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable (AcatsInPlaidUnsupportedAssetsComposable.kt:41)");
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-826004177, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt.AcatsInPlaidUnsupportedAssetsComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-826004177, i5, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:130)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, composer2, 0, 1);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                        BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer2, 0, 0, 8056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-325304996, true, new C76402(onLearnMore, state, DateTimeFormatter.ofPattern("MM/dd/yyyy")), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsInPlaidUnsupportedAssetsComposable.AcatsInPlaidUnsupportedAssetsComposable$lambda$0(state, onLearnMore, onDone, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-826004177, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt.AcatsInPlaidUnsupportedAssetsComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-826004177, i5, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:130)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, composer2, 0, 1);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer2, 0, 0, 8056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-325304996, true, new C76402(onLearnMore, state, DateTimeFormatter.ofPattern("MM/dd/yyyy")), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AcatsInPlaidUnsupportedAssetsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2 */
    static final class C76402 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ DateTimeFormatter $dateFormatter;
        final /* synthetic */ Function0<Unit> $onLearnMore;
        final /* synthetic */ AcatsInPlaidUnsupportedAssetsViewState $state;

        C76402(Function0<Unit> function0, AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState, DateTimeFormatter dateTimeFormatter) {
            this.$onLearnMore = function0;
            this.$state = acatsInPlaidUnsupportedAssetsViewState;
            this.$dateFormatter = dateTimeFormatter;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325304996, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:46)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onLearnMore) | composer.changed(this.$state) | composer.changedInstance(this.$dateFormatter);
            final AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState = this.$state;
            final Function0<Unit> function0 = this.$onLearnMore;
            final DateTimeFormatter dateTimeFormatter = this.$dateFormatter;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsInPlaidUnsupportedAssetsComposable.C76402.invoke$lambda$4$lambda$3(acatsInPlaidUnsupportedAssetsViewState, function0, dateTimeFormatter, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(final AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState, final Function0 function0, final DateTimeFormatter dateTimeFormatter, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-116732185, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-116732185, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:51)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_unsupported_assets_message, composer, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_unsupported_assets_message_link, composer, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                    TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                    int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                    BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource, strStringResource2, function0, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), jM21425getFg0d7_KjU, 0L, textM, iM7924getStarte0LSkKk, composer, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            if (acatsInPlaidUnsupportedAssetsViewState.getMargin() != null) {
                LazyListScope.item$default(LazyColumn, null, null, AcatsInPlaidUnsupportedAssetsComposable4.INSTANCE.getLambda$2114967084$lib_acats_plaid_externalDebug(), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(816258261, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(816258261, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:71)");
                        }
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C7686R.string.acats_in_cash_input_margin_row_text, composer, 0), null, null, new BentoBaseRowState.Meta.SingleLine(Format2.format(acatsInPlaidUnsupportedAssetsViewState.getMargin())), null, false, false, false, 0L, null, composer, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            AcatsInPlaidUnsupportedAssetsComposable.sharesSection(LazyColumn, acatsInPlaidUnsupportedAssetsViewState.getStocksAndEtfs(), C7686R.string.acats_in_build_partial_equity_header);
            if (!acatsInPlaidUnsupportedAssetsViewState.getFractionalShares().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, AcatsInPlaidUnsupportedAssetsComposable4.INSTANCE.m10672getLambda$1037963563$lib_acats_plaid_externalDebug(), 3, null);
                final List<EquityAsset> fractionalShares = acatsInPlaidUnsupportedAssetsViewState.getFractionalShares();
                final C7623xa0a01b19 c7623xa0a01b19 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(EquityAsset equityAsset) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((EquityAsset) obj);
                    }
                };
                LazyColumn.items(fractionalShares.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7623xa0a01b19.invoke(fractionalShares.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        EquityAsset equityAsset = (EquityAsset) fractionalShares.get(i);
                        composer.startReplaceGroup(411196270);
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, equityAsset.getName(), null, null, new BentoBaseRowState.Meta.SingleLine(AcatsInPlaidUnsupportedAssetsComposable.formatShares(equityAsset.getQuantity(), 6, composer, 48, 0)), null, false, false, false, 0L, null, composer, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            AcatsInPlaidUnsupportedAssetsComposable.sharesSection(LazyColumn, acatsInPlaidUnsupportedAssetsViewState.getMutualFunds(), C7376R.string.acats_plaid_mutual_funds_title);
            if (!acatsInPlaidUnsupportedAssetsViewState.getOptions().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, AcatsInPlaidUnsupportedAssetsComposable4.INSTANCE.m10673getLambda$513157452$lib_acats_plaid_externalDebug(), 3, null);
                final List<OptionAsset> options = acatsInPlaidUnsupportedAssetsViewState.getOptions();
                final C7630xa0a01b1d c7630xa0a01b1d = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(OptionAsset optionAsset) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((OptionAsset) obj);
                    }
                };
                LazyColumn.items(options.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7630xa0a01b1d.invoke(options.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws Resources.NotFoundException {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        OptionAsset optionAsset = (OptionAsset) options.get(i);
                        composer.startReplaceGroup(-1282055852);
                        Intrinsics.checkNotNull(dateTimeFormatter);
                        UnsupportedOptionsRowComposable.UnsupportedOptionsRowComposable(optionAsset, dateTimeFormatter, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!acatsInPlaidUnsupportedAssetsViewState.getFixedIncome().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, AcatsInPlaidUnsupportedAssetsComposable4.INSTANCE.getLambda$11648659$lib_acats_plaid_externalDebug(), 3, null);
                final List<EquityAsset> fixedIncome = acatsInPlaidUnsupportedAssetsViewState.getFixedIncome();
                final C7634xa0a01b21 c7634xa0a01b21 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(EquityAsset equityAsset) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((EquityAsset) obj);
                    }
                };
                LazyColumn.items(fixedIncome.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7634xa0a01b21.invoke(fixedIncome.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$AcatsInPlaidUnsupportedAssetsComposable$2$invoke$lambda$4$lambda$3$$inlined$items$default$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        EquityAsset equityAsset = (EquityAsset) fixedIncome.get(i);
                        composer.startReplaceGroup(2046995238);
                        String name = equityAsset.getName();
                        Currency currency = Currency.getInstance("USD");
                        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, name, null, null, new BentoBaseRowState.Meta.SingleLine(Money.format$default(new Money(currency, new BigDecimal(equityAsset.getQuantity().toString())), null, false, null, false, 0, null, false, null, false, false, 1023, null)), null, false, false, false, 0L, null, composer, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            AcatsInPlaidUnsupportedAssetsComposable.sharesSection(LazyColumn, acatsInPlaidUnsupportedAssetsViewState.getOtherEquityAsset(), C7376R.string.acats_plaid_other_title);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sharesSection(LazyListScope lazyListScope, final List<EquityAsset> list, final int i) {
        if (list.isEmpty()) {
            return;
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1675261810, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt.sharesSection.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1675261810, i2, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.sharesSection.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:146)");
                }
                AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle(StringResources_androidKt.stringResource(i, composer, 0), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final C7635xaf565d3 c7635xaf565d3 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$sharesSection$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(EquityAsset equityAsset) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((EquityAsset) obj);
            }
        };
        lazyListScope.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$sharesSection$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return c7635xaf565d3.invoke(list.get(i2));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$sharesSection$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                EquityAsset equityAsset = (EquityAsset) list.get(i2);
                composer.startReplaceGroup(1808700450);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, equityAsset.getName(), null, null, new BentoBaseRowState.Meta.SingleLine(AcatsInPlaidUnsupportedAssetsComposable.formatShares(equityAsset.getQuantity(), 0, composer, 0, 1)), null, false, false, false, 0L, null, composer, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatShares(BigDecimal bigDecimal, int i, Composer composer, int i2, int i3) throws Resources.NotFoundException {
        composer.startReplaceGroup(-1399602612);
        int i4 = 1;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1399602612, i2, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.formatShares (AcatsInPlaidUnsupportedAssetsComposable.kt:160)");
        }
        int i5 = C7376R.plurals.shares;
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            i4 = 0;
        } else if (bigDecimal.compareTo(BigDecimal.ONE) != 0) {
            i4 = 2;
        }
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(i5, i4, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal.setScale(i, RoundingMode.HALF_UP)).toPlainString()}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strPluralStringResource;
    }

    private static final void PreviewFormatShares(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1774486747);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1774486747, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.PreviewFormatShares (AcatsInPlaidUnsupportedAssetsComposable.kt:172)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            BasicTextKt.m5334BasicTextRWo7tUw(formatShares(ZERO, 0, composerStartRestartGroup, 0, 1), (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1022);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BasicTextKt.m5334BasicTextRWo7tUw(formatShares(ONE, 0, composerStartRestartGroup, 0, 1), (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1022);
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BasicTextKt.m5334BasicTextRWo7tUw(formatShares(ONE, 6, composerStartRestartGroup, 48, 0), (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1022);
            BasicTextKt.m5334BasicTextRWo7tUw(formatShares(new BigDecimal("0.2"), 6, composerStartRestartGroup, 48, 0), (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1022);
            BasicTextKt.m5334BasicTextRWo7tUw(formatShares(new BigDecimal("0.1234567"), 6, composerStartRestartGroup, 48, 0), (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1022);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInPlaidUnsupportedAssetsComposable.PreviewFormatShares$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
