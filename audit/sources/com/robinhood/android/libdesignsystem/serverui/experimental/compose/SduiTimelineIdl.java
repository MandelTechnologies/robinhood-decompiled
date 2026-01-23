package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

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
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.TimelineDto;
import rh_server_driven_ui.p531v1.TimelineRowDto;

/* compiled from: SduiTimelineIdl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ai\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"SduiTimeline", "", "ActionT", "component", "Lrh_server_driven_ui/v1/TimelineDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "maxLines", "", "supportMultipleLines", "", "(Lrh_server_driven_ui/v1/TimelineDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;IZLandroidx/compose/runtime/Composer;II)V", "SduiTimelineRow", "Lrh_server_driven_ui/v1/TimelineRowDto;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "previousState", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "colorOverrides", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "(Lrh_server_driven_ui/v1/TimelineRowDto;Lkotlin/jvm/functions/Function1;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;Landroidx/compose/ui/Modifier;IZLandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTimelineIdl {

    /* compiled from: SduiTimelineIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimelineRowDto.StateDto.values().length];
            try {
                iArr[TimelineRowDto.StateDto.STATE_INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRowDto.StateDto.STATE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRowDto.StateDto.STATE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineRowDto.StateDto.STATE_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimelineRowDto.StateDto.STATE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimelineRowDto.StateDto.STATE_ONGOING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TimelineRowDto.InfoIconDto.values().length];
            try {
                iArr2[TimelineRowDto.InfoIconDto.INFO_ICON_TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TimelineRowDto.InfoIconDto.INFO_ICON_METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TimelineRowDto.InfoIconDto.INFO_ICON_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTimeline$lambda$0(TimelineDto timelineDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        SduiTimeline(timelineDto, function1, modifier, horizontalPadding, i, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTimelineRow$lambda$1(TimelineRowDto timelineRowDto, Function1 function1, Timeline.Position position, TimelineRowDto.StateDto stateDto, TimelineDto.ColorOverrideDto colorOverrideDto, Modifier modifier, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        SduiTimelineRow(timelineRowDto, function1, position, stateDto, colorOverrideDto, modifier, i, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiTimeline(final TimelineDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, int i, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-87388622);
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
            i4 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i7 = i;
                    i4 |= composerStartRestartGroup.changed(i7) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i9 = i4;
                    if ((74899 & i9) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        HorizontalPadding horizontalPadding3 = i5 == 0 ? HorizontalPadding.Default : horizontalPadding;
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-87388622, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline (SduiTimelineIdl.kt:34)");
                        }
                        Integer max_lines = component.getMax_lines();
                        int iIntValue = max_lines == null ? max_lines.intValue() : i7;
                        final boolean z3 = component.getMax_lines() == null || z2;
                        final int i11 = iIntValue;
                        UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1678096982, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt.SduiTimeline.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i12) {
                                Composer composer3 = composer2;
                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1678096982, i12, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline.<anonymous> (SduiTimelineIdl.kt:39)");
                                }
                                TimelineDto timelineDto = component;
                                Function1<ActionDto, ActionT> function1 = parseAction;
                                Modifier modifier4 = modifier3;
                                int i13 = i11;
                                boolean z4 = z3;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                int i14 = 0;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer3.startReplaceGroup(387021558);
                                List<TimelineRowDto> rows = timelineDto.getRows();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                                for (Object obj : rows) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    SduiTimelineIdl.SduiTimelineRow((TimelineRowDto) obj, function1, Timeline.INSTANCE.getPositionFromIndex(i14, timelineDto.getRows().size()), i14 > 0 ? timelineDto.getRows().get(i14 - 1).getState() : null, timelineDto.getColor_overrides(), modifier4, i13, z4, composer3, 0, 0);
                                    arrayList.add(Unit.INSTANCE);
                                    composer3 = composer2;
                                    i14 = i15;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 9) & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontalPadding2 = horizontalPadding3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        horizontalPadding2 = horizontalPadding;
                        modifier3 = modifier2;
                    }
                    final int i12 = i7;
                    final boolean z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiTimelineIdl.SduiTimeline$lambda$0(component, parseAction, modifier3, horizontalPadding2, i12, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                z2 = z;
                i9 = i4;
                if ((74899 & i9) == 74898) {
                    if (i10 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Integer max_lines2 = component.getMax_lines();
                    if (max_lines2 == null) {
                    }
                    if (component.getMax_lines() == null) {
                        final int i112 = iIntValue;
                        UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(1678096982, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt.SduiTimeline.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i122) {
                                Composer composer3 = composer2;
                                if ((i122 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1678096982, i122, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline.<anonymous> (SduiTimelineIdl.kt:39)");
                                }
                                TimelineDto timelineDto = component;
                                Function1<ActionDto, ActionT> function1 = parseAction;
                                Modifier modifier4 = modifier3;
                                int i13 = i112;
                                boolean z42 = z3;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                int i14 = 0;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer3.startReplaceGroup(387021558);
                                List<TimelineRowDto> rows = timelineDto.getRows();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                                for (Object obj : rows) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    SduiTimelineIdl.SduiTimelineRow((TimelineRowDto) obj, function1, Timeline.INSTANCE.getPositionFromIndex(i14, timelineDto.getRows().size()), i14 > 0 ? timelineDto.getRows().get(i14 - 1).getState() : null, timelineDto.getColor_overrides(), modifier4, i13, z42, composer3, 0, 0);
                                    arrayList.add(Unit.INSTANCE);
                                    composer3 = composer2;
                                    i14 = i15;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 9) & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        horizontalPadding2 = horizontalPadding3;
                    }
                }
                final int i122 = i7;
                final boolean z42 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            z2 = z;
            i9 = i4;
            if ((74899 & i9) == 74898) {
            }
            final int i1222 = i7;
            final boolean z422 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        z2 = z;
        i9 = i4;
        if ((74899 & i9) == 74898) {
        }
        final int i12222 = i7;
        final boolean z4222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiTimelineRow(final TimelineRowDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, final Timeline.Position position, final TimelineRowDto.StateDto stateDto, final TimelineDto.ColorOverrideDto colorOverrideDto, Modifier modifier, int i, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        TimelineRowDto.StateDto state;
        int[] iArr;
        Timeline.Status status;
        Timeline.Status status2;
        Timeline.Status status3;
        String detail_text;
        ActionDto action;
        int i8;
        Timeline.CtaButton ctaButton;
        Timeline.InfoAction infoAction;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final int i9;
        Timeline.InfoIconPosition infoIconPosition;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(position, "position");
        Composer composerStartRestartGroup = composer.startRestartGroup(577519486);
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
            i4 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(position.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(stateDto == null ? -1 : stateDto.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(colorOverrideDto) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= 196608;
        } else {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                }
                if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    int i11 = i5 == 0 ? 1 : i6;
                    boolean z4 = i7 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(577519486, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineRow (SduiTimelineIdl.kt:69)");
                    }
                    state = component.getState();
                    iArr = WhenMappings.$EnumSwitchMapping$0;
                    switch (iArr[state.ordinal()]) {
                        case 1:
                            status = Timeline.Status.INCOMPLETE;
                            break;
                        case 2:
                            status = Timeline.Status.COMPLETE;
                            break;
                        case 3:
                            status = Timeline.Status.ERROR;
                            break;
                        case 4:
                            status = Timeline.Status.WARNING;
                            break;
                        case 5:
                        case 6:
                            status = Timeline.Status.ONGOING;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    switch (stateDto != null ? -1 : iArr[stateDto.ordinal()]) {
                        case -1:
                            status2 = null;
                            ThemedColorDto incomplete = colorOverrideDto == null ? colorOverrideDto.getIncomplete() : null;
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            Color composeColor = incomplete != null ? null : SduiColors2.toComposeColor(incomplete, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColorDto complete = colorOverrideDto == null ? colorOverrideDto.getComplete() : null;
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            Color composeColor2 = complete != null ? null : SduiColors2.toComposeColor(complete, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColorDto error = colorOverrideDto == null ? colorOverrideDto.getError() : null;
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            Color composeColor3 = error != null ? null : SduiColors2.toComposeColor(error, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColorDto warning = colorOverrideDto == null ? colorOverrideDto.getWarning() : null;
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            Color composeColor4 = warning != null ? null : SduiColors2.toComposeColor(warning, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            ThemedColorDto ongoing = colorOverrideDto == null ? colorOverrideDto.getOngoing() : null;
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            Color composeColor5 = ongoing != null ? null : SduiColors2.toComposeColor(ongoing, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action = component.getDetail_action();
                            action = component.getAction();
                            String primary_information = component.getPrimary_information();
                            String secondary_information = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null || detail_action == null) {
                                i8 = i4;
                                ctaButton = null;
                            } else {
                                i8 = i4;
                                ctaButton = new Timeline.CtaButton(detail_text, SduiActionHandler3.handling(parseAction.invoke(detail_action), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0)));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(945518038);
                            if (action == null) {
                                TimelineRowDto.InfoIconDto info_icon = component.getInfo_icon();
                                int i12 = info_icon == null ? -1 : WhenMappings.$EnumSwitchMapping$1[info_icon.ordinal()];
                                if (i12 != -1) {
                                    if (i12 == 1) {
                                        infoIconPosition = Timeline.InfoIconPosition.TITLE;
                                    } else if (i12 == 2) {
                                        infoIconPosition = Timeline.InfoIconPosition.METADATA;
                                    } else {
                                        if (i12 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        infoIconPosition = Timeline.InfoIconPosition.NONE;
                                    }
                                    infoAction = new Timeline.InfoAction(infoIconPosition, SduiActionHandler3.handling(parseAction.invoke(action), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0)));
                                } else {
                                    infoIconPosition = Timeline.InfoIconPosition.NONE;
                                    infoAction = new Timeline.InfoAction(infoIconPosition, SduiActionHandler3.handling(parseAction.invoke(action), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0)));
                                }
                            } else {
                                infoAction = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i13 = i8 >> 3;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier4 = modifier2;
                            BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, primary_information, modifier4, secondary_information, null, ctaButton, infoAction, colorOverrides, status2, z4, null, null, false, false, i11, false, 0, false, false, false, composer2, (i13 & 112) | ((i8 >> 6) & 7168) | (Timeline.CtaButton.$stable << 18) | (Timeline.InfoAction.$stable << 21) | (Timeline.ColorOverrides.$stable << 24), ((i8 >> 21) & 14) | (i13 & 458752), 0, 2062368);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            i9 = i11;
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            status3 = Timeline.Status.INCOMPLETE;
                            status2 = status3;
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            if (incomplete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            if (complete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            if (error != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            if (warning != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            if (ongoing != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides2 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action2 = component.getDetail_action();
                            action = component.getAction();
                            String primary_information2 = component.getPrimary_information();
                            String secondary_information2 = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null) {
                                i8 = i4;
                                ctaButton = null;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(945518038);
                                if (action == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i132 = i8 >> 3;
                                composer2 = composerStartRestartGroup;
                                Modifier modifier42 = modifier2;
                                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, primary_information2, modifier42, secondary_information2, null, ctaButton, infoAction, colorOverrides2, status2, z4, null, null, false, false, i11, false, 0, false, false, false, composer2, (i132 & 112) | ((i8 >> 6) & 7168) | (Timeline.CtaButton.$stable << 18) | (Timeline.InfoAction.$stable << 21) | (Timeline.ColorOverrides.$stable << 24), ((i8 >> 21) & 14) | (i132 & 458752), 0, 2062368);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                z3 = z4;
                                i9 = i11;
                                break;
                            }
                            break;
                        case 2:
                            status3 = Timeline.Status.COMPLETE;
                            status2 = status3;
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            if (incomplete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            if (complete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            if (error != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            if (warning != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            if (ongoing != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides22 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action22 = component.getDetail_action();
                            action = component.getAction();
                            String primary_information22 = component.getPrimary_information();
                            String secondary_information22 = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null) {
                            }
                            break;
                        case 3:
                            status3 = Timeline.Status.ERROR;
                            status2 = status3;
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            if (incomplete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            if (complete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            if (error != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            if (warning != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            if (ongoing != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides222 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action222 = component.getDetail_action();
                            action = component.getAction();
                            String primary_information222 = component.getPrimary_information();
                            String secondary_information222 = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null) {
                            }
                            break;
                        case 4:
                            status3 = Timeline.Status.WARNING;
                            status2 = status3;
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            if (incomplete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            if (complete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            if (error != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            if (warning != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            if (ongoing != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides2222 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action2222 = component.getDetail_action();
                            action = component.getAction();
                            String primary_information2222 = component.getPrimary_information();
                            String secondary_information2222 = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null) {
                            }
                            break;
                        case 5:
                        case 6:
                            status3 = Timeline.Status.ONGOING;
                            status2 = status3;
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945484398);
                            if (incomplete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945486414);
                            if (complete != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945488238);
                            if (error != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945490190);
                            if (warning != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (colorOverrideDto == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(945492142);
                            if (ongoing != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Timeline.ColorOverrides colorOverrides22222 = new Timeline.ColorOverrides(composeColor, composeColor2, composeColor3, composeColor4, composeColor5, null);
                            detail_text = component.getDetail_text();
                            ActionDto detail_action22222 = component.getDetail_action();
                            action = component.getAction();
                            String primary_information22222 = component.getPrimary_information();
                            String secondary_information22222 = component.getSecondary_information();
                            composerStartRestartGroup.startReplaceGroup(945508085);
                            if (detail_text != null) {
                            }
                            break;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    z3 = z2;
                    modifier3 = modifier2;
                    i9 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdlKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiTimelineIdl.SduiTimelineRow$lambda$1(component, parseAction, position, stateDto, colorOverrideDto, modifier3, i9, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 1572864;
            i6 = i;
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i4 & 4793491) != 4793490) {
                if (i10 != 0) {
                }
                if (i5 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                state = component.getState();
                iArr = WhenMappings.$EnumSwitchMapping$0;
                switch (iArr[state.ordinal()]) {
                }
                switch (stateDto != null ? -1 : iArr[stateDto.ordinal()]) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i;
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
