package com.robinhood.android.gold.transfers;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostTimelineComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"toStatus", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "Lcom/robinhood/models/serverdriven/db/TimelineRow$State;", "GoldDepositBoostTimelineComposable", "", "postTransferTimeline", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "onClickCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldDepositBoostTimelineComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-gold-transfers_externalRelease", "titlePositionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDepositBoostTimelineComposable {

    /* compiled from: GoldDepositBoostTimelineComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineRow.State.values().length];
            try {
                iArr[TimelineRow.State.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRow.State.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRow.State.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineRow.State.ONGOING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimelineRow.State.WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimelineRow.State.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostTimelineComposable$lambda$1(UiPostTransferPage.Timeline timeline, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDepositBoostTimelineComposable(timeline, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostTimelineComposablePreview$lambda$2(int i, Composer composer, int i2) {
        GoldDepositBoostTimelineComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Timeline.Status toStatus(TimelineRow.State state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return Timeline.Status.COMPLETE_GOLD;
            case 2:
                return Timeline.Status.ERROR;
            case 3:
                return Timeline.Status.INCOMPLETE;
            case 4:
                return Timeline.Status.ONGOING;
            case 5:
                return Timeline.Status.WARNING;
            case 6:
                return Timeline.Status.INCOMPLETE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void GoldDepositBoostTimelineComposable(final UiPostTransferPage.Timeline postTransferTimeline, final Function0<Unit> onClickCta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(postTransferTimeline, "postTransferTimeline");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1287679266);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(postTransferTimeline) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1287679266, i3, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposable (GoldDepositBoostTimelineComposable.kt:47)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(161412186, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$GoldDepositBoostTimelineComposable$1$1
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
                        ComposerKt.traceEventStart(161412186, i5, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposable.<anonymous>.<anonymous> (GoldDepositBoostTimelineComposable.kt:51)");
                    }
                    GoldDepositBoostBottomBarComposable.GoldDepositBoostBottomBarComposable(postTransferTimeline.getPrimaryButton().getTitle(), onClickCta, null, postTransferTimeline.getDetail().getText(), composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(83001869, true, new GoldDepositBoostTimelineComposable3(modifier, postTransferTimeline), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostTimelineComposable.GoldDepositBoostTimelineComposable$lambda$1(postTransferTimeline, onClickCta, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void GoldDepositBoostTimelineComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-467228080);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-467228080, i, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposablePreview (GoldDepositBoostTimelineComposable.kt:108)");
            }
            RichText richText = new RichText("Wells Fargo ···1234", CollectionsKt.emptyList());
            RichText richText2 = new RichText("Boost paid out over 24 months. To earn the full $10, hold or invest your $1,000 deposit for 2 years.", CollectionsKt.emptyList());
            GenericButton genericButton = new GenericButton("Done", null, false, "done", null, null, 54, null);
            TimelineRow.State state = TimelineRow.State.COMPLETE;
            TimelineRow timelineRow = new TimelineRow("Deposit initiated", "Jan 1 • Keep at least $1,000 in your bank account until money is deducted", null, null, null, null, state, null, TimelineRow.Position.TOP, null, null, null, 3596, null);
            TimelineRow.State state2 = TimelineRow.State.INCOMPLETE;
            TimelineRow.Position position = TimelineRow.Position.BETWEEN;
            BentoTheme2.BentoTheme(Boolean.valueOf(DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1748341768, true, new C179881(new UiPostTransferPage.Timeline("$1,000.00 deposit", richText, CollectionsKt.listOf((Object[]) new TimelineRow[]{timelineRow, new TimelineRow("Deposit completed", "Jan 2 • $1,000 to invest or earn interest", null, null, null, null, state2, state, position, null, null, null, 3596, null), new TimelineRow("Payout of $10 boost", "End of every month for 2 years • Est. $0.XX to invest or earn interest", null, null, null, null, state2, state2, position, null, null, null, 3596, null), new TimelineRow("Y.YY% APY payout", "End of every month • Money to invest or earn interest", null, null, null, null, state2, state2, TimelineRow.Position.BOTTOM, null, null, null, 3596, null)}), richText2, genericButton, UiPostTransferPage.Timeline.Type.GOLD, null, null, null, null, 768, null)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostTimelineComposable.GoldDepositBoostTimelineComposablePreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldDepositBoostTimelineComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$GoldDepositBoostTimelineComposablePreview$1 */
    static final class C179881 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UiPostTransferPage.Timeline $timeline;

        C179881(UiPostTransferPage.Timeline timeline) {
            this.$timeline = timeline;
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
                ComposerKt.traceEventStart(1748341768, i, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposablePreview.<anonymous> (GoldDepositBoostTimelineComposable.kt:162)");
            }
            UiPostTransferPage.Timeline timeline = this.$timeline;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostTimelineComposableKt$GoldDepositBoostTimelineComposablePreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldDepositBoostTimelineComposable.GoldDepositBoostTimelineComposable(timeline, (Function0) objRememberedValue, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
