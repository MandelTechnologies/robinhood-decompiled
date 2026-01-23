package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.UnofficialBentoComponent;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.EventRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: EventRow.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0012\u0010\u000f\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\"\u0010\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010\u001c\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006 "}, m3636d2 = {"EventRow", "", "state", "Lcom/robinhood/compose/bento/component/rows/EventRowState;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/compose/bento/component/rows/EventRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowPrimaryElement", "primaryText", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "RowPrimaryElement-RPmYEkk", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "RowSecondaryElement", "secondaryText", "RowSecondaryElement-RPmYEkk", "RowStartElement", "Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;", "(Lcom/robinhood/compose/bento/component/rows/EventRowState$Start;Landroidx/compose/runtime/Composer;I)V", "TwoLineHeight", "Landroidx/compose/ui/unit/Dp;", "F", "TwoLineWidth", "TwoLineCornerRadius", "TwoLineTopOffset", "TwoLineBottomOffset", "TwoLineEventStart", "Lcom/robinhood/compose/bento/component/rows/EventRowState$Start$TwoLine;", "(Lcom/robinhood/compose/bento/component/rows/EventRowState$Start$TwoLine;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.EventRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class EventRow {
    private static final float TwoLineCornerRadius;
    private static final float TwoLineTopOffset;
    private static final float TwoLineHeight = C2002Dp.m7995constructorimpl(44);
    private static final float TwoLineWidth = C2002Dp.m7995constructorimpl(40);
    private static final float TwoLineBottomOffset = C2002Dp.m7995constructorimpl(-2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventRow$lambda$0(EventRowState eventRowState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventRow(eventRowState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowPrimaryElement_RPmYEkk$lambda$1(String str, long j, int i, Composer composer, int i2) {
        m21040RowPrimaryElementRPmYEkk(str, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowSecondaryElement_RPmYEkk$lambda$2(String str, long j, int i, Composer composer, int i2) {
        m21041RowSecondaryElementRPmYEkk(str, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartElement$lambda$3(EventRowState.Start start, int i, Composer composer, int i2) {
        RowStartElement(start, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoLineEventStart$lambda$5(EventRowState.Start.TwoLine twoLine, int i, Composer composer, int i2) {
        TwoLineEventStart(twoLine, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @UnofficialBentoComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventRow(final EventRowState state, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(336423503);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336423503, i3, -1, "com.robinhood.compose.bento.component.rows.EventRow (EventRow.kt:48)");
                }
                Modifier modifier5 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE.then(modifier4), false, null, null, onClick, 7, null), null, ComposableLambda3.rememberComposableLambda(839581459, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.1
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
                            ComposerKt.traceEventStart(839581459, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:56)");
                        }
                        EventRow.RowStartElement(state.getStart(), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1102597006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.2
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
                            ComposerKt.traceEventStart(-1102597006, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:61)");
                        }
                        BentoBaseRowKt.m20918RowPrimaryElementcf5BqRc((Modifier) null, new BentoBaseRowState.Text.Plain(state.getPrimaryText()), BentoTheme.INSTANCE.getColors(composer2, 6).m21425getFg0d7_KjU(), (Function0<Unit>) null, composer2, 0, 9);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1250191825, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.3
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
                            ComposerKt.traceEventStart(1250191825, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:67)");
                        }
                        String secondaryText = state.getSecondaryText();
                        BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, secondaryText != null ? new BentoBaseRowState.Text.Plain(secondaryText) : null, BentoTheme.INSTANCE.getColors(composer2, 6).m21426getFg20d7_KjU(), null, composer2, 0, 9);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 28032, 0, 2018);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventRow.EventRow$lambda$0(state, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE.then(modifier4), false, null, null, onClick, 7, null), null, ComposableLambda3.rememberComposableLambda(839581459, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.1
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
                        ComposerKt.traceEventStart(839581459, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:56)");
                    }
                    EventRow.RowStartElement(state.getStart(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1102597006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.2
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
                        ComposerKt.traceEventStart(-1102597006, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:61)");
                    }
                    BentoBaseRowKt.m20918RowPrimaryElementcf5BqRc((Modifier) null, new BentoBaseRowState.Text.Plain(state.getPrimaryText()), BentoTheme.INSTANCE.getColors(composer2, 6).m21425getFg0d7_KjU(), (Function0<Unit>) null, composer2, 0, 9);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1250191825, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt.EventRow.3
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
                        ComposerKt.traceEventStart(1250191825, i5, -1, "com.robinhood.compose.bento.component.rows.EventRow.<anonymous> (EventRow.kt:67)");
                    }
                    String secondaryText = state.getSecondaryText();
                    BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(null, secondaryText != null ? new BentoBaseRowState.Text.Plain(secondaryText) : null, BentoTheme.INSTANCE.getColors(composer2, 6).m21426getFg20d7_KjU(), null, composer2, 0, 9);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 28032, 0, 2018);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: RowPrimaryElement-RPmYEkk, reason: not valid java name */
    private static final void m21040RowPrimaryElementRPmYEkk(final String str, final long j, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1324583973);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1324583973, i2, -1, "com.robinhood.compose.bento.component.rows.RowPrimaryElement (EventRow.kt:82)");
            }
            if (!StringsKt.isBlank(str)) {
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), composerStartRestartGroup, (i2 & 14) | ((i2 << 3) & 896), 0, 8186);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRow.RowPrimaryElement_RPmYEkk$lambda$1(str, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: RowSecondaryElement-RPmYEkk, reason: not valid java name */
    private static final void m21041RowSecondaryElementRPmYEkk(final String str, final long j, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1267389965);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1267389965, i2, -1, "com.robinhood.compose.bento.component.rows.RowSecondaryElement (EventRow.kt:99)");
            }
            if (str != null && !StringsKt.isBlank(str)) {
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextS(), composerStartRestartGroup, (i2 & 14) | ((i2 << 3) & 896), 0, 8186);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRow.RowSecondaryElement_RPmYEkk$lambda$2(str, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        float f = 2;
        TwoLineCornerRadius = C2002Dp.m7995constructorimpl(f);
        TwoLineTopOffset = C2002Dp.m7995constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RowStartElement(final EventRowState.Start start, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1823167409);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(start) : composerStartRestartGroup.changedInstance(start) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1823167409, i2, -1, "com.robinhood.compose.bento.component.rows.RowStartElement (EventRow.kt:112)");
            }
            if (!(start instanceof EventRowState.Start.TwoLine)) {
                throw new NoWhenBranchMatchedException();
            }
            TwoLineEventStart((EventRowState.Start.TwoLine) start, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRow.RowStartElement$lambda$3(start, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TwoLineEventStart(final EventRowState.Start.TwoLine twoLine, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(316778589);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(twoLine) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(316778589, i2, -1, "com.robinhood.compose.bento.component.rows.TwoLineEventStart (EventRow.kt:132)");
            }
            Color colorM21047getForegroundColorQN2ZGVo = twoLine.m21047getForegroundColorQN2ZGVo();
            composerStartRestartGroup.startReplaceGroup(-518450326);
            long jM21425getFg0d7_KjU = colorM21047getForegroundColorQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU() : colorM21047getForegroundColorQN2ZGVo.getValue();
            composerStartRestartGroup.endReplaceGroup();
            Color colorM21046getBackgroundColorQN2ZGVo = twoLine.m21046getBackgroundColorQN2ZGVo();
            composerStartRestartGroup.startReplaceGroup(-518448021);
            long jM21373getBg30d7_KjU = colorM21046getBackgroundColorQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21373getBg30d7_KjU() : colorM21046getBackgroundColorQN2ZGVo.getValue();
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(companion, TwoLineWidth, TwoLineHeight, 0.0f, 0.0f, 12, null);
            float f = TwoLineCornerRadius;
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(Background3.m4871backgroundbw27NRU(modifierM5173sizeInqDBjuR0$default, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWithBentoPlaceholder$default);
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
            Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(companion, 0.0f, TwoLineTopOffset, 1, null);
            String text1 = twoLine.getText1();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            FontWeight bold = companion3.getBold();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(text1, modifierM5125offsetVpY3zN4$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, 6).getTextS(), composer2, 24624, 0, 8168);
            BentoText2.m20747BentoText38GnDrw(twoLine.getText2(), OffsetKt.m5125offsetVpY3zN4$default(companion, 0.0f, TwoLineBottomOffset, 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, 6).getTextS(), composer2, 24624, 0, 8168);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.EventRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRow.TwoLineEventStart$lambda$5(twoLine, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
