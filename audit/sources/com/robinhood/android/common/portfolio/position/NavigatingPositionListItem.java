package com.robinhood.android.common.portfolio.position;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals7;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.portfolio.contracts.PositionsDisplayOptionsKey;
import com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: NavigatingPositionListItem.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"NavigatingPositionListItem", "", "displayPositionItem", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "modifier", "Landroidx/compose/ui/Modifier;", "positionIds", "Lkotlinx/collections/immutable/ImmutableList;", "Ljava/util/UUID;", "associatedCodes", "", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "(Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Landroidx/compose/runtime/Composer;II)V", "feature-lib-portfolio_externalDebug", "showPositionsDisplayOptions", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NavigatingPositionListItem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigatingPositionListItem$lambda$10(DisplayPositionListItem displayPositionListItem, Modifier modifier, ImmutableList immutableList, ImmutableList immutableList2, PositionsLocation positionsLocation, SwipeAnimationPreview swipeAnimationPreview, int i, int i2, Composer composer, int i3) {
        NavigatingPositionListItem(displayPositionListItem, modifier, immutableList, immutableList2, positionsLocation, swipeAnimationPreview, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigatingPositionListItem(final DisplayPositionListItem displayPositionItem, Modifier modifier, ImmutableList<UUID> immutableList, ImmutableList<String> immutableList2, PositionsLocation positionsLocation, SwipeAnimationPreview swipeAnimationPreview, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ImmutableList<UUID> immutableListPersistentListOf;
        int i5;
        ImmutableList<String> immutableListPersistentListOf2;
        int i6;
        int i7;
        SwipeAnimationPreview swipeAnimationPreview2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        final Navigator navigator;
        final Context context;
        Screen.Name name;
        final PerformanceLogger current;
        final Function1 function1;
        PositionsV2.PositionListItemV2 position;
        PositionsLocation positionsLocation2;
        boolean zChanged;
        Object objRememberedValue2;
        int i8;
        final SnapshotState snapshotState2;
        final PositionsV2.PositionListItemV2 positionListItemV2;
        final ImmutableList<String> immutableList3;
        final ImmutableList<UUID> immutableList4;
        final PositionsLocation positionsLocation3;
        Object objRememberedValue3;
        Composer composer2;
        final ImmutableList<UUID> immutableList5;
        final ImmutableList<String> immutableList6;
        final PositionsLocation positionsLocation4;
        final Modifier modifier3;
        final SwipeAnimationPreview swipeAnimationPreview3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(displayPositionItem, "displayPositionItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(1069162648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(displayPositionItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    immutableListPersistentListOf = immutableList;
                    i3 |= composerStartRestartGroup.changedInstance(immutableListPersistentListOf) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        immutableListPersistentListOf2 = immutableList2;
                        i3 |= composerStartRestartGroup.changed(immutableListPersistentListOf2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(positionsLocation == null ? -1 : positionsLocation.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                        swipeAnimationPreview2 = swipeAnimationPreview;
                    } else {
                        swipeAnimationPreview2 = swipeAnimationPreview;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(swipeAnimationPreview2) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            immutableListPersistentListOf = extensions2.persistentListOf();
                        }
                        if (i5 != 0) {
                            immutableListPersistentListOf2 = extensions2.persistentListOf();
                        }
                        PositionsLocation positionsLocation5 = i6 == 0 ? PositionsLocation.UNKNOWN : positionsLocation;
                        if (i7 != 0) {
                            swipeAnimationPreview2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1069162648, i3, -1, "com.robinhood.android.common.portfolio.position.NavigatingPositionListItem (NavigatingPositionListItem.kt:35)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        name = screen == null ? screen.getName() : null;
                        current = AutoLoggingCompositionLocals.getLocalPerformanceLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals7.$stable);
                        function1 = (Function1) composerStartRestartGroup.consume(LocalPositionDetailsNavigator.getLocalPositionDetailsNavigator());
                        position = displayPositionItem.getPosition();
                        PositionsV2.PositionListItemV2 position2 = displayPositionItem.getPosition();
                        String activeDisplayType = displayPositionItem.getActiveDisplayType();
                        int index = displayPositionItem.getIndex();
                        positionsLocation2 = positionsLocation5;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = composerStartRestartGroup.changed(name != null ? -1 : name.ordinal()) | composerStartRestartGroup.changedInstance(position) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(displayPositionItem) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 57344) != 16384) | composerStartRestartGroup.changedInstance(immutableListPersistentListOf) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            i8 = i3;
                            snapshotState2 = snapshotState;
                            positionListItemV2 = position;
                            immutableList3 = immutableListPersistentListOf2;
                            final Screen.Name name2 = name;
                            immutableList4 = immutableListPersistentListOf;
                            positionsLocation3 = positionsLocation2;
                            Function0 function0 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigatingPositionListItem.NavigatingPositionListItem$lambda$4$lambda$3(name2, positionListItemV2, current, displayPositionItem, navigator, context, positionsLocation3, immutableList4, immutableList3, function1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function0);
                            objRememberedValue2 = function0;
                        } else {
                            i8 = i3;
                            snapshotState2 = snapshotState;
                            immutableList4 = immutableListPersistentListOf;
                            positionListItemV2 = position;
                            immutableList3 = immutableListPersistentListOf2;
                            positionsLocation3 = positionsLocation2;
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NavigatingPositionListItem.NavigatingPositionListItem$lambda$6$lambda$5(snapshotState2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i10 = ((i8 >> 6) & 896) | 805306368 | ((i8 << 9) & 57344) | (29360128 & (i8 << 6));
                        Modifier modifier5 = modifier4;
                        SwipeAnimationPreview swipeAnimationPreview4 = swipeAnimationPreview2;
                        PositionsLocation positionsLocation6 = positionsLocation3;
                        PositionListItemComposableKt.PositionListItemComposable(position2, activeDisplayType, positionsLocation6, index, modifier5, null, null, swipeAnimationPreview4, function02, (Function0) objRememberedValue3, composerStartRestartGroup, i10, 96);
                        if (NavigatingPositionListItem$lambda$1(snapshotState2)) {
                            PositionsDisplayOptionsKey positionsDisplayOptionsKey = new PositionsDisplayOptionsKey(positionListItemV2.getAccountNumber(), positionListItemV2.getInstrumentType(), positionsLocation6);
                            Screen screen2 = name != null ? new Screen(name, null, null, null, 14, null) : null;
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen2, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "holding_display_data_" + positionListItemV2.getInstrumentType().getServerValue(), null, 4, null), null, 45, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return NavigatingPositionListItem.NavigatingPositionListItem$lambda$9$lambda$8(snapshotState2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheet(positionsDisplayOptionsKey, userInteractionEventDescriptor, null, (Function0) objRememberedValue4, composerStartRestartGroup, 3072, 4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = composerStartRestartGroup;
                        immutableList5 = immutableList4;
                        immutableList6 = immutableList3;
                        positionsLocation4 = positionsLocation6;
                        modifier3 = modifier5;
                        swipeAnimationPreview3 = swipeAnimationPreview4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        immutableList5 = immutableListPersistentListOf;
                        immutableList6 = immutableListPersistentListOf2;
                        composer2 = composerStartRestartGroup;
                        swipeAnimationPreview3 = swipeAnimationPreview2;
                        positionsLocation4 = positionsLocation;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavigatingPositionListItem.NavigatingPositionListItem$lambda$10(displayPositionItem, modifier3, immutableList5, immutableList6, positionsLocation4, swipeAnimationPreview3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                immutableListPersistentListOf2 = immutableList2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Screen screen3 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                    if (screen3 == null) {
                    }
                    current = AutoLoggingCompositionLocals.getLocalPerformanceLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals7.$stable);
                    function1 = (Function1) composerStartRestartGroup.consume(LocalPositionDetailsNavigator.getLocalPositionDetailsNavigator());
                    position = displayPositionItem.getPosition();
                    PositionsV2.PositionListItemV2 position22 = displayPositionItem.getPosition();
                    String activeDisplayType2 = displayPositionItem.getActiveDisplayType();
                    int index2 = displayPositionItem.getIndex();
                    positionsLocation2 = positionsLocation5;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(name != null ? -1 : name.ordinal()) | composerStartRestartGroup.changedInstance(position) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(displayPositionItem) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 57344) != 16384) | composerStartRestartGroup.changedInstance(immutableListPersistentListOf) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        i8 = i3;
                        snapshotState2 = snapshotState;
                        positionListItemV2 = position;
                        immutableList3 = immutableListPersistentListOf2;
                        final Screen.Name name22 = name;
                        immutableList4 = immutableListPersistentListOf;
                        positionsLocation3 = positionsLocation2;
                        Function0 function03 = new Function0() { // from class: com.robinhood.android.common.portfolio.position.NavigatingPositionListItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NavigatingPositionListItem.NavigatingPositionListItem$lambda$4$lambda$3(name22, positionListItemV2, current, displayPositionItem, navigator, context, positionsLocation3, immutableList4, immutableList3, function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function03);
                        objRememberedValue2 = function03;
                        Function0 function022 = (Function0) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i102 = ((i8 >> 6) & 896) | 805306368 | ((i8 << 9) & 57344) | (29360128 & (i8 << 6));
                        Modifier modifier52 = modifier4;
                        SwipeAnimationPreview swipeAnimationPreview42 = swipeAnimationPreview2;
                        PositionsLocation positionsLocation62 = positionsLocation3;
                        PositionListItemComposableKt.PositionListItemComposable(position22, activeDisplayType2, positionsLocation62, index2, modifier52, null, null, swipeAnimationPreview42, function022, (Function0) objRememberedValue3, composerStartRestartGroup, i102, 96);
                        if (NavigatingPositionListItem$lambda$1(snapshotState2)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        immutableList5 = immutableList4;
                        immutableList6 = immutableList3;
                        positionsLocation4 = positionsLocation62;
                        modifier3 = modifier52;
                        swipeAnimationPreview3 = swipeAnimationPreview42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            immutableListPersistentListOf = immutableList;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            immutableListPersistentListOf2 = immutableList2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        immutableListPersistentListOf = immutableList;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        immutableListPersistentListOf2 = immutableList2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void NavigatingPositionListItem$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigatingPositionListItem$lambda$4$lambda$3(Screen.Name name, PositionsV2.PositionListItemV2 positionListItemV2, PerformanceLogger performanceLogger, DisplayPositionListItem displayPositionListItem, Navigator navigator, Context context, PositionsLocation positionsLocation, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1) {
        if (name == Screen.Name.HOME && (positionListItemV2.getInstrumentType() == PositionInstrumentType.EQUITY || positionListItemV2.getInstrumentType() == PositionInstrumentType.EQUITY_PENDING || positionListItemV2.getInstrumentType() == PositionInstrumentType.EQUITY_LEGACY)) {
            PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, PerformanceMetricEventData.Name.HOME_INSTRUMENT_ROW_TRADE_BAR, PerformanceMetricEventData.Source.SOURCE_HOME, positionListItemV2.getMetadataId(), null, 8, null);
        }
        NavigationExtensions.navigateToPositionDetails(navigator, context, positionsLocation, displayPositionListItem.getPosition(), immutableList, immutableList2, function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigatingPositionListItem$lambda$6$lambda$5(SnapshotState snapshotState) {
        NavigatingPositionListItem$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    private static final boolean NavigatingPositionListItem$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigatingPositionListItem$lambda$9$lambda$8(SnapshotState snapshotState) {
        NavigatingPositionListItem$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }
}
