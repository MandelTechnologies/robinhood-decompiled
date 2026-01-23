package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoIcon;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.Timeline;
import com.robinhood.models.serverdriven.experimental.api.TimelineColorOverride;
import com.robinhood.models.serverdriven.experimental.api.TimelineRow;
import com.robinhood.models.serverdriven.experimental.api.TimelineRowIconContainerSize;
import com.robinhood.models.serverdriven.experimental.api.TimelineRowState;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiTimeline.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a_\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"SduiTimeline", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/Timeline;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "maxLines", "", "supportMultipleLines", "", "(Lcom/robinhood/models/serverdriven/experimental/api/Timeline;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;IZLandroidx/compose/runtime/Composer;II)V", "SduiTimelineRow", "Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "previousState", "Lcom/robinhood/models/serverdriven/experimental/api/TimelineRowState;", "colorOverrides", "Lcom/robinhood/models/serverdriven/experimental/api/TimelineColorOverride;", "(Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;Lcom/robinhood/models/serverdriven/experimental/api/TimelineRowState;Lcom/robinhood/models/serverdriven/experimental/api/TimelineColorOverride;Landroidx/compose/ui/Modifier;IZLandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTimeline2 {

    /* compiled from: SduiTimeline.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimelineRowState.values().length];
            try {
                iArr[TimelineRowState.INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRowState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRowState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineRowState.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimelineRowState.ONGOING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoIcon.values().length];
            try {
                iArr2[InfoIcon.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InfoIcon.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTimeline$lambda$0(Timeline timeline, Modifier modifier, HorizontalPadding horizontalPadding, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        SduiTimeline(timeline, modifier, horizontalPadding, i, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTimelineRow$lambda$1(TimelineRow timelineRow, Timeline.Position position, TimelineRowState timelineRowState, TimelineColorOverride timelineColorOverride, Modifier modifier, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        SduiTimelineRow(timelineRow, position, timelineRowState, timelineColorOverride, modifier, i, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTimeline(final com.robinhood.models.serverdriven.experimental.api.Timeline<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, int i, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2031978995);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                    HorizontalPadding horizontalPadding3 = i8 == 0 ? HorizontalPadding.Default : horizontalPadding;
                    if (i9 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2031978995, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline (SduiTimeline.kt:36)");
                    }
                    Integer max_lines = component.getMax_lines();
                    final int iIntValue = max_lines == null ? max_lines.intValue() : i5;
                    final boolean z3 = component.getMax_lines() == null || z2;
                    UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(245525041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt.SduiTimeline.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(245525041, i10, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline.<anonymous> (SduiTimeline.kt:41)");
                            }
                            com.robinhood.models.serverdriven.experimental.api.Timeline<ActionT> timeline = component;
                            Modifier modifier4 = modifier3;
                            int i11 = iIntValue;
                            boolean z4 = z3;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            int i12 = 0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(934038498);
                            List rows = timeline.getRows();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                            for (Object obj : rows) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                Composer composer3 = composer2;
                                SduiTimeline2.SduiTimelineRow((TimelineRow) obj, com.robinhood.compose.bento.component.rows.Timeline.INSTANCE.getPositionFromIndex(i12, timeline.getRows().size()), i12 > 0 ? ((TimelineRow) timeline.getRows().get(i12 - 1)).getState() : null, timeline.getColor_overrides(), modifier4, i11, z4, composer3, 0, 0);
                                arrayList.add(Unit.INSTANCE);
                                composer2 = composer3;
                                i12 = i13;
                            }
                            Composer composer4 = composer2;
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    horizontalPadding2 = horizontalPadding3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    horizontalPadding2 = horizontalPadding;
                }
                final int i10 = i5;
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiTimeline2.SduiTimeline$lambda$0(component, modifier2, horizontalPadding2, i10, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) != 9362) {
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Integer max_lines2 = component.getMax_lines();
                if (max_lines2 == null) {
                }
                if (component.getMax_lines() == null) {
                    UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(245525041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt.SduiTimeline.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i102) {
                            if ((i102 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(245525041, i102, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline.<anonymous> (SduiTimeline.kt:41)");
                            }
                            com.robinhood.models.serverdriven.experimental.api.Timeline<ActionT> timeline = component;
                            Modifier modifier4 = modifier3;
                            int i11 = iIntValue;
                            boolean z42 = z3;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            int i12 = 0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(934038498);
                            List rows = timeline.getRows();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                            for (Object obj : rows) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                Composer composer3 = composer2;
                                SduiTimeline2.SduiTimelineRow((TimelineRow) obj, com.robinhood.compose.bento.component.rows.Timeline.INSTANCE.getPositionFromIndex(i12, timeline.getRows().size()), i12 > 0 ? ((TimelineRow) timeline.getRows().get(i12 - 1)).getState() : null, timeline.getColor_overrides(), modifier4, i11, z42, composer3, 0, 0);
                                arrayList.add(Unit.INSTANCE);
                                composer2 = composer3;
                                i12 = i13;
                            }
                            Composer composer4 = composer2;
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    horizontalPadding2 = horizontalPadding3;
                }
            }
            final int i102 = i5;
            final boolean z42 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i4 & 9363) != 9362) {
        }
        final int i1022 = i5;
        final boolean z422 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTimelineRow(final TimelineRow<? extends ActionT> component, final Timeline.Position position, final TimelineRowState timelineRowState, final TimelineColorOverride timelineColorOverride, Modifier modifier, int i, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Timeline.Status status;
        int i9;
        Timeline.Status status2;
        Timeline.Status status3;
        Parcelable action;
        Timeline.InfoAction infoAction;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final int i10;
        Timeline.InfoIconPosition infoIconPosition;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(position, "position");
        Composer composerStartRestartGroup = composer.startRestartGroup(-469272455);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(position.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(timelineRowState == null ? -1 : timelineRowState.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(timelineColorOverride) ? 2048 : 1024;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    if ((i4 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        int i12 = i5 == 0 ? 1 : i6;
                        boolean z4 = i7 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-469272455, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineRow (SduiTimeline.kt:69)");
                        }
                        TimelineRowState state = component.getState();
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        i8 = iArr[state.ordinal()];
                        if (i8 != 1) {
                            status = Timeline.Status.INCOMPLETE;
                        } else if (i8 == 2) {
                            status = Timeline.Status.COMPLETE;
                        } else if (i8 == 3) {
                            status = Timeline.Status.ERROR;
                        } else if (i8 == 4) {
                            status = Timeline.Status.WARNING;
                        } else {
                            if (i8 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            status = Timeline.Status.ONGOING;
                        }
                        i9 = timelineRowState != null ? -1 : iArr[timelineRowState.ordinal()];
                        if (i9 != 1) {
                            status2 = Timeline.Status.INCOMPLETE;
                        } else if (i9 == 2) {
                            status2 = Timeline.Status.COMPLETE;
                        } else if (i9 == 3) {
                            status2 = Timeline.Status.ERROR;
                        } else if (i9 == 4) {
                            status2 = Timeline.Status.WARNING;
                        } else if (i9 == 5) {
                            status2 = Timeline.Status.ONGOING;
                        } else {
                            status3 = null;
                            ThemedColor incomplete = timelineColorOverride != null ? timelineColorOverride.getIncomplete() : null;
                            composerStartRestartGroup.startReplaceGroup(768297);
                            Color composeColor = incomplete == null ? null : SduiColors2.toComposeColor(incomplete, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColor complete = timelineColorOverride != null ? timelineColorOverride.getComplete() : null;
                            composerStartRestartGroup.startReplaceGroup(770313);
                            Color composeColor2 = complete == null ? null : SduiColors2.toComposeColor(complete, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColor error = timelineColorOverride != null ? timelineColorOverride.getError() : null;
                            composerStartRestartGroup.startReplaceGroup(772137);
                            Color composeColor3 = error == null ? null : SduiColors2.toComposeColor(error, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColor warning = timelineColorOverride != null ? timelineColorOverride.getWarning() : null;
                            composerStartRestartGroup.startReplaceGroup(774089);
                            Color composeColor4 = warning == null ? null : SduiColors2.toComposeColor(warning, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColor ongoing = timelineColorOverride != null ? timelineColorOverride.getOngoing() : null;
                            composerStartRestartGroup.startReplaceGroup(776041);
                            Color composeColor5 = ongoing == null ? null : SduiColors2.toComposeColor(ongoing, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            String detail_text = component.getDetail_text();
                            Parcelable detail_action = component.getDetail_action();
                            action = component.getAction();
                            Modifier modifier4 = modifier2;
                            String primary_information = component.getPrimary_information();
                            String secondary_information = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(791952);
                            Timeline.CtaButton ctaButton = (detail_text == null || detail_action == null) ? null : new Timeline.CtaButton(detail_text, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), detail_action));
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(800734);
                            if (action == null) {
                                InfoIcon info_icon = component.getInfo_icon();
                                int i13 = info_icon == null ? -1 : WhenMappings.$EnumSwitchMapping$1[info_icon.ordinal()];
                                if (i13 == 1) {
                                    infoIconPosition = Timeline.InfoIconPosition.TITLE;
                                } else if (i13 == 2) {
                                    infoIconPosition = Timeline.InfoIconPosition.METADATA;
                                } else {
                                    infoIconPosition = Timeline.InfoIconPosition.NONE;
                                }
                                infoAction = new Timeline.InfoAction(infoIconPosition, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action));
                            } else {
                                infoAction = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Icon icon_override = component.getIcon_override();
                            ServerToBentoAssetMapper2 iconAsset = icon_override == null ? UtilKt.getIconAsset(icon_override) : null;
                            ThemedColor icon_color_override = component.getIcon_color_override();
                            composerStartRestartGroup.startReplaceGroup(822121);
                            Color composeColor6 = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolIs_active_entry = component.is_active_entry();
                            composer2 = composerStartRestartGroup;
                            BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, primary_information, modifier4, secondary_information, null, ctaButton, infoAction, colorOverrides, status3, z4, iconAsset, composeColor6, boolIs_active_entry == null ? boolIs_active_entry.booleanValue() : false, component.getIcon_container_size() != TimelineRowIconContainerSize.LARGE, i12, false, 0, false, false, false, composer2, (i4 & 112) | ((i4 >> 3) & 7168) | (Timeline.CtaButton.$stable << 18) | (Timeline.InfoAction.$stable << 21) | (Timeline.ColorOverrides.$stable << 24), ((i4 >> 18) & 14) | (i4 & 458752), 0, 2031648);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            i10 = i12;
                        }
                        status3 = status2;
                        if (timelineColorOverride != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(768297);
                        if (incomplete == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (timelineColorOverride != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(770313);
                        if (complete == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (timelineColorOverride != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(772137);
                        if (error == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (timelineColorOverride != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(774089);
                        if (warning == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (timelineColorOverride != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(776041);
                        if (ongoing == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Timeline.ColorOverrides colorOverrides2 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                        String detail_text2 = component.getDetail_text();
                        Parcelable detail_action2 = component.getDetail_action();
                        action = component.getAction();
                        Modifier modifier42 = modifier2;
                        String primary_information2 = component.getPrimary_information();
                        String secondary_information2 = component.getSecondary_information();
                        composerStartRestartGroup.startReplaceGroup(791952);
                        if (detail_text2 == null) {
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(800734);
                            if (action == null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Icon icon_override2 = component.getIcon_override();
                            if (icon_override2 == null) {
                            }
                            ThemedColor icon_color_override2 = component.getIcon_color_override();
                            composerStartRestartGroup.startReplaceGroup(822121);
                            if (icon_color_override2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolIs_active_entry2 = component.is_active_entry();
                            composer2 = composerStartRestartGroup;
                            BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, primary_information2, modifier42, secondary_information2, null, ctaButton, infoAction, colorOverrides2, status3, z4, iconAsset, composeColor6, boolIs_active_entry2 == null ? boolIs_active_entry2.booleanValue() : false, component.getIcon_container_size() != TimelineRowIconContainerSize.LARGE, i12, false, 0, false, false, false, composer2, (i4 & 112) | ((i4 >> 3) & 7168) | (Timeline.CtaButton.$stable << 18) | (Timeline.InfoAction.$stable << 21) | (Timeline.ColorOverrides.$stable << 24), ((i4 >> 18) & 14) | (i4 & 458752), 0, 2031648);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z3 = z4;
                            i10 = i12;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        i10 = i6;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiTimeline2.SduiTimelineRow$lambda$1(component, position, timelineRowState, timelineColorOverride, modifier3, i10, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                z2 = z;
                if ((i4 & 599187) == 599186) {
                    if (i11 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TimelineRowState state2 = component.getState();
                    int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                    i8 = iArr2[state2.ordinal()];
                    if (i8 != 1) {
                    }
                    if (timelineRowState != null) {
                    }
                    if (i9 != 1) {
                    }
                    status3 = status2;
                    if (timelineColorOverride != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(768297);
                    if (incomplete == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (timelineColorOverride != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(770313);
                    if (complete == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (timelineColorOverride != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(772137);
                    if (error == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (timelineColorOverride != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(774089);
                    if (warning == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (timelineColorOverride != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(776041);
                    if (ongoing == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Timeline.ColorOverrides colorOverrides22 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                    String detail_text22 = component.getDetail_text();
                    Parcelable detail_action22 = component.getDetail_action();
                    action = component.getAction();
                    Modifier modifier422 = modifier2;
                    String primary_information22 = component.getPrimary_information();
                    String secondary_information22 = component.getSecondary_information();
                    composerStartRestartGroup.startReplaceGroup(791952);
                    if (detail_text22 == null) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            z2 = z;
            if ((i4 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        z2 = z;
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
