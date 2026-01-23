package com.robinhood.android.advisory.tlh.summary;

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
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.tlh.C9369R;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardViewState;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreen3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TaxLossHarvestingSummaryScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a7\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002"}, m3636d2 = {"TaxLossHarvestingSummaryStatusCard", "", "status", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Status;", "onCtaClick", "Lkotlin/Function1;", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Cta;", "modifier", "Landroidx/compose/ui/Modifier;", "loading", "", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Status;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TaxLossHarvestingTimeline", "title", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState$TimelineRow;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TaxLossHarvestDashboardComposable", "state", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "(Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLossHarvestingSummaryPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug", "bottomSheet", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$BottomSheet;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestingSummaryScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestDashboardComposable$lambda$13(TaxLossHarvestDashboardViewState taxLossHarvestDashboardViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestDashboardComposable(taxLossHarvestDashboardViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingSummaryPreview$lambda$14(int i, Composer composer, int i2) {
        TaxLossHarvestingSummaryPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingSummaryStatusCard$lambda$0(TaxLossHarvestDashboard.Status status, Function1 function1, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingSummaryStatusCard(status, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingTimeline$lambda$11(String str, ImmutableList immutableList, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingTimeline(str, immutableList, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingSummaryStatusCard(final TaxLossHarvestDashboard.Status status, final Function1<? super TaxLossHarvestDashboard.Cta, Unit> onCtaClick, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1453326439);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(status) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1453326439, i3, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryStatusCard (TaxLossHarvestingSummaryScreen.kt:52)");
                    }
                    boolean z5 = z4;
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, null, ComposableLambda3.rememberComposableLambda(349414737, true, new C94901(modifier4, z4, status, onCtaClick), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLossHarvestingSummaryScreen3.TaxLossHarvestingSummaryStatusCard$lambda$0(status, onCtaClick, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                boolean z52 = z4;
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, null, ComposableLambda3.rememberComposableLambda(349414737, true, new C94901(modifier4, z4, status, onCtaClick), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                z3 = z52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TaxLossHarvestingSummaryScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$TaxLossHarvestingSummaryStatusCard$1 */
    static final class C94901 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<TaxLossHarvestDashboard.Cta, Unit> $onCtaClick;
        final /* synthetic */ TaxLossHarvestDashboard.Status $status;

        /* JADX WARN: Multi-variable type inference failed */
        C94901(Modifier modifier, boolean z, TaxLossHarvestDashboard.Status status, Function1<? super TaxLossHarvestDashboard.Cta, Unit> function1) {
            this.$modifier = modifier;
            this.$loading = z;
            this.$status = status;
            this.$onCtaClick = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, TaxLossHarvestDashboard.Cta cta) {
            function1.invoke(cta);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(349414737, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryStatusCard.<anonymous> (TaxLossHarvestingSummaryScreen.kt:56)");
            }
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Components2.cardBorder(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(this.$modifier, 0.0f, 1, null)), this.$loading, null, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierBentoPlaceholder$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            TaxLossHarvestDashboard.Status status = this.$status;
            final Function1<TaxLossHarvestDashboard.Cta, Unit> function1 = this.$onCtaClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9369R.string.tlh_summary_status_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8190);
            String status2 = status.getStatus();
            TextStyle textL = bentoTheme.getTypography(composer, i2).getTextL();
            BentoText2.m20747BentoText38GnDrw(status2, null, Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(status.getStatusColor(), 0L, composer, 0, 1)), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textL, composer, 24576, 0, 8170);
            String descriptionMarkdown = status.getDescriptionMarkdown();
            MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer, BentoMarkdownText.$stable), null, null, null, null, bentoTheme.getTypography(composer, i2).getTextS(), null, null, 0L, null, 0, null, 2031, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoMarkdownText2.BentoMarkdownText(descriptionMarkdown, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            final TaxLossHarvestDashboard.Cta cta = status.getCta();
            composer.startReplaceGroup(1053032976);
            if (cta != null) {
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(cta);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$TaxLossHarvestingSummaryStatusCard$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLossHarvestingSummaryScreen3.C94901.invoke$lambda$2$lambda$1$lambda$0(function1, cta);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                String title = cta.getTitle();
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                String loggingIdentifier = cta.getLoggingIdentifier();
                if (loggingIdentifier == null) {
                    loggingIdentifier = "";
                }
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, title, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, loggingIdentifier, null, 4, null), null, 47, null)), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), composer, 0, 56);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final TaxLossHarvestDashboard.BottomSheet TaxLossHarvestingTimeline$lambda$2(SnapshotState<TaxLossHarvestDashboard.BottomSheet> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingTimeline(final String title, final ImmutableList<TaxLossHarvestDashboardViewState.TimelineState.TimelineRow> rows, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        TaxLossHarvestDashboard.BottomSheet bottomSheetTaxLossHarvestingTimeline$lambda$2;
        final boolean z3;
        final Modifier modifier3;
        final SnapshotState snapshotState;
        Timeline.InfoAction infoActionCopy$default;
        BentoTimelineRowState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1051916716);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rows) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1051916716, i5, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingTimeline (TaxLossHarvestingSummaryScreen.kt:118)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
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
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    boolean z5 = z4;
                    Modifier modifier5 = modifier4;
                    SnapshotState snapshotState3 = snapshotState2;
                    BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), z4, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, i5 & 14, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(399680436);
                    int i8 = 0;
                    for (TaxLossHarvestDashboardViewState.TimelineState.TimelineRow timelineRow : rows) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final TaxLossHarvestDashboardViewState.TimelineState.TimelineRow timelineRow2 = timelineRow;
                        TaxLossHarvestDashboardViewState.TimelineState.TimelineRow timelineRow3 = (TaxLossHarvestDashboardViewState.TimelineState.TimelineRow) CollectionsKt.getOrNull(rows, i8 - 1);
                        Timeline.Status status = (timelineRow3 == null || (state = timelineRow3.getState()) == null) ? null : state.getStatus();
                        BentoTimelineRowState state2 = timelineRow2.getState();
                        Timeline.Status status2 = state2.getStatus();
                        String titleText = state2.getTitleText();
                        String metadataText = state2.getMetadataText();
                        Timeline.Position position = state2.getPosition();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Timeline.ColorOverrides colorOverrides = new Timeline.ColorOverrides(Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i10).m21456getPositive0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i10).m21456getPositive0d7_KjU()), null, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i10).m21456getPositive0d7_KjU()), 12, null);
                        Timeline.InfoAction infoAction = state2.getInfoAction();
                        composerStartRestartGroup.startReplaceGroup(399706049);
                        if (infoAction == null) {
                            snapshotState = snapshotState3;
                            infoActionCopy$default = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(timelineRow2);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                snapshotState = snapshotState3;
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TaxLossHarvestingSummaryScreen3.TaxLossHarvestingTimeline$lambda$7$lambda$6$lambda$5$lambda$4(timelineRow2, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                snapshotState = snapshotState3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            infoActionCopy$default = Timeline.InfoAction.copy$default(infoAction, null, (Function0) objRememberedValue2, 1, null);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState3 = snapshotState;
                        Composer composer2 = composerStartRestartGroup;
                        BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status2, position, titleText, null, null, metadataText, null, infoActionCopy$default, colorOverrides, status, false, null, null, false, false, 4, false, 0, z5, z5, false, composer2, (Timeline.InfoAction.$stable << 21) | (Timeline.ColorOverrides.$stable << 24), ((i5 << 15) & 234881024) | 196608 | ((i5 << 18) & 1879048192), 0, 1277016);
                        i8 = i9;
                        composerStartRestartGroup = composer2;
                    }
                    final SnapshotState snapshotState4 = snapshotState3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    bottomSheetTaxLossHarvestingTimeline$lambda$2 = TaxLossHarvestingTimeline$lambda$2(snapshotState4);
                    if (bottomSheetTaxLossHarvestingTimeline$lambda$2 != null) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TaxLossHarvestingSummaryScreen3.TaxLossHarvestingTimeline$lambda$10$lambda$9$lambda$8(snapshotState4);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1449005868, true, new TaxLossHarvestingSummaryScreen4(bottomSheetTaxLossHarvestingTimeline$lambda$2, snapshotState4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLossHarvestingSummaryScreen3.TaxLossHarvestingTimeline$lambda$11(title, rows, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
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
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    boolean z52 = z4;
                    Modifier modifier52 = modifier4;
                    SnapshotState snapshotState32 = snapshotState22;
                    BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), z4, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), composerStartRestartGroup, i5 & 14, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(399680436);
                    int i82 = 0;
                    while (r0.hasNext()) {
                    }
                    final SnapshotState snapshotState42 = snapshotState32;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    bottomSheetTaxLossHarvestingTimeline$lambda$2 = TaxLossHarvestingTimeline$lambda$2(snapshotState42);
                    if (bottomSheetTaxLossHarvestingTimeline$lambda$2 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z52;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i3;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingTimeline$lambda$7$lambda$6$lambda$5$lambda$4(TaxLossHarvestDashboardViewState.TimelineState.TimelineRow timelineRow, SnapshotState snapshotState) {
        snapshotState.setValue(timelineRow.getBottomSheet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingTimeline$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    public static final void TaxLossHarvestDashboardComposable(final TaxLossHarvestDashboardViewState state, final Function1<? super TaxLossHarvestDashboard.Cta, Unit> onCtaClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896887987);
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
            i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896887987, i3, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardComposable (TaxLossHarvestingSummaryScreen.kt:204)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Components2.TaxLossHarvestingScreenHeader(state.getTitle(), state.getSubtitle(), null, state.getLoading(), composerStartRestartGroup, 0, 4);
            TaxLossHarvestingSummaryStatusCard(state.getStatus(), onCtaClick, null, state.getLoading(), composerStartRestartGroup, i3 & 112, 4);
            TaxLossHarvestDashboardViewState.TimelineState timeline = state.getTimeline();
            composerStartRestartGroup.startReplaceGroup(1955445572);
            if (timeline != null) {
                TaxLossHarvestingTimeline(timeline.getTitle(), timeline.getRows(), null, state.getLoading(), composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLossHarvestingSummaryScreen3.TaxLossHarvestDashboardComposable$lambda$13(state, onCtaClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TaxLossHarvestingSummaryPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033778509);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2033778509, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryPreview (TaxLossHarvestingSummaryScreen.kt:232)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, TaxLossHarvestingSummaryScreen.INSTANCE.getLambda$928457323$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingSummaryScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLossHarvestingSummaryScreen3.TaxLossHarvestingSummaryPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
